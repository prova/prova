package ws.prova.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import org.apache.log4j.Logger;

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

	private final static Logger log = Logger.getLogger("prova");

	private String id;
	
	private ConcurrentMap<String,ProvaCommunicator> engines;

	private ConcurrentMap<String, List<String>> topicDestinations = new ConcurrentHashMap<String, List<String>>();
	
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
		if( "present".equals(((ProvaConstant) terms.getFixed()[3]).getObject()) ) {
			// Ask the subscriber to start receiving the stream
			String topic = ((ProvaList) terms.getFixed()[4]).getFixed()[0].toString();
			if( log.isDebugEnabled() )
				log.debug("Subscriber "+dest+" to receive stream on "+topic);
			// Register the mapping
			registerMapping(topic, dest);
		} else if( "data".equals(((ProvaConstant) terms.getFixed()[3]).getObject()) ) {
			// Dispatch a stream to subscribers
			if( log.isDebugEnabled() )
				log.debug("Dispatch data on stream "+dest);
			for( String target : topicDestinations.get(dest) ) {
				ProvaCommunicator engine = engines.get(target);
				if( engine==null )
					log.error("Subscriber "+target+" not present");
				engine.addMsg(terms);
				if( log.isDebugEnabled() )
					log.debug("Sent: "+terms);
			}
			return;
		}
		ProvaCommunicator engine = engines.get(dest);
		if( engine==null )
			throw new RuntimeException("No engine instance "+dest);
		engine.addMsg(terms);
		if( log.isDebugEnabled() )
			log.debug("Sent: "+terms);
	}

	private synchronized void registerMapping(String topic, String dest) {
		List<String> list = topicDestinations.get(topic);
		if( list==null ) {
			list = new ArrayList<String>();
			topicDestinations.put(topic, list);
		}
		list.add(dest);
		
	}

	@Override
	public void setGlobalConstant(String agent, String name, Object value) {
		ProvaCommunicator engine = engines.get(agent);
		if( engine==null )
			throw new RuntimeException("No engine instance "+agent);
		engine.setGlobalConstant(name, value);
	}
	
}
