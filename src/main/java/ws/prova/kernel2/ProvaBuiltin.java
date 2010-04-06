package ws.prova.kernel2;

import java.util.List;

import ws.prova.agent2.ProvaReagent;

public interface ProvaBuiltin extends ProvaPredicate {

	public boolean process(ProvaReagent prova, ProvaDerivationNode node, ProvaGoal goal, List<ProvaLiteral> newLiterals, ProvaRule query);

	public boolean process_(ProvaReagent prova, ProvaDerivationNode node,
			ProvaGoal goal, List<ProvaLiteral> newLiterals, ProvaRule query);
	
}
