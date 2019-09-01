package org.provarules.reference2.builtins;

import org.provarules.agent2.ProvaReagent;
import org.provarules.kernel2.*;
import org.provarules.reference2.ProvaConstantImpl;

import java.util.List;

public class ProvaConcatImpl extends ProvaBuiltinImpl {

    public ProvaConcatImpl(ProvaKnowledgeBase kb) {
        super(kb, "concat");
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
        ProvaObject res = data[1];
        if (res instanceof ProvaVariablePtr) {
            ProvaVariablePtr varPtr = (ProvaVariablePtr) res;
            res = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
        }
        if (!(res instanceof ProvaVariable) && !(res instanceof ProvaConstant))
            return false;
        ProvaObject lt = data[0];
        if (lt instanceof ProvaVariablePtr) {
            ProvaVariablePtr varPtr = (ProvaVariablePtr) lt;
            lt = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
        }
        if (!(lt instanceof ProvaList))
            return false;
        ProvaObject[] args = ((ProvaList) lt.cloneWithVariables(variables)).getFixed();
        StringBuilder sb = new StringBuilder();
        for (ProvaObject arg : args) {
            sb.append(arg.toString());
        }

        if (res instanceof ProvaVariable)
            ((ProvaVariable) res).setAssigned(ProvaConstantImpl.create(sb.toString()));
        else if (res instanceof ProvaConstant) {
            return ((ProvaConstant) res).getObject().toString().equals(sb.toString());
        }
        return true;
    }

}
