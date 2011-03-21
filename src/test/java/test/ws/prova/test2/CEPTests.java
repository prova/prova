package test.ws.prova.test2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import org.junit.After;
import org.junit.Test;

import ws.prova.api2.ProvaCommunicator;
import ws.prova.api2.ProvaCommunicatorImpl;
import ws.prova.exchange.ProvaSolution;

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
	public void or_and() {
		final String rulebase = "rules/reloaded/or_and.prova";
		
		AtomicInteger count = new AtomicInteger();
		Map<String,Object> globals = new HashMap<String,Object>();
		globals.put("$Count", count);
		prova = new ProvaCommunicatorImpl(kAgent,kPort,rulebase,ProvaCommunicatorImpl.SYNC,globals);
		final int numSolutions[] = {0,0};
		List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

		org.junit.Assert.assertEquals(solutions.size(),numSolutions.length);
		for( int i=0; i<numSolutions.length; i++ )
			org.junit.Assert.assertEquals("Solution "+(i+1)+" incorrect",solutions.get(i).length,numSolutions[i]);

		try {
			synchronized(this) {
				wait(3000);
				org.junit.Assert.assertEquals(2,count.get());
			}
		} catch (Exception e) {
		}
	}

}
