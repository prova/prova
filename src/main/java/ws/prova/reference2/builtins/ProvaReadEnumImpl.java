package ws.prova.reference2.builtins;

import java.io.BufferedReader;
import java.io.IOException;
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

public class ProvaReadEnumImpl extends ProvaBuiltinImpl {

	public ProvaReadEnumImpl(ProvaKnowledgeBase kb) {
		super(kb,"read_enum");
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
		if( !(lt instanceof ProvaConstant) )
			return false;
		Object o = ((ProvaConstant) lt).getObject();
		if( !(o instanceof BufferedReader) )
			return false;
		BufferedReader in = (BufferedReader) o;
		ProvaObject out = data[1];
		if( out instanceof ProvaVariablePtr ) {
			ProvaVariablePtr varPtr = (ProvaVariablePtr) out;
			out = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
		}
		if( !(out instanceof ProvaVariable) && !(out instanceof ProvaConstant)  )
			return false;
		String s = null;
		ProvaPredicate pred = null;
		if( out instanceof ProvaVariable ) {
			// Make sure the unification is done between the result and the original subgoal
			pred = new ProvaPredicateImpl("",2,kb);
		} else if( out instanceof ProvaConstant ) {
			s = ((ProvaConstant) out).toString();
		}
		String line = "";
		try {
			while( (line = in.readLine()) != null ) {
				if( pred!=null ) {
					ProvaList ls = ProvaListImpl.create( 
							new ProvaObject[] {data[0],ProvaConstantImpl.create(line)} );
					ProvaLiteral lit = new ProvaLiteralImpl(pred,ls);
					ProvaRule clause = ProvaRuleImpl.createVirtualRule(1, lit, null);
					pred.addClause(clause);
				} else if( line.equals(s) ) {
					return true;
				}
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		ProvaLiteral newLiteral = new ProvaLiteralImpl(pred,terms);
		newLiterals.add(newLiteral);
		return true;
	}

}
