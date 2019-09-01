package org.provarules.reference2.operators;

import org.provarules.kernel2.ProvaConstant;
import org.provarules.kernel2.ProvaObject;

public class ProvaOperatorFactoryImpl {

    public static ProvaOperator create(String op) {
        if ("+".equals(op))
            return new ProvaAddImpl();
        else if ("-".equals(op))
            return new ProvaSubtractImpl();
        else if ("*".equals(op))
            return new ProvaMultiplyImpl();
        else if ("/".equals(op))
            return new ProvaDivideImpl();
        else if ("mod".equals(op))
            return new ProvaRemainderImpl();
        else if ("neg".equals(op))
            return new ProvaNegateImpl();
        else throw new RuntimeException("Invalid operator " + op);
    }

    public static ProvaOperator createFunctionCall(ProvaObject otype, ProvaObject omethod) {
        String type = ((ProvaConstant) otype).getObject().toString();
        String method = ((ProvaConstant) omethod).getObject().toString();
        return new ProvaFcalcImpl(type, method);
    }

}
