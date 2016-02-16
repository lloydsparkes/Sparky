using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Antlr4.Runtime;

namespace Sparky.Parser
{
    public class SparkyLexerFixed : SparkyLexer
    {
        private readonly SparkyIndentationHelper denter;

        public SparkyLexerFixed(ICharStream input)
		    : base(input)
	    {
            denter = new SparkyIndentationHelper(NL, SparkyParser.INDENT, SparkyParser.DEDENT, base.NextToken);
        }

        public override IToken NextToken()
        {
            return denter.NextToken();
        }
    }
}
