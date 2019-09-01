package org.provarules.eventing;

import java.io.Serializable;

public class CountValue implements Serializable {

    private static final long serialVersionUID = -8383435759562637560L;

    public int count;

    public double value;

    public CountValue(int count, double value) {
        this.count = count;
        this.value = value;
    }

    public int getCount() {
        return count;
    }

    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "CountValue [count=" + count + ", value=" + value + "]";
    }

}
