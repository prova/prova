// $ANTLR 3.4 C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g 2013-01-02 16:17:20

       package org.provarules.parser;

	import org.provarules.parser2.ProvaAST;
	import org.provarules.parser2.ProvaErrorReporter;


import org.antlr.runtime.*;

    import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class Prova2Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ANNOTATION", "ARGS", "ARITHMETIC_RELATION", "ATERM", "BAR", "BRA", "CHAR_ESC", "CLAUSE", "CLEAN_STRING", "CLOSE", "COMMA", "CUT", "DIGIT", "DIV", "DOLLAR", "DOLLARWORD", "DOT", "EQUAL", "EXPONENT", "EXPR", "FUNCTION", "FUNCTION_CALL", "GE", "GT", "GUARD", "IF", "INSTANCE_JAVA_CALL", "INT_LITERAL", "KET", "KEY_VALUE", "LC", "LCWORD", "LE", "LIST_BODY", "LITERAL", "LONG_LITERAL", "LT", "METADATA", "MINUS", "ML_COMMENT", "MULT", "NEWLINE", "NOT_EQUAL1", "NOT_EQUAL2", "OPEN", "PLUS", "PREDICATE", "PROVA_LIST", "PROVA_MAP", "QUALIFIED_JAVA_CLASS", "QUERY", "RELATION", "REM", "RULEBASE", "SEMANTIC_ATTACHMENT", "STATEMENT", "STATIC_JAVA_CALL", "STRING1", "STRING2", "TERM", "TYPED_VARIABLE", "UC", "UCWORD", "UNDERSCORE", "USWORD", "WORD", "WS", "'->'", "':'", "'@'", "'{'", "'}'"
    };

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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

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
    public String getGrammarFileName() { return "C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g"; }


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
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:88:1: rulebase : ( statement )* ( NEWLINE )* EOF -> ^( RULEBASE ( statement )* ) ;
    public final Prova2Parser.rulebase_return rulebase() throws RecognitionException {
        Prova2Parser.rulebase_return retval = new Prova2Parser.rulebase_return();
        retval.start = input.LT(1);


        ProvaAST root_0 = null;

        Token NEWLINE2=null;
        Token EOF3=null;
        Prova2Parser.statement_return statement1 =null;


        ProvaAST NEWLINE2_tree=null;
        ProvaAST EOF3_tree=null;
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:89:2: ( ( statement )* ( NEWLINE )* EOF -> ^( RULEBASE ( statement )* ) )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:89:4: ( statement )* ( NEWLINE )* EOF
            {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:89:4: ( statement )*
            loop1:
            do {
                int alt1=2;
                alt1 = dfa1.predict(input);
                switch (alt1) {
            	case 1 :
            	    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:89:4: statement
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


            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:89:15: ( NEWLINE )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==NEWLINE) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:89:15: NEWLINE
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
                // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:89:30: ^( RULEBASE ( statement )* )
                {
                ProvaAST root_1 = (ProvaAST)adaptor.nil();
                root_1 = (ProvaAST)adaptor.becomeRoot(
                (ProvaAST)adaptor.create(RULEBASE, "RULEBASE")
                , root_1);

                // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:89:41: ( statement )*
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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "rulebase"


    public static class statement_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "statement"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:91:1: statement : ( NEWLINE )* stat end_of_statement -> ^( STATEMENT stat ) ;
    public final Prova2Parser.statement_return statement() throws RecognitionException {
        Prova2Parser.statement_return retval = new Prova2Parser.statement_return();
        retval.start = input.LT(1);


        ProvaAST root_0 = null;

        Token NEWLINE4=null;
        Prova2Parser.stat_return stat5 =null;

        Prova2Parser.end_of_statement_return end_of_statement6 =null;


        ProvaAST NEWLINE4_tree=null;
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleSubtreeStream stream_end_of_statement=new RewriteRuleSubtreeStream(adaptor,"rule end_of_statement");
        RewriteRuleSubtreeStream stream_stat=new RewriteRuleSubtreeStream(adaptor,"rule stat");
        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:92:2: ( ( NEWLINE )* stat end_of_statement -> ^( STATEMENT stat ) )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:92:4: ( NEWLINE )* stat end_of_statement
            {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:92:4: ( NEWLINE )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==NEWLINE) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:92:4: NEWLINE
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
                // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:92:38: ^( STATEMENT stat )
                {
                ProvaAST root_1 = (ProvaAST)adaptor.nil();
                root_1 = (ProvaAST)adaptor.becomeRoot(
                (ProvaAST)adaptor.create(STATEMENT, "STATEMENT")
                , root_1);

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "statement"


    public static class end_of_statement_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "end_of_statement"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:94:1: end_of_statement : ( NEWLINE )* DOT ( NEWLINE | EOF ) ;
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
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:95:2: ( ( NEWLINE )* DOT ( NEWLINE | EOF ) )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:95:4: ( NEWLINE )* DOT ( NEWLINE | EOF )
            {
            root_0 = (ProvaAST)adaptor.nil();


            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:95:4: ( NEWLINE )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==NEWLINE) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:95:4: NEWLINE
            	    {
            	    NEWLINE7=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_end_of_statement389); 
            	    NEWLINE7_tree = 
            	    (ProvaAST)adaptor.create(NEWLINE7)
            	    ;
            	    adaptor.addChild(root_0, NEWLINE7_tree);


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            DOT8=(Token)match(input,DOT,FOLLOW_DOT_in_end_of_statement392); 
            DOT8_tree = 
            (ProvaAST)adaptor.create(DOT8)
            ;
            adaptor.addChild(root_0, DOT8_tree);


            set9=(Token)input.LT(1);

            if ( input.LA(1)==EOF||input.LA(1)==NEWLINE ) {
                input.consume();
                adaptor.addChild(root_0, 
                (ProvaAST)adaptor.create(set9)
                );
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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "end_of_statement"


    public static class stat_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stat"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:97:1: stat : ( clause | query | function );
    public final Prova2Parser.stat_return stat() throws RecognitionException {
        Prova2Parser.stat_return retval = new Prova2Parser.stat_return();
        retval.start = input.LT(1);


        ProvaAST root_0 = null;

        Prova2Parser.clause_return clause10 =null;

        Prova2Parser.query_return query11 =null;

        Prova2Parser.function_return function12 =null;



        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:97:7: ( clause | query | function )
            int alt5=3;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:97:9: clause
                    {
                    root_0 = (ProvaAST)adaptor.nil();


                    pushFollow(FOLLOW_clause_in_stat411);
                    clause10=clause();

                    state._fsp--;

                    adaptor.addChild(root_0, clause10.getTree());

                    }
                    break;
                case 2 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:98:5: query
                    {
                    root_0 = (ProvaAST)adaptor.nil();


                    pushFollow(FOLLOW_query_in_stat417);
                    query11=query();

                    state._fsp--;

                    adaptor.addChild(root_0, query11.getTree());

                    }
                    break;
                case 3 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:99:5: function
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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "stat"


    public static class function_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "function"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:101:1: function : ( metadata )? LCWORD list_body0 ':' list_body0 ( '=' literals )? -> ^( CLAUSE ( metadata )? LCWORD list_body0 list_body0 ( literals )? ) ;
    public final Prova2Parser.function_return function() throws RecognitionException {
        Prova2Parser.function_return retval = new Prova2Parser.function_return();
        retval.start = input.LT(1);


        ProvaAST root_0 = null;

        Token LCWORD14=null;
        Token char_literal16=null;
        Token char_literal18=null;
        Prova2Parser.metadata_return metadata13 =null;

        Prova2Parser.list_body0_return list_body015 =null;

        Prova2Parser.list_body0_return list_body017 =null;

        Prova2Parser.literals_return literals19 =null;


        ProvaAST LCWORD14_tree=null;
        ProvaAST char_literal16_tree=null;
        ProvaAST char_literal18_tree=null;
        RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
        RewriteRuleTokenStream stream_LCWORD=new RewriteRuleTokenStream(adaptor,"token LCWORD");
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleSubtreeStream stream_list_body0=new RewriteRuleSubtreeStream(adaptor,"rule list_body0");
        RewriteRuleSubtreeStream stream_literals=new RewriteRuleSubtreeStream(adaptor,"rule literals");
        RewriteRuleSubtreeStream stream_metadata=new RewriteRuleSubtreeStream(adaptor,"rule metadata");
        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:102:2: ( ( metadata )? LCWORD list_body0 ':' list_body0 ( '=' literals )? -> ^( CLAUSE ( metadata )? LCWORD list_body0 list_body0 ( literals )? ) )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:102:4: ( metadata )? LCWORD list_body0 ':' list_body0 ( '=' literals )?
            {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:102:4: ( metadata )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==73) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:102:4: metadata
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

            char_literal16=(Token)match(input,72,FOLLOW_72_in_function440);  
            stream_72.add(char_literal16);


            pushFollow(FOLLOW_list_body0_in_function442);
            list_body017=list_body0();

            state._fsp--;

            stream_list_body0.add(list_body017.getTree());

            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:102:47: ( '=' literals )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==EQUAL) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:102:48: '=' literals
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
            // elements: list_body0, LCWORD, metadata, literals, list_body0
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
                // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:102:66: ^( CLAUSE ( metadata )? LCWORD list_body0 list_body0 ( literals )? )
                {
                ProvaAST root_1 = (ProvaAST)adaptor.nil();
                root_1 = (ProvaAST)adaptor.becomeRoot(
                (ProvaAST)adaptor.create(CLAUSE, "CLAUSE")
                , root_1);

                // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:102:75: ( metadata )?
                if ( stream_metadata.hasNext() ) {
                    adaptor.addChild(root_1, stream_metadata.nextTree());

                }
                stream_metadata.reset();

                adaptor.addChild(root_1, 
                stream_LCWORD.nextNode()
                );

                adaptor.addChild(root_1, stream_list_body0.nextTree());

                adaptor.addChild(root_1, stream_list_body0.nextTree());

                // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:102:114: ( literals )?
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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "function"


    public static class function_call_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "function_call"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:104:1: function_call : predicate list_body0 ( ':' list_body0 )? -> ^( FUNCTION_CALL predicate list_body0 ( list_body0 )? ) ;
    public final Prova2Parser.function_call_return function_call() throws RecognitionException {
        Prova2Parser.function_call_return retval = new Prova2Parser.function_call_return();
        retval.start = input.LT(1);


        ProvaAST root_0 = null;

        Token char_literal22=null;
        Prova2Parser.predicate_return predicate20 =null;

        Prova2Parser.list_body0_return list_body021 =null;

        Prova2Parser.list_body0_return list_body023 =null;


        ProvaAST char_literal22_tree=null;
        RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
        RewriteRuleSubtreeStream stream_list_body0=new RewriteRuleSubtreeStream(adaptor,"rule list_body0");
        RewriteRuleSubtreeStream stream_predicate=new RewriteRuleSubtreeStream(adaptor,"rule predicate");
        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:105:2: ( predicate list_body0 ( ':' list_body0 )? -> ^( FUNCTION_CALL predicate list_body0 ( list_body0 )? ) )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:105:4: predicate list_body0 ( ':' list_body0 )?
            {
            pushFollow(FOLLOW_predicate_in_function_call477);
            predicate20=predicate();

            state._fsp--;

            stream_predicate.add(predicate20.getTree());

            pushFollow(FOLLOW_list_body0_in_function_call479);
            list_body021=list_body0();

            state._fsp--;

            stream_list_body0.add(list_body021.getTree());

            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:105:25: ( ':' list_body0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==72) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:105:26: ':' list_body0
                    {
                    char_literal22=(Token)match(input,72,FOLLOW_72_in_function_call482);  
                    stream_72.add(char_literal22);


                    pushFollow(FOLLOW_list_body0_in_function_call484);
                    list_body023=list_body0();

                    state._fsp--;

                    stream_list_body0.add(list_body023.getTree());

                    }
                    break;

            }


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
            // 105:43: -> ^( FUNCTION_CALL predicate list_body0 ( list_body0 )? )
            {
                // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:105:46: ^( FUNCTION_CALL predicate list_body0 ( list_body0 )? )
                {
                ProvaAST root_1 = (ProvaAST)adaptor.nil();
                root_1 = (ProvaAST)adaptor.becomeRoot(
                (ProvaAST)adaptor.create(FUNCTION_CALL, "FUNCTION_CALL")
                , root_1);

                adaptor.addChild(root_1, stream_predicate.nextTree());

                adaptor.addChild(root_1, stream_list_body0.nextTree());

                // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:105:83: ( list_body0 )?
                if ( stream_list_body0.hasNext() ) {
                    adaptor.addChild(root_1, stream_list_body0.nextTree());

                }
                stream_list_body0.reset();

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "function_call"


    public static class query_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "query"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:107:1: query : IF ( NEWLINE )* query_predicate ( NEWLINE )* '(' ( NEWLINE )* relation ( NEWLINE )* ')' -> ^( QUERY query_predicate relation ) ;
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
        Prova2Parser.query_predicate_return query_predicate26 =null;

        Prova2Parser.relation_return relation30 =null;


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
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:107:8: ( IF ( NEWLINE )* query_predicate ( NEWLINE )* '(' ( NEWLINE )* relation ( NEWLINE )* ')' -> ^( QUERY query_predicate relation ) )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:107:10: IF ( NEWLINE )* query_predicate ( NEWLINE )* '(' ( NEWLINE )* relation ( NEWLINE )* ')'
            {
            IF24=(Token)match(input,IF,FOLLOW_IF_in_query508);  
            stream_IF.add(IF24);


            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:107:13: ( NEWLINE )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==NEWLINE) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:107:13: NEWLINE
            	    {
            	    NEWLINE25=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_query510);  
            	    stream_NEWLINE.add(NEWLINE25);


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            pushFollow(FOLLOW_query_predicate_in_query513);
            query_predicate26=query_predicate();

            state._fsp--;

            stream_query_predicate.add(query_predicate26.getTree());

            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:107:38: ( NEWLINE )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==NEWLINE) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:107:38: NEWLINE
            	    {
            	    NEWLINE27=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_query515);  
            	    stream_NEWLINE.add(NEWLINE27);


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            char_literal28=(Token)match(input,OPEN,FOLLOW_OPEN_in_query518);  
            stream_OPEN.add(char_literal28);


            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:107:51: ( NEWLINE )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==NEWLINE) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:107:51: NEWLINE
            	    {
            	    NEWLINE29=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_query520);  
            	    stream_NEWLINE.add(NEWLINE29);


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            pushFollow(FOLLOW_relation_in_query523);
            relation30=relation();

            state._fsp--;

            stream_relation.add(relation30.getTree());

            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:107:69: ( NEWLINE )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==NEWLINE) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:107:69: NEWLINE
            	    {
            	    NEWLINE31=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_query525);  
            	    stream_NEWLINE.add(NEWLINE31);


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            char_literal32=(Token)match(input,CLOSE,FOLLOW_CLOSE_in_query528);  
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
                // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:107:85: ^( QUERY query_predicate relation )
                {
                ProvaAST root_1 = (ProvaAST)adaptor.nil();
                root_1 = (ProvaAST)adaptor.becomeRoot(
                (ProvaAST)adaptor.create(QUERY, "QUERY")
                , root_1);

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "query"


    public static class query_predicate_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "query_predicate"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:109:1: query_predicate : constant ;
    public final Prova2Parser.query_predicate_return query_predicate() throws RecognitionException {
        Prova2Parser.query_predicate_return retval = new Prova2Parser.query_predicate_return();
        retval.start = input.LT(1);


        ProvaAST root_0 = null;

        Prova2Parser.constant_return constant33 =null;



        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:110:2: ( constant )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:110:4: constant
            {
            root_0 = (ProvaAST)adaptor.nil();


            pushFollow(FOLLOW_constant_in_query_predicate548);
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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "query_predicate"


    public static class clause_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "clause"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:112:1: clause : ( metadata )? relation ( IF literals )? -> ^( CLAUSE ( metadata )? relation ( literals )? ) ;
    public final Prova2Parser.clause_return clause() throws RecognitionException {
        Prova2Parser.clause_return retval = new Prova2Parser.clause_return();
        retval.start = input.LT(1);


        ProvaAST root_0 = null;

        Token IF36=null;
        Prova2Parser.metadata_return metadata34 =null;

        Prova2Parser.relation_return relation35 =null;

        Prova2Parser.literals_return literals37 =null;


        ProvaAST IF36_tree=null;
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_literals=new RewriteRuleSubtreeStream(adaptor,"rule literals");
        RewriteRuleSubtreeStream stream_relation=new RewriteRuleSubtreeStream(adaptor,"rule relation");
        RewriteRuleSubtreeStream stream_metadata=new RewriteRuleSubtreeStream(adaptor,"rule metadata");
        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:112:9: ( ( metadata )? relation ( IF literals )? -> ^( CLAUSE ( metadata )? relation ( literals )? ) )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:112:11: ( metadata )? relation ( IF literals )?
            {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:112:11: ( metadata )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==73) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:112:11: metadata
                    {
                    pushFollow(FOLLOW_metadata_in_clause557);
                    metadata34=metadata();

                    state._fsp--;

                    stream_metadata.add(metadata34.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_relation_in_clause560);
            relation35=relation();

            state._fsp--;

            stream_relation.add(relation35.getTree());

            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:112:30: ( IF literals )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==IF) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:112:31: IF literals
                    {
                    IF36=(Token)match(input,IF,FOLLOW_IF_in_clause563);  
                    stream_IF.add(IF36);


                    pushFollow(FOLLOW_literals_in_clause565);
                    literals37=literals();

                    state._fsp--;

                    stream_literals.add(literals37.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: relation, metadata, literals
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
                // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:112:48: ^( CLAUSE ( metadata )? relation ( literals )? )
                {
                ProvaAST root_1 = (ProvaAST)adaptor.nil();
                root_1 = (ProvaAST)adaptor.becomeRoot(
                (ProvaAST)adaptor.create(CLAUSE, "CLAUSE")
                , root_1);

                // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:112:57: ( metadata )?
                if ( stream_metadata.hasNext() ) {
                    adaptor.addChild(root_1, stream_metadata.nextTree());

                }
                stream_metadata.reset();

                adaptor.addChild(root_1, stream_relation.nextTree());

                // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:112:76: ( literals )?
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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "clause"


    public static class metadata_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "metadata"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:114:1: metadata : ( annotation ( NEWLINE )* )+ -> ^( METADATA ( annotation )+ ) ;
    public final Prova2Parser.metadata_return metadata() throws RecognitionException {
        Prova2Parser.metadata_return retval = new Prova2Parser.metadata_return();
        retval.start = input.LT(1);


        ProvaAST root_0 = null;

        Token NEWLINE39=null;
        Prova2Parser.annotation_return annotation38 =null;


        ProvaAST NEWLINE39_tree=null;
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleSubtreeStream stream_annotation=new RewriteRuleSubtreeStream(adaptor,"rule annotation");
        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:115:2: ( ( annotation ( NEWLINE )* )+ -> ^( METADATA ( annotation )+ ) )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:115:4: ( annotation ( NEWLINE )* )+
            {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:115:4: ( annotation ( NEWLINE )* )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==73) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:115:5: annotation ( NEWLINE )*
            	    {
            	    pushFollow(FOLLOW_annotation_in_metadata591);
            	    annotation38=annotation();

            	    state._fsp--;

            	    stream_annotation.add(annotation38.getTree());

            	    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:115:16: ( NEWLINE )*
            	    loop15:
            	    do {
            	        int alt15=2;
            	        int LA15_0 = input.LA(1);

            	        if ( (LA15_0==NEWLINE) ) {
            	            alt15=1;
            	        }


            	        switch (alt15) {
            	    	case 1 :
            	    	    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:115:16: NEWLINE
            	    	    {
            	    	    NEWLINE39=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_metadata593);  
            	    	    stream_NEWLINE.add(NEWLINE39);


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop15;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
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
                // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:115:30: ^( METADATA ( annotation )+ )
                {
                ProvaAST root_1 = (ProvaAST)adaptor.nil();
                root_1 = (ProvaAST)adaptor.becomeRoot(
                (ProvaAST)adaptor.create(METADATA, "METADATA")
                , root_1);

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "metadata"


    public static class annotation_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "annotation"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:118:1: annotation : '@' LCWORD ( '(' value ( COMMA value )* ')' )? -> ^( ANNOTATION LCWORD ( value )* ) ;
    public final Prova2Parser.annotation_return annotation() throws RecognitionException {
        Prova2Parser.annotation_return retval = new Prova2Parser.annotation_return();
        retval.start = input.LT(1);


        ProvaAST root_0 = null;

        Token char_literal40=null;
        Token LCWORD41=null;
        Token char_literal42=null;
        Token COMMA44=null;
        Token char_literal46=null;
        Prova2Parser.value_return value43 =null;

        Prova2Parser.value_return value45 =null;


        ProvaAST char_literal40_tree=null;
        ProvaAST LCWORD41_tree=null;
        ProvaAST char_literal42_tree=null;
        ProvaAST COMMA44_tree=null;
        ProvaAST char_literal46_tree=null;
        RewriteRuleTokenStream stream_OPEN=new RewriteRuleTokenStream(adaptor,"token OPEN");
        RewriteRuleTokenStream stream_CLOSE=new RewriteRuleTokenStream(adaptor,"token CLOSE");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
        RewriteRuleTokenStream stream_LCWORD=new RewriteRuleTokenStream(adaptor,"token LCWORD");
        RewriteRuleSubtreeStream stream_value=new RewriteRuleSubtreeStream(adaptor,"rule value");
        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:119:2: ( '@' LCWORD ( '(' value ( COMMA value )* ')' )? -> ^( ANNOTATION LCWORD ( value )* ) )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:119:4: '@' LCWORD ( '(' value ( COMMA value )* ')' )?
            {
            char_literal40=(Token)match(input,73,FOLLOW_73_in_annotation615);  
            stream_73.add(char_literal40);


            LCWORD41=(Token)match(input,LCWORD,FOLLOW_LCWORD_in_annotation617);  
            stream_LCWORD.add(LCWORD41);


            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:119:15: ( '(' value ( COMMA value )* ')' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==OPEN) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:119:16: '(' value ( COMMA value )* ')'
                    {
                    char_literal42=(Token)match(input,OPEN,FOLLOW_OPEN_in_annotation620);  
                    stream_OPEN.add(char_literal42);


                    pushFollow(FOLLOW_value_in_annotation622);
                    value43=value();

                    state._fsp--;

                    stream_value.add(value43.getTree());

                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:119:26: ( COMMA value )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==COMMA) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:119:27: COMMA value
                    	    {
                    	    COMMA44=(Token)match(input,COMMA,FOLLOW_COMMA_in_annotation625);  
                    	    stream_COMMA.add(COMMA44);


                    	    pushFollow(FOLLOW_value_in_annotation627);
                    	    value45=value();

                    	    state._fsp--;

                    	    stream_value.add(value45.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    char_literal46=(Token)match(input,CLOSE,FOLLOW_CLOSE_in_annotation631);  
                    stream_CLOSE.add(char_literal46);


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
            // 119:47: -> ^( ANNOTATION LCWORD ( value )* )
            {
                // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:119:50: ^( ANNOTATION LCWORD ( value )* )
                {
                ProvaAST root_1 = (ProvaAST)adaptor.nil();
                root_1 = (ProvaAST)adaptor.becomeRoot(
                (ProvaAST)adaptor.create(ANNOTATION, "ANNOTATION")
                , root_1);

                adaptor.addChild(root_1, 
                stream_LCWORD.nextNode()
                );

                // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:119:70: ( value )*
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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "annotation"


    public static class value_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "value"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:122:1: value : ( LCWORD | UCWORD | string | number );
    public final Prova2Parser.value_return value() throws RecognitionException {
        Prova2Parser.value_return retval = new Prova2Parser.value_return();
        retval.start = input.LT(1);


        ProvaAST root_0 = null;

        Token LCWORD47=null;
        Token UCWORD48=null;
        Prova2Parser.string_return string49 =null;

        Prova2Parser.number_return number50 =null;


        ProvaAST LCWORD47_tree=null;
        ProvaAST UCWORD48_tree=null;

        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:123:2: ( LCWORD | UCWORD | string | number )
            int alt19=4;
            switch ( input.LA(1) ) {
            case LCWORD:
                {
                alt19=1;
                }
                break;
            case UCWORD:
                {
                alt19=2;
                }
                break;
            case STRING1:
            case STRING2:
                {
                alt19=3;
                }
                break;
            case INT_LITERAL:
            case LONG_LITERAL:
            case MINUS:
                {
                alt19=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }

            switch (alt19) {
                case 1 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:123:4: LCWORD
                    {
                    root_0 = (ProvaAST)adaptor.nil();


                    LCWORD47=(Token)match(input,LCWORD,FOLLOW_LCWORD_in_value656); 
                    LCWORD47_tree = 
                    (ProvaAST)adaptor.create(LCWORD47)
                    ;
                    adaptor.addChild(root_0, LCWORD47_tree);


                    }
                    break;
                case 2 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:123:13: UCWORD
                    {
                    root_0 = (ProvaAST)adaptor.nil();


                    UCWORD48=(Token)match(input,UCWORD,FOLLOW_UCWORD_in_value660); 
                    UCWORD48_tree = 
                    (ProvaAST)adaptor.create(UCWORD48)
                    ;
                    adaptor.addChild(root_0, UCWORD48_tree);


                    }
                    break;
                case 3 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:123:22: string
                    {
                    root_0 = (ProvaAST)adaptor.nil();


                    pushFollow(FOLLOW_string_in_value664);
                    string49=string();

                    state._fsp--;

                    adaptor.addChild(root_0, string49.getTree());

                    }
                    break;
                case 4 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:123:31: number
                    {
                    root_0 = (ProvaAST)adaptor.nil();


                    pushFollow(FOLLOW_number_in_value668);
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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "value"


    public static class literals_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "literals"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:126:1: literals : literal ( COMMA literal )* -> ^( LITERAL ( literal )+ ) ;
    public final Prova2Parser.literals_return literals() throws RecognitionException {
        Prova2Parser.literals_return retval = new Prova2Parser.literals_return();
        retval.start = input.LT(1);


        ProvaAST root_0 = null;

        Token COMMA52=null;
        Prova2Parser.literal_return literal51 =null;

        Prova2Parser.literal_return literal53 =null;


        ProvaAST COMMA52_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_literal=new RewriteRuleSubtreeStream(adaptor,"rule literal");
        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:126:11: ( literal ( COMMA literal )* -> ^( LITERAL ( literal )+ ) )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:126:13: literal ( COMMA literal )*
            {
            pushFollow(FOLLOW_literal_in_literals678);
            literal51=literal();

            state._fsp--;

            stream_literal.add(literal51.getTree());

            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:126:21: ( COMMA literal )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==COMMA) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:126:22: COMMA literal
            	    {
            	    COMMA52=(Token)match(input,COMMA,FOLLOW_COMMA_in_literals681);  
            	    stream_COMMA.add(COMMA52);


            	    pushFollow(FOLLOW_literal_in_literals683);
            	    literal53=literal();

            	    state._fsp--;

            	    stream_literal.add(literal53.getTree());

            	    }
            	    break;

            	default :
            	    break loop20;
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
                // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:126:41: ^( LITERAL ( literal )+ )
                {
                ProvaAST root_1 = (ProvaAST)adaptor.nil();
                root_1 = (ProvaAST)adaptor.becomeRoot(
                (ProvaAST)adaptor.create(LITERAL, "LITERAL")
                , root_1);

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "literals"


    public static class literal_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "literal"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:128:1: literal : ( ( NEWLINE )* (m= metadata )? r= relation (g= guard )? -> ^( RELATION ( metadata )? relation ( guard )? ) | ( NEWLINE )* (m= metadata )? semantic_attachment (g= guard )? -> ^( SEMANTIC_ATTACHMENT ( metadata )? semantic_attachment ( guard )? ) | ( NEWLINE )* ( metadata )? function_call -> ^( FUNCTION ( metadata )? function_call ) | ( NEWLINE )* cut -> ^( CUT cut ) );
    public final Prova2Parser.literal_return literal() throws RecognitionException {
        Prova2Parser.literal_return retval = new Prova2Parser.literal_return();
        retval.start = input.LT(1);


        ProvaAST root_0 = null;

        Token NEWLINE54=null;
        Token NEWLINE55=null;
        Token NEWLINE57=null;
        Token NEWLINE60=null;
        Prova2Parser.metadata_return m =null;

        Prova2Parser.relation_return r =null;

        Prova2Parser.guard_return g =null;

        Prova2Parser.semantic_attachment_return semantic_attachment56 =null;

        Prova2Parser.metadata_return metadata58 =null;

        Prova2Parser.function_call_return function_call59 =null;

        Prova2Parser.cut_return cut61 =null;


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
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:128:10: ( ( NEWLINE )* (m= metadata )? r= relation (g= guard )? -> ^( RELATION ( metadata )? relation ( guard )? ) | ( NEWLINE )* (m= metadata )? semantic_attachment (g= guard )? -> ^( SEMANTIC_ATTACHMENT ( metadata )? semantic_attachment ( guard )? ) | ( NEWLINE )* ( metadata )? function_call -> ^( FUNCTION ( metadata )? function_call ) | ( NEWLINE )* cut -> ^( CUT cut ) )
            int alt30=4;
            alt30 = dfa30.predict(input);
            switch (alt30) {
                case 1 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:128:12: ( NEWLINE )* (m= metadata )? r= relation (g= guard )?
                    {
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:128:12: ( NEWLINE )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==NEWLINE) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:128:12: NEWLINE
                    	    {
                    	    NEWLINE54=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_literal703);  
                    	    stream_NEWLINE.add(NEWLINE54);


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);


                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:128:22: (m= metadata )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==73) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:128:22: m= metadata
                            {
                            pushFollow(FOLLOW_metadata_in_literal708);
                            m=metadata();

                            state._fsp--;

                            stream_metadata.add(m.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_relation_in_literal713);
                    r=relation();

                    state._fsp--;

                    stream_relation.add(r.getTree());

                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:128:45: (g= guard )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==BRA) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:128:45: g= guard
                            {
                            pushFollow(FOLLOW_guard_in_literal717);
                            g=guard();

                            state._fsp--;

                            stream_guard.add(g.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: metadata, relation, guard
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
                        // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:128:56: ^( RELATION ( metadata )? relation ( guard )? )
                        {
                        ProvaAST root_1 = (ProvaAST)adaptor.nil();
                        root_1 = (ProvaAST)adaptor.becomeRoot(
                        (ProvaAST)adaptor.create(RELATION, "RELATION")
                        , root_1);

                        // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:128:67: ( metadata )?
                        if ( stream_metadata.hasNext() ) {
                            adaptor.addChild(root_1, stream_metadata.nextTree());

                        }
                        stream_metadata.reset();

                        adaptor.addChild(root_1, stream_relation.nextTree());

                        // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:128:86: ( guard )?
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
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:129:6: ( NEWLINE )* (m= metadata )? semantic_attachment (g= guard )?
                    {
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:129:6: ( NEWLINE )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==NEWLINE) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:129:6: NEWLINE
                    	    {
                    	    NEWLINE55=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_literal739);  
                    	    stream_NEWLINE.add(NEWLINE55);


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);


                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:129:16: (m= metadata )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==73) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:129:16: m= metadata
                            {
                            pushFollow(FOLLOW_metadata_in_literal744);
                            m=metadata();

                            state._fsp--;

                            stream_metadata.add(m.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_semantic_attachment_in_literal747);
                    semantic_attachment56=semantic_attachment();

                    state._fsp--;

                    stream_semantic_attachment.add(semantic_attachment56.getTree());

                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:129:48: (g= guard )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==BRA) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:129:48: g= guard
                            {
                            pushFollow(FOLLOW_guard_in_literal751);
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
                    // 129:56: -> ^( SEMANTIC_ATTACHMENT ( metadata )? semantic_attachment ( guard )? )
                    {
                        // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:129:59: ^( SEMANTIC_ATTACHMENT ( metadata )? semantic_attachment ( guard )? )
                        {
                        ProvaAST root_1 = (ProvaAST)adaptor.nil();
                        root_1 = (ProvaAST)adaptor.becomeRoot(
                        (ProvaAST)adaptor.create(SEMANTIC_ATTACHMENT, "SEMANTIC_ATTACHMENT")
                        , root_1);

                        // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:129:81: ( metadata )?
                        if ( stream_metadata.hasNext() ) {
                            adaptor.addChild(root_1, stream_metadata.nextTree());

                        }
                        stream_metadata.reset();

                        adaptor.addChild(root_1, stream_semantic_attachment.nextTree());

                        // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:129:111: ( guard )?
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
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:130:6: ( NEWLINE )* ( metadata )? function_call
                    {
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:130:6: ( NEWLINE )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==NEWLINE) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:130:6: NEWLINE
                    	    {
                    	    NEWLINE57=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_literal773);  
                    	    stream_NEWLINE.add(NEWLINE57);


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);


                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:130:15: ( metadata )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==73) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:130:15: metadata
                            {
                            pushFollow(FOLLOW_metadata_in_literal776);
                            metadata58=metadata();

                            state._fsp--;

                            stream_metadata.add(metadata58.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_function_call_in_literal779);
                    function_call59=function_call();

                    state._fsp--;

                    stream_function_call.add(function_call59.getTree());

                    // AST REWRITE
                    // elements: function_call, metadata
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
                        // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:130:42: ^( FUNCTION ( metadata )? function_call )
                        {
                        ProvaAST root_1 = (ProvaAST)adaptor.nil();
                        root_1 = (ProvaAST)adaptor.becomeRoot(
                        (ProvaAST)adaptor.create(FUNCTION, "FUNCTION")
                        , root_1);

                        // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:130:53: ( metadata )?
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
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:131:6: ( NEWLINE )* cut
                    {
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:131:6: ( NEWLINE )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==NEWLINE) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:131:6: NEWLINE
                    	    {
                    	    NEWLINE60=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_literal797);  
                    	    stream_NEWLINE.add(NEWLINE60);


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);


                    pushFollow(FOLLOW_cut_in_literal800);
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
                        // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:131:22: ^( CUT cut )
                        {
                        ProvaAST root_1 = (ProvaAST)adaptor.nil();
                        root_1 = (ProvaAST)adaptor.becomeRoot(
                        (ProvaAST)adaptor.create(CUT, "CUT")
                        , root_1);

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "literal"


    public static class cut_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "cut"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:133:1: cut : CUT ;
    public final Prova2Parser.cut_return cut() throws RecognitionException {
        Prova2Parser.cut_return retval = new Prova2Parser.cut_return();
        retval.start = input.LT(1);


        ProvaAST root_0 = null;

        Token CUT62=null;

        ProvaAST CUT62_tree=null;

        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:133:5: ( CUT )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:133:7: CUT
            {
            root_0 = (ProvaAST)adaptor.nil();


            CUT62=(Token)match(input,CUT,FOLLOW_CUT_in_cut816); 
            CUT62_tree = 
            (ProvaAST)adaptor.create(CUT62)
            ;
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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "cut"


    public static class binary_operator_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "binary_operator"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:135:1: binary_operator : ( not_equal | LT | GT | LE | GE );
    public final Prova2Parser.binary_operator_return binary_operator() throws RecognitionException {
        Prova2Parser.binary_operator_return retval = new Prova2Parser.binary_operator_return();
        retval.start = input.LT(1);


        ProvaAST root_0 = null;

        Token LT64=null;
        Token GT65=null;
        Token LE66=null;
        Token GE67=null;
        Prova2Parser.not_equal_return not_equal63 =null;


        ProvaAST LT64_tree=null;
        ProvaAST GT65_tree=null;
        ProvaAST LE66_tree=null;
        ProvaAST GE67_tree=null;

        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:136:2: ( not_equal | LT | GT | LE | GE )
            int alt31=5;
            switch ( input.LA(1) ) {
            case NOT_EQUAL1:
            case NOT_EQUAL2:
                {
                alt31=1;
                }
                break;
            case LT:
                {
                alt31=2;
                }
                break;
            case GT:
                {
                alt31=3;
                }
                break;
            case LE:
                {
                alt31=4;
                }
                break;
            case GE:
                {
                alt31=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;

            }

            switch (alt31) {
                case 1 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:136:4: not_equal
                    {
                    root_0 = (ProvaAST)adaptor.nil();


                    pushFollow(FOLLOW_not_equal_in_binary_operator825);
                    not_equal63=not_equal();

                    state._fsp--;

                    adaptor.addChild(root_0, not_equal63.getTree());

                    }
                    break;
                case 2 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:136:16: LT
                    {
                    root_0 = (ProvaAST)adaptor.nil();


                    LT64=(Token)match(input,LT,FOLLOW_LT_in_binary_operator829); 
                    LT64_tree = 
                    (ProvaAST)adaptor.create(LT64)
                    ;
                    adaptor.addChild(root_0, LT64_tree);


                    }
                    break;
                case 3 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:136:21: GT
                    {
                    root_0 = (ProvaAST)adaptor.nil();


                    GT65=(Token)match(input,GT,FOLLOW_GT_in_binary_operator833); 
                    GT65_tree = 
                    (ProvaAST)adaptor.create(GT65)
                    ;
                    adaptor.addChild(root_0, GT65_tree);


                    }
                    break;
                case 4 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:136:26: LE
                    {
                    root_0 = (ProvaAST)adaptor.nil();


                    LE66=(Token)match(input,LE,FOLLOW_LE_in_binary_operator837); 
                    LE66_tree = 
                    (ProvaAST)adaptor.create(LE66)
                    ;
                    adaptor.addChild(root_0, LE66_tree);


                    }
                    break;
                case 5 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:136:31: GE
                    {
                    root_0 = (ProvaAST)adaptor.nil();


                    GE67=(Token)match(input,GE,FOLLOW_GE_in_binary_operator841); 
                    GE67_tree = 
                    (ProvaAST)adaptor.create(GE67)
                    ;
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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "binary_operator"


    public static class relation_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "relation"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:139:1: relation : predicate '(' list_body ')' -> ^( PREDICATE predicate list_body ) ;
    public final Prova2Parser.relation_return relation() throws RecognitionException {
        Prova2Parser.relation_return retval = new Prova2Parser.relation_return();
        retval.start = input.LT(1);


        ProvaAST root_0 = null;

        Token char_literal69=null;
        Token char_literal71=null;
        Prova2Parser.predicate_return predicate68 =null;

        Prova2Parser.list_body_return list_body70 =null;


        ProvaAST char_literal69_tree=null;
        ProvaAST char_literal71_tree=null;
        RewriteRuleTokenStream stream_OPEN=new RewriteRuleTokenStream(adaptor,"token OPEN");
        RewriteRuleTokenStream stream_CLOSE=new RewriteRuleTokenStream(adaptor,"token CLOSE");
        RewriteRuleSubtreeStream stream_predicate=new RewriteRuleSubtreeStream(adaptor,"rule predicate");
        RewriteRuleSubtreeStream stream_list_body=new RewriteRuleSubtreeStream(adaptor,"rule list_body");
        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:140:2: ( predicate '(' list_body ')' -> ^( PREDICATE predicate list_body ) )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:140:4: predicate '(' list_body ')'
            {
            pushFollow(FOLLOW_predicate_in_relation853);
            predicate68=predicate();

            state._fsp--;

            stream_predicate.add(predicate68.getTree());

            char_literal69=(Token)match(input,OPEN,FOLLOW_OPEN_in_relation855);  
            stream_OPEN.add(char_literal69);


            pushFollow(FOLLOW_list_body_in_relation857);
            list_body70=list_body();

            state._fsp--;

            stream_list_body.add(list_body70.getTree());

            char_literal71=(Token)match(input,CLOSE,FOLLOW_CLOSE_in_relation859);  
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
                // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:140:35: ^( PREDICATE predicate list_body )
                {
                ProvaAST root_1 = (ProvaAST)adaptor.nil();
                root_1 = (ProvaAST)adaptor.becomeRoot(
                (ProvaAST)adaptor.create(PREDICATE, "PREDICATE")
                , root_1);

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "relation"


    public static class guard_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "guard"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:142:1: guard : '[' literals ']' -> ^( GUARD literals ) ;
    public final Prova2Parser.guard_return guard() throws RecognitionException {
        Prova2Parser.guard_return retval = new Prova2Parser.guard_return();
        retval.start = input.LT(1);


        ProvaAST root_0 = null;

        Token char_literal72=null;
        Token char_literal74=null;
        Prova2Parser.literals_return literals73 =null;


        ProvaAST char_literal72_tree=null;
        ProvaAST char_literal74_tree=null;
        RewriteRuleTokenStream stream_BRA=new RewriteRuleTokenStream(adaptor,"token BRA");
        RewriteRuleTokenStream stream_KET=new RewriteRuleTokenStream(adaptor,"token KET");
        RewriteRuleSubtreeStream stream_literals=new RewriteRuleSubtreeStream(adaptor,"rule literals");
        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:143:2: ( '[' literals ']' -> ^( GUARD literals ) )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:143:4: '[' literals ']'
            {
            char_literal72=(Token)match(input,BRA,FOLLOW_BRA_in_guard878);  
            stream_BRA.add(char_literal72);


            pushFollow(FOLLOW_literals_in_guard880);
            literals73=literals();

            state._fsp--;

            stream_literals.add(literals73.getTree());

            char_literal74=(Token)match(input,KET,FOLLOW_KET_in_guard882);  
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
                // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:143:24: ^( GUARD literals )
                {
                ProvaAST root_1 = (ProvaAST)adaptor.nil();
                root_1 = (ProvaAST)adaptor.becomeRoot(
                (ProvaAST)adaptor.create(GUARD, "GUARD")
                , root_1);

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "guard"


    public static class list_body_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "list_body"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:146:1: list_body : ( terms ( '|' list_tail )? )? ( NEWLINE )* -> ^( LIST_BODY ( terms ( list_tail )? )? ) ;
    public final Prova2Parser.list_body_return list_body() throws RecognitionException {
        Prova2Parser.list_body_return retval = new Prova2Parser.list_body_return();
        retval.start = input.LT(1);


        ProvaAST root_0 = null;

        Token char_literal76=null;
        Token NEWLINE78=null;
        Prova2Parser.terms_return terms75 =null;

        Prova2Parser.list_tail_return list_tail77 =null;


        ProvaAST char_literal76_tree=null;
        ProvaAST NEWLINE78_tree=null;
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_BAR=new RewriteRuleTokenStream(adaptor,"token BAR");
        RewriteRuleSubtreeStream stream_terms=new RewriteRuleSubtreeStream(adaptor,"rule terms");
        RewriteRuleSubtreeStream stream_list_tail=new RewriteRuleSubtreeStream(adaptor,"rule list_tail");
        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:147:3: ( ( terms ( '|' list_tail )? )? ( NEWLINE )* -> ^( LIST_BODY ( terms ( list_tail )? )? ) )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:147:5: ( terms ( '|' list_tail )? )? ( NEWLINE )*
            {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:147:5: ( terms ( '|' list_tail )? )?
            int alt33=2;
            alt33 = dfa33.predict(input);
            switch (alt33) {
                case 1 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:147:6: terms ( '|' list_tail )?
                    {
                    pushFollow(FOLLOW_terms_in_list_body903);
                    terms75=terms();

                    state._fsp--;

                    stream_terms.add(terms75.getTree());

                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:147:12: ( '|' list_tail )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==BAR) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:147:13: '|' list_tail
                            {
                            char_literal76=(Token)match(input,BAR,FOLLOW_BAR_in_list_body906);  
                            stream_BAR.add(char_literal76);


                            pushFollow(FOLLOW_list_tail_in_list_body908);
                            list_tail77=list_tail();

                            state._fsp--;

                            stream_list_tail.add(list_tail77.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }


            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:147:31: ( NEWLINE )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==NEWLINE) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:147:31: NEWLINE
            	    {
            	    NEWLINE78=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_list_body914);  
            	    stream_NEWLINE.add(NEWLINE78);


            	    }
            	    break;

            	default :
            	    break loop34;
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
                // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:147:43: ^( LIST_BODY ( terms ( list_tail )? )? )
                {
                ProvaAST root_1 = (ProvaAST)adaptor.nil();
                root_1 = (ProvaAST)adaptor.becomeRoot(
                (ProvaAST)adaptor.create(LIST_BODY, "LIST_BODY")
                , root_1);

                // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:147:55: ( terms ( list_tail )? )?
                if ( stream_list_tail.hasNext()||stream_terms.hasNext() ) {
                    adaptor.addChild(root_1, stream_terms.nextTree());

                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:147:62: ( list_tail )?
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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "list_body"


    public static class list_body0_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "list_body0"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:149:1: list_body0 : terms0 ( '|' list_tail )? -> ^( LIST_BODY terms0 ( list_tail )? ) ;
    public final Prova2Parser.list_body0_return list_body0() throws RecognitionException {
        Prova2Parser.list_body0_return retval = new Prova2Parser.list_body0_return();
        retval.start = input.LT(1);


        ProvaAST root_0 = null;

        Token char_literal80=null;
        Prova2Parser.terms0_return terms079 =null;

        Prova2Parser.list_tail_return list_tail81 =null;


        ProvaAST char_literal80_tree=null;
        RewriteRuleTokenStream stream_BAR=new RewriteRuleTokenStream(adaptor,"token BAR");
        RewriteRuleSubtreeStream stream_terms0=new RewriteRuleSubtreeStream(adaptor,"rule terms0");
        RewriteRuleSubtreeStream stream_list_tail=new RewriteRuleSubtreeStream(adaptor,"rule list_tail");
        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:150:3: ( terms0 ( '|' list_tail )? -> ^( LIST_BODY terms0 ( list_tail )? ) )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:150:5: terms0 ( '|' list_tail )?
            {
            pushFollow(FOLLOW_terms0_in_list_body0939);
            terms079=terms0();

            state._fsp--;

            stream_terms0.add(terms079.getTree());

            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:150:12: ( '|' list_tail )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==BAR) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:150:13: '|' list_tail
                    {
                    char_literal80=(Token)match(input,BAR,FOLLOW_BAR_in_list_body0942);  
                    stream_BAR.add(char_literal80);


                    pushFollow(FOLLOW_list_tail_in_list_body0944);
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
                // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:150:32: ^( LIST_BODY terms0 ( list_tail )? )
                {
                ProvaAST root_1 = (ProvaAST)adaptor.nil();
                root_1 = (ProvaAST)adaptor.becomeRoot(
                (ProvaAST)adaptor.create(LIST_BODY, "LIST_BODY")
                , root_1);

                adaptor.addChild(root_1, stream_terms0.nextTree());

                // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:150:51: ( list_tail )?
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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "list_body0"


    public static class list_tail_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "list_tail"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:152:1: list_tail : ( variable | prova_list );
    public final Prova2Parser.list_tail_return list_tail() throws RecognitionException {
        Prova2Parser.list_tail_return retval = new Prova2Parser.list_tail_return();
        retval.start = input.LT(1);


        ProvaAST root_0 = null;

        Prova2Parser.variable_return variable82 =null;

        Prova2Parser.prova_list_return prova_list83 =null;



        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:153:2: ( variable | prova_list )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==DOLLARWORD||LA36_0==LCWORD||LA36_0==UCWORD||LA36_0==USWORD) ) {
                alt36=1;
            }
            else if ( (LA36_0==BRA) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;

            }
            switch (alt36) {
                case 1 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:153:4: variable
                    {
                    root_0 = (ProvaAST)adaptor.nil();


                    pushFollow(FOLLOW_variable_in_list_tail967);
                    variable82=variable();

                    state._fsp--;

                    adaptor.addChild(root_0, variable82.getTree());

                    }
                    break;
                case 2 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:153:15: prova_list
                    {
                    root_0 = (ProvaAST)adaptor.nil();


                    pushFollow(FOLLOW_prova_list_in_list_tail971);
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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "list_tail"


    public static class left_term_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "left_term"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:155:1: left_term : ( constant | variable | number | prova_list );
    public final Prova2Parser.left_term_return left_term() throws RecognitionException {
        Prova2Parser.left_term_return retval = new Prova2Parser.left_term_return();
        retval.start = input.LT(1);


        ProvaAST root_0 = null;

        Prova2Parser.constant_return constant84 =null;

        Prova2Parser.variable_return variable85 =null;

        Prova2Parser.number_return number86 =null;

        Prova2Parser.prova_list_return prova_list87 =null;



        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:156:2: ( constant | variable | number | prova_list )
            int alt37=4;
            alt37 = dfa37.predict(input);
            switch (alt37) {
                case 1 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:156:4: constant
                    {
                    root_0 = (ProvaAST)adaptor.nil();


                    pushFollow(FOLLOW_constant_in_left_term981);
                    constant84=constant();

                    state._fsp--;

                    adaptor.addChild(root_0, constant84.getTree());

                    }
                    break;
                case 2 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:157:3: variable
                    {
                    root_0 = (ProvaAST)adaptor.nil();


                    pushFollow(FOLLOW_variable_in_left_term988);
                    variable85=variable();

                    state._fsp--;

                    adaptor.addChild(root_0, variable85.getTree());

                    }
                    break;
                case 3 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:158:3: number
                    {
                    root_0 = (ProvaAST)adaptor.nil();


                    pushFollow(FOLLOW_number_in_left_term994);
                    number86=number();

                    state._fsp--;

                    adaptor.addChild(root_0, number86.getTree());

                    }
                    break;
                case 4 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:159:3: prova_list
                    {
                    root_0 = (ProvaAST)adaptor.nil();


                    pushFollow(FOLLOW_prova_list_in_left_term1000);
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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "left_term"


    public static class right_term_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "right_term"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:161:1: right_term : ( ( ( MINUS )? ( constant | variable ) ) | number | prova_list | prova_map );
    public final Prova2Parser.right_term_return right_term() throws RecognitionException {
        Prova2Parser.right_term_return retval = new Prova2Parser.right_term_return();
        retval.start = input.LT(1);


        ProvaAST root_0 = null;

        Token MINUS88=null;
        Prova2Parser.constant_return constant89 =null;

        Prova2Parser.variable_return variable90 =null;

        Prova2Parser.number_return number91 =null;

        Prova2Parser.prova_list_return prova_list92 =null;

        Prova2Parser.prova_map_return prova_map93 =null;


        ProvaAST MINUS88_tree=null;

        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:162:2: ( ( ( MINUS )? ( constant | variable ) ) | number | prova_list | prova_map )
            int alt40=4;
            switch ( input.LA(1) ) {
            case MINUS:
                {
                int LA40_1 = input.LA(2);

                if ( (LA40_1==DOLLARWORD||LA40_1==LCWORD||(LA40_1 >= STRING1 && LA40_1 <= STRING2)||LA40_1==UCWORD||LA40_1==USWORD) ) {
                    alt40=1;
                }
                else if ( (LA40_1==INT_LITERAL||LA40_1==LONG_LITERAL) ) {
                    alt40=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 40, 1, input);

                    throw nvae;

                }
                }
                break;
            case DOLLARWORD:
            case LCWORD:
            case STRING1:
            case STRING2:
            case UCWORD:
            case USWORD:
                {
                alt40=1;
                }
                break;
            case INT_LITERAL:
            case LONG_LITERAL:
                {
                alt40=2;
                }
                break;
            case BRA:
                {
                alt40=3;
                }
                break;
            case 74:
                {
                alt40=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;

            }

            switch (alt40) {
                case 1 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:162:4: ( ( MINUS )? ( constant | variable ) )
                    {
                    root_0 = (ProvaAST)adaptor.nil();


                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:162:4: ( ( MINUS )? ( constant | variable ) )
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:162:5: ( MINUS )? ( constant | variable )
                    {
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:162:5: ( MINUS )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==MINUS) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:162:5: MINUS
                            {
                            MINUS88=(Token)match(input,MINUS,FOLLOW_MINUS_in_right_term1011); 
                            MINUS88_tree = 
                            (ProvaAST)adaptor.create(MINUS88)
                            ;
                            adaptor.addChild(root_0, MINUS88_tree);


                            }
                            break;

                    }


                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:162:12: ( constant | variable )
                    int alt39=2;
                    alt39 = dfa39.predict(input);
                    switch (alt39) {
                        case 1 :
                            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:162:13: constant
                            {
                            pushFollow(FOLLOW_constant_in_right_term1015);
                            constant89=constant();

                            state._fsp--;

                            adaptor.addChild(root_0, constant89.getTree());

                            }
                            break;
                        case 2 :
                            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:162:24: variable
                            {
                            pushFollow(FOLLOW_variable_in_right_term1019);
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
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:162:37: number
                    {
                    root_0 = (ProvaAST)adaptor.nil();


                    pushFollow(FOLLOW_number_in_right_term1025);
                    number91=number();

                    state._fsp--;

                    adaptor.addChild(root_0, number91.getTree());

                    }
                    break;
                case 3 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:162:46: prova_list
                    {
                    root_0 = (ProvaAST)adaptor.nil();


                    pushFollow(FOLLOW_prova_list_in_right_term1029);
                    prova_list92=prova_list();

                    state._fsp--;

                    adaptor.addChild(root_0, prova_list92.getTree());

                    }
                    break;
                case 4 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:162:59: prova_map
                    {
                    root_0 = (ProvaAST)adaptor.nil();


                    pushFollow(FOLLOW_prova_map_in_right_term1033);
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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "right_term"


    public static class prova_map_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prova_map"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:164:1: prova_map : '{' ( key_value )? ( ',' key_value )* '}' -> ^( PROVA_MAP ( key_value )* ) ;
    public final Prova2Parser.prova_map_return prova_map() throws RecognitionException {
        Prova2Parser.prova_map_return retval = new Prova2Parser.prova_map_return();
        retval.start = input.LT(1);


        ProvaAST root_0 = null;

        Token char_literal94=null;
        Token char_literal96=null;
        Token char_literal98=null;
        Prova2Parser.key_value_return key_value95 =null;

        Prova2Parser.key_value_return key_value97 =null;


        ProvaAST char_literal94_tree=null;
        ProvaAST char_literal96_tree=null;
        ProvaAST char_literal98_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleSubtreeStream stream_key_value=new RewriteRuleSubtreeStream(adaptor,"rule key_value");
        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:165:2: ( '{' ( key_value )? ( ',' key_value )* '}' -> ^( PROVA_MAP ( key_value )* ) )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:165:4: '{' ( key_value )? ( ',' key_value )* '}'
            {
            char_literal94=(Token)match(input,74,FOLLOW_74_in_prova_map1043);  
            stream_74.add(char_literal94);


            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:165:8: ( key_value )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==LCWORD||(LA41_0 >= STRING1 && LA41_0 <= STRING2)) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:165:8: key_value
                    {
                    pushFollow(FOLLOW_key_value_in_prova_map1045);
                    key_value95=key_value();

                    state._fsp--;

                    stream_key_value.add(key_value95.getTree());

                    }
                    break;

            }


            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:165:19: ( ',' key_value )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==COMMA) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:165:20: ',' key_value
            	    {
            	    char_literal96=(Token)match(input,COMMA,FOLLOW_COMMA_in_prova_map1049);  
            	    stream_COMMA.add(char_literal96);


            	    pushFollow(FOLLOW_key_value_in_prova_map1051);
            	    key_value97=key_value();

            	    state._fsp--;

            	    stream_key_value.add(key_value97.getTree());

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);


            char_literal98=(Token)match(input,75,FOLLOW_75_in_prova_map1055);  
            stream_75.add(char_literal98);


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
                // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:165:43: ^( PROVA_MAP ( key_value )* )
                {
                ProvaAST root_1 = (ProvaAST)adaptor.nil();
                root_1 = (ProvaAST)adaptor.becomeRoot(
                (ProvaAST)adaptor.create(PROVA_MAP, "PROVA_MAP")
                , root_1);

                // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:165:55: ( key_value )*
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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "prova_map"


    public static class key_value_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "key_value"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:168:1: key_value : mstring ( '->' | ':' ) term -> ^( KEY_VALUE mstring term ) ;
    public final Prova2Parser.key_value_return key_value() throws RecognitionException {
        Prova2Parser.key_value_return retval = new Prova2Parser.key_value_return();
        retval.start = input.LT(1);


        ProvaAST root_0 = null;

        Token string_literal100=null;
        Token char_literal101=null;
        Prova2Parser.mstring_return mstring99 =null;

        Prova2Parser.term_return term102 =null;


        ProvaAST string_literal100_tree=null;
        ProvaAST char_literal101_tree=null;
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
        RewriteRuleSubtreeStream stream_term=new RewriteRuleSubtreeStream(adaptor,"rule term");
        RewriteRuleSubtreeStream stream_mstring=new RewriteRuleSubtreeStream(adaptor,"rule mstring");
        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:169:2: ( mstring ( '->' | ':' ) term -> ^( KEY_VALUE mstring term ) )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:169:4: mstring ( '->' | ':' ) term
            {
            pushFollow(FOLLOW_mstring_in_key_value1075);
            mstring99=mstring();

            state._fsp--;

            stream_mstring.add(mstring99.getTree());

            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:169:12: ( '->' | ':' )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==71) ) {
                alt43=1;
            }
            else if ( (LA43_0==72) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;

            }
            switch (alt43) {
                case 1 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:169:13: '->'
                    {
                    string_literal100=(Token)match(input,71,FOLLOW_71_in_key_value1078);  
                    stream_71.add(string_literal100);


                    }
                    break;
                case 2 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:169:18: ':'
                    {
                    char_literal101=(Token)match(input,72,FOLLOW_72_in_key_value1080);  
                    stream_72.add(char_literal101);


                    }
                    break;

            }


            pushFollow(FOLLOW_term_in_key_value1083);
            term102=term();

            state._fsp--;

            stream_term.add(term102.getTree());

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
            // 169:28: -> ^( KEY_VALUE mstring term )
            {
                // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:169:31: ^( KEY_VALUE mstring term )
                {
                ProvaAST root_1 = (ProvaAST)adaptor.nil();
                root_1 = (ProvaAST)adaptor.becomeRoot(
                (ProvaAST)adaptor.create(KEY_VALUE, "KEY_VALUE")
                , root_1);

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "key_value"


    public static class terms_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "terms"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:172:1: terms : ( NEWLINE )* term ( ( NEWLINE )* ',' ( NEWLINE )* term )* -> ^( TERM ( term )+ ) ;
    public final Prova2Parser.terms_return terms() throws RecognitionException {
        Prova2Parser.terms_return retval = new Prova2Parser.terms_return();
        retval.start = input.LT(1);


        ProvaAST root_0 = null;

        Token NEWLINE103=null;
        Token NEWLINE105=null;
        Token char_literal106=null;
        Token NEWLINE107=null;
        Prova2Parser.term_return term104 =null;

        Prova2Parser.term_return term108 =null;


        ProvaAST NEWLINE103_tree=null;
        ProvaAST NEWLINE105_tree=null;
        ProvaAST char_literal106_tree=null;
        ProvaAST NEWLINE107_tree=null;
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_term=new RewriteRuleSubtreeStream(adaptor,"rule term");
        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:172:8: ( ( NEWLINE )* term ( ( NEWLINE )* ',' ( NEWLINE )* term )* -> ^( TERM ( term )+ ) )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:172:10: ( NEWLINE )* term ( ( NEWLINE )* ',' ( NEWLINE )* term )*
            {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:172:10: ( NEWLINE )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==NEWLINE) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:172:10: NEWLINE
            	    {
            	    NEWLINE103=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_terms1106);  
            	    stream_NEWLINE.add(NEWLINE103);


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);


            pushFollow(FOLLOW_term_in_terms1109);
            term104=term();

            state._fsp--;

            stream_term.add(term104.getTree());

            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:172:24: ( ( NEWLINE )* ',' ( NEWLINE )* term )*
            loop47:
            do {
                int alt47=2;
                alt47 = dfa47.predict(input);
                switch (alt47) {
            	case 1 :
            	    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:172:25: ( NEWLINE )* ',' ( NEWLINE )* term
            	    {
            	    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:172:25: ( NEWLINE )*
            	    loop45:
            	    do {
            	        int alt45=2;
            	        int LA45_0 = input.LA(1);

            	        if ( (LA45_0==NEWLINE) ) {
            	            alt45=1;
            	        }


            	        switch (alt45) {
            	    	case 1 :
            	    	    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:172:25: NEWLINE
            	    	    {
            	    	    NEWLINE105=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_terms1112);  
            	    	    stream_NEWLINE.add(NEWLINE105);


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop45;
            	        }
            	    } while (true);


            	    char_literal106=(Token)match(input,COMMA,FOLLOW_COMMA_in_terms1115);  
            	    stream_COMMA.add(char_literal106);


            	    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:172:38: ( NEWLINE )*
            	    loop46:
            	    do {
            	        int alt46=2;
            	        int LA46_0 = input.LA(1);

            	        if ( (LA46_0==NEWLINE) ) {
            	            alt46=1;
            	        }


            	        switch (alt46) {
            	    	case 1 :
            	    	    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:172:38: NEWLINE
            	    	    {
            	    	    NEWLINE107=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_terms1117);  
            	    	    stream_NEWLINE.add(NEWLINE107);


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop46;
            	        }
            	    } while (true);


            	    pushFollow(FOLLOW_term_in_terms1120);
            	    term108=term();

            	    state._fsp--;

            	    stream_term.add(term108.getTree());

            	    }
            	    break;

            	default :
            	    break loop47;
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
                // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:172:57: ^( TERM ( term )+ )
                {
                ProvaAST root_1 = (ProvaAST)adaptor.nil();
                root_1 = (ProvaAST)adaptor.becomeRoot(
                (ProvaAST)adaptor.create(TERM, "TERM")
                , root_1);

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "terms"


    public static class terms0_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "terms0"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:174:1: terms0 : ( term )+ -> ^( TERM ( term )+ ) ;
    public final Prova2Parser.terms0_return terms0() throws RecognitionException {
        Prova2Parser.terms0_return retval = new Prova2Parser.terms0_return();
        retval.start = input.LT(1);


        ProvaAST root_0 = null;

        Prova2Parser.term_return term109 =null;


        RewriteRuleSubtreeStream stream_term=new RewriteRuleSubtreeStream(adaptor,"rule term");
        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:174:9: ( ( term )+ -> ^( TERM ( term )+ ) )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:174:11: ( term )+
            {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:174:11: ( term )+
            int cnt48=0;
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==BRA||LA48_0==DOLLARWORD||LA48_0==INT_LITERAL||LA48_0==LCWORD||LA48_0==LONG_LITERAL||LA48_0==MINUS||(LA48_0 >= STRING1 && LA48_0 <= STRING2)||LA48_0==UCWORD||LA48_0==USWORD||LA48_0==74) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:174:11: term
            	    {
            	    pushFollow(FOLLOW_term_in_terms01140);
            	    term109=term();

            	    state._fsp--;

            	    stream_term.add(term109.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt48 >= 1 ) break loop48;
                        EarlyExitException eee =
                            new EarlyExitException(48, input);
                        throw eee;
                }
                cnt48++;
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
                // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:174:20: ^( TERM ( term )+ )
                {
                ProvaAST root_1 = (ProvaAST)adaptor.nil();
                root_1 = (ProvaAST)adaptor.becomeRoot(
                (ProvaAST)adaptor.create(TERM, "TERM")
                , root_1);

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "terms0"


    public static class term_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "term"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:176:1: term : ( left_term | func_term | prova_map );
    public final Prova2Parser.term_return term() throws RecognitionException {
        Prova2Parser.term_return retval = new Prova2Parser.term_return();
        retval.start = input.LT(1);


        ProvaAST root_0 = null;

        Prova2Parser.left_term_return left_term110 =null;

        Prova2Parser.func_term_return func_term111 =null;

        Prova2Parser.prova_map_return prova_map112 =null;



        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:176:6: ( left_term | func_term | prova_map )
            int alt49=3;
            alt49 = dfa49.predict(input);
            switch (alt49) {
                case 1 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:176:8: left_term
                    {
                    root_0 = (ProvaAST)adaptor.nil();


                    pushFollow(FOLLOW_left_term_in_term1158);
                    left_term110=left_term();

                    state._fsp--;

                    adaptor.addChild(root_0, left_term110.getTree());

                    }
                    break;
                case 2 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:176:20: func_term
                    {
                    root_0 = (ProvaAST)adaptor.nil();


                    pushFollow(FOLLOW_func_term_in_term1162);
                    func_term111=func_term();

                    state._fsp--;

                    adaptor.addChild(root_0, func_term111.getTree());

                    }
                    break;
                case 3 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:176:32: prova_map
                    {
                    root_0 = (ProvaAST)adaptor.nil();


                    pushFollow(FOLLOW_prova_map_in_term1166);
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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "term"


    public static class func_term_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "func_term"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:178:1: func_term : func args ;
    public final Prova2Parser.func_term_return func_term() throws RecognitionException {
        Prova2Parser.func_term_return retval = new Prova2Parser.func_term_return();
        retval.start = input.LT(1);


        ProvaAST root_0 = null;

        Prova2Parser.func_return func113 =null;

        Prova2Parser.args_return args114 =null;



        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:179:2: ( func args )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:179:4: func args
            {
            root_0 = (ProvaAST)adaptor.nil();


            pushFollow(FOLLOW_func_in_func_term1175);
            func113=func();

            state._fsp--;

            adaptor.addChild(root_0, func113.getTree());

            pushFollow(FOLLOW_args_in_func_term1177);
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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "func_term"


    public static class qualified_java_class_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "qualified_java_class"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:181:1: qualified_java_class : ( ( LCWORD DOT )+ UCWORD ) -> ^( QUALIFIED_JAVA_CLASS ( LCWORD DOT )+ UCWORD ) ;
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
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:182:2: ( ( ( LCWORD DOT )+ UCWORD ) -> ^( QUALIFIED_JAVA_CLASS ( LCWORD DOT )+ UCWORD ) )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:182:4: ( ( LCWORD DOT )+ UCWORD )
            {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:182:4: ( ( LCWORD DOT )+ UCWORD )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:182:5: ( LCWORD DOT )+ UCWORD
            {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:182:5: ( LCWORD DOT )+
            int cnt50=0;
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==LCWORD) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:182:6: LCWORD DOT
            	    {
            	    LCWORD115=(Token)match(input,LCWORD,FOLLOW_LCWORD_in_qualified_java_class1190);  
            	    stream_LCWORD.add(LCWORD115);


            	    DOT116=(Token)match(input,DOT,FOLLOW_DOT_in_qualified_java_class1192);  
            	    stream_DOT.add(DOT116);


            	    }
            	    break;

            	default :
            	    if ( cnt50 >= 1 ) break loop50;
                        EarlyExitException eee =
                            new EarlyExitException(50, input);
                        throw eee;
                }
                cnt50++;
            } while (true);


            UCWORD117=(Token)match(input,UCWORD,FOLLOW_UCWORD_in_qualified_java_class1196);  
            stream_UCWORD.add(UCWORD117);


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
            // 182:27: -> ^( QUALIFIED_JAVA_CLASS ( LCWORD DOT )+ UCWORD )
            {
                // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:182:30: ^( QUALIFIED_JAVA_CLASS ( LCWORD DOT )+ UCWORD )
                {
                ProvaAST root_1 = (ProvaAST)adaptor.nil();
                root_1 = (ProvaAST)adaptor.becomeRoot(
                (ProvaAST)adaptor.create(QUALIFIED_JAVA_CLASS, "QUALIFIED_JAVA_CLASS")
                , root_1);

                if ( !(stream_LCWORD.hasNext()||stream_DOT.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_LCWORD.hasNext()||stream_DOT.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_LCWORD.nextNode()
                    );

                    adaptor.addChild(root_1, 
                    stream_DOT.nextNode()
                    );

                }
                stream_LCWORD.reset();
                stream_DOT.reset();

                adaptor.addChild(root_1, 
                stream_UCWORD.nextNode()
                );

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "qualified_java_class"


    public static class prova_list_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prova_list"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:185:1: prova_list : '[' list_body ']' -> ^( PROVA_LIST list_body ) ;
    public final Prova2Parser.prova_list_return prova_list() throws RecognitionException {
        Prova2Parser.prova_list_return retval = new Prova2Parser.prova_list_return();
        retval.start = input.LT(1);


        ProvaAST root_0 = null;

        Token char_literal118=null;
        Token char_literal120=null;
        Prova2Parser.list_body_return list_body119 =null;


        ProvaAST char_literal118_tree=null;
        ProvaAST char_literal120_tree=null;
        RewriteRuleTokenStream stream_BRA=new RewriteRuleTokenStream(adaptor,"token BRA");
        RewriteRuleTokenStream stream_KET=new RewriteRuleTokenStream(adaptor,"token KET");
        RewriteRuleSubtreeStream stream_list_body=new RewriteRuleSubtreeStream(adaptor,"rule list_body");
        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:186:2: ( '[' list_body ']' -> ^( PROVA_LIST list_body ) )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:186:4: '[' list_body ']'
            {
            char_literal118=(Token)match(input,BRA,FOLLOW_BRA_in_prova_list1224);  
            stream_BRA.add(char_literal118);


            pushFollow(FOLLOW_list_body_in_prova_list1226);
            list_body119=list_body();

            state._fsp--;

            stream_list_body.add(list_body119.getTree());

            char_literal120=(Token)match(input,KET,FOLLOW_KET_in_prova_list1228);  
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
                // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:186:25: ^( PROVA_LIST list_body )
                {
                ProvaAST root_1 = (ProvaAST)adaptor.nil();
                root_1 = (ProvaAST)adaptor.becomeRoot(
                (ProvaAST)adaptor.create(PROVA_LIST, "PROVA_LIST")
                , root_1);

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "prova_list"


    public static class args_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "args"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:188:1: args : '(' list_body ')' -> ^( ARGS list_body ) ;
    public final Prova2Parser.args_return args() throws RecognitionException {
        Prova2Parser.args_return retval = new Prova2Parser.args_return();
        retval.start = input.LT(1);


        ProvaAST root_0 = null;

        Token char_literal121=null;
        Token char_literal123=null;
        Prova2Parser.list_body_return list_body122 =null;


        ProvaAST char_literal121_tree=null;
        ProvaAST char_literal123_tree=null;
        RewriteRuleTokenStream stream_OPEN=new RewriteRuleTokenStream(adaptor,"token OPEN");
        RewriteRuleTokenStream stream_CLOSE=new RewriteRuleTokenStream(adaptor,"token CLOSE");
        RewriteRuleSubtreeStream stream_list_body=new RewriteRuleSubtreeStream(adaptor,"rule list_body");
        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:188:7: ( '(' list_body ')' -> ^( ARGS list_body ) )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:188:9: '(' list_body ')'
            {
            char_literal121=(Token)match(input,OPEN,FOLLOW_OPEN_in_args1245);  
            stream_OPEN.add(char_literal121);


            pushFollow(FOLLOW_list_body_in_args1247);
            list_body122=list_body();

            state._fsp--;

            stream_list_body.add(list_body122.getTree());

            char_literal123=(Token)match(input,CLOSE,FOLLOW_CLOSE_in_args1249);  
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
                // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:188:30: ^( ARGS list_body )
                {
                ProvaAST root_1 = (ProvaAST)adaptor.nil();
                root_1 = (ProvaAST)adaptor.becomeRoot(
                (ProvaAST)adaptor.create(ARGS, "ARGS")
                , root_1);

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "args"


    public static class semantic_attachment_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "semantic_attachment"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:190:1: semantic_attachment : ( predicate_java_call | binary_operation );
    public final Prova2Parser.semantic_attachment_return semantic_attachment() throws RecognitionException {
        Prova2Parser.semantic_attachment_return retval = new Prova2Parser.semantic_attachment_return();
        retval.start = input.LT(1);


        ProvaAST root_0 = null;

        Prova2Parser.predicate_java_call_return predicate_java_call124 =null;

        Prova2Parser.binary_operation_return binary_operation125 =null;



        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:191:2: ( predicate_java_call | binary_operation )
            int alt51=2;
            alt51 = dfa51.predict(input);
            switch (alt51) {
                case 1 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:191:4: predicate_java_call
                    {
                    root_0 = (ProvaAST)adaptor.nil();


                    pushFollow(FOLLOW_predicate_java_call_in_semantic_attachment1267);
                    predicate_java_call124=predicate_java_call();

                    state._fsp--;

                    adaptor.addChild(root_0, predicate_java_call124.getTree());

                    }
                    break;
                case 2 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:191:26: binary_operation
                    {
                    root_0 = (ProvaAST)adaptor.nil();


                    pushFollow(FOLLOW_binary_operation_in_semantic_attachment1271);
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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "semantic_attachment"


    public static class binary_operation_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "binary_operation"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:193:1: binary_operation : left_term ( EQUAL ( constructor_java_call | prova_list | constant | expr ) | not_equal constant | binary_operator expr ) ;
    public final Prova2Parser.binary_operation_return binary_operation() throws RecognitionException {
        Prova2Parser.binary_operation_return retval = new Prova2Parser.binary_operation_return();
        retval.start = input.LT(1);


        ProvaAST root_0 = null;

        Token EQUAL127=null;
        Prova2Parser.left_term_return left_term126 =null;

        Prova2Parser.constructor_java_call_return constructor_java_call128 =null;

        Prova2Parser.prova_list_return prova_list129 =null;

        Prova2Parser.constant_return constant130 =null;

        Prova2Parser.expr_return expr131 =null;

        Prova2Parser.not_equal_return not_equal132 =null;

        Prova2Parser.constant_return constant133 =null;

        Prova2Parser.binary_operator_return binary_operator134 =null;

        Prova2Parser.expr_return expr135 =null;


        ProvaAST EQUAL127_tree=null;

        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:194:2: ( left_term ( EQUAL ( constructor_java_call | prova_list | constant | expr ) | not_equal constant | binary_operator expr ) )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:194:4: left_term ( EQUAL ( constructor_java_call | prova_list | constant | expr ) | not_equal constant | binary_operator expr )
            {
            root_0 = (ProvaAST)adaptor.nil();


            pushFollow(FOLLOW_left_term_in_binary_operation1280);
            left_term126=left_term();

            state._fsp--;

            adaptor.addChild(root_0, left_term126.getTree());

            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:195:3: ( EQUAL ( constructor_java_call | prova_list | constant | expr ) | not_equal constant | binary_operator expr )
            int alt53=3;
            alt53 = dfa53.predict(input);
            switch (alt53) {
                case 1 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:195:5: EQUAL ( constructor_java_call | prova_list | constant | expr )
                    {
                    EQUAL127=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_binary_operation1286); 
                    EQUAL127_tree = 
                    (ProvaAST)adaptor.create(EQUAL127)
                    ;
                    adaptor.addChild(root_0, EQUAL127_tree);


                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:196:4: ( constructor_java_call | prova_list | constant | expr )
                    int alt52=4;
                    alt52 = dfa52.predict(input);
                    switch (alt52) {
                        case 1 :
                            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:197:4: constructor_java_call
                            {
                            pushFollow(FOLLOW_constructor_java_call_in_binary_operation1296);
                            constructor_java_call128=constructor_java_call();

                            state._fsp--;

                            adaptor.addChild(root_0, constructor_java_call128.getTree());

                            }
                            break;
                        case 2 :
                            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:198:6: prova_list
                            {
                            pushFollow(FOLLOW_prova_list_in_binary_operation1303);
                            prova_list129=prova_list();

                            state._fsp--;

                            adaptor.addChild(root_0, prova_list129.getTree());

                            }
                            break;
                        case 3 :
                            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:199:6: constant
                            {
                            pushFollow(FOLLOW_constant_in_binary_operation1310);
                            constant130=constant();

                            state._fsp--;

                            adaptor.addChild(root_0, constant130.getTree());

                            }
                            break;
                        case 4 :
                            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:200:6: expr
                            {
                            pushFollow(FOLLOW_expr_in_binary_operation1317);
                            expr131=expr();

                            state._fsp--;

                            adaptor.addChild(root_0, expr131.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:202:5: not_equal constant
                    {
                    pushFollow(FOLLOW_not_equal_in_binary_operation1328);
                    not_equal132=not_equal();

                    state._fsp--;

                    adaptor.addChild(root_0, not_equal132.getTree());

                    pushFollow(FOLLOW_constant_in_binary_operation1330);
                    constant133=constant();

                    state._fsp--;

                    adaptor.addChild(root_0, constant133.getTree());

                    }
                    break;
                case 3 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:203:5: binary_operator expr
                    {
                    pushFollow(FOLLOW_binary_operator_in_binary_operation1336);
                    binary_operator134=binary_operator();

                    state._fsp--;

                    adaptor.addChild(root_0, binary_operator134.getTree());

                    pushFollow(FOLLOW_expr_in_binary_operation1338);
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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "binary_operation"


    public static class expr_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:206:1: expr : aterm ( ( PLUS | MINUS ) aterm )* ;
    public final Prova2Parser.expr_return expr() throws RecognitionException {
        Prova2Parser.expr_return retval = new Prova2Parser.expr_return();
        retval.start = input.LT(1);


        ProvaAST root_0 = null;

        Token set137=null;
        Prova2Parser.aterm_return aterm136 =null;

        Prova2Parser.aterm_return aterm138 =null;


        ProvaAST set137_tree=null;

        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:206:6: ( aterm ( ( PLUS | MINUS ) aterm )* )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:206:8: aterm ( ( PLUS | MINUS ) aterm )*
            {
            root_0 = (ProvaAST)adaptor.nil();


            pushFollow(FOLLOW_aterm_in_expr1350);
            aterm136=aterm();

            state._fsp--;

            adaptor.addChild(root_0, aterm136.getTree());

            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:206:14: ( ( PLUS | MINUS ) aterm )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==MINUS||LA54_0==PLUS) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:206:15: ( PLUS | MINUS ) aterm
            	    {
            	    set137=(Token)input.LT(1);

            	    if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
            	        input.consume();
            	        adaptor.addChild(root_0, 
            	        (ProvaAST)adaptor.create(set137)
            	        );
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_aterm_in_expr1361);
            	    aterm138=aterm();

            	    state._fsp--;

            	    adaptor.addChild(root_0, aterm138.getTree());

            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);


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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr"


    public static class aterm_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "aterm"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:208:1: aterm : ( ( MINUS )? variable | number | ( MINUS )? predicate_java_call | OPEN expr CLOSE ) ( ( MULT | DIV | REM ) aterm )? ;
    public final Prova2Parser.aterm_return aterm() throws RecognitionException {
        Prova2Parser.aterm_return retval = new Prova2Parser.aterm_return();
        retval.start = input.LT(1);


        ProvaAST root_0 = null;

        Token MINUS139=null;
        Token MINUS142=null;
        Token OPEN144=null;
        Token CLOSE146=null;
        Token set147=null;
        Prova2Parser.variable_return variable140 =null;

        Prova2Parser.number_return number141 =null;

        Prova2Parser.predicate_java_call_return predicate_java_call143 =null;

        Prova2Parser.expr_return expr145 =null;

        Prova2Parser.aterm_return aterm148 =null;


        ProvaAST MINUS139_tree=null;
        ProvaAST MINUS142_tree=null;
        ProvaAST OPEN144_tree=null;
        ProvaAST CLOSE146_tree=null;
        ProvaAST set147_tree=null;

        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:208:7: ( ( ( MINUS )? variable | number | ( MINUS )? predicate_java_call | OPEN expr CLOSE ) ( ( MULT | DIV | REM ) aterm )? )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:208:9: ( ( MINUS )? variable | number | ( MINUS )? predicate_java_call | OPEN expr CLOSE ) ( ( MULT | DIV | REM ) aterm )?
            {
            root_0 = (ProvaAST)adaptor.nil();


            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:208:9: ( ( MINUS )? variable | number | ( MINUS )? predicate_java_call | OPEN expr CLOSE )
            int alt57=4;
            alt57 = dfa57.predict(input);
            switch (alt57) {
                case 1 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:208:10: ( MINUS )? variable
                    {
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:208:10: ( MINUS )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==MINUS) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:208:10: MINUS
                            {
                            MINUS139=(Token)match(input,MINUS,FOLLOW_MINUS_in_aterm1373); 
                            MINUS139_tree = 
                            (ProvaAST)adaptor.create(MINUS139)
                            ;
                            adaptor.addChild(root_0, MINUS139_tree);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_variable_in_aterm1376);
                    variable140=variable();

                    state._fsp--;

                    adaptor.addChild(root_0, variable140.getTree());

                    }
                    break;
                case 2 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:208:28: number
                    {
                    pushFollow(FOLLOW_number_in_aterm1380);
                    number141=number();

                    state._fsp--;

                    adaptor.addChild(root_0, number141.getTree());

                    }
                    break;
                case 3 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:208:37: ( MINUS )? predicate_java_call
                    {
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:208:37: ( MINUS )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==MINUS) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:208:37: MINUS
                            {
                            MINUS142=(Token)match(input,MINUS,FOLLOW_MINUS_in_aterm1384); 
                            MINUS142_tree = 
                            (ProvaAST)adaptor.create(MINUS142)
                            ;
                            adaptor.addChild(root_0, MINUS142_tree);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_predicate_java_call_in_aterm1387);
                    predicate_java_call143=predicate_java_call();

                    state._fsp--;

                    adaptor.addChild(root_0, predicate_java_call143.getTree());

                    }
                    break;
                case 4 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:208:66: OPEN expr CLOSE
                    {
                    OPEN144=(Token)match(input,OPEN,FOLLOW_OPEN_in_aterm1391); 
                    OPEN144_tree = 
                    (ProvaAST)adaptor.create(OPEN144)
                    ;
                    adaptor.addChild(root_0, OPEN144_tree);


                    pushFollow(FOLLOW_expr_in_aterm1393);
                    expr145=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr145.getTree());

                    CLOSE146=(Token)match(input,CLOSE,FOLLOW_CLOSE_in_aterm1395); 
                    CLOSE146_tree = 
                    (ProvaAST)adaptor.create(CLOSE146)
                    ;
                    adaptor.addChild(root_0, CLOSE146_tree);


                    }
                    break;

            }


            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:208:83: ( ( MULT | DIV | REM ) aterm )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==DIV||LA58_0==MULT||LA58_0==REM) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:208:84: ( MULT | DIV | REM ) aterm
                    {
                    set147=(Token)input.LT(1);

                    if ( input.LA(1)==DIV||input.LA(1)==MULT||input.LA(1)==REM ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (ProvaAST)adaptor.create(set147)
                        );
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_aterm_in_aterm1413);
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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "aterm"


    public static class constructor_java_call_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "constructor_java_call"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:210:1: constructor_java_call : ( qualified_java_class | UCWORD ) args ;
    public final Prova2Parser.constructor_java_call_return constructor_java_call() throws RecognitionException {
        Prova2Parser.constructor_java_call_return retval = new Prova2Parser.constructor_java_call_return();
        retval.start = input.LT(1);


        ProvaAST root_0 = null;

        Token UCWORD150=null;
        Prova2Parser.qualified_java_class_return qualified_java_class149 =null;

        Prova2Parser.args_return args151 =null;


        ProvaAST UCWORD150_tree=null;

        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:211:2: ( ( qualified_java_class | UCWORD ) args )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:211:4: ( qualified_java_class | UCWORD ) args
            {
            root_0 = (ProvaAST)adaptor.nil();


            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:211:4: ( qualified_java_class | UCWORD )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==LCWORD) ) {
                alt59=1;
            }
            else if ( (LA59_0==UCWORD) ) {
                alt59=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;

            }
            switch (alt59) {
                case 1 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:211:5: qualified_java_class
                    {
                    pushFollow(FOLLOW_qualified_java_class_in_constructor_java_call1425);
                    qualified_java_class149=qualified_java_class();

                    state._fsp--;

                    adaptor.addChild(root_0, qualified_java_class149.getTree());

                    }
                    break;
                case 2 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:211:28: UCWORD
                    {
                    UCWORD150=(Token)match(input,UCWORD,FOLLOW_UCWORD_in_constructor_java_call1429); 
                    UCWORD150_tree = 
                    (ProvaAST)adaptor.create(UCWORD150)
                    ;
                    adaptor.addChild(root_0, UCWORD150_tree);


                    }
                    break;

            }


            pushFollow(FOLLOW_args_in_constructor_java_call1432);
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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "constructor_java_call"


    public static class predicate_java_call_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "predicate_java_call"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:214:1: predicate_java_call : ( static_java_call | instance_java_call );
    public final Prova2Parser.predicate_java_call_return predicate_java_call() throws RecognitionException {
        Prova2Parser.predicate_java_call_return retval = new Prova2Parser.predicate_java_call_return();
        retval.start = input.LT(1);


        ProvaAST root_0 = null;

        Prova2Parser.static_java_call_return static_java_call152 =null;

        Prova2Parser.instance_java_call_return instance_java_call153 =null;



        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:215:2: ( static_java_call | instance_java_call )
            int alt60=2;
            alt60 = dfa60.predict(input);
            switch (alt60) {
                case 1 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:215:4: static_java_call
                    {
                    root_0 = (ProvaAST)adaptor.nil();


                    pushFollow(FOLLOW_static_java_call_in_predicate_java_call1443);
                    static_java_call152=static_java_call();

                    state._fsp--;

                    adaptor.addChild(root_0, static_java_call152.getTree());

                    }
                    break;
                case 2 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:215:23: instance_java_call
                    {
                    root_0 = (ProvaAST)adaptor.nil();


                    pushFollow(FOLLOW_instance_java_call_in_predicate_java_call1447);
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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "predicate_java_call"


    public static class instance_java_call_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "instance_java_call"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:218:1: instance_java_call : instance_call args -> ^( INSTANCE_JAVA_CALL instance_call args ) ;
    public final Prova2Parser.instance_java_call_return instance_java_call() throws RecognitionException {
        Prova2Parser.instance_java_call_return retval = new Prova2Parser.instance_java_call_return();
        retval.start = input.LT(1);


        ProvaAST root_0 = null;

        Prova2Parser.instance_call_return instance_call154 =null;

        Prova2Parser.args_return args155 =null;


        RewriteRuleSubtreeStream stream_instance_call=new RewriteRuleSubtreeStream(adaptor,"rule instance_call");
        RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"rule args");
        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:219:2: ( instance_call args -> ^( INSTANCE_JAVA_CALL instance_call args ) )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:219:4: instance_call args
            {
            pushFollow(FOLLOW_instance_call_in_instance_java_call1458);
            instance_call154=instance_call();

            state._fsp--;

            stream_instance_call.add(instance_call154.getTree());

            pushFollow(FOLLOW_args_in_instance_java_call1460);
            args155=args();

            state._fsp--;

            stream_args.add(args155.getTree());

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
            // 219:23: -> ^( INSTANCE_JAVA_CALL instance_call args )
            {
                // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:219:26: ^( INSTANCE_JAVA_CALL instance_call args )
                {
                ProvaAST root_1 = (ProvaAST)adaptor.nil();
                root_1 = (ProvaAST)adaptor.becomeRoot(
                (ProvaAST)adaptor.create(INSTANCE_JAVA_CALL, "INSTANCE_JAVA_CALL")
                , root_1);

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "instance_java_call"


    public static class static_java_call_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "static_java_call"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:222:1: static_java_call : static_call args -> ^( STATIC_JAVA_CALL static_call args ) ;
    public final Prova2Parser.static_java_call_return static_java_call() throws RecognitionException {
        Prova2Parser.static_java_call_return retval = new Prova2Parser.static_java_call_return();
        retval.start = input.LT(1);


        ProvaAST root_0 = null;

        Prova2Parser.static_call_return static_call156 =null;

        Prova2Parser.args_return args157 =null;


        RewriteRuleSubtreeStream stream_static_call=new RewriteRuleSubtreeStream(adaptor,"rule static_call");
        RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"rule args");
        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:223:2: ( static_call args -> ^( STATIC_JAVA_CALL static_call args ) )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:223:4: static_call args
            {
            pushFollow(FOLLOW_static_call_in_static_java_call1481);
            static_call156=static_call();

            state._fsp--;

            stream_static_call.add(static_call156.getTree());

            pushFollow(FOLLOW_args_in_static_java_call1483);
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
                // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:223:24: ^( STATIC_JAVA_CALL static_call args )
                {
                ProvaAST root_1 = (ProvaAST)adaptor.nil();
                root_1 = (ProvaAST)adaptor.becomeRoot(
                (ProvaAST)adaptor.create(STATIC_JAVA_CALL, "STATIC_JAVA_CALL")
                , root_1);

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "static_java_call"


    public static class method_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "method"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:226:1: method : LCWORD ;
    public final Prova2Parser.method_return method() throws RecognitionException {
        Prova2Parser.method_return retval = new Prova2Parser.method_return();
        retval.start = input.LT(1);


        ProvaAST root_0 = null;

        Token LCWORD158=null;

        ProvaAST LCWORD158_tree=null;

        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:226:9: ( LCWORD )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:226:11: LCWORD
            {
            root_0 = (ProvaAST)adaptor.nil();


            LCWORD158=(Token)match(input,LCWORD,FOLLOW_LCWORD_in_method1504); 
            LCWORD158_tree = 
            (ProvaAST)adaptor.create(LCWORD158)
            ;
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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "method"


    public static class func_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "func"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:228:1: func : ( LCWORD | UCWORD | string | typed_variable );
    public final Prova2Parser.func_return func() throws RecognitionException {
        Prova2Parser.func_return retval = new Prova2Parser.func_return();
        retval.start = input.LT(1);


        ProvaAST root_0 = null;

        Token LCWORD159=null;
        Token UCWORD160=null;
        Prova2Parser.string_return string161 =null;

        Prova2Parser.typed_variable_return typed_variable162 =null;


        ProvaAST LCWORD159_tree=null;
        ProvaAST UCWORD160_tree=null;

        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:228:6: ( LCWORD | UCWORD | string | typed_variable )
            int alt61=4;
            switch ( input.LA(1) ) {
            case LCWORD:
                {
                int LA61_1 = input.LA(2);

                if ( (LA61_1==DOT) ) {
                    alt61=4;
                }
                else if ( (LA61_1==OPEN) ) {
                    alt61=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 61, 1, input);

                    throw nvae;

                }
                }
                break;
            case UCWORD:
                {
                int LA61_2 = input.LA(2);

                if ( (LA61_2==DOT) ) {
                    alt61=4;
                }
                else if ( (LA61_2==OPEN) ) {
                    alt61=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 61, 2, input);

                    throw nvae;

                }
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
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:228:8: LCWORD
                    {
                    root_0 = (ProvaAST)adaptor.nil();


                    LCWORD159=(Token)match(input,LCWORD,FOLLOW_LCWORD_in_func1512); 
                    LCWORD159_tree = 
                    (ProvaAST)adaptor.create(LCWORD159)
                    ;
                    adaptor.addChild(root_0, LCWORD159_tree);


                    }
                    break;
                case 2 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:228:17: UCWORD
                    {
                    root_0 = (ProvaAST)adaptor.nil();


                    UCWORD160=(Token)match(input,UCWORD,FOLLOW_UCWORD_in_func1516); 
                    UCWORD160_tree = 
                    (ProvaAST)adaptor.create(UCWORD160)
                    ;
                    adaptor.addChild(root_0, UCWORD160_tree);


                    }
                    break;
                case 3 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:228:26: string
                    {
                    root_0 = (ProvaAST)adaptor.nil();


                    pushFollow(FOLLOW_string_in_func1520);
                    string161=string();

                    state._fsp--;

                    adaptor.addChild(root_0, string161.getTree());

                    }
                    break;
                case 4 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:228:35: typed_variable
                    {
                    root_0 = (ProvaAST)adaptor.nil();


                    pushFollow(FOLLOW_typed_variable_in_func1524);
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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "func"


    public static class predicate_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "predicate"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:230:1: predicate : ( LCWORD | UCWORD | string );
    public final Prova2Parser.predicate_return predicate() throws RecognitionException {
        Prova2Parser.predicate_return retval = new Prova2Parser.predicate_return();
        retval.start = input.LT(1);


        ProvaAST root_0 = null;

        Token LCWORD163=null;
        Token UCWORD164=null;
        Prova2Parser.string_return string165 =null;


        ProvaAST LCWORD163_tree=null;
        ProvaAST UCWORD164_tree=null;

        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:231:2: ( LCWORD | UCWORD | string )
            int alt62=3;
            switch ( input.LA(1) ) {
            case LCWORD:
                {
                alt62=1;
                }
                break;
            case UCWORD:
                {
                alt62=2;
                }
                break;
            case STRING1:
            case STRING2:
                {
                alt62=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;

            }

            switch (alt62) {
                case 1 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:231:4: LCWORD
                    {
                    root_0 = (ProvaAST)adaptor.nil();


                    LCWORD163=(Token)match(input,LCWORD,FOLLOW_LCWORD_in_predicate1534); 
                    LCWORD163_tree = 
                    (ProvaAST)adaptor.create(LCWORD163)
                    ;
                    adaptor.addChild(root_0, LCWORD163_tree);


                    }
                    break;
                case 2 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:231:13: UCWORD
                    {
                    root_0 = (ProvaAST)adaptor.nil();


                    UCWORD164=(Token)match(input,UCWORD,FOLLOW_UCWORD_in_predicate1538); 
                    UCWORD164_tree = 
                    (ProvaAST)adaptor.create(UCWORD164)
                    ;
                    adaptor.addChild(root_0, UCWORD164_tree);


                    }
                    break;
                case 3 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:231:22: string
                    {
                    root_0 = (ProvaAST)adaptor.nil();


                    pushFollow(FOLLOW_string_in_predicate1542);
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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "predicate"


    public static class variable_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "variable"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:233:1: variable : ( UCWORD | USWORD | typed_variable | DOLLARWORD );
    public final Prova2Parser.variable_return variable() throws RecognitionException {
        Prova2Parser.variable_return retval = new Prova2Parser.variable_return();
        retval.start = input.LT(1);


        ProvaAST root_0 = null;

        Token UCWORD166=null;
        Token USWORD167=null;
        Token DOLLARWORD169=null;
        Prova2Parser.typed_variable_return typed_variable168 =null;


        ProvaAST UCWORD166_tree=null;
        ProvaAST USWORD167_tree=null;
        ProvaAST DOLLARWORD169_tree=null;

        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:233:9: ( UCWORD | USWORD | typed_variable | DOLLARWORD )
            int alt63=4;
            switch ( input.LA(1) ) {
            case UCWORD:
                {
                int LA63_1 = input.LA(2);

                if ( (LA63_1==DOT) ) {
                    switch ( input.LA(3) ) {
                    case EOF:
                    case NEWLINE:
                        {
                        alt63=1;
                        }
                        break;
                    case LCWORD:
                        {
                        int LA63_7 = input.LA(4);

                        if ( (LA63_7==OPEN) ) {
                            alt63=1;
                        }
                        else if ( (LA63_7==EOF||(LA63_7 >= BAR && LA63_7 <= BRA)||(LA63_7 >= CLOSE && LA63_7 <= COMMA)||LA63_7==DIV||(LA63_7 >= DOLLARWORD && LA63_7 <= EQUAL)||(LA63_7 >= GE && LA63_7 <= GT)||(LA63_7 >= INT_LITERAL && LA63_7 <= KET)||(LA63_7 >= LCWORD && LA63_7 <= LE)||(LA63_7 >= LONG_LITERAL && LA63_7 <= LT)||LA63_7==MINUS||(LA63_7 >= MULT && LA63_7 <= NOT_EQUAL2)||LA63_7==PLUS||LA63_7==REM||(LA63_7 >= STRING1 && LA63_7 <= STRING2)||LA63_7==UCWORD||LA63_7==USWORD||LA63_7==72||(LA63_7 >= 74 && LA63_7 <= 75)) ) {
                            alt63=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 63, 7, input);

                            throw nvae;

                        }
                        }
                        break;
                    case UCWORD:
                        {
                        alt63=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 63, 5, input);

                        throw nvae;

                    }

                }
                else if ( (LA63_1==EOF||(LA63_1 >= BAR && LA63_1 <= BRA)||(LA63_1 >= CLOSE && LA63_1 <= COMMA)||LA63_1==DIV||LA63_1==DOLLARWORD||LA63_1==EQUAL||(LA63_1 >= GE && LA63_1 <= GT)||(LA63_1 >= INT_LITERAL && LA63_1 <= KET)||(LA63_1 >= LCWORD && LA63_1 <= LE)||(LA63_1 >= LONG_LITERAL && LA63_1 <= LT)||LA63_1==MINUS||(LA63_1 >= MULT && LA63_1 <= NOT_EQUAL2)||LA63_1==PLUS||LA63_1==REM||(LA63_1 >= STRING1 && LA63_1 <= STRING2)||LA63_1==UCWORD||LA63_1==USWORD||LA63_1==72||(LA63_1 >= 74 && LA63_1 <= 75)) ) {
                    alt63=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 63, 1, input);

                    throw nvae;

                }
                }
                break;
            case USWORD:
                {
                alt63=2;
                }
                break;
            case LCWORD:
                {
                alt63=3;
                }
                break;
            case DOLLARWORD:
                {
                alt63=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;

            }

            switch (alt63) {
                case 1 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:233:11: UCWORD
                    {
                    root_0 = (ProvaAST)adaptor.nil();


                    UCWORD166=(Token)match(input,UCWORD,FOLLOW_UCWORD_in_variable1549); 
                    UCWORD166_tree = 
                    (ProvaAST)adaptor.create(UCWORD166)
                    ;
                    adaptor.addChild(root_0, UCWORD166_tree);


                    }
                    break;
                case 2 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:233:20: USWORD
                    {
                    root_0 = (ProvaAST)adaptor.nil();


                    USWORD167=(Token)match(input,USWORD,FOLLOW_USWORD_in_variable1553); 
                    USWORD167_tree = 
                    (ProvaAST)adaptor.create(USWORD167)
                    ;
                    adaptor.addChild(root_0, USWORD167_tree);


                    }
                    break;
                case 3 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:233:29: typed_variable
                    {
                    root_0 = (ProvaAST)adaptor.nil();


                    pushFollow(FOLLOW_typed_variable_in_variable1557);
                    typed_variable168=typed_variable();

                    state._fsp--;

                    adaptor.addChild(root_0, typed_variable168.getTree());

                    }
                    break;
                case 4 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:233:46: DOLLARWORD
                    {
                    root_0 = (ProvaAST)adaptor.nil();


                    DOLLARWORD169=(Token)match(input,DOLLARWORD,FOLLOW_DOLLARWORD_in_variable1561); 
                    DOLLARWORD169_tree = 
                    (ProvaAST)adaptor.create(DOLLARWORD169)
                    ;
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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "variable"


    public static class variable_or_number_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "variable_or_number"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:235:1: variable_or_number : ( variable | number );
    public final Prova2Parser.variable_or_number_return variable_or_number() throws RecognitionException {
        Prova2Parser.variable_or_number_return retval = new Prova2Parser.variable_or_number_return();
        retval.start = input.LT(1);


        ProvaAST root_0 = null;

        Prova2Parser.variable_return variable170 =null;

        Prova2Parser.number_return number171 =null;



        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:236:2: ( variable | number )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==DOLLARWORD||LA64_0==LCWORD||LA64_0==UCWORD||LA64_0==USWORD) ) {
                alt64=1;
            }
            else if ( (LA64_0==INT_LITERAL||LA64_0==LONG_LITERAL||LA64_0==MINUS) ) {
                alt64=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;

            }
            switch (alt64) {
                case 1 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:236:4: variable
                    {
                    root_0 = (ProvaAST)adaptor.nil();


                    pushFollow(FOLLOW_variable_in_variable_or_number1571);
                    variable170=variable();

                    state._fsp--;

                    adaptor.addChild(root_0, variable170.getTree());

                    }
                    break;
                case 2 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:236:15: number
                    {
                    root_0 = (ProvaAST)adaptor.nil();


                    pushFollow(FOLLOW_number_in_variable_or_number1575);
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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "variable_or_number"


    public static class word_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "word"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:238:1: word : ( LCWORD | UCWORD );
    public final Prova2Parser.word_return word() throws RecognitionException {
        Prova2Parser.word_return retval = new Prova2Parser.word_return();
        retval.start = input.LT(1);


        ProvaAST root_0 = null;

        Token set172=null;

        ProvaAST set172_tree=null;

        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:238:6: ( LCWORD | UCWORD )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:
            {
            root_0 = (ProvaAST)adaptor.nil();


            set172=(Token)input.LT(1);

            if ( input.LA(1)==LCWORD||input.LA(1)==UCWORD ) {
                input.consume();
                adaptor.addChild(root_0, 
                (ProvaAST)adaptor.create(set172)
                );
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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "word"


    public static class typed_variable_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "typed_variable"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:243:1: typed_variable : ( qualified_java_class DOT word -> ^( TYPED_VARIABLE qualified_java_class word ) | UCWORD DOT word -> ^( TYPED_VARIABLE UCWORD word ) );
    public final Prova2Parser.typed_variable_return typed_variable() throws RecognitionException {
        Prova2Parser.typed_variable_return retval = new Prova2Parser.typed_variable_return();
        retval.start = input.LT(1);


        ProvaAST root_0 = null;

        Token DOT174=null;
        Token UCWORD176=null;
        Token DOT177=null;
        Prova2Parser.qualified_java_class_return qualified_java_class173 =null;

        Prova2Parser.word_return word175 =null;

        Prova2Parser.word_return word178 =null;


        ProvaAST DOT174_tree=null;
        ProvaAST UCWORD176_tree=null;
        ProvaAST DOT177_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_UCWORD=new RewriteRuleTokenStream(adaptor,"token UCWORD");
        RewriteRuleSubtreeStream stream_qualified_java_class=new RewriteRuleSubtreeStream(adaptor,"rule qualified_java_class");
        RewriteRuleSubtreeStream stream_word=new RewriteRuleSubtreeStream(adaptor,"rule word");
        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:244:2: ( qualified_java_class DOT word -> ^( TYPED_VARIABLE qualified_java_class word ) | UCWORD DOT word -> ^( TYPED_VARIABLE UCWORD word ) )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==LCWORD) ) {
                alt65=1;
            }
            else if ( (LA65_0==UCWORD) ) {
                alt65=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;

            }
            switch (alt65) {
                case 1 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:245:3: qualified_java_class DOT word
                    {
                    pushFollow(FOLLOW_qualified_java_class_in_typed_variable1602);
                    qualified_java_class173=qualified_java_class();

                    state._fsp--;

                    stream_qualified_java_class.add(qualified_java_class173.getTree());

                    DOT174=(Token)match(input,DOT,FOLLOW_DOT_in_typed_variable1604);  
                    stream_DOT.add(DOT174);


                    pushFollow(FOLLOW_word_in_typed_variable1606);
                    word175=word();

                    state._fsp--;

                    stream_word.add(word175.getTree());

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
                    // 245:33: -> ^( TYPED_VARIABLE qualified_java_class word )
                    {
                        // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:245:36: ^( TYPED_VARIABLE qualified_java_class word )
                        {
                        ProvaAST root_1 = (ProvaAST)adaptor.nil();
                        root_1 = (ProvaAST)adaptor.becomeRoot(
                        (ProvaAST)adaptor.create(TYPED_VARIABLE, "TYPED_VARIABLE")
                        , root_1);

                        adaptor.addChild(root_1, stream_qualified_java_class.nextTree());

                        adaptor.addChild(root_1, stream_word.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:246:5: UCWORD DOT word
                    {
                    UCWORD176=(Token)match(input,UCWORD,FOLLOW_UCWORD_in_typed_variable1622);  
                    stream_UCWORD.add(UCWORD176);


                    DOT177=(Token)match(input,DOT,FOLLOW_DOT_in_typed_variable1624);  
                    stream_DOT.add(DOT177);


                    pushFollow(FOLLOW_word_in_typed_variable1626);
                    word178=word();

                    state._fsp--;

                    stream_word.add(word178.getTree());

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
                    // 246:21: -> ^( TYPED_VARIABLE UCWORD word )
                    {
                        // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:246:24: ^( TYPED_VARIABLE UCWORD word )
                        {
                        ProvaAST root_1 = (ProvaAST)adaptor.nil();
                        root_1 = (ProvaAST)adaptor.becomeRoot(
                        (ProvaAST)adaptor.create(TYPED_VARIABLE, "TYPED_VARIABLE")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_UCWORD.nextNode()
                        );

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "typed_variable"


    public static class instance_call_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "instance_call"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:251:1: instance_call : variable DOT LCWORD -> variable LCWORD ;
    public final Prova2Parser.instance_call_return instance_call() throws RecognitionException {
        Prova2Parser.instance_call_return retval = new Prova2Parser.instance_call_return();
        retval.start = input.LT(1);


        ProvaAST root_0 = null;

        Token DOT180=null;
        Token LCWORD181=null;
        Prova2Parser.variable_return variable179 =null;


        ProvaAST DOT180_tree=null;
        ProvaAST LCWORD181_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_LCWORD=new RewriteRuleTokenStream(adaptor,"token LCWORD");
        RewriteRuleSubtreeStream stream_variable=new RewriteRuleSubtreeStream(adaptor,"rule variable");
        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:252:2: ( variable DOT LCWORD -> variable LCWORD )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:252:4: variable DOT LCWORD
            {
            pushFollow(FOLLOW_variable_in_instance_call1648);
            variable179=variable();

            state._fsp--;

            stream_variable.add(variable179.getTree());

            DOT180=(Token)match(input,DOT,FOLLOW_DOT_in_instance_call1650);  
            stream_DOT.add(DOT180);


            LCWORD181=(Token)match(input,LCWORD,FOLLOW_LCWORD_in_instance_call1652);  
            stream_LCWORD.add(LCWORD181);


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
            // 252:24: -> variable LCWORD
            {
                adaptor.addChild(root_0, stream_variable.nextTree());

                adaptor.addChild(root_0, 
                stream_LCWORD.nextNode()
                );

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "instance_call"


    public static class static_call_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "static_call"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:255:1: static_call : ( qualified_java_class DOT LCWORD ) -> qualified_java_class LCWORD ;
    public final Prova2Parser.static_call_return static_call() throws RecognitionException {
        Prova2Parser.static_call_return retval = new Prova2Parser.static_call_return();
        retval.start = input.LT(1);


        ProvaAST root_0 = null;

        Token DOT183=null;
        Token LCWORD184=null;
        Prova2Parser.qualified_java_class_return qualified_java_class182 =null;


        ProvaAST DOT183_tree=null;
        ProvaAST LCWORD184_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_LCWORD=new RewriteRuleTokenStream(adaptor,"token LCWORD");
        RewriteRuleSubtreeStream stream_qualified_java_class=new RewriteRuleSubtreeStream(adaptor,"rule qualified_java_class");
        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:256:2: ( ( qualified_java_class DOT LCWORD ) -> qualified_java_class LCWORD )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:256:4: ( qualified_java_class DOT LCWORD )
            {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:256:4: ( qualified_java_class DOT LCWORD )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:256:5: qualified_java_class DOT LCWORD
            {
            pushFollow(FOLLOW_qualified_java_class_in_static_call1670);
            qualified_java_class182=qualified_java_class();

            state._fsp--;

            stream_qualified_java_class.add(qualified_java_class182.getTree());

            DOT183=(Token)match(input,DOT,FOLLOW_DOT_in_static_call1672);  
            stream_DOT.add(DOT183);


            LCWORD184=(Token)match(input,LCWORD,FOLLOW_LCWORD_in_static_call1674);  
            stream_LCWORD.add(LCWORD184);


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
            // 256:38: -> qualified_java_class LCWORD
            {
                adaptor.addChild(root_0, stream_qualified_java_class.nextTree());

                adaptor.addChild(root_0, 
                stream_LCWORD.nextNode()
                );

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "static_call"


    public static class pos_number_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "pos_number"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:259:1: pos_number : ( INT_LITERAL | LONG_LITERAL | float_literal );
    public final Prova2Parser.pos_number_return pos_number() throws RecognitionException {
        Prova2Parser.pos_number_return retval = new Prova2Parser.pos_number_return();
        retval.start = input.LT(1);


        ProvaAST root_0 = null;

        Token INT_LITERAL185=null;
        Token LONG_LITERAL186=null;
        Prova2Parser.float_literal_return float_literal187 =null;


        ProvaAST INT_LITERAL185_tree=null;
        ProvaAST LONG_LITERAL186_tree=null;

        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:259:12: ( INT_LITERAL | LONG_LITERAL | float_literal )
            int alt66=3;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==INT_LITERAL) ) {
                int LA66_1 = input.LA(2);

                if ( (LA66_1==DOT) ) {
                    int LA66_3 = input.LA(3);

                    if ( (LA66_3==INT_LITERAL) ) {
                        alt66=3;
                    }
                    else if ( (LA66_3==EOF||LA66_3==NEWLINE) ) {
                        alt66=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 66, 3, input);

                        throw nvae;

                    }
                }
                else if ( (LA66_1==EOF||(LA66_1 >= BAR && LA66_1 <= BRA)||(LA66_1 >= CLOSE && LA66_1 <= COMMA)||LA66_1==DIV||LA66_1==DOLLARWORD||LA66_1==EQUAL||(LA66_1 >= GE && LA66_1 <= GT)||(LA66_1 >= INT_LITERAL && LA66_1 <= KET)||(LA66_1 >= LCWORD && LA66_1 <= LE)||(LA66_1 >= LONG_LITERAL && LA66_1 <= LT)||LA66_1==MINUS||(LA66_1 >= MULT && LA66_1 <= NOT_EQUAL2)||LA66_1==PLUS||LA66_1==REM||(LA66_1 >= STRING1 && LA66_1 <= STRING2)||LA66_1==UCWORD||LA66_1==USWORD||LA66_1==72||(LA66_1 >= 74 && LA66_1 <= 75)) ) {
                    alt66=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 66, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA66_0==LONG_LITERAL) ) {
                alt66=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;

            }
            switch (alt66) {
                case 1 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:259:14: INT_LITERAL
                    {
                    root_0 = (ProvaAST)adaptor.nil();


                    INT_LITERAL185=(Token)match(input,INT_LITERAL,FOLLOW_INT_LITERAL_in_pos_number1690); 
                    INT_LITERAL185_tree = 
                    (ProvaAST)adaptor.create(INT_LITERAL185)
                    ;
                    adaptor.addChild(root_0, INT_LITERAL185_tree);


                    }
                    break;
                case 2 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:259:28: LONG_LITERAL
                    {
                    root_0 = (ProvaAST)adaptor.nil();


                    LONG_LITERAL186=(Token)match(input,LONG_LITERAL,FOLLOW_LONG_LITERAL_in_pos_number1694); 
                    LONG_LITERAL186_tree = 
                    (ProvaAST)adaptor.create(LONG_LITERAL186)
                    ;
                    adaptor.addChild(root_0, LONG_LITERAL186_tree);


                    }
                    break;
                case 3 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:259:43: float_literal
                    {
                    root_0 = (ProvaAST)adaptor.nil();


                    pushFollow(FOLLOW_float_literal_in_pos_number1698);
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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "pos_number"


    public static class number_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "number"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:261:1: number : ( '-' )? pos_number ;
    public final Prova2Parser.number_return number() throws RecognitionException {
        Prova2Parser.number_return retval = new Prova2Parser.number_return();
        retval.start = input.LT(1);


        ProvaAST root_0 = null;

        Token char_literal188=null;
        Prova2Parser.pos_number_return pos_number189 =null;


        ProvaAST char_literal188_tree=null;

        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:262:2: ( ( '-' )? pos_number )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:262:4: ( '-' )? pos_number
            {
            root_0 = (ProvaAST)adaptor.nil();


            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:262:4: ( '-' )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==MINUS) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:262:5: '-'
                    {
                    char_literal188=(Token)match(input,MINUS,FOLLOW_MINUS_in_number1709); 
                    char_literal188_tree = 
                    (ProvaAST)adaptor.create(char_literal188)
                    ;
                    adaptor.addChild(root_0, char_literal188_tree);


                    }
                    break;

            }


            pushFollow(FOLLOW_pos_number_in_number1713);
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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "number"


    public static class mstring_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "mstring"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:264:1: mstring : ( LCWORD | string );
    public final Prova2Parser.mstring_return mstring() throws RecognitionException {
        Prova2Parser.mstring_return retval = new Prova2Parser.mstring_return();
        retval.start = input.LT(1);


        ProvaAST root_0 = null;

        Token LCWORD190=null;
        Prova2Parser.string_return string191 =null;


        ProvaAST LCWORD190_tree=null;

        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:264:10: ( LCWORD | string )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==LCWORD) ) {
                alt68=1;
            }
            else if ( ((LA68_0 >= STRING1 && LA68_0 <= STRING2)) ) {
                alt68=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;

            }
            switch (alt68) {
                case 1 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:265:2: LCWORD
                    {
                    root_0 = (ProvaAST)adaptor.nil();


                    LCWORD190=(Token)match(input,LCWORD,FOLLOW_LCWORD_in_mstring1723); 
                    LCWORD190_tree = 
                    (ProvaAST)adaptor.create(LCWORD190)
                    ;
                    adaptor.addChild(root_0, LCWORD190_tree);


                    }
                    break;
                case 2 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:265:11: string
                    {
                    root_0 = (ProvaAST)adaptor.nil();


                    pushFollow(FOLLOW_string_in_mstring1727);
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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "mstring"


    public static class constant_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "constant"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:267:1: constant : ( LCWORD | string | qualified_java_class );
    public final Prova2Parser.constant_return constant() throws RecognitionException {
        Prova2Parser.constant_return retval = new Prova2Parser.constant_return();
        retval.start = input.LT(1);


        ProvaAST root_0 = null;

        Token LCWORD192=null;
        Prova2Parser.string_return string193 =null;

        Prova2Parser.qualified_java_class_return qualified_java_class194 =null;


        ProvaAST LCWORD192_tree=null;

        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:267:10: ( LCWORD | string | qualified_java_class )
            int alt69=3;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==LCWORD) ) {
                int LA69_1 = input.LA(2);

                if ( (LA69_1==DOT) ) {
                    int LA69_3 = input.LA(3);

                    if ( (LA69_3==EOF||LA69_3==NEWLINE) ) {
                        alt69=1;
                    }
                    else if ( (LA69_3==LCWORD||LA69_3==UCWORD) ) {
                        alt69=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 69, 3, input);

                        throw nvae;

                    }
                }
                else if ( (LA69_1==EOF||(LA69_1 >= BAR && LA69_1 <= BRA)||(LA69_1 >= CLOSE && LA69_1 <= COMMA)||LA69_1==DOLLARWORD||LA69_1==EQUAL||(LA69_1 >= GE && LA69_1 <= GT)||(LA69_1 >= INT_LITERAL && LA69_1 <= KET)||(LA69_1 >= LCWORD && LA69_1 <= LE)||(LA69_1 >= LONG_LITERAL && LA69_1 <= LT)||LA69_1==MINUS||(LA69_1 >= NEWLINE && LA69_1 <= OPEN)||(LA69_1 >= STRING1 && LA69_1 <= STRING2)||LA69_1==UCWORD||LA69_1==USWORD||LA69_1==72||(LA69_1 >= 74 && LA69_1 <= 75)) ) {
                    alt69=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 1, input);

                    throw nvae;

                }
            }
            else if ( ((LA69_0 >= STRING1 && LA69_0 <= STRING2)) ) {
                alt69=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;

            }
            switch (alt69) {
                case 1 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:268:2: LCWORD
                    {
                    root_0 = (ProvaAST)adaptor.nil();


                    LCWORD192=(Token)match(input,LCWORD,FOLLOW_LCWORD_in_constant1737); 
                    LCWORD192_tree = 
                    (ProvaAST)adaptor.create(LCWORD192)
                    ;
                    adaptor.addChild(root_0, LCWORD192_tree);


                    }
                    break;
                case 2 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:268:11: string
                    {
                    root_0 = (ProvaAST)adaptor.nil();


                    pushFollow(FOLLOW_string_in_constant1741);
                    string193=string();

                    state._fsp--;

                    adaptor.addChild(root_0, string193.getTree());

                    }
                    break;
                case 3 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:268:20: qualified_java_class
                    {
                    root_0 = (ProvaAST)adaptor.nil();


                    pushFollow(FOLLOW_qualified_java_class_in_constant1745);
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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "constant"


    public static class string_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "string"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:270:1: string : ( STRING1 | STRING2 );
    public final Prova2Parser.string_return string() throws RecognitionException {
        Prova2Parser.string_return retval = new Prova2Parser.string_return();
        retval.start = input.LT(1);


        ProvaAST root_0 = null;

        Token set195=null;

        ProvaAST set195_tree=null;

        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:270:8: ( STRING1 | STRING2 )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:
            {
            root_0 = (ProvaAST)adaptor.nil();


            set195=(Token)input.LT(1);

            if ( (input.LA(1) >= STRING1 && input.LA(1) <= STRING2) ) {
                input.consume();
                adaptor.addChild(root_0, 
                (ProvaAST)adaptor.create(set195)
                );
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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "string"


    public static class not_equal_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "not_equal"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:272:1: not_equal : ( NOT_EQUAL1 | NOT_EQUAL2 );
    public final Prova2Parser.not_equal_return not_equal() throws RecognitionException {
        Prova2Parser.not_equal_return retval = new Prova2Parser.not_equal_return();
        retval.start = input.LT(1);


        ProvaAST root_0 = null;

        Token set196=null;

        ProvaAST set196_tree=null;

        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:273:2: ( NOT_EQUAL1 | NOT_EQUAL2 )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:
            {
            root_0 = (ProvaAST)adaptor.nil();


            set196=(Token)input.LT(1);

            if ( (input.LA(1) >= NOT_EQUAL1 && input.LA(1) <= NOT_EQUAL2) ) {
                input.consume();
                adaptor.addChild(root_0, 
                (ProvaAST)adaptor.create(set196)
                );
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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "not_equal"


    public static class float_literal_return extends ParserRuleReturnScope {
        ProvaAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "float_literal"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:276:1: float_literal : INT_LITERAL DOT INT_LITERAL ( EXPONENT )? ;
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
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:276:16: ( INT_LITERAL DOT INT_LITERAL ( EXPONENT )? )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:276:18: INT_LITERAL DOT INT_LITERAL ( EXPONENT )?
            {
            root_0 = (ProvaAST)adaptor.nil();


            INT_LITERAL197=(Token)match(input,INT_LITERAL,FOLLOW_INT_LITERAL_in_float_literal1781); 
            INT_LITERAL197_tree = 
            (ProvaAST)adaptor.create(INT_LITERAL197)
            ;
            adaptor.addChild(root_0, INT_LITERAL197_tree);


            DOT198=(Token)match(input,DOT,FOLLOW_DOT_in_float_literal1783); 
            DOT198_tree = 
            (ProvaAST)adaptor.create(DOT198)
            ;
            adaptor.addChild(root_0, DOT198_tree);


            INT_LITERAL199=(Token)match(input,INT_LITERAL,FOLLOW_INT_LITERAL_in_float_literal1785); 
            INT_LITERAL199_tree = 
            (ProvaAST)adaptor.create(INT_LITERAL199)
            ;
            adaptor.addChild(root_0, INT_LITERAL199_tree);


            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:276:46: ( EXPONENT )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==EXPONENT) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\Prova2.g:276:46: EXPONENT
                    {
                    EXPONENT200=(Token)match(input,EXPONENT,FOLLOW_EXPONENT_in_float_literal1787); 
                    EXPONENT200_tree = 
                    (ProvaAST)adaptor.create(EXPONENT200)
                    ;
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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "float_literal"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA5 dfa5 = new DFA5(this);
    protected DFA30 dfa30 = new DFA30(this);
    protected DFA33 dfa33 = new DFA33(this);
    protected DFA37 dfa37 = new DFA37(this);
    protected DFA39 dfa39 = new DFA39(this);
    protected DFA47 dfa47 = new DFA47(this);
    protected DFA49 dfa49 = new DFA49(this);
    protected DFA51 dfa51 = new DFA51(this);
    protected DFA53 dfa53 = new DFA53(this);
    protected DFA52 dfa52 = new DFA52(this);
    protected DFA57 dfa57 = new DFA57(this);
    protected DFA60 dfa60 = new DFA60(this);
    static final String DFA1_eotS =
        "\4\uffff";
    static final String DFA1_eofS =
        "\2\2\2\uffff";
    static final String DFA1_minS =
        "\2\35\2\uffff";
    static final String DFA1_maxS =
        "\2\111\2\uffff";
    static final String DFA1_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA1_specialS =
        "\4\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\3\5\uffff\1\3\11\uffff\1\1\17\uffff\2\3\3\uffff\1\3\6\uffff"+
            "\1\3",
            "\1\3\5\uffff\1\3\11\uffff\1\1\17\uffff\2\3\3\uffff\1\3\6\uffff"+
            "\1\3",
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
        "\1\35\1\43\1\11\2\uffff\1\43\1\uffff\1\37\1\43\3\15\1\37\2\15\1"+
        "\37\1\43\1\37\3\15\1\37\3\15\1\37\3\15";
    static final String DFA5_maxS =
        "\1\111\1\43\1\112\2\uffff\1\111\1\uffff\1\102\1\111\3\16\1\47\1"+
        "\24\1\16\1\102\1\111\1\37\3\16\1\47\1\24\1\16\1\26\1\37\1\16\1\26"+
        "\1\16";
    static final String DFA5_acceptS =
        "\3\uffff\1\1\1\2\1\uffff\1\3\26\uffff";
    static final String DFA5_specialS =
        "\35\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\4\5\uffff\1\2\31\uffff\2\3\3\uffff\1\3\6\uffff\1\1",
            "\1\5",
            "\1\6\11\uffff\1\6\13\uffff\1\6\3\uffff\1\6\3\uffff\1\6\2\uffff"+
            "\1\6\5\uffff\1\3\14\uffff\2\6\3\uffff\1\6\1\uffff\1\6\5\uffff"+
            "\1\6",
            "",
            "",
            "\1\2\11\uffff\1\10\2\uffff\1\7\14\uffff\2\3\3\uffff\1\3\6\uffff"+
            "\1\1",
            "",
            "\1\15\3\uffff\1\11\3\uffff\1\16\2\uffff\1\14\22\uffff\2\13"+
            "\3\uffff\1\12",
            "\1\2\11\uffff\1\10\17\uffff\2\3\3\uffff\1\3\6\uffff\1\1",
            "\1\20\1\17",
            "\1\20\1\17",
            "\1\20\1\17",
            "\1\15\7\uffff\1\16",
            "\1\20\1\17\5\uffff\1\21",
            "\1\20\1\17",
            "\1\26\3\uffff\1\22\3\uffff\1\27\2\uffff\1\25\22\uffff\2\24"+
            "\3\uffff\1\23",
            "\1\2\11\uffff\1\10\17\uffff\2\3\3\uffff\1\3\6\uffff\1\1",
            "\1\30",
            "\1\20\1\17",
            "\1\20\1\17",
            "\1\20\1\17",
            "\1\26\7\uffff\1\27",
            "\1\20\1\17\5\uffff\1\31",
            "\1\20\1\17",
            "\1\20\1\17\7\uffff\1\32",
            "\1\33",
            "\1\20\1\17",
            "\1\20\1\17\7\uffff\1\34",
            "\1\20\1\17"
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
    static final String DFA30_eotS =
        "\41\uffff";
    static final String DFA30_eofS =
        "\41\uffff";
    static final String DFA30_minS =
        "\2\11\1\43\3\11\2\uffff\1\11\2\uffff\1\37\1\11\3\15\1\37\2\15\1"+
        "\37\1\11\1\37\3\15\1\37\3\15\1\37\3\15";
    static final String DFA30_maxS =
        "\2\111\1\43\3\112\2\uffff\1\111\2\uffff\1\102\1\111\3\16\1\47\1"+
        "\24\1\16\1\102\1\111\1\37\3\16\1\47\1\24\1\16\1\26\1\37\1\16\1\26"+
        "\1\16";
    static final String DFA30_acceptS =
        "\6\uffff\1\2\1\4\1\uffff\1\1\1\3\26\uffff";
    static final String DFA30_specialS =
        "\41\uffff}>";
    static final String[] DFA30_transitionS = {
            "\1\6\5\uffff\1\7\3\uffff\1\6\13\uffff\1\6\3\uffff\1\3\3\uffff"+
            "\1\6\2\uffff\1\6\2\uffff\1\1\17\uffff\2\5\3\uffff\1\4\1\uffff"+
            "\1\6\4\uffff\1\2",
            "\1\6\5\uffff\1\7\3\uffff\1\6\13\uffff\1\6\3\uffff\1\3\3\uffff"+
            "\1\6\2\uffff\1\6\2\uffff\1\1\17\uffff\2\5\3\uffff\1\4\1\uffff"+
            "\1\6\4\uffff\1\2",
            "\1\10",
            "\1\12\11\uffff\1\12\2\6\4\uffff\2\6\3\uffff\1\12\3\uffff\1"+
            "\12\1\6\2\uffff\1\12\1\6\1\uffff\1\12\3\uffff\2\6\1\11\14\uffff"+
            "\2\12\3\uffff\1\12\1\uffff\1\12\5\uffff\1\12",
            "\1\12\11\uffff\1\12\2\6\4\uffff\2\6\3\uffff\1\12\3\uffff\1"+
            "\12\1\6\2\uffff\1\12\1\6\1\uffff\1\12\3\uffff\2\6\1\11\14\uffff"+
            "\2\12\3\uffff\1\12\1\uffff\1\12\5\uffff\1\12",
            "\1\12\11\uffff\1\12\1\uffff\1\6\4\uffff\2\6\3\uffff\1\12\3"+
            "\uffff\1\12\1\6\2\uffff\1\12\1\6\1\uffff\1\12\3\uffff\2\6\1"+
            "\11\14\uffff\2\12\3\uffff\1\12\1\uffff\1\12\5\uffff\1\12",
            "",
            "",
            "\1\6\11\uffff\1\6\13\uffff\1\6\3\uffff\1\3\3\uffff\1\6\2\uffff"+
            "\1\6\2\uffff\1\14\2\uffff\1\13\14\uffff\2\5\3\uffff\1\4\1\uffff"+
            "\1\6\4\uffff\1\2",
            "",
            "",
            "\1\21\3\uffff\1\15\3\uffff\1\22\2\uffff\1\20\22\uffff\2\17"+
            "\3\uffff\1\16",
            "\1\6\11\uffff\1\6\13\uffff\1\6\3\uffff\1\3\3\uffff\1\6\2\uffff"+
            "\1\6\2\uffff\1\14\17\uffff\2\5\3\uffff\1\4\1\uffff\1\6\4\uffff"+
            "\1\2",
            "\1\24\1\23",
            "\1\24\1\23",
            "\1\24\1\23",
            "\1\21\7\uffff\1\22",
            "\1\24\1\23\5\uffff\1\25",
            "\1\24\1\23",
            "\1\32\3\uffff\1\26\3\uffff\1\33\2\uffff\1\31\22\uffff\2\30"+
            "\3\uffff\1\27",
            "\1\6\11\uffff\1\6\13\uffff\1\6\3\uffff\1\3\3\uffff\1\6\2\uffff"+
            "\1\6\2\uffff\1\14\17\uffff\2\5\3\uffff\1\4\1\uffff\1\6\4\uffff"+
            "\1\2",
            "\1\34",
            "\1\24\1\23",
            "\1\24\1\23",
            "\1\24\1\23",
            "\1\32\7\uffff\1\33",
            "\1\24\1\23\5\uffff\1\35",
            "\1\24\1\23",
            "\1\24\1\23\7\uffff\1\36",
            "\1\37",
            "\1\24\1\23",
            "\1\24\1\23\7\uffff\1\40",
            "\1\24\1\23"
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
            return "128:1: literal : ( ( NEWLINE )* (m= metadata )? r= relation (g= guard )? -> ^( RELATION ( metadata )? relation ( guard )? ) | ( NEWLINE )* (m= metadata )? semantic_attachment (g= guard )? -> ^( SEMANTIC_ATTACHMENT ( metadata )? semantic_attachment ( guard )? ) | ( NEWLINE )* ( metadata )? function_call -> ^( FUNCTION ( metadata )? function_call ) | ( NEWLINE )* cut -> ^( CUT cut ) );";
        }
    }
    static final String DFA33_eotS =
        "\4\uffff";
    static final String DFA33_eofS =
        "\4\uffff";
    static final String DFA33_minS =
        "\2\11\2\uffff";
    static final String DFA33_maxS =
        "\2\112\2\uffff";
    static final String DFA33_acceptS =
        "\2\uffff\1\1\1\2";
    static final String DFA33_specialS =
        "\4\uffff}>";
    static final String[] DFA33_transitionS = {
            "\1\2\3\uffff\1\3\5\uffff\1\2\13\uffff\1\2\1\3\2\uffff\1\2\3"+
            "\uffff\1\2\2\uffff\1\2\2\uffff\1\1\17\uffff\2\2\3\uffff\1\2"+
            "\1\uffff\1\2\5\uffff\1\2",
            "\1\2\3\uffff\1\3\5\uffff\1\2\13\uffff\1\2\1\3\2\uffff\1\2\3"+
            "\uffff\1\2\2\uffff\1\2\2\uffff\1\1\17\uffff\2\2\3\uffff\1\2"+
            "\1\uffff\1\2\5\uffff\1\2",
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
            return "147:5: ( terms ( '|' list_tail )? )?";
        }
    }
    static final String DFA37_eotS =
        "\13\uffff";
    static final String DFA37_eofS =
        "\6\uffff\1\2\2\uffff\1\2\1\uffff";
    static final String DFA37_minS =
        "\1\11\1\10\4\uffff\1\43\1\10\1\24\2\43";
    static final String DFA37_maxS =
        "\1\104\1\113\4\uffff\1\102\1\113\1\24\2\102";
    static final String DFA37_acceptS =
        "\2\uffff\1\1\1\2\1\3\1\4\5\uffff";
    static final String DFA37_specialS =
        "\13\uffff}>";
    static final String[] DFA37_transitionS = {
            "\1\5\11\uffff\1\3\13\uffff\1\4\3\uffff\1\1\3\uffff\1\4\2\uffff"+
            "\1\4\22\uffff\2\2\3\uffff\1\3\1\uffff\1\3",
            "\2\2\3\uffff\2\2\4\uffff\1\2\1\6\1\2\4\uffff\2\2\3\uffff\2"+
            "\2\2\uffff\2\2\2\uffff\2\2\1\uffff\1\2\2\uffff\3\2\15\uffff"+
            "\2\2\3\uffff\1\2\1\uffff\1\2\3\uffff\1\2\1\uffff\2\2",
            "",
            "",
            "",
            "",
            "\1\10\11\uffff\1\2\24\uffff\1\7",
            "\2\2\3\uffff\2\2\4\uffff\1\2\1\11\1\2\4\uffff\2\2\3\uffff\2"+
            "\2\2\uffff\2\2\2\uffff\2\2\1\uffff\1\2\2\uffff\3\2\15\uffff"+
            "\2\2\3\uffff\1\2\1\uffff\1\2\3\uffff\1\2\1\uffff\2\2",
            "\1\12",
            "\1\3\11\uffff\1\2\24\uffff\1\3",
            "\1\10\36\uffff\1\7"
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
            return "155:1: left_term : ( constant | variable | number | prova_list );";
        }
    }
    static final String DFA39_eotS =
        "\7\uffff";
    static final String DFA39_eofS =
        "\1\uffff\1\2\3\uffff\1\2\1\uffff";
    static final String DFA39_minS =
        "\1\23\1\24\2\uffff\1\43\2\24";
    static final String DFA39_maxS =
        "\1\104\1\24\2\uffff\1\102\2\24";
    static final String DFA39_acceptS =
        "\2\uffff\1\1\1\2\3\uffff";
    static final String DFA39_specialS =
        "\7\uffff}>";
    static final String[] DFA39_transitionS = {
            "\1\3\17\uffff\1\1\31\uffff\2\2\3\uffff\1\3\1\uffff\1\3",
            "\1\4",
            "",
            "",
            "\1\6\36\uffff\1\5",
            "\1\3",
            "\1\4"
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
            return "162:12: ( constant | variable )";
        }
    }
    static final String DFA47_eotS =
        "\4\uffff";
    static final String DFA47_eofS =
        "\4\uffff";
    static final String DFA47_minS =
        "\1\10\1\uffff\1\15\1\uffff";
    static final String DFA47_maxS =
        "\1\55\1\uffff\1\55\1\uffff";
    static final String DFA47_acceptS =
        "\1\uffff\1\2\1\uffff\1\1";
    static final String DFA47_specialS =
        "\4\uffff}>";
    static final String[] DFA47_transitionS = {
            "\1\1\4\uffff\1\1\1\3\21\uffff\1\1\14\uffff\1\2",
            "",
            "\1\1\1\3\21\uffff\1\1\14\uffff\1\2",
            ""
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
            return "()* loopback of 172:24: ( ( NEWLINE )* ',' ( NEWLINE )* term )*";
        }
    }
    static final String DFA49_eotS =
        "\17\uffff";
    static final String DFA49_eofS =
        "\6\uffff\1\4\1\uffff\1\4\3\uffff\1\4\2\uffff";
    static final String DFA49_minS =
        "\1\11\3\10\2\uffff\1\43\1\uffff\1\43\1\10\1\24\1\10\2\43\1\10";
    static final String DFA49_maxS =
        "\1\112\3\113\2\uffff\1\102\1\uffff\1\102\1\113\1\24\1\113\2\102"+
        "\1\113";
    static final String DFA49_acceptS =
        "\4\uffff\1\1\1\3\1\uffff\1\2\7\uffff";
    static final String DFA49_specialS =
        "\17\uffff}>";
    static final String[] DFA49_transitionS = {
            "\1\4\11\uffff\1\4\13\uffff\1\4\3\uffff\1\1\3\uffff\1\4\2\uffff"+
            "\1\4\22\uffff\2\2\3\uffff\1\3\1\uffff\1\4\5\uffff\1\5",
            "\2\4\3\uffff\2\4\4\uffff\1\4\1\6\1\4\11\uffff\2\4\2\uffff\1"+
            "\4\3\uffff\1\4\2\uffff\1\4\2\uffff\1\4\2\uffff\1\7\14\uffff"+
            "\2\4\3\uffff\1\4\1\uffff\1\4\3\uffff\1\4\1\uffff\2\4",
            "\2\4\3\uffff\2\4\4\uffff\3\4\11\uffff\2\4\2\uffff\1\4\3\uffff"+
            "\1\4\2\uffff\1\4\2\uffff\1\4\2\uffff\1\7\14\uffff\2\4\3\uffff"+
            "\1\4\1\uffff\1\4\3\uffff\1\4\1\uffff\2\4",
            "\2\4\3\uffff\2\4\4\uffff\1\4\1\10\1\4\11\uffff\2\4\2\uffff"+
            "\1\4\3\uffff\1\4\2\uffff\1\4\2\uffff\1\4\2\uffff\1\7\14\uffff"+
            "\2\4\3\uffff\1\4\1\uffff\1\4\3\uffff\1\4\1\uffff\2\4",
            "",
            "",
            "\1\12\11\uffff\1\4\24\uffff\1\11",
            "",
            "\1\13\11\uffff\1\4\24\uffff\1\13",
            "\2\4\3\uffff\2\4\4\uffff\1\4\1\14\1\4\11\uffff\2\4\2\uffff"+
            "\1\4\3\uffff\1\4\2\uffff\1\4\2\uffff\1\4\17\uffff\2\4\3\uffff"+
            "\1\4\1\uffff\1\4\3\uffff\1\4\1\uffff\2\4",
            "\1\15",
            "\2\4\3\uffff\2\4\4\uffff\3\4\11\uffff\2\4\2\uffff\1\4\3\uffff"+
            "\1\4\2\uffff\1\4\2\uffff\1\4\2\uffff\1\7\14\uffff\2\4\3\uffff"+
            "\1\4\1\uffff\1\4\3\uffff\1\4\1\uffff\2\4",
            "\1\16\11\uffff\1\4\24\uffff\1\16",
            "\1\12\36\uffff\1\11",
            "\2\4\3\uffff\2\4\4\uffff\3\4\11\uffff\2\4\2\uffff\1\4\3\uffff"+
            "\1\4\2\uffff\1\4\2\uffff\1\4\2\uffff\1\7\14\uffff\2\4\3\uffff"+
            "\1\4\1\uffff\1\4\3\uffff\1\4\1\uffff\2\4"
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
            return "176:1: term : ( left_term | func_term | prova_map );";
        }
    }
    static final String DFA51_eotS =
        "\20\uffff";
    static final String DFA51_eofS =
        "\20\uffff";
    static final String DFA51_minS =
        "\1\11\4\24\1\uffff\2\43\1\uffff\4\24\1\43\2\24";
    static final String DFA51_maxS =
        "\1\104\4\57\1\uffff\2\102\1\uffff\1\57\1\24\1\60\1\57\1\102\1\60"+
        "\1\57";
    static final String DFA51_acceptS =
        "\5\uffff\1\2\2\uffff\1\1\7\uffff";
    static final String DFA51_specialS =
        "\20\uffff}>";
    static final String[] DFA51_transitionS = {
            "\1\5\11\uffff\1\4\13\uffff\1\5\3\uffff\1\1\3\uffff\1\5\2\uffff"+
            "\1\5\22\uffff\2\5\3\uffff\1\2\1\uffff\1\3",
            "\1\6\1\5\4\uffff\2\5\10\uffff\1\5\3\uffff\1\5\5\uffff\2\5",
            "\1\7\1\5\4\uffff\2\5\10\uffff\1\5\3\uffff\1\5\5\uffff\2\5",
            "\1\10\1\5\4\uffff\2\5\10\uffff\1\5\3\uffff\1\5\5\uffff\2\5",
            "\1\10\1\5\4\uffff\2\5\10\uffff\1\5\3\uffff\1\5\5\uffff\2\5",
            "",
            "\1\12\36\uffff\1\11",
            "\1\13\36\uffff\1\14",
            "",
            "\1\15\1\5\4\uffff\2\5\10\uffff\1\5\3\uffff\1\5\5\uffff\2\5",
            "\1\6",
            "\1\10\1\5\4\uffff\2\5\10\uffff\1\5\3\uffff\1\5\5\uffff\2\5"+
            "\1\10",
            "\1\10\1\5\4\uffff\2\5\10\uffff\1\5\3\uffff\1\5\5\uffff\2\5",
            "\1\16\36\uffff\1\17",
            "\1\10\1\5\4\uffff\2\5\10\uffff\1\5\3\uffff\1\5\5\uffff\2\5"+
            "\1\10",
            "\1\10\1\5\4\uffff\2\5\10\uffff\1\5\3\uffff\1\5\5\uffff\2\5"
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
            return "190:1: semantic_attachment : ( predicate_java_call | binary_operation );";
        }
    }
    static final String DFA53_eotS =
        "\13\uffff";
    static final String DFA53_eofS =
        "\6\uffff\1\5\2\uffff\1\5\1\uffff";
    static final String DFA53_minS =
        "\1\25\1\uffff\1\23\1\uffff\1\11\1\uffff\1\43\1\11\1\24\2\43";
    static final String DFA53_maxS =
        "\1\57\1\uffff\1\104\1\uffff\1\55\1\uffff\1\102\1\55\1\24\2\102";
    static final String DFA53_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\1\uffff\1\2\5\uffff";
    static final String DFA53_specialS =
        "\13\uffff}>";
    static final String[] DFA53_transitionS = {
            "\1\1\4\uffff\2\3\10\uffff\1\3\3\uffff\1\3\5\uffff\2\2",
            "",
            "\1\3\13\uffff\1\3\3\uffff\1\4\3\uffff\1\3\2\uffff\1\3\5\uffff"+
            "\1\3\14\uffff\2\5\3\uffff\1\3\1\uffff\1\3",
            "",
            "\1\5\4\uffff\1\5\5\uffff\1\6\13\uffff\1\5\14\uffff\1\5",
            "",
            "\1\10\11\uffff\1\5\24\uffff\1\7",
            "\1\5\4\uffff\1\5\5\uffff\1\11\13\uffff\1\5\14\uffff\1\5",
            "\1\12",
            "\1\3\11\uffff\1\5\24\uffff\1\3",
            "\1\10\36\uffff\1\7"
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
            return "195:3: ( EQUAL ( constructor_java_call | prova_list | constant | expr ) | not_equal constant | binary_operator expr )";
        }
    }
    static final String DFA52_eotS =
        "\14\uffff";
    static final String DFA52_eofS =
        "\6\uffff\1\4\3\uffff\1\4\1\uffff";
    static final String DFA52_minS =
        "\3\11\3\uffff\1\43\1\uffff\1\11\1\24\2\43";
    static final String DFA52_maxS =
        "\1\104\1\55\1\70\3\uffff\1\102\1\uffff\1\60\1\24\2\102";
    static final String DFA52_acceptS =
        "\3\uffff\1\2\1\3\1\4\1\uffff\1\1\4\uffff";
    static final String DFA52_specialS =
        "\14\uffff}>";
    static final String[] DFA52_transitionS = {
            "\1\3\11\uffff\1\5\13\uffff\1\5\3\uffff\1\1\3\uffff\1\5\2\uffff"+
            "\1\5\5\uffff\1\5\14\uffff\2\4\3\uffff\1\2\1\uffff\1\5",
            "\1\4\4\uffff\1\4\5\uffff\1\6\13\uffff\1\4\14\uffff\1\4",
            "\1\5\4\uffff\1\5\2\uffff\1\5\2\uffff\1\5\13\uffff\1\5\11\uffff"+
            "\1\5\1\uffff\2\5\2\uffff\1\7\1\5\6\uffff\1\5",
            "",
            "",
            "",
            "\1\11\11\uffff\1\4\24\uffff\1\10",
            "",
            "\1\4\4\uffff\1\4\5\uffff\1\12\13\uffff\1\4\14\uffff\1\4\2\uffff"+
            "\1\7",
            "\1\13",
            "\1\5\11\uffff\1\4\24\uffff\1\5",
            "\1\11\36\uffff\1\10"
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
            return "196:4: ( constructor_java_call | prova_list | constant | expr )";
        }
    }
    static final String DFA57_eotS =
        "\23\uffff";
    static final String DFA57_eofS =
        "\10\uffff\1\11\1\uffff\1\11\10\uffff";
    static final String DFA57_minS =
        "\2\23\2\11\1\24\1\11\2\uffff\1\43\1\uffff\2\43\2\11\1\uffff\1\24"+
        "\1\43\2\11";
    static final String DFA57_maxS =
        "\2\104\2\70\1\24\1\70\2\uffff\1\102\1\uffff\1\55\1\102\2\70\1\uffff"+
        "\1\24\1\102\2\70";
    static final String DFA57_acceptS =
        "\6\uffff\1\2\1\4\1\uffff\1\1\4\uffff\1\3\4\uffff";
    static final String DFA57_specialS =
        "\23\uffff}>";
    static final String[] DFA57_transitionS = {
            "\1\5\13\uffff\1\6\3\uffff\1\4\3\uffff\1\6\2\uffff\1\1\5\uffff"+
            "\1\7\21\uffff\1\2\1\uffff\1\3",
            "\1\5\13\uffff\1\6\3\uffff\1\4\3\uffff\1\6\32\uffff\1\2\1\uffff"+
            "\1\3",
            "\1\11\3\uffff\2\11\2\uffff\1\11\2\uffff\1\10\13\uffff\1\11"+
            "\11\uffff\1\11\1\uffff\2\11\3\uffff\1\11\6\uffff\1\11",
            "\1\11\3\uffff\2\11\2\uffff\1\11\2\uffff\1\12\13\uffff\1\11"+
            "\11\uffff\1\11\1\uffff\2\11\3\uffff\1\11\6\uffff\1\11",
            "\1\13",
            "\1\11\3\uffff\2\11\2\uffff\1\11\2\uffff\1\12\13\uffff\1\11"+
            "\11\uffff\1\11\1\uffff\2\11\3\uffff\1\11\6\uffff\1\11",
            "",
            "",
            "\1\14\11\uffff\1\11\24\uffff\1\15",
            "",
            "\1\16\11\uffff\1\11",
            "\1\4\36\uffff\1\17",
            "\1\11\3\uffff\2\11\2\uffff\1\11\2\uffff\1\12\13\uffff\1\11"+
            "\11\uffff\1\11\1\uffff\2\11\2\uffff\1\16\1\11\6\uffff\1\11",
            "\1\11\3\uffff\2\11\2\uffff\1\11\2\uffff\1\12\13\uffff\1\11"+
            "\11\uffff\1\11\1\uffff\2\11\3\uffff\1\11\6\uffff\1\11",
            "",
            "\1\20",
            "\1\21\36\uffff\1\22",
            "\1\11\3\uffff\2\11\2\uffff\1\11\2\uffff\1\12\13\uffff\1\11"+
            "\11\uffff\1\11\1\uffff\2\11\2\uffff\1\16\1\11\6\uffff\1\11",
            "\1\11\3\uffff\2\11\2\uffff\1\11\2\uffff\1\12\13\uffff\1\11"+
            "\11\uffff\1\11\1\uffff\2\11\3\uffff\1\11\6\uffff\1\11"
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
            return "208:9: ( ( MINUS )? variable | number | ( MINUS )? predicate_java_call | OPEN expr CLOSE )";
        }
    }
    static final String DFA60_eotS =
        "\10\uffff";
    static final String DFA60_eofS =
        "\10\uffff";
    static final String DFA60_minS =
        "\1\23\1\24\1\uffff\1\43\1\24\1\43\1\24\1\uffff";
    static final String DFA60_maxS =
        "\1\104\1\24\1\uffff\1\102\1\24\1\102\1\60\1\uffff";
    static final String DFA60_acceptS =
        "\2\uffff\1\2\4\uffff\1\1";
    static final String DFA60_specialS =
        "\10\uffff}>";
    static final String[] DFA60_transitionS = {
            "\1\2\17\uffff\1\1\36\uffff\1\2\1\uffff\1\2",
            "\1\3",
            "",
            "\1\1\36\uffff\1\4",
            "\1\5",
            "\1\6\36\uffff\1\2",
            "\1\2\33\uffff\1\7",
            ""
    };

    static final short[] DFA60_eot = DFA.unpackEncodedString(DFA60_eotS);
    static final short[] DFA60_eof = DFA.unpackEncodedString(DFA60_eofS);
    static final char[] DFA60_min = DFA.unpackEncodedStringToUnsignedChars(DFA60_minS);
    static final char[] DFA60_max = DFA.unpackEncodedStringToUnsignedChars(DFA60_maxS);
    static final short[] DFA60_accept = DFA.unpackEncodedString(DFA60_acceptS);
    static final short[] DFA60_special = DFA.unpackEncodedString(DFA60_specialS);
    static final short[][] DFA60_transition;

    static {
        int numStates = DFA60_transitionS.length;
        DFA60_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA60_transition[i] = DFA.unpackEncodedString(DFA60_transitionS[i]);
        }
    }

    class DFA60 extends DFA {

        public DFA60(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 60;
            this.eot = DFA60_eot;
            this.eof = DFA60_eof;
            this.min = DFA60_min;
            this.max = DFA60_max;
            this.accept = DFA60_accept;
            this.special = DFA60_special;
            this.transition = DFA60_transition;
        }
        public String getDescription() {
            return "214:1: predicate_java_call : ( static_java_call | instance_java_call );";
        }
    }
 

    public static final BitSet FOLLOW_statement_in_rulebase343 = new BitSet(new long[]{0x6000200820000000L,0x0000000000000204L});
    public static final BitSet FOLLOW_NEWLINE_in_rulebase346 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_EOF_in_rulebase349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_statement367 = new BitSet(new long[]{0x6000200820000000L,0x0000000000000204L});
    public static final BitSet FOLLOW_stat_in_statement370 = new BitSet(new long[]{0x0000200000100000L});
    public static final BitSet FOLLOW_end_of_statement_in_statement372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_end_of_statement389 = new BitSet(new long[]{0x0000200000100000L});
    public static final BitSet FOLLOW_DOT_in_end_of_statement392 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_set_in_end_of_statement394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_clause_in_stat411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_query_in_stat417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_stat423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_metadata_in_function433 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_LCWORD_in_function436 = new BitSet(new long[]{0x6000048880080200L,0x0000000000000414L});
    public static final BitSet FOLLOW_list_body0_in_function438 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_function440 = new BitSet(new long[]{0x6000048880080200L,0x0000000000000414L});
    public static final BitSet FOLLOW_list_body0_in_function442 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_EQUAL_in_function445 = new BitSet(new long[]{0x6000248880088200L,0x0000000000000214L});
    public static final BitSet FOLLOW_literals_in_function447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_predicate_in_function_call477 = new BitSet(new long[]{0x6000048880080200L,0x0000000000000414L});
    public static final BitSet FOLLOW_list_body0_in_function_call479 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_function_call482 = new BitSet(new long[]{0x6000048880080200L,0x0000000000000414L});
    public static final BitSet FOLLOW_list_body0_in_function_call484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_query508 = new BitSet(new long[]{0x6000200800000000L});
    public static final BitSet FOLLOW_NEWLINE_in_query510 = new BitSet(new long[]{0x6000200800000000L});
    public static final BitSet FOLLOW_query_predicate_in_query513 = new BitSet(new long[]{0x0001200000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_query515 = new BitSet(new long[]{0x0001200000000000L});
    public static final BitSet FOLLOW_OPEN_in_query518 = new BitSet(new long[]{0x6000200800000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_NEWLINE_in_query520 = new BitSet(new long[]{0x6000200800000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_relation_in_query523 = new BitSet(new long[]{0x0000200000002000L});
    public static final BitSet FOLLOW_NEWLINE_in_query525 = new BitSet(new long[]{0x0000200000002000L});
    public static final BitSet FOLLOW_CLOSE_in_query528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_query_predicate548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_metadata_in_clause557 = new BitSet(new long[]{0x6000000800000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_relation_in_clause560 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_IF_in_clause563 = new BitSet(new long[]{0x6000248880088200L,0x0000000000000214L});
    public static final BitSet FOLLOW_literals_in_clause565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_in_metadata591 = new BitSet(new long[]{0x0000200000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_NEWLINE_in_metadata593 = new BitSet(new long[]{0x0000200000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_annotation615 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_LCWORD_in_annotation617 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_OPEN_in_annotation620 = new BitSet(new long[]{0x6000048880000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_value_in_annotation622 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_COMMA_in_annotation625 = new BitSet(new long[]{0x6000048880000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_value_in_annotation627 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_CLOSE_in_annotation631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCWORD_in_value656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UCWORD_in_value660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_in_value664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_value668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_literals678 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_COMMA_in_literals681 = new BitSet(new long[]{0x6000248880088200L,0x0000000000000214L});
    public static final BitSet FOLLOW_literal_in_literals683 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_NEWLINE_in_literal703 = new BitSet(new long[]{0x6000200800000000L,0x0000000000000204L});
    public static final BitSet FOLLOW_metadata_in_literal708 = new BitSet(new long[]{0x6000000800000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_relation_in_literal713 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_guard_in_literal717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_literal739 = new BitSet(new long[]{0x6000248880080200L,0x0000000000000214L});
    public static final BitSet FOLLOW_metadata_in_literal744 = new BitSet(new long[]{0x6000048880080200L,0x0000000000000014L});
    public static final BitSet FOLLOW_semantic_attachment_in_literal747 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_guard_in_literal751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_literal773 = new BitSet(new long[]{0x6000200800000000L,0x0000000000000204L});
    public static final BitSet FOLLOW_metadata_in_literal776 = new BitSet(new long[]{0x6000000800000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_function_call_in_literal779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_literal797 = new BitSet(new long[]{0x0000200000008000L});
    public static final BitSet FOLLOW_cut_in_literal800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CUT_in_cut816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_not_equal_in_binary_operator825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_binary_operator829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_binary_operator833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LE_in_binary_operator837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GE_in_binary_operator841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_predicate_in_relation853 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_OPEN_in_relation855 = new BitSet(new long[]{0x6000248880082200L,0x0000000000000414L});
    public static final BitSet FOLLOW_list_body_in_relation857 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_CLOSE_in_relation859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BRA_in_guard878 = new BitSet(new long[]{0x6000248880088200L,0x0000000000000214L});
    public static final BitSet FOLLOW_literals_in_guard880 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_KET_in_guard882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terms_in_list_body903 = new BitSet(new long[]{0x0000200000000102L});
    public static final BitSet FOLLOW_BAR_in_list_body906 = new BitSet(new long[]{0x0000000800080200L,0x0000000000000014L});
    public static final BitSet FOLLOW_list_tail_in_list_body908 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_list_body914 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_terms0_in_list_body0939 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_BAR_in_list_body0942 = new BitSet(new long[]{0x0000000800080200L,0x0000000000000014L});
    public static final BitSet FOLLOW_list_tail_in_list_body0944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_list_tail967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prova_list_in_list_tail971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_left_term981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_left_term988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_left_term994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prova_list_in_left_term1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_right_term1011 = new BitSet(new long[]{0x6000000800080000L,0x0000000000000014L});
    public static final BitSet FOLLOW_constant_in_right_term1015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_right_term1019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_right_term1025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prova_list_in_right_term1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prova_map_in_right_term1033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_prova_map1043 = new BitSet(new long[]{0x6000000800004000L,0x0000000000000800L});
    public static final BitSet FOLLOW_key_value_in_prova_map1045 = new BitSet(new long[]{0x0000000000004000L,0x0000000000000800L});
    public static final BitSet FOLLOW_COMMA_in_prova_map1049 = new BitSet(new long[]{0x6000000800000000L});
    public static final BitSet FOLLOW_key_value_in_prova_map1051 = new BitSet(new long[]{0x0000000000004000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_prova_map1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mstring_in_key_value1075 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000180L});
    public static final BitSet FOLLOW_71_in_key_value1078 = new BitSet(new long[]{0x6000048880080200L,0x0000000000000414L});
    public static final BitSet FOLLOW_72_in_key_value1080 = new BitSet(new long[]{0x6000048880080200L,0x0000000000000414L});
    public static final BitSet FOLLOW_term_in_key_value1083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_terms1106 = new BitSet(new long[]{0x6000248880080200L,0x0000000000000414L});
    public static final BitSet FOLLOW_term_in_terms1109 = new BitSet(new long[]{0x0000200000004002L});
    public static final BitSet FOLLOW_NEWLINE_in_terms1112 = new BitSet(new long[]{0x0000200000004000L});
    public static final BitSet FOLLOW_COMMA_in_terms1115 = new BitSet(new long[]{0x6000248880080200L,0x0000000000000414L});
    public static final BitSet FOLLOW_NEWLINE_in_terms1117 = new BitSet(new long[]{0x6000248880080200L,0x0000000000000414L});
    public static final BitSet FOLLOW_term_in_terms1120 = new BitSet(new long[]{0x0000200000004002L});
    public static final BitSet FOLLOW_term_in_terms01140 = new BitSet(new long[]{0x6000048880080202L,0x0000000000000414L});
    public static final BitSet FOLLOW_left_term_in_term1158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_func_term_in_term1162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prova_map_in_term1166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_func_in_func_term1175 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_args_in_func_term1177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCWORD_in_qualified_java_class1190 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_DOT_in_qualified_java_class1192 = new BitSet(new long[]{0x0000000800000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_UCWORD_in_qualified_java_class1196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BRA_in_prova_list1224 = new BitSet(new long[]{0x6000248980080200L,0x0000000000000414L});
    public static final BitSet FOLLOW_list_body_in_prova_list1226 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_KET_in_prova_list1228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_in_args1245 = new BitSet(new long[]{0x6000248880082200L,0x0000000000000414L});
    public static final BitSet FOLLOW_list_body_in_args1247 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_CLOSE_in_args1249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_predicate_java_call_in_semantic_attachment1267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_binary_operation_in_semantic_attachment1271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_left_term_in_binary_operation1280 = new BitSet(new long[]{0x0000C1100C200000L});
    public static final BitSet FOLLOW_EQUAL_in_binary_operation1286 = new BitSet(new long[]{0x6001048880080200L,0x0000000000000014L});
    public static final BitSet FOLLOW_constructor_java_call_in_binary_operation1296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prova_list_in_binary_operation1303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_binary_operation1310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_binary_operation1317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_not_equal_in_binary_operation1328 = new BitSet(new long[]{0x6000000800000000L});
    public static final BitSet FOLLOW_constant_in_binary_operation1330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_binary_operator_in_binary_operation1336 = new BitSet(new long[]{0x0001048880080000L,0x0000000000000014L});
    public static final BitSet FOLLOW_expr_in_binary_operation1338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_aterm_in_expr1350 = new BitSet(new long[]{0x0002040000000002L});
    public static final BitSet FOLLOW_set_in_expr1353 = new BitSet(new long[]{0x0001048880080000L,0x0000000000000014L});
    public static final BitSet FOLLOW_aterm_in_expr1361 = new BitSet(new long[]{0x0002040000000002L});
    public static final BitSet FOLLOW_MINUS_in_aterm1373 = new BitSet(new long[]{0x0000000800080000L,0x0000000000000014L});
    public static final BitSet FOLLOW_variable_in_aterm1376 = new BitSet(new long[]{0x0100100000020002L});
    public static final BitSet FOLLOW_number_in_aterm1380 = new BitSet(new long[]{0x0100100000020002L});
    public static final BitSet FOLLOW_MINUS_in_aterm1384 = new BitSet(new long[]{0x0000000800080000L,0x0000000000000014L});
    public static final BitSet FOLLOW_predicate_java_call_in_aterm1387 = new BitSet(new long[]{0x0100100000020002L});
    public static final BitSet FOLLOW_OPEN_in_aterm1391 = new BitSet(new long[]{0x0001048880080000L,0x0000000000000014L});
    public static final BitSet FOLLOW_expr_in_aterm1393 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_CLOSE_in_aterm1395 = new BitSet(new long[]{0x0100100000020002L});
    public static final BitSet FOLLOW_set_in_aterm1399 = new BitSet(new long[]{0x0001048880080000L,0x0000000000000014L});
    public static final BitSet FOLLOW_aterm_in_aterm1413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualified_java_class_in_constructor_java_call1425 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_UCWORD_in_constructor_java_call1429 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_args_in_constructor_java_call1432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_static_java_call_in_predicate_java_call1443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instance_java_call_in_predicate_java_call1447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instance_call_in_instance_java_call1458 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_args_in_instance_java_call1460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_static_call_in_static_java_call1481 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_args_in_static_java_call1483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCWORD_in_method1504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCWORD_in_func1512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UCWORD_in_func1516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_in_func1520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typed_variable_in_func1524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCWORD_in_predicate1534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UCWORD_in_predicate1538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_in_predicate1542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UCWORD_in_variable1549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USWORD_in_variable1553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typed_variable_in_variable1557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOLLARWORD_in_variable1561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_variable_or_number1571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_variable_or_number1575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualified_java_class_in_typed_variable1602 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_DOT_in_typed_variable1604 = new BitSet(new long[]{0x0000000800000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_word_in_typed_variable1606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UCWORD_in_typed_variable1622 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_DOT_in_typed_variable1624 = new BitSet(new long[]{0x0000000800000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_word_in_typed_variable1626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_instance_call1648 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_DOT_in_instance_call1650 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_LCWORD_in_instance_call1652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualified_java_class_in_static_call1670 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_DOT_in_static_call1672 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_LCWORD_in_static_call1674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_LITERAL_in_pos_number1690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONG_LITERAL_in_pos_number1694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_float_literal_in_pos_number1698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_number1709 = new BitSet(new long[]{0x0000008080000000L});
    public static final BitSet FOLLOW_pos_number_in_number1713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCWORD_in_mstring1723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_in_mstring1727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCWORD_in_constant1737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_in_constant1741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualified_java_class_in_constant1745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_LITERAL_in_float_literal1781 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_DOT_in_float_literal1783 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_INT_LITERAL_in_float_literal1785 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_EXPONENT_in_float_literal1787 = new BitSet(new long[]{0x0000000000000002L});

}