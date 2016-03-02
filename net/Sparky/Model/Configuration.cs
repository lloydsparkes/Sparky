using Sparky.Model.Exceptions;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Sparky.Model
{
    public class Configuration : IConfiguration
    {
        private Block _root;
        private IExternProvider _externProvider;

        public Configuration(Block root, IExternProvider externProvider)
        {
            _root = root;
            _externProvider = externProvider;
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
            if (_externProvider.HasExtern(key))
            {
                return _externProvider.GetExtern(key);
            }
            throw new InvalidKeyException(string.Format("Could not find an external key '{0}'", key));
        }

        public IExternProvider ExternProvider
        {
            get { return _externProvider; }
        }
    }
}
