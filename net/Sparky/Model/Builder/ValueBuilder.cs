using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Sparky.Model.Builder
{
    public class ValueBuilder : IEvaluatableBuilder
    {
        private readonly List<IPartial> _bits = new List<IPartial>();

        public Rule Build()
        {
            return new Rule(_bits);
        }

        public IEvaluatableBuilder WithPartial(IPartial partial)
        {
            _bits.Add(partial);
            return this;
        }
    }
}
