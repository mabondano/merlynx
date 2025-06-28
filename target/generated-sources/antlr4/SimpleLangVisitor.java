// Generated from SimpleLang.g4 by ANTLR 4.13.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SimpleLangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SimpleLangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(SimpleLangParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(SimpleLangParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#printStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStmt(SimpleLangParser.PrintStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#assignStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStmt(SimpleLangParser.AssignStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#exprStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStmt(SimpleLangParser.ExprStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(SimpleLangParser.ExprContext ctx);
}