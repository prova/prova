package org.provarules.reference2.builtins;

import org.provarules.agent2.ProvaReagent;
import org.provarules.exchange.ProvaSolution;
import org.provarules.exchange.impl.ProvaSolutionImpl;
import org.provarules.kernel2.*;

import java.io.PrintWriter;
import java.util.List;

public class ProvaSolveImpl extends ProvaBuiltinImpl {

    public ProvaSolveImpl(ProvaKnowledgeBase kb) {
        super(kb, "solve");
    }

    @Override
    public boolean process(ProvaReagent prova, ProvaDerivationNode node,
                           ProvaGoal goal, List<ProvaLiteral> newLiterals, ProvaRule query) {
        ProvaLiteral literal = goal.getGoal();
        List<ProvaVariable> variables = query.getVariables();
        ProvaList terms = (ProvaList) literal.getTerms().cloneWithVariables(variables);
        ProvaResultSet resultSet = null;
        ProvaSolution solution = null;
        int offset = 0;
        if (terms.getFixed().length != 0 && terms.getFixed()[0] instanceof ProvaConstant) {
            offset = 1;
            resultSet = (ProvaResultSet) ((ProvaConstant) terms.getFixed()[0]).getObject();
            solution = new ProvaSolutionImpl();
        }
        StringBuilder sb = new StringBuilder();
        // Iterate over variable (name,value) pairs
        for (int i = offset; i < terms.getFixed().length; i++) {
            ProvaList nv = (ProvaList) terms.getFixed()[i];
            if (i != offset)
                sb.append(", ");
            final String name = nv.getFixed()[0].toString().replaceAll("\'", "");
            sb.append(name);
            sb.append('=');
            Object value = nv.getFixed()[1];
            if (value instanceof ProvaVariablePtr) {
                ProvaVariablePtr varPtr = (ProvaVariablePtr) value;
                value = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
            }
            sb.append(value);
            if (solution != null) {
                solution.add(name, value);
            }
        }
        // This goes to whatever output is chosen
        PrintWriter writer = kb.getPrintWriter();
        if (sb.length() == 0)
            writer.println("yes");
        else
            writer.println(sb);
        if (resultSet != null)
            resultSet.add(solution);
        return false;
    }

}
