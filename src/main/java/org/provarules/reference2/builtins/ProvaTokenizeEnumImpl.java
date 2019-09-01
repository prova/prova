package org.provarules.reference2.builtins;

import org.provarules.agent2.ProvaReagent;
import org.provarules.kernel2.*;
import org.provarules.reference2.*;

import java.util.List;

public class ProvaTokenizeEnumImpl extends ProvaBuiltinImpl {

    public ProvaTokenizeEnumImpl(ProvaKnowledgeBase kb) {
        super(kb, "tokenize_enum");
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
        ProvaObject n_out = data[1];
        if (n_out instanceof ProvaVariablePtr) {
            ProvaVariablePtr varPtr = (ProvaVariablePtr) n_out;
            n_out = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
        }
        ProvaObject lt = data[0];
        if (lt instanceof ProvaVariablePtr) {
            ProvaVariablePtr varPtr = (ProvaVariablePtr) lt;
            lt = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
        }
        if (!(lt instanceof ProvaList))
            return false;
        ProvaObject[] args = ((ProvaList) lt.cloneWithVariables(variables)).getFixed();
        if (args.length != 2)
            return false;
        String in = args[0].toString();
        ProvaObject sep = args[1];
        if (sep instanceof ProvaVariablePtr) {
            ProvaVariablePtr varPtr = (ProvaVariablePtr) sep;
            sep = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
        }
        String delim = sep.toString();
        String[] tokens = in.split(delim);
        // Make sure the unification is done between the result and the original subgoal
        ProvaPredicate pred = new ProvaPredicateImpl("", 2, kb);
        for (String token : tokens) {
            ProvaList ls = ProvaListImpl.create(
                    new ProvaObject[]{data[0], ProvaConstantImpl.create(token)});
            ProvaLiteral lit = new ProvaLiteralImpl(pred, ls);
            ProvaRule clause = ProvaRuleImpl.createVirtualRule(1, lit, null);
            pred.addClause(clause);
        }
        ProvaLiteral newLiteral = new ProvaLiteralImpl(pred, terms);
        newLiterals.add(newLiteral);
        return true;
    }

}
