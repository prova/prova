package test.ws.prova.test2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import ws.prova.api2.ProvaCommunicator;
import ws.prova.api2.ProvaCommunicatorImpl;
import ws.prova.kernel2.ProvaConstant;
import ws.prova.kernel2.ProvaList;
import ws.prova.exchange.ProvaSolution;

public class ProvaBuiltins1Test {

	static final String kAgent = "prova";

	static final String kPort = null;

	@Test
	public void map() {
		final String rulebase = "rules/reloaded/map.prova";
		final int[] numSolutions = new int[] {4};
		
		ProvaCommunicator prova = new ProvaCommunicatorImpl(kAgent,kPort,rulebase,ProvaCommunicatorImpl.SYNC);
		List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

		org.junit.Assert.assertEquals(1,solutions.size());
		org.junit.Assert.assertEquals(numSolutions[0],solutions.get(0).length);
		org.junit.Assert.assertTrue(solutions.get(0)[0].getNv("X") instanceof ProvaConstant);
		final Object ans2 = ((ProvaConstant) solutions.get(0)[2].getNv("X")).getObject();
		org.junit.Assert.assertTrue(ans2.equals(1));
		final Object ans3 = ((ProvaConstant) solutions.get(0)[3].getNv("X")).getObject();
		org.junit.Assert.assertTrue(ans3.equals(1));
	}

	@Test
	public void free() {
		final String rulebase = "rules/reloaded/test010.prova";
		final int[] numSolutions = new int[] {1};
		
		ProvaCommunicator prova = new ProvaCommunicatorImpl(kAgent,kPort,rulebase,ProvaCommunicatorImpl.SYNC);
		List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

		org.junit.Assert.assertEquals(1,solutions.size());
		org.junit.Assert.assertEquals(numSolutions[0],solutions.get(0).length);
	}

	@Test
	public void tokenize_list() {
		final String rulebase = "rules/reloaded/tokenize_list.prova";
		final int[] numSolutions = new int[] {2};
		
		ProvaCommunicator prova = new ProvaCommunicatorImpl(kAgent,kPort,rulebase,ProvaCommunicatorImpl.SYNC);
		List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

		org.junit.Assert.assertEquals(1,solutions.size());
		org.junit.Assert.assertEquals(numSolutions[0],solutions.get(0).length);
	}

	@Test
	public void parse_list() {
		final String rulebase = "rules/reloaded/parse_list.prova";
		final int[] numSolutions = new int[] {2};
		
		ProvaCommunicator prova = new ProvaCommunicatorImpl(kAgent,kPort,rulebase,ProvaCommunicatorImpl.SYNC);
		List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

		org.junit.Assert.assertEquals(1,solutions.size());
		org.junit.Assert.assertEquals(numSolutions[0],solutions.get(0).length);
	}

	@Test
	public void byte_stream_and_copy_stream() {
		final String rulebase = "rules/reloaded/byte_stream.prova";
		final int[] numSolutions = new int[] {1};
		
		ProvaCommunicator prova = new ProvaCommunicatorImpl(kAgent,kPort,rulebase,ProvaCommunicatorImpl.SYNC);
		List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

		org.junit.Assert.assertEquals(1,solutions.size());
		org.junit.Assert.assertEquals(numSolutions[0],solutions.get(0).length);
	}

	@Test
	public void read_enum() {
		final String rulebase = "rules/reloaded/read_enum.prova";
		final int[] numSolutions = new int[] {5};
		
		Map<String,Object> globals = new HashMap<String,Object>();
		globals.put("$File", rulebase);
		ProvaCommunicator prova = new ProvaCommunicatorImpl(kAgent,kPort,rulebase,ProvaCommunicatorImpl.SYNC,globals);
		List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

		org.junit.Assert.assertEquals(1,solutions.size());
		org.junit.Assert.assertEquals(numSolutions[0],solutions.get(0).length);
	}

	@Test
	public void tokenize_enum() {
		final String rulebase = "rules/reloaded/tokenize_enum.prova";
		final int[] numSolutions = new int[] {3,1};
		
		String text = "j\t12s\ttt";
		Map<String,Object> globals = new HashMap<String,Object>();
		globals.put("$Text", text);
		ProvaCommunicator prova = new ProvaCommunicatorImpl(kAgent,kPort,rulebase,ProvaCommunicatorImpl.SYNC,globals);
		List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

		org.junit.Assert.assertEquals(2,solutions.size());

		org.junit.Assert.assertEquals(numSolutions[0],solutions.get(0).length);
		org.junit.Assert.assertTrue(solutions.get(0)[0].getNv("Value1") instanceof ProvaConstant);
		final Object ans1 = ((ProvaConstant) solutions.get(0)[0].getNv("Value1")).getObject();
		org.junit.Assert.assertTrue(ans1.equals("j"));
		org.junit.Assert.assertTrue(solutions.get(0)[2].getNv("Value1") instanceof ProvaConstant);
		final Object ans2 = ((ProvaConstant) solutions.get(0)[2].getNv("Value1")).getObject();
		org.junit.Assert.assertTrue(ans2.equals("tt"));

		org.junit.Assert.assertEquals(numSolutions[1],solutions.get(1).length);
		org.junit.Assert.assertTrue(solutions.get(1)[0].getNv("Value2") instanceof ProvaConstant);
		final Object ans3 = ((ProvaConstant) solutions.get(1)[0].getNv("Value2")).getObject();
		org.junit.Assert.assertTrue(ans3.equals("tt"));
	}

