using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Sparky.Model
{
    public class Filter
    {
        private Rule _valueKey;

        public Filter(Rule key)
        {
            _valueKey = key;
        }

        public bool HasChanged(IConfiguration root)
        {
            return true;
        }

        public string Value(IConfiguration root)
        {
            return _valueKey.GetValue(root, null);
        }
    }
}
