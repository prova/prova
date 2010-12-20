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
import ws.prova.reference2.ProvaConstantImpl;
import ws.prova.reference2.ProvaGlobalConstantImpl;
import ws.prova.agent2.ProvaReagent;

public class ProvaEqualsMinusImpl extends ProvaBuiltinImpl {

	public ProvaEqualsMinusImpl(ProvaKnowledgeBase kb) {
		super(kb,"equals_minus");
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
		ProvaObject rhs = data[1];
		if( rhs instanceof ProvaVariablePtr ) {
			ProvaVariablePtr varPtr = (ProvaVariablePtr) rhs;
			rhs = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
		}
		if( !(rhs instanceof ProvaConstant) )
			return false;
		Object o = ((ProvaConstant) rhs).getObject();
		Object n = null;
		if( !(o instanceof Number) )
			return false;
		if( o instanceof Byte ) {
			byte m = ((Byte) o);
			n = (byte) ~m;
		} else if( o instanceof Integer ) {
			int m = ((Integer) o);
			n = -m;
		} else if( o instanceof Long ) {
			long m = ((Long) o);
			n = -m;
		} else if( o instanceof Float ) {
			float m = ((Float) o);
			n = -m;
		} else if( o instanceof Double ) {
			Double m = ((Double) o);
			n = -m;
		}
		ProvaObject lt = data[0];
		if( lt instanceof ProvaVariablePtr ) {
			ProvaVariablePtr varPtr = (ProvaVariablePtr) lt;
			lt = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
		}
		if( lt instanceof ProvaVariable ) {
			((ProvaVariable) lt).setAssigned(ProvaConstantImpl.create(n));
			return true;
		}
		if( lt instanceof ProvaConstant ) {
			ProvaConstant lhsConstant = (ProvaConstant) lt;
			if( lhsConstant instanceof ProvaGlobalConstantImpl ) {
				((ProvaGlobalConstantImpl) lhsConstant).setObject(n);
				return true;
			}
			return lhsConstant.getObject().equals(n);
		}
		return true;
	}

}
