package org.provarules.reference2.builtins;

import org.provarules.agent2.ProvaReagent;
import org.provarules.kernel2.*;
import org.provarules.reference2.*;
import org.provarules.reference2.builtins.target.ProvaTarget;
import org.provarules.reference2.builtins.target.ProvaTargetImpl;

import java.util.List;

public class ProvaMatchImpl extends ProvaBuiltinImpl {

    private ProvaLiteral targetLiteral;

    private ProvaRule targetQuery;

    public ProvaMatchImpl(ProvaKnowledgeBase kb) {
        super(kb, "match");
    }

    @Override
    public boolean process(ProvaReagent prova, ProvaDerivationNode node,
                           ProvaGoal goal, List<ProvaLiteral> newLiterals, ProvaRule query) {
        ProvaLiteral literal = goal.getGoal();
        List<ProvaVariable> variables = query.getVariables();
        ProvaList terms = literal.getTerms();
        ProvaObject[] data = terms.getFixed();
        if (data.length != 3)
            return false;
        ProvaObject handle = data[2];
        if (handle instanceof ProvaVariablePtr) {
            ProvaVariablePtr varPtr = (ProvaVariablePtr) handle;
            handle = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
        }
        ProvaObject[] target = ((ProvaList) data[0]).getFixed();
        String symbol = ((ProvaConstant) target[0]).getObject().toString();
        ProvaRuleSet clauses = kb.getPredicates(symbol, target.length - 1);
        ProvaGoal targetGoal = null;
        ProvaTarget ptr = null;
        if (handle instanceof ProvaVariable) {
            targetLiteral = kb.generateLiteral(target);
            targetQuery = kb.generateGoal(new ProvaLiteral[]{targetLiteral}, variables);
            targetGoal = new ProvaGoalImpl(targetQuery);
            ptr = ProvaTargetImpl.create(targetGoal);
            ((ProvaVariable) handle).setAssigned(ProvaConstantImpl.create(ptr));
        } else if (handle instanceof ProvaConstant) {
            ptr = (ProvaTarget) ((ProvaConstant) handle).getObject();
            targetGoal = ptr.getTarget();
        }
        ProvaUnification unification = clauses.nextMatch(kb, targetGoal);
        if (unification == null)
            return false;
        ProvaRule candidate = unification.getTarget();
        ptr.setCandidate(candidate);
        ProvaObject lt = data[1];
        if (lt instanceof ProvaVariablePtr) {
            ProvaVariablePtr varPtr = (ProvaVariablePtr) lt;
            lt = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
        }
        ProvaLiteral l = (ProvaLiteral) candidate.getHead().cloneWithVariables(variables);
        ProvaObject[] arr = l.getTerms().getFixed();
        ProvaObject[] newArr = new ProvaObject[1 + arr.length];
        System.arraycopy(arr, 0, newArr, 1, arr.length);
        newArr[0] = ProvaConstantImpl.create(l.getPredicate().getSymbol());
        if (lt instanceof ProvaVariable) {
            ((ProvaVariable) lt).setAssigned(ProvaListImpl.create(newArr));
            return true;
        } else if (lt instanceof ProvaList) {
            ProvaPredicate pred = new ProvaPredicateImpl("", 1, kb);
            ProvaLiteral lit = new ProvaLiteralImpl(pred, ProvaListImpl.create(newArr));
            ProvaRule clause = ProvaRuleImpl.createVirtualRule(1, lit, null);
            pred.addClause(clause);
            ProvaLiteral newLiteral = new ProvaLiteralImpl(pred, (ProvaList) lt.cloneWithVariables(variables));
            newLiterals.add(newLiteral);
        } else
            return false;
        return true;
    }

}
