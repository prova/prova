// $ANTLR 3.2 Sep 23, 2009 12:02:23 D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g 2010-10-29 19:00:44

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "DOT", "PLUS", "MINUS", "MULT", "DIV", "COMMA", "IF", "CUT", "OPEN", "CLOSE", "BAR", "BRA", "KET", "EQUAL", "NOT_EQUAL1", "NOT_EQUAL2", "LT", "GT", "LE", "GE", "CLAUSE", "RULEBASE", "STATEMENT", "QUERY", "LITERAL", "METADATA", "RELATION", "SEMANTIC_ATTACHMENT", "ARITHMETIC_RELATION", "PREDICATE", "TERM", "INSTANCE_JAVA_CALL", "STATIC_JAVA_CALL", "LIST_BODY", "PROVA_LIST", "ARGS", "TYPED_VARIABLE", "USWORD", "QUALIFIED_JAVA_CLASS", "ANNOTATION", "REM", "DOLLARWORD", "GUARD", "ATERM", "EXPR", "PROVA_MAP", "KEY_VALUE", "FUNCTION", "NEWLINE", "LCWORD", "UCWORD", "INT_LITERAL", "LONG_LITERAL", "STRING1", "STRING2", "EXPONENT", "DIGIT", "LC", "UC", "WORD", "DOLLAR", "UNDERSCORE", "ML_COMMENT", "WS", "CLEAN_STRING", "CHAR_ESC", "':'", "'@'", "'{'", "'}'", "'->'"
    };
    public static final int DOLLAR=64;
    public static final int FUNCTION=51;
    public static final int TERM=34;
    public static final int LT=20;
    public static final int EXPONENT=59;
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
    public static final int MINUS=6;
    public static final int REM=44;
    public static final int MULT=7;
    public static final int LONG_LITERAL=56;
    public static final int PROVA_LIST=38;
    public static final int CUT=11;
    public static final int LCWORD=53;
    public static final int OPEN=12;
    public static final int QUALIFIED_JAVA_CLASS=42;
    public static final int T__71=71;
    public static final int WS=67;
    public static final int T__72=72;
    public static final int NEWLINE=52;
    public static final int T__70=70;
    public static final int CLOSE=13;
    public static final int UCWORD=54;
    public static final int LIST_BODY=37;
    public static final int CLEAN_STRING=68;
    public static final int QUERY=27;
    public static final int GT=21;
    public static final int LC=61;
    public static final int ARITHMETIC_RELATION=32;
    public static final int GUARD=46;
    public static final int DIV=8;
    public static final int METADATA=29;
    public static final int INSTANCE_JAVA_CALL=35;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int LE=22;
    public static final int BRA=15;
    public static final int BAR=14;
    public static final int NOT_EQUAL2=19;
    public static final int NOT_EQUAL1=18;

    // delegates
    // delegators


        public ProvaWalker2(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public ProvaWalker2(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return ProvaWalker2.tokenNames; }
    public String getGrammarFileName() { return "D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g"; }


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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:53:1: rulebase returns [List ret] : ^( RULEBASE (s= statement )* ) ;
    public final List rulebase() throws RecognitionException {
        rulebase_stack.push(new rulebase_scope());
        List ret = null;

        List s = null;



        	((rulebase_scope)rulebase_stack.peek()).ret0 = new ArrayList();

        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:63:2: ( ^( RULEBASE (s= statement )* ) )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:63:4: ^( RULEBASE (s= statement )* )
            {
            match(input,RULEBASE,FOLLOW_RULEBASE_in_rulebase63); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:63:15: (s= statement )*
                loop1:
                do {
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==STATEMENT) ) {
                        alt1=1;
                    }


                    switch (alt1) {
                	case 1 :
                	    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:63:16: s= statement
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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:66:1: statement returns [List ret] : ^( STATEMENT st= stat ) ;
    public final List statement() throws RecognitionException {
        List ret = null;

        List st = null;


        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:67:2: ( ^( STATEMENT st= stat ) )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:67:4: ^( STATEMENT st= stat )
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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:69:1: stat returns [List ret] : (c= clause | q= query );
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
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:101:2: (c= clause | q= query )
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
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:102:2: c= clause
                    {
                    pushFollow(FOLLOW_clause_in_stat125);
                    c=clause();

                    state._fsp--;


                    		((stat_scope)stat_stack.peek()).ret0[2]=c;
                    	

                    }
                    break;
                case 2 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:105:4: q= query
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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:112:1: clause returns [ProvaRule ret] : ( ^(cl= CLAUSE (m= metadata )? r= relation (l= literals )? ) | ^(cl= CLAUSE (m= metadata )? pred= LCWORD params= list_body result= list_body (l= literals )? ) );
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
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:112:31: ( ^(cl= CLAUSE (m= metadata )? r= relation (l= literals )? ) | ^(cl= CLAUSE (m= metadata )? pred= LCWORD params= list_body result= list_body (l= literals )? ) )
            int alt7=2;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:113:2: ^(cl= CLAUSE (m= metadata )? r= relation (l= literals )? )
                    {
                    cl=(CommonTree)match(input,CLAUSE,FOLLOW_CLAUSE_in_clause153); 

                    match(input, Token.DOWN, null); 
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:113:15: (m= metadata )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==METADATA) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:113:15: m= metadata
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

                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:113:38: (l= literals )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==LITERAL) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:113:38: l= literals
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
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:124:2: ^(cl= CLAUSE (m= metadata )? pred= LCWORD params= list_body result= list_body (l= literals )? )
                    {
                    cl=(CommonTree)match(input,CLAUSE,FOLLOW_CLAUSE_in_clause180); 

                    match(input, Token.DOWN, null); 
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:124:15: (m= metadata )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==METADATA) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:124:15: m= metadata
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

                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:124:73: (l= literals )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==LITERAL) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:124:73: l= literals
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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:145:1: metadata returns [Map<String,List<Object>> ret] : ^( METADATA (a= annotation )+ ) ;
    public final Map<String,List<Object>> metadata() throws RecognitionException {
        Map<String,List<Object>> ret = null;

        List<Object> a = null;



        	ret = new HashMap<String,List<Object>>();

        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:149:2: ( ^( METADATA (a= annotation )+ ) )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:149:4: ^( METADATA (a= annotation )+ )
            {
            match(input,METADATA,FOLLOW_METADATA_in_metadata227); 

            match(input, Token.DOWN, null); 
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:149:15: (a= annotation )+
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
            	    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:149:16: a= annotation
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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:152:1: annotation returns [List<Object> ret] : ^( ANNOTATION n= LCWORD (v= value )* ) ;
    public final List<Object> annotation() throws RecognitionException {
        annotation_stack.push(new annotation_scope());
        List<Object> ret = null;

        CommonTree n=null;
        String v = null;



        	ret = new ArrayList<Object>();
        	((annotation_scope)annotation_stack.peek()).value = new ArrayList<String>(); 

        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:163:2: ( ^( ANNOTATION n= LCWORD (v= value )* ) )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:163:4: ^( ANNOTATION n= LCWORD (v= value )* )
            {
            match(input,ANNOTATION,FOLLOW_ANNOTATION_in_annotation266); 

            match(input, Token.DOWN, null); 
            n=(CommonTree)match(input,LCWORD,FOLLOW_LCWORD_in_annotation270); 
            ret.add(n.toString());
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:163:52: (v= value )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==MINUS||(LA9_0>=LCWORD && LA9_0<=STRING2)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:163:53: v= value
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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:166:1: value returns [String ret] : (l= LCWORD | u= UCWORD | s= string | n= number );
    public final String value() throws RecognitionException {
        String ret = null;

        CommonTree l=null;
        CommonTree u=null;
        String s = null;

        ProvaConstant n = null;


        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:167:2: (l= LCWORD | u= UCWORD | s= string | n= number )
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
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:167:4: l= LCWORD
                    {
                    l=(CommonTree)match(input,LCWORD,FOLLOW_LCWORD_in_value299); 
                    ret = l.toString();

                    }
                    break;
                case 2 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:168:5: u= UCWORD
                    {
                    u=(CommonTree)match(input,UCWORD,FOLLOW_UCWORD_in_value309); 
                     ret = u.toString(); 

                    }
                    break;
                case 3 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:169:5: s= string
                    {
                    pushFollow(FOLLOW_string_in_value319);
                    s=string();

                    state._fsp--;

                     ret = s; 

                    }
                    break;
                case 4 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:170:5: n= number
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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:173:1: literals returns [List<ProvaLiteral> ret] : ^( LITERAL (l= literal )+ ) ;
    public final List<ProvaLiteral> literals() throws RecognitionException {
        List<ProvaLiteral> ret = null;

        ProvaLiteral l = null;



        	ret = new ArrayList<ProvaLiteral>();
        	((stat_scope)stat_stack.peek()).isBody = true;

        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:178:2: ( ^( LITERAL (l= literal )+ ) )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:178:4: ^( LITERAL (l= literal )+ )
            {
            match(input,LITERAL,FOLLOW_LITERAL_in_literals352); 

            match(input, Token.DOWN, null); 
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:178:14: (l= literal )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==CUT||(LA11_0>=RELATION && LA11_0<=SEMANTIC_ATTACHMENT)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:178:15: l= literal
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


    // $ANTLR start "literal"
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:181:1: literal returns [ProvaLiteral ret] : ( ^(rel= RELATION (m= metadata )? r= relation (g= guard )? ) | ^(sem= SEMANTIC_ATTACHMENT (m= metadata )? sa= semantic_attachment (g= guard )? ) | ^(cu= CUT c= cut ) );
    public final ProvaLiteral literal() throws RecognitionException {
        ProvaLiteral ret = null;

        CommonTree rel=null;
        CommonTree sem=null;
        CommonTree cu=null;
        Map<String,List<Object>> m = null;

        List r = null;

        List<ProvaLiteral> g = null;

        List<ProvaObject> sa = null;


        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:182:2: ( ^(rel= RELATION (m= metadata )? r= relation (g= guard )? ) | ^(sem= SEMANTIC_ATTACHMENT (m= metadata )? sa= semantic_attachment (g= guard )? ) | ^(cu= CUT c= cut ) )
            int alt16=3;
            switch ( input.LA(1) ) {
            case RELATION:
                {
                alt16=1;
                }
                break;
            case SEMANTIC_ATTACHMENT:
                {
                alt16=2;
                }
                break;
            case CUT:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:183:2: ^(rel= RELATION (m= metadata )? r= relation (g= guard )? )
                    {
                    rel=(CommonTree)match(input,RELATION,FOLLOW_RELATION_in_literal380); 

                    match(input, Token.DOWN, null); 
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:183:18: (m= metadata )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==METADATA) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:183:18: m= metadata
                            {
                            pushFollow(FOLLOW_metadata_in_literal384);
                            m=metadata();

                            state._fsp--;


                            }
                            break;

                    }

                    pushFollow(FOLLOW_relation_in_literal389);
                    r=relation();

                    state._fsp--;

                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:183:41: (g= guard )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==GUARD) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:183:41: g= guard
                            {
                            pushFollow(FOLLOW_guard_in_literal393);
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
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:201:4: ^(sem= SEMANTIC_ATTACHMENT (m= metadata )? sa= semantic_attachment (g= guard )? )
                    {
                    sem=(CommonTree)match(input,SEMANTIC_ATTACHMENT,FOLLOW_SEMANTIC_ATTACHMENT_in_literal405); 

                    match(input, Token.DOWN, null); 
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:201:31: (m= metadata )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==METADATA) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:201:31: m= metadata
                            {
                            pushFollow(FOLLOW_metadata_in_literal409);
                            m=metadata();

                            state._fsp--;


                            }
                            break;

                    }

                    pushFollow(FOLLOW_semantic_attachment_in_literal414);
                    sa=semantic_attachment();

                    state._fsp--;

                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:201:66: (g= guard )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==GUARD) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:201:66: g= guard
                            {
                            pushFollow(FOLLOW_guard_in_literal418);
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
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:206:4: ^(cu= CUT c= cut )
                    {
                    cu=(CommonTree)match(input,CUT,FOLLOW_CUT_in_literal430); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_cut_in_literal434);
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
        }
        return ret;
    }
    // $ANTLR end "literal"


    // $ANTLR start "guard"
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:214:1: guard returns [List<ProvaLiteral> ret] : ^(g= GUARD lits= literals ) ;
    public final List<ProvaLiteral> guard() throws RecognitionException {
        List<ProvaLiteral> ret = null;

        CommonTree g=null;
        List<ProvaLiteral> lits = null;


        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:215:2: ( ^(g= GUARD lits= literals ) )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:215:4: ^(g= GUARD lits= literals )
            {
            g=(CommonTree)match(input,GUARD,FOLLOW_GUARD_in_guard454); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_literals_in_guard458);
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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:220:1: cut : CUT ;
    public final void cut() throws RecognitionException {
        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:221:2: ( CUT )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:221:4: CUT
            {
            match(input,CUT,FOLLOW_CUT_in_cut471); 

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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:224:1: semantic_attachment returns [List<ProvaObject> ret] : (pjc= predicate_java_call | bo= binary_operation );
    public final List<ProvaObject> semantic_attachment() throws RecognitionException {
        List<ProvaObject> ret = null;

        List<ProvaObject> pjc = null;

        List<ProvaObject> bo = null;



        	ret = new ArrayList<ProvaObject>();

        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:228:2: (pjc= predicate_java_call | bo= binary_operation )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=INSTANCE_JAVA_CALL && LA17_0<=STATIC_JAVA_CALL)) ) {
                alt17=1;
            }
            else if ( (LA17_0==MINUS||LA17_0==PROVA_LIST||(LA17_0>=TYPED_VARIABLE && LA17_0<=QUALIFIED_JAVA_CLASS)||LA17_0==DOLLARWORD||(LA17_0>=LCWORD && LA17_0<=STRING2)) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:228:4: pjc= predicate_java_call
                    {
                    pushFollow(FOLLOW_predicate_java_call_in_semantic_attachment492);
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
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:235:5: bo= binary_operation
                    {
                    pushFollow(FOLLOW_binary_operation_in_semantic_attachment502);
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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:243:1: predicate_java_call returns [List<ProvaObject> ret] : (sjc= static_java_call | ijc= instance_java_call );
    public final List<ProvaObject> predicate_java_call() throws RecognitionException {
        List<ProvaObject> ret = null;

        List<ProvaObject> sjc = null;

        List<ProvaObject> ijc = null;


        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:244:2: (sjc= static_java_call | ijc= instance_java_call )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==STATIC_JAVA_CALL) ) {
                alt18=1;
            }
            else if ( (LA18_0==INSTANCE_JAVA_CALL) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:244:4: sjc= static_java_call
                    {
                    pushFollow(FOLLOW_static_java_call_in_predicate_java_call520);
                    sjc=static_java_call();

                    state._fsp--;


                    			ret =sjc;
                    		

                    }
                    break;
                case 2 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:247:5: ijc= instance_java_call
                    {
                    pushFollow(FOLLOW_instance_java_call_in_predicate_java_call530);
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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:252:1: static_java_call returns [List<ProvaObject> ret] : ^( STATIC_JAVA_CALL sc= static_call a= args ) ;
    public final List<ProvaObject> static_java_call() throws RecognitionException {
        List<ProvaObject> ret = null;

        List<ProvaObject> sc = null;

        ProvaList a = null;


        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:253:2: ( ^( STATIC_JAVA_CALL sc= static_call a= args ) )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:253:4: ^( STATIC_JAVA_CALL sc= static_call a= args )
            {
            match(input,STATIC_JAVA_CALL,FOLLOW_STATIC_JAVA_CALL_in_static_java_call547); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_static_call_in_static_java_call551);
            sc=static_call();

            state._fsp--;

            pushFollow(FOLLOW_args_in_static_java_call555);
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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:259:1: binary_operation returns [List<ProvaObject> ret] : lt= left_term ( EQUAL (cjc= constructor_java_call | pl= prova_list | c= constant | e= expr ) | not_equal c= constant | bo= binary_operator e= expr ) ;
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
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:263:2: (lt= left_term ( EQUAL (cjc= constructor_java_call | pl= prova_list | c= constant | e= expr ) | not_equal c= constant | bo= binary_operator e= expr ) )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:264:3: lt= left_term ( EQUAL (cjc= constructor_java_call | pl= prova_list | c= constant | e= expr ) | not_equal c= constant | bo= binary_operator e= expr )
            {
            pushFollow(FOLLOW_left_term_in_binary_operation581);
            lt=left_term();

            state._fsp--;

            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:264:16: ( EQUAL (cjc= constructor_java_call | pl= prova_list | c= constant | e= expr ) | not_equal c= constant | bo= binary_operator e= expr )
            int alt20=3;
            switch ( input.LA(1) ) {
            case EQUAL:
                {
                alt20=1;
                }
                break;
            case NOT_EQUAL1:
            case NOT_EQUAL2:
                {
                int LA20_2 = input.LA(2);

                if ( (LA20_2==MINUS||LA20_2==OPEN||(LA20_2>=INSTANCE_JAVA_CALL && LA20_2<=STATIC_JAVA_CALL)||(LA20_2>=TYPED_VARIABLE && LA20_2<=USWORD)||LA20_2==DOLLARWORD||(LA20_2>=UCWORD && LA20_2<=LONG_LITERAL)) ) {
                    alt20=3;
                }
                else if ( (LA20_2==QUALIFIED_JAVA_CLASS||LA20_2==LCWORD||(LA20_2>=STRING1 && LA20_2<=STRING2)) ) {
                    alt20=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 2, input);

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
                alt20=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:265:4: EQUAL (cjc= constructor_java_call | pl= prova_list | c= constant | e= expr )
                    {
                    match(input,EQUAL,FOLLOW_EQUAL_in_binary_operation588); 
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:265:10: (cjc= constructor_java_call | pl= prova_list | c= constant | e= expr )
                    int alt19=4;
                    alt19 = dfa19.predict(input);
                    switch (alt19) {
                        case 1 :
                            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:266:4: cjc= constructor_java_call
                            {
                            pushFollow(FOLLOW_constructor_java_call_in_binary_operation597);
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
                            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:273:6: pl= prova_list
                            {
                            pushFollow(FOLLOW_prova_list_in_binary_operation608);
                            pl=prova_list();

                            state._fsp--;


                            				ret =new java.util.ArrayList<ProvaObject>();
                            				ret.add(ProvaConstantImpl.create("equals"));
                            				ret.add(lt);
                            				ret.add(pl);
                            			

                            }
                            break;
                        case 3 :
                            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:279:6: c= constant
                            {
                            pushFollow(FOLLOW_constant_in_binary_operation619);
                            c=constant();

                            state._fsp--;


                            				ret =new java.util.ArrayList<ProvaObject>();
                            				ret.add(ProvaConstantImpl.create("equals"));
                            				ret.add(lt);
                            				ret.add(c);
                            			

                            }
                            break;
                        case 4 :
                            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:286:6: e= expr
                            {
                            pushFollow(FOLLOW_expr_in_binary_operation634);
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
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:294:5: not_equal c= constant
                    {
                    pushFollow(FOLLOW_not_equal_in_binary_operation647);
                    not_equal();

                    state._fsp--;

                    pushFollow(FOLLOW_constant_in_binary_operation651);
                    c=constant();

                    state._fsp--;


                    			ret =new java.util.ArrayList<ProvaObject>();
                    			ret.add(ProvaConstantImpl.create("ne"));
                    			ret.add(lt);
                    			ret.add(c);
                    		

                    }
                    break;
                case 3 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:300:5: bo= binary_operator e= expr
                    {
                    pushFollow(FOLLOW_binary_operator_in_binary_operation661);
                    bo=binary_operator();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_binary_operation665);
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
            binary_operation_stack.pop();
        }
        return ret;
    }
    // $ANTLR end "binary_operation"


    // $ANTLR start "expr"
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:321:1: expr returns [ProvaObject ret] : a= aterm (op= ( PLUS | MINUS ) e= expr )? ;
    public final ProvaObject expr() throws RecognitionException {
        ProvaObject ret = null;

        CommonTree op=null;
        ProvaObject a = null;

        ProvaObject e = null;


        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:322:2: (a= aterm (op= ( PLUS | MINUS ) e= expr )? )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:323:2: a= aterm (op= ( PLUS | MINUS ) e= expr )?
            {
            pushFollow(FOLLOW_aterm_in_expr692);
            a=aterm();

            state._fsp--;

            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:323:10: (op= ( PLUS | MINUS ) e= expr )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=PLUS && LA21_0<=MINUS)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:323:11: op= ( PLUS | MINUS ) e= expr
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

                    pushFollow(FOLLOW_expr_in_expr705);
                    e=expr();

                    state._fsp--;


                    }
                    break;

            }


            		if( op==null )
            			ret = a;
            		else {
            			List list = new ArrayList();
            			list.add(ProvaConstantImpl.create(ProvaOperatorFactoryImpl.create(op.getText())));
            			list.add(a);
            			list.add(e);
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
    // $ANTLR end "expr"


    // $ANTLR start "aterm"
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:336:1: aterm returns [ProvaObject ret] : ( (m= MINUS )? v= variable | n= number | (m= MINUS )? pjc= predicate_java_call | OPEN e= expr CLOSE ) (op= ( MULT | DIV | REM ) a= aterm )? ;
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
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:337:2: ( ( (m= MINUS )? v= variable | n= number | (m= MINUS )? pjc= predicate_java_call | OPEN e= expr CLOSE ) (op= ( MULT | DIV | REM ) a= aterm )? )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:338:2: ( (m= MINUS )? v= variable | n= number | (m= MINUS )? pjc= predicate_java_call | OPEN e= expr CLOSE ) (op= ( MULT | DIV | REM ) a= aterm )?
            {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:338:2: ( (m= MINUS )? v= variable | n= number | (m= MINUS )? pjc= predicate_java_call | OPEN e= expr CLOSE )
            int alt24=4;
            switch ( input.LA(1) ) {
            case MINUS:
                {
                switch ( input.LA(2) ) {
                case INSTANCE_JAVA_CALL:
                case STATIC_JAVA_CALL:
                    {
                    alt24=3;
                    }
                    break;
                case INT_LITERAL:
                case LONG_LITERAL:
                    {
                    alt24=2;
                    }
                    break;
                case TYPED_VARIABLE:
                case USWORD:
                case DOLLARWORD:
                case UCWORD:
                    {
                    alt24=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 1, input);

                    throw nvae;
                }

                }
                break;
            case TYPED_VARIABLE:
            case USWORD:
            case DOLLARWORD:
            case UCWORD:
                {
                alt24=1;
                }
                break;
            case INT_LITERAL:
            case LONG_LITERAL:
                {
                alt24=2;
                }
                break;
            case INSTANCE_JAVA_CALL:
            case STATIC_JAVA_CALL:
                {
                alt24=3;
                }
                break;
            case OPEN:
                {
                alt24=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:338:3: (m= MINUS )? v= variable
                    {
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:338:4: (m= MINUS )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==MINUS) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:338:4: m= MINUS
                            {
                            m=(CommonTree)match(input,MINUS,FOLLOW_MINUS_in_aterm728); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_variable_in_aterm733);
                    v=variable();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:338:25: n= number
                    {
                    pushFollow(FOLLOW_number_in_aterm739);
                    n=number();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:338:36: (m= MINUS )? pjc= predicate_java_call
                    {
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:338:37: (m= MINUS )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==MINUS) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:338:37: m= MINUS
                            {
                            m=(CommonTree)match(input,MINUS,FOLLOW_MINUS_in_aterm745); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_predicate_java_call_in_aterm750);
                    pjc=predicate_java_call();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:338:71: OPEN e= expr CLOSE
                    {
                    match(input,OPEN,FOLLOW_OPEN_in_aterm754); 
                    pushFollow(FOLLOW_expr_in_aterm758);
                    e=expr();

                    state._fsp--;

                    match(input,CLOSE,FOLLOW_CLOSE_in_aterm760); 

                    }
                    break;

            }

            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:338:90: (op= ( MULT | DIV | REM ) a= aterm )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=MULT && LA25_0<=DIV)||LA25_0==REM) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:338:91: op= ( MULT | DIV | REM ) a= aterm
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

                    pushFollow(FOLLOW_aterm_in_aterm776);
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
        }
        return ret;
    }
    // $ANTLR end "aterm"


    // $ANTLR start "variable_or_number"
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:379:1: variable_or_number returns [ProvaObject ret] : (v= variable | n= number );
    public final ProvaObject variable_or_number() throws RecognitionException {
        ProvaObject ret = null;

        ProvaObject v = null;

        ProvaConstant n = null;


        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:380:2: (v= variable | n= number )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=TYPED_VARIABLE && LA26_0<=USWORD)||LA26_0==DOLLARWORD||LA26_0==UCWORD) ) {
                alt26=1;
            }
            else if ( (LA26_0==MINUS||(LA26_0>=INT_LITERAL && LA26_0<=LONG_LITERAL)) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:380:4: v= variable
                    {
                    pushFollow(FOLLOW_variable_in_variable_or_number796);
                    v=variable();

                    state._fsp--;

                    ret = v;

                    }
                    break;
                case 2 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:380:29: n= number
                    {
                    pushFollow(FOLLOW_number_in_variable_or_number804);
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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:382:1: constructor_java_call returns [List<ProvaObject> ret] : (qjc= qualified_java_class | o= UCWORD ) a= args ;
    public final List<ProvaObject> constructor_java_call() throws RecognitionException {
        List<ProvaObject> ret = null;

        CommonTree o=null;
        ProvaConstant qjc = null;

        ProvaList a = null;



        	ret = new ArrayList<ProvaObject>();

        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:386:2: ( (qjc= qualified_java_class | o= UCWORD ) a= args )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:386:4: (qjc= qualified_java_class | o= UCWORD ) a= args
            {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:386:4: (qjc= qualified_java_class | o= UCWORD )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==QUALIFIED_JAVA_CLASS) ) {
                alt27=1;
            }
            else if ( (LA27_0==UCWORD) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:386:5: qjc= qualified_java_class
                    {
                    pushFollow(FOLLOW_qualified_java_class_in_constructor_java_call827);
                    qjc=qualified_java_class();

                    state._fsp--;

                    ret.add(qjc);

                    }
                    break;
                case 2 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:387:5: o= UCWORD
                    {
                    o=(CommonTree)match(input,UCWORD,FOLLOW_UCWORD_in_constructor_java_call837); 

                    			Class<?> type = ProvaClassUtils.findClass((String) o.toString());
                    			if( type==null )
                    				throw new RecognitionException();
                    			ret.add(ProvaConstantImpl.create(type));
                    			

                    }
                    break;

            }

            pushFollow(FOLLOW_args_in_constructor_java_call845);
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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:397:1: binary_operator returns [String ret] : ( | not_equal | LT | GT | LE | GE );
    public final String binary_operator() throws RecognitionException {
        String ret = null;

        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:398:2: ( | not_equal | LT | GT | LE | GE )
            int alt28=6;
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
                alt28=1;
                }
                break;
            case NOT_EQUAL1:
            case NOT_EQUAL2:
                {
                alt28=2;
                }
                break;
            case LT:
                {
                alt28=3;
                }
                break;
            case GT:
                {
                alt28=4;
                }
                break;
            case LE:
                {
                alt28=5;
                }
                break;
            case GE:
                {
                alt28=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:399:3: 
                    {
                    }
                    break;
                case 2 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:399:5: not_equal
                    {
                    pushFollow(FOLLOW_not_equal_in_binary_operator866);
                    not_equal();

                    state._fsp--;

                    ret ="ne";

                    }
                    break;
                case 3 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:400:5: LT
                    {
                    match(input,LT,FOLLOW_LT_in_binary_operator874); 
                    ret ="lt";

                    }
                    break;
                case 4 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:401:5: GT
                    {
                    match(input,GT,FOLLOW_GT_in_binary_operator882); 
                    ret ="gt";

                    }
                    break;
                case 5 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:402:5: LE
                    {
                    match(input,LE,FOLLOW_LE_in_binary_operator890); 
                    ret ="le";

                    }
                    break;
                case 6 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:403:5: GE
                    {
                    match(input,GE,FOLLOW_GE_in_binary_operator898); 
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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:406:1: not_equal : ( NOT_EQUAL1 | NOT_EQUAL2 );
    public final void not_equal() throws RecognitionException {
        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:407:2: ( NOT_EQUAL1 | NOT_EQUAL2 )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:
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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:410:1: instance_java_call returns [List<ProvaObject> ret] : ^( INSTANCE_JAVA_CALL ic= instance_call a= args ) ;
    public final List<ProvaObject> instance_java_call() throws RecognitionException {
        List<ProvaObject> ret = null;

        List<ProvaObject> ic = null;

        ProvaList a = null;


        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:411:2: ( ^( INSTANCE_JAVA_CALL ic= instance_call a= args ) )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:411:4: ^( INSTANCE_JAVA_CALL ic= instance_call a= args )
            {
            match(input,INSTANCE_JAVA_CALL,FOLLOW_INSTANCE_JAVA_CALL_in_instance_java_call930); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_instance_call_in_instance_java_call934);
            ic=instance_call();

            state._fsp--;

            pushFollow(FOLLOW_args_in_instance_java_call938);
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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:418:1: instance_call returns [List<ProvaObject> ret] : v= variable l= LCWORD ;
    public final List<ProvaObject> instance_call() throws RecognitionException {
        List<ProvaObject> ret = null;

        CommonTree l=null;
        ProvaObject v = null;



        	ret = new ArrayList();
        	((stat_scope)stat_stack.peek()).inInstanceCall = true;

        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:426:2: (v= variable l= LCWORD )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:426:4: v= variable l= LCWORD
            {
            pushFollow(FOLLOW_variable_in_instance_call969);
            v=variable();

            state._fsp--;

            l=(CommonTree)match(input,LCWORD,FOLLOW_LCWORD_in_instance_call973); 

            			// Prefix set to "" to signal that the predicate_java_call is an instance one
            			//   but can be reclassified as a static call if v is a constant
            			//   representing a class from a default package java.lang or ws.prova
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
        }
        return ret;
    }
    // $ANTLR end "instance_call"


    // $ANTLR start "static_call"
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:437:1: static_call returns [List<ProvaObject> ret] : qjc= qualified_java_class l= LCWORD ;
    public final List<ProvaObject> static_call() throws RecognitionException {
        List<ProvaObject> ret = null;

        CommonTree l=null;
        ProvaConstant qjc = null;



        	ret = new ArrayList<ProvaObject>();

        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:441:2: (qjc= qualified_java_class l= LCWORD )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:441:4: qjc= qualified_java_class l= LCWORD
            {
            pushFollow(FOLLOW_qualified_java_class_in_static_call996);
            qjc=qualified_java_class();

            state._fsp--;

            l=(CommonTree)match(input,LCWORD,FOLLOW_LCWORD_in_static_call1000); 

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
        }
        return ret;
    }
    // $ANTLR end "static_call"


    // $ANTLR start "query_predicate"
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:449:1: query_predicate returns [String ret] : c= constant ;
    public final String query_predicate() throws RecognitionException {
        String ret = null;

        ProvaConstant c = null;


        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:450:2: (c= constant )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:450:4: c= constant
            {
            pushFollow(FOLLOW_constant_in_query_predicate1018);
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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:453:1: query returns [ProvaRule ret] : ^( QUERY qp= query_predicate r= relation ) ;
    public final ProvaRule query() throws RecognitionException {
        ProvaRule ret = null;

        String qp = null;

        List r = null;


        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:454:2: ( ^( QUERY qp= query_predicate r= relation ) )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:454:4: ^( QUERY qp= query_predicate r= relation )
            {
            match(input,QUERY,FOLLOW_QUERY_in_query1035); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_query_predicate_in_query1039);
            qp=query_predicate();

            state._fsp--;

            pushFollow(FOLLOW_relation_in_query1043);
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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:467:1: relation returns [List ret] : ^( PREDICATE p= predicate l= list_body ) ;
    public final List relation() throws RecognitionException {
        List ret = null;

        String p = null;

        ProvaList l = null;



        	ret = new ArrayList();

        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:471:2: ( ^( PREDICATE p= predicate l= list_body ) )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:471:4: ^( PREDICATE p= predicate l= list_body )
            {
            match(input,PREDICATE,FOLLOW_PREDICATE_in_relation1066); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_predicate_in_relation1070);
            p=predicate();

            state._fsp--;

            pushFollow(FOLLOW_list_body_in_relation1074);
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
        }
        return ret;
    }
    // $ANTLR end "relation"


    // $ANTLR start "predicate"
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:489:1: predicate returns [String ret] : (l= LCWORD | u= UCWORD | s= string );
    public final String predicate() throws RecognitionException {
        String ret = null;

        CommonTree l=null;
        CommonTree u=null;
        String s = null;


        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:490:2: (l= LCWORD | u= UCWORD | s= string )
            int alt29=3;
            switch ( input.LA(1) ) {
            case LCWORD:
                {
                alt29=1;
                }
                break;
            case UCWORD:
                {
                alt29=2;
                }
                break;
            case STRING1:
            case STRING2:
                {
                alt29=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:490:4: l= LCWORD
                    {
                    l=(CommonTree)match(input,LCWORD,FOLLOW_LCWORD_in_predicate1096); 
                    ret = l.toString();

                    }
                    break;
                case 2 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:491:5: u= UCWORD
                    {
                    u=(CommonTree)match(input,UCWORD,FOLLOW_UCWORD_in_predicate1106); 
                     ret = u.toString(); 

                    }
                    break;
                case 3 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:492:5: s= string
                    {
                    pushFollow(FOLLOW_string_in_predicate1116);
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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:495:1: func returns [ProvaObject ret] : (l= LCWORD | u= UCWORD | s= string | tv= typed_variable );
    public final ProvaObject func() throws RecognitionException {
        ProvaObject ret = null;

        CommonTree l=null;
        CommonTree u=null;
        String s = null;

        ProvaObject tv = null;


        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:496:2: (l= LCWORD | u= UCWORD | s= string | tv= typed_variable )
            int alt30=4;
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
            case TYPED_VARIABLE:
                {
                alt30=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:496:4: l= LCWORD
                    {
                    l=(CommonTree)match(input,LCWORD,FOLLOW_LCWORD_in_func1134); 

                    			ret =ProvaConstantImpl.create(l.toString());
                    		

                    }
                    break;
                case 2 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:499:5: u= UCWORD
                    {
                    u=(CommonTree)match(input,UCWORD,FOLLOW_UCWORD_in_func1144); 

                    			ret =ProvaVariableImpl.create(u.toString());
                    		

                    }
                    break;
                case 3 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:502:5: s= string
                    {
                    pushFollow(FOLLOW_string_in_func1154);
                    s=string();

                    state._fsp--;


                    			ret =ProvaConstantImpl.create(s);
                    		

                    }
                    break;
                case 4 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:505:5: tv= typed_variable
                    {
                    pushFollow(FOLLOW_typed_variable_in_func1164);
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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:510:1: list_body returns [ProvaList ret] : ^( LIST_BODY (t= terms (lt= list_tail )? )? ) ;
    public final ProvaList list_body() throws RecognitionException {
        list_body_stack.push(new list_body_scope());
        ProvaList ret = null;

        List<ProvaObject> t = null;

        ProvaObject lt = null;


        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:514:3: ( ^( LIST_BODY (t= terms (lt= list_tail )? )? ) )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:514:5: ^( LIST_BODY (t= terms (lt= list_tail )? )? )
            {
            match(input,LIST_BODY,FOLLOW_LIST_BODY_in_list_body1186); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:514:17: (t= terms (lt= list_tail )? )?
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==TERM) ) {
                    alt32=1;
                }
                switch (alt32) {
                    case 1 :
                        // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:514:18: t= terms (lt= list_tail )?
                        {
                        pushFollow(FOLLOW_terms_in_list_body1191);
                        t=terms();

                        state._fsp--;

                        // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:514:28: (lt= list_tail )?
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==PROVA_LIST||(LA31_0>=TYPED_VARIABLE && LA31_0<=USWORD)||LA31_0==DOLLARWORD||LA31_0==UCWORD) ) {
                            alt31=1;
                        }
                        switch (alt31) {
                            case 1 :
                                // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:514:28: lt= list_tail
                                {
                                pushFollow(FOLLOW_list_tail_in_list_body1195);
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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:527:1: terms returns [List<ProvaObject> ret] : ^( TERM (t= term )+ ) ;
    public final List<ProvaObject> terms() throws RecognitionException {
        List<ProvaObject> ret = null;

        ProvaObject t = null;



        	ret = new ArrayList<ProvaObject>();

        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:531:2: ( ^( TERM (t= term )+ ) )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:531:4: ^( TERM (t= term )+ )
            {
            match(input,TERM,FOLLOW_TERM_in_terms1227); 

            match(input, Token.DOWN, null); 
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:531:11: (t= term )+
            int cnt33=0;
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==MINUS||LA33_0==PROVA_LIST||(LA33_0>=TYPED_VARIABLE && LA33_0<=QUALIFIED_JAVA_CLASS)||LA33_0==DOLLARWORD||LA33_0==PROVA_MAP||(LA33_0>=LCWORD && LA33_0<=STRING2)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:531:12: t= term
            	    {
            	    pushFollow(FOLLOW_term_in_terms1232);
            	    t=term();

            	    state._fsp--;

            	    ret.add(t);

            	    }
            	    break;

            	default :
            	    if ( cnt33 >= 1 ) break loop33;
                        EarlyExitException eee =
                            new EarlyExitException(33, input);
                        throw eee;
                }
                cnt33++;
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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:534:1: term returns [ProvaObject ret] : (lt= left_term | ft= func_term | map= prova_map );
    public final ProvaObject term() throws RecognitionException {
        ProvaObject ret = null;

        ProvaObject lt = null;

        ProvaObject ft = null;

        ProvaObject map = null;


        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:535:2: (lt= left_term | ft= func_term | map= prova_map )
            int alt34=3;
            alt34 = dfa34.predict(input);
            switch (alt34) {
                case 1 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:536:3: lt= left_term
                    {
                    pushFollow(FOLLOW_left_term_in_term1257);
                    lt=left_term();

                    state._fsp--;

                    ret =lt;

                    }
                    break;
                case 2 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:537:5: ft= func_term
                    {
                    pushFollow(FOLLOW_func_term_in_term1267);
                    ft=func_term();

                    state._fsp--;

                    ret =ft;

                    }
                    break;
                case 3 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:538:5: map= prova_map
                    {
                    pushFollow(FOLLOW_prova_map_in_term1277);
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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:541:1: left_term returns [ProvaObject ret] : (c= constant | v= variable | n= number | p= prova_list );
    public final ProvaObject left_term() throws RecognitionException {
        ProvaObject ret = null;

        ProvaConstant c = null;

        ProvaObject v = null;

        ProvaConstant n = null;

        ProvaList p = null;


        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:542:2: (c= constant | v= variable | n= number | p= prova_list )
            int alt35=4;
            switch ( input.LA(1) ) {
            case QUALIFIED_JAVA_CLASS:
            case LCWORD:
            case STRING1:
            case STRING2:
                {
                alt35=1;
                }
                break;
            case TYPED_VARIABLE:
            case USWORD:
            case DOLLARWORD:
            case UCWORD:
                {
                alt35=2;
                }
                break;
            case MINUS:
            case INT_LITERAL:
            case LONG_LITERAL:
                {
                alt35=3;
                }
                break;
            case PROVA_LIST:
                {
                alt35=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:542:4: c= constant
                    {
                    pushFollow(FOLLOW_constant_in_left_term1295);
                    c=constant();

                    state._fsp--;

                    ret =c;

                    }
                    break;
                case 2 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:543:5: v= variable
                    {
                    pushFollow(FOLLOW_variable_in_left_term1305);
                    v=variable();

                    state._fsp--;

                    ret =v;

                    }
                    break;
                case 3 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:544:5: n= number
                    {
                    pushFollow(FOLLOW_number_in_left_term1315);
                    n=number();

                    state._fsp--;

                    ret =n;

                    }
                    break;
                case 4 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:545:5: p= prova_list
                    {
                    pushFollow(FOLLOW_prova_list_in_left_term1325);
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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:548:1: right_term returns [ProvaObject ret] : ( ( (m= MINUS )? (c= constant | v= variable ) ) | n= number | p= prova_list );
    public final ProvaObject right_term() throws RecognitionException {
        ProvaObject ret = null;

        CommonTree m=null;
        ProvaConstant c = null;

        ProvaObject v = null;

        ProvaConstant n = null;

        ProvaList p = null;



        	((binary_operation_scope)binary_operation_stack.peek()).op ="";

        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:556:2: ( ( (m= MINUS )? (c= constant | v= variable ) ) | n= number | p= prova_list )
            int alt38=3;
            switch ( input.LA(1) ) {
            case MINUS:
                {
                int LA38_1 = input.LA(2);

                if ( ((LA38_1>=TYPED_VARIABLE && LA38_1<=QUALIFIED_JAVA_CLASS)||LA38_1==DOLLARWORD||(LA38_1>=LCWORD && LA38_1<=UCWORD)||(LA38_1>=STRING1 && LA38_1<=STRING2)) ) {
                    alt38=1;
                }
                else if ( ((LA38_1>=INT_LITERAL && LA38_1<=LONG_LITERAL)) ) {
                    alt38=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 38, 1, input);

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
            case PROVA_LIST:
                {
                alt38=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:556:4: ( (m= MINUS )? (c= constant | v= variable ) )
                    {
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:556:4: ( (m= MINUS )? (c= constant | v= variable ) )
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:556:5: (m= MINUS )? (c= constant | v= variable )
                    {
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:556:6: (m= MINUS )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==MINUS) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:556:6: m= MINUS
                            {
                            m=(CommonTree)match(input,MINUS,FOLLOW_MINUS_in_right_term1354); 

                            }
                            break;

                    }

                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:556:14: (c= constant | v= variable )
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==QUALIFIED_JAVA_CLASS||LA37_0==LCWORD||(LA37_0>=STRING1 && LA37_0<=STRING2)) ) {
                        alt37=1;
                    }
                    else if ( ((LA37_0>=TYPED_VARIABLE && LA37_0<=USWORD)||LA37_0==DOLLARWORD||LA37_0==UCWORD) ) {
                        alt37=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 37, 0, input);

                        throw nvae;
                    }
                    switch (alt37) {
                        case 1 :
                            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:556:15: c= constant
                            {
                            pushFollow(FOLLOW_constant_in_right_term1360);
                            c=constant();

                            state._fsp--;

                            ret =c;

                            }
                            break;
                        case 2 :
                            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:556:38: v= variable
                            {
                            pushFollow(FOLLOW_variable_in_right_term1368);
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
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:557:5: n= number
                    {
                    pushFollow(FOLLOW_number_in_right_term1380);
                    n=number();

                    state._fsp--;

                    ret =n;

                    }
                    break;
                case 3 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:558:5: p= prova_list
                    {
                    pushFollow(FOLLOW_prova_list_in_right_term1390);
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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:560:1: qualified_java_class returns [ProvaConstant ret] : ^( QUALIFIED_JAVA_CLASS ( (l= LCWORD d= DOT ) )+ u= UCWORD ) ;
    public final ProvaConstant qualified_java_class() throws RecognitionException {
        qualified_java_class_stack.push(new qualified_java_class_scope());
        ProvaConstant ret = null;

        CommonTree l=null;
        CommonTree d=null;
        CommonTree u=null;


        	((qualified_java_class_scope)qualified_java_class_stack.peek()).s = "";

        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:573:2: ( ^( QUALIFIED_JAVA_CLASS ( (l= LCWORD d= DOT ) )+ u= UCWORD ) )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:573:4: ^( QUALIFIED_JAVA_CLASS ( (l= LCWORD d= DOT ) )+ u= UCWORD )
            {
            match(input,QUALIFIED_JAVA_CLASS,FOLLOW_QUALIFIED_JAVA_CLASS_in_qualified_java_class1420); 

            match(input, Token.DOWN, null); 
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:573:27: ( (l= LCWORD d= DOT ) )+
            int cnt39=0;
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==LCWORD) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:573:28: (l= LCWORD d= DOT )
            	    {
            	    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:573:28: (l= LCWORD d= DOT )
            	    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:573:29: l= LCWORD d= DOT
            	    {
            	    l=(CommonTree)match(input,LCWORD,FOLLOW_LCWORD_in_qualified_java_class1426); 
            	    d=(CommonTree)match(input,DOT,FOLLOW_DOT_in_qualified_java_class1430); 

            	    }

            	    ((qualified_java_class_scope)qualified_java_class_stack.peek()).s+=l.toString()+d.toString();

            	    }
            	    break;

            	default :
            	    if ( cnt39 >= 1 ) break loop39;
                        EarlyExitException eee =
                            new EarlyExitException(39, input);
                        throw eee;
                }
                cnt39++;
            } while (true);

            u=(CommonTree)match(input,UCWORD,FOLLOW_UCWORD_in_qualified_java_class1439); 

            match(input, Token.UP, null); 

            			((qualified_java_class_scope)qualified_java_class_stack.peek()).s+=u.toString();
            		

            }


            	Class type = ProvaClassUtils.findClass((String) ((qualified_java_class_scope)qualified_java_class_stack.peek()).s);
            	if( type==null )
            		throw new RecognitionException();
            	ret =ProvaConstantImpl.create(/*((qualified_java_class_scope)qualified_java_class_stack.peek()).s*/type);

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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:578:1: func_term returns [ProvaObject ret] : f= func a= args ;
    public final ProvaObject func_term() throws RecognitionException {
        ProvaObject ret = null;

        ProvaObject f = null;

        ProvaList a = null;


        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:579:2: (f= func a= args )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:579:4: f= func a= args
            {
            pushFollow(FOLLOW_func_in_func_term1459);
            f=func();

            state._fsp--;

            pushFollow(FOLLOW_args_in_func_term1463);
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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:588:1: typed_variable returns [ProvaObject ret] : ( ^( TYPED_VARIABLE q= qualified_java_class (w= LCWORD | w= UCWORD ) ) | ^( TYPED_VARIABLE u= UCWORD l= LCWORD ) | ^( TYPED_VARIABLE u= UCWORD w= UCWORD ) );
    public final ProvaObject typed_variable() throws RecognitionException {
        ProvaObject ret = null;

        CommonTree w=null;
        CommonTree u=null;
        CommonTree l=null;
        ProvaConstant q = null;


        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:589:2: ( ^( TYPED_VARIABLE q= qualified_java_class (w= LCWORD | w= UCWORD ) ) | ^( TYPED_VARIABLE u= UCWORD l= LCWORD ) | ^( TYPED_VARIABLE u= UCWORD w= UCWORD ) )
            int alt41=3;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==TYPED_VARIABLE) ) {
                int LA41_1 = input.LA(2);

                if ( (LA41_1==DOWN) ) {
                    int LA41_2 = input.LA(3);

                    if ( (LA41_2==UCWORD) ) {
                        int LA41_3 = input.LA(4);

                        if ( (LA41_3==LCWORD) ) {
                            alt41=2;
                        }
                        else if ( (LA41_3==UCWORD) ) {
                            alt41=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 41, 3, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA41_2==QUALIFIED_JAVA_CLASS) ) {
                        alt41=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 41, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:589:4: ^( TYPED_VARIABLE q= qualified_java_class (w= LCWORD | w= UCWORD ) )
                    {
                    match(input,TYPED_VARIABLE,FOLLOW_TYPED_VARIABLE_in_typed_variable1481); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_qualified_java_class_in_typed_variable1485);
                    q=qualified_java_class();

                    state._fsp--;

                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:589:44: (w= LCWORD | w= UCWORD )
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==LCWORD) ) {
                        alt40=1;
                    }
                    else if ( (LA40_0==UCWORD) ) {
                        alt40=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 40, 0, input);

                        throw nvae;
                    }
                    switch (alt40) {
                        case 1 :
                            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:589:45: w= LCWORD
                            {
                            w=(CommonTree)match(input,LCWORD,FOLLOW_LCWORD_in_typed_variable1490); 

                            }
                            break;
                        case 2 :
                            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:589:54: w= UCWORD
                            {
                            w=(CommonTree)match(input,UCWORD,FOLLOW_UCWORD_in_typed_variable1494); 

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
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:601:5: ^( TYPED_VARIABLE u= UCWORD l= LCWORD )
                    {
                    match(input,TYPED_VARIABLE,FOLLOW_TYPED_VARIABLE_in_typed_variable1508); 

                    match(input, Token.DOWN, null); 
                    u=(CommonTree)match(input,UCWORD,FOLLOW_UCWORD_in_typed_variable1512); 
                    l=(CommonTree)match(input,LCWORD,FOLLOW_LCWORD_in_typed_variable1516); 

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
                    				ret =ProvaConstantImpl.create(field);
                    			} catch( Exception e ) {
                    				throw new RecognitionException();
                    			}
                    		

                    }
                    break;
                case 3 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:621:5: ^( TYPED_VARIABLE u= UCWORD w= UCWORD )
                    {
                    match(input,TYPED_VARIABLE,FOLLOW_TYPED_VARIABLE_in_typed_variable1529); 

                    match(input, Token.DOWN, null); 
                    u=(CommonTree)match(input,UCWORD,FOLLOW_UCWORD_in_typed_variable1533); 
                    w=(CommonTree)match(input,UCWORD,FOLLOW_UCWORD_in_typed_variable1537); 

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
                    					ret =ProvaConstantImpl.create(field);
                    				else
                    					ret =ProvaVariableImpl.create(w.toString(),type);
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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:643:1: prova_list returns [ProvaList ret] : ^( PROVA_LIST l= list_body ) ;
    public final ProvaList prova_list() throws RecognitionException {
        ProvaList ret = null;

        ProvaList l = null;


        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:644:2: ( ^( PROVA_LIST l= list_body ) )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:644:4: ^( PROVA_LIST l= list_body )
            {
            match(input,PROVA_LIST,FOLLOW_PROVA_LIST_in_prova_list1556); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_list_body_in_prova_list1560);
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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:647:1: prova_map returns [ProvaObject ret] : ^( PROVA_MAP (kv= key_value )* ) ;
    public final ProvaObject prova_map() throws RecognitionException {
        ProvaObject ret = null;

        List<Object> kv = null;



        	Map<String,Object> map = new HashMap<String,Object>();

        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:654:2: ( ^( PROVA_MAP (kv= key_value )* ) )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:654:4: ^( PROVA_MAP (kv= key_value )* )
            {
            match(input,PROVA_MAP,FOLLOW_PROVA_MAP_in_prova_map1588); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:654:16: (kv= key_value )*
                loop42:
                do {
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==KEY_VALUE) ) {
                        alt42=1;
                    }


                    switch (alt42) {
                	case 1 :
                	    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:654:17: kv= key_value
                	    {
                	    pushFollow(FOLLOW_key_value_in_prova_map1593);
                	    kv=key_value();

                	    state._fsp--;

                	    map.put(kv.get(0).toString(),kv.get(1));

                	    }
                	    break;

                	default :
                	    break loop42;
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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:657:1: key_value returns [List<Object> ret] : ^( KEY_VALUE (k= mstring v= term ) ) ;
    public final List<Object> key_value() throws RecognitionException {
        List<Object> ret = null;

        String k = null;

        ProvaObject v = null;



        	ret = new ArrayList<Object>();

        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:661:2: ( ^( KEY_VALUE (k= mstring v= term ) ) )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:661:4: ^( KEY_VALUE (k= mstring v= term ) )
            {
            match(input,KEY_VALUE,FOLLOW_KEY_VALUE_in_key_value1619); 

            match(input, Token.DOWN, null); 
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:661:16: (k= mstring v= term )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:661:17: k= mstring v= term
            {
            pushFollow(FOLLOW_mstring_in_key_value1624);
            k=mstring();

            state._fsp--;

            pushFollow(FOLLOW_term_in_key_value1628);
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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:664:1: variable returns [ProvaObject ret] : (u= UCWORD | usw= USWORD | tv= typed_variable | gc= DOLLARWORD );
    public final ProvaObject variable() throws RecognitionException {
        ProvaObject ret = null;

        CommonTree u=null;
        CommonTree usw=null;
        CommonTree gc=null;
        ProvaObject tv = null;


        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:670:2: (u= UCWORD | usw= USWORD | tv= typed_variable | gc= DOLLARWORD )
            int alt43=4;
            switch ( input.LA(1) ) {
            case UCWORD:
                {
                alt43=1;
                }
                break;
            case USWORD:
                {
                alt43=2;
                }
                break;
            case TYPED_VARIABLE:
                {
                alt43=3;
                }
                break;
            case DOLLARWORD:
                {
                alt43=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:671:3: u= UCWORD
                    {
                    u=(CommonTree)match(input,UCWORD,FOLLOW_UCWORD_in_variable1657); 

                    //			// Allow class lookup from pseudo-instance call
                    //			Class<?> type = ProvaClassUtils.findClass("java.lang."+u);
                    //			if( type!=null )
                    //				ret =ProvaConstantImpl.create(type);
                    //			else
                    			ret =ProvaVariableImpl.create(u.toString());
                    		

                    }
                    break;
                case 2 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:679:5: usw= USWORD
                    {
                    usw=(CommonTree)match(input,USWORD,FOLLOW_USWORD_in_variable1667); 

                    			if( usw.toString().length()==1 )
                    				ret =ProvaVariableImpl.create(usw.toString());
                    			else
                    				ret =ProvaConstantImpl.create(ProvaParserImpl.tlObjects.get()[Integer.parseInt(usw.toString().substring(1))]);
                    		

                    }
                    break;
                case 3 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:685:5: tv= typed_variable
                    {
                    pushFollow(FOLLOW_typed_variable_in_variable1677);
                    tv=typed_variable();

                    state._fsp--;

                    ret =tv;

                    }
                    break;
                case 4 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:686:5: gc= DOLLARWORD
                    {
                    gc=(CommonTree)match(input,DOLLARWORD,FOLLOW_DOLLARWORD_in_variable1687); 
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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:689:1: args returns [ProvaList ret] : ^( ARGS lb= list_body ) ;
    public final ProvaList args() throws RecognitionException {
        ProvaList ret = null;

        ProvaList lb = null;


        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:690:2: ( ^( ARGS lb= list_body ) )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:690:4: ^( ARGS lb= list_body )
            {
            match(input,ARGS,FOLLOW_ARGS_in_args1705); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_list_body_in_args1709);
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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:693:1: list_tail returns [ProvaObject ret] : (v= variable | p= prova_list );
    public final ProvaObject list_tail() throws RecognitionException {
        ProvaObject ret = null;

        ProvaObject v = null;

        ProvaList p = null;



        	((stat_scope)stat_stack.peek()).inRest = true;

        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:700:2: (v= variable | p= prova_list )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=TYPED_VARIABLE && LA44_0<=USWORD)||LA44_0==DOLLARWORD||LA44_0==UCWORD) ) {
                alt44=1;
            }
            else if ( (LA44_0==PROVA_LIST) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:700:4: v= variable
                    {
                    pushFollow(FOLLOW_variable_in_list_tail1738);
                    v=variable();

                    state._fsp--;


                    			ret =v;
                    		

                    }
                    break;
                case 2 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:703:5: p= prova_list
                    {
                    pushFollow(FOLLOW_prova_list_in_list_tail1748);
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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:706:1: constant returns [ProvaConstant ret] : (d= LCWORD | s= string | qjc= qualified_java_class );
    public final ProvaConstant constant() throws RecognitionException {
        ProvaConstant ret = null;

        CommonTree d=null;
        String s = null;

        ProvaConstant qjc = null;


        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:707:2: (d= LCWORD | s= string | qjc= qualified_java_class )
            int alt45=3;
            switch ( input.LA(1) ) {
            case LCWORD:
                {
                alt45=1;
                }
                break;
            case STRING1:
            case STRING2:
                {
                alt45=2;
                }
                break;
            case QUALIFIED_JAVA_CLASS:
                {
                alt45=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:710:3: d= LCWORD
                    {
                    d=(CommonTree)match(input,LCWORD,FOLLOW_LCWORD_in_constant1775); 

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
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:719:5: s= string
                    {
                    pushFollow(FOLLOW_string_in_constant1785);
                    s=string();

                    state._fsp--;

                    ret =ProvaConstantImpl.create(s.toString());

                    }
                    break;
                case 3 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:720:5: qjc= qualified_java_class
                    {
                    pushFollow(FOLLOW_qualified_java_class_in_constant1795);
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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:734:1: string returns [String ret] : (s1= STRING1 | s2= STRING2 );
    public final String string() throws RecognitionException {
        String ret = null;

        CommonTree s1=null;
        CommonTree s2=null;

        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:735:2: (s1= STRING1 | s2= STRING2 )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==STRING1) ) {
                alt46=1;
            }
            else if ( (LA46_0==STRING2) ) {
                alt46=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:735:4: s1= STRING1
                    {
                    s1=(CommonTree)match(input,STRING1,FOLLOW_STRING1_in_string1817); 
                    ret =s1.toString().substring(1,s1.toString().length()-1);

                    }
                    break;
                case 2 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:736:5: s2= STRING2
                    {
                    s2=(CommonTree)match(input,STRING2,FOLLOW_STRING2_in_string1827); 
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
        }
        return ret;
    }
    // $ANTLR end "string"


    // $ANTLR start "mstring"
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:739:1: mstring returns [String ret] : (s= string | l= LCWORD );
    public final String mstring() throws RecognitionException {
        String ret = null;

        CommonTree l=null;
        String s = null;


        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:740:2: (s= string | l= LCWORD )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( ((LA47_0>=STRING1 && LA47_0<=STRING2)) ) {
                alt47=1;
            }
            else if ( (LA47_0==LCWORD) ) {
                alt47=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:740:4: s= string
                    {
                    pushFollow(FOLLOW_string_in_mstring1845);
                    s=string();

                    state._fsp--;

                    ret =s;

                    }
                    break;
                case 2 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:741:5: l= LCWORD
                    {
                    l=(CommonTree)match(input,LCWORD,FOLLOW_LCWORD_in_mstring1855); 
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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:744:1: pos_number returns [Number ret] : (i= INT_LITERAL | l= LONG_LITERAL | f= float_literal );
    public final Number pos_number() throws RecognitionException {
        Number ret = null;

        CommonTree i=null;
        CommonTree l=null;
        String f = null;


        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:745:2: (i= INT_LITERAL | l= LONG_LITERAL | f= float_literal )
            int alt48=3;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==INT_LITERAL) ) {
                int LA48_1 = input.LA(2);

                if ( (LA48_1==DOT) ) {
                    alt48=3;
                }
                else if ( (LA48_1==EOF||LA48_1==UP||(LA48_1>=PLUS && LA48_1<=DIV)||(LA48_1>=OPEN && LA48_1<=CLOSE)||(LA48_1>=EQUAL && LA48_1<=GE)||(LA48_1>=INSTANCE_JAVA_CALL && LA48_1<=STATIC_JAVA_CALL)||LA48_1==PROVA_LIST||(LA48_1>=TYPED_VARIABLE && LA48_1<=QUALIFIED_JAVA_CLASS)||(LA48_1>=REM && LA48_1<=GUARD)||LA48_1==PROVA_MAP||(LA48_1>=LCWORD && LA48_1<=STRING2)) ) {
                    alt48=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 48, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA48_0==LONG_LITERAL) ) {
                alt48=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:745:4: i= INT_LITERAL
                    {
                    i=(CommonTree)match(input,INT_LITERAL,FOLLOW_INT_LITERAL_in_pos_number1873); 
                    ret =Integer.parseInt(i.toString());

                    }
                    break;
                case 2 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:746:5: l= LONG_LITERAL
                    {
                    l=(CommonTree)match(input,LONG_LITERAL,FOLLOW_LONG_LITERAL_in_pos_number1883); 
                    String s = l.toString(); ret =Long.parseLong(s.substring(0,s.length()-1));

                    }
                    break;
                case 3 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:747:5: f= float_literal
                    {
                    pushFollow(FOLLOW_float_literal_in_pos_number1893);
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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:751:1: float_literal returns [String ret] : i1= INT_LITERAL DOT i2= INT_LITERAL (e= EXPONENT )? ;
    public final String float_literal() throws RecognitionException {
        String ret = null;

        CommonTree i1=null;
        CommonTree i2=null;
        CommonTree e=null;

        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:752:2: (i1= INT_LITERAL DOT i2= INT_LITERAL (e= EXPONENT )? )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:752:4: i1= INT_LITERAL DOT i2= INT_LITERAL (e= EXPONENT )?
            {
            i1=(CommonTree)match(input,INT_LITERAL,FOLLOW_INT_LITERAL_in_float_literal1913); 
            match(input,DOT,FOLLOW_DOT_in_float_literal1915); 
            i2=(CommonTree)match(input,INT_LITERAL,FOLLOW_INT_LITERAL_in_float_literal1919); 
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:752:38: (e= EXPONENT )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==EXPONENT) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:752:39: e= EXPONENT
                    {
                    e=(CommonTree)match(input,EXPONENT,FOLLOW_EXPONENT_in_float_literal1924); 

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
    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:760:1: number returns [ProvaConstant ret] : (m= '-' )? p= pos_number ;
    public final ProvaConstant number() throws RecognitionException {
        ProvaConstant ret = null;

        CommonTree m=null;
        Number p = null;


        try {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:761:2: ( (m= '-' )? p= pos_number )
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:761:4: (m= '-' )? p= pos_number
            {
            // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:761:5: (m= '-' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==MINUS) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // D:\\workspace-sts-2.3.3.M2.3.5.2-logshipper\\prova-compact\\src\\main\\antlr\\ws\\prova\\parser\\ProvaWalker2.g:761:5: m= '-'
                    {
                    m=(CommonTree)match(input,MINUS,FOLLOW_MINUS_in_number1946); 

                    }
                    break;

            }

            pushFollow(FOLLOW_pos_number_in_number1951);
            p=pos_number();

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
        }
        return ret;
    }
    // $ANTLR end "number"

    // Delegated rules


    protected DFA7 dfa7 = new DFA7(this);
    protected DFA19 dfa19 = new DFA19(this);
    protected DFA34 dfa34 = new DFA34(this);
    static final String DFA7_eotS =
        "\26\uffff";
    static final String DFA7_eofS =
        "\26\uffff";
    static final String DFA7_minS =
        "\1\30\1\2\1\35\1\2\2\uffff\1\53\1\2\1\65\5\3\1\67\3\3\1\67\1\41"+
        "\2\3";
    static final String DFA7_maxS =
        "\1\30\1\2\1\65\1\2\2\uffff\1\53\1\2\1\65\5\72\1\70\2\72\1\53\1"+
        "\67\1\65\1\73\1\72";
    static final String DFA7_acceptS =
        "\4\uffff\1\1\1\2\20\uffff";
    static final String DFA7_specialS =
        "\26\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3\3\uffff\1\4\23\uffff\1\5",
            "\1\6",
            "",
            "",
            "\1\7",
            "\1\10",
            "\1\11",
            "\1\21\2\uffff\1\16\56\uffff\1\12\1\13\1\17\1\20\1\14\1\15",
            "\1\21\2\uffff\1\16\56\uffff\1\12\1\13\1\17\1\20\1\14\1\15",
            "\1\21\2\uffff\1\16\56\uffff\1\12\1\13\1\17\1\20\1\14\1\15",
            "\1\21\2\uffff\1\16\56\uffff\1\12\1\13\1\17\1\20\1\14\1\15",
            "\1\21\2\uffff\1\16\56\uffff\1\12\1\13\1\17\1\20\1\14\1\15",
            "\1\17\1\20",
            "\1\21\1\22\1\uffff\1\16\56\uffff\1\12\1\13\1\17\1\20\1\14"+
            "\1\15",
            "\1\21\2\uffff\1\16\56\uffff\1\12\1\13\1\17\1\20\1\14\1\15",
            "\1\23\47\uffff\1\7",
            "\1\24",
            "\1\4\23\uffff\1\5",
            "\1\21\2\uffff\1\16\56\uffff\1\12\1\13\1\17\1\20\1\14\1\15"+
            "\1\25",
            "\1\21\2\uffff\1\16\56\uffff\1\12\1\13\1\17\1\20\1\14\1\15"
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
    static final String DFA19_eotS =
        "\14\uffff";
    static final String DFA19_eofS =
        "\14\uffff";
    static final String DFA19_minS =
        "\1\6\1\2\1\3\3\uffff\1\65\1\uffff\1\4\1\65\2\3";
    static final String DFA19_maxS =
        "\1\72\1\2\1\56\3\uffff\1\65\1\uffff\1\4\1\66\1\3\1\56";
    static final String DFA19_acceptS =
        "\3\uffff\1\2\1\3\1\4\1\uffff\1\1\4\uffff";
    static final String DFA19_specialS =
        "\14\uffff}>";
    static final String[] DFA19_transitionS = {
            "\1\5\5\uffff\1\5\26\uffff\2\5\1\uffff\1\3\1\uffff\2\5\1\1\2"+
            "\uffff\1\5\7\uffff\1\4\1\2\2\5\2\4",
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

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "265:10: (cjc= constructor_java_call | pl= prova_list | c= constant | e= expr )";
        }
    }
    static final String DFA34_eotS =
        "\30\uffff";
    static final String DFA34_eofS =
        "\30\uffff";
    static final String DFA34_minS =
        "\1\6\3\3\1\uffff\1\3\1\2\2\uffff\1\52\1\65\1\2\2\3\1\65\2\3\1\4"+
        "\1\65\1\3\1\65\3\3";
    static final String DFA34_maxS =
        "\4\72\1\uffff\1\72\1\2\2\uffff\2\66\1\2\2\3\1\65\2\72\1\4\1\66"+
        "\1\3\1\66\2\3\1\72";
    static final String DFA34_acceptS =
        "\4\uffff\1\1\2\uffff\1\3\1\2\17\uffff";
    static final String DFA34_specialS =
        "\30\uffff}>";
    static final String[] DFA34_transitionS = {
            "\1\4\37\uffff\1\4\1\uffff\1\6\2\4\2\uffff\1\4\3\uffff\1\7\3"+
            "\uffff\1\1\1\5\2\4\1\2\1\3",
            "\1\4\2\uffff\1\4\37\uffff\1\4\1\10\3\4\2\uffff\1\4\3\uffff"+
            "\1\4\3\uffff\6\4",
            "\1\4\2\uffff\1\4\37\uffff\1\4\1\10\3\4\2\uffff\1\4\3\uffff"+
            "\1\4\3\uffff\6\4",
            "\1\4\2\uffff\1\4\37\uffff\1\4\1\10\3\4\2\uffff\1\4\3\uffff"+
            "\1\4\3\uffff\6\4",
            "",
            "\1\4\2\uffff\1\4\37\uffff\1\4\1\10\3\4\2\uffff\1\4\3\uffff"+
            "\1\4\3\uffff\6\4",
            "\1\11",
            "",
            "",
            "\1\13\13\uffff\1\12",
            "\1\14\1\15",
            "\1\16",
            "\1\17",
            "\1\20",
            "\1\21",
            "\1\4\2\uffff\1\4\37\uffff\1\4\1\10\3\4\2\uffff\1\4\3\uffff"+
            "\1\4\3\uffff\6\4",
            "\1\4\2\uffff\1\4\37\uffff\1\4\1\10\3\4\2\uffff\1\4\3\uffff"+
            "\1\4\3\uffff\6\4",
            "\1\22",
            "\1\21\1\23",
            "\1\24",
            "\1\25\1\26",
            "\1\27",
            "\1\27",
            "\1\4\2\uffff\1\4\37\uffff\1\4\1\10\3\4\2\uffff\1\4\3\uffff"+
            "\1\4\3\uffff\6\4"
    };

    static final short[] DFA34_eot = DFA.unpackEncodedString(DFA34_eotS);
    static final short[] DFA34_eof = DFA.unpackEncodedString(DFA34_eofS);
    static final char[] DFA34_min = DFA.unpackEncodedStringToUnsignedChars(DFA34_minS);
    static final char[] DFA34_max = DFA.unpackEncodedStringToUnsignedChars(DFA34_maxS);
    static final short[] DFA34_accept = DFA.unpackEncodedString(DFA34_acceptS);
    static final short[] DFA34_special = DFA.unpackEncodedString(DFA34_specialS);
    static final short[][] DFA34_transition;

    static {
        int numStates = DFA34_transitionS.length;
        DFA34_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA34_transition[i] = DFA.unpackEncodedString(DFA34_transitionS[i]);
        }
    }

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = DFA34_eot;
            this.eof = DFA34_eof;
            this.min = DFA34_min;
            this.max = DFA34_max;
            this.accept = DFA34_accept;
            this.special = DFA34_special;
            this.transition = DFA34_transition;
        }
        public String getDescription() {
            return "534:1: term returns [ProvaObject ret] : (lt= left_term | ft= func_term | map= prova_map );";
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
    public static final BitSet FOLLOW_metadata_in_clause184 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_LCWORD_in_clause189 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_list_body_in_clause193 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_list_body_in_clause197 = new BitSet(new long[]{0x0000000010000008L});
    public static final BitSet FOLLOW_literals_in_clause201 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_METADATA_in_metadata227 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotation_in_metadata232 = new BitSet(new long[]{0x0000080000000008L});
    public static final BitSet FOLLOW_ANNOTATION_in_annotation266 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_LCWORD_in_annotation270 = new BitSet(new long[]{0x07E0000000000048L});
    public static final BitSet FOLLOW_value_in_annotation277 = new BitSet(new long[]{0x07E0000000000048L});
    public static final BitSet FOLLOW_LCWORD_in_value299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UCWORD_in_value309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_in_value319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_value329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LITERAL_in_literals352 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_literal_in_literals357 = new BitSet(new long[]{0x00000000C0000808L});
    public static final BitSet FOLLOW_RELATION_in_literal380 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_metadata_in_literal384 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_relation_in_literal389 = new BitSet(new long[]{0x0000400000000008L});
    public static final BitSet FOLLOW_guard_in_literal393 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SEMANTIC_ATTACHMENT_in_literal405 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_metadata_in_literal409 = new BitSet(new long[]{0x07E0275800000040L});
    public static final BitSet FOLLOW_semantic_attachment_in_literal414 = new BitSet(new long[]{0x0000400000000008L});
    public static final BitSet FOLLOW_guard_in_literal418 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CUT_in_literal430 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_cut_in_literal434 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GUARD_in_guard454 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_literals_in_guard458 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CUT_in_cut471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_predicate_java_call_in_semantic_attachment492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_binary_operation_in_semantic_attachment502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_static_java_call_in_predicate_java_call520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instance_java_call_in_predicate_java_call530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STATIC_JAVA_CALL_in_static_java_call547 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_static_call_in_static_java_call551 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_args_in_static_java_call555 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_left_term_in_binary_operation581 = new BitSet(new long[]{0x07E0231800FE1040L});
    public static final BitSet FOLLOW_EQUAL_in_binary_operation588 = new BitSet(new long[]{0x07E0275800FE1040L});
    public static final BitSet FOLLOW_constructor_java_call_in_binary_operation597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prova_list_in_binary_operation608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_binary_operation619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_binary_operation634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_not_equal_in_binary_operation647 = new BitSet(new long[]{0x0620040000000000L});
    public static final BitSet FOLLOW_constant_in_binary_operation651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_binary_operator_in_binary_operation661 = new BitSet(new long[]{0x07E0231800FE1040L});
    public static final BitSet FOLLOW_expr_in_binary_operation665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_aterm_in_expr692 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_set_in_expr697 = new BitSet(new long[]{0x07E0231800FE1040L});
    public static final BitSet FOLLOW_expr_in_expr705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_aterm728 = new BitSet(new long[]{0x0040230000000000L});
    public static final BitSet FOLLOW_variable_in_aterm733 = new BitSet(new long[]{0x0000100000000182L});
    public static final BitSet FOLLOW_number_in_aterm739 = new BitSet(new long[]{0x0000100000000182L});
    public static final BitSet FOLLOW_MINUS_in_aterm745 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_predicate_java_call_in_aterm750 = new BitSet(new long[]{0x0000100000000182L});
    public static final BitSet FOLLOW_OPEN_in_aterm754 = new BitSet(new long[]{0x07E0231800FE1040L});
    public static final BitSet FOLLOW_expr_in_aterm758 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_CLOSE_in_aterm760 = new BitSet(new long[]{0x0000100000000182L});
    public static final BitSet FOLLOW_set_in_aterm766 = new BitSet(new long[]{0x07E0231800FE1040L});
    public static final BitSet FOLLOW_aterm_in_aterm776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_variable_or_number796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_variable_or_number804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualified_java_class_in_constructor_java_call827 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_UCWORD_in_constructor_java_call837 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_args_in_constructor_java_call845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_not_equal_in_binary_operator866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_binary_operator874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_binary_operator882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LE_in_binary_operator890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GE_in_binary_operator898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_not_equal0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTANCE_JAVA_CALL_in_instance_java_call930 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_instance_call_in_instance_java_call934 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_args_in_instance_java_call938 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_variable_in_instance_call969 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_LCWORD_in_instance_call973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualified_java_class_in_static_call996 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_LCWORD_in_static_call1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_query_predicate1018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUERY_in_query1035 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_query_predicate_in_query1039 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_relation_in_query1043 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PREDICATE_in_relation1066 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_predicate_in_relation1070 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_list_body_in_relation1074 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LCWORD_in_predicate1096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UCWORD_in_predicate1106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_in_predicate1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCWORD_in_func1134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UCWORD_in_func1144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_in_func1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typed_variable_in_func1164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LIST_BODY_in_list_body1186 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_terms_in_list_body1191 = new BitSet(new long[]{0x07E0275800000048L});
    public static final BitSet FOLLOW_list_tail_in_list_body1195 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TERM_in_terms1227 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_term_in_terms1232 = new BitSet(new long[]{0x07E2275800000048L});
    public static final BitSet FOLLOW_left_term_in_term1257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_func_term_in_term1267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prova_map_in_term1277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_left_term1295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_left_term1305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_left_term1315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prova_list_in_left_term1325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_right_term1354 = new BitSet(new long[]{0x0660270000000000L});
    public static final BitSet FOLLOW_constant_in_right_term1360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_right_term1368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_right_term1380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prova_list_in_right_term1390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUALIFIED_JAVA_CLASS_in_qualified_java_class1420 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_LCWORD_in_qualified_java_class1426 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_DOT_in_qualified_java_class1430 = new BitSet(new long[]{0x0060000000000000L});
    public static final BitSet FOLLOW_UCWORD_in_qualified_java_class1439 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_func_in_func_term1459 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_args_in_func_term1463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPED_VARIABLE_in_typed_variable1481 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_qualified_java_class_in_typed_variable1485 = new BitSet(new long[]{0x0060000000000000L});
    public static final BitSet FOLLOW_LCWORD_in_typed_variable1490 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UCWORD_in_typed_variable1494 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TYPED_VARIABLE_in_typed_variable1508 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_UCWORD_in_typed_variable1512 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_LCWORD_in_typed_variable1516 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TYPED_VARIABLE_in_typed_variable1529 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_UCWORD_in_typed_variable1533 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_UCWORD_in_typed_variable1537 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PROVA_LIST_in_prova_list1556 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_list_body_in_prova_list1560 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PROVA_MAP_in_prova_map1588 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_key_value_in_prova_map1593 = new BitSet(new long[]{0x0004000000000008L});
    public static final BitSet FOLLOW_KEY_VALUE_in_key_value1619 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_mstring_in_key_value1624 = new BitSet(new long[]{0x07E2275800000048L});
    public static final BitSet FOLLOW_term_in_key_value1628 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UCWORD_in_variable1657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USWORD_in_variable1667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typed_variable_in_variable1677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOLLARWORD_in_variable1687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARGS_in_args1705 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_list_body_in_args1709 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_variable_in_list_tail1738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prova_list_in_list_tail1748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCWORD_in_constant1775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_in_constant1785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualified_java_class_in_constant1795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING1_in_string1817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING2_in_string1827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_in_mstring1845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCWORD_in_mstring1855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_LITERAL_in_pos_number1873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONG_LITERAL_in_pos_number1883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_float_literal_in_pos_number1893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_LITERAL_in_float_literal1913 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_DOT_in_float_literal1915 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_INT_LITERAL_in_float_literal1919 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_EXPONENT_in_float_literal1924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_number1946 = new BitSet(new long[]{0x07E0000000000040L});
    public static final BitSet FOLLOW_pos_number_in_number1951 = new BitSet(new long[]{0x0000000000000002L});

}