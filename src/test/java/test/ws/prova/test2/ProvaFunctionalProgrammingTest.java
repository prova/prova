package test.ws.prova.test2;

import java.util.List;

import org.junit.Test;

import ws.prova.api2.ProvaCommunicator;
import ws.prova.api2.ProvaCommunicatorImpl;
import ws.prova.exchange.ProvaSolution;

public class ProvaFunctionalProgrammingTest {

	static final String kAgent = "prova";

	static final String kPort = null;

	/*
	 * This test is postponed to version 3.0.1
	 */
//	@Test
	public void func_reactive_unfoldr() {
		final String rulebase = "rules/reloaded/func_013.prova";
		final int[] numSolutions = new int[] {0,1};
		
		ProvaCommunicator prova = new ProvaCommunicatorImpl(kAgent,kPort,rulebase,ProvaCommunicatorImpl.SYNC);
		List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

		try {
			synchronized(this) {
				wait(1000);
			}
		} catch (Exception e) {
		}

		org.junit.Assert.assertEquals(numSolutions.length,solutions.size());
		org.junit.Assert.assertEquals(numSolutions[0],solutions.get(0).length);
		org.junit.Assert.assertEquals(numSolutions[1],solutions.get(1).length);
	}

	@Test
	public void func_unfoldr() {
		final String rulebase = "rules/reloaded/func_012.prova";
		final int[] numSolutions = new int[] {0,1,1};
		
		ProvaCommunicator prova = new ProvaCommunicatorImpl(kAgent,kPort,rulebase,ProvaCommunicatorImpl.SYNC);
		List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

		org.junit.Assert.assertEquals(numSolutions.length,solutions.size());
		org.junit.Assert.assertEquals(numSolutions[0],solutions.get(0).length);
		org.junit.Assert.assertEquals(numSolutions[1],solutions.get(1).length);
	}

	@Test
	public void func_stream_fusion_2() {
		final String rulebase = "rules/reloaded/func_011.prova";
		final int[] numSolutions = new int[] {0,1};
		
		ProvaCommunicator prova = new ProvaCommunicatorImpl(kAgent,kPort,rulebase,ProvaCommunicatorImpl.SYNC);
		List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

		org.junit.Assert.assertEquals(numSolutions.length,solutions.size());
		org.junit.Assert.assertEquals(numSolutions[0],solutions.get(0).length);
	}

	@Test
	public void func_stream_fusion() {
		final String rulebase = "rules/reloaded/func_010.prova";
		final int[] numSolutions = new int[] {0,1};
		
		ProvaCommunicator prova = new ProvaCommunicatorImpl(kAgent,kPort,rulebase,ProvaCommunicatorImpl.SYNC);
		List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

		org.junit.Assert.assertEquals(numSolutions.length,solutions.size());
		org.junit.Assert.assertEquals(numSolutions[0],solutions.get(0).length);
	}

	@Test
	public void func_fact_monad() {
		final String rulebase = "rules/reloaded/func_fact_monad.prova";
		final int[] numSolutions = new int[] {0,1,1,1,3,1,3,1,3,1,3,1,1,1};
		
		ProvaCommunicator prova = new ProvaCommunicatorImpl(kAgent,kPort,rulebase,ProvaCommunicatorImpl.SYNC);
		List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

		org.junit.Assert.assertEquals(numSolutions.length,solutions.size());
		org.junit.Assert.assertEquals(numSolutions[2],solutions.get(2).length);
		org.junit.Assert.assertEquals(numSolutions[4],solutions.get(4).length);
	}

	@Test
	public void test_clone() {
		final String rulebase = "rules/reloaded/clone.prova";
		
		ProvaCommunicator prova = new ProvaCommunicatorImpl(kAgent,kPort,rulebase,ProvaCommunicatorImpl.SYNC);
		final int numSolutions[] = {1};
		List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

		org.junit.Assert.assertEquals(numSolutions.length,solutions.size());
		for( int i=0; i<numSolutions.length; i++ )
			org.junit.Assert.assertEquals("Solution "+(i+1)+" incorrect",numSolutions[i],solutions.get(i).length);
	}

