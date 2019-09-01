package org.provarules.reference2;

import org.provarules.kernel2.ProvaKnowledgeBase;
import org.provarules.kernel2.ProvaPredicate;
import org.provarules.kernel2.ProvaRule;
import org.provarules.kernel2.ProvaRuleSet;

public class ProvaPredicateImpl implements ProvaPredicate {

    private String symbol;

    private final int arity;

    private final ProvaRuleSet clauseSet;

    private ProvaKnowledgeBase knowledgeBase;

    public ProvaPredicateImpl(String symbol, int arity, ProvaKnowledgeBase kb) {
        this.symbol = symbol;
        this.arity = arity;
        this.clauseSet = new ProvaRuleSetImpl(symbol, arity);
        this.knowledgeBase = kb;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String getSymbol() {
        return symbol;
    }

    @Override
    public int getArity() {
        return arity;
    }

    @Override
    public void addClause(ProvaRule clause) {
        clauseSet.add(clause);
    }

    @Override
    public void addClauseA(ProvaRule clause) {
        clauseSet.addA(clause);
    }

    @Override
    public ProvaRuleSet getClauseSet() {
        return clauseSet;
    }

    @Override
    public boolean equals(ProvaPredicate predicate) {
        return predicate.getSymbol().equals(symbol) &&
                (predicate.getArity() == arity || predicate.getArity() == -1 || arity == -1);
    }

    public void setKnowledgeBase(ProvaKnowledgeBase knowledgeBase) {
        this.knowledgeBase = knowledgeBase;
    }

    @Override
    public ProvaKnowledgeBase getKnowledgeBase() {
        return knowledgeBase;
    }

}
