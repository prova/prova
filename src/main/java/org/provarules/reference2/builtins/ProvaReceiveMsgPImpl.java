package org.provarules.reference2.builtins;

import org.provarules.agent2.ProvaReagent;
import org.provarules.kernel2.*;

import java.util.List;

public class ProvaReceiveMsgPImpl extends ProvaBuiltinImpl {

    public ProvaReceiveMsgPImpl(ProvaKnowledgeBase kb) {
        super(kb, "rcvMsgP");
    }

    @Override
    public boolean process(ProvaReagent prova, ProvaDerivationNode node,
                           ProvaGoal goal, List<ProvaLiteral> newLiterals, ProvaRule query) {
        return prova.getMessenger().rcvMsgP(goal, newLiterals, query, false);
    }

}
