package ws.prova.eventing;

import java.io.Serializable;

public interface Aggregation extends Serializable {

	public void process( CountValue cv, double value );

}
