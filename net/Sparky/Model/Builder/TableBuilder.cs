using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Sparky.Model.Builder
{
    public class TableBuilder
    {
        private readonly List<FilterBuilder> _filters = new List<FilterBuilder>();
        private readonly List<string> _headers = new List<string>();
        private readonly List<RowBuilder> _rows = new List<RowBuilder>();

        public TableBuilder WithHeader(string header)
        {
            _headers.Add(header);
            return this;
        }

        public TableBuilder WithFilter(FilterBuilder b)
        {
            _filters.Add(b);
            return this;
        }

        public TableBuilder WithRow(RowBuilder r)
        {
            _rows.Add(r);
            return this;
        }

        public Table Build()
        {
            var columns = new Dictionary<string, int>();
            int i = 0;
            foreach(var s in _headers)
            {
                columns.Add(s, i++);
            }

            var data = new string[_rows.Count][];
            int rI = 0;
            foreach(var rb in _rows)
            {
                data[rI] = new string[_headers.Count];
                for (var cI = 0; cI < _headers.Count; cI++)
                {
                    data[rI][cI] = rb.GetByIndex(cI);
                }
                rI++;
            }

            var fl = new Dictionary<string, Filter>();
            foreach(var fb in _filters)
            {
                fl.Add(fb.ColumnName(), new Filter(fb.GetRule()));
            }
            return new Table(columns, data, fl);
        }
    }
}
