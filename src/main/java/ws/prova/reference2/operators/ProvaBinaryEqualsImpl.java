package ws.prova.reference2.operators;

import ws.prova.kernel2.ProvaComputable;
import ws.prova.kernel2.ProvaConstant;
import ws.prova.kernel2.ProvaObject;
import ws.prova.kernel2.ProvaVariable;
import ws.prova.reference2.ProvaConstantImpl;
import ws.prova.reference2.ProvaGlobalConstantImpl;

public class ProvaBinaryEqualsImpl implements ProvaBinaryOperator {

	@Override
	public boolean evaluate( ProvaObject o1, ProvaComputable a2 ) {
		Object n2 = a2.computeIfExpression();
		if( n2==null )
			return false;
		if( o1 instanceof ProvaVariable ) {
			((ProvaVariable) o1).setAssigned(ProvaConstantImpl.create(n2));
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
		return ((ProvaConstant) o1).getObject().equals(n2);
	}

	public String toString() {
		return "=";
	}

}
