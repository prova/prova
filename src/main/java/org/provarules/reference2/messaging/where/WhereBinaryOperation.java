package org.provarules.reference2.messaging.where;

import java.util.Map;

public class WhereBinaryOperation implements WhereNode {
    public enum Operator {
        And, Or, Xor;

        @Override
        public String toString() {
            return super.toString().toLowerCase();
        }
    }

    private final WhereNode left, right;

    private final Operator operator;

    public WhereBinaryOperation(WhereNode left, WhereNode right,
                                Operator operator) {
        if (left == null || right == null)
            throw new NullPointerException();

        this.left = left;
        this.right = right;
        this.operator = operator;
    }

    @Override
    public boolean evaluate(Map<Object, Object> vars, Map<Object, Object> vars2) {
        switch (this.operator) {
            case And:
                return left.evaluate(vars, vars2) && right.evaluate(vars, vars2);
            case Or:
                return left.evaluate(vars, vars2) || right.evaluate(vars, vars2);
            case Xor:
                return left.evaluate(vars, vars2) ^ right.evaluate(vars, vars2);
            default:
                return false;
        }
    }

    @Override
    public String toString() {
        return "(" + left.toString() + " " + operator.toString() + " "
                + right.toString() + ")";
    }
}
