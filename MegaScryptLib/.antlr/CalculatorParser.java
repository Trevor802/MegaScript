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
		T__9=10, T__10=11, Number=12, True=13, False=14, Var=15, Null=16, Not=17, 
		Increment=18, Decrement=19, And=20, Or=21, Dot=22, Plus=23, Minus=24, 
		Multiply=25, Divide=26, Modulo=27, LeftParenthesis=28, RightParenthesis=29, 
		Greater=30, Less=31, GreaterEqual=32, LessEqual=33, Equal=34, NotEqual=35, 
		AddAss=36, MinusAss=37, MultiplyAss=38, DivideAss=39, String=40, Id=41, 
		WhiteSpaces=42;
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_statement = 2, RULE_declaration = 3, 
		RULE_funcDeclaration = 4, RULE_varList = 5, RULE_fieldDeclaration = 6, 
		RULE_object = 7, RULE_assignment = 8, RULE_invocation = 9, RULE_paramList = 10, 
		RULE_ifStmt = 11, RULE_retStmt = 12, RULE_incrementExpr = 13, RULE_decrementExpr = 14, 
		RULE_expression = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "block", "statement", "declaration", "funcDeclaration", "varList", 
			"fieldDeclaration", "object", "assignment", "invocation", "paramList", 
			"ifStmt", "retStmt", "incrementExpr", "decrementExpr", "expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "';'", "'='", "'function'", "','", "':'", "'if'", 
			"'else if'", "'else'", "'return'", null, "'true'", "'false'", "'var'", 
			"'null'", "'!'", "'++'", "'--'", "'&&'", "'||'", "'.'", "'+'", "'-'", 
			"'*'", "'/'", "'%'", "'('", "')'", "'>'", "'<'", "'>='", "'<='", "'=='", 
			"'!='", "'+='", "'-='", "'*='", "'/='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"Number", "True", "False", "Var", "Null", "Not", "Increment", "Decrement", 
			"And", "Or", "Dot", "Plus", "Minus", "Multiply", "Divide", "Modulo", 
			"LeftParenthesis", "RightParenthesis", "Greater", "Less", "GreaterEqual", 
			"LessEqual", "Equal", "NotEqual", "AddAss", "MinusAss", "MultiplyAss", 
			"DivideAss", "String", "Id", "WhiteSpaces"
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
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__7) | (1L << T__10) | (1L << Var) | (1L << Increment) | (1L << Decrement) | (1L << Id))) != 0)) {
				{
				setState(34);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(32);
					statement();
					}
					break;
				case 2:
					{
					setState(33);
					block();
					}
					break;
				}
				}
				setState(38);
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
			setState(48);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				match(T__0);
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__10) | (1L << Var) | (1L << Increment) | (1L << Decrement) | (1L << Id))) != 0)) {
					{
					{
					setState(40);
					statement();
					}
					}
					setState(45);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(46);
				match(T__1);
				}
				break;
			case T__7:
			case T__10:
			case Var:
			case Increment:
			case Decrement:
			case Id:
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				statement();
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
		public InvocationContext invocation() {
			return getRuleContext(InvocationContext.class,0);
		}
		public RetStmtContext retStmt() {
			return getRuleContext(RetStmtContext.class,0);
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
			setState(63);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(52);
				ifStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(53);
				incrementExpr();
				setState(54);
				match(T__2);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(56);
				decrementExpr();
				setState(57);
				match(T__2);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(59);
				invocation();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(60);
				retStmt();
				setState(61);
				match(T__2);
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
			setState(65);
			match(Var);
			setState(66);
			match(Id);
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(67);
				match(T__3);
				setState(68);
				expression(0);
				}
			}

			setState(71);
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

	public static class FuncDeclarationContext extends ParserRuleContext {
		public TerminalNode LeftParenthesis() { return getToken(CalculatorParser.LeftParenthesis, 0); }
		public TerminalNode RightParenthesis() { return getToken(CalculatorParser.RightParenthesis, 0); }
		public VarListContext varList() {
			return getRuleContext(VarListContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FuncDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDeclaration; }
	}

	public final FuncDeclarationContext funcDeclaration() throws RecognitionException {
		FuncDeclarationContext _localctx = new FuncDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_funcDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(T__4);
			setState(74);
			match(LeftParenthesis);
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Var) {
				{
				setState(75);
				varList();
				}
			}

			setState(78);
			match(RightParenthesis);
			setState(79);
			match(T__0);
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__10) | (1L << Var) | (1L << Increment) | (1L << Decrement) | (1L << Id))) != 0)) {
				{
				{
				setState(80);
				statement();
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(86);
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

	public static class VarListContext extends ParserRuleContext {
		public List<TerminalNode> Var() { return getTokens(CalculatorParser.Var); }
		public TerminalNode Var(int i) {
			return getToken(CalculatorParser.Var, i);
		}
		public List<TerminalNode> Id() { return getTokens(CalculatorParser.Id); }
		public TerminalNode Id(int i) {
			return getToken(CalculatorParser.Id, i);
		}
		public VarListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varList; }
	}

	public final VarListContext varList() throws RecognitionException {
		VarListContext _localctx = new VarListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_varList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(Var);
			setState(89);
			match(Id);
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(90);
				match(T__5);
				setState(91);
				match(Var);
				setState(92);
				match(Id);
				}
				}
				setState(97);
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
		enterRule(_localctx, 12, RULE_fieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(Id);
			setState(99);
			match(T__6);
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(100);
				expression(0);
				}
				break;
			case 2:
				{
				setState(101);
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
		enterRule(_localctx, 14, RULE_object);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(T__0);
			setState(110);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(105);
					fieldDeclaration();
					setState(106);
					match(T__5);
					}
					} 
				}
				setState(112);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(113);
			fieldDeclaration();
			setState(114);
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
		enterRule(_localctx, 16, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(116);
			match(Id);
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Dot) {
				{
				{
				setState(117);
				match(Dot);
				setState(118);
				match(Id);
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(124);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << AddAss) | (1L << MinusAss) | (1L << MultiplyAss) | (1L << DivideAss))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(125);
			expression(0);
			setState(126);
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

	public static class InvocationContext extends ParserRuleContext {
		public TerminalNode LeftParenthesis() { return getToken(CalculatorParser.LeftParenthesis, 0); }
		public TerminalNode RightParenthesis() { return getToken(CalculatorParser.RightParenthesis, 0); }
		public List<TerminalNode> Id() { return getTokens(CalculatorParser.Id); }
		public TerminalNode Id(int i) {
			return getToken(CalculatorParser.Id, i);
		}
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public List<TerminalNode> Dot() { return getTokens(CalculatorParser.Dot); }
		public TerminalNode Dot(int i) {
			return getToken(CalculatorParser.Dot, i);
		}
		public InvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invocation; }
	}

	public final InvocationContext invocation() throws RecognitionException {
		InvocationContext _localctx = new InvocationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_invocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(128);
			match(Id);
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Dot) {
				{
				{
				setState(129);
				match(Dot);
				setState(130);
				match(Id);
				}
				}
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(136);
			match(LeftParenthesis);
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << Number) | (1L << True) | (1L << False) | (1L << Null) | (1L << Not) | (1L << Increment) | (1L << Decrement) | (1L << Plus) | (1L << Minus) | (1L << LeftParenthesis) | (1L << String) | (1L << Id))) != 0)) {
				{
				setState(137);
				paramList();
				}
			}

			setState(140);
			match(RightParenthesis);
			setState(141);
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

	public static class ParamListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramList; }
	}

	public final ParamListContext paramList() throws RecognitionException {
		ParamListContext _localctx = new ParamListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_paramList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			expression(0);
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(144);
				match(T__5);
				setState(145);
				expression(0);
				}
				}
				setState(150);
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
		enterRule(_localctx, 22, RULE_ifStmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(T__7);
			setState(152);
			match(LeftParenthesis);
			setState(153);
			expression(0);
			setState(154);
			match(RightParenthesis);
			setState(155);
			block();
			setState(164);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(156);
					match(T__8);
					setState(157);
					match(LeftParenthesis);
					setState(158);
					expression(0);
					setState(159);
					match(RightParenthesis);
					setState(160);
					block();
					}
					} 
				}
				setState(166);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(167);
				match(T__9);
				setState(168);
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

	public static class RetStmtContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RetStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retStmt; }
	}

	public final RetStmtContext retStmt() throws RecognitionException {
		RetStmtContext _localctx = new RetStmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_retStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(T__10);
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << Number) | (1L << True) | (1L << False) | (1L << Null) | (1L << Not) | (1L << Increment) | (1L << Decrement) | (1L << Plus) | (1L << Minus) | (1L << LeftParenthesis) | (1L << String) | (1L << Id))) != 0)) {
				{
				setState(172);
				expression(0);
				}
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
		enterRule(_localctx, 26, RULE_incrementExpr);
		try {
			setState(179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Increment:
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				match(Increment);
				setState(176);
				match(Id);
				}
				break;
			case Id:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				match(Id);
				setState(178);
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
		enterRule(_localctx, 28, RULE_decrementExpr);
		try {
			setState(185);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Decrement:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				match(Decrement);
				setState(182);
				match(Id);
				}
				break;
			case Id:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				match(Id);
				setState(184);
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
		public FuncDeclarationContext funcDeclaration() {
			return getRuleContext(FuncDeclarationContext.class,0);
		}
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public IncrementExprContext incrementExpr() {
			return getRuleContext(IncrementExprContext.class,0);
		}
		public DecrementExprContext decrementExpr() {
			return getRuleContext(DecrementExprContext.class,0);
		}
		public InvocationContext invocation() {
			return getRuleContext(InvocationContext.class,0);
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
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(188);
				match(Number);
				}
				break;
			case 2:
				{
				setState(189);
				match(False);
				}
				break;
			case 3:
				{
				setState(190);
				match(True);
				}
				break;
			case 4:
				{
				setState(191);
				match(Id);
				}
				break;
			case 5:
				{
				setState(192);
				match(String);
				}
				break;
			case 6:
				{
				setState(193);
				match(Null);
				}
				break;
			case 7:
				{
				setState(194);
				funcDeclaration();
				}
				break;
			case 8:
				{
				setState(195);
				object();
				}
				break;
			case 9:
				{
				setState(196);
				incrementExpr();
				}
				break;
			case 10:
				{
				setState(197);
				decrementExpr();
				}
				break;
			case 11:
				{
				setState(198);
				invocation();
				}
				break;
			case 12:
				{
				setState(199);
				match(LeftParenthesis);
				setState(200);
				expression(0);
				setState(201);
				match(RightParenthesis);
				}
				break;
			case 13:
				{
				setState(203);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Not) | (1L << Plus) | (1L << Minus))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(204);
				expression(7);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(230);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(228);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(207);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(208);
						match(Dot);
						setState(209);
						expression(9);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(210);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(211);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Multiply) | (1L << Divide) | (1L << Modulo))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(212);
						expression(7);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(213);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(214);
						_la = _input.LA(1);
						if ( !(_la==Plus || _la==Minus) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(215);
						expression(6);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(216);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(217);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Greater) | (1L << Less) | (1L << GreaterEqual) | (1L << LessEqual))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(218);
						expression(5);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(219);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(220);
						_la = _input.LA(1);
						if ( !(_la==Equal || _la==NotEqual) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(221);
						expression(4);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(222);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(223);
						match(And);
						setState(224);
						expression(3);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(225);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(226);
						match(Or);
						setState(227);
						expression(2);
						}
						break;
					}
					} 
				}
				setState(232);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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
		case 15:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u00ec\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\7"+
		"\2%\n\2\f\2\16\2(\13\2\3\3\3\3\7\3,\n\3\f\3\16\3/\13\3\3\3\3\3\5\3\63"+
		"\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4B\n\4\3\5"+
		"\3\5\3\5\3\5\5\5H\n\5\3\5\3\5\3\6\3\6\3\6\5\6O\n\6\3\6\3\6\3\6\7\6T\n"+
		"\6\f\6\16\6W\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\7\7`\n\7\f\7\16\7c\13\7"+
		"\3\b\3\b\3\b\3\b\5\bi\n\b\3\t\3\t\3\t\3\t\7\to\n\t\f\t\16\tr\13\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\7\nz\n\n\f\n\16\n}\13\n\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\7\13\u0086\n\13\f\13\16\13\u0089\13\13\3\13\3\13\5\13\u008d\n\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\7\f\u0095\n\f\f\f\16\f\u0098\13\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00a5\n\r\f\r\16\r\u00a8\13\r"+
		"\3\r\3\r\5\r\u00ac\n\r\3\16\3\16\5\16\u00b0\n\16\3\17\3\17\3\17\3\17\5"+
		"\17\u00b6\n\17\3\20\3\20\3\20\3\20\5\20\u00bc\n\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\5\21\u00d0\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00e7\n\21\f\21"+
		"\16\21\u00ea\13\21\3\21\2\3 \22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \2\b\4\2\6\6&)\4\2\23\23\31\32\3\2\33\35\3\2\31\32\3\2 #\3\2$%\2\u0107"+
		"\2&\3\2\2\2\4\62\3\2\2\2\6A\3\2\2\2\bC\3\2\2\2\nK\3\2\2\2\fZ\3\2\2\2\16"+
		"d\3\2\2\2\20j\3\2\2\2\22v\3\2\2\2\24\u0082\3\2\2\2\26\u0091\3\2\2\2\30"+
		"\u0099\3\2\2\2\32\u00ad\3\2\2\2\34\u00b5\3\2\2\2\36\u00bb\3\2\2\2 \u00cf"+
		"\3\2\2\2\"%\5\6\4\2#%\5\4\3\2$\"\3\2\2\2$#\3\2\2\2%(\3\2\2\2&$\3\2\2\2"+
		"&\'\3\2\2\2\'\3\3\2\2\2(&\3\2\2\2)-\7\3\2\2*,\5\6\4\2+*\3\2\2\2,/\3\2"+
		"\2\2-+\3\2\2\2-.\3\2\2\2.\60\3\2\2\2/-\3\2\2\2\60\63\7\4\2\2\61\63\5\6"+
		"\4\2\62)\3\2\2\2\62\61\3\2\2\2\63\5\3\2\2\2\64B\5\b\5\2\65B\5\22\n\2\66"+
		"B\5\30\r\2\678\5\34\17\289\7\5\2\29B\3\2\2\2:;\5\36\20\2;<\7\5\2\2<B\3"+
		"\2\2\2=B\5\24\13\2>?\5\32\16\2?@\7\5\2\2@B\3\2\2\2A\64\3\2\2\2A\65\3\2"+
		"\2\2A\66\3\2\2\2A\67\3\2\2\2A:\3\2\2\2A=\3\2\2\2A>\3\2\2\2B\7\3\2\2\2"+
		"CD\7\21\2\2DG\7+\2\2EF\7\6\2\2FH\5 \21\2GE\3\2\2\2GH\3\2\2\2HI\3\2\2\2"+
		"IJ\7\5\2\2J\t\3\2\2\2KL\7\7\2\2LN\7\36\2\2MO\5\f\7\2NM\3\2\2\2NO\3\2\2"+
		"\2OP\3\2\2\2PQ\7\37\2\2QU\7\3\2\2RT\5\6\4\2SR\3\2\2\2TW\3\2\2\2US\3\2"+
		"\2\2UV\3\2\2\2VX\3\2\2\2WU\3\2\2\2XY\7\4\2\2Y\13\3\2\2\2Z[\7\21\2\2[a"+
		"\7+\2\2\\]\7\b\2\2]^\7\21\2\2^`\7+\2\2_\\\3\2\2\2`c\3\2\2\2a_\3\2\2\2"+
		"ab\3\2\2\2b\r\3\2\2\2ca\3\2\2\2de\7+\2\2eh\7\t\2\2fi\5 \21\2gi\5\20\t"+
		"\2hf\3\2\2\2hg\3\2\2\2i\17\3\2\2\2jp\7\3\2\2kl\5\16\b\2lm\7\b\2\2mo\3"+
		"\2\2\2nk\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2qs\3\2\2\2rp\3\2\2\2st\5"+
		"\16\b\2tu\7\4\2\2u\21\3\2\2\2v{\7+\2\2wx\7\30\2\2xz\7+\2\2yw\3\2\2\2z"+
		"}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|~\3\2\2\2}{\3\2\2\2~\177\t\2\2\2\177\u0080"+
		"\5 \21\2\u0080\u0081\7\5\2\2\u0081\23\3\2\2\2\u0082\u0087\7+\2\2\u0083"+
		"\u0084\7\30\2\2\u0084\u0086\7+\2\2\u0085\u0083\3\2\2\2\u0086\u0089\3\2"+
		"\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008a\3\2\2\2\u0089"+
		"\u0087\3\2\2\2\u008a\u008c\7\36\2\2\u008b\u008d\5\26\f\2\u008c\u008b\3"+
		"\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\7\37\2\2\u008f"+
		"\u0090\7\5\2\2\u0090\25\3\2\2\2\u0091\u0096\5 \21\2\u0092\u0093\7\b\2"+
		"\2\u0093\u0095\5 \21\2\u0094\u0092\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094"+
		"\3\2\2\2\u0096\u0097\3\2\2\2\u0097\27\3\2\2\2\u0098\u0096\3\2\2\2\u0099"+
		"\u009a\7\n\2\2\u009a\u009b\7\36\2\2\u009b\u009c\5 \21\2\u009c\u009d\7"+
		"\37\2\2\u009d\u00a6\5\4\3\2\u009e\u009f\7\13\2\2\u009f\u00a0\7\36\2\2"+
		"\u00a0\u00a1\5 \21\2\u00a1\u00a2\7\37\2\2\u00a2\u00a3\5\4\3\2\u00a3\u00a5"+
		"\3\2\2\2\u00a4\u009e\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6"+
		"\u00a7\3\2\2\2\u00a7\u00ab\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00aa\7\f"+
		"\2\2\u00aa\u00ac\5\4\3\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac"+
		"\31\3\2\2\2\u00ad\u00af\7\r\2\2\u00ae\u00b0\5 \21\2\u00af\u00ae\3\2\2"+
		"\2\u00af\u00b0\3\2\2\2\u00b0\33\3\2\2\2\u00b1\u00b2\7\24\2\2\u00b2\u00b6"+
		"\7+\2\2\u00b3\u00b4\7+\2\2\u00b4\u00b6\7\24\2\2\u00b5\u00b1\3\2\2\2\u00b5"+
		"\u00b3\3\2\2\2\u00b6\35\3\2\2\2\u00b7\u00b8\7\25\2\2\u00b8\u00bc\7+\2"+
		"\2\u00b9\u00ba\7+\2\2\u00ba\u00bc\7\25\2\2\u00bb\u00b7\3\2\2\2\u00bb\u00b9"+
		"\3\2\2\2\u00bc\37\3\2\2\2\u00bd\u00be\b\21\1\2\u00be\u00d0\7\16\2\2\u00bf"+
		"\u00d0\7\20\2\2\u00c0\u00d0\7\17\2\2\u00c1\u00d0\7+\2\2\u00c2\u00d0\7"+
		"*\2\2\u00c3\u00d0\7\22\2\2\u00c4\u00d0\5\n\6\2\u00c5\u00d0\5\20\t\2\u00c6"+
		"\u00d0\5\34\17\2\u00c7\u00d0\5\36\20\2\u00c8\u00d0\5\24\13\2\u00c9\u00ca"+
		"\7\36\2\2\u00ca\u00cb\5 \21\2\u00cb\u00cc\7\37\2\2\u00cc\u00d0\3\2\2\2"+
		"\u00cd\u00ce\t\3\2\2\u00ce\u00d0\5 \21\t\u00cf\u00bd\3\2\2\2\u00cf\u00bf"+
		"\3\2\2\2\u00cf\u00c0\3\2\2\2\u00cf\u00c1\3\2\2\2\u00cf\u00c2\3\2\2\2\u00cf"+
		"\u00c3\3\2\2\2\u00cf\u00c4\3\2\2\2\u00cf\u00c5\3\2\2\2\u00cf\u00c6\3\2"+
		"\2\2\u00cf\u00c7\3\2\2\2\u00cf\u00c8\3\2\2\2\u00cf\u00c9\3\2\2\2\u00cf"+
		"\u00cd\3\2\2\2\u00d0\u00e8\3\2\2\2\u00d1\u00d2\f\n\2\2\u00d2\u00d3\7\30"+
		"\2\2\u00d3\u00e7\5 \21\13\u00d4\u00d5\f\b\2\2\u00d5\u00d6\t\4\2\2\u00d6"+
		"\u00e7\5 \21\t\u00d7\u00d8\f\7\2\2\u00d8\u00d9\t\5\2\2\u00d9\u00e7\5 "+
		"\21\b\u00da\u00db\f\6\2\2\u00db\u00dc\t\6\2\2\u00dc\u00e7\5 \21\7\u00dd"+
		"\u00de\f\5\2\2\u00de\u00df\t\7\2\2\u00df\u00e7\5 \21\6\u00e0\u00e1\f\4"+
		"\2\2\u00e1\u00e2\7\26\2\2\u00e2\u00e7\5 \21\5\u00e3\u00e4\f\3\2\2\u00e4"+
		"\u00e5\7\27\2\2\u00e5\u00e7\5 \21\4\u00e6\u00d1\3\2\2\2\u00e6\u00d4\3"+
		"\2\2\2\u00e6\u00d7\3\2\2\2\u00e6\u00da\3\2\2\2\u00e6\u00dd\3\2\2\2\u00e6"+
		"\u00e0\3\2\2\2\u00e6\u00e3\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2"+
		"\2\2\u00e8\u00e9\3\2\2\2\u00e9!\3\2\2\2\u00ea\u00e8\3\2\2\2\31$&-\62A"+
		"GNUahp{\u0087\u008c\u0096\u00a6\u00ab\u00af\u00b5\u00bb\u00cf\u00e6\u00e8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}