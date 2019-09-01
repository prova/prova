package org.provarules.reference2.builtins;

import org.provarules.agent2.ProvaReagent;
import org.provarules.kernel2.*;

import java.util.List;

public class ProvaSendMsgImpl extends ProvaBuiltinImpl {

    public ProvaSendMsgImpl(ProvaKnowledgeBase kb) {
        super(kb, "sendMsg");
    }

    @Override
    public boolean process(ProvaReagent prova, ProvaDerivationNode node,
                           ProvaGoal goal, List<ProvaLiteral> newLiterals, ProvaRule query) {
        ProvaLiteral literal = goal.getGoal();
        return prova.getMessenger().sendMsg(literal, newLiterals, query);
    }

}
