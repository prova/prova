package org.provarules.reference2.builtins;

import org.provarules.agent2.ProvaReagent;
import org.provarules.kernel2.*;
import org.provarules.reference2.operators.ProvaBinaryOperator;

import java.util.List;

public class ProvaExpressionLiteralImpl extends ProvaBuiltinImpl {

    public ProvaExpressionLiteralImpl(ProvaKnowledgeBase kb) {
        super(kb, "expr_literal");
    }

    @Override
    public boolean process(ProvaReagent prova, ProvaDerivationNode node,
                           ProvaGoal goal, List<ProvaLiteral> newLiterals, ProvaRule query) {
        ProvaLiteral literal = goal.getGoal();
        List<ProvaVariable> variables = query.getVariables();
        ProvaList terms = literal.getTerms(); //.cloneWithVariables(variables);
        terms.updateGround(variables);
        ProvaObject[] data = terms.getFixed();
        if (data.length != 3)
            return false;
        // Main binary operator
        ProvaObject lt = data[0];
        if (lt instanceof ProvaVariablePtr) {
            ProvaVariablePtr varPtr = (ProvaVariablePtr) lt;
            lt = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
        }
        if (!(lt instanceof ProvaConstant))
            return false;
        Object olt1 = ((ProvaConstant) lt).getObject();
        if (!(olt1 instanceof ProvaBinaryOperator))
            return false;
        ProvaBinaryOperator bo = (ProvaBinaryOperator) olt1;
        // LHS
        ProvaObject a1 = data[1];
        if (a1 instanceof ProvaVariablePtr) {
            ProvaVariablePtr varPtr = (ProvaVariablePtr) a1;
            a1 = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
        }
        if (!((a1 instanceof ProvaVariable) || (a1 instanceof ProvaConstant) || (a1 instanceof ProvaList)))
            return false;
        // Expression
        ProvaObject a2 = data[2];
        if (a2 instanceof ProvaVariablePtr) {
            ProvaVariablePtr varPtr = (ProvaVariablePtr) a2;
            a2 = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
        }
        return bo.evaluate(kb, newLiterals, a1, (ProvaComputable) a2);
    }

}
