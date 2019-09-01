package org.provarules.reference2;

import org.provarules.kernel2.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

public class ProvaGoalImpl implements ProvaGoal {

    @SuppressWarnings("unused")
    private final static Logger log = LoggerFactory.getLogger("prova");

    private ProvaRule query;

    private ProvaLiteral goal;

    private ProvaPredicate predicate;

    private Iterator<ProvaRule> iterator;

    private final List<ProvaVariable> variables;

    private boolean cut = false;

    private List<ProvaList> extraAnswers;

    private List<ProvaList> outerAnswers;

    private boolean singleClause;

    private ProvaRule rule;

    private List<ProvaList> meta;

    private ProvaRule lastMatch;

    public ProvaGoalImpl(ProvaRule query) {
        this.query = query;
        this.variables = query.getVariables();
        this.goal = query.getTop();
        this.goal.setGoal(this);
        this.predicate = goal.getPredicate();
//		for( int i=0; i<query.getOffset(); i++ )
//			this.iterator.next();
    }

    public ProvaGoalImpl(List<ProvaVariable> variables, ProvaLiteral goal) {
        this.variables = variables;
        this.goal = goal;
        this.predicate = goal.getPredicate();
        this.iterator = predicate.getClauseSet().getClauses().iterator();
        for (int i = 0; i < query.getOffset(); i++)
            this.iterator.next();
    }

    @Override
    public void update() {
        this.goal = query.getTop();
        this.predicate = goal.getPredicate();
    }

    /*
     * Creates the iterator on a copy of the iterated collection of clauses
     */
    private void createIterator() {
        ProvaObject[] fixed = this.goal.getTerms().getFixed();
        if (fixed.length != 0) {
            ProvaObject firstObject = fixed[0];
            if (firstObject instanceof ProvaVariablePtr) {
                firstObject = variables.get(((ProvaVariablePtr) firstObject).getIndex());
                firstObject = firstObject.getRecursivelyAssigned();
            }
            if (firstObject instanceof ProvaConstant && !(firstObject instanceof ProvaMapImpl)) {
                Object o = ((ProvaConstant) firstObject).getObject();
                final List<ProvaRule> keyClauses = predicate.getClauseSet().getClauses(o, fixed);
                if (keyClauses != null) {
                    if (keyClauses.size() == 1) {
                        this.singleClause = true;
                    }
                    final List<ProvaRule> tempClauses = new ArrayList<>(keyClauses);
                    this.iterator = tempClauses.iterator();
                }
                return;
            }
        }
        final List<ProvaRule> clauses = predicate.getClauseSet().getClauses();
        if (clauses.size() == 1) {
            this.iterator = clauses.iterator();
//			if( !predicate.getKnowledgeBase().isCachePredicate(predicate.getSymbol()) )
            this.singleClause = true;
            return;
        }
        this.iterator = clauses.iterator();
//		final List<ProvaRule> tempClauses = new ArrayList<ProvaRule>(clauses);
//		this.iterator = tempClauses.iterator();
    }

    @Override
    public void updateMetadataGoal() {
        ProvaObject[] fixed = goal.getTerms().getFixed();
        String symbol = (String) ((ProvaConstant) fixed[0]).getObject();
        ProvaList terms = (ProvaList) fixed[1];
        Map<String, List<Object>> m = goal.getMetadata();
        meta = new ArrayList<>();
        for (int i = 2; i < fixed.length; i++) {
            meta.add((ProvaList) fixed[i]);
        }
        goal = predicate.getKnowledgeBase().generateLiteral(symbol, terms, goal.getGuard());
        goal.addMetadata(m);
        query.getBody()[query.getOffset()] = goal;
        predicate = goal.getPredicate();
    }

