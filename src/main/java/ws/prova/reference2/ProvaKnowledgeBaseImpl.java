package ws.prova.reference2;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ws.prova.agent2.ProvaReagent;
import ws.prova.kernel2.ProvaBuiltin;
import ws.prova.kernel2.ProvaConstant;
import ws.prova.kernel2.ProvaDerivationNode;
import ws.prova.kernel2.ProvaKnowledgeBase;
import ws.prova.kernel2.ProvaList;
import ws.prova.kernel2.ProvaLiteral;
import ws.prova.kernel2.ProvaObject;
import ws.prova.kernel2.ProvaPredicate;
import ws.prova.kernel2.ProvaResolutionInferenceEngine;
import ws.prova.kernel2.ProvaResultSet;
import ws.prova.kernel2.ProvaRule;
import ws.prova.kernel2.ProvaRuleSet;
import ws.prova.kernel2.ProvaUnification;
import ws.prova.kernel2.ProvaVariablePtr;
import ws.prova.exchange.ProvaSolution;
import ws.prova.kernel2.ProvaVariable;
import ws.prova.kernel2.cache.ProvaCacheState;
import ws.prova.kernel2.cache.ProvaLocalAnswers;
import ws.prova.parser2.ProvaParserImpl;
import ws.prova.parser2.ProvaParsingException;
import ws.prova.reference2.builtins.ProvaAddGroupResultImpl;
import ws.prova.reference2.builtins.ProvaAssertAImpl;
import ws.prova.reference2.builtins.ProvaAssertImpl;
import ws.prova.reference2.builtins.ProvaAtImpl;
import ws.prova.reference2.builtins.ProvaAttachImpl;
import ws.prova.reference2.builtins.ProvaBoundImpl;
import ws.prova.reference2.builtins.ProvaByteStreamImpl;
import ws.prova.reference2.builtins.ProvaCacheImpl;
import ws.prova.reference2.builtins.ProvaCaptureEnumImpl;
import ws.prova.reference2.builtins.ProvaCloneImpl;
import ws.prova.reference2.builtins.ProvaConcatImpl;
import ws.prova.reference2.builtins.ProvaConstructorImpl;
import ws.prova.reference2.builtins.ProvaConsultImpl;
import ws.prova.reference2.builtins.ProvaCopyImpl;
import ws.prova.reference2.builtins.ProvaCopyStreamImpl;
import ws.prova.reference2.builtins.ProvaDeriveImpl;
import ws.prova.reference2.builtins.ProvaElementImpl;
import ws.prova.reference2.builtins.ProvaEqualsImpl;
import ws.prova.reference2.builtins.ProvaEqualsMinusImpl;
import ws.prova.reference2.builtins.ProvaExpressionLiteralImpl;
import ws.prova.reference2.builtins.ProvaFailImpl;
import ws.prova.reference2.builtins.ProvaFopenImpl;
import ws.prova.reference2.builtins.ProvaFreeImpl;
import ws.prova.reference2.builtins.ProvaGreaterEqualImpl;
import ws.prova.reference2.builtins.ProvaGreaterImpl;
import ws.prova.reference2.builtins.ProvaIamImpl;
import ws.prova.reference2.builtins.ProvaInitJoinImpl;
import ws.prova.reference2.builtins.ProvaInitPredicateJoinImpl;
import ws.prova.reference2.builtins.ProvaInsertImpl;
import ws.prova.reference2.builtins.ProvaJavaFunctionImpl;
import ws.prova.reference2.builtins.ProvaJavaPredicateImpl;
import ws.prova.reference2.builtins.ProvaJoinTestImpl;
import ws.prova.reference2.builtins.ProvaLengthImpl;
import ws.prova.reference2.builtins.ProvaLessEqualImpl;
import ws.prova.reference2.builtins.ProvaLessImpl;
import ws.prova.reference2.builtins.ProvaListenImpl;
import ws.prova.reference2.builtins.ProvaMapMergeImpl;
import ws.prova.reference2.builtins.ProvaMatchImpl;
import ws.prova.reference2.builtins.ProvaMathAddImpl;
import ws.prova.reference2.builtins.ProvaMathDivideImpl;
import ws.prova.reference2.builtins.ProvaMathMultiplyImpl;
import ws.prova.reference2.builtins.ProvaMathRemainderImpl;
import ws.prova.reference2.builtins.ProvaMathSubtractImpl;
import ws.prova.reference2.builtins.ProvaMkListImpl;
import ws.prova.reference2.builtins.ProvaNotEqualsImpl;
import ws.prova.reference2.builtins.ProvaParseListImpl;
import ws.prova.reference2.builtins.ProvaParseNvImpl;
import ws.prova.reference2.builtins.ProvaPredicateJoinExitImpl;
import ws.prova.reference2.builtins.ProvaPredicateJoinTestImpl;
import ws.prova.reference2.builtins.ProvaPrintImpl;
import ws.prova.reference2.builtins.ProvaPrintlnImpl;
import ws.prova.reference2.builtins.ProvaReadEnumImpl;
import ws.prova.reference2.builtins.ProvaReceiveMsgImpl;
import ws.prova.reference2.builtins.ProvaReceiveMsgPImpl;
import ws.prova.reference2.builtins.ProvaReceiveMultImpl;
import ws.prova.reference2.builtins.ProvaRetractAllImpl;
import ws.prova.reference2.builtins.ProvaRetractImpl;
import ws.prova.reference2.builtins.ProvaReverseImpl;
import ws.prova.reference2.builtins.ProvaSendMsgImpl;
import ws.prova.reference2.builtins.ProvaSendMsgSyncImpl;
import ws.prova.reference2.builtins.ProvaSolveImpl;
import ws.prova.reference2.builtins.ProvaSpawnImpl;
import ws.prova.reference2.builtins.ProvaStopPredicateJoinImpl;
import ws.prova.reference2.builtins.ProvaTemporalRuleRemoveImpl;
import ws.prova.reference2.builtins.ProvaTokenizeEnumImpl;
import ws.prova.reference2.builtins.ProvaTokenizeListImpl;
import ws.prova.reference2.builtins.ProvaTypeImpl;
import ws.prova.reference2.builtins.ProvaUnescapeImpl;
import ws.prova.reference2.builtins.ProvaUniqueIdImpl;
import ws.prova.reference2.builtins.ProvaUnlistenImpl;
import ws.prova.reference2.builtins.ProvaUpdateCacheImpl;
import ws.prova.reference2.builtins.ProvaUpdateImpl;
import ws.prova.reference2.cache.ProvaCachedLiteralImpl;

