// $ANTLR 3.2 Sep 23, 2009 12:02:23 D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g 2010-10-30 02:25:12

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "DOT", "PLUS", "MINUS", "MULT", "DIV", "COMMA", "IF", "CUT", "OPEN", "CLOSE", "BAR", "BRA", "KET", "EQUAL", "NOT_EQUAL1", "NOT_EQUAL2", "LT", "GT", "LE", "GE", "CLAUSE", "RULEBASE", "STATEMENT", "QUERY", "LITERAL", "METADATA", "RELATION", "SEMANTIC_ATTACHMENT", "ARITHMETIC_RELATION", "PREDICATE", "TERM", "INSTANCE_JAVA_CALL", "STATIC_JAVA_CALL", "LIST_BODY", "PROVA_LIST", "ARGS", "TYPED_VARIABLE", "USWORD", "QUALIFIED_JAVA_CLASS", "ANNOTATION", "REM", "DOLLARWORD", "GUARD", "ATERM", "EXPR", "PROVA_MAP", "KEY_VALUE", "FUNCTION", "FUNCTION_CALL", "NEWLINE", "LCWORD", "UCWORD", "INT_LITERAL", "LONG_LITERAL", "STRING1", "STRING2", "EXPONENT", "DIGIT", "LC", "UC", "WORD", "DOLLAR", "UNDERSCORE", "ML_COMMENT", "WS", "CLEAN_STRING", "CHAR_ESC", "':'", "'@'", "'{'", "'}'", "'->'"
    };
    public static final int DOLLAR=65;
    public static final int FUNCTION=51;
    public static final int TERM=34;
    public static final int EXPONENT=60;
    public static final int LT=20;
    public static final int TYPED_VARIABLE=40;
    public static final int RULEBASE=25;
    public static final int ANNOTATION=43;
    public static final int EOF=-1;
    public static final int PREDICATE=33;
    public static final int STATEMENT=26;
    public static final int IF=10;
    public static final int WORD=64;
    public static final int ML_COMMENT=67;
    public static final int EXPR=48;
    public static final int COMMA=9;
    public static final int STRING2=59;
    public static final int STRING1=58;
    public static final int EQUAL=17;
    public static final int ARGS=39;
    public static final int UC=63;
    public static final int PLUS=5;
    public static final int DIGIT=61;
    public static final int CLAUSE=24;
    public static final int DOT=4;
    public static final int PROVA_MAP=49;
    public static final int ATERM=47;
    public static final int DOLLARWORD=45;
    public static final int GE=23;
    public static final int INT_LITERAL=56;
    public static final int SEMANTIC_ATTACHMENT=31;
    public static final int KEY_VALUE=50;
    public static final int CHAR_ESC=70;
    public static final int KET=16;
    public static final int RELATION=30;
    public static final int STATIC_JAVA_CALL=36;
    public static final int UNDERSCORE=66;
    public static final int LITERAL=28;
    public static final int USWORD=41;
    public static final int REM=44;
    public static final int MULT=7;
    public static final int MINUS=6;
    public static final int LONG_LITERAL=57;
    public static final int PROVA_LIST=38;
    public static final int LCWORD=54;
    public static final int CUT=11;
    public static final int OPEN=12;
    public static final int QUALIFIED_JAVA_CLASS=42;
    public static final int WS=68;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int NEWLINE=53;
    public static final int CLOSE=13;
    public static final int UCWORD=55;
    public static final int LIST_BODY=37;
    public static final int CLEAN_STRING=69;
    public static final int LC=62;
    public static final int GT=21;
    public static final int QUERY=27;
    public static final int GUARD=46;
    public static final int ARITHMETIC_RELATION=32;
    public static final int DIV=8;
    public static final int METADATA=29;
    public static final int FUNCTION_CALL=52;
    public static final int T__75=75;
    public static final int T__74=74;
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
    public String getGrammarFileName() { return "D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g"; }


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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:88:1: rulebase : ( statement )* ( NEWLINE )* EOF -> ^( RULEBASE ( statement )* ) ;
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
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:89:2: ( ( statement )* ( NEWLINE )* EOF -> ^( RULEBASE ( statement )* ) )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:89:4: ( statement )* ( NEWLINE )* EOF
            {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:89:4: ( statement )*
            loop1:
            do {
                int alt1=2;
                alt1 = dfa1.predict(input);
                switch (alt1) {
            	case 1 :
            	    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:89:4: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_rulebase343);
            	    statement1=statement();

            	    state._fsp--;

            	    stream_statement.add(statement1.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:89:15: ( NEWLINE )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==NEWLINE) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:89:15: NEWLINE
            	    {
            	    NEWLINE2=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_rulebase346);  
            	    stream_NEWLINE.add(NEWLINE2);


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            EOF3=(Token)match(input,EOF,FOLLOW_EOF_in_rulebase349);  
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
            // 89:27: -> ^( RULEBASE ( statement )* )
            {
                // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:89:30: ^( RULEBASE ( statement )* )
                {
                ProvaAST root_1 = (ProvaAST)adaptor.nil();
                root_1 = (ProvaAST)adaptor.becomeRoot((ProvaAST)adaptor.create(RULEBASE, "RULEBASE"), root_1);

                // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:89:41: ( statement )*
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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:91:1: statement : ( NEWLINE )* stat end_of_statement -> ^( STATEMENT stat ) ;
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
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:92:2: ( ( NEWLINE )* stat end_of_statement -> ^( STATEMENT stat ) )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:92:4: ( NEWLINE )* stat end_of_statement
            {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:92:4: ( NEWLINE )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==NEWLINE) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:92:4: NEWLINE
            	    {
            	    NEWLINE4=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_statement367);  
            	    stream_NEWLINE.add(NEWLINE4);


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            pushFollow(FOLLOW_stat_in_statement370);
            stat5=stat();

            state._fsp--;

            stream_stat.add(stat5.getTree());
            pushFollow(FOLLOW_end_of_statement_in_statement372);
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
            // 92:35: -> ^( STATEMENT stat )
            {
                // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:92:38: ^( STATEMENT stat )
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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:94:1: end_of_statement : ( NEWLINE )* DOT ( NEWLINE | EOF ) ;
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
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:95:2: ( ( NEWLINE )* DOT ( NEWLINE | EOF ) )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:95:4: ( NEWLINE )* DOT ( NEWLINE | EOF )
            {
            root_0 = (ProvaAST)adaptor.nil();

            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:95:4: ( NEWLINE )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==NEWLINE) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:95:4: NEWLINE
            	    {
            	    NEWLINE7=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_end_of_statement389); 
            	    NEWLINE7_tree = (ProvaAST)adaptor.create(NEWLINE7);
            	    adaptor.addChild(root_0, NEWLINE7_tree);


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            DOT8=(Token)match(input,DOT,FOLLOW_DOT_in_end_of_statement392); 
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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:97:1: stat : ( clause | query | function );
    public final Prova2Parser.stat_return stat() throws RecognitionException {
        Prova2Parser.stat_return retval = new Prova2Parser.stat_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Prova2Parser.clause_return clause10 = null;

        Prova2Parser.query_return query11 = null;

        Prova2Parser.function_return function12 = null;



        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:97:7: ( clause | query | function )
            int alt5=3;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:97:9: clause
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_clause_in_stat411);
                    clause10=clause();

                    state._fsp--;

                    adaptor.addChild(root_0, clause10.getTree());

                    }
                    break;
                case 2 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:98:5: query
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_query_in_stat417);
                    query11=query();

                    state._fsp--;

                    adaptor.addChild(root_0, query11.getTree());

                    }
                    break;
                case 3 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:99:5: function
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_function_in_stat423);
                    function12=function();

                    state._fsp--;

                    adaptor.addChild(root_0, function12.getTree());

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

    public static class function_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "function"
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:101:1: function : ( metadata )? LCWORD list_body0 ':' list_body0 ( '=' literals )? -> ^( CLAUSE ( metadata )? LCWORD list_body0 list_body0 ( literals )? ) ;
    public final Prova2Parser.function_return function() throws RecognitionException {
        Prova2Parser.function_return retval = new Prova2Parser.function_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token LCWORD14=null;
        Token char_literal16=null;
        Token char_literal18=null;
        Prova2Parser.metadata_return metadata13 = null;

        Prova2Parser.list_body0_return list_body015 = null;

        Prova2Parser.list_body0_return list_body017 = null;

        Prova2Parser.literals_return literals19 = null;


        ProvaAST LCWORD14_tree=null;
        ProvaAST char_literal16_tree=null;
        ProvaAST char_literal18_tree=null;
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleTokenStream stream_LCWORD=new RewriteRuleTokenStream(adaptor,"token LCWORD");
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleSubtreeStream stream_list_body0=new RewriteRuleSubtreeStream(adaptor,"rule list_body0");
        RewriteRuleSubtreeStream stream_literals=new RewriteRuleSubtreeStream(adaptor,"rule literals");
        RewriteRuleSubtreeStream stream_metadata=new RewriteRuleSubtreeStream(adaptor,"rule metadata");
        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:102:2: ( ( metadata )? LCWORD list_body0 ':' list_body0 ( '=' literals )? -> ^( CLAUSE ( metadata )? LCWORD list_body0 list_body0 ( literals )? ) )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:102:4: ( metadata )? LCWORD list_body0 ':' list_body0 ( '=' literals )?
            {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:102:4: ( metadata )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==72) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:102:4: metadata
                    {
                    pushFollow(FOLLOW_metadata_in_function433);
                    metadata13=metadata();

                    state._fsp--;

                    stream_metadata.add(metadata13.getTree());

                    }
                    break;

            }

            LCWORD14=(Token)match(input,LCWORD,FOLLOW_LCWORD_in_function436);  
            stream_LCWORD.add(LCWORD14);

            pushFollow(FOLLOW_list_body0_in_function438);
            list_body015=list_body0();

            state._fsp--;

            stream_list_body0.add(list_body015.getTree());
            char_literal16=(Token)match(input,71,FOLLOW_71_in_function440);  
            stream_71.add(char_literal16);

            pushFollow(FOLLOW_list_body0_in_function442);
            list_body017=list_body0();

            state._fsp--;

            stream_list_body0.add(list_body017.getTree());
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:102:47: ( '=' literals )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==EQUAL) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:102:48: '=' literals
                    {
                    char_literal18=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_function445);  
                    stream_EQUAL.add(char_literal18);

                    pushFollow(FOLLOW_literals_in_function447);
                    literals19=literals();

                    state._fsp--;

                    stream_literals.add(literals19.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: literals, list_body0, list_body0, LCWORD, metadata
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ProvaAST)adaptor.nil();
            // 102:63: -> ^( CLAUSE ( metadata )? LCWORD list_body0 list_body0 ( literals )? )
            {
                // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:102:66: ^( CLAUSE ( metadata )? LCWORD list_body0 list_body0 ( literals )? )
                {
                ProvaAST root_1 = (ProvaAST)adaptor.nil();
                root_1 = (ProvaAST)adaptor.becomeRoot((ProvaAST)adaptor.create(CLAUSE, "CLAUSE"), root_1);

                // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:102:75: ( metadata )?
                if ( stream_metadata.hasNext() ) {
                    adaptor.addChild(root_1, stream_metadata.nextTree());

                }
                stream_metadata.reset();
                adaptor.addChild(root_1, stream_LCWORD.nextNode());
                adaptor.addChild(root_1, stream_list_body0.nextTree());
                adaptor.addChild(root_1, stream_list_body0.nextTree());
                // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:102:114: ( literals )?
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
    // $ANTLR end "function"

    public static class function_call_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "function_call"
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:104:1: function_call : predicate list_body0 ':' list_body0 -> ^( FUNCTION_CALL predicate list_body0 list_body0 ) ;
    public final Prova2Parser.function_call_return function_call() throws RecognitionException {
        Prova2Parser.function_call_return retval = new Prova2Parser.function_call_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token char_literal22=null;
        Prova2Parser.predicate_return predicate20 = null;

        Prova2Parser.list_body0_return list_body021 = null;

        Prova2Parser.list_body0_return list_body023 = null;


        ProvaAST char_literal22_tree=null;
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleSubtreeStream stream_list_body0=new RewriteRuleSubtreeStream(adaptor,"rule list_body0");
        RewriteRuleSubtreeStream stream_predicate=new RewriteRuleSubtreeStream(adaptor,"rule predicate");
        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:105:2: ( predicate list_body0 ':' list_body0 -> ^( FUNCTION_CALL predicate list_body0 list_body0 ) )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:105:4: predicate list_body0 ':' list_body0
            {
            pushFollow(FOLLOW_predicate_in_function_call477);
            predicate20=predicate();

            state._fsp--;

            stream_predicate.add(predicate20.getTree());
            pushFollow(FOLLOW_list_body0_in_function_call479);
            list_body021=list_body0();

            state._fsp--;

            stream_list_body0.add(list_body021.getTree());
            char_literal22=(Token)match(input,71,FOLLOW_71_in_function_call481);  
            stream_71.add(char_literal22);

            pushFollow(FOLLOW_list_body0_in_function_call483);
            list_body023=list_body0();

            state._fsp--;

            stream_list_body0.add(list_body023.getTree());


            // AST REWRITE
            // elements: list_body0, predicate, list_body0
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ProvaAST)adaptor.nil();
            // 105:40: -> ^( FUNCTION_CALL predicate list_body0 list_body0 )
            {
                // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:105:43: ^( FUNCTION_CALL predicate list_body0 list_body0 )
                {
                ProvaAST root_1 = (ProvaAST)adaptor.nil();
                root_1 = (ProvaAST)adaptor.becomeRoot((ProvaAST)adaptor.create(FUNCTION_CALL, "FUNCTION_CALL"), root_1);

                adaptor.addChild(root_1, stream_predicate.nextTree());
                adaptor.addChild(root_1, stream_list_body0.nextTree());
                adaptor.addChild(root_1, stream_list_body0.nextTree());

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
    // $ANTLR end "function_call"

    public static class query_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "query"
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:107:1: query : IF ( NEWLINE )* query_predicate ( NEWLINE )* '(' ( NEWLINE )* relation ( NEWLINE )* ')' -> ^( QUERY query_predicate relation ) ;
    public final Prova2Parser.query_return query() throws RecognitionException {
        Prova2Parser.query_return retval = new Prova2Parser.query_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token IF24=null;
        Token NEWLINE25=null;
        Token NEWLINE27=null;
        Token char_literal28=null;
        Token NEWLINE29=null;
        Token NEWLINE31=null;
        Token char_literal32=null;
        Prova2Parser.query_predicate_return query_predicate26 = null;

        Prova2Parser.relation_return relation30 = null;


        ProvaAST IF24_tree=null;
        ProvaAST NEWLINE25_tree=null;
        ProvaAST NEWLINE27_tree=null;
        ProvaAST char_literal28_tree=null;
        ProvaAST NEWLINE29_tree=null;
        ProvaAST NEWLINE31_tree=null;
        ProvaAST char_literal32_tree=null;
        RewriteRuleTokenStream stream_OPEN=new RewriteRuleTokenStream(adaptor,"token OPEN");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_CLOSE=new RewriteRuleTokenStream(adaptor,"token CLOSE");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_query_predicate=new RewriteRuleSubtreeStream(adaptor,"rule query_predicate");
        RewriteRuleSubtreeStream stream_relation=new RewriteRuleSubtreeStream(adaptor,"rule relation");
        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:107:8: ( IF ( NEWLINE )* query_predicate ( NEWLINE )* '(' ( NEWLINE )* relation ( NEWLINE )* ')' -> ^( QUERY query_predicate relation ) )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:107:10: IF ( NEWLINE )* query_predicate ( NEWLINE )* '(' ( NEWLINE )* relation ( NEWLINE )* ')'
            {
            IF24=(Token)match(input,IF,FOLLOW_IF_in_query504);  
            stream_IF.add(IF24);

            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:107:13: ( NEWLINE )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==NEWLINE) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:107:13: NEWLINE
            	    {
            	    NEWLINE25=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_query506);  
            	    stream_NEWLINE.add(NEWLINE25);


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            pushFollow(FOLLOW_query_predicate_in_query509);
            query_predicate26=query_predicate();

            state._fsp--;

            stream_query_predicate.add(query_predicate26.getTree());
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:107:38: ( NEWLINE )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==NEWLINE) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:107:38: NEWLINE
            	    {
            	    NEWLINE27=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_query511);  
            	    stream_NEWLINE.add(NEWLINE27);


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            char_literal28=(Token)match(input,OPEN,FOLLOW_OPEN_in_query514);  
            stream_OPEN.add(char_literal28);

            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:107:51: ( NEWLINE )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==NEWLINE) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:107:51: NEWLINE
            	    {
            	    NEWLINE29=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_query516);  
            	    stream_NEWLINE.add(NEWLINE29);


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            pushFollow(FOLLOW_relation_in_query519);
            relation30=relation();

            state._fsp--;

            stream_relation.add(relation30.getTree());
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:107:69: ( NEWLINE )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==NEWLINE) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:107:69: NEWLINE
            	    {
            	    NEWLINE31=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_query521);  
            	    stream_NEWLINE.add(NEWLINE31);


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            char_literal32=(Token)match(input,CLOSE,FOLLOW_CLOSE_in_query524);  
            stream_CLOSE.add(char_literal32);



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
            // 107:82: -> ^( QUERY query_predicate relation )
            {
                // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:107:85: ^( QUERY query_predicate relation )
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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:109:1: query_predicate : constant ;
    public final Prova2Parser.query_predicate_return query_predicate() throws RecognitionException {
        Prova2Parser.query_predicate_return retval = new Prova2Parser.query_predicate_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Prova2Parser.constant_return constant33 = null;



        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:110:2: ( constant )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:110:4: constant
            {
            root_0 = (ProvaAST)adaptor.nil();

            pushFollow(FOLLOW_constant_in_query_predicate544);
            constant33=constant();

            state._fsp--;

            adaptor.addChild(root_0, constant33.getTree());

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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:112:1: clause : ( metadata )? relation ( IF literals )? -> ^( CLAUSE ( metadata )? relation ( literals )? ) ;
    public final Prova2Parser.clause_return clause() throws RecognitionException {
        Prova2Parser.clause_return retval = new Prova2Parser.clause_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token IF36=null;
        Prova2Parser.metadata_return metadata34 = null;

        Prova2Parser.relation_return relation35 = null;

        Prova2Parser.literals_return literals37 = null;


        ProvaAST IF36_tree=null;
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_literals=new RewriteRuleSubtreeStream(adaptor,"rule literals");
        RewriteRuleSubtreeStream stream_relation=new RewriteRuleSubtreeStream(adaptor,"rule relation");
        RewriteRuleSubtreeStream stream_metadata=new RewriteRuleSubtreeStream(adaptor,"rule metadata");
        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:112:9: ( ( metadata )? relation ( IF literals )? -> ^( CLAUSE ( metadata )? relation ( literals )? ) )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:112:11: ( metadata )? relation ( IF literals )?
            {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:112:11: ( metadata )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==72) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:112:11: metadata
                    {
                    pushFollow(FOLLOW_metadata_in_clause553);
                    metadata34=metadata();

                    state._fsp--;

                    stream_metadata.add(metadata34.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_relation_in_clause556);
            relation35=relation();

            state._fsp--;

            stream_relation.add(relation35.getTree());
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:112:30: ( IF literals )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==IF) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:112:31: IF literals
                    {
                    IF36=(Token)match(input,IF,FOLLOW_IF_in_clause559);  
                    stream_IF.add(IF36);

                    pushFollow(FOLLOW_literals_in_clause561);
                    literals37=literals();

                    state._fsp--;

                    stream_literals.add(literals37.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: literals, metadata, relation
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ProvaAST)adaptor.nil();
            // 112:45: -> ^( CLAUSE ( metadata )? relation ( literals )? )
            {
                // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:112:48: ^( CLAUSE ( metadata )? relation ( literals )? )
                {
                ProvaAST root_1 = (ProvaAST)adaptor.nil();
                root_1 = (ProvaAST)adaptor.becomeRoot((ProvaAST)adaptor.create(CLAUSE, "CLAUSE"), root_1);

                // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:112:57: ( metadata )?
                if ( stream_metadata.hasNext() ) {
                    adaptor.addChild(root_1, stream_metadata.nextTree());

                }
                stream_metadata.reset();
                adaptor.addChild(root_1, stream_relation.nextTree());
                // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:112:76: ( literals )?
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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:114:1: metadata : ( annotation ( NEWLINE )* )+ -> ^( METADATA ( annotation )+ ) ;
    public final Prova2Parser.metadata_return metadata() throws RecognitionException {
        Prova2Parser.metadata_return retval = new Prova2Parser.metadata_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token NEWLINE39=null;
        Prova2Parser.annotation_return annotation38 = null;


        ProvaAST NEWLINE39_tree=null;
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleSubtreeStream stream_annotation=new RewriteRuleSubtreeStream(adaptor,"rule annotation");
        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:115:2: ( ( annotation ( NEWLINE )* )+ -> ^( METADATA ( annotation )+ ) )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:115:4: ( annotation ( NEWLINE )* )+
            {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:115:4: ( annotation ( NEWLINE )* )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==72) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:115:5: annotation ( NEWLINE )*
            	    {
            	    pushFollow(FOLLOW_annotation_in_metadata587);
            	    annotation38=annotation();

            	    state._fsp--;

            	    stream_annotation.add(annotation38.getTree());
            	    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:115:16: ( NEWLINE )*
            	    loop14:
            	    do {
            	        int alt14=2;
            	        int LA14_0 = input.LA(1);

            	        if ( (LA14_0==NEWLINE) ) {
            	            alt14=1;
            	        }


            	        switch (alt14) {
            	    	case 1 :
            	    	    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:115:16: NEWLINE
            	    	    {
            	    	    NEWLINE39=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_metadata589);  
            	    	    stream_NEWLINE.add(NEWLINE39);


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop14;
            	        }
            	    } while (true);


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
            // 115:27: -> ^( METADATA ( annotation )+ )
            {
                // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:115:30: ^( METADATA ( annotation )+ )
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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:118:1: annotation : '@' LCWORD ( '(' value ( COMMA value )* ')' )? -> ^( ANNOTATION LCWORD ( value )* ) ;
    public final Prova2Parser.annotation_return annotation() throws RecognitionException {
        Prova2Parser.annotation_return retval = new Prova2Parser.annotation_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token char_literal40=null;
        Token LCWORD41=null;
        Token char_literal42=null;
        Token COMMA44=null;
        Token char_literal46=null;
        Prova2Parser.value_return value43 = null;

        Prova2Parser.value_return value45 = null;


        ProvaAST char_literal40_tree=null;
        ProvaAST LCWORD41_tree=null;
        ProvaAST char_literal42_tree=null;
        ProvaAST COMMA44_tree=null;
        ProvaAST char_literal46_tree=null;
        RewriteRuleTokenStream stream_OPEN=new RewriteRuleTokenStream(adaptor,"token OPEN");
        RewriteRuleTokenStream stream_CLOSE=new RewriteRuleTokenStream(adaptor,"token CLOSE");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
        RewriteRuleTokenStream stream_LCWORD=new RewriteRuleTokenStream(adaptor,"token LCWORD");
        RewriteRuleSubtreeStream stream_value=new RewriteRuleSubtreeStream(adaptor,"rule value");
        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:119:2: ( '@' LCWORD ( '(' value ( COMMA value )* ')' )? -> ^( ANNOTATION LCWORD ( value )* ) )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:119:4: '@' LCWORD ( '(' value ( COMMA value )* ')' )?
            {
            char_literal40=(Token)match(input,72,FOLLOW_72_in_annotation611);  
            stream_72.add(char_literal40);

            LCWORD41=(Token)match(input,LCWORD,FOLLOW_LCWORD_in_annotation613);  
            stream_LCWORD.add(LCWORD41);

            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:119:15: ( '(' value ( COMMA value )* ')' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==OPEN) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:119:16: '(' value ( COMMA value )* ')'
                    {
                    char_literal42=(Token)match(input,OPEN,FOLLOW_OPEN_in_annotation616);  
                    stream_OPEN.add(char_literal42);

                    pushFollow(FOLLOW_value_in_annotation618);
                    value43=value();

                    state._fsp--;

                    stream_value.add(value43.getTree());
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:119:26: ( COMMA value )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==COMMA) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:119:27: COMMA value
                    	    {
                    	    COMMA44=(Token)match(input,COMMA,FOLLOW_COMMA_in_annotation621);  
                    	    stream_COMMA.add(COMMA44);

                    	    pushFollow(FOLLOW_value_in_annotation623);
                    	    value45=value();

                    	    state._fsp--;

                    	    stream_value.add(value45.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    char_literal46=(Token)match(input,CLOSE,FOLLOW_CLOSE_in_annotation627);  
                    stream_CLOSE.add(char_literal46);


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
            // 119:47: -> ^( ANNOTATION LCWORD ( value )* )
            {
                // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:119:50: ^( ANNOTATION LCWORD ( value )* )
                {
                ProvaAST root_1 = (ProvaAST)adaptor.nil();
                root_1 = (ProvaAST)adaptor.becomeRoot((ProvaAST)adaptor.create(ANNOTATION, "ANNOTATION"), root_1);

                adaptor.addChild(root_1, stream_LCWORD.nextNode());
                // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:119:70: ( value )*
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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:122:1: value : ( LCWORD | UCWORD | string | number );
    public final Prova2Parser.value_return value() throws RecognitionException {
        Prova2Parser.value_return retval = new Prova2Parser.value_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token LCWORD47=null;
        Token UCWORD48=null;
        Prova2Parser.string_return string49 = null;

        Prova2Parser.number_return number50 = null;


        ProvaAST LCWORD47_tree=null;
        ProvaAST UCWORD48_tree=null;

        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:123:2: ( LCWORD | UCWORD | string | number )
            int alt18=4;
            switch ( input.LA(1) ) {
            case LCWORD:
                {
                alt18=1;
                }
                break;
            case UCWORD:
                {
                alt18=2;
                }
                break;
            case STRING1:
            case STRING2:
                {
                alt18=3;
                }
                break;
            case MINUS:
            case INT_LITERAL:
            case LONG_LITERAL:
                {
                alt18=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:123:4: LCWORD
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    LCWORD47=(Token)match(input,LCWORD,FOLLOW_LCWORD_in_value652); 
                    LCWORD47_tree = (ProvaAST)adaptor.create(LCWORD47);
                    adaptor.addChild(root_0, LCWORD47_tree);


                    }
                    break;
                case 2 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:123:13: UCWORD
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    UCWORD48=(Token)match(input,UCWORD,FOLLOW_UCWORD_in_value656); 
                    UCWORD48_tree = (ProvaAST)adaptor.create(UCWORD48);
                    adaptor.addChild(root_0, UCWORD48_tree);


                    }
                    break;
                case 3 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:123:22: string
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_string_in_value660);
                    string49=string();

                    state._fsp--;

                    adaptor.addChild(root_0, string49.getTree());

                    }
                    break;
                case 4 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:123:31: number
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_number_in_value664);
                    number50=number();

                    state._fsp--;

                    adaptor.addChild(root_0, number50.getTree());

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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:126:1: literals : literal ( COMMA literal )* -> ^( LITERAL ( literal )+ ) ;
    public final Prova2Parser.literals_return literals() throws RecognitionException {
        Prova2Parser.literals_return retval = new Prova2Parser.literals_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token COMMA52=null;
        Prova2Parser.literal_return literal51 = null;

        Prova2Parser.literal_return literal53 = null;


        ProvaAST COMMA52_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_literal=new RewriteRuleSubtreeStream(adaptor,"rule literal");
        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:126:11: ( literal ( COMMA literal )* -> ^( LITERAL ( literal )+ ) )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:126:13: literal ( COMMA literal )*
            {
            pushFollow(FOLLOW_literal_in_literals674);
            literal51=literal();

            state._fsp--;

            stream_literal.add(literal51.getTree());
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:126:21: ( COMMA literal )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==COMMA) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:126:22: COMMA literal
            	    {
            	    COMMA52=(Token)match(input,COMMA,FOLLOW_COMMA_in_literals677);  
            	    stream_COMMA.add(COMMA52);

            	    pushFollow(FOLLOW_literal_in_literals679);
            	    literal53=literal();

            	    state._fsp--;

            	    stream_literal.add(literal53.getTree());

            	    }
            	    break;

            	default :
            	    break loop19;
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
            // 126:38: -> ^( LITERAL ( literal )+ )
            {
                // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:126:41: ^( LITERAL ( literal )+ )
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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:128:1: literal : ( ( NEWLINE )* (m= metadata )? r= relation (g= guard )? -> ^( RELATION ( metadata )? relation ( guard )? ) | ( NEWLINE )* (m= metadata )? semantic_attachment (g= guard )? -> ^( SEMANTIC_ATTACHMENT ( metadata )? semantic_attachment ( guard )? ) | ( NEWLINE )* ( metadata )? function_call -> ^( FUNCTION ( metadata )? function_call ) | ( NEWLINE )* cut -> ^( CUT cut ) );
    public final Prova2Parser.literal_return literal() throws RecognitionException {
        Prova2Parser.literal_return retval = new Prova2Parser.literal_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token NEWLINE54=null;
        Token NEWLINE55=null;
        Token NEWLINE57=null;
        Token NEWLINE60=null;
        Prova2Parser.metadata_return m = null;

        Prova2Parser.relation_return r = null;

        Prova2Parser.guard_return g = null;

        Prova2Parser.semantic_attachment_return semantic_attachment56 = null;

        Prova2Parser.metadata_return metadata58 = null;

        Prova2Parser.function_call_return function_call59 = null;

        Prova2Parser.cut_return cut61 = null;


        ProvaAST NEWLINE54_tree=null;
        ProvaAST NEWLINE55_tree=null;
        ProvaAST NEWLINE57_tree=null;
        ProvaAST NEWLINE60_tree=null;
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleSubtreeStream stream_function_call=new RewriteRuleSubtreeStream(adaptor,"rule function_call");
        RewriteRuleSubtreeStream stream_guard=new RewriteRuleSubtreeStream(adaptor,"rule guard");
        RewriteRuleSubtreeStream stream_relation=new RewriteRuleSubtreeStream(adaptor,"rule relation");
        RewriteRuleSubtreeStream stream_semantic_attachment=new RewriteRuleSubtreeStream(adaptor,"rule semantic_attachment");
        RewriteRuleSubtreeStream stream_cut=new RewriteRuleSubtreeStream(adaptor,"rule cut");
        RewriteRuleSubtreeStream stream_metadata=new RewriteRuleSubtreeStream(adaptor,"rule metadata");
        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:128:10: ( ( NEWLINE )* (m= metadata )? r= relation (g= guard )? -> ^( RELATION ( metadata )? relation ( guard )? ) | ( NEWLINE )* (m= metadata )? semantic_attachment (g= guard )? -> ^( SEMANTIC_ATTACHMENT ( metadata )? semantic_attachment ( guard )? ) | ( NEWLINE )* ( metadata )? function_call -> ^( FUNCTION ( metadata )? function_call ) | ( NEWLINE )* cut -> ^( CUT cut ) )
            int alt29=4;
            alt29 = dfa29.predict(input);
            switch (alt29) {
                case 1 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:128:12: ( NEWLINE )* (m= metadata )? r= relation (g= guard )?
                    {
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:128:12: ( NEWLINE )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==NEWLINE) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:128:12: NEWLINE
                    	    {
                    	    NEWLINE54=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_literal699);  
                    	    stream_NEWLINE.add(NEWLINE54);


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:128:22: (m= metadata )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==72) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:128:22: m= metadata
                            {
                            pushFollow(FOLLOW_metadata_in_literal704);
                            m=metadata();

                            state._fsp--;

                            stream_metadata.add(m.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_relation_in_literal709);
                    r=relation();

                    state._fsp--;

                    stream_relation.add(r.getTree());
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:128:45: (g= guard )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==BRA) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:128:45: g= guard
                            {
                            pushFollow(FOLLOW_guard_in_literal713);
                            g=guard();

                            state._fsp--;

                            stream_guard.add(g.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: guard, metadata, relation
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ProvaAST)adaptor.nil();
                    // 128:53: -> ^( RELATION ( metadata )? relation ( guard )? )
                    {
                        // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:128:56: ^( RELATION ( metadata )? relation ( guard )? )
                        {
                        ProvaAST root_1 = (ProvaAST)adaptor.nil();
                        root_1 = (ProvaAST)adaptor.becomeRoot((ProvaAST)adaptor.create(RELATION, "RELATION"), root_1);

                        // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:128:67: ( metadata )?
                        if ( stream_metadata.hasNext() ) {
                            adaptor.addChild(root_1, stream_metadata.nextTree());

                        }
                        stream_metadata.reset();
                        adaptor.addChild(root_1, stream_relation.nextTree());
                        // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:128:86: ( guard )?
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
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:129:6: ( NEWLINE )* (m= metadata )? semantic_attachment (g= guard )?
                    {
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:129:6: ( NEWLINE )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==NEWLINE) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:129:6: NEWLINE
                    	    {
                    	    NEWLINE55=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_literal735);  
                    	    stream_NEWLINE.add(NEWLINE55);


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:129:16: (m= metadata )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==72) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:129:16: m= metadata
                            {
                            pushFollow(FOLLOW_metadata_in_literal740);
                            m=metadata();

                            state._fsp--;

                            stream_metadata.add(m.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_semantic_attachment_in_literal743);
                    semantic_attachment56=semantic_attachment();

                    state._fsp--;

                    stream_semantic_attachment.add(semantic_attachment56.getTree());
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:129:48: (g= guard )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==BRA) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:129:48: g= guard
                            {
                            pushFollow(FOLLOW_guard_in_literal747);
                            g=guard();

                            state._fsp--;

                            stream_guard.add(g.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: semantic_attachment, guard, metadata
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ProvaAST)adaptor.nil();
                    // 129:56: -> ^( SEMANTIC_ATTACHMENT ( metadata )? semantic_attachment ( guard )? )
                    {
                        // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:129:59: ^( SEMANTIC_ATTACHMENT ( metadata )? semantic_attachment ( guard )? )
                        {
                        ProvaAST root_1 = (ProvaAST)adaptor.nil();
                        root_1 = (ProvaAST)adaptor.becomeRoot((ProvaAST)adaptor.create(SEMANTIC_ATTACHMENT, "SEMANTIC_ATTACHMENT"), root_1);

                        // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:129:81: ( metadata )?
                        if ( stream_metadata.hasNext() ) {
                            adaptor.addChild(root_1, stream_metadata.nextTree());

                        }
                        stream_metadata.reset();
                        adaptor.addChild(root_1, stream_semantic_attachment.nextTree());
                        // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:129:111: ( guard )?
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
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:130:6: ( NEWLINE )* ( metadata )? function_call
                    {
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:130:6: ( NEWLINE )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==NEWLINE) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:130:6: NEWLINE
                    	    {
                    	    NEWLINE57=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_literal769);  
                    	    stream_NEWLINE.add(NEWLINE57);


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);

                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:130:15: ( metadata )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==72) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:130:15: metadata
                            {
                            pushFollow(FOLLOW_metadata_in_literal772);
                            metadata58=metadata();

                            state._fsp--;

                            stream_metadata.add(metadata58.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_function_call_in_literal775);
                    function_call59=function_call();

                    state._fsp--;

                    stream_function_call.add(function_call59.getTree());


                    // AST REWRITE
                    // elements: metadata, function_call
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ProvaAST)adaptor.nil();
                    // 130:39: -> ^( FUNCTION ( metadata )? function_call )
                    {
                        // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:130:42: ^( FUNCTION ( metadata )? function_call )
                        {
                        ProvaAST root_1 = (ProvaAST)adaptor.nil();
                        root_1 = (ProvaAST)adaptor.becomeRoot((ProvaAST)adaptor.create(FUNCTION, "FUNCTION"), root_1);

                        // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:130:53: ( metadata )?
                        if ( stream_metadata.hasNext() ) {
                            adaptor.addChild(root_1, stream_metadata.nextTree());

                        }
                        stream_metadata.reset();
                        adaptor.addChild(root_1, stream_function_call.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:131:6: ( NEWLINE )* cut
                    {
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:131:6: ( NEWLINE )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==NEWLINE) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:131:6: NEWLINE
                    	    {
                    	    NEWLINE60=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_literal793);  
                    	    stream_NEWLINE.add(NEWLINE60);


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);

                    pushFollow(FOLLOW_cut_in_literal796);
                    cut61=cut();

                    state._fsp--;

                    stream_cut.add(cut61.getTree());


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
                    // 131:19: -> ^( CUT cut )
                    {
                        // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:131:22: ^( CUT cut )
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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:133:1: cut : CUT ;
    public final Prova2Parser.cut_return cut() throws RecognitionException {
        Prova2Parser.cut_return retval = new Prova2Parser.cut_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token CUT62=null;

        ProvaAST CUT62_tree=null;

        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:133:5: ( CUT )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:133:7: CUT
            {
            root_0 = (ProvaAST)adaptor.nil();

            CUT62=(Token)match(input,CUT,FOLLOW_CUT_in_cut812); 
            CUT62_tree = (ProvaAST)adaptor.create(CUT62);
            adaptor.addChild(root_0, CUT62_tree);


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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:135:1: binary_operator : ( not_equal | LT | GT | LE | GE );
    public final Prova2Parser.binary_operator_return binary_operator() throws RecognitionException {
        Prova2Parser.binary_operator_return retval = new Prova2Parser.binary_operator_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token LT64=null;
        Token GT65=null;
        Token LE66=null;
        Token GE67=null;
        Prova2Parser.not_equal_return not_equal63 = null;


        ProvaAST LT64_tree=null;
        ProvaAST GT65_tree=null;
        ProvaAST LE66_tree=null;
        ProvaAST GE67_tree=null;

        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:136:2: ( not_equal | LT | GT | LE | GE )
            int alt30=5;
            switch ( input.LA(1) ) {
            case NOT_EQUAL1:
            case NOT_EQUAL2:
                {
                alt30=1;
                }
                break;
            case LT:
                {
                alt30=2;
                }
                break;
            case GT:
                {
                alt30=3;
                }
                break;
            case LE:
                {
                alt30=4;
                }
                break;
            case GE:
                {
                alt30=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:136:4: not_equal
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_not_equal_in_binary_operator821);
                    not_equal63=not_equal();

                    state._fsp--;

                    adaptor.addChild(root_0, not_equal63.getTree());

                    }
                    break;
                case 2 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:136:16: LT
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    LT64=(Token)match(input,LT,FOLLOW_LT_in_binary_operator825); 
                    LT64_tree = (ProvaAST)adaptor.create(LT64);
                    adaptor.addChild(root_0, LT64_tree);


                    }
                    break;
                case 3 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:136:21: GT
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    GT65=(Token)match(input,GT,FOLLOW_GT_in_binary_operator829); 
                    GT65_tree = (ProvaAST)adaptor.create(GT65);
                    adaptor.addChild(root_0, GT65_tree);


                    }
                    break;
                case 4 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:136:26: LE
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    LE66=(Token)match(input,LE,FOLLOW_LE_in_binary_operator833); 
                    LE66_tree = (ProvaAST)adaptor.create(LE66);
                    adaptor.addChild(root_0, LE66_tree);


                    }
                    break;
                case 5 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:136:31: GE
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    GE67=(Token)match(input,GE,FOLLOW_GE_in_binary_operator837); 
                    GE67_tree = (ProvaAST)adaptor.create(GE67);
                    adaptor.addChild(root_0, GE67_tree);


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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:139:1: relation : predicate '(' list_body ')' -> ^( PREDICATE predicate list_body ) ;
    public final Prova2Parser.relation_return relation() throws RecognitionException {
        Prova2Parser.relation_return retval = new Prova2Parser.relation_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token char_literal69=null;
        Token char_literal71=null;
        Prova2Parser.predicate_return predicate68 = null;

        Prova2Parser.list_body_return list_body70 = null;


        ProvaAST char_literal69_tree=null;
        ProvaAST char_literal71_tree=null;
        RewriteRuleTokenStream stream_OPEN=new RewriteRuleTokenStream(adaptor,"token OPEN");
        RewriteRuleTokenStream stream_CLOSE=new RewriteRuleTokenStream(adaptor,"token CLOSE");
        RewriteRuleSubtreeStream stream_predicate=new RewriteRuleSubtreeStream(adaptor,"rule predicate");
        RewriteRuleSubtreeStream stream_list_body=new RewriteRuleSubtreeStream(adaptor,"rule list_body");
        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:140:2: ( predicate '(' list_body ')' -> ^( PREDICATE predicate list_body ) )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:140:4: predicate '(' list_body ')'
            {
            pushFollow(FOLLOW_predicate_in_relation849);
            predicate68=predicate();

            state._fsp--;

            stream_predicate.add(predicate68.getTree());
            char_literal69=(Token)match(input,OPEN,FOLLOW_OPEN_in_relation851);  
            stream_OPEN.add(char_literal69);

            pushFollow(FOLLOW_list_body_in_relation853);
            list_body70=list_body();

            state._fsp--;

            stream_list_body.add(list_body70.getTree());
            char_literal71=(Token)match(input,CLOSE,FOLLOW_CLOSE_in_relation855);  
            stream_CLOSE.add(char_literal71);



            // AST REWRITE
            // elements: predicate, list_body
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ProvaAST)adaptor.nil();
            // 140:32: -> ^( PREDICATE predicate list_body )
            {
                // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:140:35: ^( PREDICATE predicate list_body )
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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:142:1: guard : '[' literals ']' -> ^( GUARD literals ) ;
    public final Prova2Parser.guard_return guard() throws RecognitionException {
        Prova2Parser.guard_return retval = new Prova2Parser.guard_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token char_literal72=null;
        Token char_literal74=null;
        Prova2Parser.literals_return literals73 = null;


        ProvaAST char_literal72_tree=null;
        ProvaAST char_literal74_tree=null;
        RewriteRuleTokenStream stream_BRA=new RewriteRuleTokenStream(adaptor,"token BRA");
        RewriteRuleTokenStream stream_KET=new RewriteRuleTokenStream(adaptor,"token KET");
        RewriteRuleSubtreeStream stream_literals=new RewriteRuleSubtreeStream(adaptor,"rule literals");
        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:143:2: ( '[' literals ']' -> ^( GUARD literals ) )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:143:4: '[' literals ']'
            {
            char_literal72=(Token)match(input,BRA,FOLLOW_BRA_in_guard874);  
            stream_BRA.add(char_literal72);

            pushFollow(FOLLOW_literals_in_guard876);
            literals73=literals();

            state._fsp--;

            stream_literals.add(literals73.getTree());
            char_literal74=(Token)match(input,KET,FOLLOW_KET_in_guard878);  
            stream_KET.add(char_literal74);



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
            // 143:21: -> ^( GUARD literals )
            {
                // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:143:24: ^( GUARD literals )
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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:146:1: list_body : ( terms ( '|' list_tail )? )? ( NEWLINE )* -> ^( LIST_BODY ( terms ( list_tail )? )? ) ;
    public final Prova2Parser.list_body_return list_body() throws RecognitionException {
        Prova2Parser.list_body_return retval = new Prova2Parser.list_body_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token char_literal76=null;
        Token NEWLINE78=null;
        Prova2Parser.terms_return terms75 = null;

        Prova2Parser.list_tail_return list_tail77 = null;


        ProvaAST char_literal76_tree=null;
        ProvaAST NEWLINE78_tree=null;
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_BAR=new RewriteRuleTokenStream(adaptor,"token BAR");
        RewriteRuleSubtreeStream stream_terms=new RewriteRuleSubtreeStream(adaptor,"rule terms");
        RewriteRuleSubtreeStream stream_list_tail=new RewriteRuleSubtreeStream(adaptor,"rule list_tail");
        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:147:3: ( ( terms ( '|' list_tail )? )? ( NEWLINE )* -> ^( LIST_BODY ( terms ( list_tail )? )? ) )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:147:5: ( terms ( '|' list_tail )? )? ( NEWLINE )*
            {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:147:5: ( terms ( '|' list_tail )? )?
            int alt32=2;
            alt32 = dfa32.predict(input);
            switch (alt32) {
                case 1 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:147:6: terms ( '|' list_tail )?
                    {
                    pushFollow(FOLLOW_terms_in_list_body899);
                    terms75=terms();

                    state._fsp--;

                    stream_terms.add(terms75.getTree());
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:147:12: ( '|' list_tail )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==BAR) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:147:13: '|' list_tail
                            {
                            char_literal76=(Token)match(input,BAR,FOLLOW_BAR_in_list_body902);  
                            stream_BAR.add(char_literal76);

                            pushFollow(FOLLOW_list_tail_in_list_body904);
                            list_tail77=list_tail();

                            state._fsp--;

                            stream_list_tail.add(list_tail77.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }

            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:147:31: ( NEWLINE )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==NEWLINE) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:147:31: NEWLINE
            	    {
            	    NEWLINE78=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_list_body910);  
            	    stream_NEWLINE.add(NEWLINE78);


            	    }
            	    break;

            	default :
            	    break loop33;
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
            // 147:40: -> ^( LIST_BODY ( terms ( list_tail )? )? )
            {
                // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:147:43: ^( LIST_BODY ( terms ( list_tail )? )? )
                {
                ProvaAST root_1 = (ProvaAST)adaptor.nil();
                root_1 = (ProvaAST)adaptor.becomeRoot((ProvaAST)adaptor.create(LIST_BODY, "LIST_BODY"), root_1);

                // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:147:55: ( terms ( list_tail )? )?
                if ( stream_list_tail.hasNext()||stream_terms.hasNext() ) {
                    adaptor.addChild(root_1, stream_terms.nextTree());
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:147:62: ( list_tail )?
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

    public static class list_body0_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "list_body0"
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:149:1: list_body0 : terms0 ( '|' list_tail )? -> ^( LIST_BODY terms0 ( list_tail )? ) ;
    public final Prova2Parser.list_body0_return list_body0() throws RecognitionException {
        Prova2Parser.list_body0_return retval = new Prova2Parser.list_body0_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token char_literal80=null;
        Prova2Parser.terms0_return terms079 = null;

        Prova2Parser.list_tail_return list_tail81 = null;


        ProvaAST char_literal80_tree=null;
        RewriteRuleTokenStream stream_BAR=new RewriteRuleTokenStream(adaptor,"token BAR");
        RewriteRuleSubtreeStream stream_terms0=new RewriteRuleSubtreeStream(adaptor,"rule terms0");
        RewriteRuleSubtreeStream stream_list_tail=new RewriteRuleSubtreeStream(adaptor,"rule list_tail");
        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:150:3: ( terms0 ( '|' list_tail )? -> ^( LIST_BODY terms0 ( list_tail )? ) )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:150:5: terms0 ( '|' list_tail )?
            {
            pushFollow(FOLLOW_terms0_in_list_body0935);
            terms079=terms0();

            state._fsp--;

            stream_terms0.add(terms079.getTree());
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:150:12: ( '|' list_tail )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==BAR) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:150:13: '|' list_tail
                    {
                    char_literal80=(Token)match(input,BAR,FOLLOW_BAR_in_list_body0938);  
                    stream_BAR.add(char_literal80);

                    pushFollow(FOLLOW_list_tail_in_list_body0940);
                    list_tail81=list_tail();

                    state._fsp--;

                    stream_list_tail.add(list_tail81.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: terms0, list_tail
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ProvaAST)adaptor.nil();
            // 150:29: -> ^( LIST_BODY terms0 ( list_tail )? )
            {
                // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:150:32: ^( LIST_BODY terms0 ( list_tail )? )
                {
                ProvaAST root_1 = (ProvaAST)adaptor.nil();
                root_1 = (ProvaAST)adaptor.becomeRoot((ProvaAST)adaptor.create(LIST_BODY, "LIST_BODY"), root_1);

                adaptor.addChild(root_1, stream_terms0.nextTree());
                // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:150:51: ( list_tail )?
                if ( stream_list_tail.hasNext() ) {
                    adaptor.addChild(root_1, stream_list_tail.nextTree());

                }
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
    // $ANTLR end "list_body0"

    public static class list_tail_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "list_tail"
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:152:1: list_tail : ( variable | prova_list );
    public final Prova2Parser.list_tail_return list_tail() throws RecognitionException {
        Prova2Parser.list_tail_return retval = new Prova2Parser.list_tail_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Prova2Parser.variable_return variable82 = null;

        Prova2Parser.prova_list_return prova_list83 = null;



        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:153:2: ( variable | prova_list )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==USWORD||LA35_0==DOLLARWORD||(LA35_0>=LCWORD && LA35_0<=UCWORD)) ) {
                alt35=1;
            }
            else if ( (LA35_0==BRA) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:153:4: variable
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_variable_in_list_tail963);
                    variable82=variable();

                    state._fsp--;

                    adaptor.addChild(root_0, variable82.getTree());

                    }
                    break;
                case 2 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:153:15: prova_list
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_prova_list_in_list_tail967);
                    prova_list83=prova_list();

                    state._fsp--;

                    adaptor.addChild(root_0, prova_list83.getTree());

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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:155:1: left_term : ( constant | variable | number | prova_list );
    public final Prova2Parser.left_term_return left_term() throws RecognitionException {
        Prova2Parser.left_term_return retval = new Prova2Parser.left_term_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Prova2Parser.constant_return constant84 = null;

        Prova2Parser.variable_return variable85 = null;

        Prova2Parser.number_return number86 = null;

        Prova2Parser.prova_list_return prova_list87 = null;



        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:156:2: ( constant | variable | number | prova_list )
            int alt36=4;
            alt36 = dfa36.predict(input);
            switch (alt36) {
                case 1 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:156:4: constant
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_constant_in_left_term977);
                    constant84=constant();

                    state._fsp--;

                    adaptor.addChild(root_0, constant84.getTree());

                    }
                    break;
                case 2 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:157:3: variable
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_variable_in_left_term984);
                    variable85=variable();

                    state._fsp--;

                    adaptor.addChild(root_0, variable85.getTree());

                    }
                    break;
                case 3 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:158:3: number
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_number_in_left_term990);
                    number86=number();

                    state._fsp--;

                    adaptor.addChild(root_0, number86.getTree());

                    }
                    break;
                case 4 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:159:3: prova_list
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_prova_list_in_left_term996);
                    prova_list87=prova_list();

                    state._fsp--;

                    adaptor.addChild(root_0, prova_list87.getTree());

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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:161:1: right_term : ( ( ( MINUS )? ( constant | variable ) ) | number | prova_list | prova_map );
    public final Prova2Parser.right_term_return right_term() throws RecognitionException {
        Prova2Parser.right_term_return retval = new Prova2Parser.right_term_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token MINUS88=null;
        Prova2Parser.constant_return constant89 = null;

        Prova2Parser.variable_return variable90 = null;

        Prova2Parser.number_return number91 = null;

        Prova2Parser.prova_list_return prova_list92 = null;

        Prova2Parser.prova_map_return prova_map93 = null;


        ProvaAST MINUS88_tree=null;

        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:162:2: ( ( ( MINUS )? ( constant | variable ) ) | number | prova_list | prova_map )
            int alt39=4;
            switch ( input.LA(1) ) {
            case MINUS:
                {
                int LA39_1 = input.LA(2);

                if ( ((LA39_1>=INT_LITERAL && LA39_1<=LONG_LITERAL)) ) {
                    alt39=2;
                }
                else if ( (LA39_1==USWORD||LA39_1==DOLLARWORD||(LA39_1>=LCWORD && LA39_1<=UCWORD)||(LA39_1>=STRING1 && LA39_1<=STRING2)) ) {
                    alt39=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 1, input);

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
                alt39=1;
                }
                break;
            case INT_LITERAL:
            case LONG_LITERAL:
                {
                alt39=2;
                }
                break;
            case BRA:
                {
                alt39=3;
                }
                break;
            case 73:
                {
                alt39=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:162:4: ( ( MINUS )? ( constant | variable ) )
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:162:4: ( ( MINUS )? ( constant | variable ) )
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:162:5: ( MINUS )? ( constant | variable )
                    {
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:162:5: ( MINUS )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==MINUS) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:162:5: MINUS
                            {
                            MINUS88=(Token)match(input,MINUS,FOLLOW_MINUS_in_right_term1007); 
                            MINUS88_tree = (ProvaAST)adaptor.create(MINUS88);
                            adaptor.addChild(root_0, MINUS88_tree);


                            }
                            break;

                    }

                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:162:12: ( constant | variable )
                    int alt38=2;
                    alt38 = dfa38.predict(input);
                    switch (alt38) {
                        case 1 :
                            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:162:13: constant
                            {
                            pushFollow(FOLLOW_constant_in_right_term1011);
                            constant89=constant();

                            state._fsp--;

                            adaptor.addChild(root_0, constant89.getTree());

                            }
                            break;
                        case 2 :
                            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:162:24: variable
                            {
                            pushFollow(FOLLOW_variable_in_right_term1015);
                            variable90=variable();

                            state._fsp--;

                            adaptor.addChild(root_0, variable90.getTree());

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:162:37: number
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_number_in_right_term1021);
                    number91=number();

                    state._fsp--;

                    adaptor.addChild(root_0, number91.getTree());

                    }
                    break;
                case 3 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:162:46: prova_list
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_prova_list_in_right_term1025);
                    prova_list92=prova_list();

                    state._fsp--;

                    adaptor.addChild(root_0, prova_list92.getTree());

                    }
                    break;
                case 4 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:162:59: prova_map
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_prova_map_in_right_term1029);
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
    // $ANTLR end "right_term"

    public static class prova_map_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prova_map"
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:164:1: prova_map : '{' ( key_value )? ( ',' key_value )* '}' -> ^( PROVA_MAP ( key_value )* ) ;
    public final Prova2Parser.prova_map_return prova_map() throws RecognitionException {
        Prova2Parser.prova_map_return retval = new Prova2Parser.prova_map_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token char_literal94=null;
        Token char_literal96=null;
        Token char_literal98=null;
        Prova2Parser.key_value_return key_value95 = null;

        Prova2Parser.key_value_return key_value97 = null;


        ProvaAST char_literal94_tree=null;
        ProvaAST char_literal96_tree=null;
        ProvaAST char_literal98_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleSubtreeStream stream_key_value=new RewriteRuleSubtreeStream(adaptor,"rule key_value");
        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:165:2: ( '{' ( key_value )? ( ',' key_value )* '}' -> ^( PROVA_MAP ( key_value )* ) )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:165:4: '{' ( key_value )? ( ',' key_value )* '}'
            {
            char_literal94=(Token)match(input,73,FOLLOW_73_in_prova_map1039);  
            stream_73.add(char_literal94);

            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:165:8: ( key_value )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==LCWORD||(LA40_0>=STRING1 && LA40_0<=STRING2)) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:165:8: key_value
                    {
                    pushFollow(FOLLOW_key_value_in_prova_map1041);
                    key_value95=key_value();

                    state._fsp--;

                    stream_key_value.add(key_value95.getTree());

                    }
                    break;

            }

            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:165:19: ( ',' key_value )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==COMMA) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:165:20: ',' key_value
            	    {
            	    char_literal96=(Token)match(input,COMMA,FOLLOW_COMMA_in_prova_map1045);  
            	    stream_COMMA.add(char_literal96);

            	    pushFollow(FOLLOW_key_value_in_prova_map1047);
            	    key_value97=key_value();

            	    state._fsp--;

            	    stream_key_value.add(key_value97.getTree());

            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            char_literal98=(Token)match(input,74,FOLLOW_74_in_prova_map1051);  
            stream_74.add(char_literal98);



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
            // 165:40: -> ^( PROVA_MAP ( key_value )* )
            {
                // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:165:43: ^( PROVA_MAP ( key_value )* )
                {
                ProvaAST root_1 = (ProvaAST)adaptor.nil();
                root_1 = (ProvaAST)adaptor.becomeRoot((ProvaAST)adaptor.create(PROVA_MAP, "PROVA_MAP"), root_1);

                // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:165:55: ( key_value )*
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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:168:1: key_value : mstring ( '->' | ':' ) term -> ^( KEY_VALUE mstring term ) ;
    public final Prova2Parser.key_value_return key_value() throws RecognitionException {
        Prova2Parser.key_value_return retval = new Prova2Parser.key_value_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token string_literal100=null;
        Token char_literal101=null;
        Prova2Parser.mstring_return mstring99 = null;

        Prova2Parser.term_return term102 = null;


        ProvaAST string_literal100_tree=null;
        ProvaAST char_literal101_tree=null;
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleSubtreeStream stream_term=new RewriteRuleSubtreeStream(adaptor,"rule term");
        RewriteRuleSubtreeStream stream_mstring=new RewriteRuleSubtreeStream(adaptor,"rule mstring");
        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:169:2: ( mstring ( '->' | ':' ) term -> ^( KEY_VALUE mstring term ) )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:169:4: mstring ( '->' | ':' ) term
            {
            pushFollow(FOLLOW_mstring_in_key_value1071);
            mstring99=mstring();

            state._fsp--;

            stream_mstring.add(mstring99.getTree());
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:169:12: ( '->' | ':' )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==75) ) {
                alt42=1;
            }
            else if ( (LA42_0==71) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:169:13: '->'
                    {
                    string_literal100=(Token)match(input,75,FOLLOW_75_in_key_value1074);  
                    stream_75.add(string_literal100);


                    }
                    break;
                case 2 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:169:18: ':'
                    {
                    char_literal101=(Token)match(input,71,FOLLOW_71_in_key_value1076);  
                    stream_71.add(char_literal101);


                    }
                    break;

            }

            pushFollow(FOLLOW_term_in_key_value1079);
            term102=term();

            state._fsp--;

            stream_term.add(term102.getTree());


            // AST REWRITE
            // elements: term, mstring
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ProvaAST)adaptor.nil();
            // 169:28: -> ^( KEY_VALUE mstring term )
            {
                // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:169:31: ^( KEY_VALUE mstring term )
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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:172:1: terms : ( NEWLINE )* term ( ( NEWLINE )* ',' ( NEWLINE )* term )* -> ^( TERM ( term )+ ) ;
    public final Prova2Parser.terms_return terms() throws RecognitionException {
        Prova2Parser.terms_return retval = new Prova2Parser.terms_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token NEWLINE103=null;
        Token NEWLINE105=null;
        Token char_literal106=null;
        Token NEWLINE107=null;
        Prova2Parser.term_return term104 = null;

        Prova2Parser.term_return term108 = null;


        ProvaAST NEWLINE103_tree=null;
        ProvaAST NEWLINE105_tree=null;
        ProvaAST char_literal106_tree=null;
        ProvaAST NEWLINE107_tree=null;
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_term=new RewriteRuleSubtreeStream(adaptor,"rule term");
        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:172:8: ( ( NEWLINE )* term ( ( NEWLINE )* ',' ( NEWLINE )* term )* -> ^( TERM ( term )+ ) )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:172:10: ( NEWLINE )* term ( ( NEWLINE )* ',' ( NEWLINE )* term )*
            {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:172:10: ( NEWLINE )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==NEWLINE) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:172:10: NEWLINE
            	    {
            	    NEWLINE103=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_terms1102);  
            	    stream_NEWLINE.add(NEWLINE103);


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            pushFollow(FOLLOW_term_in_terms1105);
            term104=term();

            state._fsp--;

            stream_term.add(term104.getTree());
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:172:24: ( ( NEWLINE )* ',' ( NEWLINE )* term )*
            loop46:
            do {
                int alt46=2;
                alt46 = dfa46.predict(input);
                switch (alt46) {
            	case 1 :
            	    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:172:25: ( NEWLINE )* ',' ( NEWLINE )* term
            	    {
            	    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:172:25: ( NEWLINE )*
            	    loop44:
            	    do {
            	        int alt44=2;
            	        int LA44_0 = input.LA(1);

            	        if ( (LA44_0==NEWLINE) ) {
            	            alt44=1;
            	        }


            	        switch (alt44) {
            	    	case 1 :
            	    	    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:172:25: NEWLINE
            	    	    {
            	    	    NEWLINE105=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_terms1108);  
            	    	    stream_NEWLINE.add(NEWLINE105);


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop44;
            	        }
            	    } while (true);

            	    char_literal106=(Token)match(input,COMMA,FOLLOW_COMMA_in_terms1111);  
            	    stream_COMMA.add(char_literal106);

            	    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:172:38: ( NEWLINE )*
            	    loop45:
            	    do {
            	        int alt45=2;
            	        int LA45_0 = input.LA(1);

            	        if ( (LA45_0==NEWLINE) ) {
            	            alt45=1;
            	        }


            	        switch (alt45) {
            	    	case 1 :
            	    	    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:172:38: NEWLINE
            	    	    {
            	    	    NEWLINE107=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_terms1113);  
            	    	    stream_NEWLINE.add(NEWLINE107);


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop45;
            	        }
            	    } while (true);

            	    pushFollow(FOLLOW_term_in_terms1116);
            	    term108=term();

            	    state._fsp--;

            	    stream_term.add(term108.getTree());

            	    }
            	    break;

            	default :
            	    break loop46;
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
            // 172:54: -> ^( TERM ( term )+ )
            {
                // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:172:57: ^( TERM ( term )+ )
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

    public static class terms0_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "terms0"
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:174:1: terms0 : ( term )+ -> ^( TERM ( term )+ ) ;
    public final Prova2Parser.terms0_return terms0() throws RecognitionException {
        Prova2Parser.terms0_return retval = new Prova2Parser.terms0_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Prova2Parser.term_return term109 = null;


        RewriteRuleSubtreeStream stream_term=new RewriteRuleSubtreeStream(adaptor,"rule term");
        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:174:9: ( ( term )+ -> ^( TERM ( term )+ ) )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:174:11: ( term )+
            {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:174:11: ( term )+
            int cnt47=0;
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==MINUS||LA47_0==BRA||LA47_0==USWORD||LA47_0==DOLLARWORD||(LA47_0>=LCWORD && LA47_0<=STRING2)||LA47_0==73) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:174:11: term
            	    {
            	    pushFollow(FOLLOW_term_in_terms01136);
            	    term109=term();

            	    state._fsp--;

            	    stream_term.add(term109.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt47 >= 1 ) break loop47;
                        EarlyExitException eee =
                            new EarlyExitException(47, input);
                        throw eee;
                }
                cnt47++;
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
            // 174:17: -> ^( TERM ( term )+ )
            {
                // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:174:20: ^( TERM ( term )+ )
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
    // $ANTLR end "terms0"

    public static class term_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "term"
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:176:1: term : ( left_term | func_term | prova_map );
    public final Prova2Parser.term_return term() throws RecognitionException {
        Prova2Parser.term_return retval = new Prova2Parser.term_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Prova2Parser.left_term_return left_term110 = null;

        Prova2Parser.func_term_return func_term111 = null;

        Prova2Parser.prova_map_return prova_map112 = null;



        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:176:6: ( left_term | func_term | prova_map )
            int alt48=3;
            alt48 = dfa48.predict(input);
            switch (alt48) {
                case 1 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:176:8: left_term
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_left_term_in_term1154);
                    left_term110=left_term();

                    state._fsp--;

                    adaptor.addChild(root_0, left_term110.getTree());

                    }
                    break;
                case 2 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:176:20: func_term
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_func_term_in_term1158);
                    func_term111=func_term();

                    state._fsp--;

                    adaptor.addChild(root_0, func_term111.getTree());

                    }
                    break;
                case 3 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:176:32: prova_map
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_prova_map_in_term1162);
                    prova_map112=prova_map();

                    state._fsp--;

                    adaptor.addChild(root_0, prova_map112.getTree());

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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:178:1: func_term : func args ;
    public final Prova2Parser.func_term_return func_term() throws RecognitionException {
        Prova2Parser.func_term_return retval = new Prova2Parser.func_term_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Prova2Parser.func_return func113 = null;

        Prova2Parser.args_return args114 = null;



        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:179:2: ( func args )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:179:4: func args
            {
            root_0 = (ProvaAST)adaptor.nil();

            pushFollow(FOLLOW_func_in_func_term1171);
            func113=func();

            state._fsp--;

            adaptor.addChild(root_0, func113.getTree());
            pushFollow(FOLLOW_args_in_func_term1173);
            args114=args();

            state._fsp--;

            adaptor.addChild(root_0, args114.getTree());

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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:181:1: qualified_java_class : ( ( LCWORD DOT )+ UCWORD ) -> ^( QUALIFIED_JAVA_CLASS ( LCWORD DOT )+ UCWORD ) ;
    public final Prova2Parser.qualified_java_class_return qualified_java_class() throws RecognitionException {
        Prova2Parser.qualified_java_class_return retval = new Prova2Parser.qualified_java_class_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token LCWORD115=null;
        Token DOT116=null;
        Token UCWORD117=null;

        ProvaAST LCWORD115_tree=null;
        ProvaAST DOT116_tree=null;
        ProvaAST UCWORD117_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_UCWORD=new RewriteRuleTokenStream(adaptor,"token UCWORD");
        RewriteRuleTokenStream stream_LCWORD=new RewriteRuleTokenStream(adaptor,"token LCWORD");

        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:182:2: ( ( ( LCWORD DOT )+ UCWORD ) -> ^( QUALIFIED_JAVA_CLASS ( LCWORD DOT )+ UCWORD ) )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:182:4: ( ( LCWORD DOT )+ UCWORD )
            {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:182:4: ( ( LCWORD DOT )+ UCWORD )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:182:5: ( LCWORD DOT )+ UCWORD
            {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:182:5: ( LCWORD DOT )+
            int cnt49=0;
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==LCWORD) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:182:6: LCWORD DOT
            	    {
            	    LCWORD115=(Token)match(input,LCWORD,FOLLOW_LCWORD_in_qualified_java_class1186);  
            	    stream_LCWORD.add(LCWORD115);

            	    DOT116=(Token)match(input,DOT,FOLLOW_DOT_in_qualified_java_class1188);  
            	    stream_DOT.add(DOT116);


            	    }
            	    break;

            	default :
            	    if ( cnt49 >= 1 ) break loop49;
                        EarlyExitException eee =
                            new EarlyExitException(49, input);
                        throw eee;
                }
                cnt49++;
            } while (true);

            UCWORD117=(Token)match(input,UCWORD,FOLLOW_UCWORD_in_qualified_java_class1192);  
            stream_UCWORD.add(UCWORD117);


            }



            // AST REWRITE
            // elements: LCWORD, UCWORD, DOT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ProvaAST)adaptor.nil();
            // 182:27: -> ^( QUALIFIED_JAVA_CLASS ( LCWORD DOT )+ UCWORD )
            {
                // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:182:30: ^( QUALIFIED_JAVA_CLASS ( LCWORD DOT )+ UCWORD )
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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:185:1: prova_list : '[' list_body ']' -> ^( PROVA_LIST list_body ) ;
    public final Prova2Parser.prova_list_return prova_list() throws RecognitionException {
        Prova2Parser.prova_list_return retval = new Prova2Parser.prova_list_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token char_literal118=null;
        Token char_literal120=null;
        Prova2Parser.list_body_return list_body119 = null;


        ProvaAST char_literal118_tree=null;
        ProvaAST char_literal120_tree=null;
        RewriteRuleTokenStream stream_BRA=new RewriteRuleTokenStream(adaptor,"token BRA");
        RewriteRuleTokenStream stream_KET=new RewriteRuleTokenStream(adaptor,"token KET");
        RewriteRuleSubtreeStream stream_list_body=new RewriteRuleSubtreeStream(adaptor,"rule list_body");
        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:186:2: ( '[' list_body ']' -> ^( PROVA_LIST list_body ) )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:186:4: '[' list_body ']'
            {
            char_literal118=(Token)match(input,BRA,FOLLOW_BRA_in_prova_list1220);  
            stream_BRA.add(char_literal118);

            pushFollow(FOLLOW_list_body_in_prova_list1222);
            list_body119=list_body();

            state._fsp--;

            stream_list_body.add(list_body119.getTree());
            char_literal120=(Token)match(input,KET,FOLLOW_KET_in_prova_list1224);  
            stream_KET.add(char_literal120);



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
            // 186:22: -> ^( PROVA_LIST list_body )
            {
                // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:186:25: ^( PROVA_LIST list_body )
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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:188:1: args : '(' list_body ')' -> ^( ARGS list_body ) ;
    public final Prova2Parser.args_return args() throws RecognitionException {
        Prova2Parser.args_return retval = new Prova2Parser.args_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token char_literal121=null;
        Token char_literal123=null;
        Prova2Parser.list_body_return list_body122 = null;


        ProvaAST char_literal121_tree=null;
        ProvaAST char_literal123_tree=null;
        RewriteRuleTokenStream stream_OPEN=new RewriteRuleTokenStream(adaptor,"token OPEN");
        RewriteRuleTokenStream stream_CLOSE=new RewriteRuleTokenStream(adaptor,"token CLOSE");
        RewriteRuleSubtreeStream stream_list_body=new RewriteRuleSubtreeStream(adaptor,"rule list_body");
        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:188:7: ( '(' list_body ')' -> ^( ARGS list_body ) )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:188:9: '(' list_body ')'
            {
            char_literal121=(Token)match(input,OPEN,FOLLOW_OPEN_in_args1241);  
            stream_OPEN.add(char_literal121);

            pushFollow(FOLLOW_list_body_in_args1243);
            list_body122=list_body();

            state._fsp--;

            stream_list_body.add(list_body122.getTree());
            char_literal123=(Token)match(input,CLOSE,FOLLOW_CLOSE_in_args1245);  
            stream_CLOSE.add(char_literal123);



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
            // 188:27: -> ^( ARGS list_body )
            {
                // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:188:30: ^( ARGS list_body )
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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:190:1: semantic_attachment : ( predicate_java_call | binary_operation );
    public final Prova2Parser.semantic_attachment_return semantic_attachment() throws RecognitionException {
        Prova2Parser.semantic_attachment_return retval = new Prova2Parser.semantic_attachment_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Prova2Parser.predicate_java_call_return predicate_java_call124 = null;

        Prova2Parser.binary_operation_return binary_operation125 = null;



        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:191:2: ( predicate_java_call | binary_operation )
            int alt50=2;
            alt50 = dfa50.predict(input);
            switch (alt50) {
                case 1 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:191:4: predicate_java_call
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_predicate_java_call_in_semantic_attachment1263);
                    predicate_java_call124=predicate_java_call();

                    state._fsp--;

                    adaptor.addChild(root_0, predicate_java_call124.getTree());

                    }
                    break;
                case 2 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:191:26: binary_operation
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_binary_operation_in_semantic_attachment1267);
                    binary_operation125=binary_operation();

                    state._fsp--;

                    adaptor.addChild(root_0, binary_operation125.getTree());

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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:193:1: binary_operation : left_term ( EQUAL ( constructor_java_call | prova_list | constant | expr ) | not_equal constant | binary_operator expr ) ;
    public final Prova2Parser.binary_operation_return binary_operation() throws RecognitionException {
        Prova2Parser.binary_operation_return retval = new Prova2Parser.binary_operation_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token EQUAL127=null;
        Prova2Parser.left_term_return left_term126 = null;

        Prova2Parser.constructor_java_call_return constructor_java_call128 = null;

        Prova2Parser.prova_list_return prova_list129 = null;

        Prova2Parser.constant_return constant130 = null;

        Prova2Parser.expr_return expr131 = null;

        Prova2Parser.not_equal_return not_equal132 = null;

        Prova2Parser.constant_return constant133 = null;

        Prova2Parser.binary_operator_return binary_operator134 = null;

        Prova2Parser.expr_return expr135 = null;


        ProvaAST EQUAL127_tree=null;

        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:194:2: ( left_term ( EQUAL ( constructor_java_call | prova_list | constant | expr ) | not_equal constant | binary_operator expr ) )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:194:4: left_term ( EQUAL ( constructor_java_call | prova_list | constant | expr ) | not_equal constant | binary_operator expr )
            {
            root_0 = (ProvaAST)adaptor.nil();

            pushFollow(FOLLOW_left_term_in_binary_operation1276);
            left_term126=left_term();

            state._fsp--;

            adaptor.addChild(root_0, left_term126.getTree());
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:195:3: ( EQUAL ( constructor_java_call | prova_list | constant | expr ) | not_equal constant | binary_operator expr )
            int alt52=3;
            alt52 = dfa52.predict(input);
            switch (alt52) {
                case 1 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:195:5: EQUAL ( constructor_java_call | prova_list | constant | expr )
                    {
                    EQUAL127=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_binary_operation1282); 
                    EQUAL127_tree = (ProvaAST)adaptor.create(EQUAL127);
                    adaptor.addChild(root_0, EQUAL127_tree);

                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:196:4: ( constructor_java_call | prova_list | constant | expr )
                    int alt51=4;
                    alt51 = dfa51.predict(input);
                    switch (alt51) {
                        case 1 :
                            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:197:4: constructor_java_call
                            {
                            pushFollow(FOLLOW_constructor_java_call_in_binary_operation1292);
                            constructor_java_call128=constructor_java_call();

                            state._fsp--;

                            adaptor.addChild(root_0, constructor_java_call128.getTree());

                            }
                            break;
                        case 2 :
                            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:198:6: prova_list
                            {
                            pushFollow(FOLLOW_prova_list_in_binary_operation1299);
                            prova_list129=prova_list();

                            state._fsp--;

                            adaptor.addChild(root_0, prova_list129.getTree());

                            }
                            break;
                        case 3 :
                            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:199:6: constant
                            {
                            pushFollow(FOLLOW_constant_in_binary_operation1306);
                            constant130=constant();

                            state._fsp--;

                            adaptor.addChild(root_0, constant130.getTree());

                            }
                            break;
                        case 4 :
                            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:200:6: expr
                            {
                            pushFollow(FOLLOW_expr_in_binary_operation1313);
                            expr131=expr();

                            state._fsp--;

                            adaptor.addChild(root_0, expr131.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:202:5: not_equal constant
                    {
                    pushFollow(FOLLOW_not_equal_in_binary_operation1324);
                    not_equal132=not_equal();

                    state._fsp--;

                    adaptor.addChild(root_0, not_equal132.getTree());
                    pushFollow(FOLLOW_constant_in_binary_operation1326);
                    constant133=constant();

                    state._fsp--;

                    adaptor.addChild(root_0, constant133.getTree());

                    }
                    break;
                case 3 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:203:5: binary_operator expr
                    {
                    pushFollow(FOLLOW_binary_operator_in_binary_operation1332);
                    binary_operator134=binary_operator();

                    state._fsp--;

                    adaptor.addChild(root_0, binary_operator134.getTree());
                    pushFollow(FOLLOW_expr_in_binary_operation1334);
                    expr135=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr135.getTree());

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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:206:1: expr : aterm ( ( PLUS | MINUS ) expr )? ;
    public final Prova2Parser.expr_return expr() throws RecognitionException {
        Prova2Parser.expr_return retval = new Prova2Parser.expr_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token set137=null;
        Prova2Parser.aterm_return aterm136 = null;

        Prova2Parser.expr_return expr138 = null;


        ProvaAST set137_tree=null;

        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:206:6: ( aterm ( ( PLUS | MINUS ) expr )? )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:206:8: aterm ( ( PLUS | MINUS ) expr )?
            {
            root_0 = (ProvaAST)adaptor.nil();

            pushFollow(FOLLOW_aterm_in_expr1346);
            aterm136=aterm();

            state._fsp--;

            adaptor.addChild(root_0, aterm136.getTree());
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:206:14: ( ( PLUS | MINUS ) expr )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( ((LA53_0>=PLUS && LA53_0<=MINUS)) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:206:15: ( PLUS | MINUS ) expr
                    {
                    set137=(Token)input.LT(1);
                    if ( (input.LA(1)>=PLUS && input.LA(1)<=MINUS) ) {
                        input.consume();
                        adaptor.addChild(root_0, (ProvaAST)adaptor.create(set137));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_expr_in_expr1357);
                    expr138=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr138.getTree());

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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:208:1: aterm : ( ( MINUS )? variable | number | ( MINUS )? predicate_java_call | OPEN expr CLOSE ) ( ( MULT | DIV | REM ) aterm )? ;
    public final Prova2Parser.aterm_return aterm() throws RecognitionException {
        Prova2Parser.aterm_return retval = new Prova2Parser.aterm_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token MINUS139=null;
        Token MINUS142=null;
        Token OPEN144=null;
        Token CLOSE146=null;
        Token set147=null;
        Prova2Parser.variable_return variable140 = null;

        Prova2Parser.number_return number141 = null;

        Prova2Parser.predicate_java_call_return predicate_java_call143 = null;

        Prova2Parser.expr_return expr145 = null;

        Prova2Parser.aterm_return aterm148 = null;


        ProvaAST MINUS139_tree=null;
        ProvaAST MINUS142_tree=null;
        ProvaAST OPEN144_tree=null;
        ProvaAST CLOSE146_tree=null;
        ProvaAST set147_tree=null;

        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:208:7: ( ( ( MINUS )? variable | number | ( MINUS )? predicate_java_call | OPEN expr CLOSE ) ( ( MULT | DIV | REM ) aterm )? )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:208:9: ( ( MINUS )? variable | number | ( MINUS )? predicate_java_call | OPEN expr CLOSE ) ( ( MULT | DIV | REM ) aterm )?
            {
            root_0 = (ProvaAST)adaptor.nil();

            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:208:9: ( ( MINUS )? variable | number | ( MINUS )? predicate_java_call | OPEN expr CLOSE )
            int alt56=4;
            alt56 = dfa56.predict(input);
            switch (alt56) {
                case 1 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:208:10: ( MINUS )? variable
                    {
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:208:10: ( MINUS )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==MINUS) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:208:10: MINUS
                            {
                            MINUS139=(Token)match(input,MINUS,FOLLOW_MINUS_in_aterm1369); 
                            MINUS139_tree = (ProvaAST)adaptor.create(MINUS139);
                            adaptor.addChild(root_0, MINUS139_tree);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_variable_in_aterm1372);
                    variable140=variable();

                    state._fsp--;

                    adaptor.addChild(root_0, variable140.getTree());

                    }
                    break;
                case 2 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:208:28: number
                    {
                    pushFollow(FOLLOW_number_in_aterm1376);
                    number141=number();

                    state._fsp--;

                    adaptor.addChild(root_0, number141.getTree());

                    }
                    break;
                case 3 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:208:37: ( MINUS )? predicate_java_call
                    {
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:208:37: ( MINUS )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==MINUS) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:208:37: MINUS
                            {
                            MINUS142=(Token)match(input,MINUS,FOLLOW_MINUS_in_aterm1380); 
                            MINUS142_tree = (ProvaAST)adaptor.create(MINUS142);
                            adaptor.addChild(root_0, MINUS142_tree);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_predicate_java_call_in_aterm1383);
                    predicate_java_call143=predicate_java_call();

                    state._fsp--;

                    adaptor.addChild(root_0, predicate_java_call143.getTree());

                    }
                    break;
                case 4 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:208:66: OPEN expr CLOSE
                    {
                    OPEN144=(Token)match(input,OPEN,FOLLOW_OPEN_in_aterm1387); 
                    OPEN144_tree = (ProvaAST)adaptor.create(OPEN144);
                    adaptor.addChild(root_0, OPEN144_tree);

                    pushFollow(FOLLOW_expr_in_aterm1389);
                    expr145=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr145.getTree());
                    CLOSE146=(Token)match(input,CLOSE,FOLLOW_CLOSE_in_aterm1391); 
                    CLOSE146_tree = (ProvaAST)adaptor.create(CLOSE146);
                    adaptor.addChild(root_0, CLOSE146_tree);


                    }
                    break;

            }

            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:208:83: ( ( MULT | DIV | REM ) aterm )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( ((LA57_0>=MULT && LA57_0<=DIV)||LA57_0==REM) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:208:84: ( MULT | DIV | REM ) aterm
                    {
                    set147=(Token)input.LT(1);
                    if ( (input.LA(1)>=MULT && input.LA(1)<=DIV)||input.LA(1)==REM ) {
                        input.consume();
                        adaptor.addChild(root_0, (ProvaAST)adaptor.create(set147));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_aterm_in_aterm1409);
                    aterm148=aterm();

                    state._fsp--;

                    adaptor.addChild(root_0, aterm148.getTree());

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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:210:1: constructor_java_call : ( qualified_java_class | UCWORD ) args ;
    public final Prova2Parser.constructor_java_call_return constructor_java_call() throws RecognitionException {
        Prova2Parser.constructor_java_call_return retval = new Prova2Parser.constructor_java_call_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token UCWORD150=null;
        Prova2Parser.qualified_java_class_return qualified_java_class149 = null;

        Prova2Parser.args_return args151 = null;


        ProvaAST UCWORD150_tree=null;

        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:211:2: ( ( qualified_java_class | UCWORD ) args )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:211:4: ( qualified_java_class | UCWORD ) args
            {
            root_0 = (ProvaAST)adaptor.nil();

            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:211:4: ( qualified_java_class | UCWORD )
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
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:211:5: qualified_java_class
                    {
                    pushFollow(FOLLOW_qualified_java_class_in_constructor_java_call1421);
                    qualified_java_class149=qualified_java_class();

                    state._fsp--;

                    adaptor.addChild(root_0, qualified_java_class149.getTree());

                    }
                    break;
                case 2 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:211:28: UCWORD
                    {
                    UCWORD150=(Token)match(input,UCWORD,FOLLOW_UCWORD_in_constructor_java_call1425); 
                    UCWORD150_tree = (ProvaAST)adaptor.create(UCWORD150);
                    adaptor.addChild(root_0, UCWORD150_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_args_in_constructor_java_call1428);
            args151=args();

            state._fsp--;

            adaptor.addChild(root_0, args151.getTree());

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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:214:1: predicate_java_call : ( static_java_call | instance_java_call );
    public final Prova2Parser.predicate_java_call_return predicate_java_call() throws RecognitionException {
        Prova2Parser.predicate_java_call_return retval = new Prova2Parser.predicate_java_call_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Prova2Parser.static_java_call_return static_java_call152 = null;

        Prova2Parser.instance_java_call_return instance_java_call153 = null;



        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:215:2: ( static_java_call | instance_java_call )
            int alt59=2;
            alt59 = dfa59.predict(input);
            switch (alt59) {
                case 1 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:215:4: static_java_call
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_static_java_call_in_predicate_java_call1439);
                    static_java_call152=static_java_call();

                    state._fsp--;

                    adaptor.addChild(root_0, static_java_call152.getTree());

                    }
                    break;
                case 2 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:215:23: instance_java_call
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_instance_java_call_in_predicate_java_call1443);
                    instance_java_call153=instance_java_call();

                    state._fsp--;

                    adaptor.addChild(root_0, instance_java_call153.getTree());

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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:218:1: instance_java_call : instance_call args -> ^( INSTANCE_JAVA_CALL instance_call args ) ;
    public final Prova2Parser.instance_java_call_return instance_java_call() throws RecognitionException {
        Prova2Parser.instance_java_call_return retval = new Prova2Parser.instance_java_call_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Prova2Parser.instance_call_return instance_call154 = null;

        Prova2Parser.args_return args155 = null;


        RewriteRuleSubtreeStream stream_instance_call=new RewriteRuleSubtreeStream(adaptor,"rule instance_call");
        RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"rule args");
        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:219:2: ( instance_call args -> ^( INSTANCE_JAVA_CALL instance_call args ) )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:219:4: instance_call args
            {
            pushFollow(FOLLOW_instance_call_in_instance_java_call1454);
            instance_call154=instance_call();

            state._fsp--;

            stream_instance_call.add(instance_call154.getTree());
            pushFollow(FOLLOW_args_in_instance_java_call1456);
            args155=args();

            state._fsp--;

            stream_args.add(args155.getTree());


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
            // 219:23: -> ^( INSTANCE_JAVA_CALL instance_call args )
            {
                // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:219:26: ^( INSTANCE_JAVA_CALL instance_call args )
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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:222:1: static_java_call : static_call args -> ^( STATIC_JAVA_CALL static_call args ) ;
    public final Prova2Parser.static_java_call_return static_java_call() throws RecognitionException {
        Prova2Parser.static_java_call_return retval = new Prova2Parser.static_java_call_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Prova2Parser.static_call_return static_call156 = null;

        Prova2Parser.args_return args157 = null;


        RewriteRuleSubtreeStream stream_static_call=new RewriteRuleSubtreeStream(adaptor,"rule static_call");
        RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"rule args");
        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:223:2: ( static_call args -> ^( STATIC_JAVA_CALL static_call args ) )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:223:4: static_call args
            {
            pushFollow(FOLLOW_static_call_in_static_java_call1477);
            static_call156=static_call();

            state._fsp--;

            stream_static_call.add(static_call156.getTree());
            pushFollow(FOLLOW_args_in_static_java_call1479);
            args157=args();

            state._fsp--;

            stream_args.add(args157.getTree());


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
            // 223:21: -> ^( STATIC_JAVA_CALL static_call args )
            {
                // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:223:24: ^( STATIC_JAVA_CALL static_call args )
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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:226:1: method : LCWORD ;
    public final Prova2Parser.method_return method() throws RecognitionException {
        Prova2Parser.method_return retval = new Prova2Parser.method_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token LCWORD158=null;

        ProvaAST LCWORD158_tree=null;

        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:226:9: ( LCWORD )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:226:11: LCWORD
            {
            root_0 = (ProvaAST)adaptor.nil();

            LCWORD158=(Token)match(input,LCWORD,FOLLOW_LCWORD_in_method1500); 
            LCWORD158_tree = (ProvaAST)adaptor.create(LCWORD158);
            adaptor.addChild(root_0, LCWORD158_tree);


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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:228:1: func : ( LCWORD | UCWORD | string | typed_variable );
    public final Prova2Parser.func_return func() throws RecognitionException {
        Prova2Parser.func_return retval = new Prova2Parser.func_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token LCWORD159=null;
        Token UCWORD160=null;
        Prova2Parser.string_return string161 = null;

        Prova2Parser.typed_variable_return typed_variable162 = null;


        ProvaAST LCWORD159_tree=null;
        ProvaAST UCWORD160_tree=null;

        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:228:6: ( LCWORD | UCWORD | string | typed_variable )
            int alt60=4;
            switch ( input.LA(1) ) {
            case LCWORD:
                {
                int LA60_1 = input.LA(2);

                if ( (LA60_1==DOT) ) {
                    alt60=4;
                }
                else if ( (LA60_1==OPEN) ) {
                    alt60=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 60, 1, input);

                    throw nvae;
                }
                }
                break;
            case UCWORD:
                {
                int LA60_2 = input.LA(2);

                if ( (LA60_2==DOT) ) {
                    alt60=4;
                }
                else if ( (LA60_2==OPEN) ) {
                    alt60=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 60, 2, input);

                    throw nvae;
                }
                }
                break;
            case STRING1:
            case STRING2:
                {
                alt60=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:228:8: LCWORD
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    LCWORD159=(Token)match(input,LCWORD,FOLLOW_LCWORD_in_func1508); 
                    LCWORD159_tree = (ProvaAST)adaptor.create(LCWORD159);
                    adaptor.addChild(root_0, LCWORD159_tree);


                    }
                    break;
                case 2 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:228:17: UCWORD
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    UCWORD160=(Token)match(input,UCWORD,FOLLOW_UCWORD_in_func1512); 
                    UCWORD160_tree = (ProvaAST)adaptor.create(UCWORD160);
                    adaptor.addChild(root_0, UCWORD160_tree);


                    }
                    break;
                case 3 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:228:26: string
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_string_in_func1516);
                    string161=string();

                    state._fsp--;

                    adaptor.addChild(root_0, string161.getTree());

                    }
                    break;
                case 4 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:228:35: typed_variable
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_typed_variable_in_func1520);
                    typed_variable162=typed_variable();

                    state._fsp--;

                    adaptor.addChild(root_0, typed_variable162.getTree());

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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:230:1: predicate : ( LCWORD | UCWORD | string );
    public final Prova2Parser.predicate_return predicate() throws RecognitionException {
        Prova2Parser.predicate_return retval = new Prova2Parser.predicate_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token LCWORD163=null;
        Token UCWORD164=null;
        Prova2Parser.string_return string165 = null;


        ProvaAST LCWORD163_tree=null;
        ProvaAST UCWORD164_tree=null;

        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:231:2: ( LCWORD | UCWORD | string )
            int alt61=3;
            switch ( input.LA(1) ) {
            case LCWORD:
                {
                alt61=1;
                }
                break;
            case UCWORD:
                {
                alt61=2;
                }
                break;
            case STRING1:
            case STRING2:
                {
                alt61=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }

            switch (alt61) {
                case 1 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:231:4: LCWORD
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    LCWORD163=(Token)match(input,LCWORD,FOLLOW_LCWORD_in_predicate1530); 
                    LCWORD163_tree = (ProvaAST)adaptor.create(LCWORD163);
                    adaptor.addChild(root_0, LCWORD163_tree);


                    }
                    break;
                case 2 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:231:13: UCWORD
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    UCWORD164=(Token)match(input,UCWORD,FOLLOW_UCWORD_in_predicate1534); 
                    UCWORD164_tree = (ProvaAST)adaptor.create(UCWORD164);
                    adaptor.addChild(root_0, UCWORD164_tree);


                    }
                    break;
                case 3 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:231:22: string
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_string_in_predicate1538);
                    string165=string();

                    state._fsp--;

                    adaptor.addChild(root_0, string165.getTree());

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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:233:1: variable : ( UCWORD | USWORD | typed_variable | DOLLARWORD );
    public final Prova2Parser.variable_return variable() throws RecognitionException {
        Prova2Parser.variable_return retval = new Prova2Parser.variable_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token UCWORD166=null;
        Token USWORD167=null;
        Token DOLLARWORD169=null;
        Prova2Parser.typed_variable_return typed_variable168 = null;


        ProvaAST UCWORD166_tree=null;
        ProvaAST USWORD167_tree=null;
        ProvaAST DOLLARWORD169_tree=null;

        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:233:9: ( UCWORD | USWORD | typed_variable | DOLLARWORD )
            int alt62=4;
            switch ( input.LA(1) ) {
            case UCWORD:
                {
                int LA62_1 = input.LA(2);

                if ( (LA62_1==DOT) ) {
                    switch ( input.LA(3) ) {
                    case EOF:
                    case NEWLINE:
                        {
                        alt62=1;
                        }
                        break;
                    case LCWORD:
                        {
                        int LA62_7 = input.LA(4);

                        if ( (LA62_7==EOF||(LA62_7>=DOT && LA62_7<=COMMA)||(LA62_7>=CLOSE && LA62_7<=GE)||LA62_7==USWORD||(LA62_7>=REM && LA62_7<=DOLLARWORD)||(LA62_7>=NEWLINE && LA62_7<=STRING2)||LA62_7==71||(LA62_7>=73 && LA62_7<=74)) ) {
                            alt62=3;
                        }
                        else if ( (LA62_7==OPEN) ) {
                            alt62=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 62, 7, input);

                            throw nvae;
                        }
                        }
                        break;
                    case UCWORD:
                        {
                        alt62=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 62, 5, input);

                        throw nvae;
                    }

                }
                else if ( (LA62_1==EOF||(LA62_1>=PLUS && LA62_1<=COMMA)||(LA62_1>=CLOSE && LA62_1<=GE)||LA62_1==USWORD||(LA62_1>=REM && LA62_1<=DOLLARWORD)||(LA62_1>=NEWLINE && LA62_1<=STRING2)||LA62_1==71||(LA62_1>=73 && LA62_1<=74)) ) {
                    alt62=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 62, 1, input);

                    throw nvae;
                }
                }
                break;
            case USWORD:
                {
                alt62=2;
                }
                break;
            case LCWORD:
                {
                alt62=3;
                }
                break;
            case DOLLARWORD:
                {
                alt62=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }

            switch (alt62) {
                case 1 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:233:11: UCWORD
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    UCWORD166=(Token)match(input,UCWORD,FOLLOW_UCWORD_in_variable1545); 
                    UCWORD166_tree = (ProvaAST)adaptor.create(UCWORD166);
                    adaptor.addChild(root_0, UCWORD166_tree);


                    }
                    break;
                case 2 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:233:20: USWORD
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    USWORD167=(Token)match(input,USWORD,FOLLOW_USWORD_in_variable1549); 
                    USWORD167_tree = (ProvaAST)adaptor.create(USWORD167);
                    adaptor.addChild(root_0, USWORD167_tree);


                    }
                    break;
                case 3 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:233:29: typed_variable
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_typed_variable_in_variable1553);
                    typed_variable168=typed_variable();

                    state._fsp--;

                    adaptor.addChild(root_0, typed_variable168.getTree());

                    }
                    break;
                case 4 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:233:46: DOLLARWORD
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    DOLLARWORD169=(Token)match(input,DOLLARWORD,FOLLOW_DOLLARWORD_in_variable1557); 
                    DOLLARWORD169_tree = (ProvaAST)adaptor.create(DOLLARWORD169);
                    adaptor.addChild(root_0, DOLLARWORD169_tree);


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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:235:1: variable_or_number : ( variable | number );
    public final Prova2Parser.variable_or_number_return variable_or_number() throws RecognitionException {
        Prova2Parser.variable_or_number_return retval = new Prova2Parser.variable_or_number_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Prova2Parser.variable_return variable170 = null;

        Prova2Parser.number_return number171 = null;



        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:236:2: ( variable | number )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==USWORD||LA63_0==DOLLARWORD||(LA63_0>=LCWORD && LA63_0<=UCWORD)) ) {
                alt63=1;
            }
            else if ( (LA63_0==MINUS||(LA63_0>=INT_LITERAL && LA63_0<=LONG_LITERAL)) ) {
                alt63=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:236:4: variable
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_variable_in_variable_or_number1567);
                    variable170=variable();

                    state._fsp--;

                    adaptor.addChild(root_0, variable170.getTree());

                    }
                    break;
                case 2 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:236:15: number
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_number_in_variable_or_number1571);
                    number171=number();

                    state._fsp--;

                    adaptor.addChild(root_0, number171.getTree());

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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:238:1: word : ( LCWORD | UCWORD );
    public final Prova2Parser.word_return word() throws RecognitionException {
        Prova2Parser.word_return retval = new Prova2Parser.word_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token set172=null;

        ProvaAST set172_tree=null;

        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:238:6: ( LCWORD | UCWORD )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:
            {
            root_0 = (ProvaAST)adaptor.nil();

            set172=(Token)input.LT(1);
            if ( (input.LA(1)>=LCWORD && input.LA(1)<=UCWORD) ) {
                input.consume();
                adaptor.addChild(root_0, (ProvaAST)adaptor.create(set172));
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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:243:1: typed_variable : ( qualified_java_class DOT word -> ^( TYPED_VARIABLE qualified_java_class word ) | UCWORD DOT word -> ^( TYPED_VARIABLE UCWORD word ) );
    public final Prova2Parser.typed_variable_return typed_variable() throws RecognitionException {
        Prova2Parser.typed_variable_return retval = new Prova2Parser.typed_variable_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token DOT174=null;
        Token UCWORD176=null;
        Token DOT177=null;
        Prova2Parser.qualified_java_class_return qualified_java_class173 = null;

        Prova2Parser.word_return word175 = null;

        Prova2Parser.word_return word178 = null;


        ProvaAST DOT174_tree=null;
        ProvaAST UCWORD176_tree=null;
        ProvaAST DOT177_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_UCWORD=new RewriteRuleTokenStream(adaptor,"token UCWORD");
        RewriteRuleSubtreeStream stream_qualified_java_class=new RewriteRuleSubtreeStream(adaptor,"rule qualified_java_class");
        RewriteRuleSubtreeStream stream_word=new RewriteRuleSubtreeStream(adaptor,"rule word");
        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:244:2: ( qualified_java_class DOT word -> ^( TYPED_VARIABLE qualified_java_class word ) | UCWORD DOT word -> ^( TYPED_VARIABLE UCWORD word ) )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==LCWORD) ) {
                alt64=1;
            }
            else if ( (LA64_0==UCWORD) ) {
                alt64=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }
            switch (alt64) {
                case 1 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:245:3: qualified_java_class DOT word
                    {
                    pushFollow(FOLLOW_qualified_java_class_in_typed_variable1598);
                    qualified_java_class173=qualified_java_class();

                    state._fsp--;

                    stream_qualified_java_class.add(qualified_java_class173.getTree());
                    DOT174=(Token)match(input,DOT,FOLLOW_DOT_in_typed_variable1600);  
                    stream_DOT.add(DOT174);

                    pushFollow(FOLLOW_word_in_typed_variable1602);
                    word175=word();

                    state._fsp--;

                    stream_word.add(word175.getTree());


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
                    // 245:33: -> ^( TYPED_VARIABLE qualified_java_class word )
                    {
                        // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:245:36: ^( TYPED_VARIABLE qualified_java_class word )
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
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:246:5: UCWORD DOT word
                    {
                    UCWORD176=(Token)match(input,UCWORD,FOLLOW_UCWORD_in_typed_variable1618);  
                    stream_UCWORD.add(UCWORD176);

                    DOT177=(Token)match(input,DOT,FOLLOW_DOT_in_typed_variable1620);  
                    stream_DOT.add(DOT177);

                    pushFollow(FOLLOW_word_in_typed_variable1622);
                    word178=word();

                    state._fsp--;

                    stream_word.add(word178.getTree());


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
                    // 246:21: -> ^( TYPED_VARIABLE UCWORD word )
                    {
                        // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:246:24: ^( TYPED_VARIABLE UCWORD word )
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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:251:1: instance_call : variable DOT LCWORD -> variable LCWORD ;
    public final Prova2Parser.instance_call_return instance_call() throws RecognitionException {
        Prova2Parser.instance_call_return retval = new Prova2Parser.instance_call_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token DOT180=null;
        Token LCWORD181=null;
        Prova2Parser.variable_return variable179 = null;


        ProvaAST DOT180_tree=null;
        ProvaAST LCWORD181_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_LCWORD=new RewriteRuleTokenStream(adaptor,"token LCWORD");
        RewriteRuleSubtreeStream stream_variable=new RewriteRuleSubtreeStream(adaptor,"rule variable");
        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:252:2: ( variable DOT LCWORD -> variable LCWORD )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:252:4: variable DOT LCWORD
            {
            pushFollow(FOLLOW_variable_in_instance_call1644);
            variable179=variable();

            state._fsp--;

            stream_variable.add(variable179.getTree());
            DOT180=(Token)match(input,DOT,FOLLOW_DOT_in_instance_call1646);  
            stream_DOT.add(DOT180);

            LCWORD181=(Token)match(input,LCWORD,FOLLOW_LCWORD_in_instance_call1648);  
            stream_LCWORD.add(LCWORD181);



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
            // 252:24: -> variable LCWORD
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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:255:1: static_call : ( qualified_java_class DOT LCWORD ) -> qualified_java_class LCWORD ;
    public final Prova2Parser.static_call_return static_call() throws RecognitionException {
        Prova2Parser.static_call_return retval = new Prova2Parser.static_call_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token DOT183=null;
        Token LCWORD184=null;
        Prova2Parser.qualified_java_class_return qualified_java_class182 = null;


        ProvaAST DOT183_tree=null;
        ProvaAST LCWORD184_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_LCWORD=new RewriteRuleTokenStream(adaptor,"token LCWORD");
        RewriteRuleSubtreeStream stream_qualified_java_class=new RewriteRuleSubtreeStream(adaptor,"rule qualified_java_class");
        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:256:2: ( ( qualified_java_class DOT LCWORD ) -> qualified_java_class LCWORD )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:256:4: ( qualified_java_class DOT LCWORD )
            {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:256:4: ( qualified_java_class DOT LCWORD )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:256:5: qualified_java_class DOT LCWORD
            {
            pushFollow(FOLLOW_qualified_java_class_in_static_call1666);
            qualified_java_class182=qualified_java_class();

            state._fsp--;

            stream_qualified_java_class.add(qualified_java_class182.getTree());
            DOT183=(Token)match(input,DOT,FOLLOW_DOT_in_static_call1668);  
            stream_DOT.add(DOT183);

            LCWORD184=(Token)match(input,LCWORD,FOLLOW_LCWORD_in_static_call1670);  
            stream_LCWORD.add(LCWORD184);


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
            // 256:38: -> qualified_java_class LCWORD
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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:259:1: pos_number : ( INT_LITERAL | LONG_LITERAL | float_literal );
    public final Prova2Parser.pos_number_return pos_number() throws RecognitionException {
        Prova2Parser.pos_number_return retval = new Prova2Parser.pos_number_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token INT_LITERAL185=null;
        Token LONG_LITERAL186=null;
        Prova2Parser.float_literal_return float_literal187 = null;


        ProvaAST INT_LITERAL185_tree=null;
        ProvaAST LONG_LITERAL186_tree=null;

        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:259:12: ( INT_LITERAL | LONG_LITERAL | float_literal )
            int alt65=3;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==INT_LITERAL) ) {
                int LA65_1 = input.LA(2);

                if ( (LA65_1==DOT) ) {
                    int LA65_3 = input.LA(3);

                    if ( (LA65_3==INT_LITERAL) ) {
                        alt65=3;
                    }
                    else if ( (LA65_3==EOF||LA65_3==NEWLINE) ) {
                        alt65=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 65, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA65_1==EOF||(LA65_1>=PLUS && LA65_1<=COMMA)||(LA65_1>=CLOSE && LA65_1<=GE)||LA65_1==USWORD||(LA65_1>=REM && LA65_1<=DOLLARWORD)||(LA65_1>=NEWLINE && LA65_1<=STRING2)||LA65_1==71||(LA65_1>=73 && LA65_1<=74)) ) {
                    alt65=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 65, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA65_0==LONG_LITERAL) ) {
                alt65=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:259:14: INT_LITERAL
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    INT_LITERAL185=(Token)match(input,INT_LITERAL,FOLLOW_INT_LITERAL_in_pos_number1686); 
                    INT_LITERAL185_tree = (ProvaAST)adaptor.create(INT_LITERAL185);
                    adaptor.addChild(root_0, INT_LITERAL185_tree);


                    }
                    break;
                case 2 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:259:28: LONG_LITERAL
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    LONG_LITERAL186=(Token)match(input,LONG_LITERAL,FOLLOW_LONG_LITERAL_in_pos_number1690); 
                    LONG_LITERAL186_tree = (ProvaAST)adaptor.create(LONG_LITERAL186);
                    adaptor.addChild(root_0, LONG_LITERAL186_tree);


                    }
                    break;
                case 3 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:259:43: float_literal
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_float_literal_in_pos_number1694);
                    float_literal187=float_literal();

                    state._fsp--;

                    adaptor.addChild(root_0, float_literal187.getTree());

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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:261:1: number : ( '-' )? pos_number ;
    public final Prova2Parser.number_return number() throws RecognitionException {
        Prova2Parser.number_return retval = new Prova2Parser.number_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token char_literal188=null;
        Prova2Parser.pos_number_return pos_number189 = null;


        ProvaAST char_literal188_tree=null;

        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:262:2: ( ( '-' )? pos_number )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:262:4: ( '-' )? pos_number
            {
            root_0 = (ProvaAST)adaptor.nil();

            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:262:4: ( '-' )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==MINUS) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:262:5: '-'
                    {
                    char_literal188=(Token)match(input,MINUS,FOLLOW_MINUS_in_number1705); 
                    char_literal188_tree = (ProvaAST)adaptor.create(char_literal188);
                    adaptor.addChild(root_0, char_literal188_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_pos_number_in_number1709);
            pos_number189=pos_number();

            state._fsp--;

            adaptor.addChild(root_0, pos_number189.getTree());

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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:264:1: mstring : ( LCWORD | string );
    public final Prova2Parser.mstring_return mstring() throws RecognitionException {
        Prova2Parser.mstring_return retval = new Prova2Parser.mstring_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token LCWORD190=null;
        Prova2Parser.string_return string191 = null;


        ProvaAST LCWORD190_tree=null;

        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:264:10: ( LCWORD | string )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==LCWORD) ) {
                alt67=1;
            }
            else if ( ((LA67_0>=STRING1 && LA67_0<=STRING2)) ) {
                alt67=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:265:2: LCWORD
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    LCWORD190=(Token)match(input,LCWORD,FOLLOW_LCWORD_in_mstring1719); 
                    LCWORD190_tree = (ProvaAST)adaptor.create(LCWORD190);
                    adaptor.addChild(root_0, LCWORD190_tree);


                    }
                    break;
                case 2 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:265:11: string
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_string_in_mstring1723);
                    string191=string();

                    state._fsp--;

                    adaptor.addChild(root_0, string191.getTree());

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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:267:1: constant : ( LCWORD | string | qualified_java_class );
    public final Prova2Parser.constant_return constant() throws RecognitionException {
        Prova2Parser.constant_return retval = new Prova2Parser.constant_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token LCWORD192=null;
        Prova2Parser.string_return string193 = null;

        Prova2Parser.qualified_java_class_return qualified_java_class194 = null;


        ProvaAST LCWORD192_tree=null;

        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:267:10: ( LCWORD | string | qualified_java_class )
            int alt68=3;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==LCWORD) ) {
                int LA68_1 = input.LA(2);

                if ( (LA68_1==DOT) ) {
                    int LA68_3 = input.LA(3);

                    if ( (LA68_3==EOF||LA68_3==NEWLINE) ) {
                        alt68=1;
                    }
                    else if ( ((LA68_3>=LCWORD && LA68_3<=UCWORD)) ) {
                        alt68=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 68, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA68_1==EOF||LA68_1==MINUS||LA68_1==COMMA||(LA68_1>=OPEN && LA68_1<=GE)||LA68_1==USWORD||LA68_1==DOLLARWORD||(LA68_1>=NEWLINE && LA68_1<=STRING2)||LA68_1==71||(LA68_1>=73 && LA68_1<=74)) ) {
                    alt68=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 68, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA68_0>=STRING1 && LA68_0<=STRING2)) ) {
                alt68=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }
            switch (alt68) {
                case 1 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:268:2: LCWORD
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    LCWORD192=(Token)match(input,LCWORD,FOLLOW_LCWORD_in_constant1733); 
                    LCWORD192_tree = (ProvaAST)adaptor.create(LCWORD192);
                    adaptor.addChild(root_0, LCWORD192_tree);


                    }
                    break;
                case 2 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:268:11: string
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_string_in_constant1737);
                    string193=string();

                    state._fsp--;

                    adaptor.addChild(root_0, string193.getTree());

                    }
                    break;
                case 3 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:268:20: qualified_java_class
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_qualified_java_class_in_constant1741);
                    qualified_java_class194=qualified_java_class();

                    state._fsp--;

                    adaptor.addChild(root_0, qualified_java_class194.getTree());

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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:270:1: string : ( STRING1 | STRING2 );
    public final Prova2Parser.string_return string() throws RecognitionException {
        Prova2Parser.string_return retval = new Prova2Parser.string_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token set195=null;

        ProvaAST set195_tree=null;

        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:270:8: ( STRING1 | STRING2 )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:
            {
            root_0 = (ProvaAST)adaptor.nil();

            set195=(Token)input.LT(1);
            if ( (input.LA(1)>=STRING1 && input.LA(1)<=STRING2) ) {
                input.consume();
                adaptor.addChild(root_0, (ProvaAST)adaptor.create(set195));
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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:272:1: not_equal : ( NOT_EQUAL1 | NOT_EQUAL2 );
    public final Prova2Parser.not_equal_return not_equal() throws RecognitionException {
        Prova2Parser.not_equal_return retval = new Prova2Parser.not_equal_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token set196=null;

        ProvaAST set196_tree=null;

        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:273:2: ( NOT_EQUAL1 | NOT_EQUAL2 )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:
            {
            root_0 = (ProvaAST)adaptor.nil();

            set196=(Token)input.LT(1);
            if ( (input.LA(1)>=NOT_EQUAL1 && input.LA(1)<=NOT_EQUAL2) ) {
                input.consume();
                adaptor.addChild(root_0, (ProvaAST)adaptor.create(set196));
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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:276:1: float_literal : INT_LITERAL DOT INT_LITERAL ( EXPONENT )? ;
    public final Prova2Parser.float_literal_return float_literal() throws RecognitionException {
        Prova2Parser.float_literal_return retval = new Prova2Parser.float_literal_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token INT_LITERAL197=null;
        Token DOT198=null;
        Token INT_LITERAL199=null;
        Token EXPONENT200=null;

        ProvaAST INT_LITERAL197_tree=null;
        ProvaAST DOT198_tree=null;
        ProvaAST INT_LITERAL199_tree=null;
        ProvaAST EXPONENT200_tree=null;

        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:276:16: ( INT_LITERAL DOT INT_LITERAL ( EXPONENT )? )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:276:18: INT_LITERAL DOT INT_LITERAL ( EXPONENT )?
            {
            root_0 = (ProvaAST)adaptor.nil();

            INT_LITERAL197=(Token)match(input,INT_LITERAL,FOLLOW_INT_LITERAL_in_float_literal1777); 
            INT_LITERAL197_tree = (ProvaAST)adaptor.create(INT_LITERAL197);
            adaptor.addChild(root_0, INT_LITERAL197_tree);

            DOT198=(Token)match(input,DOT,FOLLOW_DOT_in_float_literal1779); 
            DOT198_tree = (ProvaAST)adaptor.create(DOT198);
            adaptor.addChild(root_0, DOT198_tree);

            INT_LITERAL199=(Token)match(input,INT_LITERAL,FOLLOW_INT_LITERAL_in_float_literal1781); 
            INT_LITERAL199_tree = (ProvaAST)adaptor.create(INT_LITERAL199);
            adaptor.addChild(root_0, INT_LITERAL199_tree);

            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:276:46: ( EXPONENT )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==EXPONENT) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:276:46: EXPONENT
                    {
                    EXPONENT200=(Token)match(input,EXPONENT,FOLLOW_EXPONENT_in_float_literal1783); 
                    EXPONENT200_tree = (ProvaAST)adaptor.create(EXPONENT200);
                    adaptor.addChild(root_0, EXPONENT200_tree);


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
    protected DFA5 dfa5 = new DFA5(this);
    protected DFA29 dfa29 = new DFA29(this);
    protected DFA32 dfa32 = new DFA32(this);
    protected DFA36 dfa36 = new DFA36(this);
    protected DFA38 dfa38 = new DFA38(this);
    protected DFA46 dfa46 = new DFA46(this);
    protected DFA48 dfa48 = new DFA48(this);
    protected DFA50 dfa50 = new DFA50(this);
    protected DFA52 dfa52 = new DFA52(this);
    protected DFA51 dfa51 = new DFA51(this);
    protected DFA56 dfa56 = new DFA56(this);
    protected DFA59 dfa59 = new DFA59(this);
    static final String DFA1_eotS =
        "\4\uffff";
    static final String DFA1_eofS =
        "\2\2\2\uffff";
    static final String DFA1_minS =
        "\2\12\2\uffff";
    static final String DFA1_maxS =
        "\2\110\2\uffff";
    static final String DFA1_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA1_specialS =
        "\4\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\3\52\uffff\1\1\2\3\2\uffff\2\3\14\uffff\1\3",
            "\1\3\52\uffff\1\1\2\3\2\uffff\2\3\14\uffff\1\3",
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
            return "()* loopback of 89:4: ( statement )*";
        }
    }
    static final String DFA5_eotS =
        "\35\uffff";
    static final String DFA5_eofS =
        "\35\uffff";
    static final String DFA5_minS =
        "\1\12\1\66\1\6\2\uffff\1\14\1\uffff\1\6\1\65\3\11\1\70\1\4\1\11"+
        "\1\6\1\65\1\70\3\11\1\70\1\4\2\11\1\70\3\11";
    static final String DFA5_maxS =
        "\1\110\1\66\1\111\2\uffff\1\110\1\uffff\1\73\1\110\3\15\1\71\2"+
        "\15\1\73\1\110\1\70\3\15\1\71\2\15\1\74\1\70\1\15\1\74\1\15";
    static final String DFA5_acceptS =
        "\3\uffff\1\1\1\2\1\uffff\1\3\26\uffff";
    static final String DFA5_specialS =
        "\35\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\4\53\uffff\1\2\1\3\2\uffff\2\3\14\uffff\1\1",
            "\1\5",
            "\1\6\5\uffff\1\3\2\uffff\1\6\31\uffff\1\6\3\uffff\1\6\10\uffff"+
            "\6\6\15\uffff\1\6",
            "",
            "",
            "\1\7\50\uffff\1\10\1\2\1\3\2\uffff\2\3\14\uffff\1\1",
            "",
            "\1\14\57\uffff\1\11\1\12\1\15\1\16\2\13",
            "\1\10\1\2\1\3\2\uffff\2\3\14\uffff\1\1",
            "\1\17\3\uffff\1\20",
            "\1\17\3\uffff\1\20",
            "\1\17\3\uffff\1\20",
            "\1\15\1\16",
            "\1\21\4\uffff\1\17\3\uffff\1\20",
            "\1\17\3\uffff\1\20",
            "\1\25\57\uffff\1\22\1\23\1\26\1\27\2\24",
            "\1\10\1\2\1\3\2\uffff\2\3\14\uffff\1\1",
            "\1\30",
            "\1\17\3\uffff\1\20",
            "\1\17\3\uffff\1\20",
            "\1\17\3\uffff\1\20",
            "\1\26\1\27",
            "\1\31\4\uffff\1\17\3\uffff\1\20",
            "\1\17\3\uffff\1\20",
            "\1\17\3\uffff\1\20\56\uffff\1\32",
            "\1\33",
            "\1\17\3\uffff\1\20",
            "\1\17\3\uffff\1\20\56\uffff\1\34",
            "\1\17\3\uffff\1\20"
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "97:1: stat : ( clause | query | function );";
        }
    }
    static final String DFA29_eotS =
        "\41\uffff";
    static final String DFA29_eofS =
        "\41\uffff";
    static final String DFA29_minS =
        "\2\6\1\66\2\4\1\6\2\uffff\1\6\2\uffff\2\6\3\11\1\70\1\4\1\11\2"+
        "\6\1\70\3\11\1\70\1\4\2\11\1\70\3\11";
    static final String DFA29_maxS =
        "\2\110\1\66\3\111\2\uffff\1\110\2\uffff\1\73\1\110\3\15\1\71\2"+
        "\15\1\73\1\110\1\70\3\15\1\71\2\15\1\74\1\70\1\15\1\74\1\15";
    static final String DFA29_acceptS =
        "\6\uffff\1\2\1\4\1\uffff\1\3\1\1\26\uffff";
    static final String DFA29_specialS =
        "\41\uffff}>";
    static final String[] DFA29_transitionS = {
            "\1\6\4\uffff\1\7\3\uffff\1\6\31\uffff\1\6\3\uffff\1\6\7\uffff"+
            "\1\1\1\3\1\4\2\6\2\5\14\uffff\1\2",
            "\1\6\4\uffff\1\7\3\uffff\1\6\31\uffff\1\6\3\uffff\1\6\7\uffff"+
            "\1\1\1\3\1\4\2\6\2\5\14\uffff\1\2",
            "\1\10",
            "\1\6\1\uffff\1\11\5\uffff\1\12\2\uffff\1\11\1\uffff\7\6\21"+
            "\uffff\1\11\3\uffff\1\11\10\uffff\6\11\15\uffff\1\11",
            "\1\6\1\uffff\1\11\5\uffff\1\12\2\uffff\1\11\1\uffff\7\6\21"+
            "\uffff\1\11\3\uffff\1\11\10\uffff\6\11\15\uffff\1\11",
            "\1\11\5\uffff\1\12\2\uffff\1\11\1\uffff\7\6\21\uffff\1\11"+
            "\3\uffff\1\11\10\uffff\6\11\15\uffff\1\11",
            "",
            "",
            "\1\6\5\uffff\1\13\2\uffff\1\6\31\uffff\1\6\3\uffff\1\6\7\uffff"+
            "\1\14\1\3\1\4\2\6\2\5\14\uffff\1\2",
            "",
            "",
            "\1\20\57\uffff\1\15\1\16\1\21\1\22\2\17",
            "\1\6\10\uffff\1\6\31\uffff\1\6\3\uffff\1\6\7\uffff\1\14\1"+
            "\3\1\4\2\6\2\5\14\uffff\1\2",
            "\1\23\3\uffff\1\24",
            "\1\23\3\uffff\1\24",
            "\1\23\3\uffff\1\24",
            "\1\21\1\22",
            "\1\25\4\uffff\1\23\3\uffff\1\24",
            "\1\23\3\uffff\1\24",
            "\1\31\57\uffff\1\26\1\27\1\32\1\33\2\30",
            "\1\6\10\uffff\1\6\31\uffff\1\6\3\uffff\1\6\7\uffff\1\14\1"+
            "\3\1\4\2\6\2\5\14\uffff\1\2",
            "\1\34",
            "\1\23\3\uffff\1\24",
            "\1\23\3\uffff\1\24",
            "\1\23\3\uffff\1\24",
            "\1\32\1\33",
            "\1\35\4\uffff\1\23\3\uffff\1\24",
            "\1\23\3\uffff\1\24",
            "\1\23\3\uffff\1\24\56\uffff\1\36",
            "\1\37",
            "\1\23\3\uffff\1\24",
            "\1\23\3\uffff\1\24\56\uffff\1\40",
            "\1\23\3\uffff\1\24"
    };

    static final short[] DFA29_eot = DFA.unpackEncodedString(DFA29_eotS);
    static final short[] DFA29_eof = DFA.unpackEncodedString(DFA29_eofS);
    static final char[] DFA29_min = DFA.unpackEncodedStringToUnsignedChars(DFA29_minS);
    static final char[] DFA29_max = DFA.unpackEncodedStringToUnsignedChars(DFA29_maxS);
    static final short[] DFA29_accept = DFA.unpackEncodedString(DFA29_acceptS);
    static final short[] DFA29_special = DFA.unpackEncodedString(DFA29_specialS);
    static final short[][] DFA29_transition;

    static {
        int numStates = DFA29_transitionS.length;
        DFA29_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA29_transition[i] = DFA.unpackEncodedString(DFA29_transitionS[i]);
        }
    }

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = DFA29_eot;
            this.eof = DFA29_eof;
            this.min = DFA29_min;
            this.max = DFA29_max;
            this.accept = DFA29_accept;
            this.special = DFA29_special;
            this.transition = DFA29_transition;
        }
        public String getDescription() {
            return "128:1: literal : ( ( NEWLINE )* (m= metadata )? r= relation (g= guard )? -> ^( RELATION ( metadata )? relation ( guard )? ) | ( NEWLINE )* (m= metadata )? semantic_attachment (g= guard )? -> ^( SEMANTIC_ATTACHMENT ( metadata )? semantic_attachment ( guard )? ) | ( NEWLINE )* ( metadata )? function_call -> ^( FUNCTION ( metadata )? function_call ) | ( NEWLINE )* cut -> ^( CUT cut ) );";
        }
    }
    static final String DFA32_eotS =
        "\4\uffff";
    static final String DFA32_eofS =
        "\4\uffff";
    static final String DFA32_minS =
        "\2\6\2\uffff";
    static final String DFA32_maxS =
        "\2\111\2\uffff";
    static final String DFA32_acceptS =
        "\2\uffff\1\1\1\2";
    static final String DFA32_specialS =
        "\4\uffff}>";
    static final String[] DFA32_transitionS = {
            "\1\2\6\uffff\1\3\1\uffff\1\2\1\3\30\uffff\1\2\3\uffff\1\2\7"+
            "\uffff\1\1\6\2\15\uffff\1\2",
            "\1\2\6\uffff\1\3\1\uffff\1\2\1\3\30\uffff\1\2\3\uffff\1\2"+
            "\7\uffff\1\1\6\2\15\uffff\1\2",
            "",
            ""
    };

    static final short[] DFA32_eot = DFA.unpackEncodedString(DFA32_eotS);
    static final short[] DFA32_eof = DFA.unpackEncodedString(DFA32_eofS);
    static final char[] DFA32_min = DFA.unpackEncodedStringToUnsignedChars(DFA32_minS);
    static final char[] DFA32_max = DFA.unpackEncodedStringToUnsignedChars(DFA32_maxS);
    static final short[] DFA32_accept = DFA.unpackEncodedString(DFA32_acceptS);
    static final short[] DFA32_special = DFA.unpackEncodedString(DFA32_specialS);
    static final short[][] DFA32_transition;

    static {
        int numStates = DFA32_transitionS.length;
        DFA32_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA32_transition[i] = DFA.unpackEncodedString(DFA32_transitionS[i]);
        }
    }

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = DFA32_eot;
            this.eof = DFA32_eof;
            this.min = DFA32_min;
            this.max = DFA32_max;
            this.accept = DFA32_accept;
            this.special = DFA32_special;
            this.transition = DFA32_transition;
        }
        public String getDescription() {
            return "147:5: ( terms ( '|' list_tail )? )?";
        }
    }
    static final String DFA36_eotS =
        "\13\uffff";
    static final String DFA36_eofS =
        "\6\uffff\1\2\2\uffff\1\2\1\uffff";
    static final String DFA36_minS =
        "\1\6\1\4\4\uffff\1\65\2\4\1\65\1\66";
    static final String DFA36_maxS =
        "\1\73\1\112\4\uffff\1\67\1\112\1\4\2\67";
    static final String DFA36_acceptS =
        "\2\uffff\1\1\1\2\1\3\1\4\5\uffff";
    static final String DFA36_specialS =
        "\13\uffff}>";
    static final String[] DFA36_transitionS = {
            "\1\4\10\uffff\1\5\31\uffff\1\3\3\uffff\1\3\10\uffff\1\1\1\3"+
            "\2\4\2\2",
            "\1\6\1\uffff\1\2\2\uffff\1\2\3\uffff\13\2\21\uffff\1\2\3\uffff"+
            "\1\2\7\uffff\7\2\13\uffff\1\2\1\uffff\2\2",
            "",
            "",
            "",
            "",
            "\1\2\1\10\1\7",
            "\1\11\1\uffff\1\2\2\uffff\1\2\3\uffff\13\2\21\uffff\1\2\3"+
            "\uffff\1\2\7\uffff\7\2\13\uffff\1\2\1\uffff\2\2",
            "\1\12",
            "\1\2\2\3",
            "\1\10\1\7"
    };

    static final short[] DFA36_eot = DFA.unpackEncodedString(DFA36_eotS);
    static final short[] DFA36_eof = DFA.unpackEncodedString(DFA36_eofS);
    static final char[] DFA36_min = DFA.unpackEncodedStringToUnsignedChars(DFA36_minS);
    static final char[] DFA36_max = DFA.unpackEncodedStringToUnsignedChars(DFA36_maxS);
    static final short[] DFA36_accept = DFA.unpackEncodedString(DFA36_acceptS);
    static final short[] DFA36_special = DFA.unpackEncodedString(DFA36_specialS);
    static final short[][] DFA36_transition;

    static {
        int numStates = DFA36_transitionS.length;
        DFA36_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA36_transition[i] = DFA.unpackEncodedString(DFA36_transitionS[i]);
        }
    }

    class DFA36 extends DFA {

        public DFA36(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 36;
            this.eot = DFA36_eot;
            this.eof = DFA36_eof;
            this.min = DFA36_min;
            this.max = DFA36_max;
            this.accept = DFA36_accept;
            this.special = DFA36_special;
            this.transition = DFA36_transition;
        }
        public String getDescription() {
            return "155:1: left_term : ( constant | variable | number | prova_list );";
        }
    }
    static final String DFA38_eotS =
        "\7\uffff";
    static final String DFA38_eofS =
        "\1\uffff\1\2\3\uffff\1\2\1\uffff";
    static final String DFA38_minS =
        "\1\51\1\4\2\uffff\1\66\2\4";
    static final String DFA38_maxS =
        "\1\73\1\4\2\uffff\1\67\2\4";
    static final String DFA38_acceptS =
        "\2\uffff\1\1\1\2\3\uffff";
    static final String DFA38_specialS =
        "\7\uffff}>";
    static final String[] DFA38_transitionS = {
            "\1\3\3\uffff\1\3\10\uffff\1\1\1\3\2\uffff\2\2",
            "\1\4",
            "",
            "",
            "\1\6\1\5",
            "\1\3",
            "\1\4"
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
            return "162:12: ( constant | variable )";
        }
    }
    static final String DFA46_eotS =
        "\4\uffff";
    static final String DFA46_eofS =
        "\4\uffff";
    static final String DFA46_minS =
        "\1\11\1\uffff\1\11\1\uffff";
    static final String DFA46_maxS =
        "\1\65\1\uffff\1\65\1\uffff";
    static final String DFA46_acceptS =
        "\1\uffff\1\2\1\uffff\1\1";
    static final String DFA46_specialS =
        "\4\uffff}>";
    static final String[] DFA46_transitionS = {
            "\1\3\3\uffff\2\1\1\uffff\1\1\44\uffff\1\2",
            "",
            "\1\3\3\uffff\1\1\2\uffff\1\1\44\uffff\1\2",
            ""
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
            return "()* loopback of 172:24: ( ( NEWLINE )* ',' ( NEWLINE )* term )*";
        }
    }
    static final String DFA48_eotS =
        "\17\uffff";
    static final String DFA48_eofS =
        "\6\uffff\1\4\1\uffff\1\4\3\uffff\1\4\2\uffff";
    static final String DFA48_minS =
        "\1\6\3\4\2\uffff\1\65\1\uffff\1\65\3\4\1\65\1\66\1\4";
    static final String DFA48_maxS =
        "\1\111\3\112\2\uffff\1\67\1\uffff\1\67\1\112\1\4\1\112\2\67\1\112";
    static final String DFA48_acceptS =
        "\4\uffff\1\1\1\3\1\uffff\1\2\7\uffff";
    static final String DFA48_specialS =
        "\17\uffff}>";
    static final String[] DFA48_transitionS = {
            "\1\4\10\uffff\1\4\31\uffff\1\4\3\uffff\1\4\10\uffff\1\1\1\3"+
            "\2\4\2\2\15\uffff\1\5",
            "\1\6\1\uffff\1\4\2\uffff\1\4\2\uffff\1\7\5\4\27\uffff\1\4"+
            "\3\uffff\1\4\7\uffff\7\4\13\uffff\1\4\1\uffff\2\4",
            "\1\4\1\uffff\1\4\2\uffff\1\4\2\uffff\1\7\5\4\27\uffff\1\4"+
            "\3\uffff\1\4\7\uffff\7\4\13\uffff\1\4\1\uffff\2\4",
            "\1\10\1\uffff\1\4\2\uffff\1\4\2\uffff\1\7\5\4\27\uffff\1\4"+
            "\3\uffff\1\4\7\uffff\7\4\13\uffff\1\4\1\uffff\2\4",
            "",
            "",
            "\1\4\1\12\1\11",
            "",
            "\1\4\2\13",
            "\1\14\1\uffff\1\4\2\uffff\1\4\3\uffff\5\4\27\uffff\1\4\3\uffff"+
            "\1\4\7\uffff\7\4\13\uffff\1\4\1\uffff\2\4",
            "\1\15",
            "\1\4\1\uffff\1\4\2\uffff\1\4\2\uffff\1\7\5\4\27\uffff\1\4"+
            "\3\uffff\1\4\7\uffff\7\4\13\uffff\1\4\1\uffff\2\4",
            "\1\4\2\16",
            "\1\12\1\11",
            "\1\4\1\uffff\1\4\2\uffff\1\4\2\uffff\1\7\5\4\27\uffff\1\4"+
            "\3\uffff\1\4\7\uffff\7\4\13\uffff\1\4\1\uffff\2\4"
    };

    static final short[] DFA48_eot = DFA.unpackEncodedString(DFA48_eotS);
    static final short[] DFA48_eof = DFA.unpackEncodedString(DFA48_eofS);
    static final char[] DFA48_min = DFA.unpackEncodedStringToUnsignedChars(DFA48_minS);
    static final char[] DFA48_max = DFA.unpackEncodedStringToUnsignedChars(DFA48_maxS);
    static final short[] DFA48_accept = DFA.unpackEncodedString(DFA48_acceptS);
    static final short[] DFA48_special = DFA.unpackEncodedString(DFA48_specialS);
    static final short[][] DFA48_transition;

    static {
        int numStates = DFA48_transitionS.length;
        DFA48_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA48_transition[i] = DFA.unpackEncodedString(DFA48_transitionS[i]);
        }
    }

    class DFA48 extends DFA {

        public DFA48(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 48;
            this.eot = DFA48_eot;
            this.eof = DFA48_eof;
            this.min = DFA48_min;
            this.max = DFA48_max;
            this.accept = DFA48_accept;
            this.special = DFA48_special;
            this.transition = DFA48_transition;
        }
        public String getDescription() {
            return "176:1: term : ( left_term | func_term | prova_map );";
        }
    }
    static final String DFA50_eotS =
        "\20\uffff";
    static final String DFA50_eofS =
        "\20\uffff";
    static final String DFA50_minS =
        "\1\6\4\4\1\uffff\2\66\1\uffff\4\4\1\66\2\4";
    static final String DFA50_maxS =
        "\1\73\4\27\1\uffff\2\67\1\uffff\1\27\1\4\2\27\1\67\2\27";
    static final String DFA50_acceptS =
        "\5\uffff\1\2\2\uffff\1\1\7\uffff";
    static final String DFA50_specialS =
        "\20\uffff}>";
    static final String[] DFA50_transitionS = {
            "\1\5\10\uffff\1\5\31\uffff\1\3\3\uffff\1\4\10\uffff\1\1\1\2"+
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
            return "190:1: semantic_attachment : ( predicate_java_call | binary_operation );";
        }
    }
    static final String DFA52_eotS =
        "\13\uffff";
    static final String DFA52_eofS =
        "\6\uffff\1\5\2\uffff\1\5\1\uffff";
    static final String DFA52_minS =
        "\1\21\1\uffff\1\6\1\uffff\1\4\1\uffff\1\65\2\4\1\65\1\66";
    static final String DFA52_maxS =
        "\1\27\1\uffff\1\73\1\uffff\1\65\1\uffff\1\67\1\65\1\4\2\67";
    static final String DFA52_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\1\uffff\1\2\5\uffff";
    static final String DFA52_specialS =
        "\13\uffff}>";
    static final String[] DFA52_transitionS = {
            "\1\1\2\2\4\3",
            "",
            "\1\3\5\uffff\1\3\34\uffff\1\3\3\uffff\1\3\10\uffff\1\4\3\3"+
            "\2\5",
            "",
            "\1\6\4\uffff\1\5\5\uffff\2\5\44\uffff\1\5",
            "",
            "\1\5\1\10\1\7",
            "\1\11\4\uffff\1\5\5\uffff\2\5\44\uffff\1\5",
            "\1\12",
            "\1\5\2\3",
            "\1\10\1\7"
    };

    static final short[] DFA52_eot = DFA.unpackEncodedString(DFA52_eotS);
    static final short[] DFA52_eof = DFA.unpackEncodedString(DFA52_eofS);
    static final char[] DFA52_min = DFA.unpackEncodedStringToUnsignedChars(DFA52_minS);
    static final char[] DFA52_max = DFA.unpackEncodedStringToUnsignedChars(DFA52_maxS);
    static final short[] DFA52_accept = DFA.unpackEncodedString(DFA52_acceptS);
    static final short[] DFA52_special = DFA.unpackEncodedString(DFA52_specialS);
    static final short[][] DFA52_transition;

    static {
        int numStates = DFA52_transitionS.length;
        DFA52_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA52_transition[i] = DFA.unpackEncodedString(DFA52_transitionS[i]);
        }
    }

    class DFA52 extends DFA {

        public DFA52(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 52;
            this.eot = DFA52_eot;
            this.eof = DFA52_eof;
            this.min = DFA52_min;
            this.max = DFA52_max;
            this.accept = DFA52_accept;
            this.special = DFA52_special;
            this.transition = DFA52_transition;
        }
        public String getDescription() {
            return "195:3: ( EQUAL ( constructor_java_call | prova_list | constant | expr ) | not_equal constant | binary_operator expr )";
        }
    }
    static final String DFA51_eotS =
        "\14\uffff";
    static final String DFA51_eofS =
        "\6\uffff\1\4\3\uffff\1\4\1\uffff";
    static final String DFA51_minS =
        "\1\6\2\4\3\uffff\1\65\1\uffff\2\4\1\65\1\66";
    static final String DFA51_maxS =
        "\1\73\2\65\3\uffff\1\67\1\uffff\1\65\1\4\2\67";
    static final String DFA51_acceptS =
        "\3\uffff\1\2\1\3\1\4\1\uffff\1\1\4\uffff";
    static final String DFA51_specialS =
        "\14\uffff}>";
    static final String[] DFA51_transitionS = {
            "\1\5\5\uffff\1\5\2\uffff\1\3\31\uffff\1\5\3\uffff\1\5\10\uffff"+
            "\1\1\1\2\2\5\2\4",
            "\1\6\4\uffff\1\4\5\uffff\2\4\44\uffff\1\4",
            "\6\5\2\uffff\1\7\2\uffff\2\5\33\uffff\1\5\10\uffff\1\5",
            "",
            "",
            "",
            "\1\4\1\11\1\10",
            "",
            "\1\12\4\uffff\1\4\2\uffff\1\7\2\uffff\2\4\44\uffff\1\4",
            "\1\13",
            "\1\4\2\5",
            "\1\11\1\10"
    };

    static final short[] DFA51_eot = DFA.unpackEncodedString(DFA51_eotS);
    static final short[] DFA51_eof = DFA.unpackEncodedString(DFA51_eofS);
    static final char[] DFA51_min = DFA.unpackEncodedStringToUnsignedChars(DFA51_minS);
    static final char[] DFA51_max = DFA.unpackEncodedStringToUnsignedChars(DFA51_maxS);
    static final short[] DFA51_accept = DFA.unpackEncodedString(DFA51_acceptS);
    static final short[] DFA51_special = DFA.unpackEncodedString(DFA51_specialS);
    static final short[][] DFA51_transition;

    static {
        int numStates = DFA51_transitionS.length;
        DFA51_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA51_transition[i] = DFA.unpackEncodedString(DFA51_transitionS[i]);
        }
    }

    class DFA51 extends DFA {

        public DFA51(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 51;
            this.eot = DFA51_eot;
            this.eof = DFA51_eof;
            this.min = DFA51_min;
            this.max = DFA51_max;
            this.accept = DFA51_accept;
            this.special = DFA51_special;
            this.transition = DFA51_transition;
        }
        public String getDescription() {
            return "196:4: ( constructor_java_call | prova_list | constant | expr )";
        }
    }
    static final String DFA56_eotS =
        "\23\uffff";
    static final String DFA56_eofS =
        "\10\uffff\1\11\1\uffff\1\11\10\uffff";
    static final String DFA56_minS =
        "\1\6\1\51\4\4\2\uffff\1\65\1\uffff\1\65\1\66\2\4\1\uffff\1\4\1"+
        "\66\2\4";
    static final String DFA56_maxS =
        "\2\71\2\65\1\4\1\65\2\uffff\1\67\1\uffff\1\66\1\67\2\65\1\uffff"+
        "\1\4\1\67\2\65";
    static final String DFA56_acceptS =
        "\6\uffff\1\2\1\4\1\uffff\1\1\4\uffff\1\3\4\uffff";
    static final String DFA56_specialS =
        "\23\uffff}>";
    static final String[] DFA56_transitionS = {
            "\1\1\5\uffff\1\7\34\uffff\1\3\3\uffff\1\5\10\uffff\1\4\1\2"+
            "\2\6",
            "\1\3\3\uffff\1\5\10\uffff\1\4\1\2\2\6",
            "\1\10\5\11\3\uffff\1\11\1\uffff\2\11\33\uffff\1\11\10\uffff"+
            "\1\11",
            "\1\12\5\11\3\uffff\1\11\1\uffff\2\11\33\uffff\1\11\10\uffff"+
            "\1\11",
            "\1\13",
            "\1\12\5\11\3\uffff\1\11\1\uffff\2\11\33\uffff\1\11\10\uffff"+
            "\1\11",
            "",
            "",
            "\1\11\1\14\1\15",
            "",
            "\1\11\1\16",
            "\1\4\1\17",
            "\1\12\5\11\2\uffff\1\16\1\11\1\uffff\2\11\33\uffff\1\11\10"+
            "\uffff\1\11",
            "\1\12\5\11\3\uffff\1\11\1\uffff\2\11\33\uffff\1\11\10\uffff"+
            "\1\11",
            "",
            "\1\20",
            "\1\21\1\22",
            "\1\12\5\11\2\uffff\1\16\1\11\1\uffff\2\11\33\uffff\1\11\10"+
            "\uffff\1\11",
            "\1\12\5\11\3\uffff\1\11\1\uffff\2\11\33\uffff\1\11\10\uffff"+
            "\1\11"
    };

    static final short[] DFA56_eot = DFA.unpackEncodedString(DFA56_eotS);
    static final short[] DFA56_eof = DFA.unpackEncodedString(DFA56_eofS);
    static final char[] DFA56_min = DFA.unpackEncodedStringToUnsignedChars(DFA56_minS);
    static final char[] DFA56_max = DFA.unpackEncodedStringToUnsignedChars(DFA56_maxS);
    static final short[] DFA56_accept = DFA.unpackEncodedString(DFA56_acceptS);
    static final short[] DFA56_special = DFA.unpackEncodedString(DFA56_specialS);
    static final short[][] DFA56_transition;

    static {
        int numStates = DFA56_transitionS.length;
        DFA56_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA56_transition[i] = DFA.unpackEncodedString(DFA56_transitionS[i]);
        }
    }

    class DFA56 extends DFA {

        public DFA56(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 56;
            this.eot = DFA56_eot;
            this.eof = DFA56_eof;
            this.min = DFA56_min;
            this.max = DFA56_max;
            this.accept = DFA56_accept;
            this.special = DFA56_special;
            this.transition = DFA56_transition;
        }
        public String getDescription() {
            return "208:9: ( ( MINUS )? variable | number | ( MINUS )? predicate_java_call | OPEN expr CLOSE )";
        }
    }
    static final String DFA59_eotS =
        "\10\uffff";
    static final String DFA59_eofS =
        "\10\uffff";
    static final String DFA59_minS =
        "\1\51\1\4\1\uffff\1\66\1\4\1\66\1\4\1\uffff";
    static final String DFA59_maxS =
        "\1\67\1\4\1\uffff\1\67\1\4\1\67\1\14\1\uffff";
    static final String DFA59_acceptS =
        "\2\uffff\1\2\4\uffff\1\1";
    static final String DFA59_specialS =
        "\10\uffff}>";
    static final String[] DFA59_transitionS = {
            "\1\2\3\uffff\1\2\10\uffff\1\1\1\2",
            "\1\3",
            "",
            "\1\1\1\4",
            "\1\5",
            "\1\6\1\2",
            "\1\2\7\uffff\1\7",
            ""
    };

    static final short[] DFA59_eot = DFA.unpackEncodedString(DFA59_eotS);
    static final short[] DFA59_eof = DFA.unpackEncodedString(DFA59_eofS);
    static final char[] DFA59_min = DFA.unpackEncodedStringToUnsignedChars(DFA59_minS);
    static final char[] DFA59_max = DFA.unpackEncodedStringToUnsignedChars(DFA59_maxS);
    static final short[] DFA59_accept = DFA.unpackEncodedString(DFA59_acceptS);
    static final short[] DFA59_special = DFA.unpackEncodedString(DFA59_specialS);
    static final short[][] DFA59_transition;

    static {
        int numStates = DFA59_transitionS.length;
        DFA59_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA59_transition[i] = DFA.unpackEncodedString(DFA59_transitionS[i]);
        }
    }

    class DFA59 extends DFA {

        public DFA59(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 59;
            this.eot = DFA59_eot;
            this.eof = DFA59_eof;
            this.min = DFA59_min;
            this.max = DFA59_max;
            this.accept = DFA59_accept;
            this.special = DFA59_special;
            this.transition = DFA59_transition;
        }
        public String getDescription() {
            return "214:1: predicate_java_call : ( static_java_call | instance_java_call );";
        }
    }
 

    public static final BitSet FOLLOW_statement_in_rulebase343 = new BitSet(new long[]{0x0CE0000000000400L,0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_rulebase346 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_EOF_in_rulebase349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_statement367 = new BitSet(new long[]{0x0CE0000000000400L,0x0000000000000100L});
    public static final BitSet FOLLOW_stat_in_statement370 = new BitSet(new long[]{0x0020000000000010L});
    public static final BitSet FOLLOW_end_of_statement_in_statement372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_end_of_statement389 = new BitSet(new long[]{0x0020000000000010L});
    public static final BitSet FOLLOW_DOT_in_end_of_statement392 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_set_in_end_of_statement394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_clause_in_stat411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_query_in_stat417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_stat423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_metadata_in_function433 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_LCWORD_in_function436 = new BitSet(new long[]{0x0FC0220000008040L,0x0000000000000300L});
    public static final BitSet FOLLOW_list_body0_in_function438 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_function440 = new BitSet(new long[]{0x0FC0220000008040L,0x0000000000000300L});
    public static final BitSet FOLLOW_list_body0_in_function442 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_EQUAL_in_function445 = new BitSet(new long[]{0x0FE0220000008840L,0x0000000000000100L});
    public static final BitSet FOLLOW_literals_in_function447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_predicate_in_function_call477 = new BitSet(new long[]{0x0FC0220000008040L,0x0000000000000300L});
    public static final BitSet FOLLOW_list_body0_in_function_call479 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_function_call481 = new BitSet(new long[]{0x0FC0220000008040L,0x0000000000000300L});
    public static final BitSet FOLLOW_list_body0_in_function_call483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_query504 = new BitSet(new long[]{0x0CE0000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_query506 = new BitSet(new long[]{0x0CE0000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_query_predicate_in_query509 = new BitSet(new long[]{0x0020000000001000L});
    public static final BitSet FOLLOW_NEWLINE_in_query511 = new BitSet(new long[]{0x0020000000001000L});
    public static final BitSet FOLLOW_OPEN_in_query514 = new BitSet(new long[]{0x0CE0000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_query516 = new BitSet(new long[]{0x0CE0000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_relation_in_query519 = new BitSet(new long[]{0x0020000000002000L});
    public static final BitSet FOLLOW_NEWLINE_in_query521 = new BitSet(new long[]{0x0020000000002000L});
    public static final BitSet FOLLOW_CLOSE_in_query524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_query_predicate544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_metadata_in_clause553 = new BitSet(new long[]{0x0CC0000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_relation_in_clause556 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_IF_in_clause559 = new BitSet(new long[]{0x0FE0220000008840L,0x0000000000000100L});
    public static final BitSet FOLLOW_literals_in_clause561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_in_metadata587 = new BitSet(new long[]{0x0020000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_metadata589 = new BitSet(new long[]{0x0020000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_annotation611 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_LCWORD_in_annotation613 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_OPEN_in_annotation616 = new BitSet(new long[]{0x0FC0000000000040L,0x0000000000000100L});
    public static final BitSet FOLLOW_value_in_annotation618 = new BitSet(new long[]{0x0000000000002200L});
    public static final BitSet FOLLOW_COMMA_in_annotation621 = new BitSet(new long[]{0x0FC0000000000040L,0x0000000000000100L});
    public static final BitSet FOLLOW_value_in_annotation623 = new BitSet(new long[]{0x0000000000002200L});
    public static final BitSet FOLLOW_CLOSE_in_annotation627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCWORD_in_value652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UCWORD_in_value656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_in_value660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_value664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_literals674 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_COMMA_in_literals677 = new BitSet(new long[]{0x0FE0220000008840L,0x0000000000000100L});
    public static final BitSet FOLLOW_literal_in_literals679 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_NEWLINE_in_literal699 = new BitSet(new long[]{0x0CE0000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_metadata_in_literal704 = new BitSet(new long[]{0x0CC0000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_relation_in_literal709 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_guard_in_literal713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_literal735 = new BitSet(new long[]{0x0FE0220000008040L,0x0000000000000100L});
    public static final BitSet FOLLOW_metadata_in_literal740 = new BitSet(new long[]{0x0FE0220000008040L,0x0000000000000100L});
    public static final BitSet FOLLOW_semantic_attachment_in_literal743 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_guard_in_literal747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_literal769 = new BitSet(new long[]{0x0CE0000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_metadata_in_literal772 = new BitSet(new long[]{0x0CE0000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_function_call_in_literal775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_literal793 = new BitSet(new long[]{0x0FE0220000008840L,0x0000000000000100L});
    public static final BitSet FOLLOW_cut_in_literal796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CUT_in_cut812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_not_equal_in_binary_operator821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_binary_operator825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_binary_operator829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LE_in_binary_operator833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GE_in_binary_operator837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_predicate_in_relation849 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_OPEN_in_relation851 = new BitSet(new long[]{0x0FE022000000A040L,0x0000000000000300L});
    public static final BitSet FOLLOW_list_body_in_relation853 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_CLOSE_in_relation855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BRA_in_guard874 = new BitSet(new long[]{0x0FE0220000008840L,0x0000000000000100L});
    public static final BitSet FOLLOW_literals_in_guard876 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_KET_in_guard878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terms_in_list_body899 = new BitSet(new long[]{0x0020000000004002L});
    public static final BitSet FOLLOW_BAR_in_list_body902 = new BitSet(new long[]{0x0FC0220000008040L,0x0000000000000100L});
    public static final BitSet FOLLOW_list_tail_in_list_body904 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_list_body910 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_terms0_in_list_body0935 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_BAR_in_list_body0938 = new BitSet(new long[]{0x0FC0220000008040L,0x0000000000000100L});
    public static final BitSet FOLLOW_list_tail_in_list_body0940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_list_tail963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prova_list_in_list_tail967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_left_term977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_left_term984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_left_term990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prova_list_in_left_term996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_right_term1007 = new BitSet(new long[]{0x0CC0220000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_constant_in_right_term1011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_right_term1015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_right_term1021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prova_list_in_right_term1025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prova_map_in_right_term1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_prova_map1039 = new BitSet(new long[]{0x0CC0000000000200L,0x0000000000000500L});
    public static final BitSet FOLLOW_key_value_in_prova_map1041 = new BitSet(new long[]{0x0000000000000200L,0x0000000000000400L});
    public static final BitSet FOLLOW_COMMA_in_prova_map1045 = new BitSet(new long[]{0x0CC0000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_key_value_in_prova_map1047 = new BitSet(new long[]{0x0000000000000200L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_prova_map1051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mstring_in_key_value1071 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000880L});
    public static final BitSet FOLLOW_75_in_key_value1074 = new BitSet(new long[]{0x0FC0220000008040L,0x0000000000000300L});
    public static final BitSet FOLLOW_71_in_key_value1076 = new BitSet(new long[]{0x0FC0220000008040L,0x0000000000000300L});
    public static final BitSet FOLLOW_term_in_key_value1079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_terms1102 = new BitSet(new long[]{0x0FE0220000008040L,0x0000000000000300L});
    public static final BitSet FOLLOW_term_in_terms1105 = new BitSet(new long[]{0x0020000000000202L});
    public static final BitSet FOLLOW_NEWLINE_in_terms1108 = new BitSet(new long[]{0x0020000000000200L});
    public static final BitSet FOLLOW_COMMA_in_terms1111 = new BitSet(new long[]{0x0FE0220000008040L,0x0000000000000300L});
    public static final BitSet FOLLOW_NEWLINE_in_terms1113 = new BitSet(new long[]{0x0FE0220000008040L,0x0000000000000300L});
    public static final BitSet FOLLOW_term_in_terms1116 = new BitSet(new long[]{0x0020000000000202L});
    public static final BitSet FOLLOW_term_in_terms01136 = new BitSet(new long[]{0x0FC0220000008042L,0x0000000000000300L});
    public static final BitSet FOLLOW_left_term_in_term1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_func_term_in_term1158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prova_map_in_term1162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_func_in_func_term1171 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_args_in_func_term1173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCWORD_in_qualified_java_class1186 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_DOT_in_qualified_java_class1188 = new BitSet(new long[]{0x00C0000000000000L});
    public static final BitSet FOLLOW_UCWORD_in_qualified_java_class1192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BRA_in_prova_list1220 = new BitSet(new long[]{0x0FE0220000018040L,0x0000000000000300L});
    public static final BitSet FOLLOW_list_body_in_prova_list1222 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_KET_in_prova_list1224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_in_args1241 = new BitSet(new long[]{0x0FE022000000A040L,0x0000000000000300L});
    public static final BitSet FOLLOW_list_body_in_args1243 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_CLOSE_in_args1245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_predicate_java_call_in_semantic_attachment1263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_binary_operation_in_semantic_attachment1267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_left_term_in_binary_operation1276 = new BitSet(new long[]{0x0000000000FE0000L});
    public static final BitSet FOLLOW_EQUAL_in_binary_operation1282 = new BitSet(new long[]{0x0FC0220000009040L,0x0000000000000100L});
    public static final BitSet FOLLOW_constructor_java_call_in_binary_operation1292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prova_list_in_binary_operation1299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_binary_operation1306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_binary_operation1313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_not_equal_in_binary_operation1324 = new BitSet(new long[]{0x0CC0000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_constant_in_binary_operation1326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_binary_operator_in_binary_operation1332 = new BitSet(new long[]{0x0FC0220000009040L,0x0000000000000100L});
    public static final BitSet FOLLOW_expr_in_binary_operation1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_aterm_in_expr1346 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_set_in_expr1349 = new BitSet(new long[]{0x0FC0220000009040L,0x0000000000000100L});
    public static final BitSet FOLLOW_expr_in_expr1357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_aterm1369 = new BitSet(new long[]{0x0CC0220000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_variable_in_aterm1372 = new BitSet(new long[]{0x0000100000000182L});
    public static final BitSet FOLLOW_number_in_aterm1376 = new BitSet(new long[]{0x0000100000000182L});
    public static final BitSet FOLLOW_MINUS_in_aterm1380 = new BitSet(new long[]{0x0CC0220000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_predicate_java_call_in_aterm1383 = new BitSet(new long[]{0x0000100000000182L});
    public static final BitSet FOLLOW_OPEN_in_aterm1387 = new BitSet(new long[]{0x0FC0220000009040L,0x0000000000000100L});
    public static final BitSet FOLLOW_expr_in_aterm1389 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_CLOSE_in_aterm1391 = new BitSet(new long[]{0x0000100000000182L});
    public static final BitSet FOLLOW_set_in_aterm1395 = new BitSet(new long[]{0x0FC0220000009040L,0x0000000000000100L});
    public static final BitSet FOLLOW_aterm_in_aterm1409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualified_java_class_in_constructor_java_call1421 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_UCWORD_in_constructor_java_call1425 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_args_in_constructor_java_call1428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_static_java_call_in_predicate_java_call1439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instance_java_call_in_predicate_java_call1443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instance_call_in_instance_java_call1454 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_args_in_instance_java_call1456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_static_call_in_static_java_call1477 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_args_in_static_java_call1479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCWORD_in_method1500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCWORD_in_func1508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UCWORD_in_func1512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_in_func1516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typed_variable_in_func1520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCWORD_in_predicate1530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UCWORD_in_predicate1534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_in_predicate1538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UCWORD_in_variable1545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USWORD_in_variable1549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typed_variable_in_variable1553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOLLARWORD_in_variable1557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_variable_or_number1567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_variable_or_number1571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_word0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualified_java_class_in_typed_variable1598 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_DOT_in_typed_variable1600 = new BitSet(new long[]{0x00C0000000000000L});
    public static final BitSet FOLLOW_word_in_typed_variable1602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UCWORD_in_typed_variable1618 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_DOT_in_typed_variable1620 = new BitSet(new long[]{0x00C0000000000000L});
    public static final BitSet FOLLOW_word_in_typed_variable1622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_instance_call1644 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_DOT_in_instance_call1646 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_LCWORD_in_instance_call1648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualified_java_class_in_static_call1666 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_DOT_in_static_call1668 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_LCWORD_in_static_call1670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_LITERAL_in_pos_number1686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONG_LITERAL_in_pos_number1690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_float_literal_in_pos_number1694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_number1705 = new BitSet(new long[]{0x0300000000000040L});
    public static final BitSet FOLLOW_pos_number_in_number1709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCWORD_in_mstring1719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_in_mstring1723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCWORD_in_constant1733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_in_constant1737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualified_java_class_in_constant1741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_string0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_not_equal0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_LITERAL_in_float_literal1777 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_DOT_in_float_literal1779 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_INT_LITERAL_in_float_literal1781 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_EXPONENT_in_float_literal1783 = new BitSet(new long[]{0x0000000000000002L});

}