using Antlr4.Runtime;
using Sparky.Parser.Utils;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Sparky.Parser
{
    public class SparkyIndentationHelper
    {
        private readonly int _nlToken;
        private readonly int _indentToken;
        private readonly int _dedentToken;
        private readonly Func<IToken> _pullToken;

        private readonly Queue<IToken> _dentsBuffer = new Queue<IToken>();
        private readonly Stack<int> _indentations = new Stack<int>();

        private bool _reachedEof = false;

        public SparkyIndentationHelper(int nl, int indent, int dedent, Func<IToken> puller)
        {
            _nlToken = nl;
            _indentToken = indent;
            _dedentToken = dedent;
            _pullToken = puller;
        }

        public IToken NextToken()
        {
            initOnFirstRun();
            IToken t = _dentsBuffer.Count == 0 ? _pullToken() : _dentsBuffer.Dequeue();

            if (_reachedEof)
            {
                return t;
            }

            IToken r = null;
            if(t.Type == _nlToken)
            {
                r = handleNewLineToken(t);
            }
            else if(t.Type == TokenConstants.Eof)
            {
                r = handleEof(t);
            } 
            else
            {
                r = t;
            }
            return r;
        }

        private void initOnFirstRun()
        {
            if(_indentations.Count == 0)
            {
                _indentations.Push(0);

                IToken firstRealToken = _pullToken();
                do
                {
                    firstRealToken = _pullToken();
                }
                while (firstRealToken.Type == _nlToken);

                if(firstRealToken.StartIndex > 0)
                {
                    _indentations.Push(firstRealToken.StartIndex);
                    _dentsBuffer.Enqueue(createToken(_indentToken, firstRealToken));
                }
                _dentsBuffer.Enqueue(firstRealToken);
            }
        }

        private IToken handleNewLineToken(IToken t)
        {
            IToken nextNext = _pullToken();
            while(nextNext.Type == _nlToken)
            {
                t = nextNext;
                nextNext = _pullToken();
            }

            if(nextNext.Type == TokenConstants.Eof)
            {
                return handleEof(nextNext);
            }

            int indent = t.Text.Length - 1;
            if(indent > 0 && t.Text[0] == '\r')
            {
                --indent;
            }

            int prevIndent = _indentations.Peek();
            IToken r = null;
            if(indent == prevIndent)
            {
                r = createToken(_nlToken, t);
            }
            else if(indent > prevIndent)
            {
                _indentations.Push(indent);
                _dentsBuffer.Enqueue(createToken(_indentToken, t));
                r = createToken(_nlToken, t);
            }
            else
            {
                r = unwindTo(indent, t);
            }
            _dentsBuffer.Enqueue(nextNext);
            return r;
        }

        private IToken handleEof(IToken t)
        {
            IToken r = null;

            if(_indentations.Count == 0)
            {
                r = createToken(_nlToken, t);
                _dentsBuffer.Enqueue(t);
            }
            else
            {
                r = unwindTo(0, t);
                _dentsBuffer.Enqueue(t);
            }
            _reachedEof = true;
            return r;
        }

        private IToken unwindTo(int indentTarget, IToken t)
        {
            //assert dentsBuffer.isEmpty() : dentsBuffer;
            _dentsBuffer.Enqueue(createToken(_nlToken, t));

            // To make things easier, we'll queue up ALL of the dedents, and then pop off the first one.
            // For example, here's how some text is analyzed:
            //
            //  Text          :  Indentation  :  Action         : Indents Deque
            //  [ baseline ]  :  0            :  nothing        : [0]
            //  [   foo    ]  :  2            :  INDENT         : [0, 2]
            //  [    bar   ]  :  3            :  INDENT         : [0, 2, 3]
            //  [ baz      ]  :  0            :  DEDENT x2      : [0]

            while (true)
            {
                int prevIndent = _indentations.Pop();
                if(prevIndent == indentTarget)
                {
                    break;
                }
                if(indentTarget > prevIndent)
                {
                    _indentations.Push(prevIndent);
                    _dentsBuffer.Enqueue(createToken(_indentToken, t));
                    break;
                }
                _dentsBuffer.Enqueue(createToken(_dedentToken, t));
            }
            _indentations.Push(indentTarget);
            return _dentsBuffer.Dequeue();
        }

        private IToken createToken(int tokenType, IToken copyFrom)
        {
            string tokenTypeStr = null;
            if(tokenType == _nlToken)
            {
                tokenTypeStr = "newline";
            }
            else if(tokenType == _indentToken)
            {
                tokenTypeStr = "ident";
            }
            else if (tokenType == _dedentToken)
            {
                tokenTypeStr = "dedent";
            }
            return new InjectedToken(copyFrom, tokenType, tokenTypeStr);
        }
    }
}
