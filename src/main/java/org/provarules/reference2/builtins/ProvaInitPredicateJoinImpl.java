package org.provarules.reference2.builtins;

import org.provarules.agent2.ProvaReagent;
import org.provarules.kernel2.*;

import java.util.List;

public class ProvaInitPredicateJoinImpl extends ProvaBuiltinImpl {

    public ProvaInitPredicateJoinImpl(ProvaKnowledgeBase kb) {
        super(kb, "init_predicate_join");
    }

    @Override
    public boolean process(ProvaReagent prova, ProvaDerivationNode node,
                           ProvaGoal goal, List<ProvaLiteral> newLiterals, ProvaRule query) {
        ProvaLiteral literal = goal.getGoal();
        return prova.getWorkflows().init_predicate_join(literal, newLiterals, query);
    }

}
