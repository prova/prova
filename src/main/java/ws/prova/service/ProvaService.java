package ws.prova.service;

import java.io.BufferedReader;
import java.util.List;

import ws.prova.exchange.ProvaSolution;
import ws.prova.kernel2.ProvaList;

public interface ProvaService extends EPService {

	public String instance(String agent, String rulebase);

	public void release(String id);

	public void init();

	public void destroy();

	public List<ProvaSolution[]> consult(String id, String src, String key);

	public void send(String dest, ProvaList terms);

	public void setGlobalConstant(String agent, String name, Object value);

	public List<ProvaSolution[]> consult(String agent, BufferedReader in,
			String key);

	public void send(String xid, String dest, String agent, String verb, Object payload);
	
}
