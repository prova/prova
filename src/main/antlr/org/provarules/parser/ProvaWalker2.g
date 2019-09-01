tree grammar ProvaWalker2;

options {
	tokenVocab=Prova2;
	ASTLabelType = CommonTree;
}

@header {
	package org.provarules.parser;
	import java.util.List;
	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.Set;
	import java.util.HashSet;
	import java.util.Map;
	import java.util.HashMap;
	
	import ProvaClassUtils;
	import ProvaObject;
	import ProvaConstant;
	import ProvaVariable;
	import ProvaList;
	import ProvaLiteral;
	import ProvaRule;
	import ProvaResultSet;
	import ProvaConstantImpl;
	import ProvaVariableImpl;
	import ProvaMapImpl;
	import ProvaListImpl;
	import ProvaLiteralImpl;
	import ProvaRuleImpl;
	import ProvaGlobalConstantImpl;
	import ProvaOperatorFactoryImpl;
	import ProvaBinaryOperatorFactoryImpl;
	import ProvaParserImpl;

	import ProvaErrorReporter;
}

@members {
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

}

rulebase returns [List ret]
scope {
	List ret0;
}
@init {
	$rulebase::ret0 = new ArrayList();
}
@after {
	$ret = $rulebase::ret0;
}
	:	^(RULEBASE (s=statement {$rulebase::ret0.add(s);})*)
;

statement returns [List ret]
	:	^(STATEMENT st=stat) {$ret = st;};

