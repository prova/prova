package org.provarules.reference2.builtins;

import org.provarules.agent2.ProvaReagent;
import org.provarules.kernel2.*;

import java.util.List;

public class ProvaUnlistenImpl extends ProvaBuiltinImpl {

    public ProvaUnlistenImpl(ProvaKnowledgeBase kb) {
        super(kb, "unlisten");
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
        ProvaObject target = data[1];
        if (target instanceof ProvaVariablePtr) {
            ProvaVariablePtr varPtr = (ProvaVariablePtr) target;
            target = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
        }
        if (!(target instanceof ProvaConstant))
            return false;
        ProvaObject type = data[0];
        if (type instanceof ProvaVariablePtr) {
            ProvaVariablePtr varPtr = (ProvaVariablePtr) type;
            type = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
        }
        if (!(type instanceof ProvaConstant))
            return false;
        String strType = (String) ((ProvaConstant) type).getObject();
        Object objTarget = ((ProvaConstant) target).getObject();
        prova.getSwingAdaptor().unlisten(strType, objTarget);
        return true;
    }

}
