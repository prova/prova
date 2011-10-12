package ws.prova.eventing;

import java.util.Map;
import java.util.TreeMap;

public class MapCounter implements ProvaEventsAccumulator {

	private Map<Object,Long> map;
	
	private AccumulationMode accumulationMode;
	
	public MapCounter() {
		this.accumulationMode = AccumulationMode.Clear;
		this.map = new TreeMap<Object,Long>();
	}
	
	public MapCounter(AccumulationMode accumulationMode) {
		this.accumulationMode = accumulationMode;
		this.map = new TreeMap<Object,Long>();
	}
	
	public MapCounter(MapCounter counter) {
		this.accumulationMode = counter.accumulationMode;
		this.map = new TreeMap<Object,Long>(counter.map);
	}
	
	public Map<Object,Long> getMap() {
		return map;
	}

	public long incrementAt(Object key) {
		Long count = map.get(key);
		if( count==null ) {
			map.put(key, 1L);
			return 1L;
		}
		map.put(key, ++count);
		return count;
	}

	public long addAt(Object key, long delta) {
		Long count = map.get(key);
		if( count==null ) {
			map.put(key, delta);
			return delta;
		}
		map.put(key, count+delta);
		return count+delta;
	}

	public long totalCount() {
		long total = 0;
		for( long count : map.values() )
			total += count;
		return total;
	}

	@Override
	public void clear() {
		if( accumulationMode==AccumulationMode.Clear )
			map.clear();
	}
	
	@Override
	public MapCounter clone() {
		return new MapCounter(this);
	}
	
	@Override
	public String toString() {
		return "MapCounter [map=" + map + "]";
	}

}