stat	returns [List ret]
scope {
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
@init {
	$stat::ret0 = new Object[7];
	$stat::vars = new HashSet();
	$stat::tailVars = new HashMap();
	$stat::mapVars = new HashMap();
	$stat::bodyVars = new HashSet();
	$stat::headVars = new HashSet();
	$stat::isBody = false;
	$stat::inRest = false;
	$stat::ret0[3] = new HashMap();
	$stat::ret0[4] = new HashMap();
	$stat::objects = ProvaParserImpl.tlObjects.get();
	$stat::src = ProvaParserImpl.tlSrc.get();
}
@after {
	$ret = Arrays.asList($stat::ret0);
}
	:
	c=clause {
		$stat::ret0[2]=c;
	}
	| q=query {
		$stat::ret0[0] = "";
		$stat::ret0[1]=ProvaListImpl.emptyRList;
		$stat::ret0[2]=q;
	}
;

clause returns [ProvaRule ret]:	
	^(cl=CLAUSE m=metadata? r=relation l=literals?)
	{$stat::ret0[5]=m; $stat::ret0[1]=r; $stat::ret0[2]=l;
	ProvaLiteral head = ProvaParserImpl.tlKB.get().generateLiteral((String) r.get(0),(ProvaList) r.get(1));
	ProvaLiteral[] body = (l==null) ? new ProvaLiteral[0] : l.toArray(new ProvaLiteral[0]);
	$ret = ProvaParserImpl.tlKB.get().generateRule(head,body);
      	$ret.computeSourceCode();
	$ret.setLine($cl.getLine());
	$ret.setSrc(Arrays.asList(new Object[] {$stat::src}));
	$ret.addMetadata(m);
	}
	|
	^(cl=CLAUSE m=metadata? pred=LCWORD params=list_body result=list_body l=literals?)
	{
	List rel = new ArrayList();
	$stat::ret0[5]=m; $stat::ret0[1]=rel; $stat::ret0[2]=l;
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
	$ret = ProvaParserImpl.tlKB.get().generateRule(head,body);
	$ret.setLine($cl.getLine());
	$ret.setSrc(Arrays.asList(new Object[] {$stat::src}));
	$ret.addMetadata(m);
	}
;
	
metadata returns [Map<String,List<Object>> ret]
@init {
	$ret = new HashMap<String,List<Object>>();
}
	:	^(METADATA (a=annotation {$ret.put(a.get(0).toString(),(List<Object>) a.get(1));})+)
;

annotation	returns [List<Object> ret]
scope {
	List<String> value;
}
@init {
	$ret = new ArrayList<Object>();
	$annotation::value = new ArrayList<String>(); 
}
@after {
	$ret.add($annotation::value);
}
	:	^(ANNOTATION n=LCWORD {$ret.add(n.toString());} (v=value {$annotation::value.add(v);})*)
;
	
value returns [String ret]
	:	l=LCWORD {$ret = l.toString();}
		| u=UCWORD { $ret = u.toString(); }
		| s=string { $ret = s; }
		| n=number { $ret = n.toString(); }
;

literals 	returns [List<ProvaLiteral> ret]
@init {
	$ret = new ArrayList<ProvaLiteral>();
	$stat::isBody = true;
}
	:	^(LITERAL (l=literal {$ret.add(l);})+)
;

function_call returns [List ret]
@init {
	$ret = new ArrayList();
}
	:
	^(FUNCTION_CALL pred=predicate params=list_body result=list_body?) {
		if( Character.isUpperCase(pred.charAt(0)) )
			$ret.add(ProvaVariableImpl.create(pred));
		else
			$ret.add(ProvaConstantImpl.create(pred));
		ProvaObject p = params;
		if( params.getFixed().length==1 )
			p = params.getFixed()[0];
		if( result==null )
			$ret.add(ProvaListImpl.create(new ProvaObject[] {p,null},null));
		else {
			ProvaObject o = result;
			if( result.getFixed().length==1 )
				o = result.getFixed()[0];
			$ret.add(ProvaListImpl.create(new ProvaObject[] {p,o},null));
		}
	}
	;

literal returns [ProvaLiteral ret]
	:
	^(rel=RELATION m=metadata? r=relation g=guard?) {
		Object pred = r.get(0);
      		if( pred.equals("cache") ) {
       			String actualPred = ((ProvaList) ((ProvaList) r.get(1)).getFixed()[0]).getFixed()[0].toString();
       			ProvaParserImpl.tlKB.get().addCachePredicate(actualPred);
       		}
		$ret = ProvaParserImpl.tlKB.get().generateLiteral((String) pred,(ProvaList) r.get(1),g);
		$ret.setLine($rel.getLine());
		List<ProvaObject> metaVariables = $ret.addMetadata(m);
		if( metaVariables!=null ) {
			metaVariables.add(0,ProvaConstantImpl.create(pred));
			metaVariables.add(1,(ProvaList) r.get(1));
			ProvaList metaList = ProvaListImpl.create( metaVariables );
			$ret = ProvaParserImpl.tlKB.get().generateLiteral("metadata",metaList,g);
			$ret.setLine($rel.getLine());
			$ret.addMetadata(m);
		}
	}
	| ^(sem=SEMANTIC_ATTACHMENT m=metadata? sa=semantic_attachment g=guard?) {
		$ret=ProvaParserImpl.tlKB.get().generateLiteral((String) ((ProvaConstant) sa.get(0)).getObject(),(ProvaList) sa.get(1),g);
		$ret.setLine($sem.getLine());
		$ret.addMetadata(m);
	}
	| ^(fun=FUNCTION m=metadata? f=function_call) {
		ProvaList argsResult = (ProvaList) f.get(1);
		if( argsResult.getFixed()[1]==null ) {
			// Just a predicate call
			$ret=ProvaParserImpl.tlKB.get().generateLiteral((String) ((ProvaConstant) f.get(0)).getObject(), (ProvaList) argsResult.getFixed()[0]);
		} else
			$ret=ProvaParserImpl.tlKB.get().generateLiteral((String) ((ProvaConstant) f.get(0)).getObject(), argsResult);
		$ret.setLine($fun.getLine());
		$ret.addMetadata(m);
	}
	| ^(cu=CUT c=cut) {
		ProvaVariable any1 = ProvaVariableImpl.create();
		ProvaList lany1 = ProvaListImpl.create( new ProvaObject[] {any1});
		$ret = ProvaParserImpl.tlKB.get().generateLiteral("cut",lany1);
		$ret.setLine($cu.getLine());
	}
;

guard returns [List<ProvaLiteral> ret]
	:	^(g=GUARD lits=literals) {
		$ret = lits;
	}
;

cut
	:	CUT
;

semantic_attachment returns [List<ProvaObject> ret]
@init {
	$ret = new ArrayList<ProvaObject>();
}
	:	pjc=predicate_java_call {
			ProvaConstant symbolConstant = (ProvaConstant) pjc.remove(0);
			ProvaList pl = ProvaListImpl.create(pjc.toArray(new ProvaObject[0]));
			String method = symbolConstant.equals("s")?"scalc":"pcalc";
			$ret.add(ProvaConstantImpl.create(method));
			$ret.add(pl);
		}
		| bo=binary_operation {
			ProvaConstant symbolConstant = (ProvaConstant) bo.remove(0);
			$ret.add(symbolConstant);
			ProvaList pl = ProvaListImpl.create(bo.toArray(new ProvaObject[0]));
			$ret.add(pl);
		}
;

predicate_java_call returns [List<ProvaObject> ret]
	:	sjc=static_java_call {
			$ret=sjc;
		}
		| ijc=instance_java_call {
			$ret=ijc;
		}
;

static_java_call returns [List<ProvaObject> ret]
	:	^(STATIC_JAVA_CALL sc=static_call a=args) {
			sc.add(a);
			$ret = sc;
		}
;

binary_operation returns [List<ProvaObject> ret]
scope {
	String op;
}
	:	
		lt=left_term (
			EQUAL (
			cjc=constructor_java_call {
				$ret=new java.util.ArrayList<ProvaObject>();
				$ret.add(ProvaConstantImpl.create("construct"));
				$ret.add(cjc.get(0));
				$ret.add(lt);
				$ret.add(cjc.get(1));
			}
			| pl=prova_list {
				$ret=new java.util.ArrayList<ProvaObject>();
				$ret.add(ProvaConstantImpl.create("equals"));
				$ret.add(lt);
				$ret.add(pl);
			}
			| c=constant {
				$ret=new java.util.ArrayList<ProvaObject>();
				$ret.add(ProvaConstantImpl.create("equals"));
				$ret.add(lt);
				$ret.add(c);
			}
			// TODO: minus
			| e=expr {
				$ret=new java.util.ArrayList<ProvaObject>();
				$ret.add(ProvaConstantImpl.create("expr_literal"));
				$ret.add(ProvaConstantImpl.create(ProvaBinaryOperatorFactoryImpl.create("=")));
				$ret.add(lt);
				$ret.add(e);
			}
			)
		| not_equal c=constant {
			$ret=new java.util.ArrayList<ProvaObject>();
			$ret.add(ProvaConstantImpl.create("ne"));
			$ret.add(lt);
			$ret.add(c);
		}
		| bo=binary_operator e=expr {
			$ret=new java.util.ArrayList<ProvaObject>();
			$ret.add(ProvaConstantImpl.create("expr_literal"));
			$ret.add(ProvaConstantImpl.create(ProvaBinaryOperatorFactoryImpl.create(bo)));
			$ret.add(lt);
			$ret.add(e);
		}
		)
		/*
		| lt=left_term bo=binary_operator rt=right_term {
			$ret=new java.util.ArrayList<ProvaObject>();
			if( $binary_operation::op.equals("minus") )
				$ret.add(ProvaConstantImpl.create("equals_minus"));
			else
				$ret.add(ProvaConstantImpl.create(bo));
			$ret.add(lt);
			$ret.add(rt);
		}
		*/
;

expr	returns [ProvaObject ret]
@init {
	List<String> ops = new ArrayList<String>();
	List<ProvaObject> other = new ArrayList<ProvaObject>();
}
	:
	a=aterm (op=(PLUS|MINUS) b=aterm {ops.add(op.toString()); other.add(b);})*
	{
		final int len = ops==null ? 0 : ops.size();
		for( int i=0; i<len; i++ ) {
			List list = new ArrayList();
			list.add(ProvaConstantImpl.create(ProvaOperatorFactoryImpl.create(ops.get(i))));
			list.add(a);
			list.add(other.get(i));
			a = ProvaListImpl.create(list);
		}
		$ret = a;
	};
	
aterm	returns [ProvaObject ret]
	:
	(m=MINUS? v=variable | n=number | m=MINUS? pjc=predicate_java_call | OPEN e=expr CLOSE) (op=(MULT|DIV|REM) a=aterm)?
	{
		if( $op==null ) {
			if( m==null ) {
				if( pjc!=null ) {
					List plist = new java.util.ArrayList<ProvaObject>();
					plist.add(ProvaConstantImpl.create(ProvaOperatorFactoryImpl.createFunctionCall(pjc.get(0),pjc.get(2))));
					plist.add(pjc.get(1));
					plist.add(pjc.get(3));
					$ret = ProvaListImpl.create(plist);
				} else
					$ret = v==null ? (n==null ? e : n) : v;
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
				$ret = ProvaListImpl.create(list);
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
			$ret = ProvaListImpl.create(list);
		}
	};

variable_or_number returns [ProvaObject ret]
	:	v=variable {$ret = v;} | n=number {$ret = n;};

constructor_java_call	returns [List<ProvaObject> ret]
@init {
	$ret = new ArrayList<ProvaObject>();
}
	:	(qjc=qualified_java_class {$ret.add(qjc);}
		| o=UCWORD {
			Class<?> type = ProvaClassUtils.findClass((String) o.toString());
			if( type==null )
				throw new MismatchedTreeNodeException(0,getInput());
			$ret.add(ProvaConstantImpl.create(type));
			} ) a=args {
			$ret.add(a);
		}
;

binary_operator	returns [String ret]
	:	//EQUAL {$ret="equals";}
		| not_equal {$ret="ne";}
		| LT {$ret="lt";}
		| GT {$ret="gt";}
		| LE {$ret="le";}
		| GE {$ret="ge";}
;

not_equal 
	:	NOT_EQUAL1 | NOT_EQUAL2
;

instance_java_call returns [List<ProvaObject> ret]
	:	^(INSTANCE_JAVA_CALL ic=instance_call a=args)
		{
			ic.add(a);
			$ret = ic;
		}
;

instance_call returns [List<ProvaObject> ret]
@init {
	$ret = new ArrayList();
	$stat::inInstanceCall = true;
}
@after {
	$stat::inInstanceCall = false;
}
	:	v=variable l=LCWORD {
			// Prefix set to "" to signal that the predicate_java_call is an instance one
			//   but can be reclassified as a static call if v is a constant
			//   representing a class from a default package java.lang or org.provarules
			String s = (v instanceof ProvaVariable || v instanceof ProvaGlobalConstantImpl || (v instanceof ProvaConstant && !(((ProvaConstant) v).getObject() instanceof Class<?>)))?"":"s";
			$ret.add(ProvaConstantImpl.create(s));
			$ret.add(v);
			$ret.add(ProvaConstantImpl.create($l.text));
		}
;

static_call returns [List<ProvaObject> ret]
@init {
	$ret = new ArrayList<ProvaObject>();
}
	:	qjc=qualified_java_class l=LCWORD {
			// Prefix set to "s" to signal that the predicate_java_call is a static one
			$ret.add(ProvaConstantImpl.create("s"));
			$ret.add(qjc);
			$ret.add(ProvaConstantImpl.create($l.text));
		}
;

query_predicate returns [String ret]
	:	c=constant {$ret = (String) c.getObject();}
;

query	returns [ProvaRule ret]
	:	^(QUERY qp=query_predicate r=relation) {
			ProvaLiteral q=ProvaParserImpl.tlKB.get().generateLiteral((String) r.get(0),(ProvaList) r.get(1));
			if( qp.equals("eval") ) {
				$ret = new ProvaRuleImpl( new ProvaLiteral[] {q});
				ProvaLiteral fail = ProvaParserImpl.tlKB.get().generateLiteral("fail");
				$ret.addBodyLiteral(fail);
			} else if( qp.equals("solve") ) {
				ProvaResultSet resultSet = ProvaParserImpl.tlRS.get();
				$ret=ProvaParserImpl.tlKB.get().generateSolveGoal(resultSet, new ProvaLiteral[] {q});
			} else throw new RuntimeException();
		}
;

relation returns [List ret]
@init {
	$ret = new ArrayList();
}
	:	^(PREDICATE p=predicate l=list_body) {
			if( Character.isUpperCase(p.charAt(0)) )
				$ret.add(ProvaVariableImpl.create(p));
			else
				$ret.add(p);
			$ret.add(l);
		}
	/*
			if( p.charAt(0)=='@' || Character.isUpperCase(p.charAt(0)) ) {
				$ret=reagent.cplx(reagent.flist,RListUtils.emptyRListTerm,$ret);
				$ret=reagent.cplx(reagent.flist,$ret,reagent.cons("derive",String.class));
				if( !$stat::isBody )
					$stat::ret0[0] = "derive";
			} else if( !$stat::isBody )
				$stat::ret0[0] = p;
	*/
;

predicate returns [String ret]
	:	l=LCWORD {$ret = l.toString();}
		| u=UCWORD { $ret = u.toString(); }
		| s=string { $ret = s; }
;

func	returns [ProvaObject ret]
	:	l=LCWORD {
			$ret=ProvaConstantImpl.create(l.toString());
		}
		| u=UCWORD {
			$ret=ProvaVariableImpl.create(u.toString());
		}
		| s=string {
			$ret=ProvaConstantImpl.create(s);
		}
		| tv=typed_variable {
			$ret=tv;
		}
;

list_body returns [ProvaList ret]
scope {
	Object rest;
}
 	:	^(LIST_BODY (t=terms lt=list_tail?)?)
 		{
 			if( t==null ) {
 				if( lt==null )
	 				$ret = ProvaListImpl.emptyRList;
	 			else
					$ret = ProvaListImpl.create(new ProvaObject[0],lt);
 			} else
				$ret = ProvaListImpl.create(t.toArray(new ProvaObject[0]),lt);
			// TODO: deal with the case when t is not ComplexTerm
 		}
 ;
 
terms 	returns [List<ProvaObject> ret]
@init {
	$ret = new ArrayList<ProvaObject>();
}
	:	^(TERM (t=term  {$ret.add(t);})+)
;

term	returns [ProvaObject ret]
	:	
		lt=left_term {$ret=lt;}
		| ft=func_term {$ret=ft;}
		| map=prova_map {$ret=map;}
;

left_term returns [ProvaObject ret]
	:	c=constant {$ret=c;}
		| v=variable {$ret=v;}
		| n=number {$ret=n;}
		| p=prova_list {$ret=p;}
;

right_term returns [ProvaObject ret]
@init {
	$binary_operation::op="";
}
@after {
if(m!=null )
	$binary_operation::op="minus";
}
	:	(m=MINUS? (c=constant {$ret=c;} | v=variable {$ret=v;}))
		| n=number {$ret=n;}
		| p=prova_list {$ret=p;};

qualified_java_class returns [ProvaConstant ret]
scope {
	String s;
}
@init {
	$qualified_java_class::s = "";
}
@after {
	Class type = ProvaClassUtils.findClass((String) $qualified_java_class::s);
	if( type==null )
		throw new MismatchedTreeNodeException(0,getInput());
	$ret=ProvaConstantImpl.create(/*$qualified_java_class::s*/type);
}
	:	^(QUALIFIED_JAVA_CLASS ((l=LCWORD d=DOT) {$qualified_java_class::s+=l.toString()+d.toString();})+ u=UCWORD) {
			$qualified_java_class::s+=u.toString();
		}
;
	
func_term	returns [ProvaObject ret]
	:	f=func a=args {
			List<ProvaObject> fixed = new ArrayList<ProvaObject>();
			fixed.add(f);
			fixed.addAll(Arrays.asList(a.getFixed()));
			ret=ProvaListImpl.create((ProvaObject[]) fixed.toArray(new ProvaObject[0]),a.getTail());
//			$ret=reagent.cplx(reagent.flist,a,f);
		}
;
	
typed_variable returns [ProvaObject ret]
	:	^(TYPED_VARIABLE q=qualified_java_class (w=LCWORD|w=UCWORD)) {
			Class<?> type = (Class<?>) q.getObject();
			Object field = null;
			try {
				field = type.getField(w.toString()).get(null);
			} catch( Exception e1 ) {}
			if( field!=null )
				$ret=ProvaConstantImpl.create(field);
			else
				$ret=ProvaVariableImpl.create(w.toString(),type);
		}
		// a field in a class
		| ^(TYPED_VARIABLE u=UCWORD l=LCWORD) {
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
				$ret=ProvaConstantImpl.create(field);
			} catch( Exception e ) {
				throw new MismatchedTreeNodeException(0,getInput());
			}
		}
		// a field in a class or a variable of a class
		| ^(TYPED_VARIABLE u=UCWORD w=UCWORD) {
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
					$ret=ProvaConstantImpl.create(field);
				else
					$ret=ProvaVariableImpl.create(w.toString(),type);
			} catch( Exception e ) {
				throw new MismatchedTreeNodeException(0,getInput());
			}
		}
