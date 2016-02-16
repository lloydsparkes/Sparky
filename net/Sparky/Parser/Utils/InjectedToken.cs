using Antlr4.Runtime;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Sparky.Parser.Utils
{
    public class InjectedToken : CommonToken
    {
        private string _text;

        public InjectedToken(IToken oldToken, int newTokenType, string type) : base(oldToken)
        {
            Type = newTokenType;
            _text = type;
        }

        public override string Text
        {
            get
            {
                return string.IsNullOrWhiteSpace(_text) ? base.Text : _text;
            }

            set
            {
                _text = value;
            }
        }
    }
}
