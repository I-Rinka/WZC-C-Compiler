// Generated from c:\Users\I_Rin\Desktop\WZC-C-Compiler\src\WZCCC\parser\antlr\C.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Auto=1, Break=2, Case=3, Char=4, Const=5, Continue=6, Default=7, Do=8, 
		Double=9, Else=10, Enum=11, Extern=12, Float=13, For=14, Goto=15, If=16, 
		Inline=17, Int=18, Long=19, Register=20, Restrict=21, Return=22, Short=23, 
		Signed=24, Sizeof=25, Static=26, Struct=27, Switch=28, Typedef=29, Union=30, 
		Unsigned=31, Void=32, Volatile=33, While=34, Alignas=35, Alignof=36, Atomic=37, 
		Bool=38, Complex=39, LeftParen=40, RightParen=41, LeftBracket=42, RightBracket=43, 
		LeftBrace=44, RightBrace=45, Less=46, LessEqual=47, Greater=48, GreaterEqual=49, 
		LeftShift=50, RightShift=51, Plus=52, PlusPlus=53, Minus=54, MinusMinus=55, 
		Star=56, Div=57, Mod=58, And=59, Or=60, AndAnd=61, OrOr=62, Caret=63, 
		Not=64, Tilde=65, Question=66, Colon=67, Semi=68, Comma=69, Assign=70, 
		StarAssign=71, DivAssign=72, ModAssign=73, PlusAssign=74, MinusAssign=75, 
		LeftShiftAssign=76, RightShiftAssign=77, AndAssign=78, XorAssign=79, OrAssign=80, 
		Equal=81, NotEqual=82, Arrow=83, Dot=84, Ellipsis=85, Identifier=86, Constant=87, 
		DigitSequence=88, StringLiteral=89, ComplexDefine=90, IncludeDirective=91, 
		AsmBlock=92, LineAfterPreprocessing=93, LineDirective=94, PragmaDirective=95, 
		Whitespace=96, Newline=97, BlockComment=98, LineComment=99;
	public static final int
		RULE_primaryExpression = 0, RULE_postfixExpression = 1, RULE_argumentExpressionList = 2, 
		RULE_unaryExpression = 3, RULE_unaryOperator = 4, RULE_castExpression = 5, 
		RULE_multiplicativeExpression = 6, RULE_additiveExpression = 7, RULE_shiftExpression = 8, 
		RULE_relationalExpression = 9, RULE_equalityExpression = 10, RULE_andExpression = 11, 
		RULE_exclusiveOrExpression = 12, RULE_inclusiveOrExpression = 13, RULE_logicalAndExpression = 14, 
		RULE_logicalOrExpression = 15, RULE_conditionalExpression = 16, RULE_assignmentExpression = 17, 
		RULE_assignmentOperator = 18, RULE_expression = 19, RULE_constantExpression = 20, 
		RULE_declaration = 21, RULE_declarationSpecifiers = 22, RULE_declarationSpecifiers2 = 23, 
		RULE_declarationSpecifier = 24, RULE_initDeclaratorList = 25, RULE_initDeclarator = 26, 
		RULE_storageClassSpecifier = 27, RULE_typeSpecifier = 28, RULE_structOrUnionSpecifier = 29, 
		RULE_structOrUnion = 30, RULE_structDeclarationList = 31, RULE_structDeclaration = 32, 
		RULE_specifierQualifierList = 33, RULE_structDeclaratorList = 34, RULE_structDeclarator = 35, 
		RULE_enumSpecifier = 36, RULE_enumeratorList = 37, RULE_enumerator = 38, 
		RULE_enumerationConstant = 39, RULE_typeQualifier = 40, RULE_declarator = 41, 
		RULE_directDeclarator = 42, RULE_pointer = 43, RULE_typeQualifierList = 44, 
		RULE_parameterTypeList = 45, RULE_parameterList = 46, RULE_parameterDeclaration = 47, 
		RULE_identifierList = 48, RULE_typeName = 49, RULE_abstractDeclarator = 50, 
		RULE_directAbstractDeclarator = 51, RULE_typedefName = 52, RULE_initializer = 53, 
		RULE_initializerList = 54, RULE_designation = 55, RULE_designatorList = 56, 
		RULE_designator = 57, RULE_statement = 58, RULE_labeledStatement = 59, 
		RULE_compoundStatement = 60, RULE_blockItemList = 61, RULE_blockItem = 62, 
		RULE_expressionStatement = 63, RULE_selectionStatement = 64, RULE_iterationStatement = 65, 
		RULE_forDeclaration = 66, RULE_forExpression = 67, RULE_jumpStatement = 68, 
		RULE_compilationUnit = 69, RULE_translationUnit = 70, RULE_externalDeclaration = 71, 
		RULE_functionDefinition = 72, RULE_declarationList = 73;
	private static String[] makeRuleNames() {
		return new String[] {
			"primaryExpression", "postfixExpression", "argumentExpressionList", "unaryExpression", 
			"unaryOperator", "castExpression", "multiplicativeExpression", "additiveExpression", 
			"shiftExpression", "relationalExpression", "equalityExpression", "andExpression", 
			"exclusiveOrExpression", "inclusiveOrExpression", "logicalAndExpression", 
			"logicalOrExpression", "conditionalExpression", "assignmentExpression", 
			"assignmentOperator", "expression", "constantExpression", "declaration", 
			"declarationSpecifiers", "declarationSpecifiers2", "declarationSpecifier", 
			"initDeclaratorList", "initDeclarator", "storageClassSpecifier", "typeSpecifier", 
			"structOrUnionSpecifier", "structOrUnion", "structDeclarationList", "structDeclaration", 
			"specifierQualifierList", "structDeclaratorList", "structDeclarator", 
			"enumSpecifier", "enumeratorList", "enumerator", "enumerationConstant", 
			"typeQualifier", "declarator", "directDeclarator", "pointer", "typeQualifierList", 
			"parameterTypeList", "parameterList", "parameterDeclaration", "identifierList", 
			"typeName", "abstractDeclarator", "directAbstractDeclarator", "typedefName", 
			"initializer", "initializerList", "designation", "designatorList", "designator", 
			"statement", "labeledStatement", "compoundStatement", "blockItemList", 
			"blockItem", "expressionStatement", "selectionStatement", "iterationStatement", 
			"forDeclaration", "forExpression", "jumpStatement", "compilationUnit", 
			"translationUnit", "externalDeclaration", "functionDefinition", "declarationList"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'auto'", "'break'", "'case'", "'char'", "'const'", "'continue'", 
			"'default'", "'do'", "'double'", "'else'", "'enum'", "'extern'", "'float'", 
			"'for'", "'goto'", "'if'", "'inline'", "'int'", "'long'", "'register'", 
			"'restrict'", "'return'", "'short'", "'signed'", "'sizeof'", "'static'", 
			"'struct'", "'switch'", "'typedef'", "'union'", "'unsigned'", "'void'", 
			"'volatile'", "'while'", "'_Alignas'", "'_Alignof'", "'_Atomic'", "'_Bool'", 
			"'_Complex'", "'('", "')'", "'['", "']'", "'{'", "'}'", "'<'", "'<='", 
			"'>'", "'>='", "'<<'", "'>>'", "'+'", "'++'", "'-'", "'--'", "'*'", "'/'", 
			"'%'", "'&'", "'|'", "'&&'", "'||'", "'^'", "'!'", "'~'", "'?'", "':'", 
			"';'", "','", "'='", "'*='", "'/='", "'%='", "'+='", "'-='", "'<<='", 
			"'>>='", "'&='", "'^='", "'|='", "'=='", "'!='", "'->'", "'.'", "'...'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Auto", "Break", "Case", "Char", "Const", "Continue", "Default", 
			"Do", "Double", "Else", "Enum", "Extern", "Float", "For", "Goto", "If", 
			"Inline", "Int", "Long", "Register", "Restrict", "Return", "Short", "Signed", 
			"Sizeof", "Static", "Struct", "Switch", "Typedef", "Union", "Unsigned", 
			"Void", "Volatile", "While", "Alignas", "Alignof", "Atomic", "Bool", 
			"Complex", "LeftParen", "RightParen", "LeftBracket", "RightBracket", 
			"LeftBrace", "RightBrace", "Less", "LessEqual", "Greater", "GreaterEqual", 
			"LeftShift", "RightShift", "Plus", "PlusPlus", "Minus", "MinusMinus", 
			"Star", "Div", "Mod", "And", "Or", "AndAnd", "OrOr", "Caret", "Not", 
			"Tilde", "Question", "Colon", "Semi", "Comma", "Assign", "StarAssign", 
			"DivAssign", "ModAssign", "PlusAssign", "MinusAssign", "LeftShiftAssign", 
			"RightShiftAssign", "AndAssign", "XorAssign", "OrAssign", "Equal", "NotEqual", 
			"Arrow", "Dot", "Ellipsis", "Identifier", "Constant", "DigitSequence", 
			"StringLiteral", "ComplexDefine", "IncludeDirective", "AsmBlock", "LineAfterPreprocessing", 
			"LineDirective", "PragmaDirective", "Whitespace", "Newline", "BlockComment", 
			"LineComment"
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
	public String getGrammarFileName() { return "C.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public TerminalNode Constant() { return getToken(CParser.Constant, 0); }
		public List<TerminalNode> StringLiteral() { return getTokens(CParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(CParser.StringLiteral, i);
		}
		public TerminalNode LeftParen() { return getToken(CParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CParser.RightParen, 0); }
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_primaryExpression);
		try {
			int _alt;
			setState(159);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				match(Identifier);
				}
				break;
			case Constant:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				match(Constant);
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(151); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(150);
						match(StringLiteral);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(153); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 4);
				{
				setState(155);
				match(LeftParen);
				setState(156);
				expression(0);
				setState(157);
				match(RightParen);
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

	public static class PostfixExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
	 
		public PostfixExpressionContext() { }
		public void copyFrom(PostfixExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PostfixExpression_passContext extends PostfixExpressionContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public PostfixExpression_passContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class FunctionCall_Context extends PostfixExpressionContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(CParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(CParser.RightParen, 0); }
		public ArgumentExpressionListContext argumentExpressionList() {
			return getRuleContext(ArgumentExpressionListContext.class,0);
		}
		public FunctionCall_Context(PostfixExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class PostfixExpression_Context extends PostfixExpressionContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode Dot() { return getToken(CParser.Dot, 0); }
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public TerminalNode Arrow() { return getToken(CParser.Arrow, 0); }
		public TerminalNode PlusPlus() { return getToken(CParser.PlusPlus, 0); }
		public TerminalNode MinusMinus() { return getToken(CParser.MinusMinus, 0); }
		public PostfixExpression_Context(PostfixExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ArrayAceess_Context extends PostfixExpressionContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(CParser.LeftBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(CParser.RightBracket, 0); }
		public ArrayAceess_Context(PostfixExpressionContext ctx) { copyFrom(ctx); }
	}

	public final PostfixExpressionContext postfixExpression() throws RecognitionException {
		return postfixExpression(0);
	}

	private PostfixExpressionContext postfixExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, _parentState);
		PostfixExpressionContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_postfixExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PostfixExpression_passContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(162);
			primaryExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(187);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(185);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new ArrayAceess_Context(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(164);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(165);
						match(LeftBracket);
						setState(166);
						expression(0);
						setState(167);
						match(RightBracket);
						}
						break;
					case 2:
						{
						_localctx = new FunctionCall_Context(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(169);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(170);
						match(LeftParen);
						setState(172);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Sizeof) | (1L << LeftParen) | (1L << Plus) | (1L << PlusPlus) | (1L << Minus) | (1L << MinusMinus) | (1L << Star) | (1L << And))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Not - 64)) | (1L << (Tilde - 64)) | (1L << (Identifier - 64)) | (1L << (Constant - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
							{
							setState(171);
							argumentExpressionList(0);
							}
						}

						setState(174);
						match(RightParen);
						}
						break;
					case 3:
						{
						_localctx = new PostfixExpression_Context(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(175);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(176);
						match(Dot);
						setState(177);
						match(Identifier);
						}
						break;
					case 4:
						{
						_localctx = new PostfixExpression_Context(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(178);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(179);
						match(Arrow);
						setState(180);
						match(Identifier);
						}
						break;
					case 5:
						{
						_localctx = new PostfixExpression_Context(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(181);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(182);
						match(PlusPlus);
						}
						break;
					case 6:
						{
						_localctx = new PostfixExpression_Context(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(183);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(184);
						match(MinusMinus);
						}
						break;
					}
					} 
				}
				setState(189);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ArgumentExpressionListContext extends ParserRuleContext {
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ArgumentExpressionListContext argumentExpressionList() {
			return getRuleContext(ArgumentExpressionListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CParser.Comma, 0); }
		public ArgumentExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentExpressionList; }
	}

	public final ArgumentExpressionListContext argumentExpressionList() throws RecognitionException {
		return argumentExpressionList(0);
	}

	private ArgumentExpressionListContext argumentExpressionList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArgumentExpressionListContext _localctx = new ArgumentExpressionListContext(_ctx, _parentState);
		ArgumentExpressionListContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_argumentExpressionList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(191);
			assignmentExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(198);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArgumentExpressionListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_argumentExpressionList);
					setState(193);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(194);
					match(Comma);
					setState(195);
					assignmentExpression();
					}
					} 
				}
				setState(200);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class UnaryExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
	 
		public UnaryExpressionContext() { }
		public void copyFrom(UnaryExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UnaryTypename_Context extends UnaryExpressionContext {
		public TerminalNode Sizeof() { return getToken(CParser.Sizeof, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(CParser.LeftParen, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CParser.RightParen, 0); }
		public UnaryTypename_Context(UnaryExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class UnaryExpression_Context extends UnaryExpressionContext {
		public TerminalNode PlusPlus() { return getToken(CParser.PlusPlus, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode MinusMinus() { return getToken(CParser.MinusMinus, 0); }
		public UnaryOperatorContext unaryOperator() {
			return getRuleContext(UnaryOperatorContext.class,0);
		}
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public UnaryExpression_Context(UnaryExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class UnaryExpression_passContext extends UnaryExpressionContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public UnaryExpression_passContext(UnaryExpressionContext ctx) { copyFrom(ctx); }
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_unaryExpression);
		try {
			setState(216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new UnaryExpression_passContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				postfixExpression(0);
				}
				break;
			case 2:
				_localctx = new UnaryExpression_Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				match(PlusPlus);
				setState(203);
				unaryExpression();
				}
				break;
			case 3:
				_localctx = new UnaryExpression_Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(204);
				match(MinusMinus);
				setState(205);
				unaryExpression();
				}
				break;
			case 4:
				_localctx = new UnaryExpression_Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(206);
				unaryOperator();
				setState(207);
				castExpression();
				}
				break;
			case 5:
				_localctx = new UnaryTypename_Context(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(209);
				match(Sizeof);
				setState(210);
				unaryExpression();
				}
				break;
			case 6:
				_localctx = new UnaryTypename_Context(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(211);
				match(Sizeof);
				setState(212);
				match(LeftParen);
				setState(213);
				typeName();
				setState(214);
				match(RightParen);
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

	public static class UnaryOperatorContext extends ParserRuleContext {
		public TerminalNode And() { return getToken(CParser.And, 0); }
		public TerminalNode Star() { return getToken(CParser.Star, 0); }
		public TerminalNode Plus() { return getToken(CParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(CParser.Minus, 0); }
		public TerminalNode Tilde() { return getToken(CParser.Tilde, 0); }
		public TerminalNode Not() { return getToken(CParser.Not, 0); }
		public UnaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryOperator; }
	}

	public final UnaryOperatorContext unaryOperator() throws RecognitionException {
		UnaryOperatorContext _localctx = new UnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_unaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			_la = _input.LA(1);
			if ( !(((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (Plus - 52)) | (1L << (Minus - 52)) | (1L << (Star - 52)) | (1L << (And - 52)) | (1L << (Not - 52)) | (1L << (Tilde - 52)))) != 0)) ) {
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

	public static class CastExpressionContext extends ParserRuleContext {
		public CastExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpression; }
	 
		public CastExpressionContext() { }
		public void copyFrom(CastExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CastExpression_Context extends CastExpressionContext {
		public TerminalNode LeftParen() { return getToken(CParser.LeftParen, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CParser.RightParen, 0); }
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public CastExpression_Context(CastExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class CastExpression_passContext extends CastExpressionContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public CastExpression_passContext(CastExpressionContext ctx) { copyFrom(ctx); }
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_castExpression);
		try {
			setState(226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new CastExpression_Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				match(LeftParen);
				setState(221);
				typeName();
				setState(222);
				match(RightParen);
				setState(223);
				castExpression();
				}
				break;
			case 2:
				_localctx = new CastExpression_passContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(225);
				unaryExpression();
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

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
	 
		public MultiplicativeExpressionContext() { }
		public void copyFrom(MultiplicativeExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MultiplicativeExpression_Context extends MultiplicativeExpressionContext {
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public TerminalNode Star() { return getToken(CParser.Star, 0); }
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public TerminalNode Div() { return getToken(CParser.Div, 0); }
		public TerminalNode Mod() { return getToken(CParser.Mod, 0); }
		public MultiplicativeExpression_Context(MultiplicativeExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class MultiplicativeExpression_passContext extends MultiplicativeExpressionContext {
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public MultiplicativeExpression_passContext(MultiplicativeExpressionContext ctx) { copyFrom(ctx); }
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		return multiplicativeExpression(0);
	}

	private MultiplicativeExpressionContext multiplicativeExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, _parentState);
		MultiplicativeExpressionContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_multiplicativeExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new MultiplicativeExpression_passContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(229);
			castExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(242);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(240);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExpression_Context(new MultiplicativeExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(231);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(232);
						match(Star);
						setState(233);
						castExpression();
						}
						break;
					case 2:
						{
						_localctx = new MultiplicativeExpression_Context(new MultiplicativeExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(234);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(235);
						match(Div);
						setState(236);
						castExpression();
						}
						break;
					case 3:
						{
						_localctx = new MultiplicativeExpression_Context(new MultiplicativeExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(237);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(238);
						match(Mod);
						setState(239);
						castExpression();
						}
						break;
					}
					} 
				}
				setState(244);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
	 
		public AdditiveExpressionContext() { }
		public void copyFrom(AdditiveExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AdditiveExpression_passContext extends AdditiveExpressionContext {
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public AdditiveExpression_passContext(AdditiveExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class AdditiveExpression_Context extends AdditiveExpressionContext {
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public TerminalNode Plus() { return getToken(CParser.Plus, 0); }
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public TerminalNode Minus() { return getToken(CParser.Minus, 0); }
		public AdditiveExpression_Context(AdditiveExpressionContext ctx) { copyFrom(ctx); }
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		return additiveExpression(0);
	}

	private AdditiveExpressionContext additiveExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, _parentState);
		AdditiveExpressionContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_additiveExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new AdditiveExpression_passContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(246);
			multiplicativeExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(256);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(254);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new AdditiveExpression_Context(new AdditiveExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(248);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(249);
						match(Plus);
						setState(250);
						multiplicativeExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExpression_Context(new AdditiveExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(251);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(252);
						match(Minus);
						setState(253);
						multiplicativeExpression(0);
						}
						break;
					}
					} 
				}
				setState(258);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ShiftExpressionContext extends ParserRuleContext {
		public ShiftExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftExpression; }
	 
		public ShiftExpressionContext() { }
		public void copyFrom(ShiftExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ShiftExpression_Context extends ShiftExpressionContext {
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public TerminalNode LeftShift() { return getToken(CParser.LeftShift, 0); }
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public TerminalNode RightShift() { return getToken(CParser.RightShift, 0); }
		public ShiftExpression_Context(ShiftExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ShiftExpression_passContext extends ShiftExpressionContext {
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public ShiftExpression_passContext(ShiftExpressionContext ctx) { copyFrom(ctx); }
	}

	public final ShiftExpressionContext shiftExpression() throws RecognitionException {
		return shiftExpression(0);
	}

	private ShiftExpressionContext shiftExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ShiftExpressionContext _localctx = new ShiftExpressionContext(_ctx, _parentState);
		ShiftExpressionContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_shiftExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ShiftExpression_passContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(260);
			additiveExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(270);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(268);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new ShiftExpression_Context(new ShiftExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(262);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(263);
						match(LeftShift);
						setState(264);
						additiveExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new ShiftExpression_Context(new ShiftExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(265);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(266);
						match(RightShift);
						setState(267);
						additiveExpression(0);
						}
						break;
					}
					} 
				}
				setState(272);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class RelationalExpressionContext extends ParserRuleContext {
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
	 
		public RelationalExpressionContext() { }
		public void copyFrom(RelationalExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RelationalExpression_passContext extends RelationalExpressionContext {
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public RelationalExpression_passContext(RelationalExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class RelationalExpression_Context extends RelationalExpressionContext {
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public TerminalNode Less() { return getToken(CParser.Less, 0); }
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public TerminalNode Greater() { return getToken(CParser.Greater, 0); }
		public TerminalNode LessEqual() { return getToken(CParser.LessEqual, 0); }
		public TerminalNode GreaterEqual() { return getToken(CParser.GreaterEqual, 0); }
		public RelationalExpression_Context(RelationalExpressionContext ctx) { copyFrom(ctx); }
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		return relationalExpression(0);
	}

	private RelationalExpressionContext relationalExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, _parentState);
		RelationalExpressionContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_relationalExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new RelationalExpression_passContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(274);
			shiftExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(290);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(288);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new RelationalExpression_Context(new RelationalExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(276);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(277);
						match(Less);
						setState(278);
						shiftExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new RelationalExpression_Context(new RelationalExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(279);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(280);
						match(Greater);
						setState(281);
						shiftExpression(0);
						}
						break;
					case 3:
						{
						_localctx = new RelationalExpression_Context(new RelationalExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(282);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(283);
						match(LessEqual);
						setState(284);
						shiftExpression(0);
						}
						break;
					case 4:
						{
						_localctx = new RelationalExpression_Context(new RelationalExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(285);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(286);
						match(GreaterEqual);
						setState(287);
						shiftExpression(0);
						}
						break;
					}
					} 
				}
				setState(292);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EqualityExpressionContext extends ParserRuleContext {
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
	 
		public EqualityExpressionContext() { }
		public void copyFrom(EqualityExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EqualityExpression_passContext extends EqualityExpressionContext {
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public EqualityExpression_passContext(EqualityExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class EqualityExpression_Context extends EqualityExpressionContext {
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public TerminalNode Equal() { return getToken(CParser.Equal, 0); }
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public TerminalNode NotEqual() { return getToken(CParser.NotEqual, 0); }
		public EqualityExpression_Context(EqualityExpressionContext ctx) { copyFrom(ctx); }
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		return equalityExpression(0);
	}

	private EqualityExpressionContext equalityExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, _parentState);
		EqualityExpressionContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_equalityExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new EqualityExpression_passContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(294);
			relationalExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(304);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(302);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new EqualityExpression_Context(new EqualityExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(296);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(297);
						match(Equal);
						setState(298);
						relationalExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new EqualityExpression_Context(new EqualityExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(299);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(300);
						match(NotEqual);
						setState(301);
						relationalExpression(0);
						}
						break;
					}
					} 
				}
				setState(306);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AndExpressionContext extends ParserRuleContext {
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public TerminalNode And() { return getToken(CParser.And, 0); }
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		return andExpression(0);
	}

	private AndExpressionContext andExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, _parentState);
		AndExpressionContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_andExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(308);
			equalityExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(315);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_andExpression);
					setState(310);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(311);
					match(And);
					setState(312);
					equalityExpression(0);
					}
					} 
				}
				setState(317);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExclusiveOrExpressionContext extends ParserRuleContext {
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public ExclusiveOrExpressionContext exclusiveOrExpression() {
			return getRuleContext(ExclusiveOrExpressionContext.class,0);
		}
		public TerminalNode Caret() { return getToken(CParser.Caret, 0); }
		public ExclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusiveOrExpression; }
	}

	public final ExclusiveOrExpressionContext exclusiveOrExpression() throws RecognitionException {
		return exclusiveOrExpression(0);
	}

	private ExclusiveOrExpressionContext exclusiveOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExclusiveOrExpressionContext _localctx = new ExclusiveOrExpressionContext(_ctx, _parentState);
		ExclusiveOrExpressionContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_exclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(319);
			andExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(326);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExclusiveOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exclusiveOrExpression);
					setState(321);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(322);
					match(Caret);
					setState(323);
					andExpression(0);
					}
					} 
				}
				setState(328);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class InclusiveOrExpressionContext extends ParserRuleContext {
		public ExclusiveOrExpressionContext exclusiveOrExpression() {
			return getRuleContext(ExclusiveOrExpressionContext.class,0);
		}
		public InclusiveOrExpressionContext inclusiveOrExpression() {
			return getRuleContext(InclusiveOrExpressionContext.class,0);
		}
		public TerminalNode Or() { return getToken(CParser.Or, 0); }
		public InclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusiveOrExpression; }
	}

	public final InclusiveOrExpressionContext inclusiveOrExpression() throws RecognitionException {
		return inclusiveOrExpression(0);
	}

	private InclusiveOrExpressionContext inclusiveOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InclusiveOrExpressionContext _localctx = new InclusiveOrExpressionContext(_ctx, _parentState);
		InclusiveOrExpressionContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_inclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(330);
			exclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(337);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InclusiveOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_inclusiveOrExpression);
					setState(332);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(333);
					match(Or);
					setState(334);
					exclusiveOrExpression(0);
					}
					} 
				}
				setState(339);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LogicalAndExpressionContext extends ParserRuleContext {
		public LogicalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalAndExpression; }
	 
		public LogicalAndExpressionContext() { }
		public void copyFrom(LogicalAndExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LogicalAndExpression_passContext extends LogicalAndExpressionContext {
		public InclusiveOrExpressionContext inclusiveOrExpression() {
			return getRuleContext(InclusiveOrExpressionContext.class,0);
		}
		public LogicalAndExpression_passContext(LogicalAndExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class LogicalAndExpression_Context extends LogicalAndExpressionContext {
		public LogicalAndExpressionContext logicalAndExpression() {
			return getRuleContext(LogicalAndExpressionContext.class,0);
		}
		public TerminalNode AndAnd() { return getToken(CParser.AndAnd, 0); }
		public InclusiveOrExpressionContext inclusiveOrExpression() {
			return getRuleContext(InclusiveOrExpressionContext.class,0);
		}
		public LogicalAndExpression_Context(LogicalAndExpressionContext ctx) { copyFrom(ctx); }
	}

	public final LogicalAndExpressionContext logicalAndExpression() throws RecognitionException {
		return logicalAndExpression(0);
	}

	private LogicalAndExpressionContext logicalAndExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalAndExpressionContext _localctx = new LogicalAndExpressionContext(_ctx, _parentState);
		LogicalAndExpressionContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_logicalAndExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new LogicalAndExpression_passContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(341);
			inclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(348);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicalAndExpression_Context(new LogicalAndExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_logicalAndExpression);
					setState(343);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(344);
					match(AndAnd);
					setState(345);
					inclusiveOrExpression(0);
					}
					} 
				}
				setState(350);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LogicalOrExpressionContext extends ParserRuleContext {
		public LogicalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOrExpression; }
	 
		public LogicalOrExpressionContext() { }
		public void copyFrom(LogicalOrExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LogicalOrExpression_Context extends LogicalOrExpressionContext {
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public TerminalNode OrOr() { return getToken(CParser.OrOr, 0); }
		public LogicalAndExpressionContext logicalAndExpression() {
			return getRuleContext(LogicalAndExpressionContext.class,0);
		}
		public LogicalOrExpression_Context(LogicalOrExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class LogicalOrExpression_passContext extends LogicalOrExpressionContext {
		public LogicalAndExpressionContext logicalAndExpression() {
			return getRuleContext(LogicalAndExpressionContext.class,0);
		}
		public LogicalOrExpression_passContext(LogicalOrExpressionContext ctx) { copyFrom(ctx); }
	}

	public final LogicalOrExpressionContext logicalOrExpression() throws RecognitionException {
		return logicalOrExpression(0);
	}

	private LogicalOrExpressionContext logicalOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalOrExpressionContext _localctx = new LogicalOrExpressionContext(_ctx, _parentState);
		LogicalOrExpressionContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_logicalOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new LogicalOrExpression_passContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(352);
			logicalAndExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(359);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicalOrExpression_Context(new LogicalOrExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_logicalOrExpression);
					setState(354);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(355);
					match(OrOr);
					setState(356);
					logicalAndExpression(0);
					}
					} 
				}
				setState(361);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConditionalExpressionContext extends ParserRuleContext {
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
	 
		public ConditionalExpressionContext() { }
		public void copyFrom(ConditionalExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConditionalExpression_Context extends ConditionalExpressionContext {
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public TerminalNode Question() { return getToken(CParser.Question, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Colon() { return getToken(CParser.Colon, 0); }
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ConditionalExpression_Context(ConditionalExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ConditionalExpression_passContext extends ConditionalExpressionContext {
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public ConditionalExpression_passContext(ConditionalExpressionContext ctx) { copyFrom(ctx); }
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_conditionalExpression);
		try {
			setState(369);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				_localctx = new ConditionalExpression_passContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(362);
				logicalOrExpression(0);
				}
				break;
			case 2:
				_localctx = new ConditionalExpression_Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(363);
				logicalOrExpression(0);
				{
				setState(364);
				match(Question);
				setState(365);
				expression(0);
				setState(366);
				match(Colon);
				setState(367);
				conditionalExpression();
				}
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

	public static class AssignmentExpressionContext extends ParserRuleContext {
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
	 
		public AssignmentExpressionContext() { }
		public void copyFrom(AssignmentExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignmentExpression_passContext extends AssignmentExpressionContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public AssignmentExpression_passContext(AssignmentExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class AssignmentExpression_Context extends AssignmentExpressionContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public AssignmentExpression_Context(AssignmentExpressionContext ctx) { copyFrom(ctx); }
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_assignmentExpression);
		try {
			setState(376);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				_localctx = new AssignmentExpression_passContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(371);
				conditionalExpression();
				}
				break;
			case 2:
				_localctx = new AssignmentExpression_Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(372);
				unaryExpression();
				setState(373);
				assignmentOperator();
				setState(374);
				assignmentExpression();
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

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public TerminalNode Assign() { return getToken(CParser.Assign, 0); }
		public TerminalNode StarAssign() { return getToken(CParser.StarAssign, 0); }
		public TerminalNode DivAssign() { return getToken(CParser.DivAssign, 0); }
		public TerminalNode ModAssign() { return getToken(CParser.ModAssign, 0); }
		public TerminalNode PlusAssign() { return getToken(CParser.PlusAssign, 0); }
		public TerminalNode MinusAssign() { return getToken(CParser.MinusAssign, 0); }
		public TerminalNode LeftShiftAssign() { return getToken(CParser.LeftShiftAssign, 0); }
		public TerminalNode RightShiftAssign() { return getToken(CParser.RightShiftAssign, 0); }
		public TerminalNode AndAssign() { return getToken(CParser.AndAssign, 0); }
		public TerminalNode XorAssign() { return getToken(CParser.XorAssign, 0); }
		public TerminalNode OrAssign() { return getToken(CParser.OrAssign, 0); }
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			_la = _input.LA(1);
			if ( !(((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (Assign - 70)) | (1L << (StarAssign - 70)) | (1L << (DivAssign - 70)) | (1L << (ModAssign - 70)) | (1L << (PlusAssign - 70)) | (1L << (MinusAssign - 70)) | (1L << (LeftShiftAssign - 70)) | (1L << (RightShiftAssign - 70)) | (1L << (AndAssign - 70)) | (1L << (XorAssign - 70)) | (1L << (OrAssign - 70)))) != 0)) ) {
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

	public static class ExpressionContext extends ParserRuleContext {
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CParser.Comma, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(381);
			assignmentExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(388);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(383);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(384);
					match(Comma);
					setState(385);
					assignmentExpression();
					}
					} 
				}
				setState(390);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConstantExpressionContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ConstantExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantExpression; }
	}

	public final ConstantExpressionContext constantExpression() throws RecognitionException {
		ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			conditionalExpression();
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

	public static class DeclarationContext extends ParserRuleContext {
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class,0);
		}
		public TerminalNode Semi() { return getToken(CParser.Semi, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_declaration);
		try {
			setState(400);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(393);
				declarationSpecifiers();
				setState(394);
				initDeclaratorList(0);
				setState(395);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(397);
				declarationSpecifiers();
				setState(398);
				match(Semi);
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

	public static class DeclarationSpecifiersContext extends ParserRuleContext {
		public List<DeclarationSpecifierContext> declarationSpecifier() {
			return getRuleContexts(DeclarationSpecifierContext.class);
		}
		public DeclarationSpecifierContext declarationSpecifier(int i) {
			return getRuleContext(DeclarationSpecifierContext.class,i);
		}
		public DeclarationSpecifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationSpecifiers; }
	}

	public final DeclarationSpecifiersContext declarationSpecifiers() throws RecognitionException {
		DeclarationSpecifiersContext _localctx = new DeclarationSpecifiersContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_declarationSpecifiers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(403); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(402);
					declarationSpecifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(405); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class DeclarationSpecifiers2Context extends ParserRuleContext {
		public List<DeclarationSpecifierContext> declarationSpecifier() {
			return getRuleContexts(DeclarationSpecifierContext.class);
		}
		public DeclarationSpecifierContext declarationSpecifier(int i) {
			return getRuleContext(DeclarationSpecifierContext.class,i);
		}
		public DeclarationSpecifiers2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationSpecifiers2; }
	}

	public final DeclarationSpecifiers2Context declarationSpecifiers2() throws RecognitionException {
		DeclarationSpecifiers2Context _localctx = new DeclarationSpecifiers2Context(_ctx, getState());
		enterRule(_localctx, 46, RULE_declarationSpecifiers2);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(408); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(407);
					declarationSpecifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(410); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class DeclarationSpecifierContext extends ParserRuleContext {
		public StorageClassSpecifierContext storageClassSpecifier() {
			return getRuleContext(StorageClassSpecifierContext.class,0);
		}
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public TypeQualifierContext typeQualifier() {
			return getRuleContext(TypeQualifierContext.class,0);
		}
		public DeclarationSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationSpecifier; }
	}

	public final DeclarationSpecifierContext declarationSpecifier() throws RecognitionException {
		DeclarationSpecifierContext _localctx = new DeclarationSpecifierContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_declarationSpecifier);
		try {
			setState(415);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Auto:
			case Extern:
			case Register:
			case Static:
			case Typedef:
				enterOuterAlt(_localctx, 1);
				{
				setState(412);
				storageClassSpecifier();
				}
				break;
			case Char:
			case Double:
			case Enum:
			case Float:
			case Int:
			case Long:
			case Short:
			case Signed:
			case Struct:
			case Union:
			case Unsigned:
			case Void:
			case Bool:
			case Complex:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(413);
				typeSpecifier(0);
				}
				break;
			case Const:
			case Restrict:
			case Volatile:
			case Atomic:
				enterOuterAlt(_localctx, 3);
				{
				setState(414);
				typeQualifier();
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

	public static class InitDeclaratorListContext extends ParserRuleContext {
		public InitDeclaratorContext initDeclarator() {
			return getRuleContext(InitDeclaratorContext.class,0);
		}
		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CParser.Comma, 0); }
		public InitDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initDeclaratorList; }
	}

	public final InitDeclaratorListContext initDeclaratorList() throws RecognitionException {
		return initDeclaratorList(0);
	}

	private InitDeclaratorListContext initDeclaratorList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InitDeclaratorListContext _localctx = new InitDeclaratorListContext(_ctx, _parentState);
		InitDeclaratorListContext _prevctx = _localctx;
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_initDeclaratorList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(418);
			initDeclarator();
			}
			_ctx.stop = _input.LT(-1);
			setState(425);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InitDeclaratorListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_initDeclaratorList);
					setState(420);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(421);
					match(Comma);
					setState(422);
					initDeclarator();
					}
					} 
				}
				setState(427);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class InitDeclaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TerminalNode Assign() { return getToken(CParser.Assign, 0); }
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public InitDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initDeclarator; }
	}

	public final InitDeclaratorContext initDeclarator() throws RecognitionException {
		InitDeclaratorContext _localctx = new InitDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_initDeclarator);
		try {
			setState(433);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(428);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(429);
				declarator();
				setState(430);
				match(Assign);
				setState(431);
				initializer();
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

	public static class StorageClassSpecifierContext extends ParserRuleContext {
		public TerminalNode Typedef() { return getToken(CParser.Typedef, 0); }
		public TerminalNode Extern() { return getToken(CParser.Extern, 0); }
		public TerminalNode Static() { return getToken(CParser.Static, 0); }
		public TerminalNode Auto() { return getToken(CParser.Auto, 0); }
		public TerminalNode Register() { return getToken(CParser.Register, 0); }
		public StorageClassSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageClassSpecifier; }
	}

	public final StorageClassSpecifierContext storageClassSpecifier() throws RecognitionException {
		StorageClassSpecifierContext _localctx = new StorageClassSpecifierContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_storageClassSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Auto) | (1L << Extern) | (1L << Register) | (1L << Static) | (1L << Typedef))) != 0)) ) {
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

	public static class TypeSpecifierContext extends ParserRuleContext {
		public TerminalNode Void() { return getToken(CParser.Void, 0); }
		public TerminalNode Char() { return getToken(CParser.Char, 0); }
		public TerminalNode Short() { return getToken(CParser.Short, 0); }
		public TerminalNode Int() { return getToken(CParser.Int, 0); }
		public TerminalNode Long() { return getToken(CParser.Long, 0); }
		public TerminalNode Float() { return getToken(CParser.Float, 0); }
		public TerminalNode Double() { return getToken(CParser.Double, 0); }
		public TerminalNode Signed() { return getToken(CParser.Signed, 0); }
		public TerminalNode Unsigned() { return getToken(CParser.Unsigned, 0); }
		public TerminalNode Bool() { return getToken(CParser.Bool, 0); }
		public TerminalNode Complex() { return getToken(CParser.Complex, 0); }
		public StructOrUnionSpecifierContext structOrUnionSpecifier() {
			return getRuleContext(StructOrUnionSpecifierContext.class,0);
		}
		public EnumSpecifierContext enumSpecifier() {
			return getRuleContext(EnumSpecifierContext.class,0);
		}
		public TypedefNameContext typedefName() {
			return getRuleContext(TypedefNameContext.class,0);
		}
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public TypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpecifier; }
	}

	public final TypeSpecifierContext typeSpecifier() throws RecognitionException {
		return typeSpecifier(0);
	}

	private TypeSpecifierContext typeSpecifier(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeSpecifierContext _localctx = new TypeSpecifierContext(_ctx, _parentState);
		TypeSpecifierContext _prevctx = _localctx;
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_typeSpecifier, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Char:
			case Double:
			case Float:
			case Int:
			case Long:
			case Short:
			case Signed:
			case Unsigned:
			case Void:
			case Bool:
			case Complex:
				{
				setState(438);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Char) | (1L << Double) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Short) | (1L << Signed) | (1L << Unsigned) | (1L << Void) | (1L << Bool) | (1L << Complex))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case Struct:
			case Union:
				{
				setState(439);
				structOrUnionSpecifier();
				}
				break;
			case Enum:
				{
				setState(440);
				enumSpecifier();
				}
				break;
			case Identifier:
				{
				setState(441);
				typedefName();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(448);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeSpecifierContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_typeSpecifier);
					setState(444);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(445);
					pointer();
					}
					} 
				}
				setState(450);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class StructOrUnionSpecifierContext extends ParserRuleContext {
		public StructOrUnionContext structOrUnion() {
			return getRuleContext(StructOrUnionContext.class,0);
		}
		public TerminalNode LeftBrace() { return getToken(CParser.LeftBrace, 0); }
		public StructDeclarationListContext structDeclarationList() {
			return getRuleContext(StructDeclarationListContext.class,0);
		}
		public TerminalNode RightBrace() { return getToken(CParser.RightBrace, 0); }
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public StructOrUnionSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structOrUnionSpecifier; }
	}

	public final StructOrUnionSpecifierContext structOrUnionSpecifier() throws RecognitionException {
		StructOrUnionSpecifierContext _localctx = new StructOrUnionSpecifierContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_structOrUnionSpecifier);
		int _la;
		try {
			setState(462);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(451);
				structOrUnion();
				setState(453);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(452);
					match(Identifier);
					}
				}

				setState(455);
				match(LeftBrace);
				setState(456);
				structDeclarationList(0);
				setState(457);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(459);
				structOrUnion();
				setState(460);
				match(Identifier);
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

	public static class StructOrUnionContext extends ParserRuleContext {
		public TerminalNode Struct() { return getToken(CParser.Struct, 0); }
		public TerminalNode Union() { return getToken(CParser.Union, 0); }
		public StructOrUnionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structOrUnion; }
	}

	public final StructOrUnionContext structOrUnion() throws RecognitionException {
		StructOrUnionContext _localctx = new StructOrUnionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_structOrUnion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			_la = _input.LA(1);
			if ( !(_la==Struct || _la==Union) ) {
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

	public static class StructDeclarationListContext extends ParserRuleContext {
		public StructDeclarationContext structDeclaration() {
			return getRuleContext(StructDeclarationContext.class,0);
		}
		public StructDeclarationListContext structDeclarationList() {
			return getRuleContext(StructDeclarationListContext.class,0);
		}
		public StructDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclarationList; }
	}

	public final StructDeclarationListContext structDeclarationList() throws RecognitionException {
		return structDeclarationList(0);
	}

	private StructDeclarationListContext structDeclarationList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StructDeclarationListContext _localctx = new StructDeclarationListContext(_ctx, _parentState);
		StructDeclarationListContext _prevctx = _localctx;
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_structDeclarationList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(467);
			structDeclaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(473);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StructDeclarationListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_structDeclarationList);
					setState(469);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(470);
					structDeclaration();
					}
					} 
				}
				setState(475);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class StructDeclarationContext extends ParserRuleContext {
		public SpecifierQualifierListContext specifierQualifierList() {
			return getRuleContext(SpecifierQualifierListContext.class,0);
		}
		public TerminalNode Semi() { return getToken(CParser.Semi, 0); }
		public StructDeclaratorListContext structDeclaratorList() {
			return getRuleContext(StructDeclaratorListContext.class,0);
		}
		public StructDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclaration; }
	}

	public final StructDeclarationContext structDeclaration() throws RecognitionException {
		StructDeclarationContext _localctx = new StructDeclarationContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_structDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			specifierQualifierList();
			setState(478);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (LeftParen - 40)) | (1L << (Star - 40)) | (1L << (Caret - 40)) | (1L << (Colon - 40)) | (1L << (Identifier - 40)))) != 0)) {
				{
				setState(477);
				structDeclaratorList(0);
				}
			}

			setState(480);
			match(Semi);
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

	public static class SpecifierQualifierListContext extends ParserRuleContext {
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public SpecifierQualifierListContext specifierQualifierList() {
			return getRuleContext(SpecifierQualifierListContext.class,0);
		}
		public TypeQualifierContext typeQualifier() {
			return getRuleContext(TypeQualifierContext.class,0);
		}
		public SpecifierQualifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specifierQualifierList; }
	}

	public final SpecifierQualifierListContext specifierQualifierList() throws RecognitionException {
		SpecifierQualifierListContext _localctx = new SpecifierQualifierListContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_specifierQualifierList);
		try {
			setState(490);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Char:
			case Double:
			case Enum:
			case Float:
			case Int:
			case Long:
			case Short:
			case Signed:
			case Struct:
			case Union:
			case Unsigned:
			case Void:
			case Bool:
			case Complex:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(482);
				typeSpecifier(0);
				setState(484);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(483);
					specifierQualifierList();
					}
					break;
				}
				}
				break;
			case Const:
			case Restrict:
			case Volatile:
			case Atomic:
				enterOuterAlt(_localctx, 2);
				{
				setState(486);
				typeQualifier();
				setState(488);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(487);
					specifierQualifierList();
					}
					break;
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

	public static class StructDeclaratorListContext extends ParserRuleContext {
		public StructDeclaratorContext structDeclarator() {
			return getRuleContext(StructDeclaratorContext.class,0);
		}
		public StructDeclaratorListContext structDeclaratorList() {
			return getRuleContext(StructDeclaratorListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CParser.Comma, 0); }
		public StructDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclaratorList; }
	}

	public final StructDeclaratorListContext structDeclaratorList() throws RecognitionException {
		return structDeclaratorList(0);
	}

	private StructDeclaratorListContext structDeclaratorList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StructDeclaratorListContext _localctx = new StructDeclaratorListContext(_ctx, _parentState);
		StructDeclaratorListContext _prevctx = _localctx;
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_structDeclaratorList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(493);
			structDeclarator();
			}
			_ctx.stop = _input.LT(-1);
			setState(500);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StructDeclaratorListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_structDeclaratorList);
					setState(495);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(496);
					match(Comma);
					setState(497);
					structDeclarator();
					}
					} 
				}
				setState(502);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class StructDeclaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TerminalNode Colon() { return getToken(CParser.Colon, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public StructDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclarator; }
	}

	public final StructDeclaratorContext structDeclarator() throws RecognitionException {
		StructDeclaratorContext _localctx = new StructDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_structDeclarator);
		int _la;
		try {
			setState(509);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(503);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(505);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (LeftParen - 40)) | (1L << (Star - 40)) | (1L << (Caret - 40)) | (1L << (Identifier - 40)))) != 0)) {
					{
					setState(504);
					declarator();
					}
				}

				setState(507);
				match(Colon);
				setState(508);
				constantExpression();
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

	public static class EnumSpecifierContext extends ParserRuleContext {
		public TerminalNode Enum() { return getToken(CParser.Enum, 0); }
		public TerminalNode LeftBrace() { return getToken(CParser.LeftBrace, 0); }
		public EnumeratorListContext enumeratorList() {
			return getRuleContext(EnumeratorListContext.class,0);
		}
		public TerminalNode RightBrace() { return getToken(CParser.RightBrace, 0); }
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public TerminalNode Comma() { return getToken(CParser.Comma, 0); }
		public EnumSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumSpecifier; }
	}

	public final EnumSpecifierContext enumSpecifier() throws RecognitionException {
		EnumSpecifierContext _localctx = new EnumSpecifierContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_enumSpecifier);
		int _la;
		try {
			setState(530);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(511);
				match(Enum);
				setState(513);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(512);
					match(Identifier);
					}
				}

				setState(515);
				match(LeftBrace);
				setState(516);
				enumeratorList(0);
				setState(517);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(519);
				match(Enum);
				setState(521);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(520);
					match(Identifier);
					}
				}

				setState(523);
				match(LeftBrace);
				setState(524);
				enumeratorList(0);
				setState(525);
				match(Comma);
				setState(526);
				match(RightBrace);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(528);
				match(Enum);
				setState(529);
				match(Identifier);
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

	public static class EnumeratorListContext extends ParserRuleContext {
		public EnumeratorContext enumerator() {
			return getRuleContext(EnumeratorContext.class,0);
		}
		public EnumeratorListContext enumeratorList() {
			return getRuleContext(EnumeratorListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CParser.Comma, 0); }
		public EnumeratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumeratorList; }
	}

	public final EnumeratorListContext enumeratorList() throws RecognitionException {
		return enumeratorList(0);
	}

	private EnumeratorListContext enumeratorList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EnumeratorListContext _localctx = new EnumeratorListContext(_ctx, _parentState);
		EnumeratorListContext _prevctx = _localctx;
		int _startState = 74;
		enterRecursionRule(_localctx, 74, RULE_enumeratorList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(533);
			enumerator();
			}
			_ctx.stop = _input.LT(-1);
			setState(540);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new EnumeratorListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_enumeratorList);
					setState(535);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(536);
					match(Comma);
					setState(537);
					enumerator();
					}
					} 
				}
				setState(542);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EnumeratorContext extends ParserRuleContext {
		public EnumerationConstantContext enumerationConstant() {
			return getRuleContext(EnumerationConstantContext.class,0);
		}
		public TerminalNode Assign() { return getToken(CParser.Assign, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public EnumeratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerator; }
	}

	public final EnumeratorContext enumerator() throws RecognitionException {
		EnumeratorContext _localctx = new EnumeratorContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_enumerator);
		try {
			setState(548);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(543);
				enumerationConstant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(544);
				enumerationConstant();
				setState(545);
				match(Assign);
				setState(546);
				constantExpression();
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

	public static class EnumerationConstantContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public EnumerationConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerationConstant; }
	}

	public final EnumerationConstantContext enumerationConstant() throws RecognitionException {
		EnumerationConstantContext _localctx = new EnumerationConstantContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_enumerationConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(550);
			match(Identifier);
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

	public static class TypeQualifierContext extends ParserRuleContext {
		public TerminalNode Const() { return getToken(CParser.Const, 0); }
		public TerminalNode Restrict() { return getToken(CParser.Restrict, 0); }
		public TerminalNode Volatile() { return getToken(CParser.Volatile, 0); }
		public TerminalNode Atomic() { return getToken(CParser.Atomic, 0); }
		public TypeQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeQualifier; }
	}

	public final TypeQualifierContext typeQualifier() throws RecognitionException {
		TypeQualifierContext _localctx = new TypeQualifierContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_typeQualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(552);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) ) {
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

	public static class DeclaratorContext extends ParserRuleContext {
		public DirectDeclaratorContext directDeclarator() {
			return getRuleContext(DirectDeclaratorContext.class,0);
		}
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public DeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarator; }
	}

	public final DeclaratorContext declarator() throws RecognitionException {
		DeclaratorContext _localctx = new DeclaratorContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Star || _la==Caret) {
				{
				setState(554);
				pointer();
				}
			}

			setState(557);
			directDeclarator(0);
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

	public static class DirectDeclaratorContext extends ParserRuleContext {
		public DirectDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directDeclarator; }
	 
		public DirectDeclaratorContext() { }
		public void copyFrom(DirectDeclaratorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VariableDeclaratorContext extends DirectDeclaratorContext {
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public TerminalNode LeftParen() { return getToken(CParser.LeftParen, 0); }
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CParser.RightParen, 0); }
		public VariableDeclaratorContext(DirectDeclaratorContext ctx) { copyFrom(ctx); }
	}
	public static class ArrayDeclaratorContext extends DirectDeclaratorContext {
		public DirectDeclaratorContext directDeclarator() {
			return getRuleContext(DirectDeclaratorContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(CParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(CParser.RightBracket, 0); }
		public TypeQualifierListContext typeQualifierList() {
			return getRuleContext(TypeQualifierListContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public TerminalNode Static() { return getToken(CParser.Static, 0); }
		public TerminalNode Star() { return getToken(CParser.Star, 0); }
		public ArrayDeclaratorContext(DirectDeclaratorContext ctx) { copyFrom(ctx); }
	}
	public static class FunctionDeclaratorContext extends DirectDeclaratorContext {
		public DirectDeclaratorContext directDeclarator() {
			return getRuleContext(DirectDeclaratorContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(CParser.LeftParen, 0); }
		public ParameterTypeListContext parameterTypeList() {
			return getRuleContext(ParameterTypeListContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CParser.RightParen, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public FunctionDeclaratorContext(DirectDeclaratorContext ctx) { copyFrom(ctx); }
	}

	public final DirectDeclaratorContext directDeclarator() throws RecognitionException {
		return directDeclarator(0);
	}

	private DirectDeclaratorContext directDeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DirectDeclaratorContext _localctx = new DirectDeclaratorContext(_ctx, _parentState);
		DirectDeclaratorContext _prevctx = _localctx;
		int _startState = 84;
		enterRecursionRule(_localctx, 84, RULE_directDeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(565);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				{
				_localctx = new VariableDeclaratorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(560);
				match(Identifier);
				}
				break;
			case LeftParen:
				{
				_localctx = new VariableDeclaratorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(561);
				match(LeftParen);
				setState(562);
				declarator();
				setState(563);
				match(RightParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(612);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(610);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
					case 1:
						{
						_localctx = new ArrayDeclaratorContext(new DirectDeclaratorContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(567);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(568);
						match(LeftBracket);
						setState(570);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
							{
							setState(569);
							typeQualifierList(0);
							}
						}

						setState(573);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Sizeof) | (1L << LeftParen) | (1L << Plus) | (1L << PlusPlus) | (1L << Minus) | (1L << MinusMinus) | (1L << Star) | (1L << And))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Not - 64)) | (1L << (Tilde - 64)) | (1L << (Identifier - 64)) | (1L << (Constant - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
							{
							setState(572);
							assignmentExpression();
							}
						}

						setState(575);
						match(RightBracket);
						}
						break;
					case 2:
						{
						_localctx = new ArrayDeclaratorContext(new DirectDeclaratorContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(576);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(577);
						match(LeftBracket);
						setState(578);
						match(Static);
						setState(580);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
							{
							setState(579);
							typeQualifierList(0);
							}
						}

						setState(582);
						assignmentExpression();
						setState(583);
						match(RightBracket);
						}
						break;
					case 3:
						{
						_localctx = new ArrayDeclaratorContext(new DirectDeclaratorContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(585);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(586);
						match(LeftBracket);
						setState(587);
						typeQualifierList(0);
						setState(588);
						match(Static);
						setState(589);
						assignmentExpression();
						setState(590);
						match(RightBracket);
						}
						break;
					case 4:
						{
						_localctx = new ArrayDeclaratorContext(new DirectDeclaratorContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(592);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(593);
						match(LeftBracket);
						setState(595);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
							{
							setState(594);
							typeQualifierList(0);
							}
						}

						setState(597);
						match(Star);
						setState(598);
						match(RightBracket);
						}
						break;
					case 5:
						{
						_localctx = new FunctionDeclaratorContext(new DirectDeclaratorContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(599);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(600);
						match(LeftParen);
						setState(601);
						parameterTypeList();
						setState(602);
						match(RightParen);
						}
						break;
					case 6:
						{
						_localctx = new FunctionDeclaratorContext(new DirectDeclaratorContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(604);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(605);
						match(LeftParen);
						setState(607);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Identifier) {
							{
							setState(606);
							identifierList(0);
							}
						}

						setState(609);
						match(RightParen);
						}
						break;
					}
					} 
				}
				setState(614);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PointerContext extends ParserRuleContext {
		public TerminalNode Star() { return getToken(CParser.Star, 0); }
		public TypeQualifierListContext typeQualifierList() {
			return getRuleContext(TypeQualifierListContext.class,0);
		}
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public TerminalNode Caret() { return getToken(CParser.Caret, 0); }
		public PointerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointer; }
	}

	public final PointerContext pointer() throws RecognitionException {
		PointerContext _localctx = new PointerContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_pointer);
		int _la;
		try {
			setState(633);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(615);
				match(Star);
				setState(617);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
				case 1:
					{
					setState(616);
					typeQualifierList(0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(619);
				match(Star);
				setState(621);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
					{
					setState(620);
					typeQualifierList(0);
					}
				}

				setState(623);
				pointer();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(624);
				match(Caret);
				setState(626);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
				case 1:
					{
					setState(625);
					typeQualifierList(0);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(628);
				match(Caret);
				setState(630);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
					{
					setState(629);
					typeQualifierList(0);
					}
				}

				setState(632);
				pointer();
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

	public static class TypeQualifierListContext extends ParserRuleContext {
		public TypeQualifierContext typeQualifier() {
			return getRuleContext(TypeQualifierContext.class,0);
		}
		public TypeQualifierListContext typeQualifierList() {
			return getRuleContext(TypeQualifierListContext.class,0);
		}
		public TypeQualifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeQualifierList; }
	}

	public final TypeQualifierListContext typeQualifierList() throws RecognitionException {
		return typeQualifierList(0);
	}

	private TypeQualifierListContext typeQualifierList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeQualifierListContext _localctx = new TypeQualifierListContext(_ctx, _parentState);
		TypeQualifierListContext _prevctx = _localctx;
		int _startState = 88;
		enterRecursionRule(_localctx, 88, RULE_typeQualifierList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(636);
			typeQualifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(642);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeQualifierListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_typeQualifierList);
					setState(638);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(639);
					typeQualifier();
					}
					} 
				}
				setState(644);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ParameterTypeListContext extends ParserRuleContext {
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CParser.Comma, 0); }
		public TerminalNode Ellipsis() { return getToken(CParser.Ellipsis, 0); }
		public ParameterTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterTypeList; }
	}

	public final ParameterTypeListContext parameterTypeList() throws RecognitionException {
		ParameterTypeListContext _localctx = new ParameterTypeListContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_parameterTypeList);
		try {
			setState(650);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(645);
				parameterList(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(646);
				parameterList(0);
				setState(647);
				match(Comma);
				setState(648);
				match(Ellipsis);
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

	public static class ParameterListContext extends ParserRuleContext {
		public ParameterDeclarationContext parameterDeclaration() {
			return getRuleContext(ParameterDeclarationContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CParser.Comma, 0); }
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		return parameterList(0);
	}

	private ParameterListContext parameterList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ParameterListContext _localctx = new ParameterListContext(_ctx, _parentState);
		ParameterListContext _prevctx = _localctx;
		int _startState = 92;
		enterRecursionRule(_localctx, 92, RULE_parameterList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(653);
			parameterDeclaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(660);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ParameterListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_parameterList);
					setState(655);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(656);
					match(Comma);
					setState(657);
					parameterDeclaration();
					}
					} 
				}
				setState(662);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ParameterDeclarationContext extends ParserRuleContext {
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public DeclarationSpecifiers2Context declarationSpecifiers2() {
			return getRuleContext(DeclarationSpecifiers2Context.class,0);
		}
		public AbstractDeclaratorContext abstractDeclarator() {
			return getRuleContext(AbstractDeclaratorContext.class,0);
		}
		public ParameterDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDeclaration; }
	}

	public final ParameterDeclarationContext parameterDeclaration() throws RecognitionException {
		ParameterDeclarationContext _localctx = new ParameterDeclarationContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_parameterDeclaration);
		try {
			setState(670);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(663);
				declarationSpecifiers();
				setState(664);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(666);
				declarationSpecifiers2();
				setState(668);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
				case 1:
					{
					setState(667);
					abstractDeclarator();
					}
					break;
				}
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

	public static class IdentifierListContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CParser.Comma, 0); }
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		return identifierList(0);
	}

	private IdentifierListContext identifierList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, _parentState);
		IdentifierListContext _prevctx = _localctx;
		int _startState = 96;
		enterRecursionRule(_localctx, 96, RULE_identifierList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(673);
			match(Identifier);
			}
			_ctx.stop = _input.LT(-1);
			setState(680);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new IdentifierListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_identifierList);
					setState(675);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(676);
					match(Comma);
					setState(677);
					match(Identifier);
					}
					} 
				}
				setState(682);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TypeNameContext extends ParserRuleContext {
		public SpecifierQualifierListContext specifierQualifierList() {
			return getRuleContext(SpecifierQualifierListContext.class,0);
		}
		public AbstractDeclaratorContext abstractDeclarator() {
			return getRuleContext(AbstractDeclaratorContext.class,0);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_typeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(683);
			specifierQualifierList();
			setState(685);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LeftParen) | (1L << LeftBracket) | (1L << Star) | (1L << Caret))) != 0)) {
				{
				setState(684);
				abstractDeclarator();
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

	public static class AbstractDeclaratorContext extends ParserRuleContext {
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public DirectAbstractDeclaratorContext directAbstractDeclarator() {
			return getRuleContext(DirectAbstractDeclaratorContext.class,0);
		}
		public AbstractDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractDeclarator; }
	}

	public final AbstractDeclaratorContext abstractDeclarator() throws RecognitionException {
		AbstractDeclaratorContext _localctx = new AbstractDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_abstractDeclarator);
		int _la;
		try {
			setState(692);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(687);
				pointer();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(689);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Star || _la==Caret) {
					{
					setState(688);
					pointer();
					}
				}

				setState(691);
				directAbstractDeclarator(0);
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

	public static class DirectAbstractDeclaratorContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(CParser.LeftParen, 0); }
		public AbstractDeclaratorContext abstractDeclarator() {
			return getRuleContext(AbstractDeclaratorContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CParser.RightParen, 0); }
		public TerminalNode LeftBracket() { return getToken(CParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(CParser.RightBracket, 0); }
		public TypeQualifierListContext typeQualifierList() {
			return getRuleContext(TypeQualifierListContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public TerminalNode Static() { return getToken(CParser.Static, 0); }
		public TerminalNode Star() { return getToken(CParser.Star, 0); }
		public ParameterTypeListContext parameterTypeList() {
			return getRuleContext(ParameterTypeListContext.class,0);
		}
		public DirectAbstractDeclaratorContext directAbstractDeclarator() {
			return getRuleContext(DirectAbstractDeclaratorContext.class,0);
		}
		public DirectAbstractDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directAbstractDeclarator; }
	}

	public final DirectAbstractDeclaratorContext directAbstractDeclarator() throws RecognitionException {
		return directAbstractDeclarator(0);
	}

	private DirectAbstractDeclaratorContext directAbstractDeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DirectAbstractDeclaratorContext _localctx = new DirectAbstractDeclaratorContext(_ctx, _parentState);
		DirectAbstractDeclaratorContext _prevctx = _localctx;
		int _startState = 102;
		enterRecursionRule(_localctx, 102, RULE_directAbstractDeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(729);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				{
				setState(695);
				match(LeftParen);
				setState(696);
				abstractDeclarator();
				setState(697);
				match(RightParen);
				}
				break;
			case 2:
				{
				setState(699);
				match(LeftBracket);
				setState(701);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
					{
					setState(700);
					typeQualifierList(0);
					}
				}

				setState(704);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Sizeof) | (1L << LeftParen) | (1L << Plus) | (1L << PlusPlus) | (1L << Minus) | (1L << MinusMinus) | (1L << Star) | (1L << And))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Not - 64)) | (1L << (Tilde - 64)) | (1L << (Identifier - 64)) | (1L << (Constant - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
					{
					setState(703);
					assignmentExpression();
					}
				}

				setState(706);
				match(RightBracket);
				}
				break;
			case 3:
				{
				setState(707);
				match(LeftBracket);
				setState(708);
				match(Static);
				setState(710);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
					{
					setState(709);
					typeQualifierList(0);
					}
				}

				setState(712);
				assignmentExpression();
				setState(713);
				match(RightBracket);
				}
				break;
			case 4:
				{
				setState(715);
				match(LeftBracket);
				setState(716);
				typeQualifierList(0);
				setState(717);
				match(Static);
				setState(718);
				assignmentExpression();
				setState(719);
				match(RightBracket);
				}
				break;
			case 5:
				{
				setState(721);
				match(LeftBracket);
				setState(722);
				match(Star);
				setState(723);
				match(RightBracket);
				}
				break;
			case 6:
				{
				setState(724);
				match(LeftParen);
				setState(726);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Auto) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Struct) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << Atomic) | (1L << Bool) | (1L << Complex))) != 0) || _la==Identifier) {
					{
					setState(725);
					parameterTypeList();
					}
				}

				setState(728);
				match(RightParen);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(768);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(766);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
					case 1:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(731);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(732);
						match(LeftBracket);
						setState(734);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
							{
							setState(733);
							typeQualifierList(0);
							}
						}

						setState(737);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Sizeof) | (1L << LeftParen) | (1L << Plus) | (1L << PlusPlus) | (1L << Minus) | (1L << MinusMinus) | (1L << Star) | (1L << And))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Not - 64)) | (1L << (Tilde - 64)) | (1L << (Identifier - 64)) | (1L << (Constant - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
							{
							setState(736);
							assignmentExpression();
							}
						}

						setState(739);
						match(RightBracket);
						}
						break;
					case 2:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(740);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(741);
						match(LeftBracket);
						setState(742);
						match(Static);
						setState(744);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
							{
							setState(743);
							typeQualifierList(0);
							}
						}

						setState(746);
						assignmentExpression();
						setState(747);
						match(RightBracket);
						}
						break;
					case 3:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(749);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(750);
						match(LeftBracket);
						setState(751);
						typeQualifierList(0);
						setState(752);
						match(Static);
						setState(753);
						assignmentExpression();
						setState(754);
						match(RightBracket);
						}
						break;
					case 4:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(756);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(757);
						match(LeftBracket);
						setState(758);
						match(Star);
						setState(759);
						match(RightBracket);
						}
						break;
					case 5:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(760);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(761);
						match(LeftParen);
						setState(763);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Auto) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Struct) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << Atomic) | (1L << Bool) | (1L << Complex))) != 0) || _la==Identifier) {
							{
							setState(762);
							parameterTypeList();
							}
						}

						setState(765);
						match(RightParen);
						}
						break;
					}
					} 
				}
				setState(770);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TypedefNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public TypedefNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedefName; }
	}

	public final TypedefNameContext typedefName() throws RecognitionException {
		TypedefNameContext _localctx = new TypedefNameContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_typedefName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(771);
			match(Identifier);
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

	public static class InitializerContext extends ParserRuleContext {
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public TerminalNode LeftBrace() { return getToken(CParser.LeftBrace, 0); }
		public InitializerListContext initializerList() {
			return getRuleContext(InitializerListContext.class,0);
		}
		public TerminalNode RightBrace() { return getToken(CParser.RightBrace, 0); }
		public TerminalNode Comma() { return getToken(CParser.Comma, 0); }
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_initializer);
		try {
			setState(783);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(773);
				assignmentExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(774);
				match(LeftBrace);
				setState(775);
				initializerList(0);
				setState(776);
				match(RightBrace);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(778);
				match(LeftBrace);
				setState(779);
				initializerList(0);
				setState(780);
				match(Comma);
				setState(781);
				match(RightBrace);
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

	public static class InitializerListContext extends ParserRuleContext {
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public DesignationContext designation() {
			return getRuleContext(DesignationContext.class,0);
		}
		public InitializerListContext initializerList() {
			return getRuleContext(InitializerListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CParser.Comma, 0); }
		public InitializerListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializerList; }
	}

	public final InitializerListContext initializerList() throws RecognitionException {
		return initializerList(0);
	}

	private InitializerListContext initializerList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InitializerListContext _localctx = new InitializerListContext(_ctx, _parentState);
		InitializerListContext _prevctx = _localctx;
		int _startState = 108;
		enterRecursionRule(_localctx, 108, RULE_initializerList, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(787);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftBracket || _la==Dot) {
				{
				setState(786);
				designation();
				}
			}

			setState(789);
			initializer();
			}
			_ctx.stop = _input.LT(-1);
			setState(799);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InitializerListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_initializerList);
					setState(791);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(792);
					match(Comma);
					setState(794);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LeftBracket || _la==Dot) {
						{
						setState(793);
						designation();
						}
					}

					setState(796);
					initializer();
					}
					} 
				}
				setState(801);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DesignationContext extends ParserRuleContext {
		public DesignatorListContext designatorList() {
			return getRuleContext(DesignatorListContext.class,0);
		}
		public TerminalNode Assign() { return getToken(CParser.Assign, 0); }
		public DesignationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designation; }
	}

	public final DesignationContext designation() throws RecognitionException {
		DesignationContext _localctx = new DesignationContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_designation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(802);
			designatorList(0);
			setState(803);
			match(Assign);
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

	public static class DesignatorListContext extends ParserRuleContext {
		public DesignatorContext designator() {
			return getRuleContext(DesignatorContext.class,0);
		}
		public DesignatorListContext designatorList() {
			return getRuleContext(DesignatorListContext.class,0);
		}
		public DesignatorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designatorList; }
	}

	public final DesignatorListContext designatorList() throws RecognitionException {
		return designatorList(0);
	}

	private DesignatorListContext designatorList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DesignatorListContext _localctx = new DesignatorListContext(_ctx, _parentState);
		DesignatorListContext _prevctx = _localctx;
		int _startState = 112;
		enterRecursionRule(_localctx, 112, RULE_designatorList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(806);
			designator();
			}
			_ctx.stop = _input.LT(-1);
			setState(812);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DesignatorListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_designatorList);
					setState(808);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(809);
					designator();
					}
					} 
				}
				setState(814);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DesignatorContext extends ParserRuleContext {
		public TerminalNode LeftBracket() { return getToken(CParser.LeftBracket, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(CParser.RightBracket, 0); }
		public TerminalNode Dot() { return getToken(CParser.Dot, 0); }
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public DesignatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designator; }
	}

	public final DesignatorContext designator() throws RecognitionException {
		DesignatorContext _localctx = new DesignatorContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_designator);
		try {
			setState(821);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(815);
				match(LeftBracket);
				setState(816);
				constantExpression();
				setState(817);
				match(RightBracket);
				}
				break;
			case Dot:
				enterOuterAlt(_localctx, 2);
				{
				setState(819);
				match(Dot);
				setState(820);
				match(Identifier);
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

	public static class StatementContext extends ParserRuleContext {
		public LabeledStatementContext labeledStatement() {
			return getRuleContext(LabeledStatementContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public SelectionStatementContext selectionStatement() {
			return getRuleContext(SelectionStatementContext.class,0);
		}
		public IterationStatementContext iterationStatement() {
			return getRuleContext(IterationStatementContext.class,0);
		}
		public JumpStatementContext jumpStatement() {
			return getRuleContext(JumpStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_statement);
		try {
			setState(829);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(823);
				labeledStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(824);
				compoundStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(825);
				expressionStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(826);
				selectionStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(827);
				iterationStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(828);
				jumpStatement();
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

	public static class LabeledStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public TerminalNode Colon() { return getToken(CParser.Colon, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode Case() { return getToken(CParser.Case, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode Default() { return getToken(CParser.Default, 0); }
		public LabeledStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledStatement; }
	}

	public final LabeledStatementContext labeledStatement() throws RecognitionException {
		LabeledStatementContext _localctx = new LabeledStatementContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_labeledStatement);
		try {
			setState(842);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(831);
				match(Identifier);
				setState(832);
				match(Colon);
				setState(833);
				statement();
				}
				break;
			case Case:
				enterOuterAlt(_localctx, 2);
				{
				setState(834);
				match(Case);
				setState(835);
				constantExpression();
				setState(836);
				match(Colon);
				setState(837);
				statement();
				}
				break;
			case Default:
				enterOuterAlt(_localctx, 3);
				{
				setState(839);
				match(Default);
				setState(840);
				match(Colon);
				setState(841);
				statement();
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

	public static class CompoundStatementContext extends ParserRuleContext {
		public TerminalNode LeftBrace() { return getToken(CParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(CParser.RightBrace, 0); }
		public BlockItemListContext blockItemList() {
			return getRuleContext(BlockItemListContext.class,0);
		}
		public CompoundStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStatement; }
	}

	public final CompoundStatementContext compoundStatement() throws RecognitionException {
		CompoundStatementContext _localctx = new CompoundStatementContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_compoundStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(844);
			match(LeftBrace);
			setState(846);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Auto) | (1L << Break) | (1L << Case) | (1L << Char) | (1L << Const) | (1L << Continue) | (1L << Default) | (1L << Do) | (1L << Double) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << For) | (1L << Goto) | (1L << If) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Return) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static) | (1L << Struct) | (1L << Switch) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << While) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << LeftParen) | (1L << LeftBrace) | (1L << Plus) | (1L << PlusPlus) | (1L << Minus) | (1L << MinusMinus) | (1L << Star) | (1L << And))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Not - 64)) | (1L << (Tilde - 64)) | (1L << (Semi - 64)) | (1L << (Identifier - 64)) | (1L << (Constant - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
				{
				setState(845);
				blockItemList(0);
				}
			}

			setState(848);
			match(RightBrace);
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

	public static class BlockItemListContext extends ParserRuleContext {
		public BlockItemContext blockItem() {
			return getRuleContext(BlockItemContext.class,0);
		}
		public BlockItemListContext blockItemList() {
			return getRuleContext(BlockItemListContext.class,0);
		}
		public BlockItemListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockItemList; }
	}

	public final BlockItemListContext blockItemList() throws RecognitionException {
		return blockItemList(0);
	}

	private BlockItemListContext blockItemList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BlockItemListContext _localctx = new BlockItemListContext(_ctx, _parentState);
		BlockItemListContext _prevctx = _localctx;
		int _startState = 122;
		enterRecursionRule(_localctx, 122, RULE_blockItemList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(851);
			blockItem();
			}
			_ctx.stop = _input.LT(-1);
			setState(857);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BlockItemListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_blockItemList);
					setState(853);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(854);
					blockItem();
					}
					} 
				}
				setState(859);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BlockItemContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public BlockItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockItem; }
	}

	public final BlockItemContext blockItem() throws RecognitionException {
		BlockItemContext _localctx = new BlockItemContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_blockItem);
		try {
			setState(862);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(860);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(861);
				declaration();
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

	public static class ExpressionStatementContext extends ParserRuleContext {
		public TerminalNode Semi() { return getToken(CParser.Semi, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_expressionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(865);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Sizeof) | (1L << LeftParen) | (1L << Plus) | (1L << PlusPlus) | (1L << Minus) | (1L << MinusMinus) | (1L << Star) | (1L << And))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Not - 64)) | (1L << (Tilde - 64)) | (1L << (Identifier - 64)) | (1L << (Constant - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
				{
				setState(864);
				expression(0);
				}
			}

			setState(867);
			match(Semi);
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

	public static class SelectionStatementContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(CParser.If, 0); }
		public TerminalNode LeftParen() { return getToken(CParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CParser.RightParen, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode Else() { return getToken(CParser.Else, 0); }
		public TerminalNode Switch() { return getToken(CParser.Switch, 0); }
		public SelectionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectionStatement; }
	}

	public final SelectionStatementContext selectionStatement() throws RecognitionException {
		SelectionStatementContext _localctx = new SelectionStatementContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_selectionStatement);
		try {
			setState(884);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case If:
				enterOuterAlt(_localctx, 1);
				{
				setState(869);
				match(If);
				setState(870);
				match(LeftParen);
				setState(871);
				expression(0);
				setState(872);
				match(RightParen);
				setState(873);
				statement();
				setState(876);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
				case 1:
					{
					setState(874);
					match(Else);
					setState(875);
					statement();
					}
					break;
				}
				}
				break;
			case Switch:
				enterOuterAlt(_localctx, 2);
				{
				setState(878);
				match(Switch);
				setState(879);
				match(LeftParen);
				setState(880);
				expression(0);
				setState(881);
				match(RightParen);
				setState(882);
				statement();
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

	public static class IterationStatementContext extends ParserRuleContext {
		public IterationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationStatement; }
	 
		public IterationStatementContext() { }
		public void copyFrom(IterationStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IterationWhileStatement_Context extends IterationStatementContext {
		public TerminalNode While() { return getToken(CParser.While, 0); }
		public TerminalNode LeftParen() { return getToken(CParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CParser.RightParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public IterationWhileStatement_Context(IterationStatementContext ctx) { copyFrom(ctx); }
	}
	public static class IterationStatement_Context extends IterationStatementContext {
		public TerminalNode For() { return getToken(CParser.For, 0); }
		public TerminalNode LeftParen() { return getToken(CParser.LeftParen, 0); }
		public List<TerminalNode> Semi() { return getTokens(CParser.Semi); }
		public TerminalNode Semi(int i) {
			return getToken(CParser.Semi, i);
		}
		public TerminalNode RightParen() { return getToken(CParser.RightParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<ForExpressionContext> forExpression() {
			return getRuleContexts(ForExpressionContext.class);
		}
		public ForExpressionContext forExpression(int i) {
			return getRuleContext(ForExpressionContext.class,i);
		}
		public IterationStatement_Context(IterationStatementContext ctx) { copyFrom(ctx); }
	}
	public static class IterationDoStatement_Context extends IterationStatementContext {
		public TerminalNode Do() { return getToken(CParser.Do, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode While() { return getToken(CParser.While, 0); }
		public TerminalNode LeftParen() { return getToken(CParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CParser.RightParen, 0); }
		public TerminalNode Semi() { return getToken(CParser.Semi, 0); }
		public IterationDoStatement_Context(IterationStatementContext ctx) { copyFrom(ctx); }
	}
	public static class IterationDeclaredStatement_Context extends IterationStatementContext {
		public TerminalNode For() { return getToken(CParser.For, 0); }
		public TerminalNode LeftParen() { return getToken(CParser.LeftParen, 0); }
		public ForDeclarationContext forDeclaration() {
			return getRuleContext(ForDeclarationContext.class,0);
		}
		public List<TerminalNode> Semi() { return getTokens(CParser.Semi); }
		public TerminalNode Semi(int i) {
			return getToken(CParser.Semi, i);
		}
		public TerminalNode RightParen() { return getToken(CParser.RightParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<ForExpressionContext> forExpression() {
			return getRuleContexts(ForExpressionContext.class);
		}
		public ForExpressionContext forExpression(int i) {
			return getRuleContext(ForExpressionContext.class,i);
		}
		public IterationDeclaredStatement_Context(IterationStatementContext ctx) { copyFrom(ctx); }
	}

	public final IterationStatementContext iterationStatement() throws RecognitionException {
		IterationStatementContext _localctx = new IterationStatementContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_iterationStatement);
		int _la;
		try {
			setState(929);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				_localctx = new IterationWhileStatement_Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(886);
				match(While);
				setState(887);
				match(LeftParen);
				setState(888);
				expression(0);
				setState(889);
				match(RightParen);
				setState(890);
				statement();
				}
				break;
			case 2:
				_localctx = new IterationDoStatement_Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(892);
				match(Do);
				setState(893);
				statement();
				setState(894);
				match(While);
				setState(895);
				match(LeftParen);
				setState(896);
				expression(0);
				setState(897);
				match(RightParen);
				setState(898);
				match(Semi);
				}
				break;
			case 3:
				_localctx = new IterationDeclaredStatement_Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(900);
				match(For);
				setState(901);
				match(LeftParen);
				setState(902);
				forDeclaration();
				setState(903);
				match(Semi);
				setState(905);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Sizeof) | (1L << LeftParen) | (1L << Plus) | (1L << PlusPlus) | (1L << Minus) | (1L << MinusMinus) | (1L << Star) | (1L << And))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Not - 64)) | (1L << (Tilde - 64)) | (1L << (Identifier - 64)) | (1L << (Constant - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
					{
					setState(904);
					forExpression(0);
					}
				}

				setState(907);
				match(Semi);
				setState(909);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Sizeof) | (1L << LeftParen) | (1L << Plus) | (1L << PlusPlus) | (1L << Minus) | (1L << MinusMinus) | (1L << Star) | (1L << And))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Not - 64)) | (1L << (Tilde - 64)) | (1L << (Identifier - 64)) | (1L << (Constant - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
					{
					setState(908);
					forExpression(0);
					}
				}

				setState(911);
				match(RightParen);
				setState(912);
				statement();
				}
				break;
			case 4:
				_localctx = new IterationStatement_Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(914);
				match(For);
				setState(915);
				match(LeftParen);
				setState(917);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Sizeof) | (1L << LeftParen) | (1L << Plus) | (1L << PlusPlus) | (1L << Minus) | (1L << MinusMinus) | (1L << Star) | (1L << And))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Not - 64)) | (1L << (Tilde - 64)) | (1L << (Identifier - 64)) | (1L << (Constant - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
					{
					setState(916);
					expression(0);
					}
				}

				setState(919);
				match(Semi);
				setState(921);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Sizeof) | (1L << LeftParen) | (1L << Plus) | (1L << PlusPlus) | (1L << Minus) | (1L << MinusMinus) | (1L << Star) | (1L << And))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Not - 64)) | (1L << (Tilde - 64)) | (1L << (Identifier - 64)) | (1L << (Constant - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
					{
					setState(920);
					forExpression(0);
					}
				}

				setState(923);
				match(Semi);
				setState(925);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Sizeof) | (1L << LeftParen) | (1L << Plus) | (1L << PlusPlus) | (1L << Minus) | (1L << MinusMinus) | (1L << Star) | (1L << And))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Not - 64)) | (1L << (Tilde - 64)) | (1L << (Identifier - 64)) | (1L << (Constant - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
					{
					setState(924);
					forExpression(0);
					}
				}

				setState(927);
				match(RightParen);
				setState(928);
				statement();
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

	public static class ForDeclarationContext extends ParserRuleContext {
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class,0);
		}
		public ForDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forDeclaration; }
	}

	public final ForDeclarationContext forDeclaration() throws RecognitionException {
		ForDeclarationContext _localctx = new ForDeclarationContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_forDeclaration);
		try {
			setState(935);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(931);
				declarationSpecifiers();
				setState(932);
				initDeclaratorList(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(934);
				declarationSpecifiers();
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

	public static class ForExpressionContext extends ParserRuleContext {
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ForExpressionContext forExpression() {
			return getRuleContext(ForExpressionContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CParser.Comma, 0); }
		public ForExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forExpression; }
	}

	public final ForExpressionContext forExpression() throws RecognitionException {
		return forExpression(0);
	}

	private ForExpressionContext forExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ForExpressionContext _localctx = new ForExpressionContext(_ctx, _parentState);
		ForExpressionContext _prevctx = _localctx;
		int _startState = 134;
		enterRecursionRule(_localctx, 134, RULE_forExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(938);
			assignmentExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(945);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ForExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_forExpression);
					setState(940);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(941);
					match(Comma);
					setState(942);
					assignmentExpression();
					}
					} 
				}
				setState(947);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class JumpStatementContext extends ParserRuleContext {
		public JumpStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jumpStatement; }
	 
		public JumpStatementContext() { }
		public void copyFrom(JumpStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BreakStatementContext extends JumpStatementContext {
		public TerminalNode Break() { return getToken(CParser.Break, 0); }
		public TerminalNode Semi() { return getToken(CParser.Semi, 0); }
		public BreakStatementContext(JumpStatementContext ctx) { copyFrom(ctx); }
	}
	public static class GotoStatementContext extends JumpStatementContext {
		public TerminalNode Goto() { return getToken(CParser.Goto, 0); }
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public TerminalNode Semi() { return getToken(CParser.Semi, 0); }
		public GotoStatementContext(JumpStatementContext ctx) { copyFrom(ctx); }
	}
	public static class ReturnStatementContext extends JumpStatementContext {
		public TerminalNode Return() { return getToken(CParser.Return, 0); }
		public TerminalNode Semi() { return getToken(CParser.Semi, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(JumpStatementContext ctx) { copyFrom(ctx); }
	}
	public static class ContinueStatementContext extends JumpStatementContext {
		public TerminalNode Continue() { return getToken(CParser.Continue, 0); }
		public TerminalNode Semi() { return getToken(CParser.Semi, 0); }
		public ContinueStatementContext(JumpStatementContext ctx) { copyFrom(ctx); }
	}

	public final JumpStatementContext jumpStatement() throws RecognitionException {
		JumpStatementContext _localctx = new JumpStatementContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_jumpStatement);
		int _la;
		try {
			setState(960);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Goto:
				_localctx = new GotoStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(948);
				match(Goto);
				setState(949);
				match(Identifier);
				setState(950);
				match(Semi);
				}
				break;
			case Continue:
				_localctx = new ContinueStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(951);
				match(Continue);
				setState(952);
				match(Semi);
				}
				break;
			case Break:
				_localctx = new BreakStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(953);
				match(Break);
				setState(954);
				match(Semi);
				}
				break;
			case Return:
				_localctx = new ReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(955);
				match(Return);
				setState(957);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Sizeof) | (1L << LeftParen) | (1L << Plus) | (1L << PlusPlus) | (1L << Minus) | (1L << MinusMinus) | (1L << Star) | (1L << And))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Not - 64)) | (1L << (Tilde - 64)) | (1L << (Identifier - 64)) | (1L << (Constant - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
					{
					setState(956);
					expression(0);
					}
				}

				setState(959);
				match(Semi);
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

	public static class CompilationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CParser.EOF, 0); }
		public TranslationUnitContext translationUnit() {
			return getRuleContext(TranslationUnitContext.class,0);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(963);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Auto) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Struct) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << LeftParen) | (1L << Star) | (1L << Caret))) != 0) || _la==Semi || _la==Identifier) {
				{
				setState(962);
				translationUnit(0);
				}
			}

			setState(965);
			match(EOF);
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

	public static class TranslationUnitContext extends ParserRuleContext {
		public ExternalDeclarationContext externalDeclaration() {
			return getRuleContext(ExternalDeclarationContext.class,0);
		}
		public TranslationUnitContext translationUnit() {
			return getRuleContext(TranslationUnitContext.class,0);
		}
		public TranslationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_translationUnit; }
	}

	public final TranslationUnitContext translationUnit() throws RecognitionException {
		return translationUnit(0);
	}

	private TranslationUnitContext translationUnit(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TranslationUnitContext _localctx = new TranslationUnitContext(_ctx, _parentState);
		TranslationUnitContext _prevctx = _localctx;
		int _startState = 140;
		enterRecursionRule(_localctx, 140, RULE_translationUnit, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(968);
			externalDeclaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(974);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TranslationUnitContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_translationUnit);
					setState(970);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(971);
					externalDeclaration();
					}
					} 
				}
				setState(976);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExternalDeclarationContext extends ParserRuleContext {
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode Semi() { return getToken(CParser.Semi, 0); }
		public ExternalDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_externalDeclaration; }
	}

	public final ExternalDeclarationContext externalDeclaration() throws RecognitionException {
		ExternalDeclarationContext _localctx = new ExternalDeclarationContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_externalDeclaration);
		try {
			setState(980);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(977);
				functionDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(978);
				declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(979);
				match(Semi);
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

	public static class FunctionDefinitionContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public DeclarationListContext declarationList() {
			return getRuleContext(DeclarationListContext.class,0);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_functionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(983);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				{
				setState(982);
				declarationSpecifiers();
				}
				break;
			}
			setState(985);
			declarator();
			setState(987);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Auto) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Struct) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << Atomic) | (1L << Bool) | (1L << Complex))) != 0) || _la==Identifier) {
				{
				setState(986);
				declarationList(0);
				}
			}

			setState(989);
			compoundStatement();
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

	public static class DeclarationListContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public DeclarationListContext declarationList() {
			return getRuleContext(DeclarationListContext.class,0);
		}
		public DeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationList; }
	}

	public final DeclarationListContext declarationList() throws RecognitionException {
		return declarationList(0);
	}

	private DeclarationListContext declarationList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DeclarationListContext _localctx = new DeclarationListContext(_ctx, _parentState);
		DeclarationListContext _prevctx = _localctx;
		int _startState = 146;
		enterRecursionRule(_localctx, 146, RULE_declarationList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(992);
			declaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(998);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DeclarationListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_declarationList);
					setState(994);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(995);
					declaration();
					}
					} 
				}
				setState(1000);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return postfixExpression_sempred((PostfixExpressionContext)_localctx, predIndex);
		case 2:
			return argumentExpressionList_sempred((ArgumentExpressionListContext)_localctx, predIndex);
		case 6:
			return multiplicativeExpression_sempred((MultiplicativeExpressionContext)_localctx, predIndex);
		case 7:
			return additiveExpression_sempred((AdditiveExpressionContext)_localctx, predIndex);
		case 8:
			return shiftExpression_sempred((ShiftExpressionContext)_localctx, predIndex);
		case 9:
			return relationalExpression_sempred((RelationalExpressionContext)_localctx, predIndex);
		case 10:
			return equalityExpression_sempred((EqualityExpressionContext)_localctx, predIndex);
		case 11:
			return andExpression_sempred((AndExpressionContext)_localctx, predIndex);
		case 12:
			return exclusiveOrExpression_sempred((ExclusiveOrExpressionContext)_localctx, predIndex);
		case 13:
			return inclusiveOrExpression_sempred((InclusiveOrExpressionContext)_localctx, predIndex);
		case 14:
			return logicalAndExpression_sempred((LogicalAndExpressionContext)_localctx, predIndex);
		case 15:
			return logicalOrExpression_sempred((LogicalOrExpressionContext)_localctx, predIndex);
		case 19:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 25:
			return initDeclaratorList_sempred((InitDeclaratorListContext)_localctx, predIndex);
		case 28:
			return typeSpecifier_sempred((TypeSpecifierContext)_localctx, predIndex);
		case 31:
			return structDeclarationList_sempred((StructDeclarationListContext)_localctx, predIndex);
		case 34:
			return structDeclaratorList_sempred((StructDeclaratorListContext)_localctx, predIndex);
		case 37:
			return enumeratorList_sempred((EnumeratorListContext)_localctx, predIndex);
		case 42:
			return directDeclarator_sempred((DirectDeclaratorContext)_localctx, predIndex);
		case 44:
			return typeQualifierList_sempred((TypeQualifierListContext)_localctx, predIndex);
		case 46:
			return parameterList_sempred((ParameterListContext)_localctx, predIndex);
		case 48:
			return identifierList_sempred((IdentifierListContext)_localctx, predIndex);
		case 51:
			return directAbstractDeclarator_sempred((DirectAbstractDeclaratorContext)_localctx, predIndex);
		case 54:
			return initializerList_sempred((InitializerListContext)_localctx, predIndex);
		case 56:
			return designatorList_sempred((DesignatorListContext)_localctx, predIndex);
		case 61:
			return blockItemList_sempred((BlockItemListContext)_localctx, predIndex);
		case 67:
			return forExpression_sempred((ForExpressionContext)_localctx, predIndex);
		case 70:
			return translationUnit_sempred((TranslationUnitContext)_localctx, predIndex);
		case 73:
			return declarationList_sempred((DeclarationListContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean postfixExpression_sempred(PostfixExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean argumentExpressionList_sempred(ArgumentExpressionListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean multiplicativeExpression_sempred(MultiplicativeExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 3);
		case 8:
			return precpred(_ctx, 2);
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean additiveExpression_sempred(AdditiveExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 2);
		case 11:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean shiftExpression_sempred(ShiftExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 2);
		case 13:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relationalExpression_sempred(RelationalExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 14:
			return precpred(_ctx, 4);
		case 15:
			return precpred(_ctx, 3);
		case 16:
			return precpred(_ctx, 2);
		case 17:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean equalityExpression_sempred(EqualityExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 18:
			return precpred(_ctx, 2);
		case 19:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean andExpression_sempred(AndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 20:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean exclusiveOrExpression_sempred(ExclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 21:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean inclusiveOrExpression_sempred(InclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 22:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logicalAndExpression_sempred(LogicalAndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 23:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logicalOrExpression_sempred(LogicalOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 24:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 25:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean initDeclaratorList_sempred(InitDeclaratorListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 26:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean typeSpecifier_sempred(TypeSpecifierContext _localctx, int predIndex) {
		switch (predIndex) {
		case 27:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean structDeclarationList_sempred(StructDeclarationListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 28:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean structDeclaratorList_sempred(StructDeclaratorListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 29:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean enumeratorList_sempred(EnumeratorListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 30:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean directDeclarator_sempred(DirectDeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 31:
			return precpred(_ctx, 6);
		case 32:
			return precpred(_ctx, 5);
		case 33:
			return precpred(_ctx, 4);
		case 34:
			return precpred(_ctx, 3);
		case 35:
			return precpred(_ctx, 2);
		case 36:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean typeQualifierList_sempred(TypeQualifierListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 37:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean parameterList_sempred(ParameterListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 38:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean identifierList_sempred(IdentifierListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 39:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean directAbstractDeclarator_sempred(DirectAbstractDeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 40:
			return precpred(_ctx, 5);
		case 41:
			return precpred(_ctx, 4);
		case 42:
			return precpred(_ctx, 3);
		case 43:
			return precpred(_ctx, 2);
		case 44:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean initializerList_sempred(InitializerListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 45:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean designatorList_sempred(DesignatorListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 46:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean blockItemList_sempred(BlockItemListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 47:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean forExpression_sempred(ForExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 48:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean translationUnit_sempred(TranslationUnitContext _localctx, int predIndex) {
		switch (predIndex) {
		case 49:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean declarationList_sempred(DeclarationListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 50:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3e\u03ec\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\3\2\3\2\3\2\6\2\u009a\n\2\r\2\16\2\u009b\3\2\3\2\3\2\3"+
		"\2\5\2\u00a2\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u00af"+
		"\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\u00bc\n\3\f\3\16"+
		"\3\u00bf\13\3\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u00c7\n\4\f\4\16\4\u00ca\13"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00db"+
		"\n\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00e5\n\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00f3\n\b\f\b\16\b\u00f6\13\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0101\n\t\f\t\16\t\u0104\13\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u010f\n\n\f\n\16\n\u0112\13\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7"+
		"\13\u0123\n\13\f\13\16\13\u0126\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\7\f\u0131\n\f\f\f\16\f\u0134\13\f\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u013c"+
		"\n\r\f\r\16\r\u013f\13\r\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u0147\n\16"+
		"\f\16\16\16\u014a\13\16\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u0152\n\17"+
		"\f\17\16\17\u0155\13\17\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u015d\n\20"+
		"\f\20\16\20\u0160\13\20\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u0168\n\21"+
		"\f\21\16\21\u016b\13\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0174"+
		"\n\22\3\23\3\23\3\23\3\23\3\23\5\23\u017b\n\23\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\7\25\u0185\n\25\f\25\16\25\u0188\13\25\3\26\3\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0193\n\27\3\30\6\30\u0196\n\30\r"+
		"\30\16\30\u0197\3\31\6\31\u019b\n\31\r\31\16\31\u019c\3\32\3\32\3\32\5"+
		"\32\u01a2\n\32\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u01aa\n\33\f\33\16\33"+
		"\u01ad\13\33\3\34\3\34\3\34\3\34\3\34\5\34\u01b4\n\34\3\35\3\35\3\36\3"+
		"\36\3\36\3\36\3\36\5\36\u01bd\n\36\3\36\3\36\7\36\u01c1\n\36\f\36\16\36"+
		"\u01c4\13\36\3\37\3\37\5\37\u01c8\n\37\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\5\37\u01d1\n\37\3 \3 \3!\3!\3!\3!\3!\7!\u01da\n!\f!\16!\u01dd\13!"+
		"\3\"\3\"\5\"\u01e1\n\"\3\"\3\"\3#\3#\5#\u01e7\n#\3#\3#\5#\u01eb\n#\5#"+
		"\u01ed\n#\3$\3$\3$\3$\3$\3$\7$\u01f5\n$\f$\16$\u01f8\13$\3%\3%\5%\u01fc"+
		"\n%\3%\3%\5%\u0200\n%\3&\3&\5&\u0204\n&\3&\3&\3&\3&\3&\3&\5&\u020c\n&"+
		"\3&\3&\3&\3&\3&\3&\3&\5&\u0215\n&\3\'\3\'\3\'\3\'\3\'\3\'\7\'\u021d\n"+
		"\'\f\'\16\'\u0220\13\'\3(\3(\3(\3(\3(\5(\u0227\n(\3)\3)\3*\3*\3+\5+\u022e"+
		"\n+\3+\3+\3,\3,\3,\3,\3,\3,\5,\u0238\n,\3,\3,\3,\5,\u023d\n,\3,\5,\u0240"+
		"\n,\3,\3,\3,\3,\3,\5,\u0247\n,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,"+
		"\5,\u0256\n,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u0262\n,\3,\7,\u0265\n,"+
		"\f,\16,\u0268\13,\3-\3-\5-\u026c\n-\3-\3-\5-\u0270\n-\3-\3-\3-\5-\u0275"+
		"\n-\3-\3-\5-\u0279\n-\3-\5-\u027c\n-\3.\3.\3.\3.\3.\7.\u0283\n.\f.\16"+
		".\u0286\13.\3/\3/\3/\3/\3/\5/\u028d\n/\3\60\3\60\3\60\3\60\3\60\3\60\7"+
		"\60\u0295\n\60\f\60\16\60\u0298\13\60\3\61\3\61\3\61\3\61\3\61\5\61\u029f"+
		"\n\61\5\61\u02a1\n\61\3\62\3\62\3\62\3\62\3\62\3\62\7\62\u02a9\n\62\f"+
		"\62\16\62\u02ac\13\62\3\63\3\63\5\63\u02b0\n\63\3\64\3\64\5\64\u02b4\n"+
		"\64\3\64\5\64\u02b7\n\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u02c0"+
		"\n\65\3\65\5\65\u02c3\n\65\3\65\3\65\3\65\3\65\5\65\u02c9\n\65\3\65\3"+
		"\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u02d9"+
		"\n\65\3\65\5\65\u02dc\n\65\3\65\3\65\3\65\5\65\u02e1\n\65\3\65\5\65\u02e4"+
		"\n\65\3\65\3\65\3\65\3\65\3\65\5\65\u02eb\n\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u02fe"+
		"\n\65\3\65\7\65\u0301\n\65\f\65\16\65\u0304\13\65\3\66\3\66\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u0312\n\67\38\38\58\u0316"+
		"\n8\38\38\38\38\38\58\u031d\n8\38\78\u0320\n8\f8\168\u0323\138\39\39\3"+
		"9\3:\3:\3:\3:\3:\7:\u032d\n:\f:\16:\u0330\13:\3;\3;\3;\3;\3;\3;\5;\u0338"+
		"\n;\3<\3<\3<\3<\3<\3<\5<\u0340\n<\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\5="+
		"\u034d\n=\3>\3>\5>\u0351\n>\3>\3>\3?\3?\3?\3?\3?\7?\u035a\n?\f?\16?\u035d"+
		"\13?\3@\3@\5@\u0361\n@\3A\5A\u0364\nA\3A\3A\3B\3B\3B\3B\3B\3B\3B\5B\u036f"+
		"\nB\3B\3B\3B\3B\3B\3B\5B\u0377\nB\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C"+
		"\3C\3C\3C\3C\3C\3C\3C\5C\u038c\nC\3C\3C\5C\u0390\nC\3C\3C\3C\3C\3C\3C"+
		"\5C\u0398\nC\3C\3C\5C\u039c\nC\3C\3C\5C\u03a0\nC\3C\3C\5C\u03a4\nC\3D"+
		"\3D\3D\3D\5D\u03aa\nD\3E\3E\3E\3E\3E\3E\7E\u03b2\nE\fE\16E\u03b5\13E\3"+
		"F\3F\3F\3F\3F\3F\3F\3F\3F\5F\u03c0\nF\3F\5F\u03c3\nF\3G\5G\u03c6\nG\3"+
		"G\3G\3H\3H\3H\3H\3H\7H\u03cf\nH\fH\16H\u03d2\13H\3I\3I\3I\5I\u03d7\nI"+
		"\3J\5J\u03da\nJ\3J\3J\5J\u03de\nJ\3J\3J\3K\3K\3K\3K\3K\7K\u03e7\nK\fK"+
		"\16K\u03ea\13K\3K\2\37\4\6\16\20\22\24\26\30\32\34\36 (\64:@FLVZ^bhnr"+
		"|\u0088\u008e\u0094L\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086"+
		"\u0088\u008a\u008c\u008e\u0090\u0092\u0094\2\b\7\2\66\6688::==BC\3\2H"+
		"R\7\2\3\3\16\16\26\26\34\34\37\37\t\2\6\6\13\13\17\17\24\25\31\32!\"("+
		")\4\2\35\35  \6\2\7\7\27\27##\'\'\2\u043b\2\u00a1\3\2\2\2\4\u00a3\3\2"+
		"\2\2\6\u00c0\3\2\2\2\b\u00da\3\2\2\2\n\u00dc\3\2\2\2\f\u00e4\3\2\2\2\16"+
		"\u00e6\3\2\2\2\20\u00f7\3\2\2\2\22\u0105\3\2\2\2\24\u0113\3\2\2\2\26\u0127"+
		"\3\2\2\2\30\u0135\3\2\2\2\32\u0140\3\2\2\2\34\u014b\3\2\2\2\36\u0156\3"+
		"\2\2\2 \u0161\3\2\2\2\"\u0173\3\2\2\2$\u017a\3\2\2\2&\u017c\3\2\2\2(\u017e"+
		"\3\2\2\2*\u0189\3\2\2\2,\u0192\3\2\2\2.\u0195\3\2\2\2\60\u019a\3\2\2\2"+
		"\62\u01a1\3\2\2\2\64\u01a3\3\2\2\2\66\u01b3\3\2\2\28\u01b5\3\2\2\2:\u01bc"+
		"\3\2\2\2<\u01d0\3\2\2\2>\u01d2\3\2\2\2@\u01d4\3\2\2\2B\u01de\3\2\2\2D"+
		"\u01ec\3\2\2\2F\u01ee\3\2\2\2H\u01ff\3\2\2\2J\u0214\3\2\2\2L\u0216\3\2"+
		"\2\2N\u0226\3\2\2\2P\u0228\3\2\2\2R\u022a\3\2\2\2T\u022d\3\2\2\2V\u0237"+
		"\3\2\2\2X\u027b\3\2\2\2Z\u027d\3\2\2\2\\\u028c\3\2\2\2^\u028e\3\2\2\2"+
		"`\u02a0\3\2\2\2b\u02a2\3\2\2\2d\u02ad\3\2\2\2f\u02b6\3\2\2\2h\u02db\3"+
		"\2\2\2j\u0305\3\2\2\2l\u0311\3\2\2\2n\u0313\3\2\2\2p\u0324\3\2\2\2r\u0327"+
		"\3\2\2\2t\u0337\3\2\2\2v\u033f\3\2\2\2x\u034c\3\2\2\2z\u034e\3\2\2\2|"+
		"\u0354\3\2\2\2~\u0360\3\2\2\2\u0080\u0363\3\2\2\2\u0082\u0376\3\2\2\2"+
		"\u0084\u03a3\3\2\2\2\u0086\u03a9\3\2\2\2\u0088\u03ab\3\2\2\2\u008a\u03c2"+
		"\3\2\2\2\u008c\u03c5\3\2\2\2\u008e\u03c9\3\2\2\2\u0090\u03d6\3\2\2\2\u0092"+
		"\u03d9\3\2\2\2\u0094\u03e1\3\2\2\2\u0096\u00a2\7X\2\2\u0097\u00a2\7Y\2"+
		"\2\u0098\u009a\7[\2\2\u0099\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u0099"+
		"\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u00a2\3\2\2\2\u009d\u009e\7*\2\2\u009e"+
		"\u009f\5(\25\2\u009f\u00a0\7+\2\2\u00a0\u00a2\3\2\2\2\u00a1\u0096\3\2"+
		"\2\2\u00a1\u0097\3\2\2\2\u00a1\u0099\3\2\2\2\u00a1\u009d\3\2\2\2\u00a2"+
		"\3\3\2\2\2\u00a3\u00a4\b\3\1\2\u00a4\u00a5\5\2\2\2\u00a5\u00bd\3\2\2\2"+
		"\u00a6\u00a7\f\b\2\2\u00a7\u00a8\7,\2\2\u00a8\u00a9\5(\25\2\u00a9\u00aa"+
		"\7-\2\2\u00aa\u00bc\3\2\2\2\u00ab\u00ac\f\7\2\2\u00ac\u00ae\7*\2\2\u00ad"+
		"\u00af\5\6\4\2\u00ae\u00ad\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\3\2"+
		"\2\2\u00b0\u00bc\7+\2\2\u00b1\u00b2\f\6\2\2\u00b2\u00b3\7V\2\2\u00b3\u00bc"+
		"\7X\2\2\u00b4\u00b5\f\5\2\2\u00b5\u00b6\7U\2\2\u00b6\u00bc\7X\2\2\u00b7"+
		"\u00b8\f\4\2\2\u00b8\u00bc\7\67\2\2\u00b9\u00ba\f\3\2\2\u00ba\u00bc\7"+
		"9\2\2\u00bb\u00a6\3\2\2\2\u00bb\u00ab\3\2\2\2\u00bb\u00b1\3\2\2\2\u00bb"+
		"\u00b4\3\2\2\2\u00bb\u00b7\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00bf\3\2"+
		"\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\5\3\2\2\2\u00bf\u00bd"+
		"\3\2\2\2\u00c0\u00c1\b\4\1\2\u00c1\u00c2\5$\23\2\u00c2\u00c8\3\2\2\2\u00c3"+
		"\u00c4\f\3\2\2\u00c4\u00c5\7G\2\2\u00c5\u00c7\5$\23\2\u00c6\u00c3\3\2"+
		"\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9"+
		"\7\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00db\5\4\3\2\u00cc\u00cd\7\67\2"+
		"\2\u00cd\u00db\5\b\5\2\u00ce\u00cf\79\2\2\u00cf\u00db\5\b\5\2\u00d0\u00d1"+
		"\5\n\6\2\u00d1\u00d2\5\f\7\2\u00d2\u00db\3\2\2\2\u00d3\u00d4\7\33\2\2"+
		"\u00d4\u00db\5\b\5\2\u00d5\u00d6\7\33\2\2\u00d6\u00d7\7*\2\2\u00d7\u00d8"+
		"\5d\63\2\u00d8\u00d9\7+\2\2\u00d9\u00db\3\2\2\2\u00da\u00cb\3\2\2\2\u00da"+
		"\u00cc\3\2\2\2\u00da\u00ce\3\2\2\2\u00da\u00d0\3\2\2\2\u00da\u00d3\3\2"+
		"\2\2\u00da\u00d5\3\2\2\2\u00db\t\3\2\2\2\u00dc\u00dd\t\2\2\2\u00dd\13"+
		"\3\2\2\2\u00de\u00df\7*\2\2\u00df\u00e0\5d\63\2\u00e0\u00e1\7+\2\2\u00e1"+
		"\u00e2\5\f\7\2\u00e2\u00e5\3\2\2\2\u00e3\u00e5\5\b\5\2\u00e4\u00de\3\2"+
		"\2\2\u00e4\u00e3\3\2\2\2\u00e5\r\3\2\2\2\u00e6\u00e7\b\b\1\2\u00e7\u00e8"+
		"\5\f\7\2\u00e8\u00f4\3\2\2\2\u00e9\u00ea\f\5\2\2\u00ea\u00eb\7:\2\2\u00eb"+
		"\u00f3\5\f\7\2\u00ec\u00ed\f\4\2\2\u00ed\u00ee\7;\2\2\u00ee\u00f3\5\f"+
		"\7\2\u00ef\u00f0\f\3\2\2\u00f0\u00f1\7<\2\2\u00f1\u00f3\5\f\7\2\u00f2"+
		"\u00e9\3\2\2\2\u00f2\u00ec\3\2\2\2\u00f2\u00ef\3\2\2\2\u00f3\u00f6\3\2"+
		"\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\17\3\2\2\2\u00f6\u00f4"+
		"\3\2\2\2\u00f7\u00f8\b\t\1\2\u00f8\u00f9\5\16\b\2\u00f9\u0102\3\2\2\2"+
		"\u00fa\u00fb\f\4\2\2\u00fb\u00fc\7\66\2\2\u00fc\u0101\5\16\b\2\u00fd\u00fe"+
		"\f\3\2\2\u00fe\u00ff\78\2\2\u00ff\u0101\5\16\b\2\u0100\u00fa\3\2\2\2\u0100"+
		"\u00fd\3\2\2\2\u0101\u0104\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2"+
		"\2\2\u0103\21\3\2\2\2\u0104\u0102\3\2\2\2\u0105\u0106\b\n\1\2\u0106\u0107"+
		"\5\20\t\2\u0107\u0110\3\2\2\2\u0108\u0109\f\4\2\2\u0109\u010a\7\64\2\2"+
		"\u010a\u010f\5\20\t\2\u010b\u010c\f\3\2\2\u010c\u010d\7\65\2\2\u010d\u010f"+
		"\5\20\t\2\u010e\u0108\3\2\2\2\u010e\u010b\3\2\2\2\u010f\u0112\3\2\2\2"+
		"\u0110\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111\23\3\2\2\2\u0112\u0110"+
		"\3\2\2\2\u0113\u0114\b\13\1\2\u0114\u0115\5\22\n\2\u0115\u0124\3\2\2\2"+
		"\u0116\u0117\f\6\2\2\u0117\u0118\7\60\2\2\u0118\u0123\5\22\n\2\u0119\u011a"+
		"\f\5\2\2\u011a\u011b\7\62\2\2\u011b\u0123\5\22\n\2\u011c\u011d\f\4\2\2"+
		"\u011d\u011e\7\61\2\2\u011e\u0123\5\22\n\2\u011f\u0120\f\3\2\2\u0120\u0121"+
		"\7\63\2\2\u0121\u0123\5\22\n\2\u0122\u0116\3\2\2\2\u0122\u0119\3\2\2\2"+
		"\u0122\u011c\3\2\2\2\u0122\u011f\3\2\2\2\u0123\u0126\3\2\2\2\u0124\u0122"+
		"\3\2\2\2\u0124\u0125\3\2\2\2\u0125\25\3\2\2\2\u0126\u0124\3\2\2\2\u0127"+
		"\u0128\b\f\1\2\u0128\u0129\5\24\13\2\u0129\u0132\3\2\2\2\u012a\u012b\f"+
		"\4\2\2\u012b\u012c\7S\2\2\u012c\u0131\5\24\13\2\u012d\u012e\f\3\2\2\u012e"+
		"\u012f\7T\2\2\u012f\u0131\5\24\13\2\u0130\u012a\3\2\2\2\u0130\u012d\3"+
		"\2\2\2\u0131\u0134\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133"+
		"\27\3\2\2\2\u0134\u0132\3\2\2\2\u0135\u0136\b\r\1\2\u0136\u0137\5\26\f"+
		"\2\u0137\u013d\3\2\2\2\u0138\u0139\f\3\2\2\u0139\u013a\7=\2\2\u013a\u013c"+
		"\5\26\f\2\u013b\u0138\3\2\2\2\u013c\u013f\3\2\2\2\u013d\u013b\3\2\2\2"+
		"\u013d\u013e\3\2\2\2\u013e\31\3\2\2\2\u013f\u013d\3\2\2\2\u0140\u0141"+
		"\b\16\1\2\u0141\u0142\5\30\r\2\u0142\u0148\3\2\2\2\u0143\u0144\f\3\2\2"+
		"\u0144\u0145\7A\2\2\u0145\u0147\5\30\r\2\u0146\u0143\3\2\2\2\u0147\u014a"+
		"\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149\33\3\2\2\2\u014a"+
		"\u0148\3\2\2\2\u014b\u014c\b\17\1\2\u014c\u014d\5\32\16\2\u014d\u0153"+
		"\3\2\2\2\u014e\u014f\f\3\2\2\u014f\u0150\7>\2\2\u0150\u0152\5\32\16\2"+
		"\u0151\u014e\3\2\2\2\u0152\u0155\3\2\2\2\u0153\u0151\3\2\2\2\u0153\u0154"+
		"\3\2\2\2\u0154\35\3\2\2\2\u0155\u0153\3\2\2\2\u0156\u0157\b\20\1\2\u0157"+
		"\u0158\5\34\17\2\u0158\u015e\3\2\2\2\u0159\u015a\f\3\2\2\u015a\u015b\7"+
		"?\2\2\u015b\u015d\5\34\17\2\u015c\u0159\3\2\2\2\u015d\u0160\3\2\2\2\u015e"+
		"\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f\37\3\2\2\2\u0160\u015e\3\2\2"+
		"\2\u0161\u0162\b\21\1\2\u0162\u0163\5\36\20\2\u0163\u0169\3\2\2\2\u0164"+
		"\u0165\f\3\2\2\u0165\u0166\7@\2\2\u0166\u0168\5\36\20\2\u0167\u0164\3"+
		"\2\2\2\u0168\u016b\3\2\2\2\u0169\u0167\3\2\2\2\u0169\u016a\3\2\2\2\u016a"+
		"!\3\2\2\2\u016b\u0169\3\2\2\2\u016c\u0174\5 \21\2\u016d\u016e\5 \21\2"+
		"\u016e\u016f\7D\2\2\u016f\u0170\5(\25\2\u0170\u0171\7E\2\2\u0171\u0172"+
		"\5\"\22\2\u0172\u0174\3\2\2\2\u0173\u016c\3\2\2\2\u0173\u016d\3\2\2\2"+
		"\u0174#\3\2\2\2\u0175\u017b\5\"\22\2\u0176\u0177\5\b\5\2\u0177\u0178\5"+
		"&\24\2\u0178\u0179\5$\23\2\u0179\u017b\3\2\2\2\u017a\u0175\3\2\2\2\u017a"+
		"\u0176\3\2\2\2\u017b%\3\2\2\2\u017c\u017d\t\3\2\2\u017d\'\3\2\2\2\u017e"+
		"\u017f\b\25\1\2\u017f\u0180\5$\23\2\u0180\u0186\3\2\2\2\u0181\u0182\f"+
		"\3\2\2\u0182\u0183\7G\2\2\u0183\u0185\5$\23\2\u0184\u0181\3\2\2\2\u0185"+
		"\u0188\3\2\2\2\u0186\u0184\3\2\2\2\u0186\u0187\3\2\2\2\u0187)\3\2\2\2"+
		"\u0188\u0186\3\2\2\2\u0189\u018a\5\"\22\2\u018a+\3\2\2\2\u018b\u018c\5"+
		".\30\2\u018c\u018d\5\64\33\2\u018d\u018e\7F\2\2\u018e\u0193\3\2\2\2\u018f"+
		"\u0190\5.\30\2\u0190\u0191\7F\2\2\u0191\u0193\3\2\2\2\u0192\u018b\3\2"+
		"\2\2\u0192\u018f\3\2\2\2\u0193-\3\2\2\2\u0194\u0196\5\62\32\2\u0195\u0194"+
		"\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198"+
		"/\3\2\2\2\u0199\u019b\5\62\32\2\u019a\u0199\3\2\2\2\u019b\u019c\3\2\2"+
		"\2\u019c\u019a\3\2\2\2\u019c\u019d\3\2\2\2\u019d\61\3\2\2\2\u019e\u01a2"+
		"\58\35\2\u019f\u01a2\5:\36\2\u01a0\u01a2\5R*\2\u01a1\u019e\3\2\2\2\u01a1"+
		"\u019f\3\2\2\2\u01a1\u01a0\3\2\2\2\u01a2\63\3\2\2\2\u01a3\u01a4\b\33\1"+
		"\2\u01a4\u01a5\5\66\34\2\u01a5\u01ab\3\2\2\2\u01a6\u01a7\f\3\2\2\u01a7"+
		"\u01a8\7G\2\2\u01a8\u01aa\5\66\34\2\u01a9\u01a6\3\2\2\2\u01aa\u01ad\3"+
		"\2\2\2\u01ab\u01a9\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\65\3\2\2\2\u01ad"+
		"\u01ab\3\2\2\2\u01ae\u01b4\5T+\2\u01af\u01b0\5T+\2\u01b0\u01b1\7H\2\2"+
		"\u01b1\u01b2\5l\67\2\u01b2\u01b4\3\2\2\2\u01b3\u01ae\3\2\2\2\u01b3\u01af"+
		"\3\2\2\2\u01b4\67\3\2\2\2\u01b5\u01b6\t\4\2\2\u01b69\3\2\2\2\u01b7\u01b8"+
		"\b\36\1\2\u01b8\u01bd\t\5\2\2\u01b9\u01bd\5<\37\2\u01ba\u01bd\5J&\2\u01bb"+
		"\u01bd\5j\66\2\u01bc\u01b7\3\2\2\2\u01bc\u01b9\3\2\2\2\u01bc\u01ba\3\2"+
		"\2\2\u01bc\u01bb\3\2\2\2\u01bd\u01c2\3\2\2\2\u01be\u01bf\f\3\2\2\u01bf"+
		"\u01c1\5X-\2\u01c0\u01be\3\2\2\2\u01c1\u01c4\3\2\2\2\u01c2\u01c0\3\2\2"+
		"\2\u01c2\u01c3\3\2\2\2\u01c3;\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c5\u01c7"+
		"\5> \2\u01c6\u01c8\7X\2\2\u01c7\u01c6\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8"+
		"\u01c9\3\2\2\2\u01c9\u01ca\7.\2\2\u01ca\u01cb\5@!\2\u01cb\u01cc\7/\2\2"+
		"\u01cc\u01d1\3\2\2\2\u01cd\u01ce\5> \2\u01ce\u01cf\7X\2\2\u01cf\u01d1"+
		"\3\2\2\2\u01d0\u01c5\3\2\2\2\u01d0\u01cd\3\2\2\2\u01d1=\3\2\2\2\u01d2"+
		"\u01d3\t\6\2\2\u01d3?\3\2\2\2\u01d4\u01d5\b!\1\2\u01d5\u01d6\5B\"\2\u01d6"+
		"\u01db\3\2\2\2\u01d7\u01d8\f\3\2\2\u01d8\u01da\5B\"\2\u01d9\u01d7\3\2"+
		"\2\2\u01da\u01dd\3\2\2\2\u01db\u01d9\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc"+
		"A\3\2\2\2\u01dd\u01db\3\2\2\2\u01de\u01e0\5D#\2\u01df\u01e1\5F$\2\u01e0"+
		"\u01df\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e3\7F"+
		"\2\2\u01e3C\3\2\2\2\u01e4\u01e6\5:\36\2\u01e5\u01e7\5D#\2\u01e6\u01e5"+
		"\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01ed\3\2\2\2\u01e8\u01ea\5R*\2\u01e9"+
		"\u01eb\5D#\2\u01ea\u01e9\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ed\3\2\2"+
		"\2\u01ec\u01e4\3\2\2\2\u01ec\u01e8\3\2\2\2\u01edE\3\2\2\2\u01ee\u01ef"+
		"\b$\1\2\u01ef\u01f0\5H%\2\u01f0\u01f6\3\2\2\2\u01f1\u01f2\f\3\2\2\u01f2"+
		"\u01f3\7G\2\2\u01f3\u01f5\5H%\2\u01f4\u01f1\3\2\2\2\u01f5\u01f8\3\2\2"+
		"\2\u01f6\u01f4\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7G\3\2\2\2\u01f8\u01f6"+
		"\3\2\2\2\u01f9\u0200\5T+\2\u01fa\u01fc\5T+\2\u01fb\u01fa\3\2\2\2\u01fb"+
		"\u01fc\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01fe\7E\2\2\u01fe\u0200\5*\26"+
		"\2\u01ff\u01f9\3\2\2\2\u01ff\u01fb\3\2\2\2\u0200I\3\2\2\2\u0201\u0203"+
		"\7\r\2\2\u0202\u0204\7X\2\2\u0203\u0202\3\2\2\2\u0203\u0204\3\2\2\2\u0204"+
		"\u0205\3\2\2\2\u0205\u0206\7.\2\2\u0206\u0207\5L\'\2\u0207\u0208\7/\2"+
		"\2\u0208\u0215\3\2\2\2\u0209\u020b\7\r\2\2\u020a\u020c\7X\2\2\u020b\u020a"+
		"\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u020e\7.\2\2\u020e"+
		"\u020f\5L\'\2\u020f\u0210\7G\2\2\u0210\u0211\7/\2\2\u0211\u0215\3\2\2"+
		"\2\u0212\u0213\7\r\2\2\u0213\u0215\7X\2\2\u0214\u0201\3\2\2\2\u0214\u0209"+
		"\3\2\2\2\u0214\u0212\3\2\2\2\u0215K\3\2\2\2\u0216\u0217\b\'\1\2\u0217"+
		"\u0218\5N(\2\u0218\u021e\3\2\2\2\u0219\u021a\f\3\2\2\u021a\u021b\7G\2"+
		"\2\u021b\u021d\5N(\2\u021c\u0219\3\2\2\2\u021d\u0220\3\2\2\2\u021e\u021c"+
		"\3\2\2\2\u021e\u021f\3\2\2\2\u021fM\3\2\2\2\u0220\u021e\3\2\2\2\u0221"+
		"\u0227\5P)\2\u0222\u0223\5P)\2\u0223\u0224\7H\2\2\u0224\u0225\5*\26\2"+
		"\u0225\u0227\3\2\2\2\u0226\u0221\3\2\2\2\u0226\u0222\3\2\2\2\u0227O\3"+
		"\2\2\2\u0228\u0229\7X\2\2\u0229Q\3\2\2\2\u022a\u022b\t\7\2\2\u022bS\3"+
		"\2\2\2\u022c\u022e\5X-\2\u022d\u022c\3\2\2\2\u022d\u022e\3\2\2\2\u022e"+
		"\u022f\3\2\2\2\u022f\u0230\5V,\2\u0230U\3\2\2\2\u0231\u0232\b,\1\2\u0232"+
		"\u0238\7X\2\2\u0233\u0234\7*\2\2\u0234\u0235\5T+\2\u0235\u0236\7+\2\2"+
		"\u0236\u0238\3\2\2\2\u0237\u0231\3\2\2\2\u0237\u0233\3\2\2\2\u0238\u0266"+
		"\3\2\2\2\u0239\u023a\f\b\2\2\u023a\u023c\7,\2\2\u023b\u023d\5Z.\2\u023c"+
		"\u023b\3\2\2\2\u023c\u023d\3\2\2\2\u023d\u023f\3\2\2\2\u023e\u0240\5$"+
		"\23\2\u023f\u023e\3\2\2\2\u023f\u0240\3\2\2\2\u0240\u0241\3\2\2\2\u0241"+
		"\u0265\7-\2\2\u0242\u0243\f\7\2\2\u0243\u0244\7,\2\2\u0244\u0246\7\34"+
		"\2\2\u0245\u0247\5Z.\2\u0246\u0245\3\2\2\2\u0246\u0247\3\2\2\2\u0247\u0248"+
		"\3\2\2\2\u0248\u0249\5$\23\2\u0249\u024a\7-\2\2\u024a\u0265\3\2\2\2\u024b"+
		"\u024c\f\6\2\2\u024c\u024d\7,\2\2\u024d\u024e\5Z.\2\u024e\u024f\7\34\2"+
		"\2\u024f\u0250\5$\23\2\u0250\u0251\7-\2\2\u0251\u0265\3\2\2\2\u0252\u0253"+
		"\f\5\2\2\u0253\u0255\7,\2\2\u0254\u0256\5Z.\2\u0255\u0254\3\2\2\2\u0255"+
		"\u0256\3\2\2\2\u0256\u0257\3\2\2\2\u0257\u0258\7:\2\2\u0258\u0265\7-\2"+
		"\2\u0259\u025a\f\4\2\2\u025a\u025b\7*\2\2\u025b\u025c\5\\/\2\u025c\u025d"+
		"\7+\2\2\u025d\u0265\3\2\2\2\u025e\u025f\f\3\2\2\u025f\u0261\7*\2\2\u0260"+
		"\u0262\5b\62\2\u0261\u0260\3\2\2\2\u0261\u0262\3\2\2\2\u0262\u0263\3\2"+
		"\2\2\u0263\u0265\7+\2\2\u0264\u0239\3\2\2\2\u0264\u0242\3\2\2\2\u0264"+
		"\u024b\3\2\2\2\u0264\u0252\3\2\2\2\u0264\u0259\3\2\2\2\u0264\u025e\3\2"+
		"\2\2\u0265\u0268\3\2\2\2\u0266\u0264\3\2\2\2\u0266\u0267\3\2\2\2\u0267"+
		"W\3\2\2\2\u0268\u0266\3\2\2\2\u0269\u026b\7:\2\2\u026a\u026c\5Z.\2\u026b"+
		"\u026a\3\2\2\2\u026b\u026c\3\2\2\2\u026c\u027c\3\2\2\2\u026d\u026f\7:"+
		"\2\2\u026e\u0270\5Z.\2\u026f\u026e\3\2\2\2\u026f\u0270\3\2\2\2\u0270\u0271"+
		"\3\2\2\2\u0271\u027c\5X-\2\u0272\u0274\7A\2\2\u0273\u0275\5Z.\2\u0274"+
		"\u0273\3\2\2\2\u0274\u0275\3\2\2\2\u0275\u027c\3\2\2\2\u0276\u0278\7A"+
		"\2\2\u0277\u0279\5Z.\2\u0278\u0277\3\2\2\2\u0278\u0279\3\2\2\2\u0279\u027a"+
		"\3\2\2\2\u027a\u027c\5X-\2\u027b\u0269\3\2\2\2\u027b\u026d\3\2\2\2\u027b"+
		"\u0272\3\2\2\2\u027b\u0276\3\2\2\2\u027cY\3\2\2\2\u027d\u027e\b.\1\2\u027e"+
		"\u027f\5R*\2\u027f\u0284\3\2\2\2\u0280\u0281\f\3\2\2\u0281\u0283\5R*\2"+
		"\u0282\u0280\3\2\2\2\u0283\u0286\3\2\2\2\u0284\u0282\3\2\2\2\u0284\u0285"+
		"\3\2\2\2\u0285[\3\2\2\2\u0286\u0284\3\2\2\2\u0287\u028d\5^\60\2\u0288"+
		"\u0289\5^\60\2\u0289\u028a\7G\2\2\u028a\u028b\7W\2\2\u028b\u028d\3\2\2"+
		"\2\u028c\u0287\3\2\2\2\u028c\u0288\3\2\2\2\u028d]\3\2\2\2\u028e\u028f"+
		"\b\60\1\2\u028f\u0290\5`\61\2\u0290\u0296\3\2\2\2\u0291\u0292\f\3\2\2"+
		"\u0292\u0293\7G\2\2\u0293\u0295\5`\61\2\u0294\u0291\3\2\2\2\u0295\u0298"+
		"\3\2\2\2\u0296\u0294\3\2\2\2\u0296\u0297\3\2\2\2\u0297_\3\2\2\2\u0298"+
		"\u0296\3\2\2\2\u0299\u029a\5.\30\2\u029a\u029b\5T+\2\u029b\u02a1\3\2\2"+
		"\2\u029c\u029e\5\60\31\2\u029d\u029f\5f\64\2\u029e\u029d\3\2\2\2\u029e"+
		"\u029f\3\2\2\2\u029f\u02a1\3\2\2\2\u02a0\u0299\3\2\2\2\u02a0\u029c\3\2"+
		"\2\2\u02a1a\3\2\2\2\u02a2\u02a3\b\62\1\2\u02a3\u02a4\7X\2\2\u02a4\u02aa"+
		"\3\2\2\2\u02a5\u02a6\f\3\2\2\u02a6\u02a7\7G\2\2\u02a7\u02a9\7X\2\2\u02a8"+
		"\u02a5\3\2\2\2\u02a9\u02ac\3\2\2\2\u02aa\u02a8\3\2\2\2\u02aa\u02ab\3\2"+
		"\2\2\u02abc\3\2\2\2\u02ac\u02aa\3\2\2\2\u02ad\u02af\5D#\2\u02ae\u02b0"+
		"\5f\64\2\u02af\u02ae\3\2\2\2\u02af\u02b0\3\2\2\2\u02b0e\3\2\2\2\u02b1"+
		"\u02b7\5X-\2\u02b2\u02b4\5X-\2\u02b3\u02b2\3\2\2\2\u02b3\u02b4\3\2\2\2"+
		"\u02b4\u02b5\3\2\2\2\u02b5\u02b7\5h\65\2\u02b6\u02b1\3\2\2\2\u02b6\u02b3"+
		"\3\2\2\2\u02b7g\3\2\2\2\u02b8\u02b9\b\65\1\2\u02b9\u02ba\7*\2\2\u02ba"+
		"\u02bb\5f\64\2\u02bb\u02bc\7+\2\2\u02bc\u02dc\3\2\2\2\u02bd\u02bf\7,\2"+
		"\2\u02be\u02c0\5Z.\2\u02bf\u02be\3\2\2\2\u02bf\u02c0\3\2\2\2\u02c0\u02c2"+
		"\3\2\2\2\u02c1\u02c3\5$\23\2\u02c2\u02c1\3\2\2\2\u02c2\u02c3\3\2\2\2\u02c3"+
		"\u02c4\3\2\2\2\u02c4\u02dc\7-\2\2\u02c5\u02c6\7,\2\2\u02c6\u02c8\7\34"+
		"\2\2\u02c7\u02c9\5Z.\2\u02c8\u02c7\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9\u02ca"+
		"\3\2\2\2\u02ca\u02cb\5$\23\2\u02cb\u02cc\7-\2\2\u02cc\u02dc\3\2\2\2\u02cd"+
		"\u02ce\7,\2\2\u02ce\u02cf\5Z.\2\u02cf\u02d0\7\34\2\2\u02d0\u02d1\5$\23"+
		"\2\u02d1\u02d2\7-\2\2\u02d2\u02dc\3\2\2\2\u02d3\u02d4\7,\2\2\u02d4\u02d5"+
		"\7:\2\2\u02d5\u02dc\7-\2\2\u02d6\u02d8\7*\2\2\u02d7\u02d9\5\\/\2\u02d8"+
		"\u02d7\3\2\2\2\u02d8\u02d9\3\2\2\2\u02d9\u02da\3\2\2\2\u02da\u02dc\7+"+
		"\2\2\u02db\u02b8\3\2\2\2\u02db\u02bd\3\2\2\2\u02db\u02c5\3\2\2\2\u02db"+
		"\u02cd\3\2\2\2\u02db\u02d3\3\2\2\2\u02db\u02d6\3\2\2\2\u02dc\u0302\3\2"+
		"\2\2\u02dd\u02de\f\7\2\2\u02de\u02e0\7,\2\2\u02df\u02e1\5Z.\2\u02e0\u02df"+
		"\3\2\2\2\u02e0\u02e1\3\2\2\2\u02e1\u02e3\3\2\2\2\u02e2\u02e4\5$\23\2\u02e3"+
		"\u02e2\3\2\2\2\u02e3\u02e4\3\2\2\2\u02e4\u02e5\3\2\2\2\u02e5\u0301\7-"+
		"\2\2\u02e6\u02e7\f\6\2\2\u02e7\u02e8\7,\2\2\u02e8\u02ea\7\34\2\2\u02e9"+
		"\u02eb\5Z.\2\u02ea\u02e9\3\2\2\2\u02ea\u02eb\3\2\2\2\u02eb\u02ec\3\2\2"+
		"\2\u02ec\u02ed\5$\23\2\u02ed\u02ee\7-\2\2\u02ee\u0301\3\2\2\2\u02ef\u02f0"+
		"\f\5\2\2\u02f0\u02f1\7,\2\2\u02f1\u02f2\5Z.\2\u02f2\u02f3\7\34\2\2\u02f3"+
		"\u02f4\5$\23\2\u02f4\u02f5\7-\2\2\u02f5\u0301\3\2\2\2\u02f6\u02f7\f\4"+
		"\2\2\u02f7\u02f8\7,\2\2\u02f8\u02f9\7:\2\2\u02f9\u0301\7-\2\2\u02fa\u02fb"+
		"\f\3\2\2\u02fb\u02fd\7*\2\2\u02fc\u02fe\5\\/\2\u02fd\u02fc\3\2\2\2\u02fd"+
		"\u02fe\3\2\2\2\u02fe\u02ff\3\2\2\2\u02ff\u0301\7+\2\2\u0300\u02dd\3\2"+
		"\2\2\u0300\u02e6\3\2\2\2\u0300\u02ef\3\2\2\2\u0300\u02f6\3\2\2\2\u0300"+
		"\u02fa\3\2\2\2\u0301\u0304\3\2\2\2\u0302\u0300\3\2\2\2\u0302\u0303\3\2"+
		"\2\2\u0303i\3\2\2\2\u0304\u0302\3\2\2\2\u0305\u0306\7X\2\2\u0306k\3\2"+
		"\2\2\u0307\u0312\5$\23\2\u0308\u0309\7.\2\2\u0309\u030a\5n8\2\u030a\u030b"+
		"\7/\2\2\u030b\u0312\3\2\2\2\u030c\u030d\7.\2\2\u030d\u030e\5n8\2\u030e"+
		"\u030f\7G\2\2\u030f\u0310\7/\2\2\u0310\u0312\3\2\2\2\u0311\u0307\3\2\2"+
		"\2\u0311\u0308\3\2\2\2\u0311\u030c\3\2\2\2\u0312m\3\2\2\2\u0313\u0315"+
		"\b8\1\2\u0314\u0316\5p9\2\u0315\u0314\3\2\2\2\u0315\u0316\3\2\2\2\u0316"+
		"\u0317\3\2\2\2\u0317\u0318\5l\67\2\u0318\u0321\3\2\2\2\u0319\u031a\f\3"+
		"\2\2\u031a\u031c\7G\2\2\u031b\u031d\5p9\2\u031c\u031b\3\2\2\2\u031c\u031d"+
		"\3\2\2\2\u031d\u031e\3\2\2\2\u031e\u0320\5l\67\2\u031f\u0319\3\2\2\2\u0320"+
		"\u0323\3\2\2\2\u0321\u031f\3\2\2\2\u0321\u0322\3\2\2\2\u0322o\3\2\2\2"+
		"\u0323\u0321\3\2\2\2\u0324\u0325\5r:\2\u0325\u0326\7H\2\2\u0326q\3\2\2"+
		"\2\u0327\u0328\b:\1\2\u0328\u0329\5t;\2\u0329\u032e\3\2\2\2\u032a\u032b"+
		"\f\3\2\2\u032b\u032d\5t;\2\u032c\u032a\3\2\2\2\u032d\u0330\3\2\2\2\u032e"+
		"\u032c\3\2\2\2\u032e\u032f\3\2\2\2\u032fs\3\2\2\2\u0330\u032e\3\2\2\2"+
		"\u0331\u0332\7,\2\2\u0332\u0333\5*\26\2\u0333\u0334\7-\2\2\u0334\u0338"+
		"\3\2\2\2\u0335\u0336\7V\2\2\u0336\u0338\7X\2\2\u0337\u0331\3\2\2\2\u0337"+
		"\u0335\3\2\2\2\u0338u\3\2\2\2\u0339\u0340\5x=\2\u033a\u0340\5z>\2\u033b"+
		"\u0340\5\u0080A\2\u033c\u0340\5\u0082B\2\u033d\u0340\5\u0084C\2\u033e"+
		"\u0340\5\u008aF\2\u033f\u0339\3\2\2\2\u033f\u033a\3\2\2\2\u033f\u033b"+
		"\3\2\2\2\u033f\u033c\3\2\2\2\u033f\u033d\3\2\2\2\u033f\u033e\3\2\2\2\u0340"+
		"w\3\2\2\2\u0341\u0342\7X\2\2\u0342\u0343\7E\2\2\u0343\u034d\5v<\2\u0344"+
		"\u0345\7\5\2\2\u0345\u0346\5*\26\2\u0346\u0347\7E\2\2\u0347\u0348\5v<"+
		"\2\u0348\u034d\3\2\2\2\u0349\u034a\7\t\2\2\u034a\u034b\7E\2\2\u034b\u034d"+
		"\5v<\2\u034c\u0341\3\2\2\2\u034c\u0344\3\2\2\2\u034c\u0349\3\2\2\2\u034d"+
		"y\3\2\2\2\u034e\u0350\7.\2\2\u034f\u0351\5|?\2\u0350\u034f\3\2\2\2\u0350"+
		"\u0351\3\2\2\2\u0351\u0352\3\2\2\2\u0352\u0353\7/\2\2\u0353{\3\2\2\2\u0354"+
		"\u0355\b?\1\2\u0355\u0356\5~@\2\u0356\u035b\3\2\2\2\u0357\u0358\f\3\2"+
		"\2\u0358\u035a\5~@\2\u0359\u0357\3\2\2\2\u035a\u035d\3\2\2\2\u035b\u0359"+
		"\3\2\2\2\u035b\u035c\3\2\2\2\u035c}\3\2\2\2\u035d\u035b\3\2\2\2\u035e"+
		"\u0361\5v<\2\u035f\u0361\5,\27\2\u0360\u035e\3\2\2\2\u0360\u035f\3\2\2"+
		"\2\u0361\177\3\2\2\2\u0362\u0364\5(\25\2\u0363\u0362\3\2\2\2\u0363\u0364"+
		"\3\2\2\2\u0364\u0365\3\2\2\2\u0365\u0366\7F\2\2\u0366\u0081\3\2\2\2\u0367"+
		"\u0368\7\22\2\2\u0368\u0369\7*\2\2\u0369\u036a\5(\25\2\u036a\u036b\7+"+
		"\2\2\u036b\u036e\5v<\2\u036c\u036d\7\f\2\2\u036d\u036f\5v<\2\u036e\u036c"+
		"\3\2\2\2\u036e\u036f\3\2\2\2\u036f\u0377\3\2\2\2\u0370\u0371\7\36\2\2"+
		"\u0371\u0372\7*\2\2\u0372\u0373\5(\25\2\u0373\u0374\7+\2\2\u0374\u0375"+
		"\5v<\2\u0375\u0377\3\2\2\2\u0376\u0367\3\2\2\2\u0376\u0370\3\2\2\2\u0377"+
		"\u0083\3\2\2\2\u0378\u0379\7$\2\2\u0379\u037a\7*\2\2\u037a\u037b\5(\25"+
		"\2\u037b\u037c\7+\2\2\u037c\u037d\5v<\2\u037d\u03a4\3\2\2\2\u037e\u037f"+
		"\7\n\2\2\u037f\u0380\5v<\2\u0380\u0381\7$\2\2\u0381\u0382\7*\2\2\u0382"+
		"\u0383\5(\25\2\u0383\u0384\7+\2\2\u0384\u0385\7F\2\2\u0385\u03a4\3\2\2"+
		"\2\u0386\u0387\7\20\2\2\u0387\u0388\7*\2\2\u0388\u0389\5\u0086D\2\u0389"+
		"\u038b\7F\2\2\u038a\u038c\5\u0088E\2\u038b\u038a\3\2\2\2\u038b\u038c\3"+
		"\2\2\2\u038c\u038d\3\2\2\2\u038d\u038f\7F\2\2\u038e\u0390\5\u0088E\2\u038f"+
		"\u038e\3\2\2\2\u038f\u0390\3\2\2\2\u0390\u0391\3\2\2\2\u0391\u0392\7+"+
		"\2\2\u0392\u0393\5v<\2\u0393\u03a4\3\2\2\2\u0394\u0395\7\20\2\2\u0395"+
		"\u0397\7*\2\2\u0396\u0398\5(\25\2\u0397\u0396\3\2\2\2\u0397\u0398\3\2"+
		"\2\2\u0398\u0399\3\2\2\2\u0399\u039b\7F\2\2\u039a\u039c\5\u0088E\2\u039b"+
		"\u039a\3\2\2\2\u039b\u039c\3\2\2\2\u039c\u039d\3\2\2\2\u039d\u039f\7F"+
		"\2\2\u039e\u03a0\5\u0088E\2\u039f\u039e\3\2\2\2\u039f\u03a0\3\2\2\2\u03a0"+
		"\u03a1\3\2\2\2\u03a1\u03a2\7+\2\2\u03a2\u03a4\5v<\2\u03a3\u0378\3\2\2"+
		"\2\u03a3\u037e\3\2\2\2\u03a3\u0386\3\2\2\2\u03a3\u0394\3\2\2\2\u03a4\u0085"+
		"\3\2\2\2\u03a5\u03a6\5.\30\2\u03a6\u03a7\5\64\33\2\u03a7\u03aa\3\2\2\2"+
		"\u03a8\u03aa\5.\30\2\u03a9\u03a5\3\2\2\2\u03a9\u03a8\3\2\2\2\u03aa\u0087"+
		"\3\2\2\2\u03ab\u03ac\bE\1\2\u03ac\u03ad\5$\23\2\u03ad\u03b3\3\2\2\2\u03ae"+
		"\u03af\f\3\2\2\u03af\u03b0\7G\2\2\u03b0\u03b2\5$\23\2\u03b1\u03ae\3\2"+
		"\2\2\u03b2\u03b5\3\2\2\2\u03b3\u03b1\3\2\2\2\u03b3\u03b4\3\2\2\2\u03b4"+
		"\u0089\3\2\2\2\u03b5\u03b3\3\2\2\2\u03b6\u03b7\7\21\2\2\u03b7\u03b8\7"+
		"X\2\2\u03b8\u03c3\7F\2\2\u03b9\u03ba\7\b\2\2\u03ba\u03c3\7F\2\2\u03bb"+
		"\u03bc\7\4\2\2\u03bc\u03c3\7F\2\2\u03bd\u03bf\7\30\2\2\u03be\u03c0\5("+
		"\25\2\u03bf\u03be\3\2\2\2\u03bf\u03c0\3\2\2\2\u03c0\u03c1\3\2\2\2\u03c1"+
		"\u03c3\7F\2\2\u03c2\u03b6\3\2\2\2\u03c2\u03b9\3\2\2\2\u03c2\u03bb\3\2"+
		"\2\2\u03c2\u03bd\3\2\2\2\u03c3\u008b\3\2\2\2\u03c4\u03c6\5\u008eH\2\u03c5"+
		"\u03c4\3\2\2\2\u03c5\u03c6\3\2\2\2\u03c6\u03c7\3\2\2\2\u03c7\u03c8\7\2"+
		"\2\3\u03c8\u008d\3\2\2\2\u03c9\u03ca\bH\1\2\u03ca\u03cb\5\u0090I\2\u03cb"+
		"\u03d0\3\2\2\2\u03cc\u03cd\f\3\2\2\u03cd\u03cf\5\u0090I\2\u03ce\u03cc"+
		"\3\2\2\2\u03cf\u03d2\3\2\2\2\u03d0\u03ce\3\2\2\2\u03d0\u03d1\3\2\2\2\u03d1"+
		"\u008f\3\2\2\2\u03d2\u03d0\3\2\2\2\u03d3\u03d7\5\u0092J\2\u03d4\u03d7"+
		"\5,\27\2\u03d5\u03d7\7F\2\2\u03d6\u03d3\3\2\2\2\u03d6\u03d4\3\2\2\2\u03d6"+
		"\u03d5\3\2\2\2\u03d7\u0091\3\2\2\2\u03d8\u03da\5.\30\2\u03d9\u03d8\3\2"+
		"\2\2\u03d9\u03da\3\2\2\2\u03da\u03db\3\2\2\2\u03db\u03dd\5T+\2\u03dc\u03de"+
		"\5\u0094K\2\u03dd\u03dc\3\2\2\2\u03dd\u03de\3\2\2\2\u03de\u03df\3\2\2"+
		"\2\u03df\u03e0\5z>\2\u03e0\u0093\3\2\2\2\u03e1\u03e2\bK\1\2\u03e2\u03e3"+
		"\5,\27\2\u03e3\u03e8\3\2\2\2\u03e4\u03e5\f\3\2\2\u03e5\u03e7\5,\27\2\u03e6"+
		"\u03e4\3\2\2\2\u03e7\u03ea\3\2\2\2\u03e8\u03e6\3\2\2\2\u03e8\u03e9\3\2"+
		"\2\2\u03e9\u0095\3\2\2\2\u03ea\u03e8\3\2\2\2s\u009b\u00a1\u00ae\u00bb"+
		"\u00bd\u00c8\u00da\u00e4\u00f2\u00f4\u0100\u0102\u010e\u0110\u0122\u0124"+
		"\u0130\u0132\u013d\u0148\u0153\u015e\u0169\u0173\u017a\u0186\u0192\u0197"+
		"\u019c\u01a1\u01ab\u01b3\u01bc\u01c2\u01c7\u01d0\u01db\u01e0\u01e6\u01ea"+
		"\u01ec\u01f6\u01fb\u01ff\u0203\u020b\u0214\u021e\u0226\u022d\u0237\u023c"+
		"\u023f\u0246\u0255\u0261\u0264\u0266\u026b\u026f\u0274\u0278\u027b\u0284"+
		"\u028c\u0296\u029e\u02a0\u02aa\u02af\u02b3\u02b6\u02bf\u02c2\u02c8\u02d8"+
		"\u02db\u02e0\u02e3\u02ea\u02fd\u0300\u0302\u0311\u0315\u031c\u0321\u032e"+
		"\u0337\u033f\u034c\u0350\u035b\u0360\u0363\u036e\u0376\u038b\u038f\u0397"+
		"\u039b\u039f\u03a3\u03a9\u03b3\u03bf\u03c2\u03c5\u03d0\u03d6\u03d9\u03dd"+
		"\u03e8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}