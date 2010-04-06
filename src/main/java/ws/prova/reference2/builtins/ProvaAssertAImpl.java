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
import ws.prova.kernel2.ProvaVariable;

public class ProvaAssertAImpl extends ProvaBuiltinImpl {

	public ProvaAssertAImpl(ProvaKnowledgeBase kb) {
		super(kb, "asserta");
	}

	@Override
	public boolean process(ProvaReagent prova, ProvaDerivationNode node,
			ProvaGoal goal, List<ProvaLiteral> newLiterals, ProvaRule query) {
		ProvaLiteral literal = goal.getGoal();
		List<ProvaVariable> variables = query.getVariables();
		ProvaList terms = (ProvaList) literal.getTerms().cloneWithVariables(variables);
		ProvaObject[] data = terms.getFixed();
		if( data.length!=1 || !(data[0] instanceof ProvaList) )
			return false;
		String symbol = ((ProvaConstant) ((ProvaList) data[0]).getFixed()[0]).getObject().toString();
		ProvaLiteral lit = kb.generateLiteral(symbol, ((ProvaList) data[0]).getFixed(), 1);
		// This automatically adds the rule to the respective predicate in the knowledge base
		kb.generateRuleA(lit, new ProvaLiteral[] {});
		return true;
	}

	@Override
	public int getArity() {
		return 1;
	}

}
