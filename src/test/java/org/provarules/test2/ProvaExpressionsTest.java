package org.provarules.test2;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.provarules.api2.ProvaCommunicator;
import org.provarules.api2.ProvaCommunicatorImpl;
import org.provarules.exchange.ProvaSolution;
import org.provarules.kernel2.ProvaConstant;

import java.util.List;

public class ProvaExpressionsTest {

    private static final String kAgent = "prova";

    private static final String kPort = null;

    private ProvaCommunicator prova;

    @After
    public void shutdown() {
        if (prova != null) {
            prova.shutdown();
            prova = null;
        }
    }

    @Test
    public void expr001() {
        final String rulebase = "rules/reloaded/expr001.prova";
        final int[] numSolutions = new int[]{3};

        prova = new ProvaCommunicatorImpl(kAgent, kPort, rulebase, ProvaCommunicatorImpl.SYNC);
        List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

        org.junit.Assert.assertEquals(1, solutions.size());
        org.junit.Assert.assertEquals(numSolutions[0], solutions.get(0).length);
        org.junit.Assert.assertTrue(solutions.get(0)[0].getNv("N") instanceof ProvaConstant);
        final Object ans1 = ((ProvaConstant) solutions.get(0)[0].getNv("N")).getObject();
        Assert.assertEquals(5, (int) (Integer) ans1);
        org.junit.Assert.assertTrue(solutions.get(0)[1].getNv("N") instanceof ProvaConstant);
        final Object ans2 = ((ProvaConstant) solutions.get(0)[1].getNv("N")).getObject();
        Assert.assertEquals((int) (Integer) ans2, -5);
        org.junit.Assert.assertTrue(solutions.get(0)[2].getNv("N") instanceof ProvaConstant);
        final Object ans3 = ((ProvaConstant) solutions.get(0)[2].getNv("N")).getObject();
        Assert.assertEquals(4, (int) (Integer) ans3);
    }

    @Test
    public void expr002() {
        final String rulebase = "rules/reloaded/expr002.prova";
        final int[] numSolutions = new int[]{2};

        prova = new ProvaCommunicatorImpl(kAgent, kPort, rulebase, ProvaCommunicatorImpl.SYNC);
        List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

        org.junit.Assert.assertEquals(1, solutions.size());
        org.junit.Assert.assertEquals(numSolutions[0], solutions.get(0).length);
        org.junit.Assert.assertTrue(solutions.get(0)[0].getNv("N") instanceof ProvaConstant);
        final Object ans1 = ((ProvaConstant) solutions.get(0)[0].getNv("N")).getObject();
        Assert.assertEquals(2, (int) (Integer) ans1);
        org.junit.Assert.assertTrue(solutions.get(0)[1].getNv("N") instanceof ProvaConstant);
        final Object ans2 = ((ProvaConstant) solutions.get(0)[1].getNv("N")).getObject();
        Assert.assertEquals((int) (Integer) ans2, -1);
    }

    /**
     * Issue PROVA-75: Fields extracted from Prova maps cannot be used in the right-hand side of binary expressions
     */
    @Test
    public void expr003() {
        final String rulebase = "rules/reloaded/expr003.prova";
        final int[] numSolutions = new int[]{1};

        prova = new ProvaCommunicatorImpl(kAgent, kPort, rulebase, ProvaCommunicatorImpl.SYNC);
        List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

        org.junit.Assert.assertEquals(1, solutions.size());
        org.junit.Assert.assertEquals(numSolutions[0], solutions.get(0).length);
        org.junit.Assert.assertTrue(solutions.get(0)[0].getNv("A") instanceof ProvaConstant);
        final Object ans1 = ((ProvaConstant) solutions.get(0)[0].getNv("A")).getObject();
        org.junit.Assert.assertEquals(ans1, "yes");
    }

}
