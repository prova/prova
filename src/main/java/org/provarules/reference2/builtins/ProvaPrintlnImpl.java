package org.provarules.reference2.builtins;

import org.provarules.agent2.ProvaReagent;
import org.provarules.kernel2.*;

import java.io.PrintWriter;
import java.util.List;

public class ProvaPrintlnImpl extends ProvaBuiltinImpl {

    public ProvaPrintlnImpl(ProvaKnowledgeBase kb) {
        super(kb, "println");
    }

    @Override
    public boolean process(ProvaReagent prova, ProvaDerivationNode node,
                           ProvaGoal goal, List<ProvaLiteral> newLiterals, ProvaRule query) {
        ProvaLiteral literal = goal.getGoal();
        synchronized (this) {
            List<ProvaVariable> variables = query.getVariables();
            ProvaList terms = (ProvaList) literal.getTerms().cloneWithVariables(variables);
            ProvaObject[] data = terms.getFixed();
            if (data.length > 2)
                return false;
            PrintWriter writer = kb.getPrintWriter();
            String separator = "";
            if (data.length == 2)
                separator = data[1].toString(variables);
            if (data[0] instanceof ProvaList) {
                ProvaObject[] objs = ((ProvaList) data[0]).getFixed();
                for (int i = 0; i < objs.length; i++) {
                    if (i != 0)
                        writer.print(separator);
                    writer.print(objs[i].toString(variables));
                }
                writer.println("");
            }
        }
        return true;
    }

}
