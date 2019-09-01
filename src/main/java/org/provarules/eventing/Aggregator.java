package org.provarules.eventing;

public class Aggregator extends ProvaBasicEventsAccumulatorImpl {

    private static final long serialVersionUID = -6070105850518061308L;

    private CountValue agg;

    private Aggregation processor;

    private static class SumAggregation implements Aggregation {

        private static final long serialVersionUID = -5934127748617778629L;

        @Override
        public void process(CountValue cv, double value) {
            cv.count++;
            cv.value += value;
        }

    }

    Aggregator() {
        agg = new CountValue(0, 0.0);
        this.processor = new SumAggregation();
    }

    private Aggregator(Aggregator aggregator) {
        super(aggregator);
        this.agg = aggregator.agg;
        this.processor = aggregator.processor;
    }

    @Override
    public long totalCount() {
        return agg.count;
    }

    public CountValue process(double value) {
        processor.process(agg, value);
        return agg;
    }

    @Override
    public void clear() {
        agg.count = 0;
        agg.value = 0.0;
    }

    @Override
    public Aggregator clone() {
        return new Aggregator(this);
    }

    @Override
    public String toString() {
        return "Aggregator [count=" + agg.count
                + ", value=" + agg.value + "]";
    }

}
