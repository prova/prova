package ws.prova.exchange;

import java.util.concurrent.ConcurrentMap;

public interface ProvaSolution {

	public void add(String name, Object value);

	public ConcurrentMap<String, Object> getNv();

	public Object getNv(String name);

}
