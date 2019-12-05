// Generated from C:/Repositories/ImperativeLanguageCompiler/src/i_grammar\I.g4 by ANTLR 4.7.2
package i_grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link IParser}.
 */
public interface IListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link IParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(IParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link IParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(IParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link IParser#simple_declaration}.
	 * @param ctx the parse tree
	 */
	void enterSimple_declaration(IParser.Simple_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link IParser#simple_declaration}.
	 * @param ctx the parse tree
	 */
	void exitSimple_declaration(IParser.Simple_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link IParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declaration(IParser.Variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link IParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declaration(IParser.Variable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link IParser#type_declaration}.
	 * @param ctx the parse tree
	 */
	void enterType_declaration(IParser.Type_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link IParser#type_declaration}.
	 * @param ctx the parse tree
	 */
	void exitType_declaration(IParser.Type_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link IParser#routine_declaration}.
	 * @param ctx the parse tree
	 */
	void enterRoutine_declaration(IParser.Routine_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link IParser#routine_declaration}.
	 * @param ctx the parse tree
	 */
	void exitRoutine_declaration(IParser.Routine_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link IParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(IParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link IParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(IParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link IParser#parameter_declaration}.
	 * @param ctx the parse tree
	 */
	void enterParameter_declaration(IParser.Parameter_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link IParser#parameter_declaration}.
	 * @param ctx the parse tree
	 */
	void exitParameter_declaration(IParser.Parameter_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link IParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(IParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link IParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(IParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link IParser#primitive_type}.
	 * @param ctx the parse tree
	 */
	void enterPrimitive_type(IParser.Primitive_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link IParser#primitive_type}.
	 * @param ctx the parse tree
	 */
	void exitPrimitive_type(IParser.Primitive_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link IParser#record_type}.
	 * @param ctx the parse tree
	 */
	void enterRecord_type(IParser.Record_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link IParser#record_type}.
	 * @param ctx the parse tree
	 */
	void exitRecord_type(IParser.Record_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link IParser#array_type}.
	 * @param ctx the parse tree
	 */
	void enterArray_type(IParser.Array_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link IParser#array_type}.
	 * @param ctx the parse tree
	 */
	void exitArray_type(IParser.Array_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link IParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(IParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link IParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(IParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link IParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(IParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link IParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(IParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link IParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(IParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link IParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(IParser.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link IParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(IParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link IParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(IParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link IParser#routine_call}.
	 * @param ctx the parse tree
	 */
	void enterRoutine_call(IParser.Routine_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link IParser#routine_call}.
	 * @param ctx the parse tree
	 */
	void exitRoutine_call(IParser.Routine_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link IParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void enterWhile_loop(IParser.While_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link IParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void exitWhile_loop(IParser.While_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link IParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void enterFor_loop(IParser.For_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link IParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void exitFor_loop(IParser.For_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link IParser#range}.
	 * @param ctx the parse tree
	 */
	void enterRange(IParser.RangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link IParser#range}.
	 * @param ctx the parse tree
	 */
	void exitRange(IParser.RangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link IParser#foreach_loop}.
	 * @param ctx the parse tree
	 */
	void enterForeach_loop(IParser.Foreach_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link IParser#foreach_loop}.
	 * @param ctx the parse tree
	 */
	void exitForeach_loop(IParser.Foreach_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link IParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(IParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link IParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(IParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link IParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(IParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link IParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(IParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link IParser#relation}.
	 * @param ctx the parse tree
	 */
	void enterRelation(IParser.RelationContext ctx);
	/**
	 * Exit a parse tree produced by {@link IParser#relation}.
	 * @param ctx the parse tree
	 */
	void exitRelation(IParser.RelationContext ctx);
	/**
	 * Enter a parse tree produced by {@link IParser#simple}.
	 * @param ctx the parse tree
	 */
	void enterSimple(IParser.SimpleContext ctx);
	/**
	 * Exit a parse tree produced by {@link IParser#simple}.
	 * @param ctx the parse tree
	 */
	void exitSimple(IParser.SimpleContext ctx);
	/**
	 * Enter a parse tree produced by {@link IParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(IParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link IParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(IParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link IParser#summand}.
	 * @param ctx the parse tree
	 */
	void enterSummand(IParser.SummandContext ctx);
	/**
	 * Exit a parse tree produced by {@link IParser#summand}.
	 * @param ctx the parse tree
	 */
	void exitSummand(IParser.SummandContext ctx);
	/**
	 * Enter a parse tree produced by {@link IParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(IParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link IParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(IParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link IParser#modifiable_primary}.
	 * @param ctx the parse tree
	 */
	void enterModifiable_primary(IParser.Modifiable_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link IParser#modifiable_primary}.
	 * @param ctx the parse tree
	 */
	void exitModifiable_primary(IParser.Modifiable_primaryContext ctx);
}