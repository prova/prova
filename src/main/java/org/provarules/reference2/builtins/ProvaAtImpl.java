package org.provarules.reference2.builtins;

import org.provarules.agent2.ProvaReagent;
import org.provarules.kernel2.*;
import org.provarules.reference2.*;

import java.util.List;

public class ProvaAtImpl extends ProvaBuiltinImpl {

    public ProvaAtImpl(ProvaKnowledgeBase kb) {
        super(kb, "at");
    }

    /**
     * Find element at the specified position in a list.
     * If the supplied position is -1, assume the request is for the last element in the list.
     * If the target element is already supplied, unify it against the element we find at the specified position.
     * If the input list is a free variable, generate a list of free variables that includes the supplied positive position.
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
        ProvaList args = (ProvaList) lt;
        if (args.getFixed().length != 2)
            return false;
        ProvaObject ppos = args.getFixed()[1];
        if (ppos instanceof ProvaVariablePtr) {
            ProvaVariablePtr pposPtr = (ProvaVariablePtr) ppos;
            ppos = variables.get(pposPtr.getIndex()).getRecursivelyAssigned();
        }
        if (!(ppos instanceof ProvaConstant))
            return false;
        Object opos = ((ProvaConstant) ppos).getObject();
        if (!(opos instanceof Integer))
            return false;
        int pos = (Integer) opos;
        if (pos < -1)
            return false;

        // data[1] is not cloned, it keeps the variable pointers intact
        ProvaObject out = data[1];
        if (out instanceof ProvaVariablePtr) {
            ProvaVariablePtr outPtr = (ProvaVariablePtr) out;
            out = variables.get(outPtr.getIndex()).getRecursivelyAssigned();
        }

        ProvaObject olist = args.getFixed()[0];
        if (olist instanceof ProvaVariablePtr) {
            ProvaVariablePtr listPtr = (ProvaVariablePtr) olist;
            olist = variables.get(listPtr.getIndex()).getRecursivelyAssigned();
        }
        if (olist instanceof ProvaVariable) {
            if (pos < 0)
                return false;
            // Generate a list given the requested position
            ProvaObject[] fixed = new ProvaObject[pos + 1];
            for (int i = 0; i < pos; i++) {
                fixed[i] = ProvaVariableImpl.create();
            }
            fixed[pos] = out;
            ProvaList newList = ProvaListImpl.create(fixed, ProvaVariableImpl.create());
            ((ProvaVariable) olist).setAssigned(newList);
            return true;
        }
        if (!(olist instanceof ProvaList))
            return false;

        ProvaList list = (ProvaList) olist;
        if (pos == -1) {
            // Request for the last element
            if (list.getTail() != null)
                // Assume that if there is a rest, we do not know what is the last element
                return false;
            pos = list.getFixed().length - 1;
        } else if (list.getFixed().length - 1 < pos)
            return false;

        // The element IS cloned as it will be used for creating a virtual rule
        final ProvaObject element = list.getFixed()[pos].cloneWithVariables(variables);
        if (out instanceof ProvaVariable) {
            ((ProvaVariable) out).setAssigned(element);
            return true;
        }
        if (out instanceof ProvaConstant || out instanceof ProvaList) {
            // Unify the element at position pos by creating a single fact virtual predicate
            ProvaPredicate pred = new ProvaPredicateImpl("", 1, kb);
            ProvaList ls = ProvaListImpl.create(new ProvaObject[]{element});
            ProvaLiteral lit = new ProvaLiteralImpl(pred, ls);
            ProvaRule clause = ProvaRuleImpl.createVirtualRule(1, lit, null);
            pred.addClause(clause);
            ProvaList outls = ProvaListImpl.create(new ProvaObject[]{out});
            ProvaLiteral newLiteral = new ProvaLiteralImpl(pred, outls);
            newLiterals.add(newLiteral);
            return true;
        }
        return false;
    }

}
