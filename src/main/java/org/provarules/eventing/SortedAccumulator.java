package org.provarules.eventing;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.TreeMap;

public class SortedAccumulator extends ProvaBasicEventsAccumulatorImpl {

    private static final long serialVersionUID = 8593913229446147787L;

    private TreeMap<Object, List<Object>> map;

    private Accumulation processor;

    private AccumulationMode accumulationMode;

    private class AddAccumulation implements Accumulation {

        @Override
        public void process(List<Object> acc, Object value) {
            acc.add(value);
        }

    }

    public SortedAccumulator() {
        this.accumulationMode = AccumulationMode.Clear;
        this.map = new TreeMap<>();
        this.processor = new AddAccumulation();
    }

    public SortedAccumulator(AccumulationMode accumulationMode) {
        this.accumulationMode = accumulationMode;
        this.map = new TreeMap<>();
        this.processor = new AddAccumulation();
    }

    public SortedAccumulator(SortedAccumulator accumulator) {
        super(accumulator);
        this.accumulationMode = accumulator.accumulationMode;
        this.map = new TreeMap<>(accumulator.map);
        this.processor = accumulator.processor;
    }

    public List<Object> processAt(Object key, Object value) {
        List<Object> acc = map.computeIfAbsent(key, k -> new ArrayList<>());
        processor.process(acc, value);
        return acc;
    }

    public long totalCount() {
        long total = 0;
        for (List<Object> bucket : map.values())
            total += bucket.size();
        return total;
    }

    public List<Object> lowest(int n) {
        List<Object> results = new ArrayList<>();
        int count = 0;
        for (Entry<Object, List<Object>> entry : map.entrySet()) {
            List<Object> objs = entry.getValue();
            for (Object obj : objs) {
                results.add(obj);
                if (++count == n)
                    return results;
            }
        }
        return results;
    }

    public List<Object> highest(int n) {
        List<Object> results = new ArrayList<>();
        int count = 0;
        for (Entry<Object, List<Object>> entry : map.descendingMap().entrySet()) {
            List<Object> objs = entry.getValue();
            for (Object obj : objs) {
                results.add(obj);
                if (++count == n)
                    return results;
            }
        }
        return results;
    }

    @Override
    public void clear() {
        if (accumulationMode == AccumulationMode.Clear)
            map.clear();
    }

    @Override
    public SortedAccumulator clone() {
        return new SortedAccumulator(this);
    }

    @Override
    public String toString() {
        return "SortedAccumulator [totalCount=" + totalCount()
                + " ,map=" + map + "]";
    }

}
