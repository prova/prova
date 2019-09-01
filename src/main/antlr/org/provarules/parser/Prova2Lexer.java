// $ANTLR 3.4 C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g 2013-01-02 16:17:20

       package org.provarules.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class Prova2Lexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__73=73;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int ANNOTATION=4;
    public static final int ARGS=5;
    public static final int ARITHMETIC_RELATION=6;
    public static final int ATERM=7;
    public static final int BAR=8;
    public static final int BRA=9;
    public static final int CHAR_ESC=10;
    public static final int CLAUSE=11;
    public static final int CLEAN_STRING=12;
    public static final int CLOSE=13;
    public static final int COMMA=14;
    public static final int CUT=15;
    public static final int DIGIT=16;
    public static final int DIV=17;
    public static final int DOLLAR=18;
    public static final int DOLLARWORD=19;
    public static final int DOT=20;
    public static final int EQUAL=21;
    public static final int EXPONENT=22;
    public static final int EXPR=23;
    public static final int FUNCTION=24;
    public static final int FUNCTION_CALL=25;
    public static final int GE=26;
    public static final int GT=27;
    public static final int GUARD=28;
    public static final int IF=29;
    public static final int INSTANCE_JAVA_CALL=30;
    public static final int INT_LITERAL=31;
    public static final int KET=32;
    public static final int KEY_VALUE=33;
    public static final int LC=34;
    public static final int LCWORD=35;
    public static final int LE=36;
    public static final int LIST_BODY=37;
    public static final int LITERAL=38;
    public static final int LONG_LITERAL=39;
    public static final int LT=40;
    public static final int METADATA=41;
    public static final int MINUS=42;
    public static final int ML_COMMENT=43;
    public static final int MULT=44;
    public static final int NEWLINE=45;
    public static final int NOT_EQUAL1=46;
    public static final int NOT_EQUAL2=47;
    public static final int OPEN=48;
    public static final int PLUS=49;
    public static final int PREDICATE=50;
    public static final int PROVA_LIST=51;
    public static final int PROVA_MAP=52;
    public static final int QUALIFIED_JAVA_CLASS=53;
    public static final int QUERY=54;
    public static final int RELATION=55;
    public static final int REM=56;
    public static final int RULEBASE=57;
    public static final int SEMANTIC_ATTACHMENT=58;
    public static final int STATEMENT=59;
    public static final int STATIC_JAVA_CALL=60;
    public static final int STRING1=61;
    public static final int STRING2=62;
    public static final int TERM=63;
    public static final int TYPED_VARIABLE=64;
    public static final int UC=65;
    public static final int UCWORD=66;
    public static final int UNDERSCORE=67;
    public static final int USWORD=68;
    public static final int WORD=69;
    public static final int WS=70;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public Prova2Lexer() {} 
    public Prova2Lexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public Prova2Lexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g"; }

    // $ANTLR start "BAR"
    public final void mBAR() throws RecognitionException {
        try {
            int _type = BAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:6:5: ( '|' )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:6:7: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BAR"

    // $ANTLR start "BRA"
    public final void mBRA() throws RecognitionException {
        try {
            int _type = BRA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:7:5: ( '[' )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:7:7: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BRA"

    // $ANTLR start "CLOSE"
    public final void mCLOSE() throws RecognitionException {
        try {
            int _type = CLOSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:8:7: ( ')' )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:8:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CLOSE"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:9:7: ( ',' )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:9:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "CUT"
    public final void mCUT() throws RecognitionException {
        try {
            int _type = CUT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:10:5: ( '!' )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:10:7: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CUT"

    // $ANTLR start "DIV"
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:11:5: ( '/' )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:11:7: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIV"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:12:5: ( '.' )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:12:7: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "EQUAL"
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:13:7: ( '=' )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:13:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQUAL"

    // $ANTLR start "GE"
    public final void mGE() throws RecognitionException {
        try {
            int _type = GE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:14:4: ( '>=' )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:14:6: '>='
            {
            match(">="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GE"

    // $ANTLR start "GT"
    public final void mGT() throws RecognitionException {
        try {
            int _type = GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:15:4: ( '>' )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:15:6: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GT"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:16:4: ( ':-' )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:16:6: ':-'
            {
            match(":-"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "KET"
    public final void mKET() throws RecognitionException {
        try {
            int _type = KET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:17:5: ( ']' )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:17:7: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KET"

    // $ANTLR start "LE"
    public final void mLE() throws RecognitionException {
        try {
            int _type = LE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:18:4: ( '<=' )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:18:6: '<='
            {
            match("<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LE"

    // $ANTLR start "LT"
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:19:4: ( '<' )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:19:6: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LT"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:20:7: ( '-' )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:20:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "MULT"
    public final void mMULT() throws RecognitionException {
        try {
            int _type = MULT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:21:6: ( '*' )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:21:8: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MULT"

    // $ANTLR start "NOT_EQUAL1"
    public final void mNOT_EQUAL1() throws RecognitionException {
        try {
            int _type = NOT_EQUAL1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:22:12: ( '<>' )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:22:14: '<>'
            {
            match("<>"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOT_EQUAL1"

    // $ANTLR start "NOT_EQUAL2"
    public final void mNOT_EQUAL2() throws RecognitionException {
        try {
            int _type = NOT_EQUAL2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:23:12: ( '!=' )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:23:14: '!='
            {
            match("!="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOT_EQUAL2"

    // $ANTLR start "OPEN"
    public final void mOPEN() throws RecognitionException {
        try {
            int _type = OPEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:24:6: ( '(' )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:24:8: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OPEN"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:25:6: ( '+' )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:25:8: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "REM"
    public final void mREM() throws RecognitionException {
        try {
            int _type = REM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:26:5: ( 'mod' )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:26:7: 'mod'
            {
            match("mod"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "REM"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:27:7: ( '->' )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:27:9: '->'
            {
            match("->"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:28:7: ( ':' )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:28:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:29:7: ( '@' )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:29:9: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:30:7: ( '{' )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:30:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:31:7: ( '}' )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:31:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "EXPONENT"
    public final void mEXPONENT() throws RecognitionException {
        try {
            int _type = EXPONENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:283:2: ( 'e' ( '-' )? ( DIGIT )+ )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:283:4: 'e' ( '-' )? ( DIGIT )+
            {
            match('e'); 

            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:283:8: ( '-' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='-') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:283:8: '-'
                    {
                    match('-'); 

                    }
                    break;

            }


            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:283:13: ( DIGIT )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EXPONENT"

    // $ANTLR start "LONG_LITERAL"
    public final void mLONG_LITERAL() throws RecognitionException {
        try {
            int _type = LONG_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:285:14: ( ( DIGIT )+ 'L' )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:285:16: ( DIGIT )+ 'L'
            {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:285:16: ( DIGIT )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            match('L'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LONG_LITERAL"

    // $ANTLR start "INT_LITERAL"
    public final void mINT_LITERAL() throws RecognitionException {
        try {
            int _type = INT_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:287:12: ( ( DIGIT )+ )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:288:5: ( DIGIT )+
            {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:288:5: ( DIGIT )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT_LITERAL"

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            int _type = NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:291:9: ( ( '%' (~ ( '\\r' | '\\n' ) )* )? ( ( '\\r' )? '\\n' )? )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:291:11: ( '%' (~ ( '\\r' | '\\n' ) )* )? ( ( '\\r' )? '\\n' )?
            {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:291:11: ( '%' (~ ( '\\r' | '\\n' ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='%') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:291:12: '%' (~ ( '\\r' | '\\n' ) )*
                    {
                    match('%'); 

                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:291:16: (~ ( '\\r' | '\\n' ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0 >= '\u0000' && LA5_0 <= '\t')||(LA5_0 >= '\u000B' && LA5_0 <= '\f')||(LA5_0 >= '\u000E' && LA5_0 <= '\uFFFF')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:
                    	    {
                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }


            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:291:35: ( ( '\\r' )? '\\n' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\n'||LA8_0=='\r') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:291:36: ( '\\r' )? '\\n'
                    {
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:291:36: ( '\\r' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='\r') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:291:36: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }


                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NEWLINE"

    // $ANTLR start "LC"
    public final void mLC() throws RecognitionException {
        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:293:14: ( 'a' .. 'z' )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:
            {
            if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LC"

    // $ANTLR start "UC"
    public final void mUC() throws RecognitionException {
        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:295:14: ( 'A' .. 'Z' )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UC"

    // $ANTLR start "LCWORD"
    public final void mLCWORD() throws RecognitionException {
        try {
            int _type = LCWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:297:9: ( LC WORD )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:297:11: LC WORD
            {
            mLC(); 


            mWORD(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LCWORD"

    // $ANTLR start "DOLLARWORD"
    public final void mDOLLARWORD() throws RecognitionException {
        try {
            int _type = DOLLARWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:300:2: ( DOLLAR WORD )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:300:4: DOLLAR WORD
            {
            mDOLLAR(); 


            mWORD(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOLLARWORD"

    // $ANTLR start "WORD"
    public final void mWORD() throws RecognitionException {
        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:303:2: ( ( LC | UC | UNDERSCORE | DIGIT )* )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:303:4: ( LC | UC | UNDERSCORE | DIGIT )*
            {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:303:4: ( LC | UC | UNDERSCORE | DIGIT )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0 >= '0' && LA9_0 <= '9')||(LA9_0 >= 'A' && LA9_0 <= 'Z')||LA9_0=='_'||(LA9_0 >= 'a' && LA9_0 <= 'z')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WORD"

    // $ANTLR start "UNDERSCORE"
    public final void mUNDERSCORE() throws RecognitionException {
        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:306:2: ( '_' )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:306:4: '_'
            {
            match('_'); 

            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNDERSCORE"

    // $ANTLR start "DOLLAR"
    public final void mDOLLAR() throws RecognitionException {
        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:310:2: ( '$' )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:310:4: '$'
            {
            match('$'); 

            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOLLAR"

    // $ANTLR start "UCWORD"
    public final void mUCWORD() throws RecognitionException {
        try {
            int _type = UCWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:313:9: ( UC ( LC | UC | UNDERSCORE | ':' | DIGIT )* )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:313:11: UC ( LC | UC | UNDERSCORE | ':' | DIGIT )*
            {
            mUC(); 


            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:313:14: ( LC | UC | UNDERSCORE | ':' | DIGIT )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0 >= '0' && LA10_0 <= ':')||(LA10_0 >= 'A' && LA10_0 <= 'Z')||LA10_0=='_'||(LA10_0 >= 'a' && LA10_0 <= 'z')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= ':')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UCWORD"

    // $ANTLR start "USWORD"
    public final void mUSWORD() throws RecognitionException {
        try {
            int _type = USWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:315:9: ( UNDERSCORE ( LC | UC | UNDERSCORE | DIGIT )* )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:315:11: UNDERSCORE ( LC | UC | UNDERSCORE | DIGIT )*
            {
            mUNDERSCORE(); 


            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:315:22: ( LC | UC | UNDERSCORE | DIGIT )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0 >= '0' && LA11_0 <= '9')||(LA11_0 >= 'A' && LA11_0 <= 'Z')||LA11_0=='_'||(LA11_0 >= 'a' && LA11_0 <= 'z')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "USWORD"

    // $ANTLR start "ML_COMMENT"
    public final void mML_COMMENT() throws RecognitionException {
        try {
            int _type = ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:318:4: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:318:8: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 



            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:318:13: ( options {greedy=false; } : . )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0=='*') ) {
                    int LA12_1 = input.LA(2);

                    if ( (LA12_1=='/') ) {
                        alt12=2;
                    }
                    else if ( ((LA12_1 >= '\u0000' && LA12_1 <= '.')||(LA12_1 >= '0' && LA12_1 <= '\uFFFF')) ) {
                        alt12=1;
                    }


                }
                else if ( ((LA12_0 >= '\u0000' && LA12_0 <= ')')||(LA12_0 >= '+' && LA12_0 <= '\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:318:40: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            match("*/"); 



            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ML_COMMENT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:321:4: ( ( '\\t' | ' ' | '\\u000C' )+ )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:321:6: ( '\\t' | ' ' | '\\u000C' )+
            {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:321:6: ( '\\t' | ' ' | '\\u000C' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0=='\t'||LA13_0=='\f'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)=='\f'||input.LA(1)==' ' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


             _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:323:16: ( '0' .. '9' )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "STRING1"
    public final void mSTRING1() throws RecognitionException {
        try {
            int _type = STRING1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:325:9: ( '\\'' ( CLEAN_STRING )* ( STRING2 ( CLEAN_STRING )* )* '\\'' )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:325:11: '\\'' ( CLEAN_STRING )* ( STRING2 ( CLEAN_STRING )* )* '\\''
            {
            match('\''); 

            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:325:16: ( CLEAN_STRING )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0 >= '\u0000' && LA14_0 <= '!')||(LA14_0 >= '#' && LA14_0 <= '&')||(LA14_0 >= '(' && LA14_0 <= '\uFFFF')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:325:16: CLEAN_STRING
            	    {
            	    mCLEAN_STRING(); 


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:325:30: ( STRING2 ( CLEAN_STRING )* )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0=='\"') ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:325:31: STRING2 ( CLEAN_STRING )*
            	    {
            	    mSTRING2(); 


            	    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:325:39: ( CLEAN_STRING )*
            	    loop15:
            	    do {
            	        int alt15=2;
            	        int LA15_0 = input.LA(1);

            	        if ( ((LA15_0 >= '\u0000' && LA15_0 <= '!')||(LA15_0 >= '#' && LA15_0 <= '&')||(LA15_0 >= '(' && LA15_0 <= '\uFFFF')) ) {
            	            alt15=1;
            	        }


            	        switch (alt15) {
            	    	case 1 :
            	    	    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:325:39: CLEAN_STRING
            	    	    {
            	    	    mCLEAN_STRING(); 


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop15;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING1"

    // $ANTLR start "STRING2"
    public final void mSTRING2() throws RecognitionException {
        try {
            int _type = STRING2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:327:9: ( '\"' ( CLEAN_STRING )* ( STRING1 ( CLEAN_STRING )* )* '\"' )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:327:11: '\"' ( CLEAN_STRING )* ( STRING1 ( CLEAN_STRING )* )* '\"'
            {
            match('\"'); 

            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:327:15: ( CLEAN_STRING )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0 >= '\u0000' && LA17_0 <= '!')||(LA17_0 >= '#' && LA17_0 <= '&')||(LA17_0 >= '(' && LA17_0 <= '\uFFFF')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:327:15: CLEAN_STRING
            	    {
            	    mCLEAN_STRING(); 


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:327:29: ( STRING1 ( CLEAN_STRING )* )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0=='\'') ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:327:30: STRING1 ( CLEAN_STRING )*
            	    {
            	    mSTRING1(); 


            	    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:327:38: ( CLEAN_STRING )*
            	    loop18:
            	    do {
            	        int alt18=2;
            	        int LA18_0 = input.LA(1);

            	        if ( ((LA18_0 >= '\u0000' && LA18_0 <= '!')||(LA18_0 >= '#' && LA18_0 <= '&')||(LA18_0 >= '(' && LA18_0 <= '\uFFFF')) ) {
            	            alt18=1;
            	        }


            	        switch (alt18) {
            	    	case 1 :
            	    	    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:327:38: CLEAN_STRING
            	    	    {
            	    	    mCLEAN_STRING(); 


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop18;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING2"

    // $ANTLR start "CLEAN_STRING"
    public final void mCLEAN_STRING() throws RecognitionException {
        try {
            int _type = CLEAN_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:330:2: (~ ( '\\'' | '\\\"' ) | CHAR_ESC )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='\\') ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1=='\"'||LA20_1=='\''||LA20_1=='\\'||LA20_1=='b'||LA20_1=='f'||LA20_1=='n'||LA20_1=='r'||LA20_1=='t') ) {
                    alt20=2;
                }
                else {
                    alt20=1;
                }
            }
            else if ( ((LA20_0 >= '\u0000' && LA20_0 <= '!')||(LA20_0 >= '#' && LA20_0 <= '&')||(LA20_0 >= '(' && LA20_0 <= '[')||(LA20_0 >= ']' && LA20_0 <= '\uFFFF')) ) {
                alt20=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }
            switch (alt20) {
                case 1 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:330:4: ~ ( '\\'' | '\\\"' )
                    {
                    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '\uFFFF') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 2 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:330:19: CHAR_ESC
                    {
                    mCHAR_ESC(); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CLEAN_STRING"

    // $ANTLR start "CHAR_ESC"
    public final void mCHAR_ESC() throws RecognitionException {
        Character ret = null;


        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:332:42: ( '\\\\' ( 'n' | 'r' | 't' | 'b' | 'f' | '\\\"' | '\\'' | '\\\\' ) )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:333:5: '\\\\' ( 'n' | 'r' | 't' | 'b' | 'f' | '\\\"' | '\\'' | '\\\\' )
            {
            match('\\'); 

            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:334:5: ( 'n' | 'r' | 't' | 'b' | 'f' | '\\\"' | '\\'' | '\\\\' )
            int alt21=8;
            switch ( input.LA(1) ) {
            case 'n':
                {
                alt21=1;
                }
                break;
            case 'r':
                {
                alt21=2;
                }
                break;
            case 't':
                {
                alt21=3;
                }
                break;
            case 'b':
                {
                alt21=4;
                }
                break;
            case 'f':
                {
                alt21=5;
                }
                break;
            case '\"':
                {
                alt21=6;
                }
                break;
            case '\'':
                {
                alt21=7;
                }
                break;
            case '\\':
                {
                alt21=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }

            switch (alt21) {
                case 1 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:334:7: 'n'
                    {
                    match('n'); 

                     ret ='\n'; 

                    }
                    break;
                case 2 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:335:7: 'r'
                    {
                    match('r'); 

                     ret ='\r'; 

                    }
                    break;
                case 3 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:336:7: 't'
                    {
                    match('t'); 

                     ret ='\t'; 

                    }
                    break;
                case 4 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:337:7: 'b'
                    {
                    match('b'); 

                     ret ='\b'; 

                    }
                    break;
                case 5 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:338:7: 'f'
                    {
                    match('f'); 

                     ret ='\f'; 

                    }
                    break;
                case 6 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:339:7: '\\\"'
                    {
                    match('\"'); 

                     ret ='\"'; 

                    }
                    break;
                case 7 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:340:7: '\\''
                    {
                    match('\''); 

                     ret ='\''; 

                    }
                    break;
                case 8 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:341:7: '\\\\'
                    {
                    match('\\'); 

                     ret ='\\'; 

                    }
                    break;

            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHAR_ESC"

    public void mTokens() throws RecognitionException {
        // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:1:8: ( BAR | BRA | CLOSE | COMMA | CUT | DIV | DOT | EQUAL | GE | GT | IF | KET | LE | LT | MINUS | MULT | NOT_EQUAL1 | NOT_EQUAL2 | OPEN | PLUS | REM | T__71 | T__72 | T__73 | T__74 | T__75 | EXPONENT | LONG_LITERAL | INT_LITERAL | NEWLINE | LCWORD | DOLLARWORD | UCWORD | USWORD | ML_COMMENT | WS | STRING1 | STRING2 | CLEAN_STRING )
        int alt22=39;
        alt22 = dfa22.predict(input);
        switch (alt22) {
            case 1 :
                // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:1:10: BAR
                {
                mBAR(); 


                }
                break;
            case 2 :
                // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:1:14: BRA
                {
                mBRA(); 


                }
                break;
            case 3 :
                // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:1:18: CLOSE
                {
                mCLOSE(); 


                }
                break;
            case 4 :
                // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:1:24: COMMA
                {
                mCOMMA(); 


                }
                break;
            case 5 :
                // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:1:30: CUT
                {
                mCUT(); 


                }
                break;
            case 6 :
                // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:1:34: DIV
                {
                mDIV(); 


                }
                break;
            case 7 :
                // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:1:38: DOT
                {
                mDOT(); 


                }
                break;
            case 8 :
                // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:1:42: EQUAL
                {
                mEQUAL(); 


                }
                break;
            case 9 :
                // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:1:48: GE
                {
                mGE(); 


                }
                break;
            case 10 :
                // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:1:51: GT
                {
                mGT(); 


                }
                break;
            case 11 :
                // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:1:54: IF
                {
                mIF(); 


                }
                break;
            case 12 :
                // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:1:57: KET
                {
                mKET(); 


                }
                break;
            case 13 :
                // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:1:61: LE
                {
                mLE(); 


                }
                break;
            case 14 :
                // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:1:64: LT
                {
                mLT(); 


                }
                break;
            case 15 :
                // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:1:67: MINUS
                {
                mMINUS(); 


                }
                break;
            case 16 :
                // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:1:73: MULT
                {
                mMULT(); 


                }
                break;
            case 17 :
                // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:1:78: NOT_EQUAL1
                {
                mNOT_EQUAL1(); 


                }
                break;
            case 18 :
                // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:1:89: NOT_EQUAL2
                {
                mNOT_EQUAL2(); 


                }
                break;
            case 19 :
                // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:1:100: OPEN
                {
                mOPEN(); 


                }
                break;
            case 20 :
                // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:1:105: PLUS
                {
                mPLUS(); 


                }
                break;
            case 21 :
                // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:1:110: REM
                {
                mREM(); 


                }
                break;
            case 22 :
                // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:1:114: T__71
                {
                mT__71(); 


                }
                break;
            case 23 :
                // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:1:120: T__72
                {
                mT__72(); 


                }
                break;
            case 24 :
                // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:1:126: T__73
                {
                mT__73(); 


                }
                break;
            case 25 :
                // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:1:132: T__74
                {
                mT__74(); 


                }
                break;
            case 26 :
                // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:1:138: T__75
                {
                mT__75(); 


                }
                break;
            case 27 :
                // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:1:144: EXPONENT
                {
                mEXPONENT(); 


                }
                break;
            case 28 :
                // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:1:153: LONG_LITERAL
                {
                mLONG_LITERAL(); 


                }
                break;
            case 29 :
                // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:1:166: INT_LITERAL
                {
                mINT_LITERAL(); 


                }
                break;
            case 30 :
                // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:1:178: NEWLINE
                {
                mNEWLINE(); 


                }
                break;
            case 31 :
                // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:1:186: LCWORD
                {
                mLCWORD(); 


                }
                break;
            case 32 :
                // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:1:193: DOLLARWORD
                {
                mDOLLARWORD(); 


                }
                break;
            case 33 :
                // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:1:204: UCWORD
                {
                mUCWORD(); 


                }
                break;
            case 34 :
                // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:1:211: USWORD
                {
                mUSWORD(); 


                }
                break;
            case 35 :
                // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:1:218: ML_COMMENT
                {
                mML_COMMENT(); 


                }
                break;
            case 36 :
                // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:1:229: WS
                {
                mWS(); 


                }
                break;
            case 37 :
                // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:1:232: STRING1
                {
                mSTRING1(); 


                }
                break;
            case 38 :
                // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:1:240: STRING2
                {
                mSTRING2(); 


                }
                break;
            case 39 :
                // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:1:248: CLEAN_STRING
                {
                mCLEAN_STRING(); 


                }
                break;

        }

    }


    protected DFA22 dfa22 = new DFA22(this);
    static final String DFA22_eotS =
        "\1\32\4\uffff\1\50\1\52\2\uffff\1\56\1\60\1\uffff\1\64\1\66\3\uffff"+
        "\1\73\3\uffff\1\73\1\103\1\uffff\1\42\41\uffff\1\73\5\uffff\1\77"+
        "\1\uffff\1\103\5\uffff\1\111\1\uffff";
    static final String DFA22_eofS =
        "\112\uffff";
    static final String DFA22_minS =
        "\1\0\4\uffff\1\75\1\52\2\uffff\1\75\1\55\1\uffff\1\75\1\76\3\uffff"+
        "\1\157\3\uffff\1\55\1\60\1\uffff\1\12\41\uffff\1\144\5\uffff\1\60"+
        "\1\uffff\1\60\5\uffff\1\60\1\uffff";
    static final String DFA22_maxS =
        "\1\uffff\4\uffff\1\75\1\52\2\uffff\1\75\1\55\1\uffff\2\76\3\uffff"+
        "\1\157\3\uffff\1\71\1\114\1\uffff\1\12\41\uffff\1\144\5\uffff\1"+
        "\172\1\uffff\1\114\5\uffff\1\172\1\uffff";
    static final String DFA22_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\2\uffff\1\7\1\10\2\uffff\1\14\2\uffff\1"+
        "\20\1\23\1\24\1\uffff\1\30\1\31\1\32\2\uffff\1\36\1\uffff\2\36\1"+
        "\37\1\40\1\41\1\42\1\44\1\45\1\46\1\47\1\1\1\2\1\3\1\4\1\22\1\5"+
        "\1\43\1\6\1\7\1\10\1\11\1\12\1\13\1\27\1\14\1\15\1\21\1\16\1\26"+
        "\1\17\1\20\1\23\1\24\1\uffff\1\37\1\30\1\31\1\32\1\33\1\uffff\1"+
        "\34\1\uffff\1\35\1\40\1\41\1\42\1\44\1\uffff\1\25";
    static final String DFA22_specialS =
        "\1\0\111\uffff}>";
    static final String[] DFA22_transitionS = {
            "\11\42\1\37\1\31\1\42\1\37\1\30\22\42\1\37\1\5\1\41\1\42\1\34"+
            "\1\27\1\42\1\40\1\17\1\3\1\16\1\20\1\4\1\15\1\7\1\6\12\26\1"+
            "\12\1\42\1\14\1\10\1\11\1\42\1\22\32\35\1\2\1\42\1\13\1\42\1"+
            "\36\1\42\4\33\1\25\7\33\1\21\15\33\1\23\1\1\1\24\uff82\42",
            "",
            "",
            "",
            "",
            "\1\47",
            "\1\51",
            "",
            "",
            "\1\55",
            "\1\57",
            "",
            "\1\62\1\63",
            "\1\65",
            "",
            "",
            "",
            "\1\72",
            "",
            "",
            "",
            "\1\77\2\uffff\12\100",
            "\12\102\22\uffff\1\101",
            "",
            "\1\32",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\110",
            "",
            "",
            "",
            "",
            "",
            "\12\100\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "\12\102\22\uffff\1\101",
            "",
            "",
            "",
            "",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            ""
    };

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( BAR | BRA | CLOSE | COMMA | CUT | DIV | DOT | EQUAL | GE | GT | IF | KET | LE | LT | MINUS | MULT | NOT_EQUAL1 | NOT_EQUAL2 | OPEN | PLUS | REM | T__71 | T__72 | T__73 | T__74 | T__75 | EXPONENT | LONG_LITERAL | INT_LITERAL | NEWLINE | LCWORD | DOLLARWORD | UCWORD | USWORD | ML_COMMENT | WS | STRING1 | STRING2 | CLEAN_STRING );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA22_0 = input.LA(1);

                        s = -1;
                        if ( (LA22_0=='|') ) {s = 1;}

                        else if ( (LA22_0=='[') ) {s = 2;}

                        else if ( (LA22_0==')') ) {s = 3;}

                        else if ( (LA22_0==',') ) {s = 4;}

                        else if ( (LA22_0=='!') ) {s = 5;}

                        else if ( (LA22_0=='/') ) {s = 6;}

                        else if ( (LA22_0=='.') ) {s = 7;}

                        else if ( (LA22_0=='=') ) {s = 8;}

                        else if ( (LA22_0=='>') ) {s = 9;}

                        else if ( (LA22_0==':') ) {s = 10;}

                        else if ( (LA22_0==']') ) {s = 11;}

                        else if ( (LA22_0=='<') ) {s = 12;}

                        else if ( (LA22_0=='-') ) {s = 13;}

                        else if ( (LA22_0=='*') ) {s = 14;}

                        else if ( (LA22_0=='(') ) {s = 15;}

                        else if ( (LA22_0=='+') ) {s = 16;}

                        else if ( (LA22_0=='m') ) {s = 17;}

                        else if ( (LA22_0=='@') ) {s = 18;}

                        else if ( (LA22_0=='{') ) {s = 19;}

                        else if ( (LA22_0=='}') ) {s = 20;}

                        else if ( (LA22_0=='e') ) {s = 21;}

                        else if ( ((LA22_0 >= '0' && LA22_0 <= '9')) ) {s = 22;}

                        else if ( (LA22_0=='%') ) {s = 23;}

                        else if ( (LA22_0=='\r') ) {s = 24;}

                        else if ( (LA22_0=='\n') ) {s = 25;}

                        else if ( ((LA22_0 >= 'a' && LA22_0 <= 'd')||(LA22_0 >= 'f' && LA22_0 <= 'l')||(LA22_0 >= 'n' && LA22_0 <= 'z')) ) {s = 27;}

                        else if ( (LA22_0=='$') ) {s = 28;}

                        else if ( ((LA22_0 >= 'A' && LA22_0 <= 'Z')) ) {s = 29;}

                        else if ( (LA22_0=='_') ) {s = 30;}

                        else if ( (LA22_0=='\t'||LA22_0=='\f'||LA22_0==' ') ) {s = 31;}

                        else if ( (LA22_0=='\'') ) {s = 32;}

                        else if ( (LA22_0=='\"') ) {s = 33;}

                        else if ( ((LA22_0 >= '\u0000' && LA22_0 <= '\b')||LA22_0=='\u000B'||(LA22_0 >= '\u000E' && LA22_0 <= '\u001F')||LA22_0=='#'||LA22_0=='&'||LA22_0==';'||LA22_0=='?'||LA22_0=='\\'||LA22_0=='^'||LA22_0=='`'||(LA22_0 >= '~' && LA22_0 <= '\uFFFF')) ) {s = 34;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 22, _s, input);
            error(nvae);
            throw nvae;
        }

    }
 

}