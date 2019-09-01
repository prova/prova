package org.provarules.eventing;

public class Counter extends ProvaBasicEventsAccumulatorImpl {

    private static final long serialVersionUID = -964631029823380079L;

    private long count;

    public Counter() {
    }

    public Counter(Counter counter) {
        super(counter);
        this.count = counter.count;
    }

    public long increment() {
        return ++count;
    }

    public long add(long delta) {
        count += delta;
        return count;
    }

    public long totalCount() {
        return count;
    }

    @Override
    public void clear() {
        count = 0;
    }

    @Override
    public Counter clone() {
        return new Counter(this);
    }

    @Override
    public String toString() {
        return "Counter [count=" + count + "]";
    }

}
