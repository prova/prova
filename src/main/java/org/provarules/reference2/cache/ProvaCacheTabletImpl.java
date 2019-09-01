package org.provarules.reference2.cache;

import org.provarules.kernel2.cache.ProvaCacheState;
import org.provarules.kernel2.cache.ProvaCacheTablet;
import org.provarules.kernel2.cache.ProvaGroundKey;

import java.util.HashMap;
import java.util.Map;

public class ProvaCacheTabletImpl implements ProvaCacheTablet {

    private int arity;

    private Map<ProvaGroundKey, ProvaCacheState> cacheStates;

    public ProvaCacheTabletImpl(int arity) {
        this.arity = arity;
        this.cacheStates = new HashMap<>();
    }

    @Override
    public ProvaCacheState open(Object[] data) {
        ProvaGroundKey key = new ProvaGroundKeyImpl(data);
        ProvaCacheState cacheState = cacheStates.get(key);
        if (cacheState == null) {
            cacheState = new ProvaCacheStateImpl();
            cacheStates.put(key, cacheState);
        }
        return cacheState;
    }

    public int getArity() {
        return this.arity;
    }

}
