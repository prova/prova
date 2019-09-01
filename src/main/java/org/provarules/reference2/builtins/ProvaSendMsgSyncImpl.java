package org.provarules.reference2.builtins;

import org.provarules.agent2.ProvaReagent;
import org.provarules.kernel2.*;

import java.util.List;

public class ProvaSendMsgSyncImpl extends ProvaBuiltinImpl {

    public ProvaSendMsgSyncImpl(ProvaKnowledgeBase kb) {
        super(kb, "sendMsgSync");
    }

    @Override
    public boolean process(ProvaReagent prova, ProvaDerivationNode node,
                           ProvaGoal goal, List<ProvaLiteral> newLiterals, ProvaRule query) {
        ProvaLiteral literal = goal.getGoal();
        return prova.getMessenger().prepareMsg(literal, newLiterals, query);
    }

}
