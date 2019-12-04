// Generated from ImperativeLanguage.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ImperativeLanguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PLUS=1, MINUS=2, MULTIPLICATION=3, DIVISION=4, MOD=5, TRUE=6, FALSE=7, 
		LESS=8, LESS_OR_EQUAL=9, GREATER=10, GREATER_OR_EQUAL=11, EQUAL=12, NOT_EQUAL=13, 
		ASSIGN=14, AND=15, OR=16, XOR=17, IF=18, THEN=19, ELSE=20, END=21, FOREACH=22, 
		FROM=23, LOOP=24, IN=25, REVERSE=26, FOR=27, WHILE=28, ARRAY=29, RECORD=30, 
		INTEGER=31, REAL=32, BOOLEAN=33, ROUTINE=34, TYPE=35, IS=36, VAR=37, COLON=38, 
		DOT=39, DOTDOT=40, COMMA=41, LPAREN=42, RPAREN=43, IDENTIFIER=44, INTEGER_LITERAL=45, 
		REAL_LITERAL=46, WS=47;
	public static final int
		RULE_program = 0, RULE_simple_declaration = 1, RULE_variable_declaration = 2, 
		RULE_type_declaration = 3, RULE_routine_declaration = 4, RULE_parameters = 5, 
		RULE_parameter_declaration = 6, RULE_type = 7, RULE_primitive_type = 8, 
		RULE_record_type = 9, RULE_array_type = 10, RULE_body = 11, RULE_statement = 12, 
		RULE_assignment = 13, RULE_routine_call = 14, RULE_while_loop = 15, RULE_for_loop = 16, 
		RULE_range = 17, RULE_foreach_loop = 18, RULE_if_statement = 19, RULE_expression = 20, 
		RULE_relation = 21, RULE_simple = 22, RULE_factor = 23, RULE_summand = 24, 
		RULE_primary = 25, RULE_modifiable_primary = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "simple_declaration", "variable_declaration", "type_declaration", 
			"routine_declaration", "parameters", "parameter_declaration", "type", 
			"primitive_type", "record_type", "array_type", "body", "statement", "assignment", 
			"routine_call", "while_loop", "for_loop", "range", "foreach_loop", "if_statement", 
			"expression", "relation", "simple", "factor", "summand", "primary", "modifiable_primary"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'*'", "'/'", "'%'", "'true'", "'false'", "'<'", 
			"'<='", "'>'", "'>='", "'='", "'/='", "':='", "'and'", "'or'", "'xor'", 
			"'if'", "'then'", "'else'", "'end'", "'foreach'", "'from'", "'loop'", 
			"'in'", "'reverse'", "'for'", "'while'", "'array'", "'record'", "'integer'", 
			"'real'", "'boolean'", "'routine'", "'type'", "'is'", "'var'", "':'", 
			"'.'", "'..'", "','", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PLUS", "MINUS", "MULTIPLICATION", "DIVISION", "MOD", "TRUE", "FALSE", 
			"LESS", "LESS_OR_EQUAL", "GREATER", "GREATER_OR_EQUAL", "EQUAL", "NOT_EQUAL", 
			"ASSIGN", "AND", "OR", "XOR", "IF", "THEN", "ELSE", "END", "FOREACH", 
			"FROM", "LOOP", "IN", "REVERSE", "FOR", "WHILE", "ARRAY", "RECORD", "INTEGER", 
			"REAL", "BOOLEAN", "ROUTINE", "TYPE", "IS", "VAR", "COLON", "DOT", "DOTDOT", 
			"COMMA", "LPAREN", "RPAREN", "IDENTIFIER", "INTEGER_LITERAL", "REAL_LITERAL", 
			"WS"
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
	public String getGrammarFileName() { return "generated/ImperativeLanguage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ImperativeLanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public Simple_declarationContext simple_declaration() {
			return getRuleContext(Simple_declarationContext.class,0);
		}
		public Routine_declarationContext routine_declaration() {
			return getRuleContext(Routine_declarationContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageListener ) ((ImperativeLanguageListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageListener ) ((ImperativeLanguageListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE:
			case VAR:
				{
				setState(54);
				simple_declaration();
				}
				break;
			case ROUTINE:
				{
				setState(55);
				routine_declaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Simple_declarationContext extends ParserRuleContext {
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public Type_declarationContext type_declaration() {
			return getRuleContext(Type_declarationContext.class,0);
		}
		public Simple_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageListener ) ((ImperativeLanguageListener)listener).enterSimple_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageListener ) ((ImperativeLanguageListener)listener).exitSimple_declaration(this);
		}
	}

	public final Simple_declarationContext simple_declaration() throws RecognitionException {
		Simple_declarationContext _localctx = new Simple_declarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_simple_declaration);
		try {
			setState(60);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				variable_declaration();
				}
				break;
			case TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				type_declaration();
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

	public static class Variable_declarationContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(ImperativeLanguageParser.VAR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ImperativeLanguageParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(ImperativeLanguageParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IS() { return getToken(ImperativeLanguageParser.IS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageListener ) ((ImperativeLanguageListener)listener).enterVariable_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageListener ) ((ImperativeLanguageListener)listener).exitVariable_declaration(this);
		}
	}

	public final Variable_declarationContext variable_declaration() throws RecognitionException {
		Variable_declarationContext _localctx = new Variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variable_declaration);
		try {
			setState(73);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				match(VAR);
				setState(63);
				match(IDENTIFIER);
				setState(64);
				match(COLON);
				setState(65);
				type();
				{
				setState(66);
				match(IS);
				setState(67);
				expression();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				match(VAR);
				setState(70);
				match(IDENTIFIER);
				setState(71);
				match(IS);
				setState(72);
				expression();
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

	public static class Type_declarationContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(ImperativeLanguageParser.TYPE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ImperativeLanguageParser.IDENTIFIER, 0); }
		public TerminalNode IS() { return getToken(ImperativeLanguageParser.IS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Type_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageListener ) ((ImperativeLanguageListener)listener).enterType_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageListener ) ((ImperativeLanguageListener)listener).exitType_declaration(this);
		}
	}

	public final Type_declarationContext type_declaration() throws RecognitionException {
		Type_declarationContext _localctx = new Type_declarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_type_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(TYPE);
			setState(76);
			match(IDENTIFIER);
			setState(77);
			match(IS);
			setState(78);
			type();
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

	public static class Routine_declarationContext extends ParserRuleContext {
		public TerminalNode ROUTINE() { return getToken(ImperativeLanguageParser.ROUTINE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ImperativeLanguageParser.IDENTIFIER, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ImperativeLanguageParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IS() { return getToken(ImperativeLanguageParser.IS, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode END() { return getToken(ImperativeLanguageParser.END, 0); }
		public Routine_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routine_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageListener ) ((ImperativeLanguageListener)listener).enterRoutine_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageListener ) ((ImperativeLanguageListener)listener).exitRoutine_declaration(this);
		}
	}

	public final Routine_declarationContext routine_declaration() throws RecognitionException {
		Routine_declarationContext _localctx = new Routine_declarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_routine_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(ROUTINE);
			setState(81);
			match(IDENTIFIER);
			setState(82);
			parameters();
			setState(83);
			match(COLON);
			setState(84);
			type();
			setState(85);
			match(IS);
			setState(86);
			body();
			setState(87);
			match(END);
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

	public static class ParametersContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(ImperativeLanguageParser.LPAREN, 0); }
		public List<Parameter_declarationContext> parameter_declaration() {
			return getRuleContexts(Parameter_declarationContext.class);
		}
		public Parameter_declarationContext parameter_declaration(int i) {
			return getRuleContext(Parameter_declarationContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(ImperativeLanguageParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ImperativeLanguageParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ImperativeLanguageParser.COMMA, i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageListener ) ((ImperativeLanguageListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageListener ) ((ImperativeLanguageListener)listener).exitParameters(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(LPAREN);
			setState(90);
			parameter_declaration();
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(91);
				match(COMMA);
				setState(92);
				parameter_declaration();
				}
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(98);
			match(RPAREN);
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

	public static class Parameter_declarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ImperativeLanguageParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(ImperativeLanguageParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Parameter_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageListener ) ((ImperativeLanguageListener)listener).enterParameter_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageListener ) ((ImperativeLanguageListener)listener).exitParameter_declaration(this);
		}
	}

	public final Parameter_declarationContext parameter_declaration() throws RecognitionException {
		Parameter_declarationContext _localctx = new Parameter_declarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parameter_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(IDENTIFIER);
			setState(101);
			match(COLON);
			setState(102);
			type();
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

	public static class TypeContext extends ParserRuleContext {
		public Primitive_typeContext primitive_type() {
			return getRuleContext(Primitive_typeContext.class,0);
		}
		public Array_typeContext array_type() {
			return getRuleContext(Array_typeContext.class,0);
		}
		public Record_typeContext record_type() {
			return getRuleContext(Record_typeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(ImperativeLanguageParser.IDENTIFIER, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageListener ) ((ImperativeLanguageListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageListener ) ((ImperativeLanguageListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_type);
		try {
			setState(108);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
			case REAL:
			case BOOLEAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				primitive_type();
				}
				break;
			case ARRAY:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				array_type();
				}
				break;
			case RECORD:
				enterOuterAlt(_localctx, 3);
				{
				setState(106);
				record_type();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(107);
				match(IDENTIFIER);
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

	public static class Primitive_typeContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(ImperativeLanguageParser.INTEGER, 0); }
		public TerminalNode REAL() { return getToken(ImperativeLanguageParser.REAL, 0); }
		public TerminalNode BOOLEAN() { return getToken(ImperativeLanguageParser.BOOLEAN, 0); }
		public Primitive_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitive_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageListener ) ((ImperativeLanguageListener)listener).enterPrimitive_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageListener ) ((ImperativeLanguageListener)listener).exitPrimitive_type(this);
		}
	}

	public final Primitive_typeContext primitive_type() throws RecognitionException {
		Primitive_typeContext _localctx = new Primitive_typeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_primitive_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << REAL) | (1L << BOOLEAN))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Record_typeContext extends ParserRuleContext {
		public TerminalNode RECORD() { return getToken(ImperativeLanguageParser.RECORD, 0); }
		public TerminalNode END() { return getToken(ImperativeLanguageParser.END, 0); }
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public Record_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_record_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageListener ) ((ImperativeLanguageListener)listener).enterRecord_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageListener ) ((ImperativeLanguageListener)listener).exitRecord_type(this);
		}
	}

	public final Record_typeContext record_type() throws RecognitionException {
		Record_typeContext _localctx = new Record_typeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_record_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(RECORD);
			{
			setState(113);
			variable_declaration();
			}
			setState(114);
			match(END);
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

	public static class Array_typeContext extends ParserRuleContext {
		public TerminalNode ARRAY() { return getToken(ImperativeLanguageParser.ARRAY, 0); }
		public TerminalNode LPAREN() { return getToken(ImperativeLanguageParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ImperativeLanguageParser.RPAREN, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Array_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageListener ) ((ImperativeLanguageListener)listener).enterArray_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageListener ) ((ImperativeLanguageListener)listener).exitArray_type(this);
		}
	}

	public final Array_typeContext array_type() throws RecognitionException {
		Array_typeContext _localctx = new Array_typeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_array_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(ARRAY);
			setState(117);
			match(LPAREN);
			setState(118);
			expression();
			setState(119);
			match(RPAREN);
			setState(120);
			type();
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

	public static class BodyContext extends ParserRuleContext {
		public Simple_declarationContext simple_declaration() {
			return getRuleContext(Simple_declarationContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageListener ) ((ImperativeLanguageListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageListener ) ((ImperativeLanguageListener)listener).exitBody(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPE || _la==VAR) {
				{
				setState(122);
				simple_declaration();
				}
			}

			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOREACH) | (1L << FOR) | (1L << WHILE) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(125);
				statement();
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

	public static class StatementContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public Routine_callContext routine_call() {
			return getRuleContext(Routine_callContext.class,0);
		}
		public While_loopContext while_loop() {
			return getRuleContext(While_loopContext.class,0);
		}
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public Foreach_loopContext foreach_loop() {
			return getRuleContext(Foreach_loopContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageListener ) ((ImperativeLanguageListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageListener ) ((ImperativeLanguageListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_statement);
		try {
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				routine_call();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(130);
				while_loop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(131);
				for_loop();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(132);
				foreach_loop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(133);
				if_statement();
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

	public static class AssignmentContext extends ParserRuleContext {
		public Modifiable_primaryContext modifiable_primary() {
			return getRuleContext(Modifiable_primaryContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(ImperativeLanguageParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageListener ) ((ImperativeLanguageListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageListener ) ((ImperativeLanguageListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			modifiable_primary();
			setState(137);
			match(ASSIGN);
			setState(138);
			expression();
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

	public static class Routine_callContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ImperativeLanguageParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(ImperativeLanguageParser.LPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(ImperativeLanguageParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ImperativeLanguageParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ImperativeLanguageParser.COMMA, i);
		}
		public Routine_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routine_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageListener ) ((ImperativeLanguageListener)listener).enterRoutine_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageListener ) ((ImperativeLanguageListener)listener).exitRoutine_call(this);
		}
	}

	public final Routine_callContext routine_call() throws RecognitionException {
		Routine_callContext _localctx = new Routine_callContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_routine_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(IDENTIFIER);
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(141);
				match(LPAREN);
				setState(142);
				expression();
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(143);
					match(COMMA);
					setState(144);
					expression();
					}
					}
					setState(149);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(150);
				match(RPAREN);
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

	public static class While_loopContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(ImperativeLanguageParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LOOP() { return getToken(ImperativeLanguageParser.LOOP, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode END() { return getToken(ImperativeLanguageParser.END, 0); }
		public While_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageListener ) ((ImperativeLanguageListener)listener).enterWhile_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageListener ) ((ImperativeLanguageListener)listener).exitWhile_loop(this);
		}
	}

	public final While_loopContext while_loop() throws RecognitionException {
		While_loopContext _localctx = new While_loopContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_while_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(WHILE);
			setState(155);
			expression();
			setState(156);
			match(LOOP);
			setState(157);
			body();
			setState(158);
			match(END);
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

	public static class For_loopContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(ImperativeLanguageParser.FOR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ImperativeLanguageParser.IDENTIFIER, 0); }
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public TerminalNode LOOP() { return getToken(ImperativeLanguageParser.LOOP, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode END() { return getToken(ImperativeLanguageParser.END, 0); }
		public For_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageListener ) ((ImperativeLanguageListener)listener).enterFor_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageListener ) ((ImperativeLanguageListener)listener).exitFor_loop(this);
		}
	}

	public final For_loopContext for_loop() throws RecognitionException {
		For_loopContext _localctx = new For_loopContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_for_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(FOR);
			setState(161);
			match(IDENTIFIER);
			setState(162);
			range();
			setState(163);
			match(LOOP);
			setState(164);
			body();
			setState(165);
			match(END);
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

	public static class RangeContext extends ParserRuleContext {
		public TerminalNode IN() { return getToken(ImperativeLanguageParser.IN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DOTDOT() { return getToken(ImperativeLanguageParser.DOTDOT, 0); }
		public TerminalNode REVERSE() { return getToken(ImperativeLanguageParser.REVERSE, 0); }
		public RangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageListener ) ((ImperativeLanguageListener)listener).enterRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageListener ) ((ImperativeLanguageListener)listener).exitRange(this);
		}
	}

	public final RangeContext range() throws RecognitionException {
		RangeContext _localctx = new RangeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_range);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(IN);
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REVERSE) {
				{
				setState(168);
				match(REVERSE);
				}
			}

			setState(171);
			expression();
			setState(172);
			match(DOTDOT);
			setState(173);
			expression();
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

	public static class Foreach_loopContext extends ParserRuleContext {
		public TerminalNode FOREACH() { return getToken(ImperativeLanguageParser.FOREACH, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ImperativeLanguageParser.IDENTIFIER, 0); }
		public TerminalNode FROM() { return getToken(ImperativeLanguageParser.FROM, 0); }
		public Modifiable_primaryContext modifiable_primary() {
			return getRuleContext(Modifiable_primaryContext.class,0);
		}
		public TerminalNode LOOP() { return getToken(ImperativeLanguageParser.LOOP, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode END() { return getToken(ImperativeLanguageParser.END, 0); }
		public Foreach_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreach_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageListener ) ((ImperativeLanguageListener)listener).enterForeach_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageListener ) ((ImperativeLanguageListener)listener).exitForeach_loop(this);
		}
	}

	public final Foreach_loopContext foreach_loop() throws RecognitionException {
		Foreach_loopContext _localctx = new Foreach_loopContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_foreach_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(FOREACH);
			setState(176);
			match(IDENTIFIER);
			setState(177);
			match(FROM);
			setState(178);
			modifiable_primary();
			setState(179);
			match(LOOP);
			setState(180);
			body();
			setState(181);
			match(END);
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

	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(ImperativeLanguageParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(ImperativeLanguageParser.THEN, 0); }
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public TerminalNode END() { return getToken(ImperativeLanguageParser.END, 0); }
		public TerminalNode ELSE() { return getToken(ImperativeLanguageParser.ELSE, 0); }
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageListener ) ((ImperativeLanguageListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageListener ) ((ImperativeLanguageListener)listener).exitIf_statement(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(IF);
			setState(184);
			expression();
			setState(185);
			match(THEN);
			setState(186);
			body();
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(187);
				match(ELSE);
				setState(188);
				body();
				}
			}

			setState(191);
			match(END);
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
		public List<RelationContext> relation() {
			return getRuleContexts(RelationContext.class);
		}
		public RelationContext relation(int i) {
			return getRuleContext(RelationContext.class,i);
		}
		public TerminalNode AND() { return getToken(ImperativeLanguageParser.AND, 0); }
		public TerminalNode OR() { return getToken(ImperativeLanguageParser.OR, 0); }
		public TerminalNode XOR() { return getToken(ImperativeLanguageParser.XOR, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageListener ) ((ImperativeLanguageListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageListener ) ((ImperativeLanguageListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			relation();
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << XOR))) != 0)) {
				{
				setState(194);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << XOR))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(195);
				relation();
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

	public static class RelationContext extends ParserRuleContext {
		public List<SimpleContext> simple() {
			return getRuleContexts(SimpleContext.class);
		}
		public SimpleContext simple(int i) {
			return getRuleContext(SimpleContext.class,i);
		}
		public TerminalNode LESS() { return getToken(ImperativeLanguageParser.LESS, 0); }
		public TerminalNode LESS_OR_EQUAL() { return getToken(ImperativeLanguageParser.LESS_OR_EQUAL, 0); }
		public TerminalNode GREATER() { return getToken(ImperativeLanguageParser.GREATER, 0); }
		public TerminalNode GREATER_OR_EQUAL() { return getToken(ImperativeLanguageParser.GREATER_OR_EQUAL, 0); }
		public TerminalNode EQUAL() { return getToken(ImperativeLanguageParser.EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(ImperativeLanguageParser.NOT_EQUAL, 0); }
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageListener ) ((ImperativeLanguageListener)listener).enterRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageListener ) ((ImperativeLanguageListener)listener).exitRelation(this);
		}
	}

	public final RelationContext relation() throws RecognitionException {
		RelationContext _localctx = new RelationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_relation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			simple();
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS) | (1L << LESS_OR_EQUAL) | (1L << GREATER) | (1L << GREATER_OR_EQUAL) | (1L << EQUAL) | (1L << NOT_EQUAL))) != 0)) {
				{
				setState(199);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS) | (1L << LESS_OR_EQUAL) | (1L << GREATER) | (1L << GREATER_OR_EQUAL) | (1L << EQUAL) | (1L << NOT_EQUAL))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(200);
				simple();
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

	public static class SimpleContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public TerminalNode MULTIPLICATION() { return getToken(ImperativeLanguageParser.MULTIPLICATION, 0); }
		public TerminalNode DIVISION() { return getToken(ImperativeLanguageParser.DIVISION, 0); }
		public TerminalNode MOD() { return getToken(ImperativeLanguageParser.MOD, 0); }
		public SimpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageListener ) ((ImperativeLanguageListener)listener).enterSimple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageListener ) ((ImperativeLanguageListener)listener).exitSimple(this);
		}
	}

	public final SimpleContext simple() throws RecognitionException {
		SimpleContext _localctx = new SimpleContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_simple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			factor();
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULTIPLICATION) | (1L << DIVISION) | (1L << MOD))) != 0)) {
				{
				setState(204);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULTIPLICATION) | (1L << DIVISION) | (1L << MOD))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(205);
				factor();
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

	public static class FactorContext extends ParserRuleContext {
		public List<SummandContext> summand() {
			return getRuleContexts(SummandContext.class);
		}
		public SummandContext summand(int i) {
			return getRuleContext(SummandContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(ImperativeLanguageParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(ImperativeLanguageParser.MINUS, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageListener ) ((ImperativeLanguageListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageListener ) ((ImperativeLanguageListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_factor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			summand();
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(209);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(210);
				summand();
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

	public static class SummandContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ImperativeLanguageParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ImperativeLanguageParser.RPAREN, 0); }
		public SummandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_summand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageListener ) ((ImperativeLanguageListener)listener).enterSummand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageListener ) ((ImperativeLanguageListener)listener).exitSummand(this);
		}
	}

	public final SummandContext summand() throws RecognitionException {
		SummandContext _localctx = new SummandContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_summand);
		try {
			setState(218);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case IDENTIFIER:
			case INTEGER_LITERAL:
			case REAL_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				primary();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(214);
				match(LPAREN);
				setState(215);
				expression();
				setState(216);
				match(RPAREN);
				}
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

	public static class PrimaryContext extends ParserRuleContext {
		public TerminalNode INTEGER_LITERAL() { return getToken(ImperativeLanguageParser.INTEGER_LITERAL, 0); }
		public TerminalNode REAL_LITERAL() { return getToken(ImperativeLanguageParser.REAL_LITERAL, 0); }
		public TerminalNode TRUE() { return getToken(ImperativeLanguageParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(ImperativeLanguageParser.FALSE, 0); }
		public Modifiable_primaryContext modifiable_primary() {
			return getRuleContext(Modifiable_primaryContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageListener ) ((ImperativeLanguageListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageListener ) ((ImperativeLanguageListener)listener).exitPrimary(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_primary);
		try {
			setState(225);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				match(INTEGER_LITERAL);
				}
				break;
			case REAL_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(221);
				match(REAL_LITERAL);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(222);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 4);
				{
				setState(223);
				match(FALSE);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 5);
				{
				setState(224);
				modifiable_primary();
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

	public static class Modifiable_primaryContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(ImperativeLanguageParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ImperativeLanguageParser.IDENTIFIER, i);
		}
		public List<TerminalNode> DOT() { return getTokens(ImperativeLanguageParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(ImperativeLanguageParser.DOT, i);
		}
		public List<TerminalNode> LPAREN() { return getTokens(ImperativeLanguageParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(ImperativeLanguageParser.LPAREN, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(ImperativeLanguageParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(ImperativeLanguageParser.RPAREN, i);
		}
		public Modifiable_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifiable_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageListener ) ((ImperativeLanguageListener)listener).enterModifiable_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageListener ) ((ImperativeLanguageListener)listener).exitModifiable_primary(this);
		}
	}

	public final Modifiable_primaryContext modifiable_primary() throws RecognitionException {
		Modifiable_primaryContext _localctx = new Modifiable_primaryContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_modifiable_primary);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(IDENTIFIER);
			setState(232);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(228);
					match(DOT);
					setState(229);
					match(IDENTIFIER);
					}
					} 
				}
				setState(234);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAREN) {
				{
				{
				setState(235);
				match(LPAREN);
				setState(236);
				expression();
				setState(237);
				match(RPAREN);
				}
				}
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(244);
				match(DOT);
				setState(245);
				match(IDENTIFIER);
				}
				}
				setState(250);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u00fe\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\5\2;\n\2\3\3\3\3\5\3?\n\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4L\n\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\7\7`\n\7\f\7\16\7c"+
		"\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\5\to\n\t\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\5\r~\n\r\3\r\5\r\u0081\n\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\5\16\u0089\n\16\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\7\20\u0094\n\20\f\20\16\20\u0097\13\20\3\20\3\20"+
		"\5\20\u009b\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\5\23\u00ac\n\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00c0\n\25"+
		"\3\25\3\25\3\26\3\26\3\26\5\26\u00c7\n\26\3\27\3\27\3\27\5\27\u00cc\n"+
		"\27\3\30\3\30\3\30\5\30\u00d1\n\30\3\31\3\31\3\31\5\31\u00d6\n\31\3\32"+
		"\3\32\3\32\3\32\3\32\5\32\u00dd\n\32\3\33\3\33\3\33\3\33\3\33\5\33\u00e4"+
		"\n\33\3\34\3\34\3\34\7\34\u00e9\n\34\f\34\16\34\u00ec\13\34\3\34\3\34"+
		"\3\34\3\34\7\34\u00f2\n\34\f\34\16\34\u00f5\13\34\3\34\3\34\7\34\u00f9"+
		"\n\34\f\34\16\34\u00fc\13\34\3\34\2\2\35\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\66\2\7\3\2!#\3\2\21\23\3\2\n\17\3\2\5\7\3"+
		"\2\3\4\2\u0100\2:\3\2\2\2\4>\3\2\2\2\6K\3\2\2\2\bM\3\2\2\2\nR\3\2\2\2"+
		"\f[\3\2\2\2\16f\3\2\2\2\20n\3\2\2\2\22p\3\2\2\2\24r\3\2\2\2\26v\3\2\2"+
		"\2\30}\3\2\2\2\32\u0088\3\2\2\2\34\u008a\3\2\2\2\36\u008e\3\2\2\2 \u009c"+
		"\3\2\2\2\"\u00a2\3\2\2\2$\u00a9\3\2\2\2&\u00b1\3\2\2\2(\u00b9\3\2\2\2"+
		"*\u00c3\3\2\2\2,\u00c8\3\2\2\2.\u00cd\3\2\2\2\60\u00d2\3\2\2\2\62\u00dc"+
		"\3\2\2\2\64\u00e3\3\2\2\2\66\u00e5\3\2\2\28;\5\4\3\29;\5\n\6\2:8\3\2\2"+
		"\2:9\3\2\2\2;\3\3\2\2\2<?\5\6\4\2=?\5\b\5\2><\3\2\2\2>=\3\2\2\2?\5\3\2"+
		"\2\2@A\7\'\2\2AB\7.\2\2BC\7(\2\2CD\5\20\t\2DE\7&\2\2EF\5*\26\2FL\3\2\2"+
		"\2GH\7\'\2\2HI\7.\2\2IJ\7&\2\2JL\5*\26\2K@\3\2\2\2KG\3\2\2\2L\7\3\2\2"+
		"\2MN\7%\2\2NO\7.\2\2OP\7&\2\2PQ\5\20\t\2Q\t\3\2\2\2RS\7$\2\2ST\7.\2\2"+
		"TU\5\f\7\2UV\7(\2\2VW\5\20\t\2WX\7&\2\2XY\5\30\r\2YZ\7\27\2\2Z\13\3\2"+
		"\2\2[\\\7,\2\2\\a\5\16\b\2]^\7+\2\2^`\5\16\b\2_]\3\2\2\2`c\3\2\2\2a_\3"+
		"\2\2\2ab\3\2\2\2bd\3\2\2\2ca\3\2\2\2de\7-\2\2e\r\3\2\2\2fg\7.\2\2gh\7"+
		"(\2\2hi\5\20\t\2i\17\3\2\2\2jo\5\22\n\2ko\5\26\f\2lo\5\24\13\2mo\7.\2"+
		"\2nj\3\2\2\2nk\3\2\2\2nl\3\2\2\2nm\3\2\2\2o\21\3\2\2\2pq\t\2\2\2q\23\3"+
		"\2\2\2rs\7 \2\2st\5\6\4\2tu\7\27\2\2u\25\3\2\2\2vw\7\37\2\2wx\7,\2\2x"+
		"y\5*\26\2yz\7-\2\2z{\5\20\t\2{\27\3\2\2\2|~\5\4\3\2}|\3\2\2\2}~\3\2\2"+
		"\2~\u0080\3\2\2\2\177\u0081\5\32\16\2\u0080\177\3\2\2\2\u0080\u0081\3"+
		"\2\2\2\u0081\31\3\2\2\2\u0082\u0089\5\34\17\2\u0083\u0089\5\36\20\2\u0084"+
		"\u0089\5 \21\2\u0085\u0089\5\"\22\2\u0086\u0089\5&\24\2\u0087\u0089\5"+
		"(\25\2\u0088\u0082\3\2\2\2\u0088\u0083\3\2\2\2\u0088\u0084\3\2\2\2\u0088"+
		"\u0085\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0087\3\2\2\2\u0089\33\3\2\2"+
		"\2\u008a\u008b\5\66\34\2\u008b\u008c\7\20\2\2\u008c\u008d\5*\26\2\u008d"+
		"\35\3\2\2\2\u008e\u009a\7.\2\2\u008f\u0090\7,\2\2\u0090\u0095\5*\26\2"+
		"\u0091\u0092\7+\2\2\u0092\u0094\5*\26\2\u0093\u0091\3\2\2\2\u0094\u0097"+
		"\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0098\3\2\2\2\u0097"+
		"\u0095\3\2\2\2\u0098\u0099\7-\2\2\u0099\u009b\3\2\2\2\u009a\u008f\3\2"+
		"\2\2\u009a\u009b\3\2\2\2\u009b\37\3\2\2\2\u009c\u009d\7\36\2\2\u009d\u009e"+
		"\5*\26\2\u009e\u009f\7\32\2\2\u009f\u00a0\5\30\r\2\u00a0\u00a1\7\27\2"+
		"\2\u00a1!\3\2\2\2\u00a2\u00a3\7\35\2\2\u00a3\u00a4\7.\2\2\u00a4\u00a5"+
		"\5$\23\2\u00a5\u00a6\7\32\2\2\u00a6\u00a7\5\30\r\2\u00a7\u00a8\7\27\2"+
		"\2\u00a8#\3\2\2\2\u00a9\u00ab\7\33\2\2\u00aa\u00ac\7\34\2\2\u00ab\u00aa"+
		"\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\5*\26\2\u00ae"+
		"\u00af\7*\2\2\u00af\u00b0\5*\26\2\u00b0%\3\2\2\2\u00b1\u00b2\7\30\2\2"+
		"\u00b2\u00b3\7.\2\2\u00b3\u00b4\7\31\2\2\u00b4\u00b5\5\66\34\2\u00b5\u00b6"+
		"\7\32\2\2\u00b6\u00b7\5\30\r\2\u00b7\u00b8\7\27\2\2\u00b8\'\3\2\2\2\u00b9"+
		"\u00ba\7\24\2\2\u00ba\u00bb\5*\26\2\u00bb\u00bc\7\25\2\2\u00bc\u00bf\5"+
		"\30\r\2\u00bd\u00be\7\26\2\2\u00be\u00c0\5\30\r\2\u00bf\u00bd\3\2\2\2"+
		"\u00bf\u00c0\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\7\27\2\2\u00c2)\3"+
		"\2\2\2\u00c3\u00c6\5,\27\2\u00c4\u00c5\t\3\2\2\u00c5\u00c7\5,\27\2\u00c6"+
		"\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7+\3\2\2\2\u00c8\u00cb\5.\30\2"+
		"\u00c9\u00ca\t\4\2\2\u00ca\u00cc\5.\30\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc"+
		"\3\2\2\2\u00cc-\3\2\2\2\u00cd\u00d0\5\60\31\2\u00ce\u00cf\t\5\2\2\u00cf"+
		"\u00d1\5\60\31\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1/\3\2\2"+
		"\2\u00d2\u00d5\5\62\32\2\u00d3\u00d4\t\6\2\2\u00d4\u00d6\5\62\32\2\u00d5"+
		"\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\61\3\2\2\2\u00d7\u00dd\5\64\33"+
		"\2\u00d8\u00d9\7,\2\2\u00d9\u00da\5*\26\2\u00da\u00db\7-\2\2\u00db\u00dd"+
		"\3\2\2\2\u00dc\u00d7\3\2\2\2\u00dc\u00d8\3\2\2\2\u00dd\63\3\2\2\2\u00de"+
		"\u00e4\7/\2\2\u00df\u00e4\7\60\2\2\u00e0\u00e4\7\b\2\2\u00e1\u00e4\7\t"+
		"\2\2\u00e2\u00e4\5\66\34\2\u00e3\u00de\3\2\2\2\u00e3\u00df\3\2\2\2\u00e3"+
		"\u00e0\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e2\3\2\2\2\u00e4\65\3\2\2"+
		"\2\u00e5\u00ea\7.\2\2\u00e6\u00e7\7)\2\2\u00e7\u00e9\7.\2\2\u00e8\u00e6"+
		"\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb"+
		"\u00f3\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00ee\7,\2\2\u00ee\u00ef\5*\26"+
		"\2\u00ef\u00f0\7-\2\2\u00f0\u00f2\3\2\2\2\u00f1\u00ed\3\2\2\2\u00f2\u00f5"+
		"\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00fa\3\2\2\2\u00f5"+
		"\u00f3\3\2\2\2\u00f6\u00f7\7)\2\2\u00f7\u00f9\7.\2\2\u00f8\u00f6\3\2\2"+
		"\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\67"+
		"\3\2\2\2\u00fc\u00fa\3\2\2\2\27:>Kan}\u0080\u0088\u0095\u009a\u00ab\u00bf"+
		"\u00c6\u00cb\u00d0\u00d5\u00dc\u00e3\u00ea\u00f3\u00fa";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}