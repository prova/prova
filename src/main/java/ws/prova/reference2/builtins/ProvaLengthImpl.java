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
import ws.prova.reference2.ProvaConstantImpl;

public class ProvaLengthImpl extends ProvaBuiltinImpl {

	public ProvaLengthImpl(ProvaKnowledgeBase kb) {
		super(kb,"length");
	}

	/**
	 * Find the length of a rest-less list.
	 * So far, this does not work as a generator of a list given its length.
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
		if( out instanceof ProvaConstant ) {
			Object o = ((ProvaConstant) out).getObject();
			if( !(o instanceof Integer) )
				return false;
			return list.getFixed().length == (Integer) o;
		}
		if( out instanceof ProvaVariable ) {
			((ProvaVariable) out).setAssigned(ProvaConstantImpl.create(list.getFixed().length));
			return true;
		}
		return false;
	}

	@Override
	public int getArity() {
		return 2;
	}

}
