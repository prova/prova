package ws.prova.eventing;

public class Counter implements ProvaEventsAccumulator {

	private long count;
	
	public Counter() {
	}
	
	public Counter(Counter counter) {
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
