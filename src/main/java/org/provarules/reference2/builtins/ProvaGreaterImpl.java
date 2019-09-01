package org.provarules.reference2.builtins;

import org.provarules.agent2.ProvaReagent;
import org.provarules.kernel2.*;

import java.util.List;

public class ProvaGreaterImpl extends ProvaBuiltinImpl {

    public ProvaGreaterImpl(ProvaKnowledgeBase kb) {
        super(kb, "gt");
    }

    @Override
    public boolean process(ProvaReagent prova, ProvaDerivationNode node,
                           ProvaGoal goal, List<ProvaLiteral> newLiterals, ProvaRule query) {
        ProvaLiteral literal = goal.getGoal();
        List<ProvaVariable> variables = query.getVariables();
        ProvaList terms = (ProvaList) literal.getTerms().cloneWithVariables(variables);
        ProvaObject[] data = terms.getFixed();
        if (data.length < 2
                || !(data[0] instanceof ProvaConstant)
                || !(((ProvaConstant) data[0]).getObject() instanceof Number))
            return false;
        double left = ((Number) ((ProvaConstant) data[0]).getObject()).doubleValue();
        for (int i = 1; i < data.length; i++) {
            if (!(((ProvaConstant) data[i]).getObject() instanceof Number))
                return false;
            double right = ((Number) ((ProvaConstant) data[i]).getObject()).doubleValue();
            if (left <= right)
                return false;
        }
        return true;
    }

}
