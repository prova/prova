package test.ws.prova.test2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

import org.junit.After;
import org.junit.Test;

import ws.prova.api2.ProvaCommunicator;
import ws.prova.api2.ProvaCommunicatorImpl;
import ws.prova.kernel2.ProvaList;
import ws.prova.kernel2.ProvaObject;
import ws.prova.exchange.ProvaSolution;
import ws.prova.reference2.ProvaConstantImpl;
import ws.prova.reference2.ProvaListImpl;

public class ProvaMetadataTest {

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
	public void hohpe_using_groups() {
		final String rulebase = "rules/reloaded/hohpe_using_groups.prova";
		
		Map<String,Object> globals = new HashMap<String,Object>();
		AtomicInteger count = new AtomicInteger();
		globals.put("$Count", count);
		prova = new ProvaCommunicatorImpl(kAgent,kPort,rulebase,ProvaCommunicatorImpl.SYNC,globals);
		final int numSolutions[] = {0};
		List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

		org.junit.Assert.assertEquals(solutions.size(),numSolutions.length);

		try {
			synchronized(this) {
				wait(1000);
				org.junit.Assert.assertEquals(1,count.get());
			}
		} catch (Exception e) {
		}
	}

	@Test
	public void sensor_esper() {
		final String rulebase = "rules/reloaded/sensor_esper.prova";
		
		Map<String,Object> globals = new HashMap<String,Object>();
		AtomicInteger count = new AtomicInteger();
		globals.put("$Count", count);
		prova = new ProvaCommunicatorImpl(kAgent,kPort,rulebase,ProvaCommunicatorImpl.SYNC,globals);
		final int numSolutions[] = {0,0};
		List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

		org.junit.Assert.assertEquals(solutions.size(),numSolutions.length);
		for( int i=0; i<numSolutions.length; i++ )
			org.junit.Assert.assertEquals("Solution "+(i+1)+" incorrect",solutions.get(i).length,numSolutions[i]);

		try {
			synchronized(this) {
				wait(2500);
				org.junit.Assert.assertEquals(7,count.get());
			}
		} catch (Exception e) {
		}
	}

	@Test
	public void scala2() {
		final String rulebase = "rules/reloaded/scala2.prova";
		
		Map<String,Object> globals = new HashMap<String,Object>();
		AtomicInteger successfulOrders = new AtomicInteger();
		globals.put("$SuccessfulOrders", successfulOrders);
		AtomicInteger successfulCancels = new AtomicInteger();
		globals.put("$SuccessfulCancels", successfulCancels);
		AtomicInteger failedCancels = new AtomicInteger();
		globals.put("$FailedCancels", failedCancels);
		prova = new ProvaCommunicatorImpl(kAgent,kPort,rulebase,ProvaCommunicatorImpl.SYNC,globals);
		final int numSolutions[] = {0,0,0};
		List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

		org.junit.Assert.assertEquals(solutions.size(),numSolutions.length);
		for( int i=0; i<numSolutions.length; i++ )
			org.junit.Assert.assertEquals("Solution "+(i+1)+" incorrect",solutions.get(i).length,numSolutions[i]);

		try {
			synchronized(this) {
				wait(2500);
				org.junit.Assert.assertEquals(2,successfulOrders.get());
				org.junit.Assert.assertEquals(1,successfulCancels.get());
				org.junit.Assert.assertEquals(1,failedCancels.get());
			}
		} catch (Exception e) {
		}
	}

	@Test
	public void scala1() {
		final String rulebase = "rules/reloaded/scala1.prova";
		
		Map<String,Object> globals = new HashMap<String,Object>();
		AtomicInteger successfulOrders = new AtomicInteger();
		globals.put("$SuccessfulOrders", successfulOrders);
		AtomicInteger successfulCancels = new AtomicInteger();
		globals.put("$SuccessfulCancels", successfulCancels);
		AtomicInteger failedCancels = new AtomicInteger();
		globals.put("$FailedCancels", failedCancels);
		prova = new ProvaCommunicatorImpl(kAgent,kPort,rulebase,ProvaCommunicatorImpl.SYNC,globals);
		final int numSolutions[] = {0,0,0};
		List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

		org.junit.Assert.assertEquals(solutions.size(),numSolutions.length);
		for( int i=0; i<numSolutions.length; i++ )
			org.junit.Assert.assertEquals("Solution "+(i+1)+" incorrect",solutions.get(i).length,numSolutions[i]);

		try {
			synchronized(this) {
				wait(2000);
				org.junit.Assert.assertEquals(2,successfulOrders.get());
				org.junit.Assert.assertEquals(1,successfulCancels.get());
				org.junit.Assert.assertEquals(1,failedCancels.get());
			}
		} catch (Exception e) {
		}
	}

