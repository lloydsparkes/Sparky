using Sparky.Model;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Sparky
{
    public class DictionaryExternProvider : IExternProvider
    {
        private Dictionary<string, string> _vars = new Dictionary<string, string>();

        public DictionaryExternProvider() { }
        public DictionaryExternProvider(Dictionary<string, string> vars)
        {
            _vars = vars;
        }

        public bool HasExtern(string key)
        {
            return _vars.ContainsKey(key);
        }

        public string GetExtern(string key)
        {
            return _vars[key];
        }

        public void SetExtern(string key, string value)
        {
            if (HasExtern(key))
            {
                _vars[key.ToUpper()] = value;
            }
            else
            {
                _vars.Add(key.ToUpper(), value);
            }
        }
    }
}
