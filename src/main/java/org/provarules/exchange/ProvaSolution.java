package org.provarules.exchange;

import java.util.concurrent.ConcurrentMap;

public interface ProvaSolution {

    void add(String name, Object value);

    ConcurrentMap<String, Object> getNv();

    Object getNv(String name);

}
