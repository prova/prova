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
import ws.prova.kernel2.ProvaVariablePtr;
import ws.prova.reference2.ProvaGlobalConstantImpl;
import ws.prova.agent2.ProvaReagent;

public class ProvaEqualsImpl extends ProvaBuiltinImpl {

	public ProvaEqualsImpl(ProvaKnowledgeBase kb) {
		super(kb,"equals");
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
			((ProvaVariable) lt).setAssigned(data[1]);
			return true;
		}
		ProvaObject rhs = data[1];
		if( rhs instanceof ProvaVariablePtr ) {
			ProvaVariablePtr varPtr = (ProvaVariablePtr) rhs;
			rhs = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
		}
		if( rhs instanceof ProvaVariable ) {
			((ProvaVariable) rhs).setAssigned(data[0]);
			return true;
		}
		if( lt instanceof ProvaConstant ) {
			ProvaConstant lhsConstant = (ProvaConstant) lt;
			if( rhs instanceof ProvaConstant ) {
				if( lhsConstant instanceof ProvaGlobalConstantImpl ) {
					((ProvaGlobalConstantImpl) lhsConstant).setObject(((ProvaConstant) rhs).getObject());
					return true;
				}
				return lhsConstant.getObject().equals(((ProvaConstant) rhs).getObject());
			}
			return false;
		}
		// TODO Deal with the case when LHS is a list
		return false;
	}

}
