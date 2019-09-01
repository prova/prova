package org.provarules.reference2.messaging.where;

import java.util.Map;

public class WhereComparison implements WhereNode {
    public enum Type {
        LessThan, LessThanOrEqual, NotEqual, GreaterThan, GreaterThanOrEqual, In;

        @Override
        public String toString() {
            switch (this) {
                case NotEqual:
                    return "!=";
                case GreaterThan:
                    return ">";
                case GreaterThanOrEqual:
                    return ">=";
                case LessThan:
                    return "<";
                case LessThanOrEqual:
                    return "<=";
                case In:
                    return " in ";
                default:
                    return "";
            }
        }
    }

    private final String compare;

    private final String compareTo;

    private final Type type;

    WhereComparison(String param, String compareTo, Type type) {
        if (param == null)
            throw new NullPointerException();

        this.compare = param;
        this.compareTo = compareTo;
        this.type = type;
    }

    private Object data(String param, Map<Object, Object> vars, Map<Object, Object> vars2) {
        Object value = vars.get(param);
        return value != null ? value : vars2.get(param);
    }

    @Override
    public boolean evaluate(Map<Object, Object> vars, Map<Object, Object> vars2) {
        Object value = data(this.compare, vars, vars2);
        Object other = data(this.compareTo, vars, vars2);

        if (value != null) {
            if (value instanceof Number) {
                try {
                    double numval = Double.parseDouble(value.toString());
                    double numother = Double.parseDouble(other.toString());

                    switch (this.type) {
                        case NotEqual:
                            return numval != numother;
                        case GreaterThan:
                            return numval > numother;
                        case GreaterThanOrEqual:
                            return numval >= numother;
                        case LessThan:
                            return numval < numother;
                        case LessThanOrEqual:
                            return numval <= numother;
                        default:
                            return false;
                    }
                } catch (Exception ex) {
//					String[] values = value.toString().split(",");
                    return false;
                }
            } else if (value instanceof String) {
                if (!(other instanceof String))
                    return false;
                int result = ((String) value).compareTo((String) other);
                switch (this.type) {
                    case NotEqual:
                        return result != 0;
                    case GreaterThan:
                        return result > 0;
                    case GreaterThanOrEqual:
                        return result >= 0;
                    case LessThan:
                        return result < 0;
                    case LessThanOrEqual:
                        return result <= 0;
                    default:
                        return false;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return compare + " " + type.toString() + " " + compareTo;
    }
}
