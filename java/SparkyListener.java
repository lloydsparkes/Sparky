// Generated from ..\grammar\Sparky.g4 by ANTLR 4.5.1
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
	 * Enter a parse tree produced by {@link SparkyParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(SparkyParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkyParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(SparkyParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkyParser#str}.
	 * @param ctx the parse tree
	 */
	void enterStr(SparkyParser.StrContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkyParser#str}.
	 * @param ctx the parse tree
	 */
	void exitStr(SparkyParser.StrContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkyParser#pair}.
	 * @param ctx the parse tree
	 */
	void enterPair(SparkyParser.PairContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkyParser#pair}.
	 * @param ctx the parse tree
	 */
	void exitPair(SparkyParser.PairContext ctx);
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
	 * Enter a parse tree produced by {@link SparkyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(SparkyParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(SparkyParser.ExprContext ctx);
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
	 * Enter a parse tree produced by {@link SparkyParser#variable_name}.
	 * @param ctx the parse tree
	 */
	void enterVariable_name(SparkyParser.Variable_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkyParser#variable_name}.
	 * @param ctx the parse tree
	 */
	void exitVariable_name(SparkyParser.Variable_nameContext ctx);
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
	 * Enter a parse tree produced by {@link SparkyParser#table_headers}.
	 * @param ctx the parse tree
	 */
	void enterTable_headers(SparkyParser.Table_headersContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkyParser#table_headers}.
	 * @param ctx the parse tree
	 */
	void exitTable_headers(SparkyParser.Table_headersContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkyParser#table_header}.
	 * @param ctx the parse tree
	 */
	void enterTable_header(SparkyParser.Table_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkyParser#table_header}.
	 * @param ctx the parse tree
	 */
	void exitTable_header(SparkyParser.Table_headerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkyParser#table_row}.
	 * @param ctx the parse tree
	 */
	void enterTable_row(SparkyParser.Table_rowContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkyParser#table_row}.
	 * @param ctx the parse tree
	 */
	void exitTable_row(SparkyParser.Table_rowContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkyParser#table_cell}.
	 * @param ctx the parse tree
	 */
	void enterTable_cell(SparkyParser.Table_cellContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkyParser#table_cell}.
	 * @param ctx the parse tree
	 */
	void exitTable_cell(SparkyParser.Table_cellContext ctx);
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
}