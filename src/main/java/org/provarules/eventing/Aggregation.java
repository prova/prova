package org.provarules.eventing;

import java.io.Serializable;

public interface Aggregation extends Serializable {

    void process(CountValue cv, double value);

}
