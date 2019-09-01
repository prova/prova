package org.provarules.reference2;

import org.provarules.kernel2.*;
import org.provarules.kernel2.cache.ProvaCacheState;
import org.provarules.kernel2.cache.ProvaLocalAnswers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class ProvaLiteralImpl implements ProvaLiteral {

    private static final long serialVersionUID = 9180554897688659494L;

    protected final ProvaPredicate predicate;

    protected ProvaList terms;

    protected boolean ground = false;

    protected String sourceCode;

    protected Map<String, List<Object>> metadata;

    protected int line;

    public static ThreadLocal<Map<Object, ProvaObject>> tlVars = new ThreadLocal<>();

    public ProvaLiteralImpl(ProvaPredicate predicate, ProvaList terms) {
        this.predicate = predicate;
        this.terms = terms;
    }

    public ProvaLiteralImpl(ProvaPredicate predicate, ProvaList terms,
                            Map<String, List<Object>> metadata) {
        this.predicate = predicate;
        this.terms = terms;
        this.metadata = metadata;
    }

    @Override
    public ProvaPredicate getPredicate() {
        return predicate;
    }

    @Override
    public ProvaList getTerms() {
        return terms;
    }

    @Override
    public void setTerms(ProvaList terms) {
        this.terms = terms;
    }

    @Override
    public int collectVariables(long ruleId, List<ProvaVariable> variables) {
        if (ground || terms == null)
            return -1;
        int rc = terms.collectVariables(ruleId, variables);
        if (rc < 0)
            ground = true;
        return rc;
    }

    @Override
    public ProvaObject getRecursivelyAssigned() {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * Should not be called
     */
    @Override
    public int computeSize() {
        return 0;
    }

//	/**
//	 * Offset does not apply here
//	 */
//	@Override
//	public void collectVariables(long ruleId, Vector<ProvaVariable> variables, int offset) {
//		terms.collectVariables(ruleId, variables);
//	}

    @Override
    public void substituteVariables(ProvaVariablePtr[] varsMap) {
        if (ground)
            return;
        if (terms != null)
            terms.substituteVariables(varsMap);
    }

    @Override
    public boolean unify(ProvaObject target, ProvaUnification unification) {
        ProvaLiteral targetLiteral = (ProvaLiteral) target;
        return terms.unify(targetLiteral.getTerms(), unification);
    }

    @Override
    public ProvaLiteral rebuild(final ProvaUnification unification) {
        if (ground || terms == null)
            return this;
        ProvaList newTerms = terms.rebuild(unification);
        final ProvaLiteralImpl ret = new ProvaLiteralImpl(predicate, newTerms);
        ret.sourceCode = this.sourceCode;
        ret.line = this.line;
        if (this.metadata != null)
            copyMetadata(unification, ret);
        return ret;
    }

    void copyMetadata(ProvaUnification unification,
                      final ProvaLiteralImpl ret) {
        // Make variable substitutions in the metadata if it contains variables
        ret.metadata = new HashMap<>(this.metadata);
        for (Entry<String, List<Object>> e : metadata.entrySet()) {
            for (int i = 0; i < e.getValue().size(); i++) {
                Object o = e.getValue().get(i);
                if (o instanceof ProvaVariable) {
                    Object oo = ((ProvaVariable) o).getAssigned();
                    if (!(oo instanceof ProvaVariable))
                        oo = o;
                    for (int j = 0; j < unification.getTarget().getVariables().size(); j++) {
                        ProvaVariable var = unification.getTarget().getVariables().get(j);
                        if (var == oo) {
                            Map<Object, ProvaObject> vars = tlVars.get();
                            if (vars == null) {
                                vars = new HashMap<>();
                                tlVars.set(vars);
                            }
                            // Note that this entry must be cleared immediately after the metadata value is used.
                            // So far only ProvaAndGroupImpl does that.
                            vars.put(((ProvaVariable) o).getName(), unification.getTargetVariables().get(j).getAssigned());
                        }
                    }
                }
            }
        }
    }

    @Override
    public ProvaLiteral rebuildSource(ProvaUnification unification) {
        if (ground || terms == null)
            return this;
        ProvaList newTerms = terms.rebuildSource(unification);
        return new ProvaLiteralImpl(predicate, newTerms, metadata);
    }

    public String toString() {
        return predicate.getSymbol() + '(' +
                terms +
                ')';
    }

    @Override
    public void addClause(ProvaRule clause) {
//		ProvaKnowledgeBase kb = predicate.getKnowledgeBase();
        predicate.addClause(clause);
//		kb.getPredicates(predicate.getSymbol(), predicate.getArity()).add(clause);
//		kb.getPredicates(predicate.getSymbol(), -1).add(clause);
    }

    @Override
    public void addClauseA(ProvaRule clause) {
//		ProvaKnowledgeBase kb = predicate.getKnowledgeBase();
        predicate.addClauseA(clause);
//		kb.getPredicates(predicate.getSymbol(), predicate.getArity()).add(clause);
//		kb.getPredicates(predicate.getSymbol(), -1).add(clause);
    }

    @Override
    public boolean isGround() {
        return ground;
    }

    @Override
    public void setGoal(ProvaGoal goal) {
    }

    @Override
    public ProvaCacheState getCacheState() {
        // Should not be called
        return null;
    }

    @Override
    public ProvaLocalAnswers getAnswers() {
        // Should not be called
        return null;
    }

    @Override
    public void markCompletion() {
    }

    @Override
    public ProvaGoal getGoal() {
        // Should not be called
        return null;
    }

    @Override
    public String toString(List<ProvaVariable> variables) {
        return toString();
    }

    @Override
    public ProvaLiteral cloneWithBoundVariables(final ProvaUnification unification,
                                                final List<ProvaVariable> variables, final List<Boolean> isConstant) {
        final ProvaLiteralImpl ret = (ProvaLiteralImpl) cloneWithBoundVariables(variables, isConstant);
        if (ret.getMetadata() != null)
            copyMetadata(unification, ret);
        return ret;
    }

    @Override
    public ProvaObject cloneWithBoundVariables(final List<ProvaVariable> variables, final List<Boolean> isConstant) {
        if (terms == null)
            return this;
        final ProvaList newTerms = (ProvaList) terms.cloneWithBoundVariables(variables, isConstant);
        final ProvaLiteralImpl newLit = new ProvaLiteralImpl(predicate, newTerms);
        // TODO: the new literal may actually become ground
        newLit.ground = ground;
        newLit.line = line;
        newLit.sourceCode = sourceCode;
        newLit.metadata = metadata;
        return newLit;
    }

    @Override
    public ProvaObject cloneWithVariables(final List<ProvaVariable> variables) {
        if (terms == null)
            return this;
        if (predicate.getSymbol().equals("cut")) {
            ProvaVariable any1 = ProvaVariableImpl.create();
            ProvaList lany1 = ProvaListImpl.create(new ProvaObject[]{any1});
            return new ProvaLiteralImpl(predicate, lany1);
        }
        final ProvaList newTerms = (ProvaList) terms.cloneWithVariables(variables);
        final ProvaLiteralImpl newLit = new ProvaLiteralImpl(predicate, newTerms);
        // TODO: the new literal may actually become ground
        newLit.ground = ground;
        newLit.line = line;
        newLit.sourceCode = sourceCode;
        newLit.metadata = metadata;
        return newLit;
    }

    @Override
    public ProvaObject cloneWithVariables(final long ruleId, final List<ProvaVariable> variables) {
        if (terms == null)
            return this;
        if (predicate.getSymbol().equals("cut")) {
            ProvaVariable any1 = ProvaVariableImpl.create();
            ProvaList lany1 = ProvaListImpl.create(new ProvaObject[]{any1});
            return new ProvaLiteralImpl(predicate, lany1);
        }
        final ProvaList newTerms = (ProvaList) terms.cloneWithVariables(ruleId, variables);
        final ProvaLiteralImpl newLit = new ProvaLiteralImpl(predicate, newTerms);
        newLit.ground = ground;
        newLit.line = line;
        newLit.sourceCode = sourceCode;
        newLit.metadata = metadata;
        return newLit;
    }

    @Override
    public String getSourceCode() {
        if (this.sourceCode == null)
            this.sourceCode = this.toString();
        return this.sourceCode;
    }

    @Override
    public void setSourceCode(String text) {
        this.sourceCode = text;
    }

    @Override
    public void setMetadata(String property, List<Object> value) {
        if (metadata == null)
            metadata = new HashMap<>();
        metadata.put(property, value);
    }

    @Override
    public List<Object> getMetadata(String property) {
        return metadata == null ? null : metadata.get(property);
    }

    @Override
    public List<ProvaObject> addMetadata(Map<String, List<Object>> m) {
        if (m == null)
            return null;
        if (metadata == null)
            metadata = new HashMap<>();
        metadata.putAll(m);
        List<ProvaObject> metaVariables = new ArrayList<>();
        for (Entry<String, List<Object>> e : m.entrySet()) {
            for (Object value : e.getValue()) {
                if (!(value instanceof String))
                    continue;
                String str = (String) value;
                if (str.length() != 0 && Character.isUpperCase(str.charAt(0)))
                    metaVariables.add(ProvaListImpl.create(
                            new ProvaObject[]{ProvaConstantImpl.create(str), ProvaVariableImpl.create(str)}));
            }
        }
        return metaVariables.size() == 0 ? null : metaVariables;
    }

    @Override
    public Map<String, List<Object>> getMetadata() {
        return metadata;
    }

    @Override
    public void setLine(int line) {
        this.line = line;
    }

    @Override
    public int getLine() {
        return this.line;
    }

    @Override
    public List<ProvaLiteral> getGuard() {
        return null;
    }

    @Override
    public Object computeIfExpression() {
        return this;
    }

    @Override
    public ProvaObject computeProvaIfExpression() {
        return this;
    }

    @Override
    public void setGround(boolean ground) {
        this.ground = ground;
        if (ground && terms != null)
            terms.setGround(true);
    }

    @Override
    public boolean updateGround(List<ProvaVariable> variables) {
        return ground = terms.updateGround(variables);
    }

}
