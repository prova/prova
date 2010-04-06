package ws.prova.reference2.builtins;

import java.util.List;

import ws.prova.kernel2.ProvaDerivationNode;
import ws.prova.kernel2.ProvaGoal;
import ws.prova.kernel2.ProvaKnowledgeBase;
import ws.prova.kernel2.ProvaLiteral;
import ws.prova.kernel2.ProvaRule;
import ws.prova.agent2.ProvaReagent;

public class ProvaPredicateJoinTestImpl extends ProvaBuiltinImpl {

	public ProvaPredicateJoinTestImpl(ProvaKnowledgeBase kb) {
		super(kb,"predicate_join_test");
	}

	@Override
	public boolean process(ProvaReagent prova, ProvaDerivationNode node,
			ProvaGoal goal, List<ProvaLiteral> newLiterals, ProvaRule query) {
		ProvaLiteral literal = goal.getGoal();
		return prova.getWorkflows().predicate_join_test(literal, newLiterals, query);
	}

	@Override
	public int getArity() {
		return 8;
	}

}
