// Generated from Calculator.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalculatorParser}.
 */
public interface CalculatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CalculatorParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CalculatorParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(CalculatorParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(CalculatorParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CalculatorParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CalculatorParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#loopStmt}.
	 * @param ctx the parse tree
	 */
	void enterLoopStmt(CalculatorParser.LoopStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#loopStmt}.
	 * @param ctx the parse tree
	 */
	void exitLoopStmt(CalculatorParser.LoopStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(CalculatorParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(CalculatorParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#funcDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFuncDeclaration(CalculatorParser.FuncDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#funcDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFuncDeclaration(CalculatorParser.FuncDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#varList}.
	 * @param ctx the parse tree
	 */
	void enterVarList(CalculatorParser.VarListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#varList}.
	 * @param ctx the parse tree
	 */
	void exitVarList(CalculatorParser.VarListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(CalculatorParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(CalculatorParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(CalculatorParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(CalculatorParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(CalculatorParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(CalculatorParser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(CalculatorParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(CalculatorParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#forAssign}.
	 * @param ctx the parse tree
	 */
	void enterForAssign(CalculatorParser.ForAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#forAssign}.
	 * @param ctx the parse tree
	 */
	void exitForAssign(CalculatorParser.ForAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#paramList}.
	 * @param ctx the parse tree
	 */
	void enterParamList(CalculatorParser.ParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#paramList}.
	 * @param ctx the parse tree
	 */
	void exitParamList(CalculatorParser.ParamListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(CalculatorParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(CalculatorParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void enterForStmt(CalculatorParser.ForStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void exitForStmt(CalculatorParser.ForStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(CalculatorParser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(CalculatorParser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#doWhileStmt}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileStmt(CalculatorParser.DoWhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#doWhileStmt}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileStmt(CalculatorParser.DoWhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#foreachStmt}.
	 * @param ctx the parse tree
	 */
	void enterForeachStmt(CalculatorParser.ForeachStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#foreachStmt}.
	 * @param ctx the parse tree
	 */
	void exitForeachStmt(CalculatorParser.ForeachStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#retStmt}.
	 * @param ctx the parse tree
	 */
	void enterRetStmt(CalculatorParser.RetStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#retStmt}.
	 * @param ctx the parse tree
	 */
	void exitRetStmt(CalculatorParser.RetStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#breakStmt}.
	 * @param ctx the parse tree
	 */
	void enterBreakStmt(CalculatorParser.BreakStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#breakStmt}.
	 * @param ctx the parse tree
	 */
	void exitBreakStmt(CalculatorParser.BreakStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#continueStmt}.
	 * @param ctx the parse tree
	 */
	void enterContinueStmt(CalculatorParser.ContinueStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#continueStmt}.
	 * @param ctx the parse tree
	 */
	void exitContinueStmt(CalculatorParser.ContinueStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#incrementExpr}.
	 * @param ctx the parse tree
	 */
	void enterIncrementExpr(CalculatorParser.IncrementExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#incrementExpr}.
	 * @param ctx the parse tree
	 */
	void exitIncrementExpr(CalculatorParser.IncrementExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#decrementExpr}.
	 * @param ctx the parse tree
	 */
	void enterDecrementExpr(CalculatorParser.DecrementExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#decrementExpr}.
	 * @param ctx the parse tree
	 */
	void exitDecrementExpr(CalculatorParser.DecrementExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CalculatorParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CalculatorParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#invocation}.
	 * @param ctx the parse tree
	 */
	void enterInvocation(CalculatorParser.InvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#invocation}.
	 * @param ctx the parse tree
	 */
	void exitInvocation(CalculatorParser.InvocationContext ctx);
}