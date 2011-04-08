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
import ws.prova.reference2.ProvaListImpl;
import ws.prova.reference2.ProvaVariableImpl;

public class ProvaLengthImpl extends ProvaBuiltinImpl {

	public ProvaLengthImpl(ProvaKnowledgeBase kb) {
		super(kb,"length");
	}

	/**
	 * Find the length of a rest-less list.
	 * If the supplied list is a free variable but the length is given, generate a list of this length.
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
		if( lt instanceof ProvaVariable ) {
			ProvaObject out = data[1];
			if( !(out instanceof ProvaConstant) )
				return false;
			Object olen = ((ProvaConstant) out).getObject();
			if( !(olen instanceof Integer) )
				return false;
			int len = (Integer) olen;
			// Generate a list given its length
			ProvaObject[] fixed = new ProvaObject[len];
			for( int i=0; i<len; i++ ) {
				fixed[i] = kb.generateVariable("");
			}
			ProvaList newList = ProvaListImpl.create(fixed, null);
			((ProvaVariable) lt).setAssigned(newList);
			return true;
		}
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

}
