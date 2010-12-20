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
import ws.prova.kernel2.ProvaVariablePtr;
import ws.prova.reference2.ProvaConstantImpl;

public class ProvaConcatImpl extends ProvaBuiltinImpl {

	public ProvaConcatImpl(ProvaKnowledgeBase kb) {
		super(kb,"concat");
	}

	@Override
	public boolean process(ProvaReagent prova, ProvaDerivationNode node,
			ProvaGoal goal, List<ProvaLiteral> newLiterals, ProvaRule query) {
		ProvaLiteral literal = goal.getGoal();
		List<ProvaVariable> variables = query.getVariables();
		ProvaList terms = literal.getTerms();
		ProvaObject[] data = terms.getFixed();
		if( data.length!=2 )
				return false;
		ProvaObject res = data[1];
		if( res instanceof ProvaVariablePtr ) {
			ProvaVariablePtr varPtr = (ProvaVariablePtr) res;
			res = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
		}
		if( !(res instanceof ProvaVariable) && !(res instanceof ProvaConstant) )
			return false;
		ProvaObject lt = data[0];
		if( lt instanceof ProvaVariablePtr ) {
			ProvaVariablePtr varPtr = (ProvaVariablePtr) lt;
			lt = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
		}
		if( !(lt instanceof ProvaList) )
			return false;
		ProvaObject[] args = ((ProvaList) ((ProvaList) lt).cloneWithVariables(variables)).getFixed();
		StringBuilder sb = new StringBuilder();
		for( int i=0; i<args.length; i++ ) {
			sb.append(args[i].toString());
		}

		if( res instanceof ProvaVariable )
			((ProvaVariable) res).setAssigned(ProvaConstantImpl.create(sb.toString()));
		else if( res instanceof ProvaConstant ) {
			return ((ProvaConstant) res).getObject().toString().equals(sb.toString());
		}
		return true;
	}

}