;
	
prova_list returns [ProvaList ret]
	:	^(PROVA_LIST l=list_body) {$ret=l;}
;

prova_map returns [ProvaObject ret]
@init {
	Map<String,Object> map = new HashMap<String,Object>();
}
@after {
	$ret = ProvaMapImpl.create(map);
}
	:	^(PROVA_MAP (kv=key_value {map.put(kv.get(0).toString(),kv.get(1));})*)
	;

key_value returns [List<Object> ret]
@init {
	$ret = new ArrayList<Object>();
}
	:	^(KEY_VALUE (k=mstring v=term) {$ret.add(k); $ret.add(v);})
	;
	
variable returns [ProvaObject ret]
@after {
	if( $ret instanceof ProvaVariable ) {
		$stat::vars.add($ret);
	}
}
	:
		u=UCWORD {
//			// Allow class lookup from pseudo-instance call
//			Class<?> type = ProvaClassUtils.findClass("java.lang."+u);
//			if( type!=null )
//				$ret=ProvaConstantImpl.create(type);
//			else
			$ret=ProvaVariableImpl.create(u.toString());
		}
		| usw=USWORD {
			if( usw.toString().length()==1 )
				$ret=ProvaVariableImpl.create(usw.toString());
			else
				$ret=ProvaConstantImpl.create(ProvaParserImpl.tlObjects.get()[Integer.parseInt(usw.toString().substring(1))]);
		}
		| tv=typed_variable {$ret=tv;}
		| gc=DOLLARWORD {$ret=ProvaParserImpl.tlKB.get().generateGlobalConstant(gc.toString());}
