package org.provarules.reference2.builtins;

import org.provarules.agent2.ProvaReagent;
import org.provarules.kernel2.*;

import java.util.List;

public class ProvaCutImpl extends ProvaBuiltinImpl {

    public ProvaCutImpl(ProvaKnowledgeBase kb, String symbol) {
        super(kb, symbol);
    }

    @Override
    public boolean process(ProvaReagent prova, ProvaDerivationNode node,
                           ProvaGoal goal, List<ProvaLiteral> newLiterals, ProvaRule query) {
        return false;
    }

    @Override
    public String getSymbol() {
        return "cut";
    }

}
