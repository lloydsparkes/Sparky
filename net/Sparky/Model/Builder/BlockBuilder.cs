using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Sparky.Model.Builder
{
    public class BlockBuilder
    {
        private string _name;
        private IEvaluatableBuilder _nameBuilder;
        private bool _isIndexer = false;

        private List<BlockBuilder> _children = new List<BlockBuilder>();
        private IDictionary<string, IDictionary<bool, IEvaluatableBuilder>> _rules = new Dictionary<string, IDictionary<bool, IEvaluatableBuilder>>();
        private TableBuilder _table;

        public BlockBuilder WithBlock(BlockBuilder block)
        {
            _children.Add(block);
            return this;
        }

        public BlockBuilder WithName(string name)
        {
            _name = name;
            return this;
        }

        public BlockBuilder WithName(IEvaluatableBuilder nameBuilder)
        {
            _nameBuilder = nameBuilder;
            return this;
        }

        public BlockBuilder WithIndexer()
        {
            _isIndexer = true;
            return this;
        }

        public BlockBuilder WithTable(TableBuilder tb)
        {
            _table = tb;
            return this;
        }

        public BlockBuilder WithRule(bool overrideFlag, string name, IEvaluatableBuilder rule)
        {
            if (!_rules.ContainsKey(name))
            {
                _rules.Add(name, new Dictionary<bool, IEvaluatableBuilder>());
            }
            _rules[name].Add(overrideFlag, rule);
            return this;
        }

        public Block Build(Table parent)
        {
            Table t = _table == null ? parent : _table.Build();

            List<Block> b = _children.Select(c => c.Build(t)).ToList();

            IDictionary<IKey, Rule> kvps = new Dictionary<IKey, Rule>();
            foreach(var k in _rules.Keys)
            {
                IKey ky = new ConstantKey(k);
                Rule r = null;
                if(_rules[k].Count > 1)
                {
                    r = _rules[k][true].Build();
                }
                else
                {
                    r = _rules[k].Values.First().Build();
                }
                kvps.Add(ky, r);
            }

            if (_isIndexer)
            {
                return new IndexerBlock(new IndexerKey(t), b, kvps, t);
            }
            return new Block(new ConstantKey(_name), b, kvps, t);
        }
    }
}