	@Test
	public void parse_nv() {
		final String rulebase = "rules/reloaded/parse_nv.prova";
		final int[] numSolutions = new int[] {2,2};
		
		String text = "j=12,s=tt";
		Map<String,Object> globals = new HashMap<String,Object>();
		globals.put("$Text", text);
		ProvaCommunicator prova = new ProvaCommunicatorImpl(kAgent,kPort,rulebase,ProvaCommunicatorImpl.SYNC,globals);
		List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

		org.junit.Assert.assertEquals(2,solutions.size());

		for( int i=0; i<2; i++ ) {
			org.junit.Assert.assertEquals(numSolutions[i],solutions.get(i).length);
			org.junit.Assert.assertTrue(solutions.get(i)[0].getNv("Value"+(i+1)) instanceof ProvaConstant);
			final Object ans1 = ((ProvaConstant) solutions.get(i)[0].getNv("Value"+(i+1))).getObject();
			org.junit.Assert.assertTrue(ans1.equals("12"));
			org.junit.Assert.assertTrue(solutions.get(i)[1].getNv("Value"+(i+1)) instanceof ProvaConstant);
			final Object ans2 = ((ProvaConstant) solutions.get(i)[1].getNv("Value"+(i+1))).getObject();
			org.junit.Assert.assertTrue(ans2.equals("tt"));
		}
	}

	@Test
	public void unescape() {
		final String rulebase = "rules/reloaded/unescape.prova";
		final int[] numSolutions = new int[] {1,1};
		
		ProvaCommunicator prova = new ProvaCommunicatorImpl(kAgent,kPort,rulebase,ProvaCommunicatorImpl.SYNC);
		List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

		org.junit.Assert.assertEquals(solutions.size(),2);
		org.junit.Assert.assertEquals(solutions.get(0).length,numSolutions[0]);
		org.junit.Assert.assertTrue(solutions.get(0)[0].getNv("Esc1") instanceof ProvaConstant);
		final Object ans1 = ((ProvaConstant) solutions.get(0)[0].getNv("Esc1")).getObject();
		org.junit.Assert.assertTrue(ans1.equals("line1\nline2\nline3"));
		org.junit.Assert.assertEquals(solutions.get(1).length,numSolutions[1]);
		org.junit.Assert.assertTrue(solutions.get(1)[0].getNv("Esc1") instanceof ProvaConstant);
		final Object ans2 = ((ProvaConstant) solutions.get(1)[0].getNv("Esc1")).getObject();
		org.junit.Assert.assertTrue(ans2.equals("line1\tline2\tline3"));
	}

	@Test
	public void concat() {
		final String rulebase = "rules/reloaded/concat.prova";
		final int[] numSolutions = new int[] {1,1,0,0};
		
		ProvaCommunicator prova = new ProvaCommunicatorImpl(kAgent,kPort,rulebase,ProvaCommunicatorImpl.SYNC);
		List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

		org.junit.Assert.assertEquals(solutions.size(),4);
		org.junit.Assert.assertEquals(solutions.get(0).length,numSolutions[0]);
		org.junit.Assert.assertTrue(solutions.get(0)[0].getNv("AB") instanceof ProvaConstant);
		org.junit.Assert.assertTrue(((ProvaConstant) solutions.get(0)[0].getNv("AB")).getObject().equals("ab"));
		org.junit.Assert.assertEquals(solutions.get(1).length,numSolutions[1]);
		org.junit.Assert.assertEquals(solutions.get(2).length,numSolutions[2]);
		org.junit.Assert.assertEquals(solutions.get(3).length,numSolutions[3]);
	}

	@Test
	public void capture_enum() {
		final String rulebase = "rules/reloaded/test017.prova";
		final int[] numSolutions = new int[] {2};
		
		ProvaCommunicator prova = new ProvaCommunicatorImpl(kAgent,kPort,rulebase,ProvaCommunicatorImpl.SYNC);
		List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

		org.junit.Assert.assertEquals(solutions.size(),1);
		org.junit.Assert.assertEquals(solutions.get(0).length,numSolutions[0]);
		org.junit.Assert.assertTrue(solutions.get(0)[0].getNv("Groups") instanceof ProvaList);
	}

}
