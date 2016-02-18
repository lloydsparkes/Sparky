using Sparky.Model.Exceptions;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Sparky.Model
{
    public class Table
    {
        public static readonly string INDEX_KEY = "$$";

        private IDictionary<string, int> _columns;
        private string[][] _data;
        private IDictionary<string, Filter> _filters;

        private string[][] _cachedFilteredData;
        private int _rowIndexLock = -1;

        public Table(IDictionary<string, int> columns, string[][] data, IDictionary<string, Filter> filters)
        {
            _columns = columns;
            _data = data;
            _filters = filters;
        }

        internal string ValueForColumn(string columnName, IConfiguration root)
        {
            var values = ValuesForColumn(columnName, root);
            if(values.Count == 1)
            {
                return values.First();
            }
            return null;
        }

        internal ICollection<string> ValuesForColumn(string columnName, IConfiguration root)
        {
            if (HaveFiltersChanged(root) || _cachedFilteredData == null)
            {
                ApplyFilters(root);
            }

            int firstRow = _rowIndexLock == -1 ? 0 : _rowIndexLock;
            int lastRow = _rowIndexLock == -1 ? _cachedFilteredData.Length : _rowIndexLock + 1;

            if(columnName == INDEX_KEY)
            {
                var indexes = new List<string>();
                for(int r = firstRow; r < lastRow; r++)
                {
                    indexes.Add((r + 1).ToString());
                }
                return indexes;
            }

            if (_columns.ContainsKey(columnName))
            {
                int colInd = _columns[columnName];
                var values = new HashSet<string>();

                for (int r = firstRow; r < lastRow; r++)
                {
                    values.Add(_cachedFilteredData[r][colInd]);
                }
                return values;
            }

            throw new InvalidColumnNameException(columnName);
        }

        internal bool IsIndexValid(int index, IConfiguration root)
        {
            if (HaveFiltersChanged(root) || _cachedFilteredData == null)
            {
                ApplyFilters(root);
            }

            return ((index - 1) <= _cachedFilteredData.Length && index > 0);
        }

        private void ApplyFilters(IConfiguration root)
        {
            var evaluatedFilter = new Dictionary<int, string>();
            foreach(var col in _filters.Keys)
            {
                var f = _filters[col];
                var colIndex = _columns[col];
                evaluatedFilter.Add(colIndex, f.Value(root));
            }

            if(evaluatedFilter.Count == 0)
            {
                _cachedFilteredData = _data;
            } 
            else
            {
                List<string[]> filteredRows = new List<string[]>();
                for(int r = 0; r < _data.Length; r++)
                {
                    var values = _data[r];
                    var allowRow = true;
                    foreach(var colInd in evaluatedFilter.Keys)
                    {
                        if(values[colInd] != evaluatedFilter[colInd])
                        {
                            allowRow = false;
                            break;
                        }
                    }
                    if (allowRow)
                    {
                        filteredRows.Add(values);
                    }
                }
                _cachedFilteredData = filteredRows.ToArray();
            }
        }

        private bool HaveFiltersChanged(IConfiguration root)
        {
            foreach(Filter f in _filters.Values)
            {
                if (f.HasChanged(root))
                {
                    return true;
                }
            }
            return false;
        }

        internal void SetRowIndex(int index)
        {
            _rowIndexLock = index-1;
        }

        internal void ClearRowIndex()
        {
            _rowIndexLock = -1;
        }
    }
}
