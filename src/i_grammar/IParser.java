// Generated from C:/Repositories/ImperativeLanguageCompiler/src/i_grammar\I.g4 by ANTLR 4.7.2
package i_grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class IParser extends Parser {
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
	public String getGrammarFileName() { return "I.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public IParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<Simple_declarationContext> simple_declaration() {
			return getRuleContexts(Simple_declarationContext.class);
		}
		public Simple_declarationContext simple_declaration(int i) {
			return getRuleContext(Simple_declarationContext.class,i);
		}
		public List<Routine_declarationContext> routine_declaration() {
			return getRuleContexts(Routine_declarationContext.class);
		}
		public Routine_declarationContext routine_declaration(int i) {
			return getRuleContext(Routine_declarationContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IListener ) ((IListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IListener ) ((IListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IVisitor ) return ((IVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ROUTINE) | (1L << TYPE) | (1L << VAR))) != 0)) {
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
				setState(60);
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

	public static class Simple_declarationContext extends ParserRuleContext {
		public List<Variable_declarationContext> variable_declaration() {
			return getRuleContexts(Variable_declarationContext.class);
		}
		public Variable_declarationContext variable_declaration(int i) {
			return getRuleContext(Variable_declarationContext.class,i);
		}
		public List<Type_declarationContext> type_declaration() {
			return getRuleContexts(Type_declarationContext.class);
		}
		public Type_declarationContext type_declaration(int i) {
			return getRuleContext(Type_declarationContext.class,i);
		}
		public Simple_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IListener ) ((IListener)listener).enterSimple_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IListener ) ((IListener)listener).exitSimple_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IVisitor ) return ((IVisitor<? extends T>)visitor).visitSimple_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_declarationContext simple_declaration() throws RecognitionException {
		Simple_declarationContext _localctx = new Simple_declarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_simple_declaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(63); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(63);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case VAR:
						{
						setState(61);
						variable_declaration();
						}
						break;
					case TYPE:
						{
						setState(62);
						type_declaration();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(65); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
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
		public TerminalNode VAR() { return getToken(IParser.VAR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(IParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(IParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IS() { return getToken(IParser.IS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IListener ) ((IListener)listener).enterVariable_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IListener ) ((IListener)listener).exitVariable_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IVisitor ) return ((IVisitor<? extends T>)visitor).visitVariable_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_declarationContext variable_declaration() throws RecognitionException {
		Variable_declarationContext _localctx = new Variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variable_declaration);
		int _la;
		try {
			setState(79);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				match(VAR);
				setState(68);
				match(IDENTIFIER);
				setState(69);
				match(COLON);
				setState(70);
				type();
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(71);
					match(IS);
					setState(72);
					expression();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				match(VAR);
				setState(76);
				match(IDENTIFIER);
				setState(77);
				match(IS);
				setState(78);
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
		public TerminalNode TYPE() { return getToken(IParser.TYPE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(IParser.IDENTIFIER, 0); }
		public TerminalNode IS() { return getToken(IParser.IS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Type_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IListener ) ((IListener)listener).enterType_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IListener ) ((IListener)listener).exitType_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IVisitor ) return ((IVisitor<? extends T>)visitor).visitType_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_declarationContext type_declaration() throws RecognitionException {
		Type_declarationContext _localctx = new Type_declarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_type_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(TYPE);
			setState(82);
			match(IDENTIFIER);
			setState(83);
			match(IS);
			setState(84);
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
		public TerminalNode ROUTINE() { return getToken(IParser.ROUTINE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(IParser.IDENTIFIER, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode IS() { return getToken(IParser.IS, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode END() { return getToken(IParser.END, 0); }
		public TerminalNode COLON() { return getToken(IParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Routine_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routine_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IListener ) ((IListener)listener).enterRoutine_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IListener ) ((IListener)listener).exitRoutine_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IVisitor ) return ((IVisitor<? extends T>)visitor).visitRoutine_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Routine_declarationContext routine_declaration() throws RecognitionException {
		Routine_declarationContext _localctx = new Routine_declarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_routine_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(ROUTINE);
			setState(87);
			match(IDENTIFIER);
			setState(88);
			parameters();
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(89);
				match(COLON);
				setState(90);
				type();
				}
			}

			setState(93);
			match(IS);
			setState(94);
			body();
			setState(95);
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
		public TerminalNode LPAREN() { return getToken(IParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(IParser.RPAREN, 0); }
		public List<Parameter_declarationContext> parameter_declaration() {
			return getRuleContexts(Parameter_declarationContext.class);
		}
		public Parameter_declarationContext parameter_declaration(int i) {
			return getRuleContext(Parameter_declarationContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(IParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(IParser.COMMA, i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IListener ) ((IListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IListener ) ((IListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IVisitor ) return ((IVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(LPAREN);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(98);
				parameter_declaration();
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(99);
					match(COMMA);
					setState(100);
					parameter_declaration();
					}
					}
					setState(105);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(108);
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
		public TerminalNode IDENTIFIER() { return getToken(IParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(IParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Parameter_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IListener ) ((IListener)listener).enterParameter_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IListener ) ((IListener)listener).exitParameter_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IVisitor ) return ((IVisitor<? extends T>)visitor).visitParameter_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_declarationContext parameter_declaration() throws RecognitionException {
		Parameter_declarationContext _localctx = new Parameter_declarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parameter_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(IDENTIFIER);
			setState(111);
			match(COLON);
			setState(112);
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
		public TerminalNode IDENTIFIER() { return getToken(IParser.IDENTIFIER, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IListener ) ((IListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IListener ) ((IListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IVisitor ) return ((IVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_type);
		try {
			setState(118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
			case REAL:
			case BOOLEAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				primitive_type();
				}
				break;
			case ARRAY:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				array_type();
				}
				break;
			case RECORD:
				enterOuterAlt(_localctx, 3);
				{
				setState(116);
				record_type();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(117);
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
		public TerminalNode INTEGER() { return getToken(IParser.INTEGER, 0); }
		public TerminalNode REAL() { return getToken(IParser.REAL, 0); }
		public TerminalNode BOOLEAN() { return getToken(IParser.BOOLEAN, 0); }
		public Primitive_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitive_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IListener ) ((IListener)listener).enterPrimitive_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IListener ) ((IListener)listener).exitPrimitive_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IVisitor ) return ((IVisitor<? extends T>)visitor).visitPrimitive_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Primitive_typeContext primitive_type() throws RecognitionException {
		Primitive_typeContext _localctx = new Primitive_typeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_primitive_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
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
		public TerminalNode RECORD() { return getToken(IParser.RECORD, 0); }
		public TerminalNode END() { return getToken(IParser.END, 0); }
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public Record_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_record_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IListener ) ((IListener)listener).enterRecord_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IListener ) ((IListener)listener).exitRecord_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IVisitor ) return ((IVisitor<? extends T>)visitor).visitRecord_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Record_typeContext record_type() throws RecognitionException {
		Record_typeContext _localctx = new Record_typeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_record_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(RECORD);
			{
			setState(123);
			variable_declaration();
			}
			setState(124);
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
		public TerminalNode ARRAY() { return getToken(IParser.ARRAY, 0); }
		public TerminalNode LPAREN() { return getToken(IParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(IParser.RPAREN, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Array_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IListener ) ((IListener)listener).enterArray_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IListener ) ((IListener)listener).exitArray_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IVisitor ) return ((IVisitor<? extends T>)visitor).visitArray_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_typeContext array_type() throws RecognitionException {
		Array_typeContext _localctx = new Array_typeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_array_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(ARRAY);
			setState(127);
			match(LPAREN);
			setState(128);
			expression();
			setState(129);
			match(RPAREN);
			setState(130);
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
		public List<Simple_declarationContext> simple_declaration() {
			return getRuleContexts(Simple_declarationContext.class);
		}
		public Simple_declarationContext simple_declaration(int i) {
			return getRuleContext(Simple_declarationContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IListener ) ((IListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IListener ) ((IListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IVisitor ) return ((IVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPE || _la==VAR) {
				{
				{
				setState(132);
				simple_declaration();
				}
				}
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOREACH) | (1L << FOR) | (1L << WHILE) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(138);
				statement();
				}
				}
				setState(143);
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
			if ( listener instanceof IListener ) ((IListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IListener ) ((IListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IVisitor ) return ((IVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_statement);
		try {
			setState(150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				routine_call();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(146);
				while_loop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(147);
				for_loop();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(148);
				foreach_loop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(149);
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
		public TerminalNode ASSIGN() { return getToken(IParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IListener ) ((IListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IListener ) ((IListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IVisitor ) return ((IVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			modifiable_primary();
			setState(153);
			match(ASSIGN);
			setState(154);
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
		public TerminalNode IDENTIFIER() { return getToken(IParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(IParser.LPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(IParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(IParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(IParser.COMMA, i);
		}
		public Routine_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routine_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IListener ) ((IListener)listener).enterRoutine_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IListener ) ((IListener)listener).exitRoutine_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IVisitor ) return ((IVisitor<? extends T>)visitor).visitRoutine_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Routine_callContext routine_call() throws RecognitionException {
		Routine_callContext _localctx = new Routine_callContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_routine_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(IDENTIFIER);
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(157);
				match(LPAREN);
				setState(158);
				expression();
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(159);
					match(COMMA);
					setState(160);
					expression();
					}
					}
					setState(165);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(166);
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
		public TerminalNode WHILE() { return getToken(IParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LOOP() { return getToken(IParser.LOOP, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode END() { return getToken(IParser.END, 0); }
		public While_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IListener ) ((IListener)listener).enterWhile_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IListener ) ((IListener)listener).exitWhile_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IVisitor ) return ((IVisitor<? extends T>)visitor).visitWhile_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_loopContext while_loop() throws RecognitionException {
		While_loopContext _localctx = new While_loopContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_while_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(WHILE);
			setState(171);
			expression();
			setState(172);
			match(LOOP);
			setState(173);
			body();
			setState(174);
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
		public TerminalNode FOR() { return getToken(IParser.FOR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(IParser.IDENTIFIER, 0); }
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public TerminalNode LOOP() { return getToken(IParser.LOOP, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode END() { return getToken(IParser.END, 0); }
		public For_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IListener ) ((IListener)listener).enterFor_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IListener ) ((IListener)listener).exitFor_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IVisitor ) return ((IVisitor<? extends T>)visitor).visitFor_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_loopContext for_loop() throws RecognitionException {
		For_loopContext _localctx = new For_loopContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_for_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(FOR);
			setState(177);
			match(IDENTIFIER);
			setState(178);
			range();
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

	public static class RangeContext extends ParserRuleContext {
		public TerminalNode IN() { return getToken(IParser.IN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DOTDOT() { return getToken(IParser.DOTDOT, 0); }
		public TerminalNode REVERSE() { return getToken(IParser.REVERSE, 0); }
		public RangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IListener ) ((IListener)listener).enterRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IListener ) ((IListener)listener).exitRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IVisitor ) return ((IVisitor<? extends T>)visitor).visitRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeContext range() throws RecognitionException {
		RangeContext _localctx = new RangeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_range);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(IN);
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REVERSE) {
				{
				setState(184);
				match(REVERSE);
				}
			}

			setState(187);
			expression();
			setState(188);
			match(DOTDOT);
			setState(189);
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
		public TerminalNode FOREACH() { return getToken(IParser.FOREACH, 0); }
		public TerminalNode IDENTIFIER() { return getToken(IParser.IDENTIFIER, 0); }
		public TerminalNode FROM() { return getToken(IParser.FROM, 0); }
		public Modifiable_primaryContext modifiable_primary() {
			return getRuleContext(Modifiable_primaryContext.class,0);
		}
		public TerminalNode LOOP() { return getToken(IParser.LOOP, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode END() { return getToken(IParser.END, 0); }
		public Foreach_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreach_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IListener ) ((IListener)listener).enterForeach_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IListener ) ((IListener)listener).exitForeach_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IVisitor ) return ((IVisitor<? extends T>)visitor).visitForeach_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Foreach_loopContext foreach_loop() throws RecognitionException {
		Foreach_loopContext _localctx = new Foreach_loopContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_foreach_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(FOREACH);
			setState(192);
			match(IDENTIFIER);
			setState(193);
			match(FROM);
			setState(194);
			modifiable_primary();
			setState(195);
			match(LOOP);
			setState(196);
			body();
			setState(197);
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
		public TerminalNode IF() { return getToken(IParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(IParser.THEN, 0); }
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public TerminalNode END() { return getToken(IParser.END, 0); }
		public TerminalNode ELSE() { return getToken(IParser.ELSE, 0); }
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IListener ) ((IListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IListener ) ((IListener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IVisitor ) return ((IVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(IF);
			setState(200);
			expression();
			setState(201);
			match(THEN);
			setState(202);
			body();
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(203);
				match(ELSE);
				setState(204);
				body();
				}
			}

			setState(207);
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
		public TerminalNode AND() { return getToken(IParser.AND, 0); }
		public TerminalNode OR() { return getToken(IParser.OR, 0); }
		public TerminalNode XOR() { return getToken(IParser.XOR, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IListener ) ((IListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IListener ) ((IListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IVisitor ) return ((IVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			relation();
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << XOR))) != 0)) {
				{
				setState(210);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << XOR))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(211);
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
		public TerminalNode LESS() { return getToken(IParser.LESS, 0); }
		public TerminalNode LESS_OR_EQUAL() { return getToken(IParser.LESS_OR_EQUAL, 0); }
		public TerminalNode GREATER() { return getToken(IParser.GREATER, 0); }
		public TerminalNode GREATER_OR_EQUAL() { return getToken(IParser.GREATER_OR_EQUAL, 0); }
		public TerminalNode EQUAL() { return getToken(IParser.EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(IParser.NOT_EQUAL, 0); }
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IListener ) ((IListener)listener).enterRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IListener ) ((IListener)listener).exitRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IVisitor ) return ((IVisitor<? extends T>)visitor).visitRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationContext relation() throws RecognitionException {
		RelationContext _localctx = new RelationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_relation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			simple();
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS) | (1L << LESS_OR_EQUAL) | (1L << GREATER) | (1L << GREATER_OR_EQUAL) | (1L << EQUAL) | (1L << NOT_EQUAL))) != 0)) {
				{
				setState(215);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS) | (1L << LESS_OR_EQUAL) | (1L << GREATER) | (1L << GREATER_OR_EQUAL) | (1L << EQUAL) | (1L << NOT_EQUAL))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(216);
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
		public TerminalNode MULTIPLICATION() { return getToken(IParser.MULTIPLICATION, 0); }
		public TerminalNode DIVISION() { return getToken(IParser.DIVISION, 0); }
		public TerminalNode MOD() { return getToken(IParser.MOD, 0); }
		public SimpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IListener ) ((IListener)listener).enterSimple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IListener ) ((IListener)listener).exitSimple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IVisitor ) return ((IVisitor<? extends T>)visitor).visitSimple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleContext simple() throws RecognitionException {
		SimpleContext _localctx = new SimpleContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_simple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			factor();
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULTIPLICATION) | (1L << DIVISION) | (1L << MOD))) != 0)) {
				{
				setState(220);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULTIPLICATION) | (1L << DIVISION) | (1L << MOD))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(221);
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
		public TerminalNode PLUS() { return getToken(IParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(IParser.MINUS, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IListener ) ((IListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IListener ) ((IListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IVisitor ) return ((IVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_factor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			summand();
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(225);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(226);
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
		public TerminalNode LPAREN() { return getToken(IParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(IParser.RPAREN, 0); }
		public SummandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_summand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IListener ) ((IListener)listener).enterSummand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IListener ) ((IListener)listener).exitSummand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IVisitor ) return ((IVisitor<? extends T>)visitor).visitSummand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SummandContext summand() throws RecognitionException {
		SummandContext _localctx = new SummandContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_summand);
		try {
			setState(234);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case IDENTIFIER:
			case INTEGER_LITERAL:
			case REAL_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				primary();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(230);
				match(LPAREN);
				setState(231);
				expression();
				setState(232);
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
		public TerminalNode INTEGER_LITERAL() { return getToken(IParser.INTEGER_LITERAL, 0); }
		public TerminalNode REAL_LITERAL() { return getToken(IParser.REAL_LITERAL, 0); }
		public TerminalNode TRUE() { return getToken(IParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(IParser.FALSE, 0); }
		public Modifiable_primaryContext modifiable_primary() {
			return getRuleContext(Modifiable_primaryContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IListener ) ((IListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IListener ) ((IListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IVisitor ) return ((IVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_primary);
		try {
			setState(241);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				match(INTEGER_LITERAL);
				}
				break;
			case REAL_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				match(REAL_LITERAL);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(238);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 4);
				{
				setState(239);
				match(FALSE);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 5);
				{
				setState(240);
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
		public List<TerminalNode> IDENTIFIER() { return getTokens(IParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(IParser.IDENTIFIER, i);
		}
		public List<TerminalNode> DOT() { return getTokens(IParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(IParser.DOT, i);
		}
		public List<TerminalNode> LPAREN() { return getTokens(IParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(IParser.LPAREN, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(IParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(IParser.RPAREN, i);
		}
		public Modifiable_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifiable_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IListener ) ((IListener)listener).enterModifiable_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IListener ) ((IListener)listener).exitModifiable_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IVisitor ) return ((IVisitor<? extends T>)visitor).visitModifiable_primary(this);
			else return visitor.visitChildren(this);
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
			setState(243);
			match(IDENTIFIER);
			setState(248);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(244);
					match(DOT);
					setState(245);
					match(IDENTIFIER);
					}
					} 
				}
				setState(250);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAREN) {
				{
				{
				setState(251);
				match(LPAREN);
				setState(252);
				expression();
				setState(253);
				match(RPAREN);
				}
				}
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(260);
				match(DOT);
				setState(261);
				match(IDENTIFIER);
				}
				}
				setState(266);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u010e\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\7\2;\n\2\f\2\16\2>\13\2\3\3\3\3"+
		"\6\3B\n\3\r\3\16\3C\3\4\3\4\3\4\3\4\3\4\3\4\5\4L\n\4\3\4\3\4\3\4\3\4\5"+
		"\4R\n\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\5\6^\n\6\3\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\7\7h\n\7\f\7\16\7k\13\7\5\7m\n\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\5\ty\n\t\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\r\7\r\u0088\n\r\f\r\16\r\u008b\13\r\3\r\7\r\u008e\n\r"+
		"\f\r\16\r\u0091\13\r\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0099\n\16\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\7\20\u00a4\n\20\f\20\16\20\u00a7"+
		"\13\20\3\20\3\20\5\20\u00ab\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\5\23\u00bc\n\23\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\5\25\u00d0\n\25\3\25\3\25\3\26\3\26\3\26\5\26\u00d7\n\26\3\27\3"+
		"\27\3\27\5\27\u00dc\n\27\3\30\3\30\3\30\5\30\u00e1\n\30\3\31\3\31\3\31"+
		"\5\31\u00e6\n\31\3\32\3\32\3\32\3\32\3\32\5\32\u00ed\n\32\3\33\3\33\3"+
		"\33\3\33\3\33\5\33\u00f4\n\33\3\34\3\34\3\34\7\34\u00f9\n\34\f\34\16\34"+
		"\u00fc\13\34\3\34\3\34\3\34\3\34\7\34\u0102\n\34\f\34\16\34\u0105\13\34"+
		"\3\34\3\34\7\34\u0109\n\34\f\34\16\34\u010c\13\34\3\34\2\2\35\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66\2\7\3\2!#\3\2\21"+
		"\23\3\2\n\17\3\2\5\7\3\2\3\4\2\u0115\2<\3\2\2\2\4A\3\2\2\2\6Q\3\2\2\2"+
		"\bS\3\2\2\2\nX\3\2\2\2\fc\3\2\2\2\16p\3\2\2\2\20x\3\2\2\2\22z\3\2\2\2"+
		"\24|\3\2\2\2\26\u0080\3\2\2\2\30\u0089\3\2\2\2\32\u0098\3\2\2\2\34\u009a"+
		"\3\2\2\2\36\u009e\3\2\2\2 \u00ac\3\2\2\2\"\u00b2\3\2\2\2$\u00b9\3\2\2"+
		"\2&\u00c1\3\2\2\2(\u00c9\3\2\2\2*\u00d3\3\2\2\2,\u00d8\3\2\2\2.\u00dd"+
		"\3\2\2\2\60\u00e2\3\2\2\2\62\u00ec\3\2\2\2\64\u00f3\3\2\2\2\66\u00f5\3"+
		"\2\2\28;\5\4\3\29;\5\n\6\2:8\3\2\2\2:9\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3"+
		"\2\2\2=\3\3\2\2\2><\3\2\2\2?B\5\6\4\2@B\5\b\5\2A?\3\2\2\2A@\3\2\2\2BC"+
		"\3\2\2\2CA\3\2\2\2CD\3\2\2\2D\5\3\2\2\2EF\7\'\2\2FG\7.\2\2GH\7(\2\2HK"+
		"\5\20\t\2IJ\7&\2\2JL\5*\26\2KI\3\2\2\2KL\3\2\2\2LR\3\2\2\2MN\7\'\2\2N"+
		"O\7.\2\2OP\7&\2\2PR\5*\26\2QE\3\2\2\2QM\3\2\2\2R\7\3\2\2\2ST\7%\2\2TU"+
		"\7.\2\2UV\7&\2\2VW\5\20\t\2W\t\3\2\2\2XY\7$\2\2YZ\7.\2\2Z]\5\f\7\2[\\"+
		"\7(\2\2\\^\5\20\t\2][\3\2\2\2]^\3\2\2\2^_\3\2\2\2_`\7&\2\2`a\5\30\r\2"+
		"ab\7\27\2\2b\13\3\2\2\2cl\7,\2\2di\5\16\b\2ef\7+\2\2fh\5\16\b\2ge\3\2"+
		"\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2jm\3\2\2\2ki\3\2\2\2ld\3\2\2\2lm\3\2"+
		"\2\2mn\3\2\2\2no\7-\2\2o\r\3\2\2\2pq\7.\2\2qr\7(\2\2rs\5\20\t\2s\17\3"+
		"\2\2\2ty\5\22\n\2uy\5\26\f\2vy\5\24\13\2wy\7.\2\2xt\3\2\2\2xu\3\2\2\2"+
		"xv\3\2\2\2xw\3\2\2\2y\21\3\2\2\2z{\t\2\2\2{\23\3\2\2\2|}\7 \2\2}~\5\6"+
		"\4\2~\177\7\27\2\2\177\25\3\2\2\2\u0080\u0081\7\37\2\2\u0081\u0082\7,"+
		"\2\2\u0082\u0083\5*\26\2\u0083\u0084\7-\2\2\u0084\u0085\5\20\t\2\u0085"+
		"\27\3\2\2\2\u0086\u0088\5\4\3\2\u0087\u0086\3\2\2\2\u0088\u008b\3\2\2"+
		"\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008f\3\2\2\2\u008b\u0089"+
		"\3\2\2\2\u008c\u008e\5\32\16\2\u008d\u008c\3\2\2\2\u008e\u0091\3\2\2\2"+
		"\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\31\3\2\2\2\u0091\u008f"+
		"\3\2\2\2\u0092\u0099\5\34\17\2\u0093\u0099\5\36\20\2\u0094\u0099\5 \21"+
		"\2\u0095\u0099\5\"\22\2\u0096\u0099\5&\24\2\u0097\u0099\5(\25\2\u0098"+
		"\u0092\3\2\2\2\u0098\u0093\3\2\2\2\u0098\u0094\3\2\2\2\u0098\u0095\3\2"+
		"\2\2\u0098\u0096\3\2\2\2\u0098\u0097\3\2\2\2\u0099\33\3\2\2\2\u009a\u009b"+
		"\5\66\34\2\u009b\u009c\7\20\2\2\u009c\u009d\5*\26\2\u009d\35\3\2\2\2\u009e"+
		"\u00aa\7.\2\2\u009f\u00a0\7,\2\2\u00a0\u00a5\5*\26\2\u00a1\u00a2\7+\2"+
		"\2\u00a2\u00a4\5*\26\2\u00a3\u00a1\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3"+
		"\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a8\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8"+
		"\u00a9\7-\2\2\u00a9\u00ab\3\2\2\2\u00aa\u009f\3\2\2\2\u00aa\u00ab\3\2"+
		"\2\2\u00ab\37\3\2\2\2\u00ac\u00ad\7\36\2\2\u00ad\u00ae\5*\26\2\u00ae\u00af"+
		"\7\32\2\2\u00af\u00b0\5\30\r\2\u00b0\u00b1\7\27\2\2\u00b1!\3\2\2\2\u00b2"+
		"\u00b3\7\35\2\2\u00b3\u00b4\7.\2\2\u00b4\u00b5\5$\23\2\u00b5\u00b6\7\32"+
		"\2\2\u00b6\u00b7\5\30\r\2\u00b7\u00b8\7\27\2\2\u00b8#\3\2\2\2\u00b9\u00bb"+
		"\7\33\2\2\u00ba\u00bc\7\34\2\2\u00bb\u00ba\3\2\2\2\u00bb\u00bc\3\2\2\2"+
		"\u00bc\u00bd\3\2\2\2\u00bd\u00be\5*\26\2\u00be\u00bf\7*\2\2\u00bf\u00c0"+
		"\5*\26\2\u00c0%\3\2\2\2\u00c1\u00c2\7\30\2\2\u00c2\u00c3\7.\2\2\u00c3"+
		"\u00c4\7\31\2\2\u00c4\u00c5\5\66\34\2\u00c5\u00c6\7\32\2\2\u00c6\u00c7"+
		"\5\30\r\2\u00c7\u00c8\7\27\2\2\u00c8\'\3\2\2\2\u00c9\u00ca\7\24\2\2\u00ca"+
		"\u00cb\5*\26\2\u00cb\u00cc\7\25\2\2\u00cc\u00cf\5\30\r\2\u00cd\u00ce\7"+
		"\26\2\2\u00ce\u00d0\5\30\r\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0"+
		"\u00d1\3\2\2\2\u00d1\u00d2\7\27\2\2\u00d2)\3\2\2\2\u00d3\u00d6\5,\27\2"+
		"\u00d4\u00d5\t\3\2\2\u00d5\u00d7\5,\27\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7"+
		"\3\2\2\2\u00d7+\3\2\2\2\u00d8\u00db\5.\30\2\u00d9\u00da\t\4\2\2\u00da"+
		"\u00dc\5.\30\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc-\3\2\2\2"+
		"\u00dd\u00e0\5\60\31\2\u00de\u00df\t\5\2\2\u00df\u00e1\5\60\31\2\u00e0"+
		"\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1/\3\2\2\2\u00e2\u00e5\5\62\32"+
		"\2\u00e3\u00e4\t\6\2\2\u00e4\u00e6\5\62\32\2\u00e5\u00e3\3\2\2\2\u00e5"+
		"\u00e6\3\2\2\2\u00e6\61\3\2\2\2\u00e7\u00ed\5\64\33\2\u00e8\u00e9\7,\2"+
		"\2\u00e9\u00ea\5*\26\2\u00ea\u00eb\7-\2\2\u00eb\u00ed\3\2\2\2\u00ec\u00e7"+
		"\3\2\2\2\u00ec\u00e8\3\2\2\2\u00ed\63\3\2\2\2\u00ee\u00f4\7/\2\2\u00ef"+
		"\u00f4\7\60\2\2\u00f0\u00f4\7\b\2\2\u00f1\u00f4\7\t\2\2\u00f2\u00f4\5"+
		"\66\34\2\u00f3\u00ee\3\2\2\2\u00f3\u00ef\3\2\2\2\u00f3\u00f0\3\2\2\2\u00f3"+
		"\u00f1\3\2\2\2\u00f3\u00f2\3\2\2\2\u00f4\65\3\2\2\2\u00f5\u00fa\7.\2\2"+
		"\u00f6\u00f7\7)\2\2\u00f7\u00f9\7.\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00fc"+
		"\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u0103\3\2\2\2\u00fc"+
		"\u00fa\3\2\2\2\u00fd\u00fe\7,\2\2\u00fe\u00ff\5*\26\2\u00ff\u0100\7-\2"+
		"\2\u0100\u0102\3\2\2\2\u0101\u00fd\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101"+
		"\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u010a\3\2\2\2\u0105\u0103\3\2\2\2\u0106"+
		"\u0107\7)\2\2\u0107\u0109\7.\2\2\u0108\u0106\3\2\2\2\u0109\u010c\3\2\2"+
		"\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\67\3\2\2\2\u010c\u010a"+
		"\3\2\2\2\34:<ACKQ]ilx\u0089\u008f\u0098\u00a5\u00aa\u00bb\u00cf\u00d6"+
		"\u00db\u00e0\u00e5\u00ec\u00f3\u00fa\u0103\u010a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}