package org.provarules.reference2.builtins;

import org.provarules.agent2.ProvaReagent;
import org.provarules.kernel2.*;
import org.provarules.reference2.ProvaConstantImpl;

import java.util.List;

public class ProvaMathRemainderImpl extends ProvaBuiltinImpl {

    public ProvaMathRemainderImpl(ProvaKnowledgeBase kb) {
        super(kb, "math_remainder");
    }

    @Override
    //TODO: recursive expressions as operands
    public boolean process(ProvaReagent prova, ProvaDerivationNode node,
                           ProvaGoal goal, List<ProvaLiteral> newLiterals, ProvaRule query) {
        ProvaLiteral literal = goal.getGoal();
        List<ProvaVariable> variables = query.getVariables();
        ProvaList terms = (ProvaList) literal.getTerms().cloneWithVariables(variables);
        ProvaObject[] data = terms.getFixed();
        if (data.length != 3)
            return false;
        ProvaObject lt = data[0];
        if (lt instanceof ProvaVariablePtr) {
            ProvaVariablePtr varPtr = (ProvaVariablePtr) lt;
            lt = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
        }
        if (!((lt instanceof ProvaVariable) || (lt instanceof ProvaConstant)))
            return false;
        ProvaObject a1 = data[1];
        if (a1 instanceof ProvaVariablePtr) {
            ProvaVariablePtr varPtr = (ProvaVariablePtr) a1;
            a1 = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
        }
        if (!(a1 instanceof ProvaConstant))
            return false;
        Object oa1 = ((ProvaConstant) a1).getObject();
        if (!(oa1 instanceof Number))
            return false;
        ProvaObject a2 = data[2];
        if (a2 instanceof ProvaVariablePtr) {
            ProvaVariablePtr varPtr = (ProvaVariablePtr) a2;
            a2 = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
        }
        if (!(a2 instanceof ProvaConstant))
            return false;
        Object oa2 = ((ProvaConstant) a2).getObject();
        if (!(oa2 instanceof Number))
            return false;
        Number na1 = (Number) oa1;
        Number na2 = (Number) oa2;
        Number result;
        if (na1 instanceof Double || na2 instanceof Double)
            result = na1.doubleValue() % na2.doubleValue();
        else if (na1 instanceof Float || na2 instanceof Float)
            result = na1.floatValue() % na2.floatValue();
        else if (na1 instanceof Long || na2 instanceof Long)
            result = na1.longValue() % na2.longValue();
        else if (na1 instanceof Integer || na2 instanceof Integer)
            result = na1.intValue() % na2.intValue();
        else
            result = na1.byteValue() % na2.byteValue();
        if (lt instanceof ProvaConstant)
            return ((ProvaConstant) lt).getObject() == result;
        ((ProvaVariable) lt).setAssigned(ProvaConstantImpl.create(result));
        return true;
    }

}