	@Test
	public void list_and_state_reimplemented() {
		final String rulebase = "rules/reloaded/func_009.prova";
		
		ProvaCommunicator prova = new ProvaCommunicatorImpl(kAgent,kPort,rulebase,ProvaCommunicatorImpl.SYNC);
		final int numSolutions[] = {0,1,1,1,1,3,3,3,1,1,1,1,1,1,3,1,1,1,1,1,6,2,2,1,1,10,1,1};
		List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

		org.junit.Assert.assertEquals(numSolutions.length,solutions.size());
		for( int i=0; i<numSolutions.length; i++ )
			org.junit.Assert.assertEquals("Solution "+(i+1)+" incorrect",numSolutions[i],solutions.get(i).length);
	}

	// @Test
	public void continuation_monad() {
		final String rulebase = "rules/reloaded/func_008.prova";
		
		ProvaCommunicator prova = new ProvaCommunicatorImpl(kAgent,kPort,rulebase,ProvaCommunicatorImpl.SYNC);
		List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

		org.junit.Assert.assertEquals(solutions.size(),2);
	}

	@Test
	public void tree_monad() {
		final String rulebase = "rules/reloaded/func_006.prova";
		
		ProvaCommunicator prova = new ProvaCommunicatorImpl(kAgent,kPort,rulebase,ProvaCommunicatorImpl.SYNC);
		final int numSolutions[] = {0,1};
		List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

		org.junit.Assert.assertEquals(numSolutions.length,solutions.size());
		for( int i=0; i<numSolutions.length; i++ )
			org.junit.Assert.assertEquals("Solution "+(i+1)+" incorrect",numSolutions[i],solutions.get(i).length);
	}

	@Test
	public void basic() {
		final String rulebase = "rules/reloaded/func_001.prova";
		
		ProvaCommunicator prova = new ProvaCommunicatorImpl(kAgent,kPort,rulebase,ProvaCommunicatorImpl.SYNC);
		final int numSolutions[] = {0,1,1,1,1,1,1,1,1,1,1,1,1};
		List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

		org.junit.Assert.assertEquals(numSolutions.length,solutions.size());
		for( int i=0; i<numSolutions.length; i++ )
			org.junit.Assert.assertEquals("Solution "+(i+1)+" incorrect",numSolutions[i],solutions.get(i).length);
	}

	@Test
	public void mappings_not_functions() {
		final String rulebase = "rules/reloaded/func_002.prova";
		
		ProvaCommunicator prova = new ProvaCommunicatorImpl(kAgent,kPort,rulebase,ProvaCommunicatorImpl.SYNC);
		final int numSolutions[] = {0,8};
		List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

		org.junit.Assert.assertEquals(numSolutions.length,solutions.size());
		for( int i=0; i<numSolutions.length; i++ )
			org.junit.Assert.assertEquals("Solution "+(i+1)+" incorrect",numSolutions[i],solutions.get(i).length);
	}

	@Test
	public void concrete_monadic_list() {
		final String rulebase = "rules/reloaded/func_003.prova";
		
		ProvaCommunicator prova = new ProvaCommunicatorImpl(kAgent,kPort,rulebase,ProvaCommunicatorImpl.SYNC);
		final int numSolutions[] = {0,1,1,1,1,1,1,1,1,1};
		List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

		org.junit.Assert.assertEquals(numSolutions.length,solutions.size());
		for( int i=0; i<numSolutions.length; i++ )
			org.junit.Assert.assertEquals("Solution "+(i+1)+" incorrect",numSolutions[i],solutions.get(i).length);
	}

	@Test
	public void maybe_monad() {
		final String rulebase = "rules/reloaded/func_005.prova";
		
		ProvaCommunicator prova = new ProvaCommunicatorImpl(kAgent,kPort,rulebase,ProvaCommunicatorImpl.SYNC);
		final int numSolutions[] = {0,1,1,1,1,1};
		List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

		org.junit.Assert.assertEquals(numSolutions.length,solutions.size());
		for( int i=0; i<numSolutions.length; i++ )
			org.junit.Assert.assertEquals("Solution "+(i+1)+" incorrect",numSolutions[i],solutions.get(i).length);
	}

}
