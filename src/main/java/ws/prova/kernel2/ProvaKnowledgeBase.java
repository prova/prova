package ws.prova.kernel2;

import java.io.BufferedReader;

import java.io.PrintWriter;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;

import com.hp.hpl.jena.ontology.OntModel;

import ws.prova.agent2.ProvaReagent;
import ws.prova.exchange.ProvaSolution;
import ws.prova.kernel2.cache.ProvaCacheState;


public interface ProvaKnowledgeBase {

	public ProvaPredicate generatePredicate(String symbol, int arity);

	public ProvaRuleSet getPredicates(String symbol);

	public ProvaRuleSet getPredicates(String symbol, int arity);

	public ConcurrentMap<String, ProvaPredicate> getPredicates();
	
	public ProvaConstant generateTypedConstant(Object o);
	
	public ProvaVariable generateVariable(String name);
	
	public ProvaVariable generateJavaTypeVariable(String name, Class<?> javaType);
		
	public ProvaLiteral generateLiteral(String symbol, ProvaList terms);

	public ProvaRule generateRule(ProvaLiteral head, ProvaLiteral[] body);

	public ProvaRule generateGoal(ProvaLiteral[] body);

	public ProvaLiteral generateLiteral(String symbol);

	public ProvaRule generateRule(ProvaLiteral head, ProvaLiteral[] newGoals,
			ProvaLiteral[] body, int offset);

	public ProvaRule generateRuleA(ProvaLiteral lit, ProvaLiteral[] provaLiterals);

	public ProvaRule generateSolveGoal(ProvaResultSet resultSet, ProvaLiteral[] body);

	public ProvaLiteral generateCachedLiteral(String symbol, ProvaList terms,
			ProvaCacheState cacheState,
			ws.prova.kernel2.cache.ProvaLocalAnswers answers);

	public void setPrintWriter(PrintWriter printWriter);

	public PrintWriter getPrintWriter();

	public ProvaConstant getGlobalByName(String name);

	public ProvaConstant generateGlobalConstant(String name);

	public void setGlobalConstant(String name, Object value);

	public void setGlobals(Map<String, Object> globals);

	public List<ProvaSolution[]> consultSyncInternal(ProvaReagent prova, String src, String key,
			Object[] objects);

	public List<ProvaSolution[]> consultSyncInternal(ProvaReagent prova,
			BufferedReader in, String key, Object[] objects);

	public ProvaLiteral generateHeadLiteral(String symbol, ProvaList terms);

	public ProvaLiteral generateLiteral(String symbol, ProvaObject[] data, int offset);

	public ProvaLiteral generateLiteral(ProvaObject[] data);

	public void addCachePredicate(String symbol);

	public boolean isCachePredicate(String symbol);

	public ProvaLiteral generateLiteral(String symbol,
			ProvaList terms, List<ProvaLiteral> guard);

	public ProvaPredicate getOrGeneratePredicate(String symbol, int arity);

	public ProvaPredicate getPredicate(String symbol, int arity);

	public void addClauseSetToSrc(ProvaRuleSet ruleSet, String src);

	public void unconsultSync(String src);

	public ProvaRule generateGoal(ProvaLiteral[] body,
			List<ProvaVariable> variables);

	public ProvaRule generateRule(long ruleId, ProvaLiteral head,
			ProvaLiteral[] body);

	public ProvaRule generateGoal(ProvaUnification unification, ProvaDerivationNode node, ProvaLiteral[] newGoals,
			ProvaLiteral[] body, int offset, List<ProvaVariable> variables);

	public void updateContext(String filename);

	public void setOntologyModel(OntModel m);
	
	public OntModel getOntologyModel();


//	public ProvaRule generateLocalRule(ProvaReagent prova, long partitionKey,
//			ProvaLiteral head, ProvaLiteral[] array);

}
