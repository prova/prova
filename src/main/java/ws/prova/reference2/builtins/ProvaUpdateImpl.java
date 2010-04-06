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
import ws.prova.reference2.builtins.target.ProvaTarget;

public class ProvaUpdateImpl extends ProvaBuiltinImpl {

	public ProvaUpdateImpl(ProvaKnowledgeBase kb) {
		super(kb,"update");
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
		ProvaTarget ptr = null;
		Object rt = data[1];
		if( rt instanceof ProvaVariablePtr ) {
			ProvaVariablePtr varPtr = (ProvaVariablePtr) rt;
			ProvaObject o = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
			if( o instanceof ProvaConstant )
				rt = o;
		}
		if( !(rt instanceof ProvaConstant) )
			return false;
		ptr = (ProvaTarget) ((ProvaConstant) rt).getObject();
		ProvaObject lt = data[0];
		if( lt instanceof ProvaVariablePtr ) {
			ProvaVariablePtr varPtr = (ProvaVariablePtr) lt;
			ProvaObject o = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
			if( !(o instanceof ProvaVariable) )
				lt = o;
		}
		if( !(lt instanceof ProvaList) )
			return false;
		ProvaList newList = (ProvaList) ((ProvaList) lt).cloneWithVariables(variables, 1);
		ptr.getCandidate().getHead().setTerms(newList);
		return true;
	}

	@Override
	public int getArity() {
		return 2;
	}

}
