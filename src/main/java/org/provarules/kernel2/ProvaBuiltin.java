package org.provarules.kernel2;

import org.provarules.agent2.ProvaReagent;

import java.util.List;

public interface ProvaBuiltin extends ProvaPredicate {

    boolean process(ProvaReagent prova, ProvaDerivationNode node, ProvaGoal goal, List<ProvaLiteral> newLiterals, ProvaRule query);

    boolean process_(ProvaReagent prova, ProvaDerivationNode node,
                            ProvaGoal goal, List<ProvaLiteral> newLiterals, ProvaRule query);

}
