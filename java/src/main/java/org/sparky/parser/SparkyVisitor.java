// Generated from Sparky.g4 by ANTLR 4.5.1
package org.sparky.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SparkyParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SparkyVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SparkyParser#config}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConfig(SparkyParser.ConfigContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkyParser#block_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_name(SparkyParser.Block_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkyParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(SparkyParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkyParser#table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable(SparkyParser.TableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkyParser#filters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilters(SparkyParser.FiltersContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkyParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilter(SparkyParser.FilterContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkyParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(SparkyParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkyParser#simple_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_variable(SparkyParser.Simple_variableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkyParser#external_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExternal_variable(SparkyParser.External_variableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkyParser#complex_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplex_variable(SparkyParser.Complex_variableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkyParser#var_path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_path(SparkyParser.Var_pathContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkyParser#headers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeaders(SparkyParser.HeadersContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkyParser#header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader(SparkyParser.HeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkyParser#row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow(SparkyParser.RowContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkyParser#cell}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCell(SparkyParser.CellContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkyParser#cell_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCell_value(SparkyParser.Cell_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkyParser#keyvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyvalue(SparkyParser.KeyvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkyParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(SparkyParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkyParser#raw}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaw(SparkyParser.RawContext ctx);
}