package org.provarules.reference2.messaging.where;

import java.util.Map;

public abstract class WhereBasicNode implements WhereNode {

    protected Object data(String param, Map<Object, Object> vars, Map<Object, Object> vars2) {
        Object value = vars.get(param);
        return value != null ? value : vars2.get(param);
    }

}
