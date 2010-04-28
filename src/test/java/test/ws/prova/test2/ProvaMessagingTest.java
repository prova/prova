package test.ws.prova.test2;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import org.junit.After;
import org.junit.Test;

import ws.prova.api2.ProvaCommunicator;
import ws.prova.api2.ProvaCommunicatorImpl;

public class ProvaMessagingTest {

	static final String kAgent = "prova";

	static final String kPort = null;

	// Unique key identifying the consulted input (useful in interactive environment)
	int key = 0;

	private ProvaCommunicator prova = null;
	
	@After
	public void shutdown() {
		if( prova!=null ) {
			prova.shutdown();
			prova = null;
		}
	}
	
	@Test
	public void parallel_001() {
		final String rulebase = "rules/reloaded/parallel.prova";

		AtomicInteger count = new AtomicInteger();
		Map<String,Object> globals = new HashMap<String,Object>();
		globals.put("$Count", count);
		prova = new ProvaCommunicatorImpl(kAgent,kPort,rulebase,ProvaCommunicatorImpl.SYNC,globals);

		try {
			synchronized(this) {
				wait(200);
				org.junit.Assert.assertEquals(1,count.get());
			}
		} catch (Exception e) {
		}
	}

	@Test
	public void complex_fipa_exchange() {
		final String rulebase = "rules/reloaded/test023.prova";
		
		AtomicInteger count = new AtomicInteger();
		Map<String,Object> globals = new HashMap<String,Object>();
		globals.put("$Count", count);
		prova = new ProvaCommunicatorImpl(kAgent,kPort,rulebase,ProvaCommunicatorImpl.SYNC,globals);

		try {
			synchronized(this) {
				wait(1800);
				org.junit.Assert.assertEquals(8,count.get());
			}
		} catch (Exception e) {
		}
	}

	@Test
	public void simple_sendMsg_and_rcvMsg() {
		final String rulebase = "rules/reloaded/msg001.prova";
		
		AtomicInteger count = new AtomicInteger();
		Map<String,Object> globals = new HashMap<String,Object>();
		globals.put("$Count", count);
		prova = new ProvaCommunicatorImpl(kAgent,kPort,rulebase,ProvaCommunicatorImpl.SYNC,globals);

		try {
			synchronized(this) {
				wait(1000);
				org.junit.Assert.assertEquals(4,count.get());
			}
		} catch (Exception e) {
		}
	}

	@Test
	public void inline_rcvMsg() {
		final String rulebase = "rules/reloaded/msg002.prova";
		
		AtomicInteger count = new AtomicInteger();
		Map<String,Object> globals = new HashMap<String,Object>();
		globals.put("$Count", count);
		prova = new ProvaCommunicatorImpl(kAgent,kPort,rulebase,ProvaCommunicatorImpl.SYNC,globals);

		try {
			synchronized(this) {
				wait(1000);
				org.junit.Assert.assertEquals(1,count.get());
			}
		} catch (Exception e) {
		}
	}

	@Test
	public void inline_rcvMult() {
		final String rulebase = "rules/reloaded/msg003.prova";
		
		AtomicInteger count = new AtomicInteger();
		Map<String,Object> globals = new HashMap<String,Object>();
		globals.put("$Count", count);
		prova = new ProvaCommunicatorImpl(kAgent,kPort,rulebase,ProvaCommunicatorImpl.SYNC,globals);

		try {
			synchronized(this) {
				wait(1000);
				org.junit.Assert.assertEquals(2,count.get());
			}
		} catch (Exception e) {
		}
	}

	@Test
	public void inline_rcvMult_multithreaded() {
		final String rulebase = "rules/reloaded/msg004.prova";
		
		AtomicInteger count = new AtomicInteger();
		Map<String,Object> globals = new HashMap<String,Object>();
		globals.put("$Count", count);
		prova = new ProvaCommunicatorImpl(kAgent,kPort,rulebase,ProvaCommunicatorImpl.SYNC,globals);

		try {
			synchronized(this) {
				wait(1000);
				org.junit.Assert.assertEquals(20,count.get());
			}
		} catch (Exception e) {
		}
	}

	@Test
	public void inline_spawn_multithreaded() {
		final String rulebase = "rules/reloaded/msg005.prova";
		
		AtomicInteger count = new AtomicInteger();
		Map<String,Object> globals = new HashMap<String,Object>();
		globals.put("$Count", count);
		prova = new ProvaCommunicatorImpl(kAgent,kPort,rulebase,ProvaCommunicatorImpl.SYNC,globals);

		try {
			synchronized(this) {
				wait(2000);
				org.junit.Assert.assertEquals(2,count.get());
			}
		} catch (Exception e) {
		}
	}

