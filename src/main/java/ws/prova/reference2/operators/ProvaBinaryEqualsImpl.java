package ws.prova.reference2.operators;

import java.util.List;

import ws.prova.kernel2.ProvaComputable;
import ws.prova.kernel2.ProvaConstant;
import ws.prova.kernel2.ProvaKnowledgeBase;
import ws.prova.kernel2.ProvaList;
import ws.prova.kernel2.ProvaLiteral;
import ws.prova.kernel2.ProvaObject;
import ws.prova.kernel2.ProvaPredicate;
import ws.prova.kernel2.ProvaRule;
import ws.prova.kernel2.ProvaVariable;
import ws.prova.reference2.ProvaConstantImpl;
import ws.prova.reference2.ProvaGlobalConstantImpl;
import ws.prova.reference2.ProvaListImpl;
import ws.prova.reference2.ProvaLiteralImpl;
import ws.prova.reference2.ProvaPredicateImpl;
import ws.prova.reference2.ProvaRuleImpl;

public class ProvaBinaryEqualsImpl implements ProvaBinaryOperator {

	@Override
	public boolean evaluate( ProvaKnowledgeBase kb, List<ProvaLiteral> newLiterals, ProvaObject o1, ProvaComputable a2 ) {
		Object n2 = a2.computeIfExpression();
		if( n2==null )
			return false;
		if( n2.getClass()==ProvaConstantImpl.class )
			n2 = ((ProvaConstant) n2).getObject();
		if( o1 instanceof ProvaVariable ) {
			((ProvaVariable) o1).setAssigned(ProvaConstantImpl.wrap(n2));
			return true;
		}
		if( o1 instanceof ProvaGlobalConstantImpl ) {
			((ProvaGlobalConstantImpl) o1).setObject(n2);
			return true;
		}
		if( a2 instanceof ProvaVariable ) {
			((ProvaVariable) a2).setAssigned(o1);
			return true;
		}
		if( o1 instanceof ProvaList ) {
			if( !(n2 instanceof ProvaList) )
				return false;
			// Send this to the unification
			final ProvaPredicate pred = new ProvaPredicateImpl("", 1, kb);
			final ProvaLiteral lit = new ProvaLiteralImpl(pred,
					ProvaListImpl.create(new ProvaObject[] {(ProvaObject) o1}));
			final ProvaRule clause = ProvaRuleImpl.createVirtualRule(1, lit,
					null);
			pred.addClause(clause);
			final ProvaLiteral newLiteral = new ProvaLiteralImpl(pred,
					ProvaListImpl.create(new ProvaObject[] {(ProvaObject) n2}));
			newLiterals.add(newLiteral);
			return true;
		}
		return ((ProvaConstant) o1).getObject().equals(n2);
	}

	public String toString() {
		return "=";
	}

}
