using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Sparky.Model.Exceptions
{
    public class InvalidKeyException : Exception
    {
        public InvalidKeyException(string message) : base(message)
        {
        }
    }
}
