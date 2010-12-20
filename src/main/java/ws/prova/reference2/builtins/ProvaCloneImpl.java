package ws.prova.reference2.builtins;

import java.util.List;

import ws.prova.agent2.ProvaReagent;
import ws.prova.kernel2.ProvaDerivationNode;
import ws.prova.kernel2.ProvaGoal;
import ws.prova.kernel2.ProvaKnowledgeBase;
import ws.prova.kernel2.ProvaList;
import ws.prova.kernel2.ProvaLiteral;
import ws.prova.kernel2.ProvaObject;
import ws.prova.kernel2.ProvaPredicate;
import ws.prova.kernel2.ProvaRule;
import ws.prova.kernel2.ProvaVariable;
import ws.prova.reference2.ProvaListImpl;
import ws.prova.reference2.ProvaLiteralImpl;
import ws.prova.reference2.ProvaPredicateImpl;
import ws.prova.reference2.ProvaRuleImpl;

public class ProvaCloneImpl extends ProvaBuiltinImpl {

	public ProvaCloneImpl(ProvaKnowledgeBase kb) {
		super(kb,"clone");
	}

	@Override
	public boolean process(ProvaReagent prova, ProvaDerivationNode node,
			ProvaGoal goal, List<ProvaLiteral> newLiterals, ProvaRule query) {
		ProvaLiteral literal = goal.getGoal();
		List<ProvaVariable> variables = query.getVariables();
		ProvaList terms0 = literal.getTerms();
		ProvaObject[] data = terms0.getFixed();
		if( data.length!=2 )
			return false;
		ProvaObject rt = data[1];
		data[1] = ProvaListImpl.emptyRList;
		ProvaList terms = (ProvaList) terms0.cloneWithVariables(variables);
		ProvaPredicate pred = new ProvaPredicateImpl("",1,kb);
		ProvaList ls = ProvaListImpl.create( new ProvaObject[] {terms.getFixed()[0]} );
		ProvaLiteral lit = new ProvaLiteralImpl(pred,ls);
		ProvaRule clause = ProvaRuleImpl.createVirtualRule(1, lit, null);
		pred.addClause(clause);
		ProvaList ltls = ProvaListImpl.create( new ProvaObject[] {rt} );
		ProvaLiteral newLiteral = new ProvaLiteralImpl(pred,ltls);
		newLiterals.add(newLiteral);
		return true;
	}

}
