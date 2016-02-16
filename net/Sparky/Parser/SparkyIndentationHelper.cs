using Antlr4.Runtime;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Sparky.Parser
{
    public class SparkyIndentationHelper
    {
        private int nlToken;
        private int indentToken;
        private int dedentToken;

        public SparkyIndentationHelper(int nl, int indent, int dedent)
        {
            nlToken = nl;
            indentToken = indent;
            dedentToken = dedent;
        }

        public IToken NextToken()
        {
            return null;
        }

        public static SparkyIndedentationBuilder builder()
        {
            return new SparkyIndedentationBuilder();
        }


        public class SparkyIndedentationBuilder
        {
            private int nlToken;
            private int indentToken;
            private int dedentToken;

            public SparkyIndedentationBuilder nl(int nl)
            {
                nlToken = nl;
                return this;
            }

            public SparkyIndedentationBuilder indent(int indent)
            {
                indentToken = indent;
                return this;
            }

            public SparkyIndedentationBuilder dedent(int dedent)
            {
                dedentToken = dedent;
                return this;
            }

            public SparkyIndentationHelper pullToken(Func<IToken> tokenPuller)
            {
                return new SparkyIndentationHelper(nlToken, indentToken, dedentToken);
            }
        }
    }
}
