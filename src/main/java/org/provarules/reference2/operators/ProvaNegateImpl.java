package org.provarules.reference2.operators;

public class ProvaNegateImpl implements ProvaOperator {

    @Override
    public Number evaluate(Object... na) {
        if (!(na[0] instanceof Number))
            return null;
        Number na1 = (Number) na[0];
        if (na1 instanceof Double)
            return -na1.doubleValue();
        else if (na1 instanceof Float)
            return -na1.floatValue();
        else if (na1 instanceof Long)
            return -na1.longValue();
        else if (na1 instanceof Integer)
            return -na1.intValue();
        return -na1.byteValue();
    }

    public String toString() {
        return "-";
    }

}
