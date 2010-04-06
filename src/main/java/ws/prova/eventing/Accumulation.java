package ws.prova.eventing;

import java.util.List;

public interface Accumulation {

	public void process( List<Object> acc, Object value );

}
