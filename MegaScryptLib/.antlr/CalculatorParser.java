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
		T__17=18, T__18=19, Number=20, True=21, False=22, Var=23, Null=24, Not=25, 
		Increment=26, Decrement=27, And=28, Or=29, Dot=30, Plus=31, Minus=32, 
		Multiply=33, Divide=34, Modulo=35, LeftParenthesis=36, RightParenthesis=37, 
		LeftBracket=38, RightBracket=39, Greater=40, Less=41, GreaterEqual=42, 
		LessEqual=43, Equal=44, NotEqual=45, AddAss=46, MinusAss=47, MultiplyAss=48, 
		DivideAss=49, String=50, Id=51, WhiteSpaces=52;
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_statement = 2, RULE_commentStmt = 3, 
		RULE_loopStmt = 4, RULE_declaration = 5, RULE_funcDeclaration = 6, RULE_varList = 7, 
		RULE_fieldDeclaration = 8, RULE_array = 9, RULE_object = 10, RULE_assignment = 11, 
		RULE_forAssign = 12, RULE_paramList = 13, RULE_ifStmt = 14, RULE_forStmt = 15, 
		RULE_whileStmt = 16, RULE_doWhileStmt = 17, RULE_foreachStmt = 18, RULE_retStmt = 19, 
		RULE_breakStmt = 20, RULE_continueStmt = 21, RULE_incrementExpr = 22, 
		RULE_decrementExpr = 23, RULE_expression = 24, RULE_invocation = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "block", "statement", "commentStmt", "loopStmt", "declaration", 
			"funcDeclaration", "varList", "fieldDeclaration", "array", "object", 
			"assignment", "forAssign", "paramList", "ifStmt", "forStmt", "whileStmt", 
			"doWhileStmt", "foreachStmt", "retStmt", "breakStmt", "continueStmt", 
			"incrementExpr", "decrementExpr", "expression", "invocation"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "';'", "'//'", "'='", "'function'", "','", "':'", 
			"'if'", "'else if'", "'else'", "'for'", "'while'", "'do'", "'foreach'", 
			"'in'", "'return'", "'break'", "'continue'", null, "'true'", "'false'", 
			"'var'", "'null'", "'!'", "'++'", "'--'", "'&&'", "'||'", "'.'", "'+'", 
			"'-'", "'*'", "'/'", "'%'", "'('", "')'", "'['", "']'", "'>'", "'<'", 
			"'>='", "'<='", "'=='", "'!='", "'+='", "'-='", "'*='", "'/='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "Number", "True", "False", 
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
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__5) | (1L << T__8) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << Number) | (1L << True) | (1L << False) | (1L << Var) | (1L << Null) | (1L << Not) | (1L << Increment) | (1L << Decrement) | (1L << Plus) | (1L << Minus) | (1L << LeftParenthesis) | (1L << LeftBracket) | (1L << String) | (1L << Id))) != 0)) {
				{
				setState(54);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(52);
					statement();
					}
					break;
				case 2:
					{
					setState(53);
					block();
					}
					break;
				}
				}
				setState(58);
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
			setState(68);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				match(T__0);
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__5) | (1L << T__8) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << Number) | (1L << True) | (1L << False) | (1L << Var) | (1L << Null) | (1L << Not) | (1L << Increment) | (1L << Decrement) | (1L << Plus) | (1L << Minus) | (1L << LeftParenthesis) | (1L << LeftBracket) | (1L << String) | (1L << Id))) != 0)) {
					{
					{
					setState(60);
					statement();
					}
					}
					setState(65);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(66);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
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
		public CommentStmtContext commentStmt() {
			return getRuleContext(CommentStmtContext.class,0);
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
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				declaration();
				setState(71);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
				ifStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(75);
				incrementExpr();
				setState(76);
				match(T__2);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(78);
				decrementExpr();
				setState(79);
				match(T__2);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(81);
				invocation();
				setState(82);
				match(T__2);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(84);
				retStmt();
				setState(85);
				match(T__2);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(87);
				breakStmt();
				setState(88);
				match(T__2);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(90);
				continueStmt();
				setState(91);
				match(T__2);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(93);
				loopStmt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(94);
				commentStmt();
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

	public static class CommentStmtContext extends ParserRuleContext {
		public CommentStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commentStmt; }
	}

	public final CommentStmtContext commentStmt() throws RecognitionException {
		CommentStmtContext _localctx = new CommentStmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_commentStmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(T__3);
			setState(101);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(98);
					matchWildcard();
					}
					} 
				}
				setState(103);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
		enterRule(_localctx, 8, RULE_loopStmt);
		try {
			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				forStmt();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				whileStmt();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 3);
				{
				setState(106);
				doWhileStmt();
				setState(107);
				match(T__2);
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 4);
				{
				setState(109);
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
		enterRule(_localctx, 10, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(Var);
			setState(113);
			match(Id);
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(114);
				match(T__4);
				setState(115);
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
		enterRule(_localctx, 12, RULE_funcDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(T__5);
			setState(119);
			match(LeftParenthesis);
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Var) {
				{
				setState(120);
				varList();
				}
			}

			setState(123);
			match(RightParenthesis);
			setState(124);
			match(T__0);
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__5) | (1L << T__8) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << Number) | (1L << True) | (1L << False) | (1L << Var) | (1L << Null) | (1L << Not) | (1L << Increment) | (1L << Decrement) | (1L << Plus) | (1L << Minus) | (1L << LeftParenthesis) | (1L << LeftBracket) | (1L << String) | (1L << Id))) != 0)) {
				{
				{
				setState(125);
				statement();
				}
				}
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(131);
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
		enterRule(_localctx, 14, RULE_varList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(Var);
			setState(134);
			match(Id);
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(135);
				match(T__6);
				setState(136);
				match(Var);
				setState(137);
				match(Id);
				}
				}
				setState(142);
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
		enterRule(_localctx, 16, RULE_fieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(Id);
			setState(144);
			match(T__7);
			setState(145);
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
		enterRule(_localctx, 18, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(LeftBracket);
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__5) | (1L << Number) | (1L << True) | (1L << False) | (1L << Null) | (1L << Not) | (1L << Increment) | (1L << Decrement) | (1L << Plus) | (1L << Minus) | (1L << LeftParenthesis) | (1L << LeftBracket) | (1L << String) | (1L << Id))) != 0)) {
				{
				setState(148);
				paramList();
				}
			}

			setState(151);
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
		enterRule(_localctx, 20, RULE_object);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(T__0);
			setState(159);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(154);
					fieldDeclaration();
					setState(155);
					match(T__6);
					}
					} 
				}
				setState(161);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(162);
			fieldDeclaration();
			setState(163);
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
		enterRule(_localctx, 22, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			expression(0);
			setState(166);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << AddAss) | (1L << MinusAss) | (1L << MultiplyAss) | (1L << DivideAss))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(167);
			expression(0);
			setState(168);
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
		enterRule(_localctx, 24, RULE_forAssign);
		try {
			setState(173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				incrementExpr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(172);
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
			setState(175);
			expression(0);
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(176);
				match(T__6);
				setState(177);
				expression(0);
				}
				}
				setState(182);
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
			setState(183);
			match(T__8);
			setState(184);
			match(LeftParenthesis);
			setState(185);
			expression(0);
			setState(186);
			match(RightParenthesis);
			setState(187);
			block();
			setState(196);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(188);
					match(T__9);
					setState(189);
					match(LeftParenthesis);
					setState(190);
					expression(0);
					setState(191);
					match(RightParenthesis);
					setState(192);
					block();
					}
					} 
				}
				setState(198);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			setState(201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(199);
				match(T__10);
				setState(200);
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
			setState(203);
			match(T__11);
			setState(204);
			match(LeftParenthesis);
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Var) {
				{
				setState(205);
				declaration();
				}
			}

			setState(208);
			match(T__2);
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__5) | (1L << Number) | (1L << True) | (1L << False) | (1L << Null) | (1L << Not) | (1L << Increment) | (1L << Decrement) | (1L << Plus) | (1L << Minus) | (1L << LeftParenthesis) | (1L << LeftBracket) | (1L << String) | (1L << Id))) != 0)) {
				{
				setState(209);
				expression(0);
				}
			}

			setState(212);
			match(T__2);
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__5) | (1L << Number) | (1L << True) | (1L << False) | (1L << Null) | (1L << Not) | (1L << Increment) | (1L << Decrement) | (1L << Plus) | (1L << Minus) | (1L << LeftParenthesis) | (1L << LeftBracket) | (1L << String) | (1L << Id))) != 0)) {
				{
				setState(213);
				forAssign();
				}
			}

			setState(216);
			match(RightParenthesis);
			setState(217);
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
			setState(219);
			match(T__12);
			setState(220);
			match(LeftParenthesis);
			setState(221);
			expression(0);
			setState(222);
			match(RightParenthesis);
			setState(223);
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
			setState(225);
			match(T__13);
			setState(226);
			block();
			setState(227);
			match(T__12);
			setState(228);
			match(LeftParenthesis);
			setState(229);
			expression(0);
			setState(230);
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
			setState(232);
			match(T__14);
			setState(233);
			match(LeftParenthesis);
			setState(234);
			declaration();
			setState(235);
			match(T__15);
			setState(236);
			expression(0);
			setState(237);
			match(RightParenthesis);
			setState(238);
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
			setState(240);
			match(T__16);
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__5) | (1L << Number) | (1L << True) | (1L << False) | (1L << Null) | (1L << Not) | (1L << Increment) | (1L << Decrement) | (1L << Plus) | (1L << Minus) | (1L << LeftParenthesis) | (1L << LeftBracket) | (1L << String) | (1L << Id))) != 0)) {
				{
				setState(241);
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
			setState(244);
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
			setState(246);
			match(T__18);
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
			setState(252);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Increment:
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				match(Increment);
				setState(249);
				match(Id);
				}
				break;
			case Id:
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				match(Id);
				setState(251);
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
			setState(258);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Decrement:
				enterOuterAlt(_localctx, 1);
				{
				setState(254);
				match(Decrement);
				setState(255);
				match(Id);
				}
				break;
			case Id:
				enterOuterAlt(_localctx, 2);
				{
				setState(256);
				match(Id);
				setState(257);
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
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
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
			setState(278);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(261);
				match(Number);
				}
				break;
			case 2:
				{
				setState(262);
				match(False);
				}
				break;
			case 3:
				{
				setState(263);
				match(True);
				}
				break;
			case 4:
				{
				setState(264);
				match(Id);
				}
				break;
			case 5:
				{
				setState(265);
				match(String);
				}
				break;
			case 6:
				{
				setState(266);
				match(Null);
				}
				break;
			case 7:
				{
				setState(267);
				funcDeclaration();
				}
				break;
			case 8:
				{
				setState(268);
				object();
				}
				break;
			case 9:
				{
				setState(269);
				array();
				}
				break;
			case 10:
				{
				setState(270);
				incrementExpr();
				}
				break;
			case 11:
				{
				setState(271);
				decrementExpr();
				}
				break;
			case 12:
				{
				setState(272);
				match(LeftParenthesis);
				setState(273);
				expression(0);
				setState(274);
				match(RightParenthesis);
				}
				break;
			case 13:
				{
				setState(276);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Not) | (1L << Plus) | (1L << Minus))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(277);
				expression(7);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(314);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(312);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(280);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(281);
						match(Dot);
						setState(282);
						expression(11);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(283);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(284);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Multiply) | (1L << Divide) | (1L << Modulo))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(285);
						expression(7);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(286);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(287);
						_la = _input.LA(1);
						if ( !(_la==Plus || _la==Minus) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(288);
						expression(6);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(289);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(290);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Greater) | (1L << Less) | (1L << GreaterEqual) | (1L << LessEqual))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(291);
						expression(5);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(292);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(293);
						_la = _input.LA(1);
						if ( !(_la==Equal || _la==NotEqual) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(294);
						expression(4);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(295);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(296);
						match(And);
						setState(297);
						expression(3);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(298);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(299);
						match(Or);
						setState(300);
						expression(2);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(301);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(302);
						match(LeftParenthesis);
						setState(304);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__5) | (1L << Number) | (1L << True) | (1L << False) | (1L << Null) | (1L << Not) | (1L << Increment) | (1L << Decrement) | (1L << Plus) | (1L << Minus) | (1L << LeftParenthesis) | (1L << LeftBracket) | (1L << String) | (1L << Id))) != 0)) {
							{
							setState(303);
							paramList();
							}
						}

						setState(306);
						match(RightParenthesis);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(307);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(308);
						match(LeftBracket);
						setState(309);
						expression(0);
						setState(310);
						match(RightBracket);
						}
						break;
					}
					} 
				}
				setState(316);
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

	public static class InvocationContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LeftParenthesis() { return getToken(CalculatorParser.LeftParenthesis, 0); }
		public TerminalNode RightParenthesis() { return getToken(CalculatorParser.RightParenthesis, 0); }
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public InvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invocation; }
	}

	public final InvocationContext invocation() throws RecognitionException {
		InvocationContext _localctx = new InvocationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_invocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			expression(0);
			setState(318);
			match(LeftParenthesis);
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__5) | (1L << Number) | (1L << True) | (1L << False) | (1L << Null) | (1L << Not) | (1L << Increment) | (1L << Decrement) | (1L << Plus) | (1L << Minus) | (1L << LeftParenthesis) | (1L << LeftBracket) | (1L << String) | (1L << Id))) != 0)) {
				{
				setState(319);
				paramList();
				}
			}

			setState(322);
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
			return precpred(_ctx, 10);
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
			return precpred(_ctx, 9);
		case 8:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\66\u0147\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\7\29\n\2\f\2\16\2<\13\2\3\3\3\3\7\3@\n\3"+
		"\f\3\16\3C\13\3\3\3\3\3\5\3G\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4b\n"+
		"\4\3\5\3\5\7\5f\n\5\f\5\16\5i\13\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6q\n\6\3"+
		"\7\3\7\3\7\3\7\5\7w\n\7\3\b\3\b\3\b\5\b|\n\b\3\b\3\b\3\b\7\b\u0081\n\b"+
		"\f\b\16\b\u0084\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\7\t\u008d\n\t\f\t\16"+
		"\t\u0090\13\t\3\n\3\n\3\n\3\n\3\13\3\13\5\13\u0098\n\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\7\f\u00a0\n\f\f\f\16\f\u00a3\13\f\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\5\16\u00b0\n\16\3\17\3\17\3\17\7\17\u00b5\n\17"+
		"\f\17\16\17\u00b8\13\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\7\20\u00c5\n\20\f\20\16\20\u00c8\13\20\3\20\3\20\5\20\u00cc\n"+
		"\20\3\21\3\21\3\21\5\21\u00d1\n\21\3\21\3\21\5\21\u00d5\n\21\3\21\3\21"+
		"\5\21\u00d9\n\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\5\25\u00f5\n\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\5\30\u00ff"+
		"\n\30\3\31\3\31\3\31\3\31\5\31\u0105\n\31\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0119"+
		"\n\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0133\n\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u013b\n\32\f\32\16\32\u013e\13\32"+
		"\3\33\3\33\3\33\5\33\u0143\n\33\3\33\3\33\3\33\3g\3\62\34\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\2\b\4\2\7\7\60\63\4\2\33"+
		"\33!\"\3\2#%\3\2!\"\3\2*-\3\2./\2\u0166\2:\3\2\2\2\4F\3\2\2\2\6a\3\2\2"+
		"\2\bc\3\2\2\2\np\3\2\2\2\fr\3\2\2\2\16x\3\2\2\2\20\u0087\3\2\2\2\22\u0091"+
		"\3\2\2\2\24\u0095\3\2\2\2\26\u009b\3\2\2\2\30\u00a7\3\2\2\2\32\u00af\3"+
		"\2\2\2\34\u00b1\3\2\2\2\36\u00b9\3\2\2\2 \u00cd\3\2\2\2\"\u00dd\3\2\2"+
		"\2$\u00e3\3\2\2\2&\u00ea\3\2\2\2(\u00f2\3\2\2\2*\u00f6\3\2\2\2,\u00f8"+
		"\3\2\2\2.\u00fe\3\2\2\2\60\u0104\3\2\2\2\62\u0118\3\2\2\2\64\u013f\3\2"+
		"\2\2\669\5\6\4\2\679\5\4\3\28\66\3\2\2\28\67\3\2\2\29<\3\2\2\2:8\3\2\2"+
		"\2:;\3\2\2\2;\3\3\2\2\2<:\3\2\2\2=A\7\3\2\2>@\5\6\4\2?>\3\2\2\2@C\3\2"+
		"\2\2A?\3\2\2\2AB\3\2\2\2BD\3\2\2\2CA\3\2\2\2DG\7\4\2\2EG\5\6\4\2F=\3\2"+
		"\2\2FE\3\2\2\2G\5\3\2\2\2HI\5\f\7\2IJ\7\5\2\2Jb\3\2\2\2Kb\5\30\r\2Lb\5"+
		"\36\20\2MN\5.\30\2NO\7\5\2\2Ob\3\2\2\2PQ\5\60\31\2QR\7\5\2\2Rb\3\2\2\2"+
		"ST\5\64\33\2TU\7\5\2\2Ub\3\2\2\2VW\5(\25\2WX\7\5\2\2Xb\3\2\2\2YZ\5*\26"+
		"\2Z[\7\5\2\2[b\3\2\2\2\\]\5,\27\2]^\7\5\2\2^b\3\2\2\2_b\5\n\6\2`b\5\b"+
		"\5\2aH\3\2\2\2aK\3\2\2\2aL\3\2\2\2aM\3\2\2\2aP\3\2\2\2aS\3\2\2\2aV\3\2"+
		"\2\2aY\3\2\2\2a\\\3\2\2\2a_\3\2\2\2a`\3\2\2\2b\7\3\2\2\2cg\7\6\2\2df\13"+
		"\2\2\2ed\3\2\2\2fi\3\2\2\2gh\3\2\2\2ge\3\2\2\2h\t\3\2\2\2ig\3\2\2\2jq"+
		"\5 \21\2kq\5\"\22\2lm\5$\23\2mn\7\5\2\2nq\3\2\2\2oq\5&\24\2pj\3\2\2\2"+
		"pk\3\2\2\2pl\3\2\2\2po\3\2\2\2q\13\3\2\2\2rs\7\31\2\2sv\7\65\2\2tu\7\7"+
		"\2\2uw\5\62\32\2vt\3\2\2\2vw\3\2\2\2w\r\3\2\2\2xy\7\b\2\2y{\7&\2\2z|\5"+
		"\20\t\2{z\3\2\2\2{|\3\2\2\2|}\3\2\2\2}~\7\'\2\2~\u0082\7\3\2\2\177\u0081"+
		"\5\6\4\2\u0080\177\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082"+
		"\u0083\3\2\2\2\u0083\u0085\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0086\7\4"+
		"\2\2\u0086\17\3\2\2\2\u0087\u0088\7\31\2\2\u0088\u008e\7\65\2\2\u0089"+
		"\u008a\7\t\2\2\u008a\u008b\7\31\2\2\u008b\u008d\7\65\2\2\u008c\u0089\3"+
		"\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\21\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0092\7\65\2\2\u0092\u0093\7\n\2"+
		"\2\u0093\u0094\5\62\32\2\u0094\23\3\2\2\2\u0095\u0097\7(\2\2\u0096\u0098"+
		"\5\34\17\2\u0097\u0096\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\3\2\2\2"+
		"\u0099\u009a\7)\2\2\u009a\25\3\2\2\2\u009b\u00a1\7\3\2\2\u009c\u009d\5"+
		"\22\n\2\u009d\u009e\7\t\2\2\u009e\u00a0\3\2\2\2\u009f\u009c\3\2\2\2\u00a0"+
		"\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a4\3\2"+
		"\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a5\5\22\n\2\u00a5\u00a6\7\4\2\2\u00a6"+
		"\27\3\2\2\2\u00a7\u00a8\5\62\32\2\u00a8\u00a9\t\2\2\2\u00a9\u00aa\5\62"+
		"\32\2\u00aa\u00ab\7\5\2\2\u00ab\31\3\2\2\2\u00ac\u00b0\5\30\r\2\u00ad"+
		"\u00b0\5.\30\2\u00ae\u00b0\5\60\31\2\u00af\u00ac\3\2\2\2\u00af\u00ad\3"+
		"\2\2\2\u00af\u00ae\3\2\2\2\u00b0\33\3\2\2\2\u00b1\u00b6\5\62\32\2\u00b2"+
		"\u00b3\7\t\2\2\u00b3\u00b5\5\62\32\2\u00b4\u00b2\3\2\2\2\u00b5\u00b8\3"+
		"\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\35\3\2\2\2\u00b8"+
		"\u00b6\3\2\2\2\u00b9\u00ba\7\13\2\2\u00ba\u00bb\7&\2\2\u00bb\u00bc\5\62"+
		"\32\2\u00bc\u00bd\7\'\2\2\u00bd\u00c6\5\4\3\2\u00be\u00bf\7\f\2\2\u00bf"+
		"\u00c0\7&\2\2\u00c0\u00c1\5\62\32\2\u00c1\u00c2\7\'\2\2\u00c2\u00c3\5"+
		"\4\3\2\u00c3\u00c5\3\2\2\2\u00c4\u00be\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6"+
		"\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00cb\3\2\2\2\u00c8\u00c6\3\2"+
		"\2\2\u00c9\u00ca\7\r\2\2\u00ca\u00cc\5\4\3\2\u00cb\u00c9\3\2\2\2\u00cb"+
		"\u00cc\3\2\2\2\u00cc\37\3\2\2\2\u00cd\u00ce\7\16\2\2\u00ce\u00d0\7&\2"+
		"\2\u00cf\u00d1\5\f\7\2\u00d0\u00cf\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2"+
		"\3\2\2\2\u00d2\u00d4\7\5\2\2\u00d3\u00d5\5\62\32\2\u00d4\u00d3\3\2\2\2"+
		"\u00d4\u00d5\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d8\7\5\2\2\u00d7\u00d9"+
		"\5\32\16\2\u00d8\u00d7\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\3\2\2\2"+
		"\u00da\u00db\7\'\2\2\u00db\u00dc\5\4\3\2\u00dc!\3\2\2\2\u00dd\u00de\7"+
		"\17\2\2\u00de\u00df\7&\2\2\u00df\u00e0\5\62\32\2\u00e0\u00e1\7\'\2\2\u00e1"+
		"\u00e2\5\4\3\2\u00e2#\3\2\2\2\u00e3\u00e4\7\20\2\2\u00e4\u00e5\5\4\3\2"+
		"\u00e5\u00e6\7\17\2\2\u00e6\u00e7\7&\2\2\u00e7\u00e8\5\62\32\2\u00e8\u00e9"+
		"\7\'\2\2\u00e9%\3\2\2\2\u00ea\u00eb\7\21\2\2\u00eb\u00ec\7&\2\2\u00ec"+
		"\u00ed\5\f\7\2\u00ed\u00ee\7\22\2\2\u00ee\u00ef\5\62\32\2\u00ef\u00f0"+
		"\7\'\2\2\u00f0\u00f1\5\4\3\2\u00f1\'\3\2\2\2\u00f2\u00f4\7\23\2\2\u00f3"+
		"\u00f5\5\62\32\2\u00f4\u00f3\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5)\3\2\2"+
		"\2\u00f6\u00f7\7\24\2\2\u00f7+\3\2\2\2\u00f8\u00f9\7\25\2\2\u00f9-\3\2"+
		"\2\2\u00fa\u00fb\7\34\2\2\u00fb\u00ff\7\65\2\2\u00fc\u00fd\7\65\2\2\u00fd"+
		"\u00ff\7\34\2\2\u00fe\u00fa\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff/\3\2\2\2"+
		"\u0100\u0101\7\35\2\2\u0101\u0105\7\65\2\2\u0102\u0103\7\65\2\2\u0103"+
		"\u0105\7\35\2\2\u0104\u0100\3\2\2\2\u0104\u0102\3\2\2\2\u0105\61\3\2\2"+
		"\2\u0106\u0107\b\32\1\2\u0107\u0119\7\26\2\2\u0108\u0119\7\30\2\2\u0109"+
		"\u0119\7\27\2\2\u010a\u0119\7\65\2\2\u010b\u0119\7\64\2\2\u010c\u0119"+
		"\7\32\2\2\u010d\u0119\5\16\b\2\u010e\u0119\5\26\f\2\u010f\u0119\5\24\13"+
		"\2\u0110\u0119\5.\30\2\u0111\u0119\5\60\31\2\u0112\u0113\7&\2\2\u0113"+
		"\u0114\5\62\32\2\u0114\u0115\7\'\2\2\u0115\u0119\3\2\2\2\u0116\u0117\t"+
		"\3\2\2\u0117\u0119\5\62\32\t\u0118\u0106\3\2\2\2\u0118\u0108\3\2\2\2\u0118"+
		"\u0109\3\2\2\2\u0118\u010a\3\2\2\2\u0118\u010b\3\2\2\2\u0118\u010c\3\2"+
		"\2\2\u0118\u010d\3\2\2\2\u0118\u010e\3\2\2\2\u0118\u010f\3\2\2\2\u0118"+
		"\u0110\3\2\2\2\u0118\u0111\3\2\2\2\u0118\u0112\3\2\2\2\u0118\u0116\3\2"+
		"\2\2\u0119\u013c\3\2\2\2\u011a\u011b\f\f\2\2\u011b\u011c\7 \2\2\u011c"+
		"\u013b\5\62\32\r\u011d\u011e\f\b\2\2\u011e\u011f\t\4\2\2\u011f\u013b\5"+
		"\62\32\t\u0120\u0121\f\7\2\2\u0121\u0122\t\5\2\2\u0122\u013b\5\62\32\b"+
		"\u0123\u0124\f\6\2\2\u0124\u0125\t\6\2\2\u0125\u013b\5\62\32\7\u0126\u0127"+
		"\f\5\2\2\u0127\u0128\t\7\2\2\u0128\u013b\5\62\32\6\u0129\u012a\f\4\2\2"+
		"\u012a\u012b\7\36\2\2\u012b\u013b\5\62\32\5\u012c\u012d\f\3\2\2\u012d"+
		"\u012e\7\37\2\2\u012e\u013b\5\62\32\4\u012f\u0130\f\13\2\2\u0130\u0132"+
		"\7&\2\2\u0131\u0133\5\34\17\2\u0132\u0131\3\2\2\2\u0132\u0133\3\2\2\2"+
		"\u0133\u0134\3\2\2\2\u0134\u013b\7\'\2\2\u0135\u0136\f\n\2\2\u0136\u0137"+
		"\7(\2\2\u0137\u0138\5\62\32\2\u0138\u0139\7)\2\2\u0139\u013b\3\2\2\2\u013a"+
		"\u011a\3\2\2\2\u013a\u011d\3\2\2\2\u013a\u0120\3\2\2\2\u013a\u0123\3\2"+
		"\2\2\u013a\u0126\3\2\2\2\u013a\u0129\3\2\2\2\u013a\u012c\3\2\2\2\u013a"+
		"\u012f\3\2\2\2\u013a\u0135\3\2\2\2\u013b\u013e\3\2\2\2\u013c\u013a\3\2"+
		"\2\2\u013c\u013d\3\2\2\2\u013d\63\3\2\2\2\u013e\u013c\3\2\2\2\u013f\u0140"+
		"\5\62\32\2\u0140\u0142\7&\2\2\u0141\u0143\5\34\17\2\u0142\u0141\3\2\2"+
		"\2\u0142\u0143\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0145\7\'\2\2\u0145\65"+
		"\3\2\2\2\368:AFagpv{\u0082\u008e\u0097\u00a1\u00af\u00b6\u00c6\u00cb\u00d0"+
		"\u00d4\u00d8\u00f4\u00fe\u0104\u0118\u0132\u013a\u013c\u0142";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}