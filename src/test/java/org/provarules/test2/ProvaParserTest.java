package org.provarules.test2;

import org.junit.Test;
import org.provarules.api2.ProvaCommunicatorImpl;
import org.provarules.kernel2.ProvaKnowledgeBase;
import org.provarules.kernel2.ProvaResolutionInferenceEngine;
import org.provarules.kernel2.ProvaResultSet;
import org.provarules.kernel2.ProvaRule;
import org.provarules.parser2.ProvaParserImpl;
import org.provarules.parser2.ProvaParsingException;
import org.provarules.reference2.ProvaKnowledgeBaseImpl;
import org.provarules.reference2.ProvaResolutionInferenceEngineImpl;
import org.provarules.reference2.ProvaResultSetImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class ProvaParserTest {

    static final String kAgent = "prova";

    static final String kPort = null;

    @Test
    public void simpleParse() {
        ProvaKnowledgeBase kb = new ProvaKnowledgeBaseImpl();
        ProvaResultSet resultSet = new ProvaResultSetImpl();
        StringReader sr = new StringReader(
                ":-solve(a(X,Y)).\n" +
                        "a(X,Y):-b(X),!,d(Y).\n" +
                        "b(X):-c(X).\n" +
                        "c(1).\n" +
                        "c(2).\n" +
                        "d(3).\n" +
                        "d(4).");
        BufferedReader in = new BufferedReader(sr);
        ProvaParserImpl parser = new ProvaParserImpl("inline1", new Object[]{});
        try {
            List<ProvaRule> rules = parser.parse(kb, resultSet, in);
            // Run each goal
            for (ProvaRule rule : rules) {
                if (rule.getHead() == null) {
                    ProvaResolutionInferenceEngine engine = new ProvaResolutionInferenceEngineImpl(kb, rule);
                    engine.run();

                    org.junit.Assert.assertEquals(resultSet.getSolutions().size(), 2);
                }
            }
        } catch (ProvaParsingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Test
    public void simpleParseWithTail() {
        ProvaKnowledgeBase kb = new ProvaKnowledgeBaseImpl();
        ProvaResultSet resultSet = new ProvaResultSetImpl();
        StringReader sr = new StringReader(
                ":-solve(a([X,Y|Z])).\n" +
                        "a([X,Y]):-b(X),!,d(Y).\n" +
                        "b(X):-c(X).\n" +
                        "c(1).\n" +
                        "c(2).\n" +
                        "d(3).\n" +
                        "d(4).");
        BufferedReader in = new BufferedReader(sr);
        ProvaParserImpl parser = new ProvaParserImpl("inline1", new Object[]{});
        try {
            List<ProvaRule> rules = parser.parse(kb, resultSet, in);
            // Run each goal
            for (ProvaRule rule : rules) {
                if (rule.getHead() == null) {
                    ProvaResolutionInferenceEngine engine = new ProvaResolutionInferenceEngineImpl(kb, rule);
                    engine.run();

                    org.junit.Assert.assertEquals(resultSet.getSolutions().size(), 2);
                }
            }
        } catch (ProvaParsingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Test
    public void simpleParseWithDerive() {
        ProvaKnowledgeBase kb = new ProvaKnowledgeBaseImpl();
        ProvaResultSet resultSet = new ProvaResultSetImpl();
        StringReader sr = new StringReader(
                ":-solve(a(X,b(X))).\n" +
                        "a(X,Y):-derive(Y).\n" +
                        "b(X):-c(X).\n" +
                        "c(1).\n" +
                        "c(2).");
        BufferedReader in = new BufferedReader(sr);
        ProvaParserImpl parser = new ProvaParserImpl("inline1", new Object[]{});
        try {
            List<ProvaRule> rules = parser.parse(kb, resultSet, in);
            // Run each goal
            for (ProvaRule rule : rules) {
                if (rule.getHead() == null) {
                    ProvaResolutionInferenceEngine engine = new ProvaResolutionInferenceEngineImpl(kb, rule);
                    engine.run();

                    org.junit.Assert.assertEquals(resultSet.getSolutions().size(), 2);
                }
            }
        } catch (ProvaParsingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Test
    public void simpleParseWithNotAndFail() {
        ProvaKnowledgeBase kb = new ProvaKnowledgeBaseImpl();
        ProvaResultSet resultSet = new ProvaResultSetImpl();
        StringReader sr = new StringReader(
                ":-solve(a([X,Y|Z])).\n" +
                        "a([X,Y]):-b(X),!,c(Y),not(d(Y)).\n" +
                        "not(X):-derive(X),!,fail().\n" +
                        "not(X).\n" +
                        "b(-1).\n" +
                        "b(-2).\n" +
                        "c(1).\n" +
                        "c(2).\n" +
                        "c(3).\n" +
                        "d(1).\n" +
                        "d(4).");
        BufferedReader in = new BufferedReader(sr);
        ProvaParserImpl parser = new ProvaParserImpl("inline1", new Object[]{});
        try {
            List<ProvaRule> rules = parser.parse(kb, resultSet, in);
            // Run each goal
            for (ProvaRule rule : rules) {
                if (rule.getHead() == null) {
                    ProvaResolutionInferenceEngine engine = new ProvaResolutionInferenceEngineImpl(kb, rule);
                    engine.run();

                    org.junit.Assert.assertEquals(resultSet.getSolutions().size(), 2);
                }
            }
        } catch (ProvaParsingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * A non-existing class used in a Java call literal causes a ProvaParsingException
     *
     * @throws ProvaParsingException
     */
    @Test(expected = ProvaParsingException.class)
    public void incorrect_java_class() throws ProvaParsingException {
        final String rulebase = "rules/reloaded/incorrect_java_class.prova";

        try {
            new ProvaCommunicatorImpl(kAgent, kPort, rulebase, ProvaCommunicatorImpl.SYNC);

        } catch (RuntimeException ex) {
            // Note that the parsing exception is shipped out inside a RuntimeException
            if (ex.getCause() instanceof ProvaParsingException)
                throw (ProvaParsingException) ex.getCause();
        }
    }

}
