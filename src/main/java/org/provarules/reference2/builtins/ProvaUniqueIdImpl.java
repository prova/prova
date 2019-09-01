package org.provarules.reference2.builtins;

import org.provarules.agent2.ProvaReagent;
import org.provarules.kernel2.*;
import org.provarules.reference2.ProvaConstantImpl;

import java.util.List;

public class ProvaUniqueIdImpl extends ProvaBuiltinImpl {

    public ProvaUniqueIdImpl(ProvaKnowledgeBase kb) {
        super(kb, "unique_id");
    }

    @Override
    public boolean process(ProvaReagent prova, ProvaDerivationNode node,
                           ProvaGoal goal, List<ProvaLiteral> newLiterals, ProvaRule query) {
        ProvaLiteral literal = goal.getGoal();
        List<ProvaVariable> variables = query.getVariables();
        ProvaList terms = literal.getTerms();
        ProvaObject[] data = terms.getFixed();
        ProvaObject lt = data[0];
        if (lt instanceof ProvaVariablePtr) {
            ProvaVariablePtr varPtr = (ProvaVariablePtr) lt;
            lt = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
        }
        String cid;
        if (lt instanceof ProvaVariable) {
            // Generate a unique conversation-id
            cid = prova.getMessenger().generateCid();
            ((ProvaVariable) lt).setAssigned(ProvaConstantImpl.create(cid));
            return true;
        }
        return false;
    }

}
