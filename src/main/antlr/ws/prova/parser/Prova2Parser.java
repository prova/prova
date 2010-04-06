// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g 2009-10-11 18:00:07

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "DOT", "PLUS", "MINUS", "MULT", "DIV", "COMMA", "IF", "CUT", "OPEN", "CLOSE", "BAR", "BRA", "KET", "EQUAL", "NOT_EQUAL1", "NOT_EQUAL2", "LT", "GT", "LE", "GE", "CLAUSE", "RULEBASE", "STATEMENT", "QUERY", "LITERAL", "METADATA", "RELATION", "SEMANTIC_ATTACHMENT", "ARITHMETIC_RELATION", "PREDICATE", "TERM", "INSTANCE_JAVA_CALL", "STATIC_JAVA_CALL", "LIST_BODY", "PROVA_LIST", "ARGS", "TYPED_VARIABLE", "USWORD", "QUALIFIED_JAVA_CLASS", "ANNOTATION", "REM", "DOLLARWORD", "GUARD", "ATERM", "EXPR", "NEWLINE", "LCWORD", "UCWORD", "INT_LITERAL", "LONG_LITERAL", "STRING1", "STRING2", "EXPONENT", "DIGIT", "LC", "UC", "WORD", "DOLLAR", "UNDERSCORE", "ML_COMMENT", "WS", "CLEAN_STRING", "CHAR_ESC", "'@'"
    };
    public static final int DOLLAR=61;
    public static final int TERM=34;
    public static final int EXPONENT=56;
    public static final int T__67=67;
    public static final int LT=20;
    public static final int TYPED_VARIABLE=40;
    public static final int RULEBASE=25;
    public static final int ANNOTATION=43;
    public static final int EOF=-1;
    public static final int PREDICATE=33;
    public static final int STATEMENT=26;
    public static final int IF=10;
    public static final int WORD=60;
    public static final int ML_COMMENT=63;
    public static final int EXPR=48;
    public static final int COMMA=9;
    public static final int STRING2=55;
    public static final int STRING1=54;
    public static final int EQUAL=17;
    public static final int ARGS=39;
    public static final int UC=59;
    public static final int PLUS=5;
    public static final int DIGIT=57;
    public static final int CLAUSE=24;
    public static final int DOT=4;
    public static final int ATERM=47;
    public static final int DOLLARWORD=45;
    public static final int GE=23;
    public static final int INT_LITERAL=52;
    public static final int SEMANTIC_ATTACHMENT=31;
    public static final int CHAR_ESC=66;
    public static final int KET=16;
    public static final int RELATION=30;
    public static final int STATIC_JAVA_CALL=36;
    public static final int UNDERSCORE=62;
    public static final int LITERAL=28;
    public static final int USWORD=41;
    public static final int REM=44;
    public static final int MULT=7;
    public static final int MINUS=6;
    public static final int LONG_LITERAL=53;
    public static final int PROVA_LIST=38;
    public static final int LCWORD=50;
    public static final int CUT=11;
    public static final int OPEN=12;
    public static final int QUALIFIED_JAVA_CLASS=42;
    public static final int WS=64;
    public static final int NEWLINE=49;
    public static final int CLOSE=13;
    public static final int UCWORD=51;
    public static final int LIST_BODY=37;
    public static final int CLEAN_STRING=65;
    public static final int LC=58;
    public static final int GT=21;
    public static final int QUERY=27;
    public static final int GUARD=46;
    public static final int ARITHMETIC_RELATION=32;
    public static final int DIV=8;
    public static final int METADATA=29;
    public static final int INSTANCE_JAVA_CALL=35;
    public static final int BRA=15;
    public static final int BAR=14;
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
    public String getGrammarFileName() { return "C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g"; }


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
    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:101:1: rulebase : ( statement )* ( NEWLINE )* EOF -> ^( RULEBASE ( statement )* ) ;
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
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:102:2: ( ( statement )* ( NEWLINE )* EOF -> ^( RULEBASE ( statement )* ) )
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:102:4: ( statement )* ( NEWLINE )* EOF
            {
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:102:4: ( statement )*
            loop1:
            do {
                int alt1=2;
                alt1 = dfa1.predict(input);
                switch (alt1) {
            	case 1 :
            	    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:102:4: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_rulebase327);
            	    statement1=statement();

            	    state._fsp--;

            	    stream_statement.add(statement1.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:102:15: ( NEWLINE )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==NEWLINE) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:102:15: NEWLINE
            	    {
            	    NEWLINE2=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_rulebase330);  
            	    stream_NEWLINE.add(NEWLINE2);


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            EOF3=(Token)match(input,EOF,FOLLOW_EOF_in_rulebase333);  
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
            // 102:27: -> ^( RULEBASE ( statement )* )
            {
                // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:102:30: ^( RULEBASE ( statement )* )
                {
                ProvaAST root_1 = (ProvaAST)adaptor.nil();
                root_1 = (ProvaAST)adaptor.becomeRoot((ProvaAST)adaptor.create(RULEBASE, "RULEBASE"), root_1);

                // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:102:41: ( statement )*
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
    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:104:1: statement : ( NEWLINE )* stat end_of_statement -> ^( STATEMENT stat ) ;
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
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:105:2: ( ( NEWLINE )* stat end_of_statement -> ^( STATEMENT stat ) )
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:105:4: ( NEWLINE )* stat end_of_statement
            {
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:105:4: ( NEWLINE )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==NEWLINE) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:105:4: NEWLINE
            	    {
            	    NEWLINE4=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_statement351);  
            	    stream_NEWLINE.add(NEWLINE4);


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            pushFollow(FOLLOW_stat_in_statement354);
            stat5=stat();

            state._fsp--;

            stream_stat.add(stat5.getTree());
            pushFollow(FOLLOW_end_of_statement_in_statement356);
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
            // 105:35: -> ^( STATEMENT stat )
            {
                // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:105:38: ^( STATEMENT stat )
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
    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:107:1: end_of_statement : ( NEWLINE )* DOT ( NEWLINE | EOF ) ;
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
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:108:2: ( ( NEWLINE )* DOT ( NEWLINE | EOF ) )
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:108:4: ( NEWLINE )* DOT ( NEWLINE | EOF )
            {
            root_0 = (ProvaAST)adaptor.nil();

            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:108:4: ( NEWLINE )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==NEWLINE) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:108:4: NEWLINE
            	    {
            	    NEWLINE7=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_end_of_statement373); 
            	    NEWLINE7_tree = (ProvaAST)adaptor.create(NEWLINE7);
            	    adaptor.addChild(root_0, NEWLINE7_tree);


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            DOT8=(Token)match(input,DOT,FOLLOW_DOT_in_end_of_statement376); 
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
    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:110:1: stat : ( clause | query );
    public final Prova2Parser.stat_return stat() throws RecognitionException {
        Prova2Parser.stat_return retval = new Prova2Parser.stat_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Prova2Parser.clause_return clause10 = null;

        Prova2Parser.query_return query11 = null;



        try {
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:110:7: ( clause | query )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=LCWORD && LA5_0<=UCWORD)||(LA5_0>=STRING1 && LA5_0<=STRING2)||LA5_0==67) ) {
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
                    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:110:9: clause
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_clause_in_stat395);
                    clause10=clause();

                    state._fsp--;

                    adaptor.addChild(root_0, clause10.getTree());

                    }
                    break;
                case 2 :
                    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:111:5: query
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_query_in_stat401);
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
    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:113:1: query : IF ( NEWLINE )* query_predicate ( NEWLINE )* '(' ( NEWLINE )* relation ( NEWLINE )* ')' -> ^( QUERY query_predicate relation ) ;
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
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:113:8: ( IF ( NEWLINE )* query_predicate ( NEWLINE )* '(' ( NEWLINE )* relation ( NEWLINE )* ')' -> ^( QUERY query_predicate relation ) )
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:113:10: IF ( NEWLINE )* query_predicate ( NEWLINE )* '(' ( NEWLINE )* relation ( NEWLINE )* ')'
            {
            IF12=(Token)match(input,IF,FOLLOW_IF_in_query410);  
            stream_IF.add(IF12);

            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:113:13: ( NEWLINE )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==NEWLINE) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:113:13: NEWLINE
            	    {
            	    NEWLINE13=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_query412);  
            	    stream_NEWLINE.add(NEWLINE13);


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            pushFollow(FOLLOW_query_predicate_in_query415);
            query_predicate14=query_predicate();

            state._fsp--;

            stream_query_predicate.add(query_predicate14.getTree());
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:113:38: ( NEWLINE )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==NEWLINE) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:113:38: NEWLINE
            	    {
            	    NEWLINE15=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_query417);  
            	    stream_NEWLINE.add(NEWLINE15);


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            char_literal16=(Token)match(input,OPEN,FOLLOW_OPEN_in_query420);  
            stream_OPEN.add(char_literal16);

            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:113:51: ( NEWLINE )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==NEWLINE) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:113:51: NEWLINE
            	    {
            	    NEWLINE17=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_query422);  
            	    stream_NEWLINE.add(NEWLINE17);


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            pushFollow(FOLLOW_relation_in_query425);
            relation18=relation();

            state._fsp--;

            stream_relation.add(relation18.getTree());
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:113:69: ( NEWLINE )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==NEWLINE) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:113:69: NEWLINE
            	    {
            	    NEWLINE19=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_query427);  
            	    stream_NEWLINE.add(NEWLINE19);


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            char_literal20=(Token)match(input,CLOSE,FOLLOW_CLOSE_in_query430);  
            stream_CLOSE.add(char_literal20);



            // AST REWRITE
            // elements: relation, query_predicate
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ProvaAST)adaptor.nil();
            // 113:82: -> ^( QUERY query_predicate relation )
            {
                // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:113:85: ^( QUERY query_predicate relation )
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
    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:115:1: query_predicate : constant ;
    public final Prova2Parser.query_predicate_return query_predicate() throws RecognitionException {
        Prova2Parser.query_predicate_return retval = new Prova2Parser.query_predicate_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Prova2Parser.constant_return constant21 = null;



        try {
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:116:2: ( constant )
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:116:4: constant
            {
            root_0 = (ProvaAST)adaptor.nil();

            pushFollow(FOLLOW_constant_in_query_predicate450);
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
    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:118:1: clause : ( metadata )? relation ( IF literals )? -> ^( CLAUSE ( metadata )? relation ( literals )? ) ;
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
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:118:9: ( ( metadata )? relation ( IF literals )? -> ^( CLAUSE ( metadata )? relation ( literals )? ) )
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:118:11: ( metadata )? relation ( IF literals )?
            {
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:118:11: ( metadata )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==67) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:118:11: metadata
                    {
                    pushFollow(FOLLOW_metadata_in_clause459);
                    metadata22=metadata();

                    state._fsp--;

                    stream_metadata.add(metadata22.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_relation_in_clause462);
            relation23=relation();

            state._fsp--;

            stream_relation.add(relation23.getTree());
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:118:30: ( IF literals )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==IF) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:118:31: IF literals
                    {
                    IF24=(Token)match(input,IF,FOLLOW_IF_in_clause465);  
                    stream_IF.add(IF24);

                    pushFollow(FOLLOW_literals_in_clause467);
                    literals25=literals();

                    state._fsp--;

                    stream_literals.add(literals25.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: literals, relation, metadata
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ProvaAST)adaptor.nil();
            // 118:45: -> ^( CLAUSE ( metadata )? relation ( literals )? )
            {
                // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:118:48: ^( CLAUSE ( metadata )? relation ( literals )? )
                {
                ProvaAST root_1 = (ProvaAST)adaptor.nil();
                root_1 = (ProvaAST)adaptor.becomeRoot((ProvaAST)adaptor.create(CLAUSE, "CLAUSE"), root_1);

                // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:118:57: ( metadata )?
                if ( stream_metadata.hasNext() ) {
                    adaptor.addChild(root_1, stream_metadata.nextTree());

                }
                stream_metadata.reset();
                adaptor.addChild(root_1, stream_relation.nextTree());
                // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:118:76: ( literals )?
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
    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:120:1: metadata : ( annotation ( NEWLINE )* )+ -> ^( METADATA ( annotation )+ ) ;
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
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:121:2: ( ( annotation ( NEWLINE )* )+ -> ^( METADATA ( annotation )+ ) )
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:121:4: ( annotation ( NEWLINE )* )+
            {
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:121:4: ( annotation ( NEWLINE )* )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==67) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:121:5: annotation ( NEWLINE )*
            	    {
            	    pushFollow(FOLLOW_annotation_in_metadata493);
            	    annotation26=annotation();

            	    state._fsp--;

            	    stream_annotation.add(annotation26.getTree());
            	    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:121:16: ( NEWLINE )*
            	    loop12:
            	    do {
            	        int alt12=2;
            	        int LA12_0 = input.LA(1);

            	        if ( (LA12_0==NEWLINE) ) {
            	            alt12=1;
            	        }


            	        switch (alt12) {
            	    	case 1 :
            	    	    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:121:16: NEWLINE
            	    	    {
            	    	    NEWLINE27=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_metadata495);  
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
            // 121:27: -> ^( METADATA ( annotation )+ )
            {
                // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:121:30: ^( METADATA ( annotation )+ )
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
    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:124:1: annotation : '@' LCWORD ( '(' value ( COMMA value )* ')' )? -> ^( ANNOTATION LCWORD ( value )* ) ;
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
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_OPEN=new RewriteRuleTokenStream(adaptor,"token OPEN");
        RewriteRuleTokenStream stream_CLOSE=new RewriteRuleTokenStream(adaptor,"token CLOSE");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LCWORD=new RewriteRuleTokenStream(adaptor,"token LCWORD");
        RewriteRuleSubtreeStream stream_value=new RewriteRuleSubtreeStream(adaptor,"rule value");
        try {
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:125:2: ( '@' LCWORD ( '(' value ( COMMA value )* ')' )? -> ^( ANNOTATION LCWORD ( value )* ) )
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:125:4: '@' LCWORD ( '(' value ( COMMA value )* ')' )?
            {
            char_literal28=(Token)match(input,67,FOLLOW_67_in_annotation517);  
            stream_67.add(char_literal28);

            LCWORD29=(Token)match(input,LCWORD,FOLLOW_LCWORD_in_annotation519);  
            stream_LCWORD.add(LCWORD29);

            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:125:15: ( '(' value ( COMMA value )* ')' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==OPEN) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:125:16: '(' value ( COMMA value )* ')'
                    {
                    char_literal30=(Token)match(input,OPEN,FOLLOW_OPEN_in_annotation522);  
                    stream_OPEN.add(char_literal30);

                    pushFollow(FOLLOW_value_in_annotation524);
                    value31=value();

                    state._fsp--;

                    stream_value.add(value31.getTree());
                    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:125:26: ( COMMA value )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==COMMA) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:125:27: COMMA value
                    	    {
                    	    COMMA32=(Token)match(input,COMMA,FOLLOW_COMMA_in_annotation527);  
                    	    stream_COMMA.add(COMMA32);

                    	    pushFollow(FOLLOW_value_in_annotation529);
                    	    value33=value();

                    	    state._fsp--;

                    	    stream_value.add(value33.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    char_literal34=(Token)match(input,CLOSE,FOLLOW_CLOSE_in_annotation533);  
                    stream_CLOSE.add(char_literal34);


                    }
                    break;

            }



            // AST REWRITE
            // elements: value, LCWORD
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ProvaAST)adaptor.nil();
            // 125:47: -> ^( ANNOTATION LCWORD ( value )* )
            {
                // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:125:50: ^( ANNOTATION LCWORD ( value )* )
                {
                ProvaAST root_1 = (ProvaAST)adaptor.nil();
                root_1 = (ProvaAST)adaptor.becomeRoot((ProvaAST)adaptor.create(ANNOTATION, "ANNOTATION"), root_1);

                adaptor.addChild(root_1, stream_LCWORD.nextNode());
                // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:125:70: ( value )*
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
    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:128:1: value : ( LCWORD | UCWORD | string | number );
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
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:129:2: ( LCWORD | UCWORD | string | number )
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
                    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:129:4: LCWORD
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    LCWORD35=(Token)match(input,LCWORD,FOLLOW_LCWORD_in_value558); 
                    LCWORD35_tree = (ProvaAST)adaptor.create(LCWORD35);
                    adaptor.addChild(root_0, LCWORD35_tree);


                    }
                    break;
                case 2 :
                    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:129:13: UCWORD
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    UCWORD36=(Token)match(input,UCWORD,FOLLOW_UCWORD_in_value562); 
                    UCWORD36_tree = (ProvaAST)adaptor.create(UCWORD36);
                    adaptor.addChild(root_0, UCWORD36_tree);


                    }
                    break;
                case 3 :
                    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:129:22: string
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_string_in_value566);
                    string37=string();

                    state._fsp--;

                    adaptor.addChild(root_0, string37.getTree());

                    }
                    break;
                case 4 :
                    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:129:31: number
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_number_in_value570);
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
    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:132:1: literals : literal ( COMMA literal )* -> ^( LITERAL ( literal )+ ) ;
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
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:132:11: ( literal ( COMMA literal )* -> ^( LITERAL ( literal )+ ) )
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:132:13: literal ( COMMA literal )*
            {
            pushFollow(FOLLOW_literal_in_literals580);
            literal39=literal();

            state._fsp--;

            stream_literal.add(literal39.getTree());
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:132:21: ( COMMA literal )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==COMMA) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:132:22: COMMA literal
            	    {
            	    COMMA40=(Token)match(input,COMMA,FOLLOW_COMMA_in_literals583);  
            	    stream_COMMA.add(COMMA40);

            	    pushFollow(FOLLOW_literal_in_literals585);
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
            // 132:38: -> ^( LITERAL ( literal )+ )
            {
                // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:132:41: ^( LITERAL ( literal )+ )
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
    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:134:1: literal : ( ( NEWLINE )* (m= metadata )? r= relation (g= guard )? -> ^( RELATION ( metadata )? relation ( guard )? ) | ( NEWLINE )* (m= metadata )? semantic_attachment (g= guard )? -> ^( SEMANTIC_ATTACHMENT ( metadata )? semantic_attachment ( guard )? ) | ( NEWLINE )* cut -> ^( CUT cut ) );
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
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:134:10: ( ( NEWLINE )* (m= metadata )? r= relation (g= guard )? -> ^( RELATION ( metadata )? relation ( guard )? ) | ( NEWLINE )* (m= metadata )? semantic_attachment (g= guard )? -> ^( SEMANTIC_ATTACHMENT ( metadata )? semantic_attachment ( guard )? ) | ( NEWLINE )* cut -> ^( CUT cut ) )
            int alt25=3;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:134:12: ( NEWLINE )* (m= metadata )? r= relation (g= guard )?
                    {
                    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:134:12: ( NEWLINE )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==NEWLINE) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:134:12: NEWLINE
                    	    {
                    	    NEWLINE42=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_literal605);  
                    	    stream_NEWLINE.add(NEWLINE42);


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:134:22: (m= metadata )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==67) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:134:22: m= metadata
                            {
                            pushFollow(FOLLOW_metadata_in_literal610);
                            m=metadata();

                            state._fsp--;

                            stream_metadata.add(m.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_relation_in_literal615);
                    r=relation();

                    state._fsp--;

                    stream_relation.add(r.getTree());
                    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:134:45: (g= guard )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==BRA) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:134:45: g= guard
                            {
                            pushFollow(FOLLOW_guard_in_literal619);
                            g=guard();

                            state._fsp--;

                            stream_guard.add(g.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: relation, metadata, guard
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ProvaAST)adaptor.nil();
                    // 134:53: -> ^( RELATION ( metadata )? relation ( guard )? )
                    {
                        // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:134:56: ^( RELATION ( metadata )? relation ( guard )? )
                        {
                        ProvaAST root_1 = (ProvaAST)adaptor.nil();
                        root_1 = (ProvaAST)adaptor.becomeRoot((ProvaAST)adaptor.create(RELATION, "RELATION"), root_1);

                        // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:134:67: ( metadata )?
                        if ( stream_metadata.hasNext() ) {
                            adaptor.addChild(root_1, stream_metadata.nextTree());

                        }
                        stream_metadata.reset();
                        adaptor.addChild(root_1, stream_relation.nextTree());
                        // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:134:86: ( guard )?
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
                    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:135:6: ( NEWLINE )* (m= metadata )? semantic_attachment (g= guard )?
                    {
                    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:135:6: ( NEWLINE )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==NEWLINE) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:135:6: NEWLINE
                    	    {
                    	    NEWLINE43=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_literal641);  
                    	    stream_NEWLINE.add(NEWLINE43);


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:135:16: (m= metadata )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==67) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:135:16: m= metadata
                            {
                            pushFollow(FOLLOW_metadata_in_literal646);
                            m=metadata();

                            state._fsp--;

                            stream_metadata.add(m.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_semantic_attachment_in_literal649);
                    semantic_attachment44=semantic_attachment();

                    state._fsp--;

                    stream_semantic_attachment.add(semantic_attachment44.getTree());
                    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:135:48: (g= guard )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==BRA) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:135:48: g= guard
                            {
                            pushFollow(FOLLOW_guard_in_literal653);
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
                    // 135:56: -> ^( SEMANTIC_ATTACHMENT ( metadata )? semantic_attachment ( guard )? )
                    {
                        // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:135:59: ^( SEMANTIC_ATTACHMENT ( metadata )? semantic_attachment ( guard )? )
                        {
                        ProvaAST root_1 = (ProvaAST)adaptor.nil();
                        root_1 = (ProvaAST)adaptor.becomeRoot((ProvaAST)adaptor.create(SEMANTIC_ATTACHMENT, "SEMANTIC_ATTACHMENT"), root_1);

                        // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:135:81: ( metadata )?
                        if ( stream_metadata.hasNext() ) {
                            adaptor.addChild(root_1, stream_metadata.nextTree());

                        }
                        stream_metadata.reset();
                        adaptor.addChild(root_1, stream_semantic_attachment.nextTree());
                        // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:135:111: ( guard )?
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
                    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:136:6: ( NEWLINE )* cut
                    {
                    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:136:6: ( NEWLINE )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==NEWLINE) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:136:6: NEWLINE
                    	    {
                    	    NEWLINE45=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_literal675);  
                    	    stream_NEWLINE.add(NEWLINE45);


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    pushFollow(FOLLOW_cut_in_literal678);
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
                    // 136:19: -> ^( CUT cut )
                    {
                        // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:136:22: ^( CUT cut )
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
    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:138:1: cut : CUT ;
    public final Prova2Parser.cut_return cut() throws RecognitionException {
        Prova2Parser.cut_return retval = new Prova2Parser.cut_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token CUT47=null;

        ProvaAST CUT47_tree=null;

        try {
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:138:5: ( CUT )
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:138:7: CUT
            {
            root_0 = (ProvaAST)adaptor.nil();

            CUT47=(Token)match(input,CUT,FOLLOW_CUT_in_cut694); 
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
    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:140:1: binary_operator : ( not_equal | LT | GT | LE | GE );
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
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:141:2: ( not_equal | LT | GT | LE | GE )
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
                    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:141:4: not_equal
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_not_equal_in_binary_operator703);
                    not_equal48=not_equal();

                    state._fsp--;

                    adaptor.addChild(root_0, not_equal48.getTree());

                    }
                    break;
                case 2 :
                    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:141:16: LT
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    LT49=(Token)match(input,LT,FOLLOW_LT_in_binary_operator707); 
                    LT49_tree = (ProvaAST)adaptor.create(LT49);
                    adaptor.addChild(root_0, LT49_tree);


                    }
                    break;
                case 3 :
                    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:141:21: GT
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    GT50=(Token)match(input,GT,FOLLOW_GT_in_binary_operator711); 
                    GT50_tree = (ProvaAST)adaptor.create(GT50);
                    adaptor.addChild(root_0, GT50_tree);


                    }
                    break;
                case 4 :
                    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:141:26: LE
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    LE51=(Token)match(input,LE,FOLLOW_LE_in_binary_operator715); 
                    LE51_tree = (ProvaAST)adaptor.create(LE51);
                    adaptor.addChild(root_0, LE51_tree);


                    }
                    break;
                case 5 :
                    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:141:31: GE
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    GE52=(Token)match(input,GE,FOLLOW_GE_in_binary_operator719); 
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
    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:144:1: relation : predicate '(' list_body ')' -> ^( PREDICATE predicate list_body ) ;
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
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:145:2: ( predicate '(' list_body ')' -> ^( PREDICATE predicate list_body ) )
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:145:4: predicate '(' list_body ')'
            {
            pushFollow(FOLLOW_predicate_in_relation731);
            predicate53=predicate();

            state._fsp--;

            stream_predicate.add(predicate53.getTree());
            char_literal54=(Token)match(input,OPEN,FOLLOW_OPEN_in_relation733);  
            stream_OPEN.add(char_literal54);

            pushFollow(FOLLOW_list_body_in_relation735);
            list_body55=list_body();

            state._fsp--;

            stream_list_body.add(list_body55.getTree());
            char_literal56=(Token)match(input,CLOSE,FOLLOW_CLOSE_in_relation737);  
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
            // 145:32: -> ^( PREDICATE predicate list_body )
            {
                // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:145:35: ^( PREDICATE predicate list_body )
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
    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:147:1: guard : '[' literals ']' -> ^( GUARD literals ) ;
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
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:148:2: ( '[' literals ']' -> ^( GUARD literals ) )
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:148:4: '[' literals ']'
            {
            char_literal57=(Token)match(input,BRA,FOLLOW_BRA_in_guard756);  
            stream_BRA.add(char_literal57);

            pushFollow(FOLLOW_literals_in_guard758);
            literals58=literals();

            state._fsp--;

            stream_literals.add(literals58.getTree());
            char_literal59=(Token)match(input,KET,FOLLOW_KET_in_guard760);  
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
            // 148:21: -> ^( GUARD literals )
            {
                // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:148:24: ^( GUARD literals )
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
    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:151:1: list_body : ( terms ( '|' list_tail )? )? ( NEWLINE )* -> ^( LIST_BODY ( terms ( list_tail )? )? ) ;
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
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:152:3: ( ( terms ( '|' list_tail )? )? ( NEWLINE )* -> ^( LIST_BODY ( terms ( list_tail )? )? ) )
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:152:5: ( terms ( '|' list_tail )? )? ( NEWLINE )*
            {
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:152:5: ( terms ( '|' list_tail )? )?
            int alt28=2;
            alt28 = dfa28.predict(input);
            switch (alt28) {
                case 1 :
                    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:152:6: terms ( '|' list_tail )?
                    {
                    pushFollow(FOLLOW_terms_in_list_body781);
                    terms60=terms();

                    state._fsp--;

                    stream_terms.add(terms60.getTree());
                    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:152:12: ( '|' list_tail )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==BAR) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:152:13: '|' list_tail
                            {
                            char_literal61=(Token)match(input,BAR,FOLLOW_BAR_in_list_body784);  
                            stream_BAR.add(char_literal61);

                            pushFollow(FOLLOW_list_tail_in_list_body786);
                            list_tail62=list_tail();

                            state._fsp--;

                            stream_list_tail.add(list_tail62.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }

            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:152:31: ( NEWLINE )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==NEWLINE) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:152:31: NEWLINE
            	    {
            	    NEWLINE63=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_list_body792);  
            	    stream_NEWLINE.add(NEWLINE63);


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);



            // AST REWRITE
            // elements: list_tail, terms
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ProvaAST)adaptor.nil();
            // 152:40: -> ^( LIST_BODY ( terms ( list_tail )? )? )
            {
                // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:152:43: ^( LIST_BODY ( terms ( list_tail )? )? )
                {
                ProvaAST root_1 = (ProvaAST)adaptor.nil();
                root_1 = (ProvaAST)adaptor.becomeRoot((ProvaAST)adaptor.create(LIST_BODY, "LIST_BODY"), root_1);

                // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:152:55: ( terms ( list_tail )? )?
                if ( stream_list_tail.hasNext()||stream_terms.hasNext() ) {
                    adaptor.addChild(root_1, stream_terms.nextTree());
                    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:152:62: ( list_tail )?
                    if ( stream_list_tail.hasNext() ) {
                        adaptor.addChild(root_1, stream_list_tail.nextTree());

                    }
                    stream_list_tail.reset();

                }
                stream_list_tail.reset();
                stream_terms.reset();

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
    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:154:1: list_tail : ( variable | prova_list );
    public final Prova2Parser.list_tail_return list_tail() throws RecognitionException {
        Prova2Parser.list_tail_return retval = new Prova2Parser.list_tail_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Prova2Parser.variable_return variable64 = null;

        Prova2Parser.prova_list_return prova_list65 = null;



        try {
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:155:2: ( variable | prova_list )
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
                    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:155:4: variable
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_variable_in_list_tail817);
                    variable64=variable();

                    state._fsp--;

                    adaptor.addChild(root_0, variable64.getTree());

                    }
                    break;
                case 2 :
                    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:155:15: prova_list
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_prova_list_in_list_tail821);
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
    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:157:1: left_term : ( constant | variable | number | prova_list );
    public final Prova2Parser.left_term_return left_term() throws RecognitionException {
        Prova2Parser.left_term_return retval = new Prova2Parser.left_term_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Prova2Parser.constant_return constant66 = null;

        Prova2Parser.variable_return variable67 = null;

        Prova2Parser.number_return number68 = null;

        Prova2Parser.prova_list_return prova_list69 = null;



        try {
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:158:2: ( constant | variable | number | prova_list )
            int alt31=4;
            alt31 = dfa31.predict(input);
            switch (alt31) {
                case 1 :
                    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:158:4: constant
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_constant_in_left_term831);
                    constant66=constant();

                    state._fsp--;

                    adaptor.addChild(root_0, constant66.getTree());

                    }
                    break;
                case 2 :
                    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:159:3: variable
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_variable_in_left_term838);
                    variable67=variable();

                    state._fsp--;

                    adaptor.addChild(root_0, variable67.getTree());

                    }
                    break;
                case 3 :
                    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:160:3: number
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_number_in_left_term844);
                    number68=number();

                    state._fsp--;

                    adaptor.addChild(root_0, number68.getTree());

                    }
                    break;
                case 4 :
                    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:161:3: prova_list
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_prova_list_in_left_term850);
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
    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:163:1: right_term : ( ( ( MINUS )? ( constant | variable ) ) | number | prova_list );
    public final Prova2Parser.right_term_return right_term() throws RecognitionException {
        Prova2Parser.right_term_return retval = new Prova2Parser.right_term_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token MINUS70=null;
        Prova2Parser.constant_return constant71 = null;

        Prova2Parser.variable_return variable72 = null;

        Prova2Parser.number_return number73 = null;

        Prova2Parser.prova_list_return prova_list74 = null;


        ProvaAST MINUS70_tree=null;

        try {
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:164:2: ( ( ( MINUS )? ( constant | variable ) ) | number | prova_list )
            int alt34=3;
            switch ( input.LA(1) ) {
            case MINUS:
                {
                int LA34_1 = input.LA(2);

                if ( ((LA34_1>=INT_LITERAL && LA34_1<=LONG_LITERAL)) ) {
                    alt34=2;
                }
                else if ( (LA34_1==USWORD||LA34_1==DOLLARWORD||(LA34_1>=LCWORD && LA34_1<=UCWORD)||(LA34_1>=STRING1 && LA34_1<=STRING2)) ) {
                    alt34=1;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:164:4: ( ( MINUS )? ( constant | variable ) )
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:164:4: ( ( MINUS )? ( constant | variable ) )
                    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:164:5: ( MINUS )? ( constant | variable )
                    {
                    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:164:5: ( MINUS )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==MINUS) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:164:5: MINUS
                            {
                            MINUS70=(Token)match(input,MINUS,FOLLOW_MINUS_in_right_term861); 
                            MINUS70_tree = (ProvaAST)adaptor.create(MINUS70);
                            adaptor.addChild(root_0, MINUS70_tree);


                            }
                            break;

                    }

                    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:164:12: ( constant | variable )
                    int alt33=2;
                    alt33 = dfa33.predict(input);
                    switch (alt33) {
                        case 1 :
                            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:164:13: constant
                            {
                            pushFollow(FOLLOW_constant_in_right_term865);
                            constant71=constant();

                            state._fsp--;

                            adaptor.addChild(root_0, constant71.getTree());

                            }
                            break;
                        case 2 :
                            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:164:24: variable
                            {
                            pushFollow(FOLLOW_variable_in_right_term869);
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
                    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:164:37: number
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_number_in_right_term875);
                    number73=number();

                    state._fsp--;

                    adaptor.addChild(root_0, number73.getTree());

                    }
                    break;
                case 3 :
                    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:164:46: prova_list
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_prova_list_in_right_term879);
                    prova_list74=prova_list();

                    state._fsp--;

                    adaptor.addChild(root_0, prova_list74.getTree());

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

    public static class terms_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "terms"
    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:166:1: terms : ( NEWLINE )* term ( ( NEWLINE )* ',' ( NEWLINE )* term )* -> ^( TERM ( term )+ ) ;
    public final Prova2Parser.terms_return terms() throws RecognitionException {
        Prova2Parser.terms_return retval = new Prova2Parser.terms_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token NEWLINE75=null;
        Token NEWLINE77=null;
        Token char_literal78=null;
        Token NEWLINE79=null;
        Prova2Parser.term_return term76 = null;

        Prova2Parser.term_return term80 = null;


        ProvaAST NEWLINE75_tree=null;
        ProvaAST NEWLINE77_tree=null;
        ProvaAST char_literal78_tree=null;
        ProvaAST NEWLINE79_tree=null;
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_term=new RewriteRuleSubtreeStream(adaptor,"rule term");
        try {
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:166:8: ( ( NEWLINE )* term ( ( NEWLINE )* ',' ( NEWLINE )* term )* -> ^( TERM ( term )+ ) )
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:166:10: ( NEWLINE )* term ( ( NEWLINE )* ',' ( NEWLINE )* term )*
            {
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:166:10: ( NEWLINE )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==NEWLINE) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:166:10: NEWLINE
            	    {
            	    NEWLINE75=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_terms888);  
            	    stream_NEWLINE.add(NEWLINE75);


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            pushFollow(FOLLOW_term_in_terms891);
            term76=term();

            state._fsp--;

            stream_term.add(term76.getTree());
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:166:24: ( ( NEWLINE )* ',' ( NEWLINE )* term )*
            loop38:
            do {
                int alt38=2;
                alt38 = dfa38.predict(input);
                switch (alt38) {
            	case 1 :
            	    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:166:25: ( NEWLINE )* ',' ( NEWLINE )* term
            	    {
            	    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:166:25: ( NEWLINE )*
            	    loop36:
            	    do {
            	        int alt36=2;
            	        int LA36_0 = input.LA(1);

            	        if ( (LA36_0==NEWLINE) ) {
            	            alt36=1;
            	        }


            	        switch (alt36) {
            	    	case 1 :
            	    	    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:166:25: NEWLINE
            	    	    {
            	    	    NEWLINE77=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_terms894);  
            	    	    stream_NEWLINE.add(NEWLINE77);


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop36;
            	        }
            	    } while (true);

            	    char_literal78=(Token)match(input,COMMA,FOLLOW_COMMA_in_terms897);  
            	    stream_COMMA.add(char_literal78);

            	    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:166:38: ( NEWLINE )*
            	    loop37:
            	    do {
            	        int alt37=2;
            	        int LA37_0 = input.LA(1);

            	        if ( (LA37_0==NEWLINE) ) {
            	            alt37=1;
            	        }


            	        switch (alt37) {
            	    	case 1 :
            	    	    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:166:38: NEWLINE
            	    	    {
            	    	    NEWLINE79=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_terms899);  
            	    	    stream_NEWLINE.add(NEWLINE79);


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop37;
            	        }
            	    } while (true);

            	    pushFollow(FOLLOW_term_in_terms902);
            	    term80=term();

            	    state._fsp--;

            	    stream_term.add(term80.getTree());

            	    }
            	    break;

            	default :
            	    break loop38;
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
            // 166:54: -> ^( TERM ( term )+ )
            {
                // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:166:57: ^( TERM ( term )+ )
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
    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:168:1: term : ( left_term | func_term );
    public final Prova2Parser.term_return term() throws RecognitionException {
        Prova2Parser.term_return retval = new Prova2Parser.term_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Prova2Parser.left_term_return left_term81 = null;

        Prova2Parser.func_term_return func_term82 = null;



        try {
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:168:6: ( left_term | func_term )
            int alt39=2;
            alt39 = dfa39.predict(input);
            switch (alt39) {
                case 1 :
                    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:168:8: left_term
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_left_term_in_term921);
                    left_term81=left_term();

                    state._fsp--;

                    adaptor.addChild(root_0, left_term81.getTree());

                    }
                    break;
                case 2 :
                    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:168:20: func_term
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_func_term_in_term925);
                    func_term82=func_term();

                    state._fsp--;

                    adaptor.addChild(root_0, func_term82.getTree());

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
    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:170:1: func_term : func args ;
    public final Prova2Parser.func_term_return func_term() throws RecognitionException {
        Prova2Parser.func_term_return retval = new Prova2Parser.func_term_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Prova2Parser.func_return func83 = null;

        Prova2Parser.args_return args84 = null;



        try {
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:171:2: ( func args )
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:171:4: func args
            {
            root_0 = (ProvaAST)adaptor.nil();

            pushFollow(FOLLOW_func_in_func_term934);
            func83=func();

            state._fsp--;

            adaptor.addChild(root_0, func83.getTree());
            pushFollow(FOLLOW_args_in_func_term936);
            args84=args();

            state._fsp--;

            adaptor.addChild(root_0, args84.getTree());

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
    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:173:1: qualified_java_class : ( ( LCWORD DOT )+ UCWORD ) -> ^( QUALIFIED_JAVA_CLASS ( LCWORD DOT )+ UCWORD ) ;
    public final Prova2Parser.qualified_java_class_return qualified_java_class() throws RecognitionException {
        Prova2Parser.qualified_java_class_return retval = new Prova2Parser.qualified_java_class_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token LCWORD85=null;
        Token DOT86=null;
        Token UCWORD87=null;

        ProvaAST LCWORD85_tree=null;
        ProvaAST DOT86_tree=null;
        ProvaAST UCWORD87_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_UCWORD=new RewriteRuleTokenStream(adaptor,"token UCWORD");
        RewriteRuleTokenStream stream_LCWORD=new RewriteRuleTokenStream(adaptor,"token LCWORD");

        try {
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:174:2: ( ( ( LCWORD DOT )+ UCWORD ) -> ^( QUALIFIED_JAVA_CLASS ( LCWORD DOT )+ UCWORD ) )
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:174:4: ( ( LCWORD DOT )+ UCWORD )
            {
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:174:4: ( ( LCWORD DOT )+ UCWORD )
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:174:5: ( LCWORD DOT )+ UCWORD
            {
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:174:5: ( LCWORD DOT )+
            int cnt40=0;
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==LCWORD) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:174:6: LCWORD DOT
            	    {
            	    LCWORD85=(Token)match(input,LCWORD,FOLLOW_LCWORD_in_qualified_java_class949);  
            	    stream_LCWORD.add(LCWORD85);

            	    DOT86=(Token)match(input,DOT,FOLLOW_DOT_in_qualified_java_class951);  
            	    stream_DOT.add(DOT86);


            	    }
            	    break;

            	default :
            	    if ( cnt40 >= 1 ) break loop40;
                        EarlyExitException eee =
                            new EarlyExitException(40, input);
                        throw eee;
                }
                cnt40++;
            } while (true);

            UCWORD87=(Token)match(input,UCWORD,FOLLOW_UCWORD_in_qualified_java_class955);  
            stream_UCWORD.add(UCWORD87);


            }



            // AST REWRITE
            // elements: LCWORD, DOT, UCWORD
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ProvaAST)adaptor.nil();
            // 174:27: -> ^( QUALIFIED_JAVA_CLASS ( LCWORD DOT )+ UCWORD )
            {
                // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:174:30: ^( QUALIFIED_JAVA_CLASS ( LCWORD DOT )+ UCWORD )
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
    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:177:1: prova_list : '[' list_body ']' -> ^( PROVA_LIST list_body ) ;
    public final Prova2Parser.prova_list_return prova_list() throws RecognitionException {
        Prova2Parser.prova_list_return retval = new Prova2Parser.prova_list_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token char_literal88=null;
        Token char_literal90=null;
        Prova2Parser.list_body_return list_body89 = null;


        ProvaAST char_literal88_tree=null;
        ProvaAST char_literal90_tree=null;
        RewriteRuleTokenStream stream_BRA=new RewriteRuleTokenStream(adaptor,"token BRA");
        RewriteRuleTokenStream stream_KET=new RewriteRuleTokenStream(adaptor,"token KET");
        RewriteRuleSubtreeStream stream_list_body=new RewriteRuleSubtreeStream(adaptor,"rule list_body");
        try {
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:178:2: ( '[' list_body ']' -> ^( PROVA_LIST list_body ) )
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:178:4: '[' list_body ']'
            {
            char_literal88=(Token)match(input,BRA,FOLLOW_BRA_in_prova_list983);  
            stream_BRA.add(char_literal88);

            pushFollow(FOLLOW_list_body_in_prova_list985);
            list_body89=list_body();

            state._fsp--;

            stream_list_body.add(list_body89.getTree());
            char_literal90=(Token)match(input,KET,FOLLOW_KET_in_prova_list987);  
            stream_KET.add(char_literal90);



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
            // 178:22: -> ^( PROVA_LIST list_body )
            {
                // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:178:25: ^( PROVA_LIST list_body )
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
    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:180:1: args : '(' list_body ')' -> ^( ARGS list_body ) ;
    public final Prova2Parser.args_return args() throws RecognitionException {
        Prova2Parser.args_return retval = new Prova2Parser.args_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token char_literal91=null;
        Token char_literal93=null;
        Prova2Parser.list_body_return list_body92 = null;


        ProvaAST char_literal91_tree=null;
        ProvaAST char_literal93_tree=null;
        RewriteRuleTokenStream stream_OPEN=new RewriteRuleTokenStream(adaptor,"token OPEN");
        RewriteRuleTokenStream stream_CLOSE=new RewriteRuleTokenStream(adaptor,"token CLOSE");
        RewriteRuleSubtreeStream stream_list_body=new RewriteRuleSubtreeStream(adaptor,"rule list_body");
        try {
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:180:7: ( '(' list_body ')' -> ^( ARGS list_body ) )
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:180:9: '(' list_body ')'
            {
            char_literal91=(Token)match(input,OPEN,FOLLOW_OPEN_in_args1004);  
            stream_OPEN.add(char_literal91);

            pushFollow(FOLLOW_list_body_in_args1006);
            list_body92=list_body();

            state._fsp--;

            stream_list_body.add(list_body92.getTree());
            char_literal93=(Token)match(input,CLOSE,FOLLOW_CLOSE_in_args1008);  
            stream_CLOSE.add(char_literal93);



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
            // 180:27: -> ^( ARGS list_body )
            {
                // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:180:30: ^( ARGS list_body )
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
    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:182:1: semantic_attachment : ( predicate_java_call | binary_operation );
    public final Prova2Parser.semantic_attachment_return semantic_attachment() throws RecognitionException {
        Prova2Parser.semantic_attachment_return retval = new Prova2Parser.semantic_attachment_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Prova2Parser.predicate_java_call_return predicate_java_call94 = null;

        Prova2Parser.binary_operation_return binary_operation95 = null;



        try {
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:183:2: ( predicate_java_call | binary_operation )
            int alt41=2;
            alt41 = dfa41.predict(input);
            switch (alt41) {
                case 1 :
                    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:183:4: predicate_java_call
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_predicate_java_call_in_semantic_attachment1026);
                    predicate_java_call94=predicate_java_call();

                    state._fsp--;

                    adaptor.addChild(root_0, predicate_java_call94.getTree());

                    }
                    break;
                case 2 :
                    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:183:26: binary_operation
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_binary_operation_in_semantic_attachment1030);
                    binary_operation95=binary_operation();

                    state._fsp--;

                    adaptor.addChild(root_0, binary_operation95.getTree());

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
    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:185:1: binary_operation : left_term ( EQUAL ( constructor_java_call | prova_list | constant | expr ) | not_equal constant | binary_operator expr ) ;
    public final Prova2Parser.binary_operation_return binary_operation() throws RecognitionException {
        Prova2Parser.binary_operation_return retval = new Prova2Parser.binary_operation_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token EQUAL97=null;
        Prova2Parser.left_term_return left_term96 = null;

        Prova2Parser.constructor_java_call_return constructor_java_call98 = null;

        Prova2Parser.prova_list_return prova_list99 = null;

        Prova2Parser.constant_return constant100 = null;

        Prova2Parser.expr_return expr101 = null;

        Prova2Parser.not_equal_return not_equal102 = null;

        Prova2Parser.constant_return constant103 = null;

        Prova2Parser.binary_operator_return binary_operator104 = null;

        Prova2Parser.expr_return expr105 = null;


        ProvaAST EQUAL97_tree=null;

        try {
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:186:2: ( left_term ( EQUAL ( constructor_java_call | prova_list | constant | expr ) | not_equal constant | binary_operator expr ) )
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:186:4: left_term ( EQUAL ( constructor_java_call | prova_list | constant | expr ) | not_equal constant | binary_operator expr )
            {
            root_0 = (ProvaAST)adaptor.nil();

            pushFollow(FOLLOW_left_term_in_binary_operation1039);
            left_term96=left_term();

            state._fsp--;

            adaptor.addChild(root_0, left_term96.getTree());
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:187:3: ( EQUAL ( constructor_java_call | prova_list | constant | expr ) | not_equal constant | binary_operator expr )
            int alt43=3;
            alt43 = dfa43.predict(input);
            switch (alt43) {
                case 1 :
                    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:187:5: EQUAL ( constructor_java_call | prova_list | constant | expr )
                    {
                    EQUAL97=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_binary_operation1045); 
                    EQUAL97_tree = (ProvaAST)adaptor.create(EQUAL97);
                    adaptor.addChild(root_0, EQUAL97_tree);

                    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:188:4: ( constructor_java_call | prova_list | constant | expr )
                    int alt42=4;
                    alt42 = dfa42.predict(input);
                    switch (alt42) {
                        case 1 :
                            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:189:4: constructor_java_call
                            {
                            pushFollow(FOLLOW_constructor_java_call_in_binary_operation1055);
                            constructor_java_call98=constructor_java_call();

                            state._fsp--;

                            adaptor.addChild(root_0, constructor_java_call98.getTree());

                            }
                            break;
                        case 2 :
                            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:190:6: prova_list
                            {
                            pushFollow(FOLLOW_prova_list_in_binary_operation1062);
                            prova_list99=prova_list();

                            state._fsp--;

                            adaptor.addChild(root_0, prova_list99.getTree());

                            }
                            break;
                        case 3 :
                            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:191:6: constant
                            {
                            pushFollow(FOLLOW_constant_in_binary_operation1069);
                            constant100=constant();

                            state._fsp--;

                            adaptor.addChild(root_0, constant100.getTree());

                            }
                            break;
                        case 4 :
                            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:192:6: expr
                            {
                            pushFollow(FOLLOW_expr_in_binary_operation1076);
                            expr101=expr();

                            state._fsp--;

                            adaptor.addChild(root_0, expr101.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:194:5: not_equal constant
                    {
                    pushFollow(FOLLOW_not_equal_in_binary_operation1087);
                    not_equal102=not_equal();

                    state._fsp--;

                    adaptor.addChild(root_0, not_equal102.getTree());
                    pushFollow(FOLLOW_constant_in_binary_operation1089);
                    constant103=constant();

                    state._fsp--;

                    adaptor.addChild(root_0, constant103.getTree());

                    }
                    break;
                case 3 :
                    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:195:5: binary_operator expr
                    {
                    pushFollow(FOLLOW_binary_operator_in_binary_operation1095);
                    binary_operator104=binary_operator();

                    state._fsp--;

                    adaptor.addChild(root_0, binary_operator104.getTree());
                    pushFollow(FOLLOW_expr_in_binary_operation1097);
                    expr105=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr105.getTree());

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
    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:198:1: expr : aterm ( ( PLUS | MINUS ) expr )? ;
    public final Prova2Parser.expr_return expr() throws RecognitionException {
        Prova2Parser.expr_return retval = new Prova2Parser.expr_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token set107=null;
        Prova2Parser.aterm_return aterm106 = null;

        Prova2Parser.expr_return expr108 = null;


        ProvaAST set107_tree=null;

        try {
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:198:6: ( aterm ( ( PLUS | MINUS ) expr )? )
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:198:8: aterm ( ( PLUS | MINUS ) expr )?
            {
            root_0 = (ProvaAST)adaptor.nil();

            pushFollow(FOLLOW_aterm_in_expr1109);
            aterm106=aterm();

            state._fsp--;

            adaptor.addChild(root_0, aterm106.getTree());
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:198:14: ( ( PLUS | MINUS ) expr )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=PLUS && LA44_0<=MINUS)) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:198:15: ( PLUS | MINUS ) expr
                    {
                    set107=(Token)input.LT(1);
                    if ( (input.LA(1)>=PLUS && input.LA(1)<=MINUS) ) {
                        input.consume();
                        adaptor.addChild(root_0, (ProvaAST)adaptor.create(set107));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_expr_in_expr1120);
                    expr108=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr108.getTree());

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
    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:200:1: aterm : ( ( MINUS )? variable | number | ( MINUS )? predicate_java_call | OPEN expr CLOSE ) ( ( MULT | DIV | REM ) aterm )? ;
    public final Prova2Parser.aterm_return aterm() throws RecognitionException {
        Prova2Parser.aterm_return retval = new Prova2Parser.aterm_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token MINUS109=null;
        Token MINUS112=null;
        Token OPEN114=null;
        Token CLOSE116=null;
        Token set117=null;
        Prova2Parser.variable_return variable110 = null;

        Prova2Parser.number_return number111 = null;

        Prova2Parser.predicate_java_call_return predicate_java_call113 = null;

        Prova2Parser.expr_return expr115 = null;

        Prova2Parser.aterm_return aterm118 = null;


        ProvaAST MINUS109_tree=null;
        ProvaAST MINUS112_tree=null;
        ProvaAST OPEN114_tree=null;
        ProvaAST CLOSE116_tree=null;
        ProvaAST set117_tree=null;

        try {
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:200:7: ( ( ( MINUS )? variable | number | ( MINUS )? predicate_java_call | OPEN expr CLOSE ) ( ( MULT | DIV | REM ) aterm )? )
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:200:9: ( ( MINUS )? variable | number | ( MINUS )? predicate_java_call | OPEN expr CLOSE ) ( ( MULT | DIV | REM ) aterm )?
            {
            root_0 = (ProvaAST)adaptor.nil();

            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:200:9: ( ( MINUS )? variable | number | ( MINUS )? predicate_java_call | OPEN expr CLOSE )
            int alt47=4;
            alt47 = dfa47.predict(input);
            switch (alt47) {
                case 1 :
                    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:200:10: ( MINUS )? variable
                    {
                    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:200:10: ( MINUS )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==MINUS) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:200:10: MINUS
                            {
                            MINUS109=(Token)match(input,MINUS,FOLLOW_MINUS_in_aterm1132); 
                            MINUS109_tree = (ProvaAST)adaptor.create(MINUS109);
                            adaptor.addChild(root_0, MINUS109_tree);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_variable_in_aterm1135);
                    variable110=variable();

                    state._fsp--;

                    adaptor.addChild(root_0, variable110.getTree());

                    }
                    break;
                case 2 :
                    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:200:28: number
                    {
                    pushFollow(FOLLOW_number_in_aterm1139);
                    number111=number();

                    state._fsp--;

                    adaptor.addChild(root_0, number111.getTree());

                    }
                    break;
                case 3 :
                    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:200:37: ( MINUS )? predicate_java_call
                    {
                    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:200:37: ( MINUS )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==MINUS) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:200:37: MINUS
                            {
                            MINUS112=(Token)match(input,MINUS,FOLLOW_MINUS_in_aterm1143); 
                            MINUS112_tree = (ProvaAST)adaptor.create(MINUS112);
                            adaptor.addChild(root_0, MINUS112_tree);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_predicate_java_call_in_aterm1146);
                    predicate_java_call113=predicate_java_call();

                    state._fsp--;

                    adaptor.addChild(root_0, predicate_java_call113.getTree());

                    }
                    break;
                case 4 :
                    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:200:66: OPEN expr CLOSE
                    {
                    OPEN114=(Token)match(input,OPEN,FOLLOW_OPEN_in_aterm1150); 
                    OPEN114_tree = (ProvaAST)adaptor.create(OPEN114);
                    adaptor.addChild(root_0, OPEN114_tree);

                    pushFollow(FOLLOW_expr_in_aterm1152);
                    expr115=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr115.getTree());
                    CLOSE116=(Token)match(input,CLOSE,FOLLOW_CLOSE_in_aterm1154); 
                    CLOSE116_tree = (ProvaAST)adaptor.create(CLOSE116);
                    adaptor.addChild(root_0, CLOSE116_tree);


                    }
                    break;

            }

            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:200:83: ( ( MULT | DIV | REM ) aterm )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=MULT && LA48_0<=DIV)||LA48_0==REM) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:200:84: ( MULT | DIV | REM ) aterm
                    {
                    set117=(Token)input.LT(1);
                    if ( (input.LA(1)>=MULT && input.LA(1)<=DIV)||input.LA(1)==REM ) {
                        input.consume();
                        adaptor.addChild(root_0, (ProvaAST)adaptor.create(set117));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_aterm_in_aterm1172);
                    aterm118=aterm();

                    state._fsp--;

                    adaptor.addChild(root_0, aterm118.getTree());

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
    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:202:1: constructor_java_call : ( qualified_java_class | UCWORD ) args ;
    public final Prova2Parser.constructor_java_call_return constructor_java_call() throws RecognitionException {
        Prova2Parser.constructor_java_call_return retval = new Prova2Parser.constructor_java_call_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token UCWORD120=null;
        Prova2Parser.qualified_java_class_return qualified_java_class119 = null;

        Prova2Parser.args_return args121 = null;


        ProvaAST UCWORD120_tree=null;

        try {
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:203:2: ( ( qualified_java_class | UCWORD ) args )
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:203:4: ( qualified_java_class | UCWORD ) args
            {
            root_0 = (ProvaAST)adaptor.nil();

            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:203:4: ( qualified_java_class | UCWORD )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==LCWORD) ) {
                alt49=1;
            }
            else if ( (LA49_0==UCWORD) ) {
                alt49=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:203:5: qualified_java_class
                    {
                    pushFollow(FOLLOW_qualified_java_class_in_constructor_java_call1184);
                    qualified_java_class119=qualified_java_class();

                    state._fsp--;

                    adaptor.addChild(root_0, qualified_java_class119.getTree());

                    }
                    break;
                case 2 :
                    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:203:28: UCWORD
                    {
                    UCWORD120=(Token)match(input,UCWORD,FOLLOW_UCWORD_in_constructor_java_call1188); 
                    UCWORD120_tree = (ProvaAST)adaptor.create(UCWORD120);
                    adaptor.addChild(root_0, UCWORD120_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_args_in_constructor_java_call1191);
            args121=args();

            state._fsp--;

            adaptor.addChild(root_0, args121.getTree());

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
    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:206:1: predicate_java_call : ( static_java_call | instance_java_call );
    public final Prova2Parser.predicate_java_call_return predicate_java_call() throws RecognitionException {
        Prova2Parser.predicate_java_call_return retval = new Prova2Parser.predicate_java_call_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Prova2Parser.static_java_call_return static_java_call122 = null;

        Prova2Parser.instance_java_call_return instance_java_call123 = null;



        try {
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:207:2: ( static_java_call | instance_java_call )
            int alt50=2;
            alt50 = dfa50.predict(input);
            switch (alt50) {
                case 1 :
                    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:207:4: static_java_call
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_static_java_call_in_predicate_java_call1202);
                    static_java_call122=static_java_call();

                    state._fsp--;

                    adaptor.addChild(root_0, static_java_call122.getTree());

                    }
                    break;
                case 2 :
                    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:207:23: instance_java_call
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_instance_java_call_in_predicate_java_call1206);
                    instance_java_call123=instance_java_call();

                    state._fsp--;

                    adaptor.addChild(root_0, instance_java_call123.getTree());

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
    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:210:1: instance_java_call : instance_call args -> ^( INSTANCE_JAVA_CALL instance_call args ) ;
    public final Prova2Parser.instance_java_call_return instance_java_call() throws RecognitionException {
        Prova2Parser.instance_java_call_return retval = new Prova2Parser.instance_java_call_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Prova2Parser.instance_call_return instance_call124 = null;

        Prova2Parser.args_return args125 = null;


        RewriteRuleSubtreeStream stream_instance_call=new RewriteRuleSubtreeStream(adaptor,"rule instance_call");
        RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"rule args");
        try {
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:211:2: ( instance_call args -> ^( INSTANCE_JAVA_CALL instance_call args ) )
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:211:4: instance_call args
            {
            pushFollow(FOLLOW_instance_call_in_instance_java_call1217);
            instance_call124=instance_call();

            state._fsp--;

            stream_instance_call.add(instance_call124.getTree());
            pushFollow(FOLLOW_args_in_instance_java_call1219);
            args125=args();

            state._fsp--;

            stream_args.add(args125.getTree());


            // AST REWRITE
            // elements: args, instance_call
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ProvaAST)adaptor.nil();
            // 211:23: -> ^( INSTANCE_JAVA_CALL instance_call args )
            {
                // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:211:26: ^( INSTANCE_JAVA_CALL instance_call args )
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
    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:214:1: static_java_call : static_call args -> ^( STATIC_JAVA_CALL static_call args ) ;
    public final Prova2Parser.static_java_call_return static_java_call() throws RecognitionException {
        Prova2Parser.static_java_call_return retval = new Prova2Parser.static_java_call_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Prova2Parser.static_call_return static_call126 = null;

        Prova2Parser.args_return args127 = null;


        RewriteRuleSubtreeStream stream_static_call=new RewriteRuleSubtreeStream(adaptor,"rule static_call");
        RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"rule args");
        try {
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:215:2: ( static_call args -> ^( STATIC_JAVA_CALL static_call args ) )
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:215:4: static_call args
            {
            pushFollow(FOLLOW_static_call_in_static_java_call1240);
            static_call126=static_call();

            state._fsp--;

            stream_static_call.add(static_call126.getTree());
            pushFollow(FOLLOW_args_in_static_java_call1242);
            args127=args();

            state._fsp--;

            stream_args.add(args127.getTree());


            // AST REWRITE
            // elements: static_call, args
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ProvaAST)adaptor.nil();
            // 215:21: -> ^( STATIC_JAVA_CALL static_call args )
            {
                // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:215:24: ^( STATIC_JAVA_CALL static_call args )
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
    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:218:1: method : LCWORD ;
    public final Prova2Parser.method_return method() throws RecognitionException {
        Prova2Parser.method_return retval = new Prova2Parser.method_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token LCWORD128=null;

        ProvaAST LCWORD128_tree=null;

        try {
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:218:9: ( LCWORD )
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:218:11: LCWORD
            {
            root_0 = (ProvaAST)adaptor.nil();

            LCWORD128=(Token)match(input,LCWORD,FOLLOW_LCWORD_in_method1263); 
            LCWORD128_tree = (ProvaAST)adaptor.create(LCWORD128);
            adaptor.addChild(root_0, LCWORD128_tree);


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
    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:220:1: func : ( LCWORD | UCWORD | string | typed_variable );
    public final Prova2Parser.func_return func() throws RecognitionException {
        Prova2Parser.func_return retval = new Prova2Parser.func_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token LCWORD129=null;
        Token UCWORD130=null;
        Prova2Parser.string_return string131 = null;

        Prova2Parser.typed_variable_return typed_variable132 = null;


        ProvaAST LCWORD129_tree=null;
        ProvaAST UCWORD130_tree=null;

        try {
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:220:6: ( LCWORD | UCWORD | string | typed_variable )
            int alt51=4;
            switch ( input.LA(1) ) {
            case LCWORD:
                {
                int LA51_1 = input.LA(2);

                if ( (LA51_1==DOT) ) {
                    alt51=4;
                }
                else if ( (LA51_1==OPEN) ) {
                    alt51=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 51, 1, input);

                    throw nvae;
                }
                }
                break;
            case UCWORD:
                {
                int LA51_2 = input.LA(2);

                if ( (LA51_2==DOT) ) {
                    alt51=4;
                }
                else if ( (LA51_2==OPEN) ) {
                    alt51=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 51, 2, input);

                    throw nvae;
                }
                }
                break;
            case STRING1:
            case STRING2:
                {
                alt51=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }

            switch (alt51) {
                case 1 :
                    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:220:8: LCWORD
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    LCWORD129=(Token)match(input,LCWORD,FOLLOW_LCWORD_in_func1271); 
                    LCWORD129_tree = (ProvaAST)adaptor.create(LCWORD129);
                    adaptor.addChild(root_0, LCWORD129_tree);


                    }
                    break;
                case 2 :
                    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:220:17: UCWORD
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    UCWORD130=(Token)match(input,UCWORD,FOLLOW_UCWORD_in_func1275); 
                    UCWORD130_tree = (ProvaAST)adaptor.create(UCWORD130);
                    adaptor.addChild(root_0, UCWORD130_tree);


                    }
                    break;
                case 3 :
                    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:220:26: string
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_string_in_func1279);
                    string131=string();

                    state._fsp--;

                    adaptor.addChild(root_0, string131.getTree());

                    }
                    break;
                case 4 :
                    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:220:35: typed_variable
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_typed_variable_in_func1283);
                    typed_variable132=typed_variable();

                    state._fsp--;

                    adaptor.addChild(root_0, typed_variable132.getTree());

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
    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:222:1: predicate : ( LCWORD | UCWORD | string );
    public final Prova2Parser.predicate_return predicate() throws RecognitionException {
        Prova2Parser.predicate_return retval = new Prova2Parser.predicate_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token LCWORD133=null;
        Token UCWORD134=null;
        Prova2Parser.string_return string135 = null;


        ProvaAST LCWORD133_tree=null;
        ProvaAST UCWORD134_tree=null;

        try {
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:223:2: ( LCWORD | UCWORD | string )
            int alt52=3;
            switch ( input.LA(1) ) {
            case LCWORD:
                {
                alt52=1;
                }
                break;
            case UCWORD:
                {
                alt52=2;
                }
                break;
            case STRING1:
            case STRING2:
                {
                alt52=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }

            switch (alt52) {
                case 1 :
                    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:223:4: LCWORD
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    LCWORD133=(Token)match(input,LCWORD,FOLLOW_LCWORD_in_predicate1293); 
                    LCWORD133_tree = (ProvaAST)adaptor.create(LCWORD133);
                    adaptor.addChild(root_0, LCWORD133_tree);


                    }
                    break;
                case 2 :
                    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:223:13: UCWORD
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    UCWORD134=(Token)match(input,UCWORD,FOLLOW_UCWORD_in_predicate1297); 
                    UCWORD134_tree = (ProvaAST)adaptor.create(UCWORD134);
                    adaptor.addChild(root_0, UCWORD134_tree);


                    }
                    break;
                case 3 :
                    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:223:22: string
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_string_in_predicate1301);
                    string135=string();

                    state._fsp--;

                    adaptor.addChild(root_0, string135.getTree());

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
    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:225:1: variable : ( UCWORD | USWORD | typed_variable | DOLLARWORD );
    public final Prova2Parser.variable_return variable() throws RecognitionException {
        Prova2Parser.variable_return retval = new Prova2Parser.variable_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token UCWORD136=null;
        Token USWORD137=null;
        Token DOLLARWORD139=null;
        Prova2Parser.typed_variable_return typed_variable138 = null;


        ProvaAST UCWORD136_tree=null;
        ProvaAST USWORD137_tree=null;
        ProvaAST DOLLARWORD139_tree=null;

        try {
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:225:9: ( UCWORD | USWORD | typed_variable | DOLLARWORD )
            int alt53=4;
            switch ( input.LA(1) ) {
            case UCWORD:
                {
                int LA53_1 = input.LA(2);

                if ( (LA53_1==DOT) ) {
                    switch ( input.LA(3) ) {
                    case EOF:
                    case NEWLINE:
                        {
                        alt53=1;
                        }
                        break;
                    case LCWORD:
                        {
                        int LA53_7 = input.LA(4);

                        if ( (LA53_7==OPEN) ) {
                            alt53=1;
                        }
                        else if ( (LA53_7==EOF||(LA53_7>=DOT && LA53_7<=COMMA)||(LA53_7>=CLOSE && LA53_7<=GE)||LA53_7==REM||LA53_7==NEWLINE) ) {
                            alt53=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 53, 7, input);

                            throw nvae;
                        }
                        }
                        break;
                    case UCWORD:
                        {
                        alt53=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 53, 5, input);

                        throw nvae;
                    }

                }
                else if ( (LA53_1==EOF||(LA53_1>=PLUS && LA53_1<=COMMA)||(LA53_1>=CLOSE && LA53_1<=GE)||LA53_1==REM||LA53_1==NEWLINE) ) {
                    alt53=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 53, 1, input);

                    throw nvae;
                }
                }
                break;
            case USWORD:
                {
                alt53=2;
                }
                break;
            case LCWORD:
                {
                alt53=3;
                }
                break;
            case DOLLARWORD:
                {
                alt53=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:225:11: UCWORD
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    UCWORD136=(Token)match(input,UCWORD,FOLLOW_UCWORD_in_variable1308); 
                    UCWORD136_tree = (ProvaAST)adaptor.create(UCWORD136);
                    adaptor.addChild(root_0, UCWORD136_tree);


                    }
                    break;
                case 2 :
                    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:225:20: USWORD
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    USWORD137=(Token)match(input,USWORD,FOLLOW_USWORD_in_variable1312); 
                    USWORD137_tree = (ProvaAST)adaptor.create(USWORD137);
                    adaptor.addChild(root_0, USWORD137_tree);


                    }
                    break;
                case 3 :
                    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:225:29: typed_variable
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_typed_variable_in_variable1316);
                    typed_variable138=typed_variable();

                    state._fsp--;

                    adaptor.addChild(root_0, typed_variable138.getTree());

                    }
                    break;
                case 4 :
                    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:225:46: DOLLARWORD
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    DOLLARWORD139=(Token)match(input,DOLLARWORD,FOLLOW_DOLLARWORD_in_variable1320); 
                    DOLLARWORD139_tree = (ProvaAST)adaptor.create(DOLLARWORD139);
                    adaptor.addChild(root_0, DOLLARWORD139_tree);


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
    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:227:1: variable_or_number : ( variable | number );
    public final Prova2Parser.variable_or_number_return variable_or_number() throws RecognitionException {
        Prova2Parser.variable_or_number_return retval = new Prova2Parser.variable_or_number_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Prova2Parser.variable_return variable140 = null;

        Prova2Parser.number_return number141 = null;



        try {
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:228:2: ( variable | number )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==USWORD||LA54_0==DOLLARWORD||(LA54_0>=LCWORD && LA54_0<=UCWORD)) ) {
                alt54=1;
            }
            else if ( (LA54_0==MINUS||(LA54_0>=INT_LITERAL && LA54_0<=LONG_LITERAL)) ) {
                alt54=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:228:4: variable
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_variable_in_variable_or_number1330);
                    variable140=variable();

                    state._fsp--;

                    adaptor.addChild(root_0, variable140.getTree());

                    }
                    break;
                case 2 :
                    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:228:15: number
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_number_in_variable_or_number1334);
                    number141=number();

                    state._fsp--;

                    adaptor.addChild(root_0, number141.getTree());

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
    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:230:1: word : ( LCWORD | UCWORD );
    public final Prova2Parser.word_return word() throws RecognitionException {
        Prova2Parser.word_return retval = new Prova2Parser.word_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token set142=null;

        ProvaAST set142_tree=null;

        try {
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:230:6: ( LCWORD | UCWORD )
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:
            {
            root_0 = (ProvaAST)adaptor.nil();

            set142=(Token)input.LT(1);
            if ( (input.LA(1)>=LCWORD && input.LA(1)<=UCWORD) ) {
                input.consume();
                adaptor.addChild(root_0, (ProvaAST)adaptor.create(set142));
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
    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:235:1: typed_variable : ( qualified_java_class DOT word -> ^( TYPED_VARIABLE qualified_java_class word ) | UCWORD DOT word -> ^( TYPED_VARIABLE UCWORD word ) );
    public final Prova2Parser.typed_variable_return typed_variable() throws RecognitionException {
        Prova2Parser.typed_variable_return retval = new Prova2Parser.typed_variable_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token DOT144=null;
        Token UCWORD146=null;
        Token DOT147=null;
        Prova2Parser.qualified_java_class_return qualified_java_class143 = null;

        Prova2Parser.word_return word145 = null;

        Prova2Parser.word_return word148 = null;


        ProvaAST DOT144_tree=null;
        ProvaAST UCWORD146_tree=null;
        ProvaAST DOT147_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_UCWORD=new RewriteRuleTokenStream(adaptor,"token UCWORD");
        RewriteRuleSubtreeStream stream_qualified_java_class=new RewriteRuleSubtreeStream(adaptor,"rule qualified_java_class");
        RewriteRuleSubtreeStream stream_word=new RewriteRuleSubtreeStream(adaptor,"rule word");
        try {
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:236:2: ( qualified_java_class DOT word -> ^( TYPED_VARIABLE qualified_java_class word ) | UCWORD DOT word -> ^( TYPED_VARIABLE UCWORD word ) )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==LCWORD) ) {
                alt55=1;
            }
            else if ( (LA55_0==UCWORD) ) {
                alt55=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:237:3: qualified_java_class DOT word
                    {
                    pushFollow(FOLLOW_qualified_java_class_in_typed_variable1361);
                    qualified_java_class143=qualified_java_class();

                    state._fsp--;

                    stream_qualified_java_class.add(qualified_java_class143.getTree());
                    DOT144=(Token)match(input,DOT,FOLLOW_DOT_in_typed_variable1363);  
                    stream_DOT.add(DOT144);

                    pushFollow(FOLLOW_word_in_typed_variable1365);
                    word145=word();

                    state._fsp--;

                    stream_word.add(word145.getTree());


                    // AST REWRITE
                    // elements: word, qualified_java_class
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ProvaAST)adaptor.nil();
                    // 237:33: -> ^( TYPED_VARIABLE qualified_java_class word )
                    {
                        // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:237:36: ^( TYPED_VARIABLE qualified_java_class word )
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
                    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:238:5: UCWORD DOT word
                    {
                    UCWORD146=(Token)match(input,UCWORD,FOLLOW_UCWORD_in_typed_variable1381);  
                    stream_UCWORD.add(UCWORD146);

                    DOT147=(Token)match(input,DOT,FOLLOW_DOT_in_typed_variable1383);  
                    stream_DOT.add(DOT147);

                    pushFollow(FOLLOW_word_in_typed_variable1385);
                    word148=word();

                    state._fsp--;

                    stream_word.add(word148.getTree());


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
                    // 238:21: -> ^( TYPED_VARIABLE UCWORD word )
                    {
                        // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:238:24: ^( TYPED_VARIABLE UCWORD word )
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
    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:243:1: instance_call : variable DOT LCWORD -> variable LCWORD ;
    public final Prova2Parser.instance_call_return instance_call() throws RecognitionException {
        Prova2Parser.instance_call_return retval = new Prova2Parser.instance_call_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token DOT150=null;
        Token LCWORD151=null;
        Prova2Parser.variable_return variable149 = null;


        ProvaAST DOT150_tree=null;
        ProvaAST LCWORD151_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_LCWORD=new RewriteRuleTokenStream(adaptor,"token LCWORD");
        RewriteRuleSubtreeStream stream_variable=new RewriteRuleSubtreeStream(adaptor,"rule variable");
        try {
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:244:2: ( variable DOT LCWORD -> variable LCWORD )
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:244:4: variable DOT LCWORD
            {
            pushFollow(FOLLOW_variable_in_instance_call1407);
            variable149=variable();

            state._fsp--;

            stream_variable.add(variable149.getTree());
            DOT150=(Token)match(input,DOT,FOLLOW_DOT_in_instance_call1409);  
            stream_DOT.add(DOT150);

            LCWORD151=(Token)match(input,LCWORD,FOLLOW_LCWORD_in_instance_call1411);  
            stream_LCWORD.add(LCWORD151);



            // AST REWRITE
            // elements: variable, LCWORD
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ProvaAST)adaptor.nil();
            // 244:24: -> variable LCWORD
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
    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:247:1: static_call : ( qualified_java_class DOT LCWORD ) -> qualified_java_class LCWORD ;
    public final Prova2Parser.static_call_return static_call() throws RecognitionException {
        Prova2Parser.static_call_return retval = new Prova2Parser.static_call_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token DOT153=null;
        Token LCWORD154=null;
        Prova2Parser.qualified_java_class_return qualified_java_class152 = null;


        ProvaAST DOT153_tree=null;
        ProvaAST LCWORD154_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_LCWORD=new RewriteRuleTokenStream(adaptor,"token LCWORD");
        RewriteRuleSubtreeStream stream_qualified_java_class=new RewriteRuleSubtreeStream(adaptor,"rule qualified_java_class");
        try {
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:248:2: ( ( qualified_java_class DOT LCWORD ) -> qualified_java_class LCWORD )
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:248:4: ( qualified_java_class DOT LCWORD )
            {
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:248:4: ( qualified_java_class DOT LCWORD )
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:248:5: qualified_java_class DOT LCWORD
            {
            pushFollow(FOLLOW_qualified_java_class_in_static_call1429);
            qualified_java_class152=qualified_java_class();

            state._fsp--;

            stream_qualified_java_class.add(qualified_java_class152.getTree());
            DOT153=(Token)match(input,DOT,FOLLOW_DOT_in_static_call1431);  
            stream_DOT.add(DOT153);

            LCWORD154=(Token)match(input,LCWORD,FOLLOW_LCWORD_in_static_call1433);  
            stream_LCWORD.add(LCWORD154);


            }



            // AST REWRITE
            // elements: LCWORD, qualified_java_class
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ProvaAST)adaptor.nil();
            // 248:38: -> qualified_java_class LCWORD
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
    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:251:1: pos_number : ( INT_LITERAL | LONG_LITERAL | float_literal );
    public final Prova2Parser.pos_number_return pos_number() throws RecognitionException {
        Prova2Parser.pos_number_return retval = new Prova2Parser.pos_number_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token INT_LITERAL155=null;
        Token LONG_LITERAL156=null;
        Prova2Parser.float_literal_return float_literal157 = null;


        ProvaAST INT_LITERAL155_tree=null;
        ProvaAST LONG_LITERAL156_tree=null;

        try {
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:251:12: ( INT_LITERAL | LONG_LITERAL | float_literal )
            int alt56=3;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==INT_LITERAL) ) {
                int LA56_1 = input.LA(2);

                if ( (LA56_1==DOT) ) {
                    int LA56_3 = input.LA(3);

                    if ( (LA56_3==INT_LITERAL) ) {
                        alt56=3;
                    }
                    else if ( (LA56_3==EOF||LA56_3==NEWLINE) ) {
                        alt56=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 56, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA56_1==EOF||(LA56_1>=PLUS && LA56_1<=COMMA)||(LA56_1>=CLOSE && LA56_1<=GE)||LA56_1==REM||LA56_1==NEWLINE) ) {
                    alt56=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 56, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA56_0==LONG_LITERAL) ) {
                alt56=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:251:14: INT_LITERAL
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    INT_LITERAL155=(Token)match(input,INT_LITERAL,FOLLOW_INT_LITERAL_in_pos_number1449); 
                    INT_LITERAL155_tree = (ProvaAST)adaptor.create(INT_LITERAL155);
                    adaptor.addChild(root_0, INT_LITERAL155_tree);


                    }
                    break;
                case 2 :
                    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:251:28: LONG_LITERAL
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    LONG_LITERAL156=(Token)match(input,LONG_LITERAL,FOLLOW_LONG_LITERAL_in_pos_number1453); 
                    LONG_LITERAL156_tree = (ProvaAST)adaptor.create(LONG_LITERAL156);
                    adaptor.addChild(root_0, LONG_LITERAL156_tree);


                    }
                    break;
                case 3 :
                    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:251:43: float_literal
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_float_literal_in_pos_number1457);
                    float_literal157=float_literal();

                    state._fsp--;

                    adaptor.addChild(root_0, float_literal157.getTree());

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
    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:253:1: number : ( '-' )? pos_number ;
    public final Prova2Parser.number_return number() throws RecognitionException {
        Prova2Parser.number_return retval = new Prova2Parser.number_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token char_literal158=null;
        Prova2Parser.pos_number_return pos_number159 = null;


        ProvaAST char_literal158_tree=null;

        try {
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:254:2: ( ( '-' )? pos_number )
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:254:4: ( '-' )? pos_number
            {
            root_0 = (ProvaAST)adaptor.nil();

            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:254:4: ( '-' )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==MINUS) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:254:5: '-'
                    {
                    char_literal158=(Token)match(input,MINUS,FOLLOW_MINUS_in_number1468); 
                    char_literal158_tree = (ProvaAST)adaptor.create(char_literal158);
                    adaptor.addChild(root_0, char_literal158_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_pos_number_in_number1472);
            pos_number159=pos_number();

            state._fsp--;

            adaptor.addChild(root_0, pos_number159.getTree());

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

    public static class constant_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constant"
    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:256:1: constant : ( LCWORD | string | qualified_java_class );
    public final Prova2Parser.constant_return constant() throws RecognitionException {
        Prova2Parser.constant_return retval = new Prova2Parser.constant_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token LCWORD160=null;
        Prova2Parser.string_return string161 = null;

        Prova2Parser.qualified_java_class_return qualified_java_class162 = null;


        ProvaAST LCWORD160_tree=null;

        try {
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:256:10: ( LCWORD | string | qualified_java_class )
            int alt58=3;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==LCWORD) ) {
                int LA58_1 = input.LA(2);

                if ( (LA58_1==DOT) ) {
                    int LA58_3 = input.LA(3);

                    if ( (LA58_3==EOF||LA58_3==NEWLINE) ) {
                        alt58=1;
                    }
                    else if ( ((LA58_3>=LCWORD && LA58_3<=UCWORD)) ) {
                        alt58=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 58, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA58_1==EOF||LA58_1==COMMA||(LA58_1>=OPEN && LA58_1<=GE)||LA58_1==NEWLINE) ) {
                    alt58=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 58, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA58_0>=STRING1 && LA58_0<=STRING2)) ) {
                alt58=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:257:2: LCWORD
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    LCWORD160=(Token)match(input,LCWORD,FOLLOW_LCWORD_in_constant1481); 
                    LCWORD160_tree = (ProvaAST)adaptor.create(LCWORD160);
                    adaptor.addChild(root_0, LCWORD160_tree);


                    }
                    break;
                case 2 :
                    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:257:11: string
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_string_in_constant1485);
                    string161=string();

                    state._fsp--;

                    adaptor.addChild(root_0, string161.getTree());

                    }
                    break;
                case 3 :
                    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:257:20: qualified_java_class
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_qualified_java_class_in_constant1489);
                    qualified_java_class162=qualified_java_class();

                    state._fsp--;

                    adaptor.addChild(root_0, qualified_java_class162.getTree());

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
    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:259:1: string : ( STRING1 | STRING2 );
    public final Prova2Parser.string_return string() throws RecognitionException {
        Prova2Parser.string_return retval = new Prova2Parser.string_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token set163=null;

        ProvaAST set163_tree=null;

        try {
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:259:8: ( STRING1 | STRING2 )
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:
            {
            root_0 = (ProvaAST)adaptor.nil();

            set163=(Token)input.LT(1);
            if ( (input.LA(1)>=STRING1 && input.LA(1)<=STRING2) ) {
                input.consume();
                adaptor.addChild(root_0, (ProvaAST)adaptor.create(set163));
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
    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:261:1: not_equal : ( NOT_EQUAL1 | NOT_EQUAL2 );
    public final Prova2Parser.not_equal_return not_equal() throws RecognitionException {
        Prova2Parser.not_equal_return retval = new Prova2Parser.not_equal_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token set164=null;

        ProvaAST set164_tree=null;

        try {
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:262:2: ( NOT_EQUAL1 | NOT_EQUAL2 )
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:
            {
            root_0 = (ProvaAST)adaptor.nil();

            set164=(Token)input.LT(1);
            if ( (input.LA(1)>=NOT_EQUAL1 && input.LA(1)<=NOT_EQUAL2) ) {
                input.consume();
                adaptor.addChild(root_0, (ProvaAST)adaptor.create(set164));
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
    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:265:1: float_literal : INT_LITERAL DOT INT_LITERAL ( EXPONENT )? ;
    public final Prova2Parser.float_literal_return float_literal() throws RecognitionException {
        Prova2Parser.float_literal_return retval = new Prova2Parser.float_literal_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token INT_LITERAL165=null;
        Token DOT166=null;
        Token INT_LITERAL167=null;
        Token EXPONENT168=null;

        ProvaAST INT_LITERAL165_tree=null;
        ProvaAST DOT166_tree=null;
        ProvaAST INT_LITERAL167_tree=null;
        ProvaAST EXPONENT168_tree=null;

        try {
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:265:16: ( INT_LITERAL DOT INT_LITERAL ( EXPONENT )? )
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:265:18: INT_LITERAL DOT INT_LITERAL ( EXPONENT )?
            {
            root_0 = (ProvaAST)adaptor.nil();

            INT_LITERAL165=(Token)match(input,INT_LITERAL,FOLLOW_INT_LITERAL_in_float_literal1525); 
            INT_LITERAL165_tree = (ProvaAST)adaptor.create(INT_LITERAL165);
            adaptor.addChild(root_0, INT_LITERAL165_tree);

            DOT166=(Token)match(input,DOT,FOLLOW_DOT_in_float_literal1527); 
            DOT166_tree = (ProvaAST)adaptor.create(DOT166);
            adaptor.addChild(root_0, DOT166_tree);

            INT_LITERAL167=(Token)match(input,INT_LITERAL,FOLLOW_INT_LITERAL_in_float_literal1529); 
            INT_LITERAL167_tree = (ProvaAST)adaptor.create(INT_LITERAL167);
            adaptor.addChild(root_0, INT_LITERAL167_tree);

            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:265:46: ( EXPONENT )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==EXPONENT) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:265:46: EXPONENT
                    {
                    EXPONENT168=(Token)match(input,EXPONENT,FOLLOW_EXPONENT_in_float_literal1531); 
                    EXPONENT168_tree = (ProvaAST)adaptor.create(EXPONENT168);
                    adaptor.addChild(root_0, EXPONENT168_tree);


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
    protected DFA38 dfa38 = new DFA38(this);
    protected DFA39 dfa39 = new DFA39(this);
    protected DFA41 dfa41 = new DFA41(this);
    protected DFA43 dfa43 = new DFA43(this);
    protected DFA42 dfa42 = new DFA42(this);
    protected DFA47 dfa47 = new DFA47(this);
    protected DFA50 dfa50 = new DFA50(this);
    static final String DFA1_eotS =
        "\4\uffff";
    static final String DFA1_eofS =
        "\2\2\2\uffff";
    static final String DFA1_minS =
        "\2\12\2\uffff";
    static final String DFA1_maxS =
        "\2\103\2\uffff";
    static final String DFA1_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA1_specialS =
        "\4\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\3\46\uffff\1\1\2\3\2\uffff\2\3\13\uffff\1\3",
            "\1\3\46\uffff\1\1\2\3\2\uffff\2\3\13\uffff\1\3",
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
            return "()* loopback of 102:4: ( statement )*";
        }
    }
    static final String DFA25_eotS =
        "\40\uffff";
    static final String DFA25_eofS =
        "\40\uffff";
    static final String DFA25_minS =
        "\2\6\1\62\2\4\1\14\2\uffff\1\6\1\uffff\2\6\3\11\1\64\1\4\1\11\2"+
        "\6\1\64\3\11\1\64\1\4\2\11\1\64\3\11";
    static final String DFA25_maxS =
        "\2\103\1\62\3\27\2\uffff\1\103\1\uffff\1\67\1\103\3\15\1\65\2\15"+
        "\1\67\1\103\1\64\3\15\1\65\2\15\1\70\1\64\1\15\1\70\1\15";
    static final String DFA25_acceptS =
        "\6\uffff\1\2\1\3\1\uffff\1\1\26\uffff";
    static final String DFA25_specialS =
        "\40\uffff}>";
    static final String[] DFA25_transitionS = {
            "\1\6\4\uffff\1\7\3\uffff\1\6\31\uffff\1\6\3\uffff\1\6\3\uffff"+
            "\1\1\1\3\1\4\2\6\2\5\13\uffff\1\2",
            "\1\6\4\uffff\1\7\3\uffff\1\6\31\uffff\1\6\3\uffff\1\6\3\uffff"+
            "\1\1\1\3\1\4\2\6\2\5\13\uffff\1\2",
            "\1\10",
            "\1\6\7\uffff\1\11\4\uffff\7\6",
            "\1\6\7\uffff\1\11\4\uffff\7\6",
            "\1\11\4\uffff\7\6",
            "",
            "",
            "\1\6\5\uffff\1\12\2\uffff\1\6\31\uffff\1\6\3\uffff\1\6\3\uffff"+
            "\1\13\1\3\1\4\2\6\2\5\13\uffff\1\2",
            "",
            "\1\17\53\uffff\1\14\1\15\1\20\1\21\2\16",
            "\1\6\10\uffff\1\6\31\uffff\1\6\3\uffff\1\6\3\uffff\1\13\1"+
            "\3\1\4\2\6\2\5\13\uffff\1\2",
            "\1\22\3\uffff\1\23",
            "\1\22\3\uffff\1\23",
            "\1\22\3\uffff\1\23",
            "\1\20\1\21",
            "\1\24\4\uffff\1\22\3\uffff\1\23",
            "\1\22\3\uffff\1\23",
            "\1\30\53\uffff\1\25\1\26\1\31\1\32\2\27",
            "\1\6\10\uffff\1\6\31\uffff\1\6\3\uffff\1\6\3\uffff\1\13\1"+
            "\3\1\4\2\6\2\5\13\uffff\1\2",
            "\1\33",
            "\1\22\3\uffff\1\23",
            "\1\22\3\uffff\1\23",
            "\1\22\3\uffff\1\23",
            "\1\31\1\32",
            "\1\34\4\uffff\1\22\3\uffff\1\23",
            "\1\22\3\uffff\1\23",
            "\1\22\3\uffff\1\23\52\uffff\1\35",
            "\1\36",
            "\1\22\3\uffff\1\23",
            "\1\22\3\uffff\1\23\52\uffff\1\37",
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
            return "134:1: literal : ( ( NEWLINE )* (m= metadata )? r= relation (g= guard )? -> ^( RELATION ( metadata )? relation ( guard )? ) | ( NEWLINE )* (m= metadata )? semantic_attachment (g= guard )? -> ^( SEMANTIC_ATTACHMENT ( metadata )? semantic_attachment ( guard )? ) | ( NEWLINE )* cut -> ^( CUT cut ) );";
        }
    }
    static final String DFA28_eotS =
        "\4\uffff";
    static final String DFA28_eofS =
        "\4\uffff";
    static final String DFA28_minS =
        "\2\6\2\uffff";
    static final String DFA28_maxS =
        "\2\67\2\uffff";
    static final String DFA28_acceptS =
        "\2\uffff\1\1\1\2";
    static final String DFA28_specialS =
        "\4\uffff}>";
    static final String[] DFA28_transitionS = {
            "\1\2\6\uffff\1\3\1\uffff\1\2\1\3\30\uffff\1\2\3\uffff\1\2\3"+
            "\uffff\1\1\6\2",
            "\1\2\6\uffff\1\3\1\uffff\1\2\1\3\30\uffff\1\2\3\uffff\1\2"+
            "\3\uffff\1\1\6\2",
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
            return "152:5: ( terms ( '|' list_tail )? )?";
        }
    }
    static final String DFA31_eotS =
        "\11\uffff";
    static final String DFA31_eofS =
        "\11\uffff";
    static final String DFA31_minS =
        "\1\6\1\4\4\uffff\1\62\2\4";
    static final String DFA31_maxS =
        "\1\67\1\61\4\uffff\1\63\1\61\1\4";
    static final String DFA31_acceptS =
        "\2\uffff\1\1\1\2\1\3\1\4\3\uffff";
    static final String DFA31_specialS =
        "\11\uffff}>";
    static final String[] DFA31_transitionS = {
            "\1\4\10\uffff\1\5\31\uffff\1\3\3\uffff\1\3\4\uffff\1\1\1\3"+
            "\2\4\2\2",
            "\1\6\4\uffff\1\2\3\uffff\2\2\1\uffff\10\2\31\uffff\1\2",
            "",
            "",
            "",
            "",
            "\1\10\1\7",
            "\1\3\4\uffff\1\2\3\uffff\2\2\1\uffff\10\2\31\uffff\1\2",
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
            return "157:1: left_term : ( constant | variable | number | prova_list );";
        }
    }
    static final String DFA33_eotS =
        "\7\uffff";
    static final String DFA33_eofS =
        "\1\uffff\1\2\3\uffff\1\2\1\uffff";
    static final String DFA33_minS =
        "\1\51\1\4\2\uffff\1\62\2\4";
    static final String DFA33_maxS =
        "\1\67\1\4\2\uffff\1\63\2\4";
    static final String DFA33_acceptS =
        "\2\uffff\1\1\1\2\3\uffff";
    static final String DFA33_specialS =
        "\7\uffff}>";
    static final String[] DFA33_transitionS = {
            "\1\3\3\uffff\1\3\4\uffff\1\1\1\3\2\uffff\2\2",
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
            return "164:12: ( constant | variable )";
        }
    }
    static final String DFA38_eotS =
        "\4\uffff";
    static final String DFA38_eofS =
        "\4\uffff";
    static final String DFA38_minS =
        "\1\11\1\uffff\1\11\1\uffff";
    static final String DFA38_maxS =
        "\1\61\1\uffff\1\61\1\uffff";
    static final String DFA38_acceptS =
        "\1\uffff\1\2\1\uffff\1\1";
    static final String DFA38_specialS =
        "\4\uffff}>";
    static final String[] DFA38_transitionS = {
            "\1\3\3\uffff\2\1\1\uffff\1\1\40\uffff\1\2",
            "",
            "\1\3\3\uffff\1\1\2\uffff\1\1\40\uffff\1\2",
            ""
    };

    static final short[] DFA38_eot = DFA.unpackEncodedString(DFA38_eotS);
    static final short[] DFA38_eof = DFA.unpackEncodedString(DFA38_eofS);
    static final char[] DFA38_min = DFA.unpackEncodedStringToUnsignedChars(DFA38_minS);
    static final char[] DFA38_max = DFA.unpackEncodedStringToUnsignedChars(DFA38_maxS);
    static final short[] DFA38_accept = DFA.unpackEncodedString(DFA38_acceptS);
    static final short[] DFA38_special = DFA.unpackEncodedString(DFA38_specialS);
    static final short[][] DFA38_transition;

    static {
        int numStates = DFA38_transitionS.length;
        DFA38_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA38_transition[i] = DFA.unpackEncodedString(DFA38_transitionS[i]);
        }
    }

    class DFA38 extends DFA {

        public DFA38(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 38;
            this.eot = DFA38_eot;
            this.eof = DFA38_eof;
            this.min = DFA38_min;
            this.max = DFA38_max;
            this.accept = DFA38_accept;
            this.special = DFA38_special;
            this.transition = DFA38_transition;
        }
        public String getDescription() {
            return "()* loopback of 166:24: ( ( NEWLINE )* ',' ( NEWLINE )* term )*";
        }
    }
    static final String DFA39_eotS =
        "\15\uffff";
    static final String DFA39_eofS =
        "\15\uffff";
    static final String DFA39_minS =
        "\1\6\1\4\1\11\1\4\1\uffff\1\62\1\uffff\1\62\2\4\1\11\1\62\1\11";
    static final String DFA39_maxS =
        "\1\67\3\61\1\uffff\1\63\1\uffff\1\63\1\61\1\4\1\61\1\63\1\61";
    static final String DFA39_acceptS =
        "\4\uffff\1\1\1\uffff\1\2\6\uffff";
    static final String DFA39_specialS =
        "\15\uffff}>";
    static final String[] DFA39_transitionS = {
            "\1\4\10\uffff\1\4\31\uffff\1\4\3\uffff\1\4\4\uffff\1\1\1\3"+
            "\2\4\2\2",
            "\1\5\4\uffff\1\4\2\uffff\1\6\2\4\1\uffff\1\4\40\uffff\1\4",
            "\1\4\2\uffff\1\6\2\4\1\uffff\1\4\40\uffff\1\4",
            "\1\7\4\uffff\1\4\2\uffff\1\6\2\4\1\uffff\1\4\40\uffff\1\4",
            "",
            "\1\11\1\10",
            "",
            "\2\12",
            "\1\13\4\uffff\1\4\3\uffff\2\4\1\uffff\1\4\40\uffff\1\4",
            "\1\5",
            "\1\4\2\uffff\1\6\2\4\1\uffff\1\4\40\uffff\1\4",
            "\2\14",
            "\1\4\2\uffff\1\6\2\4\1\uffff\1\4\40\uffff\1\4"
    };

    static final short[] DFA39_eot = DFA.unpackEncodedString(DFA39_eotS);
    static final short[] DFA39_eof = DFA.unpackEncodedString(DFA39_eofS);
    static final char[] DFA39_min = DFA.unpackEncodedStringToUnsignedChars(DFA39_minS);
    static final char[] DFA39_max = DFA.unpackEncodedStringToUnsignedChars(DFA39_maxS);
    static final short[] DFA39_accept = DFA.unpackEncodedString(DFA39_acceptS);
    static final short[] DFA39_special = DFA.unpackEncodedString(DFA39_specialS);
    static final short[][] DFA39_transition;

    static {
        int numStates = DFA39_transitionS.length;
        DFA39_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA39_transition[i] = DFA.unpackEncodedString(DFA39_transitionS[i]);
        }
    }

    class DFA39 extends DFA {

        public DFA39(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 39;
            this.eot = DFA39_eot;
            this.eof = DFA39_eof;
            this.min = DFA39_min;
            this.max = DFA39_max;
            this.accept = DFA39_accept;
            this.special = DFA39_special;
            this.transition = DFA39_transition;
        }
        public String getDescription() {
            return "168:1: term : ( left_term | func_term );";
        }
    }
    static final String DFA41_eotS =
        "\20\uffff";
    static final String DFA41_eofS =
        "\20\uffff";
    static final String DFA41_minS =
        "\1\6\4\4\1\uffff\2\62\1\uffff\4\4\1\62\2\4";
    static final String DFA41_maxS =
        "\1\67\4\27\1\uffff\2\63\1\uffff\1\27\1\4\2\27\1\63\2\27";
    static final String DFA41_acceptS =
        "\5\uffff\1\2\2\uffff\1\1\7\uffff";
    static final String DFA41_specialS =
        "\20\uffff}>";
    static final String[] DFA41_transitionS = {
            "\1\5\10\uffff\1\5\31\uffff\1\3\3\uffff\1\4\4\uffff\1\1\1\2"+
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
            return "182:1: semantic_attachment : ( predicate_java_call | binary_operation );";
        }
    }
    static final String DFA43_eotS =
        "\13\uffff";
    static final String DFA43_eofS =
        "\6\uffff\1\5\2\uffff\1\5\1\uffff";
    static final String DFA43_minS =
        "\1\21\1\uffff\1\6\1\uffff\1\4\1\uffff\1\61\2\4\1\61\1\62";
    static final String DFA43_maxS =
        "\1\27\1\uffff\1\67\1\uffff\1\61\1\uffff\1\63\1\61\1\4\2\63";
    static final String DFA43_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\1\uffff\1\2\5\uffff";
    static final String DFA43_specialS =
        "\13\uffff}>";
    static final String[] DFA43_transitionS = {
            "\1\1\2\2\4\3",
            "",
            "\1\3\5\uffff\1\3\34\uffff\1\3\3\uffff\1\3\4\uffff\1\4\3\3"+
            "\2\5",
            "",
            "\1\6\4\uffff\1\5\5\uffff\2\5\40\uffff\1\5",
            "",
            "\1\5\1\10\1\7",
            "\1\11\4\uffff\1\5\5\uffff\2\5\40\uffff\1\5",
            "\1\12",
            "\1\5\2\3",
            "\1\10\1\7"
    };

    static final short[] DFA43_eot = DFA.unpackEncodedString(DFA43_eotS);
    static final short[] DFA43_eof = DFA.unpackEncodedString(DFA43_eofS);
    static final char[] DFA43_min = DFA.unpackEncodedStringToUnsignedChars(DFA43_minS);
    static final char[] DFA43_max = DFA.unpackEncodedStringToUnsignedChars(DFA43_maxS);
    static final short[] DFA43_accept = DFA.unpackEncodedString(DFA43_acceptS);
    static final short[] DFA43_special = DFA.unpackEncodedString(DFA43_specialS);
    static final short[][] DFA43_transition;

    static {
        int numStates = DFA43_transitionS.length;
        DFA43_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA43_transition[i] = DFA.unpackEncodedString(DFA43_transitionS[i]);
        }
    }

    class DFA43 extends DFA {

        public DFA43(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 43;
            this.eot = DFA43_eot;
            this.eof = DFA43_eof;
            this.min = DFA43_min;
            this.max = DFA43_max;
            this.accept = DFA43_accept;
            this.special = DFA43_special;
            this.transition = DFA43_transition;
        }
        public String getDescription() {
            return "187:3: ( EQUAL ( constructor_java_call | prova_list | constant | expr ) | not_equal constant | binary_operator expr )";
        }
    }
    static final String DFA42_eotS =
        "\14\uffff";
    static final String DFA42_eofS =
        "\6\uffff\1\4\3\uffff\1\4\1\uffff";
    static final String DFA42_minS =
        "\1\6\2\4\3\uffff\1\61\1\uffff\2\4\1\61\1\62";
    static final String DFA42_maxS =
        "\1\67\2\61\3\uffff\1\63\1\uffff\1\61\1\4\2\63";
    static final String DFA42_acceptS =
        "\3\uffff\1\2\1\3\1\4\1\uffff\1\1\4\uffff";
    static final String DFA42_specialS =
        "\14\uffff}>";
    static final String[] DFA42_transitionS = {
            "\1\5\5\uffff\1\5\2\uffff\1\3\31\uffff\1\5\3\uffff\1\5\4\uffff"+
            "\1\1\1\2\2\5\2\4",
            "\1\6\4\uffff\1\4\5\uffff\2\4\40\uffff\1\4",
            "\6\5\2\uffff\1\7\2\uffff\2\5\33\uffff\1\5\4\uffff\1\5",
            "",
            "",
            "",
            "\1\4\1\11\1\10",
            "",
            "\1\12\4\uffff\1\4\2\uffff\1\7\2\uffff\2\4\40\uffff\1\4",
            "\1\13",
            "\1\4\2\5",
            "\1\11\1\10"
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
            return "188:4: ( constructor_java_call | prova_list | constant | expr )";
        }
    }
    static final String DFA47_eotS =
        "\23\uffff";
    static final String DFA47_eofS =
        "\10\uffff\1\11\1\uffff\1\11\10\uffff";
    static final String DFA47_minS =
        "\1\6\1\51\4\4\2\uffff\1\61\1\uffff\1\61\1\62\2\4\1\uffff\1\4\1"+
        "\62\2\4";
    static final String DFA47_maxS =
        "\2\65\2\61\1\4\1\61\2\uffff\1\63\1\uffff\1\62\1\63\2\61\1\uffff"+
        "\1\4\1\63\2\61";
    static final String DFA47_acceptS =
        "\6\uffff\1\2\1\4\1\uffff\1\1\4\uffff\1\3\4\uffff";
    static final String DFA47_specialS =
        "\23\uffff}>";
    static final String[] DFA47_transitionS = {
            "\1\1\5\uffff\1\7\34\uffff\1\3\3\uffff\1\5\4\uffff\1\4\1\2\2"+
            "\6",
            "\1\3\3\uffff\1\5\4\uffff\1\4\1\2\2\6",
            "\1\10\5\11\3\uffff\1\11\1\uffff\2\11\33\uffff\1\11\4\uffff"+
            "\1\11",
            "\1\12\5\11\3\uffff\1\11\1\uffff\2\11\33\uffff\1\11\4\uffff"+
            "\1\11",
            "\1\13",
            "\1\12\5\11\3\uffff\1\11\1\uffff\2\11\33\uffff\1\11\4\uffff"+
            "\1\11",
            "",
            "",
            "\1\11\1\14\1\15",
            "",
            "\1\11\1\16",
            "\1\4\1\17",
            "\1\12\5\11\2\uffff\1\16\1\11\1\uffff\2\11\33\uffff\1\11\4"+
            "\uffff\1\11",
            "\1\12\5\11\3\uffff\1\11\1\uffff\2\11\33\uffff\1\11\4\uffff"+
            "\1\11",
            "",
            "\1\20",
            "\1\21\1\22",
            "\1\12\5\11\2\uffff\1\16\1\11\1\uffff\2\11\33\uffff\1\11\4"+
            "\uffff\1\11",
            "\1\12\5\11\3\uffff\1\11\1\uffff\2\11\33\uffff\1\11\4\uffff"+
            "\1\11"
    };

    static final short[] DFA47_eot = DFA.unpackEncodedString(DFA47_eotS);
    static final short[] DFA47_eof = DFA.unpackEncodedString(DFA47_eofS);
    static final char[] DFA47_min = DFA.unpackEncodedStringToUnsignedChars(DFA47_minS);
    static final char[] DFA47_max = DFA.unpackEncodedStringToUnsignedChars(DFA47_maxS);
    static final short[] DFA47_accept = DFA.unpackEncodedString(DFA47_acceptS);
    static final short[] DFA47_special = DFA.unpackEncodedString(DFA47_specialS);
    static final short[][] DFA47_transition;

    static {
        int numStates = DFA47_transitionS.length;
        DFA47_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA47_transition[i] = DFA.unpackEncodedString(DFA47_transitionS[i]);
        }
    }

    class DFA47 extends DFA {

        public DFA47(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 47;
            this.eot = DFA47_eot;
            this.eof = DFA47_eof;
            this.min = DFA47_min;
            this.max = DFA47_max;
            this.accept = DFA47_accept;
            this.special = DFA47_special;
            this.transition = DFA47_transition;
        }
        public String getDescription() {
            return "200:9: ( ( MINUS )? variable | number | ( MINUS )? predicate_java_call | OPEN expr CLOSE )";
        }
    }
    static final String DFA50_eotS =
        "\10\uffff";
    static final String DFA50_eofS =
        "\10\uffff";
    static final String DFA50_minS =
        "\1\51\1\4\1\uffff\1\62\1\4\1\62\1\4\1\uffff";
    static final String DFA50_maxS =
        "\1\63\1\4\1\uffff\1\63\1\4\1\63\1\14\1\uffff";
    static final String DFA50_acceptS =
        "\2\uffff\1\2\4\uffff\1\1";
    static final String DFA50_specialS =
        "\10\uffff}>";
    static final String[] DFA50_transitionS = {
            "\1\2\3\uffff\1\2\4\uffff\1\1\1\2",
            "\1\3",
            "",
            "\1\1\1\4",
            "\1\5",
            "\1\6\1\2",
            "\1\2\7\uffff\1\7",
            ""
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
            return "206:1: predicate_java_call : ( static_java_call | instance_java_call );";
        }
    }
 

    public static final BitSet FOLLOW_statement_in_rulebase327 = new BitSet(new long[]{0x00CE000000000400L,0x0000000000000008L});
    public static final BitSet FOLLOW_NEWLINE_in_rulebase330 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_EOF_in_rulebase333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_statement351 = new BitSet(new long[]{0x00CE000000000400L,0x0000000000000008L});
    public static final BitSet FOLLOW_stat_in_statement354 = new BitSet(new long[]{0x0002000000000010L});
    public static final BitSet FOLLOW_end_of_statement_in_statement356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_end_of_statement373 = new BitSet(new long[]{0x0002000000000010L});
    public static final BitSet FOLLOW_DOT_in_end_of_statement376 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_set_in_end_of_statement378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_clause_in_stat395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_query_in_stat401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_query410 = new BitSet(new long[]{0x00CE000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_NEWLINE_in_query412 = new BitSet(new long[]{0x00CE000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_query_predicate_in_query415 = new BitSet(new long[]{0x0002000000001000L});
    public static final BitSet FOLLOW_NEWLINE_in_query417 = new BitSet(new long[]{0x0002000000001000L});
    public static final BitSet FOLLOW_OPEN_in_query420 = new BitSet(new long[]{0x00CE000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_NEWLINE_in_query422 = new BitSet(new long[]{0x00CE000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_relation_in_query425 = new BitSet(new long[]{0x0002000000002000L});
    public static final BitSet FOLLOW_NEWLINE_in_query427 = new BitSet(new long[]{0x0002000000002000L});
    public static final BitSet FOLLOW_CLOSE_in_query430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_query_predicate450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_metadata_in_clause459 = new BitSet(new long[]{0x00CC000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_relation_in_clause462 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_IF_in_clause465 = new BitSet(new long[]{0x00FE220000008840L,0x0000000000000008L});
    public static final BitSet FOLLOW_literals_in_clause467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_in_metadata493 = new BitSet(new long[]{0x0002000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_NEWLINE_in_metadata495 = new BitSet(new long[]{0x0002000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_annotation517 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LCWORD_in_annotation519 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_OPEN_in_annotation522 = new BitSet(new long[]{0x00FC000000000040L,0x0000000000000008L});
    public static final BitSet FOLLOW_value_in_annotation524 = new BitSet(new long[]{0x0000000000002200L});
    public static final BitSet FOLLOW_COMMA_in_annotation527 = new BitSet(new long[]{0x00FC000000000040L,0x0000000000000008L});
    public static final BitSet FOLLOW_value_in_annotation529 = new BitSet(new long[]{0x0000000000002200L});
    public static final BitSet FOLLOW_CLOSE_in_annotation533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCWORD_in_value558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UCWORD_in_value562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_in_value566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_value570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_literals580 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_COMMA_in_literals583 = new BitSet(new long[]{0x00FE220000008840L,0x0000000000000008L});
    public static final BitSet FOLLOW_literal_in_literals585 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_NEWLINE_in_literal605 = new BitSet(new long[]{0x00CE000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_metadata_in_literal610 = new BitSet(new long[]{0x00CC000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_relation_in_literal615 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_guard_in_literal619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_literal641 = new BitSet(new long[]{0x00FE220000008040L,0x0000000000000008L});
    public static final BitSet FOLLOW_metadata_in_literal646 = new BitSet(new long[]{0x00FE220000008040L,0x0000000000000008L});
    public static final BitSet FOLLOW_semantic_attachment_in_literal649 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_guard_in_literal653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_literal675 = new BitSet(new long[]{0x00FE220000008840L,0x0000000000000008L});
    public static final BitSet FOLLOW_cut_in_literal678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CUT_in_cut694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_not_equal_in_binary_operator703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_binary_operator707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_binary_operator711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LE_in_binary_operator715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GE_in_binary_operator719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_predicate_in_relation731 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_OPEN_in_relation733 = new BitSet(new long[]{0x00FE22000000A040L,0x0000000000000008L});
    public static final BitSet FOLLOW_list_body_in_relation735 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_CLOSE_in_relation737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BRA_in_guard756 = new BitSet(new long[]{0x00FE220000008840L,0x0000000000000008L});
    public static final BitSet FOLLOW_literals_in_guard758 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_KET_in_guard760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terms_in_list_body781 = new BitSet(new long[]{0x0002000000004002L});
    public static final BitSet FOLLOW_BAR_in_list_body784 = new BitSet(new long[]{0x00FE220000008040L,0x0000000000000008L});
    public static final BitSet FOLLOW_list_tail_in_list_body786 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_list_body792 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_variable_in_list_tail817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prova_list_in_list_tail821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_left_term831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_left_term838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_left_term844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prova_list_in_left_term850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_right_term861 = new BitSet(new long[]{0x00CE220000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_constant_in_right_term865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_right_term869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_right_term875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prova_list_in_right_term879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_terms888 = new BitSet(new long[]{0x00FE220000008040L,0x0000000000000008L});
    public static final BitSet FOLLOW_term_in_terms891 = new BitSet(new long[]{0x0002000000000202L});
    public static final BitSet FOLLOW_NEWLINE_in_terms894 = new BitSet(new long[]{0x0002000000000200L});
    public static final BitSet FOLLOW_COMMA_in_terms897 = new BitSet(new long[]{0x00FE220000008040L,0x0000000000000008L});
    public static final BitSet FOLLOW_NEWLINE_in_terms899 = new BitSet(new long[]{0x00FE220000008040L,0x0000000000000008L});
    public static final BitSet FOLLOW_term_in_terms902 = new BitSet(new long[]{0x0002000000000202L});
    public static final BitSet FOLLOW_left_term_in_term921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_func_term_in_term925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_func_in_func_term934 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_args_in_func_term936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCWORD_in_qualified_java_class949 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_DOT_in_qualified_java_class951 = new BitSet(new long[]{0x000C000000000000L});
    public static final BitSet FOLLOW_UCWORD_in_qualified_java_class955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BRA_in_prova_list983 = new BitSet(new long[]{0x00FE220000018040L,0x0000000000000008L});
    public static final BitSet FOLLOW_list_body_in_prova_list985 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_KET_in_prova_list987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_in_args1004 = new BitSet(new long[]{0x00FE22000000A040L,0x0000000000000008L});
    public static final BitSet FOLLOW_list_body_in_args1006 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_CLOSE_in_args1008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_predicate_java_call_in_semantic_attachment1026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_binary_operation_in_semantic_attachment1030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_left_term_in_binary_operation1039 = new BitSet(new long[]{0x0000000000FE0000L});
    public static final BitSet FOLLOW_EQUAL_in_binary_operation1045 = new BitSet(new long[]{0x00FE220000009040L,0x0000000000000008L});
    public static final BitSet FOLLOW_constructor_java_call_in_binary_operation1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prova_list_in_binary_operation1062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_binary_operation1069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_binary_operation1076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_not_equal_in_binary_operation1087 = new BitSet(new long[]{0x00CE000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_constant_in_binary_operation1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_binary_operator_in_binary_operation1095 = new BitSet(new long[]{0x00FE220000009040L,0x0000000000000008L});
    public static final BitSet FOLLOW_expr_in_binary_operation1097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_aterm_in_expr1109 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_set_in_expr1112 = new BitSet(new long[]{0x00FE220000009040L,0x0000000000000008L});
    public static final BitSet FOLLOW_expr_in_expr1120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_aterm1132 = new BitSet(new long[]{0x00CE220000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_variable_in_aterm1135 = new BitSet(new long[]{0x0000100000000182L});
    public static final BitSet FOLLOW_number_in_aterm1139 = new BitSet(new long[]{0x0000100000000182L});
    public static final BitSet FOLLOW_MINUS_in_aterm1143 = new BitSet(new long[]{0x00CE220000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_predicate_java_call_in_aterm1146 = new BitSet(new long[]{0x0000100000000182L});
    public static final BitSet FOLLOW_OPEN_in_aterm1150 = new BitSet(new long[]{0x00FE220000009040L,0x0000000000000008L});
    public static final BitSet FOLLOW_expr_in_aterm1152 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_CLOSE_in_aterm1154 = new BitSet(new long[]{0x0000100000000182L});
    public static final BitSet FOLLOW_set_in_aterm1158 = new BitSet(new long[]{0x00FE220000009040L,0x0000000000000008L});
    public static final BitSet FOLLOW_aterm_in_aterm1172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualified_java_class_in_constructor_java_call1184 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_UCWORD_in_constructor_java_call1188 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_args_in_constructor_java_call1191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_static_java_call_in_predicate_java_call1202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instance_java_call_in_predicate_java_call1206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instance_call_in_instance_java_call1217 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_args_in_instance_java_call1219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_static_call_in_static_java_call1240 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_args_in_static_java_call1242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCWORD_in_method1263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCWORD_in_func1271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UCWORD_in_func1275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_in_func1279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typed_variable_in_func1283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCWORD_in_predicate1293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UCWORD_in_predicate1297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_in_predicate1301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UCWORD_in_variable1308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USWORD_in_variable1312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typed_variable_in_variable1316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOLLARWORD_in_variable1320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_variable_or_number1330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_variable_or_number1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_word0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualified_java_class_in_typed_variable1361 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_DOT_in_typed_variable1363 = new BitSet(new long[]{0x000C000000000000L});
    public static final BitSet FOLLOW_word_in_typed_variable1365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UCWORD_in_typed_variable1381 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_DOT_in_typed_variable1383 = new BitSet(new long[]{0x000C000000000000L});
    public static final BitSet FOLLOW_word_in_typed_variable1385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_instance_call1407 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_DOT_in_instance_call1409 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LCWORD_in_instance_call1411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualified_java_class_in_static_call1429 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_DOT_in_static_call1431 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LCWORD_in_static_call1433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_LITERAL_in_pos_number1449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONG_LITERAL_in_pos_number1453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_float_literal_in_pos_number1457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_number1468 = new BitSet(new long[]{0x0030000000000040L});
    public static final BitSet FOLLOW_pos_number_in_number1472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCWORD_in_constant1481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_in_constant1485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualified_java_class_in_constant1489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_string0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_not_equal0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_LITERAL_in_float_literal1525 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_DOT_in_float_literal1527 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_INT_LITERAL_in_float_literal1529 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_EXPONENT_in_float_literal1531 = new BitSet(new long[]{0x0000000000000002L});

}