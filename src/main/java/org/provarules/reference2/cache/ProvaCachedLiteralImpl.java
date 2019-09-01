package org.provarules.reference2.cache;

import org.provarules.kernel2.*;
import org.provarules.kernel2.cache.ProvaCacheState;
import org.provarules.kernel2.cache.ProvaCachedLiteral;
import org.provarules.kernel2.cache.ProvaLocalAnswers;
import org.provarules.reference2.ProvaListImpl;
import org.provarules.reference2.ProvaLiteralImpl;
import org.provarules.reference2.ProvaVariableImpl;

import java.util.List;

public class ProvaCachedLiteralImpl extends ProvaLiteralImpl implements ProvaCachedLiteral {

    private static final long serialVersionUID = -4320866097994244461L;

    private ProvaGoal goal;

    private ProvaCacheState cacheState;

    private ProvaLocalAnswers answers;

    public ProvaCachedLiteralImpl(ProvaPredicate predicate, ProvaList terms,
                                  ProvaCacheState cacheState, ProvaLocalAnswers answers) {
        super(predicate, terms);
        this.cacheState = cacheState;
        this.answers = answers;
    }

    @Override
    public ProvaLiteral rebuildSource(ProvaUnification unification) {
        if (ground || terms == null)
            return this;
        ProvaList newTerms = terms.rebuildSource(unification);
        ProvaCachedLiteralImpl cachedLit = new ProvaCachedLiteralImpl(predicate, newTerms, cacheState, answers);
        cachedLit.setGoal(goal);
        return cachedLit;
    }

    public String toString() {
        return predicate.getSymbol() + '(' +
                terms +
                ')';
    }

    @Override
    public ProvaObject cloneWithVariables(List<ProvaVariable> variables) {
        if (terms == null)
            return this;
        if (predicate.getSymbol().equals("cut")) {
            ProvaVariable any1 = ProvaVariableImpl.create();
            ProvaList lany1 = ProvaListImpl.create(new ProvaObject[]{any1});
            return new ProvaLiteralImpl(predicate, lany1);
        }
        ProvaList newTerms = (ProvaList) terms.cloneWithVariables(variables);
        ProvaCachedLiteralImpl newLit = new ProvaCachedLiteralImpl(predicate, newTerms, cacheState, answers);
        newLit.ground = ground;
        newLit.line = line;
        newLit.sourceCode = sourceCode;
        newLit.metadata = metadata;
        newLit.goal = goal;
        return newLit;
    }

    @Override
    public void setGoal(ProvaGoal goal) {
        this.goal = goal;
        if (cacheState != null) {
            cacheState.addGoal(goal);
        }
    }

    @Override
    public ProvaGoal getGoal() {
        return this.goal;
    }

    @Override
    public ProvaCacheState getCacheState() {
        return cacheState;
    }

    @Override
    public ProvaLocalAnswers getAnswers() {
        return answers;
    }

    @Override
    public void markCompletion() {
        cacheState.markCompletion();
    }

}
