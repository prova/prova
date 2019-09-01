package org.provarules.reference2.builtins;

import org.provarules.agent2.ProvaReagent;
import org.provarules.kernel2.*;
import org.provarules.reference2.ProvaConstantImpl;
import org.provarules.reference2.ProvaGlobalConstantImpl;

import java.util.List;

public class ProvaEqualsMinusImpl extends ProvaBuiltinImpl {

    public ProvaEqualsMinusImpl(ProvaKnowledgeBase kb) {
        super(kb, "equals_minus");
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
        ProvaObject rhs = data[1];
        if (rhs instanceof ProvaVariablePtr) {
            ProvaVariablePtr varPtr = (ProvaVariablePtr) rhs;
            rhs = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
        }
        if (!(rhs instanceof ProvaConstant))
            return false;
        Object o = ((ProvaConstant) rhs).getObject();
        Object n = null;
        if (!(o instanceof Number))
            return false;
        if (o instanceof Byte) {
            byte m = ((Byte) o);
            n = (byte) ~m;
        } else if (o instanceof Integer) {
            int m = ((Integer) o);
            n = -m;
        } else if (o instanceof Long) {
            long m = ((Long) o);
            n = -m;
        } else if (o instanceof Float) {
            float m = ((Float) o);
            n = -m;
        } else if (o instanceof Double) {
            Double m = ((Double) o);
            n = -m;
        }
        ProvaObject lt = data[0];
        if (lt instanceof ProvaVariablePtr) {
            ProvaVariablePtr varPtr = (ProvaVariablePtr) lt;
            lt = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
        }
        if (lt instanceof ProvaVariable) {
            ((ProvaVariable) lt).setAssigned(ProvaConstantImpl.create(n));
            return true;
        }
        if (lt instanceof ProvaConstant) {
            ProvaConstant lhsConstant = (ProvaConstant) lt;
            if (lhsConstant instanceof ProvaGlobalConstantImpl) {
                lhsConstant.setObject(n);
                return true;
            }
            return lhsConstant.getObject().equals(n);
        }
        return true;
    }

}
