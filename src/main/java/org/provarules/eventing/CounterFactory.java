package org.provarules.eventing;

import java.io.Serializable;

public class CounterFactory implements ProvaStateObjectFactory {

    @Override
    public Serializable create() {
        return new Counter();
    }

}
