package ws.prova.reference2.builtins;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import ws.prova.agent2.ProvaReagent;
import ws.prova.kernel2.ProvaDerivationNode;
import ws.prova.kernel2.ProvaGoal;
import ws.prova.kernel2.ProvaKnowledgeBase;
import ws.prova.kernel2.ProvaList;
import ws.prova.kernel2.ProvaLiteral;
import ws.prova.kernel2.ProvaObject;
import ws.prova.kernel2.ProvaRule;
import ws.prova.kernel2.ProvaVariable;
import ws.prova.reference2.ProvaListImpl;

public class ProvaReverseImpl extends ProvaBuiltinImpl {

	public ProvaReverseImpl(ProvaKnowledgeBase kb) {
		super(kb,"reverse");
	}

	/**
	 * Find the reverse of a rest-less list.
	 * The output list must be a free variable.
	 */
	@Override
	public boolean process(ProvaReagent prova, ProvaDerivationNode node,
			ProvaGoal goal, List<ProvaLiteral> newLiterals, ProvaRule query) {
		ProvaLiteral literal = goal.getGoal();
		List<ProvaVariable> variables = query.getVariables();
		ProvaList terms = (ProvaList) literal.getTerms().cloneWithVariables(variables);
		ProvaObject[] data = terms.getFixed();
		if( data.length!=2 )
			return false;
		ProvaObject lt = data[0];
		if( !(lt instanceof ProvaList) )
			return false;
		ProvaList list = (ProvaList) lt;
		if( list.getTail() instanceof ProvaVariable )
			return false;
		
		ProvaObject out = data[1];
		if( out instanceof ProvaVariable ) {
			List<ProvaObject> jlist = Arrays.asList(list.getFixed());
			Collections.reverse(jlist);
			((ProvaVariable) out).setAssigned(ProvaListImpl.create(jlist) );
			return true;
		}
		return false;
	}

	@Override
	public int getArity() {
		return 2;
	}

}
