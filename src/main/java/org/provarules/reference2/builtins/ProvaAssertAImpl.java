package org.provarules.reference2.builtins;

import org.provarules.agent2.ProvaReagent;
import org.provarules.kernel2.*;

import java.util.List;

public class ProvaAssertAImpl extends ProvaBuiltinImpl {

    public ProvaAssertAImpl(ProvaKnowledgeBase kb) {
        super(kb, "asserta");
    }

    @Override
    public boolean process(ProvaReagent prova, ProvaDerivationNode node,
                           ProvaGoal goal, List<ProvaLiteral> newLiterals, ProvaRule query) {
        ProvaLiteral literal = goal.getGoal();
        List<ProvaVariable> variables = query.getVariables();
        ProvaList terms = (ProvaList) literal.getTerms().cloneWithVariables(variables);
        ProvaObject[] data = terms.getFixed();
        if (data.length != 1 || !(data[0] instanceof ProvaList))
            return false;
        String symbol = ((ProvaConstant) ((ProvaList) data[0]).getFixed()[0]).getObject().toString();
        ProvaLiteral lit = kb.generateLiteral(symbol, ((ProvaList) data[0]).getFixed(), 1);
        // This automatically adds the rule to the respective predicate in the knowledge base
        kb.generateRuleA(lit, new ProvaLiteral[]{});
        return true;
    }

}
