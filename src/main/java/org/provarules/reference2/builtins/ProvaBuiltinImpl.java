package org.provarules.reference2.builtins;

import org.provarules.agent2.ProvaReagent;
import org.provarules.kernel2.*;
import org.provarules.reference2.ProvaRuleSetImpl;

import java.util.List;

public abstract class ProvaBuiltinImpl implements ProvaBuiltin {

    protected ProvaKnowledgeBase kb;

    private ProvaRuleSetImpl clauseSet;

    private String symbol;

    public ProvaBuiltinImpl(ProvaKnowledgeBase kb, String symbol) {
        this.kb = kb;
        this.symbol = symbol;
        this.clauseSet = new ProvaRuleSetImpl(symbol);
    }

    @Override
    abstract public boolean process(ProvaReagent prova, ProvaDerivationNode node, ProvaGoal goal, List<ProvaLiteral> newLiterals, ProvaRule query);

    @Override
    public boolean process_(ProvaReagent prova, ProvaDerivationNode node, ProvaGoal goal, List<ProvaLiteral> newLiterals, ProvaRule query) {
        try {
            return process(prova, node, goal, newLiterals, query);
        } catch (Throwable t) {
            if (t instanceof RuntimeException)
                throw (RuntimeException) t;
            return false;
        }
    }

    @Override
    public void addClause(ProvaRule clause) {
    }

    @Override
    public void addClauseA(ProvaRule clause) {
    }

    @Override
    public boolean equals(ProvaPredicate predicate) {
        return predicate == this;
    }

    @Override
    public int getArity() {
        throw new UnsupportedOperationException("Method is not used for built-ins");
    }

    @Override
    public ProvaRuleSet getClauseSet() {
        return clauseSet;
    }

    @Override
    public ProvaKnowledgeBase getKnowledgeBase() {
        return kb;
    }

    @Override
    public String getSymbol() {
        return symbol;
    }

    @Override
    public void setKnowledgeBase(ProvaKnowledgeBase kb) {
        this.kb = kb;
    }

}
