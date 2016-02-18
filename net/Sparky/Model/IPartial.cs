using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Sparky.Model
{
    public interface IPartial
    {
        string GetValue(IConfiguration root, Table currentTable);
    }

    public class RawPartial : IPartial
    {
        private string _value;

        internal RawPartial(string value)
        {
            _value = value;
        }

        public string GetValue(IConfiguration root, Table currentTable)
        {
            return _value;
        }
    }

    public class SimpleKeyPartial : IPartial
    {
        private string _key;

        internal SimpleKeyPartial(string key)
        {
            _key = key;
        }

        public string GetKey()
        {
            return _key;
        }

        public string GetValue(IConfiguration root, Table currentTable)
        {
            if (_key.ToUpper() != _key && !_key.Contains('.'))
            {
                string fromTable = currentTable.ValueForColumn(_key, root);
                if (!string.IsNullOrWhiteSpace(fromTable))
                {
                    return fromTable;
                }
            }
            return root.Resolve(_key);
        }
    }

    public class Rule : IPartial
    {
        protected ICollection<IPartial> _bits;

        internal Rule(ICollection<IPartial> bits)
        {
            _bits = bits;
        }

        public virtual string GetValue(IConfiguration root, Table currentTable)
        {
            StringBuilder builder = new StringBuilder();
            foreach (IPartial p in _bits)
            {
                builder.Append(p.GetValue(root, currentTable));
            }
            return builder.ToString();
        }
    }

    public class KeyRule : Rule
    {
        internal KeyRule(ICollection<IPartial> bits) : base(bits) { }

        public override string GetValue(IConfiguration root, Table currentTable)
        {
            StringBuilder keyBuilder = new StringBuilder();
            foreach (IPartial p in _bits)
            {
                if (keyBuilder.Length > 0)
                {
                    keyBuilder.Append('.');
                }
                if (p is KeyRule)
                {
                    keyBuilder.Append(p.GetValue(root, currentTable));
                }
                else {
                    keyBuilder.Append((p as SimpleKeyPartial).GetKey());
                }
            }
            return new SimpleKeyPartial(keyBuilder.ToString()).GetValue(root, currentTable);
        }
    }
}
