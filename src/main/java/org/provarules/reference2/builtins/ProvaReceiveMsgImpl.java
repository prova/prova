package org.provarules.reference2.builtins;

import org.provarules.agent2.ProvaReagent;
import org.provarules.kernel2.*;

import java.util.List;

public class ProvaReceiveMsgImpl extends ProvaBuiltinImpl {

    public ProvaReceiveMsgImpl(ProvaKnowledgeBase kb) {
        super(kb, "rcvMsg");
    }

    @Override
    public boolean process(ProvaReagent prova, ProvaDerivationNode node,
                           ProvaGoal goal, List<ProvaLiteral> newLiterals, ProvaRule query) {
        return prova.getMessenger().rcvMsg(goal, newLiterals, query, false);
    }

}
