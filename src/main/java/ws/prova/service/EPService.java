package ws.prova.service;

public interface EPService {

	public void send(String xid, String dest, String agent, String verb, Object payload, EPService callback);

}
