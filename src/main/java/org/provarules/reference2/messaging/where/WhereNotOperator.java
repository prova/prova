package org.provarules.reference2.messaging.where;

import java.util.Map;

public class WhereNotOperator implements WhereNode {

    private final WhereNode inner;

    WhereNotOperator(WhereNode inner) {
        if (inner == null)
            throw new NullPointerException();

        this.inner = inner;
    }

    @Override
    public boolean evaluate(Map<Object, Object> vars, Map<Object, Object> vars2) {
        return !inner.evaluate(vars, vars2);
    }

    @Override
    public String toString() {
        return "not " + inner.toString();
    }
}