;

args 	returns [ProvaList ret]
	:	^(ARGS lb=list_body) {$ret=lb;}
;

list_tail returns [ProvaObject ret]
@init {
	$stat::inRest = true;
}
@after {
	$stat::inRest = false;
}
	:	v=variable {
			$ret=v;
		}
		| p=prova_list {$ret=p;}
;

constant returns [ProvaConstant ret]
	:	
		//l=LCWORD {$ret=ProvaConstantImpl.create(l.toString());}
		//| 
		d=LCWORD {
			Object sd = d.toString();
			if( "false".equals(sd) )
				$ret=ProvaConstantImpl.create(java.lang.Boolean.FALSE);
			else if ("true".equals(sd) )
				$ret=ProvaConstantImpl.create(java.lang.Boolean.TRUE);
			else
				$ret=ProvaParserImpl.tlKB.get().generateGlobalConstant((String) sd);
		}
		| s=string {$ret=ProvaConstantImpl.create(s.toString());}
		| qjc=qualified_java_class {
			$ret = qjc;
			// A minor hack:
			// 	we need the class itself, not its name, to be inserted
			// This is guaranteed to succeed
			//Class type = ProvaClassUtils.findClass((String) qjc.getObject());
			//$ret = ProvaConstantImpl.create(type);
		}
