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

public class ProvaUnlistenImpl extends ProvaBuiltinImpl {

	public ProvaUnlistenImpl(ProvaKnowledgeBase kb) {
		super(kb,"unlisten");
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
		ProvaObject target = data[1];
		if( target instanceof ProvaVariablePtr ) {
			ProvaVariablePtr varPtr = (ProvaVariablePtr) target;
			target = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
		}
		if( !(target instanceof ProvaConstant) )
			return false;
		ProvaObject type = data[0];
		if( type instanceof ProvaVariablePtr ) {
			ProvaVariablePtr varPtr = (ProvaVariablePtr) type;
			type = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
		}
		if( !(type instanceof ProvaConstant) )
			return false;
		String strType = (String) ((ProvaConstant) type).getObject();
		Object objTarget = ((ProvaConstant) target).getObject();
		prova.getSwingAdaptor().unlisten(strType,objTarget);
		return true;
	}

}