public class ProvaKnowledgeBaseImpl implements ProvaKnowledgeBase {

	private final static Logger log = Logger.getLogger("prova");

	private static final ProvaSolution[] noSolutions = new ProvaSolution[0];
	
	private AtomicLong seqRuleId = new AtomicLong();
	
	private ConcurrentMap<String,ProvaPredicate> predicates;

	private Map<String,ProvaBuiltin> builtins;

	private PrintWriter printWriter = new PrintWriter(System.out,true);

	private ConcurrentMap<String,ProvaConstant> globals;
	
	private NavigableSet<String> cachePredicateSymbols;
	
	private final Map<String,List<ProvaRuleSet>> srcMap = new HashMap<String,List<ProvaRuleSet>>();

	private Object context;

	public ProvaKnowledgeBaseImpl() {
		predicates = new ConcurrentHashMap<String,ProvaPredicate>();
		globals = new ConcurrentHashMap<String,ProvaConstant>();
		cachePredicateSymbols = new java.util.concurrent.ConcurrentSkipListSet<String>();
		builtins = new HashMap<String,ProvaBuiltin>();
		builtins.put("solve", new ProvaSolveImpl(this));
		builtins.put("fail", new ProvaFailImpl(this));
		builtins.put("println", new ProvaPrintlnImpl(this));
		builtins.put("print", new ProvaPrintImpl(this));
		builtins.put("derive", new ProvaDeriveImpl(this));
		builtins.put("gt", new ProvaGreaterImpl(this));
		builtins.put("ge", new ProvaGreaterEqualImpl(this));
		builtins.put("lt", new ProvaLessImpl(this));
		builtins.put("le", new ProvaLessEqualImpl(this));
		builtins.put("math_add", new ProvaMathAddImpl(this));
		builtins.put("math_subtract", new ProvaMathSubtractImpl(this));
		builtins.put("math_multiply", new ProvaMathMultiplyImpl(this));
		builtins.put("math_divide", new ProvaMathDivideImpl(this));
		builtins.put("math_remainder", new ProvaMathRemainderImpl(this));
		builtins.put("equals", new ProvaEqualsImpl(this));
		builtins.put("equals_minus", new ProvaEqualsMinusImpl(this));
		builtins.put("ne", new ProvaNotEqualsImpl(this));
		builtins.put("construct", new ProvaConstructorImpl(this));
		builtins.put("pcalc", new ProvaJavaPredicateImpl(this));
		builtins.put("fcalc", new ProvaJavaFunctionImpl(this));
		builtins.put("element", new ProvaElementImpl(this));
		builtins.put("clone", new ProvaCloneImpl(this));
		builtins.put("sendMsg", new ProvaSendMsgImpl(this));
		builtins.put("sendMsgSync", new ProvaSendMsgSyncImpl(this));
		builtins.put("spawn", new ProvaSpawnImpl(this));
		builtins.put("rcvMsg", new ProvaReceiveMsgImpl(this));
		builtins.put("rcvMult", new ProvaReceiveMultImpl(this));
		builtins.put("rcvMsgP", new ProvaReceiveMsgPImpl(this));
		builtins.put("unique_id", new ProvaUniqueIdImpl(this));
		builtins.put("iam", new ProvaIamImpl(this));
		builtins.put("fopen", new ProvaFopenImpl(this));
		builtins.put("copy", new ProvaCopyImpl(this));
		builtins.put("cache", new ProvaCacheImpl(this));
		builtins.put("attach", new ProvaAttachImpl(this));
		builtins.put("@attach", new ProvaAttachImpl(this));
		builtins.put("consult", new ProvaConsultImpl(this));
		builtins.put("init_join", new ProvaInitJoinImpl(this));
		builtins.put("join_test", new ProvaJoinTestImpl(this));
		builtins.put("init_predicate_join", new ProvaInitPredicateJoinImpl(this));
		builtins.put("stop_predicate_join", new ProvaStopPredicateJoinImpl(this));
		builtins.put("predicate_join_test", new ProvaPredicateJoinTestImpl(this));
		builtins.put("predicate_join_exit", new ProvaPredicateJoinExitImpl(this));
		builtins.put("assert", new ProvaAssertImpl(this));
		builtins.put("asserta", new ProvaAssertAImpl(this));
		builtins.put("insert", new ProvaInsertImpl(this));
		builtins.put("retract", new ProvaRetractImpl(this));
		builtins.put("retractall", new ProvaRetractAllImpl(this));
		builtins.put("capture_enum", new ProvaCaptureEnumImpl(this));
		builtins.put("concat", new ProvaConcatImpl(this));
		builtins.put("unescape", new ProvaUnescapeImpl(this));
		builtins.put("listen", new ProvaListenImpl(this));
		builtins.put("parse_nv", new ProvaParseNvImpl(this));
		builtins.put("tokenize_enum", new ProvaTokenizeEnumImpl(this));
		builtins.put("read_enum", new ProvaReadEnumImpl(this));
		builtins.put("unlisten", new ProvaUnlistenImpl(this));
		builtins.put("byte_stream", new ProvaByteStreamImpl(this));
		builtins.put("copy_stream", new ProvaCopyStreamImpl(this));
		builtins.put("parse_list", new ProvaParseListImpl(this));
		builtins.put("tokenize_list", new ProvaTokenizeListImpl(this));
		builtins.put("map_merge", new ProvaMapMergeImpl(this));
		builtins.put("free", new ProvaFreeImpl(this));
		builtins.put("bound", new ProvaBoundImpl(this));
		builtins.put("type", new ProvaTypeImpl(this));
		builtins.put("match", new ProvaMatchImpl(this));
		builtins.put("update", new ProvaUpdateImpl(this));
		builtins.put("mklist", new ProvaMkListImpl(this));
		builtins.put("length", new ProvaLengthImpl(this));
		builtins.put("reverse", new ProvaReverseImpl(this));
		builtins.put("at", new ProvaAtImpl(this));
		builtins.put("@update_cache", new ProvaUpdateCacheImpl(this));
		builtins.put("@temporal_rule_remove", new ProvaTemporalRuleRemoveImpl(this));
		builtins.put("@add_group_result", new ProvaAddGroupResultImpl(this));
		builtins.put("expr_literal", new ProvaExpressionLiteralImpl(this));
		
		// Semantic Web integration.
		try {
			ApplicationContext context = new ClassPathXmlApplicationContext("spring-semanticweb.xml");
			ProvaBuiltin sconnect = (ProvaBuiltin) context.getBean("ProvaSparqlConnectImpl", this);
			builtins.put("sparql_connect", sconnect);
			ProvaBuiltin sdisconnect = (ProvaBuiltin) context.getBean("ProvaSparqlDisconnectImpl", this);
			builtins.put("sparql_disconnect", sdisconnect);
			ProvaBuiltin sselect = (ProvaBuiltin) context.getBean("ProvaSparqlSelectImpl", this);
			builtins.put("sparql_select", sselect);
			ProvaBuiltin sask = (ProvaBuiltin) context.getBean("ProvaSparqlAskImpl", this);
			builtins.put("sparql_ask", sask);
		} catch(Throwable t) {
			if(log.isDebugEnabled())
				log.debug("Semantic Web integration error: ", t);
		}

		initRules();
		
	}
	
