//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     ANTLR Version: 4.8
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

// Generated from Calculator.g4 by ANTLR 4.8

// Unreachable code detected
#pragma warning disable 0162
// The variable '...' is assigned but its value is never used
#pragma warning disable 0219
// Missing XML comment for publicly visible type or member '...'
#pragma warning disable 1591
// Ambiguous reference in cref attribute
#pragma warning disable 419

using System;
using System.IO;
using System.Text;
using System.Diagnostics;
using System.Collections.Generic;
using Antlr4.Runtime;
using Antlr4.Runtime.Atn;
using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using DFA = Antlr4.Runtime.Dfa.DFA;

[System.CodeDom.Compiler.GeneratedCode("ANTLR", "4.8")]
[System.CLSCompliant(false)]
public partial class CalculatorParser : Parser {
	protected static DFA[] decisionToDFA;
	protected static PredictionContextCache sharedContextCache = new PredictionContextCache();
	public const int
		T__0=1, T__1=2, Digit=3, Not=4, And=5, Or=6, Dot=7, Plus=8, Minus=9, Multiply=10, 
		Divide=11, Modulo=12, LeftParenthesis=13, RightParenthesis=14, Greater=15, 
		Less=16, GreaterEqual=17, LessEqual=18, Equal=19, NotEqual=20, WhiteSpaces=21;
	public const int
		RULE_number = 0, RULE_bool = 1, RULE_numericExpr = 2, RULE_booleanExpr = 3, 
		RULE_expression = 4;
	public static readonly string[] ruleNames = {
		"number", "bool", "numericExpr", "booleanExpr", "expression"
	};

	private static readonly string[] _LiteralNames = {
		null, "'false'", "'true'", null, "'!'", "'&&'", "'||'", "'.'", "'+'", 
		"'-'", "'*'", "'/'", "'%'", "'('", "')'", "'>'", "'<'", "'>='", "'<='", 
		"'=='", "'!='"
	};
	private static readonly string[] _SymbolicNames = {
		null, null, null, "Digit", "Not", "And", "Or", "Dot", "Plus", "Minus", 
		"Multiply", "Divide", "Modulo", "LeftParenthesis", "RightParenthesis", 
		"Greater", "Less", "GreaterEqual", "LessEqual", "Equal", "NotEqual", "WhiteSpaces"
	};
	public static readonly IVocabulary DefaultVocabulary = new Vocabulary(_LiteralNames, _SymbolicNames);

	[NotNull]
	public override IVocabulary Vocabulary
	{
		get
		{
			return DefaultVocabulary;
		}
	}

	public override string GrammarFileName { get { return "Calculator.g4"; } }

	public override string[] RuleNames { get { return ruleNames; } }

	public override string SerializedAtn { get { return new string(_serializedATN); } }

	static CalculatorParser() {
		decisionToDFA = new DFA[_ATN.NumberOfDecisions];
		for (int i = 0; i < _ATN.NumberOfDecisions; i++) {
			decisionToDFA[i] = new DFA(_ATN.GetDecisionState(i), i);
		}
	}

		public CalculatorParser(ITokenStream input) : this(input, Console.Out, Console.Error) { }

		public CalculatorParser(ITokenStream input, TextWriter output, TextWriter errorOutput)
		: base(input, output, errorOutput)
	{
		Interpreter = new ParserATNSimulator(this, _ATN, decisionToDFA, sharedContextCache);
	}

	public partial class NumberContext : ParserRuleContext {
		public ITerminalNode[] Digit() { return GetTokens(CalculatorParser.Digit); }
		public ITerminalNode Digit(int i) {
			return GetToken(CalculatorParser.Digit, i);
		}
		public ITerminalNode Dot() { return GetToken(CalculatorParser.Dot, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState)
			: base(parent, invokingState)
		{
		}
		public override int RuleIndex { get { return RULE_number; } }
		public override TResult Accept<TResult>(IParseTreeVisitor<TResult> visitor) {
			ICalculatorVisitor<TResult> typedVisitor = visitor as ICalculatorVisitor<TResult>;
			if (typedVisitor != null) return typedVisitor.VisitNumber(this);
			else return visitor.VisitChildren(this);
		}
	}

