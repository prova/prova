package ws.prova.reference2.builtins;

import java.util.List;

import ws.prova.agent2.ProvaReagent;
import ws.prova.kernel2.ProvaDerivationNode;
import ws.prova.kernel2.ProvaGoal;
import ws.prova.kernel2.ProvaKnowledgeBase;
import ws.prova.kernel2.ProvaLiteral;
import ws.prova.kernel2.ProvaRule;

public class ProvaReceiveMsgPImpl extends ProvaBuiltinImpl {

	public ProvaReceiveMsgPImpl(ProvaKnowledgeBase kb) {
		super(kb,"rcvMsgP");
	}

	@Override
	public boolean process(ProvaReagent prova, ProvaDerivationNode node,
			ProvaGoal goal, List<ProvaLiteral> newLiterals, ProvaRule query) {
		return prova.getMessenger().rcvMsgP(goal, newLiterals, query, false);
	}

	@Override
	public int getArity() {
		return 5;
	}

}
