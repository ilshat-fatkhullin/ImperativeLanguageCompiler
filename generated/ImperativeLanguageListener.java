// Generated from ImperativeLanguage.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ImperativeLanguageParser}.
 */
public interface ImperativeLanguageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ImperativeLanguageParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ImperativeLanguageParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperativeLanguageParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ImperativeLanguageParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperativeLanguageParser#simple_declaration}.
	 * @param ctx the parse tree
	 */
	void enterSimple_declaration(ImperativeLanguageParser.Simple_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperativeLanguageParser#simple_declaration}.
	 * @param ctx the parse tree
	 */
	void exitSimple_declaration(ImperativeLanguageParser.Simple_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperativeLanguageParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declaration(ImperativeLanguageParser.Variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperativeLanguageParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declaration(ImperativeLanguageParser.Variable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperativeLanguageParser#type_declaration}.
	 * @param ctx the parse tree
	 */
	void enterType_declaration(ImperativeLanguageParser.Type_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperativeLanguageParser#type_declaration}.
	 * @param ctx the parse tree
	 */
	void exitType_declaration(ImperativeLanguageParser.Type_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperativeLanguageParser#routine_declaration}.
	 * @param ctx the parse tree
	 */
	void enterRoutine_declaration(ImperativeLanguageParser.Routine_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperativeLanguageParser#routine_declaration}.
	 * @param ctx the parse tree
	 */
	void exitRoutine_declaration(ImperativeLanguageParser.Routine_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperativeLanguageParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(ImperativeLanguageParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperativeLanguageParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(ImperativeLanguageParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperativeLanguageParser#parameter_declaration}.
	 * @param ctx the parse tree
	 */
	void enterParameter_declaration(ImperativeLanguageParser.Parameter_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperativeLanguageParser#parameter_declaration}.
	 * @param ctx the parse tree
	 */
	void exitParameter_declaration(ImperativeLanguageParser.Parameter_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperativeLanguageParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(ImperativeLanguageParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperativeLanguageParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(ImperativeLanguageParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperativeLanguageParser#primitive_type}.
	 * @param ctx the parse tree
	 */
	void enterPrimitive_type(ImperativeLanguageParser.Primitive_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperativeLanguageParser#primitive_type}.
	 * @param ctx the parse tree
	 */
	void exitPrimitive_type(ImperativeLanguageParser.Primitive_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperativeLanguageParser#record_type}.
	 * @param ctx the parse tree
	 */
	void enterRecord_type(ImperativeLanguageParser.Record_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperativeLanguageParser#record_type}.
	 * @param ctx the parse tree
	 */
	void exitRecord_type(ImperativeLanguageParser.Record_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperativeLanguageParser#array_type}.
	 * @param ctx the parse tree
	 */
	void enterArray_type(ImperativeLanguageParser.Array_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperativeLanguageParser#array_type}.
	 * @param ctx the parse tree
	 */
	void exitArray_type(ImperativeLanguageParser.Array_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperativeLanguageParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(ImperativeLanguageParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperativeLanguageParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(ImperativeLanguageParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperativeLanguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ImperativeLanguageParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperativeLanguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ImperativeLanguageParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperativeLanguageParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(ImperativeLanguageParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperativeLanguageParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(ImperativeLanguageParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperativeLanguageParser#routine_call}.
	 * @param ctx the parse tree
	 */
	void enterRoutine_call(ImperativeLanguageParser.Routine_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperativeLanguageParser#routine_call}.
	 * @param ctx the parse tree
	 */
	void exitRoutine_call(ImperativeLanguageParser.Routine_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperativeLanguageParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void enterWhile_loop(ImperativeLanguageParser.While_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperativeLanguageParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void exitWhile_loop(ImperativeLanguageParser.While_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperativeLanguageParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void enterFor_loop(ImperativeLanguageParser.For_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperativeLanguageParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void exitFor_loop(ImperativeLanguageParser.For_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperativeLanguageParser#range}.
	 * @param ctx the parse tree
	 */
	void enterRange(ImperativeLanguageParser.RangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperativeLanguageParser#range}.
	 * @param ctx the parse tree
	 */
	void exitRange(ImperativeLanguageParser.RangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperativeLanguageParser#foreach_loop}.
	 * @param ctx the parse tree
	 */
	void enterForeach_loop(ImperativeLanguageParser.Foreach_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperativeLanguageParser#foreach_loop}.
	 * @param ctx the parse tree
	 */
	void exitForeach_loop(ImperativeLanguageParser.Foreach_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperativeLanguageParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(ImperativeLanguageParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperativeLanguageParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(ImperativeLanguageParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperativeLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ImperativeLanguageParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperativeLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ImperativeLanguageParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperativeLanguageParser#relation}.
	 * @param ctx the parse tree
	 */
	void enterRelation(ImperativeLanguageParser.RelationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperativeLanguageParser#relation}.
	 * @param ctx the parse tree
	 */
	void exitRelation(ImperativeLanguageParser.RelationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperativeLanguageParser#simple}.
	 * @param ctx the parse tree
	 */
	void enterSimple(ImperativeLanguageParser.SimpleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperativeLanguageParser#simple}.
	 * @param ctx the parse tree
	 */
	void exitSimple(ImperativeLanguageParser.SimpleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperativeLanguageParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(ImperativeLanguageParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperativeLanguageParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(ImperativeLanguageParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperativeLanguageParser#summand}.
	 * @param ctx the parse tree
	 */
	void enterSummand(ImperativeLanguageParser.SummandContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperativeLanguageParser#summand}.
	 * @param ctx the parse tree
	 */
	void exitSummand(ImperativeLanguageParser.SummandContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperativeLanguageParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(ImperativeLanguageParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperativeLanguageParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(ImperativeLanguageParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperativeLanguageParser#modifiable_primary}.
	 * @param ctx the parse tree
	 */
	void enterModifiable_primary(ImperativeLanguageParser.Modifiable_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperativeLanguageParser#modifiable_primary}.
	 * @param ctx the parse tree
	 */
	void exitModifiable_primary(ImperativeLanguageParser.Modifiable_primaryContext ctx);
}