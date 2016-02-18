using Sparky.Model.Exceptions;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Sparky.Model
{
    public class Block
    {
        protected readonly IKey _key;
        protected readonly ICollection<Block> _children;
        protected readonly IDictionary<IKey, Rule> _rules;
        protected readonly Table _table;

        public Block(IKey key, ICollection<Block> children, IDictionary<IKey, Rule> rules, Table table)
        {
            _key = key;
            _children = children;
            _rules = rules;
            _table = table;
        }

        public IKey Key { get { return _key; } }

        public virtual string Value(Queue<string> brokenPath, IConfiguration root)
        {
            if(brokenPath.Count == 0)
            {
                throw new InvalidKeyException("We could not resolve the key. Key ended in a Block");
            }
            string toFulfil = brokenPath.Dequeue();

            if(brokenPath.Count == 0)
            {
                foreach(IKey k in _rules.Keys)
                {
                    if(k.Matches(toFulfil, root))
                    {
                        return _rules[k].GetValue(root, _table);
                    }
                }
            }
            else
            {
                foreach(Block c in _children)
                {
                    if(c.Key.Matches(toFulfil, root))
                    {
                        if(c is IndexerBlock)
                        {
                            return (c as IndexerBlock).Value(toFulfil, brokenPath, root);
                        }
                        else
                        {
                            return c.Value(brokenPath, root);
                        }
                    }
                }
            }
            throw new InvalidKeyException(string.Format("We could not resolve the given key. No rules match the key's name '{0}'", toFulfil));
        }
    }
}
