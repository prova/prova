package org.provarules.reference2.builtins;

import org.provarules.agent2.ProvaReagent;
import org.provarules.kernel2.*;
import org.provarules.reference2.*;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProvaCaptureEnumImpl extends ProvaBuiltinImpl {

    public ProvaCaptureEnumImpl(ProvaKnowledgeBase kb) {
        super(kb, "capture_enum");
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
        if (!(lt instanceof ProvaList))
            return false;
        ProvaObject[] args = ((ProvaList) lt.cloneWithVariables(variables)).getFixed();
        if (args.length != 2)
            return false;
        String in = args[0].toString();
        String regexp = args[1].toString();
        Pattern p = Pattern.compile(regexp);
        Matcher m = p.matcher(in);
        ProvaPredicate pred = new ProvaPredicateImpl("", 1, kb);
        while (m.find()) {
            ProvaObject[] newFixed = new ProvaObject[m.groupCount()];
            for (int i = 1; i <= m.groupCount(); i++) {
                newFixed[i - 1] = ProvaConstantImpl.create(m.group(i));
            }
            ProvaList groups = ProvaListImpl.create(newFixed);
            ProvaList ls = ProvaListImpl.create(new ProvaObject[]{groups});
            ProvaLiteral lit = new ProvaLiteralImpl(pred, ls);
            ProvaRule clause = ProvaRuleImpl.createVirtualRule(1, lit, null);
            pred.addClause(clause);
        }
        ProvaList ltls = ProvaListImpl.create(new ProvaObject[]{data[1]});
        ProvaLiteral newLiteral = new ProvaLiteralImpl(pred, ltls);
        newLiterals.add(newLiteral);
        return true;
    }

}
