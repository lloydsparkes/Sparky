using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Sparky.Model.Builder
{
    public class FilterBuilder
    {
        private VariableBuilder _left;
        private VariableBuilder _right;

        public FilterBuilder withLeft(VariableBuilder left)
        {
            _left = left;
            return this;
        }

        public FilterBuilder withRight(VariableBuilder right)
        {
            _right = right;
            return this;
        }

        public String ColumnName()
        {
            return _left.BuildAsColumnName();
        }

        public Rule GetRule()
        {
            return _right.Build();
        }
    }
}
