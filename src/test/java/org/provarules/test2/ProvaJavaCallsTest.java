package org.provarules.test2;

import org.junit.After;
import org.junit.Test;
import org.provarules.api2.ProvaCommunicator;
import org.provarules.api2.ProvaCommunicatorImpl;
import org.provarules.exchange.ProvaSolution;
import org.provarules.kernel2.ProvaKnowledgeBase;
import org.provarules.kernel2.ProvaResolutionInferenceEngine;
import org.provarules.kernel2.ProvaResultSet;
import org.provarules.kernel2.ProvaRule;
import org.provarules.parser2.ProvaParserImpl;
import org.provarules.parser2.ProvaParsingException;
import org.provarules.reference2.ProvaKnowledgeBaseImpl;
import org.provarules.reference2.ProvaResolutionInferenceEngineImpl;
import org.provarules.reference2.ProvaResultSetImpl;

import java.io.IOException;
import java.util.List;

public class ProvaJavaCallsTest {

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
    public void retract_with_java_types() {
        final String rulebase = "rules/reloaded/retract_with_java_types.prova";

        prova = new ProvaCommunicatorImpl(kAgent, kPort, rulebase, ProvaCommunicatorImpl.SYNC);
        final int[] numSolutions = {3, 2, 3};
        List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

        org.junit.Assert.assertEquals(numSolutions.length, solutions.size());
        for (int i = 0; i < numSolutions.length; i++)
            org.junit.Assert.assertEquals("Solution " + (i + 1) + " incorrect", numSolutions[i], solutions.get(i).length);
    }

    @Test
    public void instanceJavaFunctions() {
        ProvaKnowledgeBase kb = new ProvaKnowledgeBaseImpl();
        ProvaResultSet resultSet = new ProvaResultSetImpl();
        ProvaParserImpl parser = new ProvaParserImpl("rules/reloaded/typed_constants.prova", new Object[]{});
        try {
            List<ProvaRule> rules = parser.parse(kb, resultSet, "rules/reloaded/typed_constants.prova");
            // Run each goal
            int[] numSolutions = new int[]{1, 0, 0};
            int i = 0;
            for (ProvaRule rule : rules) {
                if (rule.getHead() == null) {
                    ProvaResolutionInferenceEngine engine = new ProvaResolutionInferenceEngineImpl(kb, rule);
                    engine.run();

                    org.junit.Assert.assertEquals(numSolutions[i++], resultSet.getSolutions().size());
                    resultSet.getSolutions().clear();
                }
            }
        } catch (ProvaParsingException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Test
    public void staticJavaFunctions() {
        ProvaKnowledgeBase kb = new ProvaKnowledgeBaseImpl();
        ProvaResultSet resultSet = new ProvaResultSetImpl();
        ProvaParserImpl parser = new ProvaParserImpl("rules/reloaded/static_method_call.prova", new Object[]{});
        try {
            List<ProvaRule> rules = parser.parse(kb, resultSet, "rules/reloaded/static_method_call.prova");
            // Run each goal
            int[] numSolutions = new int[]{1, 1, 0, 0};
            int i = 0;
            for (ProvaRule rule : rules) {
                if (rule.getHead() == null) {
                    ProvaResolutionInferenceEngine engine = new ProvaResolutionInferenceEngineImpl(kb, rule);
                    engine.run();

                    org.junit.Assert.assertEquals(numSolutions[i++], resultSet.getSolutions().size());
                    resultSet.getSolutions().clear();
                }
            }
        } catch (ProvaParsingException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Test
    public void element_matching() {
        ProvaKnowledgeBase kb = new ProvaKnowledgeBaseImpl();
        ProvaResultSet resultSet = new ProvaResultSetImpl();
        ProvaParserImpl parser = new ProvaParserImpl("rules/reloaded/element_matching.prova", new Object[]{});
        try {
            List<ProvaRule> rules = parser.parse(kb, resultSet, "rules/reloaded/element_matching.prova");
            // Run each goal
            int[] numSolutions = new int[]{3, 3, 1, 3};
            int i = 0;
            for (ProvaRule rule : rules) {
                if (rule.getHead() == null) {
                    ProvaResolutionInferenceEngine engine = new ProvaResolutionInferenceEngineImpl(kb, rule);
                    engine.run();

                    org.junit.Assert.assertEquals(numSolutions[i++], resultSet.getSolutions().size());
                    if (i == 0)
                        org.junit.Assert.assertEquals("2", resultSet.getSolutions().get(0).getNv("X").toString());
                    resultSet.getSolutions().clear();
                }
            }
        } catch (ProvaParsingException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
