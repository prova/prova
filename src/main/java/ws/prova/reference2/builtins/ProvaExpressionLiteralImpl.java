package ws.prova.reference2.builtins;

import java.util.List;

import ws.prova.agent2.ProvaReagent;
import ws.prova.kernel2.ProvaComputable;
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
import ws.prova.reference2.operators.ProvaBinaryOperator;

public class ProvaExpressionLiteralImpl extends ProvaBuiltinImpl {

	public ProvaExpressionLiteralImpl(ProvaKnowledgeBase kb) {
		super(kb,"expr_literal");
	}

	@Override
	public boolean process(ProvaReagent prova, ProvaDerivationNode node,
			ProvaGoal goal, List<ProvaLiteral> newLiterals, ProvaRule query) {
		ProvaLiteral literal = goal.getGoal();
		List<ProvaVariable> variables = query.getVariables();
		ProvaList terms = (ProvaList) literal.getTerms().cloneWithVariables(variables);
		ProvaObject[] data = terms.getFixed();
		if( data.length!=3 )
			return false;
		// Main binary operator
		ProvaObject lt = data[0];
		if( lt instanceof ProvaVariablePtr ) {
			ProvaVariablePtr varPtr = (ProvaVariablePtr) lt;
			lt = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
		}
		if( !(lt instanceof ProvaConstant) )
			return false;
		Object olt1 = ((ProvaConstant) lt).getObject();
		if( !(olt1 instanceof ProvaBinaryOperator) )
			return false;
		ProvaBinaryOperator bo = (ProvaBinaryOperator) olt1;
		// LHS
		ProvaObject a1 = data[1];
		if( a1 instanceof ProvaVariablePtr ) {
			ProvaVariablePtr varPtr = (ProvaVariablePtr) a1;
			a1 = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
		}
		if( !((a1 instanceof ProvaVariable) || (a1 instanceof ProvaConstant)) )
			return false;
		// Expression
		ProvaObject a2 = data[2];
		if( a2 instanceof ProvaVariablePtr ) {
			ProvaVariablePtr varPtr = (ProvaVariablePtr) a2;
			a2 = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
		}
		return bo.evaluate(a1, (ProvaComputable) a2);
	}

	@Override
	public int getArity() {
		return 3;
	}

}
