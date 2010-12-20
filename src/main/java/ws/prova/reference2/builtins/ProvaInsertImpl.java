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

public class ProvaInsertImpl extends ProvaBuiltinImpl {

	public ProvaInsertImpl(ProvaKnowledgeBase kb) {
		super(kb, "insert");
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
		ProvaLiteral lit = kb.generateLiteral(symbol, data, 1);
		// Remove a matching fact if it exists
		ProvaRuleSet clauses = kb.getPredicates(symbol,data.length-1);
		clauses.removeClausesByMatch(kb,data);
		// This automatically adds the rule to the respective predicate in the knowledge base
		kb.generateRule(lit, new ProvaLiteral[] {});
		return true;
	}

}
