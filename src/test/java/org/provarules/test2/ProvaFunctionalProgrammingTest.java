package org.provarules.test2;

import org.junit.After;
import org.junit.Test;
import org.provarules.api2.ProvaCommunicator;
import org.provarules.api2.ProvaCommunicatorImpl;
import org.provarules.exchange.ProvaSolution;
import org.provarules.kernel2.ProvaList;
import org.provarules.kernel2.ProvaObject;
import org.provarules.reference2.ProvaConstantImpl;
import org.provarules.reference2.ProvaListImpl;
import org.provarules.reference2.ProvaMapImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class ProvaFunctionalProgrammingTest {

    private static final String kAgent = "prova";

    private static final String kPort = null;

    private ProvaCommunicator prova;

    public class ResultCounter {
        private final long maxCount;
        private volatile long count = 0;

        ResultCounter(long maxCount) {
            this.maxCount = maxCount;
        }

        public synchronized long incrementAndTestCompletion() {
            count++;
            return count == maxCount ? 0 : count;
        }

        public long get() {
            return count;
        }
    }

    @After
    public void shutdown() {
        if (prova != null) {
            prova.shutdown();
            prova = null;
        }
    }

    @Test
    public void func_reactive_unfoldr_iteration_perf() {
        final String rulebase = "rules/reloaded/func_019_perf.prova";

        final long maxCount = 10000;
        final long expectedPatterns = 2537;

        ResultCounter count = new ResultCounter(expectedPatterns);
        Map<String, Object> globals = new HashMap<>();
        globals.put("$Count", count);
        CountDownLatch doneSignal = new CountDownLatch(1);
        globals.put("$Latch", doneSignal);
        prova = new ProvaCommunicatorImpl(kAgent, kPort, rulebase, ProvaCommunicatorImpl.SYNC, globals);

        long startTime = System.currentTimeMillis();

        long accountId = 0;
        // Send maxCount messages to the consulted Prova rulebase.
        try {
            for (int i = 0; i < maxCount; i++) {
                int shift = i % 32;
                accountId = (accountId + 1) % 1000;
                Map<String, Integer> payload1 = new HashMap<>(1);
                payload1.put("s", shift);
                ProvaList terms = ProvaListImpl.create(new ProvaObject[]{
                        ProvaConstantImpl.create("" + accountId),
                        ProvaConstantImpl.create("async"),
                        ProvaConstantImpl.create(0),
                        ProvaConstantImpl.create("data"),
                        ProvaMapImpl.wrapValues(payload1)
                });
                prova.addMsg(terms);
            }
            long diff0 = System.currentTimeMillis() - startTime;
            System.out.println("All messages sent in " + diff0 + " ms");
            doneSignal.await(1500, TimeUnit.SECONDS);
            long diff = System.currentTimeMillis() - startTime;
            System.out.println(count.get() + " patterns detected in " + diff + " ms");
            // All expectedPatterns events must be detected
            org.junit.Assert.assertEquals(expectedPatterns, count.get());
        } catch (Exception e) {
            org.junit.Assert.fail("Unexpected exception: " + e.getLocalizedMessage());
        }
    }

    /**
     * Performance test for partitioned stream fusion pattern detection
     */
    @Test
    public void func_reactive_unfoldr_iteration_perf_large() {
        final String rulebase = "rules/reloaded/func_019_perf.prova";

        final long maxCount = 100000;
        final long expectedPatterns = 5625;

        ResultCounter count = new ResultCounter(expectedPatterns);
        Map<String, Object> globals = new HashMap<>();
        globals.put("$Count", count);
        CountDownLatch doneSignal = new CountDownLatch(1);
        globals.put("$Latch", doneSignal);
        prova = new ProvaCommunicatorImpl(kAgent, kPort, rulebase, ProvaCommunicatorImpl.SYNC, globals);

        long startTime = System.currentTimeMillis();

        long accountId = 0;
        // Send maxCount messages to the consulted Prova rulebase.
        try {
            for (int i = 0; i < maxCount; i++) {
                int shift = i % 32;
                accountId = (accountId + 1) % 10000;
                Map<String, Integer> payload1 = new HashMap<>(1);
                payload1.put("s", shift);
                ProvaList terms = ProvaListImpl.create(new ProvaObject[]{
                        ProvaConstantImpl.create("" + accountId),
                        ProvaConstantImpl.create("async"),
                        ProvaConstantImpl.create(0),
                        ProvaConstantImpl.create("data"),
                        ProvaMapImpl.wrapValues(payload1)
                });
                prova.addMsg(terms);
            }
            long diff0 = System.currentTimeMillis() - startTime;
            System.out.println("All messages sent in " + diff0 + " ms");
            doneSignal.await(50, TimeUnit.SECONDS);
            long diff = System.currentTimeMillis() - startTime;
            System.out.println(count.get() + " patterns detected in " + diff + " ms");
            // All expectedPatterns events must be detected
            org.junit.Assert.assertEquals(expectedPatterns, count.get());
        } catch (Throwable e) {
            org.junit.Assert.fail("Unexpected exception: " + e.getLocalizedMessage());
        }
    }

    /*
     * Demonstrate using functional stream fusion for pattern detection.
     * Sum the size of all purchases by User greater than 16 within 8 time units after User logs in.
     */
    @Test
    public void func_reactive_followed_by() {
        final String rulebase = "rules/reloaded/func_fby.prova";
        Map<String, Object> globals = new HashMap<>();
        AtomicInteger count = new AtomicInteger();
        globals.put("$Count", count);

        prova = new ProvaCommunicatorImpl(kAgent, kPort, rulebase, ProvaCommunicatorImpl.SYNC, globals);

        try {
            synchronized (this) {
                wait(2000);
                org.junit.Assert.assertEquals(3, count.get());
            }
        } catch (Exception e) {
            org.junit.Assert.fail("Unexpected exception: " + e.getLocalizedMessage());
        }

    }

    /*
     * Demonstrate unfoldr-like functionality with embedded reactions.
     * Detect 2 consecutive events with values <= 5.
     */
    @Test
    public void func_reactive_unfoldr_iteration() {
        final String rulebase = "rules/reloaded/func_019.prova";
        final int[] numSolutions = new int[]{0, 0, 0};
        Map<String, Object> globals = new HashMap<>();
        AtomicInteger count = new AtomicInteger();
        globals.put("$Count", count);

        prova = new ProvaCommunicatorImpl(kAgent, kPort, rulebase, ProvaCommunicatorImpl.SYNC, globals);
        List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

        try {
            synchronized (this) {
                wait(1000);
                org.junit.Assert.assertEquals(4, count.get());
            }
        } catch (Exception ignored) {
        }

        org.junit.Assert.assertEquals(numSolutions.length, solutions.size());
    }

    /*
     * Demonstrate functional tenpin scoring with stream fusion.
     */
    @Test
    public void func_tenpin() {
        final String rulebase = "rules/reloaded/func_tenpin.prova";
        final int[] numSolutions = new int[]{0, 1, 1, 1, 1, 1};

        prova = new ProvaCommunicatorImpl(kAgent, kPort, rulebase, ProvaCommunicatorImpl.SYNC);
        List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

        try {
            synchronized (this) {
                wait(1000);
            }
        } catch (Exception ignored) {
        }

        org.junit.Assert.assertEquals(numSolutions.length, solutions.size());
        for (int i = 0; i < numSolutions.length; i++)
            org.junit.Assert.assertEquals("Solution " + (i + 1) + " incorrect", numSolutions[i], solutions.get(i).length);
    }

    /*
     * Demonstrate unfoldr-like functionality with embedded reactions.
     * This example uses concurrent detection for two partitions based on different XID's.
     */
    @Test
    public void func_reactive_unfoldr_mult() {
        final String rulebase = "rules/reloaded/func_018.prova";
        final int[] numSolutions = new int[]{0, 0, 0};

        prova = new ProvaCommunicatorImpl(kAgent, kPort, rulebase, ProvaCommunicatorImpl.SYNC);
        List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

        try {
            synchronized (this) {
                wait(1000);
            }
        } catch (Exception ignored) {
        }

        org.junit.Assert.assertEquals(numSolutions.length, solutions.size());
        org.junit.Assert.assertEquals(numSolutions[0], solutions.get(0).length);
        org.junit.Assert.assertEquals(numSolutions[1], solutions.get(1).length);
    }

    /*
     * Demonstrate unfoldr-like functionality with embedded reactions.
     * The process continues generating the output stream until
     * the condition cond is verified: the sum of the previous input with new data is 5.
     */
    @Test
    public void func_reactive_unfoldr() {
        final String rulebase = "rules/reloaded/func_013.prova";
        final int[] numSolutions = new int[]{0, 0, 1};

        prova = new ProvaCommunicatorImpl(kAgent, kPort, rulebase, ProvaCommunicatorImpl.SYNC);
        List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

        try {
            synchronized (this) {
                wait(1000);
            }
        } catch (Exception ignored) {
        }

        org.junit.Assert.assertEquals(numSolutions.length, solutions.size());
        org.junit.Assert.assertEquals(numSolutions[0], solutions.get(0).length);
        org.junit.Assert.assertEquals(numSolutions[1], solutions.get(1).length);
    }

    @Test
    public void func_unfoldr() {
        final String rulebase = "rules/reloaded/func_012.prova";
        final int[] numSolutions = new int[]{0, 1, 1};

        prova = new ProvaCommunicatorImpl(kAgent, kPort, rulebase, ProvaCommunicatorImpl.SYNC);
        List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

        org.junit.Assert.assertEquals(numSolutions.length, solutions.size());
        org.junit.Assert.assertEquals(numSolutions[0], solutions.get(0).length);
        org.junit.Assert.assertEquals(numSolutions[1], solutions.get(1).length);
    }

    @Test
    public void func_unfoldr_with_take() {
        final String rulebase = "rules/reloaded/func_014.prova";
        final int[] numSolutions = new int[]{0, 1};

        prova = new ProvaCommunicatorImpl(kAgent, kPort, rulebase, ProvaCommunicatorImpl.SYNC);
        List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

        org.junit.Assert.assertEquals(numSolutions.length, solutions.size());
        org.junit.Assert.assertEquals(numSolutions[0], solutions.get(0).length);
        org.junit.Assert.assertEquals(numSolutions[1], solutions.get(1).length);
    }

    @Test
    public void func_max() {
        final String rulebase = "rules/reloaded/func_016.prova";
        final int[] numSolutions = new int[]{0, 1};

        prova = new ProvaCommunicatorImpl(kAgent, kPort, rulebase, ProvaCommunicatorImpl.SYNC);
        List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

        org.junit.Assert.assertEquals(numSolutions.length, solutions.size());
        org.junit.Assert.assertEquals(numSolutions[0], solutions.get(0).length);
        org.junit.Assert.assertEquals(numSolutions[1], solutions.get(1).length);
    }

    @Test
    public void func_run_length_encoding() {
        final String rulebase = "rules/reloaded/func_015.prova";
        final int[] numSolutions = new int[]{0, 1};

        prova = new ProvaCommunicatorImpl(kAgent, kPort, rulebase, ProvaCommunicatorImpl.SYNC);
        List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

        org.junit.Assert.assertEquals(numSolutions.length, solutions.size());
        org.junit.Assert.assertEquals(numSolutions[0], solutions.get(0).length);
        org.junit.Assert.assertEquals(numSolutions[1], solutions.get(1).length);
    }

    /**
     * Breadth-first traversal and labelling using Prova unfoldr (corecursion)
     */
    @Test
    public void func_breadth_first() {
        final String rulebase = "rules/reloaded/func_020.prova";
        final int[] numSolutions = new int[]{0, 1, 1, 1, 1};

        prova = new ProvaCommunicatorImpl(kAgent, kPort, rulebase, ProvaCommunicatorImpl.SYNC);
        List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

        org.junit.Assert.assertEquals(numSolutions.length, solutions.size());
        for (int i = 0; i < numSolutions.length; i++)
            org.junit.Assert.assertEquals(numSolutions[i], solutions.get(i).length);
    }

    @Test
    public void func_stream_fusion_2() {
        final String rulebase = "rules/reloaded/func_011.prova";
        final int[] numSolutions = new int[]{0, 1};

        prova = new ProvaCommunicatorImpl(kAgent, kPort, rulebase, ProvaCommunicatorImpl.SYNC);
        List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

        org.junit.Assert.assertEquals(numSolutions.length, solutions.size());
        org.junit.Assert.assertEquals(numSolutions[0], solutions.get(0).length);
    }

    @Test
    public void func_stream_fusion() {
        final String rulebase = "rules/reloaded/func_010.prova";
        final int[] numSolutions = new int[]{0, 1};

        prova = new ProvaCommunicatorImpl(kAgent, kPort, rulebase, ProvaCommunicatorImpl.SYNC);
        List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

        org.junit.Assert.assertEquals(numSolutions.length, solutions.size());
        org.junit.Assert.assertEquals(numSolutions[0], solutions.get(0).length);
    }

    /**
     * Use new functional notation and call functions in a pipeline using the stream fusion approach.
     */
    @Test
    public void func_stream_fusion_fun() {
        final String rulebase = "rules/reloaded/func_010_fun.prova";
        final int[] numSolutions = new int[]{0, 1};

        prova = new ProvaCommunicatorImpl(kAgent, kPort, rulebase, ProvaCommunicatorImpl.SYNC);
        List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

        org.junit.Assert.assertEquals(numSolutions.length, solutions.size());
        org.junit.Assert.assertEquals(numSolutions[0], solutions.get(0).length);
    }

    @Test
    public void func_fact_monad() {
        final String rulebase = "rules/reloaded/func_fact_monad.prova";
        final int[] numSolutions = new int[]{0, 1, 1, 1, 3, 1, 3, 1, 3, 1, 3, 1, 1, 1};

        prova = new ProvaCommunicatorImpl(kAgent, kPort, rulebase, ProvaCommunicatorImpl.SYNC);
        List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

        org.junit.Assert.assertEquals(numSolutions.length, solutions.size());
        for (int i = 0; i < numSolutions.length; i++)
            org.junit.Assert.assertEquals("Solution " + (i + 1) + " incorrect", numSolutions[i], solutions.get(i).length);
    }

    @Test
    public void test_clone() {
        final String rulebase = "rules/reloaded/clone.prova";

        prova = new ProvaCommunicatorImpl(kAgent, kPort, rulebase, ProvaCommunicatorImpl.SYNC);
        final int[] numSolutions = {1};
        List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

        org.junit.Assert.assertEquals(numSolutions.length, solutions.size());
        for (int i = 0; i < numSolutions.length; i++)
            org.junit.Assert.assertEquals("Solution " + (i + 1) + " incorrect", numSolutions[i], solutions.get(i).length);
    }

    @Test
    public void list_and_state_reimplemented() {
        final String rulebase = "rules/reloaded/func_009.prova";

        prova = new ProvaCommunicatorImpl(kAgent, kPort, rulebase, ProvaCommunicatorImpl.SYNC);
        final int[] numSolutions = {0, 1, 1, 1, 1, 3, 3, 3, 1, 1, 1, 1, 1, 1, 3, 1, 1, 1, 1, 1, 6, 2, 2, 1, 1, 10, 1, 1};
        List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

        org.junit.Assert.assertEquals(numSolutions.length, solutions.size());
        for (int i = 0; i < numSolutions.length; i++)
            org.junit.Assert.assertEquals("Solution " + (i + 1) + " incorrect", numSolutions[i], solutions.get(i).length);
    }

    // @Test
    public void continuation_monad() {
        final String rulebase = "rules/reloaded/func_008.prova";

        prova = new ProvaCommunicatorImpl(kAgent, kPort, rulebase, ProvaCommunicatorImpl.SYNC);
        List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

        org.junit.Assert.assertEquals(solutions.size(), 2);
    }

    @Test
    public void tree_monad() {
        final String rulebase = "rules/reloaded/func_006.prova";

        prova = new ProvaCommunicatorImpl(kAgent, kPort, rulebase, ProvaCommunicatorImpl.SYNC);
        final int[] numSolutions = {0, 1};
        List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

        org.junit.Assert.assertEquals(numSolutions.length, solutions.size());
        for (int i = 0; i < numSolutions.length; i++)
            org.junit.Assert.assertEquals("Solution " + (i + 1) + " incorrect", numSolutions[i], solutions.get(i).length);
    }

    @Test
    public void basic() {
        final String rulebase = "rules/reloaded/func_001.prova";

        prova = new ProvaCommunicatorImpl(kAgent, kPort, rulebase, ProvaCommunicatorImpl.SYNC);
        final int[] numSolutions = {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

        org.junit.Assert.assertEquals(numSolutions.length, solutions.size());
        for (int i = 0; i < numSolutions.length; i++)
            org.junit.Assert.assertEquals("Solution " + (i + 1) + " incorrect", numSolutions[i], solutions.get(i).length);
    }

    @Test
    public void mappings_not_functions() {
        final String rulebase = "rules/reloaded/func_002.prova";

        prova = new ProvaCommunicatorImpl(kAgent, kPort, rulebase, ProvaCommunicatorImpl.SYNC);
        final int[] numSolutions = {0, 8};
        List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

        org.junit.Assert.assertEquals(numSolutions.length, solutions.size());
        for (int i = 0; i < numSolutions.length; i++)
            org.junit.Assert.assertEquals("Solution " + (i + 1) + " incorrect", numSolutions[i], solutions.get(i).length);
    }

    @Test
    public void concrete_monadic_list() {
        final String rulebase = "rules/reloaded/func_003.prova";

        prova = new ProvaCommunicatorImpl(kAgent, kPort, rulebase, ProvaCommunicatorImpl.SYNC);
        final int[] numSolutions = {0, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

        org.junit.Assert.assertEquals(numSolutions.length, solutions.size());
        for (int i = 0; i < numSolutions.length; i++)
            org.junit.Assert.assertEquals("Solution " + (i + 1) + " incorrect", numSolutions[i], solutions.get(i).length);
    }

    @Test
    public void maybe_monad() {
        final String rulebase = "rules/reloaded/func_005.prova";

        prova = new ProvaCommunicatorImpl(kAgent, kPort, rulebase, ProvaCommunicatorImpl.SYNC);
        final int[] numSolutions = {0, 1, 1, 1, 1, 1};
        List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

        org.junit.Assert.assertEquals(numSolutions.length, solutions.size());
        for (int i = 0; i < numSolutions.length; i++)
            org.junit.Assert.assertEquals("Solution " + (i + 1) + " incorrect", numSolutions[i], solutions.get(i).length);
    }

}
