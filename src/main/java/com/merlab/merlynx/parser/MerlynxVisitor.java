// Generated from Merlynx.g4 by ANTLR 4.13.0

package com.merlab.merlynx.parser;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MerlynxParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MerlynxVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MerlynxParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(MerlynxParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link MerlynxParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(MerlynxParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MerlynxParser#pipelineDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPipelineDecl(MerlynxParser.PipelineDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link MerlynxParser#pipelineBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPipelineBody(MerlynxParser.PipelineBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MerlynxParser#pipelineStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPipelineStatement(MerlynxParser.PipelineStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MerlynxParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(MerlynxParser.ExpressionContext ctx);
}