	[RuleVersion(0)]
	public NumberContext number() {
		NumberContext _localctx = new NumberContext(Context, State);
		EnterRule(_localctx, 0, RULE_number);
		try {
			int _alt;
			EnterOuterAlt(_localctx, 1);
			{
			State = 11;
			ErrorHandler.Sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					State = 10; Match(Digit);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				State = 13;
				ErrorHandler.Sync(this);
				_alt = Interpreter.AdaptivePredict(TokenStream,0,Context);
			} while ( _alt!=2 && _alt!=global::Antlr4.Runtime.Atn.ATN.INVALID_ALT_NUMBER );
			State = 22;
			ErrorHandler.Sync(this);
			switch ( Interpreter.AdaptivePredict(TokenStream,2,Context) ) {
			case 1:
				{
				State = 15; Match(Dot);
				State = 19;
				ErrorHandler.Sync(this);
				_alt = Interpreter.AdaptivePredict(TokenStream,1,Context);
				while ( _alt!=2 && _alt!=global::Antlr4.Runtime.Atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						State = 16; Match(Digit);
						}
						} 
					}
					State = 21;
					ErrorHandler.Sync(this);
					_alt = Interpreter.AdaptivePredict(TokenStream,1,Context);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			ErrorHandler.ReportError(this, re);
			ErrorHandler.Recover(this, re);
		}
		finally {
			ExitRule();
		}
		return _localctx;
	}

	public partial class BoolContext : ParserRuleContext {
		public BoolContext(ParserRuleContext parent, int invokingState)
			: base(parent, invokingState)
		{
		}
		public override int RuleIndex { get { return RULE_bool; } }
		public override TResult Accept<TResult>(IParseTreeVisitor<TResult> visitor) {
			ICalculatorVisitor<TResult> typedVisitor = visitor as ICalculatorVisitor<TResult>;
			if (typedVisitor != null) return typedVisitor.VisitBool(this);
			else return visitor.VisitChildren(this);
		}
	}

