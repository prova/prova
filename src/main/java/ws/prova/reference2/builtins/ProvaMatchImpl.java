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
import ws.prova.kernel2.ProvaRuleSet;
import ws.prova.kernel2.ProvaUnification;
import ws.prova.kernel2.ProvaVariable;
import ws.prova.kernel2.ProvaVariablePtr;
import ws.prova.reference2.ProvaConstantImpl;
import ws.prova.reference2.ProvaGoalImpl;
import ws.prova.reference2.ProvaListImpl;
import ws.prova.reference2.ProvaLiteralImpl;
import ws.prova.reference2.ProvaPredicateImpl;
import ws.prova.reference2.ProvaRuleImpl;
import ws.prova.reference2.builtins.target.ProvaTarget;
import ws.prova.reference2.builtins.target.ProvaTargetImpl;

public class ProvaMatchImpl extends ProvaBuiltinImpl {

	private ProvaLiteral targetLiteral;

	private ProvaRule targetQuery;
	
	public ProvaMatchImpl(ProvaKnowledgeBase kb) {
		super(kb,"match");
	}

	@Override
	public boolean process(ProvaReagent prova, ProvaDerivationNode node,
			ProvaGoal goal, List<ProvaLiteral> newLiterals, ProvaRule query) {
		ProvaLiteral literal = goal.getGoal();
		List<ProvaVariable> variables = query.getVariables();
		ProvaList terms = literal.getTerms();
		ProvaObject[] data = terms.getFixed();
		if( data.length!=3 )
			return false;
		ProvaObject handle = data[2];
		if( handle instanceof ProvaVariablePtr ) {
			ProvaVariablePtr varPtr = (ProvaVariablePtr) handle;
			ProvaObject o = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
			handle = o;
		}
		ProvaObject[] target = ((ProvaList) data[0]).getFixed();
		String symbol = ((ProvaConstant) target[0]).getObject().toString();
		ProvaRuleSet clauses = kb.getPredicates(symbol,target.length-1);
		ProvaGoal targetGoal = null;
		ProvaTarget ptr = null;
		if( handle instanceof ProvaVariable ) {
			targetLiteral = kb.generateLiteral(target);
			targetQuery = kb.generateGoal(new ProvaLiteral[] {targetLiteral},variables);
			targetGoal = new ProvaGoalImpl(targetQuery);
			ptr = ProvaTargetImpl.create(targetGoal); 
			((ProvaVariable) handle).setAssigned(ProvaConstantImpl.create(ptr));
		} else if( handle instanceof ProvaConstant ) {
			ptr = (ProvaTarget) ((ProvaConstant) handle).getObject();
			targetGoal = ptr.getTarget();
		}
		ProvaUnification unification = clauses.nextMatch(kb,targetGoal);
		if( unification== null )
			return false;
		ProvaRule candidate = unification.getTarget();
		ptr.setCandidate(candidate);
		ProvaObject lt = data[1];
		if( lt instanceof ProvaVariablePtr ) {
			ProvaVariablePtr varPtr = (ProvaVariablePtr) lt;
			ProvaObject o = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
			lt = o;
		}
		ProvaLiteral l = (ProvaLiteral) candidate.getHead().cloneWithVariables(variables);
		ProvaObject[] arr = l.getTerms().getFixed();
		ProvaObject[] newArr = new ProvaObject[1+arr.length];
		System.arraycopy(arr,0,newArr,1,arr.length);
		newArr[0] = ProvaConstantImpl.create(l.getPredicate().getSymbol());
		if( lt instanceof ProvaVariable ) {
			((ProvaVariable) lt).setAssigned(ProvaListImpl.create(newArr));
			return true;
		} else if( lt instanceof ProvaList ) {
			ProvaPredicate pred = new ProvaPredicateImpl("",1,kb);
			ProvaLiteral lit = new ProvaLiteralImpl(pred,ProvaListImpl.create(newArr));
			ProvaRule clause = ProvaRuleImpl.createVirtualRule(1, lit, null);
			pred.addClause(clause);
			ProvaLiteral newLiteral = new ProvaLiteralImpl(pred,(ProvaList) lt.cloneWithVariables(variables));
			newLiterals.add(newLiteral);
		} else
			return false;
		return true;
	}

	@Override
	public int getArity() {
		return 2;
	}

}
