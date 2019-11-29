// Generated from ImperativeLanguage.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ImperativeLanguageParser}.
 */
public interface ImperativeLanguageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ImperativeLanguageParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(ImperativeLanguageParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperativeLanguageParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(ImperativeLanguageParser.OperationContext ctx);
}