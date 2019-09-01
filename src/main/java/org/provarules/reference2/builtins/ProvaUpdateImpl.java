package org.provarules.reference2.builtins;

import org.provarules.agent2.ProvaReagent;
import org.provarules.kernel2.*;
import org.provarules.reference2.builtins.target.ProvaTarget;

import java.util.List;

public class ProvaUpdateImpl extends ProvaBuiltinImpl {

    public ProvaUpdateImpl(ProvaKnowledgeBase kb) {
        super(kb, "update");
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
        ProvaTarget ptr = null;
        Object rt = data[1];
        if (rt instanceof ProvaVariablePtr) {
            ProvaVariablePtr varPtr = (ProvaVariablePtr) rt;
            ProvaObject o = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
            if (o instanceof ProvaConstant)
                rt = o;
        }
        if (!(rt instanceof ProvaConstant))
            return false;
        ptr = (ProvaTarget) ((ProvaConstant) rt).getObject();
        ProvaObject lt = data[0];
        if (lt instanceof ProvaVariablePtr) {
            ProvaVariablePtr varPtr = (ProvaVariablePtr) lt;
            ProvaObject o = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
            if (!(o instanceof ProvaVariable))
                lt = o;
        }
        if (!(lt instanceof ProvaList))
            return false;
        ProvaList newList = (ProvaList) ((ProvaList) lt).cloneWithVariables(variables, 1);
        ptr.getCandidate().getHead().setTerms(newList);
        return true;
    }

}
