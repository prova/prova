package org.provarules.test2;

import org.junit.After;
import org.junit.Test;
import org.provarules.api2.ProvaCommunicator;
import org.provarules.api2.ProvaCommunicatorImpl;
import org.provarules.exchange.ProvaSolution;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class ProvaMetadataTest2 {

    private static final String kAgent = "prova";

    private static final String kPort = null;

    private ProvaCommunicator prova = null;

    @After
    public void shutdown() {
        if (prova != null) {
            prova.shutdown();
            prova = null;
        }
    }

    @Test
    public void service_acquirer_with_retry_using_timer() {
        final String rulebase = "rules/reloaded/timer.prova";

        AtomicInteger count = new AtomicInteger();
        Map<String, Object> globals = new HashMap<>();
        globals.put("$Count", count);
        AtomicInteger timeoutCount = new AtomicInteger();
        globals.put("$TimeoutCount", timeoutCount);
        prova = new ProvaCommunicatorImpl(kAgent, kPort, rulebase, ProvaCommunicatorImpl.SYNC, globals);
        final int[] numSolutions = {0, 0, 0};
        List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

        org.junit.Assert.assertEquals(solutions.size(), numSolutions.length);
        for (int i = 0; i < numSolutions.length; i++)
            org.junit.Assert.assertEquals("Solution " + (i + 1) + " incorrect", solutions.get(i).length, numSolutions[i]);

        try {
            synchronized (this) {
                wait(4000);
                org.junit.Assert.assertEquals("Incorrect number of services acquired", 2, count.get());
                org.junit.Assert.assertEquals("Incorrect number of timeouts", 1, timeoutCount.get());
            }
        } catch (Exception ignored) {
        }
    }

    @Test
    public void poker2_and_not() {
        final String rulebase = "rules/reloaded/poker2.prova";

        AtomicInteger count = new AtomicInteger();
        Map<String, Object> globals = new HashMap<>();
        globals.put("$Count", count);
        prova = new ProvaCommunicatorImpl(kAgent, kPort, rulebase, ProvaCommunicatorImpl.SYNC, globals);
        final int[] numSolutions = {0, 0};
        List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

        org.junit.Assert.assertEquals(solutions.size(), numSolutions.length);
        for (int i = 0; i < numSolutions.length; i++)
            org.junit.Assert.assertEquals("Solution " + (i + 1) + " incorrect", solutions.get(i).length, numSolutions[i]);

        try {
            synchronized (this) {
                wait(5000);
                org.junit.Assert.assertEquals(4, count.get());
            }
        } catch (Exception ignored) {
        }
    }

    @Test
    public void and_not_seq() {
        final String rulebase = "rules/reloaded/and_not_seq.prova";

        AtomicInteger count = new AtomicInteger();
        Map<String, Object> globals = new HashMap<>();
        globals.put("$Count", count);
        prova = new ProvaCommunicatorImpl(kAgent, kPort, rulebase, ProvaCommunicatorImpl.SYNC, globals);
        final int[] numSolutions = {0, 0};
        List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

        org.junit.Assert.assertEquals(solutions.size(), numSolutions.length);
        for (int i = 0; i < numSolutions.length; i++)
            org.junit.Assert.assertEquals("Solution " + (i + 1) + " incorrect", solutions.get(i).length, numSolutions[i]);

        try {
            synchronized (this) {
                wait(1000);
                org.junit.Assert.assertEquals(5, count.get());
            }
        } catch (Exception ignored) {
        }
    }

    @Test
    public void or_paused() {
        final String rulebase = "rules/reloaded/or_paused.prova";

        AtomicInteger count = new AtomicInteger();
        Map<String, Object> globals = new HashMap<>();
        globals.put("$Count", count);
        prova = new ProvaCommunicatorImpl(kAgent, kPort, rulebase, ProvaCommunicatorImpl.SYNC, globals);
        final int[] numSolutions = {0, 0};
        List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

        org.junit.Assert.assertEquals(solutions.size(), numSolutions.length);
        for (int i = 0; i < numSolutions.length; i++)
            org.junit.Assert.assertEquals("Solution " + (i + 1) + " incorrect", solutions.get(i).length, numSolutions[i]);

        try {
            synchronized (this) {
                wait(1500);
                org.junit.Assert.assertEquals(2, count.get());
            }
        } catch (Exception ignored) {
        }
    }

    @Test
    public void or_pause_resume() {
        final String rulebase = "rules/reloaded/or_pause_resume.prova";

        AtomicInteger count = new AtomicInteger();
        Map<String, Object> globals = new HashMap<>();
        globals.put("$Count", count);
        prova = new ProvaCommunicatorImpl(kAgent, kPort, rulebase, ProvaCommunicatorImpl.SYNC, globals);
        final int[] numSolutions = {0, 0};
        List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

        org.junit.Assert.assertEquals(solutions.size(), numSolutions.length);
        for (int i = 0; i < numSolutions.length; i++)
            org.junit.Assert.assertEquals("Solution " + (i + 1) + " incorrect", solutions.get(i).length, numSolutions[i]);

        try {
            synchronized (this) {
                wait(1500);
                org.junit.Assert.assertEquals(3, count.get());
            }
        } catch (Exception ignored) {
        }
    }

    @Test
    public void or_stop_id() {
        final String rulebase = "rules/reloaded/or_stop_id.prova";

        AtomicInteger count = new AtomicInteger();
        Map<String, Object> globals = new HashMap<>();
        globals.put("$Count", count);
        prova = new ProvaCommunicatorImpl(kAgent, kPort, rulebase, ProvaCommunicatorImpl.SYNC, globals);
        final int[] numSolutions = {0, 0};
        List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

        org.junit.Assert.assertEquals(solutions.size(), numSolutions.length);
        for (int i = 0; i < numSolutions.length; i++)
            org.junit.Assert.assertEquals("Solution " + (i + 1) + " incorrect", solutions.get(i).length, numSolutions[i]);

        try {
            synchronized (this) {
                wait(1500);
                org.junit.Assert.assertEquals(1, count.get());
            }
        } catch (Exception ignored) {
        }
    }

    @Test
    public void or_stop() {
        final String rulebase = "rules/reloaded/or_stop.prova";

        AtomicInteger count = new AtomicInteger();
        Map<String, Object> globals = new HashMap<>();
        globals.put("$Count", count);
        prova = new ProvaCommunicatorImpl(kAgent, kPort, rulebase, ProvaCommunicatorImpl.SYNC, globals);
        final int[] numSolutions = {0, 0};
        List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

        org.junit.Assert.assertEquals(solutions.size(), numSolutions.length);
        for (int i = 0; i < numSolutions.length; i++)
            org.junit.Assert.assertEquals("Solution " + (i + 1) + " incorrect", solutions.get(i).length, numSolutions[i]);

        try {
            synchronized (this) {
                wait(2500);
                org.junit.Assert.assertEquals(1, count.get());
            }
        } catch (Exception ignored) {
        }
    }

    @Test
    public void and_stop() {
        final String rulebase = "rules/reloaded/and_stop.prova";

        AtomicInteger count = new AtomicInteger();
        Map<String, Object> globals = new HashMap<>();
        globals.put("$Count", count);
        prova = new ProvaCommunicatorImpl(kAgent, kPort, rulebase, ProvaCommunicatorImpl.SYNC, globals);
        final int[] numSolutions = {0, 0};
        List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

        org.junit.Assert.assertEquals(solutions.size(), numSolutions.length);
        for (int i = 0; i < numSolutions.length; i++)
            org.junit.Assert.assertEquals("Solution " + (i + 1) + " incorrect", solutions.get(i).length, numSolutions[i]);

        try {
            synchronized (this) {
                wait(3000);
                org.junit.Assert.assertEquals(2, count.get());
            }
        } catch (Exception ignored) {
        }
    }


    @Test
    public void or_not_count() {
        final String rulebase = "rules/reloaded/or_not_count.prova";

        AtomicInteger count = new AtomicInteger();
        Map<String, Object> globals = new HashMap<>();
        globals.put("$Count", count);
        AtomicInteger countTimeout = new AtomicInteger();
        globals.put("$CountTimeout", countTimeout);
        prova = new ProvaCommunicatorImpl(kAgent, kPort, rulebase, ProvaCommunicatorImpl.SYNC, globals);
        final int[] numSolutions = {0, 0};
        List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

        org.junit.Assert.assertEquals(solutions.size(), numSolutions.length);
        for (int i = 0; i < numSolutions.length; i++)
            org.junit.Assert.assertEquals("Solution " + (i + 1) + " incorrect", solutions.get(i).length, numSolutions[i]);

        try {
            synchronized (this) {
                wait(3000);
                org.junit.Assert.assertEquals(6, count.get());
                org.junit.Assert.assertEquals(1, countTimeout.get());
            }
        } catch (Exception ignored) {
        }
    }

    @Test
    public void and_not() {
        final String rulebase = "rules/reloaded/and_not.prova";

        AtomicInteger count = new AtomicInteger();
        Map<String, Object> globals = new HashMap<>();
        globals.put("$Count", count);
        prova = new ProvaCommunicatorImpl(kAgent, kPort, rulebase, ProvaCommunicatorImpl.SYNC, globals);
        final int[] numSolutions = {0, 0};
        List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

        org.junit.Assert.assertEquals(solutions.size(), numSolutions.length);
        for (int i = 0; i < numSolutions.length; i++)
            org.junit.Assert.assertEquals("Solution " + (i + 1) + " incorrect", solutions.get(i).length, numSolutions[i]);

        try {
            synchronized (this) {
                wait(1000);
                org.junit.Assert.assertEquals(1, count.get());
            }
        } catch (Exception ignored) {
        }
    }

    @Test
    public void last_a_fby_b() {
        final String rulebase = "rules/reloaded/last_a_fby_b.prova";

        AtomicInteger count = new AtomicInteger();
        Map<String, Object> globals = new HashMap<>();
        globals.put("$Count", count);
        prova = new ProvaCommunicatorImpl(kAgent, kPort, rulebase, ProvaCommunicatorImpl.SYNC, globals);
        final int[] numSolutions = {0, 0};
        List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

        org.junit.Assert.assertEquals(solutions.size(), numSolutions.length);
        for (int i = 0; i < numSolutions.length; i++)
            org.junit.Assert.assertEquals("Solution " + (i + 1) + " incorrect", solutions.get(i).length, numSolutions[i]);

        try {
            synchronized (this) {
                wait(1000);
                org.junit.Assert.assertEquals(2, count.get());
            }
        } catch (Exception ignored) {
        }
    }

    @Test
    public void and_mult() {
        final String rulebase = "rules/reloaded/and_mult.prova";

        AtomicInteger count = new AtomicInteger();
        Map<String, Object> globals = new HashMap<>();
        globals.put("$Count", count);
        prova = new ProvaCommunicatorImpl(kAgent, kPort, rulebase, ProvaCommunicatorImpl.SYNC, globals);
        final int[] numSolutions = {0, 0};
        List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

        org.junit.Assert.assertEquals(solutions.size(), numSolutions.length);
        for (int i = 0; i < numSolutions.length; i++)
            org.junit.Assert.assertEquals("Solution " + (i + 1) + " incorrect", solutions.get(i).length, numSolutions[i]);

        try {
            synchronized (this) {
                wait(2000);
                org.junit.Assert.assertEquals(2, count.get());
            }
        } catch (Exception ignored) {
        }
    }

    @Test
    public void and_mult_guard() {
        final String rulebase = "rules/reloaded/and_mult_guard.prova";

        AtomicInteger count = new AtomicInteger();
        Map<String, Object> globals = new HashMap<>();
        globals.put("$Count", count);
        prova = new ProvaCommunicatorImpl(kAgent, kPort, rulebase, ProvaCommunicatorImpl.SYNC, globals);
        final int[] numSolutions = {0, 0};
        List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

        org.junit.Assert.assertEquals(solutions.size(), numSolutions.length);
        for (int i = 0; i < numSolutions.length; i++)
            org.junit.Assert.assertEquals("Solution " + (i + 1) + " incorrect", solutions.get(i).length, numSolutions[i]);

        try {
            synchronized (this) {
                wait(2000);
                org.junit.Assert.assertEquals(1, count.get());
            }
        } catch (Exception ignored) {
        }
    }

    @Test
    public void or_count() {
        final String rulebase = "rules/reloaded/or_count.prova";

        AtomicInteger count = new AtomicInteger();
        Map<String, Object> globals = new HashMap<>();
        globals.put("$Count", count);
        prova = new ProvaCommunicatorImpl(kAgent, kPort, rulebase, ProvaCommunicatorImpl.SYNC, globals);
        final int[] numSolutions = {0, 0};
        List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

        org.junit.Assert.assertEquals(solutions.size(), numSolutions.length);
        for (int i = 0; i < numSolutions.length; i++)
            org.junit.Assert.assertEquals("Solution " + (i + 1) + " incorrect", solutions.get(i).length, numSolutions[i]);

        try {
            synchronized (this) {
                wait(2500);
                org.junit.Assert.assertEquals(2, count.get());
            }
        } catch (Exception ignored) {
        }
    }

    @Test
    public void or_not_and() {
        final String rulebase = "rules/reloaded/or_not_and.prova";

        AtomicInteger count = new AtomicInteger();
        Map<String, Object> globals = new HashMap<>();
        globals.put("$Count", count);
        prova = new ProvaCommunicatorImpl(kAgent, kPort, rulebase, ProvaCommunicatorImpl.SYNC, globals);
        final int[] numSolutions = {0, 0};
        List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

        org.junit.Assert.assertEquals(solutions.size(), numSolutions.length);
        for (int i = 0; i < numSolutions.length; i++)
            org.junit.Assert.assertEquals("Solution " + (i + 1) + " incorrect", solutions.get(i).length, numSolutions[i]);

        try {
            synchronized (this) {
                wait(2000);
                org.junit.Assert.assertEquals(2, count.get());
            }
        } catch (Exception ignored) {
        }
    }

    @Test
    public void or_not() {
        final String rulebase = "rules/reloaded/or_not.prova";

        AtomicInteger count = new AtomicInteger();
        Map<String, Object> globals = new HashMap<>();
        globals.put("$Count", count);
        prova = new ProvaCommunicatorImpl(kAgent, kPort, rulebase, ProvaCommunicatorImpl.SYNC, globals);
        final int[] numSolutions = {0, 0};
        List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

        org.junit.Assert.assertEquals(solutions.size(), numSolutions.length);
        for (int i = 0; i < numSolutions.length; i++)
            org.junit.Assert.assertEquals("Solution " + (i + 1) + " incorrect", solutions.get(i).length, numSolutions[i]);

        try {
            synchronized (this) {
                wait(2500);
                org.junit.Assert.assertEquals(5, count.get());
            }
        } catch (Exception ignored) {
        }
    }

    @Test
    public void or_and() {
        final String rulebase = "rules/reloaded/or_and.prova";

        AtomicInteger count = new AtomicInteger();
        Map<String, Object> globals = new HashMap<>();
        globals.put("$Count", count);
        prova = new ProvaCommunicatorImpl(kAgent, kPort, rulebase, ProvaCommunicatorImpl.SYNC, globals);
        final int[] numSolutions = {0, 0};
        List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

        org.junit.Assert.assertEquals(solutions.size(), numSolutions.length);
        for (int i = 0; i < numSolutions.length; i++)
            org.junit.Assert.assertEquals("Solution " + (i + 1) + " incorrect", solutions.get(i).length, numSolutions[i]);

        try {
            synchronized (this) {
                wait(3000);
                org.junit.Assert.assertEquals(2, count.get());
            }
        } catch (Exception ignored) {
        }
    }

    @Test
    public void or() {
        final String rulebase = "rules/reloaded/or.prova";

        AtomicInteger count = new AtomicInteger();
        Map<String, Object> globals = new HashMap<>();
        globals.put("$Count", count);
        prova = new ProvaCommunicatorImpl(kAgent, kPort, rulebase, ProvaCommunicatorImpl.SYNC, globals);
        final int[] numSolutions = {0, 0};
        List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

        org.junit.Assert.assertEquals(solutions.size(), numSolutions.length);
        for (int i = 0; i < numSolutions.length; i++)
            org.junit.Assert.assertEquals("Solution " + (i + 1) + " incorrect", solutions.get(i).length, numSolutions[i]);

        try {
            synchronized (this) {
                wait(2500);
                org.junit.Assert.assertEquals(2, count.get());
            }
        } catch (Exception ignored) {
        }
    }

    @Test
    public void sequence() {
        final String rulebase = "rules/reloaded/sequence.prova";

        AtomicInteger count = new AtomicInteger();
        Map<String, Object> globals = new HashMap<>();
        globals.put("$Count", count);
        prova = new ProvaCommunicatorImpl(kAgent, kPort, rulebase, ProvaCommunicatorImpl.SYNC, globals);
        final int[] numSolutions = {0, 0};
        List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

        org.junit.Assert.assertEquals(solutions.size(), numSolutions.length);
        for (int i = 0; i < numSolutions.length; i++)
            org.junit.Assert.assertEquals("Solution " + (i + 1) + " incorrect", solutions.get(i).length, numSolutions[i]);

        try {
            synchronized (this) {
                wait(2500);
                org.junit.Assert.assertEquals(1, count.get());
            }
        } catch (Exception ignored) {
        }
    }

    @Test
    public void sequence2() {
        final String rulebase = "rules/reloaded/sequence2.prova";

        AtomicInteger count = new AtomicInteger();
        Map<String, Object> globals = new HashMap<>();
        globals.put("$Count", count);
        prova = new ProvaCommunicatorImpl(kAgent, kPort, rulebase, ProvaCommunicatorImpl.SYNC, globals);
        final int[] numSolutions = {0, 0};
        List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

        org.junit.Assert.assertEquals(solutions.size(), numSolutions.length);
        for (int i = 0; i < numSolutions.length; i++)
            org.junit.Assert.assertEquals("Solution " + (i + 1) + " incorrect", solutions.get(i).length, numSolutions[i]);

        try {
            synchronized (this) {
                wait(2500);
                org.junit.Assert.assertEquals(1, count.get());
            }
        } catch (Exception ignored) {
        }
    }

    @Test
    public void sequence3() {
        final String rulebase = "rules/reloaded/sequence3.prova";

        AtomicInteger count = new AtomicInteger();
        Map<String, Object> globals = new HashMap<>();
        globals.put("$Count", count);
        prova = new ProvaCommunicatorImpl(kAgent, kPort, rulebase, ProvaCommunicatorImpl.SYNC, globals);
        final int[] numSolutions = {0, 0};
        List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

        org.junit.Assert.assertEquals(solutions.size(), numSolutions.length);
        for (int i = 0; i < numSolutions.length; i++)
            org.junit.Assert.assertEquals("Solution " + (i + 1) + " incorrect", solutions.get(i).length, numSolutions[i]);

        try {
            synchronized (this) {
                wait(1500);
                org.junit.Assert.assertEquals(1, count.get());
            }
        } catch (Exception ignored) {
        }
    }

    @Test
    public void and() {
        final String rulebase = "rules/reloaded/and.prova";

        AtomicInteger count = new AtomicInteger();
        Map<String, Object> globals = new HashMap<>();
        globals.put("$Count", count);
        prova = new ProvaCommunicatorImpl(kAgent, kPort, rulebase, ProvaCommunicatorImpl.SYNC, globals);
        final int[] numSolutions = {0, 0};
        List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

        org.junit.Assert.assertEquals(solutions.size(), numSolutions.length);
        for (int i = 0; i < numSolutions.length; i++)
            org.junit.Assert.assertEquals("Solution " + (i + 1) + " incorrect", solutions.get(i).length, numSolutions[i]);

        try {
            synchronized (this) {
                wait(3000);
                org.junit.Assert.assertEquals(2, count.get());
            }
        } catch (Exception ignored) {
        }
    }

    @Test
    public void labels() {
        final String rulebase = "rules/reloaded/label.prova";

        prova = new ProvaCommunicatorImpl(kAgent, kPort, rulebase, ProvaCommunicatorImpl.SYNC);
        final int[] numSolutions = {3, 3, 0, 3, 3, 6, 3, 3, 3};
        List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

        org.junit.Assert.assertEquals(numSolutions.length, solutions.size());
        for (int i = 0; i < numSolutions.length; i++)
            org.junit.Assert.assertEquals("Solution " + (i + 1) + " incorrect", numSolutions[i], solutions.get(i).length);
    }

    /**
     * Beginning with version 3.1.0. Demonstrate the use of @src annotation
     */
    @Test
    public void labels2() {
        final String rulebase = "rules/reloaded/label2.prova";

        prova = new ProvaCommunicatorImpl(kAgent, kPort, rulebase, ProvaCommunicatorImpl.SYNC);
        final int[] numSolutions = {0, 3, 1};
        List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

        org.junit.Assert.assertEquals(numSolutions.length, solutions.size());
        for (int i = 0; i < numSolutions.length; i++)
            org.junit.Assert.assertEquals("Solution " + (i + 1) + " incorrect", numSolutions[i], solutions.get(i).length);
    }

    @Test
    public void guards() {
        final String rulebase = "rules/reloaded/guard.prova";

        AtomicInteger count = new AtomicInteger();
        Map<String, Object> globals = new HashMap<>();
        globals.put("$Count", count);
        prova = new ProvaCommunicatorImpl(kAgent, kPort, rulebase, ProvaCommunicatorImpl.SYNC, globals);
        final int[] numSolutions = {1, 0, 0, 0};
        List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

        org.junit.Assert.assertEquals(numSolutions.length, solutions.size());
        for (int i = 0; i < numSolutions.length; i++)
            org.junit.Assert.assertEquals("Solution " + (i + 1) + " incorrect", numSolutions[i], solutions.get(i).length);

        try {
            synchronized (this) {
                wait(2500);
                org.junit.Assert.assertEquals(1, count.get());
            }
        } catch (Exception ignored) {
        }
    }

}
