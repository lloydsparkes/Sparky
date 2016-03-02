using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Sparky.Model
{
    public interface IExternProvider
    {
        string GetExtern(string key);

        bool HasExtern(string key);
    }
}
