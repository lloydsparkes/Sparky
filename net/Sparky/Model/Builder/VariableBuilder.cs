using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Sparky.Model.Builder
{
    public class VariableBuilder : IEvaluatableBuilder
    {
        private readonly List<IPartial> _bits = new List<IPartial>();

        public string BuildAsColumnName()
        {
            if(_bits.Count != 1)
            {
                throw new InvalidOperationException("This Variable cannot be a Column Name because it is made from multiple Partials");
            }
            if(!(_bits[0] is SimpleKeyPartial))
            {
                throw new InvalidOperationException("This Variable cannot be a Column Name because its only Partial is not a SimpleKeyPartial");
            }
            return (_bits[0] as SimpleKeyPartial).GetKey();
        }

        public IEvaluatableBuilder WithPartial(IPartial partial)
        {
            _bits.Add(partial);
            return this;
        }

        public Rule Build()
        {
            return new KeyRule(_bits);
        }
    }
}
