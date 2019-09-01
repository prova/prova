package org.provarules.exchange.impl;

import org.provarules.exchange.ProvaSolution;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ProvaSolutionImpl implements ProvaSolution {

    private ConcurrentMap<String, Object> nv = new ConcurrentHashMap<>();

    @Override
    public void add(String name, Object value) {
        nv.put(name, value);
    }

    @Override
    public ConcurrentMap<String, Object> getNv() {
        return nv;
    }

    @Override
    public Object getNv(String name) {
        return nv.get(name);
    }
}