;

//global_constant returns [ProvaConstant ret]
//	:	d=DOLLARWORD {$ret=ProvaParserImpl.tlKB.get().generateGlobalConstant(d.toString());}
//	;

string	returns [String ret]
	:	s1=STRING1 {$ret=s1.toString().substring(1,s1.toString().length()-1);}
		| s2=STRING2 {$ret=s2.toString().substring(1,s2.toString().length()-1);}
;

mstring	returns [String ret]
	:	s=string {$ret=s;}
		| l=LCWORD {$ret=l.toString();}
;

pos_number	returns [Number ret]
	:	i=INT_LITERAL {$ret=Integer.parseInt(i.toString());}
		| l=LONG_LITERAL {String s = l.toString(); $ret=Long.parseLong(s.substring(0,s.length()-1));}
		| f=float_literal {$ret=Double.parseDouble(f.toString());}
;

// Must use a parser here because of the conflict with end_of_statement
float_literal 	returns [String ret]
	:	i1=INT_LITERAL DOT i2=INT_LITERAL (e=EXPONENT)?
		{
			$ret=i1.toString()+'.'+i2.toString();
			if( e!=null )
				$ret+=e.toString();
		}
;

number returns [ProvaConstant ret]
	:	m='-'? p=pos_number {
			if( m==null ) {
				$ret=ProvaConstantImpl.create(p);
			} else if( p instanceof Integer ) {
				$ret=ProvaConstantImpl.create(-((Integer) p));
			} else if( p instanceof Long ) {
				$ret=ProvaConstantImpl.create(-((Long) p));
			} else if( p instanceof Double ) {
				$ret=ProvaConstantImpl.create(-((Double) p));
			}
		}
;
