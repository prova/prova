package test.ws.prova.test2;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import org.junit.After;
import org.junit.Test;

import ws.prova.api2.ProvaCommunicator;
import ws.prova.api2.ProvaCommunicatorImpl;

public class CEPTests {

	static final String kAgent = "prova";

	static final String kPort = null;
	
private ProvaCommunicator prova = null;
	
	@After
	public void shutdown() {
		if( prova!=null ) {
			prova.shutdown();
			prova = null;
		}
	}

	@Test
	public void list_ops() {
		final String rulebase = "rules/cep/cep001.prova";
		
		
		AtomicInteger count = new AtomicInteger();
		Map<String,Object> globals = new HashMap<String,Object>();
		globals.put("$Count", count);
		prova = new ProvaCommunicatorImpl(kAgent,kPort,rulebase,ProvaCommunicatorImpl.SYNC,globals);
		
		try {
			synchronized(this) {
				wait(1000);
				org.junit.Assert.assertEquals(0,count.get());
			}
		} catch (Exception e) {
			
		}
		
	}	

}
