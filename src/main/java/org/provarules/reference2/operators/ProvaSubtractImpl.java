package org.provarules.reference2.operators;

public class ProvaSubtractImpl implements ProvaOperator {

    @Override
    public Number evaluate(Object... na) {
        if (!(na[0] instanceof Number) || !(na[1] instanceof Number))
            return null;
        Number na1 = (Number) na[0];
        Number na2 = (Number) na[1];
        if (na1 instanceof Double || na2 instanceof Double)
            return na1.doubleValue() - na2.doubleValue();
        else if (na1 instanceof Float || na2 instanceof Float)
            return na1.floatValue() - na2.floatValue();
        else if (na1 instanceof Long || na2 instanceof Long)
            return na1.longValue() - na2.longValue();
        else if (na1 instanceof Integer || na2 instanceof Integer)
            return na1.intValue() - na2.intValue();
        return na1.byteValue() - na2.byteValue();
    }

    public String toString() {
        return "-";
    }

}
