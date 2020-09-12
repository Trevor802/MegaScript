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

using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using IToken = Antlr4.Runtime.IToken;

/// <summary>
/// This interface defines a complete generic visitor for a parse tree produced
/// by <see cref="CalculatorParser"/>.
/// </summary>
/// <typeparam name="Result">The return type of the visit operation.</typeparam>
[System.CodeDom.Compiler.GeneratedCode("ANTLR", "4.8")]
[System.CLSCompliant(false)]
public interface ICalculatorVisitor<Result> : IParseTreeVisitor<Result> {
	/// <summary>
	/// Visit a parse tree produced by <see cref="CalculatorParser.program"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitProgram([NotNull] CalculatorParser.ProgramContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="CalculatorParser.block"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitBlock([NotNull] CalculatorParser.BlockContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="CalculatorParser.statement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitStatement([NotNull] CalculatorParser.StatementContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="CalculatorParser.declaration"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitDeclaration([NotNull] CalculatorParser.DeclarationContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="CalculatorParser.fieldDeclaration"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitFieldDeclaration([NotNull] CalculatorParser.FieldDeclarationContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="CalculatorParser.object"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitObject([NotNull] CalculatorParser.ObjectContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="CalculatorParser.assignment"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitAssignment([NotNull] CalculatorParser.AssignmentContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="CalculatorParser.invocation"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitInvocation([NotNull] CalculatorParser.InvocationContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="CalculatorParser.paramList"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitParamList([NotNull] CalculatorParser.ParamListContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="CalculatorParser.ifStmt"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitIfStmt([NotNull] CalculatorParser.IfStmtContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="CalculatorParser.incrementExpr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitIncrementExpr([NotNull] CalculatorParser.IncrementExprContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="CalculatorParser.decrementExpr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitDecrementExpr([NotNull] CalculatorParser.DecrementExprContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="CalculatorParser.expression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitExpression([NotNull] CalculatorParser.ExpressionContext context);
}
