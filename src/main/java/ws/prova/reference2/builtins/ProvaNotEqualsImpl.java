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

public class ProvaNotEqualsImpl extends ProvaBuiltinImpl {

	public ProvaNotEqualsImpl(ProvaKnowledgeBase kb) {
		super(kb,"ne");
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
		ProvaObject lt = data[0];
		if( lt instanceof ProvaVariablePtr ) {
			ProvaVariablePtr varPtr = (ProvaVariablePtr) lt;
			lt = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
		}
		if( lt instanceof ProvaVariable ) {
			return false;
		}
		ProvaObject rhs = data[1];
		if( rhs instanceof ProvaVariablePtr ) {
			ProvaVariablePtr varPtr = (ProvaVariablePtr) rhs;
			rhs = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
		}
		if( rhs instanceof ProvaVariable ) {
			return false;
		}
		if( lt instanceof ProvaConstant ) {
			ProvaConstant lhsConstant = (ProvaConstant) lt;
			if( rhs instanceof ProvaConstant ) {
				return !lhsConstant.getObject().equals(((ProvaConstant) rhs).getObject());
			}
			return true;
		}
		// TODO Deal with the case when LHS is a list
		return true;
	}

}
