package org.provarules.reference2.builtins;

import org.provarules.agent2.ProvaReagent;
import org.provarules.kernel2.*;

import java.util.List;

public class ProvaFailImpl extends ProvaBuiltinImpl {

    public ProvaFailImpl(ProvaKnowledgeBase kb) {
        super(kb, "fail");
    }

    @Override
    public boolean process(ProvaReagent prova, ProvaDerivationNode node,
                           ProvaGoal goal, List<ProvaLiteral> newLiterals, ProvaRule query) {
        return false;
    }

    @Override
    public int getArity() {
        return 0;
    }

}
