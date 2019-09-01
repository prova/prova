package org.provarules.eventing;

import java.util.Map;
import java.util.TreeMap;

public class MapCounter extends ProvaBasicEventsAccumulatorImpl {

    private static final long serialVersionUID = 7769272455398438735L;

    private long totalCount;

    private Map<Object, Long> map;

    private AccumulationMode accumulationMode;

    public MapCounter() {
        this.accumulationMode = AccumulationMode.Clear;
        this.map = new TreeMap<>();
    }

    public MapCounter(AccumulationMode accumulationMode) {
        this.accumulationMode = accumulationMode;
        this.map = new TreeMap<>();
    }

    public MapCounter(MapCounter counter) {
        super(counter);
        this.totalCount = counter.totalCount;
        this.accumulationMode = counter.accumulationMode;
        this.map = new TreeMap<>(counter.map);
    }

    @Override
    public long totalCount() {
        return totalCount;
    }

    public Map<Object, Long> getMap() {
        return map;
    }

    public long incrementAt(Object key) {
        Long count = map.get(key);
        if (count == null) {
            map.put(key, 1L);
            this.totalCount++;
            return 1L;
        }
        map.put(key, ++count);
        this.totalCount++;
        return count;
    }

    public long addAt(Object key, long delta) {
        Long count = map.get(key);
        if (count == null) {
            map.put(key, delta);
            this.totalCount += delta;
            return delta;
        }
        map.put(key, count + delta);
        this.totalCount += delta;
        return count + delta;
    }

    @Override
    public void clear() {
        if (accumulationMode == AccumulationMode.Clear) {
            totalCount = 0;
            map.clear();
        }
    }

    @Override
    public MapCounter clone() {
        return new MapCounter(this);
    }

    @Override
    public String toString() {
        return "MapCounter [count=" + totalCount
                + ", map=" + map + "]";
    }

}
