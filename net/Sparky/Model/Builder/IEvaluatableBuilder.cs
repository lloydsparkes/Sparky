using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Sparky.Model.Builder
{
    public interface IEvaluatableBuilder
    {
        IEvaluatableBuilder WithPartial(IPartial partial);

        Rule Build();
    }
}
