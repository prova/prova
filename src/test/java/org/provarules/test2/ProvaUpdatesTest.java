package org.provarules.test2;

import org.junit.After;
import org.junit.Test;
import org.provarules.api2.ProvaCommunicator;
import org.provarules.api2.ProvaCommunicatorImpl;
import org.provarules.exchange.ProvaSolution;
import org.provarules.kernel2.ProvaConstant;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class ProvaUpdatesTest {

    static final String kAgent = "prova";

    static final String kPort = null;

    // Unique key identifying the consulted input (useful in interactive environment)
    int key = 0;

    private ProvaCommunicator prova;

    @After
    public void shutdown() {
        if (prova != null) {
            prova.shutdown();
            prova = null;
        }
    }

    @Test
    public void simple_retractall() {
        final String rulebase = "rules/reloaded/test008.prova";
        final int[] numSolutions = new int[]{6};

        prova = new ProvaCommunicatorImpl(kAgent, kPort, rulebase, ProvaCommunicatorImpl.SYNC);
        List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

        org.junit.Assert.assertEquals(1, solutions.size());
        org.junit.Assert.assertEquals(numSolutions[0], solutions.get(0).length);
        org.junit.Assert.assertTrue(solutions.get(0)[5].getNv("X") instanceof ProvaConstant);
        org.junit.Assert.assertEquals("h", ((ProvaConstant) solutions.get(0)[5].getNv("X")).getObject());
    }

    @Test
    public void gregor_hohpe_updates() {
        final String rulebase = "rules/reloaded/hohpe_dynamic_discovery.prova";

        AtomicInteger count = new AtomicInteger();
        Map<String, Object> globals = new HashMap<>();
        globals.put("$Count", count);
        prova = new ProvaCommunicatorImpl(kAgent, kPort, rulebase, ProvaCommunicatorImpl.SYNC, globals);

        try {
            synchronized (this) {
                wait(2000);
                org.junit.Assert.assertEquals(1, count.get());
            }
        } catch (Exception e) {
        }
    }

    @Test
    public void simple_updates() {
        final String rulebase = "rules/reloaded/test019.prova";

        AtomicInteger count = new AtomicInteger();
        Map<String, Object> globals = new HashMap<>();
        globals.put("$Count", count);
        prova = new ProvaCommunicatorImpl(kAgent, kPort, rulebase, ProvaCommunicatorImpl.SYNC, globals);

        try {
            synchronized (this) {
                wait(1000);
                org.junit.Assert.assertEquals(3, count.get());
            }
        } catch (Exception e) {
        }
    }

}
