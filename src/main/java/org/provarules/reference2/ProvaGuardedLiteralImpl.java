package org.provarules.reference2;

import org.provarules.kernel2.*;

import java.util.ArrayList;
import java.util.List;

public class ProvaGuardedLiteralImpl extends ProvaLiteralImpl implements
        ProvaLiteral {

    private static final long serialVersionUID = -3967549869751321929L;

    private List<ProvaLiteral> guard;

    public ProvaGuardedLiteralImpl(ProvaPredicate pred, ProvaList terms,
                                   List<ProvaLiteral> guard) {
        super(pred, terms);
        this.guard = guard;
    }

    @Override
    public List<ProvaLiteral> getGuard() {
        return guard;
    }

    @Override
    public int collectVariables(long ruleId, List<ProvaVariable> variables) {
        if (ground || terms == null)
            return -1;
        ground &= terms.collectVariables(ruleId, variables) < 0;
        for (ProvaLiteral g : guard) {
            ground &= g.collectVariables(ruleId, variables) < 0;
        }
        return ground ? -1 : 0;
    }

    @Override
    public void substituteVariables(ProvaVariablePtr[] varsMap) {
        super.substituteVariables(varsMap);
        for (ProvaLiteral g : guard) {
            g.substituteVariables(varsMap);
        }
    }

    @Override
    public ProvaLiteral cloneWithBoundVariables(final ProvaUnification unification,
                                                final List<ProvaVariable> variables, final List<Boolean> isConstant) {
        ProvaGuardedLiteralImpl ret = (ProvaGuardedLiteralImpl) cloneWithBoundVariables(variables, isConstant);
        List<ProvaLiteral> newGuard = new ArrayList<>(guard.size());
        for (ProvaLiteral g : guard)
            newGuard.add(g.cloneWithBoundVariables(unification, variables, isConstant));
        ret.guard = newGuard;
        if (ret.getMetadata() != null)
            copyMetadata(unification, ret);
        return ret;
    }

    @Override
    public ProvaObject cloneWithBoundVariables(final List<ProvaVariable> variables, final List<Boolean> isConstant) {
        if (terms == null)
            return this;
        ProvaList newTerms = (ProvaList) terms.cloneWithBoundVariables(variables, isConstant);
        ProvaGuardedLiteralImpl newLit = new ProvaGuardedLiteralImpl(predicate, newTerms, null);
        // TODO: the new literal may actually become ground
        newLit.ground = ground;
        newLit.line = line;
        newLit.sourceCode = sourceCode;
        newLit.metadata = metadata;
        return newLit;
    }

    @Override
    public ProvaLiteral rebuild(final ProvaUnification unification) {
        if (ground || terms == null)
            return this;
        final ProvaList newTerms = terms.rebuild(unification);
        final List<ProvaLiteral> newGuard = new ArrayList<>(guard.size());
        for (ProvaLiteral g : guard)
            newGuard.add(g.rebuild(unification));
        final ProvaGuardedLiteralImpl ret = new ProvaGuardedLiteralImpl(predicate, newTerms, newGuard);
        ret.sourceCode = this.sourceCode;
        ret.line = this.line;
        if (this.metadata != null)
            copyMetadata(unification, ret);
        return ret;
    }

    @Override
    public ProvaLiteral rebuildSource(final ProvaUnification unification) {
        if (ground)
            return this;
        List<ProvaLiteral> newGuard = new ArrayList<>(guard.size());
        for (ProvaLiteral g : guard)
            newGuard.add(g.rebuildSource(unification));
        ProvaList newTerms = terms;
        if (terms != null)
            newTerms = terms.rebuildSource(unification);
        return new ProvaGuardedLiteralImpl(predicate, newTerms, newGuard);
    }

    @Override
    public ProvaObject cloneWithVariables(final List<ProvaVariable> variables) {
        if (predicate.getSymbol().equals("cut")) {
            ProvaVariable any1 = ProvaVariableImpl.create();
            ProvaList lany1 = ProvaListImpl.create(new ProvaObject[]{any1});
            return new ProvaLiteralImpl(predicate, lany1);
        }
        ProvaList newTerms = terms;
        if (terms != null)
            newTerms = (ProvaList) terms.cloneWithVariables(variables);
        List<ProvaLiteral> newGuard = new ArrayList<>(guard.size());
        for (ProvaLiteral g : guard)
            newGuard.add((ProvaLiteral) g.cloneWithVariables(variables));
        ProvaGuardedLiteralImpl newLit = new ProvaGuardedLiteralImpl(predicate, newTerms, newGuard);
        newLit.ground = ground;
        newLit.line = line;
        newLit.sourceCode = sourceCode;
        newLit.metadata = metadata;
        return newLit;
    }

    @Override
    public ProvaObject cloneWithVariables(final long ruleId, final List<ProvaVariable> variables) {
        if (predicate.getSymbol().equals("cut")) {
            ProvaVariable any1 = ProvaVariableImpl.create();
            ProvaList lany1 = ProvaListImpl.create(new ProvaObject[]{any1});
            return new ProvaLiteralImpl(predicate, lany1);
        }
        ProvaList newTerms = terms;
        if (terms != null)
            newTerms = (ProvaList) terms.cloneWithVariables(ruleId, variables);
        final List<ProvaLiteral> newGuard = new ArrayList<>(guard.size());
        for (ProvaLiteral g : guard)
            newGuard.add((ProvaLiteral) g.cloneWithVariables(ruleId, variables));
        ProvaGuardedLiteralImpl newLit = new ProvaGuardedLiteralImpl(predicate, newTerms, newGuard);
        newLit.ground = ground;
        newLit.line = line;
        newLit.sourceCode = sourceCode;
        newLit.metadata = metadata;
        return newLit;
    }

    public String toString() {
        String sb = predicate.getSymbol() + '(' +
                terms +
                ") [" +
                guard +
                ']';
        return sb;
    }

}
