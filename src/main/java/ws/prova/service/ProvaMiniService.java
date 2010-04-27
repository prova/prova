package ws.prova.service;

public interface ProvaMiniService {

	public void send(String xid, String dest, String agent, String verb, Object payload);
	
}
