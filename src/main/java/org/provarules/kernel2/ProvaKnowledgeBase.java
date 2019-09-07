package org.provarules.kernel2;

import org.provarules.agent2.ProvaReagent;
import org.provarules.exchange.ProvaSolution;
import org.provarules.kernel2.cache.ProvaCacheState;
import org.provarules.kernel2.cache.ProvaLocalAnswers;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;

public interface ProvaKnowledgeBase {

    ProvaPredicate generatePredicate(String symbol, int arity);

    ProvaRuleSet getPredicates(String symbol);

    ProvaRuleSet getPredicates(String symbol, int arity);

    ConcurrentMap<String, ProvaPredicate> getPredicates();

    ProvaLiteral generateLiteral(String symbol, ProvaList terms);

    ProvaRule generateRule(ProvaLiteral head, ProvaLiteral[] body);

    ProvaRule generateGoal(ProvaLiteral[] body);

    ProvaLiteral generateLiteral(String symbol);

    ProvaRule generateRule(ProvaLiteral head, ProvaLiteral[] newGoals,
                                  ProvaLiteral[] body, int offset);

    ProvaRule generateRuleA(ProvaLiteral lit, ProvaLiteral[] provaLiterals);

    ProvaRule generateSolveGoal(ProvaResultSet resultSet, ProvaLiteral[] body);

    ProvaLiteral generateCachedLiteral(String symbol, ProvaList terms,
                                              ProvaCacheState cacheState,
                                              ProvaLocalAnswers answers);

    void setPrintWriter(PrintWriter printWriter);

    PrintWriter getPrintWriter();

    ProvaConstant getGlobalByName(String name);

    ProvaConstant generateGlobalConstant(String name);

    void setGlobalConstant(String name, Object value);

    void setGlobals(Map<String, Object> globals);

    List<ProvaSolution[]> consultSyncInternal(ProvaReagent prova, String src, String key,
                                                     Object[] objects);

    List<ProvaSolution[]> consultSyncInternal(ProvaReagent prova,
                                                     BufferedReader in, String key, Object[] objects);

    ProvaLiteral generateHeadLiteral(String symbol, ProvaList terms);

    ProvaLiteral generateLiteral(String symbol, ProvaObject[] data, int offset);

    ProvaLiteral generateLiteral(ProvaObject[] data);

    void addCachePredicate(String symbol);

    boolean isCachePredicate(String symbol);

    ProvaLiteral generateLiteral(String symbol,
                                        ProvaList terms, List<ProvaLiteral> guard);

    ProvaPredicate getOrGeneratePredicate(String symbol, int arity);

    ProvaPredicate getPredicate(String symbol, int arity);

    void addClauseSetToSrc(ProvaRuleSet ruleSet, String src);

    void unconsultSync(String src);

    ProvaRule generateGoal(ProvaLiteral[] body,
                                  List<ProvaVariable> variables);

    ProvaRule generateRule(long ruleId, ProvaLiteral head,
                                  ProvaLiteral[] body);

    ProvaRule generateGoal(ProvaUnification unification, ProvaDerivationNode node, ProvaLiteral[] newGoals,
                                  ProvaLiteral[] body, int offset, List<ProvaVariable> variables);

    void updateContext(String filename);

    void shutdown();

//	ProvaRule generateLocalRule(ProvaReagent prova, long partitionKey,
//			ProvaLiteral head, ProvaLiteral[] array);

}
