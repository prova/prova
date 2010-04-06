package ws.prova.reference2.builtins;

import java.util.List;

import ws.prova.kernel2.ProvaConstant;
import ws.prova.kernel2.ProvaDerivationNode;
import ws.prova.kernel2.ProvaGoal;
import ws.prova.kernel2.ProvaKnowledgeBase;
import ws.prova.kernel2.ProvaList;
import ws.prova.kernel2.ProvaLiteral;
import ws.prova.kernel2.ProvaObject;
import ws.prova.kernel2.ProvaRule;
import ws.prova.kernel2.ProvaVariable;
import ws.prova.agent2.ProvaReagent;

public class ProvaGreaterEqualImpl extends ProvaBuiltinImpl {

	public ProvaGreaterEqualImpl(ProvaKnowledgeBase kb) {
		super(kb,"ge");
	}

	@Override
	public boolean process(ProvaReagent prova, ProvaDerivationNode node,
			ProvaGoal goal, List<ProvaLiteral> newLiterals, ProvaRule query) {
		ProvaLiteral literal = goal.getGoal();
		List<ProvaVariable> variables = query.getVariables();
		ProvaList terms = (ProvaList) literal.getTerms().cloneWithVariables(variables);
		ProvaObject[] data = terms.getFixed();
		if( data.length<2 
				|| !(data[0] instanceof ProvaConstant) 
				|| !(((ProvaConstant) data[0]).getObject() instanceof Number) )
			return false;
		double left = ((Number) ((ProvaConstant) data[0]).getObject()).doubleValue();
		for( int i=1; i<data.length; i++ ) {
			if( !(((ProvaConstant) data[i]).getObject() instanceof Number) )
				return false;
			double right = ((Number) ((ProvaConstant) data[i]).getObject()).doubleValue();
			if( left<right )
				return false;
		}
		return true;
	}

	@Override
	public int getArity() {
		return -1;
	}

}
