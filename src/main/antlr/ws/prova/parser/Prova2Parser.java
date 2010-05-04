// $ANTLR 3.2 Sep 23, 2009 12:02:23 D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g 2010-04-29 09:02:11

       package ws.prova.parser;

	import ws.prova.parser2.ProvaAST;
	import ws.prova.parser2.ProvaErrorReporter;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class Prova2Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "DOT", "PLUS", "MINUS", "MULT", "DIV", "COMMA", "IF", "CUT", "OPEN", "CLOSE", "BAR", "BRA", "KET", "EQUAL", "NOT_EQUAL1", "NOT_EQUAL2", "LT", "GT", "LE", "GE", "CLAUSE", "RULEBASE", "STATEMENT", "QUERY", "LITERAL", "METADATA", "RELATION", "SEMANTIC_ATTACHMENT", "ARITHMETIC_RELATION", "PREDICATE", "TERM", "INSTANCE_JAVA_CALL", "STATIC_JAVA_CALL", "LIST_BODY", "PROVA_LIST", "ARGS", "TYPED_VARIABLE", "USWORD", "QUALIFIED_JAVA_CLASS", "ANNOTATION", "REM", "DOLLARWORD", "GUARD", "ATERM", "EXPR", "PROVA_MAP", "KEY_VALUE", "NEWLINE", "LCWORD", "UCWORD", "INT_LITERAL", "LONG_LITERAL", "STRING1", "STRING2", "EXPONENT", "DIGIT", "LC", "UC", "WORD", "DOLLAR", "UNDERSCORE", "ML_COMMENT", "WS", "CLEAN_STRING", "CHAR_ESC", "'@'", "'{'", "'}'", "'->'", "':'"
    };
    public static final int DOLLAR=63;
    public static final int TERM=34;
    public static final int T__69=69;
    public static final int EXPONENT=58;
    public static final int LT=20;
    public static final int TYPED_VARIABLE=40;
    public static final int RULEBASE=25;
    public static final int ANNOTATION=43;
    public static final int EOF=-1;
    public static final int PREDICATE=33;
    public static final int STATEMENT=26;
    public static final int IF=10;
    public static final int WORD=62;
    public static final int ML_COMMENT=65;
    public static final int EXPR=48;
    public static final int COMMA=9;
    public static final int STRING2=57;
    public static final int STRING1=56;
    public static final int EQUAL=17;
    public static final int ARGS=39;
    public static final int UC=61;
    public static final int PLUS=5;
    public static final int DIGIT=59;
    public static final int CLAUSE=24;
    public static final int DOT=4;
    public static final int PROVA_MAP=49;
    public static final int ATERM=47;
    public static final int DOLLARWORD=45;
    public static final int GE=23;
    public static final int INT_LITERAL=54;
    public static final int SEMANTIC_ATTACHMENT=31;
    public static final int KEY_VALUE=50;
    public static final int CHAR_ESC=68;
    public static final int KET=16;
    public static final int RELATION=30;
    public static final int STATIC_JAVA_CALL=36;
    public static final int UNDERSCORE=64;
    public static final int LITERAL=28;
    public static final int USWORD=41;
    public static final int REM=44;
    public static final int MULT=7;
    public static final int MINUS=6;
    public static final int LONG_LITERAL=55;
    public static final int PROVA_LIST=38;
    public static final int LCWORD=52;
    public static final int CUT=11;
    public static final int OPEN=12;
    public static final int QUALIFIED_JAVA_CLASS=42;
    public static final int WS=66;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int NEWLINE=51;
    public static final int CLOSE=13;
    public static final int T__70=70;
    public static final int UCWORD=53;
    public static final int LIST_BODY=37;
    public static final int CLEAN_STRING=67;
    public static final int LC=60;
    public static final int GT=21;
    public static final int QUERY=27;
    public static final int GUARD=46;
    public static final int ARITHMETIC_RELATION=32;
    public static final int DIV=8;
    public static final int METADATA=29;
    public static final int INSTANCE_JAVA_CALL=35;
    public static final int T__73=73;
    public static final int BAR=14;
    public static final int BRA=15;
    public static final int LE=22;
    public static final int NOT_EQUAL2=19;
    public static final int NOT_EQUAL1=18;

    // delegates
    // delegators


        public Prova2Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public Prova2Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return Prova2Parser.tokenNames; }
    public String getGrammarFileName() { return "D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g"; }


        private ProvaErrorReporter errorReporter = null;

        public void setErrorReporter(ProvaErrorReporter errorReporter) {
            this.errorReporter = errorReporter;
        }

        public void emitErrorMessage(String msg) {
            errorReporter.reportError(msg);
        }



    public static class rulebase_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rulebase"
    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:86:1: rulebase : ( statement )* ( NEWLINE )* EOF -> ^( RULEBASE ( statement )* ) ;
    public final Prova2Parser.rulebase_return rulebase() throws RecognitionException {
        Prova2Parser.rulebase_return retval = new Prova2Parser.rulebase_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token NEWLINE2=null;
        Token EOF3=null;
        Prova2Parser.statement_return statement1 = null;


        ProvaAST NEWLINE2_tree=null;
        ProvaAST EOF3_tree=null;
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:87:2: ( ( statement )* ( NEWLINE )* EOF -> ^( RULEBASE ( statement )* ) )
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:87:4: ( statement )* ( NEWLINE )* EOF
            {
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:87:4: ( statement )*
            loop1:
            do {
                int alt1=2;
                alt1 = dfa1.predict(input);
                switch (alt1) {
            	case 1 :
            	    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:87:4: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_rulebase335);
            	    statement1=statement();

            	    state._fsp--;

            	    stream_statement.add(statement1.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:87:15: ( NEWLINE )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==NEWLINE) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:87:15: NEWLINE
            	    {
            	    NEWLINE2=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_rulebase338);  
            	    stream_NEWLINE.add(NEWLINE2);


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            EOF3=(Token)match(input,EOF,FOLLOW_EOF_in_rulebase341);  
            stream_EOF.add(EOF3);



            // AST REWRITE
            // elements: statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ProvaAST)adaptor.nil();
            // 87:27: -> ^( RULEBASE ( statement )* )
            {
                // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:87:30: ^( RULEBASE ( statement )* )
                {
                ProvaAST root_1 = (ProvaAST)adaptor.nil();
                root_1 = (ProvaAST)adaptor.becomeRoot((ProvaAST)adaptor.create(RULEBASE, "RULEBASE"), root_1);

                // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:87:41: ( statement )*
                while ( stream_statement.hasNext() ) {
                    adaptor.addChild(root_1, stream_statement.nextTree());

                }
                stream_statement.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (ProvaAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ProvaAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "rulebase"

    public static class statement_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:89:1: statement : ( NEWLINE )* stat end_of_statement -> ^( STATEMENT stat ) ;
    public final Prova2Parser.statement_return statement() throws RecognitionException {
        Prova2Parser.statement_return retval = new Prova2Parser.statement_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token NEWLINE4=null;
        Prova2Parser.stat_return stat5 = null;

        Prova2Parser.end_of_statement_return end_of_statement6 = null;


        ProvaAST NEWLINE4_tree=null;
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleSubtreeStream stream_end_of_statement=new RewriteRuleSubtreeStream(adaptor,"rule end_of_statement");
        RewriteRuleSubtreeStream stream_stat=new RewriteRuleSubtreeStream(adaptor,"rule stat");
        try {
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:90:2: ( ( NEWLINE )* stat end_of_statement -> ^( STATEMENT stat ) )
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:90:4: ( NEWLINE )* stat end_of_statement
            {
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:90:4: ( NEWLINE )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==NEWLINE) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:90:4: NEWLINE
            	    {
            	    NEWLINE4=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_statement359);  
            	    stream_NEWLINE.add(NEWLINE4);


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            pushFollow(FOLLOW_stat_in_statement362);
            stat5=stat();

            state._fsp--;

            stream_stat.add(stat5.getTree());
            pushFollow(FOLLOW_end_of_statement_in_statement364);
            end_of_statement6=end_of_statement();

            state._fsp--;

            stream_end_of_statement.add(end_of_statement6.getTree());


            // AST REWRITE
            // elements: stat
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ProvaAST)adaptor.nil();
            // 90:35: -> ^( STATEMENT stat )
            {
                // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:90:38: ^( STATEMENT stat )
                {
                ProvaAST root_1 = (ProvaAST)adaptor.nil();
                root_1 = (ProvaAST)adaptor.becomeRoot((ProvaAST)adaptor.create(STATEMENT, "STATEMENT"), root_1);

                adaptor.addChild(root_1, stream_stat.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (ProvaAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ProvaAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "statement"

    public static class end_of_statement_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "end_of_statement"
    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:92:1: end_of_statement : ( NEWLINE )* DOT ( NEWLINE | EOF ) ;
    public final Prova2Parser.end_of_statement_return end_of_statement() throws RecognitionException {
        Prova2Parser.end_of_statement_return retval = new Prova2Parser.end_of_statement_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token NEWLINE7=null;
        Token DOT8=null;
        Token set9=null;

        ProvaAST NEWLINE7_tree=null;
        ProvaAST DOT8_tree=null;
        ProvaAST set9_tree=null;

        try {
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:93:2: ( ( NEWLINE )* DOT ( NEWLINE | EOF ) )
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:93:4: ( NEWLINE )* DOT ( NEWLINE | EOF )
            {
            root_0 = (ProvaAST)adaptor.nil();

            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:93:4: ( NEWLINE )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==NEWLINE) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:93:4: NEWLINE
            	    {
            	    NEWLINE7=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_end_of_statement381); 
            	    NEWLINE7_tree = (ProvaAST)adaptor.create(NEWLINE7);
            	    adaptor.addChild(root_0, NEWLINE7_tree);


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            DOT8=(Token)match(input,DOT,FOLLOW_DOT_in_end_of_statement384); 
            DOT8_tree = (ProvaAST)adaptor.create(DOT8);
            adaptor.addChild(root_0, DOT8_tree);

            set9=(Token)input.LT(1);
            if ( input.LA(1)==EOF||input.LA(1)==NEWLINE ) {
                input.consume();
                adaptor.addChild(root_0, (ProvaAST)adaptor.create(set9));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (ProvaAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ProvaAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "end_of_statement"

    public static class stat_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "stat"
    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:95:1: stat : ( clause | query );
    public final Prova2Parser.stat_return stat() throws RecognitionException {
        Prova2Parser.stat_return retval = new Prova2Parser.stat_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Prova2Parser.clause_return clause10 = null;

        Prova2Parser.query_return query11 = null;



        try {
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:95:7: ( clause | query )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=LCWORD && LA5_0<=UCWORD)||(LA5_0>=STRING1 && LA5_0<=STRING2)||LA5_0==69) ) {
                alt5=1;
            }
            else if ( (LA5_0==IF) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:95:9: clause
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_clause_in_stat403);
                    clause10=clause();

                    state._fsp--;

                    adaptor.addChild(root_0, clause10.getTree());

                    }
                    break;
                case 2 :
                    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:96:5: query
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_query_in_stat409);
                    query11=query();

                    state._fsp--;

                    adaptor.addChild(root_0, query11.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (ProvaAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ProvaAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "stat"

    public static class query_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "query"
    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:98:1: query : IF ( NEWLINE )* query_predicate ( NEWLINE )* '(' ( NEWLINE )* relation ( NEWLINE )* ')' -> ^( QUERY query_predicate relation ) ;
    public final Prova2Parser.query_return query() throws RecognitionException {
        Prova2Parser.query_return retval = new Prova2Parser.query_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token IF12=null;
        Token NEWLINE13=null;
        Token NEWLINE15=null;
        Token char_literal16=null;
        Token NEWLINE17=null;
        Token NEWLINE19=null;
        Token char_literal20=null;
        Prova2Parser.query_predicate_return query_predicate14 = null;

        Prova2Parser.relation_return relation18 = null;


        ProvaAST IF12_tree=null;
        ProvaAST NEWLINE13_tree=null;
        ProvaAST NEWLINE15_tree=null;
        ProvaAST char_literal16_tree=null;
        ProvaAST NEWLINE17_tree=null;
        ProvaAST NEWLINE19_tree=null;
        ProvaAST char_literal20_tree=null;
        RewriteRuleTokenStream stream_OPEN=new RewriteRuleTokenStream(adaptor,"token OPEN");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_CLOSE=new RewriteRuleTokenStream(adaptor,"token CLOSE");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_query_predicate=new RewriteRuleSubtreeStream(adaptor,"rule query_predicate");
        RewriteRuleSubtreeStream stream_relation=new RewriteRuleSubtreeStream(adaptor,"rule relation");
        try {
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:98:8: ( IF ( NEWLINE )* query_predicate ( NEWLINE )* '(' ( NEWLINE )* relation ( NEWLINE )* ')' -> ^( QUERY query_predicate relation ) )
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:98:10: IF ( NEWLINE )* query_predicate ( NEWLINE )* '(' ( NEWLINE )* relation ( NEWLINE )* ')'
            {
            IF12=(Token)match(input,IF,FOLLOW_IF_in_query418);  
            stream_IF.add(IF12);

            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:98:13: ( NEWLINE )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==NEWLINE) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:98:13: NEWLINE
            	    {
            	    NEWLINE13=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_query420);  
            	    stream_NEWLINE.add(NEWLINE13);


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            pushFollow(FOLLOW_query_predicate_in_query423);
            query_predicate14=query_predicate();

            state._fsp--;

            stream_query_predicate.add(query_predicate14.getTree());
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:98:38: ( NEWLINE )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==NEWLINE) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:98:38: NEWLINE
            	    {
            	    NEWLINE15=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_query425);  
            	    stream_NEWLINE.add(NEWLINE15);


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            char_literal16=(Token)match(input,OPEN,FOLLOW_OPEN_in_query428);  
            stream_OPEN.add(char_literal16);

            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:98:51: ( NEWLINE )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==NEWLINE) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:98:51: NEWLINE
            	    {
            	    NEWLINE17=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_query430);  
            	    stream_NEWLINE.add(NEWLINE17);


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            pushFollow(FOLLOW_relation_in_query433);
            relation18=relation();

            state._fsp--;

            stream_relation.add(relation18.getTree());
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:98:69: ( NEWLINE )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==NEWLINE) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:98:69: NEWLINE
            	    {
            	    NEWLINE19=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_query435);  
            	    stream_NEWLINE.add(NEWLINE19);


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            char_literal20=(Token)match(input,CLOSE,FOLLOW_CLOSE_in_query438);  
            stream_CLOSE.add(char_literal20);



            // AST REWRITE
            // elements: query_predicate, relation
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ProvaAST)adaptor.nil();
            // 98:82: -> ^( QUERY query_predicate relation )
            {
                // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:98:85: ^( QUERY query_predicate relation )
                {
                ProvaAST root_1 = (ProvaAST)adaptor.nil();
                root_1 = (ProvaAST)adaptor.becomeRoot((ProvaAST)adaptor.create(QUERY, "QUERY"), root_1);

                adaptor.addChild(root_1, stream_query_predicate.nextTree());
                adaptor.addChild(root_1, stream_relation.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (ProvaAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ProvaAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "query"

    public static class query_predicate_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "query_predicate"
    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:100:1: query_predicate : constant ;
    public final Prova2Parser.query_predicate_return query_predicate() throws RecognitionException {
        Prova2Parser.query_predicate_return retval = new Prova2Parser.query_predicate_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Prova2Parser.constant_return constant21 = null;



        try {
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:101:2: ( constant )
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:101:4: constant
            {
            root_0 = (ProvaAST)adaptor.nil();

            pushFollow(FOLLOW_constant_in_query_predicate458);
            constant21=constant();

            state._fsp--;

            adaptor.addChild(root_0, constant21.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (ProvaAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ProvaAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "query_predicate"

    public static class clause_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "clause"
    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:103:1: clause : ( metadata )? relation ( IF literals )? -> ^( CLAUSE ( metadata )? relation ( literals )? ) ;
    public final Prova2Parser.clause_return clause() throws RecognitionException {
        Prova2Parser.clause_return retval = new Prova2Parser.clause_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token IF24=null;
        Prova2Parser.metadata_return metadata22 = null;

        Prova2Parser.relation_return relation23 = null;

        Prova2Parser.literals_return literals25 = null;


        ProvaAST IF24_tree=null;
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_literals=new RewriteRuleSubtreeStream(adaptor,"rule literals");
        RewriteRuleSubtreeStream stream_relation=new RewriteRuleSubtreeStream(adaptor,"rule relation");
        RewriteRuleSubtreeStream stream_metadata=new RewriteRuleSubtreeStream(adaptor,"rule metadata");
        try {
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:103:9: ( ( metadata )? relation ( IF literals )? -> ^( CLAUSE ( metadata )? relation ( literals )? ) )
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:103:11: ( metadata )? relation ( IF literals )?
            {
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:103:11: ( metadata )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==69) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:103:11: metadata
                    {
                    pushFollow(FOLLOW_metadata_in_clause467);
                    metadata22=metadata();

                    state._fsp--;

                    stream_metadata.add(metadata22.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_relation_in_clause470);
            relation23=relation();

            state._fsp--;

            stream_relation.add(relation23.getTree());
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:103:30: ( IF literals )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==IF) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:103:31: IF literals
                    {
                    IF24=(Token)match(input,IF,FOLLOW_IF_in_clause473);  
                    stream_IF.add(IF24);

                    pushFollow(FOLLOW_literals_in_clause475);
                    literals25=literals();

                    state._fsp--;

                    stream_literals.add(literals25.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: relation, literals, metadata
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ProvaAST)adaptor.nil();
            // 103:45: -> ^( CLAUSE ( metadata )? relation ( literals )? )
            {
                // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:103:48: ^( CLAUSE ( metadata )? relation ( literals )? )
                {
                ProvaAST root_1 = (ProvaAST)adaptor.nil();
                root_1 = (ProvaAST)adaptor.becomeRoot((ProvaAST)adaptor.create(CLAUSE, "CLAUSE"), root_1);

                // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:103:57: ( metadata )?
                if ( stream_metadata.hasNext() ) {
                    adaptor.addChild(root_1, stream_metadata.nextTree());

                }
                stream_metadata.reset();
                adaptor.addChild(root_1, stream_relation.nextTree());
                // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:103:76: ( literals )?
                if ( stream_literals.hasNext() ) {
                    adaptor.addChild(root_1, stream_literals.nextTree());

                }
                stream_literals.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (ProvaAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ProvaAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "clause"

    public static class metadata_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "metadata"
    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:105:1: metadata : ( annotation ( NEWLINE )* )+ -> ^( METADATA ( annotation )+ ) ;
    public final Prova2Parser.metadata_return metadata() throws RecognitionException {
        Prova2Parser.metadata_return retval = new Prova2Parser.metadata_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token NEWLINE27=null;
        Prova2Parser.annotation_return annotation26 = null;


        ProvaAST NEWLINE27_tree=null;
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleSubtreeStream stream_annotation=new RewriteRuleSubtreeStream(adaptor,"rule annotation");
        try {
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:106:2: ( ( annotation ( NEWLINE )* )+ -> ^( METADATA ( annotation )+ ) )
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:106:4: ( annotation ( NEWLINE )* )+
            {
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:106:4: ( annotation ( NEWLINE )* )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==69) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:106:5: annotation ( NEWLINE )*
            	    {
            	    pushFollow(FOLLOW_annotation_in_metadata501);
            	    annotation26=annotation();

            	    state._fsp--;

            	    stream_annotation.add(annotation26.getTree());
            	    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:106:16: ( NEWLINE )*
            	    loop12:
            	    do {
            	        int alt12=2;
            	        int LA12_0 = input.LA(1);

            	        if ( (LA12_0==NEWLINE) ) {
            	            alt12=1;
            	        }


            	        switch (alt12) {
            	    	case 1 :
            	    	    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:106:16: NEWLINE
            	    	    {
            	    	    NEWLINE27=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_metadata503);  
            	    	    stream_NEWLINE.add(NEWLINE27);


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop12;
            	        }
            	    } while (true);


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



            // AST REWRITE
            // elements: annotation
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ProvaAST)adaptor.nil();
            // 106:27: -> ^( METADATA ( annotation )+ )
            {
                // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:106:30: ^( METADATA ( annotation )+ )
                {
                ProvaAST root_1 = (ProvaAST)adaptor.nil();
                root_1 = (ProvaAST)adaptor.becomeRoot((ProvaAST)adaptor.create(METADATA, "METADATA"), root_1);

                if ( !(stream_annotation.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_annotation.hasNext() ) {
                    adaptor.addChild(root_1, stream_annotation.nextTree());

                }
                stream_annotation.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (ProvaAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ProvaAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "metadata"

    public static class annotation_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "annotation"
    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:109:1: annotation : '@' LCWORD ( '(' value ( COMMA value )* ')' )? -> ^( ANNOTATION LCWORD ( value )* ) ;
    public final Prova2Parser.annotation_return annotation() throws RecognitionException {
        Prova2Parser.annotation_return retval = new Prova2Parser.annotation_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token char_literal28=null;
        Token LCWORD29=null;
        Token char_literal30=null;
        Token COMMA32=null;
        Token char_literal34=null;
        Prova2Parser.value_return value31 = null;

        Prova2Parser.value_return value33 = null;


        ProvaAST char_literal28_tree=null;
        ProvaAST LCWORD29_tree=null;
        ProvaAST char_literal30_tree=null;
        ProvaAST COMMA32_tree=null;
        ProvaAST char_literal34_tree=null;
        RewriteRuleTokenStream stream_OPEN=new RewriteRuleTokenStream(adaptor,"token OPEN");
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_CLOSE=new RewriteRuleTokenStream(adaptor,"token CLOSE");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LCWORD=new RewriteRuleTokenStream(adaptor,"token LCWORD");
        RewriteRuleSubtreeStream stream_value=new RewriteRuleSubtreeStream(adaptor,"rule value");
        try {
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:110:2: ( '@' LCWORD ( '(' value ( COMMA value )* ')' )? -> ^( ANNOTATION LCWORD ( value )* ) )
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:110:4: '@' LCWORD ( '(' value ( COMMA value )* ')' )?
            {
            char_literal28=(Token)match(input,69,FOLLOW_69_in_annotation525);  
            stream_69.add(char_literal28);

            LCWORD29=(Token)match(input,LCWORD,FOLLOW_LCWORD_in_annotation527);  
            stream_LCWORD.add(LCWORD29);

            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:110:15: ( '(' value ( COMMA value )* ')' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==OPEN) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:110:16: '(' value ( COMMA value )* ')'
                    {
                    char_literal30=(Token)match(input,OPEN,FOLLOW_OPEN_in_annotation530);  
                    stream_OPEN.add(char_literal30);

                    pushFollow(FOLLOW_value_in_annotation532);
                    value31=value();

                    state._fsp--;

                    stream_value.add(value31.getTree());
                    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:110:26: ( COMMA value )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==COMMA) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:110:27: COMMA value
                    	    {
                    	    COMMA32=(Token)match(input,COMMA,FOLLOW_COMMA_in_annotation535);  
                    	    stream_COMMA.add(COMMA32);

                    	    pushFollow(FOLLOW_value_in_annotation537);
                    	    value33=value();

                    	    state._fsp--;

                    	    stream_value.add(value33.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    char_literal34=(Token)match(input,CLOSE,FOLLOW_CLOSE_in_annotation541);  
                    stream_CLOSE.add(char_literal34);


                    }
                    break;

            }



            // AST REWRITE
            // elements: LCWORD, value
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ProvaAST)adaptor.nil();
            // 110:47: -> ^( ANNOTATION LCWORD ( value )* )
            {
                // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:110:50: ^( ANNOTATION LCWORD ( value )* )
                {
                ProvaAST root_1 = (ProvaAST)adaptor.nil();
                root_1 = (ProvaAST)adaptor.becomeRoot((ProvaAST)adaptor.create(ANNOTATION, "ANNOTATION"), root_1);

                adaptor.addChild(root_1, stream_LCWORD.nextNode());
                // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:110:70: ( value )*
                while ( stream_value.hasNext() ) {
                    adaptor.addChild(root_1, stream_value.nextTree());

                }
                stream_value.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (ProvaAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ProvaAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "annotation"

    public static class value_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "value"
    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:113:1: value : ( LCWORD | UCWORD | string | number );
    public final Prova2Parser.value_return value() throws RecognitionException {
        Prova2Parser.value_return retval = new Prova2Parser.value_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token LCWORD35=null;
        Token UCWORD36=null;
        Prova2Parser.string_return string37 = null;

        Prova2Parser.number_return number38 = null;


        ProvaAST LCWORD35_tree=null;
        ProvaAST UCWORD36_tree=null;

        try {
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:114:2: ( LCWORD | UCWORD | string | number )
            int alt16=4;
            switch ( input.LA(1) ) {
            case LCWORD:
                {
                alt16=1;
                }
                break;
            case UCWORD:
                {
                alt16=2;
                }
                break;
            case STRING1:
            case STRING2:
                {
                alt16=3;
                }
                break;
            case MINUS:
            case INT_LITERAL:
            case LONG_LITERAL:
                {
                alt16=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:114:4: LCWORD
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    LCWORD35=(Token)match(input,LCWORD,FOLLOW_LCWORD_in_value566); 
                    LCWORD35_tree = (ProvaAST)adaptor.create(LCWORD35);
                    adaptor.addChild(root_0, LCWORD35_tree);


                    }
                    break;
                case 2 :
                    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:114:13: UCWORD
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    UCWORD36=(Token)match(input,UCWORD,FOLLOW_UCWORD_in_value570); 
                    UCWORD36_tree = (ProvaAST)adaptor.create(UCWORD36);
                    adaptor.addChild(root_0, UCWORD36_tree);


                    }
                    break;
                case 3 :
                    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:114:22: string
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_string_in_value574);
                    string37=string();

                    state._fsp--;

                    adaptor.addChild(root_0, string37.getTree());

                    }
                    break;
                case 4 :
                    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:114:31: number
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_number_in_value578);
                    number38=number();

                    state._fsp--;

                    adaptor.addChild(root_0, number38.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (ProvaAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ProvaAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "value"

    public static class literals_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "literals"
    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:117:1: literals : literal ( COMMA literal )* -> ^( LITERAL ( literal )+ ) ;
    public final Prova2Parser.literals_return literals() throws RecognitionException {
        Prova2Parser.literals_return retval = new Prova2Parser.literals_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token COMMA40=null;
        Prova2Parser.literal_return literal39 = null;

        Prova2Parser.literal_return literal41 = null;


        ProvaAST COMMA40_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_literal=new RewriteRuleSubtreeStream(adaptor,"rule literal");
        try {
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:117:11: ( literal ( COMMA literal )* -> ^( LITERAL ( literal )+ ) )
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:117:13: literal ( COMMA literal )*
            {
            pushFollow(FOLLOW_literal_in_literals588);
            literal39=literal();

            state._fsp--;

            stream_literal.add(literal39.getTree());
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:117:21: ( COMMA literal )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==COMMA) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:117:22: COMMA literal
            	    {
            	    COMMA40=(Token)match(input,COMMA,FOLLOW_COMMA_in_literals591);  
            	    stream_COMMA.add(COMMA40);

            	    pushFollow(FOLLOW_literal_in_literals593);
            	    literal41=literal();

            	    state._fsp--;

            	    stream_literal.add(literal41.getTree());

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);



            // AST REWRITE
            // elements: literal
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ProvaAST)adaptor.nil();
            // 117:38: -> ^( LITERAL ( literal )+ )
            {
                // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:117:41: ^( LITERAL ( literal )+ )
                {
                ProvaAST root_1 = (ProvaAST)adaptor.nil();
                root_1 = (ProvaAST)adaptor.becomeRoot((ProvaAST)adaptor.create(LITERAL, "LITERAL"), root_1);

                if ( !(stream_literal.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_literal.hasNext() ) {
                    adaptor.addChild(root_1, stream_literal.nextTree());

                }
                stream_literal.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (ProvaAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ProvaAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "literals"

    public static class literal_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "literal"
    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:119:1: literal : ( ( NEWLINE )* (m= metadata )? r= relation (g= guard )? -> ^( RELATION ( metadata )? relation ( guard )? ) | ( NEWLINE )* (m= metadata )? semantic_attachment (g= guard )? -> ^( SEMANTIC_ATTACHMENT ( metadata )? semantic_attachment ( guard )? ) | ( NEWLINE )* cut -> ^( CUT cut ) );
    public final Prova2Parser.literal_return literal() throws RecognitionException {
        Prova2Parser.literal_return retval = new Prova2Parser.literal_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token NEWLINE42=null;
        Token NEWLINE43=null;
        Token NEWLINE45=null;
        Prova2Parser.metadata_return m = null;

        Prova2Parser.relation_return r = null;

        Prova2Parser.guard_return g = null;

        Prova2Parser.semantic_attachment_return semantic_attachment44 = null;

        Prova2Parser.cut_return cut46 = null;


        ProvaAST NEWLINE42_tree=null;
        ProvaAST NEWLINE43_tree=null;
        ProvaAST NEWLINE45_tree=null;
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleSubtreeStream stream_guard=new RewriteRuleSubtreeStream(adaptor,"rule guard");
        RewriteRuleSubtreeStream stream_relation=new RewriteRuleSubtreeStream(adaptor,"rule relation");
        RewriteRuleSubtreeStream stream_semantic_attachment=new RewriteRuleSubtreeStream(adaptor,"rule semantic_attachment");
        RewriteRuleSubtreeStream stream_cut=new RewriteRuleSubtreeStream(adaptor,"rule cut");
        RewriteRuleSubtreeStream stream_metadata=new RewriteRuleSubtreeStream(adaptor,"rule metadata");
        try {
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:119:10: ( ( NEWLINE )* (m= metadata )? r= relation (g= guard )? -> ^( RELATION ( metadata )? relation ( guard )? ) | ( NEWLINE )* (m= metadata )? semantic_attachment (g= guard )? -> ^( SEMANTIC_ATTACHMENT ( metadata )? semantic_attachment ( guard )? ) | ( NEWLINE )* cut -> ^( CUT cut ) )
            int alt25=3;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:119:12: ( NEWLINE )* (m= metadata )? r= relation (g= guard )?
                    {
                    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:119:12: ( NEWLINE )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==NEWLINE) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:119:12: NEWLINE
                    	    {
                    	    NEWLINE42=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_literal613);  
                    	    stream_NEWLINE.add(NEWLINE42);


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:119:22: (m= metadata )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==69) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:119:22: m= metadata
                            {
                            pushFollow(FOLLOW_metadata_in_literal618);
                            m=metadata();

                            state._fsp--;

                            stream_metadata.add(m.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_relation_in_literal623);
                    r=relation();

                    state._fsp--;

                    stream_relation.add(r.getTree());
                    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:119:45: (g= guard )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==BRA) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:119:45: g= guard
                            {
                            pushFollow(FOLLOW_guard_in_literal627);
                            g=guard();

                            state._fsp--;

                            stream_guard.add(g.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: metadata, guard, relation
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ProvaAST)adaptor.nil();
                    // 119:53: -> ^( RELATION ( metadata )? relation ( guard )? )
                    {
                        // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:119:56: ^( RELATION ( metadata )? relation ( guard )? )
                        {
                        ProvaAST root_1 = (ProvaAST)adaptor.nil();
                        root_1 = (ProvaAST)adaptor.becomeRoot((ProvaAST)adaptor.create(RELATION, "RELATION"), root_1);

                        // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:119:67: ( metadata )?
                        if ( stream_metadata.hasNext() ) {
                            adaptor.addChild(root_1, stream_metadata.nextTree());

                        }
                        stream_metadata.reset();
                        adaptor.addChild(root_1, stream_relation.nextTree());
                        // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:119:86: ( guard )?
                        if ( stream_guard.hasNext() ) {
                            adaptor.addChild(root_1, stream_guard.nextTree());

                        }
                        stream_guard.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:120:6: ( NEWLINE )* (m= metadata )? semantic_attachment (g= guard )?
                    {
                    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:120:6: ( NEWLINE )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==NEWLINE) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:120:6: NEWLINE
                    	    {
                    	    NEWLINE43=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_literal649);  
                    	    stream_NEWLINE.add(NEWLINE43);


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:120:16: (m= metadata )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==69) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:120:16: m= metadata
                            {
                            pushFollow(FOLLOW_metadata_in_literal654);
                            m=metadata();

                            state._fsp--;

                            stream_metadata.add(m.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_semantic_attachment_in_literal657);
                    semantic_attachment44=semantic_attachment();

                    state._fsp--;

                    stream_semantic_attachment.add(semantic_attachment44.getTree());
                    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:120:48: (g= guard )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==BRA) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:120:48: g= guard
                            {
                            pushFollow(FOLLOW_guard_in_literal661);
                            g=guard();

                            state._fsp--;

                            stream_guard.add(g.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: metadata, guard, semantic_attachment
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ProvaAST)adaptor.nil();
                    // 120:56: -> ^( SEMANTIC_ATTACHMENT ( metadata )? semantic_attachment ( guard )? )
                    {
                        // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:120:59: ^( SEMANTIC_ATTACHMENT ( metadata )? semantic_attachment ( guard )? )
                        {
                        ProvaAST root_1 = (ProvaAST)adaptor.nil();
                        root_1 = (ProvaAST)adaptor.becomeRoot((ProvaAST)adaptor.create(SEMANTIC_ATTACHMENT, "SEMANTIC_ATTACHMENT"), root_1);

                        // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:120:81: ( metadata )?
                        if ( stream_metadata.hasNext() ) {
                            adaptor.addChild(root_1, stream_metadata.nextTree());

                        }
                        stream_metadata.reset();
                        adaptor.addChild(root_1, stream_semantic_attachment.nextTree());
                        // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:120:111: ( guard )?
                        if ( stream_guard.hasNext() ) {
                            adaptor.addChild(root_1, stream_guard.nextTree());

                        }
                        stream_guard.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:121:6: ( NEWLINE )* cut
                    {
                    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:121:6: ( NEWLINE )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==NEWLINE) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:121:6: NEWLINE
                    	    {
                    	    NEWLINE45=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_literal683);  
                    	    stream_NEWLINE.add(NEWLINE45);


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    pushFollow(FOLLOW_cut_in_literal686);
                    cut46=cut();

                    state._fsp--;

                    stream_cut.add(cut46.getTree());


                    // AST REWRITE
                    // elements: cut
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ProvaAST)adaptor.nil();
                    // 121:19: -> ^( CUT cut )
                    {
                        // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:121:22: ^( CUT cut )
                        {
                        ProvaAST root_1 = (ProvaAST)adaptor.nil();
                        root_1 = (ProvaAST)adaptor.becomeRoot((ProvaAST)adaptor.create(CUT, "CUT"), root_1);

                        adaptor.addChild(root_1, stream_cut.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (ProvaAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ProvaAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "literal"

    public static class cut_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "cut"
    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:123:1: cut : CUT ;
    public final Prova2Parser.cut_return cut() throws RecognitionException {
        Prova2Parser.cut_return retval = new Prova2Parser.cut_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token CUT47=null;

        ProvaAST CUT47_tree=null;

        try {
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:123:5: ( CUT )
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:123:7: CUT
            {
            root_0 = (ProvaAST)adaptor.nil();

            CUT47=(Token)match(input,CUT,FOLLOW_CUT_in_cut702); 
            CUT47_tree = (ProvaAST)adaptor.create(CUT47);
            adaptor.addChild(root_0, CUT47_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (ProvaAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ProvaAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "cut"

    public static class binary_operator_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "binary_operator"
    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:125:1: binary_operator : ( not_equal | LT | GT | LE | GE );
    public final Prova2Parser.binary_operator_return binary_operator() throws RecognitionException {
        Prova2Parser.binary_operator_return retval = new Prova2Parser.binary_operator_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token LT49=null;
        Token GT50=null;
        Token LE51=null;
        Token GE52=null;
        Prova2Parser.not_equal_return not_equal48 = null;


        ProvaAST LT49_tree=null;
        ProvaAST GT50_tree=null;
        ProvaAST LE51_tree=null;
        ProvaAST GE52_tree=null;

        try {
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:126:2: ( not_equal | LT | GT | LE | GE )
            int alt26=5;
            switch ( input.LA(1) ) {
            case NOT_EQUAL1:
            case NOT_EQUAL2:
                {
                alt26=1;
                }
                break;
            case LT:
                {
                alt26=2;
                }
                break;
            case GT:
                {
                alt26=3;
                }
                break;
            case LE:
                {
                alt26=4;
                }
                break;
            case GE:
                {
                alt26=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:126:4: not_equal
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_not_equal_in_binary_operator711);
                    not_equal48=not_equal();

                    state._fsp--;

                    adaptor.addChild(root_0, not_equal48.getTree());

                    }
                    break;
                case 2 :
                    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:126:16: LT
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    LT49=(Token)match(input,LT,FOLLOW_LT_in_binary_operator715); 
                    LT49_tree = (ProvaAST)adaptor.create(LT49);
                    adaptor.addChild(root_0, LT49_tree);


                    }
                    break;
                case 3 :
                    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:126:21: GT
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    GT50=(Token)match(input,GT,FOLLOW_GT_in_binary_operator719); 
                    GT50_tree = (ProvaAST)adaptor.create(GT50);
                    adaptor.addChild(root_0, GT50_tree);


                    }
                    break;
                case 4 :
                    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:126:26: LE
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    LE51=(Token)match(input,LE,FOLLOW_LE_in_binary_operator723); 
                    LE51_tree = (ProvaAST)adaptor.create(LE51);
                    adaptor.addChild(root_0, LE51_tree);


                    }
                    break;
                case 5 :
                    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:126:31: GE
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    GE52=(Token)match(input,GE,FOLLOW_GE_in_binary_operator727); 
                    GE52_tree = (ProvaAST)adaptor.create(GE52);
                    adaptor.addChild(root_0, GE52_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (ProvaAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ProvaAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "binary_operator"

    public static class relation_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relation"
    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:129:1: relation : predicate '(' list_body ')' -> ^( PREDICATE predicate list_body ) ;
    public final Prova2Parser.relation_return relation() throws RecognitionException {
        Prova2Parser.relation_return retval = new Prova2Parser.relation_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token char_literal54=null;
        Token char_literal56=null;
        Prova2Parser.predicate_return predicate53 = null;

        Prova2Parser.list_body_return list_body55 = null;


        ProvaAST char_literal54_tree=null;
        ProvaAST char_literal56_tree=null;
        RewriteRuleTokenStream stream_OPEN=new RewriteRuleTokenStream(adaptor,"token OPEN");
        RewriteRuleTokenStream stream_CLOSE=new RewriteRuleTokenStream(adaptor,"token CLOSE");
        RewriteRuleSubtreeStream stream_predicate=new RewriteRuleSubtreeStream(adaptor,"rule predicate");
        RewriteRuleSubtreeStream stream_list_body=new RewriteRuleSubtreeStream(adaptor,"rule list_body");
        try {
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:130:2: ( predicate '(' list_body ')' -> ^( PREDICATE predicate list_body ) )
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:130:4: predicate '(' list_body ')'
            {
            pushFollow(FOLLOW_predicate_in_relation739);
            predicate53=predicate();

            state._fsp--;

            stream_predicate.add(predicate53.getTree());
            char_literal54=(Token)match(input,OPEN,FOLLOW_OPEN_in_relation741);  
            stream_OPEN.add(char_literal54);

            pushFollow(FOLLOW_list_body_in_relation743);
            list_body55=list_body();

            state._fsp--;

            stream_list_body.add(list_body55.getTree());
            char_literal56=(Token)match(input,CLOSE,FOLLOW_CLOSE_in_relation745);  
            stream_CLOSE.add(char_literal56);



            // AST REWRITE
            // elements: list_body, predicate
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ProvaAST)adaptor.nil();
            // 130:32: -> ^( PREDICATE predicate list_body )
            {
                // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:130:35: ^( PREDICATE predicate list_body )
                {
                ProvaAST root_1 = (ProvaAST)adaptor.nil();
                root_1 = (ProvaAST)adaptor.becomeRoot((ProvaAST)adaptor.create(PREDICATE, "PREDICATE"), root_1);

                adaptor.addChild(root_1, stream_predicate.nextTree());
                adaptor.addChild(root_1, stream_list_body.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (ProvaAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ProvaAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "relation"

    public static class guard_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "guard"
    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:132:1: guard : '[' literals ']' -> ^( GUARD literals ) ;
    public final Prova2Parser.guard_return guard() throws RecognitionException {
        Prova2Parser.guard_return retval = new Prova2Parser.guard_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token char_literal57=null;
        Token char_literal59=null;
        Prova2Parser.literals_return literals58 = null;


        ProvaAST char_literal57_tree=null;
        ProvaAST char_literal59_tree=null;
        RewriteRuleTokenStream stream_BRA=new RewriteRuleTokenStream(adaptor,"token BRA");
        RewriteRuleTokenStream stream_KET=new RewriteRuleTokenStream(adaptor,"token KET");
        RewriteRuleSubtreeStream stream_literals=new RewriteRuleSubtreeStream(adaptor,"rule literals");
        try {
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:133:2: ( '[' literals ']' -> ^( GUARD literals ) )
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:133:4: '[' literals ']'
            {
            char_literal57=(Token)match(input,BRA,FOLLOW_BRA_in_guard764);  
            stream_BRA.add(char_literal57);

            pushFollow(FOLLOW_literals_in_guard766);
            literals58=literals();

            state._fsp--;

            stream_literals.add(literals58.getTree());
            char_literal59=(Token)match(input,KET,FOLLOW_KET_in_guard768);  
            stream_KET.add(char_literal59);



            // AST REWRITE
            // elements: literals
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ProvaAST)adaptor.nil();
            // 133:21: -> ^( GUARD literals )
            {
                // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:133:24: ^( GUARD literals )
                {
                ProvaAST root_1 = (ProvaAST)adaptor.nil();
                root_1 = (ProvaAST)adaptor.becomeRoot((ProvaAST)adaptor.create(GUARD, "GUARD"), root_1);

                adaptor.addChild(root_1, stream_literals.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (ProvaAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ProvaAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "guard"

    public static class list_body_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "list_body"
    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:136:1: list_body : ( terms ( '|' list_tail )? )? ( NEWLINE )* -> ^( LIST_BODY ( terms ( list_tail )? )? ) ;
    public final Prova2Parser.list_body_return list_body() throws RecognitionException {
        Prova2Parser.list_body_return retval = new Prova2Parser.list_body_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token char_literal61=null;
        Token NEWLINE63=null;
        Prova2Parser.terms_return terms60 = null;

        Prova2Parser.list_tail_return list_tail62 = null;


        ProvaAST char_literal61_tree=null;
        ProvaAST NEWLINE63_tree=null;
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_BAR=new RewriteRuleTokenStream(adaptor,"token BAR");
        RewriteRuleSubtreeStream stream_terms=new RewriteRuleSubtreeStream(adaptor,"rule terms");
        RewriteRuleSubtreeStream stream_list_tail=new RewriteRuleSubtreeStream(adaptor,"rule list_tail");
        try {
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:137:3: ( ( terms ( '|' list_tail )? )? ( NEWLINE )* -> ^( LIST_BODY ( terms ( list_tail )? )? ) )
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:137:5: ( terms ( '|' list_tail )? )? ( NEWLINE )*
            {
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:137:5: ( terms ( '|' list_tail )? )?
            int alt28=2;
            alt28 = dfa28.predict(input);
            switch (alt28) {
                case 1 :
                    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:137:6: terms ( '|' list_tail )?
                    {
                    pushFollow(FOLLOW_terms_in_list_body789);
                    terms60=terms();

                    state._fsp--;

                    stream_terms.add(terms60.getTree());
                    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:137:12: ( '|' list_tail )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==BAR) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:137:13: '|' list_tail
                            {
                            char_literal61=(Token)match(input,BAR,FOLLOW_BAR_in_list_body792);  
                            stream_BAR.add(char_literal61);

                            pushFollow(FOLLOW_list_tail_in_list_body794);
                            list_tail62=list_tail();

                            state._fsp--;

                            stream_list_tail.add(list_tail62.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }

            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:137:31: ( NEWLINE )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==NEWLINE) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:137:31: NEWLINE
            	    {
            	    NEWLINE63=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_list_body800);  
            	    stream_NEWLINE.add(NEWLINE63);


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);



            // AST REWRITE
            // elements: terms, list_tail
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ProvaAST)adaptor.nil();
            // 137:40: -> ^( LIST_BODY ( terms ( list_tail )? )? )
            {
                // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:137:43: ^( LIST_BODY ( terms ( list_tail )? )? )
                {
                ProvaAST root_1 = (ProvaAST)adaptor.nil();
                root_1 = (ProvaAST)adaptor.becomeRoot((ProvaAST)adaptor.create(LIST_BODY, "LIST_BODY"), root_1);

                // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:137:55: ( terms ( list_tail )? )?
                if ( stream_terms.hasNext()||stream_list_tail.hasNext() ) {
                    adaptor.addChild(root_1, stream_terms.nextTree());
                    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:137:62: ( list_tail )?
                    if ( stream_list_tail.hasNext() ) {
                        adaptor.addChild(root_1, stream_list_tail.nextTree());

                    }
                    stream_list_tail.reset();

                }
                stream_terms.reset();
                stream_list_tail.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (ProvaAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ProvaAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "list_body"

    public static class list_tail_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "list_tail"
    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:139:1: list_tail : ( variable | prova_list );
    public final Prova2Parser.list_tail_return list_tail() throws RecognitionException {
        Prova2Parser.list_tail_return retval = new Prova2Parser.list_tail_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Prova2Parser.variable_return variable64 = null;

        Prova2Parser.prova_list_return prova_list65 = null;



        try {
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:140:2: ( variable | prova_list )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==USWORD||LA30_0==DOLLARWORD||(LA30_0>=LCWORD && LA30_0<=UCWORD)) ) {
                alt30=1;
            }
            else if ( (LA30_0==BRA) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:140:4: variable
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_variable_in_list_tail825);
                    variable64=variable();

                    state._fsp--;

                    adaptor.addChild(root_0, variable64.getTree());

                    }
                    break;
                case 2 :
                    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:140:15: prova_list
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_prova_list_in_list_tail829);
                    prova_list65=prova_list();

                    state._fsp--;

                    adaptor.addChild(root_0, prova_list65.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (ProvaAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ProvaAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "list_tail"

    public static class left_term_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "left_term"
    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:142:1: left_term : ( constant | variable | number | prova_list );
    public final Prova2Parser.left_term_return left_term() throws RecognitionException {
        Prova2Parser.left_term_return retval = new Prova2Parser.left_term_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Prova2Parser.constant_return constant66 = null;

        Prova2Parser.variable_return variable67 = null;

        Prova2Parser.number_return number68 = null;

        Prova2Parser.prova_list_return prova_list69 = null;



        try {
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:143:2: ( constant | variable | number | prova_list )
            int alt31=4;
            alt31 = dfa31.predict(input);
            switch (alt31) {
                case 1 :
                    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:143:4: constant
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_constant_in_left_term839);
                    constant66=constant();

                    state._fsp--;

                    adaptor.addChild(root_0, constant66.getTree());

                    }
                    break;
                case 2 :
                    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:144:3: variable
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_variable_in_left_term846);
                    variable67=variable();

                    state._fsp--;

                    adaptor.addChild(root_0, variable67.getTree());

                    }
                    break;
                case 3 :
                    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:145:3: number
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_number_in_left_term852);
                    number68=number();

                    state._fsp--;

                    adaptor.addChild(root_0, number68.getTree());

                    }
                    break;
                case 4 :
                    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:146:3: prova_list
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_prova_list_in_left_term858);
                    prova_list69=prova_list();

                    state._fsp--;

                    adaptor.addChild(root_0, prova_list69.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (ProvaAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ProvaAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "left_term"

    public static class right_term_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "right_term"
    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:148:1: right_term : ( ( ( MINUS )? ( constant | variable ) ) | number | prova_list | prova_map );
    public final Prova2Parser.right_term_return right_term() throws RecognitionException {
        Prova2Parser.right_term_return retval = new Prova2Parser.right_term_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token MINUS70=null;
        Prova2Parser.constant_return constant71 = null;

        Prova2Parser.variable_return variable72 = null;

        Prova2Parser.number_return number73 = null;

        Prova2Parser.prova_list_return prova_list74 = null;

        Prova2Parser.prova_map_return prova_map75 = null;


        ProvaAST MINUS70_tree=null;

        try {
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:149:2: ( ( ( MINUS )? ( constant | variable ) ) | number | prova_list | prova_map )
            int alt34=4;
            switch ( input.LA(1) ) {
            case MINUS:
                {
                int LA34_1 = input.LA(2);

                if ( (LA34_1==USWORD||LA34_1==DOLLARWORD||(LA34_1>=LCWORD && LA34_1<=UCWORD)||(LA34_1>=STRING1 && LA34_1<=STRING2)) ) {
                    alt34=1;
                }
                else if ( ((LA34_1>=INT_LITERAL && LA34_1<=LONG_LITERAL)) ) {
                    alt34=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 1, input);

                    throw nvae;
                }
                }
                break;
            case USWORD:
            case DOLLARWORD:
            case LCWORD:
            case UCWORD:
            case STRING1:
            case STRING2:
                {
                alt34=1;
                }
                break;
            case INT_LITERAL:
            case LONG_LITERAL:
                {
                alt34=2;
                }
                break;
            case BRA:
                {
                alt34=3;
                }
                break;
            case 70:
                {
                alt34=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:149:4: ( ( MINUS )? ( constant | variable ) )
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:149:4: ( ( MINUS )? ( constant | variable ) )
                    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:149:5: ( MINUS )? ( constant | variable )
                    {
                    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:149:5: ( MINUS )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==MINUS) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:149:5: MINUS
                            {
                            MINUS70=(Token)match(input,MINUS,FOLLOW_MINUS_in_right_term869); 
                            MINUS70_tree = (ProvaAST)adaptor.create(MINUS70);
                            adaptor.addChild(root_0, MINUS70_tree);


                            }
                            break;

                    }

                    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:149:12: ( constant | variable )
                    int alt33=2;
                    alt33 = dfa33.predict(input);
                    switch (alt33) {
                        case 1 :
                            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:149:13: constant
                            {
                            pushFollow(FOLLOW_constant_in_right_term873);
                            constant71=constant();

                            state._fsp--;

                            adaptor.addChild(root_0, constant71.getTree());

                            }
                            break;
                        case 2 :
                            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:149:24: variable
                            {
                            pushFollow(FOLLOW_variable_in_right_term877);
                            variable72=variable();

                            state._fsp--;

                            adaptor.addChild(root_0, variable72.getTree());

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:149:37: number
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_number_in_right_term883);
                    number73=number();

                    state._fsp--;

                    adaptor.addChild(root_0, number73.getTree());

                    }
                    break;
                case 3 :
                    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:149:46: prova_list
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_prova_list_in_right_term887);
                    prova_list74=prova_list();

                    state._fsp--;

                    adaptor.addChild(root_0, prova_list74.getTree());

                    }
                    break;
                case 4 :
                    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:149:59: prova_map
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_prova_map_in_right_term891);
                    prova_map75=prova_map();

                    state._fsp--;

                    adaptor.addChild(root_0, prova_map75.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (ProvaAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ProvaAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "right_term"

    public static class prova_map_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prova_map"
    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:151:1: prova_map : '{' ( key_value )? ( ',' key_value )* '}' -> ^( PROVA_MAP ( key_value )* ) ;
    public final Prova2Parser.prova_map_return prova_map() throws RecognitionException {
        Prova2Parser.prova_map_return retval = new Prova2Parser.prova_map_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token char_literal76=null;
        Token char_literal78=null;
        Token char_literal80=null;
        Prova2Parser.key_value_return key_value77 = null;

        Prova2Parser.key_value_return key_value79 = null;


        ProvaAST char_literal76_tree=null;
        ProvaAST char_literal78_tree=null;
        ProvaAST char_literal80_tree=null;
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleSubtreeStream stream_key_value=new RewriteRuleSubtreeStream(adaptor,"rule key_value");
        try {
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:152:2: ( '{' ( key_value )? ( ',' key_value )* '}' -> ^( PROVA_MAP ( key_value )* ) )
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:152:4: '{' ( key_value )? ( ',' key_value )* '}'
            {
            char_literal76=(Token)match(input,70,FOLLOW_70_in_prova_map901);  
            stream_70.add(char_literal76);

            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:152:8: ( key_value )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==LCWORD||(LA35_0>=STRING1 && LA35_0<=STRING2)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:152:8: key_value
                    {
                    pushFollow(FOLLOW_key_value_in_prova_map903);
                    key_value77=key_value();

                    state._fsp--;

                    stream_key_value.add(key_value77.getTree());

                    }
                    break;

            }

            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:152:19: ( ',' key_value )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==COMMA) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:152:20: ',' key_value
            	    {
            	    char_literal78=(Token)match(input,COMMA,FOLLOW_COMMA_in_prova_map907);  
            	    stream_COMMA.add(char_literal78);

            	    pushFollow(FOLLOW_key_value_in_prova_map909);
            	    key_value79=key_value();

            	    state._fsp--;

            	    stream_key_value.add(key_value79.getTree());

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            char_literal80=(Token)match(input,71,FOLLOW_71_in_prova_map913);  
            stream_71.add(char_literal80);



            // AST REWRITE
            // elements: key_value
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ProvaAST)adaptor.nil();
            // 152:40: -> ^( PROVA_MAP ( key_value )* )
            {
                // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:152:43: ^( PROVA_MAP ( key_value )* )
                {
                ProvaAST root_1 = (ProvaAST)adaptor.nil();
                root_1 = (ProvaAST)adaptor.becomeRoot((ProvaAST)adaptor.create(PROVA_MAP, "PROVA_MAP"), root_1);

                // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:152:55: ( key_value )*
                while ( stream_key_value.hasNext() ) {
                    adaptor.addChild(root_1, stream_key_value.nextTree());

                }
                stream_key_value.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (ProvaAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ProvaAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "prova_map"

    public static class key_value_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "key_value"
    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:155:1: key_value : mstring ( '->' | ':' ) term -> ^( KEY_VALUE mstring term ) ;
    public final Prova2Parser.key_value_return key_value() throws RecognitionException {
        Prova2Parser.key_value_return retval = new Prova2Parser.key_value_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token string_literal82=null;
        Token char_literal83=null;
        Prova2Parser.mstring_return mstring81 = null;

        Prova2Parser.term_return term84 = null;


        ProvaAST string_literal82_tree=null;
        ProvaAST char_literal83_tree=null;
        RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
        RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
        RewriteRuleSubtreeStream stream_term=new RewriteRuleSubtreeStream(adaptor,"rule term");
        RewriteRuleSubtreeStream stream_mstring=new RewriteRuleSubtreeStream(adaptor,"rule mstring");
        try {
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:156:2: ( mstring ( '->' | ':' ) term -> ^( KEY_VALUE mstring term ) )
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:156:4: mstring ( '->' | ':' ) term
            {
            pushFollow(FOLLOW_mstring_in_key_value933);
            mstring81=mstring();

            state._fsp--;

            stream_mstring.add(mstring81.getTree());
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:156:12: ( '->' | ':' )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==72) ) {
                alt37=1;
            }
            else if ( (LA37_0==73) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:156:13: '->'
                    {
                    string_literal82=(Token)match(input,72,FOLLOW_72_in_key_value936);  
                    stream_72.add(string_literal82);


                    }
                    break;
                case 2 :
                    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:156:18: ':'
                    {
                    char_literal83=(Token)match(input,73,FOLLOW_73_in_key_value938);  
                    stream_73.add(char_literal83);


                    }
                    break;

            }

            pushFollow(FOLLOW_term_in_key_value941);
            term84=term();

            state._fsp--;

            stream_term.add(term84.getTree());


            // AST REWRITE
            // elements: mstring, term
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ProvaAST)adaptor.nil();
            // 156:28: -> ^( KEY_VALUE mstring term )
            {
                // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:156:31: ^( KEY_VALUE mstring term )
                {
                ProvaAST root_1 = (ProvaAST)adaptor.nil();
                root_1 = (ProvaAST)adaptor.becomeRoot((ProvaAST)adaptor.create(KEY_VALUE, "KEY_VALUE"), root_1);

                adaptor.addChild(root_1, stream_mstring.nextTree());
                adaptor.addChild(root_1, stream_term.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (ProvaAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ProvaAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "key_value"

    public static class terms_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "terms"
    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:159:1: terms : ( NEWLINE )* term ( ( NEWLINE )* ',' ( NEWLINE )* term )* -> ^( TERM ( term )+ ) ;
    public final Prova2Parser.terms_return terms() throws RecognitionException {
        Prova2Parser.terms_return retval = new Prova2Parser.terms_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token NEWLINE85=null;
        Token NEWLINE87=null;
        Token char_literal88=null;
        Token NEWLINE89=null;
        Prova2Parser.term_return term86 = null;

        Prova2Parser.term_return term90 = null;


        ProvaAST NEWLINE85_tree=null;
        ProvaAST NEWLINE87_tree=null;
        ProvaAST char_literal88_tree=null;
        ProvaAST NEWLINE89_tree=null;
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_term=new RewriteRuleSubtreeStream(adaptor,"rule term");
        try {
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:159:8: ( ( NEWLINE )* term ( ( NEWLINE )* ',' ( NEWLINE )* term )* -> ^( TERM ( term )+ ) )
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:159:10: ( NEWLINE )* term ( ( NEWLINE )* ',' ( NEWLINE )* term )*
            {
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:159:10: ( NEWLINE )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==NEWLINE) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:159:10: NEWLINE
            	    {
            	    NEWLINE85=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_terms964);  
            	    stream_NEWLINE.add(NEWLINE85);


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            pushFollow(FOLLOW_term_in_terms967);
            term86=term();

            state._fsp--;

            stream_term.add(term86.getTree());
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:159:24: ( ( NEWLINE )* ',' ( NEWLINE )* term )*
            loop41:
            do {
                int alt41=2;
                alt41 = dfa41.predict(input);
                switch (alt41) {
            	case 1 :
            	    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:159:25: ( NEWLINE )* ',' ( NEWLINE )* term
            	    {
            	    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:159:25: ( NEWLINE )*
            	    loop39:
            	    do {
            	        int alt39=2;
            	        int LA39_0 = input.LA(1);

            	        if ( (LA39_0==NEWLINE) ) {
            	            alt39=1;
            	        }


            	        switch (alt39) {
            	    	case 1 :
            	    	    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:159:25: NEWLINE
            	    	    {
            	    	    NEWLINE87=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_terms970);  
            	    	    stream_NEWLINE.add(NEWLINE87);


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop39;
            	        }
            	    } while (true);

            	    char_literal88=(Token)match(input,COMMA,FOLLOW_COMMA_in_terms973);  
            	    stream_COMMA.add(char_literal88);

            	    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:159:38: ( NEWLINE )*
            	    loop40:
            	    do {
            	        int alt40=2;
            	        int LA40_0 = input.LA(1);

            	        if ( (LA40_0==NEWLINE) ) {
            	            alt40=1;
            	        }


            	        switch (alt40) {
            	    	case 1 :
            	    	    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:159:38: NEWLINE
            	    	    {
            	    	    NEWLINE89=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_terms975);  
            	    	    stream_NEWLINE.add(NEWLINE89);


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop40;
            	        }
            	    } while (true);

            	    pushFollow(FOLLOW_term_in_terms978);
            	    term90=term();

            	    state._fsp--;

            	    stream_term.add(term90.getTree());

            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);



            // AST REWRITE
            // elements: term
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ProvaAST)adaptor.nil();
            // 159:54: -> ^( TERM ( term )+ )
            {
                // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:159:57: ^( TERM ( term )+ )
                {
                ProvaAST root_1 = (ProvaAST)adaptor.nil();
                root_1 = (ProvaAST)adaptor.becomeRoot((ProvaAST)adaptor.create(TERM, "TERM"), root_1);

                if ( !(stream_term.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_term.hasNext() ) {
                    adaptor.addChild(root_1, stream_term.nextTree());

                }
                stream_term.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (ProvaAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ProvaAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "terms"

    public static class term_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "term"
    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:161:1: term : ( left_term | func_term | prova_map );
    public final Prova2Parser.term_return term() throws RecognitionException {
        Prova2Parser.term_return retval = new Prova2Parser.term_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Prova2Parser.left_term_return left_term91 = null;

        Prova2Parser.func_term_return func_term92 = null;

        Prova2Parser.prova_map_return prova_map93 = null;



        try {
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:161:6: ( left_term | func_term | prova_map )
            int alt42=3;
            alt42 = dfa42.predict(input);
            switch (alt42) {
                case 1 :
                    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:161:8: left_term
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_left_term_in_term997);
                    left_term91=left_term();

                    state._fsp--;

                    adaptor.addChild(root_0, left_term91.getTree());

                    }
                    break;
                case 2 :
                    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:161:20: func_term
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_func_term_in_term1001);
                    func_term92=func_term();

                    state._fsp--;

                    adaptor.addChild(root_0, func_term92.getTree());

                    }
                    break;
                case 3 :
                    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:161:32: prova_map
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_prova_map_in_term1005);
                    prova_map93=prova_map();

                    state._fsp--;

                    adaptor.addChild(root_0, prova_map93.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (ProvaAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ProvaAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "term"

    public static class func_term_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "func_term"
    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:163:1: func_term : func args ;
    public final Prova2Parser.func_term_return func_term() throws RecognitionException {
        Prova2Parser.func_term_return retval = new Prova2Parser.func_term_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Prova2Parser.func_return func94 = null;

        Prova2Parser.args_return args95 = null;



        try {
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:164:2: ( func args )
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:164:4: func args
            {
            root_0 = (ProvaAST)adaptor.nil();

            pushFollow(FOLLOW_func_in_func_term1014);
            func94=func();

            state._fsp--;

            adaptor.addChild(root_0, func94.getTree());
            pushFollow(FOLLOW_args_in_func_term1016);
            args95=args();

            state._fsp--;

            adaptor.addChild(root_0, args95.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (ProvaAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ProvaAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "func_term"

    public static class qualified_java_class_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "qualified_java_class"
    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:166:1: qualified_java_class : ( ( LCWORD DOT )+ UCWORD ) -> ^( QUALIFIED_JAVA_CLASS ( LCWORD DOT )+ UCWORD ) ;
    public final Prova2Parser.qualified_java_class_return qualified_java_class() throws RecognitionException {
        Prova2Parser.qualified_java_class_return retval = new Prova2Parser.qualified_java_class_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token LCWORD96=null;
        Token DOT97=null;
        Token UCWORD98=null;

        ProvaAST LCWORD96_tree=null;
        ProvaAST DOT97_tree=null;
        ProvaAST UCWORD98_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_UCWORD=new RewriteRuleTokenStream(adaptor,"token UCWORD");
        RewriteRuleTokenStream stream_LCWORD=new RewriteRuleTokenStream(adaptor,"token LCWORD");

        try {
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:167:2: ( ( ( LCWORD DOT )+ UCWORD ) -> ^( QUALIFIED_JAVA_CLASS ( LCWORD DOT )+ UCWORD ) )
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:167:4: ( ( LCWORD DOT )+ UCWORD )
            {
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:167:4: ( ( LCWORD DOT )+ UCWORD )
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:167:5: ( LCWORD DOT )+ UCWORD
            {
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:167:5: ( LCWORD DOT )+
            int cnt43=0;
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==LCWORD) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:167:6: LCWORD DOT
            	    {
            	    LCWORD96=(Token)match(input,LCWORD,FOLLOW_LCWORD_in_qualified_java_class1029);  
            	    stream_LCWORD.add(LCWORD96);

            	    DOT97=(Token)match(input,DOT,FOLLOW_DOT_in_qualified_java_class1031);  
            	    stream_DOT.add(DOT97);


            	    }
            	    break;

            	default :
            	    if ( cnt43 >= 1 ) break loop43;
                        EarlyExitException eee =
                            new EarlyExitException(43, input);
                        throw eee;
                }
                cnt43++;
            } while (true);

            UCWORD98=(Token)match(input,UCWORD,FOLLOW_UCWORD_in_qualified_java_class1035);  
            stream_UCWORD.add(UCWORD98);


            }



            // AST REWRITE
            // elements: UCWORD, LCWORD, DOT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ProvaAST)adaptor.nil();
            // 167:27: -> ^( QUALIFIED_JAVA_CLASS ( LCWORD DOT )+ UCWORD )
            {
                // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:167:30: ^( QUALIFIED_JAVA_CLASS ( LCWORD DOT )+ UCWORD )
                {
                ProvaAST root_1 = (ProvaAST)adaptor.nil();
                root_1 = (ProvaAST)adaptor.becomeRoot((ProvaAST)adaptor.create(QUALIFIED_JAVA_CLASS, "QUALIFIED_JAVA_CLASS"), root_1);

                if ( !(stream_LCWORD.hasNext()||stream_DOT.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_LCWORD.hasNext()||stream_DOT.hasNext() ) {
                    adaptor.addChild(root_1, stream_LCWORD.nextNode());
                    adaptor.addChild(root_1, stream_DOT.nextNode());

                }
                stream_LCWORD.reset();
                stream_DOT.reset();
                adaptor.addChild(root_1, stream_UCWORD.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (ProvaAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ProvaAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "qualified_java_class"

    public static class prova_list_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prova_list"
    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:170:1: prova_list : '[' list_body ']' -> ^( PROVA_LIST list_body ) ;
    public final Prova2Parser.prova_list_return prova_list() throws RecognitionException {
        Prova2Parser.prova_list_return retval = new Prova2Parser.prova_list_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token char_literal99=null;
        Token char_literal101=null;
        Prova2Parser.list_body_return list_body100 = null;


        ProvaAST char_literal99_tree=null;
        ProvaAST char_literal101_tree=null;
        RewriteRuleTokenStream stream_BRA=new RewriteRuleTokenStream(adaptor,"token BRA");
        RewriteRuleTokenStream stream_KET=new RewriteRuleTokenStream(adaptor,"token KET");
        RewriteRuleSubtreeStream stream_list_body=new RewriteRuleSubtreeStream(adaptor,"rule list_body");
        try {
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:171:2: ( '[' list_body ']' -> ^( PROVA_LIST list_body ) )
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:171:4: '[' list_body ']'
            {
            char_literal99=(Token)match(input,BRA,FOLLOW_BRA_in_prova_list1063);  
            stream_BRA.add(char_literal99);

            pushFollow(FOLLOW_list_body_in_prova_list1065);
            list_body100=list_body();

            state._fsp--;

            stream_list_body.add(list_body100.getTree());
            char_literal101=(Token)match(input,KET,FOLLOW_KET_in_prova_list1067);  
            stream_KET.add(char_literal101);



            // AST REWRITE
            // elements: list_body
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ProvaAST)adaptor.nil();
            // 171:22: -> ^( PROVA_LIST list_body )
            {
                // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:171:25: ^( PROVA_LIST list_body )
                {
                ProvaAST root_1 = (ProvaAST)adaptor.nil();
                root_1 = (ProvaAST)adaptor.becomeRoot((ProvaAST)adaptor.create(PROVA_LIST, "PROVA_LIST"), root_1);

                adaptor.addChild(root_1, stream_list_body.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (ProvaAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ProvaAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "prova_list"

    public static class args_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "args"
    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:173:1: args : '(' list_body ')' -> ^( ARGS list_body ) ;
    public final Prova2Parser.args_return args() throws RecognitionException {
        Prova2Parser.args_return retval = new Prova2Parser.args_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token char_literal102=null;
        Token char_literal104=null;
        Prova2Parser.list_body_return list_body103 = null;


        ProvaAST char_literal102_tree=null;
        ProvaAST char_literal104_tree=null;
        RewriteRuleTokenStream stream_OPEN=new RewriteRuleTokenStream(adaptor,"token OPEN");
        RewriteRuleTokenStream stream_CLOSE=new RewriteRuleTokenStream(adaptor,"token CLOSE");
        RewriteRuleSubtreeStream stream_list_body=new RewriteRuleSubtreeStream(adaptor,"rule list_body");
        try {
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:173:7: ( '(' list_body ')' -> ^( ARGS list_body ) )
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:173:9: '(' list_body ')'
            {
            char_literal102=(Token)match(input,OPEN,FOLLOW_OPEN_in_args1084);  
            stream_OPEN.add(char_literal102);

            pushFollow(FOLLOW_list_body_in_args1086);
            list_body103=list_body();

            state._fsp--;

            stream_list_body.add(list_body103.getTree());
            char_literal104=(Token)match(input,CLOSE,FOLLOW_CLOSE_in_args1088);  
            stream_CLOSE.add(char_literal104);



            // AST REWRITE
            // elements: list_body
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ProvaAST)adaptor.nil();
            // 173:27: -> ^( ARGS list_body )
            {
                // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:173:30: ^( ARGS list_body )
                {
                ProvaAST root_1 = (ProvaAST)adaptor.nil();
                root_1 = (ProvaAST)adaptor.becomeRoot((ProvaAST)adaptor.create(ARGS, "ARGS"), root_1);

                adaptor.addChild(root_1, stream_list_body.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (ProvaAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ProvaAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "args"

    public static class semantic_attachment_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "semantic_attachment"
    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:175:1: semantic_attachment : ( predicate_java_call | binary_operation );
    public final Prova2Parser.semantic_attachment_return semantic_attachment() throws RecognitionException {
        Prova2Parser.semantic_attachment_return retval = new Prova2Parser.semantic_attachment_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Prova2Parser.predicate_java_call_return predicate_java_call105 = null;

        Prova2Parser.binary_operation_return binary_operation106 = null;



        try {
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:176:2: ( predicate_java_call | binary_operation )
            int alt44=2;
            alt44 = dfa44.predict(input);
            switch (alt44) {
                case 1 :
                    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:176:4: predicate_java_call
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_predicate_java_call_in_semantic_attachment1106);
                    predicate_java_call105=predicate_java_call();

                    state._fsp--;

                    adaptor.addChild(root_0, predicate_java_call105.getTree());

                    }
                    break;
                case 2 :
                    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:176:26: binary_operation
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_binary_operation_in_semantic_attachment1110);
                    binary_operation106=binary_operation();

                    state._fsp--;

                    adaptor.addChild(root_0, binary_operation106.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (ProvaAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ProvaAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "semantic_attachment"

    public static class binary_operation_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "binary_operation"
    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:178:1: binary_operation : left_term ( EQUAL ( constructor_java_call | prova_list | constant | expr ) | not_equal constant | binary_operator expr ) ;
    public final Prova2Parser.binary_operation_return binary_operation() throws RecognitionException {
        Prova2Parser.binary_operation_return retval = new Prova2Parser.binary_operation_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token EQUAL108=null;
        Prova2Parser.left_term_return left_term107 = null;

        Prova2Parser.constructor_java_call_return constructor_java_call109 = null;

        Prova2Parser.prova_list_return prova_list110 = null;

        Prova2Parser.constant_return constant111 = null;

        Prova2Parser.expr_return expr112 = null;

        Prova2Parser.not_equal_return not_equal113 = null;

        Prova2Parser.constant_return constant114 = null;

        Prova2Parser.binary_operator_return binary_operator115 = null;

        Prova2Parser.expr_return expr116 = null;


        ProvaAST EQUAL108_tree=null;

        try {
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:179:2: ( left_term ( EQUAL ( constructor_java_call | prova_list | constant | expr ) | not_equal constant | binary_operator expr ) )
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:179:4: left_term ( EQUAL ( constructor_java_call | prova_list | constant | expr ) | not_equal constant | binary_operator expr )
            {
            root_0 = (ProvaAST)adaptor.nil();

            pushFollow(FOLLOW_left_term_in_binary_operation1119);
            left_term107=left_term();

            state._fsp--;

            adaptor.addChild(root_0, left_term107.getTree());
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:180:3: ( EQUAL ( constructor_java_call | prova_list | constant | expr ) | not_equal constant | binary_operator expr )
            int alt46=3;
            alt46 = dfa46.predict(input);
            switch (alt46) {
                case 1 :
                    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:180:5: EQUAL ( constructor_java_call | prova_list | constant | expr )
                    {
                    EQUAL108=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_binary_operation1125); 
                    EQUAL108_tree = (ProvaAST)adaptor.create(EQUAL108);
                    adaptor.addChild(root_0, EQUAL108_tree);

                    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:181:4: ( constructor_java_call | prova_list | constant | expr )
                    int alt45=4;
                    alt45 = dfa45.predict(input);
                    switch (alt45) {
                        case 1 :
                            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:182:4: constructor_java_call
                            {
                            pushFollow(FOLLOW_constructor_java_call_in_binary_operation1135);
                            constructor_java_call109=constructor_java_call();

                            state._fsp--;

                            adaptor.addChild(root_0, constructor_java_call109.getTree());

                            }
                            break;
                        case 2 :
                            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:183:6: prova_list
                            {
                            pushFollow(FOLLOW_prova_list_in_binary_operation1142);
                            prova_list110=prova_list();

                            state._fsp--;

                            adaptor.addChild(root_0, prova_list110.getTree());

                            }
                            break;
                        case 3 :
                            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:184:6: constant
                            {
                            pushFollow(FOLLOW_constant_in_binary_operation1149);
                            constant111=constant();

                            state._fsp--;

                            adaptor.addChild(root_0, constant111.getTree());

                            }
                            break;
                        case 4 :
                            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:185:6: expr
                            {
                            pushFollow(FOLLOW_expr_in_binary_operation1156);
                            expr112=expr();

                            state._fsp--;

                            adaptor.addChild(root_0, expr112.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:187:5: not_equal constant
                    {
                    pushFollow(FOLLOW_not_equal_in_binary_operation1167);
                    not_equal113=not_equal();

                    state._fsp--;

                    adaptor.addChild(root_0, not_equal113.getTree());
                    pushFollow(FOLLOW_constant_in_binary_operation1169);
                    constant114=constant();

                    state._fsp--;

                    adaptor.addChild(root_0, constant114.getTree());

                    }
                    break;
                case 3 :
                    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:188:5: binary_operator expr
                    {
                    pushFollow(FOLLOW_binary_operator_in_binary_operation1175);
                    binary_operator115=binary_operator();

                    state._fsp--;

                    adaptor.addChild(root_0, binary_operator115.getTree());
                    pushFollow(FOLLOW_expr_in_binary_operation1177);
                    expr116=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr116.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (ProvaAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ProvaAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "binary_operation"

    public static class expr_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr"
    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:191:1: expr : aterm ( ( PLUS | MINUS ) expr )? ;
    public final Prova2Parser.expr_return expr() throws RecognitionException {
        Prova2Parser.expr_return retval = new Prova2Parser.expr_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token set118=null;
        Prova2Parser.aterm_return aterm117 = null;

        Prova2Parser.expr_return expr119 = null;


        ProvaAST set118_tree=null;

        try {
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:191:6: ( aterm ( ( PLUS | MINUS ) expr )? )
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:191:8: aterm ( ( PLUS | MINUS ) expr )?
            {
            root_0 = (ProvaAST)adaptor.nil();

            pushFollow(FOLLOW_aterm_in_expr1189);
            aterm117=aterm();

            state._fsp--;

            adaptor.addChild(root_0, aterm117.getTree());
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:191:14: ( ( PLUS | MINUS ) expr )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( ((LA47_0>=PLUS && LA47_0<=MINUS)) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:191:15: ( PLUS | MINUS ) expr
                    {
                    set118=(Token)input.LT(1);
                    if ( (input.LA(1)>=PLUS && input.LA(1)<=MINUS) ) {
                        input.consume();
                        adaptor.addChild(root_0, (ProvaAST)adaptor.create(set118));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_expr_in_expr1200);
                    expr119=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr119.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (ProvaAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ProvaAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expr"

    public static class aterm_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "aterm"
    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:193:1: aterm : ( ( MINUS )? variable | number | ( MINUS )? predicate_java_call | OPEN expr CLOSE ) ( ( MULT | DIV | REM ) aterm )? ;
    public final Prova2Parser.aterm_return aterm() throws RecognitionException {
        Prova2Parser.aterm_return retval = new Prova2Parser.aterm_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token MINUS120=null;
        Token MINUS123=null;
        Token OPEN125=null;
        Token CLOSE127=null;
        Token set128=null;
        Prova2Parser.variable_return variable121 = null;

        Prova2Parser.number_return number122 = null;

        Prova2Parser.predicate_java_call_return predicate_java_call124 = null;

        Prova2Parser.expr_return expr126 = null;

        Prova2Parser.aterm_return aterm129 = null;


        ProvaAST MINUS120_tree=null;
        ProvaAST MINUS123_tree=null;
        ProvaAST OPEN125_tree=null;
        ProvaAST CLOSE127_tree=null;
        ProvaAST set128_tree=null;

        try {
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:193:7: ( ( ( MINUS )? variable | number | ( MINUS )? predicate_java_call | OPEN expr CLOSE ) ( ( MULT | DIV | REM ) aterm )? )
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:193:9: ( ( MINUS )? variable | number | ( MINUS )? predicate_java_call | OPEN expr CLOSE ) ( ( MULT | DIV | REM ) aterm )?
            {
            root_0 = (ProvaAST)adaptor.nil();

            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:193:9: ( ( MINUS )? variable | number | ( MINUS )? predicate_java_call | OPEN expr CLOSE )
            int alt50=4;
            alt50 = dfa50.predict(input);
            switch (alt50) {
                case 1 :
                    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:193:10: ( MINUS )? variable
                    {
                    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:193:10: ( MINUS )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==MINUS) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:193:10: MINUS
                            {
                            MINUS120=(Token)match(input,MINUS,FOLLOW_MINUS_in_aterm1212); 
                            MINUS120_tree = (ProvaAST)adaptor.create(MINUS120);
                            adaptor.addChild(root_0, MINUS120_tree);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_variable_in_aterm1215);
                    variable121=variable();

                    state._fsp--;

                    adaptor.addChild(root_0, variable121.getTree());

                    }
                    break;
                case 2 :
                    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:193:28: number
                    {
                    pushFollow(FOLLOW_number_in_aterm1219);
                    number122=number();

                    state._fsp--;

                    adaptor.addChild(root_0, number122.getTree());

                    }
                    break;
                case 3 :
                    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:193:37: ( MINUS )? predicate_java_call
                    {
                    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:193:37: ( MINUS )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==MINUS) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:193:37: MINUS
                            {
                            MINUS123=(Token)match(input,MINUS,FOLLOW_MINUS_in_aterm1223); 
                            MINUS123_tree = (ProvaAST)adaptor.create(MINUS123);
                            adaptor.addChild(root_0, MINUS123_tree);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_predicate_java_call_in_aterm1226);
                    predicate_java_call124=predicate_java_call();

                    state._fsp--;

                    adaptor.addChild(root_0, predicate_java_call124.getTree());

                    }
                    break;
                case 4 :
                    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:193:66: OPEN expr CLOSE
                    {
                    OPEN125=(Token)match(input,OPEN,FOLLOW_OPEN_in_aterm1230); 
                    OPEN125_tree = (ProvaAST)adaptor.create(OPEN125);
                    adaptor.addChild(root_0, OPEN125_tree);

                    pushFollow(FOLLOW_expr_in_aterm1232);
                    expr126=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr126.getTree());
                    CLOSE127=(Token)match(input,CLOSE,FOLLOW_CLOSE_in_aterm1234); 
                    CLOSE127_tree = (ProvaAST)adaptor.create(CLOSE127);
                    adaptor.addChild(root_0, CLOSE127_tree);


                    }
                    break;

            }

            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:193:83: ( ( MULT | DIV | REM ) aterm )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( ((LA51_0>=MULT && LA51_0<=DIV)||LA51_0==REM) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:193:84: ( MULT | DIV | REM ) aterm
                    {
                    set128=(Token)input.LT(1);
                    if ( (input.LA(1)>=MULT && input.LA(1)<=DIV)||input.LA(1)==REM ) {
                        input.consume();
                        adaptor.addChild(root_0, (ProvaAST)adaptor.create(set128));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_aterm_in_aterm1252);
                    aterm129=aterm();

                    state._fsp--;

                    adaptor.addChild(root_0, aterm129.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (ProvaAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ProvaAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "aterm"

    public static class constructor_java_call_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constructor_java_call"
    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:195:1: constructor_java_call : ( qualified_java_class | UCWORD ) args ;
    public final Prova2Parser.constructor_java_call_return constructor_java_call() throws RecognitionException {
        Prova2Parser.constructor_java_call_return retval = new Prova2Parser.constructor_java_call_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token UCWORD131=null;
        Prova2Parser.qualified_java_class_return qualified_java_class130 = null;

        Prova2Parser.args_return args132 = null;


        ProvaAST UCWORD131_tree=null;

        try {
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:196:2: ( ( qualified_java_class | UCWORD ) args )
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:196:4: ( qualified_java_class | UCWORD ) args
            {
            root_0 = (ProvaAST)adaptor.nil();

            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:196:4: ( qualified_java_class | UCWORD )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==LCWORD) ) {
                alt52=1;
            }
            else if ( (LA52_0==UCWORD) ) {
                alt52=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:196:5: qualified_java_class
                    {
                    pushFollow(FOLLOW_qualified_java_class_in_constructor_java_call1264);
                    qualified_java_class130=qualified_java_class();

                    state._fsp--;

                    adaptor.addChild(root_0, qualified_java_class130.getTree());

                    }
                    break;
                case 2 :
                    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:196:28: UCWORD
                    {
                    UCWORD131=(Token)match(input,UCWORD,FOLLOW_UCWORD_in_constructor_java_call1268); 
                    UCWORD131_tree = (ProvaAST)adaptor.create(UCWORD131);
                    adaptor.addChild(root_0, UCWORD131_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_args_in_constructor_java_call1271);
            args132=args();

            state._fsp--;

            adaptor.addChild(root_0, args132.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (ProvaAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ProvaAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "constructor_java_call"

    public static class predicate_java_call_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "predicate_java_call"
    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:199:1: predicate_java_call : ( static_java_call | instance_java_call );
    public final Prova2Parser.predicate_java_call_return predicate_java_call() throws RecognitionException {
        Prova2Parser.predicate_java_call_return retval = new Prova2Parser.predicate_java_call_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Prova2Parser.static_java_call_return static_java_call133 = null;

        Prova2Parser.instance_java_call_return instance_java_call134 = null;



        try {
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:200:2: ( static_java_call | instance_java_call )
            int alt53=2;
            alt53 = dfa53.predict(input);
            switch (alt53) {
                case 1 :
                    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:200:4: static_java_call
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_static_java_call_in_predicate_java_call1282);
                    static_java_call133=static_java_call();

                    state._fsp--;

                    adaptor.addChild(root_0, static_java_call133.getTree());

                    }
                    break;
                case 2 :
                    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:200:23: instance_java_call
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_instance_java_call_in_predicate_java_call1286);
                    instance_java_call134=instance_java_call();

                    state._fsp--;

                    adaptor.addChild(root_0, instance_java_call134.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (ProvaAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ProvaAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "predicate_java_call"

    public static class instance_java_call_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "instance_java_call"
    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:203:1: instance_java_call : instance_call args -> ^( INSTANCE_JAVA_CALL instance_call args ) ;
    public final Prova2Parser.instance_java_call_return instance_java_call() throws RecognitionException {
        Prova2Parser.instance_java_call_return retval = new Prova2Parser.instance_java_call_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Prova2Parser.instance_call_return instance_call135 = null;

        Prova2Parser.args_return args136 = null;


        RewriteRuleSubtreeStream stream_instance_call=new RewriteRuleSubtreeStream(adaptor,"rule instance_call");
        RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"rule args");
        try {
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:204:2: ( instance_call args -> ^( INSTANCE_JAVA_CALL instance_call args ) )
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:204:4: instance_call args
            {
            pushFollow(FOLLOW_instance_call_in_instance_java_call1297);
            instance_call135=instance_call();

            state._fsp--;

            stream_instance_call.add(instance_call135.getTree());
            pushFollow(FOLLOW_args_in_instance_java_call1299);
            args136=args();

            state._fsp--;

            stream_args.add(args136.getTree());


            // AST REWRITE
            // elements: instance_call, args
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ProvaAST)adaptor.nil();
            // 204:23: -> ^( INSTANCE_JAVA_CALL instance_call args )
            {
                // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:204:26: ^( INSTANCE_JAVA_CALL instance_call args )
                {
                ProvaAST root_1 = (ProvaAST)adaptor.nil();
                root_1 = (ProvaAST)adaptor.becomeRoot((ProvaAST)adaptor.create(INSTANCE_JAVA_CALL, "INSTANCE_JAVA_CALL"), root_1);

                adaptor.addChild(root_1, stream_instance_call.nextTree());
                adaptor.addChild(root_1, stream_args.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (ProvaAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ProvaAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "instance_java_call"

    public static class static_java_call_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "static_java_call"
    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:207:1: static_java_call : static_call args -> ^( STATIC_JAVA_CALL static_call args ) ;
    public final Prova2Parser.static_java_call_return static_java_call() throws RecognitionException {
        Prova2Parser.static_java_call_return retval = new Prova2Parser.static_java_call_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Prova2Parser.static_call_return static_call137 = null;

        Prova2Parser.args_return args138 = null;


        RewriteRuleSubtreeStream stream_static_call=new RewriteRuleSubtreeStream(adaptor,"rule static_call");
        RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"rule args");
        try {
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:208:2: ( static_call args -> ^( STATIC_JAVA_CALL static_call args ) )
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:208:4: static_call args
            {
            pushFollow(FOLLOW_static_call_in_static_java_call1320);
            static_call137=static_call();

            state._fsp--;

            stream_static_call.add(static_call137.getTree());
            pushFollow(FOLLOW_args_in_static_java_call1322);
            args138=args();

            state._fsp--;

            stream_args.add(args138.getTree());


            // AST REWRITE
            // elements: args, static_call
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ProvaAST)adaptor.nil();
            // 208:21: -> ^( STATIC_JAVA_CALL static_call args )
            {
                // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:208:24: ^( STATIC_JAVA_CALL static_call args )
                {
                ProvaAST root_1 = (ProvaAST)adaptor.nil();
                root_1 = (ProvaAST)adaptor.becomeRoot((ProvaAST)adaptor.create(STATIC_JAVA_CALL, "STATIC_JAVA_CALL"), root_1);

                adaptor.addChild(root_1, stream_static_call.nextTree());
                adaptor.addChild(root_1, stream_args.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (ProvaAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ProvaAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "static_java_call"

    public static class method_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "method"
    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:211:1: method : LCWORD ;
    public final Prova2Parser.method_return method() throws RecognitionException {
        Prova2Parser.method_return retval = new Prova2Parser.method_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token LCWORD139=null;

        ProvaAST LCWORD139_tree=null;

        try {
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:211:9: ( LCWORD )
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:211:11: LCWORD
            {
            root_0 = (ProvaAST)adaptor.nil();

            LCWORD139=(Token)match(input,LCWORD,FOLLOW_LCWORD_in_method1343); 
            LCWORD139_tree = (ProvaAST)adaptor.create(LCWORD139);
            adaptor.addChild(root_0, LCWORD139_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (ProvaAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ProvaAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "method"

    public static class func_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "func"
    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:213:1: func : ( LCWORD | UCWORD | string | typed_variable );
    public final Prova2Parser.func_return func() throws RecognitionException {
        Prova2Parser.func_return retval = new Prova2Parser.func_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token LCWORD140=null;
        Token UCWORD141=null;
        Prova2Parser.string_return string142 = null;

        Prova2Parser.typed_variable_return typed_variable143 = null;


        ProvaAST LCWORD140_tree=null;
        ProvaAST UCWORD141_tree=null;

        try {
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:213:6: ( LCWORD | UCWORD | string | typed_variable )
            int alt54=4;
            switch ( input.LA(1) ) {
            case LCWORD:
                {
                int LA54_1 = input.LA(2);

                if ( (LA54_1==DOT) ) {
                    alt54=4;
                }
                else if ( (LA54_1==OPEN) ) {
                    alt54=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 54, 1, input);

                    throw nvae;
                }
                }
                break;
            case UCWORD:
                {
                int LA54_2 = input.LA(2);

                if ( (LA54_2==DOT) ) {
                    alt54=4;
                }
                else if ( (LA54_2==OPEN) ) {
                    alt54=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 54, 2, input);

                    throw nvae;
                }
                }
                break;
            case STRING1:
            case STRING2:
                {
                alt54=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }

            switch (alt54) {
                case 1 :
                    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:213:8: LCWORD
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    LCWORD140=(Token)match(input,LCWORD,FOLLOW_LCWORD_in_func1351); 
                    LCWORD140_tree = (ProvaAST)adaptor.create(LCWORD140);
                    adaptor.addChild(root_0, LCWORD140_tree);


                    }
                    break;
                case 2 :
                    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:213:17: UCWORD
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    UCWORD141=(Token)match(input,UCWORD,FOLLOW_UCWORD_in_func1355); 
                    UCWORD141_tree = (ProvaAST)adaptor.create(UCWORD141);
                    adaptor.addChild(root_0, UCWORD141_tree);


                    }
                    break;
                case 3 :
                    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:213:26: string
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_string_in_func1359);
                    string142=string();

                    state._fsp--;

                    adaptor.addChild(root_0, string142.getTree());

                    }
                    break;
                case 4 :
                    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:213:35: typed_variable
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_typed_variable_in_func1363);
                    typed_variable143=typed_variable();

                    state._fsp--;

                    adaptor.addChild(root_0, typed_variable143.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (ProvaAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ProvaAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "func"

    public static class predicate_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "predicate"
    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:215:1: predicate : ( LCWORD | UCWORD | string );
    public final Prova2Parser.predicate_return predicate() throws RecognitionException {
        Prova2Parser.predicate_return retval = new Prova2Parser.predicate_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token LCWORD144=null;
        Token UCWORD145=null;
        Prova2Parser.string_return string146 = null;


        ProvaAST LCWORD144_tree=null;
        ProvaAST UCWORD145_tree=null;

        try {
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:216:2: ( LCWORD | UCWORD | string )
            int alt55=3;
            switch ( input.LA(1) ) {
            case LCWORD:
                {
                alt55=1;
                }
                break;
            case UCWORD:
                {
                alt55=2;
                }
                break;
            case STRING1:
            case STRING2:
                {
                alt55=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }

            switch (alt55) {
                case 1 :
                    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:216:4: LCWORD
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    LCWORD144=(Token)match(input,LCWORD,FOLLOW_LCWORD_in_predicate1373); 
                    LCWORD144_tree = (ProvaAST)adaptor.create(LCWORD144);
                    adaptor.addChild(root_0, LCWORD144_tree);


                    }
                    break;
                case 2 :
                    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:216:13: UCWORD
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    UCWORD145=(Token)match(input,UCWORD,FOLLOW_UCWORD_in_predicate1377); 
                    UCWORD145_tree = (ProvaAST)adaptor.create(UCWORD145);
                    adaptor.addChild(root_0, UCWORD145_tree);


                    }
                    break;
                case 3 :
                    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:216:22: string
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_string_in_predicate1381);
                    string146=string();

                    state._fsp--;

                    adaptor.addChild(root_0, string146.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (ProvaAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ProvaAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "predicate"

    public static class variable_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variable"
    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:218:1: variable : ( UCWORD | USWORD | typed_variable | DOLLARWORD );
    public final Prova2Parser.variable_return variable() throws RecognitionException {
        Prova2Parser.variable_return retval = new Prova2Parser.variable_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token UCWORD147=null;
        Token USWORD148=null;
        Token DOLLARWORD150=null;
        Prova2Parser.typed_variable_return typed_variable149 = null;


        ProvaAST UCWORD147_tree=null;
        ProvaAST USWORD148_tree=null;
        ProvaAST DOLLARWORD150_tree=null;

        try {
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:218:9: ( UCWORD | USWORD | typed_variable | DOLLARWORD )
            int alt56=4;
            switch ( input.LA(1) ) {
            case UCWORD:
                {
                int LA56_1 = input.LA(2);

                if ( (LA56_1==DOT) ) {
                    switch ( input.LA(3) ) {
                    case EOF:
                    case NEWLINE:
                        {
                        alt56=1;
                        }
                        break;
                    case LCWORD:
                        {
                        int LA56_7 = input.LA(4);

                        if ( (LA56_7==OPEN) ) {
                            alt56=1;
                        }
                        else if ( (LA56_7==EOF||(LA56_7>=DOT && LA56_7<=COMMA)||(LA56_7>=CLOSE && LA56_7<=GE)||LA56_7==REM||LA56_7==NEWLINE||LA56_7==71) ) {
                            alt56=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 56, 7, input);

                            throw nvae;
                        }
                        }
                        break;
                    case UCWORD:
                        {
                        alt56=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 56, 5, input);

                        throw nvae;
                    }

                }
                else if ( (LA56_1==EOF||(LA56_1>=PLUS && LA56_1<=COMMA)||(LA56_1>=CLOSE && LA56_1<=GE)||LA56_1==REM||LA56_1==NEWLINE||LA56_1==71) ) {
                    alt56=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 56, 1, input);

                    throw nvae;
                }
                }
                break;
            case USWORD:
                {
                alt56=2;
                }
                break;
            case LCWORD:
                {
                alt56=3;
                }
                break;
            case DOLLARWORD:
                {
                alt56=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }

            switch (alt56) {
                case 1 :
                    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:218:11: UCWORD
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    UCWORD147=(Token)match(input,UCWORD,FOLLOW_UCWORD_in_variable1388); 
                    UCWORD147_tree = (ProvaAST)adaptor.create(UCWORD147);
                    adaptor.addChild(root_0, UCWORD147_tree);


                    }
                    break;
                case 2 :
                    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:218:20: USWORD
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    USWORD148=(Token)match(input,USWORD,FOLLOW_USWORD_in_variable1392); 
                    USWORD148_tree = (ProvaAST)adaptor.create(USWORD148);
                    adaptor.addChild(root_0, USWORD148_tree);


                    }
                    break;
                case 3 :
                    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:218:29: typed_variable
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_typed_variable_in_variable1396);
                    typed_variable149=typed_variable();

                    state._fsp--;

                    adaptor.addChild(root_0, typed_variable149.getTree());

                    }
                    break;
                case 4 :
                    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:218:46: DOLLARWORD
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    DOLLARWORD150=(Token)match(input,DOLLARWORD,FOLLOW_DOLLARWORD_in_variable1400); 
                    DOLLARWORD150_tree = (ProvaAST)adaptor.create(DOLLARWORD150);
                    adaptor.addChild(root_0, DOLLARWORD150_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (ProvaAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ProvaAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "variable"

    public static class variable_or_number_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variable_or_number"
    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:220:1: variable_or_number : ( variable | number );
    public final Prova2Parser.variable_or_number_return variable_or_number() throws RecognitionException {
        Prova2Parser.variable_or_number_return retval = new Prova2Parser.variable_or_number_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Prova2Parser.variable_return variable151 = null;

        Prova2Parser.number_return number152 = null;



        try {
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:221:2: ( variable | number )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==USWORD||LA57_0==DOLLARWORD||(LA57_0>=LCWORD && LA57_0<=UCWORD)) ) {
                alt57=1;
            }
            else if ( (LA57_0==MINUS||(LA57_0>=INT_LITERAL && LA57_0<=LONG_LITERAL)) ) {
                alt57=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:221:4: variable
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_variable_in_variable_or_number1410);
                    variable151=variable();

                    state._fsp--;

                    adaptor.addChild(root_0, variable151.getTree());

                    }
                    break;
                case 2 :
                    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:221:15: number
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_number_in_variable_or_number1414);
                    number152=number();

                    state._fsp--;

                    adaptor.addChild(root_0, number152.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (ProvaAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ProvaAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "variable_or_number"

    public static class word_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "word"
    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:223:1: word : ( LCWORD | UCWORD );
    public final Prova2Parser.word_return word() throws RecognitionException {
        Prova2Parser.word_return retval = new Prova2Parser.word_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token set153=null;

        ProvaAST set153_tree=null;

        try {
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:223:6: ( LCWORD | UCWORD )
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:
            {
            root_0 = (ProvaAST)adaptor.nil();

            set153=(Token)input.LT(1);
            if ( (input.LA(1)>=LCWORD && input.LA(1)<=UCWORD) ) {
                input.consume();
                adaptor.addChild(root_0, (ProvaAST)adaptor.create(set153));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (ProvaAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ProvaAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "word"

    public static class typed_variable_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typed_variable"
    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:228:1: typed_variable : ( qualified_java_class DOT word -> ^( TYPED_VARIABLE qualified_java_class word ) | UCWORD DOT word -> ^( TYPED_VARIABLE UCWORD word ) );
    public final Prova2Parser.typed_variable_return typed_variable() throws RecognitionException {
        Prova2Parser.typed_variable_return retval = new Prova2Parser.typed_variable_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token DOT155=null;
        Token UCWORD157=null;
        Token DOT158=null;
        Prova2Parser.qualified_java_class_return qualified_java_class154 = null;

        Prova2Parser.word_return word156 = null;

        Prova2Parser.word_return word159 = null;


        ProvaAST DOT155_tree=null;
        ProvaAST UCWORD157_tree=null;
        ProvaAST DOT158_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_UCWORD=new RewriteRuleTokenStream(adaptor,"token UCWORD");
        RewriteRuleSubtreeStream stream_qualified_java_class=new RewriteRuleSubtreeStream(adaptor,"rule qualified_java_class");
        RewriteRuleSubtreeStream stream_word=new RewriteRuleSubtreeStream(adaptor,"rule word");
        try {
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:229:2: ( qualified_java_class DOT word -> ^( TYPED_VARIABLE qualified_java_class word ) | UCWORD DOT word -> ^( TYPED_VARIABLE UCWORD word ) )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==LCWORD) ) {
                alt58=1;
            }
            else if ( (LA58_0==UCWORD) ) {
                alt58=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:230:3: qualified_java_class DOT word
                    {
                    pushFollow(FOLLOW_qualified_java_class_in_typed_variable1441);
                    qualified_java_class154=qualified_java_class();

                    state._fsp--;

                    stream_qualified_java_class.add(qualified_java_class154.getTree());
                    DOT155=(Token)match(input,DOT,FOLLOW_DOT_in_typed_variable1443);  
                    stream_DOT.add(DOT155);

                    pushFollow(FOLLOW_word_in_typed_variable1445);
                    word156=word();

                    state._fsp--;

                    stream_word.add(word156.getTree());


                    // AST REWRITE
                    // elements: qualified_java_class, word
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ProvaAST)adaptor.nil();
                    // 230:33: -> ^( TYPED_VARIABLE qualified_java_class word )
                    {
                        // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:230:36: ^( TYPED_VARIABLE qualified_java_class word )
                        {
                        ProvaAST root_1 = (ProvaAST)adaptor.nil();
                        root_1 = (ProvaAST)adaptor.becomeRoot((ProvaAST)adaptor.create(TYPED_VARIABLE, "TYPED_VARIABLE"), root_1);

                        adaptor.addChild(root_1, stream_qualified_java_class.nextTree());
                        adaptor.addChild(root_1, stream_word.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:231:5: UCWORD DOT word
                    {
                    UCWORD157=(Token)match(input,UCWORD,FOLLOW_UCWORD_in_typed_variable1461);  
                    stream_UCWORD.add(UCWORD157);

                    DOT158=(Token)match(input,DOT,FOLLOW_DOT_in_typed_variable1463);  
                    stream_DOT.add(DOT158);

                    pushFollow(FOLLOW_word_in_typed_variable1465);
                    word159=word();

                    state._fsp--;

                    stream_word.add(word159.getTree());


                    // AST REWRITE
                    // elements: UCWORD, word
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ProvaAST)adaptor.nil();
                    // 231:21: -> ^( TYPED_VARIABLE UCWORD word )
                    {
                        // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:231:24: ^( TYPED_VARIABLE UCWORD word )
                        {
                        ProvaAST root_1 = (ProvaAST)adaptor.nil();
                        root_1 = (ProvaAST)adaptor.becomeRoot((ProvaAST)adaptor.create(TYPED_VARIABLE, "TYPED_VARIABLE"), root_1);

                        adaptor.addChild(root_1, stream_UCWORD.nextNode());
                        adaptor.addChild(root_1, stream_word.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (ProvaAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ProvaAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "typed_variable"

    public static class instance_call_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "instance_call"
    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:236:1: instance_call : variable DOT LCWORD -> variable LCWORD ;
    public final Prova2Parser.instance_call_return instance_call() throws RecognitionException {
        Prova2Parser.instance_call_return retval = new Prova2Parser.instance_call_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token DOT161=null;
        Token LCWORD162=null;
        Prova2Parser.variable_return variable160 = null;


        ProvaAST DOT161_tree=null;
        ProvaAST LCWORD162_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_LCWORD=new RewriteRuleTokenStream(adaptor,"token LCWORD");
        RewriteRuleSubtreeStream stream_variable=new RewriteRuleSubtreeStream(adaptor,"rule variable");
        try {
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:237:2: ( variable DOT LCWORD -> variable LCWORD )
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:237:4: variable DOT LCWORD
            {
            pushFollow(FOLLOW_variable_in_instance_call1487);
            variable160=variable();

            state._fsp--;

            stream_variable.add(variable160.getTree());
            DOT161=(Token)match(input,DOT,FOLLOW_DOT_in_instance_call1489);  
            stream_DOT.add(DOT161);

            LCWORD162=(Token)match(input,LCWORD,FOLLOW_LCWORD_in_instance_call1491);  
            stream_LCWORD.add(LCWORD162);



            // AST REWRITE
            // elements: LCWORD, variable
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ProvaAST)adaptor.nil();
            // 237:24: -> variable LCWORD
            {
                adaptor.addChild(root_0, stream_variable.nextTree());
                adaptor.addChild(root_0, stream_LCWORD.nextNode());

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (ProvaAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ProvaAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "instance_call"

    public static class static_call_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "static_call"
    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:240:1: static_call : ( qualified_java_class DOT LCWORD ) -> qualified_java_class LCWORD ;
    public final Prova2Parser.static_call_return static_call() throws RecognitionException {
        Prova2Parser.static_call_return retval = new Prova2Parser.static_call_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token DOT164=null;
        Token LCWORD165=null;
        Prova2Parser.qualified_java_class_return qualified_java_class163 = null;


        ProvaAST DOT164_tree=null;
        ProvaAST LCWORD165_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_LCWORD=new RewriteRuleTokenStream(adaptor,"token LCWORD");
        RewriteRuleSubtreeStream stream_qualified_java_class=new RewriteRuleSubtreeStream(adaptor,"rule qualified_java_class");
        try {
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:241:2: ( ( qualified_java_class DOT LCWORD ) -> qualified_java_class LCWORD )
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:241:4: ( qualified_java_class DOT LCWORD )
            {
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:241:4: ( qualified_java_class DOT LCWORD )
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:241:5: qualified_java_class DOT LCWORD
            {
            pushFollow(FOLLOW_qualified_java_class_in_static_call1509);
            qualified_java_class163=qualified_java_class();

            state._fsp--;

            stream_qualified_java_class.add(qualified_java_class163.getTree());
            DOT164=(Token)match(input,DOT,FOLLOW_DOT_in_static_call1511);  
            stream_DOT.add(DOT164);

            LCWORD165=(Token)match(input,LCWORD,FOLLOW_LCWORD_in_static_call1513);  
            stream_LCWORD.add(LCWORD165);


            }



            // AST REWRITE
            // elements: qualified_java_class, LCWORD
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ProvaAST)adaptor.nil();
            // 241:38: -> qualified_java_class LCWORD
            {
                adaptor.addChild(root_0, stream_qualified_java_class.nextTree());
                adaptor.addChild(root_0, stream_LCWORD.nextNode());

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (ProvaAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ProvaAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "static_call"

    public static class pos_number_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pos_number"
    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:244:1: pos_number : ( INT_LITERAL | LONG_LITERAL | float_literal );
    public final Prova2Parser.pos_number_return pos_number() throws RecognitionException {
        Prova2Parser.pos_number_return retval = new Prova2Parser.pos_number_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token INT_LITERAL166=null;
        Token LONG_LITERAL167=null;
        Prova2Parser.float_literal_return float_literal168 = null;


        ProvaAST INT_LITERAL166_tree=null;
        ProvaAST LONG_LITERAL167_tree=null;

        try {
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:244:12: ( INT_LITERAL | LONG_LITERAL | float_literal )
            int alt59=3;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==INT_LITERAL) ) {
                int LA59_1 = input.LA(2);

                if ( (LA59_1==DOT) ) {
                    int LA59_3 = input.LA(3);

                    if ( (LA59_3==INT_LITERAL) ) {
                        alt59=3;
                    }
                    else if ( (LA59_3==EOF||LA59_3==NEWLINE) ) {
                        alt59=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 59, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA59_1==EOF||(LA59_1>=PLUS && LA59_1<=COMMA)||(LA59_1>=CLOSE && LA59_1<=GE)||LA59_1==REM||LA59_1==NEWLINE||LA59_1==71) ) {
                    alt59=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 59, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA59_0==LONG_LITERAL) ) {
                alt59=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:244:14: INT_LITERAL
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    INT_LITERAL166=(Token)match(input,INT_LITERAL,FOLLOW_INT_LITERAL_in_pos_number1529); 
                    INT_LITERAL166_tree = (ProvaAST)adaptor.create(INT_LITERAL166);
                    adaptor.addChild(root_0, INT_LITERAL166_tree);


                    }
                    break;
                case 2 :
                    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:244:28: LONG_LITERAL
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    LONG_LITERAL167=(Token)match(input,LONG_LITERAL,FOLLOW_LONG_LITERAL_in_pos_number1533); 
                    LONG_LITERAL167_tree = (ProvaAST)adaptor.create(LONG_LITERAL167);
                    adaptor.addChild(root_0, LONG_LITERAL167_tree);


                    }
                    break;
                case 3 :
                    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:244:43: float_literal
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_float_literal_in_pos_number1537);
                    float_literal168=float_literal();

                    state._fsp--;

                    adaptor.addChild(root_0, float_literal168.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (ProvaAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ProvaAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "pos_number"

    public static class number_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "number"
    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:246:1: number : ( '-' )? pos_number ;
    public final Prova2Parser.number_return number() throws RecognitionException {
        Prova2Parser.number_return retval = new Prova2Parser.number_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token char_literal169=null;
        Prova2Parser.pos_number_return pos_number170 = null;


        ProvaAST char_literal169_tree=null;

        try {
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:247:2: ( ( '-' )? pos_number )
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:247:4: ( '-' )? pos_number
            {
            root_0 = (ProvaAST)adaptor.nil();

            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:247:4: ( '-' )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==MINUS) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:247:5: '-'
                    {
                    char_literal169=(Token)match(input,MINUS,FOLLOW_MINUS_in_number1548); 
                    char_literal169_tree = (ProvaAST)adaptor.create(char_literal169);
                    adaptor.addChild(root_0, char_literal169_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_pos_number_in_number1552);
            pos_number170=pos_number();

            state._fsp--;

            adaptor.addChild(root_0, pos_number170.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (ProvaAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ProvaAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "number"

    public static class mstring_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mstring"
    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:249:1: mstring : ( LCWORD | string );
    public final Prova2Parser.mstring_return mstring() throws RecognitionException {
        Prova2Parser.mstring_return retval = new Prova2Parser.mstring_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token LCWORD171=null;
        Prova2Parser.string_return string172 = null;


        ProvaAST LCWORD171_tree=null;

        try {
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:249:10: ( LCWORD | string )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==LCWORD) ) {
                alt61=1;
            }
            else if ( ((LA61_0>=STRING1 && LA61_0<=STRING2)) ) {
                alt61=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:250:2: LCWORD
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    LCWORD171=(Token)match(input,LCWORD,FOLLOW_LCWORD_in_mstring1562); 
                    LCWORD171_tree = (ProvaAST)adaptor.create(LCWORD171);
                    adaptor.addChild(root_0, LCWORD171_tree);


                    }
                    break;
                case 2 :
                    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:250:11: string
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_string_in_mstring1566);
                    string172=string();

                    state._fsp--;

                    adaptor.addChild(root_0, string172.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (ProvaAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ProvaAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "mstring"

    public static class constant_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constant"
    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:252:1: constant : ( LCWORD | string | qualified_java_class );
    public final Prova2Parser.constant_return constant() throws RecognitionException {
        Prova2Parser.constant_return retval = new Prova2Parser.constant_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token LCWORD173=null;
        Prova2Parser.string_return string174 = null;

        Prova2Parser.qualified_java_class_return qualified_java_class175 = null;


        ProvaAST LCWORD173_tree=null;

        try {
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:252:10: ( LCWORD | string | qualified_java_class )
            int alt62=3;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==LCWORD) ) {
                int LA62_1 = input.LA(2);

                if ( (LA62_1==DOT) ) {
                    int LA62_3 = input.LA(3);

                    if ( (LA62_3==EOF||LA62_3==NEWLINE) ) {
                        alt62=1;
                    }
                    else if ( ((LA62_3>=LCWORD && LA62_3<=UCWORD)) ) {
                        alt62=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 62, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA62_1==EOF||LA62_1==COMMA||(LA62_1>=OPEN && LA62_1<=GE)||LA62_1==NEWLINE||LA62_1==71) ) {
                    alt62=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 62, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA62_0>=STRING1 && LA62_0<=STRING2)) ) {
                alt62=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:253:2: LCWORD
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    LCWORD173=(Token)match(input,LCWORD,FOLLOW_LCWORD_in_constant1576); 
                    LCWORD173_tree = (ProvaAST)adaptor.create(LCWORD173);
                    adaptor.addChild(root_0, LCWORD173_tree);


                    }
                    break;
                case 2 :
                    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:253:11: string
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_string_in_constant1580);
                    string174=string();

                    state._fsp--;

                    adaptor.addChild(root_0, string174.getTree());

                    }
                    break;
                case 3 :
                    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:253:20: qualified_java_class
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_qualified_java_class_in_constant1584);
                    qualified_java_class175=qualified_java_class();

                    state._fsp--;

                    adaptor.addChild(root_0, qualified_java_class175.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (ProvaAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ProvaAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "constant"

    public static class string_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "string"
    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:255:1: string : ( STRING1 | STRING2 );
    public final Prova2Parser.string_return string() throws RecognitionException {
        Prova2Parser.string_return retval = new Prova2Parser.string_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token set176=null;

        ProvaAST set176_tree=null;

        try {
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:255:8: ( STRING1 | STRING2 )
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:
            {
            root_0 = (ProvaAST)adaptor.nil();

            set176=(Token)input.LT(1);
            if ( (input.LA(1)>=STRING1 && input.LA(1)<=STRING2) ) {
                input.consume();
                adaptor.addChild(root_0, (ProvaAST)adaptor.create(set176));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (ProvaAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ProvaAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "string"

    public static class not_equal_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "not_equal"
    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:257:1: not_equal : ( NOT_EQUAL1 | NOT_EQUAL2 );
    public final Prova2Parser.not_equal_return not_equal() throws RecognitionException {
        Prova2Parser.not_equal_return retval = new Prova2Parser.not_equal_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token set177=null;

        ProvaAST set177_tree=null;

        try {
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:258:2: ( NOT_EQUAL1 | NOT_EQUAL2 )
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:
            {
            root_0 = (ProvaAST)adaptor.nil();

            set177=(Token)input.LT(1);
            if ( (input.LA(1)>=NOT_EQUAL1 && input.LA(1)<=NOT_EQUAL2) ) {
                input.consume();
                adaptor.addChild(root_0, (ProvaAST)adaptor.create(set177));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (ProvaAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ProvaAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "not_equal"

    public static class float_literal_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "float_literal"
    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:261:1: float_literal : INT_LITERAL DOT INT_LITERAL ( EXPONENT )? ;
    public final Prova2Parser.float_literal_return float_literal() throws RecognitionException {
        Prova2Parser.float_literal_return retval = new Prova2Parser.float_literal_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token INT_LITERAL178=null;
        Token DOT179=null;
        Token INT_LITERAL180=null;
        Token EXPONENT181=null;

        ProvaAST INT_LITERAL178_tree=null;
        ProvaAST DOT179_tree=null;
        ProvaAST INT_LITERAL180_tree=null;
        ProvaAST EXPONENT181_tree=null;

        try {
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:261:16: ( INT_LITERAL DOT INT_LITERAL ( EXPONENT )? )
            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:261:18: INT_LITERAL DOT INT_LITERAL ( EXPONENT )?
            {
            root_0 = (ProvaAST)adaptor.nil();

            INT_LITERAL178=(Token)match(input,INT_LITERAL,FOLLOW_INT_LITERAL_in_float_literal1620); 
            INT_LITERAL178_tree = (ProvaAST)adaptor.create(INT_LITERAL178);
            adaptor.addChild(root_0, INT_LITERAL178_tree);

            DOT179=(Token)match(input,DOT,FOLLOW_DOT_in_float_literal1622); 
            DOT179_tree = (ProvaAST)adaptor.create(DOT179);
            adaptor.addChild(root_0, DOT179_tree);

            INT_LITERAL180=(Token)match(input,INT_LITERAL,FOLLOW_INT_LITERAL_in_float_literal1624); 
            INT_LITERAL180_tree = (ProvaAST)adaptor.create(INT_LITERAL180);
            adaptor.addChild(root_0, INT_LITERAL180_tree);

            // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:261:46: ( EXPONENT )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==EXPONENT) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // D:\\workspace\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:261:46: EXPONENT
                    {
                    EXPONENT181=(Token)match(input,EXPONENT,FOLLOW_EXPONENT_in_float_literal1626); 
                    EXPONENT181_tree = (ProvaAST)adaptor.create(EXPONENT181);
                    adaptor.addChild(root_0, EXPONENT181_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (ProvaAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ProvaAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "float_literal"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA25 dfa25 = new DFA25(this);
    protected DFA28 dfa28 = new DFA28(this);
    protected DFA31 dfa31 = new DFA31(this);
    protected DFA33 dfa33 = new DFA33(this);
    protected DFA41 dfa41 = new DFA41(this);
    protected DFA42 dfa42 = new DFA42(this);
    protected DFA44 dfa44 = new DFA44(this);
    protected DFA46 dfa46 = new DFA46(this);
    protected DFA45 dfa45 = new DFA45(this);
    protected DFA50 dfa50 = new DFA50(this);
    protected DFA53 dfa53 = new DFA53(this);
    static final String DFA1_eotS =
        "\4\uffff";
    static final String DFA1_eofS =
        "\2\2\2\uffff";
    static final String DFA1_minS =
        "\2\12\2\uffff";
    static final String DFA1_maxS =
        "\2\105\2\uffff";
    static final String DFA1_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA1_specialS =
        "\4\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\3\50\uffff\1\1\2\3\2\uffff\2\3\13\uffff\1\3",
            "\1\3\50\uffff\1\1\2\3\2\uffff\2\3\13\uffff\1\3",
            "",
            ""
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "()* loopback of 87:4: ( statement )*";
        }
    }
    static final String DFA25_eotS =
        "\40\uffff";
    static final String DFA25_eofS =
        "\40\uffff";
    static final String DFA25_minS =
        "\2\6\1\64\2\4\1\14\2\uffff\1\6\1\uffff\2\6\3\11\1\66\1\4\1\11\2"+
        "\6\1\66\3\11\1\66\1\4\2\11\1\66\3\11";
    static final String DFA25_maxS =
        "\2\105\1\64\3\27\2\uffff\1\105\1\uffff\1\71\1\105\3\15\1\67\2\15"+
        "\1\71\1\105\1\66\3\15\1\67\2\15\1\72\1\66\1\15\1\72\1\15";
    static final String DFA25_acceptS =
        "\6\uffff\1\2\1\3\1\uffff\1\1\26\uffff";
    static final String DFA25_specialS =
        "\40\uffff}>";
    static final String[] DFA25_transitionS = {
            "\1\6\4\uffff\1\7\3\uffff\1\6\31\uffff\1\6\3\uffff\1\6\5\uffff"+
            "\1\1\1\3\1\4\2\6\2\5\13\uffff\1\2",
            "\1\6\4\uffff\1\7\3\uffff\1\6\31\uffff\1\6\3\uffff\1\6\5\uffff"+
            "\1\1\1\3\1\4\2\6\2\5\13\uffff\1\2",
            "\1\10",
            "\1\6\7\uffff\1\11\4\uffff\7\6",
            "\1\6\7\uffff\1\11\4\uffff\7\6",
            "\1\11\4\uffff\7\6",
            "",
            "",
            "\1\6\5\uffff\1\12\2\uffff\1\6\31\uffff\1\6\3\uffff\1\6\5\uffff"+
            "\1\13\1\3\1\4\2\6\2\5\13\uffff\1\2",
            "",
            "\1\17\55\uffff\1\14\1\15\1\20\1\21\2\16",
            "\1\6\10\uffff\1\6\31\uffff\1\6\3\uffff\1\6\5\uffff\1\13\1"+
            "\3\1\4\2\6\2\5\13\uffff\1\2",
            "\1\22\3\uffff\1\23",
            "\1\22\3\uffff\1\23",
            "\1\22\3\uffff\1\23",
            "\1\20\1\21",
            "\1\24\4\uffff\1\22\3\uffff\1\23",
            "\1\22\3\uffff\1\23",
            "\1\30\55\uffff\1\25\1\26\1\31\1\32\2\27",
            "\1\6\10\uffff\1\6\31\uffff\1\6\3\uffff\1\6\5\uffff\1\13\1"+
            "\3\1\4\2\6\2\5\13\uffff\1\2",
            "\1\33",
            "\1\22\3\uffff\1\23",
            "\1\22\3\uffff\1\23",
            "\1\22\3\uffff\1\23",
            "\1\31\1\32",
            "\1\34\4\uffff\1\22\3\uffff\1\23",
            "\1\22\3\uffff\1\23",
            "\1\22\3\uffff\1\23\54\uffff\1\35",
            "\1\36",
            "\1\22\3\uffff\1\23",
            "\1\22\3\uffff\1\23\54\uffff\1\37",
            "\1\22\3\uffff\1\23"
    };

    static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
    static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
    static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars(DFA25_minS);
    static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars(DFA25_maxS);
    static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
    static final short[] DFA25_special = DFA.unpackEncodedString(DFA25_specialS);
    static final short[][] DFA25_transition;

    static {
        int numStates = DFA25_transitionS.length;
        DFA25_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
        }
    }

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = DFA25_eot;
            this.eof = DFA25_eof;
            this.min = DFA25_min;
            this.max = DFA25_max;
            this.accept = DFA25_accept;
            this.special = DFA25_special;
            this.transition = DFA25_transition;
        }
        public String getDescription() {
            return "119:1: literal : ( ( NEWLINE )* (m= metadata )? r= relation (g= guard )? -> ^( RELATION ( metadata )? relation ( guard )? ) | ( NEWLINE )* (m= metadata )? semantic_attachment (g= guard )? -> ^( SEMANTIC_ATTACHMENT ( metadata )? semantic_attachment ( guard )? ) | ( NEWLINE )* cut -> ^( CUT cut ) );";
        }
    }
    static final String DFA28_eotS =
        "\4\uffff";
    static final String DFA28_eofS =
        "\4\uffff";
    static final String DFA28_minS =
        "\2\6\2\uffff";
    static final String DFA28_maxS =
        "\2\106\2\uffff";
    static final String DFA28_acceptS =
        "\2\uffff\1\1\1\2";
    static final String DFA28_specialS =
        "\4\uffff}>";
    static final String[] DFA28_transitionS = {
            "\1\2\6\uffff\1\3\1\uffff\1\2\1\3\30\uffff\1\2\3\uffff\1\2\5"+
            "\uffff\1\1\6\2\14\uffff\1\2",
            "\1\2\6\uffff\1\3\1\uffff\1\2\1\3\30\uffff\1\2\3\uffff\1\2"+
            "\5\uffff\1\1\6\2\14\uffff\1\2",
            "",
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
            return "137:5: ( terms ( '|' list_tail )? )?";
        }
    }
    static final String DFA31_eotS =
        "\11\uffff";
    static final String DFA31_eofS =
        "\11\uffff";
    static final String DFA31_minS =
        "\1\6\1\4\4\uffff\1\64\2\4";
    static final String DFA31_maxS =
        "\1\71\1\107\4\uffff\1\65\1\107\1\4";
    static final String DFA31_acceptS =
        "\2\uffff\1\1\1\2\1\3\1\4\3\uffff";
    static final String DFA31_specialS =
        "\11\uffff}>";
    static final String[] DFA31_transitionS = {
            "\1\4\10\uffff\1\5\31\uffff\1\3\3\uffff\1\3\6\uffff\1\1\1\3"+
            "\2\4\2\2",
            "\1\6\4\uffff\1\2\3\uffff\2\2\1\uffff\10\2\33\uffff\1\2\23"+
            "\uffff\1\2",
            "",
            "",
            "",
            "",
            "\1\10\1\7",
            "\1\3\4\uffff\1\2\3\uffff\2\2\1\uffff\10\2\33\uffff\1\2\23"+
            "\uffff\1\2",
            "\1\6"
    };

    static final short[] DFA31_eot = DFA.unpackEncodedString(DFA31_eotS);
    static final short[] DFA31_eof = DFA.unpackEncodedString(DFA31_eofS);
    static final char[] DFA31_min = DFA.unpackEncodedStringToUnsignedChars(DFA31_minS);
    static final char[] DFA31_max = DFA.unpackEncodedStringToUnsignedChars(DFA31_maxS);
    static final short[] DFA31_accept = DFA.unpackEncodedString(DFA31_acceptS);
    static final short[] DFA31_special = DFA.unpackEncodedString(DFA31_specialS);
    static final short[][] DFA31_transition;

    static {
        int numStates = DFA31_transitionS.length;
        DFA31_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA31_transition[i] = DFA.unpackEncodedString(DFA31_transitionS[i]);
        }
    }

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = DFA31_eot;
            this.eof = DFA31_eof;
            this.min = DFA31_min;
            this.max = DFA31_max;
            this.accept = DFA31_accept;
            this.special = DFA31_special;
            this.transition = DFA31_transition;
        }
        public String getDescription() {
            return "142:1: left_term : ( constant | variable | number | prova_list );";
        }
    }
    static final String DFA33_eotS =
        "\7\uffff";
    static final String DFA33_eofS =
        "\1\uffff\1\2\3\uffff\1\2\1\uffff";
    static final String DFA33_minS =
        "\1\51\1\4\2\uffff\1\64\2\4";
    static final String DFA33_maxS =
        "\1\71\1\4\2\uffff\1\65\2\4";
    static final String DFA33_acceptS =
        "\2\uffff\1\1\1\2\3\uffff";
    static final String DFA33_specialS =
        "\7\uffff}>";
    static final String[] DFA33_transitionS = {
            "\1\3\3\uffff\1\3\6\uffff\1\1\1\3\2\uffff\2\2",
            "\1\4",
            "",
            "",
            "\1\6\1\5",
            "\1\3",
            "\1\4"
    };

    static final short[] DFA33_eot = DFA.unpackEncodedString(DFA33_eotS);
    static final short[] DFA33_eof = DFA.unpackEncodedString(DFA33_eofS);
    static final char[] DFA33_min = DFA.unpackEncodedStringToUnsignedChars(DFA33_minS);
    static final char[] DFA33_max = DFA.unpackEncodedStringToUnsignedChars(DFA33_maxS);
    static final short[] DFA33_accept = DFA.unpackEncodedString(DFA33_acceptS);
    static final short[] DFA33_special = DFA.unpackEncodedString(DFA33_specialS);
    static final short[][] DFA33_transition;

    static {
        int numStates = DFA33_transitionS.length;
        DFA33_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA33_transition[i] = DFA.unpackEncodedString(DFA33_transitionS[i]);
        }
    }

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = DFA33_eot;
            this.eof = DFA33_eof;
            this.min = DFA33_min;
            this.max = DFA33_max;
            this.accept = DFA33_accept;
            this.special = DFA33_special;
            this.transition = DFA33_transition;
        }
        public String getDescription() {
            return "149:12: ( constant | variable )";
        }
    }
    static final String DFA41_eotS =
        "\4\uffff";
    static final String DFA41_eofS =
        "\4\uffff";
    static final String DFA41_minS =
        "\1\11\1\uffff\1\11\1\uffff";
    static final String DFA41_maxS =
        "\1\63\1\uffff\1\63\1\uffff";
    static final String DFA41_acceptS =
        "\1\uffff\1\2\1\uffff\1\1";
    static final String DFA41_specialS =
        "\4\uffff}>";
    static final String[] DFA41_transitionS = {
            "\1\3\3\uffff\2\1\1\uffff\1\1\42\uffff\1\2",
            "",
            "\1\3\3\uffff\1\1\2\uffff\1\1\42\uffff\1\2",
            ""
    };

    static final short[] DFA41_eot = DFA.unpackEncodedString(DFA41_eotS);
    static final short[] DFA41_eof = DFA.unpackEncodedString(DFA41_eofS);
    static final char[] DFA41_min = DFA.unpackEncodedStringToUnsignedChars(DFA41_minS);
    static final char[] DFA41_max = DFA.unpackEncodedStringToUnsignedChars(DFA41_maxS);
    static final short[] DFA41_accept = DFA.unpackEncodedString(DFA41_acceptS);
    static final short[] DFA41_special = DFA.unpackEncodedString(DFA41_specialS);
    static final short[][] DFA41_transition;

    static {
        int numStates = DFA41_transitionS.length;
        DFA41_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA41_transition[i] = DFA.unpackEncodedString(DFA41_transitionS[i]);
        }
    }

    class DFA41 extends DFA {

        public DFA41(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 41;
            this.eot = DFA41_eot;
            this.eof = DFA41_eof;
            this.min = DFA41_min;
            this.max = DFA41_max;
            this.accept = DFA41_accept;
            this.special = DFA41_special;
            this.transition = DFA41_transition;
        }
        public String getDescription() {
            return "()* loopback of 159:24: ( ( NEWLINE )* ',' ( NEWLINE )* term )*";
        }
    }
    static final String DFA42_eotS =
        "\16\uffff";
    static final String DFA42_eofS =
        "\16\uffff";
    static final String DFA42_minS =
        "\1\6\1\4\1\11\1\4\2\uffff\1\64\1\uffff\1\64\2\4\1\11\1\64\1\11";
    static final String DFA42_maxS =
        "\1\106\3\107\2\uffff\1\65\1\uffff\1\65\1\107\1\4\1\107\1\65\1\107";
    static final String DFA42_acceptS =
        "\4\uffff\1\1\1\3\1\uffff\1\2\6\uffff";
    static final String DFA42_specialS =
        "\16\uffff}>";
    static final String[] DFA42_transitionS = {
            "\1\4\10\uffff\1\4\31\uffff\1\4\3\uffff\1\4\6\uffff\1\1\1\3"+
            "\2\4\2\2\14\uffff\1\5",
            "\1\6\4\uffff\1\4\2\uffff\1\7\2\4\1\uffff\1\4\42\uffff\1\4"+
            "\23\uffff\1\4",
            "\1\4\2\uffff\1\7\2\4\1\uffff\1\4\42\uffff\1\4\23\uffff\1\4",
            "\1\10\4\uffff\1\4\2\uffff\1\7\2\4\1\uffff\1\4\42\uffff\1\4"+
            "\23\uffff\1\4",
            "",
            "",
            "\1\12\1\11",
            "",
            "\2\13",
            "\1\14\4\uffff\1\4\3\uffff\2\4\1\uffff\1\4\42\uffff\1\4\23"+
            "\uffff\1\4",
            "\1\6",
            "\1\4\2\uffff\1\7\2\4\1\uffff\1\4\42\uffff\1\4\23\uffff\1\4",
            "\2\15",
            "\1\4\2\uffff\1\7\2\4\1\uffff\1\4\42\uffff\1\4\23\uffff\1\4"
    };

    static final short[] DFA42_eot = DFA.unpackEncodedString(DFA42_eotS);
    static final short[] DFA42_eof = DFA.unpackEncodedString(DFA42_eofS);
    static final char[] DFA42_min = DFA.unpackEncodedStringToUnsignedChars(DFA42_minS);
    static final char[] DFA42_max = DFA.unpackEncodedStringToUnsignedChars(DFA42_maxS);
    static final short[] DFA42_accept = DFA.unpackEncodedString(DFA42_acceptS);
    static final short[] DFA42_special = DFA.unpackEncodedString(DFA42_specialS);
    static final short[][] DFA42_transition;

    static {
        int numStates = DFA42_transitionS.length;
        DFA42_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA42_transition[i] = DFA.unpackEncodedString(DFA42_transitionS[i]);
        }
    }

    class DFA42 extends DFA {

        public DFA42(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 42;
            this.eot = DFA42_eot;
            this.eof = DFA42_eof;
            this.min = DFA42_min;
            this.max = DFA42_max;
            this.accept = DFA42_accept;
            this.special = DFA42_special;
            this.transition = DFA42_transition;
        }
        public String getDescription() {
            return "161:1: term : ( left_term | func_term | prova_map );";
        }
    }
    static final String DFA44_eotS =
        "\20\uffff";
    static final String DFA44_eofS =
        "\20\uffff";
    static final String DFA44_minS =
        "\1\6\4\4\1\uffff\2\64\1\uffff\4\4\1\64\2\4";
    static final String DFA44_maxS =
        "\1\71\4\27\1\uffff\2\65\1\uffff\1\27\1\4\2\27\1\65\2\27";
    static final String DFA44_acceptS =
        "\5\uffff\1\2\2\uffff\1\1\7\uffff";
    static final String DFA44_specialS =
        "\20\uffff}>";
    static final String[] DFA44_transitionS = {
            "\1\5\10\uffff\1\5\31\uffff\1\3\3\uffff\1\4\6\uffff\1\1\1\2"+
            "\4\5",
            "\1\6\14\uffff\7\5",
            "\1\7\14\uffff\7\5",
            "\1\10\14\uffff\7\5",
            "\1\10\14\uffff\7\5",
            "",
            "\1\12\1\11",
            "\1\13\1\14",
            "",
            "\1\15\14\uffff\7\5",
            "\1\6",
            "\1\10\7\uffff\1\10\4\uffff\7\5",
            "\1\10\14\uffff\7\5",
            "\1\16\1\17",
            "\1\10\7\uffff\1\10\4\uffff\7\5",
            "\1\10\14\uffff\7\5"
    };

    static final short[] DFA44_eot = DFA.unpackEncodedString(DFA44_eotS);
    static final short[] DFA44_eof = DFA.unpackEncodedString(DFA44_eofS);
    static final char[] DFA44_min = DFA.unpackEncodedStringToUnsignedChars(DFA44_minS);
    static final char[] DFA44_max = DFA.unpackEncodedStringToUnsignedChars(DFA44_maxS);
    static final short[] DFA44_accept = DFA.unpackEncodedString(DFA44_acceptS);
    static final short[] DFA44_special = DFA.unpackEncodedString(DFA44_specialS);
    static final short[][] DFA44_transition;

    static {
        int numStates = DFA44_transitionS.length;
        DFA44_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA44_transition[i] = DFA.unpackEncodedString(DFA44_transitionS[i]);
        }
    }

    class DFA44 extends DFA {

        public DFA44(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 44;
            this.eot = DFA44_eot;
            this.eof = DFA44_eof;
            this.min = DFA44_min;
            this.max = DFA44_max;
            this.accept = DFA44_accept;
            this.special = DFA44_special;
            this.transition = DFA44_transition;
        }
        public String getDescription() {
            return "175:1: semantic_attachment : ( predicate_java_call | binary_operation );";
        }
    }
    static final String DFA46_eotS =
        "\13\uffff";
    static final String DFA46_eofS =
        "\6\uffff\1\5\2\uffff\1\5\1\uffff";
    static final String DFA46_minS =
        "\1\21\1\uffff\1\6\1\uffff\1\4\1\uffff\1\63\2\4\1\63\1\64";
    static final String DFA46_maxS =
        "\1\27\1\uffff\1\71\1\uffff\1\63\1\uffff\1\65\1\63\1\4\2\65";
    static final String DFA46_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\1\uffff\1\2\5\uffff";
    static final String DFA46_specialS =
        "\13\uffff}>";
    static final String[] DFA46_transitionS = {
            "\1\1\2\2\4\3",
            "",
            "\1\3\5\uffff\1\3\34\uffff\1\3\3\uffff\1\3\6\uffff\1\4\3\3"+
            "\2\5",
            "",
            "\1\6\4\uffff\1\5\5\uffff\2\5\42\uffff\1\5",
            "",
            "\1\5\1\10\1\7",
            "\1\11\4\uffff\1\5\5\uffff\2\5\42\uffff\1\5",
            "\1\12",
            "\1\5\2\3",
            "\1\10\1\7"
    };

    static final short[] DFA46_eot = DFA.unpackEncodedString(DFA46_eotS);
    static final short[] DFA46_eof = DFA.unpackEncodedString(DFA46_eofS);
    static final char[] DFA46_min = DFA.unpackEncodedStringToUnsignedChars(DFA46_minS);
    static final char[] DFA46_max = DFA.unpackEncodedStringToUnsignedChars(DFA46_maxS);
    static final short[] DFA46_accept = DFA.unpackEncodedString(DFA46_acceptS);
    static final short[] DFA46_special = DFA.unpackEncodedString(DFA46_specialS);
    static final short[][] DFA46_transition;

    static {
        int numStates = DFA46_transitionS.length;
        DFA46_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA46_transition[i] = DFA.unpackEncodedString(DFA46_transitionS[i]);
        }
    }

    class DFA46 extends DFA {

        public DFA46(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 46;
            this.eot = DFA46_eot;
            this.eof = DFA46_eof;
            this.min = DFA46_min;
            this.max = DFA46_max;
            this.accept = DFA46_accept;
            this.special = DFA46_special;
            this.transition = DFA46_transition;
        }
        public String getDescription() {
            return "180:3: ( EQUAL ( constructor_java_call | prova_list | constant | expr ) | not_equal constant | binary_operator expr )";
        }
    }
    static final String DFA45_eotS =
        "\14\uffff";
    static final String DFA45_eofS =
        "\6\uffff\1\4\3\uffff\1\4\1\uffff";
    static final String DFA45_minS =
        "\1\6\2\4\3\uffff\1\63\1\uffff\2\4\1\63\1\64";
    static final String DFA45_maxS =
        "\1\71\2\63\3\uffff\1\65\1\uffff\1\63\1\4\2\65";
    static final String DFA45_acceptS =
        "\3\uffff\1\2\1\3\1\4\1\uffff\1\1\4\uffff";
    static final String DFA45_specialS =
        "\14\uffff}>";
    static final String[] DFA45_transitionS = {
            "\1\5\5\uffff\1\5\2\uffff\1\3\31\uffff\1\5\3\uffff\1\5\6\uffff"+
            "\1\1\1\2\2\5\2\4",
            "\1\6\4\uffff\1\4\5\uffff\2\4\42\uffff\1\4",
            "\6\5\2\uffff\1\7\2\uffff\2\5\33\uffff\1\5\6\uffff\1\5",
            "",
            "",
            "",
            "\1\4\1\11\1\10",
            "",
            "\1\12\4\uffff\1\4\2\uffff\1\7\2\uffff\2\4\42\uffff\1\4",
            "\1\13",
            "\1\4\2\5",
            "\1\11\1\10"
    };

    static final short[] DFA45_eot = DFA.unpackEncodedString(DFA45_eotS);
    static final short[] DFA45_eof = DFA.unpackEncodedString(DFA45_eofS);
    static final char[] DFA45_min = DFA.unpackEncodedStringToUnsignedChars(DFA45_minS);
    static final char[] DFA45_max = DFA.unpackEncodedStringToUnsignedChars(DFA45_maxS);
    static final short[] DFA45_accept = DFA.unpackEncodedString(DFA45_acceptS);
    static final short[] DFA45_special = DFA.unpackEncodedString(DFA45_specialS);
    static final short[][] DFA45_transition;

    static {
        int numStates = DFA45_transitionS.length;
        DFA45_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA45_transition[i] = DFA.unpackEncodedString(DFA45_transitionS[i]);
        }
    }

    class DFA45 extends DFA {

        public DFA45(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 45;
            this.eot = DFA45_eot;
            this.eof = DFA45_eof;
            this.min = DFA45_min;
            this.max = DFA45_max;
            this.accept = DFA45_accept;
            this.special = DFA45_special;
            this.transition = DFA45_transition;
        }
        public String getDescription() {
            return "181:4: ( constructor_java_call | prova_list | constant | expr )";
        }
    }
    static final String DFA50_eotS =
        "\23\uffff";
    static final String DFA50_eofS =
        "\10\uffff\1\11\1\uffff\1\11\10\uffff";
    static final String DFA50_minS =
        "\1\6\1\51\4\4\2\uffff\1\63\1\uffff\1\63\1\64\2\4\1\uffff\1\4\1"+
        "\64\2\4";
    static final String DFA50_maxS =
        "\2\67\2\63\1\4\1\63\2\uffff\1\65\1\uffff\1\64\1\65\2\63\1\uffff"+
        "\1\4\1\65\2\63";
    static final String DFA50_acceptS =
        "\6\uffff\1\2\1\4\1\uffff\1\1\4\uffff\1\3\4\uffff";
    static final String DFA50_specialS =
        "\23\uffff}>";
    static final String[] DFA50_transitionS = {
            "\1\1\5\uffff\1\7\34\uffff\1\3\3\uffff\1\5\6\uffff\1\4\1\2\2"+
            "\6",
            "\1\3\3\uffff\1\5\6\uffff\1\4\1\2\2\6",
            "\1\10\5\11\3\uffff\1\11\1\uffff\2\11\33\uffff\1\11\6\uffff"+
            "\1\11",
            "\1\12\5\11\3\uffff\1\11\1\uffff\2\11\33\uffff\1\11\6\uffff"+
            "\1\11",
            "\1\13",
            "\1\12\5\11\3\uffff\1\11\1\uffff\2\11\33\uffff\1\11\6\uffff"+
            "\1\11",
            "",
            "",
            "\1\11\1\14\1\15",
            "",
            "\1\11\1\16",
            "\1\4\1\17",
            "\1\12\5\11\2\uffff\1\16\1\11\1\uffff\2\11\33\uffff\1\11\6"+
            "\uffff\1\11",
            "\1\12\5\11\3\uffff\1\11\1\uffff\2\11\33\uffff\1\11\6\uffff"+
            "\1\11",
            "",
            "\1\20",
            "\1\21\1\22",
            "\1\12\5\11\2\uffff\1\16\1\11\1\uffff\2\11\33\uffff\1\11\6"+
            "\uffff\1\11",
            "\1\12\5\11\3\uffff\1\11\1\uffff\2\11\33\uffff\1\11\6\uffff"+
            "\1\11"
    };

    static final short[] DFA50_eot = DFA.unpackEncodedString(DFA50_eotS);
    static final short[] DFA50_eof = DFA.unpackEncodedString(DFA50_eofS);
    static final char[] DFA50_min = DFA.unpackEncodedStringToUnsignedChars(DFA50_minS);
    static final char[] DFA50_max = DFA.unpackEncodedStringToUnsignedChars(DFA50_maxS);
    static final short[] DFA50_accept = DFA.unpackEncodedString(DFA50_acceptS);
    static final short[] DFA50_special = DFA.unpackEncodedString(DFA50_specialS);
    static final short[][] DFA50_transition;

    static {
        int numStates = DFA50_transitionS.length;
        DFA50_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA50_transition[i] = DFA.unpackEncodedString(DFA50_transitionS[i]);
        }
    }

    class DFA50 extends DFA {

        public DFA50(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 50;
            this.eot = DFA50_eot;
            this.eof = DFA50_eof;
            this.min = DFA50_min;
            this.max = DFA50_max;
            this.accept = DFA50_accept;
            this.special = DFA50_special;
            this.transition = DFA50_transition;
        }
        public String getDescription() {
            return "193:9: ( ( MINUS )? variable | number | ( MINUS )? predicate_java_call | OPEN expr CLOSE )";
        }
    }
    static final String DFA53_eotS =
        "\10\uffff";
    static final String DFA53_eofS =
        "\10\uffff";
    static final String DFA53_minS =
        "\1\51\1\4\1\uffff\1\64\1\4\1\64\1\4\1\uffff";
    static final String DFA53_maxS =
        "\1\65\1\4\1\uffff\1\65\1\4\1\65\1\14\1\uffff";
    static final String DFA53_acceptS =
        "\2\uffff\1\2\4\uffff\1\1";
    static final String DFA53_specialS =
        "\10\uffff}>";
    static final String[] DFA53_transitionS = {
            "\1\2\3\uffff\1\2\6\uffff\1\1\1\2",
            "\1\3",
            "",
            "\1\1\1\4",
            "\1\5",
            "\1\6\1\2",
            "\1\2\7\uffff\1\7",
            ""
    };

    static final short[] DFA53_eot = DFA.unpackEncodedString(DFA53_eotS);
    static final short[] DFA53_eof = DFA.unpackEncodedString(DFA53_eofS);
    static final char[] DFA53_min = DFA.unpackEncodedStringToUnsignedChars(DFA53_minS);
    static final char[] DFA53_max = DFA.unpackEncodedStringToUnsignedChars(DFA53_maxS);
    static final short[] DFA53_accept = DFA.unpackEncodedString(DFA53_acceptS);
    static final short[] DFA53_special = DFA.unpackEncodedString(DFA53_specialS);
    static final short[][] DFA53_transition;

    static {
        int numStates = DFA53_transitionS.length;
        DFA53_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA53_transition[i] = DFA.unpackEncodedString(DFA53_transitionS[i]);
        }
    }

    class DFA53 extends DFA {

        public DFA53(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 53;
            this.eot = DFA53_eot;
            this.eof = DFA53_eof;
            this.min = DFA53_min;
            this.max = DFA53_max;
            this.accept = DFA53_accept;
            this.special = DFA53_special;
            this.transition = DFA53_transition;
        }
        public String getDescription() {
            return "199:1: predicate_java_call : ( static_java_call | instance_java_call );";
        }
    }
 

    public static final BitSet FOLLOW_statement_in_rulebase335 = new BitSet(new long[]{0x0338000000000400L,0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_rulebase338 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_EOF_in_rulebase341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_statement359 = new BitSet(new long[]{0x0338000000000400L,0x0000000000000020L});
    public static final BitSet FOLLOW_stat_in_statement362 = new BitSet(new long[]{0x0008000000000010L});
    public static final BitSet FOLLOW_end_of_statement_in_statement364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_end_of_statement381 = new BitSet(new long[]{0x0008000000000010L});
    public static final BitSet FOLLOW_DOT_in_end_of_statement384 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_set_in_end_of_statement386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_clause_in_stat403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_query_in_stat409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_query418 = new BitSet(new long[]{0x0338000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_query420 = new BitSet(new long[]{0x0338000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_query_predicate_in_query423 = new BitSet(new long[]{0x0008000000001000L});
    public static final BitSet FOLLOW_NEWLINE_in_query425 = new BitSet(new long[]{0x0008000000001000L});
    public static final BitSet FOLLOW_OPEN_in_query428 = new BitSet(new long[]{0x0338000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_query430 = new BitSet(new long[]{0x0338000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_relation_in_query433 = new BitSet(new long[]{0x0008000000002000L});
    public static final BitSet FOLLOW_NEWLINE_in_query435 = new BitSet(new long[]{0x0008000000002000L});
    public static final BitSet FOLLOW_CLOSE_in_query438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_query_predicate458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_metadata_in_clause467 = new BitSet(new long[]{0x0330000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_relation_in_clause470 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_IF_in_clause473 = new BitSet(new long[]{0x03F8220000008840L,0x0000000000000020L});
    public static final BitSet FOLLOW_literals_in_clause475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_in_metadata501 = new BitSet(new long[]{0x0008000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_metadata503 = new BitSet(new long[]{0x0008000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_annotation525 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_LCWORD_in_annotation527 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_OPEN_in_annotation530 = new BitSet(new long[]{0x03F0000000000040L,0x0000000000000020L});
    public static final BitSet FOLLOW_value_in_annotation532 = new BitSet(new long[]{0x0000000000002200L});
    public static final BitSet FOLLOW_COMMA_in_annotation535 = new BitSet(new long[]{0x03F0000000000040L,0x0000000000000020L});
    public static final BitSet FOLLOW_value_in_annotation537 = new BitSet(new long[]{0x0000000000002200L});
    public static final BitSet FOLLOW_CLOSE_in_annotation541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCWORD_in_value566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UCWORD_in_value570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_in_value574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_value578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_literals588 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_COMMA_in_literals591 = new BitSet(new long[]{0x03F8220000008840L,0x0000000000000020L});
    public static final BitSet FOLLOW_literal_in_literals593 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_NEWLINE_in_literal613 = new BitSet(new long[]{0x0338000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_metadata_in_literal618 = new BitSet(new long[]{0x0330000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_relation_in_literal623 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_guard_in_literal627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_literal649 = new BitSet(new long[]{0x03F8220000008040L,0x0000000000000020L});
    public static final BitSet FOLLOW_metadata_in_literal654 = new BitSet(new long[]{0x03F8220000008040L,0x0000000000000020L});
    public static final BitSet FOLLOW_semantic_attachment_in_literal657 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_guard_in_literal661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_literal683 = new BitSet(new long[]{0x03F8220000008840L,0x0000000000000020L});
    public static final BitSet FOLLOW_cut_in_literal686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CUT_in_cut702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_not_equal_in_binary_operator711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_binary_operator715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_binary_operator719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LE_in_binary_operator723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GE_in_binary_operator727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_predicate_in_relation739 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_OPEN_in_relation741 = new BitSet(new long[]{0x03F822000000A040L,0x0000000000000060L});
    public static final BitSet FOLLOW_list_body_in_relation743 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_CLOSE_in_relation745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BRA_in_guard764 = new BitSet(new long[]{0x03F8220000008840L,0x0000000000000020L});
    public static final BitSet FOLLOW_literals_in_guard766 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_KET_in_guard768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terms_in_list_body789 = new BitSet(new long[]{0x0008000000004002L});
    public static final BitSet FOLLOW_BAR_in_list_body792 = new BitSet(new long[]{0x03F8220000008040L,0x0000000000000020L});
    public static final BitSet FOLLOW_list_tail_in_list_body794 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_list_body800 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_variable_in_list_tail825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prova_list_in_list_tail829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_left_term839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_left_term846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_left_term852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prova_list_in_left_term858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_right_term869 = new BitSet(new long[]{0x0338220000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_constant_in_right_term873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_right_term877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_right_term883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prova_list_in_right_term887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prova_map_in_right_term891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_prova_map901 = new BitSet(new long[]{0x0330000000000200L,0x00000000000000A0L});
    public static final BitSet FOLLOW_key_value_in_prova_map903 = new BitSet(new long[]{0x0000000000000200L,0x0000000000000080L});
    public static final BitSet FOLLOW_COMMA_in_prova_map907 = new BitSet(new long[]{0x0330000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_key_value_in_prova_map909 = new BitSet(new long[]{0x0000000000000200L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_prova_map913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mstring_in_key_value933 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000300L});
    public static final BitSet FOLLOW_72_in_key_value936 = new BitSet(new long[]{0x03F8220000008040L,0x0000000000000060L});
    public static final BitSet FOLLOW_73_in_key_value938 = new BitSet(new long[]{0x03F8220000008040L,0x0000000000000060L});
    public static final BitSet FOLLOW_term_in_key_value941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_terms964 = new BitSet(new long[]{0x03F8220000008040L,0x0000000000000060L});
    public static final BitSet FOLLOW_term_in_terms967 = new BitSet(new long[]{0x0008000000000202L});
    public static final BitSet FOLLOW_NEWLINE_in_terms970 = new BitSet(new long[]{0x0008000000000200L});
    public static final BitSet FOLLOW_COMMA_in_terms973 = new BitSet(new long[]{0x03F8220000008040L,0x0000000000000060L});
    public static final BitSet FOLLOW_NEWLINE_in_terms975 = new BitSet(new long[]{0x03F8220000008040L,0x0000000000000060L});
    public static final BitSet FOLLOW_term_in_terms978 = new BitSet(new long[]{0x0008000000000202L});
    public static final BitSet FOLLOW_left_term_in_term997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_func_term_in_term1001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prova_map_in_term1005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_func_in_func_term1014 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_args_in_func_term1016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCWORD_in_qualified_java_class1029 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_DOT_in_qualified_java_class1031 = new BitSet(new long[]{0x0030000000000000L});
    public static final BitSet FOLLOW_UCWORD_in_qualified_java_class1035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BRA_in_prova_list1063 = new BitSet(new long[]{0x03F8220000018040L,0x0000000000000060L});
    public static final BitSet FOLLOW_list_body_in_prova_list1065 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_KET_in_prova_list1067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_in_args1084 = new BitSet(new long[]{0x03F822000000A040L,0x0000000000000060L});
    public static final BitSet FOLLOW_list_body_in_args1086 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_CLOSE_in_args1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_predicate_java_call_in_semantic_attachment1106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_binary_operation_in_semantic_attachment1110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_left_term_in_binary_operation1119 = new BitSet(new long[]{0x0000000000FE0000L});
    public static final BitSet FOLLOW_EQUAL_in_binary_operation1125 = new BitSet(new long[]{0x03F8220000009040L,0x0000000000000020L});
    public static final BitSet FOLLOW_constructor_java_call_in_binary_operation1135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prova_list_in_binary_operation1142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_binary_operation1149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_binary_operation1156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_not_equal_in_binary_operation1167 = new BitSet(new long[]{0x0338000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_constant_in_binary_operation1169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_binary_operator_in_binary_operation1175 = new BitSet(new long[]{0x03F8220000009040L,0x0000000000000020L});
    public static final BitSet FOLLOW_expr_in_binary_operation1177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_aterm_in_expr1189 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_set_in_expr1192 = new BitSet(new long[]{0x03F8220000009040L,0x0000000000000020L});
    public static final BitSet FOLLOW_expr_in_expr1200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_aterm1212 = new BitSet(new long[]{0x0338220000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_variable_in_aterm1215 = new BitSet(new long[]{0x0000100000000182L});
    public static final BitSet FOLLOW_number_in_aterm1219 = new BitSet(new long[]{0x0000100000000182L});
    public static final BitSet FOLLOW_MINUS_in_aterm1223 = new BitSet(new long[]{0x0338220000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_predicate_java_call_in_aterm1226 = new BitSet(new long[]{0x0000100000000182L});
    public static final BitSet FOLLOW_OPEN_in_aterm1230 = new BitSet(new long[]{0x03F8220000009040L,0x0000000000000020L});
    public static final BitSet FOLLOW_expr_in_aterm1232 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_CLOSE_in_aterm1234 = new BitSet(new long[]{0x0000100000000182L});
    public static final BitSet FOLLOW_set_in_aterm1238 = new BitSet(new long[]{0x03F8220000009040L,0x0000000000000020L});
    public static final BitSet FOLLOW_aterm_in_aterm1252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualified_java_class_in_constructor_java_call1264 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_UCWORD_in_constructor_java_call1268 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_args_in_constructor_java_call1271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_static_java_call_in_predicate_java_call1282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instance_java_call_in_predicate_java_call1286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instance_call_in_instance_java_call1297 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_args_in_instance_java_call1299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_static_call_in_static_java_call1320 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_args_in_static_java_call1322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCWORD_in_method1343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCWORD_in_func1351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UCWORD_in_func1355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_in_func1359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typed_variable_in_func1363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCWORD_in_predicate1373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UCWORD_in_predicate1377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_in_predicate1381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UCWORD_in_variable1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USWORD_in_variable1392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typed_variable_in_variable1396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOLLARWORD_in_variable1400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_variable_or_number1410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_variable_or_number1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_word0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualified_java_class_in_typed_variable1441 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_DOT_in_typed_variable1443 = new BitSet(new long[]{0x0030000000000000L});
    public static final BitSet FOLLOW_word_in_typed_variable1445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UCWORD_in_typed_variable1461 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_DOT_in_typed_variable1463 = new BitSet(new long[]{0x0030000000000000L});
    public static final BitSet FOLLOW_word_in_typed_variable1465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_instance_call1487 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_DOT_in_instance_call1489 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_LCWORD_in_instance_call1491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualified_java_class_in_static_call1509 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_DOT_in_static_call1511 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_LCWORD_in_static_call1513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_LITERAL_in_pos_number1529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONG_LITERAL_in_pos_number1533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_float_literal_in_pos_number1537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_number1548 = new BitSet(new long[]{0x00C0000000000040L});
    public static final BitSet FOLLOW_pos_number_in_number1552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCWORD_in_mstring1562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_in_mstring1566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCWORD_in_constant1576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_in_constant1580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualified_java_class_in_constant1584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_string0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_not_equal0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_LITERAL_in_float_literal1620 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_DOT_in_float_literal1622 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_INT_LITERAL_in_float_literal1624 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_EXPONENT_in_float_literal1626 = new BitSet(new long[]{0x0000000000000002L});

}