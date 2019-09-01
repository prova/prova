package org.provarules.reference2.builtins;

import org.provarules.agent2.ProvaReagent;
import org.provarules.kernel2.*;

import java.util.List;

public class ProvaStopPredicateJoinImpl extends ProvaBuiltinImpl {

    public ProvaStopPredicateJoinImpl(ProvaKnowledgeBase kb) {
        super(kb, "stop_predicate_join");
    }

    @Override
    public boolean process(ProvaReagent prova, ProvaDerivationNode node,
                           ProvaGoal goal, List<ProvaLiteral> newLiterals, ProvaRule query) {
        ProvaLiteral literal = goal.getGoal();
        return prova.getWorkflows().stop_predicate_join(literal, newLiterals, query);
    }

}
