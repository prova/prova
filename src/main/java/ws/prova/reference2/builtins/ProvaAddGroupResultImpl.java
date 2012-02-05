package ws.prova.reference2.builtins;

import java.util.List;

import ws.prova.agent2.ProvaReagent;
import ws.prova.kernel2.ProvaDerivationNode;
import ws.prova.kernel2.ProvaGoal;
import ws.prova.kernel2.ProvaKnowledgeBase;
import ws.prova.kernel2.ProvaList;
import ws.prova.kernel2.ProvaLiteral;
import ws.prova.kernel2.ProvaRule;

public class ProvaAddGroupResultImpl extends ProvaBuiltinImpl {

	public ProvaAddGroupResultImpl(ProvaKnowledgeBase kb) {
		super(kb, "@add_group_result");
	}

	@Override
	public boolean process(ProvaReagent prova, ProvaDerivationNode node,
			ProvaGoal goal, List<ProvaLiteral> newLiterals, ProvaRule query) {
		ProvaLiteral literal = goal.getGoal();
		ProvaList terms = (ProvaList) literal.getTerms();
		synchronized(kb) {
			try {
				prova.getMessenger().addGroupResult(terms);
			} catch (Exception e) {
				// @TODO: throw exception, this will only be possible when Prova exceptions are back
				//        in the new version
				return false;
			}
			return true;
		}
	}

}
