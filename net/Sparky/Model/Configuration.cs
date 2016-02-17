using Sparky.Model.Exceptions;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Sparky.Model
{
    internal class Configuration : IConfiguration
    {
        private IDictionary<string, string> _externs = new Dictionary<string, string>();
        private Block _root;

        internal Configuration(Block root)
        {
            _root = root;
        }

        public string Resolve(string key)
        {
            var brokenPath = new Queue<string>(key.Split('.'));

            if(brokenPath.Count == 1)
            {
                if(brokenPath.Peek().ToUpper() == brokenPath.Peek())
                {
                    return GetExternal(brokenPath.Dequeue());
                }
            }
            return _root.Value(brokenPath, this);
        }

        private string GetExternal(string key)
        {
            key = key.ToUpper();
            if (_externs.ContainsKey(key))
            {
                return _externs[key];
            }
            throw new InvalidKeyException(string.Format("Could not find an external key '{0}'", key));
        }

        public void SetExternal(string key, string value)
        {
            _externs.Add(key.ToUpper(), value);
        }
    }
}
