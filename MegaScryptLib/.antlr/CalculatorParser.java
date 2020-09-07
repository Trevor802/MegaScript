// Generated from /Users/pascerveau/ANTLR/Calculator/MegaScryptLib/Calculator.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalculatorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		Number=10, True=11, False=12, Var=13, Null=14, Not=15, Increment=16, Decrement=17, 
		And=18, Or=19, Dot=20, Plus=21, Minus=22, Multiply=23, Divide=24, Modulo=25, 
		LeftParenthesis=26, RightParenthesis=27, Greater=28, Less=29, GreaterEqual=30, 
		LessEqual=31, Equal=32, NotEqual=33, AddAss=34, MinusAss=35, MultiplyAss=36, 
		DivideAss=37, String=38, Id=39, WhiteSpaces=40;
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_statement = 2, RULE_declaration = 3, 
		RULE_fieldDeclaration = 4, RULE_object = 5, RULE_assignment = 6, RULE_ifStmt = 7, 
		RULE_incrementExpr = 8, RULE_decrementExpr = 9, RULE_expression = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "block", "statement", "declaration", "fieldDeclaration", "object", 
			"assignment", "ifStmt", "incrementExpr", "decrementExpr", "expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "';'", "'='", "':'", "','", "'if'", "'else if'", 
			"'else'", null, "'true'", "'false'", "'var'", "'null'", "'!'", "'++'", 
			"'--'", "'&&'", "'||'", "'.'", "'+'", "'-'", "'*'", "'/'", "'%'", "'('", 
			"')'", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", "'+='", "'-='", 
			"'*='", "'/='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "Number", 
			"True", "False", "Var", "Null", "Not", "Increment", "Decrement", "And", 
			"Or", "Dot", "Plus", "Minus", "Multiply", "Divide", "Modulo", "LeftParenthesis", 
			"RightParenthesis", "Greater", "Less", "GreaterEqual", "LessEqual", "Equal", 
			"NotEqual", "AddAss", "MinusAss", "MultiplyAss", "DivideAss", "String", 
			"Id", "WhiteSpaces"
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
	public String getGrammarFileName() { return "Calculator.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CalculatorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__6) | (1L << Number) | (1L << True) | (1L << False) | (1L << Var) | (1L << Null) | (1L << Not) | (1L << Increment) | (1L << Decrement) | (1L << Plus) | (1L << Minus) | (1L << LeftParenthesis) | (1L << String) | (1L << Id))) != 0)) {
				{
				setState(24);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(22);
					statement();
					}
					break;
				case 2:
					{
					setState(23);
					block();
					}
					break;
				}
				}
				setState(28);
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

	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			setState(38);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				match(T__0);
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__6) | (1L << Number) | (1L << True) | (1L << False) | (1L << Var) | (1L << Null) | (1L << Not) | (1L << Increment) | (1L << Decrement) | (1L << Plus) | (1L << Minus) | (1L << LeftParenthesis) | (1L << String) | (1L << Id))) != 0)) {
					{
					{
					setState(30);
					statement();
					}
					}
					setState(35);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(36);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				statement();
				}
				break;
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

	public static class StatementContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public IncrementExprContext incrementExpr() {
			return getRuleContext(IncrementExprContext.class,0);
		}
		public DecrementExprContext decrementExpr() {
			return getRuleContext(DecrementExprContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(50);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(42);
				ifStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(43);
				incrementExpr();
				setState(44);
				match(T__2);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(46);
				decrementExpr();
				setState(47);
				match(T__2);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(49);
				expression(0);
				}
				break;
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

	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode Var() { return getToken(CalculatorParser.Var, 0); }
		public TerminalNode Id() { return getToken(CalculatorParser.Id, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(Var);
			setState(53);
			match(Id);
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(54);
				match(T__3);
				setState(55);
				expression(0);
				}
			}

			setState(58);
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

	public static class FieldDeclarationContext extends ParserRuleContext {
		public TerminalNode Id() { return getToken(CalculatorParser.Id, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_fieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(Id);
			setState(61);
			match(T__4);
			setState(64);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(62);
				expression(0);
				}
				break;
			case 2:
				{
				setState(63);
				object();
				}
				break;
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

	public static class ObjectContext extends ParserRuleContext {
		public List<FieldDeclarationContext> fieldDeclaration() {
			return getRuleContexts(FieldDeclarationContext.class);
		}
		public FieldDeclarationContext fieldDeclaration(int i) {
			return getRuleContext(FieldDeclarationContext.class,i);
		}
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_object);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(T__0);
			setState(72);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(67);
					fieldDeclaration();
					setState(68);
					match(T__5);
					}
					} 
				}
				setState(74);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(75);
			fieldDeclaration();
			setState(76);
			match(T__1);
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

	public static class AssignmentContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AddAss() { return getToken(CalculatorParser.AddAss, 0); }
		public TerminalNode MinusAss() { return getToken(CalculatorParser.MinusAss, 0); }
		public TerminalNode MultiplyAss() { return getToken(CalculatorParser.MultiplyAss, 0); }
		public TerminalNode DivideAss() { return getToken(CalculatorParser.DivideAss, 0); }
		public List<TerminalNode> Id() { return getTokens(CalculatorParser.Id); }
		public TerminalNode Id(int i) {
			return getToken(CalculatorParser.Id, i);
		}
		public List<TerminalNode> Dot() { return getTokens(CalculatorParser.Dot); }
		public TerminalNode Dot(int i) {
			return getToken(CalculatorParser.Dot, i);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(78);
			match(Id);
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Dot) {
				{
				{
				setState(79);
				match(Dot);
				setState(80);
				match(Id);
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(86);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << AddAss) | (1L << MinusAss) | (1L << MultiplyAss) | (1L << DivideAss))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(87);
			expression(0);
			setState(88);
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

	public static class IfStmtContext extends ParserRuleContext {
		public List<TerminalNode> LeftParenthesis() { return getTokens(CalculatorParser.LeftParenthesis); }
		public TerminalNode LeftParenthesis(int i) {
			return getToken(CalculatorParser.LeftParenthesis, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RightParenthesis() { return getTokens(CalculatorParser.RightParenthesis); }
		public TerminalNode RightParenthesis(int i) {
			return getToken(CalculatorParser.RightParenthesis, i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ifStmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(T__6);
			setState(91);
			match(LeftParenthesis);
			setState(92);
			expression(0);
			setState(93);
			match(RightParenthesis);
			setState(94);
			block();
			setState(103);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(95);
					match(T__7);
					setState(96);
					match(LeftParenthesis);
					setState(97);
					expression(0);
					setState(98);
					match(RightParenthesis);
					setState(99);
					block();
					}
					} 
				}
				setState(105);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(106);
				match(T__8);
				setState(107);
				block();
				}
				break;
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

	public static class IncrementExprContext extends ParserRuleContext {
		public TerminalNode Increment() { return getToken(CalculatorParser.Increment, 0); }
		public TerminalNode Id() { return getToken(CalculatorParser.Id, 0); }
		public IncrementExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incrementExpr; }
	}

	public final IncrementExprContext incrementExpr() throws RecognitionException {
		IncrementExprContext _localctx = new IncrementExprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_incrementExpr);
		try {
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Increment:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				match(Increment);
				setState(111);
				match(Id);
				}
				break;
			case Id:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				match(Id);
				setState(113);
				match(Increment);
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

	public static class DecrementExprContext extends ParserRuleContext {
		public TerminalNode Decrement() { return getToken(CalculatorParser.Decrement, 0); }
		public TerminalNode Id() { return getToken(CalculatorParser.Id, 0); }
		public DecrementExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decrementExpr; }
	}

	public final DecrementExprContext decrementExpr() throws RecognitionException {
		DecrementExprContext _localctx = new DecrementExprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_decrementExpr);
		try {
			setState(120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Decrement:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				match(Decrement);
				setState(117);
				match(Id);
				}
				break;
			case Id:
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				match(Id);
				setState(119);
				match(Decrement);
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

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode Number() { return getToken(CalculatorParser.Number, 0); }
		public TerminalNode False() { return getToken(CalculatorParser.False, 0); }
		public TerminalNode True() { return getToken(CalculatorParser.True, 0); }
		public TerminalNode Id() { return getToken(CalculatorParser.Id, 0); }
		public TerminalNode String() { return getToken(CalculatorParser.String, 0); }
		public TerminalNode Null() { return getToken(CalculatorParser.Null, 0); }
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public IncrementExprContext incrementExpr() {
			return getRuleContext(IncrementExprContext.class,0);
		}
		public DecrementExprContext decrementExpr() {
			return getRuleContext(DecrementExprContext.class,0);
		}
		public TerminalNode LeftParenthesis() { return getToken(CalculatorParser.LeftParenthesis, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RightParenthesis() { return getToken(CalculatorParser.RightParenthesis, 0); }
		public TerminalNode Plus() { return getToken(CalculatorParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(CalculatorParser.Minus, 0); }
		public TerminalNode Not() { return getToken(CalculatorParser.Not, 0); }
		public TerminalNode Dot() { return getToken(CalculatorParser.Dot, 0); }
		public TerminalNode Multiply() { return getToken(CalculatorParser.Multiply, 0); }
		public TerminalNode Divide() { return getToken(CalculatorParser.Divide, 0); }
		public TerminalNode Modulo() { return getToken(CalculatorParser.Modulo, 0); }
		public TerminalNode Less() { return getToken(CalculatorParser.Less, 0); }
		public TerminalNode Greater() { return getToken(CalculatorParser.Greater, 0); }
		public TerminalNode LessEqual() { return getToken(CalculatorParser.LessEqual, 0); }
		public TerminalNode GreaterEqual() { return getToken(CalculatorParser.GreaterEqual, 0); }
		public TerminalNode Equal() { return getToken(CalculatorParser.Equal, 0); }
		public TerminalNode NotEqual() { return getToken(CalculatorParser.NotEqual, 0); }
		public TerminalNode And() { return getToken(CalculatorParser.And, 0); }
		public TerminalNode Or() { return getToken(CalculatorParser.Or, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(123);
				match(Number);
				}
				break;
			case 2:
				{
				setState(124);
				match(False);
				}
				break;
			case 3:
				{
				setState(125);
				match(True);
				}
				break;
			case 4:
				{
				setState(126);
				match(Id);
				}
				break;
			case 5:
				{
				setState(127);
				match(String);
				}
				break;
			case 6:
				{
				setState(128);
				match(Null);
				}
				break;
			case 7:
				{
				setState(129);
				object();
				}
				break;
			case 8:
				{
				setState(130);
				incrementExpr();
				}
				break;
			case 9:
				{
				setState(131);
				decrementExpr();
				}
				break;
			case 10:
				{
				setState(132);
				match(LeftParenthesis);
				setState(133);
				expression(0);
				setState(134);
				match(RightParenthesis);
				}
				break;
			case 11:
				{
				setState(136);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Not) | (1L << Plus) | (1L << Minus))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(137);
				expression(7);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(163);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(161);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(140);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(141);
						match(Dot);
						setState(142);
						expression(9);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(143);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(144);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Multiply) | (1L << Divide) | (1L << Modulo))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(145);
						expression(7);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(146);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(147);
						_la = _input.LA(1);
						if ( !(_la==Plus || _la==Minus) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(148);
						expression(6);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(149);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(150);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Greater) | (1L << Less) | (1L << GreaterEqual) | (1L << LessEqual))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(151);
						expression(5);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(152);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(153);
						_la = _input.LA(1);
						if ( !(_la==Equal || _la==NotEqual) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(154);
						expression(4);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(155);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(156);
						match(And);
						setState(157);
						expression(3);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(158);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(159);
						match(Or);
						setState(160);
						expression(2);
						}
						break;
					}
					} 
				}
				setState(165);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3*\u00a9\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\7\2\33\n\2\f\2\16\2\36\13\2\3\3\3\3\7\3\"\n\3\f\3"+
		"\16\3%\13\3\3\3\3\3\5\3)\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5"+
		"\4\65\n\4\3\5\3\5\3\5\3\5\5\5;\n\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6C\n\6\3"+
		"\7\3\7\3\7\3\7\7\7I\n\7\f\7\16\7L\13\7\3\7\3\7\3\7\3\b\3\b\3\b\7\bT\n"+
		"\b\f\b\16\bW\13\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\7\th\n\t\f\t\16\tk\13\t\3\t\3\t\5\to\n\t\3\n\3\n\3\n\3\n\5\n"+
		"u\n\n\3\13\3\13\3\13\3\13\5\13{\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u008d\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00a4\n"+
		"\f\f\f\16\f\u00a7\13\f\3\f\2\3\26\r\2\4\6\b\n\f\16\20\22\24\26\2\b\4\2"+
		"\6\6$\'\4\2\21\21\27\30\3\2\31\33\3\2\27\30\3\2\36!\3\2\"#\2\u00bf\2\34"+
		"\3\2\2\2\4(\3\2\2\2\6\64\3\2\2\2\b\66\3\2\2\2\n>\3\2\2\2\fD\3\2\2\2\16"+
		"P\3\2\2\2\20\\\3\2\2\2\22t\3\2\2\2\24z\3\2\2\2\26\u008c\3\2\2\2\30\33"+
		"\5\6\4\2\31\33\5\4\3\2\32\30\3\2\2\2\32\31\3\2\2\2\33\36\3\2\2\2\34\32"+
		"\3\2\2\2\34\35\3\2\2\2\35\3\3\2\2\2\36\34\3\2\2\2\37#\7\3\2\2 \"\5\6\4"+
		"\2! \3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2\2$&\3\2\2\2%#\3\2\2\2&)\7\4"+
		"\2\2\')\5\6\4\2(\37\3\2\2\2(\'\3\2\2\2)\5\3\2\2\2*\65\5\b\5\2+\65\5\16"+
		"\b\2,\65\5\20\t\2-.\5\22\n\2./\7\5\2\2/\65\3\2\2\2\60\61\5\24\13\2\61"+
		"\62\7\5\2\2\62\65\3\2\2\2\63\65\5\26\f\2\64*\3\2\2\2\64+\3\2\2\2\64,\3"+
		"\2\2\2\64-\3\2\2\2\64\60\3\2\2\2\64\63\3\2\2\2\65\7\3\2\2\2\66\67\7\17"+
		"\2\2\67:\7)\2\289\7\6\2\29;\5\26\f\2:8\3\2\2\2:;\3\2\2\2;<\3\2\2\2<=\7"+
		"\5\2\2=\t\3\2\2\2>?\7)\2\2?B\7\7\2\2@C\5\26\f\2AC\5\f\7\2B@\3\2\2\2BA"+
		"\3\2\2\2C\13\3\2\2\2DJ\7\3\2\2EF\5\n\6\2FG\7\b\2\2GI\3\2\2\2HE\3\2\2\2"+
		"IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2KM\3\2\2\2LJ\3\2\2\2MN\5\n\6\2NO\7\4\2\2"+
		"O\r\3\2\2\2PU\7)\2\2QR\7\26\2\2RT\7)\2\2SQ\3\2\2\2TW\3\2\2\2US\3\2\2\2"+
		"UV\3\2\2\2VX\3\2\2\2WU\3\2\2\2XY\t\2\2\2YZ\5\26\f\2Z[\7\5\2\2[\17\3\2"+
		"\2\2\\]\7\t\2\2]^\7\34\2\2^_\5\26\f\2_`\7\35\2\2`i\5\4\3\2ab\7\n\2\2b"+
		"c\7\34\2\2cd\5\26\f\2de\7\35\2\2ef\5\4\3\2fh\3\2\2\2ga\3\2\2\2hk\3\2\2"+
		"\2ig\3\2\2\2ij\3\2\2\2jn\3\2\2\2ki\3\2\2\2lm\7\13\2\2mo\5\4\3\2nl\3\2"+
		"\2\2no\3\2\2\2o\21\3\2\2\2pq\7\22\2\2qu\7)\2\2rs\7)\2\2su\7\22\2\2tp\3"+
		"\2\2\2tr\3\2\2\2u\23\3\2\2\2vw\7\23\2\2w{\7)\2\2xy\7)\2\2y{\7\23\2\2z"+
		"v\3\2\2\2zx\3\2\2\2{\25\3\2\2\2|}\b\f\1\2}\u008d\7\f\2\2~\u008d\7\16\2"+
		"\2\177\u008d\7\r\2\2\u0080\u008d\7)\2\2\u0081\u008d\7(\2\2\u0082\u008d"+
		"\7\20\2\2\u0083\u008d\5\f\7\2\u0084\u008d\5\22\n\2\u0085\u008d\5\24\13"+
		"\2\u0086\u0087\7\34\2\2\u0087\u0088\5\26\f\2\u0088\u0089\7\35\2\2\u0089"+
		"\u008d\3\2\2\2\u008a\u008b\t\3\2\2\u008b\u008d\5\26\f\t\u008c|\3\2\2\2"+
		"\u008c~\3\2\2\2\u008c\177\3\2\2\2\u008c\u0080\3\2\2\2\u008c\u0081\3\2"+
		"\2\2\u008c\u0082\3\2\2\2\u008c\u0083\3\2\2\2\u008c\u0084\3\2\2\2\u008c"+
		"\u0085\3\2\2\2\u008c\u0086\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u00a5\3\2"+
		"\2\2\u008e\u008f\f\n\2\2\u008f\u0090\7\26\2\2\u0090\u00a4\5\26\f\13\u0091"+
		"\u0092\f\b\2\2\u0092\u0093\t\4\2\2\u0093\u00a4\5\26\f\t\u0094\u0095\f"+
		"\7\2\2\u0095\u0096\t\5\2\2\u0096\u00a4\5\26\f\b\u0097\u0098\f\6\2\2\u0098"+
		"\u0099\t\6\2\2\u0099\u00a4\5\26\f\7\u009a\u009b\f\5\2\2\u009b\u009c\t"+
		"\7\2\2\u009c\u00a4\5\26\f\6\u009d\u009e\f\4\2\2\u009e\u009f\7\24\2\2\u009f"+
		"\u00a4\5\26\f\5\u00a0\u00a1\f\3\2\2\u00a1\u00a2\7\25\2\2\u00a2\u00a4\5"+
		"\26\f\4\u00a3\u008e\3\2\2\2\u00a3\u0091\3\2\2\2\u00a3\u0094\3\2\2\2\u00a3"+
		"\u0097\3\2\2\2\u00a3\u009a\3\2\2\2\u00a3\u009d\3\2\2\2\u00a3\u00a0\3\2"+
		"\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6"+
		"\27\3\2\2\2\u00a7\u00a5\3\2\2\2\22\32\34#(\64:BJUintz\u008c\u00a3\u00a5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}