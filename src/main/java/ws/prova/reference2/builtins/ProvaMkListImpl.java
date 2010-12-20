package ws.prova.reference2.builtins;

import java.util.List;

import ws.prova.agent2.ProvaReagent;
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
import ws.prova.reference2.ProvaListImpl;
import ws.prova.reference2.ProvaLiteralImpl;
import ws.prova.reference2.ProvaPredicateImpl;
import ws.prova.reference2.ProvaRuleImpl;

public class ProvaMkListImpl extends ProvaBuiltinImpl {

	public ProvaMkListImpl(ProvaKnowledgeBase kb) {
		super(kb,"mklist");
	}

	/**
	 * Append a tail to a list that has no tail
	 */
	@Override
	public boolean process(ProvaReagent prova, ProvaDerivationNode node,
			ProvaGoal goal, List<ProvaLiteral> newLiterals, ProvaRule query) {
		ProvaLiteral literal = goal.getGoal();
		List<ProvaVariable> variables = query.getVariables();
		ProvaList terms = (ProvaList) literal.getTerms();
		ProvaObject[] data = terms.getFixed();
		if( data.length!=2 )
			return false;
		ProvaObject lt = data[0];
		if( lt instanceof ProvaVariablePtr ) {
			ProvaVariablePtr varPtr = (ProvaVariablePtr) lt;
			lt = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
		}
		if( !(lt instanceof ProvaList) )
			return false;
		ProvaObject a1 = data[1];
		if( a1 instanceof ProvaVariablePtr ) {
			ProvaVariablePtr varPtr = (ProvaVariablePtr) a1;
			a1 = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
		}
		ProvaList args = (ProvaList) lt;
		ProvaObject[] fixed = args.getFixed();
		if( fixed.length!=2 )
			return false;
		if( !(fixed[0] instanceof ProvaList) )
			return false;
		ProvaList prefix = (ProvaList) fixed[0];
		ProvaObject prefixTail = prefix.getTail();
		// Only allow adding a tail if there is no tail in the input list
		if( prefixTail!=null )
			return false;
		ProvaList newTerms = ProvaListImpl.create(prefix.getFixed(), fixed[1]);
		if( a1 instanceof ProvaVariable ) {
			((ProvaVariable) a1).setAssigned(newTerms);
			return true;
		}
		ProvaPredicate pred = new ProvaPredicateImpl("",1,kb);
		ProvaList ls = ProvaListImpl.create( new ProvaObject[] {a1} );
		ProvaLiteral lit = new ProvaLiteralImpl(pred,ls);
		ProvaRule clause = ProvaRuleImpl.createVirtualRule(1, lit, null);
		pred.addClause(clause);
		ProvaList ltls = ProvaListImpl.create( new ProvaObject[] {newTerms} );
		ProvaLiteral newLiteral = new ProvaLiteralImpl(pred,ltls);
		newLiterals.add(newLiteral);
		return true;
	}

	private ProvaObject[] concat(ProvaObject[] left, ProvaObject[] right) { 
		ProvaObject[] out= new ProvaObject[left.length+right.length]; 
		   System.arraycopy(left, 0, out, 0, left.length); 
		   System.arraycopy(right, 0, out, left.length, right.length); 
		   return out; 
		} 
	
}
