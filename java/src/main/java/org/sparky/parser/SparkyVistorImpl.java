package org.sparky.parser;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.sparky.model.Rule;
import org.sparky.model.builders.*;

/**
 * Walks the Parse Tree returning a much condensed object model, which is nicer to work with
 *
 * Created by lloyd on 17/10/2015.
 */
public class SparkyVistorImpl extends SparkyBaseVisitor<Object> {

    @Override
    public BlockBuilder visitConfig(SparkyParser.ConfigContext ctx) {
        BlockBuilder builder = new BlockBuilder();

        for(SparkyParser.BlockContext block : ctx.block()){
            builder.withBlock(visitBlock(block));
        }

        return builder;
    }

    @Override
    public BlockBuilder visitBlock(SparkyParser.BlockContext ctx) {
        BlockBuilder builder = new BlockBuilder();

        if(ctx.block_name().ID() != null){
            builder = builder.withName(ctx.block_name().ID().getText());
        }
        if(ctx.block_name().INDEXER() != null){
            builder = builder.withIndexer();
        }
        if(ctx.block_name().simple_variable() != null) {
            builder.withName(new VariableBuilder().withBit(
                    new Rule.KeyBit(ctx.block_name().simple_variable().ID().getText())
            ));
        }

        if(ctx.table() != null){
            builder = builder.withTable(visitTable(ctx.table()));
        }

        for(SparkyParser.BlockContext block : ctx.block()){
            builder = builder.withBlock(visitBlock(block));
        }

        for(SparkyParser.KeyvalueContext kvp : ctx.keyvalue()){
            builder = builder.withRule(
                    kvp.OVERRIDE() != null,
                    kvp.ID().getText(),
                    visitValue(kvp.value())
            );
        }

        return builder;
    }

    @Override
    public TableBuilder visitTable(SparkyParser.TableContext ctx) {
        TableBuilder builder = new TableBuilder();

        if(ctx.filters() != null) {
            for (SparkyParser.FilterContext f : ctx.filters().filter()) {
                builder.withFilter(visitFilter(f));
            }
        }

        for(SparkyParser.HeaderContext h : ctx.headers().header()){
            builder.withHeader(h.ID().getText());
        }

        for(SparkyParser.RowContext r : ctx.row()){
            builder.withRow(visitRow(r));
        }

        return builder;
    }

    @Override
    public FilterBuilder visitFilter(SparkyParser.FilterContext ctx) {
        return new FilterBuilder()
                .withLeft(visitSimple_variable(ctx.simple_variable()))
                .withRight(visitVariable(ctx.variable()));
    }

    @Override
    public VariableBuilder visitVariable(SparkyParser.VariableContext ctx){
        if(ctx.simple_variable() != null){
            return visitSimple_variable(ctx.simple_variable());
        }
        if(ctx.complex_variable() != null){
            return visitComplex_variable(ctx.complex_variable());
        }
        if(ctx.external_variable() != null){
            return visitExternal_variable(ctx.external_variable());
        }
        return null;
    }

    @Override
    public VariableBuilder visitSimple_variable(SparkyParser.Simple_variableContext ctx){
        return new VariableBuilder().withBit(new Rule.KeyBit(ctx.ID().getText()));
    }

    @Override
    public VariableBuilder visitComplex_variable(SparkyParser.Complex_variableContext ctx){
        return visitVar_path(ctx.var_path());
    }

    @Override
    public VariableBuilder visitExternal_variable(SparkyParser.External_variableContext ctx){
        return new VariableBuilder().withBit(new Rule.KeyBit(ctx.EXTERNAL_ID().getText()));
    }

    @Override
    public VariableBuilder visitVar_path(SparkyParser.Var_pathContext ctx) {
        VariableBuilder builder = new VariableBuilder();

        for(ParseTree bit : ctx.children){
            if(bit instanceof TerminalNode && ((TerminalNode) bit).getSymbol().getType() == SparkyParser.ID){
                builder.withBit(new Rule.KeyBit(bit.getText()));
            }
            if(bit instanceof SparkyParser.VariableContext){
                builder.withBit(visitVariable(((SparkyParser.VariableContext) bit)).build());
            }
        }
        return builder;
    }

    @Override public RowBuilder visitRow(SparkyParser.RowContext ctx) {
        RowBuilder builder = new RowBuilder();
        for(SparkyParser.CellContext c : ctx.cell()){
            builder.withValue(c.cell_value().getText());
        }
        return builder;
    }

    @Override
    public ValueBuilder visitValue(SparkyParser.ValueContext ctx) {
        ValueBuilder builder = new ValueBuilder();

        for(ParseTree bit : ctx.children){
            if(bit instanceof SparkyParser.RawContext){
                builder.withBit(new Rule.PlainBit(bit.getText()));
            }
            if(bit instanceof SparkyParser.VariableContext){
                builder.withBit(visitVariable(((SparkyParser.VariableContext) bit)).build());
            }
        }

        return builder;
    }
}
