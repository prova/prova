package org.provarules.reference2.builtins;

import org.provarules.agent2.ProvaReagent;
import org.provarules.kernel2.*;

import java.util.List;

public class ProvaNotEqualsImpl extends ProvaBuiltinImpl {

    public ProvaNotEqualsImpl(ProvaKnowledgeBase kb) {
        super(kb, "ne");
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
            return false;
        }
        ProvaObject rhs = data[1];
        if (rhs instanceof ProvaVariablePtr) {
            ProvaVariablePtr varPtr = (ProvaVariablePtr) rhs;
            rhs = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
        }
        if (rhs instanceof ProvaVariable) {
            return false;
        }
        if (lt instanceof ProvaConstant) {
            ProvaConstant lhsConstant = (ProvaConstant) lt;
            if (rhs instanceof ProvaConstant) {
                return !lhsConstant.getObject().equals(((ProvaConstant) rhs).getObject());
            }
            return true;
        }
        // TODO Deal with the case when LHS is a list
        return true;
    }

}
