package org.provarules.reference2.builtins;

import org.provarules.agent2.ProvaReagent;
import org.provarules.kernel2.*;

import java.util.List;

public class ProvaInitJoinImpl extends ProvaBuiltinImpl {

    public ProvaInitJoinImpl(ProvaKnowledgeBase kb) {
        super(kb, "init_join");
    }

    @Override
    public boolean process(ProvaReagent prova, ProvaDerivationNode node,
                           ProvaGoal goal, List<ProvaLiteral> newLiterals, ProvaRule query) {
        ProvaLiteral literal = goal.getGoal();
        return prova.getWorkflows().init_join(literal, newLiterals, query);
    }

}
