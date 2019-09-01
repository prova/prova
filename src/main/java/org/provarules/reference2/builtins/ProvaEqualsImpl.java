package org.provarules.reference2.builtins;

import org.provarules.agent2.ProvaReagent;
import org.provarules.kernel2.*;
import org.provarules.reference2.ProvaGlobalConstantImpl;
import org.provarules.reference2.ProvaLiteralImpl;
import org.provarules.reference2.ProvaPredicateImpl;
import org.provarules.reference2.ProvaRuleImpl;

import java.util.List;

public class ProvaEqualsImpl extends ProvaBuiltinImpl {

    public ProvaEqualsImpl(ProvaKnowledgeBase kb) {
        super(kb, "equals");
    }

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
            ProvaVariablePtr varPtr = (ProvaVariablePtr) lt;
            lt = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
        }
        if (lt instanceof ProvaVariable) {
            ((ProvaVariable) lt).setAssigned(data[1]);
            return true;
        }
        ProvaObject rhs = data[1];
        if (rhs instanceof ProvaVariablePtr) {
            ProvaVariablePtr varPtr = (ProvaVariablePtr) rhs;
            rhs = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
        }
        if (rhs instanceof ProvaVariable) {
            ((ProvaVariable) rhs).setAssigned(data[0]);
            return true;
        }
        if (lt instanceof ProvaConstant) {
            ProvaConstant lhsConstant = (ProvaConstant) lt;
            if (rhs instanceof ProvaConstant) {
                if (lhsConstant instanceof ProvaGlobalConstantImpl) {
                    lhsConstant.setObject(((ProvaConstant) rhs).getObject());
                    return true;
                }
                return lhsConstant.getObject().equals(((ProvaConstant) rhs).getObject());
            }
            return false;
        }
        // Deal with the case when LHS is a list
        if (lt instanceof ProvaList && rhs instanceof ProvaList) {
            ProvaPredicate pred = new ProvaPredicateImpl("", 1, kb);
            ProvaLiteral lit = new ProvaLiteralImpl(pred, (ProvaList) lt);
            ProvaRule clause = ProvaRuleImpl.createVirtualRule(1, lit, null);
            pred.addClause(clause);
            ProvaLiteral newLiteral = new ProvaLiteralImpl(pred, (ProvaList) rhs);
            newLiterals.add(newLiteral);
            return true;
        }
        return false;
    }

}
