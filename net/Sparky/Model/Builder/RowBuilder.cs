using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Sparky.Model.Builder
{
    public class RowBuilder
    {
        private List<string> _values = new List<string>();

        public RowBuilder WithValue(string value)
        {
            _values.Add(value);
            return this;
        }

        public string GetByIndex(int index)
        {
            return _values[index];
        }
    }
}
