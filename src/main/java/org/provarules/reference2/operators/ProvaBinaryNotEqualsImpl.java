package org.provarules.reference2.operators;

import org.provarules.kernel2.*;
import org.provarules.reference2.ProvaConstantImpl;

import java.util.List;

public class ProvaBinaryNotEqualsImpl implements ProvaBinaryOperator {

    @Override
    public boolean evaluate(ProvaKnowledgeBase kb, List<ProvaLiteral> newLiterals, ProvaObject o1, ProvaComputable a2) {
        if (o1 instanceof ProvaVariable) {
            throw new RuntimeException("Variable " + o1 + " used in '!='");
        }
        Object n2 = a2.computeIfExpression();
        if (n2.getClass() == ProvaConstantImpl.class)
            n2 = ((ProvaConstant) n2).getObject();
        // TODO: what to do if the lhs contains a ProvaList?
        return !((ProvaConstant) o1).getObject().equals(n2);
    }

    public String toString() {
        return "!=";
    }

}
