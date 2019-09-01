package org.provarules.kernel2;

public interface ProvaPredicate {

    String getSymbol();

    int getArity();

    void addClause(ProvaRule clause);

    void addClauseA(ProvaRule clause);

    boolean equals(ProvaPredicate predicate);

    void setKnowledgeBase(ProvaKnowledgeBase provaKnowledgeBaseImpl);

    ProvaRuleSet getClauseSet();

    ProvaKnowledgeBase getKnowledgeBase();

}
