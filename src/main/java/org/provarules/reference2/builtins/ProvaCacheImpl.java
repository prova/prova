package org.provarules.reference2.builtins;

import org.provarules.agent2.ProvaReagent;
import org.provarules.kernel2.*;
import org.provarules.kernel2.cache.ProvaCacheState;
import org.provarules.kernel2.cache.ProvaCacheTablet;
import org.provarules.reference2.*;
import org.provarules.reference2.cache.ProvaCacheTabletImpl;
import org.provarules.reference2.cache.ProvaCachedLiteralImpl;
import org.provarules.reference2.cache.ProvaLocalAnswersImpl;
import org.provarules.reference2.cache.ProvaTabletKeyImpl;

import java.util.*;

public class ProvaCacheImpl extends ProvaBuiltinImpl {

    private final Map<ProvaTabletKeyImpl, ProvaCacheTablet> caches = new HashMap<ProvaTabletKeyImpl, ProvaCacheTablet>();

    public ProvaCacheImpl(ProvaKnowledgeBase kb) {
        super(kb, "cache");
    }

    @Override
    public boolean process(ProvaReagent prova, ProvaDerivationNode node,
                           ProvaGoal goal, List<ProvaLiteral> newLiterals, ProvaRule query) {
        ProvaLiteral literal = goal.getGoal();
        List<ProvaVariable> variables = query.getVariables();
        ProvaList terms = literal.getTerms();
        if (terms.getFixed().length == 0)
            return false;
        ProvaObject first = terms.getFixed()[0];
        if (!(first instanceof ProvaList))
            return false;
        ProvaList firstList = (ProvaList) first;
        if (firstList == ProvaListImpl.emptyRList)
            return false;
        ProvaObject[] fixed = firstList.getFixed();
        ProvaObject first2 = fixed[0];
        if (!(first2 instanceof ProvaConstant) || !(((ProvaConstant) first2).getObject() instanceof String))
            return false;
        final int arity = fixed.length - 1;
        final String symbol = (String) ((ProvaConstant) first2).getObject();
//		int numFree = 0;
        int numBound = 0;
        // Where are the ground terms
        int mask = 0;
        for (int i = 1; i <= arity; i++) {
            ProvaObject o = fixed[i];
            mask <<= 1;
            if (o instanceof ProvaVariablePtr) {
                ProvaVariablePtr ptr = (ProvaVariablePtr) o;
                ProvaVariable var = variables.get(ptr.getIndex());
                o = var.getAssigned();
            }
            if (o instanceof ProvaConstant) {
                numBound++;
                mask |= 1;
            } else if (o instanceof ProvaVariable) {
            } else {
                // TODO: Ignore cache instruction
            }
        }
        final Object[] data = new Object[numBound];
        for (int i = 1, j = 0; i <= arity; i++) {
            ProvaObject o = fixed[i];
            if (o instanceof ProvaVariablePtr) {
                ProvaVariablePtr ptr = (ProvaVariablePtr) o;
                ProvaVariable var = variables.get(ptr.getIndex());
                o = var.getAssigned();
            }
            if (o instanceof ProvaConstant)
                data[j++] = ((ProvaConstant) o).getObject();
        }
//		numFree = arity-numBound;
        ProvaTabletKeyImpl key = new ProvaTabletKeyImpl(symbol, arity, mask);
        ProvaCacheTablet cacheTablet = caches.get(key);
        if (cacheTablet == null) {
            cacheTablet = new ProvaCacheTabletImpl(arity);
            caches.put(key, cacheTablet);
        }
        ProvaCacheState cacheState = cacheTablet.open(data);
        final ProvaLocalAnswersImpl localAnswers = new ProvaLocalAnswersImpl();
        if (cacheState.isOpen()) {
            Collection<ProvaList> answers = cacheState.getSolutions();
            int numAnswers = answers.size();
            ProvaPredicate pred = new ProvaPredicateImpl(symbol, arity, kb);
            if (numAnswers != 0) {
                // Use the available answers directly as alternatives for this subgoal
                for (ProvaList answer : answers) {
                    ProvaList ls = ProvaListImpl.create(answer.getFixed());
                    ProvaLiteral lit = new ProvaLiteralImpl(pred, ls);
                    ProvaRule clause = ProvaRuleImpl.createVirtualRule(1, lit, null);
                    pred.addClause(clause);
                }
            }
            final ProvaGoal lastGoal = cacheState.getGoal();
            if (!cacheState.isComplete() && !lastGoal.isCut()) {
                Iterator<ProvaRule> iter = lastGoal.getIterator();
                while (iter.hasNext()) {
                    final ProvaRule next = iter.next();
                    pred.addClause(next);
                }
            }
            if (pred.getClauseSet().getClauses().size() == 0)
                return false;
            // Note that if the fixed part is only 1, the new query will be tail-only
            ProvaObject[] newFixed = new ProvaObject[arity];
            System.arraycopy(fixed, 1, newFixed, 0, fixed.length - 1);
            ProvaList newTerms = ProvaListImpl.create(newFixed, firstList.getTail());
            ProvaLiteral newLiteral = new ProvaCachedLiteralImpl(pred, newTerms, cacheState, localAnswers);
            newLiterals.add(newLiteral);

            if (!lastGoal.isCut()) {
                // Add an update_cache literal
                ProvaList ltls = ProvaListImpl.create(fixed);
                ProvaObject[] newFixed2 = new ProvaObject[5];
                newFixed2[0] = ProvaConstantImpl.create(cacheState);
                newFixed2[1] = ltls;
                newFixed2[2] = ProvaConstantImpl.create(localAnswers);
                newFixed2[3] = newLiteral;
                newFixed2[4] = ProvaConstantImpl.create(node);
                ProvaList newTerms2 = ProvaListImpl.create(newFixed2);
                newLiterals.add(kb.generateLiteral("@update_cache", newTerms2));
            }

            // TODO: Use other unexplored branches as well
            return true;
        }
        cacheState.setOpen(true);

        // Note that if the fixed part is only 1, the new query will be tail-only
        ProvaObject[] newFixed = new ProvaObject[arity];
        System.arraycopy(fixed, 1, newFixed, 0, fixed.length - 1);
        ProvaList newTerms = ProvaListImpl.create(newFixed, firstList.getTail());
        final ProvaLiteral newLiteral = kb.generateCachedLiteral(symbol, newTerms, cacheState, localAnswers);
        newLiterals.add(newLiteral);

        // Add an update_cache literal
        ProvaList ltls = ProvaListImpl.create(fixed);
        ProvaObject[] newFixed2 = new ProvaObject[5];
        newFixed2[0] = ProvaConstantImpl.create(cacheState);
        newFixed2[1] = ltls;
        newFixed2[2] = ProvaConstantImpl.create(localAnswers);
        newFixed2[3] = newLiteral;
        newFixed2[4] = ProvaConstantImpl.create(node);
        ProvaList newTerms2 = ProvaListImpl.create(newFixed2);
        newLiterals.add(kb.generateLiteral("@update_cache", newTerms2));
        return true;
    }

}
