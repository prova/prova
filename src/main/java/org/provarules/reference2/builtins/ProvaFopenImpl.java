package org.provarules.reference2.builtins;

import org.provarules.agent2.ProvaReagent;
import org.provarules.kernel2.*;
import org.provarules.reference2.ProvaConstantImpl;

import java.io.*;
import java.util.List;

public class ProvaFopenImpl extends ProvaBuiltinImpl {

    public ProvaFopenImpl(ProvaKnowledgeBase kb) {
        super(kb, "fopen");
    }

    @Override
    public boolean process(ProvaReagent prova, ProvaDerivationNode node,
                           ProvaGoal goal, List<ProvaLiteral> newLiterals, ProvaRule query) {
        ProvaLiteral literal = goal.getGoal();
        List<ProvaVariable> variables = query.getVariables();
        ProvaList terms = literal.getTerms();
        ProvaObject[] data = terms.getFixed();
        ProvaObject lt = data[0];
        if (lt instanceof ProvaVariablePtr) {
            ProvaVariablePtr varPtr = (ProvaVariablePtr) lt;
            lt = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
        }
        String filename = ((ProvaConstant) lt).getObject().toString();
        BufferedReader in;
        File file = new File(filename);

        if (!file.exists() || !file.canRead()) {
            try {
                in = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream(filename)));
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } else {
            FileReader fr;
            try {
                fr = new FileReader(file);
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
            in = new BufferedReader(fr);
        }
        ProvaObject res = data[1];
        if (res instanceof ProvaVariablePtr) {
            ProvaVariablePtr varPtr = (ProvaVariablePtr) res;
            res = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
        }
        ((ProvaVariable) res).setAssigned(ProvaConstantImpl.create(in));
        return true;
    }

}
