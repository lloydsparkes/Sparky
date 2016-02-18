using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Sparky.Model
{
    public enum KeyType
    {
        Constant,
        TableColumn,
        Indexer
    }

    public interface IKey
    {
        bool Matches(string toTest, IConfiguration root);

        ICollection<string> Values(IConfiguration root);
    }

    public abstract class BaseKey : IKey
    {
        internal KeyType Type { get; private set; }

        internal BaseKey(KeyType type)
        {
            Type = type;
        }

        public bool Matches(string toTest, IConfiguration root)
        {
            foreach(string s in Values(root))
            {
                if(s == toTest)
                {
                    return true;
                }
            }
            return false;
        }

        public abstract ICollection<string> Values(IConfiguration root);
    }

    public class ConstantKey : BaseKey
    {
        private readonly string _constant;

        internal ConstantKey(string constant) : base(KeyType.Constant)
        {
            _constant = constant;
        }

        public override ICollection<string> Values(IConfiguration root)
        {
            return new List<string>() { _constant };
        }
    }

    public class TableKey : BaseKey
    {
        private string _columnName;
        private Table _table;

        protected TableKey(KeyType type, string columnName, Table referencedTable) : base(type)
        {
            _columnName = columnName;
            _table = referencedTable;
        }

        public TableKey(string columnName, Table referencedTable) : this(KeyType.TableColumn, columnName, referencedTable) { }

        public override ICollection<string> Values(IConfiguration root)
        {
            return _table.ValuesForColumn(_columnName, root);
        }
    }

    public class IndexerKey : TableKey
    {
        public IndexerKey(Table referencedTable) : base(KeyType.Indexer, Table.INDEX_KEY, referencedTable) { }
    }
}
