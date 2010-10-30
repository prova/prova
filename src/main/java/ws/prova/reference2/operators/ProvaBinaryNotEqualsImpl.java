package ws.prova.reference2.operators;

import ws.prova.kernel2.ProvaConstant;
import ws.prova.kernel2.ProvaObject;
import ws.prova.kernel2.ProvaComputable;
import ws.prova.kernel2.ProvaVariable;

public class ProvaBinaryNotEqualsImpl implements ProvaBinaryOperator {

	@Override
	public boolean evaluate( ProvaObject o1, ProvaComputable a2 ) {
		if( o1 instanceof ProvaVariable ) {
			throw new RuntimeException("Variable "+o1+" used in '!='");
		}
		Object n2 = a2.computeIfExpression();
		return !((ProvaConstant) o1).getObject().equals(n2);
	}

	public String toString() {
		return "!=";
	}

}
