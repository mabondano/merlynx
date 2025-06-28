// Generated from Merlynx.g4 by ANTLR 4.13.0

package com.merlab.merlynx.parser;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MerlynxParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, ID=11, WS=12, COMMENT=13, MULTILINE_COMMENT=14;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_pipelineDecl = 2, RULE_pipelineBody = 3, 
		RULE_pipelineStatement = 4, RULE_expression = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "pipelineDecl", "pipelineBody", "pipelineStatement", 
			"expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'pipeline'", "'{'", "'}'", "'input'", "':'", "';'", "'process'", 
			"'output'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "ID", 
			"WS", "COMMENT", "MULTILINE_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Merlynx.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MerlynxParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MerlynxParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerlynxListener ) ((MerlynxListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerlynxListener ) ((MerlynxListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MerlynxVisitor ) return ((MerlynxVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(12);
				statement();
				}
				}
				setState(17);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(18);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public PipelineDeclContext pipelineDecl() {
			return getRuleContext(PipelineDeclContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerlynxListener ) ((MerlynxListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerlynxListener ) ((MerlynxListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MerlynxVisitor ) return ((MerlynxVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			pipelineDecl();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PipelineDeclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MerlynxParser.ID, 0); }
		public PipelineBodyContext pipelineBody() {
			return getRuleContext(PipelineBodyContext.class,0);
		}
		public PipelineDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pipelineDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerlynxListener ) ((MerlynxListener)listener).enterPipelineDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerlynxListener ) ((MerlynxListener)listener).exitPipelineDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MerlynxVisitor ) return ((MerlynxVisitor<? extends T>)visitor).visitPipelineDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PipelineDeclContext pipelineDecl() throws RecognitionException {
		PipelineDeclContext _localctx = new PipelineDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_pipelineDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			match(T__0);
			setState(23);
			match(ID);
			setState(24);
			match(T__1);
			setState(25);
			pipelineBody();
			setState(26);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PipelineBodyContext extends ParserRuleContext {
		public List<PipelineStatementContext> pipelineStatement() {
			return getRuleContexts(PipelineStatementContext.class);
		}
		public PipelineStatementContext pipelineStatement(int i) {
			return getRuleContext(PipelineStatementContext.class,i);
		}
		public PipelineBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pipelineBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerlynxListener ) ((MerlynxListener)listener).enterPipelineBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerlynxListener ) ((MerlynxListener)listener).exitPipelineBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MerlynxVisitor ) return ((MerlynxVisitor<? extends T>)visitor).visitPipelineBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PipelineBodyContext pipelineBody() throws RecognitionException {
		PipelineBodyContext _localctx = new PipelineBodyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_pipelineBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 400L) != 0)) {
				{
				{
				setState(28);
				pipelineStatement();
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PipelineStatementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MerlynxParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PipelineStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pipelineStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerlynxListener ) ((MerlynxListener)listener).enterPipelineStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerlynxListener ) ((MerlynxListener)listener).exitPipelineStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MerlynxVisitor ) return ((MerlynxVisitor<? extends T>)visitor).visitPipelineStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PipelineStatementContext pipelineStatement() throws RecognitionException {
		PipelineStatementContext _localctx = new PipelineStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_pipelineStatement);
		try {
			setState(47);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				match(T__3);
				setState(35);
				match(T__4);
				setState(36);
				match(ID);
				setState(37);
				match(T__5);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				match(T__6);
				setState(39);
				match(T__4);
				setState(40);
				expression();
				setState(41);
				match(T__5);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(43);
				match(T__7);
				setState(44);
				match(T__4);
				setState(45);
				match(ID);
				setState(46);
				match(T__5);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MerlynxParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MerlynxParser.ID, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerlynxListener ) ((MerlynxListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerlynxListener ) ((MerlynxListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MerlynxVisitor ) return ((MerlynxVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(ID);
			setState(50);
			match(T__8);
			setState(51);
			match(ID);
			setState(52);
			match(T__9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u000e7\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0001\u0000\u0005\u0000\u000e\b\u0000\n\u0000\f\u0000"+
		"\u0011\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0005\u0003\u001e\b\u0003\n\u0003\f\u0003!\t\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u00040\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0000\u0000\u0006\u0000\u0002\u0004\u0006\b\n\u0000"+
		"\u00004\u0000\u000f\u0001\u0000\u0000\u0000\u0002\u0014\u0001\u0000\u0000"+
		"\u0000\u0004\u0016\u0001\u0000\u0000\u0000\u0006\u001f\u0001\u0000\u0000"+
		"\u0000\b/\u0001\u0000\u0000\u0000\n1\u0001\u0000\u0000\u0000\f\u000e\u0003"+
		"\u0002\u0001\u0000\r\f\u0001\u0000\u0000\u0000\u000e\u0011\u0001\u0000"+
		"\u0000\u0000\u000f\r\u0001\u0000\u0000\u0000\u000f\u0010\u0001\u0000\u0000"+
		"\u0000\u0010\u0012\u0001\u0000\u0000\u0000\u0011\u000f\u0001\u0000\u0000"+
		"\u0000\u0012\u0013\u0005\u0000\u0000\u0001\u0013\u0001\u0001\u0000\u0000"+
		"\u0000\u0014\u0015\u0003\u0004\u0002\u0000\u0015\u0003\u0001\u0000\u0000"+
		"\u0000\u0016\u0017\u0005\u0001\u0000\u0000\u0017\u0018\u0005\u000b\u0000"+
		"\u0000\u0018\u0019\u0005\u0002\u0000\u0000\u0019\u001a\u0003\u0006\u0003"+
		"\u0000\u001a\u001b\u0005\u0003\u0000\u0000\u001b\u0005\u0001\u0000\u0000"+
		"\u0000\u001c\u001e\u0003\b\u0004\u0000\u001d\u001c\u0001\u0000\u0000\u0000"+
		"\u001e!\u0001\u0000\u0000\u0000\u001f\u001d\u0001\u0000\u0000\u0000\u001f"+
		" \u0001\u0000\u0000\u0000 \u0007\u0001\u0000\u0000\u0000!\u001f\u0001"+
		"\u0000\u0000\u0000\"#\u0005\u0004\u0000\u0000#$\u0005\u0005\u0000\u0000"+
		"$%\u0005\u000b\u0000\u0000%0\u0005\u0006\u0000\u0000&\'\u0005\u0007\u0000"+
		"\u0000\'(\u0005\u0005\u0000\u0000()\u0003\n\u0005\u0000)*\u0005\u0006"+
		"\u0000\u0000*0\u0001\u0000\u0000\u0000+,\u0005\b\u0000\u0000,-\u0005\u0005"+
		"\u0000\u0000-.\u0005\u000b\u0000\u0000.0\u0005\u0006\u0000\u0000/\"\u0001"+
		"\u0000\u0000\u0000/&\u0001\u0000\u0000\u0000/+\u0001\u0000\u0000\u0000"+
		"0\t\u0001\u0000\u0000\u000012\u0005\u000b\u0000\u000023\u0005\t\u0000"+
		"\u000034\u0005\u000b\u0000\u000045\u0005\n\u0000\u00005\u000b\u0001\u0000"+
		"\u0000\u0000\u0003\u000f\u001f/";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}