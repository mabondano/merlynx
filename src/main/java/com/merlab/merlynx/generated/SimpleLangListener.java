package com.merlab.merlynx.generated;

// Generated from SimpleLang.g4 by ANTLR 4.13.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleLangParser}.
 */
public interface SimpleLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SimpleLangParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SimpleLangParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(SimpleLangParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(SimpleLangParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#printStmt}.
	 * @param ctx the parse tree
	 */
	void enterPrintStmt(SimpleLangParser.PrintStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#printStmt}.
	 * @param ctx the parse tree
	 */
	void exitPrintStmt(SimpleLangParser.PrintStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#assignStmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignStmt(SimpleLangParser.AssignStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#assignStmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignStmt(SimpleLangParser.AssignStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#exprStmt}.
	 * @param ctx the parse tree
	 */
	void enterExprStmt(SimpleLangParser.ExprStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#exprStmt}.
	 * @param ctx the parse tree
	 */
	void exitExprStmt(SimpleLangParser.ExprStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(SimpleLangParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(SimpleLangParser.ExprContext ctx);
}