	private void initRules() {
		String input = "" +
				// TODO: This can given more flexibility if the server defines special control rules,
				// for example, saying that termination is only accepted from specific controllers CtlFrom
				"rcvMsg(XID,CtlProtocol,CtlFrom,eof,[ReactionXID,Protocol,From,Verb,Payload]):-" +
				"	!," +
				"	'@temporal_rule_control'(TID,CtlProtocol,CtlFrom,eof,[ReactionXID,Protocol,From,Verb,Payload]).\n" +
				"rcvMsg(XID,CtlProtocol,CtlFrom,eof,[ReactionXID,Protocol,From,Verb,Payload],CorrelationID):-" +
				"	!," +
				"	'@temporal_rule_control'(TID,CtlProtocol,CtlFrom,eof,[ReactionXID,Protocol,From,Verb,Payload,CorrelationID]).\n" +
//				"rcvMsg(XID,Protocol,From,Verb,Payload):- '@temporal_rule'(XID,TID,[XID,Protocol,From,Verb,Payload]).\n" +
//				"rcvMsg(XID,Protocol,From,Verb,Payload,CorrelationID):-'@temporal_rule'(XID,TID,[XID,Protocol,From,Verb,Payload,CorrelationID]).\n" +
				"findall(P,Q,L) :-" +
				"	L=java.util.ArrayList()," +
				"	findall2(P,Q,L).\n" +
				"findall2(P,[Q|Qs],L) :-" +
				"	derive([Q|Qs])," +
				"	L.add(P)," +
				"	fail().\n" +
				"findall2(P,Q,L).\n" +
				"for([From,From],From) :- !.\n" +
				"for([From,To],From) :-" +
				"	From<=To.\n" +
				"for([From,To],I) :-" +
				"	From2=From+1," +
				"	for([From2,To],I).\n";
		BufferedReader in = new BufferedReader(new StringReader(input));
		consultSyncInternal(null,in,"-1",null);
	}
	
