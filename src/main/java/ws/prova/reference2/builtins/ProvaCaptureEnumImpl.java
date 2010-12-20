package ws.prova.reference2.builtins;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

public class ProvaCaptureEnumImpl extends ProvaBuiltinImpl {

	public ProvaCaptureEnumImpl(ProvaKnowledgeBase kb) {
		super(kb,"capture_enum");
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
		if( !(lt instanceof ProvaList) )
			return false;
		ProvaObject[] args = ((ProvaList) ((ProvaList) lt).cloneWithVariables(variables)).getFixed();
		if( args.length!=2 )
			return false;
		String in = ((ProvaConstant) args[0]).toString();
		String regexp = ((ProvaConstant) args[1]).toString();
		Pattern p = Pattern.compile(regexp);
		Matcher m = p.matcher(in);
		ProvaPredicate pred = new ProvaPredicateImpl("",1,kb);
		while (m.find()) {
			ProvaObject[] newFixed = new ProvaObject[m.groupCount()];
			for (int i = 1; i <= m.groupCount(); i++) {
				newFixed[i-1] = ProvaConstantImpl.create(m.group(i));
			}
			ProvaList groups = ProvaListImpl.create( newFixed );
			ProvaList ls = ProvaListImpl.create( new ProvaObject[] {groups} );
			ProvaLiteral lit = new ProvaLiteralImpl(pred,ls);
			ProvaRule clause = ProvaRuleImpl.createVirtualRule(1, lit, null);
			pred.addClause(clause);
		}		
		ProvaList ltls = ProvaListImpl.create( new ProvaObject[] {data[1]} );
		ProvaLiteral newLiteral = new ProvaLiteralImpl(pred,ltls);
		newLiterals.add(newLiteral);
		return true;
	}

}
