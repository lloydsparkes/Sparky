using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Antlr4.Runtime;

namespace Sparky.Parser
{
    public class SparkyLexerFixed : SparkyLexer
    {
        private SparkyIndentationHelper denter;

        public SparkyLexerFixed(ICharStream input)
		    : base(input)
	    {
            denter = SparkyIndentationHelper.builder()
              .nl(NL)
              .indent(SparkyParser.INDENT)
              .dedent(SparkyParser.DEDENT)
              .pullToken(base.NextToken);
        }

        public override IToken NextToken()
        {
            return denter.NextToken();
        }
    }
}
