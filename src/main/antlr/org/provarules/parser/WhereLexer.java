// $ANTLR 3.1 C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g 2010-01-02 12:43:29

   package org.provarules.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class WhereLexer extends Lexer {
    public static final int T__20=20;
    public static final int Comparison=6;
    public static final int CHAR=12;
    public static final int T=7;
    public static final int EOF=-1;
    public static final int Identifier=5;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int IN=4;
    public static final int T__18=18;
    public static final int Number=9;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int WhiteSpace=11;
    public static final int String=10;
    public static final int DIGIT=8;

    // delegates
    // delegators

    public WhereLexer() {;} 
    public WhereLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public WhereLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:7:7: ( '(' )
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:7:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:8:7: ( ')' )
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:8:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:9:7: ( 'xor' )
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:9:9: 'xor'
            {
            match("xor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:10:7: ( 'or' )
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:10:9: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:11:7: ( 'and' )
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:11:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:12:7: ( 'not' )
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:12:9: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:13:7: ( 'in' )
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:13:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:14:7: ( ',' )
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:14:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "Number"
    public final void mNumber() throws RecognitionException {
        try {
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:39:8: ( ( DIGIT )+ ( '.' ( DIGIT )+ )? )
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:39:10: ( DIGIT )+ ( '.' ( DIGIT )+ )?
            {
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:39:10: ( DIGIT )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:39:10: DIGIT
            	    {
            	    mDIGIT(); 

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

            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:39:17: ( '.' ( DIGIT )+ )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='.') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:39:18: '.' ( DIGIT )+
                    {
                    match('.'); 
                    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:39:22: ( DIGIT )+
                    int cnt2=0;
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:39:22: DIGIT
                    	    {
                    	    mDIGIT(); 

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
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "Number"

    // $ANTLR start "String"
    public final void mString() throws RecognitionException {
        try {
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:43:2: ( '\\'' (~ ( '\\'' | '\\n' | '\\r' ) )* '\\'' )
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:43:4: '\\'' (~ ( '\\'' | '\\n' | '\\r' ) )* '\\''
            {
            match('\''); 
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:43:9: (~ ( '\\'' | '\\n' | '\\r' ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='\u0000' && LA4_0<='\t')||(LA4_0>='\u000B' && LA4_0<='\f')||(LA4_0>='\u000E' && LA4_0<='&')||(LA4_0>='(' && LA4_0<='\uFFFE')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:43:10: ~ ( '\\'' | '\\n' | '\\r' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            match('\''); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "String"

    // $ANTLR start "T"
    public final void mT() throws RecognitionException {
        try {
            int _type = T;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:45:3: ( String | Number )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='\'') ) {
                alt5=1;
            }
            else if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:45:5: String
                    {
                    mString(); 

                    }
                    break;
                case 2 :
                    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:45:14: Number
                    {
                    mNumber(); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T"

    // $ANTLR start "Comparison"
    public final void mComparison() throws RecognitionException {
        try {
            int _type = Comparison;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:48:4: ( '!=' | '<' | '<=' | '>=' | '>' )
            int alt6=5;
            switch ( input.LA(1) ) {
            case '!':
                {
                alt6=1;
                }
                break;
            case '<':
                {
                int LA6_2 = input.LA(2);

                if ( (LA6_2=='=') ) {
                    alt6=3;
                }
                else {
                    alt6=2;}
                }
                break;
            case '>':
                {
                int LA6_3 = input.LA(2);

                if ( (LA6_3=='=') ) {
                    alt6=4;
                }
                else {
                    alt6=5;}
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:48:6: '!='
                    {
                    match("!="); 


                    }
                    break;
                case 2 :
                    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:48:14: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 3 :
                    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:48:20: '<='
                    {
                    match("<="); 


                    }
                    break;
                case 4 :
                    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:48:27: '>='
                    {
                    match(">="); 


                    }
                    break;
                case 5 :
                    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:48:34: '>'
                    {
                    match('>'); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Comparison"

    // $ANTLR start "WhiteSpace"
    public final void mWhiteSpace() throws RecognitionException {
        try {
            int _type = WhiteSpace;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:51:4: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:51:7: ( ' ' | '\\t' | '\\n' | '\\r' )+
            {
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:51:7: ( ' ' | '\\t' | '\\n' | '\\r' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='\t' && LA7_0<='\n')||LA7_0=='\r'||LA7_0==' ') ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

             skip(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WhiteSpace"

    // $ANTLR start "Identifier"
    public final void mIdentifier() throws RecognitionException {
        try {
            int _type = Identifier;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:54:4: ( CHAR ( CHAR | DIGIT )* )
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:54:7: CHAR ( CHAR | DIGIT )*
            {
            mCHAR(); 
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:54:12: ( CHAR | DIGIT )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')||(LA8_0>='A' && LA8_0<='Z')||LA8_0=='_'||(LA8_0>='a' && LA8_0<='z')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:
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
            	    break loop8;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Identifier"

    // $ANTLR start "CHAR"
    public final void mCHAR() throws RecognitionException {
        try {
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:57:6: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "CHAR"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:60:7: ( '0' .. '9' )
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:60:9: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "DIGIT"

    public void mTokens() throws RecognitionException {
        // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T | Comparison | WhiteSpace | Identifier )
        int alt9=12;
        alt9 = dfa9.predict(input);
        switch (alt9) {
            case 1 :
                // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:1:58: T
                {
                mT(); 

                }
                break;
            case 10 :
                // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:1:60: Comparison
                {
                mComparison(); 

                }
                break;
            case 11 :
                // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:1:71: WhiteSpace
                {
                mWhiteSpace(); 

                }
                break;
            case 12 :
                // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:1:82: Identifier
                {
                mIdentifier(); 

                }
                break;

        }

    }


    protected DFA9 dfa9 = new DFA9(this);
    static final String DFA9_eotS =
        "\3\uffff\5\14\5\uffff\1\14\1\23\2\14\1\26\1\27\1\uffff\1\30\1\31"+
        "\4\uffff";
    static final String DFA9_eofS =
        "\32\uffff";
    static final String DFA9_minS =
        "\1\11\2\uffff\1\157\1\162\1\156\1\157\1\156\5\uffff\1\162\1\60"+
        "\1\144\1\164\2\60\1\uffff\2\60\4\uffff";
    static final String DFA9_maxS =
        "\1\172\2\uffff\1\157\1\162\1\156\1\157\1\156\5\uffff\1\162\1\172"+
        "\1\144\1\164\2\172\1\uffff\2\172\4\uffff";
    static final String DFA9_acceptS =
        "\1\uffff\1\1\1\2\5\uffff\1\10\1\11\1\12\1\13\1\14\6\uffff\1\4\2"+
        "\uffff\1\7\1\3\1\5\1\6";
    static final String DFA9_specialS =
        "\32\uffff}>";
    static final String[] DFA9_transitionS = {
            "\2\13\2\uffff\1\13\22\uffff\1\13\1\12\5\uffff\1\11\1\1\1\2"+
            "\2\uffff\1\10\3\uffff\12\11\2\uffff\1\12\1\uffff\1\12\2\uffff"+
            "\32\14\4\uffff\1\14\1\uffff\1\5\7\14\1\7\4\14\1\6\1\4\10\14"+
            "\1\3\2\14",
            "",
            "",
            "\1\15",
            "\1\16",
            "\1\17",
            "\1\20",
            "\1\21",
            "",
            "",
            "",
            "",
            "",
            "\1\22",
            "\12\14\7\uffff\32\14\4\uffff\1\14\1\uffff\32\14",
            "\1\24",
            "\1\25",
            "\12\14\7\uffff\32\14\4\uffff\1\14\1\uffff\32\14",
            "\12\14\7\uffff\32\14\4\uffff\1\14\1\uffff\32\14",
            "",
            "\12\14\7\uffff\32\14\4\uffff\1\14\1\uffff\32\14",
            "\12\14\7\uffff\32\14\4\uffff\1\14\1\uffff\32\14",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T | Comparison | WhiteSpace | Identifier );";
        }
    }
 

}