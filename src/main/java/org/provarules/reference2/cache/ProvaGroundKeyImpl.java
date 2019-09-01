package org.provarules.reference2.cache;

import org.provarules.kernel2.cache.ProvaGroundKey;

import java.util.Arrays;

public class ProvaGroundKeyImpl implements ProvaGroundKey {

    private Object[] data;

    ProvaGroundKeyImpl(Object[] data) {
        this.data = data;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Arrays.hashCode(data);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ProvaGroundKeyImpl other = (ProvaGroundKeyImpl) obj;
        return Arrays.equals(data, other.data);
    }

}
