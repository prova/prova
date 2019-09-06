// $ANTLR 3.4 C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g 2013-01-02 17:05:40

	package org.provarules.parser;
	import java.util.*;

    import org.antlr.runtime.BitSet;
    import org.provarules.kernel2.ProvaConstant;
    import org.provarules.kernel2.ProvaList;
    import org.provarules.kernel2.ProvaLiteral;
    import org.provarules.util2.ProvaClassUtils;
	import org.provarules.kernel2.ProvaObject;
    import org.provarules.kernel2.ProvaVariable;
    import org.provarules.kernel2.ProvaRule;
	import org.provarules.kernel2.ProvaResultSet;
	import org.provarules.reference2.ProvaConstantImpl;
	import org.provarules.reference2.ProvaVariableImpl;
	import org.provarules.reference2.ProvaMapImpl;
	import org.provarules.reference2.ProvaListImpl;
    import org.provarules.reference2.ProvaRuleImpl;
	import org.provarules.reference2.ProvaGlobalConstantImpl;
	import org.provarules.reference2.operators.ProvaOperatorFactoryImpl;
	import org.provarules.reference2.operators.ProvaBinaryOperatorFactoryImpl;
	import org.provarules.parser2.ProvaParserImpl;

	import org.provarules.parser2.ProvaErrorReporter;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class ProvaWalker2 extends TreeParser {
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
    public TreeParser[] getDelegates() {
        return new TreeParser[] {};
    }

    // delegators


    public ProvaWalker2(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public ProvaWalker2(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return ProvaWalker2.tokenNames; }
    public String getGrammarFileName() { return "C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g"; }


        private ProvaErrorReporter errorReporter = null;

        public void setErrorReporter(ProvaErrorReporter errorReporter) {
            this.errorReporter = errorReporter;
        }

        public void emitErrorMessage(String msg) {
            errorReporter.reportError(msg);
        }
        
        private org.antlr.runtime.tree.TreeNodeStream getInput() {
        	return input;
        } 



    protected static class rulebase_scope {
        List ret0;
    }
    protected Stack rulebase_stack = new Stack();



    // $ANTLR start "rulebase"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:57:1: rulebase returns [List ret] : ^( RULEBASE (s= statement )* ) ;
    public final List rulebase() throws RecognitionException {
        rulebase_stack.push(new rulebase_scope());
        List ret = null;


        List s =null;



        	((rulebase_scope)rulebase_stack.peek()).ret0 = new ArrayList();

        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:67:2: ( ^( RULEBASE (s= statement )* ) )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:67:4: ^( RULEBASE (s= statement )* )
            {
            match(input,RULEBASE,FOLLOW_RULEBASE_in_rulebase63); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:67:15: (s= statement )*
                loop1:
                do {
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==STATEMENT) ) {
                        alt1=1;
                    }


                    switch (alt1) {
                	case 1 :
                	    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:67:16: s= statement
                	    {
                	    pushFollow(FOLLOW_statement_in_rulebase68);
                	    s=statement();

                	    state._fsp--;


                	    ((rulebase_scope)rulebase_stack.peek()).ret0.add(s);

                	    }
                	    break;

                	default :
                	    break loop1;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }


            }


            	ret = ((rulebase_scope)rulebase_stack.peek()).ret0;

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            rulebase_stack.pop();
        }
        return ret;
    }
    // $ANTLR end "rulebase"



    // $ANTLR start "statement"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:70:1: statement returns [List ret] : ^( STATEMENT st= stat ) ;
    public final List statement() throws RecognitionException {
        List ret = null;


        List st =null;


        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:71:2: ( ^( STATEMENT st= stat ) )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:71:4: ^( STATEMENT st= stat )
            {
            match(input,STATEMENT,FOLLOW_STATEMENT_in_statement88); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_stat_in_statement92);
            st=stat();

            state._fsp--;


            match(input, Token.UP, null); 


            ret = st;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ret;
    }
    // $ANTLR end "statement"


    protected static class stat_scope {
        Object[] ret0;
        Set vars;
        // Variables found in the body (as constructed, they may include those also found in the head)
        	Set bodyVars;
        Set headVars;
        Map tailVars;
        Map mapVars;
        boolean isBody;
        boolean inRest;
        Object[] objects;
        boolean inInstanceCall;
        String src;
    }
    protected Stack stat_stack = new Stack();



    // $ANTLR start "stat"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:73:1: stat returns [List ret] : (c= clause |q= query );
    public final List stat() throws RecognitionException {
        stat_stack.push(new stat_scope());
        List ret = null;


        ProvaRule c =null;

        ProvaRule q =null;



        	((stat_scope)stat_stack.peek()).ret0 = new Object[7];
        	((stat_scope)stat_stack.peek()).vars = new HashSet();
        	((stat_scope)stat_stack.peek()).tailVars = new HashMap();
        	((stat_scope)stat_stack.peek()).mapVars = new HashMap();
        	((stat_scope)stat_stack.peek()).bodyVars = new HashSet();
        	((stat_scope)stat_stack.peek()).headVars = new HashSet();
        	((stat_scope)stat_stack.peek()).isBody = false;
        	((stat_scope)stat_stack.peek()).inRest = false;
        	((stat_scope)stat_stack.peek()).ret0[3] = new HashMap();
        	((stat_scope)stat_stack.peek()).ret0[4] = new HashMap();
        	((stat_scope)stat_stack.peek()).objects = ProvaParserImpl.tlObjects.get();
        	((stat_scope)stat_stack.peek()).src = ProvaParserImpl.tlSrc.get();

        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:105:2: (c= clause |q= query )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==CLAUSE) ) {
                alt2=1;
            }
            else if ( (LA2_0==QUERY) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:106:2: c= clause
                    {
                    pushFollow(FOLLOW_clause_in_stat125);
                    c=clause();

                    state._fsp--;



                    		((stat_scope)stat_stack.peek()).ret0[2]=c;
                    	

                    }
                    break;
                case 2 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:109:4: q= query
                    {
                    pushFollow(FOLLOW_query_in_stat134);
                    q=query();

                    state._fsp--;



                    		((stat_scope)stat_stack.peek()).ret0[0] = "";
                    		((stat_scope)stat_stack.peek()).ret0[1]=ProvaListImpl.emptyRList;
                    		((stat_scope)stat_stack.peek()).ret0[2]=q;
                    	

                    }
                    break;

            }

            	ret = Arrays.asList(((stat_scope)stat_stack.peek()).ret0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            stat_stack.pop();
        }
        return ret;
    }
    // $ANTLR end "stat"



    // $ANTLR start "clause"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:116:1: clause returns [ProvaRule ret] : ( ^(cl= CLAUSE (m= metadata )? r= relation (l= literals )? ) | ^(cl= CLAUSE (m= metadata )? pred= LCWORD params= list_body result= list_body (l= literals )? ) );
    public final ProvaRule clause() throws RecognitionException {
        ProvaRule ret = null;


        CommonTree cl=null;
        CommonTree pred=null;
        Map<String,List<Object>> m =null;

        List r =null;

        List<ProvaLiteral> l =null;

        ProvaList params =null;

        ProvaList result =null;


        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:116:31: ( ^(cl= CLAUSE (m= metadata )? r= relation (l= literals )? ) | ^(cl= CLAUSE (m= metadata )? pred= LCWORD params= list_body result= list_body (l= literals )? ) )
            int alt7=2;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:117:2: ^(cl= CLAUSE (m= metadata )? r= relation (l= literals )? )
                    {
                    cl=(CommonTree)match(input,CLAUSE,FOLLOW_CLAUSE_in_clause153); 

                    match(input, Token.DOWN, null); 
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:117:15: (m= metadata )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==METADATA) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:117:15: m= metadata
                            {
                            pushFollow(FOLLOW_metadata_in_clause157);
                            m=metadata();

                            state._fsp--;


                            }
                            break;

                    }


                    pushFollow(FOLLOW_relation_in_clause162);
                    r=relation();

                    state._fsp--;


                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:117:38: (l= literals )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==LITERAL) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:117:38: l= literals
                            {
                            pushFollow(FOLLOW_literals_in_clause166);
                            l=literals();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 


                    ((stat_scope)stat_stack.peek()).ret0[5]=m; ((stat_scope)stat_stack.peek()).ret0[1]=r; ((stat_scope)stat_stack.peek()).ret0[2]=l;
                    	ProvaLiteral head = ProvaParserImpl.tlKB.get().generateLiteral((String) r.get(0),(ProvaList) r.get(1));
                    	ProvaLiteral[] body = (l==null) ? new ProvaLiteral[0] : l.toArray(new ProvaLiteral[0]);
                    	ret = ProvaParserImpl.tlKB.get().generateRule(head,body);
                          	ret.computeSourceCode();
                    	ret.setLine(cl.getLine());
                    	ret.setSrc(Arrays.asList(new Object[] {((stat_scope)stat_stack.peek()).src}));
                    	ret.addMetadata(m);
                    	

                    }
                    break;
                case 2 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:128:2: ^(cl= CLAUSE (m= metadata )? pred= LCWORD params= list_body result= list_body (l= literals )? )
                    {
                    cl=(CommonTree)match(input,CLAUSE,FOLLOW_CLAUSE_in_clause180); 

                    match(input, Token.DOWN, null); 
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:128:15: (m= metadata )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==METADATA) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:128:15: m= metadata
                            {
                            pushFollow(FOLLOW_metadata_in_clause184);
                            m=metadata();

                            state._fsp--;


                            }
                            break;

                    }


                    pred=(CommonTree)match(input,LCWORD,FOLLOW_LCWORD_in_clause189); 

                    pushFollow(FOLLOW_list_body_in_clause193);
                    params=list_body();

                    state._fsp--;


                    pushFollow(FOLLOW_list_body_in_clause197);
                    result=list_body();

                    state._fsp--;


                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:128:73: (l= literals )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==LITERAL) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:128:73: l= literals
                            {
                            pushFollow(FOLLOW_literals_in_clause201);
                            l=literals();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 



                    	List rel = new ArrayList();
                    	((stat_scope)stat_stack.peek()).ret0[5]=m; ((stat_scope)stat_stack.peek()).ret0[1]=rel; ((stat_scope)stat_stack.peek()).ret0[2]=l;
                    	rel.add(pred.toString());
                    	ProvaObject p = params;
                    	if( params.getFixed().length==1 )
                    		p = params.getFixed()[0];
                    	ProvaObject o = result;
                    	if( result.getFixed().length==1 )
                    		o = result.getFixed()[0];
                    	rel.add(ProvaListImpl.create(new ProvaObject[] {p,o},null));
                    	ProvaLiteral head = ProvaParserImpl.tlKB.get().generateLiteral(pred.toString(),(ProvaList) rel.get(1));
                    	ProvaLiteral[] body = (l==null) ? new ProvaLiteral[0] : l.toArray(new ProvaLiteral[0]);
                    	ret = ProvaParserImpl.tlKB.get().generateRule(head,body);
                    	ret.setLine(cl.getLine());
                    	ret.setSrc(Arrays.asList(new Object[] {((stat_scope)stat_stack.peek()).src}));
                    	ret.addMetadata(m);
                    	

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ret;
    }
    // $ANTLR end "clause"



    // $ANTLR start "metadata"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:149:1: metadata returns [Map<String,List<Object>> ret] : ^( METADATA (a= annotation )+ ) ;
    public final Map<String,List<Object>> metadata() throws RecognitionException {
        Map<String,List<Object>> ret = null;


        List<Object> a =null;



        	ret = new HashMap<String,List<Object>>();

        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:153:2: ( ^( METADATA (a= annotation )+ ) )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:153:4: ^( METADATA (a= annotation )+ )
            {
            match(input,METADATA,FOLLOW_METADATA_in_metadata227); 

            match(input, Token.DOWN, null); 
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:153:15: (a= annotation )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==ANNOTATION) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:153:16: a= annotation
            	    {
            	    pushFollow(FOLLOW_annotation_in_metadata232);
            	    a=annotation();

            	    state._fsp--;


            	    ret.put(a.get(0).toString(),(List<Object>) a.get(1));

            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            match(input, Token.UP, null); 


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ret;
    }
    // $ANTLR end "metadata"


    protected static class annotation_scope {
        List<String> value;
    }
    protected Stack annotation_stack = new Stack();



    // $ANTLR start "annotation"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:156:1: annotation returns [List<Object> ret] : ^( ANNOTATION n= LCWORD (v= value )* ) ;
    public final List<Object> annotation() throws RecognitionException {
        annotation_stack.push(new annotation_scope());
        List<Object> ret = null;


        CommonTree n=null;
        String v =null;



        	ret = new ArrayList<Object>();
        	((annotation_scope)annotation_stack.peek()).value = new ArrayList<String>(); 

        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:167:2: ( ^( ANNOTATION n= LCWORD (v= value )* ) )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:167:4: ^( ANNOTATION n= LCWORD (v= value )* )
            {
            match(input,ANNOTATION,FOLLOW_ANNOTATION_in_annotation266); 

            match(input, Token.DOWN, null); 
            n=(CommonTree)match(input,LCWORD,FOLLOW_LCWORD_in_annotation270); 

            ret.add(n.toString());

            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:167:52: (v= value )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==INT_LITERAL||LA9_0==LCWORD||LA9_0==LONG_LITERAL||LA9_0==MINUS||(LA9_0 >= STRING1 && LA9_0 <= STRING2)||LA9_0==UCWORD) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:167:53: v= value
            	    {
            	    pushFollow(FOLLOW_value_in_annotation277);
            	    v=value();

            	    state._fsp--;


            	    ((annotation_scope)annotation_stack.peek()).value.add(v);

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            match(input, Token.UP, null); 


            }


            	ret.add(((annotation_scope)annotation_stack.peek()).value);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            annotation_stack.pop();
        }
        return ret;
    }
    // $ANTLR end "annotation"



    // $ANTLR start "value"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:170:1: value returns [String ret] : (l= LCWORD |u= UCWORD |s= string |n= number );
    public final String value() throws RecognitionException {
        String ret = null;


        CommonTree l=null;
        CommonTree u=null;
        String s =null;

        ProvaConstant n =null;


        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:171:2: (l= LCWORD |u= UCWORD |s= string |n= number )
            int alt10=4;
            switch ( input.LA(1) ) {
            case LCWORD:
                {
                alt10=1;
                }
                break;
            case UCWORD:
                {
                alt10=2;
                }
                break;
            case STRING1:
            case STRING2:
                {
                alt10=3;
                }
                break;
            case INT_LITERAL:
            case LONG_LITERAL:
            case MINUS:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }

            switch (alt10) {
                case 1 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:171:4: l= LCWORD
                    {
                    l=(CommonTree)match(input,LCWORD,FOLLOW_LCWORD_in_value299); 

                    ret = l.toString();

                    }
                    break;
                case 2 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:172:5: u= UCWORD
                    {
                    u=(CommonTree)match(input,UCWORD,FOLLOW_UCWORD_in_value309); 

                     ret = u.toString(); 

                    }
                    break;
                case 3 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:173:5: s= string
                    {
                    pushFollow(FOLLOW_string_in_value319);
                    s=string();

                    state._fsp--;


                     ret = s; 

                    }
                    break;
                case 4 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:174:5: n= number
                    {
                    pushFollow(FOLLOW_number_in_value329);
                    n=number();

                    state._fsp--;


                     ret = n.toString(); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ret;
    }
    // $ANTLR end "value"



    // $ANTLR start "literals"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:177:1: literals returns [List<ProvaLiteral> ret] : ^( LITERAL (l= literal )+ ) ;
    public final List<ProvaLiteral> literals() throws RecognitionException {
        List<ProvaLiteral> ret = null;


        ProvaLiteral l =null;



        	ret = new ArrayList<ProvaLiteral>();
        	((stat_scope)stat_stack.peek()).isBody = true;

        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:182:2: ( ^( LITERAL (l= literal )+ ) )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:182:4: ^( LITERAL (l= literal )+ )
            {
            match(input,LITERAL,FOLLOW_LITERAL_in_literals352); 

            match(input, Token.DOWN, null); 
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:182:14: (l= literal )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==CUT||LA11_0==FUNCTION||LA11_0==RELATION||LA11_0==SEMANTIC_ATTACHMENT) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:182:15: l= literal
            	    {
            	    pushFollow(FOLLOW_literal_in_literals357);
            	    l=literal();

            	    state._fsp--;


            	    ret.add(l);

            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            match(input, Token.UP, null); 


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ret;
    }
    // $ANTLR end "literals"



    // $ANTLR start "function_call"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:185:1: function_call returns [List ret] : ^( FUNCTION_CALL pred= predicate params= list_body (result= list_body )? ) ;
    public final List function_call() throws RecognitionException {
        List ret = null;


        String pred =null;

        ProvaList params =null;

        ProvaList result =null;



        	ret = new ArrayList();

        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:189:2: ( ^( FUNCTION_CALL pred= predicate params= list_body (result= list_body )? ) )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:190:2: ^( FUNCTION_CALL pred= predicate params= list_body (result= list_body )? )
            {
            match(input,FUNCTION_CALL,FOLLOW_FUNCTION_CALL_in_function_call383); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_predicate_in_function_call387);
            pred=predicate();

            state._fsp--;


            pushFollow(FOLLOW_list_body_in_function_call391);
            params=list_body();

            state._fsp--;


            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:190:56: (result= list_body )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==LIST_BODY) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:190:56: result= list_body
                    {
                    pushFollow(FOLLOW_list_body_in_function_call395);
                    result=list_body();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 



            		if( Character.isUpperCase(pred.charAt(0)) )
            			ret.add(ProvaVariableImpl.create(pred));
            		else
            			ret.add(ProvaConstantImpl.create(pred));
            		ProvaObject p = params;
            		if( params.getFixed().length==1 )
            			p = params.getFixed()[0];
            		if( result==null )
            			ret.add(ProvaListImpl.create(new ProvaObject[] {p,null},null));
            		else {
            			ProvaObject o = result;
            			if( result.getFixed().length==1 )
            				o = result.getFixed()[0];
            			ret.add(ProvaListImpl.create(new ProvaObject[] {p,o},null));
            		}
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ret;
    }
    // $ANTLR end "function_call"



    // $ANTLR start "literal"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:209:1: literal returns [ProvaLiteral ret] : ( ^(rel= RELATION (m= metadata )? r= relation (g= guard )? ) | ^(sem= SEMANTIC_ATTACHMENT (m= metadata )? sa= semantic_attachment (g= guard )? ) | ^(fun= FUNCTION (m= metadata )? f= function_call ) | ^(cu= CUT c= cut ) );
    public final ProvaLiteral literal() throws RecognitionException {
        ProvaLiteral ret = null;


        CommonTree rel=null;
        CommonTree sem=null;
        CommonTree fun=null;
        CommonTree cu=null;
        Map<String,List<Object>> m =null;

        List r =null;

        List<ProvaLiteral> g =null;

        List<ProvaObject> sa =null;

        List f =null;


        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:210:2: ( ^(rel= RELATION (m= metadata )? r= relation (g= guard )? ) | ^(sem= SEMANTIC_ATTACHMENT (m= metadata )? sa= semantic_attachment (g= guard )? ) | ^(fun= FUNCTION (m= metadata )? f= function_call ) | ^(cu= CUT c= cut ) )
            int alt18=4;
            switch ( input.LA(1) ) {
            case RELATION:
                {
                alt18=1;
                }
                break;
            case SEMANTIC_ATTACHMENT:
                {
                alt18=2;
                }
                break;
            case FUNCTION:
                {
                alt18=3;
                }
                break;
            case CUT:
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
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:211:2: ^(rel= RELATION (m= metadata )? r= relation (g= guard )? )
                    {
                    rel=(CommonTree)match(input,RELATION,FOLLOW_RELATION_in_literal418); 

                    match(input, Token.DOWN, null); 
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:211:18: (m= metadata )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==METADATA) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:211:18: m= metadata
                            {
                            pushFollow(FOLLOW_metadata_in_literal422);
                            m=metadata();

                            state._fsp--;


                            }
                            break;

                    }


                    pushFollow(FOLLOW_relation_in_literal427);
                    r=relation();

                    state._fsp--;


                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:211:41: (g= guard )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==GUARD) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:211:41: g= guard
                            {
                            pushFollow(FOLLOW_guard_in_literal431);
                            g=guard();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 



                    		Object pred = r.get(0);
                          		if( pred.equals("cache") ) {
                           			String actualPred = ((ProvaList) ((ProvaList) r.get(1)).getFixed()[0]).getFixed()[0].toString();
                           			ProvaParserImpl.tlKB.get().addCachePredicate(actualPred);
                           		}
                    		ret = ProvaParserImpl.tlKB.get().generateLiteral((String) pred,(ProvaList) r.get(1),g);
                    		ret.setLine(rel.getLine());
                    		List<ProvaObject> metaVariables = ret.addMetadata(m);
                    		if( metaVariables!=null ) {
                    			metaVariables.add(0,ProvaConstantImpl.create(pred));
                    			metaVariables.add(1,(ProvaList) r.get(1));
                    			ProvaList metaList = ProvaListImpl.create( metaVariables );
                    			ret = ProvaParserImpl.tlKB.get().generateLiteral("metadata",metaList,g);
                    			ret.setLine(rel.getLine());
                    			ret.addMetadata(m);
                    		}
                    	

                    }
                    break;
                case 2 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:229:4: ^(sem= SEMANTIC_ATTACHMENT (m= metadata )? sa= semantic_attachment (g= guard )? )
                    {
                    sem=(CommonTree)match(input,SEMANTIC_ATTACHMENT,FOLLOW_SEMANTIC_ATTACHMENT_in_literal443); 

                    match(input, Token.DOWN, null); 
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:229:31: (m= metadata )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==METADATA) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:229:31: m= metadata
                            {
                            pushFollow(FOLLOW_metadata_in_literal447);
                            m=metadata();

                            state._fsp--;


                            }
                            break;

                    }


                    pushFollow(FOLLOW_semantic_attachment_in_literal452);
                    sa=semantic_attachment();

                    state._fsp--;


                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:229:66: (g= guard )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==GUARD) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:229:66: g= guard
                            {
                            pushFollow(FOLLOW_guard_in_literal456);
                            g=guard();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 



                    		ret =ProvaParserImpl.tlKB.get().generateLiteral((String) ((ProvaConstant) sa.get(0)).getObject(),(ProvaList) sa.get(1),g);
                    		ret.setLine(sem.getLine());
                    		ret.addMetadata(m);
                    	

                    }
                    break;
                case 3 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:234:4: ^(fun= FUNCTION (m= metadata )? f= function_call )
                    {
                    fun=(CommonTree)match(input,FUNCTION,FOLLOW_FUNCTION_in_literal468); 

                    match(input, Token.DOWN, null); 
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:234:20: (m= metadata )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==METADATA) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:234:20: m= metadata
                            {
                            pushFollow(FOLLOW_metadata_in_literal472);
                            m=metadata();

                            state._fsp--;


                            }
                            break;

                    }


                    pushFollow(FOLLOW_function_call_in_literal477);
                    f=function_call();

                    state._fsp--;


                    match(input, Token.UP, null); 



                    		ProvaList argsResult = (ProvaList) f.get(1);
                    		if( argsResult.getFixed()[1]==null ) {
                    			// Just a predicate call
                    			ret =ProvaParserImpl.tlKB.get().generateLiteral((String) ((ProvaConstant) f.get(0)).getObject(), (ProvaList) argsResult.getFixed()[0]);
                    		} else
                    			ret =ProvaParserImpl.tlKB.get().generateLiteral((String) ((ProvaConstant) f.get(0)).getObject(), argsResult);
                    		ret.setLine(fun.getLine());
                    		ret.addMetadata(m);
                    	

                    }
                    break;
                case 4 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:244:4: ^(cu= CUT c= cut )
                    {
                    cu=(CommonTree)match(input,CUT,FOLLOW_CUT_in_literal488); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_cut_in_literal492);
                    cut();

                    state._fsp--;


                    match(input, Token.UP, null); 



                    		ProvaVariable any1 = ProvaVariableImpl.create();
                    		ProvaList lany1 = ProvaListImpl.create( new ProvaObject[] {any1});
                    		ret = ProvaParserImpl.tlKB.get().generateLiteral("cut",lany1);
                    		ret.setLine(cu.getLine());
                    	

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ret;
    }
    // $ANTLR end "literal"



    // $ANTLR start "guard"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:252:1: guard returns [List<ProvaLiteral> ret] : ^(g= GUARD lits= literals ) ;
    public final List<ProvaLiteral> guard() throws RecognitionException {
        List<ProvaLiteral> ret = null;


        CommonTree g=null;
        List<ProvaLiteral> lits =null;


        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:253:2: ( ^(g= GUARD lits= literals ) )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:253:4: ^(g= GUARD lits= literals )
            {
            g=(CommonTree)match(input,GUARD,FOLLOW_GUARD_in_guard512); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_literals_in_guard516);
            lits=literals();

            state._fsp--;


            match(input, Token.UP, null); 



            		ret = lits;
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ret;
    }
    // $ANTLR end "guard"



    // $ANTLR start "cut"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:258:1: cut : CUT ;
    public final void cut() throws RecognitionException {
        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:259:2: ( CUT )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:259:4: CUT
            {
            match(input,CUT,FOLLOW_CUT_in_cut529); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "cut"



    // $ANTLR start "semantic_attachment"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:262:1: semantic_attachment returns [List<ProvaObject> ret] : (pjc= predicate_java_call |bo= binary_operation );
    public final List<ProvaObject> semantic_attachment() throws RecognitionException {
        List<ProvaObject> ret = null;


        List<ProvaObject> pjc =null;

        List<ProvaObject> bo =null;



        	ret = new ArrayList<ProvaObject>();

        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:266:2: (pjc= predicate_java_call |bo= binary_operation )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==INSTANCE_JAVA_CALL||LA19_0==STATIC_JAVA_CALL) ) {
                alt19=1;
            }
            else if ( (LA19_0==DOLLARWORD||LA19_0==INT_LITERAL||LA19_0==LCWORD||LA19_0==LONG_LITERAL||LA19_0==MINUS||LA19_0==PROVA_LIST||LA19_0==QUALIFIED_JAVA_CLASS||(LA19_0 >= STRING1 && LA19_0 <= STRING2)||LA19_0==TYPED_VARIABLE||LA19_0==UCWORD||LA19_0==USWORD) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }
            switch (alt19) {
                case 1 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:266:4: pjc= predicate_java_call
                    {
                    pushFollow(FOLLOW_predicate_java_call_in_semantic_attachment550);
                    pjc=predicate_java_call();

                    state._fsp--;



                    			ProvaConstant symbolConstant = (ProvaConstant) pjc.remove(0);
                    			ProvaList pl = ProvaListImpl.create(pjc.toArray(new ProvaObject[0]));
                    			String method = symbolConstant.equals("s")?"scalc":"pcalc";
                    			ret.add(ProvaConstantImpl.create(method));
                    			ret.add(pl);
                    		

                    }
                    break;
                case 2 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:273:5: bo= binary_operation
                    {
                    pushFollow(FOLLOW_binary_operation_in_semantic_attachment560);
                    bo=binary_operation();

                    state._fsp--;



                    			ProvaConstant symbolConstant = (ProvaConstant) bo.remove(0);
                    			ret.add(symbolConstant);
                    			ProvaList pl = ProvaListImpl.create(bo.toArray(new ProvaObject[0]));
                    			ret.add(pl);
                    		

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ret;
    }
    // $ANTLR end "semantic_attachment"



    // $ANTLR start "predicate_java_call"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:281:1: predicate_java_call returns [List<ProvaObject> ret] : (sjc= static_java_call |ijc= instance_java_call );
    public final List<ProvaObject> predicate_java_call() throws RecognitionException {
        List<ProvaObject> ret = null;


        List<ProvaObject> sjc =null;

        List<ProvaObject> ijc =null;


        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:282:2: (sjc= static_java_call |ijc= instance_java_call )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==STATIC_JAVA_CALL) ) {
                alt20=1;
            }
            else if ( (LA20_0==INSTANCE_JAVA_CALL) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }
            switch (alt20) {
                case 1 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:282:4: sjc= static_java_call
                    {
                    pushFollow(FOLLOW_static_java_call_in_predicate_java_call578);
                    sjc=static_java_call();

                    state._fsp--;



                    			ret =sjc;
                    		

                    }
                    break;
                case 2 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:285:5: ijc= instance_java_call
                    {
                    pushFollow(FOLLOW_instance_java_call_in_predicate_java_call588);
                    ijc=instance_java_call();

                    state._fsp--;



                    			ret =ijc;
                    		

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ret;
    }
    // $ANTLR end "predicate_java_call"



    // $ANTLR start "static_java_call"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:290:1: static_java_call returns [List<ProvaObject> ret] : ^( STATIC_JAVA_CALL sc= static_call a= args ) ;
    public final List<ProvaObject> static_java_call() throws RecognitionException {
        List<ProvaObject> ret = null;


        List<ProvaObject> sc =null;

        ProvaList a =null;


        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:291:2: ( ^( STATIC_JAVA_CALL sc= static_call a= args ) )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:291:4: ^( STATIC_JAVA_CALL sc= static_call a= args )
            {
            match(input,STATIC_JAVA_CALL,FOLLOW_STATIC_JAVA_CALL_in_static_java_call605); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_static_call_in_static_java_call609);
            sc=static_call();

            state._fsp--;


            pushFollow(FOLLOW_args_in_static_java_call613);
            a=args();

            state._fsp--;


            match(input, Token.UP, null); 



            			sc.add(a);
            			ret = sc;
            		

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ret;
    }
    // $ANTLR end "static_java_call"


    protected static class binary_operation_scope {
        String op;
    }
    protected Stack binary_operation_stack = new Stack();



    // $ANTLR start "binary_operation"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:297:1: binary_operation returns [List<ProvaObject> ret] : lt= left_term ( EQUAL (cjc= constructor_java_call |pl= prova_list |c= constant |e= expr ) | not_equal c= constant |bo= binary_operator e= expr ) ;
    public final List<ProvaObject> binary_operation() throws RecognitionException {
        binary_operation_stack.push(new binary_operation_scope());
        List<ProvaObject> ret = null;


        ProvaObject lt =null;

        List<ProvaObject> cjc =null;

        ProvaList pl =null;

        ProvaConstant c =null;

        ProvaObject e =null;

        String bo =null;


        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:301:2: (lt= left_term ( EQUAL (cjc= constructor_java_call |pl= prova_list |c= constant |e= expr ) | not_equal c= constant |bo= binary_operator e= expr ) )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:302:3: lt= left_term ( EQUAL (cjc= constructor_java_call |pl= prova_list |c= constant |e= expr ) | not_equal c= constant |bo= binary_operator e= expr )
            {
            pushFollow(FOLLOW_left_term_in_binary_operation639);
            lt=left_term();

            state._fsp--;


            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:302:16: ( EQUAL (cjc= constructor_java_call |pl= prova_list |c= constant |e= expr ) | not_equal c= constant |bo= binary_operator e= expr )
            int alt22=3;
            switch ( input.LA(1) ) {
            case EQUAL:
                {
                alt22=1;
                }
                break;
            case NOT_EQUAL1:
            case NOT_EQUAL2:
                {
                int LA22_2 = input.LA(2);

                if ( (LA22_2==LCWORD||LA22_2==QUALIFIED_JAVA_CLASS||(LA22_2 >= STRING1 && LA22_2 <= STRING2)) ) {
                    alt22=2;
                }
                else if ( (LA22_2==DOLLARWORD||(LA22_2 >= INSTANCE_JAVA_CALL && LA22_2 <= INT_LITERAL)||LA22_2==LONG_LITERAL||LA22_2==MINUS||LA22_2==OPEN||LA22_2==STATIC_JAVA_CALL||LA22_2==TYPED_VARIABLE||LA22_2==UCWORD||LA22_2==USWORD) ) {
                    alt22=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 2, input);

                    throw nvae;

                }
                }
                break;
            case DOLLARWORD:
            case GE:
            case GT:
            case INSTANCE_JAVA_CALL:
            case INT_LITERAL:
            case LE:
            case LONG_LITERAL:
            case LT:
            case MINUS:
            case OPEN:
            case STATIC_JAVA_CALL:
            case TYPED_VARIABLE:
            case UCWORD:
            case USWORD:
                {
                alt22=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }

            switch (alt22) {
                case 1 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:303:4: EQUAL (cjc= constructor_java_call |pl= prova_list |c= constant |e= expr )
                    {
                    match(input,EQUAL,FOLLOW_EQUAL_in_binary_operation646); 

                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:303:10: (cjc= constructor_java_call |pl= prova_list |c= constant |e= expr )
                    int alt21=4;
                    alt21 = dfa21.predict(input);
                    switch (alt21) {
                        case 1 :
                            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:304:4: cjc= constructor_java_call
                            {
                            pushFollow(FOLLOW_constructor_java_call_in_binary_operation655);
                            cjc=constructor_java_call();

                            state._fsp--;



                            				ret =new java.util.ArrayList<ProvaObject>();
                            				ret.add(ProvaConstantImpl.create("construct"));
                            				ret.add(cjc.get(0));
                            				ret.add(lt);
                            				ret.add(cjc.get(1));
                            			

                            }
                            break;
                        case 2 :
                            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:311:6: pl= prova_list
                            {
                            pushFollow(FOLLOW_prova_list_in_binary_operation666);
                            pl=prova_list();

                            state._fsp--;



                            				ret =new java.util.ArrayList<ProvaObject>();
                            				ret.add(ProvaConstantImpl.create("equals"));
                            				ret.add(lt);
                            				ret.add(pl);
                            			

                            }
                            break;
                        case 3 :
                            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:317:6: c= constant
                            {
                            pushFollow(FOLLOW_constant_in_binary_operation677);
                            c=constant();

                            state._fsp--;



                            				ret =new java.util.ArrayList<ProvaObject>();
                            				ret.add(ProvaConstantImpl.create("equals"));
                            				ret.add(lt);
                            				ret.add(c);
                            			

                            }
                            break;
                        case 4 :
                            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:324:6: e= expr
                            {
                            pushFollow(FOLLOW_expr_in_binary_operation692);
                            e=expr();

                            state._fsp--;



                            				ret =new java.util.ArrayList<ProvaObject>();
                            				ret.add(ProvaConstantImpl.create("expr_literal"));
                            				ret.add(ProvaConstantImpl.create(ProvaBinaryOperatorFactoryImpl.create("=")));
                            				ret.add(lt);
                            				ret.add(e);
                            			

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:332:5: not_equal c= constant
                    {
                    pushFollow(FOLLOW_not_equal_in_binary_operation705);
                    not_equal();

                    state._fsp--;


                    pushFollow(FOLLOW_constant_in_binary_operation709);
                    c=constant();

                    state._fsp--;



                    			ret =new java.util.ArrayList<ProvaObject>();
                    			ret.add(ProvaConstantImpl.create("ne"));
                    			ret.add(lt);
                    			ret.add(c);
                    		

                    }
                    break;
                case 3 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:338:5: bo= binary_operator e= expr
                    {
                    pushFollow(FOLLOW_binary_operator_in_binary_operation719);
                    bo=binary_operator();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_binary_operation723);
                    e=expr();

                    state._fsp--;



                    			ret =new java.util.ArrayList<ProvaObject>();
                    			ret.add(ProvaConstantImpl.create("expr_literal"));
                    			ret.add(ProvaConstantImpl.create(ProvaBinaryOperatorFactoryImpl.create(bo)));
                    			ret.add(lt);
                    			ret.add(e);
                    		

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            binary_operation_stack.pop();
        }
        return ret;
    }
    // $ANTLR end "binary_operation"



    // $ANTLR start "expr"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:359:1: expr returns [ProvaObject ret] : a= aterm (op= ( PLUS | MINUS ) b= aterm )* ;
    public final ProvaObject expr() throws RecognitionException {
        ProvaObject ret = null;


        CommonTree op=null;
        ProvaObject a =null;

        ProvaObject b =null;



        	List<String> ops = new ArrayList<String>();
        	List<ProvaObject> other = new ArrayList<ProvaObject>();

        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:364:2: (a= aterm (op= ( PLUS | MINUS ) b= aterm )* )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:365:2: a= aterm (op= ( PLUS | MINUS ) b= aterm )*
            {
            pushFollow(FOLLOW_aterm_in_expr755);
            a=aterm();

            state._fsp--;


            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:365:10: (op= ( PLUS | MINUS ) b= aterm )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==MINUS||LA23_0==PLUS) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:365:11: op= ( PLUS | MINUS ) b= aterm
            	    {
            	    op=(CommonTree)input.LT(1);

            	    if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_aterm_in_expr768);
            	    b=aterm();

            	    state._fsp--;


            	    ops.add(op.toString()); other.add(b);

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);



            		final int len = ops==null ? 0 : ops.size();
            		for( int i=0; i<len; i++ ) {
            			List list = new ArrayList();
            			list.add(ProvaConstantImpl.create(ProvaOperatorFactoryImpl.create(ops.get(i))));
            			list.add(a);
            			list.add(other.get(i));
            			a = ProvaListImpl.create(list);
            		}
            		ret = a;
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ret;
    }
    // $ANTLR end "expr"



    // $ANTLR start "aterm"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:378:1: aterm returns [ProvaObject ret] : ( (m= MINUS )? v= variable |n= number | (m= MINUS )? pjc= predicate_java_call | OPEN e= expr CLOSE ) (op= ( MULT | DIV | REM ) a= aterm )? ;
    public final ProvaObject aterm() throws RecognitionException {
        ProvaObject ret = null;


        CommonTree m=null;
        CommonTree op=null;
        ProvaObject v =null;

        ProvaConstant n =null;

        List<ProvaObject> pjc =null;

        ProvaObject e =null;

        ProvaObject a =null;


        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:379:2: ( ( (m= MINUS )? v= variable |n= number | (m= MINUS )? pjc= predicate_java_call | OPEN e= expr CLOSE ) (op= ( MULT | DIV | REM ) a= aterm )? )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:380:2: ( (m= MINUS )? v= variable |n= number | (m= MINUS )? pjc= predicate_java_call | OPEN e= expr CLOSE ) (op= ( MULT | DIV | REM ) a= aterm )?
            {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:380:2: ( (m= MINUS )? v= variable |n= number | (m= MINUS )? pjc= predicate_java_call | OPEN e= expr CLOSE )
            int alt26=4;
            switch ( input.LA(1) ) {
            case MINUS:
                {
                switch ( input.LA(2) ) {
                case DOLLARWORD:
                case TYPED_VARIABLE:
                case UCWORD:
                case USWORD:
                    {
                    alt26=1;
                    }
                    break;
                case INT_LITERAL:
                case LONG_LITERAL:
                    {
                    alt26=2;
                    }
                    break;
                case INSTANCE_JAVA_CALL:
                case STATIC_JAVA_CALL:
                    {
                    alt26=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 1, input);

                    throw nvae;

                }

                }
                break;
            case DOLLARWORD:
            case TYPED_VARIABLE:
            case UCWORD:
            case USWORD:
                {
                alt26=1;
                }
                break;
            case INT_LITERAL:
            case LONG_LITERAL:
                {
                alt26=2;
                }
                break;
            case INSTANCE_JAVA_CALL:
            case STATIC_JAVA_CALL:
                {
                alt26=3;
                }
                break;
            case OPEN:
                {
                alt26=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;

            }

            switch (alt26) {
                case 1 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:380:3: (m= MINUS )? v= variable
                    {
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:380:4: (m= MINUS )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==MINUS) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:380:4: m= MINUS
                            {
                            m=(CommonTree)match(input,MINUS,FOLLOW_MINUS_in_aterm793); 

                            }
                            break;

                    }


                    pushFollow(FOLLOW_variable_in_aterm798);
                    v=variable();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:380:25: n= number
                    {
                    pushFollow(FOLLOW_number_in_aterm804);
                    n=number();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:380:36: (m= MINUS )? pjc= predicate_java_call
                    {
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:380:37: (m= MINUS )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==MINUS) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:380:37: m= MINUS
                            {
                            m=(CommonTree)match(input,MINUS,FOLLOW_MINUS_in_aterm810); 

                            }
                            break;

                    }


                    pushFollow(FOLLOW_predicate_java_call_in_aterm815);
                    pjc=predicate_java_call();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:380:71: OPEN e= expr CLOSE
                    {
                    match(input,OPEN,FOLLOW_OPEN_in_aterm819); 

                    pushFollow(FOLLOW_expr_in_aterm823);
                    e=expr();

                    state._fsp--;


                    match(input,CLOSE,FOLLOW_CLOSE_in_aterm825); 

                    }
                    break;

            }


            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:380:90: (op= ( MULT | DIV | REM ) a= aterm )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==DIV||LA27_0==MULT||LA27_0==REM) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:380:91: op= ( MULT | DIV | REM ) a= aterm
                    {
                    op=(CommonTree)input.LT(1);

                    if ( input.LA(1)==DIV||input.LA(1)==MULT||input.LA(1)==REM ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_aterm_in_aterm841);
                    a=aterm();

                    state._fsp--;


                    }
                    break;

            }



            		if( op==null ) {
            			if( m==null ) {
            				if( pjc!=null ) {
            					List plist = new java.util.ArrayList<ProvaObject>();
            					plist.add(ProvaConstantImpl.create(ProvaOperatorFactoryImpl.createFunctionCall(pjc.get(0),pjc.get(2))));
            					plist.add(pjc.get(1));
            					plist.add(pjc.get(3));
            					ret = ProvaListImpl.create(plist);
            				} else
            					ret = v==null ? (n==null ? e : n) : v;
            			} else {
            				List list = new ArrayList();
            				list.add(ProvaConstantImpl.create(ProvaOperatorFactoryImpl.create("neg")));
            				if( pjc!=null ) {
            					List plist = new java.util.ArrayList<ProvaObject>();
            					plist.add(ProvaConstantImpl.create(ProvaOperatorFactoryImpl.createFunctionCall(pjc.get(0),pjc.get(2))));
            					plist.add(pjc.get(1));
            					plist.add(pjc.get(3));
            					list.add(ProvaListImpl.create(plist));
            				} else
            					list.add(v==null ? (n==null ? e : n) : v);
            				ret = ProvaListImpl.create(list);
            			}
            		} else {
            			List list = new ArrayList();
            			list.add(ProvaConstantImpl.create(ProvaOperatorFactoryImpl.create(op.getText())));
            			if( pjc!=null ) {
            				List plist = new java.util.ArrayList<ProvaObject>();
            				plist.add(ProvaConstantImpl.create(ProvaOperatorFactoryImpl.createFunctionCall(pjc.get(0),pjc.get(2))));
            				plist.add(pjc.get(1));
            				plist.add(pjc.get(3));
            				list.add(ProvaListImpl.create(plist));
            			} else
            				list.add(v==null ? (n==null ? e : n) : v);
            			list.add(a);
            			ret = ProvaListImpl.create(list);
            		}
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ret;
    }
    // $ANTLR end "aterm"



    // $ANTLR start "variable_or_number"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:421:1: variable_or_number returns [ProvaObject ret] : (v= variable |n= number );
    public final ProvaObject variable_or_number() throws RecognitionException {
        ProvaObject ret = null;


        ProvaObject v =null;

        ProvaConstant n =null;


        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:422:2: (v= variable |n= number )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==DOLLARWORD||LA28_0==TYPED_VARIABLE||LA28_0==UCWORD||LA28_0==USWORD) ) {
                alt28=1;
            }
            else if ( (LA28_0==INT_LITERAL||LA28_0==LONG_LITERAL||LA28_0==MINUS) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;

            }
            switch (alt28) {
                case 1 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:422:4: v= variable
                    {
                    pushFollow(FOLLOW_variable_in_variable_or_number861);
                    v=variable();

                    state._fsp--;


                    ret = v;

                    }
                    break;
                case 2 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:422:29: n= number
                    {
                    pushFollow(FOLLOW_number_in_variable_or_number869);
                    n=number();

                    state._fsp--;


                    ret = n;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ret;
    }
    // $ANTLR end "variable_or_number"



    // $ANTLR start "constructor_java_call"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:424:1: constructor_java_call returns [List<ProvaObject> ret] : (qjc= qualified_java_class |o= UCWORD ) a= args ;
    public final List<ProvaObject> constructor_java_call() throws RecognitionException {
        List<ProvaObject> ret = null;


        CommonTree o=null;
        ProvaConstant qjc =null;

        ProvaList a =null;



        	ret = new ArrayList<ProvaObject>();

        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:428:2: ( (qjc= qualified_java_class |o= UCWORD ) a= args )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:428:4: (qjc= qualified_java_class |o= UCWORD ) a= args
            {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:428:4: (qjc= qualified_java_class |o= UCWORD )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==QUALIFIED_JAVA_CLASS) ) {
                alt29=1;
            }
            else if ( (LA29_0==UCWORD) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;

            }
            switch (alt29) {
                case 1 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:428:5: qjc= qualified_java_class
                    {
                    pushFollow(FOLLOW_qualified_java_class_in_constructor_java_call892);
                    qjc=qualified_java_class();

                    state._fsp--;


                    ret.add(qjc);

                    }
                    break;
                case 2 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:429:5: o= UCWORD
                    {
                    o=(CommonTree)match(input,UCWORD,FOLLOW_UCWORD_in_constructor_java_call902); 


                    			Class<?> type = ProvaClassUtils.findClass((String) o.toString());
                    			if( type==null )
                    				throw new MismatchedTreeNodeException(0,getInput());
                    			ret.add(ProvaConstantImpl.create(type));
                    			

                    }
                    break;

            }


            pushFollow(FOLLOW_args_in_constructor_java_call910);
            a=args();

            state._fsp--;



            			ret.add(a);
            		

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ret;
    }
    // $ANTLR end "constructor_java_call"



    // $ANTLR start "binary_operator"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:439:1: binary_operator returns [String ret] : (| not_equal | LT | GT | LE | GE );
    public final String binary_operator() throws RecognitionException {
        String ret = null;


        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:440:2: (| not_equal | LT | GT | LE | GE )
            int alt30=6;
            switch ( input.LA(1) ) {
            case DOLLARWORD:
            case INSTANCE_JAVA_CALL:
            case INT_LITERAL:
            case LONG_LITERAL:
            case MINUS:
            case OPEN:
            case STATIC_JAVA_CALL:
            case TYPED_VARIABLE:
            case UCWORD:
            case USWORD:
                {
                alt30=1;
                }
                break;
            case NOT_EQUAL1:
            case NOT_EQUAL2:
                {
                alt30=2;
                }
                break;
            case LT:
                {
                alt30=3;
                }
                break;
            case GT:
                {
                alt30=4;
                }
                break;
            case LE:
                {
                alt30=5;
                }
                break;
            case GE:
                {
                alt30=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;

            }

            switch (alt30) {
                case 1 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:441:3: 
                    {
                    }
                    break;
                case 2 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:441:5: not_equal
                    {
                    pushFollow(FOLLOW_not_equal_in_binary_operator931);
                    not_equal();

                    state._fsp--;


                    ret ="ne";

                    }
                    break;
                case 3 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:442:5: LT
                    {
                    match(input,LT,FOLLOW_LT_in_binary_operator939); 

                    ret ="lt";

                    }
                    break;
                case 4 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:443:5: GT
                    {
                    match(input,GT,FOLLOW_GT_in_binary_operator947); 

                    ret ="gt";

                    }
                    break;
                case 5 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:444:5: LE
                    {
                    match(input,LE,FOLLOW_LE_in_binary_operator955); 

                    ret ="le";

                    }
                    break;
                case 6 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:445:5: GE
                    {
                    match(input,GE,FOLLOW_GE_in_binary_operator963); 

                    ret ="ge";

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ret;
    }
    // $ANTLR end "binary_operator"



    // $ANTLR start "not_equal"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:448:1: not_equal : ( NOT_EQUAL1 | NOT_EQUAL2 );
    public final void not_equal() throws RecognitionException {
        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:449:2: ( NOT_EQUAL1 | NOT_EQUAL2 )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:
            {
            if ( (input.LA(1) >= NOT_EQUAL1 && input.LA(1) <= NOT_EQUAL2) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "not_equal"



    // $ANTLR start "instance_java_call"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:452:1: instance_java_call returns [List<ProvaObject> ret] : ^( INSTANCE_JAVA_CALL ic= instance_call a= args ) ;
    public final List<ProvaObject> instance_java_call() throws RecognitionException {
        List<ProvaObject> ret = null;


        List<ProvaObject> ic =null;

        ProvaList a =null;


        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:453:2: ( ^( INSTANCE_JAVA_CALL ic= instance_call a= args ) )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:453:4: ^( INSTANCE_JAVA_CALL ic= instance_call a= args )
            {
            match(input,INSTANCE_JAVA_CALL,FOLLOW_INSTANCE_JAVA_CALL_in_instance_java_call995); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_instance_call_in_instance_java_call999);
            ic=instance_call();

            state._fsp--;


            pushFollow(FOLLOW_args_in_instance_java_call1003);
            a=args();

            state._fsp--;


            match(input, Token.UP, null); 



            			ic.add(a);
            			ret = ic;
            		

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ret;
    }
    // $ANTLR end "instance_java_call"



    // $ANTLR start "instance_call"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:460:1: instance_call returns [List<ProvaObject> ret] : v= variable l= LCWORD ;
    public final List<ProvaObject> instance_call() throws RecognitionException {
        List<ProvaObject> ret = null;


        CommonTree l=null;
        ProvaObject v =null;



        	ret = new ArrayList();
        	((stat_scope)stat_stack.peek()).inInstanceCall = true;

        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:468:2: (v= variable l= LCWORD )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:468:4: v= variable l= LCWORD
            {
            pushFollow(FOLLOW_variable_in_instance_call1034);
            v=variable();

            state._fsp--;


            l=(CommonTree)match(input,LCWORD,FOLLOW_LCWORD_in_instance_call1038); 


            			// Prefix set to "" to signal that the predicate_java_call is an instance one
            			//   but can be reclassified as a static call if v is a constant
            			//   representing a class from a default package java.lang or org.provarules
            			String s = (v instanceof ProvaVariable || v instanceof ProvaGlobalConstantImpl || (v instanceof ProvaConstant && !(((ProvaConstant) v).getObject() instanceof Class<?>)))?"":"s";
            			ret.add(ProvaConstantImpl.create(s));
            			ret.add(v);
            			ret.add(ProvaConstantImpl.create((l!=null?l.getText():null)));
            		

            }


            	((stat_scope)stat_stack.peek()).inInstanceCall = false;

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ret;
    }
    // $ANTLR end "instance_call"



    // $ANTLR start "static_call"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:479:1: static_call returns [List<ProvaObject> ret] : qjc= qualified_java_class l= LCWORD ;
    public final List<ProvaObject> static_call() throws RecognitionException {
        List<ProvaObject> ret = null;


        CommonTree l=null;
        ProvaConstant qjc =null;



        	ret = new ArrayList<ProvaObject>();

        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:483:2: (qjc= qualified_java_class l= LCWORD )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:483:4: qjc= qualified_java_class l= LCWORD
            {
            pushFollow(FOLLOW_qualified_java_class_in_static_call1061);
            qjc=qualified_java_class();

            state._fsp--;


            l=(CommonTree)match(input,LCWORD,FOLLOW_LCWORD_in_static_call1065); 


            			// Prefix set to "s" to signal that the predicate_java_call is a static one
            			ret.add(ProvaConstantImpl.create("s"));
            			ret.add(qjc);
            			ret.add(ProvaConstantImpl.create((l!=null?l.getText():null)));
            		

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ret;
    }
    // $ANTLR end "static_call"



    // $ANTLR start "query_predicate"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:491:1: query_predicate returns [String ret] : c= constant ;
    public final String query_predicate() throws RecognitionException {
        String ret = null;


        ProvaConstant c =null;


        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:492:2: (c= constant )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:492:4: c= constant
            {
            pushFollow(FOLLOW_constant_in_query_predicate1083);
            c=constant();

            state._fsp--;


            ret = (String) c.getObject();

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ret;
    }
    // $ANTLR end "query_predicate"



    // $ANTLR start "query"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:495:1: query returns [ProvaRule ret] : ^( QUERY qp= query_predicate r= relation ) ;
    public final ProvaRule query() throws RecognitionException {
        ProvaRule ret = null;


        String qp =null;

        List r =null;


        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:496:2: ( ^( QUERY qp= query_predicate r= relation ) )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:496:4: ^( QUERY qp= query_predicate r= relation )
            {
            match(input,QUERY,FOLLOW_QUERY_in_query1100); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_query_predicate_in_query1104);
            qp=query_predicate();

            state._fsp--;


            pushFollow(FOLLOW_relation_in_query1108);
            r=relation();

            state._fsp--;


            match(input, Token.UP, null); 



            			ProvaLiteral q=ProvaParserImpl.tlKB.get().generateLiteral((String) r.get(0),(ProvaList) r.get(1));
            			if( qp.equals("eval") ) {
            				ret = new ProvaRuleImpl( new ProvaLiteral[] {q});
            				ProvaLiteral fail = ProvaParserImpl.tlKB.get().generateLiteral("fail");
            				ret.addBodyLiteral(fail);
            			} else if( qp.equals("solve") ) {
            				ProvaResultSet resultSet = ProvaParserImpl.tlRS.get();
            				ret =ProvaParserImpl.tlKB.get().generateSolveGoal(resultSet, new ProvaLiteral[] {q});
            			} else throw new RuntimeException();
            		

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ret;
    }
    // $ANTLR end "query"



    // $ANTLR start "relation"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:509:1: relation returns [List ret] : ^( PREDICATE p= predicate l= list_body ) ;
    public final List relation() throws RecognitionException {
        List ret = null;


        String p =null;

        ProvaList l =null;



        	ret = new ArrayList();

        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:513:2: ( ^( PREDICATE p= predicate l= list_body ) )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:513:4: ^( PREDICATE p= predicate l= list_body )
            {
            match(input,PREDICATE,FOLLOW_PREDICATE_in_relation1131); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_predicate_in_relation1135);
            p=predicate();

            state._fsp--;


            pushFollow(FOLLOW_list_body_in_relation1139);
            l=list_body();

            state._fsp--;


            match(input, Token.UP, null); 



            			if( Character.isUpperCase(p.charAt(0)) )
            				ret.add(ProvaVariableImpl.create(p));
            			else
            				ret.add(p);
            			ret.add(l);
            		

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ret;
    }
    // $ANTLR end "relation"



    // $ANTLR start "predicate"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:531:1: predicate returns [String ret] : (l= LCWORD |u= UCWORD |s= string );
    public final String predicate() throws RecognitionException {
        String ret = null;


        CommonTree l=null;
        CommonTree u=null;
        String s =null;


        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:532:2: (l= LCWORD |u= UCWORD |s= string )
            int alt31=3;
            switch ( input.LA(1) ) {
            case LCWORD:
                {
                alt31=1;
                }
                break;
            case UCWORD:
                {
                alt31=2;
                }
                break;
            case STRING1:
            case STRING2:
                {
                alt31=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;

            }

            switch (alt31) {
                case 1 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:532:4: l= LCWORD
                    {
                    l=(CommonTree)match(input,LCWORD,FOLLOW_LCWORD_in_predicate1161); 

                    ret = l.toString();

                    }
                    break;
                case 2 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:533:5: u= UCWORD
                    {
                    u=(CommonTree)match(input,UCWORD,FOLLOW_UCWORD_in_predicate1171); 

                     ret = u.toString(); 

                    }
                    break;
                case 3 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:534:5: s= string
                    {
                    pushFollow(FOLLOW_string_in_predicate1181);
                    s=string();

                    state._fsp--;


                     ret = s; 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ret;
    }
    // $ANTLR end "predicate"



    // $ANTLR start "func"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:537:1: func returns [ProvaObject ret] : (l= LCWORD |u= UCWORD |s= string |tv= typed_variable );
    public final ProvaObject func() throws RecognitionException {
        ProvaObject ret = null;


        CommonTree l=null;
        CommonTree u=null;
        String s =null;

        ProvaObject tv =null;


        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:538:2: (l= LCWORD |u= UCWORD |s= string |tv= typed_variable )
            int alt32=4;
            switch ( input.LA(1) ) {
            case LCWORD:
                {
                alt32=1;
                }
                break;
            case UCWORD:
                {
                alt32=2;
                }
                break;
            case STRING1:
            case STRING2:
                {
                alt32=3;
                }
                break;
            case TYPED_VARIABLE:
                {
                alt32=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;

            }

            switch (alt32) {
                case 1 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:538:4: l= LCWORD
                    {
                    l=(CommonTree)match(input,LCWORD,FOLLOW_LCWORD_in_func1199); 


                    			ret =ProvaConstantImpl.create(l.toString());
                    		

                    }
                    break;
                case 2 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:541:5: u= UCWORD
                    {
                    u=(CommonTree)match(input,UCWORD,FOLLOW_UCWORD_in_func1209); 


                    			ret =ProvaVariableImpl.create(u.toString());
                    		

                    }
                    break;
                case 3 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:544:5: s= string
                    {
                    pushFollow(FOLLOW_string_in_func1219);
                    s=string();

                    state._fsp--;



                    			ret =ProvaConstantImpl.create(s);
                    		

                    }
                    break;
                case 4 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:547:5: tv= typed_variable
                    {
                    pushFollow(FOLLOW_typed_variable_in_func1229);
                    tv=typed_variable();

                    state._fsp--;



                    			ret =tv;
                    		

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ret;
    }
    // $ANTLR end "func"


    protected static class list_body_scope {
        Object rest;
    }
    protected Stack list_body_stack = new Stack();



    // $ANTLR start "list_body"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:552:1: list_body returns [ProvaList ret] : ^( LIST_BODY (t= terms (lt= list_tail )? )? ) ;
    public final ProvaList list_body() throws RecognitionException {
        list_body_stack.push(new list_body_scope());
        ProvaList ret = null;


        List<ProvaObject> t =null;

        ProvaObject lt =null;


        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:556:3: ( ^( LIST_BODY (t= terms (lt= list_tail )? )? ) )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:556:5: ^( LIST_BODY (t= terms (lt= list_tail )? )? )
            {
            match(input,LIST_BODY,FOLLOW_LIST_BODY_in_list_body1251); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:556:17: (t= terms (lt= list_tail )? )?
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==TERM) ) {
                    alt34=1;
                }
                switch (alt34) {
                    case 1 :
                        // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:556:18: t= terms (lt= list_tail )?
                        {
                        pushFollow(FOLLOW_terms_in_list_body1256);
                        t=terms();

                        state._fsp--;


                        // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:556:28: (lt= list_tail )?
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==DOLLARWORD||LA33_0==PROVA_LIST||LA33_0==TYPED_VARIABLE||LA33_0==UCWORD||LA33_0==USWORD) ) {
                            alt33=1;
                        }
                        switch (alt33) {
                            case 1 :
                                // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:556:28: lt= list_tail
                                {
                                pushFollow(FOLLOW_list_tail_in_list_body1260);
                                lt=list_tail();

                                state._fsp--;


                                }
                                break;

                        }


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }



             			if( t==null ) {
             				if( lt==null )
            	 				ret = ProvaListImpl.emptyRList;
            	 			else
            					ret = ProvaListImpl.create(new ProvaObject[0],lt);
             			} else
            				ret = ProvaListImpl.create(t.toArray(new ProvaObject[0]),lt);
            			// TODO: deal with the case when t is not ComplexTerm
             		

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            list_body_stack.pop();
        }
        return ret;
    }
    // $ANTLR end "list_body"



    // $ANTLR start "terms"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:569:1: terms returns [List<ProvaObject> ret] : ^( TERM (t= term )+ ) ;
    public final List<ProvaObject> terms() throws RecognitionException {
        List<ProvaObject> ret = null;


        ProvaObject t =null;



        	ret = new ArrayList<ProvaObject>();

        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:573:2: ( ^( TERM (t= term )+ ) )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:573:4: ^( TERM (t= term )+ )
            {
            match(input,TERM,FOLLOW_TERM_in_terms1292); 

            match(input, Token.DOWN, null); 
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:573:11: (t= term )+
            int cnt35=0;
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==DOLLARWORD||LA35_0==INT_LITERAL||LA35_0==LCWORD||LA35_0==LONG_LITERAL||LA35_0==MINUS||(LA35_0 >= PROVA_LIST && LA35_0 <= QUALIFIED_JAVA_CLASS)||(LA35_0 >= STRING1 && LA35_0 <= STRING2)||LA35_0==TYPED_VARIABLE||LA35_0==UCWORD||LA35_0==USWORD) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:573:12: t= term
            	    {
            	    pushFollow(FOLLOW_term_in_terms1297);
            	    t=term();

            	    state._fsp--;


            	    ret.add(t);

            	    }
            	    break;

            	default :
            	    if ( cnt35 >= 1 ) break loop35;
                        EarlyExitException eee =
                            new EarlyExitException(35, input);
                        throw eee;
                }
                cnt35++;
            } while (true);


            match(input, Token.UP, null); 


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ret;
    }
    // $ANTLR end "terms"



    // $ANTLR start "term"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:576:1: term returns [ProvaObject ret] : (lt= left_term |ft= func_term |map= prova_map );
    public final ProvaObject term() throws RecognitionException {
        ProvaObject ret = null;


        ProvaObject lt =null;

        ProvaObject ft =null;

        ProvaObject map =null;


        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:577:2: (lt= left_term |ft= func_term |map= prova_map )
            int alt36=3;
            alt36 = dfa36.predict(input);
            switch (alt36) {
                case 1 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:578:3: lt= left_term
                    {
                    pushFollow(FOLLOW_left_term_in_term1322);
                    lt=left_term();

                    state._fsp--;


                    ret =lt;

                    }
                    break;
                case 2 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:579:5: ft= func_term
                    {
                    pushFollow(FOLLOW_func_term_in_term1332);
                    ft=func_term();

                    state._fsp--;


                    ret =ft;

                    }
                    break;
                case 3 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:580:5: map= prova_map
                    {
                    pushFollow(FOLLOW_prova_map_in_term1342);
                    map=prova_map();

                    state._fsp--;


                    ret =map;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ret;
    }
    // $ANTLR end "term"



    // $ANTLR start "left_term"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:583:1: left_term returns [ProvaObject ret] : (c= constant |v= variable |n= number |p= prova_list );
    public final ProvaObject left_term() throws RecognitionException {
        ProvaObject ret = null;


        ProvaConstant c =null;

        ProvaObject v =null;

        ProvaConstant n =null;

        ProvaList p =null;


        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:584:2: (c= constant |v= variable |n= number |p= prova_list )
            int alt37=4;
            switch ( input.LA(1) ) {
            case LCWORD:
            case QUALIFIED_JAVA_CLASS:
            case STRING1:
            case STRING2:
                {
                alt37=1;
                }
                break;
            case DOLLARWORD:
            case TYPED_VARIABLE:
            case UCWORD:
            case USWORD:
                {
                alt37=2;
                }
                break;
            case INT_LITERAL:
            case LONG_LITERAL:
            case MINUS:
                {
                alt37=3;
                }
                break;
            case PROVA_LIST:
                {
                alt37=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;

            }

            switch (alt37) {
                case 1 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:584:4: c= constant
                    {
                    pushFollow(FOLLOW_constant_in_left_term1360);
                    c=constant();

                    state._fsp--;


                    ret =c;

                    }
                    break;
                case 2 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:585:5: v= variable
                    {
                    pushFollow(FOLLOW_variable_in_left_term1370);
                    v=variable();

                    state._fsp--;


                    ret =v;

                    }
                    break;
                case 3 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:586:5: n= number
                    {
                    pushFollow(FOLLOW_number_in_left_term1380);
                    n=number();

                    state._fsp--;


                    ret =n;

                    }
                    break;
                case 4 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:587:5: p= prova_list
                    {
                    pushFollow(FOLLOW_prova_list_in_left_term1390);
                    p=prova_list();

                    state._fsp--;


                    ret =p;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ret;
    }
    // $ANTLR end "left_term"



    // $ANTLR start "right_term"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:590:1: right_term returns [ProvaObject ret] : ( ( (m= MINUS )? (c= constant |v= variable ) ) |n= number |p= prova_list );
    public final ProvaObject right_term() throws RecognitionException {
        ProvaObject ret = null;


        CommonTree m=null;
        ProvaConstant c =null;

        ProvaObject v =null;

        ProvaConstant n =null;

        ProvaList p =null;



        	((binary_operation_scope)binary_operation_stack.peek()).op ="";

        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:598:2: ( ( (m= MINUS )? (c= constant |v= variable ) ) |n= number |p= prova_list )
            int alt40=3;
            switch ( input.LA(1) ) {
            case MINUS:
                {
                int LA40_1 = input.LA(2);

                if ( (LA40_1==DOLLARWORD||LA40_1==LCWORD||LA40_1==QUALIFIED_JAVA_CLASS||(LA40_1 >= STRING1 && LA40_1 <= STRING2)||LA40_1==TYPED_VARIABLE||LA40_1==UCWORD||LA40_1==USWORD) ) {
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
            case QUALIFIED_JAVA_CLASS:
            case STRING1:
            case STRING2:
            case TYPED_VARIABLE:
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
            case PROVA_LIST:
                {
                alt40=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;

            }

            switch (alt40) {
                case 1 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:598:4: ( (m= MINUS )? (c= constant |v= variable ) )
                    {
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:598:4: ( (m= MINUS )? (c= constant |v= variable ) )
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:598:5: (m= MINUS )? (c= constant |v= variable )
                    {
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:598:6: (m= MINUS )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==MINUS) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:598:6: m= MINUS
                            {
                            m=(CommonTree)match(input,MINUS,FOLLOW_MINUS_in_right_term1419); 

                            }
                            break;

                    }


                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:598:14: (c= constant |v= variable )
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==LCWORD||LA39_0==QUALIFIED_JAVA_CLASS||(LA39_0 >= STRING1 && LA39_0 <= STRING2)) ) {
                        alt39=1;
                    }
                    else if ( (LA39_0==DOLLARWORD||LA39_0==TYPED_VARIABLE||LA39_0==UCWORD||LA39_0==USWORD) ) {
                        alt39=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 39, 0, input);

                        throw nvae;

                    }
                    switch (alt39) {
                        case 1 :
                            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:598:15: c= constant
                            {
                            pushFollow(FOLLOW_constant_in_right_term1425);
                            c=constant();

                            state._fsp--;


                            ret =c;

                            }
                            break;
                        case 2 :
                            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:598:38: v= variable
                            {
                            pushFollow(FOLLOW_variable_in_right_term1433);
                            v=variable();

                            state._fsp--;


                            ret =v;

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:599:5: n= number
                    {
                    pushFollow(FOLLOW_number_in_right_term1445);
                    n=number();

                    state._fsp--;


                    ret =n;

                    }
                    break;
                case 3 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:600:5: p= prova_list
                    {
                    pushFollow(FOLLOW_prova_list_in_right_term1455);
                    p=prova_list();

                    state._fsp--;


                    ret =p;

                    }
                    break;

            }

            if(m!=null )
            	((binary_operation_scope)binary_operation_stack.peek()).op ="minus";

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ret;
    }
    // $ANTLR end "right_term"


    protected static class qualified_java_class_scope {
        String s;
    }
    protected Stack qualified_java_class_stack = new Stack();



    // $ANTLR start "qualified_java_class"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:602:1: qualified_java_class returns [ProvaConstant ret] : ^( QUALIFIED_JAVA_CLASS ( (l= LCWORD d= DOT ) )+ u= UCWORD ) ;
    public final ProvaConstant qualified_java_class() throws RecognitionException {
        qualified_java_class_stack.push(new qualified_java_class_scope());
        ProvaConstant ret = null;


        CommonTree l=null;
        CommonTree d=null;
        CommonTree u=null;


        	((qualified_java_class_scope)qualified_java_class_stack.peek()).s = "";

        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:615:2: ( ^( QUALIFIED_JAVA_CLASS ( (l= LCWORD d= DOT ) )+ u= UCWORD ) )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:615:4: ^( QUALIFIED_JAVA_CLASS ( (l= LCWORD d= DOT ) )+ u= UCWORD )
            {
            match(input,QUALIFIED_JAVA_CLASS,FOLLOW_QUALIFIED_JAVA_CLASS_in_qualified_java_class1485); 

            match(input, Token.DOWN, null); 
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:615:27: ( (l= LCWORD d= DOT ) )+
            int cnt41=0;
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==LCWORD) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:615:28: (l= LCWORD d= DOT )
            	    {
            	    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:615:28: (l= LCWORD d= DOT )
            	    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:615:29: l= LCWORD d= DOT
            	    {
            	    l=(CommonTree)match(input,LCWORD,FOLLOW_LCWORD_in_qualified_java_class1491); 

            	    d=(CommonTree)match(input,DOT,FOLLOW_DOT_in_qualified_java_class1495); 

            	    }


            	    ((qualified_java_class_scope)qualified_java_class_stack.peek()).s+=l.toString()+d.toString();

            	    }
            	    break;

            	default :
            	    if ( cnt41 >= 1 ) break loop41;
                        EarlyExitException eee =
                            new EarlyExitException(41, input);
                        throw eee;
                }
                cnt41++;
            } while (true);


            u=(CommonTree)match(input,UCWORD,FOLLOW_UCWORD_in_qualified_java_class1504); 

            match(input, Token.UP, null); 



            			((qualified_java_class_scope)qualified_java_class_stack.peek()).s+=u.toString();
            		

            }


            	Class type = ProvaClassUtils.findClass((String) ((qualified_java_class_scope)qualified_java_class_stack.peek()).s);
            	if( type==null )
            		throw new MismatchedTreeNodeException(0,getInput());
            	ret =ProvaConstantImpl.create(/*((qualified_java_class_scope)qualified_java_class_stack.peek()).s*/type);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            qualified_java_class_stack.pop();
        }
        return ret;
    }
    // $ANTLR end "qualified_java_class"



    // $ANTLR start "func_term"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:620:1: func_term returns [ProvaObject ret] : f= func a= args ;
    public final ProvaObject func_term() throws RecognitionException {
        ProvaObject ret = null;


        ProvaObject f =null;

        ProvaList a =null;


        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:621:2: (f= func a= args )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:621:4: f= func a= args
            {
            pushFollow(FOLLOW_func_in_func_term1524);
            f=func();

            state._fsp--;


            pushFollow(FOLLOW_args_in_func_term1528);
            a=args();

            state._fsp--;



            			List<ProvaObject> fixed = new ArrayList<ProvaObject>();
            			fixed.add(f);
            			fixed.addAll(Arrays.asList(a.getFixed()));
            			ret=ProvaListImpl.create((ProvaObject[]) fixed.toArray(new ProvaObject[0]),a.getTail());
            //			ret =reagent.cplx(reagent.flist,a,f);
            		

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ret;
    }
    // $ANTLR end "func_term"



    // $ANTLR start "typed_variable"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:630:1: typed_variable returns [ProvaObject ret] : ( ^( TYPED_VARIABLE q= qualified_java_class (w= LCWORD |w= UCWORD ) ) | ^( TYPED_VARIABLE u= UCWORD l= LCWORD ) | ^( TYPED_VARIABLE u= UCWORD w= UCWORD ) );
    public final ProvaObject typed_variable() throws RecognitionException {
        ProvaObject ret = null;


        CommonTree w=null;
        CommonTree u=null;
        CommonTree l=null;
        ProvaConstant q =null;


        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:631:2: ( ^( TYPED_VARIABLE q= qualified_java_class (w= LCWORD |w= UCWORD ) ) | ^( TYPED_VARIABLE u= UCWORD l= LCWORD ) | ^( TYPED_VARIABLE u= UCWORD w= UCWORD ) )
            int alt43=3;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==TYPED_VARIABLE) ) {
                int LA43_1 = input.LA(2);

                if ( (LA43_1==DOWN) ) {
                    int LA43_2 = input.LA(3);

                    if ( (LA43_2==UCWORD) ) {
                        int LA43_3 = input.LA(4);

                        if ( (LA43_3==LCWORD) ) {
                            alt43=2;
                        }
                        else if ( (LA43_3==UCWORD) ) {
                            alt43=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 43, 3, input);

                            throw nvae;

                        }
                    }
                    else if ( (LA43_2==QUALIFIED_JAVA_CLASS) ) {
                        alt43=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 43, 2, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 43, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;

            }
            switch (alt43) {
                case 1 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:631:4: ^( TYPED_VARIABLE q= qualified_java_class (w= LCWORD |w= UCWORD ) )
                    {
                    match(input,TYPED_VARIABLE,FOLLOW_TYPED_VARIABLE_in_typed_variable1546); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_qualified_java_class_in_typed_variable1550);
                    q=qualified_java_class();

                    state._fsp--;


                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:631:44: (w= LCWORD |w= UCWORD )
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==LCWORD) ) {
                        alt42=1;
                    }
                    else if ( (LA42_0==UCWORD) ) {
                        alt42=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 42, 0, input);

                        throw nvae;

                    }
                    switch (alt42) {
                        case 1 :
                            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:631:45: w= LCWORD
                            {
                            w=(CommonTree)match(input,LCWORD,FOLLOW_LCWORD_in_typed_variable1555); 

                            }
                            break;
                        case 2 :
                            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:631:54: w= UCWORD
                            {
                            w=(CommonTree)match(input,UCWORD,FOLLOW_UCWORD_in_typed_variable1559); 

                            }
                            break;

                    }


                    match(input, Token.UP, null); 



                    			Class<?> type = (Class<?>) q.getObject();
                    			Object field = null;
                    			try {
                    				field = type.getField(w.toString()).get(null);
                    			} catch( Exception e1 ) {}
                    			if( field!=null )
                    				ret =ProvaConstantImpl.create(field);
                    			else
                    				ret =ProvaVariableImpl.create(w.toString(),type);
                    		

                    }
                    break;
                case 2 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:643:5: ^( TYPED_VARIABLE u= UCWORD l= LCWORD )
                    {
                    match(input,TYPED_VARIABLE,FOLLOW_TYPED_VARIABLE_in_typed_variable1573); 

                    match(input, Token.DOWN, null); 
                    u=(CommonTree)match(input,UCWORD,FOLLOW_UCWORD_in_typed_variable1577); 

                    l=(CommonTree)match(input,LCWORD,FOLLOW_LCWORD_in_typed_variable1581); 

                    match(input, Token.UP, null); 



                    			try {
                    				Class<?> type = ProvaClassUtils.findClass("org.provarules."+u.toString());
                    				if( type==null ) {
                    					type = ProvaClassUtils.findClass("java.lang."+u.toString());
                    					if( type==null )
                    						throw new MismatchedTreeNodeException(0,getInput());
                    				}
                    				Object field;
                    				try {
                    					field = type.getField(l.toString()).get(null);
                    				} catch( Exception e1 ) {
                    					throw new MismatchedTreeNodeException(0,getInput());
                    				}
                    				ret =ProvaConstantImpl.create(field);
                    			} catch( Exception e ) {
                    				throw new MismatchedTreeNodeException(0,getInput());
                    			}
                    		

                    }
                    break;
                case 3 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:663:5: ^( TYPED_VARIABLE u= UCWORD w= UCWORD )
                    {
                    match(input,TYPED_VARIABLE,FOLLOW_TYPED_VARIABLE_in_typed_variable1594); 

                    match(input, Token.DOWN, null); 
                    u=(CommonTree)match(input,UCWORD,FOLLOW_UCWORD_in_typed_variable1598); 

                    w=(CommonTree)match(input,UCWORD,FOLLOW_UCWORD_in_typed_variable1602); 

                    match(input, Token.UP, null); 



                    			try {
                    				Class<?> type = ProvaClassUtils.findClass("org.provarules."+u.toString());
                    				if( type==null ) {
                    					type = ProvaClassUtils.findClass("java.lang."+u.toString());
                    					if( type==null )
                    						throw new MismatchedTreeNodeException(0,getInput());
                    				}
                    				Object field = null;
                    				try {
                    					field = type.getField(w.toString()).get(null);
                    				} catch( Exception e1 ) {}
                    				if( field!=null )
                    					ret =ProvaConstantImpl.create(field);
                    				else
                    					ret =ProvaVariableImpl.create(w.toString(),type);
                    			} catch( Exception e ) {
                    				throw new MismatchedTreeNodeException(0,getInput());
                    			}
                    		

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ret;
    }
    // $ANTLR end "typed_variable"



    // $ANTLR start "prova_list"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:685:1: prova_list returns [ProvaList ret] : ^( PROVA_LIST l= list_body ) ;
    public final ProvaList prova_list() throws RecognitionException {
        ProvaList ret = null;


        ProvaList l =null;


        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:686:2: ( ^( PROVA_LIST l= list_body ) )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:686:4: ^( PROVA_LIST l= list_body )
            {
            match(input,PROVA_LIST,FOLLOW_PROVA_LIST_in_prova_list1621); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_list_body_in_prova_list1625);
            l=list_body();

            state._fsp--;


            match(input, Token.UP, null); 


            ret =l;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ret;
    }
    // $ANTLR end "prova_list"



    // $ANTLR start "prova_map"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:689:1: prova_map returns [ProvaObject ret] : ^( PROVA_MAP (kv= key_value )* ) ;
    public final ProvaObject prova_map() throws RecognitionException {
        ProvaObject ret = null;


        List<Object> kv =null;



        	Map<String,Object> map = new HashMap<String,Object>();

        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:696:2: ( ^( PROVA_MAP (kv= key_value )* ) )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:696:4: ^( PROVA_MAP (kv= key_value )* )
            {
            match(input,PROVA_MAP,FOLLOW_PROVA_MAP_in_prova_map1653); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:696:16: (kv= key_value )*
                loop44:
                do {
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==KEY_VALUE) ) {
                        alt44=1;
                    }


                    switch (alt44) {
                	case 1 :
                	    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:696:17: kv= key_value
                	    {
                	    pushFollow(FOLLOW_key_value_in_prova_map1658);
                	    kv=key_value();

                	    state._fsp--;


                	    map.put(kv.get(0).toString(),kv.get(1));

                	    }
                	    break;

                	default :
                	    break loop44;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }


            }


            	ret = ProvaMapImpl.create(map);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ret;
    }
    // $ANTLR end "prova_map"



    // $ANTLR start "key_value"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:699:1: key_value returns [List<Object> ret] : ^( KEY_VALUE (k= mstring v= term ) ) ;
    public final List<Object> key_value() throws RecognitionException {
        List<Object> ret = null;


        String k =null;

        ProvaObject v =null;



        	ret = new ArrayList<Object>();

        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:703:2: ( ^( KEY_VALUE (k= mstring v= term ) ) )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:703:4: ^( KEY_VALUE (k= mstring v= term ) )
            {
            match(input,KEY_VALUE,FOLLOW_KEY_VALUE_in_key_value1684); 

            match(input, Token.DOWN, null); 
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:703:16: (k= mstring v= term )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:703:17: k= mstring v= term
            {
            pushFollow(FOLLOW_mstring_in_key_value1689);
            k=mstring();

            state._fsp--;


            pushFollow(FOLLOW_term_in_key_value1693);
            v=term();

            state._fsp--;


            }


            ret.add(k); ret.add(v);

            match(input, Token.UP, null); 


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ret;
    }
    // $ANTLR end "key_value"



    // $ANTLR start "variable"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:706:1: variable returns [ProvaObject ret] : (u= UCWORD |usw= USWORD |tv= typed_variable |gc= DOLLARWORD );
    public final ProvaObject variable() throws RecognitionException {
        ProvaObject ret = null;


        CommonTree u=null;
        CommonTree usw=null;
        CommonTree gc=null;
        ProvaObject tv =null;


        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:712:2: (u= UCWORD |usw= USWORD |tv= typed_variable |gc= DOLLARWORD )
            int alt45=4;
            switch ( input.LA(1) ) {
            case UCWORD:
                {
                alt45=1;
                }
                break;
            case USWORD:
                {
                alt45=2;
                }
                break;
            case TYPED_VARIABLE:
                {
                alt45=3;
                }
                break;
            case DOLLARWORD:
                {
                alt45=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;

            }

            switch (alt45) {
                case 1 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:713:3: u= UCWORD
                    {
                    u=(CommonTree)match(input,UCWORD,FOLLOW_UCWORD_in_variable1722); 


                    //			// Allow class lookup from pseudo-instance call
                    //			Class<?> type = ProvaClassUtils.findClass("java.lang."+u);
                    //			if( type!=null )
                    //				ret =ProvaConstantImpl.create(type);
                    //			else
                    			ret =ProvaVariableImpl.create(u.toString());
                    		

                    }
                    break;
                case 2 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:721:5: usw= USWORD
                    {
                    usw=(CommonTree)match(input,USWORD,FOLLOW_USWORD_in_variable1732); 


                    			if( usw.toString().length()==1 )
                    				ret =ProvaVariableImpl.create(usw.toString());
                    			else
                    				ret =ProvaConstantImpl.create(ProvaParserImpl.tlObjects.get()[Integer.parseInt(usw.toString().substring(1))]);
                    		

                    }
                    break;
                case 3 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:727:5: tv= typed_variable
                    {
                    pushFollow(FOLLOW_typed_variable_in_variable1742);
                    tv=typed_variable();

                    state._fsp--;


                    ret =tv;

                    }
                    break;
                case 4 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:728:5: gc= DOLLARWORD
                    {
                    gc=(CommonTree)match(input,DOLLARWORD,FOLLOW_DOLLARWORD_in_variable1752); 

                    ret =ProvaParserImpl.tlKB.get().generateGlobalConstant(gc.toString());

                    }
                    break;

            }

            	if( ret instanceof ProvaVariable ) {
            		((stat_scope)stat_stack.peek()).vars.add(ret);
            	}

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ret;
    }
    // $ANTLR end "variable"



    // $ANTLR start "args"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:731:1: args returns [ProvaList ret] : ^( ARGS lb= list_body ) ;
    public final ProvaList args() throws RecognitionException {
        ProvaList ret = null;


        ProvaList lb =null;


        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:732:2: ( ^( ARGS lb= list_body ) )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:732:4: ^( ARGS lb= list_body )
            {
            match(input,ARGS,FOLLOW_ARGS_in_args1770); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_list_body_in_args1774);
            lb=list_body();

            state._fsp--;


            match(input, Token.UP, null); 


            ret =lb;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ret;
    }
    // $ANTLR end "args"



    // $ANTLR start "list_tail"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:735:1: list_tail returns [ProvaObject ret] : (v= variable |p= prova_list );
    public final ProvaObject list_tail() throws RecognitionException {
        ProvaObject ret = null;


        ProvaObject v =null;

        ProvaList p =null;



        	((stat_scope)stat_stack.peek()).inRest = true;

        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:742:2: (v= variable |p= prova_list )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==DOLLARWORD||LA46_0==TYPED_VARIABLE||LA46_0==UCWORD||LA46_0==USWORD) ) {
                alt46=1;
            }
            else if ( (LA46_0==PROVA_LIST) ) {
                alt46=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;

            }
            switch (alt46) {
                case 1 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:742:4: v= variable
                    {
                    pushFollow(FOLLOW_variable_in_list_tail1803);
                    v=variable();

                    state._fsp--;



                    			ret =v;
                    		

                    }
                    break;
                case 2 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:745:5: p= prova_list
                    {
                    pushFollow(FOLLOW_prova_list_in_list_tail1813);
                    p=prova_list();

                    state._fsp--;


                    ret =p;

                    }
                    break;

            }

            	((stat_scope)stat_stack.peek()).inRest = false;

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ret;
    }
    // $ANTLR end "list_tail"



    // $ANTLR start "constant"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:748:1: constant returns [ProvaConstant ret] : (d= LCWORD |s= string |qjc= qualified_java_class );
    public final ProvaConstant constant() throws RecognitionException {
        ProvaConstant ret = null;


        CommonTree d=null;
        String s =null;

        ProvaConstant qjc =null;


        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:749:2: (d= LCWORD |s= string |qjc= qualified_java_class )
            int alt47=3;
            switch ( input.LA(1) ) {
            case LCWORD:
                {
                alt47=1;
                }
                break;
            case STRING1:
            case STRING2:
                {
                alt47=2;
                }
                break;
            case QUALIFIED_JAVA_CLASS:
                {
                alt47=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;

            }

            switch (alt47) {
                case 1 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:752:3: d= LCWORD
                    {
                    d=(CommonTree)match(input,LCWORD,FOLLOW_LCWORD_in_constant1840); 


                    			Object sd = d.toString();
                    			if( "false".equals(sd) )
                    				ret =ProvaConstantImpl.create(java.lang.Boolean.FALSE);
                    			else if ("true".equals(sd) )
                    				ret =ProvaConstantImpl.create(java.lang.Boolean.TRUE);
                    			else
                    				ret =ProvaParserImpl.tlKB.get().generateGlobalConstant((String) sd);
                    		

                    }
                    break;
                case 2 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:761:5: s= string
                    {
                    pushFollow(FOLLOW_string_in_constant1850);
                    s=string();

                    state._fsp--;


                    ret =ProvaConstantImpl.create(s.toString());

                    }
                    break;
                case 3 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:762:5: qjc= qualified_java_class
                    {
                    pushFollow(FOLLOW_qualified_java_class_in_constant1860);
                    qjc=qualified_java_class();

                    state._fsp--;



                    			ret = qjc;
                    			// A minor hack:
                    			// 	we need the class itself, not its name, to be inserted
                    			// This is guaranteed to succeed
                    			//Class type = ProvaClassUtils.findClass((String) qjc.getObject());
                    			//ret = ProvaConstantImpl.create(type);
                    		

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ret;
    }
    // $ANTLR end "constant"



    // $ANTLR start "string"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:776:1: string returns [String ret] : (s1= STRING1 |s2= STRING2 );
    public final String string() throws RecognitionException {
        String ret = null;


        CommonTree s1=null;
        CommonTree s2=null;

        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:777:2: (s1= STRING1 |s2= STRING2 )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==STRING1) ) {
                alt48=1;
            }
            else if ( (LA48_0==STRING2) ) {
                alt48=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;

            }
            switch (alt48) {
                case 1 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:777:4: s1= STRING1
                    {
                    s1=(CommonTree)match(input,STRING1,FOLLOW_STRING1_in_string1882); 

                    ret =s1.toString().substring(1,s1.toString().length()-1);

                    }
                    break;
                case 2 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:778:5: s2= STRING2
                    {
                    s2=(CommonTree)match(input,STRING2,FOLLOW_STRING2_in_string1892); 

                    ret =s2.toString().substring(1,s2.toString().length()-1);

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ret;
    }
    // $ANTLR end "string"



    // $ANTLR start "mstring"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:781:1: mstring returns [String ret] : (s= string |l= LCWORD );
    public final String mstring() throws RecognitionException {
        String ret = null;


        CommonTree l=null;
        String s =null;


        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:782:2: (s= string |l= LCWORD )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( ((LA49_0 >= STRING1 && LA49_0 <= STRING2)) ) {
                alt49=1;
            }
            else if ( (LA49_0==LCWORD) ) {
                alt49=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;

            }
            switch (alt49) {
                case 1 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:782:4: s= string
                    {
                    pushFollow(FOLLOW_string_in_mstring1910);
                    s=string();

                    state._fsp--;


                    ret =s;

                    }
                    break;
                case 2 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:783:5: l= LCWORD
                    {
                    l=(CommonTree)match(input,LCWORD,FOLLOW_LCWORD_in_mstring1920); 

                    ret =l.toString();

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ret;
    }
    // $ANTLR end "mstring"



    // $ANTLR start "pos_number"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:786:1: pos_number returns [Number ret] : (i= INT_LITERAL |l= LONG_LITERAL |f= float_literal );
    public final Vector<Number> pos_number() throws RecognitionException {
        Vector<Number> ret = new Vector<>(1);


        CommonTree i=null;
        CommonTree l=null;
        String f =null;


        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:787:2: (i= INT_LITERAL |l= LONG_LITERAL |f= float_literal )
            int alt50=3;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==INT_LITERAL) ) {
                int LA50_1 = input.LA(2);

                if ( (LA50_1==DOT) ) {
                    alt50=3;
                }
                else if ( (LA50_1==EOF||LA50_1==UP||LA50_1==CLOSE||LA50_1==DIV||LA50_1==DOLLARWORD||LA50_1==EQUAL||(LA50_1 >= GE && LA50_1 <= GUARD)||(LA50_1 >= INSTANCE_JAVA_CALL && LA50_1 <= INT_LITERAL)||(LA50_1 >= LCWORD && LA50_1 <= LE)||(LA50_1 >= LONG_LITERAL && LA50_1 <= LT)||LA50_1==MINUS||LA50_1==MULT||(LA50_1 >= NOT_EQUAL1 && LA50_1 <= PLUS)||(LA50_1 >= PROVA_LIST && LA50_1 <= QUALIFIED_JAVA_CLASS)||LA50_1==REM||(LA50_1 >= STATIC_JAVA_CALL && LA50_1 <= STRING2)||LA50_1==TYPED_VARIABLE||LA50_1==UCWORD||LA50_1==USWORD) ) {
                    alt50=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 50, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA50_0==LONG_LITERAL) ) {
                alt50=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;

            }
            switch (alt50) {
                case 1 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:787:4: i= INT_LITERAL
                    {
                    i=(CommonTree)match(input,INT_LITERAL,FOLLOW_INT_LITERAL_in_pos_number1938); 

                    ret.add(Integer.parseInt(i.toString()));

                    }
                    break;
                case 2 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:788:5: l= LONG_LITERAL
                    {
                    l=(CommonTree)match(input,LONG_LITERAL,FOLLOW_LONG_LITERAL_in_pos_number1948); 

                    String s = l.toString();
                    ret.add(Long.parseLong(s.substring(0,s.length()-1)));

                    }
                    break;
                case 3 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:789:5: f= float_literal
                    {
                    pushFollow(FOLLOW_float_literal_in_pos_number1958);
                    f=float_literal();

                    state._fsp--;


                    ret.add(Double.parseDouble(f.toString()));

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ret;
    }
    // $ANTLR end "pos_number"



    // $ANTLR start "float_literal"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:793:1: float_literal returns [String ret] : i1= INT_LITERAL DOT i2= INT_LITERAL (e= EXPONENT )? ;
    public final String float_literal() throws RecognitionException {
        String ret = null;


        CommonTree i1=null;
        CommonTree i2=null;
        CommonTree e=null;

        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:794:2: (i1= INT_LITERAL DOT i2= INT_LITERAL (e= EXPONENT )? )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:794:4: i1= INT_LITERAL DOT i2= INT_LITERAL (e= EXPONENT )?
            {
            i1=(CommonTree)match(input,INT_LITERAL,FOLLOW_INT_LITERAL_in_float_literal1978); 

            match(input,DOT,FOLLOW_DOT_in_float_literal1980); 

            i2=(CommonTree)match(input,INT_LITERAL,FOLLOW_INT_LITERAL_in_float_literal1984); 

            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:794:38: (e= EXPONENT )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==EXPONENT) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:794:39: e= EXPONENT
                    {
                    e=(CommonTree)match(input,EXPONENT,FOLLOW_EXPONENT_in_float_literal1989); 

                    }
                    break;

            }



            			ret =i1.toString()+'.'+i2.toString();
            			if( e!=null )
            				ret+=e.toString();
            		

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ret;
    }
    // $ANTLR end "float_literal"



    // $ANTLR start "number"
    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:802:1: number returns [ProvaConstant ret] : (m= '-' )? p= pos_number ;
    public final ProvaConstant number() throws RecognitionException {
        ProvaConstant ret = null;


        CommonTree m=null;
        Number p =null;


        try {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:803:2: ( (m= '-' )? p= pos_number )
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:803:4: (m= '-' )? p= pos_number
            {
            // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:803:5: (m= '-' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==MINUS) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // C:\\home\\kozlenkova\\git\\prova\\src\\main\\antlr\\org\\provarules\\parser\\ProvaWalker2.g:803:5: m= '-'
                    {
                    m=(CommonTree)match(input,MINUS,FOLLOW_MINUS_in_number2011); 

                    }
                    break;

            }


            pushFollow(FOLLOW_pos_number_in_number2016);
            p=pos_number().firstElement();

            state._fsp--;



            			if( m==null ) {
            				ret =ProvaConstantImpl.create(p);
            			} else if( p instanceof Integer ) {
            				ret =ProvaConstantImpl.create(-((Integer) p));
            			} else if( p instanceof Long ) {
            				ret =ProvaConstantImpl.create(-((Long) p));
            			} else if( p instanceof Double ) {
            				ret =ProvaConstantImpl.create(-((Double) p));
            			}
            		

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ret;
    }
    // $ANTLR end "number"

    // Delegated rules


    protected DFA7 dfa7 = new DFA7(this);
    protected DFA21 dfa21 = new DFA21(this);
    protected DFA36 dfa36 = new DFA36(this);
    static final String DFA7_eotS =
        "\26\uffff";
    static final String DFA7_eofS =
        "\26\uffff";
    static final String DFA7_minS =
        "\1\13\1\2\1\43\1\2\2\uffff\1\4\1\2\1\43\5\3\1\37\3\3\1\37\1\43\2"+
        "\3";
    static final String DFA7_maxS =
        "\1\13\1\2\1\62\1\2\2\uffff\1\4\1\2\1\43\5\102\1\47\2\102\1\4\1\37"+
        "\1\62\2\102";
    static final String DFA7_acceptS =
        "\4\uffff\1\1\1\2\20\uffff";
    static final String DFA7_specialS =
        "\26\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\1",
            "\1\2",
            "\1\5\5\uffff\1\3\10\uffff\1\4",
            "\1\6",
            "",
            "",
            "\1\7",
            "\1\10",
            "\1\11",
            "\1\21\33\uffff\1\17\3\uffff\1\12\3\uffff\1\20\2\uffff\1\16"+
            "\22\uffff\1\14\1\15\3\uffff\1\13",
            "\1\21\33\uffff\1\17\3\uffff\1\12\3\uffff\1\20\2\uffff\1\16"+
            "\22\uffff\1\14\1\15\3\uffff\1\13",
            "\1\21\33\uffff\1\17\3\uffff\1\12\3\uffff\1\20\2\uffff\1\16"+
            "\22\uffff\1\14\1\15\3\uffff\1\13",
            "\1\21\33\uffff\1\17\3\uffff\1\12\3\uffff\1\20\2\uffff\1\16"+
            "\22\uffff\1\14\1\15\3\uffff\1\13",
            "\1\21\33\uffff\1\17\3\uffff\1\12\3\uffff\1\20\2\uffff\1\16"+
            "\22\uffff\1\14\1\15\3\uffff\1\13",
            "\1\17\7\uffff\1\20",
            "\1\21\20\uffff\1\22\12\uffff\1\17\3\uffff\1\12\3\uffff\1\20"+
            "\2\uffff\1\16\22\uffff\1\14\1\15\3\uffff\1\13",
            "\1\21\33\uffff\1\17\3\uffff\1\12\3\uffff\1\20\2\uffff\1\16"+
            "\22\uffff\1\14\1\15\3\uffff\1\13",
            "\1\23\1\7",
            "\1\24",
            "\1\5\16\uffff\1\4",
            "\1\21\22\uffff\1\25\10\uffff\1\17\3\uffff\1\12\3\uffff\1\20"+
            "\2\uffff\1\16\22\uffff\1\14\1\15\3\uffff\1\13",
            "\1\21\33\uffff\1\17\3\uffff\1\12\3\uffff\1\20\2\uffff\1\16"+
            "\22\uffff\1\14\1\15\3\uffff\1\13"
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "116:1: clause returns [ProvaRule ret] : ( ^(cl= CLAUSE (m= metadata )? r= relation (l= literals )? ) | ^(cl= CLAUSE (m= metadata )? pred= LCWORD params= list_body result= list_body (l= literals )? ) );";
        }
    }
    static final String DFA21_eotS =
        "\14\uffff";
    static final String DFA21_eofS =
        "\14\uffff";
    static final String DFA21_minS =
        "\1\23\1\2\1\3\3\uffff\1\43\1\uffff\1\24\1\43\2\3";
    static final String DFA21_maxS =
        "\1\104\1\2\1\70\3\uffff\1\43\1\uffff\1\24\1\102\1\3\1\34";
    static final String DFA21_acceptS =
        "\3\uffff\1\2\1\3\1\4\1\uffff\1\1\4\uffff";
    static final String DFA21_specialS =
        "\14\uffff}>";
    static final String[] DFA21_transitionS = {
            "\1\5\12\uffff\2\5\3\uffff\1\4\3\uffff\1\5\2\uffff\1\5\5\uffff"+
            "\1\5\2\uffff\1\3\1\uffff\1\1\6\uffff\1\5\2\4\1\uffff\1\5\1\uffff"+
            "\1\2\1\uffff\1\5",
            "\1\6",
            "\1\5\1\uffff\1\7\13\uffff\1\5\12\uffff\1\5\15\uffff\1\5\1\uffff"+
            "\1\5\4\uffff\1\5\6\uffff\1\5",
            "",
            "",
            "",
            "\1\10",
            "",
            "\1\11",
            "\1\10\36\uffff\1\12",
            "\1\13",
            "\1\4\1\uffff\1\7\26\uffff\1\4"
    };

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "303:10: (cjc= constructor_java_call |pl= prova_list |c= constant |e= expr )";
        }
    }
    static final String DFA36_eotS =
        "\30\uffff";
    static final String DFA36_eofS =
        "\30\uffff";
    static final String DFA36_minS =
        "\1\23\3\3\1\uffff\1\3\1\2\2\uffff\1\65\1\43\1\2\2\3\1\43\2\3\1\24"+
        "\1\43\1\3\1\43\3\3";
    static final String DFA36_maxS =
        "\4\104\1\uffff\1\104\1\2\2\uffff\2\102\1\2\2\3\1\43\2\104\1\24\1"+
        "\102\1\3\1\102\2\3\1\104";
    static final String DFA36_acceptS =
        "\4\uffff\1\1\2\uffff\1\3\1\2\17\uffff";
    static final String DFA36_specialS =
        "\30\uffff}>";
    static final String[] DFA36_transitionS = {
            "\1\4\13\uffff\1\4\3\uffff\1\1\3\uffff\1\4\2\uffff\1\4\10\uffff"+
            "\1\4\1\7\1\4\7\uffff\1\2\1\3\1\uffff\1\6\1\uffff\1\5\1\uffff"+
            "\1\4",
            "\1\4\1\uffff\1\10\15\uffff\1\4\13\uffff\1\4\3\uffff\1\4\3\uffff"+
            "\1\4\2\uffff\1\4\10\uffff\3\4\7\uffff\2\4\1\uffff\1\4\1\uffff"+
            "\1\4\1\uffff\1\4",
            "\1\4\1\uffff\1\10\15\uffff\1\4\13\uffff\1\4\3\uffff\1\4\3\uffff"+
            "\1\4\2\uffff\1\4\10\uffff\3\4\7\uffff\2\4\1\uffff\1\4\1\uffff"+
            "\1\4\1\uffff\1\4",
            "\1\4\1\uffff\1\10\15\uffff\1\4\13\uffff\1\4\3\uffff\1\4\3\uffff"+
            "\1\4\2\uffff\1\4\10\uffff\3\4\7\uffff\2\4\1\uffff\1\4\1\uffff"+
            "\1\4\1\uffff\1\4",
            "",
            "\1\4\1\uffff\1\10\15\uffff\1\4\13\uffff\1\4\3\uffff\1\4\3\uffff"+
            "\1\4\2\uffff\1\4\10\uffff\3\4\7\uffff\2\4\1\uffff\1\4\1\uffff"+
            "\1\4\1\uffff\1\4",
            "\1\11",
            "",
            "",
            "\1\13\14\uffff\1\12",
            "\1\14\36\uffff\1\15",
            "\1\16",
            "\1\17",
            "\1\20",
            "\1\21",
            "\1\4\1\uffff\1\10\15\uffff\1\4\13\uffff\1\4\3\uffff\1\4\3\uffff"+
            "\1\4\2\uffff\1\4\10\uffff\3\4\7\uffff\2\4\1\uffff\1\4\1\uffff"+
            "\1\4\1\uffff\1\4",
            "\1\4\1\uffff\1\10\15\uffff\1\4\13\uffff\1\4\3\uffff\1\4\3\uffff"+
            "\1\4\2\uffff\1\4\10\uffff\3\4\7\uffff\2\4\1\uffff\1\4\1\uffff"+
            "\1\4\1\uffff\1\4",
            "\1\22",
            "\1\21\36\uffff\1\23",
            "\1\24",
            "\1\25\36\uffff\1\26",
            "\1\27",
            "\1\27",
            "\1\4\1\uffff\1\10\15\uffff\1\4\13\uffff\1\4\3\uffff\1\4\3\uffff"+
            "\1\4\2\uffff\1\4\10\uffff\3\4\7\uffff\2\4\1\uffff\1\4\1\uffff"+
            "\1\4\1\uffff\1\4"
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
            return "576:1: term returns [ProvaObject ret] : (lt= left_term |ft= func_term |map= prova_map );";
        }
    }
 

    public static final BitSet FOLLOW_RULEBASE_in_rulebase63 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_rulebase68 = new BitSet(new long[]{0x0800000000000008L});
    public static final BitSet FOLLOW_STATEMENT_in_statement88 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_stat_in_statement92 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_clause_in_stat125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_query_in_stat134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLAUSE_in_clause153 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_metadata_in_clause157 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_relation_in_clause162 = new BitSet(new long[]{0x0000004000000008L});
    public static final BitSet FOLLOW_literals_in_clause166 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CLAUSE_in_clause180 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_metadata_in_clause184 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_LCWORD_in_clause189 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_list_body_in_clause193 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_list_body_in_clause197 = new BitSet(new long[]{0x0000004000000008L});
    public static final BitSet FOLLOW_literals_in_clause201 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_METADATA_in_metadata227 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotation_in_metadata232 = new BitSet(new long[]{0x0000000000000018L});
    public static final BitSet FOLLOW_ANNOTATION_in_annotation266 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_LCWORD_in_annotation270 = new BitSet(new long[]{0x6000048880000008L,0x0000000000000004L});
    public static final BitSet FOLLOW_value_in_annotation277 = new BitSet(new long[]{0x6000048880000008L,0x0000000000000004L});
    public static final BitSet FOLLOW_LCWORD_in_value299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UCWORD_in_value309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_in_value319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_value329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LITERAL_in_literals352 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_literal_in_literals357 = new BitSet(new long[]{0x0480000001008008L});
    public static final BitSet FOLLOW_FUNCTION_CALL_in_function_call383 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_predicate_in_function_call387 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_list_body_in_function_call391 = new BitSet(new long[]{0x0000002000000008L});
    public static final BitSet FOLLOW_list_body_in_function_call395 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RELATION_in_literal418 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_metadata_in_literal422 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_relation_in_literal427 = new BitSet(new long[]{0x0000000010000008L});
    public static final BitSet FOLLOW_guard_in_literal431 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SEMANTIC_ATTACHMENT_in_literal443 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_metadata_in_literal447 = new BitSet(new long[]{0x70280488C0080000L,0x0000000000000015L});
    public static final BitSet FOLLOW_semantic_attachment_in_literal452 = new BitSet(new long[]{0x0000000010000008L});
    public static final BitSet FOLLOW_guard_in_literal456 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FUNCTION_in_literal468 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_metadata_in_literal472 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_function_call_in_literal477 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CUT_in_literal488 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_cut_in_literal492 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GUARD_in_guard512 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_literals_in_guard516 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CUT_in_cut529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_predicate_java_call_in_semantic_attachment550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_binary_operation_in_semantic_attachment560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_static_java_call_in_predicate_java_call578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instance_java_call_in_predicate_java_call588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STATIC_JAVA_CALL_in_static_java_call605 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_static_call_in_static_java_call609 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_args_in_static_java_call613 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_left_term_in_binary_operation639 = new BitSet(new long[]{0x1001C590CC280000L,0x0000000000000015L});
    public static final BitSet FOLLOW_EQUAL_in_binary_operation646 = new BitSet(new long[]{0x70290488C0080000L,0x0000000000000015L});
    public static final BitSet FOLLOW_constructor_java_call_in_binary_operation655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prova_list_in_binary_operation666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_binary_operation677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_binary_operation692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_not_equal_in_binary_operation705 = new BitSet(new long[]{0x6020000800000000L});
    public static final BitSet FOLLOW_constant_in_binary_operation709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_binary_operator_in_binary_operation719 = new BitSet(new long[]{0x10010480C0080000L,0x0000000000000015L});
    public static final BitSet FOLLOW_expr_in_binary_operation723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_aterm_in_expr755 = new BitSet(new long[]{0x0002040000000002L});
    public static final BitSet FOLLOW_set_in_expr760 = new BitSet(new long[]{0x10010480C0080000L,0x0000000000000015L});
    public static final BitSet FOLLOW_aterm_in_expr768 = new BitSet(new long[]{0x0002040000000002L});
    public static final BitSet FOLLOW_MINUS_in_aterm793 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000015L});
    public static final BitSet FOLLOW_variable_in_aterm798 = new BitSet(new long[]{0x0100100000020002L});
    public static final BitSet FOLLOW_number_in_aterm804 = new BitSet(new long[]{0x0100100000020002L});
    public static final BitSet FOLLOW_MINUS_in_aterm810 = new BitSet(new long[]{0x1000000040000000L});
    public static final BitSet FOLLOW_predicate_java_call_in_aterm815 = new BitSet(new long[]{0x0100100000020002L});
    public static final BitSet FOLLOW_OPEN_in_aterm819 = new BitSet(new long[]{0x10010480C0080000L,0x0000000000000015L});
    public static final BitSet FOLLOW_expr_in_aterm823 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_CLOSE_in_aterm825 = new BitSet(new long[]{0x0100100000020002L});
    public static final BitSet FOLLOW_set_in_aterm831 = new BitSet(new long[]{0x10010480C0080000L,0x0000000000000015L});
    public static final BitSet FOLLOW_aterm_in_aterm841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_variable_or_number861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_variable_or_number869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualified_java_class_in_constructor_java_call892 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_UCWORD_in_constructor_java_call902 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_args_in_constructor_java_call910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_not_equal_in_binary_operator931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_binary_operator939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_binary_operator947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LE_in_binary_operator955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GE_in_binary_operator963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTANCE_JAVA_CALL_in_instance_java_call995 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_instance_call_in_instance_java_call999 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_args_in_instance_java_call1003 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_variable_in_instance_call1034 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_LCWORD_in_instance_call1038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualified_java_class_in_static_call1061 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_LCWORD_in_static_call1065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_query_predicate1083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUERY_in_query1100 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_query_predicate_in_query1104 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_relation_in_query1108 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PREDICATE_in_relation1131 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_predicate_in_relation1135 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_list_body_in_relation1139 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LCWORD_in_predicate1161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UCWORD_in_predicate1171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_in_predicate1181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCWORD_in_func1199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UCWORD_in_func1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_in_func1219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typed_variable_in_func1229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LIST_BODY_in_list_body1251 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_terms_in_list_body1256 = new BitSet(new long[]{0x0008000000080008L,0x0000000000000015L});
    public static final BitSet FOLLOW_list_tail_in_list_body1260 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TERM_in_terms1292 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_term_in_terms1297 = new BitSet(new long[]{0x6038048880080008L,0x0000000000000015L});
    public static final BitSet FOLLOW_left_term_in_term1322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_func_term_in_term1332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prova_map_in_term1342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_left_term1360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_left_term1370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_left_term1380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prova_list_in_left_term1390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_right_term1419 = new BitSet(new long[]{0x6020000800080000L,0x0000000000000015L});
    public static final BitSet FOLLOW_constant_in_right_term1425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_right_term1433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_right_term1445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prova_list_in_right_term1455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUALIFIED_JAVA_CLASS_in_qualified_java_class1485 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_LCWORD_in_qualified_java_class1491 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_DOT_in_qualified_java_class1495 = new BitSet(new long[]{0x0000000800000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_UCWORD_in_qualified_java_class1504 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_func_in_func_term1524 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_args_in_func_term1528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPED_VARIABLE_in_typed_variable1546 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_qualified_java_class_in_typed_variable1550 = new BitSet(new long[]{0x0000000800000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_LCWORD_in_typed_variable1555 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UCWORD_in_typed_variable1559 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TYPED_VARIABLE_in_typed_variable1573 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_UCWORD_in_typed_variable1577 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_LCWORD_in_typed_variable1581 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TYPED_VARIABLE_in_typed_variable1594 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_UCWORD_in_typed_variable1598 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_UCWORD_in_typed_variable1602 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PROVA_LIST_in_prova_list1621 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_list_body_in_prova_list1625 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PROVA_MAP_in_prova_map1653 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_key_value_in_prova_map1658 = new BitSet(new long[]{0x0000000200000008L});
    public static final BitSet FOLLOW_KEY_VALUE_in_key_value1684 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_mstring_in_key_value1689 = new BitSet(new long[]{0x6038048880080000L,0x0000000000000015L});
    public static final BitSet FOLLOW_term_in_key_value1693 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UCWORD_in_variable1722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USWORD_in_variable1732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typed_variable_in_variable1742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOLLARWORD_in_variable1752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARGS_in_args1770 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_list_body_in_args1774 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_variable_in_list_tail1803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prova_list_in_list_tail1813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCWORD_in_constant1840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_in_constant1850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualified_java_class_in_constant1860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING1_in_string1882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING2_in_string1892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_in_mstring1910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCWORD_in_mstring1920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_LITERAL_in_pos_number1938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONG_LITERAL_in_pos_number1948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_float_literal_in_pos_number1958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_LITERAL_in_float_literal1978 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_DOT_in_float_literal1980 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_INT_LITERAL_in_float_literal1984 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_EXPONENT_in_float_literal1989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_number2011 = new BitSet(new long[]{0x0000008080000000L});
    public static final BitSet FOLLOW_pos_number_in_number2016 = new BitSet(new long[]{0x0000000000000002L});

}