// Generated from Merlynx.g4 by ANTLR 4.13.0

package com.merlab.merlynx.parser;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MerlynxParser}.
 */
public interface MerlynxListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MerlynxParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MerlynxParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerlynxParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MerlynxParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MerlynxParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MerlynxParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerlynxParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MerlynxParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MerlynxParser#pipelineDecl}.
	 * @param ctx the parse tree
	 */
	void enterPipelineDecl(MerlynxParser.PipelineDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerlynxParser#pipelineDecl}.
	 * @param ctx the parse tree
	 */
	void exitPipelineDecl(MerlynxParser.PipelineDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MerlynxParser#pipelineBody}.
	 * @param ctx the parse tree
	 */
	void enterPipelineBody(MerlynxParser.PipelineBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerlynxParser#pipelineBody}.
	 * @param ctx the parse tree
	 */
	void exitPipelineBody(MerlynxParser.PipelineBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MerlynxParser#pipelineStatement}.
	 * @param ctx the parse tree
	 */
	void enterPipelineStatement(MerlynxParser.PipelineStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerlynxParser#pipelineStatement}.
	 * @param ctx the parse tree
	 */
	void exitPipelineStatement(MerlynxParser.PipelineStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MerlynxParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(MerlynxParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerlynxParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(MerlynxParser.ExpressionContext ctx);
}