	[RuleVersion(0)]
	public BoolContext @bool() {
		BoolContext _localctx = new BoolContext(Context, State);
		EnterRule(_localctx, 2, RULE_bool);
		int _la;
		try {
			EnterOuterAlt(_localctx, 1);
			{
			State = 24;
			_la = TokenStream.LA(1);
			if ( !(_la==T__0 || _la==T__1) ) {
			ErrorHandler.RecoverInline(this);
			}
			else {
				ErrorHandler.ReportMatch(this);
			    Consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			ErrorHandler.ReportError(this, re);
			ErrorHandler.Recover(this, re);
		}
		finally {
			ExitRule();
		}
		return _localctx;
	}

	public partial class NumericExprContext : ParserRuleContext {
		public NumberContext number() {
			return GetRuleContext<NumberContext>(0);
		}
		public ITerminalNode LeftParenthesis() { return GetToken(CalculatorParser.LeftParenthesis, 0); }
		public NumericExprContext[] numericExpr() {
			return GetRuleContexts<NumericExprContext>();
		}
		public NumericExprContext numericExpr(int i) {
			return GetRuleContext<NumericExprContext>(i);
		}
		public ITerminalNode RightParenthesis() { return GetToken(CalculatorParser.RightParenthesis, 0); }
		public ITerminalNode Minus() { return GetToken(CalculatorParser.Minus, 0); }
		public ITerminalNode Multiply() { return GetToken(CalculatorParser.Multiply, 0); }
		public ITerminalNode Divide() { return GetToken(CalculatorParser.Divide, 0); }
		public ITerminalNode Modulo() { return GetToken(CalculatorParser.Modulo, 0); }
		public ITerminalNode Plus() { return GetToken(CalculatorParser.Plus, 0); }
		public NumericExprContext(ParserRuleContext parent, int invokingState)
			: base(parent, invokingState)
		{
		}
		public override int RuleIndex { get { return RULE_numericExpr; } }
		public override TResult Accept<TResult>(IParseTreeVisitor<TResult> visitor) {
			ICalculatorVisitor<TResult> typedVisitor = visitor as ICalculatorVisitor<TResult>;
			if (typedVisitor != null) return typedVisitor.VisitNumericExpr(this);
			else return visitor.VisitChildren(this);
		}
	}

	[RuleVersion(0)]
	public NumericExprContext numericExpr() {
		return numericExpr(0);
	}

	private NumericExprContext numericExpr(int _p) {
		ParserRuleContext _parentctx = Context;
		int _parentState = State;
		NumericExprContext _localctx = new NumericExprContext(Context, _parentState);
		NumericExprContext _prevctx = _localctx;
		int _startState = 4;
		EnterRecursionRule(_localctx, 4, RULE_numericExpr, _p);
		int _la;
		try {
			int _alt;
			EnterOuterAlt(_localctx, 1);
			{
			State = 34;
			ErrorHandler.Sync(this);
			switch (TokenStream.LA(1)) {
			case Digit:
				{
				State = 27; number();
				}
				break;
			case LeftParenthesis:
				{
				State = 28; Match(LeftParenthesis);
				State = 29; numericExpr(0);
				State = 30; Match(RightParenthesis);
				}
				break;
			case Minus:
				{
				State = 32; Match(Minus);
				State = 33; numericExpr(3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			Context.Stop = TokenStream.LT(-1);
			State = 44;
			ErrorHandler.Sync(this);
			_alt = Interpreter.AdaptivePredict(TokenStream,5,Context);
			while ( _alt!=2 && _alt!=global::Antlr4.Runtime.Atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( ParseListeners!=null )
						TriggerExitRuleEvent();
					_prevctx = _localctx;
					{
					State = 42;
					ErrorHandler.Sync(this);
					switch ( Interpreter.AdaptivePredict(TokenStream,4,Context) ) {
					case 1:
						{
						_localctx = new NumericExprContext(_parentctx, _parentState);
						PushNewRecursionContext(_localctx, _startState, RULE_numericExpr);
						State = 36;
						if (!(Precpred(Context, 2))) throw new FailedPredicateException(this, "Precpred(Context, 2)");
						State = 37;
						_la = TokenStream.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Multiply) | (1L << Divide) | (1L << Modulo))) != 0)) ) {
						ErrorHandler.RecoverInline(this);
						}
						else {
							ErrorHandler.ReportMatch(this);
						    Consume();
						}
						State = 38; numericExpr(3);
						}
						break;
					case 2:
						{
						_localctx = new NumericExprContext(_parentctx, _parentState);
						PushNewRecursionContext(_localctx, _startState, RULE_numericExpr);
						State = 39;
						if (!(Precpred(Context, 1))) throw new FailedPredicateException(this, "Precpred(Context, 1)");
						State = 40;
						_la = TokenStream.LA(1);
						if ( !(_la==Plus || _la==Minus) ) {
						ErrorHandler.RecoverInline(this);
						}
						else {
							ErrorHandler.ReportMatch(this);
						    Consume();
						}
						State = 41; numericExpr(2);
						}
						break;
					}
					} 
				}
				State = 46;
				ErrorHandler.Sync(this);
				_alt = Interpreter.AdaptivePredict(TokenStream,5,Context);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			ErrorHandler.ReportError(this, re);
			ErrorHandler.Recover(this, re);
		}
		finally {
			UnrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public partial class BooleanExprContext : ParserRuleContext {
		public BoolContext @bool() {
			return GetRuleContext<BoolContext>(0);
		}
		public ITerminalNode LeftParenthesis() { return GetToken(CalculatorParser.LeftParenthesis, 0); }
		public BooleanExprContext[] booleanExpr() {
			return GetRuleContexts<BooleanExprContext>();
		}
		public BooleanExprContext booleanExpr(int i) {
			return GetRuleContext<BooleanExprContext>(i);
		}
		public ITerminalNode RightParenthesis() { return GetToken(CalculatorParser.RightParenthesis, 0); }
		public ITerminalNode Not() { return GetToken(CalculatorParser.Not, 0); }
		public NumericExprContext[] numericExpr() {
			return GetRuleContexts<NumericExprContext>();
		}
		public NumericExprContext numericExpr(int i) {
			return GetRuleContext<NumericExprContext>(i);
		}
		public ITerminalNode Less() { return GetToken(CalculatorParser.Less, 0); }
		public ITerminalNode Greater() { return GetToken(CalculatorParser.Greater, 0); }
		public ITerminalNode LessEqual() { return GetToken(CalculatorParser.LessEqual, 0); }
		public ITerminalNode GreaterEqual() { return GetToken(CalculatorParser.GreaterEqual, 0); }
		public ITerminalNode Equal() { return GetToken(CalculatorParser.Equal, 0); }
		public ITerminalNode NotEqual() { return GetToken(CalculatorParser.NotEqual, 0); }
		public ITerminalNode And() { return GetToken(CalculatorParser.And, 0); }
		public ITerminalNode Or() { return GetToken(CalculatorParser.Or, 0); }
		public BooleanExprContext(ParserRuleContext parent, int invokingState)
			: base(parent, invokingState)
		{
		}
		public override int RuleIndex { get { return RULE_booleanExpr; } }
		public override TResult Accept<TResult>(IParseTreeVisitor<TResult> visitor) {
			ICalculatorVisitor<TResult> typedVisitor = visitor as ICalculatorVisitor<TResult>;
			if (typedVisitor != null) return typedVisitor.VisitBooleanExpr(this);
			else return visitor.VisitChildren(this);
		}
	}

	[RuleVersion(0)]
	public BooleanExprContext booleanExpr() {
		return booleanExpr(0);
	}

	private BooleanExprContext booleanExpr(int _p) {
		ParserRuleContext _parentctx = Context;
		int _parentState = State;
		BooleanExprContext _localctx = new BooleanExprContext(Context, _parentState);
		BooleanExprContext _prevctx = _localctx;
		int _startState = 6;
		EnterRecursionRule(_localctx, 6, RULE_booleanExpr, _p);
		int _la;
		try {
			int _alt;
			EnterOuterAlt(_localctx, 1);
			{
			State = 63;
			ErrorHandler.Sync(this);
			switch ( Interpreter.AdaptivePredict(TokenStream,6,Context) ) {
			case 1:
				{
				State = 48; @bool();
				}
				break;
			case 2:
				{
				State = 49; Match(LeftParenthesis);
				State = 50; booleanExpr(0);
				State = 51; Match(RightParenthesis);
				}
				break;
			case 3:
				{
				State = 53; Match(Not);
				State = 54; booleanExpr(6);
				}
				break;
			case 4:
				{
				State = 55; numericExpr(0);
				State = 56;
				_la = TokenStream.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Greater) | (1L << Less) | (1L << GreaterEqual) | (1L << LessEqual))) != 0)) ) {
				ErrorHandler.RecoverInline(this);
				}
				else {
					ErrorHandler.ReportMatch(this);
				    Consume();
				}
				State = 57; numericExpr(0);
				}
				break;
			case 5:
				{
				State = 59; numericExpr(0);
				State = 60;
				_la = TokenStream.LA(1);
				if ( !(_la==Equal || _la==NotEqual) ) {
				ErrorHandler.RecoverInline(this);
				}
				else {
					ErrorHandler.ReportMatch(this);
				    Consume();
				}
				State = 61; numericExpr(0);
				}
				break;
			}
			Context.Stop = TokenStream.LT(-1);
			State = 76;
			ErrorHandler.Sync(this);
			_alt = Interpreter.AdaptivePredict(TokenStream,8,Context);
			while ( _alt!=2 && _alt!=global::Antlr4.Runtime.Atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( ParseListeners!=null )
						TriggerExitRuleEvent();
					_prevctx = _localctx;
					{
					State = 74;
					ErrorHandler.Sync(this);
					switch ( Interpreter.AdaptivePredict(TokenStream,7,Context) ) {
					case 1:
						{
						_localctx = new BooleanExprContext(_parentctx, _parentState);
						PushNewRecursionContext(_localctx, _startState, RULE_booleanExpr);
						State = 65;
						if (!(Precpred(Context, 5))) throw new FailedPredicateException(this, "Precpred(Context, 5)");
						State = 66;
						_la = TokenStream.LA(1);
						if ( !(_la==Equal || _la==NotEqual) ) {
						ErrorHandler.RecoverInline(this);
						}
						else {
							ErrorHandler.ReportMatch(this);
						    Consume();
						}
						State = 67; booleanExpr(6);
						}
						break;
					case 2:
						{
						_localctx = new BooleanExprContext(_parentctx, _parentState);
						PushNewRecursionContext(_localctx, _startState, RULE_booleanExpr);
						State = 68;
						if (!(Precpred(Context, 4))) throw new FailedPredicateException(this, "Precpred(Context, 4)");
						State = 69; Match(And);
						State = 70; booleanExpr(5);
						}
						break;
					case 3:
						{
						_localctx = new BooleanExprContext(_parentctx, _parentState);
						PushNewRecursionContext(_localctx, _startState, RULE_booleanExpr);
						State = 71;
						if (!(Precpred(Context, 3))) throw new FailedPredicateException(this, "Precpred(Context, 3)");
						State = 72; Match(Or);
						State = 73; booleanExpr(4);
						}
						break;
					}
					} 
				}
				State = 78;
				ErrorHandler.Sync(this);
				_alt = Interpreter.AdaptivePredict(TokenStream,8,Context);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			ErrorHandler.ReportError(this, re);
			ErrorHandler.Recover(this, re);
		}
		finally {
			UnrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public partial class ExpressionContext : ParserRuleContext {
		public BooleanExprContext booleanExpr() {
			return GetRuleContext<BooleanExprContext>(0);
		}
		public NumericExprContext numericExpr() {
			return GetRuleContext<NumericExprContext>(0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState)
			: base(parent, invokingState)
		{
		}
		public override int RuleIndex { get { return RULE_expression; } }
		public override TResult Accept<TResult>(IParseTreeVisitor<TResult> visitor) {
			ICalculatorVisitor<TResult> typedVisitor = visitor as ICalculatorVisitor<TResult>;
			if (typedVisitor != null) return typedVisitor.VisitExpression(this);
			else return visitor.VisitChildren(this);
		}
	}

	[RuleVersion(0)]
	public ExpressionContext expression() {
		ExpressionContext _localctx = new ExpressionContext(Context, State);
		EnterRule(_localctx, 8, RULE_expression);
		try {
			State = 81;
			ErrorHandler.Sync(this);
			switch ( Interpreter.AdaptivePredict(TokenStream,9,Context) ) {
			case 1:
				EnterOuterAlt(_localctx, 1);
				{
				State = 79; booleanExpr(0);
				}
				break;
			case 2:
				EnterOuterAlt(_localctx, 2);
				{
				State = 80; numericExpr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			ErrorHandler.ReportError(this, re);
			ErrorHandler.Recover(this, re);
		}
		finally {
			ExitRule();
		}
		return _localctx;
	}

	public override bool Sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2: return numericExpr_sempred((NumericExprContext)_localctx, predIndex);
		case 3: return booleanExpr_sempred((BooleanExprContext)_localctx, predIndex);
		}
		return true;
	}
	private bool numericExpr_sempred(NumericExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return Precpred(Context, 2);
		case 1: return Precpred(Context, 1);
		}
		return true;
	}
	private bool booleanExpr_sempred(BooleanExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return Precpred(Context, 5);
		case 3: return Precpred(Context, 4);
		case 4: return Precpred(Context, 3);
		}
		return true;
	}

	private static char[] _serializedATN = {
		'\x3', '\x608B', '\xA72A', '\x8133', '\xB9ED', '\x417C', '\x3BE7', '\x7786', 
		'\x5964', '\x3', '\x17', 'V', '\x4', '\x2', '\t', '\x2', '\x4', '\x3', 
		'\t', '\x3', '\x4', '\x4', '\t', '\x4', '\x4', '\x5', '\t', '\x5', '\x4', 
		'\x6', '\t', '\x6', '\x3', '\x2', '\x6', '\x2', '\xE', '\n', '\x2', '\r', 
		'\x2', '\xE', '\x2', '\xF', '\x3', '\x2', '\x3', '\x2', '\a', '\x2', '\x14', 
		'\n', '\x2', '\f', '\x2', '\xE', '\x2', '\x17', '\v', '\x2', '\x5', '\x2', 
		'\x19', '\n', '\x2', '\x3', '\x3', '\x3', '\x3', '\x3', '\x4', '\x3', 
		'\x4', '\x3', '\x4', '\x3', '\x4', '\x3', '\x4', '\x3', '\x4', '\x3', 
		'\x4', '\x3', '\x4', '\x5', '\x4', '%', '\n', '\x4', '\x3', '\x4', '\x3', 
		'\x4', '\x3', '\x4', '\x3', '\x4', '\x3', '\x4', '\x3', '\x4', '\a', '\x4', 
		'-', '\n', '\x4', '\f', '\x4', '\xE', '\x4', '\x30', '\v', '\x4', '\x3', 
		'\x5', '\x3', '\x5', '\x3', '\x5', '\x3', '\x5', '\x3', '\x5', '\x3', 
		'\x5', '\x3', '\x5', '\x3', '\x5', '\x3', '\x5', '\x3', '\x5', '\x3', 
		'\x5', '\x3', '\x5', '\x3', '\x5', '\x3', '\x5', '\x3', '\x5', '\x3', 
		'\x5', '\x5', '\x5', '\x42', '\n', '\x5', '\x3', '\x5', '\x3', '\x5', 
		'\x3', '\x5', '\x3', '\x5', '\x3', '\x5', '\x3', '\x5', '\x3', '\x5', 
		'\x3', '\x5', '\x3', '\x5', '\a', '\x5', 'M', '\n', '\x5', '\f', '\x5', 
		'\xE', '\x5', 'P', '\v', '\x5', '\x3', '\x6', '\x3', '\x6', '\x5', '\x6', 
		'T', '\n', '\x6', '\x3', '\x6', '\x2', '\x4', '\x6', '\b', '\a', '\x2', 
		'\x4', '\x6', '\b', '\n', '\x2', '\a', '\x3', '\x2', '\x3', '\x4', '\x3', 
		'\x2', '\f', '\xE', '\x3', '\x2', '\n', '\v', '\x3', '\x2', '\x11', '\x14', 
		'\x3', '\x2', '\x15', '\x16', '\x2', '_', '\x2', '\r', '\x3', '\x2', '\x2', 
		'\x2', '\x4', '\x1A', '\x3', '\x2', '\x2', '\x2', '\x6', '$', '\x3', '\x2', 
		'\x2', '\x2', '\b', '\x41', '\x3', '\x2', '\x2', '\x2', '\n', 'S', '\x3', 
		'\x2', '\x2', '\x2', '\f', '\xE', '\a', '\x5', '\x2', '\x2', '\r', '\f', 
		'\x3', '\x2', '\x2', '\x2', '\xE', '\xF', '\x3', '\x2', '\x2', '\x2', 
		'\xF', '\r', '\x3', '\x2', '\x2', '\x2', '\xF', '\x10', '\x3', '\x2', 
		'\x2', '\x2', '\x10', '\x18', '\x3', '\x2', '\x2', '\x2', '\x11', '\x15', 
		'\a', '\t', '\x2', '\x2', '\x12', '\x14', '\a', '\x5', '\x2', '\x2', '\x13', 
		'\x12', '\x3', '\x2', '\x2', '\x2', '\x14', '\x17', '\x3', '\x2', '\x2', 
		'\x2', '\x15', '\x13', '\x3', '\x2', '\x2', '\x2', '\x15', '\x16', '\x3', 
		'\x2', '\x2', '\x2', '\x16', '\x19', '\x3', '\x2', '\x2', '\x2', '\x17', 
		'\x15', '\x3', '\x2', '\x2', '\x2', '\x18', '\x11', '\x3', '\x2', '\x2', 
		'\x2', '\x18', '\x19', '\x3', '\x2', '\x2', '\x2', '\x19', '\x3', '\x3', 
		'\x2', '\x2', '\x2', '\x1A', '\x1B', '\t', '\x2', '\x2', '\x2', '\x1B', 
		'\x5', '\x3', '\x2', '\x2', '\x2', '\x1C', '\x1D', '\b', '\x4', '\x1', 
		'\x2', '\x1D', '%', '\x5', '\x2', '\x2', '\x2', '\x1E', '\x1F', '\a', 
		'\xF', '\x2', '\x2', '\x1F', ' ', '\x5', '\x6', '\x4', '\x2', ' ', '!', 
		'\a', '\x10', '\x2', '\x2', '!', '%', '\x3', '\x2', '\x2', '\x2', '\"', 
		'#', '\a', '\v', '\x2', '\x2', '#', '%', '\x5', '\x6', '\x4', '\x5', '$', 
		'\x1C', '\x3', '\x2', '\x2', '\x2', '$', '\x1E', '\x3', '\x2', '\x2', 
		'\x2', '$', '\"', '\x3', '\x2', '\x2', '\x2', '%', '.', '\x3', '\x2', 
		'\x2', '\x2', '&', '\'', '\f', '\x4', '\x2', '\x2', '\'', '(', '\t', '\x3', 
		'\x2', '\x2', '(', '-', '\x5', '\x6', '\x4', '\x5', ')', '*', '\f', '\x3', 
		'\x2', '\x2', '*', '+', '\t', '\x4', '\x2', '\x2', '+', '-', '\x5', '\x6', 
		'\x4', '\x4', ',', '&', '\x3', '\x2', '\x2', '\x2', ',', ')', '\x3', '\x2', 
		'\x2', '\x2', '-', '\x30', '\x3', '\x2', '\x2', '\x2', '.', ',', '\x3', 
		'\x2', '\x2', '\x2', '.', '/', '\x3', '\x2', '\x2', '\x2', '/', '\a', 
		'\x3', '\x2', '\x2', '\x2', '\x30', '.', '\x3', '\x2', '\x2', '\x2', '\x31', 
		'\x32', '\b', '\x5', '\x1', '\x2', '\x32', '\x42', '\x5', '\x4', '\x3', 
		'\x2', '\x33', '\x34', '\a', '\xF', '\x2', '\x2', '\x34', '\x35', '\x5', 
		'\b', '\x5', '\x2', '\x35', '\x36', '\a', '\x10', '\x2', '\x2', '\x36', 
		'\x42', '\x3', '\x2', '\x2', '\x2', '\x37', '\x38', '\a', '\x6', '\x2', 
		'\x2', '\x38', '\x42', '\x5', '\b', '\x5', '\b', '\x39', ':', '\x5', '\x6', 
		'\x4', '\x2', ':', ';', '\t', '\x5', '\x2', '\x2', ';', '<', '\x5', '\x6', 
		'\x4', '\x2', '<', '\x42', '\x3', '\x2', '\x2', '\x2', '=', '>', '\x5', 
		'\x6', '\x4', '\x2', '>', '?', '\t', '\x6', '\x2', '\x2', '?', '@', '\x5', 
		'\x6', '\x4', '\x2', '@', '\x42', '\x3', '\x2', '\x2', '\x2', '\x41', 
		'\x31', '\x3', '\x2', '\x2', '\x2', '\x41', '\x33', '\x3', '\x2', '\x2', 
		'\x2', '\x41', '\x37', '\x3', '\x2', '\x2', '\x2', '\x41', '\x39', '\x3', 
		'\x2', '\x2', '\x2', '\x41', '=', '\x3', '\x2', '\x2', '\x2', '\x42', 
		'N', '\x3', '\x2', '\x2', '\x2', '\x43', '\x44', '\f', '\a', '\x2', '\x2', 
		'\x44', '\x45', '\t', '\x6', '\x2', '\x2', '\x45', 'M', '\x5', '\b', '\x5', 
		'\b', '\x46', 'G', '\f', '\x6', '\x2', '\x2', 'G', 'H', '\a', '\a', '\x2', 
		'\x2', 'H', 'M', '\x5', '\b', '\x5', '\a', 'I', 'J', '\f', '\x5', '\x2', 
		'\x2', 'J', 'K', '\a', '\b', '\x2', '\x2', 'K', 'M', '\x5', '\b', '\x5', 
		'\x6', 'L', '\x43', '\x3', '\x2', '\x2', '\x2', 'L', '\x46', '\x3', '\x2', 
		'\x2', '\x2', 'L', 'I', '\x3', '\x2', '\x2', '\x2', 'M', 'P', '\x3', '\x2', 
		'\x2', '\x2', 'N', 'L', '\x3', '\x2', '\x2', '\x2', 'N', 'O', '\x3', '\x2', 
		'\x2', '\x2', 'O', '\t', '\x3', '\x2', '\x2', '\x2', 'P', 'N', '\x3', 
		'\x2', '\x2', '\x2', 'Q', 'T', '\x5', '\b', '\x5', '\x2', 'R', 'T', '\x5', 
		'\x6', '\x4', '\x2', 'S', 'Q', '\x3', '\x2', '\x2', '\x2', 'S', 'R', '\x3', 
		'\x2', '\x2', '\x2', 'T', '\v', '\x3', '\x2', '\x2', '\x2', '\f', '\xF', 
		'\x15', '\x18', '$', ',', '.', '\x41', 'L', 'N', 'S',
	};

	public static readonly ATN _ATN =
		new ATNDeserializer().Deserialize(_serializedATN);


}
