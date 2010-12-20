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
import ws.prova.kernel2.ProvaPredicate;
import ws.prova.kernel2.ProvaRule;
import ws.prova.kernel2.ProvaVariable;
import ws.prova.kernel2.ProvaVariablePtr;
import ws.prova.reference2.ProvaConstantImpl;
import ws.prova.reference2.ProvaListImpl;
import ws.prova.reference2.ProvaLiteralImpl;
import ws.prova.reference2.ProvaPredicateImpl;
import ws.prova.reference2.ProvaRuleImpl;

public class ProvaTokenizeEnumImpl extends ProvaBuiltinImpl {

	public ProvaTokenizeEnumImpl(ProvaKnowledgeBase kb) {
		super(kb,"tokenize_enum");
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
		ProvaObject n_out = data[1];
		if( n_out instanceof ProvaVariablePtr ) {
			ProvaVariablePtr varPtr = (ProvaVariablePtr) n_out;
			n_out = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
		}
		ProvaObject lt = data[0];
		if( lt instanceof ProvaVariablePtr ) {
			ProvaVariablePtr varPtr = (ProvaVariablePtr) lt;
			lt = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
		}
		if( !(lt instanceof ProvaList) )
			return false;
		ProvaObject[] args = ((ProvaList) ((ProvaList) lt).cloneWithVariables(variables)).getFixed();
		if( args.length!=2 )
			return false;
		String in = ((ProvaConstant) args[0]).toString();
		ProvaObject sep = args[1];
		if( sep instanceof ProvaVariablePtr ) {
			ProvaVariablePtr varPtr = (ProvaVariablePtr) sep;
			sep = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
		}
		String delim = ((ProvaConstant) sep).toString();
		String tokens[] = in.split(delim);
		// Make sure the unification is done between the result and the original subgoal
		ProvaPredicate pred = new ProvaPredicateImpl("",2,kb);
		for( String token : tokens ) {
			ProvaList ls = ProvaListImpl.create( 
					new ProvaObject[] {data[0],ProvaConstantImpl.create(token)} );
			ProvaLiteral lit = new ProvaLiteralImpl(pred,ls);
			ProvaRule clause = ProvaRuleImpl.createVirtualRule(1, lit, null);
			pred.addClause(clause);
		}		
		ProvaLiteral newLiteral = new ProvaLiteralImpl(pred,terms);
		newLiterals.add(newLiteral);
		return true;
	}

}
