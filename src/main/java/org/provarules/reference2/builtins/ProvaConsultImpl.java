package org.provarules.reference2.builtins;

import org.provarules.agent2.ProvaReagent;
import org.provarules.exchange.ProvaSolution;
import org.provarules.kernel2.*;

import java.io.BufferedReader;
import java.io.StringReader;
import java.util.List;

public class ProvaConsultImpl extends ProvaBuiltinImpl {

    public ProvaConsultImpl(ProvaKnowledgeBase kb) {
        super(kb, "consult");
    }

    @Override
    public boolean process(ProvaReagent prova, ProvaDerivationNode node,
                           ProvaGoal goal, List<ProvaLiteral> newLiterals, ProvaRule query) {
        ProvaLiteral literal = goal.getGoal();
        List<ProvaVariable> variables = query.getVariables();
        ProvaList terms = (ProvaList) literal.getTerms().cloneWithVariables(variables);
        ProvaObject[] data = terms.getFixed();
        if (data.length != 1)
            return false;
        ProvaObject source = data[0];
        if (data[0] instanceof ProvaVariablePtr) {
            ProvaVariablePtr varPtr = (ProvaVariablePtr) data[0];
            source = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
        }
        if (!(source instanceof ProvaConstant)) {
            return false;
        }
        Object rules = ((ProvaConstant) source).getObject();
        @SuppressWarnings("unused")
        List<ProvaSolution[]> resultSets = null;
        try {
            if (rules instanceof String) {
                resultSets = kb.consultSyncInternal(prova, (String) rules, (String) rules, null);
            } else if (rules instanceof BufferedReader) {
                resultSets = kb.consultSyncInternal(prova, (BufferedReader) rules, "-1", null);
            } else if (rules instanceof StringBuffer) {
                StringReader sr = new StringReader(((StringBuffer) rules).toString());
                BufferedReader in = new BufferedReader(sr);
                resultSets = kb.consultSyncInternal(prova, in, "-1", null);
            }
            return true;
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
