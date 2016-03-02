using Sparky.Model;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Sparky
{
    public class EnvironmentExternProvider : IExternProvider
    {
        public string GetExtern(string key)
        {
            return Environment.GetEnvironmentVariable(key);
        }

        public bool HasExtern(string key)
        {
            return Environment.GetEnvironmentVariable(key) != null;
        }
    }
}
