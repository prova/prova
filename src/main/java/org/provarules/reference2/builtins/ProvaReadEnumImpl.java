package org.provarules.reference2.builtins;

import org.provarules.agent2.ProvaReagent;
import org.provarules.kernel2.*;
import org.provarules.reference2.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

public class ProvaReadEnumImpl extends ProvaBuiltinImpl {

    public ProvaReadEnumImpl(ProvaKnowledgeBase kb) {
        super(kb, "read_enum");
    }

    @Override
    public boolean process(ProvaReagent prova, ProvaDerivationNode node,
                           ProvaGoal goal, List<ProvaLiteral> newLiterals, ProvaRule query) {
        ProvaLiteral literal = goal.getGoal();
        List<ProvaVariable> variables = query.getVariables();
        ProvaList terms = literal.getTerms();
        ProvaObject[] data = terms.getFixed();
        if (data.length != 2)
            return false;
        ProvaObject lt = data[0];
        if (lt instanceof ProvaVariablePtr) {
            ProvaVariablePtr varPtr = (ProvaVariablePtr) lt;
            lt = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
        }
        if (!(lt instanceof ProvaConstant))
            return false;
        Object o = ((ProvaConstant) lt).getObject();
        if (!(o instanceof BufferedReader))
            return false;
        BufferedReader in = (BufferedReader) o;
        ProvaObject out = data[1];
        if (out instanceof ProvaVariablePtr) {
            ProvaVariablePtr varPtr = (ProvaVariablePtr) out;
            out = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
        }
        if (!(out instanceof ProvaVariable) && !(out instanceof ProvaConstant))
            return false;
        String s = null;
        ProvaPredicate pred = null;
        if (out instanceof ProvaVariable) {
            // Make sure the unification is done between the result and the original subgoal
            pred = new ProvaPredicateImpl("", 2, kb);
        } else if (out instanceof ProvaConstant) {
            s = out.toString();
        }
        String line;
        try {
            while ((line = in.readLine()) != null) {
                if (pred != null) {
                    ProvaList ls = ProvaListImpl.create(
                            new ProvaObject[]{data[0], ProvaConstantImpl.create(line)});
                    ProvaLiteral lit = new ProvaLiteralImpl(pred, ls);
                    ProvaRule clause = ProvaRuleImpl.createVirtualRule(1, lit, null);
                    pred.addClause(clause);
                } else if (line.equals(s)) {
                    return true;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        ProvaLiteral newLiteral = new ProvaLiteralImpl(pred, terms);
        newLiterals.add(newLiteral);
        return true;
    }

}
