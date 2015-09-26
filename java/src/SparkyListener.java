// Generated from D:/Projects/Sparky/grammar\Sparky.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SparkyParser}.
 */
public interface SparkyListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SparkyParser#config}.
	 * @param ctx the parse tree
	 */
	void enterConfig(SparkyParser.ConfigContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkyParser#config}.
	 * @param ctx the parse tree
	 */
	void exitConfig(SparkyParser.ConfigContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkyParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(SparkyParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkyParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(SparkyParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkyParser#table}.
	 * @param ctx the parse tree
	 */
	void enterTable(SparkyParser.TableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkyParser#table}.
	 * @param ctx the parse tree
	 */
	void exitTable(SparkyParser.TableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkyParser#filters}.
	 * @param ctx the parse tree
	 */
	void enterFilters(SparkyParser.FiltersContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkyParser#filters}.
	 * @param ctx the parse tree
	 */
	void exitFilters(SparkyParser.FiltersContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkyParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter(SparkyParser.FilterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkyParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter(SparkyParser.FilterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkyParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(SparkyParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkyParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(SparkyParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkyParser#var_path}.
	 * @param ctx the parse tree
	 */
	void enterVar_path(SparkyParser.Var_pathContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkyParser#var_path}.
	 * @param ctx the parse tree
	 */
	void exitVar_path(SparkyParser.Var_pathContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkyParser#headers}.
	 * @param ctx the parse tree
	 */
	void enterHeaders(SparkyParser.HeadersContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkyParser#headers}.
	 * @param ctx the parse tree
	 */
	void exitHeaders(SparkyParser.HeadersContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkyParser#header}.
	 * @param ctx the parse tree
	 */
	void enterHeader(SparkyParser.HeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkyParser#header}.
	 * @param ctx the parse tree
	 */
	void exitHeader(SparkyParser.HeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkyParser#row}.
	 * @param ctx the parse tree
	 */
	void enterRow(SparkyParser.RowContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkyParser#row}.
	 * @param ctx the parse tree
	 */
	void exitRow(SparkyParser.RowContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkyParser#cell}.
	 * @param ctx the parse tree
	 */
	void enterCell(SparkyParser.CellContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkyParser#cell}.
	 * @param ctx the parse tree
	 */
	void exitCell(SparkyParser.CellContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkyParser#cell_value}.
	 * @param ctx the parse tree
	 */
	void enterCell_value(SparkyParser.Cell_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkyParser#cell_value}.
	 * @param ctx the parse tree
	 */
	void exitCell_value(SparkyParser.Cell_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkyParser#keyvalue}.
	 * @param ctx the parse tree
	 */
	void enterKeyvalue(SparkyParser.KeyvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkyParser#keyvalue}.
	 * @param ctx the parse tree
	 */
	void exitKeyvalue(SparkyParser.KeyvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkyParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(SparkyParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkyParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(SparkyParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkyParser#raw}.
	 * @param ctx the parse tree
	 */
	void enterRaw(SparkyParser.RawContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkyParser#raw}.
	 * @param ctx the parse tree
	 */
	void exitRaw(SparkyParser.RawContext ctx);
}