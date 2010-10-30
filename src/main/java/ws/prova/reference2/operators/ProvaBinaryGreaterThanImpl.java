package ws.prova.reference2.operators;

import ws.prova.kernel2.ProvaComputable;
import ws.prova.kernel2.ProvaConstant;
import ws.prova.kernel2.ProvaObject;
import ws.prova.kernel2.ProvaVariable;

public class ProvaBinaryGreaterThanImpl implements ProvaBinaryOperator {

	@Override
	public boolean evaluate( ProvaObject o1, ProvaComputable a2 ) {
		if( o1 instanceof ProvaVariable ) {
			throw new RuntimeException("Variable "+o1+" used in '>'");
		}
		Object oa1 = ((ProvaConstant) o1).getObject();
		Object oa2 = a2.compute();
		if( !(oa1 instanceof Number) || !(oa2 instanceof Number) )
			return false;
		Number na1 = (Number) oa1;
		Number na2 = (Number) oa2;
		if( na1 instanceof Double || na2 instanceof Double )
			return na1.doubleValue()>na2.doubleValue();
		else if( na1 instanceof Float || na2 instanceof Float )
			return na1.floatValue()>na2.floatValue();
		else if( na1 instanceof Long || na2 instanceof Long )
			return na1.longValue()>na2.longValue();
		else if( na1 instanceof Integer || na2 instanceof Integer )
			return na1.intValue()>na2.intValue();
		return na1.byteValue()>na2.byteValue();
	}

	public String toString() {
		return ">";
	}

}
