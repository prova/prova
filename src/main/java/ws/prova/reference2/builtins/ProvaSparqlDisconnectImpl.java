package ws.prova.reference2.builtins;

import java.util.List;

import ws.prova.agent2.ProvaReagent;
import ws.prova.kernel2.ProvaDerivationNode;
import ws.prova.kernel2.ProvaGoal;
import ws.prova.kernel2.ProvaKnowledgeBase;
import ws.prova.kernel2.ProvaLiteral;
import ws.prova.kernel2.ProvaRule;

public class ProvaSparqlDisconnectImpl extends ProvaBuiltinImpl {

	public ProvaSparqlDisconnectImpl(ProvaKnowledgeBase kb) {
		super(kb, "sparql_disconnect");
	}
	
	@Override
	public int getArity() {
		return 1;
	}

	@Override
	public boolean process(ProvaReagent prova, ProvaDerivationNode node,
			ProvaGoal goal, List<ProvaLiteral> newLiterals, ProvaRule query) {
		// TODO Auto-generated method stub
		return false;
	}

}
