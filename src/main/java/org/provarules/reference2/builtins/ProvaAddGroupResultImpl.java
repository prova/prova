package org.provarules.reference2.builtins;

import org.provarules.agent2.ProvaReagent;
import org.provarules.kernel2.*;

import java.util.List;

public class ProvaAddGroupResultImpl extends ProvaBuiltinImpl {

    public ProvaAddGroupResultImpl(ProvaKnowledgeBase kb) {
        super(kb, "@add_group_result");
    }

    @Override
    public boolean process(ProvaReagent prova, ProvaDerivationNode node,
                           ProvaGoal goal, List<ProvaLiteral> newLiterals, ProvaRule query) {
        ProvaLiteral literal = goal.getGoal();
        ProvaList terms = literal.getTerms();
        synchronized (kb) {
            try {
                prova.getMessenger().addGroupResult(terms);
            } catch (Exception e) {
                // @TODO: throw exception, this will only be possible when Prova exceptions are back
                //        in the new version
                return false;
            }
            return true;
        }
    }

}
