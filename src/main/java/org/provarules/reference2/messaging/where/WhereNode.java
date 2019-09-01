package org.provarules.reference2.messaging.where;

import java.util.Map;

public interface WhereNode {

    boolean evaluate(Map<Object, Object> vars, Map<Object, Object> vars2);

}
