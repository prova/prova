package ws.prova.eventing;

import java.io.Serializable;

public interface ProvaStateContainer extends Serializable {

	String getQueryId();

	Object retrieveStateObject(String key, ProvaStateObjectFactory factory);

}