	@Test
	public void inline_end_of_reaction() {
		final String rulebase = "rules/reloaded/msg006.prova";
		
		AtomicInteger count = new AtomicInteger();
		Map<String,Object> globals = new HashMap<String,Object>();
		globals.put("$Count", count);
		prova = new ProvaCommunicatorImpl(kAgent,kPort,rulebase,ProvaCommunicatorImpl.SYNC,globals);

		try {
			synchronized(this) {
				wait(2000);
				org.junit.Assert.assertEquals(1,count.get());
			}
		} catch (Exception e) {
		}
	}

	@Test
	public void correlated_reaction() {
		final String rulebase = "rules/reloaded/msg007.prova";
		
		AtomicInteger count = new AtomicInteger();
		Map<String,Object> globals = new HashMap<String,Object>();
		globals.put("$Count", count);
		prova = new ProvaCommunicatorImpl(kAgent,kPort,rulebase,ProvaCommunicatorImpl.SYNC,globals);

		try {
			synchronized(this) {
				wait(2000);
				org.junit.Assert.assertEquals(2,count.get());
			}
		} catch (Exception e) {
		}
	}

	/**
	 * Demonstrate the use of the 'conversation' (partitioned) and 'task' (non-partitioned) thread pools
	 */
	@Test
	public void partitionedAndNonpartitionedThreadpools() {
		final String rulebase = "rules/reloaded/msg008.prova";
		
		AtomicInteger count = new AtomicInteger(0);
		Map<String,Object> globals = new HashMap<String,Object>();
		globals.put("$Count", count);
		prova = new ProvaCommunicatorImpl(kAgent,kPort,rulebase,ProvaCommunicatorImpl.SYNC,globals);

		try {
			synchronized(this) {
				wait(2000);
				org.junit.Assert.assertEquals(4,count.get());
			}
		} catch (Exception e) {
		}
	}

	@Test
	public void partitioned_reaction() {
		final String rulebase = "rules/reloaded/msg009.prova";
		
		AtomicInteger count = new AtomicInteger(0);
		Map<String,Object> globals = new HashMap<String,Object>();
		globals.put("$Count", count);
		prova = new ProvaCommunicatorImpl(kAgent,kPort,rulebase,ProvaCommunicatorImpl.SYNC,globals);

		try {
			synchronized(this) {
				wait(1000);
				org.junit.Assert.assertEquals(4,count.get());
			}
		} catch (Exception e) {
		}
	}

	@Test
	public void map_payload() {
		final String rulebase = "rules/reloaded/msg011.prova";
		
		AtomicInteger count = new AtomicInteger(0);
		Map<String,Object> globals = new HashMap<String,Object>();
		globals.put("$Count", count);
		prova = new ProvaCommunicatorImpl(kAgent,kPort,rulebase,ProvaCommunicatorImpl.SYNC,globals);

		try {
			synchronized(this) {
				wait(1000);
				org.junit.Assert.assertEquals(1,count.get());
			}
		} catch (Exception e) {
		}
	}

	/**
	 * Demonstrate the use cycled event processing.
	 * Inbound events for 2 different XID are executed concurrently.
	 * 3 inbound events for the same XID are processed sequentially so that a new event is executed
	 * 		on the same 'conversation' thread when the previous processing is done.
	 * Internally each processing step consists of 4 concurrent processes.
	 * Only when all of them are finished, the lock manager unlocks the processing of further events on the same XID.
	 */
	@Test
	public void cycleEventProcessing() {
		final String rulebase = "rules/reloaded/msg010.prova";
		
		AtomicInteger count = new AtomicInteger(0);
		Map<String,Object> globals = new HashMap<String,Object>();
		globals.put("$Count", count);
		prova = new ProvaCommunicatorImpl(kAgent,kPort,rulebase,ProvaCommunicatorImpl.SYNC,globals);

		try {
			synchronized(this) {
				wait(2000);
				org.junit.Assert.assertEquals(6,count.get());
			}
		} catch (Exception e) {
		}
	}

	@Test
	public void interThreadMessaging() {
		final String rulebase = "rules/reloaded/async_2.prova";
		
		AtomicInteger count = new AtomicInteger(0);
		Map<String,Object> globals = new HashMap<String,Object>();
		globals.put("$Count", count);
		prova = new ProvaCommunicatorImpl(kAgent,kPort,rulebase,ProvaCommunicatorImpl.SYNC,globals);

		try {
			synchronized(this) {
				wait(2000);
				org.junit.Assert.assertEquals(3,count.get());
			}
		} catch (Exception e) {
		}
	}

}
