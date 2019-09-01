package org.provarules.reference2.messaging.where;

import java.util.Map;

public class WhereNotEqual extends WhereBasicNode {

    private final String param;

    private final String compareTo;

    WhereNotEqual(String param, String compareTo) {
        if (param == null || compareTo == null)
            throw new NullPointerException();

        this.param = param;
        this.compareTo = compareTo;
    }

    @Override
    public boolean evaluate(Map<Object, Object> vars, Map<Object, Object> vars2) {
        Object value = data(param, vars, vars2);
        Object other = data(compareTo, vars, vars2);
        if (value == null || other == null)
            return true;
        else
            return !value.equals(other);
    }

    @Override
    public String toString() {
        return param + " != " + compareTo;
    }
}
