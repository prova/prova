// $ANTLR 3.3 Nov 30, 2010 12:45:30 C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g 2011-05-21 17:45:29

       package ws.prova.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class Prova2Lexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__72=72;
    public static final int T__73=73;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int DOT=4;
    public static final int PLUS=5;
    public static final int MINUS=6;
    public static final int MULT=7;
    public static final int DIV=8;
    public static final int COMMA=9;
    public static final int IF=10;
    public static final int CUT=11;
    public static final int OPEN=12;
    public static final int CLOSE=13;
    public static final int BAR=14;
    public static final int BRA=15;
    public static final int KET=16;
    public static final int EQUAL=17;
    public static final int NOT_EQUAL1=18;
    public static final int NOT_EQUAL2=19;
    public static final int LT=20;
    public static final int GT=21;
    public static final int LE=22;
    public static final int GE=23;
    public static final int CLAUSE=24;
    public static final int RULEBASE=25;
    public static final int STATEMENT=26;
    public static final int QUERY=27;
    public static final int LITERAL=28;
    public static final int METADATA=29;
    public static final int RELATION=30;
    public static final int SEMANTIC_ATTACHMENT=31;
    public static final int ARITHMETIC_RELATION=32;
    public static final int PREDICATE=33;
    public static final int TERM=34;
    public static final int INSTANCE_JAVA_CALL=35;
    public static final int STATIC_JAVA_CALL=36;
    public static final int LIST_BODY=37;
    public static final int PROVA_LIST=38;
    public static final int ARGS=39;
    public static final int TYPED_VARIABLE=40;
    public static final int USWORD=41;
    public static final int QUALIFIED_JAVA_CLASS=42;
    public static final int ANNOTATION=43;
    public static final int REM=44;
    public static final int DOLLARWORD=45;
    public static final int GUARD=46;
    public static final int ATERM=47;
    public static final int EXPR=48;
    public static final int PROVA_MAP=49;
    public static final int KEY_VALUE=50;
    public static final int FUNCTION=51;
    public static final int FUNCTION_CALL=52;
    public static final int NEWLINE=53;
    public static final int LCWORD=54;
    public static final int UCWORD=55;
    public static final int INT_LITERAL=56;
    public static final int LONG_LITERAL=57;
    public static final int SLCWORD=58;
    public static final int LC=59;
    public static final int STRING1=60;
    public static final int STRING2=61;
    public static final int EXPONENT=62;
    public static final int DIGIT=63;
    public static final int UC=64;
    public static final int WORD=65;
    public static final int DOLLAR=66;
    public static final int UNDERSCORE=67;
    public static final int ML_COMMENT=68;
    public static final int WS=69;
    public static final int CLEAN_STRING=70;
    public static final int CHAR_ESC=71;

    // delegates
    // delegators

    public Prova2Lexer() {;} 
    public Prova2Lexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public Prova2Lexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g"; }

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:7:5: ( '.' )
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:7:7: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:8:6: ( '+' )
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:8:8: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:9:7: ( '-' )
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:9:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "MULT"
    public final void mMULT() throws RecognitionException {
        try {
            int _type = MULT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:10:6: ( '*' )
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:10:8: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MULT"

    // $ANTLR start "DIV"
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:11:5: ( '/' )
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:11:7: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DIV"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:12:7: ( ',' )
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:12:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:13:4: ( ':-' )
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:13:6: ':-'
            {
            match(":-"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "CUT"
    public final void mCUT() throws RecognitionException {
        try {
            int _type = CUT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:14:5: ( '!' )
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:14:7: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CUT"

    // $ANTLR start "OPEN"
    public final void mOPEN() throws RecognitionException {
        try {
            int _type = OPEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:15:6: ( '(' )
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:15:8: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OPEN"

    // $ANTLR start "CLOSE"
    public final void mCLOSE() throws RecognitionException {
        try {
            int _type = CLOSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:16:7: ( ')' )
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:16:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CLOSE"

    // $ANTLR start "BAR"
    public final void mBAR() throws RecognitionException {
        try {
            int _type = BAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:17:5: ( '|' )
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:17:7: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BAR"

    // $ANTLR start "BRA"
    public final void mBRA() throws RecognitionException {
        try {
            int _type = BRA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:18:5: ( '[' )
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:18:7: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BRA"

    // $ANTLR start "KET"
    public final void mKET() throws RecognitionException {
        try {
            int _type = KET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:19:5: ( ']' )
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:19:7: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KET"

    // $ANTLR start "EQUAL"
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:20:7: ( '=' )
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:20:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQUAL"

    // $ANTLR start "NOT_EQUAL1"
    public final void mNOT_EQUAL1() throws RecognitionException {
        try {
            int _type = NOT_EQUAL1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:21:12: ( '<>' )
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:21:14: '<>'
            {
            match("<>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOT_EQUAL1"

    // $ANTLR start "NOT_EQUAL2"
    public final void mNOT_EQUAL2() throws RecognitionException {
        try {
            int _type = NOT_EQUAL2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:22:12: ( '!=' )
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:22:14: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOT_EQUAL2"

    // $ANTLR start "LT"
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:23:4: ( '<' )
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:23:6: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LT"

    // $ANTLR start "GT"
    public final void mGT() throws RecognitionException {
        try {
            int _type = GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:24:4: ( '>' )
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:24:6: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GT"

    // $ANTLR start "LE"
    public final void mLE() throws RecognitionException {
        try {
            int _type = LE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:25:4: ( '<=' )
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:25:6: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LE"

    // $ANTLR start "GE"
    public final void mGE() throws RecognitionException {
        try {
            int _type = GE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:26:4: ( '>=' )
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:26:6: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GE"

    // $ANTLR start "REM"
    public final void mREM() throws RecognitionException {
        try {
            int _type = REM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:27:5: ( 'mod' )
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:27:7: 'mod'
            {
            match("mod"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REM"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:28:7: ( ':' )
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:28:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:29:7: ( '@' )
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:29:9: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:30:7: ( '{' )
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:30:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:31:7: ( '}' )
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:31:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:32:7: ( '->' )
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:32:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "SLCWORD"
    public final void mSLCWORD() throws RecognitionException {
        try {
            int _type = SLCWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:270:9: ( ( LC )+ '^^' (~ ( ' ' | '\\t' | ',' | ')' ) )* )
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:270:11: ( LC )+ '^^' (~ ( ' ' | '\\t' | ',' | ')' ) )*
            {
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:270:11: ( LC )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:270:11: LC
            	    {
            	    mLC(); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            match("^^"); 

            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:270:20: (~ ( ' ' | '\\t' | ',' | ')' ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='\u0000' && LA2_0<='\b')||(LA2_0>='\n' && LA2_0<='\u001F')||(LA2_0>='!' && LA2_0<='(')||(LA2_0>='*' && LA2_0<='+')||(LA2_0>='-' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:270:20: ~ ( ' ' | '\\t' | ',' | ')' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\b')||(input.LA(1)>='\n' && input.LA(1)<='\u001F')||(input.LA(1)>='!' && input.LA(1)<='(')||(input.LA(1)>='*' && input.LA(1)<='+')||(input.LA(1)>='-' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SLCWORD"

    // $ANTLR start "EXPONENT"
    public final void mEXPONENT() throws RecognitionException {
        try {
            int _type = EXPONENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:285:2: ( 'e' ( '-' )? ( DIGIT )+ )
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:285:4: 'e' ( '-' )? ( DIGIT )+
            {
            match('e'); 
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:285:8: ( '-' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='-') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:285:8: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:285:13: ( DIGIT )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:285:13: DIGIT
            	    {
            	    mDIGIT(); 

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
        }
    }
    // $ANTLR end "EXPONENT"

    // $ANTLR start "LONG_LITERAL"
    public final void mLONG_LITERAL() throws RecognitionException {
        try {
            int _type = LONG_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:287:14: ( ( DIGIT )+ 'L' )
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:287:16: ( DIGIT )+ 'L'
            {
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:287:16: ( DIGIT )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:287:16: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            match('L'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LONG_LITERAL"

    // $ANTLR start "INT_LITERAL"
    public final void mINT_LITERAL() throws RecognitionException {
        try {
            int _type = INT_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:289:12: ( ( DIGIT )+ )
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:290:5: ( DIGIT )+
            {
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:290:5: ( DIGIT )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:290:5: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_LITERAL"

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            int _type = NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:293:9: ( ( '%' (~ ( '\\r' | '\\n' ) )* )? ( ( '\\r' )? '\\n' )? )
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:293:11: ( '%' (~ ( '\\r' | '\\n' ) )* )? ( ( '\\r' )? '\\n' )?
            {
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:293:11: ( '%' (~ ( '\\r' | '\\n' ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='%') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:293:12: '%' (~ ( '\\r' | '\\n' ) )*
                    {
                    match('%'); 
                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:293:16: (~ ( '\\r' | '\\n' ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>='\u0000' && LA7_0<='\t')||(LA7_0>='\u000B' && LA7_0<='\f')||(LA7_0>='\u000E' && LA7_0<='\uFFFF')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:293:17: ~ ( '\\r' | '\\n' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:293:35: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:293:36: ( '\\r' )? '\\n'
                    {
                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:293:36: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:293:36: '\\r'
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
        }
    }
    // $ANTLR end "NEWLINE"

    // $ANTLR start "LC"
    public final void mLC() throws RecognitionException {
        try {
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:295:14: ( 'a' .. 'z' )
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:295:16: 'a' .. 'z'
            {
            matchRange('a','z'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "LC"

    // $ANTLR start "UC"
    public final void mUC() throws RecognitionException {
        try {
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:297:14: ( 'A' .. 'Z' )
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:297:16: 'A' .. 'Z'
            {
            matchRange('A','Z'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "UC"

    // $ANTLR start "LCWORD"
    public final void mLCWORD() throws RecognitionException {
        try {
            int _type = LCWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:299:9: ( LC WORD )
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:299:11: LC WORD
            {
            mLC(); 
            mWORD(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LCWORD"

    // $ANTLR start "DOLLARWORD"
    public final void mDOLLARWORD() throws RecognitionException {
        try {
            int _type = DOLLARWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:302:2: ( DOLLAR WORD )
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:302:4: DOLLAR WORD
            {
            mDOLLAR(); 
            mWORD(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOLLARWORD"

    // $ANTLR start "WORD"
    public final void mWORD() throws RecognitionException {
        try {
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:305:2: ( ( LC | UC | UNDERSCORE | DIGIT )* )
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:305:4: ( LC | UC | UNDERSCORE | DIGIT )*
            {
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:305:4: ( LC | UC | UNDERSCORE | DIGIT )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')||(LA11_0>='A' && LA11_0<='Z')||LA11_0=='_'||(LA11_0>='a' && LA11_0<='z')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "WORD"

    // $ANTLR start "UNDERSCORE"
    public final void mUNDERSCORE() throws RecognitionException {
        try {
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:308:2: ( '_' )
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:308:4: '_'
            {
            match('_'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "UNDERSCORE"

    // $ANTLR start "DOLLAR"
    public final void mDOLLAR() throws RecognitionException {
        try {
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:312:2: ( '$' )
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:312:4: '$'
            {
            match('$'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "DOLLAR"

    // $ANTLR start "UCWORD"
    public final void mUCWORD() throws RecognitionException {
        try {
            int _type = UCWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:315:9: ( UC ( LC | UC | UNDERSCORE | ':' | '^' | DIGIT )* )
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:315:11: UC ( LC | UC | UNDERSCORE | ':' | '^' | DIGIT )*
            {
            mUC(); 
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:315:14: ( LC | UC | UNDERSCORE | ':' | '^' | DIGIT )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='0' && LA12_0<=':')||(LA12_0>='A' && LA12_0<='Z')||(LA12_0>='^' && LA12_0<='_')||(LA12_0>='a' && LA12_0<='z')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<=':')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='^' && input.LA(1)<='_')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UCWORD"

    // $ANTLR start "USWORD"
    public final void mUSWORD() throws RecognitionException {
        try {
            int _type = USWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:317:9: ( UNDERSCORE ( LC | UC | UNDERSCORE | DIGIT )* )
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:317:11: UNDERSCORE ( LC | UC | UNDERSCORE | DIGIT )*
            {
            mUNDERSCORE(); 
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:317:22: ( LC | UC | UNDERSCORE | DIGIT )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='0' && LA13_0<='9')||(LA13_0>='A' && LA13_0<='Z')||LA13_0=='_'||(LA13_0>='a' && LA13_0<='z')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "USWORD"

    // $ANTLR start "ML_COMMENT"
    public final void mML_COMMENT() throws RecognitionException {
        try {
            int _type = ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:320:4: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:320:8: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:320:13: ( options {greedy=false; } : . )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0=='*') ) {
                    int LA14_1 = input.LA(2);

                    if ( (LA14_1=='/') ) {
                        alt14=2;
                    }
                    else if ( ((LA14_1>='\u0000' && LA14_1<='.')||(LA14_1>='0' && LA14_1<='\uFFFF')) ) {
                        alt14=1;
                    }


                }
                else if ( ((LA14_0>='\u0000' && LA14_0<=')')||(LA14_0>='+' && LA14_0<='\uFFFF')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:320:40: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            match("*/"); 

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ML_COMMENT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:323:4: ( ( '\\t' | ' ' | '\\u000C' )+ )
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:323:6: ( '\\t' | ' ' | '\\u000C' )+
            {
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:323:6: ( '\\t' | ' ' | '\\u000C' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0=='\t'||LA15_0=='\f'||LA15_0==' ') ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)=='\f'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);

             _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:325:16: ( '0' .. '9' )
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:325:18: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "STRING1"
    public final void mSTRING1() throws RecognitionException {
        try {
            int _type = STRING1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:327:9: ( '\\'' ( CLEAN_STRING )* ( STRING2 ( CLEAN_STRING )* )* '\\'' ( '^^' ( LC WORD ':' )? UCWORD )? )
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:327:11: '\\'' ( CLEAN_STRING )* ( STRING2 ( CLEAN_STRING )* )* '\\'' ( '^^' ( LC WORD ':' )? UCWORD )?
            {
            match('\''); 
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:327:16: ( CLEAN_STRING )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='\u0000' && LA16_0<='!')||(LA16_0>='#' && LA16_0<='&')||(LA16_0>='(' && LA16_0<='\uFFFF')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:327:16: CLEAN_STRING
            	    {
            	    mCLEAN_STRING(); 

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:327:30: ( STRING2 ( CLEAN_STRING )* )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0=='\"') ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:327:31: STRING2 ( CLEAN_STRING )*
            	    {
            	    mSTRING2(); 
            	    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:327:39: ( CLEAN_STRING )*
            	    loop17:
            	    do {
            	        int alt17=2;
            	        int LA17_0 = input.LA(1);

            	        if ( ((LA17_0>='\u0000' && LA17_0<='!')||(LA17_0>='#' && LA17_0<='&')||(LA17_0>='(' && LA17_0<='\uFFFF')) ) {
            	            alt17=1;
            	        }


            	        switch (alt17) {
            	    	case 1 :
            	    	    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:327:39: CLEAN_STRING
            	    	    {
            	    	    mCLEAN_STRING(); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop17;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            match('\''); 
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:327:60: ( '^^' ( LC WORD ':' )? UCWORD )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='^') ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:327:61: '^^' ( LC WORD ':' )? UCWORD
                    {
                    match("^^"); 

                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:327:66: ( LC WORD ':' )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( ((LA19_0>='a' && LA19_0<='z')) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:327:67: LC WORD ':'
                            {
                            mLC(); 
                            mWORD(); 
                            match(':'); 

                            }
                            break;

                    }

                    mUCWORD(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING1"

    // $ANTLR start "STRING2"
    public final void mSTRING2() throws RecognitionException {
        try {
            int _type = STRING2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:329:9: ( '\"' ( CLEAN_STRING )* ( STRING1 ( CLEAN_STRING )* )* '\"' ( '^^' ( LC WORD ':' )? UCWORD )? )
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:329:11: '\"' ( CLEAN_STRING )* ( STRING1 ( CLEAN_STRING )* )* '\"' ( '^^' ( LC WORD ':' )? UCWORD )?
            {
            match('\"'); 
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:329:15: ( CLEAN_STRING )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>='\u0000' && LA21_0<='!')||(LA21_0>='#' && LA21_0<='&')||(LA21_0>='(' && LA21_0<='\uFFFF')) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:329:15: CLEAN_STRING
            	    {
            	    mCLEAN_STRING(); 

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:329:29: ( STRING1 ( CLEAN_STRING )* )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0=='\'') ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:329:30: STRING1 ( CLEAN_STRING )*
            	    {
            	    mSTRING1(); 
            	    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:329:38: ( CLEAN_STRING )*
            	    loop22:
            	    do {
            	        int alt22=2;
            	        int LA22_0 = input.LA(1);

            	        if ( ((LA22_0>='\u0000' && LA22_0<='!')||(LA22_0>='#' && LA22_0<='&')||(LA22_0>='(' && LA22_0<='\uFFFF')) ) {
            	            alt22=1;
            	        }


            	        switch (alt22) {
            	    	case 1 :
            	    	    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:329:38: CLEAN_STRING
            	    	    {
            	    	    mCLEAN_STRING(); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop22;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            match('\"'); 
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:329:58: ( '^^' ( LC WORD ':' )? UCWORD )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0=='^') ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:329:59: '^^' ( LC WORD ':' )? UCWORD
                    {
                    match("^^"); 

                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:329:64: ( LC WORD ':' )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( ((LA24_0>='a' && LA24_0<='z')) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:329:65: LC WORD ':'
                            {
                            mLC(); 
                            mWORD(); 
                            match(':'); 

                            }
                            break;

                    }

                    mUCWORD(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING2"

    // $ANTLR start "CLEAN_STRING"
    public final void mCLEAN_STRING() throws RecognitionException {
        try {
            int _type = CLEAN_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:332:2: (~ ( '\\'' | '\\\"' ) | CHAR_ESC )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0=='\\') ) {
                int LA26_1 = input.LA(2);

                if ( (LA26_1=='\"'||LA26_1=='\''||LA26_1=='\\'||LA26_1=='b'||LA26_1=='f'||LA26_1=='n'||LA26_1=='r'||LA26_1=='t') ) {
                    alt26=2;
                }
                else {
                    alt26=1;}
            }
            else if ( ((LA26_0>='\u0000' && LA26_0<='!')||(LA26_0>='#' && LA26_0<='&')||(LA26_0>='(' && LA26_0<='[')||(LA26_0>=']' && LA26_0<='\uFFFF')) ) {
                alt26=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:332:4: ~ ( '\\'' | '\\\"' )
                    {
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='\uFFFF') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:332:19: CHAR_ESC
                    {
                    mCHAR_ESC(); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CLEAN_STRING"

    // $ANTLR start "CHAR_ESC"
    public final void mCHAR_ESC() throws RecognitionException {
        Character ret = null;

        try {
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:334:42: ( '\\\\' ( 'n' | 'r' | 't' | 'b' | 'f' | '\\\"' | '\\'' | '\\\\' ) )
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:335:5: '\\\\' ( 'n' | 'r' | 't' | 'b' | 'f' | '\\\"' | '\\'' | '\\\\' )
            {
            match('\\'); 
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:336:5: ( 'n' | 'r' | 't' | 'b' | 'f' | '\\\"' | '\\'' | '\\\\' )
            int alt27=8;
            switch ( input.LA(1) ) {
            case 'n':
                {
                alt27=1;
                }
                break;
            case 'r':
                {
                alt27=2;
                }
                break;
            case 't':
                {
                alt27=3;
                }
                break;
            case 'b':
                {
                alt27=4;
                }
                break;
            case 'f':
                {
                alt27=5;
                }
                break;
            case '\"':
                {
                alt27=6;
                }
                break;
            case '\'':
                {
                alt27=7;
                }
                break;
            case '\\':
                {
                alt27=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:336:7: 'n'
                    {
                    match('n'); 
                     ret ='\n'; 

                    }
                    break;
                case 2 :
                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:337:7: 'r'
                    {
                    match('r'); 
                     ret ='\r'; 

                    }
                    break;
                case 3 :
                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:338:7: 't'
                    {
                    match('t'); 
                     ret ='\t'; 

                    }
                    break;
                case 4 :
                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:339:7: 'b'
                    {
                    match('b'); 
                     ret ='\b'; 

                    }
                    break;
                case 5 :
                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:340:7: 'f'
                    {
                    match('f'); 
                     ret ='\f'; 

                    }
                    break;
                case 6 :
                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:341:7: '\\\"'
                    {
                    match('\"'); 
                     ret ='\"'; 

                    }
                    break;
                case 7 :
                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:342:7: '\\''
                    {
                    match('\''); 
                     ret ='\''; 

                    }
                    break;
                case 8 :
                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:343:7: '\\\\'
                    {
                    match('\\'); 
                     ret ='\\'; 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "CHAR_ESC"

    public void mTokens() throws RecognitionException {
        // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:1:8: ( DOT | PLUS | MINUS | MULT | DIV | COMMA | IF | CUT | OPEN | CLOSE | BAR | BRA | KET | EQUAL | NOT_EQUAL1 | NOT_EQUAL2 | LT | GT | LE | GE | REM | T__72 | T__73 | T__74 | T__75 | T__76 | SLCWORD | EXPONENT | LONG_LITERAL | INT_LITERAL | NEWLINE | LCWORD | DOLLARWORD | UCWORD | USWORD | ML_COMMENT | WS | STRING1 | STRING2 | CLEAN_STRING )
        int alt28=40;
        alt28 = dfa28.predict(input);
        switch (alt28) {
            case 1 :
                // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:1:10: DOT
                {
                mDOT(); 

                }
                break;
            case 2 :
                // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:1:14: PLUS
                {
                mPLUS(); 

                }
                break;
            case 3 :
                // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:1:19: MINUS
                {
                mMINUS(); 

                }
                break;
            case 4 :
                // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:1:25: MULT
                {
                mMULT(); 

                }
                break;
            case 5 :
                // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:1:30: DIV
                {
                mDIV(); 

                }
                break;
            case 6 :
                // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:1:34: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 7 :
                // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:1:40: IF
                {
                mIF(); 

                }
                break;
            case 8 :
                // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:1:43: CUT
                {
                mCUT(); 

                }
                break;
            case 9 :
                // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:1:47: OPEN
                {
                mOPEN(); 

                }
                break;
            case 10 :
                // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:1:52: CLOSE
                {
                mCLOSE(); 

                }
                break;
            case 11 :
                // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:1:58: BAR
                {
                mBAR(); 

                }
                break;
            case 12 :
                // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:1:62: BRA
                {
                mBRA(); 

                }
                break;
            case 13 :
                // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:1:66: KET
                {
                mKET(); 

                }
                break;
            case 14 :
                // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:1:70: EQUAL
                {
                mEQUAL(); 

                }
                break;
            case 15 :
                // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:1:76: NOT_EQUAL1
                {
                mNOT_EQUAL1(); 

                }
                break;
            case 16 :
                // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:1:87: NOT_EQUAL2
                {
                mNOT_EQUAL2(); 

                }
                break;
            case 17 :
                // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:1:98: LT
                {
                mLT(); 

                }
                break;
            case 18 :
                // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:1:101: GT
                {
                mGT(); 

                }
                break;
            case 19 :
                // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:1:104: LE
                {
                mLE(); 

                }
                break;
            case 20 :
                // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:1:107: GE
                {
                mGE(); 

                }
                break;
            case 21 :
                // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:1:110: REM
                {
                mREM(); 

                }
                break;
            case 22 :
                // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:1:114: T__72
                {
                mT__72(); 

                }
                break;
            case 23 :
                // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:1:120: T__73
                {
                mT__73(); 

                }
                break;
            case 24 :
                // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:1:126: T__74
                {
                mT__74(); 

                }
                break;
            case 25 :
                // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:1:132: T__75
                {
                mT__75(); 

                }
                break;
            case 26 :
                // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:1:138: T__76
                {
                mT__76(); 

                }
                break;
            case 27 :
                // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:1:144: SLCWORD
                {
                mSLCWORD(); 

                }
                break;
            case 28 :
                // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:1:152: EXPONENT
                {
                mEXPONENT(); 

                }
                break;
            case 29 :
                // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:1:161: LONG_LITERAL
                {
                mLONG_LITERAL(); 

                }
                break;
            case 30 :
                // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:1:174: INT_LITERAL
                {
                mINT_LITERAL(); 

                }
                break;
            case 31 :
                // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:1:186: NEWLINE
                {
                mNEWLINE(); 

                }
                break;
            case 32 :
                // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:1:194: LCWORD
                {
                mLCWORD(); 

                }
                break;
            case 33 :
                // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:1:201: DOLLARWORD
                {
                mDOLLARWORD(); 

                }
                break;
            case 34 :
                // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:1:212: UCWORD
                {
                mUCWORD(); 

                }
                break;
            case 35 :
                // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:1:219: USWORD
                {
                mUSWORD(); 

                }
                break;
            case 36 :
                // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:1:226: ML_COMMENT
                {
                mML_COMMENT(); 

                }
                break;
            case 37 :
                // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:1:237: WS
                {
                mWS(); 

                }
                break;
            case 38 :
                // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:1:240: STRING1
                {
                mSTRING1(); 

                }
                break;
            case 39 :
                // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:1:248: STRING2
                {
                mSTRING2(); 

                }
                break;
            case 40 :
                // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:1:256: CLEAN_STRING
                {
                mCLEAN_STRING(); 

                }
                break;

        }

    }


    protected DFA28 dfa28 = new DFA28(this);
    static final String DFA28_eotS =
        "\1\33\2\uffff\1\46\1\uffff\1\51\1\uffff\1\54\1\56\6\uffff\1\67"+
        "\1\71\1\73\3\uffff\2\73\1\103\1\uffff\1\42\40\uffff\1\73\2\uffff"+
        "\1\73\4\uffff\1\101\2\uffff\1\103\4\uffff\1\113\1\uffff";
    static final String DFA28_eofS =
        "\114\uffff";
    static final String DFA28_minS =
        "\1\0\2\uffff\1\76\1\uffff\1\52\1\uffff\1\55\1\75\6\uffff\2\75\1"+
        "\136\3\uffff\1\55\1\136\1\60\1\uffff\1\12\40\uffff\1\136\2\uffff"+
        "\1\136\4\uffff\1\60\2\uffff\1\60\4\uffff\1\60\1\uffff";
    static final String DFA28_maxS =
        "\1\uffff\2\uffff\1\76\1\uffff\1\52\1\uffff\1\55\1\75\6\uffff\1"+
        "\76\1\75\1\172\3\uffff\2\172\1\114\1\uffff\1\12\40\uffff\1\172\2"+
        "\uffff\1\172\4\uffff\1\172\2\uffff\1\114\4\uffff\1\172\1\uffff";
    static final String DFA28_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\4\1\uffff\1\6\2\uffff\1\11\1\12\1\13"+
        "\1\14\1\15\1\16\3\uffff\1\27\1\30\1\31\3\uffff\1\37\1\uffff\2\37"+
        "\1\41\1\42\1\43\1\45\1\46\1\47\1\50\1\1\1\2\1\32\1\3\1\4\1\44\1"+
        "\5\1\6\1\7\1\26\1\20\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\23"+
        "\1\21\1\24\1\22\1\uffff\1\40\1\33\1\uffff\1\27\1\30\1\31\1\34\1"+
        "\uffff\1\36\1\35\1\uffff\1\41\1\42\1\43\1\45\1\uffff\1\25";
    static final String DFA28_specialS =
        "\1\0\113\uffff}>";
    static final String[] DFA28_transitionS = {
            "\11\42\1\37\1\32\1\42\1\37\1\31\22\42\1\37\1\10\1\41\1\42\1"+
            "\34\1\30\1\42\1\40\1\11\1\12\1\4\1\2\1\6\1\3\1\1\1\5\12\27\1"+
            "\7\1\42\1\17\1\16\1\20\1\42\1\22\32\35\1\14\1\42\1\15\1\42\1"+
            "\36\1\42\4\26\1\25\7\26\1\21\15\26\1\23\1\13\1\24\uff82\42",
            "",
            "",
            "\1\45",
            "",
            "\1\50",
            "",
            "\1\53",
            "\1\55",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\66\1\65",
            "\1\70",
            "\1\74\2\uffff\16\75\1\72\13\75",
            "",
            "",
            "",
            "\1\101\2\uffff\12\102\44\uffff\1\74\2\uffff\32\75",
            "\1\74\2\uffff\32\75",
            "\12\105\22\uffff\1\104",
            "",
            "\1\33",
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
            "\1\74\2\uffff\3\75\1\112\26\75",
            "",
            "",
            "\1\74\2\uffff\32\75",
            "",
            "",
            "",
            "",
            "\12\102\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "",
            "\12\105\22\uffff\1\104",
            "",
            "",
            "",
            "",
            "\12\73\7\uffff\32\73\3\uffff\1\74\1\73\1\uffff\32\75",
            ""
    };

    static final short[] DFA28_eot = DFA.unpackEncodedString(DFA28_eotS);
    static final short[] DFA28_eof = DFA.unpackEncodedString(DFA28_eofS);
    static final char[] DFA28_min = DFA.unpackEncodedStringToUnsignedChars(DFA28_minS);
    static final char[] DFA28_max = DFA.unpackEncodedStringToUnsignedChars(DFA28_maxS);
    static final short[] DFA28_accept = DFA.unpackEncodedString(DFA28_acceptS);
    static final short[] DFA28_special = DFA.unpackEncodedString(DFA28_specialS);
    static final short[][] DFA28_transition;

    static {
        int numStates = DFA28_transitionS.length;
        DFA28_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA28_transition[i] = DFA.unpackEncodedString(DFA28_transitionS[i]);
        }
    }

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = DFA28_eot;
            this.eof = DFA28_eof;
            this.min = DFA28_min;
            this.max = DFA28_max;
            this.accept = DFA28_accept;
            this.special = DFA28_special;
            this.transition = DFA28_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( DOT | PLUS | MINUS | MULT | DIV | COMMA | IF | CUT | OPEN | CLOSE | BAR | BRA | KET | EQUAL | NOT_EQUAL1 | NOT_EQUAL2 | LT | GT | LE | GE | REM | T__72 | T__73 | T__74 | T__75 | T__76 | SLCWORD | EXPONENT | LONG_LITERAL | INT_LITERAL | NEWLINE | LCWORD | DOLLARWORD | UCWORD | USWORD | ML_COMMENT | WS | STRING1 | STRING2 | CLEAN_STRING );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA28_0 = input.LA(1);

                        s = -1;
                        if ( (LA28_0=='.') ) {s = 1;}

                        else if ( (LA28_0=='+') ) {s = 2;}

                        else if ( (LA28_0=='-') ) {s = 3;}

                        else if ( (LA28_0=='*') ) {s = 4;}

                        else if ( (LA28_0=='/') ) {s = 5;}

                        else if ( (LA28_0==',') ) {s = 6;}

                        else if ( (LA28_0==':') ) {s = 7;}

                        else if ( (LA28_0=='!') ) {s = 8;}

                        else if ( (LA28_0=='(') ) {s = 9;}

                        else if ( (LA28_0==')') ) {s = 10;}

                        else if ( (LA28_0=='|') ) {s = 11;}

                        else if ( (LA28_0=='[') ) {s = 12;}

                        else if ( (LA28_0==']') ) {s = 13;}

                        else if ( (LA28_0=='=') ) {s = 14;}

                        else if ( (LA28_0=='<') ) {s = 15;}

                        else if ( (LA28_0=='>') ) {s = 16;}

                        else if ( (LA28_0=='m') ) {s = 17;}

                        else if ( (LA28_0=='@') ) {s = 18;}

                        else if ( (LA28_0=='{') ) {s = 19;}

                        else if ( (LA28_0=='}') ) {s = 20;}

                        else if ( (LA28_0=='e') ) {s = 21;}

                        else if ( ((LA28_0>='a' && LA28_0<='d')||(LA28_0>='f' && LA28_0<='l')||(LA28_0>='n' && LA28_0<='z')) ) {s = 22;}

                        else if ( ((LA28_0>='0' && LA28_0<='9')) ) {s = 23;}

                        else if ( (LA28_0=='%') ) {s = 24;}

                        else if ( (LA28_0=='\r') ) {s = 25;}

                        else if ( (LA28_0=='\n') ) {s = 26;}

                        else if ( (LA28_0=='$') ) {s = 28;}

                        else if ( ((LA28_0>='A' && LA28_0<='Z')) ) {s = 29;}

                        else if ( (LA28_0=='_') ) {s = 30;}

                        else if ( (LA28_0=='\t'||LA28_0=='\f'||LA28_0==' ') ) {s = 31;}

                        else if ( (LA28_0=='\'') ) {s = 32;}

                        else if ( (LA28_0=='\"') ) {s = 33;}

                        else if ( ((LA28_0>='\u0000' && LA28_0<='\b')||LA28_0=='\u000B'||(LA28_0>='\u000E' && LA28_0<='\u001F')||LA28_0=='#'||LA28_0=='&'||LA28_0==';'||LA28_0=='?'||LA28_0=='\\'||LA28_0=='^'||LA28_0=='`'||(LA28_0>='~' && LA28_0<='\uFFFF')) ) {s = 34;}

                        else s = 27;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 28, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}