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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, Number=19, True=20, False=21, Var=22, Null=23, Not=24, Increment=25, 
		Decrement=26, And=27, Or=28, Dot=29, Plus=30, Minus=31, Multiply=32, Divide=33, 
		Modulo=34, LeftParenthesis=35, RightParenthesis=36, LeftBracket=37, RightBracket=38, 
		Greater=39, Less=40, GreaterEqual=41, LessEqual=42, Equal=43, NotEqual=44, 
		AddAss=45, MinusAss=46, MultiplyAss=47, DivideAss=48, String=49, Id=50, 
		WhiteSpaces=51;
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_statement = 2, RULE_loopStmt = 3, 
		RULE_declaration = 4, RULE_funcDeclaration = 5, RULE_varList = 6, RULE_fieldDeclaration = 7, 
		RULE_array = 8, RULE_object = 9, RULE_assignment = 10, RULE_forAssign = 11, 
		RULE_invocation = 12, RULE_paramList = 13, RULE_ifStmt = 14, RULE_forStmt = 15, 
		RULE_whileStmt = 16, RULE_doWhileStmt = 17, RULE_foreachStmt = 18, RULE_retStmt = 19, 
		RULE_breakStmt = 20, RULE_continueStmt = 21, RULE_incrementExpr = 22, 
		RULE_decrementExpr = 23, RULE_expression = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "block", "statement", "loopStmt", "declaration", "funcDeclaration", 
			"varList", "fieldDeclaration", "array", "object", "assignment", "forAssign", 
			"invocation", "paramList", "ifStmt", "forStmt", "whileStmt", "doWhileStmt", 
			"foreachStmt", "retStmt", "breakStmt", "continueStmt", "incrementExpr", 
			"decrementExpr", "expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "';'", "'='", "'function'", "','", "':'", "'if'", 
			"'else if'", "'else'", "'for'", "'while'", "'do'", "'foreach'", "'in'", 
			"'return'", "'break'", "'continue'", null, "'true'", "'false'", "'var'", 
			"'null'", "'!'", "'++'", "'--'", "'&&'", "'||'", "'.'", "'+'", "'-'", 
			"'*'", "'/'", "'%'", "'('", "')'", "'['", "']'", "'>'", "'<'", "'>='", 
			"'<='", "'=='", "'!='", "'+='", "'-='", "'*='", "'/='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "Number", "True", "False", 
			"Var", "Null", "Not", "Increment", "Decrement", "And", "Or", "Dot", "Plus", 
			"Minus", "Multiply", "Divide", "Modulo", "LeftParenthesis", "RightParenthesis", 
			"LeftBracket", "RightBracket", "Greater", "Less", "GreaterEqual", "LessEqual", 
			"Equal", "NotEqual", "AddAss", "MinusAss", "MultiplyAss", "DivideAss", 
			"String", "Id", "WhiteSpaces"
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
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__7) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << Number) | (1L << True) | (1L << False) | (1L << Var) | (1L << Null) | (1L << Not) | (1L << Increment) | (1L << Decrement) | (1L << Plus) | (1L << Minus) | (1L << LeftParenthesis) | (1L << LeftBracket) | (1L << String) | (1L << Id))) != 0)) {
				{
				setState(52);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(50);
					statement();
					}
					break;
				case 2:
					{
					setState(51);
					block();
					}
					break;
				}
				}
				setState(56);
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
			setState(66);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				match(T__0);
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__7) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << Number) | (1L << True) | (1L << False) | (1L << Var) | (1L << Null) | (1L << Not) | (1L << Increment) | (1L << Decrement) | (1L << Plus) | (1L << Minus) | (1L << LeftParenthesis) | (1L << LeftBracket) | (1L << String) | (1L << Id))) != 0)) {
					{
					{
					setState(58);
					statement();
					}
					}
					setState(63);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(64);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
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
		public InvocationContext invocation() {
			return getRuleContext(InvocationContext.class,0);
		}
		public RetStmtContext retStmt() {
			return getRuleContext(RetStmtContext.class,0);
		}
		public BreakStmtContext breakStmt() {
			return getRuleContext(BreakStmtContext.class,0);
		}
		public ContinueStmtContext continueStmt() {
			return getRuleContext(ContinueStmtContext.class,0);
		}
		public LoopStmtContext loopStmt() {
			return getRuleContext(LoopStmtContext.class,0);
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
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				declaration();
				setState(69);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(72);
				ifStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(73);
				incrementExpr();
				setState(74);
				match(T__2);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(76);
				decrementExpr();
				setState(77);
				match(T__2);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(79);
				invocation();
				setState(80);
				match(T__2);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(82);
				retStmt();
				setState(83);
				match(T__2);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(85);
				breakStmt();
				setState(86);
				match(T__2);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(88);
				continueStmt();
				setState(89);
				match(T__2);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(91);
				loopStmt();
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

	public static class LoopStmtContext extends ParserRuleContext {
		public ForStmtContext forStmt() {
			return getRuleContext(ForStmtContext.class,0);
		}
		public WhileStmtContext whileStmt() {
			return getRuleContext(WhileStmtContext.class,0);
		}
		public DoWhileStmtContext doWhileStmt() {
			return getRuleContext(DoWhileStmtContext.class,0);
		}
		public ForeachStmtContext foreachStmt() {
			return getRuleContext(ForeachStmtContext.class,0);
		}
		public LoopStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopStmt; }
	}

	public final LoopStmtContext loopStmt() throws RecognitionException {
		LoopStmtContext _localctx = new LoopStmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_loopStmt);
		try {
			setState(100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				forStmt();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				whileStmt();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 3);
				{
				setState(96);
				doWhileStmt();
				setState(97);
				match(T__2);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 4);
				{
				setState(99);
				foreachStmt();
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
		enterRule(_localctx, 8, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(Var);
			setState(103);
			match(Id);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(104);
				match(T__3);
				setState(105);
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
		enterRule(_localctx, 10, RULE_funcDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(T__4);
			setState(109);
			match(LeftParenthesis);
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Var) {
				{
				setState(110);
				varList();
				}
			}

			setState(113);
			match(RightParenthesis);
			setState(114);
			match(T__0);
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__7) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << Number) | (1L << True) | (1L << False) | (1L << Var) | (1L << Null) | (1L << Not) | (1L << Increment) | (1L << Decrement) | (1L << Plus) | (1L << Minus) | (1L << LeftParenthesis) | (1L << LeftBracket) | (1L << String) | (1L << Id))) != 0)) {
				{
				{
				setState(115);
				statement();
				}
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(121);
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
		enterRule(_localctx, 12, RULE_varList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(Var);
			setState(124);
			match(Id);
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(125);
				match(T__5);
				setState(126);
				match(Var);
				setState(127);
				match(Id);
				}
				}
				setState(132);
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
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_fieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(Id);
			setState(134);
			match(T__6);
			setState(135);
			expression(0);
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

	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode LeftBracket() { return getToken(CalculatorParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(CalculatorParser.RightBracket, 0); }
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(LeftBracket);
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << Number) | (1L << True) | (1L << False) | (1L << Null) | (1L << Not) | (1L << Increment) | (1L << Decrement) | (1L << Plus) | (1L << Minus) | (1L << LeftParenthesis) | (1L << LeftBracket) | (1L << String) | (1L << Id))) != 0)) {
				{
				setState(138);
				paramList();
				}
			}

			setState(141);
			match(RightBracket);
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
		enterRule(_localctx, 18, RULE_object);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(T__0);
			setState(149);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(144);
					fieldDeclaration();
					setState(145);
					match(T__5);
					}
					} 
				}
				setState(151);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(152);
			fieldDeclaration();
			setState(153);
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AddAss() { return getToken(CalculatorParser.AddAss, 0); }
		public TerminalNode MinusAss() { return getToken(CalculatorParser.MinusAss, 0); }
		public TerminalNode MultiplyAss() { return getToken(CalculatorParser.MultiplyAss, 0); }
		public TerminalNode DivideAss() { return getToken(CalculatorParser.DivideAss, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			expression(0);
			setState(156);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << AddAss) | (1L << MinusAss) | (1L << MultiplyAss) | (1L << DivideAss))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(157);
			expression(0);
			setState(158);
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

	public static class ForAssignContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public IncrementExprContext incrementExpr() {
			return getRuleContext(IncrementExprContext.class,0);
		}
		public DecrementExprContext decrementExpr() {
			return getRuleContext(DecrementExprContext.class,0);
		}
		public ForAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forAssign; }
	}

	public final ForAssignContext forAssign() throws RecognitionException {
		ForAssignContext _localctx = new ForAssignContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_forAssign);
		try {
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				incrementExpr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(162);
				decrementExpr();
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
		enterRule(_localctx, 24, RULE_invocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(165);
			match(Id);
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Dot) {
				{
				{
				setState(166);
				match(Dot);
				setState(167);
				match(Id);
				}
				}
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(173);
			match(LeftParenthesis);
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << Number) | (1L << True) | (1L << False) | (1L << Null) | (1L << Not) | (1L << Increment) | (1L << Decrement) | (1L << Plus) | (1L << Minus) | (1L << LeftParenthesis) | (1L << LeftBracket) | (1L << String) | (1L << Id))) != 0)) {
				{
				setState(174);
				paramList();
				}
			}

			setState(177);
			match(RightParenthesis);
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
		enterRule(_localctx, 26, RULE_paramList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			expression(0);
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(180);
				match(T__5);
				setState(181);
				expression(0);
				}
				}
				setState(186);
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
		enterRule(_localctx, 28, RULE_ifStmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(T__7);
			setState(188);
			match(LeftParenthesis);
			setState(189);
			expression(0);
			setState(190);
			match(RightParenthesis);
			setState(191);
			block();
			setState(200);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(192);
					match(T__8);
					setState(193);
					match(LeftParenthesis);
					setState(194);
					expression(0);
					setState(195);
					match(RightParenthesis);
					setState(196);
					block();
					}
					} 
				}
				setState(202);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(203);
				match(T__9);
				setState(204);
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

	public static class ForStmtContext extends ParserRuleContext {
		public TerminalNode LeftParenthesis() { return getToken(CalculatorParser.LeftParenthesis, 0); }
		public TerminalNode RightParenthesis() { return getToken(CalculatorParser.RightParenthesis, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForAssignContext forAssign() {
			return getRuleContext(ForAssignContext.class,0);
		}
		public ForStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStmt; }
	}

	public final ForStmtContext forStmt() throws RecognitionException {
		ForStmtContext _localctx = new ForStmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_forStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(T__10);
			setState(208);
			match(LeftParenthesis);
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Var) {
				{
				setState(209);
				declaration();
				}
			}

			setState(212);
			match(T__2);
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << Number) | (1L << True) | (1L << False) | (1L << Null) | (1L << Not) | (1L << Increment) | (1L << Decrement) | (1L << Plus) | (1L << Minus) | (1L << LeftParenthesis) | (1L << LeftBracket) | (1L << String) | (1L << Id))) != 0)) {
				{
				setState(213);
				expression(0);
				}
			}

			setState(216);
			match(T__2);
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << Number) | (1L << True) | (1L << False) | (1L << Null) | (1L << Not) | (1L << Increment) | (1L << Decrement) | (1L << Plus) | (1L << Minus) | (1L << LeftParenthesis) | (1L << LeftBracket) | (1L << String) | (1L << Id))) != 0)) {
				{
				setState(217);
				forAssign();
				}
			}

			setState(220);
			match(RightParenthesis);
			setState(221);
			block();
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

	public static class WhileStmtContext extends ParserRuleContext {
		public TerminalNode LeftParenthesis() { return getToken(CalculatorParser.LeftParenthesis, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParenthesis() { return getToken(CalculatorParser.RightParenthesis, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStmt; }
	}

	public final WhileStmtContext whileStmt() throws RecognitionException {
		WhileStmtContext _localctx = new WhileStmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_whileStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(T__11);
			setState(224);
			match(LeftParenthesis);
			setState(225);
			expression(0);
			setState(226);
			match(RightParenthesis);
			setState(227);
			block();
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

	public static class DoWhileStmtContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode LeftParenthesis() { return getToken(CalculatorParser.LeftParenthesis, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParenthesis() { return getToken(CalculatorParser.RightParenthesis, 0); }
		public DoWhileStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileStmt; }
	}

	public final DoWhileStmtContext doWhileStmt() throws RecognitionException {
		DoWhileStmtContext _localctx = new DoWhileStmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_doWhileStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(T__12);
			setState(230);
			block();
			setState(231);
			match(T__11);
			setState(232);
			match(LeftParenthesis);
			setState(233);
			expression(0);
			setState(234);
			match(RightParenthesis);
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

	public static class ForeachStmtContext extends ParserRuleContext {
		public TerminalNode LeftParenthesis() { return getToken(CalculatorParser.LeftParenthesis, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParenthesis() { return getToken(CalculatorParser.RightParenthesis, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForeachStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreachStmt; }
	}

	public final ForeachStmtContext foreachStmt() throws RecognitionException {
		ForeachStmtContext _localctx = new ForeachStmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_foreachStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(T__13);
			setState(237);
			match(LeftParenthesis);
			setState(238);
			declaration();
			setState(239);
			match(T__14);
			setState(240);
			expression(0);
			setState(241);
			match(RightParenthesis);
			setState(242);
			block();
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
		enterRule(_localctx, 38, RULE_retStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(T__15);
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << Number) | (1L << True) | (1L << False) | (1L << Null) | (1L << Not) | (1L << Increment) | (1L << Decrement) | (1L << Plus) | (1L << Minus) | (1L << LeftParenthesis) | (1L << LeftBracket) | (1L << String) | (1L << Id))) != 0)) {
				{
				setState(245);
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

	public static class BreakStmtContext extends ParserRuleContext {
		public BreakStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStmt; }
	}

	public final BreakStmtContext breakStmt() throws RecognitionException {
		BreakStmtContext _localctx = new BreakStmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_breakStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(T__16);
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

	public static class ContinueStmtContext extends ParserRuleContext {
		public ContinueStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStmt; }
	}

	public final ContinueStmtContext continueStmt() throws RecognitionException {
		ContinueStmtContext _localctx = new ContinueStmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_continueStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(T__17);
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
		enterRule(_localctx, 44, RULE_incrementExpr);
		try {
			setState(256);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Increment:
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				match(Increment);
				setState(253);
				match(Id);
				}
				break;
			case Id:
				enterOuterAlt(_localctx, 2);
				{
				setState(254);
				match(Id);
				setState(255);
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
		enterRule(_localctx, 46, RULE_decrementExpr);
		try {
			setState(262);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Decrement:
				enterOuterAlt(_localctx, 1);
				{
				setState(258);
				match(Decrement);
				setState(259);
				match(Id);
				}
				break;
			case Id:
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
				match(Id);
				setState(261);
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
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
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
		public TerminalNode LeftBracket() { return getToken(CalculatorParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(CalculatorParser.RightBracket, 0); }
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
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(265);
				match(Number);
				}
				break;
			case 2:
				{
				setState(266);
				match(False);
				}
				break;
			case 3:
				{
				setState(267);
				match(True);
				}
				break;
			case 4:
				{
				setState(268);
				match(Id);
				}
				break;
			case 5:
				{
				setState(269);
				match(String);
				}
				break;
			case 6:
				{
				setState(270);
				match(Null);
				}
				break;
			case 7:
				{
				setState(271);
				funcDeclaration();
				}
				break;
			case 8:
				{
				setState(272);
				object();
				}
				break;
			case 9:
				{
				setState(273);
				array();
				}
				break;
			case 10:
				{
				setState(274);
				incrementExpr();
				}
				break;
			case 11:
				{
				setState(275);
				decrementExpr();
				}
				break;
			case 12:
				{
				setState(276);
				invocation();
				}
				break;
			case 13:
				{
				setState(277);
				match(LeftParenthesis);
				setState(278);
				expression(0);
				setState(279);
				match(RightParenthesis);
				}
				break;
			case 14:
				{
				setState(281);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Not) | (1L << Plus) | (1L << Minus))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(282);
				expression(7);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(313);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(311);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(285);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(286);
						match(Dot);
						setState(287);
						expression(10);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(288);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(289);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Multiply) | (1L << Divide) | (1L << Modulo))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(290);
						expression(7);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(291);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(292);
						_la = _input.LA(1);
						if ( !(_la==Plus || _la==Minus) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(293);
						expression(6);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(294);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(295);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Greater) | (1L << Less) | (1L << GreaterEqual) | (1L << LessEqual))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(296);
						expression(5);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(297);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(298);
						_la = _input.LA(1);
						if ( !(_la==Equal || _la==NotEqual) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(299);
						expression(4);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(300);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(301);
						match(And);
						setState(302);
						expression(3);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(303);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(304);
						match(Or);
						setState(305);
						expression(2);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(306);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(307);
						match(LeftBracket);
						setState(308);
						expression(0);
						setState(309);
						match(RightBracket);
						}
						break;
					}
					} 
				}
				setState(315);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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
		case 24:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
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
		case 7:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\65\u013f\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\7\2\67\n\2\f\2\16\2:\13\2\3\3\3\3\7\3>\n\3\f\3\16\3"+
		"A\13\3\3\3\3\3\5\3E\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4_\n\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\5\5g\n\5\3\6\3\6\3\6\3\6\5\6m\n\6\3\7\3\7\3\7\5\7r\n\7"+
		"\3\7\3\7\3\7\7\7w\n\7\f\7\16\7z\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\7\b\u0083"+
		"\n\b\f\b\16\b\u0086\13\b\3\t\3\t\3\t\3\t\3\n\3\n\5\n\u008e\n\n\3\n\3\n"+
		"\3\13\3\13\3\13\3\13\7\13\u0096\n\13\f\13\16\13\u0099\13\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\5\r\u00a6\n\r\3\16\3\16\3\16\7\16"+
		"\u00ab\n\16\f\16\16\16\u00ae\13\16\3\16\3\16\5\16\u00b2\n\16\3\16\3\16"+
		"\3\17\3\17\3\17\7\17\u00b9\n\17\f\17\16\17\u00bc\13\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00c9\n\20\f\20\16\20\u00cc"+
		"\13\20\3\20\3\20\5\20\u00d0\n\20\3\21\3\21\3\21\5\21\u00d5\n\21\3\21\3"+
		"\21\5\21\u00d9\n\21\3\21\3\21\5\21\u00dd\n\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\25\3\25\5\25\u00f9\n\25\3\26\3\26\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\5\30\u0103\n\30\3\31\3\31\3\31\3\31\5\31\u0109\n"+
		"\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\5\32\u011e\n\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u013a\n\32\f\32\16\32\u013d\13"+
		"\32\3\32\2\3\62\33\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\2\b\4\2\6\6/\62\4\2\32\32 !\3\2\"$\3\2 !\3\2),\3\2-.\2\u015d\28\3"+
		"\2\2\2\4D\3\2\2\2\6^\3\2\2\2\bf\3\2\2\2\nh\3\2\2\2\fn\3\2\2\2\16}\3\2"+
		"\2\2\20\u0087\3\2\2\2\22\u008b\3\2\2\2\24\u0091\3\2\2\2\26\u009d\3\2\2"+
		"\2\30\u00a5\3\2\2\2\32\u00a7\3\2\2\2\34\u00b5\3\2\2\2\36\u00bd\3\2\2\2"+
		" \u00d1\3\2\2\2\"\u00e1\3\2\2\2$\u00e7\3\2\2\2&\u00ee\3\2\2\2(\u00f6\3"+
		"\2\2\2*\u00fa\3\2\2\2,\u00fc\3\2\2\2.\u0102\3\2\2\2\60\u0108\3\2\2\2\62"+
		"\u011d\3\2\2\2\64\67\5\6\4\2\65\67\5\4\3\2\66\64\3\2\2\2\66\65\3\2\2\2"+
		"\67:\3\2\2\28\66\3\2\2\289\3\2\2\29\3\3\2\2\2:8\3\2\2\2;?\7\3\2\2<>\5"+
		"\6\4\2=<\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@B\3\2\2\2A?\3\2\2\2BE\7"+
		"\4\2\2CE\5\6\4\2D;\3\2\2\2DC\3\2\2\2E\5\3\2\2\2FG\5\n\6\2GH\7\5\2\2H_"+
		"\3\2\2\2I_\5\26\f\2J_\5\36\20\2KL\5.\30\2LM\7\5\2\2M_\3\2\2\2NO\5\60\31"+
		"\2OP\7\5\2\2P_\3\2\2\2QR\5\32\16\2RS\7\5\2\2S_\3\2\2\2TU\5(\25\2UV\7\5"+
		"\2\2V_\3\2\2\2WX\5*\26\2XY\7\5\2\2Y_\3\2\2\2Z[\5,\27\2[\\\7\5\2\2\\_\3"+
		"\2\2\2]_\5\b\5\2^F\3\2\2\2^I\3\2\2\2^J\3\2\2\2^K\3\2\2\2^N\3\2\2\2^Q\3"+
		"\2\2\2^T\3\2\2\2^W\3\2\2\2^Z\3\2\2\2^]\3\2\2\2_\7\3\2\2\2`g\5 \21\2ag"+
		"\5\"\22\2bc\5$\23\2cd\7\5\2\2dg\3\2\2\2eg\5&\24\2f`\3\2\2\2fa\3\2\2\2"+
		"fb\3\2\2\2fe\3\2\2\2g\t\3\2\2\2hi\7\30\2\2il\7\64\2\2jk\7\6\2\2km\5\62"+
		"\32\2lj\3\2\2\2lm\3\2\2\2m\13\3\2\2\2no\7\7\2\2oq\7%\2\2pr\5\16\b\2qp"+
		"\3\2\2\2qr\3\2\2\2rs\3\2\2\2st\7&\2\2tx\7\3\2\2uw\5\6\4\2vu\3\2\2\2wz"+
		"\3\2\2\2xv\3\2\2\2xy\3\2\2\2y{\3\2\2\2zx\3\2\2\2{|\7\4\2\2|\r\3\2\2\2"+
		"}~\7\30\2\2~\u0084\7\64\2\2\177\u0080\7\b\2\2\u0080\u0081\7\30\2\2\u0081"+
		"\u0083\7\64\2\2\u0082\177\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2"+
		"\2\2\u0084\u0085\3\2\2\2\u0085\17\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0088"+
		"\7\64\2\2\u0088\u0089\7\t\2\2\u0089\u008a\5\62\32\2\u008a\21\3\2\2\2\u008b"+
		"\u008d\7\'\2\2\u008c\u008e\5\34\17\2\u008d\u008c\3\2\2\2\u008d\u008e\3"+
		"\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\7(\2\2\u0090\23\3\2\2\2\u0091\u0097"+
		"\7\3\2\2\u0092\u0093\5\20\t\2\u0093\u0094\7\b\2\2\u0094\u0096\3\2\2\2"+
		"\u0095\u0092\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098"+
		"\3\2\2\2\u0098\u009a\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u009b\5\20\t\2"+
		"\u009b\u009c\7\4\2\2\u009c\25\3\2\2\2\u009d\u009e\5\62\32\2\u009e\u009f"+
		"\t\2\2\2\u009f\u00a0\5\62\32\2\u00a0\u00a1\7\5\2\2\u00a1\27\3\2\2\2\u00a2"+
		"\u00a6\5\26\f\2\u00a3\u00a6\5.\30\2\u00a4\u00a6\5\60\31\2\u00a5\u00a2"+
		"\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a4\3\2\2\2\u00a6\31\3\2\2\2\u00a7"+
		"\u00ac\7\64\2\2\u00a8\u00a9\7\37\2\2\u00a9\u00ab\7\64\2\2\u00aa\u00a8"+
		"\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad"+
		"\u00af\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b1\7%\2\2\u00b0\u00b2\5\34"+
		"\17\2\u00b1\u00b0\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3"+
		"\u00b4\7&\2\2\u00b4\33\3\2\2\2\u00b5\u00ba\5\62\32\2\u00b6\u00b7\7\b\2"+
		"\2\u00b7\u00b9\5\62\32\2\u00b8\u00b6\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba"+
		"\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\35\3\2\2\2\u00bc\u00ba\3\2\2"+
		"\2\u00bd\u00be\7\n\2\2\u00be\u00bf\7%\2\2\u00bf\u00c0\5\62\32\2\u00c0"+
		"\u00c1\7&\2\2\u00c1\u00ca\5\4\3\2\u00c2\u00c3\7\13\2\2\u00c3\u00c4\7%"+
		"\2\2\u00c4\u00c5\5\62\32\2\u00c5\u00c6\7&\2\2\u00c6\u00c7\5\4\3\2\u00c7"+
		"\u00c9\3\2\2\2\u00c8\u00c2\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2"+
		"\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cf\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd"+
		"\u00ce\7\f\2\2\u00ce\u00d0\5\4\3\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2"+
		"\2\2\u00d0\37\3\2\2\2\u00d1\u00d2\7\r\2\2\u00d2\u00d4\7%\2\2\u00d3\u00d5"+
		"\5\n\6\2\u00d4\u00d3\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6"+
		"\u00d8\7\5\2\2\u00d7\u00d9\5\62\32\2\u00d8\u00d7\3\2\2\2\u00d8\u00d9\3"+
		"\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00dc\7\5\2\2\u00db\u00dd\5\30\r\2\u00dc"+
		"\u00db\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\7&"+
		"\2\2\u00df\u00e0\5\4\3\2\u00e0!\3\2\2\2\u00e1\u00e2\7\16\2\2\u00e2\u00e3"+
		"\7%\2\2\u00e3\u00e4\5\62\32\2\u00e4\u00e5\7&\2\2\u00e5\u00e6\5\4\3\2\u00e6"+
		"#\3\2\2\2\u00e7\u00e8\7\17\2\2\u00e8\u00e9\5\4\3\2\u00e9\u00ea\7\16\2"+
		"\2\u00ea\u00eb\7%\2\2\u00eb\u00ec\5\62\32\2\u00ec\u00ed\7&\2\2\u00ed%"+
		"\3\2\2\2\u00ee\u00ef\7\20\2\2\u00ef\u00f0\7%\2\2\u00f0\u00f1\5\n\6\2\u00f1"+
		"\u00f2\7\21\2\2\u00f2\u00f3\5\62\32\2\u00f3\u00f4\7&\2\2\u00f4\u00f5\5"+
		"\4\3\2\u00f5\'\3\2\2\2\u00f6\u00f8\7\22\2\2\u00f7\u00f9\5\62\32\2\u00f8"+
		"\u00f7\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9)\3\2\2\2\u00fa\u00fb\7\23\2\2"+
		"\u00fb+\3\2\2\2\u00fc\u00fd\7\24\2\2\u00fd-\3\2\2\2\u00fe\u00ff\7\33\2"+
		"\2\u00ff\u0103\7\64\2\2\u0100\u0101\7\64\2\2\u0101\u0103\7\33\2\2\u0102"+
		"\u00fe\3\2\2\2\u0102\u0100\3\2\2\2\u0103/\3\2\2\2\u0104\u0105\7\34\2\2"+
		"\u0105\u0109\7\64\2\2\u0106\u0107\7\64\2\2\u0107\u0109\7\34\2\2\u0108"+
		"\u0104\3\2\2\2\u0108\u0106\3\2\2\2\u0109\61\3\2\2\2\u010a\u010b\b\32\1"+
		"\2\u010b\u011e\7\25\2\2\u010c\u011e\7\27\2\2\u010d\u011e\7\26\2\2\u010e"+
		"\u011e\7\64\2\2\u010f\u011e\7\63\2\2\u0110\u011e\7\31\2\2\u0111\u011e"+
		"\5\f\7\2\u0112\u011e\5\24\13\2\u0113\u011e\5\22\n\2\u0114\u011e\5.\30"+
		"\2\u0115\u011e\5\60\31\2\u0116\u011e\5\32\16\2\u0117\u0118\7%\2\2\u0118"+
		"\u0119\5\62\32\2\u0119\u011a\7&\2\2\u011a\u011e\3\2\2\2\u011b\u011c\t"+
		"\3\2\2\u011c\u011e\5\62\32\t\u011d\u010a\3\2\2\2\u011d\u010c\3\2\2\2\u011d"+
		"\u010d\3\2\2\2\u011d\u010e\3\2\2\2\u011d\u010f\3\2\2\2\u011d\u0110\3\2"+
		"\2\2\u011d\u0111\3\2\2\2\u011d\u0112\3\2\2\2\u011d\u0113\3\2\2\2\u011d"+
		"\u0114\3\2\2\2\u011d\u0115\3\2\2\2\u011d\u0116\3\2\2\2\u011d\u0117\3\2"+
		"\2\2\u011d\u011b\3\2\2\2\u011e\u013b\3\2\2\2\u011f\u0120\f\13\2\2\u0120"+
		"\u0121\7\37\2\2\u0121\u013a\5\62\32\f\u0122\u0123\f\b\2\2\u0123\u0124"+
		"\t\4\2\2\u0124\u013a\5\62\32\t\u0125\u0126\f\7\2\2\u0126\u0127\t\5\2\2"+
		"\u0127\u013a\5\62\32\b\u0128\u0129\f\6\2\2\u0129\u012a\t\6\2\2\u012a\u013a"+
		"\5\62\32\7\u012b\u012c\f\5\2\2\u012c\u012d\t\7\2\2\u012d\u013a\5\62\32"+
		"\6\u012e\u012f\f\4\2\2\u012f\u0130\7\35\2\2\u0130\u013a\5\62\32\5\u0131"+
		"\u0132\f\3\2\2\u0132\u0133\7\36\2\2\u0133\u013a\5\62\32\4\u0134\u0135"+
		"\f\n\2\2\u0135\u0136\7\'\2\2\u0136\u0137\5\62\32\2\u0137\u0138\7(\2\2"+
		"\u0138\u013a\3\2\2\2\u0139\u011f\3\2\2\2\u0139\u0122\3\2\2\2\u0139\u0125"+
		"\3\2\2\2\u0139\u0128\3\2\2\2\u0139\u012b\3\2\2\2\u0139\u012e\3\2\2\2\u0139"+
		"\u0131\3\2\2\2\u0139\u0134\3\2\2\2\u013a\u013d\3\2\2\2\u013b\u0139\3\2"+
		"\2\2\u013b\u013c\3\2\2\2\u013c\63\3\2\2\2\u013d\u013b\3\2\2\2\35\668?"+
		"D^flqx\u0084\u008d\u0097\u00a5\u00ac\u00b1\u00ba\u00ca\u00cf\u00d4\u00d8"+
		"\u00dc\u00f8\u0102\u0108\u011d\u0139\u013b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}