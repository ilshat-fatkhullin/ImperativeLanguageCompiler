// Generated from C:/Repositories/ImperativeLanguageCompiler/src/i_grammar\I.g4 by ANTLR 4.7.2
package i_grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link IParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface IVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link IParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(IParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link IParser#simple_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_declaration(IParser.Simple_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link IParser#variable_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_declaration(IParser.Variable_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link IParser#type_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_declaration(IParser.Type_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link IParser#routine_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoutine_declaration(IParser.Routine_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link IParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(IParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link IParser#parameter_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_declaration(IParser.Parameter_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link IParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(IParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link IParser#primitive_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitive_type(IParser.Primitive_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link IParser#record_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecord_type(IParser.Record_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link IParser#array_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_type(IParser.Array_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link IParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(IParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link IParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(IParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link IParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(IParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link IParser#routine_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoutine_call(IParser.Routine_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link IParser#while_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_loop(IParser.While_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link IParser#for_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_loop(IParser.For_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link IParser#range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange(IParser.RangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link IParser#foreach_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeach_loop(IParser.Foreach_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link IParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(IParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link IParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(IParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link IParser#relation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelation(IParser.RelationContext ctx);
	/**
	 * Visit a parse tree produced by {@link IParser#simple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple(IParser.SimpleContext ctx);
	/**
	 * Visit a parse tree produced by {@link IParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(IParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link IParser#summand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSummand(IParser.SummandContext ctx);
	/**
	 * Visit a parse tree produced by {@link IParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(IParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link IParser#modifiable_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifiable_primary(IParser.Modifiable_primaryContext ctx);
}