	@Override
	public List<ProvaSolution[]> consultSyncInternal(ProvaReagent prova, BufferedReader in, String key, Object[] objects) {
		List<ProvaSolution[]> results = new ArrayList<ProvaSolution[]>(); 
		ProvaResultSet resultSet = new ProvaResultSetImpl();
		ProvaParserImpl parser = new ProvaParserImpl(key, objects);
		try {
			List<ProvaRule> rules = parser.parse(this, resultSet, in);
			// Run each goal
			for( ProvaRule rule : rules ) {
				if( rule.getHead()==null ) {
					ProvaResolutionInferenceEngine engine = new ProvaResolutionInferenceEngineImpl(this, rule);
					engine.setReagent(prova);
					ProvaDerivationNode node = engine.run();
					ProvaSolution[] goalResults = resultSet.getSolutions().toArray(noSolutions);
					// The second literal in the body is not fail() when it is a solve (not eval)
					if( node!=null && goalResults.length==0 && rule.getBody().length==2 && rule.getBody()[1].getPredicate().getArity()!=0 )
						this.getPrintWriter().println("no");
					results.add(goalResults);
					resultSet.getSolutions().clear();
				}
			}
			return results;
		} catch( ProvaParsingException pex ) {
			throw pex;
		} catch( RuntimeException e ) {
			throw e;
		} catch( Exception e ) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public void updateContext( String src ) {
		if( context==null )
			context = src.substring(0,src.lastIndexOf('/')+1);
	}
	
	@Override
	public List<ProvaSolution[]> consultSyncInternal(ProvaReagent prova, String src, String key, Object[] objects) {
		if( context==null ) {
			context = src.substring(0,src.lastIndexOf('/')+1);
		} else {
			src = context + src;
		}
		List<ProvaSolution[]> results = new ArrayList<ProvaSolution[]>(); 
		ProvaResultSet resultSet = new ProvaResultSetImpl();
		ProvaParserImpl parser = new ProvaParserImpl(key, objects);
		try {
			List<ProvaRule> rules = parser.parse(this, resultSet, src);
			// Run each goal
			for( ProvaRule rule : rules ) {
				if( rule.getHead()==null ) {
					ProvaResolutionInferenceEngine engine = new ProvaResolutionInferenceEngineImpl(this, rule);
					engine.setReagent(prova);
					ProvaDerivationNode node = engine.run();
					ProvaSolution[] goalResults = resultSet.getSolutions().toArray(noSolutions);
					// The second literal in the body is not fail() when it is a solve (not eval)
					if( node!=null && goalResults.length==0 && rule.getBody().length==2 && rule.getBody()[1].getPredicate().getArity()!=0 )
						this.getPrintWriter().println("no");
					results.add(goalResults);
					resultSet.getSolutions().clear();
				}
			}
			return results;
		} catch( Exception e ) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public ProvaPredicate generatePredicate( String symbol, int arity ) {
		final String key = symbol+"/"+arity;
		ProvaPredicate predicate = predicates.get(key);
		if( predicate!=null )
			return predicate;
		predicate = new ProvaPredicateImpl(symbol,arity,this);
		predicates.put(key,predicate);
		return predicate;
	}
	
	@Override
	public ProvaConstant getGlobalByName(String name) {
		return globals.get(name);
	}
	
	@Override
	public ProvaRuleSet getPredicates(String symbol) {
		return getPredicates(symbol,-1);
	}
	
	@Override
	// TODO: What happens if both variable and fixed arity predicates for the predicate symbol?
	public ProvaRuleSet getPredicates(String symbol, int arity) {
		if( arity==-1 ) {
			final String keyStar = symbol+"/-1";
			ProvaPredicate predicate = predicates.get(keyStar);
			if( predicate!=null )
				return predicate.getClauseSet();
			return new ProvaRuleSetImpl(symbol,arity);
		}
		final String key = symbol+"/"+arity;
		ProvaPredicate predicate = predicates.get(key);
		final String keyM2 = symbol+"/-2";
		ProvaPredicate predicateM2 = predicates.get(keyM2);
		if( predicate!=null ) {
			ProvaRuleSet ruleSet = predicate.getClauseSet();
			if( predicateM2!=null ) {
				ProvaRuleSet ruleSetM2 = predicateM2.getClauseSet();
				ruleSet.addAll(ruleSetM2);
			}
			return ruleSet;
		}
		if( predicateM2!=null ) {
			ProvaRuleSet ruleSetM2 = predicateM2.getClauseSet();
			return ruleSetM2;
		}
		return new ProvaRuleSetImpl(symbol,arity);
	}
	
	@Override
	public ConcurrentMap<String,ProvaPredicate> getPredicates() {
		return predicates;
	}

	@Override
	public ProvaLiteral generateLiteral(String symbol, ProvaList terms) {
		ProvaBuiltin builtin = builtins.get(symbol);
		if( builtin!=null )
			return new ProvaLiteralImpl(builtin,terms);
		return generateHeadLiteral(symbol,terms);
	}

	@Override
	public ProvaLiteral generateLiteral(String symbol,
			ProvaList terms, List<ProvaLiteral> guard) {
		if( guard==null ) {
			ProvaBuiltin builtin = builtins.get(symbol);
			if( builtin!=null )
				return new ProvaLiteralImpl(builtin,terms);
			return generateHeadLiteral(symbol,terms);
		}
		ProvaBuiltin builtin = builtins.get(symbol);
		if( builtin!=null )
			return new ProvaGuardedLiteralImpl(builtin,terms,guard);
		return generateHeadLiteral(symbol,terms,guard);
	}

	@Override
	public ProvaLiteral generateLiteral(String symbol, ProvaObject[] data,
			int offset) {
		ProvaObject[] fixed = new ProvaObject[data.length-offset];
		System.arraycopy(data, offset, fixed, 0, fixed.length);
		ProvaList terms = ProvaListImpl.create(fixed);
		return generateLiteral(symbol,terms);
	}

	/**
	 * Assume that the first element of the array is the predicate symbol
	 */
	@Override
	public ProvaLiteral generateLiteral(ProvaObject[] data) {
		String symbol = ((ProvaConstant) data[0]).getObject().toString();
		ProvaObject[] fixed = new ProvaObject[data.length-1];
		System.arraycopy(data, 1, fixed, 0, fixed.length);
		ProvaList terms = ProvaListImpl.create(fixed);
		return generateLiteral(symbol,terms);
	}

	@Override
	public /*synchronized*/ ProvaPredicate getPredicate(String symbol, int arity) {
		if( arity==-1 ) {
			String key = symbol+"/-2";
			return predicates.get(key);
		}
		String key = symbol+"/"+arity;
		ProvaPredicate predicate = predicates.get(key);
		return predicate;
	}
	
	@Override
	public /*synchronized*/ ProvaPredicate getOrGeneratePredicate(String symbol, int arity) {
		/*
		if( arity==-1 ) {
			String key = symbol+"/-2";
			ProvaPredicate predicate = predicates.get(key);
			if( predicate==null ) {
				predicate = new ProvaPredicateImpl(symbol,arity,this);
				predicates.put(key,predicate);
				key = symbol+"/-1";
				predicates.put(key,predicate);
			}
			return predicate;
		}
		*/
		String key = symbol+"/"+arity;
		ProvaPredicate predicate = predicates.get(key);
		if( predicate==null ) {
			predicate = new ProvaPredicateImpl(symbol,arity,this);
			predicates.put(key,predicate);
		}
		/*
		key = symbol+"/-1";
		ProvaPredicate predicate2 = predicates.get(key);
		if( predicate2==null ) {
			if( predicate==null )
				predicate2 = new ProvaPredicateImpl(symbol,arity,this);
			else
				predicate2 = predicate;
			predicate2.setKnowledgeBase(this);
			predicates.put(key,predicate2);
		}
		*/
		return predicate;
	}
	
	private ProvaPredicate getOrGeneratePredicate(String symbol, ProvaList terms) {
		final int arity = terms.computeSize();
		return getOrGeneratePredicate(symbol, arity);
	}

	@Override
	public ProvaLiteral generateHeadLiteral(String symbol, ProvaList terms) {
		ProvaPredicate pred = getOrGeneratePredicate(symbol,terms);
		return new ProvaLiteralImpl(pred,terms);
	}
	
	private ProvaLiteral generateHeadLiteral(String symbol, ProvaList terms, List<ProvaLiteral> guard) {
		ProvaPredicate pred = getOrGeneratePredicate(symbol,terms);
		return new ProvaGuardedLiteralImpl(pred,terms,guard);
	}
	
	/*
	@Override
	public synchronized ProvaLiteral generateHeadLiteral(String symbol, ProvaList terms) {
		final int arity = terms.computeSize();
		if( arity==-1 ) {
			String key = symbol+"/-2";
			ProvaPredicate predicate = predicates.get(key);
			if( predicate==null ) {
				predicate = new ProvaPredicateImpl(symbol,arity,this);
				predicates.put(key,predicate);
				key = symbol+"/-1";
				predicates.put(key,predicate);
			}
			return new ProvaLiteralImpl(predicate,terms);
		}
		String key = symbol+"/"+arity;
		ProvaPredicate predicate = predicates.get(key);
		if( predicate==null ) {
			predicate = new ProvaPredicateImpl(symbol,arity,this);
			predicates.put(key,predicate);
		}
		key = symbol+"/-1";
		ProvaPredicate predicate2 = predicates.get(key);
		if( predicate2==null ) {
			if( predicate==null )
				predicate2 = new ProvaPredicateImpl(symbol,arity,this);
			else
				predicate2 = predicate;
			predicate2.setKnowledgeBase(this);
			predicates.put(key,predicate2);
			if( predicate!=null )
				return new ProvaLiteralImpl(predicate,terms);
		}
		return new ProvaLiteralImpl(predicate,terms);
	}
	*/

	@Override
	public ProvaRule generateRule(ProvaLiteral head, ProvaLiteral[] body) {
		if( head!=null && head.getPredicate() instanceof ProvaBuiltin ) {
			// No builtins are allowed in the clause head, so we correct that on the fly
			head = generateHeadLiteral(head.getPredicate().getSymbol(),head.getTerms());
		}
		long ruleId = seqRuleId.incrementAndGet();
		return new ProvaRuleImpl(ruleId,head,body);
	}

	@Override
	/**
	 * Called from ProvaMessengerImpl.
	 * Generate a temporal rule like @temporal_rule or @temporal_rule_control.
	 * These rules have ruleId that is negative.
	 */
	public ProvaRule generateRule(long ruleId, ProvaLiteral head,
			ProvaLiteral[] body) {
		if( head!=null && head.getPredicate() instanceof ProvaBuiltin ) {
			// No builtins are allowed in the clause head, so we correct that on the fly
			head = generateHeadLiteral(head.getPredicate().getSymbol(),head.getTerms());
		}
		return new ProvaRuleImpl(-ruleId,head,body);
	}

	/**
	 * Add a rule to the async thread. So far limit this to the case when we are in this thread already.
	 * @param partition
	 * @param head
	 * @param body
	 * @return
	 */
	// IN PROGRESS
//	@Override
//	public ProvaRule generateLocalRule(ProvaReagent prova, long partition, ProvaLiteral head, ProvaLiteral[] body) {
//		if( head!=null && head.getPredicate() instanceof ProvaBuiltin ) {
//			// No builtins are allowed in the clause head, so we correct that on the fly
//			head = generateHeadLiteral(head.getPredicate().getSymbol(),head.getTerms());
//		}
//		if( prova.isInPartitionThread(partition) ) {
//			// We are in the same partition
//			log.error("***** we are in the same partition");
//		}
//		long ruleId = seqRuleId.incrementAndGet();
//		return new ProvaRuleImpl(ruleId,head,body);
//	}

	/**
	 * Add the rule in front of others in the collection.
	 */
	@Override
	public ProvaRule generateRuleA(ProvaLiteral head, ProvaLiteral[] body) {
		if( head!=null && head.getPredicate() instanceof ProvaBuiltin ) {
			// No builtins are allowed in the clause head, so we correct that on the fly
			head = generateHeadLiteral(head.getPredicate().getSymbol(),head.getTerms());
		}
		long ruleId = seqRuleId.incrementAndGet();
		return new ProvaRuleImpl(ruleId,head,body,true);
	}

	@Override
	public ProvaRule generateGoal(ProvaLiteral[] body) {
		if( body.length==0 )
			return null;
		return generateRule(null, body);
	}

	@Override
	public ProvaRule generateGoal(ProvaLiteral[] body,
			List<ProvaVariable> variables) {
		if( body.length==0 )
			return null;
		long ruleId = 0;
		return new ProvaRuleImpl(ruleId,null,body,variables);
	}

	@Override
	public ProvaRule generateSolveGoal(ProvaResultSet resultSet, ProvaLiteral[] body) {
		if( body.length==0 )
			return null;
		// A rule with no head is a goal
		ProvaRule solveRule = new ProvaRuleImpl(body);
//		ProvaRule solveRule = generateRule(null, body);
		Vector<ProvaObject> objs = new Vector<ProvaObject>();
		ProvaConstant cResultSet = ProvaConstantImpl.create(resultSet);
		objs.add(cResultSet);
		for( ProvaVariable var : solveRule.getVariables() ) {
			ProvaConstant c = ProvaConstantImpl.create(var.getName());
			ProvaList l = ProvaListImpl.create( new ProvaObject[] {c,var});
			objs.add(l);
		}
		ProvaList ls = ProvaListImpl.create( objs.toArray(new ProvaObject[0]) );
		ProvaLiteral solveBuiltin = generateLiteral("solve",ls);
		solveRule.addBodyLiteral(solveBuiltin);
		return solveRule;
	}

	@Override
	public ProvaLiteral generateLiteral(String symbol) {
		return generateLiteral(symbol,null);
	}

	@Override
	public ProvaRule generateRule(ProvaLiteral head, ProvaLiteral[] newGoals,
			ProvaLiteral[] body, int offset) {
		ProvaLiteral[] combinedBody = new ProvaLiteral[newGoals.length+body.length-1-offset];
		int i=0;
		for( ; i<newGoals.length; i++ )
			combinedBody[i] = newGoals[i];
		for( int j=1+offset; j<body.length; j++,i++ )
			combinedBody[i] = body[j];
		// ruleId will be 0 and all variables are already variable pointers
		//    so no variables' collection will be required
		return new ProvaRuleImpl(0,head,combinedBody);
//		return generateRule(head,combinedBody);
	}

	@Override
	public ProvaRule generateGoal(ProvaUnification unification, ProvaDerivationNode node, ProvaLiteral[] newGoals,
			ProvaLiteral[] body, int offset, List<ProvaVariable> variables) {
		int bodyLength = body==null ? 0 : body.length;
		int newGoalsLength = newGoals==null ? 0 : newGoals.length;
		if( newGoalsLength!=0 && newGoals[newGoals.length-1].getPredicate() instanceof ProvaFailImpl ) {
			// fail() predicate in the target body cuts the goal trail
			ProvaLiteral[] combinedBody = new ProvaLiteral[newGoalsLength];
			List<Boolean> isConstant = new ArrayList<Boolean>(1);
			isConstant.add(true);
			int i=0;
			for( ; i<newGoalsLength; i++ ) {
				if( "cut".equals(newGoals[i].getPredicate().getSymbol()) ) {
					ProvaVariablePtr any = (ProvaVariablePtr) newGoals[i].getTerms().getFixed()[0];
					variables.get(any.getIndex()).setAssigned(ProvaConstantImpl.create(node));
				}
				isConstant.set(0,true);
				combinedBody[i] = (ProvaLiteral) newGoals[i].cloneWithBoundVariables(unification, variables, isConstant);
				if( isConstant.get(0) )
					combinedBody[i].setGround(true);
			}
			return new ProvaRuleImpl(0, null, combinedBody, variables);
		}

		final int length = newGoalsLength+bodyLength-1-offset;
		ProvaLiteral[] combinedBody = new ProvaLiteral[length];
		List<Boolean> isConstant = new ArrayList<Boolean>(1);
		isConstant.add(true);
		int i=0;
		for( ; i<newGoalsLength; i++ ) {
			if( "cut".equals(newGoals[i].getPredicate().getSymbol()) ) {
				ProvaVariablePtr any = (ProvaVariablePtr) newGoals[i].getTerms().getFixed()[0];
				variables.get(any.getIndex()).setAssigned(ProvaConstantImpl.create(node));
			}
			isConstant.set(0,true);
			combinedBody[i] = (ProvaLiteral) newGoals[i].cloneWithBoundVariables(unification, variables, isConstant);
			if( isConstant.get(0) )
				combinedBody[i].setGround(true);
		}
		for( int j=1+offset; j<body.length; j++,i++ )
			combinedBody[i] = body[j];
		return new ProvaRuleImpl(0, null, combinedBody, variables);
	}

	@Override
	public ProvaLiteral generateCachedLiteral(String symbol, ProvaList terms,
			ProvaCacheState cacheState, ProvaLocalAnswers answers) {
		ProvaBuiltin builtin = builtins.get(symbol);
		if( builtin!=null )
			return new ProvaLiteralImpl(builtin,terms);
		final int arity = terms.computeSize();
		if( arity==-1 ) {
			String key = symbol+"/-2";
			ProvaPredicate predicate = predicates.get(key);
			if( predicate==null ) {
				predicate = new ProvaPredicateImpl(symbol,arity,this);
				predicates.put(key,predicate);
				key = symbol+"/-1";
				predicates.put(key,predicate);
			}
			return new ProvaCachedLiteralImpl(predicate,terms,cacheState,answers);
		}
		String key = symbol+"/"+arity;
		ProvaPredicate predicate = predicates.get(key);
		if( predicate==null ) {
			predicate = new ProvaPredicateImpl(symbol,arity,this);
			predicates.put(key,predicate);
		}
		key = symbol+"/-1";
		ProvaPredicate predicate2 = predicates.get(key);
		if( predicate2==null ) {
			if( predicate==null )
				predicate2 = new ProvaPredicateImpl(symbol,arity,this);
			else
				predicate2 = predicate;
			predicate2.setKnowledgeBase(this);
			predicates.put(key,predicate2);
			if( predicate!=null )
				return new ProvaCachedLiteralImpl(predicate,terms,cacheState,answers);
		}
		return new ProvaCachedLiteralImpl(predicate,terms,cacheState,answers);
	}

	@Override
	public void setPrintWriter(PrintWriter printWriter) {
		this.printWriter = printWriter;
	}

	@Override
	public PrintWriter getPrintWriter() {
		return this.printWriter;
	}

	@Override
	public ProvaConstant generateGlobalConstant(String name) {
		if( !name.startsWith("$") ) {
			return ProvaConstantImpl.create(name);
		}
		ProvaConstant oldGlobal = globals.get(name);
		if( oldGlobal!=null )
			return oldGlobal;
		final ProvaConstant global = ProvaGlobalConstantImpl.create(name);
		globals.put(name, global);
		return global;
	}

	@Override
	public void setGlobalConstant(String name, Object value) {
		ProvaGlobalConstantImpl oldGlobal = (ProvaGlobalConstantImpl) globals.get(name);
		if( oldGlobal!=null ) {
			oldGlobal.setObject(value);
			return;
		}
		final ProvaConstant global = ProvaGlobalConstantImpl.create(name);
		global.setObject(value);
		globals.put(name, global);
	}

	@Override
	public void setGlobals(Map<String,Object> globals) {
		if( globals==null )
			return;
		for( Map.Entry<String,Object> g : globals.entrySet() ) {
			this.globals.put(g.getKey(), ProvaConstantImpl.create(g.getValue())); 
		}
	}

	@Override
	public void addCachePredicate(String symbol) {
		cachePredicateSymbols.add(symbol);
	}

	@Override
	public boolean isCachePredicate(String symbol) {
		return cachePredicateSymbols.contains(symbol);
	}

	@Override
	public /*synchronized*/ void addClauseSetToSrc(ProvaRuleSet ruleSet, String src) {
		List<ProvaRuleSet> rulesets = srcMap.get(src);
		if( rulesets==null ) {
			rulesets = new ArrayList<ProvaRuleSet>();
			srcMap.put(src,rulesets);
		}
		rulesets.add(ruleSet);
	}

	@Override
	public /*synchronized*/ void unconsultSync(String src) {
		List<ProvaRuleSet> rulesets = srcMap.get(src);
		if( rulesets==null )
			return;

		for( ProvaRuleSet ruleset : rulesets )
			ruleset.removeClausesBySrc(src);
		srcMap.remove(src);
	}

}
