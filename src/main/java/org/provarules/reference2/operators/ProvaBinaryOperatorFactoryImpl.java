package org.provarules.reference2.operators;

public class ProvaBinaryOperatorFactoryImpl {

    public static ProvaBinaryOperator create(String op) {
        if ("=".equals(op))
            return new ProvaBinaryEqualsImpl();
        else if ("ne".equals(op))
            return new ProvaBinaryNotEqualsImpl();
        else if ("gt".equals(op))
            return new ProvaBinaryGreaterThanImpl();
        else if ("lt".equals(op))
            return new ProvaBinaryLessThanImpl();
        else if ("ge".equals(op))
            return new ProvaBinaryGreaterEqualImpl();
        else if ("le".equals(op))
            return new ProvaBinaryLessEqualImpl();
        else throw new RuntimeException("Invalid binary operator " + op);
    }
}
