// $ANTLR 3.1 C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g 2010-01-02 12:43:29

   package org.provarules.parser;


import org.antlr.runtime.*;


import org.antlr.runtime.tree.*;

public class WhereParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "IN", "Identifier", "Comparison", "T", "DIGIT", "Number", "String", "WhiteSpace", "CHAR", "'('", "')'", "'xor'", "'or'", "'and'", "'not'", "'in'", "','"
    };
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
    public static final int DIGIT=8;
    public static final int String=10;

    // delegates
    // delegators


        public WhereParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public WhereParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return WhereParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g"; }


    public static class expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    }

    // $ANTLR start "expr"
    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:20:1: expr : xor_expr ;
    public final WhereParser.expr_return expr() throws RecognitionException {
        WhereParser.expr_return retval = new WhereParser.expr_return();
        retval.start = input.LT(1);

        Object root_0;

        WhereParser.xor_expr_return xor_expr1 = null;



        try {
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:20:7: ( xor_expr )
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:20:10: xor_expr
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_xor_expr_in_expr64);
            xor_expr1=xor_expr();

            state._fsp--;

            adaptor.addChild(root_0, xor_expr1.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expr"

    public static class par_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "par_expr"
    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:22:1: par_expr : '(' expr ')' -> expr ;
    public final WhereParser.par_expr_return par_expr() throws RecognitionException {
        WhereParser.par_expr_return retval = new WhereParser.par_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal2=null;
        Token char_literal4=null;
        WhereParser.expr_return expr3 = null;


        Object char_literal2_tree=null;
        Object char_literal4_tree=null;
        RewriteRuleTokenStream stream_13=new RewriteRuleTokenStream(adaptor,"token 13");
        RewriteRuleTokenStream stream_14=new RewriteRuleTokenStream(adaptor,"token 14");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:22:9: ( '(' expr ')' -> expr )
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:22:11: '(' expr ')'
            {
            char_literal2=(Token)match(input,13,FOLLOW_13_in_par_expr71);  
            stream_13.add(char_literal2);

            pushFollow(FOLLOW_expr_in_par_expr73);
            expr3=expr();

            state._fsp--;

            stream_expr.add(expr3.getTree());
            char_literal4=(Token)match(input,14,FOLLOW_14_in_par_expr75);  
            stream_14.add(char_literal4);



            // AST REWRITE
            // elements: expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 22:24: -> expr
            {
                adaptor.addChild(root_0, stream_expr.nextTree());

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "par_expr"

    public static class xor_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "xor_expr"
    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:24:1: xor_expr : or_expr ( 'xor' or_expr )* ;
    public final WhereParser.xor_expr_return xor_expr() throws RecognitionException {
        WhereParser.xor_expr_return retval = new WhereParser.xor_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal6=null;
        WhereParser.or_expr_return or_expr5 = null;

        WhereParser.or_expr_return or_expr7 = null;


        Object string_literal6_tree=null;

        try {
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:24:9: ( or_expr ( 'xor' or_expr )* )
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:24:11: or_expr ( 'xor' or_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_or_expr_in_xor_expr86);
            or_expr5=or_expr();

            state._fsp--;

            adaptor.addChild(root_0, or_expr5.getTree());
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:24:19: ( 'xor' or_expr )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:24:20: 'xor' or_expr
            	    {
            	    string_literal6=(Token)match(input,15,FOLLOW_15_in_xor_expr89); 
            	    string_literal6_tree = (Object)adaptor.create(string_literal6);
            	    root_0 = (Object)adaptor.becomeRoot(string_literal6_tree, root_0);

            	    pushFollow(FOLLOW_or_expr_in_xor_expr92);
            	    or_expr7=or_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, or_expr7.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "xor_expr"

    public static class or_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "or_expr"
    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:26:1: or_expr : and_expr ( 'or' and_expr )* ;
    public final WhereParser.or_expr_return or_expr() throws RecognitionException {
        WhereParser.or_expr_return retval = new WhereParser.or_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal9=null;
        WhereParser.and_expr_return and_expr8 = null;

        WhereParser.and_expr_return and_expr10 = null;


        Object string_literal9_tree=null;

        try {
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:26:9: ( and_expr ( 'or' and_expr )* )
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:26:11: and_expr ( 'or' and_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_and_expr_in_or_expr103);
            and_expr8=and_expr();

            state._fsp--;

            adaptor.addChild(root_0, and_expr8.getTree());
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:26:20: ( 'or' and_expr )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:26:21: 'or' and_expr
            	    {
            	    string_literal9=(Token)match(input,16,FOLLOW_16_in_or_expr106); 
            	    string_literal9_tree = (Object)adaptor.create(string_literal9);
            	    root_0 = (Object)adaptor.becomeRoot(string_literal9_tree, root_0);

            	    pushFollow(FOLLOW_and_expr_in_or_expr109);
            	    and_expr10=and_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, and_expr10.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "or_expr"

    public static class and_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "and_expr"
    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:28:1: and_expr : not_expr ( 'and' not_expr )* ;
    public final WhereParser.and_expr_return and_expr() throws RecognitionException {
        WhereParser.and_expr_return retval = new WhereParser.and_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal12=null;
        WhereParser.not_expr_return not_expr11 = null;

        WhereParser.not_expr_return not_expr13 = null;


        Object string_literal12_tree=null;

        try {
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:28:9: ( not_expr ( 'and' not_expr )* )
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:28:11: not_expr ( 'and' not_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_not_expr_in_and_expr118);
            not_expr11=not_expr();

            state._fsp--;

            adaptor.addChild(root_0, not_expr11.getTree());
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:28:20: ( 'and' not_expr )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:28:21: 'and' not_expr
            	    {
            	    string_literal12=(Token)match(input,17,FOLLOW_17_in_and_expr121); 
            	    string_literal12_tree = (Object)adaptor.create(string_literal12);
            	    root_0 = (Object)adaptor.becomeRoot(string_literal12_tree, root_0);

            	    pushFollow(FOLLOW_not_expr_in_and_expr124);
            	    not_expr13=not_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, not_expr13.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "and_expr"

    public static class not_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "not_expr"
    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:30:1: not_expr : ( 'not' )? ( par_expr | comparison | in ) ;
    public final WhereParser.not_expr_return not_expr() throws RecognitionException {
        WhereParser.not_expr_return retval = new WhereParser.not_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal14=null;
        WhereParser.par_expr_return par_expr15 = null;

        WhereParser.comparison_return comparison16 = null;

        WhereParser.in_return in17 = null;


        Object string_literal14_tree=null;

        try {
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:30:9: ( ( 'not' )? ( par_expr | comparison | in ) )
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:30:11: ( 'not' )? ( par_expr | comparison | in )
            {
            root_0 = (Object)adaptor.nil();

            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:30:11: ( 'not' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:30:12: 'not'
                    {
                    string_literal14=(Token)match(input,18,FOLLOW_18_in_not_expr134); 
                    string_literal14_tree = (Object)adaptor.create(string_literal14);
                    root_0 = (Object)adaptor.becomeRoot(string_literal14_tree, root_0);


                    }
                    break;

            }

            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:30:21: ( par_expr | comparison | in )
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            else if ( (LA5_0==Identifier) ) {
                int LA5_2 = input.LA(2);

                if ( (LA5_2==19) ) {
                    alt5=3;
                }
                else if ( (LA5_2==Comparison) ) {
                    alt5=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:30:22: par_expr
                    {
                    pushFollow(FOLLOW_par_expr_in_not_expr140);
                    par_expr15=par_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, par_expr15.getTree());

                    }
                    break;
                case 2 :
                    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:30:33: comparison
                    {
                    pushFollow(FOLLOW_comparison_in_not_expr144);
                    comparison16=comparison();

                    state._fsp--;

                    adaptor.addChild(root_0, comparison16.getTree());

                    }
                    break;
                case 3 :
                    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:30:46: in
                    {
                    pushFollow(FOLLOW_in_in_not_expr148);
                    in17=in();

                    state._fsp--;

                    adaptor.addChild(root_0, in17.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "not_expr"

    public static class comparison_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "comparison"
    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:32:1: comparison : Identifier ( Comparison ( Identifier | T ) ) ;
    public final WhereParser.comparison_return comparison() throws RecognitionException {
        WhereParser.comparison_return retval = new WhereParser.comparison_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Identifier18=null;
        Token Comparison19=null;
        Token set20=null;

        Object Identifier18_tree=null;
        Object Comparison19_tree=null;
        Object set20_tree=null;

        try {
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:33:3: ( Identifier ( Comparison ( Identifier | T ) ) )
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:33:5: Identifier ( Comparison ( Identifier | T ) )
            {
            root_0 = (Object)adaptor.nil();

            Identifier18=(Token)match(input,Identifier,FOLLOW_Identifier_in_comparison160); 
            Identifier18_tree = (Object)adaptor.create(Identifier18);
            adaptor.addChild(root_0, Identifier18_tree);

            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:33:16: ( Comparison ( Identifier | T ) )
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:33:17: Comparison ( Identifier | T )
            {
            Comparison19=(Token)match(input,Comparison,FOLLOW_Comparison_in_comparison163); 
            Comparison19_tree = (Object)adaptor.create(Comparison19);
            root_0 = (Object)adaptor.becomeRoot(Comparison19_tree, root_0);

            set20=(Token)input.LT(1);
            if ( input.LA(1)==Identifier||input.LA(1)==T ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set20));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "comparison"

    public static class in_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "in"
    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:35:1: in : Identifier 'in' '(' T ( ',' T )* ')' -> ^( IN Identifier ( T )+ ) ;
    public final WhereParser.in_return in() throws RecognitionException {
        WhereParser.in_return retval = new WhereParser.in_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Identifier21=null;
        Token string_literal22=null;
        Token char_literal23=null;
        Token T24=null;
        Token char_literal25=null;
        Token T26=null;
        Token char_literal27=null;

        Object Identifier21_tree=null;
        Object string_literal22_tree=null;
        Object char_literal23_tree=null;
        Object T24_tree=null;
        Object char_literal25_tree=null;
        Object T26_tree=null;
        Object char_literal27_tree=null;
        RewriteRuleTokenStream stream_20=new RewriteRuleTokenStream(adaptor,"token 20");
        RewriteRuleTokenStream stream_T=new RewriteRuleTokenStream(adaptor,"token T");
        RewriteRuleTokenStream stream_19=new RewriteRuleTokenStream(adaptor,"token 19");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleTokenStream stream_13=new RewriteRuleTokenStream(adaptor,"token 13");
        RewriteRuleTokenStream stream_14=new RewriteRuleTokenStream(adaptor,"token 14");

        try {
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:36:3: ( Identifier 'in' '(' T ( ',' T )* ')' -> ^( IN Identifier ( T )+ ) )
            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:36:5: Identifier 'in' '(' T ( ',' T )* ')'
            {
            Identifier21=(Token)match(input,Identifier,FOLLOW_Identifier_in_in184);  
            stream_Identifier.add(Identifier21);

            string_literal22=(Token)match(input,19,FOLLOW_19_in_in186);  
            stream_19.add(string_literal22);

            char_literal23=(Token)match(input,13,FOLLOW_13_in_in188);  
            stream_13.add(char_literal23);

            T24=(Token)match(input,T,FOLLOW_T_in_in190);  
            stream_T.add(T24);

            // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:36:27: ( ',' T )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==20) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:36:28: ',' T
            	    {
            	    char_literal25=(Token)match(input,20,FOLLOW_20_in_in193);  
            	    stream_20.add(char_literal25);

            	    T26=(Token)match(input,T,FOLLOW_T_in_in195);  
            	    stream_T.add(T26);


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            char_literal27=(Token)match(input,14,FOLLOW_14_in_in199);  
            stream_14.add(char_literal27);



            // AST REWRITE
            // elements: Identifier, T
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 36:40: -> ^( IN Identifier ( T )+ )
            {
                // C:\\workspace35\\prova-2.0-trunk\\src\\main\\antlr\\org\\provarules\\parser\\Where.g:36:43: ^( IN Identifier ( T )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IN, "IN"), root_1);

                adaptor.addChild(root_1, stream_Identifier.nextNode());
                if ( !(stream_T.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_T.hasNext() ) {
                    adaptor.addChild(root_1, stream_T.nextNode());

                }
                stream_T.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "in"

    // Delegated rules


 

    public static final BitSet FOLLOW_xor_expr_in_expr64 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_par_expr71 = new BitSet(new long[]{0x0000000000042020L});
    public static final BitSet FOLLOW_expr_in_par_expr73 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_par_expr75 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_or_expr_in_xor_expr86 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_xor_expr89 = new BitSet(new long[]{0x0000000000042020L});
    public static final BitSet FOLLOW_or_expr_in_xor_expr92 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_and_expr_in_or_expr103 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_or_expr106 = new BitSet(new long[]{0x0000000000042020L});
    public static final BitSet FOLLOW_and_expr_in_or_expr109 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_not_expr_in_and_expr118 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_and_expr121 = new BitSet(new long[]{0x0000000000042020L});
    public static final BitSet FOLLOW_not_expr_in_and_expr124 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_18_in_not_expr134 = new BitSet(new long[]{0x0000000000042020L});
    public static final BitSet FOLLOW_par_expr_in_not_expr140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comparison_in_not_expr144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_in_in_not_expr148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_comparison160 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_Comparison_in_comparison163 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_set_in_comparison166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_in184 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_in186 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_in188 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_T_in_in190 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_20_in_in193 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_T_in_in195 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_14_in_in199 = new BitSet(new long[]{0x0000000000000002L});

}