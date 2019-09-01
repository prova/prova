package org.provarules.eventing;

import java.util.List;

public interface Accumulation {

    void process(List<Object> acc, Object value);

}
