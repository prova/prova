// $ANTLR 3.3 Nov 30, 2010 12:45:30 C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g 2011-05-21 17:50:07

	package ws.prova.parser;
	import java.util.List;
	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.Set;
	import java.util.HashSet;
	import java.util.Map;
	import java.util.HashMap;
	
	import ws.prova.util2.ProvaClassUtils;
	import ws.prova.kernel2.ProvaObject;
	import ws.prova.kernel2.ProvaConstant;
	import ws.prova.kernel2.ProvaVariable;
	import ws.prova.kernel2.ProvaList;
	import ws.prova.kernel2.ProvaLiteral;
	import ws.prova.kernel2.ProvaRule;
	import ws.prova.kernel2.ProvaResultSet;
	import ws.prova.reference2.ProvaConstantImpl;
	import ws.prova.reference2.ProvaVariableImpl;
	import ws.prova.reference2.ProvaMapImpl;
	import ws.prova.reference2.ProvaListImpl;
	import ws.prova.reference2.ProvaLiteralImpl;
	import ws.prova.reference2.ProvaRuleImpl;
	import ws.prova.reference2.ProvaGlobalConstantImpl;
	import ws.prova.reference2.operators.ProvaOperatorFactoryImpl;
	import ws.prova.reference2.operators.ProvaBinaryOperatorFactoryImpl;
	import ws.prova.parser2.ProvaParserImpl;

	import ws.prova.parser2.ProvaErrorReporter;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class ProvaWalker2 extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "DOT", "PLUS", "MINUS", "MULT", "DIV", "COMMA", "IF", "CUT", "OPEN", "CLOSE", "BAR", "BRA", "KET", "EQUAL", "NOT_EQUAL1", "NOT_EQUAL2", "LT", "GT", "LE", "GE", "CLAUSE", "RULEBASE", "STATEMENT", "QUERY", "LITERAL", "METADATA", "RELATION", "SEMANTIC_ATTACHMENT", "ARITHMETIC_RELATION", "PREDICATE", "TERM", "INSTANCE_JAVA_CALL", "STATIC_JAVA_CALL", "LIST_BODY", "PROVA_LIST", "ARGS", "TYPED_VARIABLE", "USWORD", "QUALIFIED_JAVA_CLASS", "ANNOTATION", "REM", "DOLLARWORD", "GUARD", "ATERM", "EXPR", "PROVA_MAP", "KEY_VALUE", "FUNCTION", "FUNCTION_CALL", "NEWLINE", "LCWORD", "UCWORD", "INT_LITERAL", "LONG_LITERAL", "SLCWORD", "LC", "STRING1", "STRING2", "EXPONENT", "DIGIT", "UC", "WORD", "DOLLAR", "UNDERSCORE", "ML_COMMENT", "WS", "CLEAN_STRING", "CHAR_ESC", "':'", "'@'", "'{'", "'}'", "'->'"
    };
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


        public ProvaWalker2(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public ProvaWalker2(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return ProvaWalker2.tokenNames; }
    public String getGrammarFileName() { return "C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g"; }


        private ProvaErrorReporter errorReporter = null;

        public void setErrorReporter(ProvaErrorReporter errorReporter) {
            this.errorReporter = errorReporter;
        }

        public void emitErrorMessage(String msg) {
            errorReporter.reportError(msg);
        }



    protected static class rulebase_scope {
        List ret0;
    }
    protected Stack rulebase_stack = new Stack();


    // $ANTLR start "rulebase"
    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:53:1: rulebase returns [List ret] : ^( RULEBASE (s= statement )* ) ;
    public final List rulebase() throws RecognitionException {
        rulebase_stack.push(new rulebase_scope());
        List ret = null;

        List s = null;



        	((rulebase_scope)rulebase_stack.peek()).ret0 = new ArrayList();

        try {
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:63:2: ( ^( RULEBASE (s= statement )* ) )
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:63:4: ^( RULEBASE (s= statement )* )
            {
            match(input,RULEBASE,FOLLOW_RULEBASE_in_rulebase63); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:63:15: (s= statement )*
                loop1:
                do {
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==STATEMENT) ) {
                        alt1=1;
                    }


                    switch (alt1) {
                	case 1 :
                	    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:63:16: s= statement
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
            rulebase_stack.pop();
        }
        return ret;
    }
    // $ANTLR end "rulebase"


    // $ANTLR start "statement"
    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:66:1: statement returns [List ret] : ^( STATEMENT st= stat ) ;
    public final List statement() throws RecognitionException {
        List ret = null;

        List st = null;


        try {
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:67:2: ( ^( STATEMENT st= stat ) )
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:67:4: ^( STATEMENT st= stat )
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
    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:69:1: stat returns [List ret] : (c= clause | q= query );
    public final List stat() throws RecognitionException {
        stat_stack.push(new stat_scope());
        List ret = null;

        ProvaRule c = null;

        ProvaRule q = null;



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
        	((stat_scope)stat_stack.peek()).objects = ws.prova.parser2.ProvaParserImpl.tlObjects.get();
        	((stat_scope)stat_stack.peek()).src = ws.prova.parser2.ProvaParserImpl.tlSrc.get();

        try {
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:101:2: (c= clause | q= query )
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
                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:102:2: c= clause
                    {
                    pushFollow(FOLLOW_clause_in_stat125);
                    c=clause();

                    state._fsp--;


                    		((stat_scope)stat_stack.peek()).ret0[2]=c;
                    	

                    }
                    break;
                case 2 :
                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:105:4: q= query
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
            stat_stack.pop();
        }
        return ret;
    }
    // $ANTLR end "stat"


    // $ANTLR start "clause"
    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:112:1: clause returns [ProvaRule ret] : ( ^(cl= CLAUSE (m= metadata )? r= relation (l= literals )? ) | ^(cl= CLAUSE (m= metadata )? pred= LCWORD params= list_body result= list_body (l= literals )? ) );
    public final ProvaRule clause() throws RecognitionException {
        ProvaRule ret = null;

        CommonTree cl=null;
        CommonTree pred=null;
        Map<String,List<Object>> m = null;

        List r = null;

        List<ProvaLiteral> l = null;

        ProvaList params = null;

        ProvaList result = null;


        try {
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:112:31: ( ^(cl= CLAUSE (m= metadata )? r= relation (l= literals )? ) | ^(cl= CLAUSE (m= metadata )? pred= LCWORD params= list_body result= list_body (l= literals )? ) )
            int alt7=2;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:113:2: ^(cl= CLAUSE (m= metadata )? r= relation (l= literals )? )
                    {
                    cl=(CommonTree)match(input,CLAUSE,FOLLOW_CLAUSE_in_clause153); 

                    match(input, Token.DOWN, null); 
                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:113:15: (m= metadata )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==METADATA) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:113:15: m= metadata
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

                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:113:38: (l= literals )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==LITERAL) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:113:38: l= literals
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
                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:124:2: ^(cl= CLAUSE (m= metadata )? pred= LCWORD params= list_body result= list_body (l= literals )? )
                    {
                    cl=(CommonTree)match(input,CLAUSE,FOLLOW_CLAUSE_in_clause180); 

                    match(input, Token.DOWN, null); 
                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:124:15: (m= metadata )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==METADATA) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:124:15: m= metadata
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

                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:124:73: (l= literals )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==LITERAL) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:124:73: l= literals
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
        }
        return ret;
    }
    // $ANTLR end "clause"


    // $ANTLR start "metadata"
    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:145:1: metadata returns [Map<String,List<Object>> ret] : ^( METADATA (a= annotation )+ ) ;
    public final Map<String,List<Object>> metadata() throws RecognitionException {
        Map<String,List<Object>> ret = null;

        List<Object> a = null;



        	ret = new HashMap<String,List<Object>>();

        try {
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:149:2: ( ^( METADATA (a= annotation )+ ) )
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:149:4: ^( METADATA (a= annotation )+ )
            {
            match(input,METADATA,FOLLOW_METADATA_in_metadata227); 

            match(input, Token.DOWN, null); 
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:149:15: (a= annotation )+
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
            	    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:149:16: a= annotation
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
        }
        return ret;
    }
    // $ANTLR end "metadata"

    protected static class annotation_scope {
        List<String> value;
    }
    protected Stack annotation_stack = new Stack();


    // $ANTLR start "annotation"
    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:152:1: annotation returns [List<Object> ret] : ^( ANNOTATION n= LCWORD (v= value )* ) ;
    public final List<Object> annotation() throws RecognitionException {
        annotation_stack.push(new annotation_scope());
        List<Object> ret = null;

        CommonTree n=null;
        String v = null;



        	ret = new ArrayList<Object>();
        	((annotation_scope)annotation_stack.peek()).value = new ArrayList<String>(); 

        try {
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:163:2: ( ^( ANNOTATION n= LCWORD (v= value )* ) )
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:163:4: ^( ANNOTATION n= LCWORD (v= value )* )
            {
            match(input,ANNOTATION,FOLLOW_ANNOTATION_in_annotation266); 

            match(input, Token.DOWN, null); 
            n=(CommonTree)match(input,LCWORD,FOLLOW_LCWORD_in_annotation270); 
            ret.add(n.toString());
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:163:52: (v= value )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==MINUS||(LA9_0>=LCWORD && LA9_0<=LONG_LITERAL)||(LA9_0>=STRING1 && LA9_0<=STRING2)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:163:53: v= value
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
            annotation_stack.pop();
        }
        return ret;
    }
    // $ANTLR end "annotation"


    // $ANTLR start "value"
    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:166:1: value returns [String ret] : (l= LCWORD | u= UCWORD | s= string | n= number );
    public final String value() throws RecognitionException {
        String ret = null;

        CommonTree l=null;
        CommonTree u=null;
        String s = null;

        ProvaConstant n = null;


        try {
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:167:2: (l= LCWORD | u= UCWORD | s= string | n= number )
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
            case MINUS:
            case INT_LITERAL:
            case LONG_LITERAL:
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
                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:167:4: l= LCWORD
                    {
                    l=(CommonTree)match(input,LCWORD,FOLLOW_LCWORD_in_value299); 
                    ret = l.toString();

                    }
                    break;
                case 2 :
                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:168:5: u= UCWORD
                    {
                    u=(CommonTree)match(input,UCWORD,FOLLOW_UCWORD_in_value309); 
                     ret = u.toString(); 

                    }
                    break;
                case 3 :
                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:169:5: s= string
                    {
                    pushFollow(FOLLOW_string_in_value319);
                    s=string();

                    state._fsp--;

                     ret = s; 

                    }
                    break;
                case 4 :
                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:170:5: n= number
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
        }
        return ret;
    }
    // $ANTLR end "value"


    // $ANTLR start "literals"
    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:173:1: literals returns [List<ProvaLiteral> ret] : ^( LITERAL (l= literal )+ ) ;
    public final List<ProvaLiteral> literals() throws RecognitionException {
        List<ProvaLiteral> ret = null;

        ProvaLiteral l = null;



        	ret = new ArrayList<ProvaLiteral>();
        	((stat_scope)stat_stack.peek()).isBody = true;

        try {
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:178:2: ( ^( LITERAL (l= literal )+ ) )
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:178:4: ^( LITERAL (l= literal )+ )
            {
            match(input,LITERAL,FOLLOW_LITERAL_in_literals352); 

            match(input, Token.DOWN, null); 
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:178:14: (l= literal )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==CUT||(LA11_0>=RELATION && LA11_0<=SEMANTIC_ATTACHMENT)||LA11_0==FUNCTION) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:178:15: l= literal
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
        }
        return ret;
    }
    // $ANTLR end "literals"


    // $ANTLR start "function_call"
    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:181:1: function_call returns [List ret] : ^( FUNCTION_CALL pred= predicate params= list_body result= list_body ) ;
    public final List function_call() throws RecognitionException {
        List ret = null;

        String pred = null;

        ProvaList params = null;

        ProvaList result = null;



        	ret = new ArrayList();

        try {
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:185:2: ( ^( FUNCTION_CALL pred= predicate params= list_body result= list_body ) )
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:186:2: ^( FUNCTION_CALL pred= predicate params= list_body result= list_body )
            {
            match(input,FUNCTION_CALL,FOLLOW_FUNCTION_CALL_in_function_call383); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_predicate_in_function_call387);
            pred=predicate();

            state._fsp--;

            pushFollow(FOLLOW_list_body_in_function_call391);
            params=list_body();

            state._fsp--;

            pushFollow(FOLLOW_list_body_in_function_call395);
            result=list_body();

            state._fsp--;


            match(input, Token.UP, null); 

            		if( Character.isUpperCase(pred.charAt(0)) )
            			ret.add(ProvaVariableImpl.create(pred));
            		else
            			ret.add(ProvaConstantImpl.create(pred));
            		ProvaObject p = params;
            		if( params.getFixed().length==1 && params.getTail()==null )
            			p = params.getFixed()[0];
            		ProvaObject o = result;
            		if( result.getFixed().length==1 && result.getTail()==null )
            			o = result.getFixed()[0];
            		ret.add(ProvaListImpl.create(new ProvaObject[] {p,o},null));
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret;
    }
    // $ANTLR end "function_call"


    // $ANTLR start "literal"
    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:201:1: literal returns [ProvaLiteral ret] : ( ^(rel= RELATION (m= metadata )? r= relation (g= guard )? ) | ^(sem= SEMANTIC_ATTACHMENT (m= metadata )? sa= semantic_attachment (g= guard )? ) | ^(fun= FUNCTION (m= metadata )? f= function_call ) | ^(cu= CUT c= cut ) );
    public final ProvaLiteral literal() throws RecognitionException {
        ProvaLiteral ret = null;

        CommonTree rel=null;
        CommonTree sem=null;
        CommonTree fun=null;
        CommonTree cu=null;
        Map<String,List<Object>> m = null;

        List r = null;

        List<ProvaLiteral> g = null;

        List<ProvaObject> sa = null;

        List f = null;


        try {
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:202:2: ( ^(rel= RELATION (m= metadata )? r= relation (g= guard )? ) | ^(sem= SEMANTIC_ATTACHMENT (m= metadata )? sa= semantic_attachment (g= guard )? ) | ^(fun= FUNCTION (m= metadata )? f= function_call ) | ^(cu= CUT c= cut ) )
            int alt17=4;
            switch ( input.LA(1) ) {
            case RELATION:
                {
                alt17=1;
                }
                break;
            case SEMANTIC_ATTACHMENT:
                {
                alt17=2;
                }
                break;
            case FUNCTION:
                {
                alt17=3;
                }
                break;
            case CUT:
                {
                alt17=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:203:2: ^(rel= RELATION (m= metadata )? r= relation (g= guard )? )
                    {
                    rel=(CommonTree)match(input,RELATION,FOLLOW_RELATION_in_literal417); 

                    match(input, Token.DOWN, null); 
                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:203:18: (m= metadata )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==METADATA) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:203:18: m= metadata
                            {
                            pushFollow(FOLLOW_metadata_in_literal421);
                            m=metadata();

                            state._fsp--;


                            }
                            break;

                    }

                    pushFollow(FOLLOW_relation_in_literal426);
                    r=relation();

                    state._fsp--;

                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:203:41: (g= guard )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==GUARD) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:203:41: g= guard
                            {
                            pushFollow(FOLLOW_guard_in_literal430);
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
                    			metaVariables.add(0,ProvaParserImpl.tlKB.get().generateTypedConstant(pred));
                    			metaVariables.add(1,(ProvaList) r.get(1));
                    			ProvaList metaList = ProvaListImpl.create( metaVariables );
                    			ret = ProvaParserImpl.tlKB.get().generateLiteral("metadata",metaList,g);
                    			ret.setLine(rel.getLine());
                    			ret.addMetadata(m);
                    		}
                    	

                    }
                    break;
                case 2 :
                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:221:4: ^(sem= SEMANTIC_ATTACHMENT (m= metadata )? sa= semantic_attachment (g= guard )? )
                    {
                    sem=(CommonTree)match(input,SEMANTIC_ATTACHMENT,FOLLOW_SEMANTIC_ATTACHMENT_in_literal442); 

                    match(input, Token.DOWN, null); 
                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:221:31: (m= metadata )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==METADATA) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:221:31: m= metadata
                            {
                            pushFollow(FOLLOW_metadata_in_literal446);
                            m=metadata();

                            state._fsp--;


                            }
                            break;

                    }

                    pushFollow(FOLLOW_semantic_attachment_in_literal451);
                    sa=semantic_attachment();

                    state._fsp--;

                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:221:66: (g= guard )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==GUARD) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:221:66: g= guard
                            {
                            pushFollow(FOLLOW_guard_in_literal455);
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
                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:226:4: ^(fun= FUNCTION (m= metadata )? f= function_call )
                    {
                    fun=(CommonTree)match(input,FUNCTION,FOLLOW_FUNCTION_in_literal467); 

                    match(input, Token.DOWN, null); 
                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:226:20: (m= metadata )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==METADATA) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:226:20: m= metadata
                            {
                            pushFollow(FOLLOW_metadata_in_literal471);
                            m=metadata();

                            state._fsp--;


                            }
                            break;

                    }

                    pushFollow(FOLLOW_function_call_in_literal476);
                    f=function_call();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    		ret =ProvaParserImpl.tlKB.get().generateLiteral((String) ((ProvaConstant) f.get(0)).getObject(),(ProvaList) f.get(1));
                    		ret.setLine(fun.getLine());
                    		ret.addMetadata(m);
                    	

                    }
                    break;
                case 4 :
                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:231:4: ^(cu= CUT c= cut )
                    {
                    cu=(CommonTree)match(input,CUT,FOLLOW_CUT_in_literal487); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_cut_in_literal491);
                    cut();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    		ProvaVariable any1 = ProvaParserImpl.tlKB.get().generateVariable("");
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
        }
        return ret;
    }
    // $ANTLR end "literal"


    // $ANTLR start "guard"
    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:239:1: guard returns [List<ProvaLiteral> ret] : ^(g= GUARD lits= literals ) ;
    public final List<ProvaLiteral> guard() throws RecognitionException {
        List<ProvaLiteral> ret = null;

        CommonTree g=null;
        List<ProvaLiteral> lits = null;


        try {
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:240:2: ( ^(g= GUARD lits= literals ) )
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:240:4: ^(g= GUARD lits= literals )
            {
            g=(CommonTree)match(input,GUARD,FOLLOW_GUARD_in_guard511); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_literals_in_guard515);
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
        }
        return ret;
    }
    // $ANTLR end "guard"


    // $ANTLR start "cut"
    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:245:1: cut : CUT ;
    public final void cut() throws RecognitionException {
        try {
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:246:2: ( CUT )
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:246:4: CUT
            {
            match(input,CUT,FOLLOW_CUT_in_cut528); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "cut"


    // $ANTLR start "semantic_attachment"
    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:249:1: semantic_attachment returns [List<ProvaObject> ret] : (pjc= predicate_java_call | bo= binary_operation );
    public final List<ProvaObject> semantic_attachment() throws RecognitionException {
        List<ProvaObject> ret = null;

        List<ProvaObject> pjc = null;

        List<ProvaObject> bo = null;



        	ret = new ArrayList<ProvaObject>();

        try {
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:253:2: (pjc= predicate_java_call | bo= binary_operation )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=INSTANCE_JAVA_CALL && LA18_0<=STATIC_JAVA_CALL)) ) {
                alt18=1;
            }
            else if ( (LA18_0==MINUS||LA18_0==PROVA_LIST||(LA18_0>=TYPED_VARIABLE && LA18_0<=QUALIFIED_JAVA_CLASS)||LA18_0==DOLLARWORD||(LA18_0>=LCWORD && LA18_0<=SLCWORD)||(LA18_0>=STRING1 && LA18_0<=STRING2)) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:253:4: pjc= predicate_java_call
                    {
                    pushFollow(FOLLOW_predicate_java_call_in_semantic_attachment549);
                    pjc=predicate_java_call();

                    state._fsp--;


                    			ProvaConstant symbolConstant = (ProvaConstant) pjc.remove(0);
                    			ProvaList pl = ProvaListImpl.create(pjc.toArray(new ProvaObject[0]));
                    			String method = symbolConstant.equals("s")?"scalc":"pcalc";
                    			ret.add(ProvaParserImpl.tlKB.get().generateTypedConstant(method));
                    			ret.add(pl);
                    		

                    }
                    break;
                case 2 :
                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:260:5: bo= binary_operation
                    {
                    pushFollow(FOLLOW_binary_operation_in_semantic_attachment559);
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
        }
        return ret;
    }
    // $ANTLR end "semantic_attachment"


    // $ANTLR start "predicate_java_call"
    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:268:1: predicate_java_call returns [List<ProvaObject> ret] : (sjc= static_java_call | ijc= instance_java_call );
    public final List<ProvaObject> predicate_java_call() throws RecognitionException {
        List<ProvaObject> ret = null;

        List<ProvaObject> sjc = null;

        List<ProvaObject> ijc = null;


        try {
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:269:2: (sjc= static_java_call | ijc= instance_java_call )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==STATIC_JAVA_CALL) ) {
                alt19=1;
            }
            else if ( (LA19_0==INSTANCE_JAVA_CALL) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:269:4: sjc= static_java_call
                    {
                    pushFollow(FOLLOW_static_java_call_in_predicate_java_call577);
                    sjc=static_java_call();

                    state._fsp--;


                    			ret =sjc;
                    		

                    }
                    break;
                case 2 :
                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:272:5: ijc= instance_java_call
                    {
                    pushFollow(FOLLOW_instance_java_call_in_predicate_java_call587);
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
        }
        return ret;
    }
    // $ANTLR end "predicate_java_call"


    // $ANTLR start "static_java_call"
    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:277:1: static_java_call returns [List<ProvaObject> ret] : ^( STATIC_JAVA_CALL sc= static_call a= args ) ;
    public final List<ProvaObject> static_java_call() throws RecognitionException {
        List<ProvaObject> ret = null;

        List<ProvaObject> sc = null;

        ProvaList a = null;


        try {
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:278:2: ( ^( STATIC_JAVA_CALL sc= static_call a= args ) )
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:278:4: ^( STATIC_JAVA_CALL sc= static_call a= args )
            {
            match(input,STATIC_JAVA_CALL,FOLLOW_STATIC_JAVA_CALL_in_static_java_call604); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_static_call_in_static_java_call608);
            sc=static_call();

            state._fsp--;

            pushFollow(FOLLOW_args_in_static_java_call612);
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
        }
        return ret;
    }
    // $ANTLR end "static_java_call"

    protected static class binary_operation_scope {
        String op;
    }
    protected Stack binary_operation_stack = new Stack();


    // $ANTLR start "binary_operation"
    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:284:1: binary_operation returns [List<ProvaObject> ret] : lt= left_term ( EQUAL (cjc= constructor_java_call | pl= prova_list | c= constant | e= expr ) | not_equal c= constant | bo= binary_operator e= expr ) ;
    public final List<ProvaObject> binary_operation() throws RecognitionException {
        binary_operation_stack.push(new binary_operation_scope());
        List<ProvaObject> ret = null;

        ProvaObject lt = null;

        List<ProvaObject> cjc = null;

        ProvaList pl = null;

        ProvaConstant c = null;

        ProvaObject e = null;

        String bo = null;


        try {
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:288:2: (lt= left_term ( EQUAL (cjc= constructor_java_call | pl= prova_list | c= constant | e= expr ) | not_equal c= constant | bo= binary_operator e= expr ) )
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:289:3: lt= left_term ( EQUAL (cjc= constructor_java_call | pl= prova_list | c= constant | e= expr ) | not_equal c= constant | bo= binary_operator e= expr )
            {
            pushFollow(FOLLOW_left_term_in_binary_operation638);
            lt=left_term();

            state._fsp--;

            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:289:16: ( EQUAL (cjc= constructor_java_call | pl= prova_list | c= constant | e= expr ) | not_equal c= constant | bo= binary_operator e= expr )
            int alt21=3;
            switch ( input.LA(1) ) {
            case EQUAL:
                {
                alt21=1;
                }
                break;
            case NOT_EQUAL1:
            case NOT_EQUAL2:
                {
                int LA21_2 = input.LA(2);

                if ( (LA21_2==QUALIFIED_JAVA_CLASS||LA21_2==LCWORD||LA21_2==SLCWORD||(LA21_2>=STRING1 && LA21_2<=STRING2)) ) {
                    alt21=2;
                }
                else if ( (LA21_2==MINUS||LA21_2==OPEN||(LA21_2>=INSTANCE_JAVA_CALL && LA21_2<=STATIC_JAVA_CALL)||(LA21_2>=TYPED_VARIABLE && LA21_2<=USWORD)||LA21_2==DOLLARWORD||(LA21_2>=UCWORD && LA21_2<=LONG_LITERAL)) ) {
                    alt21=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 2, input);

                    throw nvae;
                }
                }
                break;
            case MINUS:
            case OPEN:
            case LT:
            case GT:
            case LE:
            case GE:
            case INSTANCE_JAVA_CALL:
            case STATIC_JAVA_CALL:
            case TYPED_VARIABLE:
            case USWORD:
            case DOLLARWORD:
            case UCWORD:
            case INT_LITERAL:
            case LONG_LITERAL:
                {
                alt21=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:290:4: EQUAL (cjc= constructor_java_call | pl= prova_list | c= constant | e= expr )
                    {
                    match(input,EQUAL,FOLLOW_EQUAL_in_binary_operation645); 
                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:290:10: (cjc= constructor_java_call | pl= prova_list | c= constant | e= expr )
                    int alt20=4;
                    alt20 = dfa20.predict(input);
                    switch (alt20) {
                        case 1 :
                            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:291:4: cjc= constructor_java_call
                            {
                            pushFollow(FOLLOW_constructor_java_call_in_binary_operation654);
                            cjc=constructor_java_call();

                            state._fsp--;


                            				ret =new java.util.ArrayList<ProvaObject>();
                            				ret.add(ProvaParserImpl.tlKB.get().generateTypedConstant("construct"));
                            				ret.add(cjc.get(0));
                            				ret.add(lt);
                            				ret.add(cjc.get(1));
                            			

                            }
                            break;
                        case 2 :
                            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:298:6: pl= prova_list
                            {
                            pushFollow(FOLLOW_prova_list_in_binary_operation665);
                            pl=prova_list();

                            state._fsp--;


                            				ret =new java.util.ArrayList<ProvaObject>();
                            				ret.add(ProvaParserImpl.tlKB.get().generateTypedConstant("equals"));
                            				ret.add(lt);
                            				ret.add(pl);
                            			

                            }
                            break;
                        case 3 :
                            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:304:6: c= constant
                            {
                            pushFollow(FOLLOW_constant_in_binary_operation676);
                            c=constant();

                            state._fsp--;


                            				ret =new java.util.ArrayList<ProvaObject>();
                            				ret.add(ProvaParserImpl.tlKB.get().generateTypedConstant("equals"));
                            				ret.add(lt);
                            				ret.add(c);
                            			

                            }
                            break;
                        case 4 :
                            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:311:6: e= expr
                            {
                            pushFollow(FOLLOW_expr_in_binary_operation691);
                            e=expr();

                            state._fsp--;


                            				ret =new java.util.ArrayList<ProvaObject>();
                            				ret.add(ProvaParserImpl.tlKB.get().generateTypedConstant("expr_literal"));
                            				ret.add(ProvaParserImpl.tlKB.get().generateTypedConstant(ProvaBinaryOperatorFactoryImpl.create("=")));
                            				ret.add(lt);
                            				ret.add(e);
                            			

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:319:5: not_equal c= constant
                    {
                    pushFollow(FOLLOW_not_equal_in_binary_operation704);
                    not_equal();

                    state._fsp--;

                    pushFollow(FOLLOW_constant_in_binary_operation708);
                    c=constant();

                    state._fsp--;


                    			ret =new java.util.ArrayList<ProvaObject>();
                    			ret.add(ProvaParserImpl.tlKB.get().generateTypedConstant("ne"));
                    			ret.add(lt);
                    			ret.add(c);
                    		

                    }
                    break;
                case 3 :
                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:325:5: bo= binary_operator e= expr
                    {
                    pushFollow(FOLLOW_binary_operator_in_binary_operation718);
                    bo=binary_operator();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_binary_operation722);
                    e=expr();

                    state._fsp--;


                    			ret =new java.util.ArrayList<ProvaObject>();
                    			ret.add(ProvaParserImpl.tlKB.get().generateTypedConstant("expr_literal"));
                    			ret.add(ProvaParserImpl.tlKB.get().generateTypedConstant(ProvaBinaryOperatorFactoryImpl.create(bo)));
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
            binary_operation_stack.pop();
        }
        return ret;
    }
    // $ANTLR end "binary_operation"


    // $ANTLR start "expr"
    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:346:1: expr returns [ProvaObject ret] : a= aterm (op= ( PLUS | MINUS ) b= aterm )* ;
    public final ProvaObject expr() throws RecognitionException {
        ProvaObject ret = null;

        CommonTree op=null;
        ProvaObject a = null;

        ProvaObject b = null;



        	List<String> ops = new ArrayList<String>();
        	List<ProvaObject> other = new ArrayList<ProvaObject>();

        try {
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:351:2: (a= aterm (op= ( PLUS | MINUS ) b= aterm )* )
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:352:2: a= aterm (op= ( PLUS | MINUS ) b= aterm )*
            {
            pushFollow(FOLLOW_aterm_in_expr754);
            a=aterm();

            state._fsp--;

            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:352:10: (op= ( PLUS | MINUS ) b= aterm )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=PLUS && LA22_0<=MINUS)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:352:11: op= ( PLUS | MINUS ) b= aterm
            	    {
            	    op=(CommonTree)input.LT(1);
            	    if ( (input.LA(1)>=PLUS && input.LA(1)<=MINUS) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_aterm_in_expr767);
            	    b=aterm();

            	    state._fsp--;

            	    ops.add(op.toString()); other.add(b);

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            		final int len = ops==null ? 0 : ops.size();
            		for( int i=0; i<len; i++ ) {
            			List list = new ArrayList();
            			list.add(ProvaParserImpl.tlKB.get().generateTypedConstant(ProvaOperatorFactoryImpl.create(ops.get(i))));
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
        }
        return ret;
    }
    // $ANTLR end "expr"


    // $ANTLR start "aterm"
    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:365:1: aterm returns [ProvaObject ret] : ( (m= MINUS )? v= variable | n= number | (m= MINUS )? pjc= predicate_java_call | OPEN e= expr CLOSE ) (op= ( MULT | DIV | REM ) a= aterm )? ;
    public final ProvaObject aterm() throws RecognitionException {
        ProvaObject ret = null;

        CommonTree m=null;
        CommonTree op=null;
        ProvaObject v = null;

        ProvaConstant n = null;

        List<ProvaObject> pjc = null;

        ProvaObject e = null;

        ProvaObject a = null;


        try {
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:366:2: ( ( (m= MINUS )? v= variable | n= number | (m= MINUS )? pjc= predicate_java_call | OPEN e= expr CLOSE ) (op= ( MULT | DIV | REM ) a= aterm )? )
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:367:2: ( (m= MINUS )? v= variable | n= number | (m= MINUS )? pjc= predicate_java_call | OPEN e= expr CLOSE ) (op= ( MULT | DIV | REM ) a= aterm )?
            {
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:367:2: ( (m= MINUS )? v= variable | n= number | (m= MINUS )? pjc= predicate_java_call | OPEN e= expr CLOSE )
            int alt25=4;
            switch ( input.LA(1) ) {
            case MINUS:
                {
                switch ( input.LA(2) ) {
                case TYPED_VARIABLE:
                case USWORD:
                case DOLLARWORD:
                case UCWORD:
                    {
                    alt25=1;
                    }
                    break;
                case INT_LITERAL:
                case LONG_LITERAL:
                    {
                    alt25=2;
                    }
                    break;
                case INSTANCE_JAVA_CALL:
                case STATIC_JAVA_CALL:
                    {
                    alt25=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 1, input);

                    throw nvae;
                }

                }
                break;
            case TYPED_VARIABLE:
            case USWORD:
            case DOLLARWORD:
            case UCWORD:
                {
                alt25=1;
                }
                break;
            case INT_LITERAL:
            case LONG_LITERAL:
                {
                alt25=2;
                }
                break;
            case INSTANCE_JAVA_CALL:
            case STATIC_JAVA_CALL:
                {
                alt25=3;
                }
                break;
            case OPEN:
                {
                alt25=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:367:3: (m= MINUS )? v= variable
                    {
                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:367:4: (m= MINUS )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==MINUS) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:367:4: m= MINUS
                            {
                            m=(CommonTree)match(input,MINUS,FOLLOW_MINUS_in_aterm792); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_variable_in_aterm797);
                    v=variable();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:367:25: n= number
                    {
                    pushFollow(FOLLOW_number_in_aterm803);
                    n=number();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:367:36: (m= MINUS )? pjc= predicate_java_call
                    {
                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:367:37: (m= MINUS )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==MINUS) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:367:37: m= MINUS
                            {
                            m=(CommonTree)match(input,MINUS,FOLLOW_MINUS_in_aterm809); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_predicate_java_call_in_aterm814);
                    pjc=predicate_java_call();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:367:71: OPEN e= expr CLOSE
                    {
                    match(input,OPEN,FOLLOW_OPEN_in_aterm818); 
                    pushFollow(FOLLOW_expr_in_aterm822);
                    e=expr();

                    state._fsp--;

                    match(input,CLOSE,FOLLOW_CLOSE_in_aterm824); 

                    }
                    break;

            }

            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:367:90: (op= ( MULT | DIV | REM ) a= aterm )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=MULT && LA26_0<=DIV)||LA26_0==REM) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:367:91: op= ( MULT | DIV | REM ) a= aterm
                    {
                    op=(CommonTree)input.LT(1);
                    if ( (input.LA(1)>=MULT && input.LA(1)<=DIV)||input.LA(1)==REM ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_aterm_in_aterm840);
                    a=aterm();

                    state._fsp--;


                    }
                    break;

            }


            		if( op==null ) {
            			if( m==null ) {
            				if( pjc!=null ) {
            					List plist = new java.util.ArrayList<ProvaObject>();
            					plist.add(ProvaParserImpl.tlKB.get().generateTypedConstant(ProvaOperatorFactoryImpl.createFunctionCall(pjc.get(0),pjc.get(2))));
            					plist.add(pjc.get(1));
            					plist.add(pjc.get(3));
            					ret = ProvaListImpl.create(plist);
            				} else
            					ret = v==null ? (n==null ? e : n) : v;
            			} else {
            				List list = new ArrayList();
            				list.add(ProvaParserImpl.tlKB.get().generateTypedConstant(ProvaOperatorFactoryImpl.create("neg")));
            				if( pjc!=null ) {
            					List plist = new java.util.ArrayList<ProvaObject>();
            					plist.add(ProvaParserImpl.tlKB.get().generateTypedConstant(ProvaOperatorFactoryImpl.createFunctionCall(pjc.get(0),pjc.get(2))));
            					plist.add(pjc.get(1));
            					plist.add(pjc.get(3));
            					list.add(ProvaListImpl.create(plist));
            				} else
            					list.add(v==null ? (n==null ? e : n) : v);
            				ret = ProvaListImpl.create(list);
            			}
            		} else {
            			List list = new ArrayList();
            			list.add(ProvaParserImpl.tlKB.get().generateTypedConstant(ProvaOperatorFactoryImpl.create(op.getText())));
            			if( pjc!=null ) {
            				List plist = new java.util.ArrayList<ProvaObject>();
            				plist.add(ProvaParserImpl.tlKB.get().generateTypedConstant(ProvaOperatorFactoryImpl.createFunctionCall(pjc.get(0),pjc.get(2))));
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
        }
        return ret;
    }
    // $ANTLR end "aterm"


    // $ANTLR start "variable_or_number"
    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:408:1: variable_or_number returns [ProvaObject ret] : (v= variable | n= number );
    public final ProvaObject variable_or_number() throws RecognitionException {
        ProvaObject ret = null;

        ProvaObject v = null;

        ProvaConstant n = null;


        try {
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:409:2: (v= variable | n= number )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=TYPED_VARIABLE && LA27_0<=USWORD)||LA27_0==DOLLARWORD||LA27_0==UCWORD) ) {
                alt27=1;
            }
            else if ( (LA27_0==MINUS||(LA27_0>=INT_LITERAL && LA27_0<=LONG_LITERAL)) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:409:4: v= variable
                    {
                    pushFollow(FOLLOW_variable_in_variable_or_number860);
                    v=variable();

                    state._fsp--;

                    ret = v;

                    }
                    break;
                case 2 :
                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:409:29: n= number
                    {
                    pushFollow(FOLLOW_number_in_variable_or_number868);
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
        }
        return ret;
    }
    // $ANTLR end "variable_or_number"


    // $ANTLR start "constructor_java_call"
    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:411:1: constructor_java_call returns [List<ProvaObject> ret] : (qjc= qualified_java_class | o= UCWORD ) a= args ;
    public final List<ProvaObject> constructor_java_call() throws RecognitionException {
        List<ProvaObject> ret = null;

        CommonTree o=null;
        ProvaConstant qjc = null;

        ProvaList a = null;



        	ret = new ArrayList<ProvaObject>();

        try {
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:415:2: ( (qjc= qualified_java_class | o= UCWORD ) a= args )
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:415:4: (qjc= qualified_java_class | o= UCWORD ) a= args
            {
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:415:4: (qjc= qualified_java_class | o= UCWORD )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==QUALIFIED_JAVA_CLASS) ) {
                alt28=1;
            }
            else if ( (LA28_0==UCWORD) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:415:5: qjc= qualified_java_class
                    {
                    pushFollow(FOLLOW_qualified_java_class_in_constructor_java_call891);
                    qjc=qualified_java_class();

                    state._fsp--;

                    ret.add(qjc);

                    }
                    break;
                case 2 :
                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:416:5: o= UCWORD
                    {
                    o=(CommonTree)match(input,UCWORD,FOLLOW_UCWORD_in_constructor_java_call901); 

                    			Class<?> type = ProvaClassUtils.findClass((String) o.toString());
                    			if( type==null )
                    				throw new RecognitionException();
                    			ret.add(ProvaParserImpl.tlKB.get().generateTypedConstant(type));
                    			

                    }
                    break;

            }

            pushFollow(FOLLOW_args_in_constructor_java_call909);
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
        }
        return ret;
    }
    // $ANTLR end "constructor_java_call"


    // $ANTLR start "binary_operator"
    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:426:1: binary_operator returns [String ret] : ( | not_equal | LT | GT | LE | GE );
    public final String binary_operator() throws RecognitionException {
        String ret = null;

        try {
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:427:2: ( | not_equal | LT | GT | LE | GE )
            int alt29=6;
            switch ( input.LA(1) ) {
            case MINUS:
            case OPEN:
            case INSTANCE_JAVA_CALL:
            case STATIC_JAVA_CALL:
            case TYPED_VARIABLE:
            case USWORD:
            case DOLLARWORD:
            case UCWORD:
            case INT_LITERAL:
            case LONG_LITERAL:
                {
                alt29=1;
                }
                break;
            case NOT_EQUAL1:
            case NOT_EQUAL2:
                {
                alt29=2;
                }
                break;
            case LT:
                {
                alt29=3;
                }
                break;
            case GT:
                {
                alt29=4;
                }
                break;
            case LE:
                {
                alt29=5;
                }
                break;
            case GE:
                {
                alt29=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:428:3: 
                    {
                    }
                    break;
                case 2 :
                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:428:5: not_equal
                    {
                    pushFollow(FOLLOW_not_equal_in_binary_operator930);
                    not_equal();

                    state._fsp--;

                    ret ="ne";

                    }
                    break;
                case 3 :
                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:429:5: LT
                    {
                    match(input,LT,FOLLOW_LT_in_binary_operator938); 
                    ret ="lt";

                    }
                    break;
                case 4 :
                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:430:5: GT
                    {
                    match(input,GT,FOLLOW_GT_in_binary_operator946); 
                    ret ="gt";

                    }
                    break;
                case 5 :
                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:431:5: LE
                    {
                    match(input,LE,FOLLOW_LE_in_binary_operator954); 
                    ret ="le";

                    }
                    break;
                case 6 :
                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:432:5: GE
                    {
                    match(input,GE,FOLLOW_GE_in_binary_operator962); 
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
        }
        return ret;
    }
    // $ANTLR end "binary_operator"


    // $ANTLR start "not_equal"
    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:435:1: not_equal : ( NOT_EQUAL1 | NOT_EQUAL2 );
    public final void not_equal() throws RecognitionException {
        try {
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:436:2: ( NOT_EQUAL1 | NOT_EQUAL2 )
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:
            {
            if ( (input.LA(1)>=NOT_EQUAL1 && input.LA(1)<=NOT_EQUAL2) ) {
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
        }
        return ;
    }
    // $ANTLR end "not_equal"


    // $ANTLR start "instance_java_call"
    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:439:1: instance_java_call returns [List<ProvaObject> ret] : ^( INSTANCE_JAVA_CALL ic= instance_call a= args ) ;
    public final List<ProvaObject> instance_java_call() throws RecognitionException {
        List<ProvaObject> ret = null;

        List<ProvaObject> ic = null;

        ProvaList a = null;


        try {
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:440:2: ( ^( INSTANCE_JAVA_CALL ic= instance_call a= args ) )
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:440:4: ^( INSTANCE_JAVA_CALL ic= instance_call a= args )
            {
            match(input,INSTANCE_JAVA_CALL,FOLLOW_INSTANCE_JAVA_CALL_in_instance_java_call994); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_instance_call_in_instance_java_call998);
            ic=instance_call();

            state._fsp--;

            pushFollow(FOLLOW_args_in_instance_java_call1002);
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
        }
        return ret;
    }
    // $ANTLR end "instance_java_call"


    // $ANTLR start "instance_call"
    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:447:1: instance_call returns [List<ProvaObject> ret] : v= variable l= LCWORD ;
    public final List<ProvaObject> instance_call() throws RecognitionException {
        List<ProvaObject> ret = null;

        CommonTree l=null;
        ProvaObject v = null;



        	ret = new ArrayList();
        	((stat_scope)stat_stack.peek()).inInstanceCall = true;

        try {
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:455:2: (v= variable l= LCWORD )
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:455:4: v= variable l= LCWORD
            {
            pushFollow(FOLLOW_variable_in_instance_call1033);
            v=variable();

            state._fsp--;

            l=(CommonTree)match(input,LCWORD,FOLLOW_LCWORD_in_instance_call1037); 

            			// Prefix set to "" to signal that the predicate_java_call is an instance one
            			//   but can be reclassified as a static call if v is a constant
            			//   representing a class from a default package java.lang or ws.prova
            			String s = (v instanceof ProvaVariable || v instanceof ProvaGlobalConstantImpl || (v instanceof ProvaConstant && !(((ProvaConstant) v).getObject() instanceof Class<?>)))?"":"s";
            			ret.add(ProvaParserImpl.tlKB.get().generateTypedConstant(s));
            			ret.add(v);
            			ret.add(ProvaParserImpl.tlKB.get().generateTypedConstant((l!=null?l.getText():null)));
            		

            }


            	((stat_scope)stat_stack.peek()).inInstanceCall = false;

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret;
    }
    // $ANTLR end "instance_call"


    // $ANTLR start "static_call"
    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:466:1: static_call returns [List<ProvaObject> ret] : qjc= qualified_java_class l= LCWORD ;
    public final List<ProvaObject> static_call() throws RecognitionException {
        List<ProvaObject> ret = null;

        CommonTree l=null;
        ProvaConstant qjc = null;



        	ret = new ArrayList<ProvaObject>();

        try {
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:470:2: (qjc= qualified_java_class l= LCWORD )
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:470:4: qjc= qualified_java_class l= LCWORD
            {
            pushFollow(FOLLOW_qualified_java_class_in_static_call1060);
            qjc=qualified_java_class();

            state._fsp--;

            l=(CommonTree)match(input,LCWORD,FOLLOW_LCWORD_in_static_call1064); 

            			// Prefix set to "s" to signal that the predicate_java_call is a static one
            			ret.add(ProvaParserImpl.tlKB.get().generateTypedConstant("s"));
            			ret.add(qjc);
            			ret.add(ProvaParserImpl.tlKB.get().generateTypedConstant((l!=null?l.getText():null)));
            		

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret;
    }
    // $ANTLR end "static_call"


    // $ANTLR start "query_predicate"
    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:478:1: query_predicate returns [String ret] : c= constant ;
    public final String query_predicate() throws RecognitionException {
        String ret = null;

        ProvaConstant c = null;


        try {
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:479:2: (c= constant )
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:479:4: c= constant
            {
            pushFollow(FOLLOW_constant_in_query_predicate1082);
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
        }
        return ret;
    }
    // $ANTLR end "query_predicate"


    // $ANTLR start "query"
    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:482:1: query returns [ProvaRule ret] : ^( QUERY qp= query_predicate r= relation ) ;
    public final ProvaRule query() throws RecognitionException {
        ProvaRule ret = null;

        String qp = null;

        List r = null;


        try {
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:483:2: ( ^( QUERY qp= query_predicate r= relation ) )
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:483:4: ^( QUERY qp= query_predicate r= relation )
            {
            match(input,QUERY,FOLLOW_QUERY_in_query1099); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_query_predicate_in_query1103);
            qp=query_predicate();

            state._fsp--;

            pushFollow(FOLLOW_relation_in_query1107);
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
        }
        return ret;
    }
    // $ANTLR end "query"


    // $ANTLR start "relation"
    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:496:1: relation returns [List ret] : ^( PREDICATE p= predicate l= list_body ) ;
    public final List relation() throws RecognitionException {
        List ret = null;

        String p = null;

        ProvaList l = null;



        	ret = new ArrayList();

        try {
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:500:2: ( ^( PREDICATE p= predicate l= list_body ) )
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:500:4: ^( PREDICATE p= predicate l= list_body )
            {
            match(input,PREDICATE,FOLLOW_PREDICATE_in_relation1130); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_predicate_in_relation1134);
            p=predicate();

            state._fsp--;

            pushFollow(FOLLOW_list_body_in_relation1138);
            l=list_body();

            state._fsp--;


            match(input, Token.UP, null); 

            			if( Character.isUpperCase(p.charAt(0)) )
            				ret.add(ProvaParserImpl.tlKB.get().generateVariable(p));
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
        }
        return ret;
    }
    // $ANTLR end "relation"


    // $ANTLR start "predicate"
    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:518:1: predicate returns [String ret] : (l= LCWORD | u= UCWORD | s= string );
    public final String predicate() throws RecognitionException {
        String ret = null;

        CommonTree l=null;
        CommonTree u=null;
        String s = null;


        try {
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:519:2: (l= LCWORD | u= UCWORD | s= string )
            int alt30=3;
            switch ( input.LA(1) ) {
            case LCWORD:
                {
                alt30=1;
                }
                break;
            case UCWORD:
                {
                alt30=2;
                }
                break;
            case STRING1:
            case STRING2:
                {
                alt30=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:519:4: l= LCWORD
                    {
                    l=(CommonTree)match(input,LCWORD,FOLLOW_LCWORD_in_predicate1160); 
                    ret = l.toString();

                    }
                    break;
                case 2 :
                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:520:5: u= UCWORD
                    {
                    u=(CommonTree)match(input,UCWORD,FOLLOW_UCWORD_in_predicate1170); 
                     ret = u.toString(); 

                    }
                    break;
                case 3 :
                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:521:5: s= string
                    {
                    pushFollow(FOLLOW_string_in_predicate1180);
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
        }
        return ret;
    }
    // $ANTLR end "predicate"


    // $ANTLR start "func"
    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:524:1: func returns [ProvaObject ret] : (l= LCWORD | u= UCWORD | s= string | tv= typed_variable );
    public final ProvaObject func() throws RecognitionException {
        ProvaObject ret = null;

        CommonTree l=null;
        CommonTree u=null;
        String s = null;

        ProvaObject tv = null;


        try {
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:525:2: (l= LCWORD | u= UCWORD | s= string | tv= typed_variable )
            int alt31=4;
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
            case TYPED_VARIABLE:
                {
                alt31=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:525:4: l= LCWORD
                    {
                    l=(CommonTree)match(input,LCWORD,FOLLOW_LCWORD_in_func1198); 

                    			ret =ProvaParserImpl.tlKB.get().generateTypedConstant(l.toString());
                    		

                    }
                    break;
                case 2 :
                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:528:5: u= UCWORD
                    {
                    u=(CommonTree)match(input,UCWORD,FOLLOW_UCWORD_in_func1208); 

                    			ret =ProvaParserImpl.tlKB.get().generateVariable(u.toString());
                    		

                    }
                    break;
                case 3 :
                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:531:5: s= string
                    {
                    pushFollow(FOLLOW_string_in_func1218);
                    s=string();

                    state._fsp--;


                    			ret =ProvaParserImpl.tlKB.get().generateTypedConstant(s);
                    		

                    }
                    break;
                case 4 :
                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:534:5: tv= typed_variable
                    {
                    pushFollow(FOLLOW_typed_variable_in_func1228);
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
        }
        return ret;
    }
    // $ANTLR end "func"

    protected static class list_body_scope {
        Object rest;
    }
    protected Stack list_body_stack = new Stack();


    // $ANTLR start "list_body"
    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:539:1: list_body returns [ProvaList ret] : ^( LIST_BODY (t= terms (lt= list_tail )? )? ) ;
    public final ProvaList list_body() throws RecognitionException {
        list_body_stack.push(new list_body_scope());
        ProvaList ret = null;

        List<ProvaObject> t = null;

        ProvaObject lt = null;


        try {
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:543:3: ( ^( LIST_BODY (t= terms (lt= list_tail )? )? ) )
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:543:5: ^( LIST_BODY (t= terms (lt= list_tail )? )? )
            {
            match(input,LIST_BODY,FOLLOW_LIST_BODY_in_list_body1250); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:543:17: (t= terms (lt= list_tail )? )?
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==TERM) ) {
                    alt33=1;
                }
                switch (alt33) {
                    case 1 :
                        // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:543:18: t= terms (lt= list_tail )?
                        {
                        pushFollow(FOLLOW_terms_in_list_body1255);
                        t=terms();

                        state._fsp--;

                        // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:543:28: (lt= list_tail )?
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==PROVA_LIST||(LA32_0>=TYPED_VARIABLE && LA32_0<=USWORD)||LA32_0==DOLLARWORD||LA32_0==UCWORD) ) {
                            alt32=1;
                        }
                        switch (alt32) {
                            case 1 :
                                // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:543:28: lt= list_tail
                                {
                                pushFollow(FOLLOW_list_tail_in_list_body1259);
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
            list_body_stack.pop();
        }
        return ret;
    }
    // $ANTLR end "list_body"


    // $ANTLR start "terms"
    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:556:1: terms returns [List<ProvaObject> ret] : ^( TERM (t= term )+ ) ;
    public final List<ProvaObject> terms() throws RecognitionException {
        List<ProvaObject> ret = null;

        ProvaObject t = null;



        	ret = new ArrayList<ProvaObject>();

        try {
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:560:2: ( ^( TERM (t= term )+ ) )
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:560:4: ^( TERM (t= term )+ )
            {
            match(input,TERM,FOLLOW_TERM_in_terms1291); 

            match(input, Token.DOWN, null); 
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:560:11: (t= term )+
            int cnt34=0;
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==MINUS||LA34_0==PROVA_LIST||(LA34_0>=TYPED_VARIABLE && LA34_0<=QUALIFIED_JAVA_CLASS)||LA34_0==DOLLARWORD||LA34_0==PROVA_MAP||(LA34_0>=LCWORD && LA34_0<=SLCWORD)||(LA34_0>=STRING1 && LA34_0<=STRING2)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:560:12: t= term
            	    {
            	    pushFollow(FOLLOW_term_in_terms1296);
            	    t=term();

            	    state._fsp--;

            	    ret.add(t);

            	    }
            	    break;

            	default :
            	    if ( cnt34 >= 1 ) break loop34;
                        EarlyExitException eee =
                            new EarlyExitException(34, input);
                        throw eee;
                }
                cnt34++;
            } while (true);


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret;
    }
    // $ANTLR end "terms"


    // $ANTLR start "term"
    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:563:1: term returns [ProvaObject ret] : (lt= left_term | ft= func_term | map= prova_map );
    public final ProvaObject term() throws RecognitionException {
        ProvaObject ret = null;

        ProvaObject lt = null;

        ProvaObject ft = null;

        ProvaObject map = null;


        try {
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:564:2: (lt= left_term | ft= func_term | map= prova_map )
            int alt35=3;
            alt35 = dfa35.predict(input);
            switch (alt35) {
                case 1 :
                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:565:3: lt= left_term
                    {
                    pushFollow(FOLLOW_left_term_in_term1321);
                    lt=left_term();

                    state._fsp--;

                    ret =lt;

                    }
                    break;
                case 2 :
                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:566:5: ft= func_term
                    {
                    pushFollow(FOLLOW_func_term_in_term1331);
                    ft=func_term();

                    state._fsp--;

                    ret =ft;

                    }
                    break;
                case 3 :
                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:567:5: map= prova_map
                    {
                    pushFollow(FOLLOW_prova_map_in_term1341);
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
        }
        return ret;
    }
    // $ANTLR end "term"


    // $ANTLR start "left_term"
    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:570:1: left_term returns [ProvaObject ret] : (c= constant | v= variable | n= number | p= prova_list );
    public final ProvaObject left_term() throws RecognitionException {
        ProvaObject ret = null;

        ProvaConstant c = null;

        ProvaObject v = null;

        ProvaConstant n = null;

        ProvaList p = null;


        try {
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:571:2: (c= constant | v= variable | n= number | p= prova_list )
            int alt36=4;
            switch ( input.LA(1) ) {
            case QUALIFIED_JAVA_CLASS:
            case LCWORD:
            case SLCWORD:
            case STRING1:
            case STRING2:
                {
                alt36=1;
                }
                break;
            case TYPED_VARIABLE:
            case USWORD:
            case DOLLARWORD:
            case UCWORD:
                {
                alt36=2;
                }
                break;
            case MINUS:
            case INT_LITERAL:
            case LONG_LITERAL:
                {
                alt36=3;
                }
                break;
            case PROVA_LIST:
                {
                alt36=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:571:4: c= constant
                    {
                    pushFollow(FOLLOW_constant_in_left_term1359);
                    c=constant();

                    state._fsp--;

                    ret =c;

                    }
                    break;
                case 2 :
                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:572:5: v= variable
                    {
                    pushFollow(FOLLOW_variable_in_left_term1369);
                    v=variable();

                    state._fsp--;

                    ret =v;

                    }
                    break;
                case 3 :
                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:573:5: n= number
                    {
                    pushFollow(FOLLOW_number_in_left_term1379);
                    n=number();

                    state._fsp--;

                    ret =n;

                    }
                    break;
                case 4 :
                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:574:5: p= prova_list
                    {
                    pushFollow(FOLLOW_prova_list_in_left_term1389);
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
        }
        return ret;
    }
    // $ANTLR end "left_term"


    // $ANTLR start "right_term"
    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:577:1: right_term returns [ProvaObject ret] : ( ( (m= MINUS )? (c= constant | v= variable ) ) | n= number | p= prova_list );
    public final ProvaObject right_term() throws RecognitionException {
        ProvaObject ret = null;

        CommonTree m=null;
        ProvaConstant c = null;

        ProvaObject v = null;

        ProvaConstant n = null;

        ProvaList p = null;



        	((binary_operation_scope)binary_operation_stack.peek()).op ="";

        try {
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:585:2: ( ( (m= MINUS )? (c= constant | v= variable ) ) | n= number | p= prova_list )
            int alt39=3;
            switch ( input.LA(1) ) {
            case MINUS:
                {
                int LA39_1 = input.LA(2);

                if ( ((LA39_1>=TYPED_VARIABLE && LA39_1<=QUALIFIED_JAVA_CLASS)||LA39_1==DOLLARWORD||(LA39_1>=LCWORD && LA39_1<=UCWORD)||LA39_1==SLCWORD||(LA39_1>=STRING1 && LA39_1<=STRING2)) ) {
                    alt39=1;
                }
                else if ( ((LA39_1>=INT_LITERAL && LA39_1<=LONG_LITERAL)) ) {
                    alt39=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 1, input);

                    throw nvae;
                }
                }
                break;
            case TYPED_VARIABLE:
            case USWORD:
            case QUALIFIED_JAVA_CLASS:
            case DOLLARWORD:
            case LCWORD:
            case UCWORD:
            case SLCWORD:
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
            case PROVA_LIST:
                {
                alt39=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:585:4: ( (m= MINUS )? (c= constant | v= variable ) )
                    {
                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:585:4: ( (m= MINUS )? (c= constant | v= variable ) )
                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:585:5: (m= MINUS )? (c= constant | v= variable )
                    {
                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:585:6: (m= MINUS )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==MINUS) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:585:6: m= MINUS
                            {
                            m=(CommonTree)match(input,MINUS,FOLLOW_MINUS_in_right_term1418); 

                            }
                            break;

                    }

                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:585:14: (c= constant | v= variable )
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==QUALIFIED_JAVA_CLASS||LA38_0==LCWORD||LA38_0==SLCWORD||(LA38_0>=STRING1 && LA38_0<=STRING2)) ) {
                        alt38=1;
                    }
                    else if ( ((LA38_0>=TYPED_VARIABLE && LA38_0<=USWORD)||LA38_0==DOLLARWORD||LA38_0==UCWORD) ) {
                        alt38=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 38, 0, input);

                        throw nvae;
                    }
                    switch (alt38) {
                        case 1 :
                            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:585:15: c= constant
                            {
                            pushFollow(FOLLOW_constant_in_right_term1424);
                            c=constant();

                            state._fsp--;

                            ret =c;

                            }
                            break;
                        case 2 :
                            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:585:38: v= variable
                            {
                            pushFollow(FOLLOW_variable_in_right_term1432);
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
                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:586:5: n= number
                    {
                    pushFollow(FOLLOW_number_in_right_term1444);
                    n=number();

                    state._fsp--;

                    ret =n;

                    }
                    break;
                case 3 :
                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:587:5: p= prova_list
                    {
                    pushFollow(FOLLOW_prova_list_in_right_term1454);
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
        }
        return ret;
    }
    // $ANTLR end "right_term"

    protected static class qualified_java_class_scope {
        String s;
    }
    protected Stack qualified_java_class_stack = new Stack();


    // $ANTLR start "qualified_java_class"
    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:589:1: qualified_java_class returns [ProvaConstant ret] : ^( QUALIFIED_JAVA_CLASS ( (l= LCWORD d= DOT ) )+ u= UCWORD ) ;
    public final ProvaConstant qualified_java_class() throws RecognitionException {
        qualified_java_class_stack.push(new qualified_java_class_scope());
        ProvaConstant ret = null;

        CommonTree l=null;
        CommonTree d=null;
        CommonTree u=null;


        	((qualified_java_class_scope)qualified_java_class_stack.peek()).s = "";

        try {
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:602:2: ( ^( QUALIFIED_JAVA_CLASS ( (l= LCWORD d= DOT ) )+ u= UCWORD ) )
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:602:4: ^( QUALIFIED_JAVA_CLASS ( (l= LCWORD d= DOT ) )+ u= UCWORD )
            {
            match(input,QUALIFIED_JAVA_CLASS,FOLLOW_QUALIFIED_JAVA_CLASS_in_qualified_java_class1484); 

            match(input, Token.DOWN, null); 
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:602:27: ( (l= LCWORD d= DOT ) )+
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
            	    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:602:28: (l= LCWORD d= DOT )
            	    {
            	    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:602:28: (l= LCWORD d= DOT )
            	    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:602:29: l= LCWORD d= DOT
            	    {
            	    l=(CommonTree)match(input,LCWORD,FOLLOW_LCWORD_in_qualified_java_class1490); 
            	    d=(CommonTree)match(input,DOT,FOLLOW_DOT_in_qualified_java_class1494); 

            	    }

            	    ((qualified_java_class_scope)qualified_java_class_stack.peek()).s+=l.toString()+d.toString();

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

            u=(CommonTree)match(input,UCWORD,FOLLOW_UCWORD_in_qualified_java_class1503); 

            match(input, Token.UP, null); 

            			((qualified_java_class_scope)qualified_java_class_stack.peek()).s+=u.toString();
            		

            }


            	Class type = ProvaClassUtils.findClass((String) ((qualified_java_class_scope)qualified_java_class_stack.peek()).s);
            	if( type==null )
            		throw new RecognitionException();
            	ret =ProvaParserImpl.tlKB.get().generateTypedConstant(/*((qualified_java_class_scope)qualified_java_class_stack.peek()).s*/type);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            qualified_java_class_stack.pop();
        }
        return ret;
    }
    // $ANTLR end "qualified_java_class"


    // $ANTLR start "func_term"
    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:607:1: func_term returns [ProvaObject ret] : f= func a= args ;
    public final ProvaObject func_term() throws RecognitionException {
        ProvaObject ret = null;

        ProvaObject f = null;

        ProvaList a = null;


        try {
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:608:2: (f= func a= args )
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:608:4: f= func a= args
            {
            pushFollow(FOLLOW_func_in_func_term1523);
            f=func();

            state._fsp--;

            pushFollow(FOLLOW_args_in_func_term1527);
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
        }
        return ret;
    }
    // $ANTLR end "func_term"


    // $ANTLR start "typed_variable"
    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:617:1: typed_variable returns [ProvaObject ret] : ( ^( TYPED_VARIABLE q= qualified_java_class (w= LCWORD | w= UCWORD ) ) | ^( TYPED_VARIABLE u= UCWORD l= LCWORD ) | ^( TYPED_VARIABLE u= UCWORD w= UCWORD ) );
    public final ProvaObject typed_variable() throws RecognitionException {
        ProvaObject ret = null;

        CommonTree w=null;
        CommonTree u=null;
        CommonTree l=null;
        ProvaConstant q = null;


        try {
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:618:2: ( ^( TYPED_VARIABLE q= qualified_java_class (w= LCWORD | w= UCWORD ) ) | ^( TYPED_VARIABLE u= UCWORD l= LCWORD ) | ^( TYPED_VARIABLE u= UCWORD w= UCWORD ) )
            int alt42=3;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==TYPED_VARIABLE) ) {
                int LA42_1 = input.LA(2);

                if ( (LA42_1==DOWN) ) {
                    int LA42_2 = input.LA(3);

                    if ( (LA42_2==UCWORD) ) {
                        int LA42_3 = input.LA(4);

                        if ( (LA42_3==LCWORD) ) {
                            alt42=2;
                        }
                        else if ( (LA42_3==UCWORD) ) {
                            alt42=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 42, 3, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA42_2==QUALIFIED_JAVA_CLASS) ) {
                        alt42=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 42, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 42, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:618:4: ^( TYPED_VARIABLE q= qualified_java_class (w= LCWORD | w= UCWORD ) )
                    {
                    match(input,TYPED_VARIABLE,FOLLOW_TYPED_VARIABLE_in_typed_variable1545); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_qualified_java_class_in_typed_variable1549);
                    q=qualified_java_class();

                    state._fsp--;

                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:618:44: (w= LCWORD | w= UCWORD )
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==LCWORD) ) {
                        alt41=1;
                    }
                    else if ( (LA41_0==UCWORD) ) {
                        alt41=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 41, 0, input);

                        throw nvae;
                    }
                    switch (alt41) {
                        case 1 :
                            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:618:45: w= LCWORD
                            {
                            w=(CommonTree)match(input,LCWORD,FOLLOW_LCWORD_in_typed_variable1554); 

                            }
                            break;
                        case 2 :
                            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:618:54: w= UCWORD
                            {
                            w=(CommonTree)match(input,UCWORD,FOLLOW_UCWORD_in_typed_variable1558); 

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
                    				ret =ProvaParserImpl.tlKB.get().generateTypedConstant(field);
                    			else
                    				ret =ProvaParserImpl.tlKB.get().generateJavaTypeVariable(w.toString(),type);
                    		

                    }
                    break;
                case 2 :
                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:630:5: ^( TYPED_VARIABLE u= UCWORD l= LCWORD )
                    {
                    match(input,TYPED_VARIABLE,FOLLOW_TYPED_VARIABLE_in_typed_variable1572); 

                    match(input, Token.DOWN, null); 
                    u=(CommonTree)match(input,UCWORD,FOLLOW_UCWORD_in_typed_variable1576); 
                    l=(CommonTree)match(input,LCWORD,FOLLOW_LCWORD_in_typed_variable1580); 

                    match(input, Token.UP, null); 

                    			try {
                    				Class<?> type = ProvaClassUtils.findClass("ws.prova."+u.toString());
                    				if( type==null ) {
                    					type = ProvaClassUtils.findClass("java.lang."+u.toString());
                    					if( type==null )
                    						throw new RecognitionException();
                    				}
                    				Object field;
                    				try {
                    					field = type.getField(l.toString()).get(null);
                    				} catch( Exception e1 ) {
                    					throw new RecognitionException();
                    				}
                    				ret =ProvaParserImpl.tlKB.get().generateTypedConstant(field);
                    			} catch( Exception e ) {
                    				throw new RecognitionException();
                    			}
                    		

                    }
                    break;
                case 3 :
                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:650:5: ^( TYPED_VARIABLE u= UCWORD w= UCWORD )
                    {
                    match(input,TYPED_VARIABLE,FOLLOW_TYPED_VARIABLE_in_typed_variable1593); 

                    match(input, Token.DOWN, null); 
                    u=(CommonTree)match(input,UCWORD,FOLLOW_UCWORD_in_typed_variable1597); 
                    w=(CommonTree)match(input,UCWORD,FOLLOW_UCWORD_in_typed_variable1601); 

                    match(input, Token.UP, null); 

                    			try {
                    				Class<?> type = ProvaClassUtils.findClass("ws.prova."+u.toString());
                    				if( type==null ) {
                    					type = ProvaClassUtils.findClass("java.lang."+u.toString());
                    					if( type==null )
                    						throw new RecognitionException();
                    				}
                    				Object field = null;
                    				try {
                    					field = type.getField(w.toString()).get(null);
                    				} catch( Exception e1 ) {}
                    				if( field!=null )
                    					ret =ProvaParserImpl.tlKB.get().generateTypedConstant(field);
                    				else
                    					ret =ProvaParserImpl.tlKB.get().generateJavaTypeVariable(w.toString(),type);
                    			} catch( Exception e ) {
                    				throw new RecognitionException();
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
        }
        return ret;
    }
    // $ANTLR end "typed_variable"


    // $ANTLR start "prova_list"
    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:672:1: prova_list returns [ProvaList ret] : ^( PROVA_LIST l= list_body ) ;
    public final ProvaList prova_list() throws RecognitionException {
        ProvaList ret = null;

        ProvaList l = null;


        try {
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:673:2: ( ^( PROVA_LIST l= list_body ) )
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:673:4: ^( PROVA_LIST l= list_body )
            {
            match(input,PROVA_LIST,FOLLOW_PROVA_LIST_in_prova_list1620); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_list_body_in_prova_list1624);
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
        }
        return ret;
    }
    // $ANTLR end "prova_list"


    // $ANTLR start "prova_map"
    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:676:1: prova_map returns [ProvaObject ret] : ^( PROVA_MAP (kv= key_value )* ) ;
    public final ProvaObject prova_map() throws RecognitionException {
        ProvaObject ret = null;

        List<Object> kv = null;



        	Map<String,Object> map = new HashMap<String,Object>();

        try {
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:683:2: ( ^( PROVA_MAP (kv= key_value )* ) )
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:683:4: ^( PROVA_MAP (kv= key_value )* )
            {
            match(input,PROVA_MAP,FOLLOW_PROVA_MAP_in_prova_map1652); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:683:16: (kv= key_value )*
                loop43:
                do {
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==KEY_VALUE) ) {
                        alt43=1;
                    }


                    switch (alt43) {
                	case 1 :
                	    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:683:17: kv= key_value
                	    {
                	    pushFollow(FOLLOW_key_value_in_prova_map1657);
                	    kv=key_value();

                	    state._fsp--;

                	    map.put(kv.get(0).toString(),kv.get(1));

                	    }
                	    break;

                	default :
                	    break loop43;
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
        }
        return ret;
    }
    // $ANTLR end "prova_map"


    // $ANTLR start "key_value"
    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:686:1: key_value returns [List<Object> ret] : ^( KEY_VALUE (k= mstring v= term ) ) ;
    public final List<Object> key_value() throws RecognitionException {
        List<Object> ret = null;

        String k = null;

        ProvaObject v = null;



        	ret = new ArrayList<Object>();

        try {
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:690:2: ( ^( KEY_VALUE (k= mstring v= term ) ) )
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:690:4: ^( KEY_VALUE (k= mstring v= term ) )
            {
            match(input,KEY_VALUE,FOLLOW_KEY_VALUE_in_key_value1683); 

            match(input, Token.DOWN, null); 
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:690:16: (k= mstring v= term )
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:690:17: k= mstring v= term
            {
            pushFollow(FOLLOW_mstring_in_key_value1688);
            k=mstring();

            state._fsp--;

            pushFollow(FOLLOW_term_in_key_value1692);
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
        }
        return ret;
    }
    // $ANTLR end "key_value"


    // $ANTLR start "variable"
    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:693:1: variable returns [ProvaObject ret] : (u= UCWORD | usw= USWORD | tv= typed_variable | gc= DOLLARWORD );
    public final ProvaObject variable() throws RecognitionException {
        ProvaObject ret = null;

        CommonTree u=null;
        CommonTree usw=null;
        CommonTree gc=null;
        ProvaObject tv = null;


        try {
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:699:2: (u= UCWORD | usw= USWORD | tv= typed_variable | gc= DOLLARWORD )
            int alt44=4;
            switch ( input.LA(1) ) {
            case UCWORD:
                {
                alt44=1;
                }
                break;
            case USWORD:
                {
                alt44=2;
                }
                break;
            case TYPED_VARIABLE:
                {
                alt44=3;
                }
                break;
            case DOLLARWORD:
                {
                alt44=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:700:3: u= UCWORD
                    {
                    u=(CommonTree)match(input,UCWORD,FOLLOW_UCWORD_in_variable1721); 

                    //			// Allow class lookup from pseudo-instance call
                    //			Class<?> type = ProvaClassUtils.findClass("java.lang."+u);
                    //			if( type!=null )
                    //				ret =ProvaConstantImpl.create(type);
                    //			else
                    			ret =ProvaParserImpl.tlKB.get().generateVariable(u.toString());
                    		

                    }
                    break;
                case 2 :
                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:708:5: usw= USWORD
                    {
                    usw=(CommonTree)match(input,USWORD,FOLLOW_USWORD_in_variable1731); 

                    			if( usw.toString().length()==1 )
                    				ret =ProvaParserImpl.tlKB.get().generateVariable(usw.toString());
                    			else
                    				ret =ProvaParserImpl.tlKB.get().generateTypedConstant(ProvaParserImpl.tlObjects.get()[Integer.parseInt(usw.toString().substring(1))]);
                    		

                    }
                    break;
                case 3 :
                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:714:5: tv= typed_variable
                    {
                    pushFollow(FOLLOW_typed_variable_in_variable1741);
                    tv=typed_variable();

                    state._fsp--;

                    ret =tv;

                    }
                    break;
                case 4 :
                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:715:5: gc= DOLLARWORD
                    {
                    gc=(CommonTree)match(input,DOLLARWORD,FOLLOW_DOLLARWORD_in_variable1751); 
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
        }
        return ret;
    }
    // $ANTLR end "variable"


    // $ANTLR start "args"
    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:718:1: args returns [ProvaList ret] : ^( ARGS lb= list_body ) ;
    public final ProvaList args() throws RecognitionException {
        ProvaList ret = null;

        ProvaList lb = null;


        try {
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:719:2: ( ^( ARGS lb= list_body ) )
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:719:4: ^( ARGS lb= list_body )
            {
            match(input,ARGS,FOLLOW_ARGS_in_args1769); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_list_body_in_args1773);
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
        }
        return ret;
    }
    // $ANTLR end "args"


    // $ANTLR start "list_tail"
    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:722:1: list_tail returns [ProvaObject ret] : (v= variable | p= prova_list );
    public final ProvaObject list_tail() throws RecognitionException {
        ProvaObject ret = null;

        ProvaObject v = null;

        ProvaList p = null;



        	((stat_scope)stat_stack.peek()).inRest = true;

        try {
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:729:2: (v= variable | p= prova_list )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=TYPED_VARIABLE && LA45_0<=USWORD)||LA45_0==DOLLARWORD||LA45_0==UCWORD) ) {
                alt45=1;
            }
            else if ( (LA45_0==PROVA_LIST) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:729:4: v= variable
                    {
                    pushFollow(FOLLOW_variable_in_list_tail1802);
                    v=variable();

                    state._fsp--;


                    			ret =v;
                    		

                    }
                    break;
                case 2 :
                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:732:5: p= prova_list
                    {
                    pushFollow(FOLLOW_prova_list_in_list_tail1812);
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
        }
        return ret;
    }
    // $ANTLR end "list_tail"


    // $ANTLR start "constant"
    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:735:1: constant returns [ProvaConstant ret] : (d= ( LCWORD | SLCWORD ) | s= string | qjc= qualified_java_class );
    public final ProvaConstant constant() throws RecognitionException {
        ProvaConstant ret = null;

        CommonTree d=null;
        String s = null;

        ProvaConstant qjc = null;


        try {
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:736:2: (d= ( LCWORD | SLCWORD ) | s= string | qjc= qualified_java_class )
            int alt46=3;
            switch ( input.LA(1) ) {
            case LCWORD:
            case SLCWORD:
                {
                alt46=1;
                }
                break;
            case STRING1:
            case STRING2:
                {
                alt46=2;
                }
                break;
            case QUALIFIED_JAVA_CLASS:
                {
                alt46=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:739:3: d= ( LCWORD | SLCWORD )
                    {
                    d=(CommonTree)input.LT(1);
                    if ( input.LA(1)==LCWORD||input.LA(1)==SLCWORD ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    			Object sd = d.toString();
                    			if( "false".equals(sd) )
                    				ret =ProvaParserImpl.tlKB.get().generateTypedConstant(java.lang.Boolean.FALSE);
                    			else if ("true".equals(sd) )
                    				ret =ProvaParserImpl.tlKB.get().generateTypedConstant(java.lang.Boolean.TRUE);
                    			else
                    				ret =ProvaParserImpl.tlKB.get().generateGlobalConstant((String) sd);
                    		

                    }
                    break;
                case 2 :
                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:748:5: s= string
                    {
                    pushFollow(FOLLOW_string_in_constant1854);
                    s=string();

                    state._fsp--;

                    ret =ProvaParserImpl.tlKB.get().generateTypedConstant(s.toString());

                    }
                    break;
                case 3 :
                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:749:5: qjc= qualified_java_class
                    {
                    pushFollow(FOLLOW_qualified_java_class_in_constant1864);
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
        }
        return ret;
    }
    // $ANTLR end "constant"


    // $ANTLR start "string"
    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:763:1: string returns [String ret] : (s1= STRING1 | s2= STRING2 );
    public final String string() throws RecognitionException {
        String ret = null;

        CommonTree s1=null;
        CommonTree s2=null;

        try {
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:764:2: (s1= STRING1 | s2= STRING2 )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==STRING1) ) {
                alt47=1;
            }
            else if ( (LA47_0==STRING2) ) {
                alt47=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:764:4: s1= STRING1
                    {
                    s1=(CommonTree)match(input,STRING1,FOLLOW_STRING1_in_string1886); 

                    			if( s1.toString().endsWith("'") )
                    				ret =s1.toString().substring(1,s1.toString().length()-1);
                    			else
                    				ret = s1.toString();
                    		

                    }
                    break;
                case 2 :
                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:770:5: s2= STRING2
                    {
                    s2=(CommonTree)match(input,STRING2,FOLLOW_STRING2_in_string1896); 

                    			if( s2.toString().endsWith("\"") )
                    				ret =s2.toString().substring(1,s2.toString().length()-1);
                    			else
                    				ret = s2.toString();
                    		

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret;
    }
    // $ANTLR end "string"


    // $ANTLR start "mstring"
    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:778:1: mstring returns [String ret] : (s= string | l= LCWORD );
    public final String mstring() throws RecognitionException {
        String ret = null;

        CommonTree l=null;
        String s = null;


        try {
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:779:2: (s= string | l= LCWORD )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=STRING1 && LA48_0<=STRING2)) ) {
                alt48=1;
            }
            else if ( (LA48_0==LCWORD) ) {
                alt48=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:779:4: s= string
                    {
                    pushFollow(FOLLOW_string_in_mstring1914);
                    s=string();

                    state._fsp--;

                    ret =s;

                    }
                    break;
                case 2 :
                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:780:5: l= LCWORD
                    {
                    l=(CommonTree)match(input,LCWORD,FOLLOW_LCWORD_in_mstring1924); 
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
        }
        return ret;
    }
    // $ANTLR end "mstring"


    // $ANTLR start "pos_number"
    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:783:1: pos_number returns [Number ret] : (i= INT_LITERAL | l= LONG_LITERAL | f= float_literal );
    public final Number pos_number() throws RecognitionException {
        Number ret = null;

        CommonTree i=null;
        CommonTree l=null;
        String f = null;


        try {
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:784:2: (i= INT_LITERAL | l= LONG_LITERAL | f= float_literal )
            int alt49=3;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==INT_LITERAL) ) {
                int LA49_1 = input.LA(2);

                if ( (LA49_1==DOT) ) {
                    alt49=3;
                }
                else if ( (LA49_1==EOF||LA49_1==UP||(LA49_1>=PLUS && LA49_1<=DIV)||(LA49_1>=OPEN && LA49_1<=CLOSE)||(LA49_1>=EQUAL && LA49_1<=GE)||(LA49_1>=INSTANCE_JAVA_CALL && LA49_1<=STATIC_JAVA_CALL)||LA49_1==PROVA_LIST||(LA49_1>=TYPED_VARIABLE && LA49_1<=QUALIFIED_JAVA_CLASS)||(LA49_1>=REM && LA49_1<=GUARD)||LA49_1==PROVA_MAP||(LA49_1>=LCWORD && LA49_1<=SLCWORD)||(LA49_1>=STRING1 && LA49_1<=STRING2)) ) {
                    alt49=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 49, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA49_0==LONG_LITERAL) ) {
                alt49=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:784:4: i= INT_LITERAL
                    {
                    i=(CommonTree)match(input,INT_LITERAL,FOLLOW_INT_LITERAL_in_pos_number1942); 
                    ret =Integer.parseInt(i.toString());

                    }
                    break;
                case 2 :
                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:785:5: l= LONG_LITERAL
                    {
                    l=(CommonTree)match(input,LONG_LITERAL,FOLLOW_LONG_LITERAL_in_pos_number1952); 
                    String s = l.toString(); ret =Long.parseLong(s.substring(0,s.length()-1));

                    }
                    break;
                case 3 :
                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:786:5: f= float_literal
                    {
                    pushFollow(FOLLOW_float_literal_in_pos_number1962);
                    f=float_literal();

                    state._fsp--;

                    ret =Double.parseDouble(f.toString());

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret;
    }
    // $ANTLR end "pos_number"


    // $ANTLR start "float_literal"
    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:790:1: float_literal returns [String ret] : i1= INT_LITERAL DOT i2= INT_LITERAL (e= EXPONENT )? ;
    public final String float_literal() throws RecognitionException {
        String ret = null;

        CommonTree i1=null;
        CommonTree i2=null;
        CommonTree e=null;

        try {
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:791:2: (i1= INT_LITERAL DOT i2= INT_LITERAL (e= EXPONENT )? )
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:791:4: i1= INT_LITERAL DOT i2= INT_LITERAL (e= EXPONENT )?
            {
            i1=(CommonTree)match(input,INT_LITERAL,FOLLOW_INT_LITERAL_in_float_literal1982); 
            match(input,DOT,FOLLOW_DOT_in_float_literal1984); 
            i2=(CommonTree)match(input,INT_LITERAL,FOLLOW_INT_LITERAL_in_float_literal1988); 
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:791:38: (e= EXPONENT )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==EXPONENT) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:791:39: e= EXPONENT
                    {
                    e=(CommonTree)match(input,EXPONENT,FOLLOW_EXPONENT_in_float_literal1993); 

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
        }
        return ret;
    }
    // $ANTLR end "float_literal"


    // $ANTLR start "number"
    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:799:1: number returns [ProvaConstant ret] : (m= '-' )? p= pos_number ;
    public final ProvaConstant number() throws RecognitionException {
        ProvaConstant ret = null;

        CommonTree m=null;
        Number p = null;


        try {
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:800:2: ( (m= '-' )? p= pos_number )
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:800:4: (m= '-' )? p= pos_number
            {
            // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:800:5: (m= '-' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==MINUS) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // C:\\workspace-sts\\prova-compact-sw\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:800:5: m= '-'
                    {
                    m=(CommonTree)match(input,MINUS,FOLLOW_MINUS_in_number2015); 

                    }
                    break;

            }

            pushFollow(FOLLOW_pos_number_in_number2020);
            p=pos_number();

            state._fsp--;


            			if( m==null ) {
            				ret =ProvaParserImpl.tlKB.get().generateTypedConstant(p);
            			} else if( p instanceof Integer ) {
            				ret =ProvaParserImpl.tlKB.get().generateTypedConstant(-((Integer) p));
            			} else if( p instanceof Long ) {
            				ret =ProvaParserImpl.tlKB.get().generateTypedConstant(-((Long) p));
            			} else if( p instanceof Double ) {
            				ret =ProvaParserImpl.tlKB.get().generateTypedConstant(-((Double) p));
            			}
            		

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret;
    }
    // $ANTLR end "number"

    // Delegated rules


    protected DFA7 dfa7 = new DFA7(this);
    protected DFA20 dfa20 = new DFA20(this);
    protected DFA35 dfa35 = new DFA35(this);
    static final String DFA7_eotS =
        "\26\uffff";
    static final String DFA7_eofS =
        "\26\uffff";
    static final String DFA7_minS =
        "\1\30\1\2\1\35\1\2\2\uffff\1\53\1\2\1\66\5\3\1\70\3\3\1\70\1\41"+
        "\2\3";
    static final String DFA7_maxS =
        "\1\30\1\2\1\66\1\2\2\uffff\1\53\1\2\1\66\5\75\1\71\2\75\1\53\1"+
        "\70\1\66\1\76\1\75";
    static final String DFA7_acceptS =
        "\4\uffff\1\1\1\2\20\uffff";
    static final String DFA7_specialS =
        "\26\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3\3\uffff\1\4\24\uffff\1\5",
            "\1\6",
            "",
            "",
            "\1\7",
            "\1\10",
            "\1\11",
            "\1\21\2\uffff\1\16\57\uffff\1\12\1\13\1\17\1\20\2\uffff\1"+
            "\14\1\15",
            "\1\21\2\uffff\1\16\57\uffff\1\12\1\13\1\17\1\20\2\uffff\1"+
            "\14\1\15",
            "\1\21\2\uffff\1\16\57\uffff\1\12\1\13\1\17\1\20\2\uffff\1"+
            "\14\1\15",
            "\1\21\2\uffff\1\16\57\uffff\1\12\1\13\1\17\1\20\2\uffff\1"+
            "\14\1\15",
            "\1\21\2\uffff\1\16\57\uffff\1\12\1\13\1\17\1\20\2\uffff\1"+
            "\14\1\15",
            "\1\17\1\20",
            "\1\21\1\22\1\uffff\1\16\57\uffff\1\12\1\13\1\17\1\20\2\uffff"+
            "\1\14\1\15",
            "\1\21\2\uffff\1\16\57\uffff\1\12\1\13\1\17\1\20\2\uffff\1"+
            "\14\1\15",
            "\1\23\47\uffff\1\7",
            "\1\24",
            "\1\4\24\uffff\1\5",
            "\1\21\2\uffff\1\16\57\uffff\1\12\1\13\1\17\1\20\2\uffff\1"+
            "\14\1\15\1\25",
            "\1\21\2\uffff\1\16\57\uffff\1\12\1\13\1\17\1\20\2\uffff\1"+
            "\14\1\15"
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
            return "112:1: clause returns [ProvaRule ret] : ( ^(cl= CLAUSE (m= metadata )? r= relation (l= literals )? ) | ^(cl= CLAUSE (m= metadata )? pred= LCWORD params= list_body result= list_body (l= literals )? ) );";
        }
    }
    static final String DFA20_eotS =
        "\14\uffff";
    static final String DFA20_eofS =
        "\14\uffff";
    static final String DFA20_minS =
        "\1\6\1\2\1\3\3\uffff\1\66\1\uffff\1\4\1\66\2\3";
    static final String DFA20_maxS =
        "\1\75\1\2\1\56\3\uffff\1\66\1\uffff\1\4\1\67\1\3\1\56";
    static final String DFA20_acceptS =
        "\3\uffff\1\2\1\3\1\4\1\uffff\1\1\4\uffff";
    static final String DFA20_specialS =
        "\14\uffff}>";
    static final String[] DFA20_transitionS = {
            "\1\5\5\uffff\1\5\26\uffff\2\5\1\uffff\1\3\1\uffff\2\5\1\1\2"+
            "\uffff\1\5\10\uffff\1\4\1\2\2\5\1\4\1\uffff\2\4",
            "\1\6",
            "\1\5\1\uffff\4\5\36\uffff\1\7\4\uffff\1\5\1\uffff\1\5",
            "",
            "",
            "",
            "\1\10",
            "",
            "\1\11",
            "\1\10\1\12",
            "\1\13",
            "\1\4\43\uffff\1\7\6\uffff\1\4"
    };

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "290:10: (cjc= constructor_java_call | pl= prova_list | c= constant | e= expr )";
        }
    }
    static final String DFA35_eotS =
        "\30\uffff";
    static final String DFA35_eofS =
        "\30\uffff";
    static final String DFA35_minS =
        "\1\6\3\3\1\uffff\1\3\1\2\2\uffff\1\52\1\66\1\2\2\3\1\66\2\3\1\4"+
        "\1\66\1\3\1\66\3\3";
    static final String DFA35_maxS =
        "\4\75\1\uffff\1\75\1\2\2\uffff\2\67\1\2\2\3\1\66\2\75\1\4\1\67"+
        "\1\3\1\67\2\3\1\75";
    static final String DFA35_acceptS =
        "\4\uffff\1\1\2\uffff\1\3\1\2\17\uffff";
    static final String DFA35_specialS =
        "\30\uffff}>";
    static final String[] DFA35_transitionS = {
            "\1\4\37\uffff\1\4\1\uffff\1\6\2\4\2\uffff\1\4\3\uffff\1\7\4"+
            "\uffff\1\1\1\5\3\4\1\uffff\1\2\1\3",
            "\1\4\2\uffff\1\4\37\uffff\1\4\1\10\3\4\2\uffff\1\4\3\uffff"+
            "\1\4\4\uffff\5\4\1\uffff\2\4",
            "\1\4\2\uffff\1\4\37\uffff\1\4\1\10\3\4\2\uffff\1\4\3\uffff"+
            "\1\4\4\uffff\5\4\1\uffff\2\4",
            "\1\4\2\uffff\1\4\37\uffff\1\4\1\10\3\4\2\uffff\1\4\3\uffff"+
            "\1\4\4\uffff\5\4\1\uffff\2\4",
            "",
            "\1\4\2\uffff\1\4\37\uffff\1\4\1\10\3\4\2\uffff\1\4\3\uffff"+
            "\1\4\4\uffff\5\4\1\uffff\2\4",
            "\1\11",
            "",
            "",
            "\1\13\14\uffff\1\12",
            "\1\14\1\15",
            "\1\16",
            "\1\17",
            "\1\20",
            "\1\21",
            "\1\4\2\uffff\1\4\37\uffff\1\4\1\10\3\4\2\uffff\1\4\3\uffff"+
            "\1\4\4\uffff\5\4\1\uffff\2\4",
            "\1\4\2\uffff\1\4\37\uffff\1\4\1\10\3\4\2\uffff\1\4\3\uffff"+
            "\1\4\4\uffff\5\4\1\uffff\2\4",
            "\1\22",
            "\1\21\1\23",
            "\1\24",
            "\1\25\1\26",
            "\1\27",
            "\1\27",
            "\1\4\2\uffff\1\4\37\uffff\1\4\1\10\3\4\2\uffff\1\4\3\uffff"+
            "\1\4\4\uffff\5\4\1\uffff\2\4"
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
            return "563:1: term returns [ProvaObject ret] : (lt= left_term | ft= func_term | map= prova_map );";
        }
    }
 

    public static final BitSet FOLLOW_RULEBASE_in_rulebase63 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_rulebase68 = new BitSet(new long[]{0x0000000004000008L});
    public static final BitSet FOLLOW_STATEMENT_in_statement88 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_stat_in_statement92 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_clause_in_stat125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_query_in_stat134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLAUSE_in_clause153 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_metadata_in_clause157 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_relation_in_clause162 = new BitSet(new long[]{0x0000000010000008L});
    public static final BitSet FOLLOW_literals_in_clause166 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CLAUSE_in_clause180 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_metadata_in_clause184 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_LCWORD_in_clause189 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_list_body_in_clause193 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_list_body_in_clause197 = new BitSet(new long[]{0x0000000010000008L});
    public static final BitSet FOLLOW_literals_in_clause201 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_METADATA_in_metadata227 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotation_in_metadata232 = new BitSet(new long[]{0x0000080000000008L});
    public static final BitSet FOLLOW_ANNOTATION_in_annotation266 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_LCWORD_in_annotation270 = new BitSet(new long[]{0x33C0000000000048L});
    public static final BitSet FOLLOW_value_in_annotation277 = new BitSet(new long[]{0x33C0000000000048L});
    public static final BitSet FOLLOW_LCWORD_in_value299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UCWORD_in_value309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_in_value319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_value329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LITERAL_in_literals352 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_literal_in_literals357 = new BitSet(new long[]{0x00080000C0000808L});
    public static final BitSet FOLLOW_FUNCTION_CALL_in_function_call383 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_predicate_in_function_call387 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_list_body_in_function_call391 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_list_body_in_function_call395 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RELATION_in_literal417 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_metadata_in_literal421 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_relation_in_literal426 = new BitSet(new long[]{0x0000400000000008L});
    public static final BitSet FOLLOW_guard_in_literal430 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SEMANTIC_ATTACHMENT_in_literal442 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_metadata_in_literal446 = new BitSet(new long[]{0x37C0275800000040L});
    public static final BitSet FOLLOW_semantic_attachment_in_literal451 = new BitSet(new long[]{0x0000400000000008L});
    public static final BitSet FOLLOW_guard_in_literal455 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FUNCTION_in_literal467 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_metadata_in_literal471 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_function_call_in_literal476 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CUT_in_literal487 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_cut_in_literal491 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GUARD_in_guard511 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_literals_in_guard515 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CUT_in_cut528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_predicate_java_call_in_semantic_attachment549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_binary_operation_in_semantic_attachment559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_static_java_call_in_predicate_java_call577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instance_java_call_in_predicate_java_call587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STATIC_JAVA_CALL_in_static_java_call604 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_static_call_in_static_java_call608 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_args_in_static_java_call612 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_left_term_in_binary_operation638 = new BitSet(new long[]{0x33C0231800FE1040L});
    public static final BitSet FOLLOW_EQUAL_in_binary_operation645 = new BitSet(new long[]{0x37C0275800FE1040L});
    public static final BitSet FOLLOW_constructor_java_call_in_binary_operation654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prova_list_in_binary_operation665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_binary_operation676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_binary_operation691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_not_equal_in_binary_operation704 = new BitSet(new long[]{0x3440040000000000L});
    public static final BitSet FOLLOW_constant_in_binary_operation708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_binary_operator_in_binary_operation718 = new BitSet(new long[]{0x33C0231800FE1040L});
    public static final BitSet FOLLOW_expr_in_binary_operation722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_aterm_in_expr754 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_set_in_expr759 = new BitSet(new long[]{0x33C0231800FE1040L});
    public static final BitSet FOLLOW_aterm_in_expr767 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_MINUS_in_aterm792 = new BitSet(new long[]{0x0080230000000000L});
    public static final BitSet FOLLOW_variable_in_aterm797 = new BitSet(new long[]{0x0000100000000182L});
    public static final BitSet FOLLOW_number_in_aterm803 = new BitSet(new long[]{0x0000100000000182L});
    public static final BitSet FOLLOW_MINUS_in_aterm809 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_predicate_java_call_in_aterm814 = new BitSet(new long[]{0x0000100000000182L});
    public static final BitSet FOLLOW_OPEN_in_aterm818 = new BitSet(new long[]{0x33C0231800FE1040L});
    public static final BitSet FOLLOW_expr_in_aterm822 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_CLOSE_in_aterm824 = new BitSet(new long[]{0x0000100000000182L});
    public static final BitSet FOLLOW_set_in_aterm830 = new BitSet(new long[]{0x33C0231800FE1040L});
    public static final BitSet FOLLOW_aterm_in_aterm840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_variable_or_number860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_variable_or_number868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualified_java_class_in_constructor_java_call891 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_UCWORD_in_constructor_java_call901 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_args_in_constructor_java_call909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_not_equal_in_binary_operator930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_binary_operator938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_binary_operator946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LE_in_binary_operator954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GE_in_binary_operator962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_not_equal0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTANCE_JAVA_CALL_in_instance_java_call994 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_instance_call_in_instance_java_call998 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_args_in_instance_java_call1002 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_variable_in_instance_call1033 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_LCWORD_in_instance_call1037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualified_java_class_in_static_call1060 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_LCWORD_in_static_call1064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_query_predicate1082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUERY_in_query1099 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_query_predicate_in_query1103 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_relation_in_query1107 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PREDICATE_in_relation1130 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_predicate_in_relation1134 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_list_body_in_relation1138 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LCWORD_in_predicate1160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UCWORD_in_predicate1170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_in_predicate1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCWORD_in_func1198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UCWORD_in_func1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_in_func1218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typed_variable_in_func1228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LIST_BODY_in_list_body1250 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_terms_in_list_body1255 = new BitSet(new long[]{0x37C0275800000048L});
    public static final BitSet FOLLOW_list_tail_in_list_body1259 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TERM_in_terms1291 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_term_in_terms1296 = new BitSet(new long[]{0x37C2275800000048L});
    public static final BitSet FOLLOW_left_term_in_term1321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_func_term_in_term1331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prova_map_in_term1341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_left_term1359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_left_term1369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_left_term1379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prova_list_in_left_term1389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_right_term1418 = new BitSet(new long[]{0x34C0270000000000L});
    public static final BitSet FOLLOW_constant_in_right_term1424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_right_term1432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_right_term1444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prova_list_in_right_term1454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUALIFIED_JAVA_CLASS_in_qualified_java_class1484 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_LCWORD_in_qualified_java_class1490 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_DOT_in_qualified_java_class1494 = new BitSet(new long[]{0x00C0000000000000L});
    public static final BitSet FOLLOW_UCWORD_in_qualified_java_class1503 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_func_in_func_term1523 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_args_in_func_term1527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPED_VARIABLE_in_typed_variable1545 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_qualified_java_class_in_typed_variable1549 = new BitSet(new long[]{0x00C0000000000000L});
    public static final BitSet FOLLOW_LCWORD_in_typed_variable1554 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UCWORD_in_typed_variable1558 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TYPED_VARIABLE_in_typed_variable1572 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_UCWORD_in_typed_variable1576 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_LCWORD_in_typed_variable1580 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TYPED_VARIABLE_in_typed_variable1593 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_UCWORD_in_typed_variable1597 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_UCWORD_in_typed_variable1601 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PROVA_LIST_in_prova_list1620 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_list_body_in_prova_list1624 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PROVA_MAP_in_prova_map1652 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_key_value_in_prova_map1657 = new BitSet(new long[]{0x0004000000000008L});
    public static final BitSet FOLLOW_KEY_VALUE_in_key_value1683 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_mstring_in_key_value1688 = new BitSet(new long[]{0x37C2275800000048L});
    public static final BitSet FOLLOW_term_in_key_value1692 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UCWORD_in_variable1721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USWORD_in_variable1731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typed_variable_in_variable1741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOLLARWORD_in_variable1751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARGS_in_args1769 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_list_body_in_args1773 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_variable_in_list_tail1802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prova_list_in_list_tail1812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_constant1839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_in_constant1854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualified_java_class_in_constant1864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING1_in_string1886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING2_in_string1896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_in_mstring1914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCWORD_in_mstring1924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_LITERAL_in_pos_number1942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONG_LITERAL_in_pos_number1952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_float_literal_in_pos_number1962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_LITERAL_in_float_literal1982 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_DOT_in_float_literal1984 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_INT_LITERAL_in_float_literal1988 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_EXPONENT_in_float_literal1993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_number2015 = new BitSet(new long[]{0x33C0000000000040L});
    public static final BitSet FOLLOW_pos_number_in_number2020 = new BitSet(new long[]{0x0000000000000002L});

}