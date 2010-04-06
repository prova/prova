package ws.prova.service.impl;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import ws.prova.api2.ProvaCommunicator;
import ws.prova.api2.ProvaCommunicatorImpl;
import ws.prova.service.ProvaService;
import ws.prova.exchange.ProvaSolution;

/**
 * OSGi Service holding a collection of identifiable Prova engines
 * @author alex.kozlenkov@googlemail.com
 *
 */
public class ProvaServiceImpl implements ProvaService {

	private ConcurrentMap<String,ProvaCommunicator> engines;
	
	@Override
	public void init() {
		engines = new ConcurrentHashMap<String,ProvaCommunicator>();
		System.out.println("Prova Service created");
	}
	
	@Override
	public void destroy() {
		if( engines!=null ) {
			for( ProvaCommunicator engine : engines.values() )
				engine.shutdown();
		}
		System.out.println("Prova Service destroyed");
	}
	
	@Override
	public String instance(String rulebase) {
		ProvaCommunicator prova = null;
		String id = null;
		try {
			id = UUID.randomUUID().toString();
			prova = new ProvaCommunicatorImpl(id,null,rulebase,ProvaCommunicatorImpl.SYNC);
			engines.put(id, prova);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return id;
	}

	@Override
	public void release(String id) {
		ProvaCommunicator engine = engines.remove(id);
		if( engine==null )
			throw new RuntimeException("No engine instance "+id);
	}
	
	@Override
	public List<ProvaSolution[]> consult(String id, String src, String key) {
		try {
			ProvaCommunicator engine = engines.remove(id);
			if( engine==null )
				throw new RuntimeException("No engine instance "+id);
			List<ProvaSolution[]> resultSets = engine.consultSync(src, key, new Object[]{});
			return resultSets;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
}
