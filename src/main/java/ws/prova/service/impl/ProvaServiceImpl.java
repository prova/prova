package ws.prova.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import ws.prova.api2.ProvaCommunicator;
import ws.prova.api2.ProvaCommunicatorImpl;
import ws.prova.exchange.ProvaSolution;
import ws.prova.kernel2.ProvaConstant;
import ws.prova.kernel2.ProvaList;
import ws.prova.service.ProvaService;

/**
 * OSGi Service holding a collection of identifiable Prova engines
 * @author alex.kozlenkov@googlemail.com
 *
 */
public class ProvaServiceImpl implements ProvaService {

	private String id;
	
	private ConcurrentMap<String,ProvaCommunicator> engines;
	
	@Override
	public void init() {
		id = UUID.randomUUID().toString();
		engines = new ConcurrentHashMap<String,ProvaCommunicator>();
		System.out.println("Prova Service "+id+" created");
	}
	
	@Override
	public void destroy() {
		if( engines!=null ) {
			for( ProvaCommunicator engine : engines.values() )
				engine.shutdown();
		}
		System.out.println("Prova Service "+id+" destroyed");
	}
	
	@Override
	public String instance(String agent, String rulebase) {
		ProvaCommunicator prova = null;
		try {
			Map<String,Object> globals = new HashMap<String,Object>();
			prova = new ProvaCommunicatorImpl(this,agent,null,rulebase,ProvaCommunicatorImpl.SYNC,globals);
			engines.put(agent, prova);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return agent;
	}

	@Override
	public void release(String agent) {
		ProvaCommunicator engine = engines.remove(agent);
		if( engine==null )
			throw new RuntimeException("No engine instance "+agent);
	}
	
	@Override
	public List<ProvaSolution[]> consult(String agent, String src, String key) {
		try {
			ProvaCommunicator engine = engines.get(agent);
			if( engine==null )
				throw new RuntimeException("No engine instance "+agent);
			List<ProvaSolution[]> resultSets = engine.consultSync(src, key, new Object[]{});
			return resultSets;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public void send(String dest, ProvaList terms) {
		ProvaCommunicator engine = engines.get(dest);
		if( engine==null )
			throw new RuntimeException("No engine instance "+dest);
    	((ProvaConstant) terms.getFixed()[1]).setObject("async");
		engine.addMsg(terms);
	}

	@Override
	public void setGlobalConstant(String agent, String name, Object value) {
		ProvaCommunicator engine = engines.get(agent);
		if( engine==null )
			throw new RuntimeException("No engine instance "+agent);
		engine.setGlobalConstant(name, value);
	}
	
}