	@Test
	public void stable_limit() {
		final String rulebase = "rules/reloaded/stable_limit.prova";
		
		Map<String,Object> globals = new HashMap<String,Object>();
		AtomicInteger count = new AtomicInteger();
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

	@Test
	public void where() {
		final String rulebase = "rules/reloaded/where.prova";
		
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
				wait(4000);
				org.junit.Assert.assertEquals(5,count.get());
			}
		} catch (Exception e) {
		}
	}

	@Test
	public void and_multi_vars() {
		final String rulebase = "rules/reloaded/and_multi_vars.prova";
		
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
				org.junit.Assert.assertEquals(4,count.get());
			}
		} catch (Exception e) {
		}
	}

	@Test
	public void and_vars() {
		final String rulebase = "rules/reloaded/and_vars.prova";
		
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
				org.junit.Assert.assertEquals(1,count.get());
			}
		} catch (Exception e) {
		}
	}

	@Test
	public void retrospective_not_not() {
		final String rulebase = "rules/reloaded/retrospective_not_not.prova";
		
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
				wait(1000);
				org.junit.Assert.assertEquals(1,count.get());
			}
		} catch (Exception e) {
		}
	}

	@Test
	public void retrospective_not() {
		final String rulebase = "rules/reloaded/retrospective_not.prova";
		
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
				wait(1000);
				org.junit.Assert.assertEquals(1,count.get());
			}
		} catch (Exception e) {
		}
	}

	@Test
	public void histo_rate() {
		final String rulebase = "rules/reloaded/histo_rate.prova";
		
		AtomicLong count = new AtomicLong();
		Map<String,Object> globals = new HashMap<String,Object>();
		globals.put("$Count", count);
		prova = new ProvaCommunicatorImpl(kAgent,kPort,rulebase,ProvaCommunicatorImpl.SYNC,globals);
		
		// Send a hundred messages to the consulted Prova rulebase.
		try {
			Random r = new Random(17);
			// Accumulate histogram counts for each message
			for( int i=0; i<100; i++ ) {
				Map<String,Object> payload = new HashMap<String,Object>();
				payload.put("field", r.nextDouble());
				ProvaList terms = ProvaListImpl.create( new ProvaObject[] {
						ProvaConstantImpl.create("test"),
						ProvaConstantImpl.create("self"),
						ProvaConstantImpl.create(0),
						ProvaConstantImpl.create("inform"),
						ProvaListImpl.create(new ProvaObject[] {
								ProvaConstantImpl.create(payload)
								})
				});
				prova.addMsg(terms);
				Thread.sleep(4);
			}
			synchronized(this) {
				wait(1000);
				// All 100 events must be detected in groups
				org.junit.Assert.assertEquals(100L,count.get());
			}
		} catch (Exception e) {
			org.junit.Assert.fail("Unexpected exception: "+e.getLocalizedMessage());
		}
	}

	@Test
	public void groupby_acc() {
		final String rulebase = "rules/reloaded/groupby_acc.prova";
		
		AtomicLong count = new AtomicLong();
		Map<String,Object> globals = new HashMap<String,Object>();
		globals.put("$Count", count);
		prova = new ProvaCommunicatorImpl(kAgent,kPort,rulebase,ProvaCommunicatorImpl.SYNC,globals);
		
		// Send a hundred messages to the consulted Prova rulebase.
		try {
			// Accumulate values sorted by i%5 every 25 milliseconds.
			for( int i=0; i<100; i++ ) {
				ProvaList terms = ProvaListImpl.create( new ProvaObject[] {
						ProvaConstantImpl.create("test"),
						ProvaConstantImpl.create("self"),
						ProvaConstantImpl.create(0),
						ProvaConstantImpl.create("inform"),
						ProvaListImpl.create(new ProvaObject[] {
								ProvaConstantImpl.create("a"),
								ProvaConstantImpl.create(i),
								ProvaConstantImpl.create(5.0-i*0.2)
								})
				});
				prova.addMsg(terms);
				Thread.sleep(4);
			}
			synchronized(this) {
				wait(1500);
				// All 100 events must be detected in groups
				org.junit.Assert.assertEquals(100L,count.get());
			}
		} catch (Exception e) {
			org.junit.Assert.fail("Unexpected exception: "+e.getLocalizedMessage());
		}
	}

	@Test
	public void groupby_rate() {
		final String rulebase = "rules/reloaded/groupby_rate.prova";
		
		AtomicLong count = new AtomicLong();
		Map<String,Object> globals = new HashMap<String,Object>();
		globals.put("$Count", count);
		prova = new ProvaCommunicatorImpl(kAgent,kPort,rulebase,ProvaCommunicatorImpl.SYNC,globals);
		
		// Send a hundred messages to the consulted Prova rulebase.
		try {
			// Accumulate groupby counts for each i%5 every 25 milliseconds.
			for( int i=0; i<100; i++ ) {
				ProvaList terms = ProvaListImpl.create( new ProvaObject[] {
						ProvaConstantImpl.create("test"),
						ProvaConstantImpl.create("self"),
						ProvaConstantImpl.create(0),
						ProvaConstantImpl.create("inform"),
						ProvaListImpl.create(new ProvaObject[] {
								ProvaConstantImpl.create("a"),
								ProvaConstantImpl.create(i)
								})
				});
				prova.addMsg(terms);
				Thread.sleep(4);
			}
			synchronized(this) {
				wait(1500);
				// All 100 events must be detected in groups
				org.junit.Assert.assertEquals(100L,count.get());
			}
		} catch (Exception e) {
			org.junit.Assert.fail("Unexpected exception: "+e.getLocalizedMessage());
		}
	}

	@Test
	public void groupby_size() {
		final String rulebase = "rules/reloaded/groupby_size.prova";
		
		AtomicLong count = new AtomicLong();
		Map<String,Object> globals = new HashMap<String,Object>();
		globals.put("$Count", count);
		prova = new ProvaCommunicatorImpl(kAgent,kPort,rulebase,ProvaCommunicatorImpl.SYNC,globals);
		
		// Send a hundred messages to the consulted Prova rulebase.
		// Accumulate groupby counts for each i%5 every 5 messages.
		for( int i=0; i<100; i++ ) {
			ProvaList terms = ProvaListImpl.create( new ProvaObject[] {
					ProvaConstantImpl.create("test"),
					ProvaConstantImpl.create("async"),
					ProvaConstantImpl.create(0),
					ProvaConstantImpl.create("inform"),
					ProvaListImpl.create(new ProvaObject[] {
							ProvaConstantImpl.create("a"),
							ProvaConstantImpl.create(i)
							})
			});
			prova.addMsg(terms);
		}
		try {
			synchronized(this) {
				wait(1000);
				// Expecting 100 results gathered by all groupby maps sent
				org.junit.Assert.assertEquals(100,count.get());
			}
		} catch (Exception e) {
		}
	}

	@Test
	public void poker2_and_not() {
		final String rulebase = "rules/reloaded/poker2.prova";
		
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
				wait(2000);
				org.junit.Assert.assertEquals(4,count.get());
			}
		} catch (Exception e) {
		}
	}

	@Test
	public void and_not_seq() {
		final String rulebase = "rules/reloaded/and_not_seq.prova";
		
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
				wait(1000);
				org.junit.Assert.assertEquals(5,count.get());
			}
		} catch (Exception e) {
		}
	}

	@Test
	public void or_paused() {
		final String rulebase = "rules/reloaded/or_paused.prova";
		
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
				wait(1500);
				org.junit.Assert.assertEquals(2,count.get());
			}
		} catch (Exception e) {
		}
	}

	@Test
	public void or_pause_resume() {
		final String rulebase = "rules/reloaded/or_pause_resume.prova";
		
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
				wait(1500);
				org.junit.Assert.assertEquals(3,count.get());
			}
		} catch (Exception e) {
		}
	}

	@Test
	public void or_stop_id() {
		final String rulebase = "rules/reloaded/or_stop_id.prova";
		
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
				wait(1500);
				org.junit.Assert.assertEquals(1,count.get());
			}
		} catch (Exception e) {
		}
	}

	@Test
	public void or_stop() {
		final String rulebase = "rules/reloaded/or_stop.prova";
		
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
				wait(2500);
				org.junit.Assert.assertEquals(1,count.get());
			}
		} catch (Exception e) {
		}
	}

	@Test
	public void and_stop() {
		final String rulebase = "rules/reloaded/and_stop.prova";
		
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
				wait(2500);
				org.junit.Assert.assertEquals(2,count.get());
			}
		} catch (Exception e) {
		}
	}


	@Test
	public void or_not_count() {
		final String rulebase = "rules/reloaded/or_not_count.prova";
		
		AtomicInteger count = new AtomicInteger();
		Map<String,Object> globals = new HashMap<String,Object>();
		globals.put("$Count", count);
		AtomicInteger countTimeout = new AtomicInteger();
		globals.put("$CountTimeout", countTimeout);
		prova = new ProvaCommunicatorImpl(kAgent,kPort,rulebase,ProvaCommunicatorImpl.SYNC,globals);
		final int numSolutions[] = {0,0};
		List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

		org.junit.Assert.assertEquals(solutions.size(),numSolutions.length);
		for( int i=0; i<numSolutions.length; i++ )
			org.junit.Assert.assertEquals("Solution "+(i+1)+" incorrect",solutions.get(i).length,numSolutions[i]);

		try {
			synchronized(this) {
				wait(2000);
				org.junit.Assert.assertEquals(6,count.get());
				org.junit.Assert.assertEquals(1,countTimeout.get());
			}
		} catch (Exception e) {
		}
	}

	@Test
	public void and_not() {
		final String rulebase = "rules/reloaded/and_not.prova";
		
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
				wait(1000);
				org.junit.Assert.assertEquals(1,count.get());
			}
		} catch (Exception e) {
		}
	}

	@Test
	public void last_a_fby_b() {
		final String rulebase = "rules/reloaded/last_a_fby_b.prova";
		
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
				wait(1000);
				org.junit.Assert.assertEquals(2,count.get());
			}
		} catch (Exception e) {
		}
	}

	@Test
	public void and_mult() {
		final String rulebase = "rules/reloaded/and_mult.prova";
		
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
				wait(2000);
				org.junit.Assert.assertEquals(2,count.get());
			}
		} catch (Exception e) {
		}
	}

	@Test
	public void or_count() {
		final String rulebase = "rules/reloaded/or_count.prova";
		
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
				wait(2500);
				org.junit.Assert.assertEquals(2,count.get());
			}
		} catch (Exception e) {
		}
	}

	@Test
	public void or_not_and() {
		final String rulebase = "rules/reloaded/or_not_and.prova";
		
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
				wait(2000);
				org.junit.Assert.assertEquals(2,count.get());
			}
		} catch (Exception e) {
		}
	}

	@Test
	public void or_not() {
		final String rulebase = "rules/reloaded/or_not.prova";
		
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
				wait(2500);
				org.junit.Assert.assertEquals(5,count.get());
			}
		} catch (Exception e) {
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

	@Test
	public void or() {
		final String rulebase = "rules/reloaded/or.prova";
		
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
				wait(2500);
				org.junit.Assert.assertEquals(2,count.get());
			}
		} catch (Exception e) {
		}
	}

	@Test
	public void sequence() {
		final String rulebase = "rules/reloaded/sequence.prova";
		
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
				wait(2500);
				org.junit.Assert.assertEquals(1,count.get());
			}
		} catch (Exception e) {
		}
	}

	@Test
	public void and() {
		final String rulebase = "rules/reloaded/and.prova";
		
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

	@Test
	public void labels() {
		final String rulebase = "rules/reloaded/label.prova";
		
		prova = new ProvaCommunicatorImpl(kAgent,kPort,rulebase,ProvaCommunicatorImpl.SYNC);
		final int numSolutions[] = {3,3,0,3,3,6,3,3,3};
		List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

		org.junit.Assert.assertEquals(numSolutions.length,solutions.size());
		for( int i=0; i<numSolutions.length; i++ )
			org.junit.Assert.assertEquals("Solution "+(i+1)+" incorrect",numSolutions[i],solutions.get(i).length);
	}

	@Test
	public void guards() {
		final String rulebase = "rules/reloaded/guard.prova";
		
		AtomicInteger count = new AtomicInteger();
		Map<String,Object> globals = new HashMap<String,Object>();
		globals.put("$Count", count);
		prova = new ProvaCommunicatorImpl(kAgent,kPort,rulebase,ProvaCommunicatorImpl.SYNC,globals);
		final int numSolutions[] = {1,0,0,0};
		List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

		org.junit.Assert.assertEquals(numSolutions.length,solutions.size());
		for( int i=0; i<numSolutions.length; i++ )
			org.junit.Assert.assertEquals("Solution "+(i+1)+" incorrect",numSolutions[i],solutions.get(i).length);

		try {
			synchronized(this) {
				wait(2500);
				org.junit.Assert.assertEquals(1,count.get());
			}
		} catch (Exception e) {
		}
	}

}
