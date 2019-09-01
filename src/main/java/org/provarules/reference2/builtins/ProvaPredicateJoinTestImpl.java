package org.provarules.reference2.builtins;

import org.provarules.agent2.ProvaReagent;
import org.provarules.kernel2.*;

import java.util.List;

public class ProvaPredicateJoinTestImpl extends ProvaBuiltinImpl {

    public ProvaPredicateJoinTestImpl(ProvaKnowledgeBase kb) {
        super(kb, "predicate_join_test");
    }

    @Override
    public boolean process(ProvaReagent prova, ProvaDerivationNode node,
                           ProvaGoal goal, List<ProvaLiteral> newLiterals, ProvaRule query) {
        ProvaLiteral literal = goal.getGoal();
        return prova.getWorkflows().predicate_join_test(literal, newLiterals, query);
    }

}
