package org.provarules.test2;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.provarules.api2.ProvaCommunicator;
import org.provarules.api2.ProvaCommunicatorImpl;
import org.provarules.exchange.ProvaSolution;
import org.provarules.kernel2.ProvaConstant;
import org.provarules.kernel2.ProvaList;
import org.provarules.kernel2.ProvaObject;
import org.provarules.parser2.ProvaParsingException;
import org.provarules.reference2.ProvaConstantImpl;
import org.provarules.reference2.ProvaListImpl;
import org.provarules.util2.ProvaNullWriter;

import java.io.BufferedReader;
import java.io.StringReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class ProvaCommunicatorTest {

    private static final String kAgent = "prova";

    private static final String kPort = null;

    private ProvaCommunicator comm;

    // Unique key identifying the consulted input (useful in interactive environment)
    private int key = 0;

    @After
    public void shutdown() {
        if (comm != null) {
            comm.shutdown();
            comm = null;
        }
    }

    @Test
    public void initialization_from_nowhere() {
        final String rulebase = "rules/reloaded/NOSUCHFILE.prova";

        try {
            comm = new ProvaCommunicatorImpl(kAgent, kPort, rulebase, ProvaCommunicatorImpl.SYNC);

        } catch (Exception e) {
            final String localizedMessage = e.getCause().getLocalizedMessage();
            org.junit.Assert.assertEquals(
                    "Cannot find rules/reloaded/NOSUCHFILE.prova",
                    localizedMessage);
        }
    }

    @Test
    public void initialization_with_parsing_errors() {
        final String rulebase = "rules/reloaded/parsing_errors.prova";

        try {
            comm = new ProvaCommunicatorImpl(kAgent, kPort, rulebase, ProvaCommunicatorImpl.SYNC);

        } catch (Exception e) {
            org.junit.Assert.assertTrue(e.getCause() instanceof ProvaParsingException);
            org.junit.Assert.assertEquals(
                    "rules/reloaded/parsing_errors.prova",
                    ((ProvaParsingException) e.getCause()).getSource());
            org.junit.Assert.assertEquals(5, ((ProvaParsingException) e.getCause()).errors().size());
        }
    }

    @Test
    public void initialization_with_rulebase_errors() {
        final String rulebase = "rules/reloaded/processing_errors.prova";

        try {
            comm = new ProvaCommunicatorImpl(kAgent, kPort, rulebase, ProvaCommunicatorImpl.SYNC);

        } catch (Exception e) {
            final String localizedMessage = e.getCause().getMessage();
            org.junit.Assert.assertEquals(
                    "java.lang.NoSuchMethodException: No such accessible method: nomethod() on object: java.util.HashSet",
                    localizedMessage);
        }
    }

    @Test
    public void sync_consult_from_string() {
        final String rulebase = "rules/reloaded/kk_rules001_simple.prova";

        comm = new ProvaCommunicatorImpl(kAgent, kPort, rulebase, ProvaCommunicatorImpl.SYNC);

        comm.setPrintWriter(ProvaNullWriter.getPrintWriter());

        String input = ":- solve(happy(Person)).\n :- solve(pappy(Person)).";
        BufferedReader in = new BufferedReader(new StringReader(input));

        final int[] numSolutions = new int[]{2, 0};
        int i = 0;

        try {
            // The Prova code consulted by consultSync is assigned a sequential unique key (see parameter 2).
            // In this way, it is possible to unconsult such code by calling unconsult(key).
            List<ProvaSolution[]> resultSets = comm.consultSync(in, Integer.toString(key++), new Object[]{});
            for (ProvaSolution[] resultSet : resultSets) {
                org.junit.Assert.assertEquals(numSolutions[i++], resultSet.length);
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Test
    public void sync_consult_with_facts() {
        final String rulebase = "rules/reloaded/kk_rules001_simple.prova";

        comm = new ProvaCommunicatorImpl(kAgent, kPort, rulebase, ProvaCommunicatorImpl.SYNC);

        comm.setPrintWriter(ProvaNullWriter.getPrintWriter());

        String input = ":- solve(happy(Person)).\n :- solve(pappy(Person)).\npappy(yoyo).";
        BufferedReader in = new BufferedReader(new StringReader(input));

        final int[] numSolutions = new int[]{2, 1};
        int i = 0;

        try {
            // The Prova code consulted by consultSync is assigned a sequential unique key (see parameter 2).
            // In this way, it is possible to unconsult such code by calling unconsult(key).
            List<ProvaSolution[]> resultSets = comm.consultSync(in, Integer.toString(key++), new Object[]{});
            for (ProvaSolution[] resultSet : resultSets) {
                org.junit.Assert.assertEquals(numSolutions[i++], resultSet.length);
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Test
    public void sync_consult_with_facts_and_java_parameters() {
        final String rulebase = "rules/reloaded/kk_rules001_simple.prova";

        comm = new ProvaCommunicatorImpl(kAgent, kPort, rulebase, ProvaCommunicatorImpl.SYNC);

        comm.setPrintWriter(ProvaNullWriter.getPrintWriter());

        String input = ":- solve(robot(Name)).\nrobot(_0).";
        BufferedReader in = new BufferedReader(new StringReader(input));

        final int numSolutions = 1;

        try {
            // The Prova code consulted by consultSync is assigned a sequential unique key (see parameter 2).
            // In this way, it is possible to unconsult such code by calling unconsult(key).
            List<ProvaSolution[]> resultSets = comm.consultSync(in, Integer.toString(key++), new Object[]{"Dave"});
            org.junit.Assert.assertEquals(numSolutions, resultSets.get(0).length);
            final Object ans1 = ((ProvaConstant) resultSets.get(0)[0].getNv("Name")).getObject();
            Assert.assertEquals("Dave", ans1);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Test
    public void sync_consult_with_separate_rules() {
        final String rulebase = "rules/reloaded/kk_rules001_simple.prova";

        comm = new ProvaCommunicatorImpl(kAgent, kPort, rulebase, ProvaCommunicatorImpl.SYNC);

        comm.setPrintWriter(ProvaNullWriter.getPrintWriter());

        String inputRules = "pappy(Person) :- happy(Person).";
        BufferedReader inRules = new BufferedReader(new StringReader(inputRules));

        try {
            comm.consultSync(inRules, Integer.toString(key++), new Object[]{});
        } catch (Exception unlikely) {
            unlikely.printStackTrace();
        }

        String input = ":- solve(happy(Person)).\n :- solve(pappy(Person)).";
        BufferedReader in = new BufferedReader(new StringReader(input));

        final int[] numSolutions = new int[]{2, 2};
        int i = 0;

        try {
            // The Prova code consulted by consultSync is assigned a sequential unique key (see parameter 2).
            // In this way, it is possible to unconsult such code by calling unconsult(key).
            List<ProvaSolution[]> resultSets = comm.consultSync(in, Integer.toString(key++), new Object[]{});
            for (ProvaSolution[] resultSet : resultSets) {
                org.junit.Assert.assertEquals(numSolutions[i++], resultSet.length);
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Test
    public void sync_unconsult() {
        final String rulebase = "rules/reloaded/kk_rules001_simple.prova";

        comm = new ProvaCommunicatorImpl(kAgent, kPort, rulebase, ProvaCommunicatorImpl.SYNC);

        comm.setPrintWriter(ProvaNullWriter.getPrintWriter());

        String inputRules = "pappy(Person) :- happy(Person).";
        BufferedReader inRules = new BufferedReader(new StringReader(inputRules));

        try {
            comm.consultSync(inRules, "to-remove-later", new Object[]{});
        } catch (Exception unlikely) {
            unlikely.printStackTrace();
        }

        String input = ":- solve(happy(Person)).\n :- solve(pappy(Person)).";
        BufferedReader in = new BufferedReader(new StringReader(input));

        final int[] numSolutions = new int[]{2, 2};
        int i = 0;

        try {
            // The Prova code consulted by consultSync is assigned a unique key (see parameter 2).
            // In this way, it is possible to unconsult such code by calling unconsult(key).
            List<ProvaSolution[]> resultSets = comm.consultSync(in, "goals", new Object[]{});
            for (ProvaSolution[] resultSet : resultSets) {
                org.junit.Assert.assertEquals(numSolutions[i++], resultSet.length);
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        // Remove all clauses consulted for this key
        comm.unconsultSync("to-remove-later");

        // Read goals again
        in = new BufferedReader(new StringReader(input));
        final int[] numSolutions2 = new int[]{2, 0};
        int i2 = 0;

        try {
            // The Prova code consulted by consultSync is assigned a unique key (see parameter 2).
            // In this way, it is possible to unconsult such code by calling unconsult(key).
            List<ProvaSolution[]> resultSets = comm.consultSync(in, "goals", new Object[]{});
            for (ProvaSolution[] resultSet : resultSets) {
                org.junit.Assert.assertEquals(numSolutions2[i2++], resultSet.length);
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    @Test
    public void sync_consult_from_string_with_parsing_exceptions() {
        final String rulebase = "rules/reloaded/kk_rules001_simple.prova";

        comm = new ProvaCommunicatorImpl(kAgent, kPort, rulebase, ProvaCommunicatorImpl.SYNC);

        comm.setPrintWriter(ProvaNullWriter.getPrintWriter());

        // There is clearly a grammar problem below
        // It is reported by the walker as the parser currently does not white test semantic predicates in goals
        String input = ":- nonsense(happy(Person)).\n :- solve(pappy(Person)).";
        BufferedReader in = new BufferedReader(new StringReader(input));

        try {
            // The Prova code consulted by consultSync is assigned a sequential unique key (see parameter 2).
            // In this way, it is possible to unconsult such code by calling unconsult(key).
            comm.consultSync(in, Integer.toString(key++), new Object[]{});
        } catch (Exception e) {
            if (e.getCause() instanceof ProvaParsingException) {
                org.junit.Assert.assertEquals(((ProvaParsingException) e.getCause()).errors().size(), 1);
            } else
                // TODO Auto-generated catch block
                e.printStackTrace();
        }
    }

    @Test
    public void sync_consult_from_file() {
        final String rulebase = "rules/reloaded/kk_rules001_simple.prova";

        comm = new ProvaCommunicatorImpl(kAgent, kPort, rulebase, ProvaCommunicatorImpl.SYNC);

        comm.setPrintWriter(ProvaNullWriter.getPrintWriter());

        // This path is relative to the rulebase used in the ProvaCommunicatorImpl constructor
        String src = "kk_rules001_goals.prova";

        final int[] numSolutions = new int[]{2, 0};
        int i = 0;

        try {
            // The Prova code consulted by consultSync is assigned a sequential unique key (see parameter 2).
            // In this way, it is possible to unconsult such code by calling unconsult(key).
            List<ProvaSolution[]> resultSets = comm.consultSync(src, Integer.toString(key++), new Object[]{});
            for (ProvaSolution[] resultSet : resultSets) {
                org.junit.Assert.assertEquals(numSolutions[i++], resultSet.length);
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Test
    public void send_msg_to_rulebase() {
        final String rulebase = "rules/reloaded/msg.prova";

        AtomicInteger count = new AtomicInteger();
        Map<String, Object> globals = new HashMap<>();
        globals.put("$Count", count);
        comm = new ProvaCommunicatorImpl(kAgent, kPort, rulebase, ProvaCommunicatorImpl.SYNC, globals);

        comm.setPrintWriter(ProvaNullWriter.getPrintWriter());

        // Send a hundred messages to the consulted Prova rulebase.
        // Processing is done concurrently on threads belonging to the async pool.
        for (int i = 0; i < 100; i++) {
            ProvaList terms = ProvaListImpl.create(new ProvaObject[]{
                    ProvaConstantImpl.create("test" + i),
                    ProvaConstantImpl.create("async"),
                    ProvaConstantImpl.create(0),
                    ProvaConstantImpl.create("inform"),
                    ProvaListImpl.create(new ProvaObject[]{
                            ProvaConstantImpl.create("a"),
                            ProvaConstantImpl.create(i)
                    })
            });
            comm.addMsg(terms);
        }
        try {
            synchronized (this) {
                wait(1000);
                org.junit.Assert.assertEquals(100, count.get());
            }
        } catch (Exception ignored) {
        }
    }

}
