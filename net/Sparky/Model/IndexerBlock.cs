using Sparky.Model.Exceptions;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Sparky.Model
{
    public class IndexerBlock : Block
    {
        public IndexerBlock(IKey key, ICollection<Block> children, IDictionary<IKey, Rule> rules, Table table)
            : base(key, children, rules, table)
        { }

        public override string Value(Queue<string> brokenPath, IConfiguration root)
        {
            throw new InvalidOperationException("This method is not allowed to be called on a IndexerBlock");
        }

        public string Value(string index, Queue<string> brokenPath, IConfiguration root)
        {
            var tableIndex = int.Parse(index);

            if (_table.IsIndexValid(tableIndex, root))
            {
                _table.SetRowIndex(tableIndex);

                try
                {
                    return base.Value(brokenPath, root);
                }
                finally
                {
                    _table.ClearRowIndex();
                }
            }
            throw new InvalidKeyException("Table Index Not Valid");
        }
    }
}
