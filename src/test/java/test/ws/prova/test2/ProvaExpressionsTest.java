package test.ws.prova.test2;

import java.util.List;

import org.junit.After;
import org.junit.Test;

import ws.prova.api2.ProvaCommunicator;
import ws.prova.api2.ProvaCommunicatorImpl;
import ws.prova.kernel2.ProvaConstant;
import ws.prova.exchange.ProvaSolution;

public class ProvaExpressionsTest {

	static final String kAgent = "prova";

	static final String kPort = null;

	private ProvaCommunicator prova;
	
	@After
	public void shutdown() {
		if( prova!=null ) {
			prova.shutdown();
			prova = null;
		}
	}
	
	@Test
	public void expr001() {
		final String rulebase = "rules/reloaded/expr001.prova";
		final int[] numSolutions = new int[] {3};
		
		prova = new ProvaCommunicatorImpl(kAgent,kPort,rulebase,ProvaCommunicatorImpl.SYNC);
		List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

		org.junit.Assert.assertEquals(1,solutions.size());
		org.junit.Assert.assertEquals(numSolutions[0],solutions.get(0).length);
		org.junit.Assert.assertTrue(solutions.get(0)[0].getNv("N") instanceof ProvaConstant);
		final Object ans1 = ((ProvaConstant) solutions.get(0)[0].getNv("N")).getObject();
		org.junit.Assert.assertTrue((Integer)ans1==5);
		org.junit.Assert.assertTrue(solutions.get(0)[1].getNv("N") instanceof ProvaConstant);
		final Object ans2 = ((ProvaConstant) solutions.get(0)[1].getNv("N")).getObject();
		org.junit.Assert.assertTrue((Integer)ans2==-5);
		org.junit.Assert.assertTrue(solutions.get(0)[2].getNv("N") instanceof ProvaConstant);
		final Object ans3 = ((ProvaConstant) solutions.get(0)[2].getNv("N")).getObject();
		org.junit.Assert.assertTrue((Integer)ans3==4);
	}

	@Test
	public void expr002() {
		final String rulebase = "rules/reloaded/expr002.prova";
		final int[] numSolutions = new int[] {2};
		
		prova = new ProvaCommunicatorImpl(kAgent,kPort,rulebase,ProvaCommunicatorImpl.SYNC);
		List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

		org.junit.Assert.assertEquals(1,solutions.size());
		org.junit.Assert.assertEquals(numSolutions[0],solutions.get(0).length);
		org.junit.Assert.assertTrue(solutions.get(0)[0].getNv("N") instanceof ProvaConstant);
		final Object ans1 = ((ProvaConstant) solutions.get(0)[0].getNv("N")).getObject();
		org.junit.Assert.assertTrue((Integer)ans1==2);
		org.junit.Assert.assertTrue(solutions.get(0)[1].getNv("N") instanceof ProvaConstant);
		final Object ans2 = ((ProvaConstant) solutions.get(0)[1].getNv("N")).getObject();
		org.junit.Assert.assertTrue((Integer)ans2==-1);
	}

	/**
	 * Issue PROVA-75: Fields extracted from Prova maps cannot be used in the right-hand side of binary expressions
	 */
	@Test
	public void expr003() {
		final String rulebase = "rules/reloaded/expr003.prova";
		final int[] numSolutions = new int[] {1};
		
		prova = new ProvaCommunicatorImpl(kAgent,kPort,rulebase,ProvaCommunicatorImpl.SYNC);
		List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

		org.junit.Assert.assertEquals(1,solutions.size());
		org.junit.Assert.assertEquals(numSolutions[0],solutions.get(0).length);
		org.junit.Assert.assertTrue(solutions.get(0)[0].getNv("A") instanceof ProvaConstant);
		final Object ans1 = ((ProvaConstant) solutions.get(0)[0].getNv("A")).getObject();
		org.junit.Assert.assertEquals(ans1,"yes");
	}

}
