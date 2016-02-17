using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Sparky.Model
{
    internal class Filter
    {
        private Rule valueKey;

        public bool HasChanged(IConfiguration root)
        {
            return true;
        }

        public string Value(IConfiguration root)
        {
            return valueKey.GetValue(root, null);
        }
    }
}
