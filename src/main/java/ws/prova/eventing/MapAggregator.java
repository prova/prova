package ws.prova.eventing;

import java.util.Map;
import java.util.TreeMap;

public class MapAggregator implements ProvaEventsAccumulator {

	private Map<Object,CountValue> map;
	
	private Aggregation processor;

	private AccumulationMode accumulationMode;
	
	private class SumAggregation implements Aggregation {
		
		@Override
		public void process( CountValue cv, double value ) {
			cv.count++;
			cv.value += value;
		}
		
	}
	
	public MapAggregator() {
		this.accumulationMode = AccumulationMode.Clear;
		this.map = new TreeMap<Object,CountValue>();
		this.processor = new SumAggregation();
	}
	
	public MapAggregator(AccumulationMode accumulationMode) {
		this.accumulationMode = accumulationMode;
		this.map = new TreeMap<Object,CountValue>();
		this.processor = new SumAggregation();
	}
	
	public MapAggregator(MapAggregator aggregator) {
		this.accumulationMode = aggregator.accumulationMode;
		this.map = new TreeMap<Object,CountValue>(aggregator.map);
		this.processor = aggregator.processor;
	}

	public Map<Object,CountValue> getMap() {
		return map;
	}

	public CountValue processAt(Object key, double value) {
		CountValue agg = map.get(key);
		if( agg==null ) {
			agg = new CountValue(0, 0.0);
			map.put(key, agg);
		}
		processor.process(agg, value);
		return agg;
	}

	@Override
	public void clear() {
		if( accumulationMode==AccumulationMode.Clear )
			map.clear();
	}
	
	@Override
	public MapAggregator clone() {
		return new MapAggregator(this);
	}

	@Override
	public String toString() {
		return "MapAggregator [map=" + map + "]";
	}
	
}
