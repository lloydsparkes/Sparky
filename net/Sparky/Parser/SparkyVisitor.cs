using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Antlr4.Runtime.Misc;
using Sparky.Model.Builder;
using Sparky.Model;
using Antlr4.Runtime.Tree;

namespace Sparky.Parser
{
    public class SparkyVisitor : SparkyBaseVisitor<object>
    {
        public override object VisitConfig([NotNull] SparkyParser.ConfigContext context)
        {
            BlockBuilder b = new BlockBuilder();

            foreach(var block in context.block())
            {
                b.WithBlock(VisitBlock(block) as BlockBuilder);
            }

            return b;
        }

        public override object VisitBlock([NotNull] SparkyParser.BlockContext context)
        {
            BlockBuilder b = new BlockBuilder();

            if (context.block_name().ID() != null)
            {
                b = b.WithName(context.block_name().ID().GetText());
            }
            if (context.block_name().INDEXER() != null)
            {
                b = b.WithIndexer();
            }
            if (context.block_name().simple_variable() != null)
            {
                b = b.WithName((new VariableBuilder()).WithPartial(new SimpleKeyPartial(context.block_name().simple_variable().ID().GetText())));
            }

            if(context.table() != null)
            {
                b = b.WithTable(VisitTable(context.table()) as TableBuilder);
            }

            foreach (var block in context.block())
            {
                b.WithBlock(VisitBlock(block) as BlockBuilder);
            }

            foreach(var kvp in context.keyvalue())
            {
                b = b.WithRule(kvp.OVERRIDE() != null, kvp.ID().GetText(), VisitValue(kvp.value()) as ValueBuilder);
            }

            return b;
        }

        public override object VisitTable([NotNull] SparkyParser.TableContext context)
        {
            TableBuilder b = new TableBuilder();

            if(context.filters() != null)
            {
                foreach(var f in context.filters().filter())
                {
                    b = b.WithFilter(VisitFilter(f) as FilterBuilder);
                }
            }

            foreach(var h in context.headers().header())
            {
                b = b.WithHeader(h.ID().GetText());
            }

            foreach(var r in context.row())
            {
                b = b.WithRow(VisitRow(r) as RowBuilder);
            }

            return b;
        }

        public override object VisitFilter([NotNull] SparkyParser.FilterContext context)
        {
            return new FilterBuilder()
                .withLeft(VisitSimple_variable(context.simple_variable()) as VariableBuilder)
                .withRight(VisitVariable(context.variable()) as VariableBuilder);
        }

        public override object VisitRow([NotNull] SparkyParser.RowContext context)
        {
            RowBuilder b = new RowBuilder();

            foreach(var c in context.cell())
            {
                b.WithValue(c.cell_value().GetText());
            }

            return b;
        }

        public override object VisitVariable([NotNull] SparkyParser.VariableContext context)
        {
            if(context.simple_variable() != null)
            {
                return VisitSimple_variable(context.simple_variable());
            }
            if (context.complex_variable() != null)
            {
                return VisitComplex_variable(context.complex_variable());
            }
            if (context.external_variable() != null)
            {
                return VisitExternal_variable(context.external_variable());
            }
            return null;
        }

        public override object VisitExternal_variable([NotNull] SparkyParser.External_variableContext context)
        {
            return new VariableBuilder().WithPartial(new SimpleKeyPartial(context.EXTERNAL_ID().GetText()));
        }

        public override object VisitComplex_variable([NotNull] SparkyParser.Complex_variableContext context)
        {
            return VisitVar_path(context.var_path());
        }

        public override object VisitSimple_variable([NotNull] SparkyParser.Simple_variableContext context)
        {
            return new VariableBuilder().WithPartial(new SimpleKeyPartial(context.ID().GetText()));
        }

        public override object VisitVar_path([NotNull] SparkyParser.Var_pathContext context)
        {
            VariableBuilder b = new VariableBuilder();

            foreach(var tb in context.children)
            {
                if(tb is ITerminalNode && (tb as ITerminalNode).Symbol.Type == SparkyParser.ID)
                {
                    b.WithPartial(new SimpleKeyPartial(tb.GetText()));
                }
                if(tb is SparkyParser.VariableContext)
                {
                    b.WithPartial((VisitVariable(tb as SparkyParser.VariableContext) as VariableBuilder).Build());
                }
            }

            return b;
        }

        public override object VisitValue([NotNull] SparkyParser.ValueContext context)
        {
            ValueBuilder b = new ValueBuilder();

            foreach (var tb in context.children)
            {
                if (tb is SparkyParser.VariableContext)
                {
                    b.WithPartial((VisitVariable(tb as SparkyParser.VariableContext) as VariableBuilder).Build());
                }
                if (tb is SparkyParser.RawContext)
                {
                    b.WithPartial(new RawPartial(tb.GetText()));
                }
            }

            return b;
        }
    }
}