    @Override
    public ProvaRule next() {
        if (extraAnswers != null) {
            ProvaPredicate pred = new ProvaPredicateImpl(predicate.getSymbol(), predicate.getArity(), predicate.getKnowledgeBase());
            for (ProvaList answer : extraAnswers) {
                ProvaList ls = ProvaListImpl.create(answer.getFixed());
                ProvaLiteral lit = new ProvaLiteralImpl(pred, ls);
                ProvaRule clause = ProvaRuleImpl.createVirtualRule(1, lit, null);
                pred.addClause(clause);
            }
            iterator = pred.getClauseSet().getClauses().iterator();
//			query.removeAt(1);
            extraAnswers = null;
        } else if (iterator == null) {
            createIterator();
        }
        try {
            final ProvaRule nextRule = (iterator != null && iterator.hasNext()) ? iterator.next() : null;
            if (nextRule != null && !iterator.hasNext())
                singleClause = true;
            return nextRule;
        } catch (ConcurrentModificationException ignored) {
            // TODO: Double-check this: this happens when a temporal reaction rule is removed
        }
        return null;
    }

    @Override
    public ProvaUnification nextUnification(ProvaKnowledgeBase kb) {
        if (cut)
            return null;
        rule = null;
        this.singleClause = false;
//		synchronized(kb) {
        rule = next();
        while (rule != null && rule.isRemoved())
            rule = next();
        if (rule == null) {
            if (outerAnswers != null) {
                ProvaPredicate pred = new ProvaPredicateImpl(predicate.getSymbol(), predicate.getArity(), predicate.getKnowledgeBase());
                for (ProvaList answer : outerAnswers) {
                    ProvaList ls = ProvaListImpl.create(answer.getFixed());
                    ProvaLiteral lit = new ProvaLiteralImpl(pred, ls);
                    ProvaRule clause = ProvaRuleImpl.createVirtualRule(1, lit, null);
                    pred.addClause(clause);
                }
                iterator = pred.getClauseSet().getClauses().iterator();
                outerAnswers.clear();
                rule = iterator.hasNext() ? iterator.next() : null;
            }
            if (rule == null) {
                goal.markCompletion();
                return null;
            }
        }
        ProvaRule clone = query.cloneRule(!singleClause);
        final ProvaUnificationImpl unification = new ProvaUnificationImpl(
                clone,
                rule);
        unification.setMeta(meta);
        return unification;
//		}
    }

    @Override
    public ProvaLiteral getGoal() {
        return goal;
    }

    @Override
    public ProvaRule getQuery() {
        return query;
    }

    public ProvaPredicate getPredicate() {
        return predicate;
    }

    public void setIterator(Iterator<ProvaRule> iterator) {
        this.iterator = iterator;
    }

    @Override
    public Iterator<ProvaRule> getIterator() {
        return iterator;
    }

//	public void setVariables(List<ProvaVariable> variables) {
//		this.variables = variables;
//	}

    public List<ProvaVariable> getVariables() {
        return variables;
    }

    @Override
    public void setCut(boolean cut) {
        this.cut = cut;
    }

    @Override
    public boolean isCut() {
        return cut;
    }

    @Override
    public void setGoal(ProvaLiteral goal) {
        this.goal = goal;
    }

    @Override
    public boolean hasNext() {
        return iterator != null && iterator.hasNext();
    }

    @Override
    public void addAnswer(ProvaList terms) {
        if (extraAnswers == null)
            extraAnswers = new ArrayList<>();
        extraAnswers.add(terms);
    }

    @Override
    public void addOuterAnswer(ProvaList terms) {
        if (outerAnswers == null)
            outerAnswers = new ArrayList<>();
        outerAnswers.add(terms);
    }

    @Override
    public boolean isSingleClause() {
        return singleClause || (rule != null && rule.isCut());
    }

    @Override
    public void removeTarget() {
        rule.setRemoved();
        iterator.remove();
    }

    @Override
    public Object lookupMetadata(String reference, List<ProvaVariable> variables) {
        if (meta == null)
            return reference;
        for (ProvaList p : meta) {
            ProvaList pair = (ProvaList) p.cloneWithVariables(variables);
            String name = pair.getFixed()[0].toString();
            if (name.equals(reference)) {
                final ProvaObject data = pair.getFixed()[1];
                return data instanceof ProvaConstant ? ((ProvaConstant) data).getObject() : ProvaVariableImpl.create(name, data);
            }
        }
        return reference;
    }

    @Override
    public void setLastMatch(ProvaRule lastMatch) {
        this.lastMatch = lastMatch;
    }

    @Override
    public ProvaRule getLastMatch() {
        return lastMatch;
    }

    @Override
    public void updateGround() {
        goal.updateGround(variables);
    }

}
