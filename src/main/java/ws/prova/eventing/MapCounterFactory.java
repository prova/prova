package ws.prova.eventing;

import java.io.Serializable;

public class MapCounterFactory implements ProvaStateObjectFactory {

	@Override
	public Serializable create() {
		return new MapCounter();
	}

}
