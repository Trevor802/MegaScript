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
using Antlr4.Runtime;
using Antlr4.Runtime.Atn;
using Antlr4.Runtime.Misc;
using DFA = Antlr4.Runtime.Dfa.DFA;

[System.CodeDom.Compiler.GeneratedCode("ANTLR", "4.8")]
[System.CLSCompliant(false)]
public partial class CalculatorLexer : Lexer {
	protected static DFA[] decisionToDFA;
	protected static PredictionContextCache sharedContextCache = new PredictionContextCache();
	public const int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, Number=12, True=13, False=14, Var=15, Null=16, Not=17, 
		Increment=18, Decrement=19, And=20, Or=21, Dot=22, Plus=23, Minus=24, 
		Multiply=25, Divide=26, Modulo=27, LeftParenthesis=28, RightParenthesis=29, 
		Greater=30, Less=31, GreaterEqual=32, LessEqual=33, Equal=34, NotEqual=35, 
		AddAss=36, MinusAss=37, MultiplyAss=38, DivideAss=39, String=40, Id=41, 
		WhiteSpaces=42;
	public static string[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static string[] modeNames = {
		"DEFAULT_MODE"
	};

	public static readonly string[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "Digit", "Letter", "Number", "True", "False", "Var", 
		"Null", "Not", "Increment", "Decrement", "And", "Or", "Dot", "Plus", "Minus", 
		"Multiply", "Divide", "Modulo", "LeftParenthesis", "RightParenthesis", 
		"Greater", "Less", "GreaterEqual", "LessEqual", "Equal", "NotEqual", "AddAss", 
		"MinusAss", "MultiplyAss", "DivideAss", "String", "Id", "WhiteSpaces"
	};


	public CalculatorLexer(ICharStream input)
	: this(input, Console.Out, Console.Error) { }

	public CalculatorLexer(ICharStream input, TextWriter output, TextWriter errorOutput)
	: base(input, output, errorOutput)
	{
		Interpreter = new LexerATNSimulator(this, _ATN, decisionToDFA, sharedContextCache);
	}

	private static readonly string[] _LiteralNames = {
		null, "'{'", "'}'", "';'", "'='", "'function'", "','", "':'", "'if'", 
		"'else if'", "'else'", "'return'", null, "'true'", "'false'", "'var'", 
		"'null'", "'!'", "'++'", "'--'", "'&&'", "'||'", "'.'", "'+'", "'-'", 
		"'*'", "'/'", "'%'", "'('", "')'", "'>'", "'<'", "'>='", "'<='", "'=='", 
		"'!='", "'+='", "'-='", "'*='", "'/='"
	};
	private static readonly string[] _SymbolicNames = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"Number", "True", "False", "Var", "Null", "Not", "Increment", "Decrement", 
		"And", "Or", "Dot", "Plus", "Minus", "Multiply", "Divide", "Modulo", "LeftParenthesis", 
		"RightParenthesis", "Greater", "Less", "GreaterEqual", "LessEqual", "Equal", 
		"NotEqual", "AddAss", "MinusAss", "MultiplyAss", "DivideAss", "String", 
		"Id", "WhiteSpaces"
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

	public override string[] ChannelNames { get { return channelNames; } }

	public override string[] ModeNames { get { return modeNames; } }

	public override string SerializedAtn { get { return new string(_serializedATN); } }

	static CalculatorLexer() {
		decisionToDFA = new DFA[_ATN.NumberOfDecisions];
		for (int i = 0; i < _ATN.NumberOfDecisions; i++) {
			decisionToDFA[i] = new DFA(_ATN.GetDecisionState(i), i);
		}
	}
	private static char[] _serializedATN = {
		'\x3', '\x608B', '\xA72A', '\x8133', '\xB9ED', '\x417C', '\x3BE7', '\x7786', 
		'\x5964', '\x2', ',', '\x103', '\b', '\x1', '\x4', '\x2', '\t', '\x2', 
		'\x4', '\x3', '\t', '\x3', '\x4', '\x4', '\t', '\x4', '\x4', '\x5', '\t', 
		'\x5', '\x4', '\x6', '\t', '\x6', '\x4', '\a', '\t', '\a', '\x4', '\b', 
		'\t', '\b', '\x4', '\t', '\t', '\t', '\x4', '\n', '\t', '\n', '\x4', '\v', 
		'\t', '\v', '\x4', '\f', '\t', '\f', '\x4', '\r', '\t', '\r', '\x4', '\xE', 
		'\t', '\xE', '\x4', '\xF', '\t', '\xF', '\x4', '\x10', '\t', '\x10', '\x4', 
		'\x11', '\t', '\x11', '\x4', '\x12', '\t', '\x12', '\x4', '\x13', '\t', 
		'\x13', '\x4', '\x14', '\t', '\x14', '\x4', '\x15', '\t', '\x15', '\x4', 
		'\x16', '\t', '\x16', '\x4', '\x17', '\t', '\x17', '\x4', '\x18', '\t', 
		'\x18', '\x4', '\x19', '\t', '\x19', '\x4', '\x1A', '\t', '\x1A', '\x4', 
		'\x1B', '\t', '\x1B', '\x4', '\x1C', '\t', '\x1C', '\x4', '\x1D', '\t', 
		'\x1D', '\x4', '\x1E', '\t', '\x1E', '\x4', '\x1F', '\t', '\x1F', '\x4', 
		' ', '\t', ' ', '\x4', '!', '\t', '!', '\x4', '\"', '\t', '\"', '\x4', 
		'#', '\t', '#', '\x4', '$', '\t', '$', '\x4', '%', '\t', '%', '\x4', '&', 
		'\t', '&', '\x4', '\'', '\t', '\'', '\x4', '(', '\t', '(', '\x4', ')', 
		'\t', ')', '\x4', '*', '\t', '*', '\x4', '+', '\t', '+', '\x4', ',', '\t', 
		',', '\x4', '-', '\t', '-', '\x3', '\x2', '\x3', '\x2', '\x3', '\x3', 
		'\x3', '\x3', '\x3', '\x4', '\x3', '\x4', '\x3', '\x5', '\x3', '\x5', 
		'\x3', '\x6', '\x3', '\x6', '\x3', '\x6', '\x3', '\x6', '\x3', '\x6', 
		'\x3', '\x6', '\x3', '\x6', '\x3', '\x6', '\x3', '\x6', '\x3', '\a', '\x3', 
		'\a', '\x3', '\b', '\x3', '\b', '\x3', '\t', '\x3', '\t', '\x3', '\t', 
		'\x3', '\n', '\x3', '\n', '\x3', '\n', '\x3', '\n', '\x3', '\n', '\x3', 
		'\n', '\x3', '\n', '\x3', '\n', '\x3', '\v', '\x3', '\v', '\x3', '\v', 
		'\x3', '\v', '\x3', '\v', '\x3', '\f', '\x3', '\f', '\x3', '\f', '\x3', 
		'\f', '\x3', '\f', '\x3', '\f', '\x3', '\f', '\x3', '\r', '\x3', '\r', 
		'\x3', '\xE', '\x3', '\xE', '\x3', '\xF', '\x6', '\xF', '\x8D', '\n', 
		'\xF', '\r', '\xF', '\xE', '\xF', '\x8E', '\x3', '\xF', '\x3', '\xF', 
		'\a', '\xF', '\x93', '\n', '\xF', '\f', '\xF', '\xE', '\xF', '\x96', '\v', 
		'\xF', '\x5', '\xF', '\x98', '\n', '\xF', '\x3', '\x10', '\x3', '\x10', 
		'\x3', '\x10', '\x3', '\x10', '\x3', '\x10', '\x3', '\x11', '\x3', '\x11', 
		'\x3', '\x11', '\x3', '\x11', '\x3', '\x11', '\x3', '\x11', '\x3', '\x12', 
		'\x3', '\x12', '\x3', '\x12', '\x3', '\x12', '\x3', '\x13', '\x3', '\x13', 
		'\x3', '\x13', '\x3', '\x13', '\x3', '\x13', '\x3', '\x14', '\x3', '\x14', 
		'\x3', '\x15', '\x3', '\x15', '\x3', '\x15', '\x3', '\x16', '\x3', '\x16', 
		'\x3', '\x16', '\x3', '\x17', '\x3', '\x17', '\x3', '\x17', '\x3', '\x18', 
		'\x3', '\x18', '\x3', '\x18', '\x3', '\x19', '\x3', '\x19', '\x3', '\x1A', 
		'\x3', '\x1A', '\x3', '\x1B', '\x3', '\x1B', '\x3', '\x1C', '\x3', '\x1C', 
		'\x3', '\x1D', '\x3', '\x1D', '\x3', '\x1E', '\x3', '\x1E', '\x3', '\x1F', 
		'\x3', '\x1F', '\x3', ' ', '\x3', ' ', '\x3', '!', '\x3', '!', '\x3', 
		'\"', '\x3', '\"', '\x3', '#', '\x3', '#', '\x3', '#', '\x3', '$', '\x3', 
		'$', '\x3', '$', '\x3', '%', '\x3', '%', '\x3', '%', '\x3', '&', '\x3', 
		'&', '\x3', '&', '\x3', '\'', '\x3', '\'', '\x3', '\'', '\x3', '(', '\x3', 
		'(', '\x3', '(', '\x3', ')', '\x3', ')', '\x3', ')', '\x3', '*', '\x3', 
		'*', '\x3', '*', '\x3', '+', '\x3', '+', '\a', '+', '\xEA', '\n', '+', 
		'\f', '+', '\xE', '+', '\xED', '\v', '+', '\x3', '+', '\x3', '+', '\x3', 
		',', '\x3', ',', '\x5', ',', '\xF3', '\n', ',', '\x3', ',', '\x3', ',', 
		'\x3', ',', '\a', ',', '\xF8', '\n', ',', '\f', ',', '\xE', ',', '\xFB', 
		'\v', ',', '\x3', '-', '\x6', '-', '\xFE', '\n', '-', '\r', '-', '\xE', 
		'-', '\xFF', '\x3', '-', '\x3', '-', '\x3', '\xEB', '\x2', '.', '\x3', 
		'\x3', '\x5', '\x4', '\a', '\x5', '\t', '\x6', '\v', '\a', '\r', '\b', 
		'\xF', '\t', '\x11', '\n', '\x13', '\v', '\x15', '\f', '\x17', '\r', '\x19', 
		'\x2', '\x1B', '\x2', '\x1D', '\xE', '\x1F', '\xF', '!', '\x10', '#', 
		'\x11', '%', '\x12', '\'', '\x13', ')', '\x14', '+', '\x15', '-', '\x16', 
		'/', '\x17', '\x31', '\x18', '\x33', '\x19', '\x35', '\x1A', '\x37', '\x1B', 
		'\x39', '\x1C', ';', '\x1D', '=', '\x1E', '?', '\x1F', '\x41', ' ', '\x43', 
		'!', '\x45', '\"', 'G', '#', 'I', '$', 'K', '%', 'M', '&', 'O', '\'', 
		'Q', '(', 'S', ')', 'U', '*', 'W', '+', 'Y', ',', '\x3', '\x2', '\x5', 
		'\x3', '\x2', '\x32', ';', '\x4', '\x2', '\x43', '\\', '\x63', '|', '\x5', 
		'\x2', '\v', '\f', '\xF', '\xF', '\"', '\"', '\x2', '\x109', '\x2', '\x3', 
		'\x3', '\x2', '\x2', '\x2', '\x2', '\x5', '\x3', '\x2', '\x2', '\x2', 
		'\x2', '\a', '\x3', '\x2', '\x2', '\x2', '\x2', '\t', '\x3', '\x2', '\x2', 
		'\x2', '\x2', '\v', '\x3', '\x2', '\x2', '\x2', '\x2', '\r', '\x3', '\x2', 
		'\x2', '\x2', '\x2', '\xF', '\x3', '\x2', '\x2', '\x2', '\x2', '\x11', 
		'\x3', '\x2', '\x2', '\x2', '\x2', '\x13', '\x3', '\x2', '\x2', '\x2', 
		'\x2', '\x15', '\x3', '\x2', '\x2', '\x2', '\x2', '\x17', '\x3', '\x2', 
		'\x2', '\x2', '\x2', '\x1D', '\x3', '\x2', '\x2', '\x2', '\x2', '\x1F', 
		'\x3', '\x2', '\x2', '\x2', '\x2', '!', '\x3', '\x2', '\x2', '\x2', '\x2', 
		'#', '\x3', '\x2', '\x2', '\x2', '\x2', '%', '\x3', '\x2', '\x2', '\x2', 
		'\x2', '\'', '\x3', '\x2', '\x2', '\x2', '\x2', ')', '\x3', '\x2', '\x2', 
		'\x2', '\x2', '+', '\x3', '\x2', '\x2', '\x2', '\x2', '-', '\x3', '\x2', 
		'\x2', '\x2', '\x2', '/', '\x3', '\x2', '\x2', '\x2', '\x2', '\x31', '\x3', 
		'\x2', '\x2', '\x2', '\x2', '\x33', '\x3', '\x2', '\x2', '\x2', '\x2', 
		'\x35', '\x3', '\x2', '\x2', '\x2', '\x2', '\x37', '\x3', '\x2', '\x2', 
		'\x2', '\x2', '\x39', '\x3', '\x2', '\x2', '\x2', '\x2', ';', '\x3', '\x2', 
		'\x2', '\x2', '\x2', '=', '\x3', '\x2', '\x2', '\x2', '\x2', '?', '\x3', 
		'\x2', '\x2', '\x2', '\x2', '\x41', '\x3', '\x2', '\x2', '\x2', '\x2', 
		'\x43', '\x3', '\x2', '\x2', '\x2', '\x2', '\x45', '\x3', '\x2', '\x2', 
		'\x2', '\x2', 'G', '\x3', '\x2', '\x2', '\x2', '\x2', 'I', '\x3', '\x2', 
		'\x2', '\x2', '\x2', 'K', '\x3', '\x2', '\x2', '\x2', '\x2', 'M', '\x3', 
		'\x2', '\x2', '\x2', '\x2', 'O', '\x3', '\x2', '\x2', '\x2', '\x2', 'Q', 
		'\x3', '\x2', '\x2', '\x2', '\x2', 'S', '\x3', '\x2', '\x2', '\x2', '\x2', 
		'U', '\x3', '\x2', '\x2', '\x2', '\x2', 'W', '\x3', '\x2', '\x2', '\x2', 
		'\x2', 'Y', '\x3', '\x2', '\x2', '\x2', '\x3', '[', '\x3', '\x2', '\x2', 
		'\x2', '\x5', ']', '\x3', '\x2', '\x2', '\x2', '\a', '_', '\x3', '\x2', 
		'\x2', '\x2', '\t', '\x61', '\x3', '\x2', '\x2', '\x2', '\v', '\x63', 
		'\x3', '\x2', '\x2', '\x2', '\r', 'l', '\x3', '\x2', '\x2', '\x2', '\xF', 
		'n', '\x3', '\x2', '\x2', '\x2', '\x11', 'p', '\x3', '\x2', '\x2', '\x2', 
		'\x13', 's', '\x3', '\x2', '\x2', '\x2', '\x15', '{', '\x3', '\x2', '\x2', 
		'\x2', '\x17', '\x80', '\x3', '\x2', '\x2', '\x2', '\x19', '\x87', '\x3', 
		'\x2', '\x2', '\x2', '\x1B', '\x89', '\x3', '\x2', '\x2', '\x2', '\x1D', 
		'\x8C', '\x3', '\x2', '\x2', '\x2', '\x1F', '\x99', '\x3', '\x2', '\x2', 
		'\x2', '!', '\x9E', '\x3', '\x2', '\x2', '\x2', '#', '\xA4', '\x3', '\x2', 
		'\x2', '\x2', '%', '\xA8', '\x3', '\x2', '\x2', '\x2', '\'', '\xAD', '\x3', 
		'\x2', '\x2', '\x2', ')', '\xAF', '\x3', '\x2', '\x2', '\x2', '+', '\xB2', 
		'\x3', '\x2', '\x2', '\x2', '-', '\xB5', '\x3', '\x2', '\x2', '\x2', '/', 
		'\xB8', '\x3', '\x2', '\x2', '\x2', '\x31', '\xBB', '\x3', '\x2', '\x2', 
		'\x2', '\x33', '\xBD', '\x3', '\x2', '\x2', '\x2', '\x35', '\xBF', '\x3', 
		'\x2', '\x2', '\x2', '\x37', '\xC1', '\x3', '\x2', '\x2', '\x2', '\x39', 
		'\xC3', '\x3', '\x2', '\x2', '\x2', ';', '\xC5', '\x3', '\x2', '\x2', 
		'\x2', '=', '\xC7', '\x3', '\x2', '\x2', '\x2', '?', '\xC9', '\x3', '\x2', 
		'\x2', '\x2', '\x41', '\xCB', '\x3', '\x2', '\x2', '\x2', '\x43', '\xCD', 
		'\x3', '\x2', '\x2', '\x2', '\x45', '\xCF', '\x3', '\x2', '\x2', '\x2', 
		'G', '\xD2', '\x3', '\x2', '\x2', '\x2', 'I', '\xD5', '\x3', '\x2', '\x2', 
		'\x2', 'K', '\xD8', '\x3', '\x2', '\x2', '\x2', 'M', '\xDB', '\x3', '\x2', 
		'\x2', '\x2', 'O', '\xDE', '\x3', '\x2', '\x2', '\x2', 'Q', '\xE1', '\x3', 
		'\x2', '\x2', '\x2', 'S', '\xE4', '\x3', '\x2', '\x2', '\x2', 'U', '\xE7', 
		'\x3', '\x2', '\x2', '\x2', 'W', '\xF2', '\x3', '\x2', '\x2', '\x2', 'Y', 
		'\xFD', '\x3', '\x2', '\x2', '\x2', '[', '\\', '\a', '}', '\x2', '\x2', 
		'\\', '\x4', '\x3', '\x2', '\x2', '\x2', ']', '^', '\a', '\x7F', '\x2', 
		'\x2', '^', '\x6', '\x3', '\x2', '\x2', '\x2', '_', '`', '\a', '=', '\x2', 
		'\x2', '`', '\b', '\x3', '\x2', '\x2', '\x2', '\x61', '\x62', '\a', '?', 
		'\x2', '\x2', '\x62', '\n', '\x3', '\x2', '\x2', '\x2', '\x63', '\x64', 
		'\a', 'h', '\x2', '\x2', '\x64', '\x65', '\a', 'w', '\x2', '\x2', '\x65', 
		'\x66', '\a', 'p', '\x2', '\x2', '\x66', 'g', '\a', '\x65', '\x2', '\x2', 
		'g', 'h', '\a', 'v', '\x2', '\x2', 'h', 'i', '\a', 'k', '\x2', '\x2', 
		'i', 'j', '\a', 'q', '\x2', '\x2', 'j', 'k', '\a', 'p', '\x2', '\x2', 
		'k', '\f', '\x3', '\x2', '\x2', '\x2', 'l', 'm', '\a', '.', '\x2', '\x2', 
		'm', '\xE', '\x3', '\x2', '\x2', '\x2', 'n', 'o', '\a', '<', '\x2', '\x2', 
		'o', '\x10', '\x3', '\x2', '\x2', '\x2', 'p', 'q', '\a', 'k', '\x2', '\x2', 
		'q', 'r', '\a', 'h', '\x2', '\x2', 'r', '\x12', '\x3', '\x2', '\x2', '\x2', 
		's', 't', '\a', 'g', '\x2', '\x2', 't', 'u', '\a', 'n', '\x2', '\x2', 
		'u', 'v', '\a', 'u', '\x2', '\x2', 'v', 'w', '\a', 'g', '\x2', '\x2', 
		'w', 'x', '\a', '\"', '\x2', '\x2', 'x', 'y', '\a', 'k', '\x2', '\x2', 
		'y', 'z', '\a', 'h', '\x2', '\x2', 'z', '\x14', '\x3', '\x2', '\x2', '\x2', 
		'{', '|', '\a', 'g', '\x2', '\x2', '|', '}', '\a', 'n', '\x2', '\x2', 
		'}', '~', '\a', 'u', '\x2', '\x2', '~', '\x7F', '\a', 'g', '\x2', '\x2', 
		'\x7F', '\x16', '\x3', '\x2', '\x2', '\x2', '\x80', '\x81', '\a', 't', 
		'\x2', '\x2', '\x81', '\x82', '\a', 'g', '\x2', '\x2', '\x82', '\x83', 
		'\a', 'v', '\x2', '\x2', '\x83', '\x84', '\a', 'w', '\x2', '\x2', '\x84', 
		'\x85', '\a', 't', '\x2', '\x2', '\x85', '\x86', '\a', 'p', '\x2', '\x2', 
		'\x86', '\x18', '\x3', '\x2', '\x2', '\x2', '\x87', '\x88', '\t', '\x2', 
		'\x2', '\x2', '\x88', '\x1A', '\x3', '\x2', '\x2', '\x2', '\x89', '\x8A', 
		'\t', '\x3', '\x2', '\x2', '\x8A', '\x1C', '\x3', '\x2', '\x2', '\x2', 
		'\x8B', '\x8D', '\x5', '\x19', '\r', '\x2', '\x8C', '\x8B', '\x3', '\x2', 
		'\x2', '\x2', '\x8D', '\x8E', '\x3', '\x2', '\x2', '\x2', '\x8E', '\x8C', 
		'\x3', '\x2', '\x2', '\x2', '\x8E', '\x8F', '\x3', '\x2', '\x2', '\x2', 
		'\x8F', '\x97', '\x3', '\x2', '\x2', '\x2', '\x90', '\x94', '\a', '\x30', 
		'\x2', '\x2', '\x91', '\x93', '\x5', '\x19', '\r', '\x2', '\x92', '\x91', 
		'\x3', '\x2', '\x2', '\x2', '\x93', '\x96', '\x3', '\x2', '\x2', '\x2', 
		'\x94', '\x92', '\x3', '\x2', '\x2', '\x2', '\x94', '\x95', '\x3', '\x2', 
		'\x2', '\x2', '\x95', '\x98', '\x3', '\x2', '\x2', '\x2', '\x96', '\x94', 
		'\x3', '\x2', '\x2', '\x2', '\x97', '\x90', '\x3', '\x2', '\x2', '\x2', 
		'\x97', '\x98', '\x3', '\x2', '\x2', '\x2', '\x98', '\x1E', '\x3', '\x2', 
		'\x2', '\x2', '\x99', '\x9A', '\a', 'v', '\x2', '\x2', '\x9A', '\x9B', 
		'\a', 't', '\x2', '\x2', '\x9B', '\x9C', '\a', 'w', '\x2', '\x2', '\x9C', 
		'\x9D', '\a', 'g', '\x2', '\x2', '\x9D', ' ', '\x3', '\x2', '\x2', '\x2', 
		'\x9E', '\x9F', '\a', 'h', '\x2', '\x2', '\x9F', '\xA0', '\a', '\x63', 
		'\x2', '\x2', '\xA0', '\xA1', '\a', 'n', '\x2', '\x2', '\xA1', '\xA2', 
		'\a', 'u', '\x2', '\x2', '\xA2', '\xA3', '\a', 'g', '\x2', '\x2', '\xA3', 
		'\"', '\x3', '\x2', '\x2', '\x2', '\xA4', '\xA5', '\a', 'x', '\x2', '\x2', 
		'\xA5', '\xA6', '\a', '\x63', '\x2', '\x2', '\xA6', '\xA7', '\a', 't', 
		'\x2', '\x2', '\xA7', '$', '\x3', '\x2', '\x2', '\x2', '\xA8', '\xA9', 
		'\a', 'p', '\x2', '\x2', '\xA9', '\xAA', '\a', 'w', '\x2', '\x2', '\xAA', 
		'\xAB', '\a', 'n', '\x2', '\x2', '\xAB', '\xAC', '\a', 'n', '\x2', '\x2', 
		'\xAC', '&', '\x3', '\x2', '\x2', '\x2', '\xAD', '\xAE', '\a', '#', '\x2', 
		'\x2', '\xAE', '(', '\x3', '\x2', '\x2', '\x2', '\xAF', '\xB0', '\a', 
		'-', '\x2', '\x2', '\xB0', '\xB1', '\a', '-', '\x2', '\x2', '\xB1', '*', 
		'\x3', '\x2', '\x2', '\x2', '\xB2', '\xB3', '\a', '/', '\x2', '\x2', '\xB3', 
		'\xB4', '\a', '/', '\x2', '\x2', '\xB4', ',', '\x3', '\x2', '\x2', '\x2', 
		'\xB5', '\xB6', '\a', '(', '\x2', '\x2', '\xB6', '\xB7', '\a', '(', '\x2', 
		'\x2', '\xB7', '.', '\x3', '\x2', '\x2', '\x2', '\xB8', '\xB9', '\a', 
		'~', '\x2', '\x2', '\xB9', '\xBA', '\a', '~', '\x2', '\x2', '\xBA', '\x30', 
		'\x3', '\x2', '\x2', '\x2', '\xBB', '\xBC', '\a', '\x30', '\x2', '\x2', 
		'\xBC', '\x32', '\x3', '\x2', '\x2', '\x2', '\xBD', '\xBE', '\a', '-', 
		'\x2', '\x2', '\xBE', '\x34', '\x3', '\x2', '\x2', '\x2', '\xBF', '\xC0', 
		'\a', '/', '\x2', '\x2', '\xC0', '\x36', '\x3', '\x2', '\x2', '\x2', '\xC1', 
		'\xC2', '\a', ',', '\x2', '\x2', '\xC2', '\x38', '\x3', '\x2', '\x2', 
		'\x2', '\xC3', '\xC4', '\a', '\x31', '\x2', '\x2', '\xC4', ':', '\x3', 
		'\x2', '\x2', '\x2', '\xC5', '\xC6', '\a', '\'', '\x2', '\x2', '\xC6', 
		'<', '\x3', '\x2', '\x2', '\x2', '\xC7', '\xC8', '\a', '*', '\x2', '\x2', 
		'\xC8', '>', '\x3', '\x2', '\x2', '\x2', '\xC9', '\xCA', '\a', '+', '\x2', 
		'\x2', '\xCA', '@', '\x3', '\x2', '\x2', '\x2', '\xCB', '\xCC', '\a', 
		'@', '\x2', '\x2', '\xCC', '\x42', '\x3', '\x2', '\x2', '\x2', '\xCD', 
		'\xCE', '\a', '>', '\x2', '\x2', '\xCE', '\x44', '\x3', '\x2', '\x2', 
		'\x2', '\xCF', '\xD0', '\a', '@', '\x2', '\x2', '\xD0', '\xD1', '\a', 
		'?', '\x2', '\x2', '\xD1', '\x46', '\x3', '\x2', '\x2', '\x2', '\xD2', 
		'\xD3', '\a', '>', '\x2', '\x2', '\xD3', '\xD4', '\a', '?', '\x2', '\x2', 
		'\xD4', 'H', '\x3', '\x2', '\x2', '\x2', '\xD5', '\xD6', '\a', '?', '\x2', 
		'\x2', '\xD6', '\xD7', '\a', '?', '\x2', '\x2', '\xD7', 'J', '\x3', '\x2', 
		'\x2', '\x2', '\xD8', '\xD9', '\a', '#', '\x2', '\x2', '\xD9', '\xDA', 
		'\a', '?', '\x2', '\x2', '\xDA', 'L', '\x3', '\x2', '\x2', '\x2', '\xDB', 
		'\xDC', '\a', '-', '\x2', '\x2', '\xDC', '\xDD', '\a', '?', '\x2', '\x2', 
		'\xDD', 'N', '\x3', '\x2', '\x2', '\x2', '\xDE', '\xDF', '\a', '/', '\x2', 
		'\x2', '\xDF', '\xE0', '\a', '?', '\x2', '\x2', '\xE0', 'P', '\x3', '\x2', 
		'\x2', '\x2', '\xE1', '\xE2', '\a', ',', '\x2', '\x2', '\xE2', '\xE3', 
		'\a', '?', '\x2', '\x2', '\xE3', 'R', '\x3', '\x2', '\x2', '\x2', '\xE4', 
		'\xE5', '\a', '\x31', '\x2', '\x2', '\xE5', '\xE6', '\a', '?', '\x2', 
		'\x2', '\xE6', 'T', '\x3', '\x2', '\x2', '\x2', '\xE7', '\xEB', '\a', 
		'$', '\x2', '\x2', '\xE8', '\xEA', '\v', '\x2', '\x2', '\x2', '\xE9', 
		'\xE8', '\x3', '\x2', '\x2', '\x2', '\xEA', '\xED', '\x3', '\x2', '\x2', 
		'\x2', '\xEB', '\xEC', '\x3', '\x2', '\x2', '\x2', '\xEB', '\xE9', '\x3', 
		'\x2', '\x2', '\x2', '\xEC', '\xEE', '\x3', '\x2', '\x2', '\x2', '\xED', 
		'\xEB', '\x3', '\x2', '\x2', '\x2', '\xEE', '\xEF', '\a', '$', '\x2', 
		'\x2', '\xEF', 'V', '\x3', '\x2', '\x2', '\x2', '\xF0', '\xF3', '\x5', 
		'\x1B', '\xE', '\x2', '\xF1', '\xF3', '\a', '\x61', '\x2', '\x2', '\xF2', 
		'\xF0', '\x3', '\x2', '\x2', '\x2', '\xF2', '\xF1', '\x3', '\x2', '\x2', 
		'\x2', '\xF3', '\xF9', '\x3', '\x2', '\x2', '\x2', '\xF4', '\xF8', '\x5', 
		'\x1B', '\xE', '\x2', '\xF5', '\xF8', '\a', '\x61', '\x2', '\x2', '\xF6', 
		'\xF8', '\x5', '\x19', '\r', '\x2', '\xF7', '\xF4', '\x3', '\x2', '\x2', 
		'\x2', '\xF7', '\xF5', '\x3', '\x2', '\x2', '\x2', '\xF7', '\xF6', '\x3', 
		'\x2', '\x2', '\x2', '\xF8', '\xFB', '\x3', '\x2', '\x2', '\x2', '\xF9', 
		'\xF7', '\x3', '\x2', '\x2', '\x2', '\xF9', '\xFA', '\x3', '\x2', '\x2', 
		'\x2', '\xFA', 'X', '\x3', '\x2', '\x2', '\x2', '\xFB', '\xF9', '\x3', 
		'\x2', '\x2', '\x2', '\xFC', '\xFE', '\t', '\x4', '\x2', '\x2', '\xFD', 
		'\xFC', '\x3', '\x2', '\x2', '\x2', '\xFE', '\xFF', '\x3', '\x2', '\x2', 
		'\x2', '\xFF', '\xFD', '\x3', '\x2', '\x2', '\x2', '\xFF', '\x100', '\x3', 
		'\x2', '\x2', '\x2', '\x100', '\x101', '\x3', '\x2', '\x2', '\x2', '\x101', 
		'\x102', '\b', '-', '\x2', '\x2', '\x102', 'Z', '\x3', '\x2', '\x2', '\x2', 
		'\v', '\x2', '\x8E', '\x94', '\x97', '\xEB', '\xF2', '\xF7', '\xF9', '\xFF', 
		'\x3', '\b', '\x2', '\x2',
	};

	public static readonly ATN _ATN =
		new ATNDeserializer().Deserialize(_serializedATN);


}
