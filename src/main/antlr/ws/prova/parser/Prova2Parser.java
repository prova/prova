// $ANTLR 3.2 Sep 23, 2009 12:02:23 D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g 2010-10-29 19:34:09

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "DOT", "PLUS", "MINUS", "MULT", "DIV", "COMMA", "IF", "CUT", "OPEN", "CLOSE", "BAR", "BRA", "KET", "EQUAL", "NOT_EQUAL1", "NOT_EQUAL2", "LT", "GT", "LE", "GE", "CLAUSE", "RULEBASE", "STATEMENT", "QUERY", "LITERAL", "METADATA", "RELATION", "SEMANTIC_ATTACHMENT", "ARITHMETIC_RELATION", "PREDICATE", "TERM", "INSTANCE_JAVA_CALL", "STATIC_JAVA_CALL", "LIST_BODY", "PROVA_LIST", "ARGS", "TYPED_VARIABLE", "USWORD", "QUALIFIED_JAVA_CLASS", "ANNOTATION", "REM", "DOLLARWORD", "GUARD", "ATERM", "EXPR", "PROVA_MAP", "KEY_VALUE", "FUNCTION", "NEWLINE", "LCWORD", "UCWORD", "INT_LITERAL", "LONG_LITERAL", "STRING1", "STRING2", "EXPONENT", "DIGIT", "LC", "UC", "WORD", "DOLLAR", "UNDERSCORE", "ML_COMMENT", "WS", "CLEAN_STRING", "CHAR_ESC", "':'", "'@'", "'{'", "'}'", "'->'"
    };
    public static final int DOLLAR=64;
    public static final int FUNCTION=51;
    public static final int TERM=34;
    public static final int EXPONENT=59;
    public static final int LT=20;
    public static final int TYPED_VARIABLE=40;
    public static final int RULEBASE=25;
    public static final int ANNOTATION=43;
    public static final int EOF=-1;
    public static final int PREDICATE=33;
    public static final int STATEMENT=26;
    public static final int IF=10;
    public static final int WORD=63;
    public static final int ML_COMMENT=66;
    public static final int EXPR=48;
    public static final int COMMA=9;
    public static final int STRING2=58;
    public static final int STRING1=57;
    public static final int EQUAL=17;
    public static final int ARGS=39;
    public static final int UC=62;
    public static final int PLUS=5;
    public static final int DIGIT=60;
    public static final int CLAUSE=24;
    public static final int DOT=4;
    public static final int PROVA_MAP=49;
    public static final int ATERM=47;
    public static final int DOLLARWORD=45;
    public static final int GE=23;
    public static final int INT_LITERAL=55;
    public static final int SEMANTIC_ATTACHMENT=31;
    public static final int KEY_VALUE=50;
    public static final int CHAR_ESC=69;
    public static final int KET=16;
    public static final int RELATION=30;
    public static final int STATIC_JAVA_CALL=36;
    public static final int UNDERSCORE=65;
    public static final int LITERAL=28;
    public static final int USWORD=41;
    public static final int REM=44;
    public static final int MULT=7;
    public static final int MINUS=6;
    public static final int LONG_LITERAL=56;
    public static final int PROVA_LIST=38;
    public static final int LCWORD=53;
    public static final int CUT=11;
    public static final int OPEN=12;
    public static final int QUALIFIED_JAVA_CLASS=42;
    public static final int WS=67;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int NEWLINE=52;
    public static final int CLOSE=13;
    public static final int T__70=70;
    public static final int UCWORD=54;
    public static final int LIST_BODY=37;
    public static final int CLEAN_STRING=68;
    public static final int LC=61;
    public static final int GT=21;
    public static final int QUERY=27;
    public static final int GUARD=46;
    public static final int ARITHMETIC_RELATION=32;
    public static final int DIV=8;
    public static final int METADATA=29;
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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:87:1: rulebase : ( statement )* ( NEWLINE )* EOF -> ^( RULEBASE ( statement )* ) ;
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
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:88:2: ( ( statement )* ( NEWLINE )* EOF -> ^( RULEBASE ( statement )* ) )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:88:4: ( statement )* ( NEWLINE )* EOF
            {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:88:4: ( statement )*
            loop1:
            do {
                int alt1=2;
                alt1 = dfa1.predict(input);
                switch (alt1) {
            	case 1 :
            	    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:88:4: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_rulebase339);
            	    statement1=statement();

            	    state._fsp--;

            	    stream_statement.add(statement1.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:88:15: ( NEWLINE )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==NEWLINE) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:88:15: NEWLINE
            	    {
            	    NEWLINE2=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_rulebase342);  
            	    stream_NEWLINE.add(NEWLINE2);


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            EOF3=(Token)match(input,EOF,FOLLOW_EOF_in_rulebase345);  
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
            // 88:27: -> ^( RULEBASE ( statement )* )
            {
                // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:88:30: ^( RULEBASE ( statement )* )
                {
                ProvaAST root_1 = (ProvaAST)adaptor.nil();
                root_1 = (ProvaAST)adaptor.becomeRoot((ProvaAST)adaptor.create(RULEBASE, "RULEBASE"), root_1);

                // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:88:41: ( statement )*
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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:90:1: statement : ( NEWLINE )* stat end_of_statement -> ^( STATEMENT stat ) ;
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
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:91:2: ( ( NEWLINE )* stat end_of_statement -> ^( STATEMENT stat ) )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:91:4: ( NEWLINE )* stat end_of_statement
            {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:91:4: ( NEWLINE )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==NEWLINE) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:91:4: NEWLINE
            	    {
            	    NEWLINE4=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_statement363);  
            	    stream_NEWLINE.add(NEWLINE4);


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            pushFollow(FOLLOW_stat_in_statement366);
            stat5=stat();

            state._fsp--;

            stream_stat.add(stat5.getTree());
            pushFollow(FOLLOW_end_of_statement_in_statement368);
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
            // 91:35: -> ^( STATEMENT stat )
            {
                // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:91:38: ^( STATEMENT stat )
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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:93:1: end_of_statement : ( NEWLINE )* DOT ( NEWLINE | EOF ) ;
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
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:94:2: ( ( NEWLINE )* DOT ( NEWLINE | EOF ) )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:94:4: ( NEWLINE )* DOT ( NEWLINE | EOF )
            {
            root_0 = (ProvaAST)adaptor.nil();

            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:94:4: ( NEWLINE )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==NEWLINE) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:94:4: NEWLINE
            	    {
            	    NEWLINE7=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_end_of_statement385); 
            	    NEWLINE7_tree = (ProvaAST)adaptor.create(NEWLINE7);
            	    adaptor.addChild(root_0, NEWLINE7_tree);


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            DOT8=(Token)match(input,DOT,FOLLOW_DOT_in_end_of_statement388); 
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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:96:1: stat : ( clause | query | function );
    public final Prova2Parser.stat_return stat() throws RecognitionException {
        Prova2Parser.stat_return retval = new Prova2Parser.stat_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Prova2Parser.clause_return clause10 = null;

        Prova2Parser.query_return query11 = null;

        Prova2Parser.function_return function12 = null;



        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:96:7: ( clause | query | function )
            int alt5=3;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:96:9: clause
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_clause_in_stat407);
                    clause10=clause();

                    state._fsp--;

                    adaptor.addChild(root_0, clause10.getTree());

                    }
                    break;
                case 2 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:97:5: query
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_query_in_stat413);
                    query11=query();

                    state._fsp--;

                    adaptor.addChild(root_0, query11.getTree());

                    }
                    break;
                case 3 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:98:5: function
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_function_in_stat419);
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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:100:1: function : ( metadata )? LCWORD list_body ':' list_body0 ( '=' literals )? -> ^( CLAUSE ( metadata )? LCWORD list_body list_body0 ( literals )? ) ;
    public final Prova2Parser.function_return function() throws RecognitionException {
        Prova2Parser.function_return retval = new Prova2Parser.function_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token LCWORD14=null;
        Token char_literal16=null;
        Token char_literal18=null;
        Prova2Parser.metadata_return metadata13 = null;

        Prova2Parser.list_body_return list_body15 = null;

        Prova2Parser.list_body0_return list_body017 = null;

        Prova2Parser.literals_return literals19 = null;


        ProvaAST LCWORD14_tree=null;
        ProvaAST char_literal16_tree=null;
        ProvaAST char_literal18_tree=null;
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleTokenStream stream_LCWORD=new RewriteRuleTokenStream(adaptor,"token LCWORD");
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleSubtreeStream stream_list_body0=new RewriteRuleSubtreeStream(adaptor,"rule list_body0");
        RewriteRuleSubtreeStream stream_literals=new RewriteRuleSubtreeStream(adaptor,"rule literals");
        RewriteRuleSubtreeStream stream_metadata=new RewriteRuleSubtreeStream(adaptor,"rule metadata");
        RewriteRuleSubtreeStream stream_list_body=new RewriteRuleSubtreeStream(adaptor,"rule list_body");
        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:101:2: ( ( metadata )? LCWORD list_body ':' list_body0 ( '=' literals )? -> ^( CLAUSE ( metadata )? LCWORD list_body list_body0 ( literals )? ) )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:101:4: ( metadata )? LCWORD list_body ':' list_body0 ( '=' literals )?
            {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:101:4: ( metadata )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==71) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:101:4: metadata
                    {
                    pushFollow(FOLLOW_metadata_in_function429);
                    metadata13=metadata();

                    state._fsp--;

                    stream_metadata.add(metadata13.getTree());

                    }
                    break;

            }

            LCWORD14=(Token)match(input,LCWORD,FOLLOW_LCWORD_in_function432);  
            stream_LCWORD.add(LCWORD14);

            pushFollow(FOLLOW_list_body_in_function434);
            list_body15=list_body();

            state._fsp--;

            stream_list_body.add(list_body15.getTree());
            char_literal16=(Token)match(input,70,FOLLOW_70_in_function436);  
            stream_70.add(char_literal16);

            pushFollow(FOLLOW_list_body0_in_function438);
            list_body017=list_body0();

            state._fsp--;

            stream_list_body0.add(list_body017.getTree());
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:101:46: ( '=' literals )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==EQUAL) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:101:47: '=' literals
                    {
                    char_literal18=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_function441);  
                    stream_EQUAL.add(char_literal18);

                    pushFollow(FOLLOW_literals_in_function443);
                    literals19=literals();

                    state._fsp--;

                    stream_literals.add(literals19.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: literals, metadata, list_body0, LCWORD, list_body
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ProvaAST)adaptor.nil();
            // 101:62: -> ^( CLAUSE ( metadata )? LCWORD list_body list_body0 ( literals )? )
            {
                // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:101:65: ^( CLAUSE ( metadata )? LCWORD list_body list_body0 ( literals )? )
                {
                ProvaAST root_1 = (ProvaAST)adaptor.nil();
                root_1 = (ProvaAST)adaptor.becomeRoot((ProvaAST)adaptor.create(CLAUSE, "CLAUSE"), root_1);

                // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:101:74: ( metadata )?
                if ( stream_metadata.hasNext() ) {
                    adaptor.addChild(root_1, stream_metadata.nextTree());

                }
                stream_metadata.reset();
                adaptor.addChild(root_1, stream_LCWORD.nextNode());
                adaptor.addChild(root_1, stream_list_body.nextTree());
                adaptor.addChild(root_1, stream_list_body0.nextTree());
                // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:101:112: ( literals )?
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

    public static class query_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "query"
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:103:1: query : IF ( NEWLINE )* query_predicate ( NEWLINE )* '(' ( NEWLINE )* relation ( NEWLINE )* ')' -> ^( QUERY query_predicate relation ) ;
    public final Prova2Parser.query_return query() throws RecognitionException {
        Prova2Parser.query_return retval = new Prova2Parser.query_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token IF20=null;
        Token NEWLINE21=null;
        Token NEWLINE23=null;
        Token char_literal24=null;
        Token NEWLINE25=null;
        Token NEWLINE27=null;
        Token char_literal28=null;
        Prova2Parser.query_predicate_return query_predicate22 = null;

        Prova2Parser.relation_return relation26 = null;


        ProvaAST IF20_tree=null;
        ProvaAST NEWLINE21_tree=null;
        ProvaAST NEWLINE23_tree=null;
        ProvaAST char_literal24_tree=null;
        ProvaAST NEWLINE25_tree=null;
        ProvaAST NEWLINE27_tree=null;
        ProvaAST char_literal28_tree=null;
        RewriteRuleTokenStream stream_OPEN=new RewriteRuleTokenStream(adaptor,"token OPEN");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_CLOSE=new RewriteRuleTokenStream(adaptor,"token CLOSE");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_query_predicate=new RewriteRuleSubtreeStream(adaptor,"rule query_predicate");
        RewriteRuleSubtreeStream stream_relation=new RewriteRuleSubtreeStream(adaptor,"rule relation");
        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:103:8: ( IF ( NEWLINE )* query_predicate ( NEWLINE )* '(' ( NEWLINE )* relation ( NEWLINE )* ')' -> ^( QUERY query_predicate relation ) )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:103:10: IF ( NEWLINE )* query_predicate ( NEWLINE )* '(' ( NEWLINE )* relation ( NEWLINE )* ')'
            {
            IF20=(Token)match(input,IF,FOLLOW_IF_in_query472);  
            stream_IF.add(IF20);

            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:103:13: ( NEWLINE )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==NEWLINE) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:103:13: NEWLINE
            	    {
            	    NEWLINE21=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_query474);  
            	    stream_NEWLINE.add(NEWLINE21);


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            pushFollow(FOLLOW_query_predicate_in_query477);
            query_predicate22=query_predicate();

            state._fsp--;

            stream_query_predicate.add(query_predicate22.getTree());
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:103:38: ( NEWLINE )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==NEWLINE) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:103:38: NEWLINE
            	    {
            	    NEWLINE23=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_query479);  
            	    stream_NEWLINE.add(NEWLINE23);


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            char_literal24=(Token)match(input,OPEN,FOLLOW_OPEN_in_query482);  
            stream_OPEN.add(char_literal24);

            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:103:51: ( NEWLINE )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==NEWLINE) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:103:51: NEWLINE
            	    {
            	    NEWLINE25=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_query484);  
            	    stream_NEWLINE.add(NEWLINE25);


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            pushFollow(FOLLOW_relation_in_query487);
            relation26=relation();

            state._fsp--;

            stream_relation.add(relation26.getTree());
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:103:69: ( NEWLINE )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==NEWLINE) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:103:69: NEWLINE
            	    {
            	    NEWLINE27=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_query489);  
            	    stream_NEWLINE.add(NEWLINE27);


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            char_literal28=(Token)match(input,CLOSE,FOLLOW_CLOSE_in_query492);  
            stream_CLOSE.add(char_literal28);



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
            // 103:82: -> ^( QUERY query_predicate relation )
            {
                // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:103:85: ^( QUERY query_predicate relation )
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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:105:1: query_predicate : constant ;
    public final Prova2Parser.query_predicate_return query_predicate() throws RecognitionException {
        Prova2Parser.query_predicate_return retval = new Prova2Parser.query_predicate_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Prova2Parser.constant_return constant29 = null;



        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:106:2: ( constant )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:106:4: constant
            {
            root_0 = (ProvaAST)adaptor.nil();

            pushFollow(FOLLOW_constant_in_query_predicate512);
            constant29=constant();

            state._fsp--;

            adaptor.addChild(root_0, constant29.getTree());

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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:108:1: clause : ( metadata )? relation ( IF literals )? -> ^( CLAUSE ( metadata )? relation ( literals )? ) ;
    public final Prova2Parser.clause_return clause() throws RecognitionException {
        Prova2Parser.clause_return retval = new Prova2Parser.clause_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token IF32=null;
        Prova2Parser.metadata_return metadata30 = null;

        Prova2Parser.relation_return relation31 = null;

        Prova2Parser.literals_return literals33 = null;


        ProvaAST IF32_tree=null;
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_literals=new RewriteRuleSubtreeStream(adaptor,"rule literals");
        RewriteRuleSubtreeStream stream_relation=new RewriteRuleSubtreeStream(adaptor,"rule relation");
        RewriteRuleSubtreeStream stream_metadata=new RewriteRuleSubtreeStream(adaptor,"rule metadata");
        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:108:9: ( ( metadata )? relation ( IF literals )? -> ^( CLAUSE ( metadata )? relation ( literals )? ) )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:108:11: ( metadata )? relation ( IF literals )?
            {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:108:11: ( metadata )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==71) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:108:11: metadata
                    {
                    pushFollow(FOLLOW_metadata_in_clause521);
                    metadata30=metadata();

                    state._fsp--;

                    stream_metadata.add(metadata30.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_relation_in_clause524);
            relation31=relation();

            state._fsp--;

            stream_relation.add(relation31.getTree());
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:108:30: ( IF literals )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==IF) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:108:31: IF literals
                    {
                    IF32=(Token)match(input,IF,FOLLOW_IF_in_clause527);  
                    stream_IF.add(IF32);

                    pushFollow(FOLLOW_literals_in_clause529);
                    literals33=literals();

                    state._fsp--;

                    stream_literals.add(literals33.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: metadata, relation, literals
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ProvaAST)adaptor.nil();
            // 108:45: -> ^( CLAUSE ( metadata )? relation ( literals )? )
            {
                // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:108:48: ^( CLAUSE ( metadata )? relation ( literals )? )
                {
                ProvaAST root_1 = (ProvaAST)adaptor.nil();
                root_1 = (ProvaAST)adaptor.becomeRoot((ProvaAST)adaptor.create(CLAUSE, "CLAUSE"), root_1);

                // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:108:57: ( metadata )?
                if ( stream_metadata.hasNext() ) {
                    adaptor.addChild(root_1, stream_metadata.nextTree());

                }
                stream_metadata.reset();
                adaptor.addChild(root_1, stream_relation.nextTree());
                // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:108:76: ( literals )?
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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:110:1: metadata : ( annotation ( NEWLINE )* )+ -> ^( METADATA ( annotation )+ ) ;
    public final Prova2Parser.metadata_return metadata() throws RecognitionException {
        Prova2Parser.metadata_return retval = new Prova2Parser.metadata_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token NEWLINE35=null;
        Prova2Parser.annotation_return annotation34 = null;


        ProvaAST NEWLINE35_tree=null;
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleSubtreeStream stream_annotation=new RewriteRuleSubtreeStream(adaptor,"rule annotation");
        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:111:2: ( ( annotation ( NEWLINE )* )+ -> ^( METADATA ( annotation )+ ) )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:111:4: ( annotation ( NEWLINE )* )+
            {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:111:4: ( annotation ( NEWLINE )* )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==71) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:111:5: annotation ( NEWLINE )*
            	    {
            	    pushFollow(FOLLOW_annotation_in_metadata555);
            	    annotation34=annotation();

            	    state._fsp--;

            	    stream_annotation.add(annotation34.getTree());
            	    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:111:16: ( NEWLINE )*
            	    loop14:
            	    do {
            	        int alt14=2;
            	        int LA14_0 = input.LA(1);

            	        if ( (LA14_0==NEWLINE) ) {
            	            alt14=1;
            	        }


            	        switch (alt14) {
            	    	case 1 :
            	    	    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:111:16: NEWLINE
            	    	    {
            	    	    NEWLINE35=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_metadata557);  
            	    	    stream_NEWLINE.add(NEWLINE35);


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
            // 111:27: -> ^( METADATA ( annotation )+ )
            {
                // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:111:30: ^( METADATA ( annotation )+ )
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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:114:1: annotation : '@' LCWORD ( '(' value ( COMMA value )* ')' )? -> ^( ANNOTATION LCWORD ( value )* ) ;
    public final Prova2Parser.annotation_return annotation() throws RecognitionException {
        Prova2Parser.annotation_return retval = new Prova2Parser.annotation_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token char_literal36=null;
        Token LCWORD37=null;
        Token char_literal38=null;
        Token COMMA40=null;
        Token char_literal42=null;
        Prova2Parser.value_return value39 = null;

        Prova2Parser.value_return value41 = null;


        ProvaAST char_literal36_tree=null;
        ProvaAST LCWORD37_tree=null;
        ProvaAST char_literal38_tree=null;
        ProvaAST COMMA40_tree=null;
        ProvaAST char_literal42_tree=null;
        RewriteRuleTokenStream stream_OPEN=new RewriteRuleTokenStream(adaptor,"token OPEN");
        RewriteRuleTokenStream stream_CLOSE=new RewriteRuleTokenStream(adaptor,"token CLOSE");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleTokenStream stream_LCWORD=new RewriteRuleTokenStream(adaptor,"token LCWORD");
        RewriteRuleSubtreeStream stream_value=new RewriteRuleSubtreeStream(adaptor,"rule value");
        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:115:2: ( '@' LCWORD ( '(' value ( COMMA value )* ')' )? -> ^( ANNOTATION LCWORD ( value )* ) )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:115:4: '@' LCWORD ( '(' value ( COMMA value )* ')' )?
            {
            char_literal36=(Token)match(input,71,FOLLOW_71_in_annotation579);  
            stream_71.add(char_literal36);

            LCWORD37=(Token)match(input,LCWORD,FOLLOW_LCWORD_in_annotation581);  
            stream_LCWORD.add(LCWORD37);

            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:115:15: ( '(' value ( COMMA value )* ')' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==OPEN) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:115:16: '(' value ( COMMA value )* ')'
                    {
                    char_literal38=(Token)match(input,OPEN,FOLLOW_OPEN_in_annotation584);  
                    stream_OPEN.add(char_literal38);

                    pushFollow(FOLLOW_value_in_annotation586);
                    value39=value();

                    state._fsp--;

                    stream_value.add(value39.getTree());
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:115:26: ( COMMA value )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==COMMA) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:115:27: COMMA value
                    	    {
                    	    COMMA40=(Token)match(input,COMMA,FOLLOW_COMMA_in_annotation589);  
                    	    stream_COMMA.add(COMMA40);

                    	    pushFollow(FOLLOW_value_in_annotation591);
                    	    value41=value();

                    	    state._fsp--;

                    	    stream_value.add(value41.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    char_literal42=(Token)match(input,CLOSE,FOLLOW_CLOSE_in_annotation595);  
                    stream_CLOSE.add(char_literal42);


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
            // 115:47: -> ^( ANNOTATION LCWORD ( value )* )
            {
                // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:115:50: ^( ANNOTATION LCWORD ( value )* )
                {
                ProvaAST root_1 = (ProvaAST)adaptor.nil();
                root_1 = (ProvaAST)adaptor.becomeRoot((ProvaAST)adaptor.create(ANNOTATION, "ANNOTATION"), root_1);

                adaptor.addChild(root_1, stream_LCWORD.nextNode());
                // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:115:70: ( value )*
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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:118:1: value : ( LCWORD | UCWORD | string | number );
    public final Prova2Parser.value_return value() throws RecognitionException {
        Prova2Parser.value_return retval = new Prova2Parser.value_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token LCWORD43=null;
        Token UCWORD44=null;
        Prova2Parser.string_return string45 = null;

        Prova2Parser.number_return number46 = null;


        ProvaAST LCWORD43_tree=null;
        ProvaAST UCWORD44_tree=null;

        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:119:2: ( LCWORD | UCWORD | string | number )
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
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:119:4: LCWORD
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    LCWORD43=(Token)match(input,LCWORD,FOLLOW_LCWORD_in_value620); 
                    LCWORD43_tree = (ProvaAST)adaptor.create(LCWORD43);
                    adaptor.addChild(root_0, LCWORD43_tree);


                    }
                    break;
                case 2 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:119:13: UCWORD
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    UCWORD44=(Token)match(input,UCWORD,FOLLOW_UCWORD_in_value624); 
                    UCWORD44_tree = (ProvaAST)adaptor.create(UCWORD44);
                    adaptor.addChild(root_0, UCWORD44_tree);


                    }
                    break;
                case 3 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:119:22: string
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_string_in_value628);
                    string45=string();

                    state._fsp--;

                    adaptor.addChild(root_0, string45.getTree());

                    }
                    break;
                case 4 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:119:31: number
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_number_in_value632);
                    number46=number();

                    state._fsp--;

                    adaptor.addChild(root_0, number46.getTree());

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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:122:1: literals : literal ( COMMA literal )* -> ^( LITERAL ( literal )+ ) ;
    public final Prova2Parser.literals_return literals() throws RecognitionException {
        Prova2Parser.literals_return retval = new Prova2Parser.literals_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token COMMA48=null;
        Prova2Parser.literal_return literal47 = null;

        Prova2Parser.literal_return literal49 = null;


        ProvaAST COMMA48_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_literal=new RewriteRuleSubtreeStream(adaptor,"rule literal");
        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:122:11: ( literal ( COMMA literal )* -> ^( LITERAL ( literal )+ ) )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:122:13: literal ( COMMA literal )*
            {
            pushFollow(FOLLOW_literal_in_literals642);
            literal47=literal();

            state._fsp--;

            stream_literal.add(literal47.getTree());
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:122:21: ( COMMA literal )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==COMMA) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:122:22: COMMA literal
            	    {
            	    COMMA48=(Token)match(input,COMMA,FOLLOW_COMMA_in_literals645);  
            	    stream_COMMA.add(COMMA48);

            	    pushFollow(FOLLOW_literal_in_literals647);
            	    literal49=literal();

            	    state._fsp--;

            	    stream_literal.add(literal49.getTree());

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
            // 122:38: -> ^( LITERAL ( literal )+ )
            {
                // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:122:41: ^( LITERAL ( literal )+ )
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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:124:1: literal : ( ( NEWLINE )* (m= metadata )? r= relation (g= guard )? -> ^( RELATION ( metadata )? relation ( guard )? ) | ( NEWLINE )* (m= metadata )? semantic_attachment (g= guard )? -> ^( SEMANTIC_ATTACHMENT ( metadata )? semantic_attachment ( guard )? ) | ( NEWLINE )* cut -> ^( CUT cut ) );
    public final Prova2Parser.literal_return literal() throws RecognitionException {
        Prova2Parser.literal_return retval = new Prova2Parser.literal_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token NEWLINE50=null;
        Token NEWLINE51=null;
        Token NEWLINE53=null;
        Prova2Parser.metadata_return m = null;

        Prova2Parser.relation_return r = null;

        Prova2Parser.guard_return g = null;

        Prova2Parser.semantic_attachment_return semantic_attachment52 = null;

        Prova2Parser.cut_return cut54 = null;


        ProvaAST NEWLINE50_tree=null;
        ProvaAST NEWLINE51_tree=null;
        ProvaAST NEWLINE53_tree=null;
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleSubtreeStream stream_guard=new RewriteRuleSubtreeStream(adaptor,"rule guard");
        RewriteRuleSubtreeStream stream_relation=new RewriteRuleSubtreeStream(adaptor,"rule relation");
        RewriteRuleSubtreeStream stream_semantic_attachment=new RewriteRuleSubtreeStream(adaptor,"rule semantic_attachment");
        RewriteRuleSubtreeStream stream_cut=new RewriteRuleSubtreeStream(adaptor,"rule cut");
        RewriteRuleSubtreeStream stream_metadata=new RewriteRuleSubtreeStream(adaptor,"rule metadata");
        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:124:10: ( ( NEWLINE )* (m= metadata )? r= relation (g= guard )? -> ^( RELATION ( metadata )? relation ( guard )? ) | ( NEWLINE )* (m= metadata )? semantic_attachment (g= guard )? -> ^( SEMANTIC_ATTACHMENT ( metadata )? semantic_attachment ( guard )? ) | ( NEWLINE )* cut -> ^( CUT cut ) )
            int alt27=3;
            alt27 = dfa27.predict(input);
            switch (alt27) {
                case 1 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:124:12: ( NEWLINE )* (m= metadata )? r= relation (g= guard )?
                    {
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:124:12: ( NEWLINE )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==NEWLINE) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:124:12: NEWLINE
                    	    {
                    	    NEWLINE50=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_literal667);  
                    	    stream_NEWLINE.add(NEWLINE50);


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:124:22: (m= metadata )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==71) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:124:22: m= metadata
                            {
                            pushFollow(FOLLOW_metadata_in_literal672);
                            m=metadata();

                            state._fsp--;

                            stream_metadata.add(m.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_relation_in_literal677);
                    r=relation();

                    state._fsp--;

                    stream_relation.add(r.getTree());
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:124:45: (g= guard )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==BRA) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:124:45: g= guard
                            {
                            pushFollow(FOLLOW_guard_in_literal681);
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
                    // 124:53: -> ^( RELATION ( metadata )? relation ( guard )? )
                    {
                        // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:124:56: ^( RELATION ( metadata )? relation ( guard )? )
                        {
                        ProvaAST root_1 = (ProvaAST)adaptor.nil();
                        root_1 = (ProvaAST)adaptor.becomeRoot((ProvaAST)adaptor.create(RELATION, "RELATION"), root_1);

                        // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:124:67: ( metadata )?
                        if ( stream_metadata.hasNext() ) {
                            adaptor.addChild(root_1, stream_metadata.nextTree());

                        }
                        stream_metadata.reset();
                        adaptor.addChild(root_1, stream_relation.nextTree());
                        // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:124:86: ( guard )?
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
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:125:6: ( NEWLINE )* (m= metadata )? semantic_attachment (g= guard )?
                    {
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:125:6: ( NEWLINE )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==NEWLINE) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:125:6: NEWLINE
                    	    {
                    	    NEWLINE51=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_literal703);  
                    	    stream_NEWLINE.add(NEWLINE51);


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:125:16: (m= metadata )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==71) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:125:16: m= metadata
                            {
                            pushFollow(FOLLOW_metadata_in_literal708);
                            m=metadata();

                            state._fsp--;

                            stream_metadata.add(m.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_semantic_attachment_in_literal711);
                    semantic_attachment52=semantic_attachment();

                    state._fsp--;

                    stream_semantic_attachment.add(semantic_attachment52.getTree());
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:125:48: (g= guard )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==BRA) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:125:48: g= guard
                            {
                            pushFollow(FOLLOW_guard_in_literal715);
                            g=guard();

                            state._fsp--;

                            stream_guard.add(g.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: guard, metadata, semantic_attachment
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ProvaAST)adaptor.nil();
                    // 125:56: -> ^( SEMANTIC_ATTACHMENT ( metadata )? semantic_attachment ( guard )? )
                    {
                        // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:125:59: ^( SEMANTIC_ATTACHMENT ( metadata )? semantic_attachment ( guard )? )
                        {
                        ProvaAST root_1 = (ProvaAST)adaptor.nil();
                        root_1 = (ProvaAST)adaptor.becomeRoot((ProvaAST)adaptor.create(SEMANTIC_ATTACHMENT, "SEMANTIC_ATTACHMENT"), root_1);

                        // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:125:81: ( metadata )?
                        if ( stream_metadata.hasNext() ) {
                            adaptor.addChild(root_1, stream_metadata.nextTree());

                        }
                        stream_metadata.reset();
                        adaptor.addChild(root_1, stream_semantic_attachment.nextTree());
                        // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:125:111: ( guard )?
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
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:126:6: ( NEWLINE )* cut
                    {
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:126:6: ( NEWLINE )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==NEWLINE) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:126:6: NEWLINE
                    	    {
                    	    NEWLINE53=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_literal737);  
                    	    stream_NEWLINE.add(NEWLINE53);


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);

                    pushFollow(FOLLOW_cut_in_literal740);
                    cut54=cut();

                    state._fsp--;

                    stream_cut.add(cut54.getTree());


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
                    // 126:19: -> ^( CUT cut )
                    {
                        // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:126:22: ^( CUT cut )
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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:128:1: cut : CUT ;
    public final Prova2Parser.cut_return cut() throws RecognitionException {
        Prova2Parser.cut_return retval = new Prova2Parser.cut_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token CUT55=null;

        ProvaAST CUT55_tree=null;

        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:128:5: ( CUT )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:128:7: CUT
            {
            root_0 = (ProvaAST)adaptor.nil();

            CUT55=(Token)match(input,CUT,FOLLOW_CUT_in_cut756); 
            CUT55_tree = (ProvaAST)adaptor.create(CUT55);
            adaptor.addChild(root_0, CUT55_tree);


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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:130:1: binary_operator : ( not_equal | LT | GT | LE | GE );
    public final Prova2Parser.binary_operator_return binary_operator() throws RecognitionException {
        Prova2Parser.binary_operator_return retval = new Prova2Parser.binary_operator_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token LT57=null;
        Token GT58=null;
        Token LE59=null;
        Token GE60=null;
        Prova2Parser.not_equal_return not_equal56 = null;


        ProvaAST LT57_tree=null;
        ProvaAST GT58_tree=null;
        ProvaAST LE59_tree=null;
        ProvaAST GE60_tree=null;

        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:131:2: ( not_equal | LT | GT | LE | GE )
            int alt28=5;
            switch ( input.LA(1) ) {
            case NOT_EQUAL1:
            case NOT_EQUAL2:
                {
                alt28=1;
                }
                break;
            case LT:
                {
                alt28=2;
                }
                break;
            case GT:
                {
                alt28=3;
                }
                break;
            case LE:
                {
                alt28=4;
                }
                break;
            case GE:
                {
                alt28=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:131:4: not_equal
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_not_equal_in_binary_operator765);
                    not_equal56=not_equal();

                    state._fsp--;

                    adaptor.addChild(root_0, not_equal56.getTree());

                    }
                    break;
                case 2 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:131:16: LT
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    LT57=(Token)match(input,LT,FOLLOW_LT_in_binary_operator769); 
                    LT57_tree = (ProvaAST)adaptor.create(LT57);
                    adaptor.addChild(root_0, LT57_tree);


                    }
                    break;
                case 3 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:131:21: GT
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    GT58=(Token)match(input,GT,FOLLOW_GT_in_binary_operator773); 
                    GT58_tree = (ProvaAST)adaptor.create(GT58);
                    adaptor.addChild(root_0, GT58_tree);


                    }
                    break;
                case 4 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:131:26: LE
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    LE59=(Token)match(input,LE,FOLLOW_LE_in_binary_operator777); 
                    LE59_tree = (ProvaAST)adaptor.create(LE59);
                    adaptor.addChild(root_0, LE59_tree);


                    }
                    break;
                case 5 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:131:31: GE
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    GE60=(Token)match(input,GE,FOLLOW_GE_in_binary_operator781); 
                    GE60_tree = (ProvaAST)adaptor.create(GE60);
                    adaptor.addChild(root_0, GE60_tree);


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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:134:1: relation : predicate '(' list_body ')' -> ^( PREDICATE predicate list_body ) ;
    public final Prova2Parser.relation_return relation() throws RecognitionException {
        Prova2Parser.relation_return retval = new Prova2Parser.relation_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token char_literal62=null;
        Token char_literal64=null;
        Prova2Parser.predicate_return predicate61 = null;

        Prova2Parser.list_body_return list_body63 = null;


        ProvaAST char_literal62_tree=null;
        ProvaAST char_literal64_tree=null;
        RewriteRuleTokenStream stream_OPEN=new RewriteRuleTokenStream(adaptor,"token OPEN");
        RewriteRuleTokenStream stream_CLOSE=new RewriteRuleTokenStream(adaptor,"token CLOSE");
        RewriteRuleSubtreeStream stream_predicate=new RewriteRuleSubtreeStream(adaptor,"rule predicate");
        RewriteRuleSubtreeStream stream_list_body=new RewriteRuleSubtreeStream(adaptor,"rule list_body");
        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:135:2: ( predicate '(' list_body ')' -> ^( PREDICATE predicate list_body ) )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:135:4: predicate '(' list_body ')'
            {
            pushFollow(FOLLOW_predicate_in_relation793);
            predicate61=predicate();

            state._fsp--;

            stream_predicate.add(predicate61.getTree());
            char_literal62=(Token)match(input,OPEN,FOLLOW_OPEN_in_relation795);  
            stream_OPEN.add(char_literal62);

            pushFollow(FOLLOW_list_body_in_relation797);
            list_body63=list_body();

            state._fsp--;

            stream_list_body.add(list_body63.getTree());
            char_literal64=(Token)match(input,CLOSE,FOLLOW_CLOSE_in_relation799);  
            stream_CLOSE.add(char_literal64);



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
            // 135:32: -> ^( PREDICATE predicate list_body )
            {
                // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:135:35: ^( PREDICATE predicate list_body )
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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:137:1: guard : '[' literals ']' -> ^( GUARD literals ) ;
    public final Prova2Parser.guard_return guard() throws RecognitionException {
        Prova2Parser.guard_return retval = new Prova2Parser.guard_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token char_literal65=null;
        Token char_literal67=null;
        Prova2Parser.literals_return literals66 = null;


        ProvaAST char_literal65_tree=null;
        ProvaAST char_literal67_tree=null;
        RewriteRuleTokenStream stream_BRA=new RewriteRuleTokenStream(adaptor,"token BRA");
        RewriteRuleTokenStream stream_KET=new RewriteRuleTokenStream(adaptor,"token KET");
        RewriteRuleSubtreeStream stream_literals=new RewriteRuleSubtreeStream(adaptor,"rule literals");
        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:138:2: ( '[' literals ']' -> ^( GUARD literals ) )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:138:4: '[' literals ']'
            {
            char_literal65=(Token)match(input,BRA,FOLLOW_BRA_in_guard818);  
            stream_BRA.add(char_literal65);

            pushFollow(FOLLOW_literals_in_guard820);
            literals66=literals();

            state._fsp--;

            stream_literals.add(literals66.getTree());
            char_literal67=(Token)match(input,KET,FOLLOW_KET_in_guard822);  
            stream_KET.add(char_literal67);



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
            // 138:21: -> ^( GUARD literals )
            {
                // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:138:24: ^( GUARD literals )
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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:141:1: list_body : ( terms ( '|' list_tail )? )? ( NEWLINE )* -> ^( LIST_BODY ( terms ( list_tail )? )? ) ;
    public final Prova2Parser.list_body_return list_body() throws RecognitionException {
        Prova2Parser.list_body_return retval = new Prova2Parser.list_body_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token char_literal69=null;
        Token NEWLINE71=null;
        Prova2Parser.terms_return terms68 = null;

        Prova2Parser.list_tail_return list_tail70 = null;


        ProvaAST char_literal69_tree=null;
        ProvaAST NEWLINE71_tree=null;
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_BAR=new RewriteRuleTokenStream(adaptor,"token BAR");
        RewriteRuleSubtreeStream stream_terms=new RewriteRuleSubtreeStream(adaptor,"rule terms");
        RewriteRuleSubtreeStream stream_list_tail=new RewriteRuleSubtreeStream(adaptor,"rule list_tail");
        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:142:3: ( ( terms ( '|' list_tail )? )? ( NEWLINE )* -> ^( LIST_BODY ( terms ( list_tail )? )? ) )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:142:5: ( terms ( '|' list_tail )? )? ( NEWLINE )*
            {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:142:5: ( terms ( '|' list_tail )? )?
            int alt30=2;
            alt30 = dfa30.predict(input);
            switch (alt30) {
                case 1 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:142:6: terms ( '|' list_tail )?
                    {
                    pushFollow(FOLLOW_terms_in_list_body843);
                    terms68=terms();

                    state._fsp--;

                    stream_terms.add(terms68.getTree());
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:142:12: ( '|' list_tail )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==BAR) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:142:13: '|' list_tail
                            {
                            char_literal69=(Token)match(input,BAR,FOLLOW_BAR_in_list_body846);  
                            stream_BAR.add(char_literal69);

                            pushFollow(FOLLOW_list_tail_in_list_body848);
                            list_tail70=list_tail();

                            state._fsp--;

                            stream_list_tail.add(list_tail70.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }

            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:142:31: ( NEWLINE )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==NEWLINE) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:142:31: NEWLINE
            	    {
            	    NEWLINE71=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_list_body854);  
            	    stream_NEWLINE.add(NEWLINE71);


            	    }
            	    break;

            	default :
            	    break loop31;
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
            // 142:40: -> ^( LIST_BODY ( terms ( list_tail )? )? )
            {
                // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:142:43: ^( LIST_BODY ( terms ( list_tail )? )? )
                {
                ProvaAST root_1 = (ProvaAST)adaptor.nil();
                root_1 = (ProvaAST)adaptor.becomeRoot((ProvaAST)adaptor.create(LIST_BODY, "LIST_BODY"), root_1);

                // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:142:55: ( terms ( list_tail )? )?
                if ( stream_terms.hasNext()||stream_list_tail.hasNext() ) {
                    adaptor.addChild(root_1, stream_terms.nextTree());
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:142:62: ( list_tail )?
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

    public static class list_body0_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "list_body0"
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:144:1: list_body0 : ( terms ( '|' list_tail )? )? -> ^( LIST_BODY ( terms ( list_tail )? )? ) ;
    public final Prova2Parser.list_body0_return list_body0() throws RecognitionException {
        Prova2Parser.list_body0_return retval = new Prova2Parser.list_body0_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token char_literal73=null;
        Prova2Parser.terms_return terms72 = null;

        Prova2Parser.list_tail_return list_tail74 = null;


        ProvaAST char_literal73_tree=null;
        RewriteRuleTokenStream stream_BAR=new RewriteRuleTokenStream(adaptor,"token BAR");
        RewriteRuleSubtreeStream stream_terms=new RewriteRuleSubtreeStream(adaptor,"rule terms");
        RewriteRuleSubtreeStream stream_list_tail=new RewriteRuleSubtreeStream(adaptor,"rule list_tail");
        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:145:3: ( ( terms ( '|' list_tail )? )? -> ^( LIST_BODY ( terms ( list_tail )? )? ) )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:145:5: ( terms ( '|' list_tail )? )?
            {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:145:5: ( terms ( '|' list_tail )? )?
            int alt33=2;
            alt33 = dfa33.predict(input);
            switch (alt33) {
                case 1 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:145:6: terms ( '|' list_tail )?
                    {
                    pushFollow(FOLLOW_terms_in_list_body0880);
                    terms72=terms();

                    state._fsp--;

                    stream_terms.add(terms72.getTree());
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:145:12: ( '|' list_tail )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==BAR) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:145:13: '|' list_tail
                            {
                            char_literal73=(Token)match(input,BAR,FOLLOW_BAR_in_list_body0883);  
                            stream_BAR.add(char_literal73);

                            pushFollow(FOLLOW_list_tail_in_list_body0885);
                            list_tail74=list_tail();

                            state._fsp--;

                            stream_list_tail.add(list_tail74.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }



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
            // 145:31: -> ^( LIST_BODY ( terms ( list_tail )? )? )
            {
                // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:145:34: ^( LIST_BODY ( terms ( list_tail )? )? )
                {
                ProvaAST root_1 = (ProvaAST)adaptor.nil();
                root_1 = (ProvaAST)adaptor.becomeRoot((ProvaAST)adaptor.create(LIST_BODY, "LIST_BODY"), root_1);

                // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:145:46: ( terms ( list_tail )? )?
                if ( stream_terms.hasNext()||stream_list_tail.hasNext() ) {
                    adaptor.addChild(root_1, stream_terms.nextTree());
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:145:53: ( list_tail )?
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
    // $ANTLR end "list_body0"

    public static class list_tail_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "list_tail"
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:147:1: list_tail : ( variable | prova_list );
    public final Prova2Parser.list_tail_return list_tail() throws RecognitionException {
        Prova2Parser.list_tail_return retval = new Prova2Parser.list_tail_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Prova2Parser.variable_return variable75 = null;

        Prova2Parser.prova_list_return prova_list76 = null;



        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:148:2: ( variable | prova_list )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==USWORD||LA34_0==DOLLARWORD||(LA34_0>=LCWORD && LA34_0<=UCWORD)) ) {
                alt34=1;
            }
            else if ( (LA34_0==BRA) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:148:4: variable
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_variable_in_list_tail913);
                    variable75=variable();

                    state._fsp--;

                    adaptor.addChild(root_0, variable75.getTree());

                    }
                    break;
                case 2 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:148:15: prova_list
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_prova_list_in_list_tail917);
                    prova_list76=prova_list();

                    state._fsp--;

                    adaptor.addChild(root_0, prova_list76.getTree());

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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:150:1: left_term : ( constant | variable | number | prova_list );
    public final Prova2Parser.left_term_return left_term() throws RecognitionException {
        Prova2Parser.left_term_return retval = new Prova2Parser.left_term_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Prova2Parser.constant_return constant77 = null;

        Prova2Parser.variable_return variable78 = null;

        Prova2Parser.number_return number79 = null;

        Prova2Parser.prova_list_return prova_list80 = null;



        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:151:2: ( constant | variable | number | prova_list )
            int alt35=4;
            alt35 = dfa35.predict(input);
            switch (alt35) {
                case 1 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:151:4: constant
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_constant_in_left_term927);
                    constant77=constant();

                    state._fsp--;

                    adaptor.addChild(root_0, constant77.getTree());

                    }
                    break;
                case 2 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:152:3: variable
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_variable_in_left_term934);
                    variable78=variable();

                    state._fsp--;

                    adaptor.addChild(root_0, variable78.getTree());

                    }
                    break;
                case 3 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:153:3: number
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_number_in_left_term940);
                    number79=number();

                    state._fsp--;

                    adaptor.addChild(root_0, number79.getTree());

                    }
                    break;
                case 4 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:154:3: prova_list
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_prova_list_in_left_term946);
                    prova_list80=prova_list();

                    state._fsp--;

                    adaptor.addChild(root_0, prova_list80.getTree());

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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:156:1: right_term : ( ( ( MINUS )? ( constant | variable ) ) | number | prova_list | prova_map );
    public final Prova2Parser.right_term_return right_term() throws RecognitionException {
        Prova2Parser.right_term_return retval = new Prova2Parser.right_term_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token MINUS81=null;
        Prova2Parser.constant_return constant82 = null;

        Prova2Parser.variable_return variable83 = null;

        Prova2Parser.number_return number84 = null;

        Prova2Parser.prova_list_return prova_list85 = null;

        Prova2Parser.prova_map_return prova_map86 = null;


        ProvaAST MINUS81_tree=null;

        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:157:2: ( ( ( MINUS )? ( constant | variable ) ) | number | prova_list | prova_map )
            int alt38=4;
            switch ( input.LA(1) ) {
            case MINUS:
                {
                int LA38_1 = input.LA(2);

                if ( ((LA38_1>=INT_LITERAL && LA38_1<=LONG_LITERAL)) ) {
                    alt38=2;
                }
                else if ( (LA38_1==USWORD||LA38_1==DOLLARWORD||(LA38_1>=LCWORD && LA38_1<=UCWORD)||(LA38_1>=STRING1 && LA38_1<=STRING2)) ) {
                    alt38=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 38, 1, input);

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
                alt38=1;
                }
                break;
            case INT_LITERAL:
            case LONG_LITERAL:
                {
                alt38=2;
                }
                break;
            case BRA:
                {
                alt38=3;
                }
                break;
            case 72:
                {
                alt38=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:157:4: ( ( MINUS )? ( constant | variable ) )
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:157:4: ( ( MINUS )? ( constant | variable ) )
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:157:5: ( MINUS )? ( constant | variable )
                    {
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:157:5: ( MINUS )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==MINUS) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:157:5: MINUS
                            {
                            MINUS81=(Token)match(input,MINUS,FOLLOW_MINUS_in_right_term957); 
                            MINUS81_tree = (ProvaAST)adaptor.create(MINUS81);
                            adaptor.addChild(root_0, MINUS81_tree);


                            }
                            break;

                    }

                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:157:12: ( constant | variable )
                    int alt37=2;
                    alt37 = dfa37.predict(input);
                    switch (alt37) {
                        case 1 :
                            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:157:13: constant
                            {
                            pushFollow(FOLLOW_constant_in_right_term961);
                            constant82=constant();

                            state._fsp--;

                            adaptor.addChild(root_0, constant82.getTree());

                            }
                            break;
                        case 2 :
                            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:157:24: variable
                            {
                            pushFollow(FOLLOW_variable_in_right_term965);
                            variable83=variable();

                            state._fsp--;

                            adaptor.addChild(root_0, variable83.getTree());

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:157:37: number
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_number_in_right_term971);
                    number84=number();

                    state._fsp--;

                    adaptor.addChild(root_0, number84.getTree());

                    }
                    break;
                case 3 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:157:46: prova_list
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_prova_list_in_right_term975);
                    prova_list85=prova_list();

                    state._fsp--;

                    adaptor.addChild(root_0, prova_list85.getTree());

                    }
                    break;
                case 4 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:157:59: prova_map
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_prova_map_in_right_term979);
                    prova_map86=prova_map();

                    state._fsp--;

                    adaptor.addChild(root_0, prova_map86.getTree());

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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:159:1: prova_map : '{' ( key_value )? ( ',' key_value )* '}' -> ^( PROVA_MAP ( key_value )* ) ;
    public final Prova2Parser.prova_map_return prova_map() throws RecognitionException {
        Prova2Parser.prova_map_return retval = new Prova2Parser.prova_map_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token char_literal87=null;
        Token char_literal89=null;
        Token char_literal91=null;
        Prova2Parser.key_value_return key_value88 = null;

        Prova2Parser.key_value_return key_value90 = null;


        ProvaAST char_literal87_tree=null;
        ProvaAST char_literal89_tree=null;
        ProvaAST char_literal91_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
        RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
        RewriteRuleSubtreeStream stream_key_value=new RewriteRuleSubtreeStream(adaptor,"rule key_value");
        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:160:2: ( '{' ( key_value )? ( ',' key_value )* '}' -> ^( PROVA_MAP ( key_value )* ) )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:160:4: '{' ( key_value )? ( ',' key_value )* '}'
            {
            char_literal87=(Token)match(input,72,FOLLOW_72_in_prova_map989);  
            stream_72.add(char_literal87);

            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:160:8: ( key_value )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==LCWORD||(LA39_0>=STRING1 && LA39_0<=STRING2)) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:160:8: key_value
                    {
                    pushFollow(FOLLOW_key_value_in_prova_map991);
                    key_value88=key_value();

                    state._fsp--;

                    stream_key_value.add(key_value88.getTree());

                    }
                    break;

            }

            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:160:19: ( ',' key_value )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==COMMA) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:160:20: ',' key_value
            	    {
            	    char_literal89=(Token)match(input,COMMA,FOLLOW_COMMA_in_prova_map995);  
            	    stream_COMMA.add(char_literal89);

            	    pushFollow(FOLLOW_key_value_in_prova_map997);
            	    key_value90=key_value();

            	    state._fsp--;

            	    stream_key_value.add(key_value90.getTree());

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            char_literal91=(Token)match(input,73,FOLLOW_73_in_prova_map1001);  
            stream_73.add(char_literal91);



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
            // 160:40: -> ^( PROVA_MAP ( key_value )* )
            {
                // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:160:43: ^( PROVA_MAP ( key_value )* )
                {
                ProvaAST root_1 = (ProvaAST)adaptor.nil();
                root_1 = (ProvaAST)adaptor.becomeRoot((ProvaAST)adaptor.create(PROVA_MAP, "PROVA_MAP"), root_1);

                // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:160:55: ( key_value )*
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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:163:1: key_value : mstring ( '->' | ':' ) term -> ^( KEY_VALUE mstring term ) ;
    public final Prova2Parser.key_value_return key_value() throws RecognitionException {
        Prova2Parser.key_value_return retval = new Prova2Parser.key_value_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token string_literal93=null;
        Token char_literal94=null;
        Prova2Parser.mstring_return mstring92 = null;

        Prova2Parser.term_return term95 = null;


        ProvaAST string_literal93_tree=null;
        ProvaAST char_literal94_tree=null;
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleSubtreeStream stream_term=new RewriteRuleSubtreeStream(adaptor,"rule term");
        RewriteRuleSubtreeStream stream_mstring=new RewriteRuleSubtreeStream(adaptor,"rule mstring");
        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:164:2: ( mstring ( '->' | ':' ) term -> ^( KEY_VALUE mstring term ) )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:164:4: mstring ( '->' | ':' ) term
            {
            pushFollow(FOLLOW_mstring_in_key_value1021);
            mstring92=mstring();

            state._fsp--;

            stream_mstring.add(mstring92.getTree());
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:164:12: ( '->' | ':' )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==74) ) {
                alt41=1;
            }
            else if ( (LA41_0==70) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:164:13: '->'
                    {
                    string_literal93=(Token)match(input,74,FOLLOW_74_in_key_value1024);  
                    stream_74.add(string_literal93);


                    }
                    break;
                case 2 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:164:18: ':'
                    {
                    char_literal94=(Token)match(input,70,FOLLOW_70_in_key_value1026);  
                    stream_70.add(char_literal94);


                    }
                    break;

            }

            pushFollow(FOLLOW_term_in_key_value1029);
            term95=term();

            state._fsp--;

            stream_term.add(term95.getTree());


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
            // 164:28: -> ^( KEY_VALUE mstring term )
            {
                // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:164:31: ^( KEY_VALUE mstring term )
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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:167:1: terms : ( NEWLINE )* term ( ( NEWLINE )* ',' ( NEWLINE )* term )* -> ^( TERM ( term )+ ) ;
    public final Prova2Parser.terms_return terms() throws RecognitionException {
        Prova2Parser.terms_return retval = new Prova2Parser.terms_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token NEWLINE96=null;
        Token NEWLINE98=null;
        Token char_literal99=null;
        Token NEWLINE100=null;
        Prova2Parser.term_return term97 = null;

        Prova2Parser.term_return term101 = null;


        ProvaAST NEWLINE96_tree=null;
        ProvaAST NEWLINE98_tree=null;
        ProvaAST char_literal99_tree=null;
        ProvaAST NEWLINE100_tree=null;
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_term=new RewriteRuleSubtreeStream(adaptor,"rule term");
        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:167:8: ( ( NEWLINE )* term ( ( NEWLINE )* ',' ( NEWLINE )* term )* -> ^( TERM ( term )+ ) )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:167:10: ( NEWLINE )* term ( ( NEWLINE )* ',' ( NEWLINE )* term )*
            {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:167:10: ( NEWLINE )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==NEWLINE) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:167:10: NEWLINE
            	    {
            	    NEWLINE96=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_terms1052);  
            	    stream_NEWLINE.add(NEWLINE96);


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            pushFollow(FOLLOW_term_in_terms1055);
            term97=term();

            state._fsp--;

            stream_term.add(term97.getTree());
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:167:24: ( ( NEWLINE )* ',' ( NEWLINE )* term )*
            loop45:
            do {
                int alt45=2;
                alt45 = dfa45.predict(input);
                switch (alt45) {
            	case 1 :
            	    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:167:25: ( NEWLINE )* ',' ( NEWLINE )* term
            	    {
            	    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:167:25: ( NEWLINE )*
            	    loop43:
            	    do {
            	        int alt43=2;
            	        int LA43_0 = input.LA(1);

            	        if ( (LA43_0==NEWLINE) ) {
            	            alt43=1;
            	        }


            	        switch (alt43) {
            	    	case 1 :
            	    	    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:167:25: NEWLINE
            	    	    {
            	    	    NEWLINE98=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_terms1058);  
            	    	    stream_NEWLINE.add(NEWLINE98);


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop43;
            	        }
            	    } while (true);

            	    char_literal99=(Token)match(input,COMMA,FOLLOW_COMMA_in_terms1061);  
            	    stream_COMMA.add(char_literal99);

            	    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:167:38: ( NEWLINE )*
            	    loop44:
            	    do {
            	        int alt44=2;
            	        int LA44_0 = input.LA(1);

            	        if ( (LA44_0==NEWLINE) ) {
            	            alt44=1;
            	        }


            	        switch (alt44) {
            	    	case 1 :
            	    	    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:167:38: NEWLINE
            	    	    {
            	    	    NEWLINE100=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_terms1063);  
            	    	    stream_NEWLINE.add(NEWLINE100);


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop44;
            	        }
            	    } while (true);

            	    pushFollow(FOLLOW_term_in_terms1066);
            	    term101=term();

            	    state._fsp--;

            	    stream_term.add(term101.getTree());

            	    }
            	    break;

            	default :
            	    break loop45;
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
            // 167:54: -> ^( TERM ( term )+ )
            {
                // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:167:57: ^( TERM ( term )+ )
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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:169:1: term : ( left_term | func_term | prova_map );
    public final Prova2Parser.term_return term() throws RecognitionException {
        Prova2Parser.term_return retval = new Prova2Parser.term_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Prova2Parser.left_term_return left_term102 = null;

        Prova2Parser.func_term_return func_term103 = null;

        Prova2Parser.prova_map_return prova_map104 = null;



        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:169:6: ( left_term | func_term | prova_map )
            int alt46=3;
            alt46 = dfa46.predict(input);
            switch (alt46) {
                case 1 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:169:8: left_term
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_left_term_in_term1085);
                    left_term102=left_term();

                    state._fsp--;

                    adaptor.addChild(root_0, left_term102.getTree());

                    }
                    break;
                case 2 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:169:20: func_term
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_func_term_in_term1089);
                    func_term103=func_term();

                    state._fsp--;

                    adaptor.addChild(root_0, func_term103.getTree());

                    }
                    break;
                case 3 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:169:32: prova_map
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_prova_map_in_term1093);
                    prova_map104=prova_map();

                    state._fsp--;

                    adaptor.addChild(root_0, prova_map104.getTree());

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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:171:1: func_term : func args ;
    public final Prova2Parser.func_term_return func_term() throws RecognitionException {
        Prova2Parser.func_term_return retval = new Prova2Parser.func_term_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Prova2Parser.func_return func105 = null;

        Prova2Parser.args_return args106 = null;



        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:172:2: ( func args )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:172:4: func args
            {
            root_0 = (ProvaAST)adaptor.nil();

            pushFollow(FOLLOW_func_in_func_term1102);
            func105=func();

            state._fsp--;

            adaptor.addChild(root_0, func105.getTree());
            pushFollow(FOLLOW_args_in_func_term1104);
            args106=args();

            state._fsp--;

            adaptor.addChild(root_0, args106.getTree());

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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:174:1: qualified_java_class : ( ( LCWORD DOT )+ UCWORD ) -> ^( QUALIFIED_JAVA_CLASS ( LCWORD DOT )+ UCWORD ) ;
    public final Prova2Parser.qualified_java_class_return qualified_java_class() throws RecognitionException {
        Prova2Parser.qualified_java_class_return retval = new Prova2Parser.qualified_java_class_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token LCWORD107=null;
        Token DOT108=null;
        Token UCWORD109=null;

        ProvaAST LCWORD107_tree=null;
        ProvaAST DOT108_tree=null;
        ProvaAST UCWORD109_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_UCWORD=new RewriteRuleTokenStream(adaptor,"token UCWORD");
        RewriteRuleTokenStream stream_LCWORD=new RewriteRuleTokenStream(adaptor,"token LCWORD");

        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:175:2: ( ( ( LCWORD DOT )+ UCWORD ) -> ^( QUALIFIED_JAVA_CLASS ( LCWORD DOT )+ UCWORD ) )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:175:4: ( ( LCWORD DOT )+ UCWORD )
            {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:175:4: ( ( LCWORD DOT )+ UCWORD )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:175:5: ( LCWORD DOT )+ UCWORD
            {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:175:5: ( LCWORD DOT )+
            int cnt47=0;
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==LCWORD) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:175:6: LCWORD DOT
            	    {
            	    LCWORD107=(Token)match(input,LCWORD,FOLLOW_LCWORD_in_qualified_java_class1117);  
            	    stream_LCWORD.add(LCWORD107);

            	    DOT108=(Token)match(input,DOT,FOLLOW_DOT_in_qualified_java_class1119);  
            	    stream_DOT.add(DOT108);


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

            UCWORD109=(Token)match(input,UCWORD,FOLLOW_UCWORD_in_qualified_java_class1123);  
            stream_UCWORD.add(UCWORD109);


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
            // 175:27: -> ^( QUALIFIED_JAVA_CLASS ( LCWORD DOT )+ UCWORD )
            {
                // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:175:30: ^( QUALIFIED_JAVA_CLASS ( LCWORD DOT )+ UCWORD )
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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:178:1: prova_list : '[' list_body ']' -> ^( PROVA_LIST list_body ) ;
    public final Prova2Parser.prova_list_return prova_list() throws RecognitionException {
        Prova2Parser.prova_list_return retval = new Prova2Parser.prova_list_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token char_literal110=null;
        Token char_literal112=null;
        Prova2Parser.list_body_return list_body111 = null;


        ProvaAST char_literal110_tree=null;
        ProvaAST char_literal112_tree=null;
        RewriteRuleTokenStream stream_BRA=new RewriteRuleTokenStream(adaptor,"token BRA");
        RewriteRuleTokenStream stream_KET=new RewriteRuleTokenStream(adaptor,"token KET");
        RewriteRuleSubtreeStream stream_list_body=new RewriteRuleSubtreeStream(adaptor,"rule list_body");
        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:179:2: ( '[' list_body ']' -> ^( PROVA_LIST list_body ) )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:179:4: '[' list_body ']'
            {
            char_literal110=(Token)match(input,BRA,FOLLOW_BRA_in_prova_list1151);  
            stream_BRA.add(char_literal110);

            pushFollow(FOLLOW_list_body_in_prova_list1153);
            list_body111=list_body();

            state._fsp--;

            stream_list_body.add(list_body111.getTree());
            char_literal112=(Token)match(input,KET,FOLLOW_KET_in_prova_list1155);  
            stream_KET.add(char_literal112);



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
            // 179:22: -> ^( PROVA_LIST list_body )
            {
                // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:179:25: ^( PROVA_LIST list_body )
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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:181:1: args : '(' list_body ')' -> ^( ARGS list_body ) ;
    public final Prova2Parser.args_return args() throws RecognitionException {
        Prova2Parser.args_return retval = new Prova2Parser.args_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token char_literal113=null;
        Token char_literal115=null;
        Prova2Parser.list_body_return list_body114 = null;


        ProvaAST char_literal113_tree=null;
        ProvaAST char_literal115_tree=null;
        RewriteRuleTokenStream stream_OPEN=new RewriteRuleTokenStream(adaptor,"token OPEN");
        RewriteRuleTokenStream stream_CLOSE=new RewriteRuleTokenStream(adaptor,"token CLOSE");
        RewriteRuleSubtreeStream stream_list_body=new RewriteRuleSubtreeStream(adaptor,"rule list_body");
        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:181:7: ( '(' list_body ')' -> ^( ARGS list_body ) )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:181:9: '(' list_body ')'
            {
            char_literal113=(Token)match(input,OPEN,FOLLOW_OPEN_in_args1172);  
            stream_OPEN.add(char_literal113);

            pushFollow(FOLLOW_list_body_in_args1174);
            list_body114=list_body();

            state._fsp--;

            stream_list_body.add(list_body114.getTree());
            char_literal115=(Token)match(input,CLOSE,FOLLOW_CLOSE_in_args1176);  
            stream_CLOSE.add(char_literal115);



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
            // 181:27: -> ^( ARGS list_body )
            {
                // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:181:30: ^( ARGS list_body )
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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:183:1: semantic_attachment : ( predicate_java_call | binary_operation );
    public final Prova2Parser.semantic_attachment_return semantic_attachment() throws RecognitionException {
        Prova2Parser.semantic_attachment_return retval = new Prova2Parser.semantic_attachment_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Prova2Parser.predicate_java_call_return predicate_java_call116 = null;

        Prova2Parser.binary_operation_return binary_operation117 = null;



        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:184:2: ( predicate_java_call | binary_operation )
            int alt48=2;
            alt48 = dfa48.predict(input);
            switch (alt48) {
                case 1 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:184:4: predicate_java_call
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_predicate_java_call_in_semantic_attachment1194);
                    predicate_java_call116=predicate_java_call();

                    state._fsp--;

                    adaptor.addChild(root_0, predicate_java_call116.getTree());

                    }
                    break;
                case 2 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:184:26: binary_operation
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_binary_operation_in_semantic_attachment1198);
                    binary_operation117=binary_operation();

                    state._fsp--;

                    adaptor.addChild(root_0, binary_operation117.getTree());

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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:186:1: binary_operation : left_term ( EQUAL ( constructor_java_call | prova_list | constant | expr ) | not_equal constant | binary_operator expr ) ;
    public final Prova2Parser.binary_operation_return binary_operation() throws RecognitionException {
        Prova2Parser.binary_operation_return retval = new Prova2Parser.binary_operation_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token EQUAL119=null;
        Prova2Parser.left_term_return left_term118 = null;

        Prova2Parser.constructor_java_call_return constructor_java_call120 = null;

        Prova2Parser.prova_list_return prova_list121 = null;

        Prova2Parser.constant_return constant122 = null;

        Prova2Parser.expr_return expr123 = null;

        Prova2Parser.not_equal_return not_equal124 = null;

        Prova2Parser.constant_return constant125 = null;

        Prova2Parser.binary_operator_return binary_operator126 = null;

        Prova2Parser.expr_return expr127 = null;


        ProvaAST EQUAL119_tree=null;

        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:187:2: ( left_term ( EQUAL ( constructor_java_call | prova_list | constant | expr ) | not_equal constant | binary_operator expr ) )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:187:4: left_term ( EQUAL ( constructor_java_call | prova_list | constant | expr ) | not_equal constant | binary_operator expr )
            {
            root_0 = (ProvaAST)adaptor.nil();

            pushFollow(FOLLOW_left_term_in_binary_operation1207);
            left_term118=left_term();

            state._fsp--;

            adaptor.addChild(root_0, left_term118.getTree());
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:188:3: ( EQUAL ( constructor_java_call | prova_list | constant | expr ) | not_equal constant | binary_operator expr )
            int alt50=3;
            alt50 = dfa50.predict(input);
            switch (alt50) {
                case 1 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:188:5: EQUAL ( constructor_java_call | prova_list | constant | expr )
                    {
                    EQUAL119=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_binary_operation1213); 
                    EQUAL119_tree = (ProvaAST)adaptor.create(EQUAL119);
                    adaptor.addChild(root_0, EQUAL119_tree);

                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:189:4: ( constructor_java_call | prova_list | constant | expr )
                    int alt49=4;
                    alt49 = dfa49.predict(input);
                    switch (alt49) {
                        case 1 :
                            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:190:4: constructor_java_call
                            {
                            pushFollow(FOLLOW_constructor_java_call_in_binary_operation1223);
                            constructor_java_call120=constructor_java_call();

                            state._fsp--;

                            adaptor.addChild(root_0, constructor_java_call120.getTree());

                            }
                            break;
                        case 2 :
                            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:191:6: prova_list
                            {
                            pushFollow(FOLLOW_prova_list_in_binary_operation1230);
                            prova_list121=prova_list();

                            state._fsp--;

                            adaptor.addChild(root_0, prova_list121.getTree());

                            }
                            break;
                        case 3 :
                            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:192:6: constant
                            {
                            pushFollow(FOLLOW_constant_in_binary_operation1237);
                            constant122=constant();

                            state._fsp--;

                            adaptor.addChild(root_0, constant122.getTree());

                            }
                            break;
                        case 4 :
                            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:193:6: expr
                            {
                            pushFollow(FOLLOW_expr_in_binary_operation1244);
                            expr123=expr();

                            state._fsp--;

                            adaptor.addChild(root_0, expr123.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:195:5: not_equal constant
                    {
                    pushFollow(FOLLOW_not_equal_in_binary_operation1255);
                    not_equal124=not_equal();

                    state._fsp--;

                    adaptor.addChild(root_0, not_equal124.getTree());
                    pushFollow(FOLLOW_constant_in_binary_operation1257);
                    constant125=constant();

                    state._fsp--;

                    adaptor.addChild(root_0, constant125.getTree());

                    }
                    break;
                case 3 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:196:5: binary_operator expr
                    {
                    pushFollow(FOLLOW_binary_operator_in_binary_operation1263);
                    binary_operator126=binary_operator();

                    state._fsp--;

                    adaptor.addChild(root_0, binary_operator126.getTree());
                    pushFollow(FOLLOW_expr_in_binary_operation1265);
                    expr127=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr127.getTree());

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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:199:1: expr : aterm ( ( PLUS | MINUS ) expr )? ;
    public final Prova2Parser.expr_return expr() throws RecognitionException {
        Prova2Parser.expr_return retval = new Prova2Parser.expr_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token set129=null;
        Prova2Parser.aterm_return aterm128 = null;

        Prova2Parser.expr_return expr130 = null;


        ProvaAST set129_tree=null;

        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:199:6: ( aterm ( ( PLUS | MINUS ) expr )? )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:199:8: aterm ( ( PLUS | MINUS ) expr )?
            {
            root_0 = (ProvaAST)adaptor.nil();

            pushFollow(FOLLOW_aterm_in_expr1277);
            aterm128=aterm();

            state._fsp--;

            adaptor.addChild(root_0, aterm128.getTree());
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:199:14: ( ( PLUS | MINUS ) expr )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( ((LA51_0>=PLUS && LA51_0<=MINUS)) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:199:15: ( PLUS | MINUS ) expr
                    {
                    set129=(Token)input.LT(1);
                    if ( (input.LA(1)>=PLUS && input.LA(1)<=MINUS) ) {
                        input.consume();
                        adaptor.addChild(root_0, (ProvaAST)adaptor.create(set129));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_expr_in_expr1288);
                    expr130=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr130.getTree());

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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:201:1: aterm : ( ( MINUS )? variable | number | ( MINUS )? predicate_java_call | OPEN expr CLOSE ) ( ( MULT | DIV | REM ) aterm )? ;
    public final Prova2Parser.aterm_return aterm() throws RecognitionException {
        Prova2Parser.aterm_return retval = new Prova2Parser.aterm_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token MINUS131=null;
        Token MINUS134=null;
        Token OPEN136=null;
        Token CLOSE138=null;
        Token set139=null;
        Prova2Parser.variable_return variable132 = null;

        Prova2Parser.number_return number133 = null;

        Prova2Parser.predicate_java_call_return predicate_java_call135 = null;

        Prova2Parser.expr_return expr137 = null;

        Prova2Parser.aterm_return aterm140 = null;


        ProvaAST MINUS131_tree=null;
        ProvaAST MINUS134_tree=null;
        ProvaAST OPEN136_tree=null;
        ProvaAST CLOSE138_tree=null;
        ProvaAST set139_tree=null;

        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:201:7: ( ( ( MINUS )? variable | number | ( MINUS )? predicate_java_call | OPEN expr CLOSE ) ( ( MULT | DIV | REM ) aterm )? )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:201:9: ( ( MINUS )? variable | number | ( MINUS )? predicate_java_call | OPEN expr CLOSE ) ( ( MULT | DIV | REM ) aterm )?
            {
            root_0 = (ProvaAST)adaptor.nil();

            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:201:9: ( ( MINUS )? variable | number | ( MINUS )? predicate_java_call | OPEN expr CLOSE )
            int alt54=4;
            alt54 = dfa54.predict(input);
            switch (alt54) {
                case 1 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:201:10: ( MINUS )? variable
                    {
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:201:10: ( MINUS )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==MINUS) ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:201:10: MINUS
                            {
                            MINUS131=(Token)match(input,MINUS,FOLLOW_MINUS_in_aterm1300); 
                            MINUS131_tree = (ProvaAST)adaptor.create(MINUS131);
                            adaptor.addChild(root_0, MINUS131_tree);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_variable_in_aterm1303);
                    variable132=variable();

                    state._fsp--;

                    adaptor.addChild(root_0, variable132.getTree());

                    }
                    break;
                case 2 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:201:28: number
                    {
                    pushFollow(FOLLOW_number_in_aterm1307);
                    number133=number();

                    state._fsp--;

                    adaptor.addChild(root_0, number133.getTree());

                    }
                    break;
                case 3 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:201:37: ( MINUS )? predicate_java_call
                    {
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:201:37: ( MINUS )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==MINUS) ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:201:37: MINUS
                            {
                            MINUS134=(Token)match(input,MINUS,FOLLOW_MINUS_in_aterm1311); 
                            MINUS134_tree = (ProvaAST)adaptor.create(MINUS134);
                            adaptor.addChild(root_0, MINUS134_tree);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_predicate_java_call_in_aterm1314);
                    predicate_java_call135=predicate_java_call();

                    state._fsp--;

                    adaptor.addChild(root_0, predicate_java_call135.getTree());

                    }
                    break;
                case 4 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:201:66: OPEN expr CLOSE
                    {
                    OPEN136=(Token)match(input,OPEN,FOLLOW_OPEN_in_aterm1318); 
                    OPEN136_tree = (ProvaAST)adaptor.create(OPEN136);
                    adaptor.addChild(root_0, OPEN136_tree);

                    pushFollow(FOLLOW_expr_in_aterm1320);
                    expr137=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr137.getTree());
                    CLOSE138=(Token)match(input,CLOSE,FOLLOW_CLOSE_in_aterm1322); 
                    CLOSE138_tree = (ProvaAST)adaptor.create(CLOSE138);
                    adaptor.addChild(root_0, CLOSE138_tree);


                    }
                    break;

            }

            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:201:83: ( ( MULT | DIV | REM ) aterm )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( ((LA55_0>=MULT && LA55_0<=DIV)||LA55_0==REM) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:201:84: ( MULT | DIV | REM ) aterm
                    {
                    set139=(Token)input.LT(1);
                    if ( (input.LA(1)>=MULT && input.LA(1)<=DIV)||input.LA(1)==REM ) {
                        input.consume();
                        adaptor.addChild(root_0, (ProvaAST)adaptor.create(set139));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_aterm_in_aterm1340);
                    aterm140=aterm();

                    state._fsp--;

                    adaptor.addChild(root_0, aterm140.getTree());

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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:203:1: constructor_java_call : ( qualified_java_class | UCWORD ) args ;
    public final Prova2Parser.constructor_java_call_return constructor_java_call() throws RecognitionException {
        Prova2Parser.constructor_java_call_return retval = new Prova2Parser.constructor_java_call_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token UCWORD142=null;
        Prova2Parser.qualified_java_class_return qualified_java_class141 = null;

        Prova2Parser.args_return args143 = null;


        ProvaAST UCWORD142_tree=null;

        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:204:2: ( ( qualified_java_class | UCWORD ) args )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:204:4: ( qualified_java_class | UCWORD ) args
            {
            root_0 = (ProvaAST)adaptor.nil();

            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:204:4: ( qualified_java_class | UCWORD )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==LCWORD) ) {
                alt56=1;
            }
            else if ( (LA56_0==UCWORD) ) {
                alt56=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:204:5: qualified_java_class
                    {
                    pushFollow(FOLLOW_qualified_java_class_in_constructor_java_call1352);
                    qualified_java_class141=qualified_java_class();

                    state._fsp--;

                    adaptor.addChild(root_0, qualified_java_class141.getTree());

                    }
                    break;
                case 2 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:204:28: UCWORD
                    {
                    UCWORD142=(Token)match(input,UCWORD,FOLLOW_UCWORD_in_constructor_java_call1356); 
                    UCWORD142_tree = (ProvaAST)adaptor.create(UCWORD142);
                    adaptor.addChild(root_0, UCWORD142_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_args_in_constructor_java_call1359);
            args143=args();

            state._fsp--;

            adaptor.addChild(root_0, args143.getTree());

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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:207:1: predicate_java_call : ( static_java_call | instance_java_call );
    public final Prova2Parser.predicate_java_call_return predicate_java_call() throws RecognitionException {
        Prova2Parser.predicate_java_call_return retval = new Prova2Parser.predicate_java_call_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Prova2Parser.static_java_call_return static_java_call144 = null;

        Prova2Parser.instance_java_call_return instance_java_call145 = null;



        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:208:2: ( static_java_call | instance_java_call )
            int alt57=2;
            alt57 = dfa57.predict(input);
            switch (alt57) {
                case 1 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:208:4: static_java_call
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_static_java_call_in_predicate_java_call1370);
                    static_java_call144=static_java_call();

                    state._fsp--;

                    adaptor.addChild(root_0, static_java_call144.getTree());

                    }
                    break;
                case 2 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:208:23: instance_java_call
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_instance_java_call_in_predicate_java_call1374);
                    instance_java_call145=instance_java_call();

                    state._fsp--;

                    adaptor.addChild(root_0, instance_java_call145.getTree());

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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:211:1: instance_java_call : instance_call args -> ^( INSTANCE_JAVA_CALL instance_call args ) ;
    public final Prova2Parser.instance_java_call_return instance_java_call() throws RecognitionException {
        Prova2Parser.instance_java_call_return retval = new Prova2Parser.instance_java_call_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Prova2Parser.instance_call_return instance_call146 = null;

        Prova2Parser.args_return args147 = null;


        RewriteRuleSubtreeStream stream_instance_call=new RewriteRuleSubtreeStream(adaptor,"rule instance_call");
        RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"rule args");
        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:212:2: ( instance_call args -> ^( INSTANCE_JAVA_CALL instance_call args ) )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:212:4: instance_call args
            {
            pushFollow(FOLLOW_instance_call_in_instance_java_call1385);
            instance_call146=instance_call();

            state._fsp--;

            stream_instance_call.add(instance_call146.getTree());
            pushFollow(FOLLOW_args_in_instance_java_call1387);
            args147=args();

            state._fsp--;

            stream_args.add(args147.getTree());


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
            // 212:23: -> ^( INSTANCE_JAVA_CALL instance_call args )
            {
                // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:212:26: ^( INSTANCE_JAVA_CALL instance_call args )
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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:215:1: static_java_call : static_call args -> ^( STATIC_JAVA_CALL static_call args ) ;
    public final Prova2Parser.static_java_call_return static_java_call() throws RecognitionException {
        Prova2Parser.static_java_call_return retval = new Prova2Parser.static_java_call_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Prova2Parser.static_call_return static_call148 = null;

        Prova2Parser.args_return args149 = null;


        RewriteRuleSubtreeStream stream_static_call=new RewriteRuleSubtreeStream(adaptor,"rule static_call");
        RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"rule args");
        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:216:2: ( static_call args -> ^( STATIC_JAVA_CALL static_call args ) )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:216:4: static_call args
            {
            pushFollow(FOLLOW_static_call_in_static_java_call1408);
            static_call148=static_call();

            state._fsp--;

            stream_static_call.add(static_call148.getTree());
            pushFollow(FOLLOW_args_in_static_java_call1410);
            args149=args();

            state._fsp--;

            stream_args.add(args149.getTree());


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
            // 216:21: -> ^( STATIC_JAVA_CALL static_call args )
            {
                // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:216:24: ^( STATIC_JAVA_CALL static_call args )
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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:219:1: method : LCWORD ;
    public final Prova2Parser.method_return method() throws RecognitionException {
        Prova2Parser.method_return retval = new Prova2Parser.method_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token LCWORD150=null;

        ProvaAST LCWORD150_tree=null;

        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:219:9: ( LCWORD )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:219:11: LCWORD
            {
            root_0 = (ProvaAST)adaptor.nil();

            LCWORD150=(Token)match(input,LCWORD,FOLLOW_LCWORD_in_method1431); 
            LCWORD150_tree = (ProvaAST)adaptor.create(LCWORD150);
            adaptor.addChild(root_0, LCWORD150_tree);


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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:221:1: func : ( LCWORD | UCWORD | string | typed_variable );
    public final Prova2Parser.func_return func() throws RecognitionException {
        Prova2Parser.func_return retval = new Prova2Parser.func_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token LCWORD151=null;
        Token UCWORD152=null;
        Prova2Parser.string_return string153 = null;

        Prova2Parser.typed_variable_return typed_variable154 = null;


        ProvaAST LCWORD151_tree=null;
        ProvaAST UCWORD152_tree=null;

        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:221:6: ( LCWORD | UCWORD | string | typed_variable )
            int alt58=4;
            switch ( input.LA(1) ) {
            case LCWORD:
                {
                int LA58_1 = input.LA(2);

                if ( (LA58_1==DOT) ) {
                    alt58=4;
                }
                else if ( (LA58_1==OPEN) ) {
                    alt58=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 58, 1, input);

                    throw nvae;
                }
                }
                break;
            case UCWORD:
                {
                int LA58_2 = input.LA(2);

                if ( (LA58_2==DOT) ) {
                    alt58=4;
                }
                else if ( (LA58_2==OPEN) ) {
                    alt58=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 58, 2, input);

                    throw nvae;
                }
                }
                break;
            case STRING1:
            case STRING2:
                {
                alt58=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:221:8: LCWORD
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    LCWORD151=(Token)match(input,LCWORD,FOLLOW_LCWORD_in_func1439); 
                    LCWORD151_tree = (ProvaAST)adaptor.create(LCWORD151);
                    adaptor.addChild(root_0, LCWORD151_tree);


                    }
                    break;
                case 2 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:221:17: UCWORD
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    UCWORD152=(Token)match(input,UCWORD,FOLLOW_UCWORD_in_func1443); 
                    UCWORD152_tree = (ProvaAST)adaptor.create(UCWORD152);
                    adaptor.addChild(root_0, UCWORD152_tree);


                    }
                    break;
                case 3 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:221:26: string
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_string_in_func1447);
                    string153=string();

                    state._fsp--;

                    adaptor.addChild(root_0, string153.getTree());

                    }
                    break;
                case 4 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:221:35: typed_variable
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_typed_variable_in_func1451);
                    typed_variable154=typed_variable();

                    state._fsp--;

                    adaptor.addChild(root_0, typed_variable154.getTree());

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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:223:1: predicate : ( LCWORD | UCWORD | string );
    public final Prova2Parser.predicate_return predicate() throws RecognitionException {
        Prova2Parser.predicate_return retval = new Prova2Parser.predicate_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token LCWORD155=null;
        Token UCWORD156=null;
        Prova2Parser.string_return string157 = null;


        ProvaAST LCWORD155_tree=null;
        ProvaAST UCWORD156_tree=null;

        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:224:2: ( LCWORD | UCWORD | string )
            int alt59=3;
            switch ( input.LA(1) ) {
            case LCWORD:
                {
                alt59=1;
                }
                break;
            case UCWORD:
                {
                alt59=2;
                }
                break;
            case STRING1:
            case STRING2:
                {
                alt59=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }

            switch (alt59) {
                case 1 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:224:4: LCWORD
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    LCWORD155=(Token)match(input,LCWORD,FOLLOW_LCWORD_in_predicate1461); 
                    LCWORD155_tree = (ProvaAST)adaptor.create(LCWORD155);
                    adaptor.addChild(root_0, LCWORD155_tree);


                    }
                    break;
                case 2 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:224:13: UCWORD
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    UCWORD156=(Token)match(input,UCWORD,FOLLOW_UCWORD_in_predicate1465); 
                    UCWORD156_tree = (ProvaAST)adaptor.create(UCWORD156);
                    adaptor.addChild(root_0, UCWORD156_tree);


                    }
                    break;
                case 3 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:224:22: string
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_string_in_predicate1469);
                    string157=string();

                    state._fsp--;

                    adaptor.addChild(root_0, string157.getTree());

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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:226:1: variable : ( UCWORD | USWORD | typed_variable | DOLLARWORD );
    public final Prova2Parser.variable_return variable() throws RecognitionException {
        Prova2Parser.variable_return retval = new Prova2Parser.variable_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token UCWORD158=null;
        Token USWORD159=null;
        Token DOLLARWORD161=null;
        Prova2Parser.typed_variable_return typed_variable160 = null;


        ProvaAST UCWORD158_tree=null;
        ProvaAST USWORD159_tree=null;
        ProvaAST DOLLARWORD161_tree=null;

        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:226:9: ( UCWORD | USWORD | typed_variable | DOLLARWORD )
            int alt60=4;
            switch ( input.LA(1) ) {
            case UCWORD:
                {
                int LA60_1 = input.LA(2);

                if ( (LA60_1==DOT) ) {
                    switch ( input.LA(3) ) {
                    case EOF:
                    case NEWLINE:
                        {
                        alt60=1;
                        }
                        break;
                    case LCWORD:
                        {
                        int LA60_7 = input.LA(4);

                        if ( (LA60_7==OPEN) ) {
                            alt60=1;
                        }
                        else if ( (LA60_7==EOF||(LA60_7>=DOT && LA60_7<=COMMA)||(LA60_7>=CLOSE && LA60_7<=GE)||LA60_7==REM||LA60_7==NEWLINE||LA60_7==70||LA60_7==73) ) {
                            alt60=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 60, 7, input);

                            throw nvae;
                        }
                        }
                        break;
                    case UCWORD:
                        {
                        alt60=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 60, 5, input);

                        throw nvae;
                    }

                }
                else if ( (LA60_1==EOF||(LA60_1>=PLUS && LA60_1<=COMMA)||(LA60_1>=CLOSE && LA60_1<=GE)||LA60_1==REM||LA60_1==NEWLINE||LA60_1==70||LA60_1==73) ) {
                    alt60=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 60, 1, input);

                    throw nvae;
                }
                }
                break;
            case USWORD:
                {
                alt60=2;
                }
                break;
            case LCWORD:
                {
                alt60=3;
                }
                break;
            case DOLLARWORD:
                {
                alt60=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:226:11: UCWORD
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    UCWORD158=(Token)match(input,UCWORD,FOLLOW_UCWORD_in_variable1476); 
                    UCWORD158_tree = (ProvaAST)adaptor.create(UCWORD158);
                    adaptor.addChild(root_0, UCWORD158_tree);


                    }
                    break;
                case 2 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:226:20: USWORD
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    USWORD159=(Token)match(input,USWORD,FOLLOW_USWORD_in_variable1480); 
                    USWORD159_tree = (ProvaAST)adaptor.create(USWORD159);
                    adaptor.addChild(root_0, USWORD159_tree);


                    }
                    break;
                case 3 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:226:29: typed_variable
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_typed_variable_in_variable1484);
                    typed_variable160=typed_variable();

                    state._fsp--;

                    adaptor.addChild(root_0, typed_variable160.getTree());

                    }
                    break;
                case 4 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:226:46: DOLLARWORD
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    DOLLARWORD161=(Token)match(input,DOLLARWORD,FOLLOW_DOLLARWORD_in_variable1488); 
                    DOLLARWORD161_tree = (ProvaAST)adaptor.create(DOLLARWORD161);
                    adaptor.addChild(root_0, DOLLARWORD161_tree);


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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:228:1: variable_or_number : ( variable | number );
    public final Prova2Parser.variable_or_number_return variable_or_number() throws RecognitionException {
        Prova2Parser.variable_or_number_return retval = new Prova2Parser.variable_or_number_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Prova2Parser.variable_return variable162 = null;

        Prova2Parser.number_return number163 = null;



        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:229:2: ( variable | number )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==USWORD||LA61_0==DOLLARWORD||(LA61_0>=LCWORD && LA61_0<=UCWORD)) ) {
                alt61=1;
            }
            else if ( (LA61_0==MINUS||(LA61_0>=INT_LITERAL && LA61_0<=LONG_LITERAL)) ) {
                alt61=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:229:4: variable
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_variable_in_variable_or_number1498);
                    variable162=variable();

                    state._fsp--;

                    adaptor.addChild(root_0, variable162.getTree());

                    }
                    break;
                case 2 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:229:15: number
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_number_in_variable_or_number1502);
                    number163=number();

                    state._fsp--;

                    adaptor.addChild(root_0, number163.getTree());

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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:231:1: word : ( LCWORD | UCWORD );
    public final Prova2Parser.word_return word() throws RecognitionException {
        Prova2Parser.word_return retval = new Prova2Parser.word_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token set164=null;

        ProvaAST set164_tree=null;

        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:231:6: ( LCWORD | UCWORD )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:
            {
            root_0 = (ProvaAST)adaptor.nil();

            set164=(Token)input.LT(1);
            if ( (input.LA(1)>=LCWORD && input.LA(1)<=UCWORD) ) {
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
    // $ANTLR end "word"

    public static class typed_variable_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typed_variable"
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:236:1: typed_variable : ( qualified_java_class DOT word -> ^( TYPED_VARIABLE qualified_java_class word ) | UCWORD DOT word -> ^( TYPED_VARIABLE UCWORD word ) );
    public final Prova2Parser.typed_variable_return typed_variable() throws RecognitionException {
        Prova2Parser.typed_variable_return retval = new Prova2Parser.typed_variable_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token DOT166=null;
        Token UCWORD168=null;
        Token DOT169=null;
        Prova2Parser.qualified_java_class_return qualified_java_class165 = null;

        Prova2Parser.word_return word167 = null;

        Prova2Parser.word_return word170 = null;


        ProvaAST DOT166_tree=null;
        ProvaAST UCWORD168_tree=null;
        ProvaAST DOT169_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_UCWORD=new RewriteRuleTokenStream(adaptor,"token UCWORD");
        RewriteRuleSubtreeStream stream_qualified_java_class=new RewriteRuleSubtreeStream(adaptor,"rule qualified_java_class");
        RewriteRuleSubtreeStream stream_word=new RewriteRuleSubtreeStream(adaptor,"rule word");
        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:237:2: ( qualified_java_class DOT word -> ^( TYPED_VARIABLE qualified_java_class word ) | UCWORD DOT word -> ^( TYPED_VARIABLE UCWORD word ) )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==LCWORD) ) {
                alt62=1;
            }
            else if ( (LA62_0==UCWORD) ) {
                alt62=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:238:3: qualified_java_class DOT word
                    {
                    pushFollow(FOLLOW_qualified_java_class_in_typed_variable1529);
                    qualified_java_class165=qualified_java_class();

                    state._fsp--;

                    stream_qualified_java_class.add(qualified_java_class165.getTree());
                    DOT166=(Token)match(input,DOT,FOLLOW_DOT_in_typed_variable1531);  
                    stream_DOT.add(DOT166);

                    pushFollow(FOLLOW_word_in_typed_variable1533);
                    word167=word();

                    state._fsp--;

                    stream_word.add(word167.getTree());


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
                    // 238:33: -> ^( TYPED_VARIABLE qualified_java_class word )
                    {
                        // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:238:36: ^( TYPED_VARIABLE qualified_java_class word )
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
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:239:5: UCWORD DOT word
                    {
                    UCWORD168=(Token)match(input,UCWORD,FOLLOW_UCWORD_in_typed_variable1549);  
                    stream_UCWORD.add(UCWORD168);

                    DOT169=(Token)match(input,DOT,FOLLOW_DOT_in_typed_variable1551);  
                    stream_DOT.add(DOT169);

                    pushFollow(FOLLOW_word_in_typed_variable1553);
                    word170=word();

                    state._fsp--;

                    stream_word.add(word170.getTree());


                    // AST REWRITE
                    // elements: word, UCWORD
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ProvaAST)adaptor.nil();
                    // 239:21: -> ^( TYPED_VARIABLE UCWORD word )
                    {
                        // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:239:24: ^( TYPED_VARIABLE UCWORD word )
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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:244:1: instance_call : variable DOT LCWORD -> variable LCWORD ;
    public final Prova2Parser.instance_call_return instance_call() throws RecognitionException {
        Prova2Parser.instance_call_return retval = new Prova2Parser.instance_call_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token DOT172=null;
        Token LCWORD173=null;
        Prova2Parser.variable_return variable171 = null;


        ProvaAST DOT172_tree=null;
        ProvaAST LCWORD173_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_LCWORD=new RewriteRuleTokenStream(adaptor,"token LCWORD");
        RewriteRuleSubtreeStream stream_variable=new RewriteRuleSubtreeStream(adaptor,"rule variable");
        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:245:2: ( variable DOT LCWORD -> variable LCWORD )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:245:4: variable DOT LCWORD
            {
            pushFollow(FOLLOW_variable_in_instance_call1575);
            variable171=variable();

            state._fsp--;

            stream_variable.add(variable171.getTree());
            DOT172=(Token)match(input,DOT,FOLLOW_DOT_in_instance_call1577);  
            stream_DOT.add(DOT172);

            LCWORD173=(Token)match(input,LCWORD,FOLLOW_LCWORD_in_instance_call1579);  
            stream_LCWORD.add(LCWORD173);



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
            // 245:24: -> variable LCWORD
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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:248:1: static_call : ( qualified_java_class DOT LCWORD ) -> qualified_java_class LCWORD ;
    public final Prova2Parser.static_call_return static_call() throws RecognitionException {
        Prova2Parser.static_call_return retval = new Prova2Parser.static_call_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token DOT175=null;
        Token LCWORD176=null;
        Prova2Parser.qualified_java_class_return qualified_java_class174 = null;


        ProvaAST DOT175_tree=null;
        ProvaAST LCWORD176_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_LCWORD=new RewriteRuleTokenStream(adaptor,"token LCWORD");
        RewriteRuleSubtreeStream stream_qualified_java_class=new RewriteRuleSubtreeStream(adaptor,"rule qualified_java_class");
        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:249:2: ( ( qualified_java_class DOT LCWORD ) -> qualified_java_class LCWORD )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:249:4: ( qualified_java_class DOT LCWORD )
            {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:249:4: ( qualified_java_class DOT LCWORD )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:249:5: qualified_java_class DOT LCWORD
            {
            pushFollow(FOLLOW_qualified_java_class_in_static_call1597);
            qualified_java_class174=qualified_java_class();

            state._fsp--;

            stream_qualified_java_class.add(qualified_java_class174.getTree());
            DOT175=(Token)match(input,DOT,FOLLOW_DOT_in_static_call1599);  
            stream_DOT.add(DOT175);

            LCWORD176=(Token)match(input,LCWORD,FOLLOW_LCWORD_in_static_call1601);  
            stream_LCWORD.add(LCWORD176);


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
            // 249:38: -> qualified_java_class LCWORD
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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:252:1: pos_number : ( INT_LITERAL | LONG_LITERAL | float_literal );
    public final Prova2Parser.pos_number_return pos_number() throws RecognitionException {
        Prova2Parser.pos_number_return retval = new Prova2Parser.pos_number_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token INT_LITERAL177=null;
        Token LONG_LITERAL178=null;
        Prova2Parser.float_literal_return float_literal179 = null;


        ProvaAST INT_LITERAL177_tree=null;
        ProvaAST LONG_LITERAL178_tree=null;

        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:252:12: ( INT_LITERAL | LONG_LITERAL | float_literal )
            int alt63=3;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==INT_LITERAL) ) {
                int LA63_1 = input.LA(2);

                if ( (LA63_1==DOT) ) {
                    int LA63_3 = input.LA(3);

                    if ( (LA63_3==INT_LITERAL) ) {
                        alt63=3;
                    }
                    else if ( (LA63_3==EOF||LA63_3==NEWLINE) ) {
                        alt63=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 63, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA63_1==EOF||(LA63_1>=PLUS && LA63_1<=COMMA)||(LA63_1>=CLOSE && LA63_1<=GE)||LA63_1==REM||LA63_1==NEWLINE||LA63_1==70||LA63_1==73) ) {
                    alt63=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 63, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA63_0==LONG_LITERAL) ) {
                alt63=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:252:14: INT_LITERAL
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    INT_LITERAL177=(Token)match(input,INT_LITERAL,FOLLOW_INT_LITERAL_in_pos_number1617); 
                    INT_LITERAL177_tree = (ProvaAST)adaptor.create(INT_LITERAL177);
                    adaptor.addChild(root_0, INT_LITERAL177_tree);


                    }
                    break;
                case 2 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:252:28: LONG_LITERAL
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    LONG_LITERAL178=(Token)match(input,LONG_LITERAL,FOLLOW_LONG_LITERAL_in_pos_number1621); 
                    LONG_LITERAL178_tree = (ProvaAST)adaptor.create(LONG_LITERAL178);
                    adaptor.addChild(root_0, LONG_LITERAL178_tree);


                    }
                    break;
                case 3 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:252:43: float_literal
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_float_literal_in_pos_number1625);
                    float_literal179=float_literal();

                    state._fsp--;

                    adaptor.addChild(root_0, float_literal179.getTree());

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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:254:1: number : ( '-' )? pos_number ;
    public final Prova2Parser.number_return number() throws RecognitionException {
        Prova2Parser.number_return retval = new Prova2Parser.number_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token char_literal180=null;
        Prova2Parser.pos_number_return pos_number181 = null;


        ProvaAST char_literal180_tree=null;

        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:255:2: ( ( '-' )? pos_number )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:255:4: ( '-' )? pos_number
            {
            root_0 = (ProvaAST)adaptor.nil();

            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:255:4: ( '-' )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==MINUS) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:255:5: '-'
                    {
                    char_literal180=(Token)match(input,MINUS,FOLLOW_MINUS_in_number1636); 
                    char_literal180_tree = (ProvaAST)adaptor.create(char_literal180);
                    adaptor.addChild(root_0, char_literal180_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_pos_number_in_number1640);
            pos_number181=pos_number();

            state._fsp--;

            adaptor.addChild(root_0, pos_number181.getTree());

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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:257:1: mstring : ( LCWORD | string );
    public final Prova2Parser.mstring_return mstring() throws RecognitionException {
        Prova2Parser.mstring_return retval = new Prova2Parser.mstring_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token LCWORD182=null;
        Prova2Parser.string_return string183 = null;


        ProvaAST LCWORD182_tree=null;

        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:257:10: ( LCWORD | string )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==LCWORD) ) {
                alt65=1;
            }
            else if ( ((LA65_0>=STRING1 && LA65_0<=STRING2)) ) {
                alt65=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:258:2: LCWORD
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    LCWORD182=(Token)match(input,LCWORD,FOLLOW_LCWORD_in_mstring1650); 
                    LCWORD182_tree = (ProvaAST)adaptor.create(LCWORD182);
                    adaptor.addChild(root_0, LCWORD182_tree);


                    }
                    break;
                case 2 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:258:11: string
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_string_in_mstring1654);
                    string183=string();

                    state._fsp--;

                    adaptor.addChild(root_0, string183.getTree());

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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:260:1: constant : ( LCWORD | string | qualified_java_class );
    public final Prova2Parser.constant_return constant() throws RecognitionException {
        Prova2Parser.constant_return retval = new Prova2Parser.constant_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token LCWORD184=null;
        Prova2Parser.string_return string185 = null;

        Prova2Parser.qualified_java_class_return qualified_java_class186 = null;


        ProvaAST LCWORD184_tree=null;

        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:260:10: ( LCWORD | string | qualified_java_class )
            int alt66=3;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==LCWORD) ) {
                int LA66_1 = input.LA(2);

                if ( (LA66_1==DOT) ) {
                    int LA66_3 = input.LA(3);

                    if ( (LA66_3==EOF||LA66_3==NEWLINE) ) {
                        alt66=1;
                    }
                    else if ( ((LA66_3>=LCWORD && LA66_3<=UCWORD)) ) {
                        alt66=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 66, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA66_1==EOF||LA66_1==COMMA||(LA66_1>=OPEN && LA66_1<=GE)||LA66_1==NEWLINE||LA66_1==70||LA66_1==73) ) {
                    alt66=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 66, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA66_0>=STRING1 && LA66_0<=STRING2)) ) {
                alt66=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:261:2: LCWORD
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    LCWORD184=(Token)match(input,LCWORD,FOLLOW_LCWORD_in_constant1664); 
                    LCWORD184_tree = (ProvaAST)adaptor.create(LCWORD184);
                    adaptor.addChild(root_0, LCWORD184_tree);


                    }
                    break;
                case 2 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:261:11: string
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_string_in_constant1668);
                    string185=string();

                    state._fsp--;

                    adaptor.addChild(root_0, string185.getTree());

                    }
                    break;
                case 3 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:261:20: qualified_java_class
                    {
                    root_0 = (ProvaAST)adaptor.nil();

                    pushFollow(FOLLOW_qualified_java_class_in_constant1672);
                    qualified_java_class186=qualified_java_class();

                    state._fsp--;

                    adaptor.addChild(root_0, qualified_java_class186.getTree());

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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:263:1: string : ( STRING1 | STRING2 );
    public final Prova2Parser.string_return string() throws RecognitionException {
        Prova2Parser.string_return retval = new Prova2Parser.string_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token set187=null;

        ProvaAST set187_tree=null;

        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:263:8: ( STRING1 | STRING2 )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:
            {
            root_0 = (ProvaAST)adaptor.nil();

            set187=(Token)input.LT(1);
            if ( (input.LA(1)>=STRING1 && input.LA(1)<=STRING2) ) {
                input.consume();
                adaptor.addChild(root_0, (ProvaAST)adaptor.create(set187));
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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:265:1: not_equal : ( NOT_EQUAL1 | NOT_EQUAL2 );
    public final Prova2Parser.not_equal_return not_equal() throws RecognitionException {
        Prova2Parser.not_equal_return retval = new Prova2Parser.not_equal_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token set188=null;

        ProvaAST set188_tree=null;

        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:266:2: ( NOT_EQUAL1 | NOT_EQUAL2 )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:
            {
            root_0 = (ProvaAST)adaptor.nil();

            set188=(Token)input.LT(1);
            if ( (input.LA(1)>=NOT_EQUAL1 && input.LA(1)<=NOT_EQUAL2) ) {
                input.consume();
                adaptor.addChild(root_0, (ProvaAST)adaptor.create(set188));
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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:269:1: float_literal : INT_LITERAL DOT INT_LITERAL ( EXPONENT )? ;
    public final Prova2Parser.float_literal_return float_literal() throws RecognitionException {
        Prova2Parser.float_literal_return retval = new Prova2Parser.float_literal_return();
        retval.start = input.LT(1);

        ProvaAST root_0 = null;

        Token INT_LITERAL189=null;
        Token DOT190=null;
        Token INT_LITERAL191=null;
        Token EXPONENT192=null;

        ProvaAST INT_LITERAL189_tree=null;
        ProvaAST DOT190_tree=null;
        ProvaAST INT_LITERAL191_tree=null;
        ProvaAST EXPONENT192_tree=null;

        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:269:16: ( INT_LITERAL DOT INT_LITERAL ( EXPONENT )? )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:269:18: INT_LITERAL DOT INT_LITERAL ( EXPONENT )?
            {
            root_0 = (ProvaAST)adaptor.nil();

            INT_LITERAL189=(Token)match(input,INT_LITERAL,FOLLOW_INT_LITERAL_in_float_literal1708); 
            INT_LITERAL189_tree = (ProvaAST)adaptor.create(INT_LITERAL189);
            adaptor.addChild(root_0, INT_LITERAL189_tree);

            DOT190=(Token)match(input,DOT,FOLLOW_DOT_in_float_literal1710); 
            DOT190_tree = (ProvaAST)adaptor.create(DOT190);
            adaptor.addChild(root_0, DOT190_tree);

            INT_LITERAL191=(Token)match(input,INT_LITERAL,FOLLOW_INT_LITERAL_in_float_literal1712); 
            INT_LITERAL191_tree = (ProvaAST)adaptor.create(INT_LITERAL191);
            adaptor.addChild(root_0, INT_LITERAL191_tree);

            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:269:46: ( EXPONENT )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==EXPONENT) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\Prova2.g:269:46: EXPONENT
                    {
                    EXPONENT192=(Token)match(input,EXPONENT,FOLLOW_EXPONENT_in_float_literal1714); 
                    EXPONENT192_tree = (ProvaAST)adaptor.create(EXPONENT192);
                    adaptor.addChild(root_0, EXPONENT192_tree);


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
    protected DFA27 dfa27 = new DFA27(this);
    protected DFA30 dfa30 = new DFA30(this);
    protected DFA33 dfa33 = new DFA33(this);
    protected DFA35 dfa35 = new DFA35(this);
    protected DFA37 dfa37 = new DFA37(this);
    protected DFA45 dfa45 = new DFA45(this);
    protected DFA46 dfa46 = new DFA46(this);
    protected DFA48 dfa48 = new DFA48(this);
    protected DFA50 dfa50 = new DFA50(this);
    protected DFA49 dfa49 = new DFA49(this);
    protected DFA54 dfa54 = new DFA54(this);
    protected DFA57 dfa57 = new DFA57(this);
    static final String DFA1_eotS =
        "\4\uffff";
    static final String DFA1_eofS =
        "\2\2\2\uffff";
    static final String DFA1_minS =
        "\2\12\2\uffff";
    static final String DFA1_maxS =
        "\2\107\2\uffff";
    static final String DFA1_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA1_specialS =
        "\4\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\3\51\uffff\1\1\2\3\2\uffff\2\3\14\uffff\1\3",
            "\1\3\51\uffff\1\1\2\3\2\uffff\2\3\14\uffff\1\3",
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
            return "()* loopback of 88:4: ( statement )*";
        }
    }
    static final String DFA5_eotS =
        "\35\uffff";
    static final String DFA5_eofS =
        "\35\uffff";
    static final String DFA5_minS =
        "\1\12\1\65\1\6\2\uffff\1\14\1\uffff\1\6\1\64\3\11\1\67\1\4\1\11"+
        "\1\6\1\64\1\67\3\11\1\67\1\4\2\11\1\67\3\11";
    static final String DFA5_maxS =
        "\1\107\1\65\1\110\2\uffff\1\107\1\uffff\1\72\1\107\3\15\1\70\2"+
        "\15\1\72\1\107\1\67\3\15\1\70\2\15\1\73\1\67\1\15\1\73\1\15";
    static final String DFA5_acceptS =
        "\3\uffff\1\1\1\2\1\uffff\1\3\26\uffff";
    static final String DFA5_specialS =
        "\35\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\4\52\uffff\1\2\1\3\2\uffff\2\3\14\uffff\1\1",
            "\1\5",
            "\1\6\5\uffff\1\3\2\uffff\1\6\31\uffff\1\6\3\uffff\1\6\6\uffff"+
            "\7\6\13\uffff\1\6\1\uffff\1\6",
            "",
            "",
            "\1\7\47\uffff\1\10\1\2\1\3\2\uffff\2\3\14\uffff\1\1",
            "",
            "\1\14\56\uffff\1\11\1\12\1\15\1\16\2\13",
            "\1\10\1\2\1\3\2\uffff\2\3\14\uffff\1\1",
            "\1\17\3\uffff\1\20",
            "\1\17\3\uffff\1\20",
            "\1\17\3\uffff\1\20",
            "\1\15\1\16",
            "\1\21\4\uffff\1\17\3\uffff\1\20",
            "\1\17\3\uffff\1\20",
            "\1\25\56\uffff\1\22\1\23\1\26\1\27\2\24",
            "\1\10\1\2\1\3\2\uffff\2\3\14\uffff\1\1",
            "\1\30",
            "\1\17\3\uffff\1\20",
            "\1\17\3\uffff\1\20",
            "\1\17\3\uffff\1\20",
            "\1\26\1\27",
            "\1\31\4\uffff\1\17\3\uffff\1\20",
            "\1\17\3\uffff\1\20",
            "\1\17\3\uffff\1\20\55\uffff\1\32",
            "\1\33",
            "\1\17\3\uffff\1\20",
            "\1\17\3\uffff\1\20\55\uffff\1\34",
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
            return "96:1: stat : ( clause | query | function );";
        }
    }
    static final String DFA27_eotS =
        "\40\uffff";
    static final String DFA27_eofS =
        "\40\uffff";
    static final String DFA27_minS =
        "\2\6\1\65\2\4\1\14\2\uffff\1\6\1\uffff\2\6\3\11\1\67\1\4\1\11\2"+
        "\6\1\67\3\11\1\67\1\4\2\11\1\67\3\11";
    static final String DFA27_maxS =
        "\2\107\1\65\3\27\2\uffff\1\107\1\uffff\1\72\1\107\3\15\1\70\2\15"+
        "\1\72\1\107\1\67\3\15\1\70\2\15\1\73\1\67\1\15\1\73\1\15";
    static final String DFA27_acceptS =
        "\6\uffff\1\2\1\3\1\uffff\1\1\26\uffff";
    static final String DFA27_specialS =
        "\40\uffff}>";
    static final String[] DFA27_transitionS = {
            "\1\6\4\uffff\1\7\3\uffff\1\6\31\uffff\1\6\3\uffff\1\6\6\uffff"+
            "\1\1\1\3\1\4\2\6\2\5\14\uffff\1\2",
            "\1\6\4\uffff\1\7\3\uffff\1\6\31\uffff\1\6\3\uffff\1\6\6\uffff"+
            "\1\1\1\3\1\4\2\6\2\5\14\uffff\1\2",
            "\1\10",
            "\1\6\7\uffff\1\11\4\uffff\7\6",
            "\1\6\7\uffff\1\11\4\uffff\7\6",
            "\1\11\4\uffff\7\6",
            "",
            "",
            "\1\6\5\uffff\1\12\2\uffff\1\6\31\uffff\1\6\3\uffff\1\6\6\uffff"+
            "\1\13\1\3\1\4\2\6\2\5\14\uffff\1\2",
            "",
            "\1\17\56\uffff\1\14\1\15\1\20\1\21\2\16",
            "\1\6\10\uffff\1\6\31\uffff\1\6\3\uffff\1\6\6\uffff\1\13\1"+
            "\3\1\4\2\6\2\5\14\uffff\1\2",
            "\1\22\3\uffff\1\23",
            "\1\22\3\uffff\1\23",
            "\1\22\3\uffff\1\23",
            "\1\20\1\21",
            "\1\24\4\uffff\1\22\3\uffff\1\23",
            "\1\22\3\uffff\1\23",
            "\1\30\56\uffff\1\25\1\26\1\31\1\32\2\27",
            "\1\6\10\uffff\1\6\31\uffff\1\6\3\uffff\1\6\6\uffff\1\13\1"+
            "\3\1\4\2\6\2\5\14\uffff\1\2",
            "\1\33",
            "\1\22\3\uffff\1\23",
            "\1\22\3\uffff\1\23",
            "\1\22\3\uffff\1\23",
            "\1\31\1\32",
            "\1\34\4\uffff\1\22\3\uffff\1\23",
            "\1\22\3\uffff\1\23",
            "\1\22\3\uffff\1\23\55\uffff\1\35",
            "\1\36",
            "\1\22\3\uffff\1\23",
            "\1\22\3\uffff\1\23\55\uffff\1\37",
            "\1\22\3\uffff\1\23"
    };

    static final short[] DFA27_eot = DFA.unpackEncodedString(DFA27_eotS);
    static final short[] DFA27_eof = DFA.unpackEncodedString(DFA27_eofS);
    static final char[] DFA27_min = DFA.unpackEncodedStringToUnsignedChars(DFA27_minS);
    static final char[] DFA27_max = DFA.unpackEncodedStringToUnsignedChars(DFA27_maxS);
    static final short[] DFA27_accept = DFA.unpackEncodedString(DFA27_acceptS);
    static final short[] DFA27_special = DFA.unpackEncodedString(DFA27_specialS);
    static final short[][] DFA27_transition;

    static {
        int numStates = DFA27_transitionS.length;
        DFA27_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA27_transition[i] = DFA.unpackEncodedString(DFA27_transitionS[i]);
        }
    }

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = DFA27_eot;
            this.eof = DFA27_eof;
            this.min = DFA27_min;
            this.max = DFA27_max;
            this.accept = DFA27_accept;
            this.special = DFA27_special;
            this.transition = DFA27_transition;
        }
        public String getDescription() {
            return "124:1: literal : ( ( NEWLINE )* (m= metadata )? r= relation (g= guard )? -> ^( RELATION ( metadata )? relation ( guard )? ) | ( NEWLINE )* (m= metadata )? semantic_attachment (g= guard )? -> ^( SEMANTIC_ATTACHMENT ( metadata )? semantic_attachment ( guard )? ) | ( NEWLINE )* cut -> ^( CUT cut ) );";
        }
    }
    static final String DFA30_eotS =
        "\4\uffff";
    static final String DFA30_eofS =
        "\4\uffff";
    static final String DFA30_minS =
        "\2\6\2\uffff";
    static final String DFA30_maxS =
        "\2\110\2\uffff";
    static final String DFA30_acceptS =
        "\2\uffff\1\1\1\2";
    static final String DFA30_specialS =
        "\4\uffff}>";
    static final String[] DFA30_transitionS = {
            "\1\2\6\uffff\1\3\1\uffff\1\2\1\3\30\uffff\1\2\3\uffff\1\2\6"+
            "\uffff\1\1\6\2\13\uffff\1\3\1\uffff\1\2",
            "\1\2\6\uffff\1\3\1\uffff\1\2\1\3\30\uffff\1\2\3\uffff\1\2"+
            "\6\uffff\1\1\6\2\13\uffff\1\3\1\uffff\1\2",
            "",
            ""
    };

    static final short[] DFA30_eot = DFA.unpackEncodedString(DFA30_eotS);
    static final short[] DFA30_eof = DFA.unpackEncodedString(DFA30_eofS);
    static final char[] DFA30_min = DFA.unpackEncodedStringToUnsignedChars(DFA30_minS);
    static final char[] DFA30_max = DFA.unpackEncodedStringToUnsignedChars(DFA30_maxS);
    static final short[] DFA30_accept = DFA.unpackEncodedString(DFA30_acceptS);
    static final short[] DFA30_special = DFA.unpackEncodedString(DFA30_specialS);
    static final short[][] DFA30_transition;

    static {
        int numStates = DFA30_transitionS.length;
        DFA30_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA30_transition[i] = DFA.unpackEncodedString(DFA30_transitionS[i]);
        }
    }

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = DFA30_eot;
            this.eof = DFA30_eof;
            this.min = DFA30_min;
            this.max = DFA30_max;
            this.accept = DFA30_accept;
            this.special = DFA30_special;
            this.transition = DFA30_transition;
        }
        public String getDescription() {
            return "142:5: ( terms ( '|' list_tail )? )?";
        }
    }
    static final String DFA33_eotS =
        "\4\uffff";
    static final String DFA33_eofS =
        "\4\uffff";
    static final String DFA33_minS =
        "\2\4\2\uffff";
    static final String DFA33_maxS =
        "\2\110\2\uffff";
    static final String DFA33_acceptS =
        "\2\uffff\1\1\1\2";
    static final String DFA33_specialS =
        "\4\uffff}>";
    static final String[] DFA33_transitionS = {
            "\1\3\1\uffff\1\2\10\uffff\1\2\1\uffff\1\3\27\uffff\1\2\3\uffff"+
            "\1\2\6\uffff\1\1\6\2\15\uffff\1\2",
            "\1\3\1\uffff\1\2\10\uffff\1\2\31\uffff\1\2\3\uffff\1\2\6\uffff"+
            "\1\1\6\2\15\uffff\1\2",
            "",
            ""
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
            return "145:5: ( terms ( '|' list_tail )? )?";
        }
    }
    static final String DFA35_eotS =
        "\13\uffff";
    static final String DFA35_eofS =
        "\6\uffff\1\2\2\uffff\1\2\1\uffff";
    static final String DFA35_minS =
        "\1\6\1\4\4\uffff\1\64\2\4\1\64\1\65";
    static final String DFA35_maxS =
        "\1\72\1\111\4\uffff\1\66\1\111\1\4\2\66";
    static final String DFA35_acceptS =
        "\2\uffff\1\1\1\2\1\3\1\4\5\uffff";
    static final String DFA35_specialS =
        "\13\uffff}>";
    static final String[] DFA35_transitionS = {
            "\1\4\10\uffff\1\5\31\uffff\1\3\3\uffff\1\3\7\uffff\1\1\1\3"+
            "\2\4\2\2",
            "\1\6\4\uffff\1\2\3\uffff\2\2\1\uffff\10\2\34\uffff\1\2\21"+
            "\uffff\1\2\2\uffff\1\2",
            "",
            "",
            "",
            "",
            "\1\2\1\10\1\7",
            "\1\11\4\uffff\1\2\3\uffff\2\2\1\uffff\10\2\34\uffff\1\2\21"+
            "\uffff\1\2\2\uffff\1\2",
            "\1\12",
            "\1\2\2\3",
            "\1\10\1\7"
    };

    static final short[] DFA35_eot = DFA.unpackEncodedString(DFA35_eotS);
    static final short[] DFA35_eof = DFA.unpackEncodedString(DFA35_eofS);
    static final char[] DFA35_min = DFA.unpackEncodedStringToUnsignedChars(DFA35_minS);
    static final char[] DFA35_max = DFA.unpackEncodedStringToUnsignedChars(DFA35_maxS);
    static final short[] DFA35_accept = DFA.unpackEncodedString(DFA35_acceptS);
    static final short[] DFA35_special = DFA.unpackEncodedString(DFA35_specialS);
    static final short[][] DFA35_transition;

    static {
        int numStates = DFA35_transitionS.length;
        DFA35_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA35_transition[i] = DFA.unpackEncodedString(DFA35_transitionS[i]);
        }
    }

    class DFA35 extends DFA {

        public DFA35(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 35;
            this.eot = DFA35_eot;
            this.eof = DFA35_eof;
            this.min = DFA35_min;
            this.max = DFA35_max;
            this.accept = DFA35_accept;
            this.special = DFA35_special;
            this.transition = DFA35_transition;
        }
        public String getDescription() {
            return "150:1: left_term : ( constant | variable | number | prova_list );";
        }
    }
    static final String DFA37_eotS =
        "\7\uffff";
    static final String DFA37_eofS =
        "\1\uffff\1\2\3\uffff\1\2\1\uffff";
    static final String DFA37_minS =
        "\1\51\1\4\2\uffff\1\65\2\4";
    static final String DFA37_maxS =
        "\1\72\1\4\2\uffff\1\66\2\4";
    static final String DFA37_acceptS =
        "\2\uffff\1\1\1\2\3\uffff";
    static final String DFA37_specialS =
        "\7\uffff}>";
    static final String[] DFA37_transitionS = {
            "\1\3\3\uffff\1\3\7\uffff\1\1\1\3\2\uffff\2\2",
            "\1\4",
            "",
            "",
            "\1\6\1\5",
            "\1\3",
            "\1\4"
    };

    static final short[] DFA37_eot = DFA.unpackEncodedString(DFA37_eotS);
    static final short[] DFA37_eof = DFA.unpackEncodedString(DFA37_eofS);
    static final char[] DFA37_min = DFA.unpackEncodedStringToUnsignedChars(DFA37_minS);
    static final char[] DFA37_max = DFA.unpackEncodedStringToUnsignedChars(DFA37_maxS);
    static final short[] DFA37_accept = DFA.unpackEncodedString(DFA37_acceptS);
    static final short[] DFA37_special = DFA.unpackEncodedString(DFA37_specialS);
    static final short[][] DFA37_transition;

    static {
        int numStates = DFA37_transitionS.length;
        DFA37_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA37_transition[i] = DFA.unpackEncodedString(DFA37_transitionS[i]);
        }
    }

    class DFA37 extends DFA {

        public DFA37(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 37;
            this.eot = DFA37_eot;
            this.eof = DFA37_eof;
            this.min = DFA37_min;
            this.max = DFA37_max;
            this.accept = DFA37_accept;
            this.special = DFA37_special;
            this.transition = DFA37_transition;
        }
        public String getDescription() {
            return "157:12: ( constant | variable )";
        }
    }
    static final String DFA45_eotS =
        "\4\uffff";
    static final String DFA45_eofS =
        "\4\uffff";
    static final String DFA45_minS =
        "\1\4\1\uffff\1\4\1\uffff";
    static final String DFA45_maxS =
        "\1\106\1\uffff\1\106\1\uffff";
    static final String DFA45_acceptS =
        "\1\uffff\1\2\1\uffff\1\1";
    static final String DFA45_specialS =
        "\4\uffff}>";
    static final String[] DFA45_transitionS = {
            "\1\1\4\uffff\1\3\3\uffff\2\1\1\uffff\2\1\42\uffff\1\2\21\uffff"+
            "\1\1",
            "",
            "\1\1\4\uffff\1\3\3\uffff\1\1\2\uffff\1\1\43\uffff\1\2\21\uffff"+
            "\1\1",
            ""
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
            return "()* loopback of 167:24: ( ( NEWLINE )* ',' ( NEWLINE )* term )*";
        }
    }
    static final String DFA46_eotS =
        "\17\uffff";
    static final String DFA46_eofS =
        "\6\uffff\1\4\1\uffff\1\4\3\uffff\1\4\2\uffff";
    static final String DFA46_minS =
        "\1\6\3\4\2\uffff\1\64\1\uffff\1\64\3\4\1\64\1\65\1\4";
    static final String DFA46_maxS =
        "\1\110\3\111\2\uffff\1\66\1\uffff\1\66\1\111\1\4\1\111\2\66\1\111";
    static final String DFA46_acceptS =
        "\4\uffff\1\1\1\3\1\uffff\1\2\7\uffff";
    static final String DFA46_specialS =
        "\17\uffff}>";
    static final String[] DFA46_transitionS = {
            "\1\4\10\uffff\1\4\31\uffff\1\4\3\uffff\1\4\7\uffff\1\1\1\3"+
            "\2\4\2\2\15\uffff\1\5",
            "\1\6\4\uffff\1\4\2\uffff\1\7\2\4\1\uffff\2\4\42\uffff\1\4"+
            "\21\uffff\1\4\2\uffff\1\4",
            "\1\4\4\uffff\1\4\2\uffff\1\7\2\4\1\uffff\2\4\42\uffff\1\4"+
            "\21\uffff\1\4\2\uffff\1\4",
            "\1\10\4\uffff\1\4\2\uffff\1\7\2\4\1\uffff\2\4\42\uffff\1\4"+
            "\21\uffff\1\4\2\uffff\1\4",
            "",
            "",
            "\1\4\1\12\1\11",
            "",
            "\1\4\2\13",
            "\1\14\4\uffff\1\4\3\uffff\2\4\1\uffff\2\4\42\uffff\1\4\21"+
            "\uffff\1\4\2\uffff\1\4",
            "\1\15",
            "\1\4\4\uffff\1\4\2\uffff\1\7\2\4\1\uffff\2\4\42\uffff\1\4"+
            "\21\uffff\1\4\2\uffff\1\4",
            "\1\4\2\16",
            "\1\12\1\11",
            "\1\4\4\uffff\1\4\2\uffff\1\7\2\4\1\uffff\2\4\42\uffff\1\4"+
            "\21\uffff\1\4\2\uffff\1\4"
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
            return "169:1: term : ( left_term | func_term | prova_map );";
        }
    }
    static final String DFA48_eotS =
        "\20\uffff";
    static final String DFA48_eofS =
        "\20\uffff";
    static final String DFA48_minS =
        "\1\6\4\4\1\uffff\2\65\1\uffff\4\4\1\65\2\4";
    static final String DFA48_maxS =
        "\1\72\4\27\1\uffff\2\66\1\uffff\1\27\1\4\2\27\1\66\2\27";
    static final String DFA48_acceptS =
        "\5\uffff\1\2\2\uffff\1\1\7\uffff";
    static final String DFA48_specialS =
        "\20\uffff}>";
    static final String[] DFA48_transitionS = {
            "\1\5\10\uffff\1\5\31\uffff\1\3\3\uffff\1\4\7\uffff\1\1\1\2"+
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
            return "183:1: semantic_attachment : ( predicate_java_call | binary_operation );";
        }
    }
    static final String DFA50_eotS =
        "\13\uffff";
    static final String DFA50_eofS =
        "\6\uffff\1\5\2\uffff\1\5\1\uffff";
    static final String DFA50_minS =
        "\1\21\1\uffff\1\6\1\uffff\1\4\1\uffff\1\64\2\4\1\64\1\65";
    static final String DFA50_maxS =
        "\1\27\1\uffff\1\72\1\uffff\1\64\1\uffff\1\66\1\64\1\4\2\66";
    static final String DFA50_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\1\uffff\1\2\5\uffff";
    static final String DFA50_specialS =
        "\13\uffff}>";
    static final String[] DFA50_transitionS = {
            "\1\1\2\2\4\3",
            "",
            "\1\3\5\uffff\1\3\34\uffff\1\3\3\uffff\1\3\7\uffff\1\4\3\3"+
            "\2\5",
            "",
            "\1\6\4\uffff\1\5\5\uffff\2\5\43\uffff\1\5",
            "",
            "\1\5\1\10\1\7",
            "\1\11\4\uffff\1\5\5\uffff\2\5\43\uffff\1\5",
            "\1\12",
            "\1\5\2\3",
            "\1\10\1\7"
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
            return "188:3: ( EQUAL ( constructor_java_call | prova_list | constant | expr ) | not_equal constant | binary_operator expr )";
        }
    }
    static final String DFA49_eotS =
        "\14\uffff";
    static final String DFA49_eofS =
        "\6\uffff\1\4\3\uffff\1\4\1\uffff";
    static final String DFA49_minS =
        "\1\6\2\4\3\uffff\1\64\1\uffff\2\4\1\64\1\65";
    static final String DFA49_maxS =
        "\1\72\2\64\3\uffff\1\66\1\uffff\1\64\1\4\2\66";
    static final String DFA49_acceptS =
        "\3\uffff\1\2\1\3\1\4\1\uffff\1\1\4\uffff";
    static final String DFA49_specialS =
        "\14\uffff}>";
    static final String[] DFA49_transitionS = {
            "\1\5\5\uffff\1\5\2\uffff\1\3\31\uffff\1\5\3\uffff\1\5\7\uffff"+
            "\1\1\1\2\2\5\2\4",
            "\1\6\4\uffff\1\4\5\uffff\2\4\43\uffff\1\4",
            "\6\5\2\uffff\1\7\2\uffff\2\5\33\uffff\1\5\7\uffff\1\5",
            "",
            "",
            "",
            "\1\4\1\11\1\10",
            "",
            "\1\12\4\uffff\1\4\2\uffff\1\7\2\uffff\2\4\43\uffff\1\4",
            "\1\13",
            "\1\4\2\5",
            "\1\11\1\10"
    };

    static final short[] DFA49_eot = DFA.unpackEncodedString(DFA49_eotS);
    static final short[] DFA49_eof = DFA.unpackEncodedString(DFA49_eofS);
    static final char[] DFA49_min = DFA.unpackEncodedStringToUnsignedChars(DFA49_minS);
    static final char[] DFA49_max = DFA.unpackEncodedStringToUnsignedChars(DFA49_maxS);
    static final short[] DFA49_accept = DFA.unpackEncodedString(DFA49_acceptS);
    static final short[] DFA49_special = DFA.unpackEncodedString(DFA49_specialS);
    static final short[][] DFA49_transition;

    static {
        int numStates = DFA49_transitionS.length;
        DFA49_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA49_transition[i] = DFA.unpackEncodedString(DFA49_transitionS[i]);
        }
    }

    class DFA49 extends DFA {

        public DFA49(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 49;
            this.eot = DFA49_eot;
            this.eof = DFA49_eof;
            this.min = DFA49_min;
            this.max = DFA49_max;
            this.accept = DFA49_accept;
            this.special = DFA49_special;
            this.transition = DFA49_transition;
        }
        public String getDescription() {
            return "189:4: ( constructor_java_call | prova_list | constant | expr )";
        }
    }
    static final String DFA54_eotS =
        "\23\uffff";
    static final String DFA54_eofS =
        "\10\uffff\1\11\1\uffff\1\11\10\uffff";
    static final String DFA54_minS =
        "\1\6\1\51\4\4\2\uffff\1\64\1\uffff\1\64\1\65\2\4\1\uffff\1\4\1"+
        "\65\2\4";
    static final String DFA54_maxS =
        "\2\70\2\64\1\4\1\64\2\uffff\1\66\1\uffff\1\65\1\66\2\64\1\uffff"+
        "\1\4\1\66\2\64";
    static final String DFA54_acceptS =
        "\6\uffff\1\2\1\4\1\uffff\1\1\4\uffff\1\3\4\uffff";
    static final String DFA54_specialS =
        "\23\uffff}>";
    static final String[] DFA54_transitionS = {
            "\1\1\5\uffff\1\7\34\uffff\1\3\3\uffff\1\5\7\uffff\1\4\1\2\2"+
            "\6",
            "\1\3\3\uffff\1\5\7\uffff\1\4\1\2\2\6",
            "\1\10\5\11\3\uffff\1\11\1\uffff\2\11\33\uffff\1\11\7\uffff"+
            "\1\11",
            "\1\12\5\11\3\uffff\1\11\1\uffff\2\11\33\uffff\1\11\7\uffff"+
            "\1\11",
            "\1\13",
            "\1\12\5\11\3\uffff\1\11\1\uffff\2\11\33\uffff\1\11\7\uffff"+
            "\1\11",
            "",
            "",
            "\1\11\1\14\1\15",
            "",
            "\1\11\1\16",
            "\1\4\1\17",
            "\1\12\5\11\2\uffff\1\16\1\11\1\uffff\2\11\33\uffff\1\11\7"+
            "\uffff\1\11",
            "\1\12\5\11\3\uffff\1\11\1\uffff\2\11\33\uffff\1\11\7\uffff"+
            "\1\11",
            "",
            "\1\20",
            "\1\21\1\22",
            "\1\12\5\11\2\uffff\1\16\1\11\1\uffff\2\11\33\uffff\1\11\7"+
            "\uffff\1\11",
            "\1\12\5\11\3\uffff\1\11\1\uffff\2\11\33\uffff\1\11\7\uffff"+
            "\1\11"
    };

    static final short[] DFA54_eot = DFA.unpackEncodedString(DFA54_eotS);
    static final short[] DFA54_eof = DFA.unpackEncodedString(DFA54_eofS);
    static final char[] DFA54_min = DFA.unpackEncodedStringToUnsignedChars(DFA54_minS);
    static final char[] DFA54_max = DFA.unpackEncodedStringToUnsignedChars(DFA54_maxS);
    static final short[] DFA54_accept = DFA.unpackEncodedString(DFA54_acceptS);
    static final short[] DFA54_special = DFA.unpackEncodedString(DFA54_specialS);
    static final short[][] DFA54_transition;

    static {
        int numStates = DFA54_transitionS.length;
        DFA54_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA54_transition[i] = DFA.unpackEncodedString(DFA54_transitionS[i]);
        }
    }

    class DFA54 extends DFA {

        public DFA54(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 54;
            this.eot = DFA54_eot;
            this.eof = DFA54_eof;
            this.min = DFA54_min;
            this.max = DFA54_max;
            this.accept = DFA54_accept;
            this.special = DFA54_special;
            this.transition = DFA54_transition;
        }
        public String getDescription() {
            return "201:9: ( ( MINUS )? variable | number | ( MINUS )? predicate_java_call | OPEN expr CLOSE )";
        }
    }
    static final String DFA57_eotS =
        "\10\uffff";
    static final String DFA57_eofS =
        "\10\uffff";
    static final String DFA57_minS =
        "\1\51\1\4\1\uffff\1\65\1\4\1\65\1\4\1\uffff";
    static final String DFA57_maxS =
        "\1\66\1\4\1\uffff\1\66\1\4\1\66\1\14\1\uffff";
    static final String DFA57_acceptS =
        "\2\uffff\1\2\4\uffff\1\1";
    static final String DFA57_specialS =
        "\10\uffff}>";
    static final String[] DFA57_transitionS = {
            "\1\2\3\uffff\1\2\7\uffff\1\1\1\2",
            "\1\3",
            "",
            "\1\1\1\4",
            "\1\5",
            "\1\6\1\2",
            "\1\2\7\uffff\1\7",
            ""
    };

    static final short[] DFA57_eot = DFA.unpackEncodedString(DFA57_eotS);
    static final short[] DFA57_eof = DFA.unpackEncodedString(DFA57_eofS);
    static final char[] DFA57_min = DFA.unpackEncodedStringToUnsignedChars(DFA57_minS);
    static final char[] DFA57_max = DFA.unpackEncodedStringToUnsignedChars(DFA57_maxS);
    static final short[] DFA57_accept = DFA.unpackEncodedString(DFA57_acceptS);
    static final short[] DFA57_special = DFA.unpackEncodedString(DFA57_specialS);
    static final short[][] DFA57_transition;

    static {
        int numStates = DFA57_transitionS.length;
        DFA57_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA57_transition[i] = DFA.unpackEncodedString(DFA57_transitionS[i]);
        }
    }

    class DFA57 extends DFA {

        public DFA57(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 57;
            this.eot = DFA57_eot;
            this.eof = DFA57_eof;
            this.min = DFA57_min;
            this.max = DFA57_max;
            this.accept = DFA57_accept;
            this.special = DFA57_special;
            this.transition = DFA57_transition;
        }
        public String getDescription() {
            return "207:1: predicate_java_call : ( static_java_call | instance_java_call );";
        }
    }
 

    public static final BitSet FOLLOW_statement_in_rulebase339 = new BitSet(new long[]{0x0670000000000400L,0x0000000000000080L});
    public static final BitSet FOLLOW_NEWLINE_in_rulebase342 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_EOF_in_rulebase345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_statement363 = new BitSet(new long[]{0x0670000000000400L,0x0000000000000080L});
    public static final BitSet FOLLOW_stat_in_statement366 = new BitSet(new long[]{0x0010000000000010L});
    public static final BitSet FOLLOW_end_of_statement_in_statement368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_end_of_statement385 = new BitSet(new long[]{0x0010000000000010L});
    public static final BitSet FOLLOW_DOT_in_end_of_statement388 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_set_in_end_of_statement390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_clause_in_stat407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_query_in_stat413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_stat419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_metadata_in_function429 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_LCWORD_in_function432 = new BitSet(new long[]{0x07F0220000008040L,0x00000000000001C0L});
    public static final BitSet FOLLOW_list_body_in_function434 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_function436 = new BitSet(new long[]{0x07F0220000028040L,0x0000000000000180L});
    public static final BitSet FOLLOW_list_body0_in_function438 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_EQUAL_in_function441 = new BitSet(new long[]{0x07F0220000008840L,0x0000000000000080L});
    public static final BitSet FOLLOW_literals_in_function443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_query472 = new BitSet(new long[]{0x0670000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_NEWLINE_in_query474 = new BitSet(new long[]{0x0670000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_query_predicate_in_query477 = new BitSet(new long[]{0x0010000000001000L});
    public static final BitSet FOLLOW_NEWLINE_in_query479 = new BitSet(new long[]{0x0010000000001000L});
    public static final BitSet FOLLOW_OPEN_in_query482 = new BitSet(new long[]{0x0670000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_NEWLINE_in_query484 = new BitSet(new long[]{0x0670000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_relation_in_query487 = new BitSet(new long[]{0x0010000000002000L});
    public static final BitSet FOLLOW_NEWLINE_in_query489 = new BitSet(new long[]{0x0010000000002000L});
    public static final BitSet FOLLOW_CLOSE_in_query492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_query_predicate512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_metadata_in_clause521 = new BitSet(new long[]{0x0660000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_relation_in_clause524 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_IF_in_clause527 = new BitSet(new long[]{0x07F0220000008840L,0x0000000000000080L});
    public static final BitSet FOLLOW_literals_in_clause529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_in_metadata555 = new BitSet(new long[]{0x0010000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_NEWLINE_in_metadata557 = new BitSet(new long[]{0x0010000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_annotation579 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_LCWORD_in_annotation581 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_OPEN_in_annotation584 = new BitSet(new long[]{0x07E0000000000040L,0x0000000000000080L});
    public static final BitSet FOLLOW_value_in_annotation586 = new BitSet(new long[]{0x0000000000002200L});
    public static final BitSet FOLLOW_COMMA_in_annotation589 = new BitSet(new long[]{0x07E0000000000040L,0x0000000000000080L});
    public static final BitSet FOLLOW_value_in_annotation591 = new BitSet(new long[]{0x0000000000002200L});
    public static final BitSet FOLLOW_CLOSE_in_annotation595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCWORD_in_value620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UCWORD_in_value624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_in_value628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_value632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_literals642 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_COMMA_in_literals645 = new BitSet(new long[]{0x07F0220000008840L,0x0000000000000080L});
    public static final BitSet FOLLOW_literal_in_literals647 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_NEWLINE_in_literal667 = new BitSet(new long[]{0x0670000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_metadata_in_literal672 = new BitSet(new long[]{0x0660000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_relation_in_literal677 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_guard_in_literal681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_literal703 = new BitSet(new long[]{0x07F0220000008040L,0x0000000000000080L});
    public static final BitSet FOLLOW_metadata_in_literal708 = new BitSet(new long[]{0x07F0220000008040L,0x0000000000000080L});
    public static final BitSet FOLLOW_semantic_attachment_in_literal711 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_guard_in_literal715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_literal737 = new BitSet(new long[]{0x07F0220000008840L,0x0000000000000080L});
    public static final BitSet FOLLOW_cut_in_literal740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CUT_in_cut756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_not_equal_in_binary_operator765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_binary_operator769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_binary_operator773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LE_in_binary_operator777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GE_in_binary_operator781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_predicate_in_relation793 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_OPEN_in_relation795 = new BitSet(new long[]{0x07F022000000A040L,0x0000000000000180L});
    public static final BitSet FOLLOW_list_body_in_relation797 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_CLOSE_in_relation799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BRA_in_guard818 = new BitSet(new long[]{0x07F0220000008840L,0x0000000000000080L});
    public static final BitSet FOLLOW_literals_in_guard820 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_KET_in_guard822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terms_in_list_body843 = new BitSet(new long[]{0x0010000000004002L});
    public static final BitSet FOLLOW_BAR_in_list_body846 = new BitSet(new long[]{0x07E0220000008040L,0x0000000000000080L});
    public static final BitSet FOLLOW_list_tail_in_list_body848 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_list_body854 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_terms_in_list_body0880 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_BAR_in_list_body0883 = new BitSet(new long[]{0x07E0220000008040L,0x0000000000000080L});
    public static final BitSet FOLLOW_list_tail_in_list_body0885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_list_tail913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prova_list_in_list_tail917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_left_term927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_left_term934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_left_term940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prova_list_in_left_term946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_right_term957 = new BitSet(new long[]{0x0660220000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_constant_in_right_term961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_right_term965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_right_term971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prova_list_in_right_term975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prova_map_in_right_term979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_prova_map989 = new BitSet(new long[]{0x0660000000000200L,0x0000000000000280L});
    public static final BitSet FOLLOW_key_value_in_prova_map991 = new BitSet(new long[]{0x0000000000000200L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_prova_map995 = new BitSet(new long[]{0x0660000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_key_value_in_prova_map997 = new BitSet(new long[]{0x0000000000000200L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_prova_map1001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mstring_in_key_value1021 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000440L});
    public static final BitSet FOLLOW_74_in_key_value1024 = new BitSet(new long[]{0x07F0220000008040L,0x0000000000000180L});
    public static final BitSet FOLLOW_70_in_key_value1026 = new BitSet(new long[]{0x07F0220000008040L,0x0000000000000180L});
    public static final BitSet FOLLOW_term_in_key_value1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_terms1052 = new BitSet(new long[]{0x07F0220000008040L,0x0000000000000180L});
    public static final BitSet FOLLOW_term_in_terms1055 = new BitSet(new long[]{0x0010000000000202L});
    public static final BitSet FOLLOW_NEWLINE_in_terms1058 = new BitSet(new long[]{0x0010000000000200L});
    public static final BitSet FOLLOW_COMMA_in_terms1061 = new BitSet(new long[]{0x07F0220000008040L,0x0000000000000180L});
    public static final BitSet FOLLOW_NEWLINE_in_terms1063 = new BitSet(new long[]{0x07F0220000008040L,0x0000000000000180L});
    public static final BitSet FOLLOW_term_in_terms1066 = new BitSet(new long[]{0x0010000000000202L});
    public static final BitSet FOLLOW_left_term_in_term1085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_func_term_in_term1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prova_map_in_term1093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_func_in_func_term1102 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_args_in_func_term1104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCWORD_in_qualified_java_class1117 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_DOT_in_qualified_java_class1119 = new BitSet(new long[]{0x0060000000000000L});
    public static final BitSet FOLLOW_UCWORD_in_qualified_java_class1123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BRA_in_prova_list1151 = new BitSet(new long[]{0x07F0220000018040L,0x0000000000000180L});
    public static final BitSet FOLLOW_list_body_in_prova_list1153 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_KET_in_prova_list1155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_in_args1172 = new BitSet(new long[]{0x07F022000000A040L,0x0000000000000180L});
    public static final BitSet FOLLOW_list_body_in_args1174 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_CLOSE_in_args1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_predicate_java_call_in_semantic_attachment1194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_binary_operation_in_semantic_attachment1198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_left_term_in_binary_operation1207 = new BitSet(new long[]{0x0000000000FE0000L});
    public static final BitSet FOLLOW_EQUAL_in_binary_operation1213 = new BitSet(new long[]{0x07E0220000009040L,0x0000000000000080L});
    public static final BitSet FOLLOW_constructor_java_call_in_binary_operation1223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prova_list_in_binary_operation1230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_binary_operation1237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_binary_operation1244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_not_equal_in_binary_operation1255 = new BitSet(new long[]{0x0660000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_constant_in_binary_operation1257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_binary_operator_in_binary_operation1263 = new BitSet(new long[]{0x07E0220000009040L,0x0000000000000080L});
    public static final BitSet FOLLOW_expr_in_binary_operation1265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_aterm_in_expr1277 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_set_in_expr1280 = new BitSet(new long[]{0x07E0220000009040L,0x0000000000000080L});
    public static final BitSet FOLLOW_expr_in_expr1288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_aterm1300 = new BitSet(new long[]{0x0660220000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_variable_in_aterm1303 = new BitSet(new long[]{0x0000100000000182L});
    public static final BitSet FOLLOW_number_in_aterm1307 = new BitSet(new long[]{0x0000100000000182L});
    public static final BitSet FOLLOW_MINUS_in_aterm1311 = new BitSet(new long[]{0x0660220000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_predicate_java_call_in_aterm1314 = new BitSet(new long[]{0x0000100000000182L});
    public static final BitSet FOLLOW_OPEN_in_aterm1318 = new BitSet(new long[]{0x07E0220000009040L,0x0000000000000080L});
    public static final BitSet FOLLOW_expr_in_aterm1320 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_CLOSE_in_aterm1322 = new BitSet(new long[]{0x0000100000000182L});
    public static final BitSet FOLLOW_set_in_aterm1326 = new BitSet(new long[]{0x07E0220000009040L,0x0000000000000080L});
    public static final BitSet FOLLOW_aterm_in_aterm1340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualified_java_class_in_constructor_java_call1352 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_UCWORD_in_constructor_java_call1356 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_args_in_constructor_java_call1359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_static_java_call_in_predicate_java_call1370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instance_java_call_in_predicate_java_call1374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instance_call_in_instance_java_call1385 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_args_in_instance_java_call1387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_static_call_in_static_java_call1408 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_args_in_static_java_call1410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCWORD_in_method1431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCWORD_in_func1439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UCWORD_in_func1443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_in_func1447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typed_variable_in_func1451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCWORD_in_predicate1461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UCWORD_in_predicate1465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_in_predicate1469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UCWORD_in_variable1476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USWORD_in_variable1480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typed_variable_in_variable1484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOLLARWORD_in_variable1488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_variable_or_number1498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_variable_or_number1502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_word0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualified_java_class_in_typed_variable1529 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_DOT_in_typed_variable1531 = new BitSet(new long[]{0x0060000000000000L});
    public static final BitSet FOLLOW_word_in_typed_variable1533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UCWORD_in_typed_variable1549 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_DOT_in_typed_variable1551 = new BitSet(new long[]{0x0060000000000000L});
    public static final BitSet FOLLOW_word_in_typed_variable1553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_instance_call1575 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_DOT_in_instance_call1577 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_LCWORD_in_instance_call1579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualified_java_class_in_static_call1597 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_DOT_in_static_call1599 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_LCWORD_in_static_call1601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_LITERAL_in_pos_number1617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONG_LITERAL_in_pos_number1621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_float_literal_in_pos_number1625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_number1636 = new BitSet(new long[]{0x0180000000000040L});
    public static final BitSet FOLLOW_pos_number_in_number1640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCWORD_in_mstring1650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_in_mstring1654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCWORD_in_constant1664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_in_constant1668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualified_java_class_in_constant1672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_string0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_not_equal0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_LITERAL_in_float_literal1708 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_DOT_in_float_literal1710 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_INT_LITERAL_in_float_literal1712 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_EXPONENT_in_float_literal1714 = new BitSet(new long[]{0x0000000000000002L});

}