package org.provarules.reference2.builtins;

import org.provarules.agent2.ProvaReagent;
import org.provarules.kernel2.*;
import org.provarules.reference2.ProvaConstantImpl;
import org.provarules.reference2.ProvaListImpl;
import org.provarules.reference2.ProvaVariableImpl;

import java.util.List;

public class ProvaLengthImpl extends ProvaBuiltinImpl {

    public ProvaLengthImpl(ProvaKnowledgeBase kb) {
        super(kb, "length");
    }

    /**
     * Find the length of a rest-less list.
     * If the supplied list is a free variable but the length is given, generate a list of this length.
     */
    @Override
    public boolean process(ProvaReagent prova, ProvaDerivationNode node,
                           ProvaGoal goal, List<ProvaLiteral> newLiterals, ProvaRule query) {
        ProvaLiteral literal = goal.getGoal();
        List<ProvaVariable> variables = query.getVariables();
        ProvaList terms = (ProvaList) literal.getTerms().cloneWithVariables(variables);
        ProvaObject[] data = terms.getFixed();
        if (data.length != 2)
            return false;
        ProvaObject lt = data[0];
        if (lt instanceof ProvaVariable) {
            ProvaObject out = data[1];
            if (!(out instanceof ProvaConstant))
                return false;
            Object olen = ((ProvaConstant) out).getObject();
            if (!(olen instanceof Integer))
                return false;
            int len = (Integer) olen;
            // Generate a list given its length
            ProvaObject[] fixed = new ProvaObject[len];
            for (int i = 0; i < len; i++) {
                fixed[i] = ProvaVariableImpl.create();
            }
            ProvaList newList = ProvaListImpl.create(fixed, null);
            ((ProvaVariable) lt).setAssigned(newList);
            return true;
        }
        if (!(lt instanceof ProvaList))
            return false;
        ProvaList list = (ProvaList) lt;
        if (list.getTail() instanceof ProvaVariable)
            return false;

        ProvaObject out = data[1];
        if (out instanceof ProvaConstant) {
            Object o = ((ProvaConstant) out).getObject();
            if (!(o instanceof Integer))
                return false;
            return list.getFixed().length == (Integer) o;
        }
        if (out instanceof ProvaVariable) {
            ((ProvaVariable) out).setAssigned(ProvaConstantImpl.create(list.getFixed().length));
            return true;
        }
        return false;
    }

}
