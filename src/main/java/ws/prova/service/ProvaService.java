package ws.prova.service;

import java.util.List;

import ws.prova.exchange.ProvaSolution;

public interface ProvaService {

	public String instance(String agent, String rulebase);

	public void release(String id);

	public void init();

	public void destroy();

	public List<ProvaSolution[]> consult(String id, String src, String key);
	
}
