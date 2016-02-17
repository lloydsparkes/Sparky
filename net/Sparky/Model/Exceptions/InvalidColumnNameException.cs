using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Sparky.Model.Exceptions
{
    public class InvalidColumnNameException : Exception
    {
        public InvalidColumnNameException(string message) : base(message)
        {
        }
    }
}
