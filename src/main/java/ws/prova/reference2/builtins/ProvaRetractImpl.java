package ws.prova.reference2.builtins;

import java.util.List;

import ws.prova.agent2.ProvaReagent;
import ws.prova.kernel2.ProvaConstant;
import ws.prova.kernel2.ProvaDerivationNode;
import ws.prova.kernel2.ProvaGoal;
import ws.prova.kernel2.ProvaKnowledgeBase;
import ws.prova.kernel2.ProvaList;
import ws.prova.kernel2.ProvaLiteral;
import ws.prova.kernel2.ProvaObject;
import ws.prova.kernel2.ProvaRule;
import ws.prova.kernel2.ProvaRuleSet;
import ws.prova.kernel2.ProvaVariable;

public class ProvaRetractImpl extends ProvaBuiltinImpl {

	public ProvaRetractImpl(ProvaKnowledgeBase kb) {
		super(kb, "retract");
	}

	@Override
	public boolean process(ProvaReagent prova, ProvaDerivationNode node,
			ProvaGoal goal, List<ProvaLiteral> newLiterals, ProvaRule query) {
		ProvaLiteral literal = goal.getGoal();
		// Clone variables since unification is used in this method
		List<ProvaVariable> variables = query.cloneVariables();
		ProvaList terms = (ProvaList) literal.getTerms().cloneWithVariables(variables);
		ProvaObject[] data = terms.getFixed();
		if( data.length!=1 || !(data[0] instanceof ProvaList) )
			return false;
		data = ((ProvaList) data[0]).getFixed();
		String symbol = ((ProvaConstant) data[0]).getObject().toString();
		ProvaRuleSet clauses = kb.getPredicates(symbol,data.length-1);
		// TODO: Verify that all cases are covered
		boolean retracted = clauses.removeClausesByMatch(kb,data);
		return retracted;
	}

	@Override
	public int getArity() {
		return 1;
	}

}
