package org.provarules.reference2.builtins;

import org.provarules.agent2.ProvaReagent;
import org.provarules.kernel2.*;
import org.provarules.reference2.ProvaListImpl;
import org.provarules.reference2.ProvaLiteralImpl;
import org.provarules.reference2.ProvaPredicateImpl;
import org.provarules.reference2.ProvaRuleImpl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ProvaReverseImpl extends ProvaBuiltinImpl {

    public ProvaReverseImpl(ProvaKnowledgeBase kb) {
        super(kb, "reverse");
    }

    /**
     * Find the reverse of a rest-less list.
     * If the output list is not a free variable, unify it against the reversed list in the input list.
     */
    @Override
    public boolean process(ProvaReagent prova, ProvaDerivationNode node,
                           ProvaGoal goal, List<ProvaLiteral> newLiterals, ProvaRule query) {
        ProvaLiteral literal = goal.getGoal();
        List<ProvaVariable> variables = query.getVariables();
        ProvaList terms = literal.getTerms();
        ProvaObject[] data = terms.getFixed();
        if (data.length != 2)
            return false;
        ProvaObject lt = data[0];
        if (lt instanceof ProvaVariablePtr) {
            ProvaVariablePtr ltPtr = (ProvaVariablePtr) lt;
            lt = variables.get(ltPtr.getIndex()).getRecursivelyAssigned();
        }
        if (!(lt instanceof ProvaList))
            return false;
        ProvaList list = (ProvaList) lt;
        if (list.getTail() instanceof ProvaVariable)
            return false;

        ProvaObject out = data[1];
        if (out instanceof ProvaVariablePtr) {
            ProvaVariablePtr outPtr = (ProvaVariablePtr) out;
            out = variables.get(outPtr.getIndex()).getRecursivelyAssigned();
        }
        if (out instanceof ProvaVariable) {
            List<ProvaObject> jlist = Arrays.asList(list.getFixed());
            Collections.reverse(jlist);
            ((ProvaVariable) out).setAssigned(ProvaListImpl.create(jlist));
            return true;
        }
        if (out instanceof ProvaList) {
            ProvaList other = (ProvaList) out;
            if (other.getTail() != null)
                return false;
            List<ProvaObject> jlist = Arrays.asList(list.getFixed());
            Collections.reverse(jlist);
            // Unify the reversed first argument list with the second argument list
            ProvaPredicate pred = new ProvaPredicateImpl("", 1, kb);
            ProvaList ls = ProvaListImpl.create(new ProvaObject[]{ProvaListImpl.create(jlist)});
            ProvaLiteral lit = new ProvaLiteralImpl(pred, ls);
            ProvaRule clause = ProvaRuleImpl.createVirtualRule(1, lit, null);
            pred.addClause(clause);
            ProvaList outls = ProvaListImpl.create(new ProvaObject[]{other});
            ProvaLiteral newLiteral = new ProvaLiteralImpl(pred, outls);
            newLiterals.add(newLiteral);
            return true;
        }
        return false;
    }

}
