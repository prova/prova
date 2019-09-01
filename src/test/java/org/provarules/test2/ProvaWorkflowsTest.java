package org.provarules.test2;

import org.junit.After;
import org.junit.Test;
import org.provarules.api2.ProvaCommunicator;
import org.provarules.api2.ProvaCommunicatorImpl;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class ProvaWorkflowsTest {

    private static final String kAgent = "prova";

    private static final String kPort = null;

    // Unique key identifying the consulted input (useful in interactive environment)
    int key = 0;

    private ProvaCommunicator prova = null;

    @After
    public void shutdown() {
        if (prova != null) {
            prova.shutdown();
            prova = null;
        }
    }

    @Test
    public void simple_join() {
        final String rulebase = "rules/reloaded/process_join.prova";

        AtomicInteger count = new AtomicInteger();
        Map<String, Object> globals = new HashMap<>();
        globals.put("$Count", count);
        prova = new ProvaCommunicatorImpl(kAgent, kPort, rulebase, ProvaCommunicatorImpl.SYNC, globals);

        try {
            synchronized (this) {
                wait(1000);
                org.junit.Assert.assertEquals(2, count.get());
            }
        } catch (Exception ignored) {
        }
    }

    @Test
    public void predicate_join() {
        final String rulebase = "rules/reloaded/predicate_join_concurrent.prova";

        AtomicInteger count = new AtomicInteger();
        Map<String, Object> globals = new HashMap<>();
        globals.put("$Count", count);
        prova = new ProvaCommunicatorImpl(kAgent, kPort, rulebase, ProvaCommunicatorImpl.SYNC, globals);

        try {
            synchronized (this) {
                wait(2500);
                org.junit.Assert.assertEquals(6, count.get());
            }
        } catch (Exception ignored) {
        }
    }

}
