package org.provarules.eventing;

import java.util.Map;
import java.util.TreeMap;

public class MapAggregator extends ProvaBasicEventsAccumulatorImpl {

    private static final long serialVersionUID = -4644372132667191024L;

    private long totalCount;

    private Map<Object, CountValue> map;

    private Aggregation processor;

    private AccumulationMode accumulationMode;

    private static class SumAggregation implements Aggregation {

        private static final long serialVersionUID = 6263950015116331352L;

        @Override
        public void process(CountValue cv, double value) {
            cv.count++;
            cv.value += value;
        }

    }

    public MapAggregator() {
        this.accumulationMode = AccumulationMode.Clear;
        this.map = new TreeMap<>();
        this.processor = new SumAggregation();
    }

    public MapAggregator(AccumulationMode accumulationMode) {
        this.accumulationMode = accumulationMode;
        this.map = new TreeMap<>();
        this.processor = new SumAggregation();
    }

    public MapAggregator(MapAggregator aggregator) {
        super(aggregator);
        this.totalCount = aggregator.totalCount;
        this.accumulationMode = aggregator.accumulationMode;
        this.map = new TreeMap<Object, CountValue>(aggregator.map);
        this.processor = aggregator.processor;
    }

    @Override
    public long totalCount() {
        return totalCount;
    }

    public Map<Object, CountValue> getMap() {
        return map;
    }

    public CountValue processAt(Object key, double value) {
        CountValue agg = map.get(key);
        if (agg == null) {
            agg = new CountValue(0, 0.0);
            map.put(key, agg);
        }
        processor.process(agg, value);
        this.totalCount++;
        return agg;
    }

    @Override
    public void clear() {
        if (accumulationMode == AccumulationMode.Clear) {
            totalCount = 0;
            map.clear();
        }
    }

    @Override
    public MapAggregator clone() {
        return new MapAggregator(this);
    }

    @Override
    public String toString() {
        return "MapAggregator [count=" + totalCount
                + ", map=" + map + "]";
    }

}
