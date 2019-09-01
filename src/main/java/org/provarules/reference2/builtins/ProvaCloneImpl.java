package org.provarules.reference2.builtins;

import org.provarules.agent2.ProvaReagent;
import org.provarules.kernel2.*;
import org.provarules.reference2.ProvaListImpl;
import org.provarules.reference2.ProvaLiteralImpl;
import org.provarules.reference2.ProvaPredicateImpl;
import org.provarules.reference2.ProvaRuleImpl;

import java.util.List;

public class ProvaCloneImpl extends ProvaBuiltinImpl {

    public ProvaCloneImpl(ProvaKnowledgeBase kb) {
        super(kb, "clone");
    }

    @Override
    public boolean process(ProvaReagent prova, ProvaDerivationNode node,
                           ProvaGoal goal, List<ProvaLiteral> newLiterals, ProvaRule query) {
        ProvaLiteral literal = goal.getGoal();
        List<ProvaVariable> variables = query.getVariables();
        ProvaList terms0 = literal.getTerms();
        ProvaObject[] data = terms0.getFixed();
        if (data.length != 2)
            return false;
        ProvaObject rt = data[1];
        data[1] = ProvaListImpl.emptyRList;
        ProvaList terms = (ProvaList) terms0.cloneWithVariables(variables);
        ProvaPredicate pred = new ProvaPredicateImpl("", 1, kb);
        ProvaList ls = ProvaListImpl.create(new ProvaObject[]{terms.getFixed()[0]});
        ProvaLiteral lit = new ProvaLiteralImpl(pred, ls);
        ProvaRule clause = ProvaRuleImpl.createVirtualRule(1, lit, null);
        pred.addClause(clause);
        ProvaList ltls = ProvaListImpl.create(new ProvaObject[]{rt});
        ProvaLiteral newLiteral = new ProvaLiteralImpl(pred, ltls);
        newLiterals.add(newLiteral);
        return true;
    }

}
