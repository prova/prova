package org.provarules.reference2.builtins;

import org.provarules.agent2.ProvaReagent;
import org.provarules.kernel2.*;

import java.util.List;

public class ProvaRetractAllImpl extends ProvaBuiltinImpl {

    public ProvaRetractAllImpl(ProvaKnowledgeBase kb) {
        super(kb, "retractall");
    }

    @Override
    public boolean process(ProvaReagent prova, ProvaDerivationNode node,
                           ProvaGoal goal, List<ProvaLiteral> newLiterals, ProvaRule query) {
        ProvaLiteral literal = goal.getGoal();
        // Clone variables since unification is used in this method
        List<ProvaVariable> variables = query.cloneVariables();
        ProvaList terms = (ProvaList) literal.getTerms().cloneWithVariables(variables);
        ProvaObject[] data = terms.getFixed();
        if (data.length != 1 || !(data[0] instanceof ProvaList))
            return false;
        data = ((ProvaList) data[0]).getFixed();
        String symbol = ((ProvaConstant) data[0]).getObject().toString();
        ProvaRuleSet clauses = kb.getPredicates(symbol, data.length - 1);
        // TODO: Verify that all cases are covered
        return clauses.removeAllClausesByMatch(kb, data);
    }

}
