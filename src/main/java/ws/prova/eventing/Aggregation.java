package ws.prova.eventing;

public interface Aggregation {

	public void process( CountValue cv, double value );

}
