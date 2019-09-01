package org.provarules.test2;

import org.junit.Assert;
import org.junit.Test;
import org.provarules.api2.ProvaCommunicator;
import org.provarules.api2.ProvaCommunicatorImpl;
import org.provarules.exchange.ProvaSolution;
import org.provarules.kernel2.ProvaConstant;
import org.provarules.kernel2.ProvaList;
import org.provarules.kernel2.ProvaObject;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProvaBuiltins1Test {

    private static final String kAgent = "prova";

    private static final String kPort = null;

    @Test
    public void list_ops() {
        final String rulebase = "rules/reloaded/list_ops.prova";
        final int[] numSolutions = new int[]{1, 0, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1};

        ProvaCommunicator prova = new ProvaCommunicatorImpl(kAgent, kPort, rulebase, ProvaCommunicatorImpl.SYNC);
        List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

        org.junit.Assert.assertEquals(numSolutions.length, solutions.size());
        org.junit.Assert.assertEquals(numSolutions[0], solutions.get(0).length);
        org.junit.Assert.assertTrue(solutions.get(0)[0].getNv("L1") instanceof ProvaConstant);
        final Object ans2 = ((ProvaConstant) solutions.get(0)[0].getNv("L1")).getObject();
        Assert.assertEquals(3, ans2);
    }

    @Test
    public void map() {
        final String rulebase = "rules/reloaded/map.prova";
        final int[] numSolutions = new int[]{3};

        ProvaCommunicator prova = new ProvaCommunicatorImpl(kAgent, kPort, rulebase, ProvaCommunicatorImpl.SYNC);
        List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

        org.junit.Assert.assertEquals(1, solutions.size());
        org.junit.Assert.assertEquals(numSolutions[0], solutions.get(0).length);
        org.junit.Assert.assertTrue(solutions.get(0)[0].getNv("X") instanceof ProvaConstant);
        final Object ans2 = ((ProvaConstant) solutions.get(0)[2].getNv("X")).getObject();
        Assert.assertEquals(1, ans2);
    }

    @Test
    public void map2() {
        final String rulebase = "rules/reloaded/map2.prova";
        final int[] numSolutions = new int[]{1};

        ProvaCommunicator prova = new ProvaCommunicatorImpl(kAgent, kPort, rulebase, ProvaCommunicatorImpl.SYNC);
        List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

        org.junit.Assert.assertEquals(1, solutions.size());
        org.junit.Assert.assertEquals(numSolutions[0], solutions.get(0).length);
        org.junit.Assert.assertTrue(solutions.get(0)[0].getNv("X") instanceof ProvaConstant);
        final Object ans2 = ((ProvaConstant) solutions.get(0)[0].getNv("X")).getObject();
        org.junit.Assert.assertTrue(ans2 instanceof Map<?, ?>);
    }

    @SuppressWarnings("rawtypes")
    @Test
    public void map3() {
        final String rulebase = "rules/reloaded/map3.prova";
        final int[] numSolutions = new int[]{1};

        ProvaCommunicator prova = new ProvaCommunicatorImpl(kAgent, kPort, rulebase, ProvaCommunicatorImpl.SYNC);
        List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

        org.junit.Assert.assertEquals(1, solutions.size());
        org.junit.Assert.assertEquals(numSolutions[0], solutions.get(0).length);
        org.junit.Assert.assertTrue(solutions.get(0)[0].getNv("P") instanceof ProvaConstant);
        final Object ans2 = ((ProvaConstant) solutions.get(0)[0].getNv("P")).getObject();
        org.junit.Assert.assertTrue(ans2 instanceof Map);
        org.junit.Assert.assertEquals(1, ((Map) ans2).size());
    }

    @Test
    public void map_in_head_literal() {
        final String rulebase = "rules/reloaded/map4.prova";
        final int[] numSolutions = new int[]{1};

        ProvaCommunicator prova = new ProvaCommunicatorImpl(kAgent, kPort, rulebase, ProvaCommunicatorImpl.SYNC);
        List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

        org.junit.Assert.assertEquals(1, solutions.size());
        org.junit.Assert.assertEquals(numSolutions[0], solutions.get(0).length);
        org.junit.Assert.assertTrue(solutions.get(0)[0].getNv("A") instanceof ProvaConstant);
        final Object ans2 = ((ProvaConstant) solutions.get(0)[0].getNv("A")).getObject();
        org.junit.Assert.assertTrue(ans2 instanceof Integer);
        long l = (Integer) ans2;
        org.junit.Assert.assertEquals(3L, l);
    }

    @Test
    public void map_with_list_with_unbound_variables() {
        final String rulebase = "rules/reloaded/map5.prova";
        final int[] numSolutions = new int[]{1};

        ProvaCommunicator prova = new ProvaCommunicatorImpl(kAgent, kPort, rulebase, ProvaCommunicatorImpl.SYNC);
        List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

        org.junit.Assert.assertEquals(1, solutions.size());
        org.junit.Assert.assertEquals(numSolutions[0], solutions.get(0).length);
        org.junit.Assert.assertTrue(solutions.get(0)[0].getNv("A") instanceof ProvaConstant);
        final Object ans2 = ((ProvaConstant) solutions.get(0)[0].getNv("A")).getObject();
        org.junit.Assert.assertTrue(ans2 instanceof Integer);
        long l = (Integer) ans2;
        org.junit.Assert.assertEquals(1L, l);
        org.junit.Assert.assertTrue(solutions.get(0)[0].getNv("B") instanceof ProvaList);
        final ProvaObject[] fixed = ((ProvaList) solutions.get(0)[0].getNv("B")).getFixed();
        org.junit.Assert.assertEquals(2, fixed.length);
    }

    @Test
    public void map_merge() {
        final String rulebase = "rules/reloaded/map_merge.prova";
        final int[] numSolutions = new int[]{1, 1, 1, 0, 1, 1, 1, 1};

        ProvaCommunicator prova = new ProvaCommunicatorImpl(kAgent, kPort, rulebase, ProvaCommunicatorImpl.SYNC);
        List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

        org.junit.Assert.assertEquals(numSolutions.length, solutions.size());
        for (int i = 0; i < numSolutions.length; i++)
            org.junit.Assert.assertEquals("Incorrect number of solutions for problem " + (i + 1), numSolutions[i], solutions.get(i).length);
    }

    @Test
    public void map_merge2() {
        final String rulebase = "rules/reloaded/map_merge2.prova";
        final int[] numSolutions = new int[]{1, 1, 1, 0, 1, 1, 1, 1};

        ProvaCommunicator prova = new ProvaCommunicatorImpl(kAgent, kPort, rulebase, ProvaCommunicatorImpl.SYNC);
        List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

        org.junit.Assert.assertEquals(numSolutions.length, solutions.size());
        for (int i = 0; i < numSolutions.length; i++)
            org.junit.Assert.assertEquals("Incorrect number of solutions for problem " + (i + 1), numSolutions[i], solutions.get(i).length);
    }

    @Test
    public void map_elements() {
        final String rulebase = "rules/reloaded/map_elements.prova";
        final int[] numSolutions = new int[]{1, 1};

        ProvaCommunicator prova = new ProvaCommunicatorImpl(kAgent, kPort, rulebase, ProvaCommunicatorImpl.SYNC);
        List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

        org.junit.Assert.assertEquals(numSolutions.length, solutions.size());
        for (int i = 0; i < numSolutions.length; i++)
            org.junit.Assert.assertEquals("Incorrect number of solutions for problem " + (i + 1), numSolutions[i], solutions.get(i).length);
    }

    @Test
    public void map_nested() {
        final String rulebase = "rules/reloaded/map_nested.prova";
        final int[] numSolutions = new int[]{1, 1};

        ProvaCommunicator prova = new ProvaCommunicatorImpl(kAgent, kPort, rulebase, ProvaCommunicatorImpl.SYNC);
        List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

        org.junit.Assert.assertEquals(numSolutions.length, solutions.size());
        for (int i = 0; i < numSolutions.length; i++)
            org.junit.Assert.assertEquals("Incorrect number of solutions for problem " + (i + 1), numSolutions[i], solutions.get(i).length);
    }

    @Test
    public void free() {
        final String rulebase = "rules/reloaded/test010.prova";
        final int[] numSolutions = new int[]{1};

        ProvaCommunicator prova = new ProvaCommunicatorImpl(kAgent, kPort, rulebase, ProvaCommunicatorImpl.SYNC);
        List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

        org.junit.Assert.assertEquals(1, solutions.size());
        org.junit.Assert.assertEquals(numSolutions[0], solutions.get(0).length);
    }

    @Test
    public void tokenize_list() {
        final String rulebase = "rules/reloaded/tokenize_list.prova";
        final int[] numSolutions = new int[]{2};

        ProvaCommunicator prova = new ProvaCommunicatorImpl(kAgent, kPort, rulebase, ProvaCommunicatorImpl.SYNC);
        List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

        org.junit.Assert.assertEquals(1, solutions.size());
        org.junit.Assert.assertEquals(numSolutions[0], solutions.get(0).length);
    }

    @Test
    public void parse_list() {
        final String rulebase = "rules/reloaded/parse_list.prova";
        final int[] numSolutions = new int[]{2};

        ProvaCommunicator prova = new ProvaCommunicatorImpl(kAgent, kPort, rulebase, ProvaCommunicatorImpl.SYNC);
        List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

        org.junit.Assert.assertEquals(1, solutions.size());
        org.junit.Assert.assertEquals(numSolutions[0], solutions.get(0).length);
    }

    @Test
    public void byte_stream_and_copy_stream() {
        final String rulebase = "rules/reloaded/byte_stream.prova";
        final int[] numSolutions = new int[]{1};

        ProvaCommunicator prova = new ProvaCommunicatorImpl(kAgent, kPort, rulebase, ProvaCommunicatorImpl.SYNC);
        List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

        org.junit.Assert.assertEquals(1, solutions.size());
        org.junit.Assert.assertEquals(numSolutions[0], solutions.get(0).length);
    }

    @Test
    public void read_enum() {
        final String rulebase = "rules/reloaded/read_enum.prova";
        final int[] numSolutions = new int[]{5};

        Map<String, Object> globals = new HashMap<>();
        globals.put("$File", rulebase);
        ProvaCommunicator prova = new ProvaCommunicatorImpl(kAgent, kPort, rulebase, ProvaCommunicatorImpl.SYNC, globals);
        List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

        org.junit.Assert.assertEquals(1, solutions.size());
        org.junit.Assert.assertEquals(numSolutions[0], solutions.get(0).length);
    }

    @Test
    public void tokenize_enum() {
        final String rulebase = "rules/reloaded/tokenize_enum.prova";
        final int[] numSolutions = new int[]{3, 1};

        String text = "j\t12s\ttt";
        Map<String, Object> globals = new HashMap<>();
        globals.put("$Text", text);
        ProvaCommunicator prova = new ProvaCommunicatorImpl(kAgent, kPort, rulebase, ProvaCommunicatorImpl.SYNC, globals);
        List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

        org.junit.Assert.assertEquals(2, solutions.size());

        org.junit.Assert.assertEquals(numSolutions[0], solutions.get(0).length);
        org.junit.Assert.assertTrue(solutions.get(0)[0].getNv("Value1") instanceof ProvaConstant);
        final Object ans1 = ((ProvaConstant) solutions.get(0)[0].getNv("Value1")).getObject();
        Assert.assertEquals("j", ans1);
        org.junit.Assert.assertTrue(solutions.get(0)[2].getNv("Value1") instanceof ProvaConstant);
        final Object ans2 = ((ProvaConstant) solutions.get(0)[2].getNv("Value1")).getObject();
        Assert.assertEquals("tt", ans2);

        org.junit.Assert.assertEquals(numSolutions[1], solutions.get(1).length);
        org.junit.Assert.assertTrue(solutions.get(1)[0].getNv("Value2") instanceof ProvaConstant);
        final Object ans3 = ((ProvaConstant) solutions.get(1)[0].getNv("Value2")).getObject();
        Assert.assertEquals("tt", ans3);
    }

    @Test
    public void parse_nv() {
        final String rulebase = "rules/reloaded/parse_nv.prova";
        final int[] numSolutions = new int[]{2, 2};

        String text = "j=12,s=tt";
        Map<String, Object> globals = new HashMap<>();
        globals.put("$Text", text);
        ProvaCommunicator prova = new ProvaCommunicatorImpl(kAgent, kPort, rulebase, ProvaCommunicatorImpl.SYNC, globals);
        List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

        org.junit.Assert.assertEquals(2, solutions.size());

        for (int i = 0; i < 2; i++) {
            org.junit.Assert.assertEquals(numSolutions[i], solutions.get(i).length);
            org.junit.Assert.assertTrue(solutions.get(i)[0].getNv("Value" + (i + 1)) instanceof ProvaConstant);
            final Object ans1 = ((ProvaConstant) solutions.get(i)[0].getNv("Value" + (i + 1))).getObject();
            Assert.assertEquals("12", ans1);
            org.junit.Assert.assertTrue(solutions.get(i)[1].getNv("Value" + (i + 1)) instanceof ProvaConstant);
            final Object ans2 = ((ProvaConstant) solutions.get(i)[1].getNv("Value" + (i + 1))).getObject();
            Assert.assertEquals("tt", ans2);
        }
    }

    @Test
    public void unescape() {
        final String rulebase = "rules/reloaded/unescape.prova";
        final int[] numSolutions = new int[]{1, 1};

        ProvaCommunicator prova = new ProvaCommunicatorImpl(kAgent, kPort, rulebase, ProvaCommunicatorImpl.SYNC);
        List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

        org.junit.Assert.assertEquals(solutions.size(), 2);
        org.junit.Assert.assertEquals(solutions.get(0).length, numSolutions[0]);
        org.junit.Assert.assertTrue(solutions.get(0)[0].getNv("Esc1") instanceof ProvaConstant);
        final Object ans1 = ((ProvaConstant) solutions.get(0)[0].getNv("Esc1")).getObject();
        Assert.assertEquals("line1\nline2\nline3", ans1);
        org.junit.Assert.assertEquals(solutions.get(1).length, numSolutions[1]);
        org.junit.Assert.assertTrue(solutions.get(1)[0].getNv("Esc1") instanceof ProvaConstant);
        final Object ans2 = ((ProvaConstant) solutions.get(1)[0].getNv("Esc1")).getObject();
        Assert.assertEquals("line1\tline2\tline3", ans2);
    }

    @Test
    public void concat() {
        final String rulebase = "rules/reloaded/concat.prova";
        final int[] numSolutions = new int[]{1, 1, 0, 0};

        ProvaCommunicator prova = new ProvaCommunicatorImpl(kAgent, kPort, rulebase, ProvaCommunicatorImpl.SYNC);
        List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

        org.junit.Assert.assertEquals(solutions.size(), 4);
        org.junit.Assert.assertEquals(solutions.get(0).length, numSolutions[0]);
        org.junit.Assert.assertTrue(solutions.get(0)[0].getNv("AB") instanceof ProvaConstant);
        Assert.assertEquals("ab", ((ProvaConstant) solutions.get(0)[0].getNv("AB")).getObject());
        org.junit.Assert.assertEquals(solutions.get(1).length, numSolutions[1]);
        org.junit.Assert.assertEquals(solutions.get(2).length, numSolutions[2]);
        org.junit.Assert.assertEquals(solutions.get(3).length, numSolutions[3]);
    }

    @Test
    public void capture_enum() {
        final String rulebase = "rules/reloaded/test017.prova";
        final int[] numSolutions = new int[]{2};

        ProvaCommunicator prova = new ProvaCommunicatorImpl(kAgent, kPort, rulebase, ProvaCommunicatorImpl.SYNC);
        List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

        org.junit.Assert.assertEquals(solutions.size(), 1);
        org.junit.Assert.assertEquals(solutions.get(0).length, numSolutions[0]);
        org.junit.Assert.assertTrue(solutions.get(0)[0].getNv("Groups") instanceof ProvaList);
    }

    @Test
    public void variables_as_args() {
        final String rulebase = "rules/reloaded/variables_as_args.prova";
        final int[] numSolutions = new int[]{1, 1};

        ProvaCommunicator prova = new ProvaCommunicatorImpl(kAgent, kPort, rulebase, ProvaCommunicatorImpl.SYNC);
        List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

        org.junit.Assert.assertEquals(numSolutions.length, solutions.size());
        org.junit.Assert.assertEquals(numSolutions[0], solutions.get(0).length);
        org.junit.Assert.assertEquals(numSolutions[1], solutions.get(1).length);
    }

}
