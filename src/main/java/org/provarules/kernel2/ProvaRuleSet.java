package org.provarules.kernel2;

import org.provarules.reference2.ProvaRuleImpl;

import java.util.List;

public interface ProvaRuleSet {

    void add(ProvaRule clause);

    void addA(ProvaRule clause);

    Object size();

    String getSymbol();

    int getArity();

    void addAll(ProvaRuleSet ruleSet);

    List<ProvaRule> getClauses();

    List<ProvaRule> getClauses(Object key, ProvaObject[] source);

    void removeClauses(Object key);

    boolean removeClausesByMatch(ProvaKnowledgeBase kb, ProvaObject[] data);

    boolean removeAllClausesByMatch(ProvaKnowledgeBase kb,
                                           ProvaObject[] data);

    void addRuleToSrc(ProvaRuleImpl rule, String src);

    void removeClausesBySrc(String src);

    ProvaUnification nextMatch(ProvaKnowledgeBase kb, ProvaGoal goal);

    void removeTemporalClause(long key);

}
