package org.provarules.test2;

import org.junit.Test;
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

public class ProvaCacheTest {

    //	@Test
    // Limitation: Cut does not work correctly with cache
    public void cache_loop10() {
        ProvaKnowledgeBase kb = new ProvaKnowledgeBaseImpl();
        ProvaResultSet resultSet = new ProvaResultSetImpl();
        ProvaParserImpl parser = new ProvaParserImpl("rules/reloaded/loop10.prova", new Object[]{});
        try {
            List<ProvaRule> rules = parser.parse(kb, resultSet, "rules/reloaded/loop10.prova");
            // Run each goal
            int[] numSolutions = new int[]{0};
            int i = 0;
            for (ProvaRule rule : rules) {
                if (rule.getHead() == null) {
                    ProvaResolutionInferenceEngine engine = new ProvaResolutionInferenceEngineImpl(kb, rule);
                    engine.run();

                    org.junit.Assert.assertEquals(resultSet.getSolutions().size(), numSolutions[i++]);
                    resultSet.getSolutions().clear();
                }
            }
        } catch (ProvaParsingException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    //	@Test
    // To be fixed in version 3.1
    public void cache_loop8() {
        ProvaKnowledgeBase kb = new ProvaKnowledgeBaseImpl();
        ProvaResultSet resultSet = new ProvaResultSetImpl();
        ProvaParserImpl parser = new ProvaParserImpl("rules/reloaded/loop8.prova", new Object[]{});
        try {
            List<ProvaRule> rules = parser.parse(kb, resultSet, "rules/reloaded/loop8.prova");
            // Run each goal
            int[] numSolutions = new int[]{4};
            int i = 0;
            for (ProvaRule rule : rules) {
                if (rule.getHead() == null) {
                    ProvaResolutionInferenceEngine engine = new ProvaResolutionInferenceEngineImpl(kb, rule);
                    engine.run();

                    org.junit.Assert.assertEquals(resultSet.getSolutions().size(), numSolutions[i++]);
                    resultSet.getSolutions().clear();
                }
            }
        } catch (ProvaParsingException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Test
    public void cache_loop7() {
        ProvaKnowledgeBase kb = new ProvaKnowledgeBaseImpl();
        ProvaResultSet resultSet = new ProvaResultSetImpl();
        ProvaParserImpl parser = new ProvaParserImpl("rules/reloaded/loop7.prova", new Object[]{});
        try {
            List<ProvaRule> rules = parser.parse(kb, resultSet, "rules/reloaded/loop7.prova");
            // Run each goal
            int[] numSolutions = new int[]{8};
            int i = 0;
            for (ProvaRule rule : rules) {
                if (rule.getHead() == null) {
                    ProvaResolutionInferenceEngine engine = new ProvaResolutionInferenceEngineImpl(kb, rule);
                    engine.run();

                    org.junit.Assert.assertEquals(resultSet.getSolutions().size(), numSolutions[i++]);
                    resultSet.getSolutions().clear();
                }
            }
        } catch (ProvaParsingException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Test
    public void cache_loop6() {
        ProvaKnowledgeBase kb = new ProvaKnowledgeBaseImpl();
        ProvaResultSet resultSet = new ProvaResultSetImpl();
        ProvaParserImpl parser = new ProvaParserImpl("rules/reloaded/loop6.prova", new Object[]{});
        try {
            List<ProvaRule> rules = parser.parse(kb, resultSet, "rules/reloaded/loop6.prova");
            // Run each goal
            int[] numSolutions = new int[]{2};
            int i = 0;
            for (ProvaRule rule : rules) {
                if (rule.getHead() == null) {
                    ProvaResolutionInferenceEngine engine = new ProvaResolutionInferenceEngineImpl(kb, rule);
                    engine.run();

                    org.junit.Assert.assertEquals(resultSet.getSolutions().size(), numSolutions[i++]);
                    resultSet.getSolutions().clear();
                }
            }
        } catch (ProvaParsingException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Test
    public void cache_loop5() {
        ProvaKnowledgeBase kb = new ProvaKnowledgeBaseImpl();
        ProvaResultSet resultSet = new ProvaResultSetImpl();
        ProvaParserImpl parser = new ProvaParserImpl("rules/reloaded/loop5.prova", new Object[]{});
        try {
            List<ProvaRule> rules = parser.parse(kb, resultSet, "rules/reloaded/loop5.prova");
            // Run each goal
            int[] numSolutions = new int[]{4};
            int i = 0;
            for (ProvaRule rule : rules) {
                if (rule.getHead() == null) {
                    ProvaResolutionInferenceEngine engine = new ProvaResolutionInferenceEngineImpl(kb, rule);
                    engine.run();

                    org.junit.Assert.assertEquals(resultSet.getSolutions().size(), numSolutions[i++]);
                    resultSet.getSolutions().clear();
                }
            }
        } catch (ProvaParsingException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Test
    public void cache_loop() {
        ProvaKnowledgeBase kb = new ProvaKnowledgeBaseImpl();
        ProvaResultSet resultSet = new ProvaResultSetImpl();
        ProvaParserImpl parser = new ProvaParserImpl("rules/reloaded/loop.prova", new Object[]{});
        try {
            List<ProvaRule> rules = parser.parse(kb, resultSet, "rules/reloaded/loop.prova");
            // Run each goal
            int[] numSolutions = new int[]{2};
            int i = 0;
            for (ProvaRule rule : rules) {
                if (rule.getHead() == null) {
                    ProvaResolutionInferenceEngine engine = new ProvaResolutionInferenceEngineImpl(kb, rule);
                    engine.run();

                    org.junit.Assert.assertEquals(resultSet.getSolutions().size(), numSolutions[i++]);
                    resultSet.getSolutions().clear();
                }
            }
        } catch (ProvaParsingException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Test
    public void cache_loop2() {
        ProvaKnowledgeBase kb = new ProvaKnowledgeBaseImpl();
        ProvaResultSet resultSet = new ProvaResultSetImpl();
        ProvaParserImpl parser = new ProvaParserImpl("rules/reloaded/loop2.prova", new Object[]{});
        try {
            List<ProvaRule> rules = parser.parse(kb, resultSet, "rules/reloaded/loop2.prova");
            // Run each goal
            int[] numSolutions = new int[]{3};
            int i = 0;
            for (ProvaRule rule : rules) {
                if (rule.getHead() == null) {
                    ProvaResolutionInferenceEngine engine = new ProvaResolutionInferenceEngineImpl(kb, rule);
                    engine.run();

                    org.junit.Assert.assertEquals(resultSet.getSolutions().size(), numSolutions[i++]);
                    resultSet.getSolutions().clear();
                }
            }
        } catch (ProvaParsingException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Test
    public void cache_loop3() {
        ProvaKnowledgeBase kb = new ProvaKnowledgeBaseImpl();
        ProvaResultSet resultSet = new ProvaResultSetImpl();
        ProvaParserImpl parser = new ProvaParserImpl("rules/reloaded/loop3.prova", new Object[]{});
        try {
            List<ProvaRule> rules = parser.parse(kb, resultSet, "rules/reloaded/loop3.prova");
            // Run each goal
            int[] numSolutions = new int[]{4};
            int i = 0;
            for (ProvaRule rule : rules) {
                if (rule.getHead() == null) {
                    ProvaResolutionInferenceEngine engine = new ProvaResolutionInferenceEngineImpl(kb, rule);
                    engine.run();

                    org.junit.Assert.assertEquals(resultSet.getSolutions().size(), numSolutions[i++]);
                    resultSet.getSolutions().clear();
                }
            }
        } catch (ProvaParsingException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Test
    public void cache_loop4() {
        ProvaKnowledgeBase kb = new ProvaKnowledgeBaseImpl();
        ProvaResultSet resultSet = new ProvaResultSetImpl();
        ProvaParserImpl parser = new ProvaParserImpl("rules/reloaded/loop4.prova", new Object[]{});
        try {
            List<ProvaRule> rules = parser.parse(kb, resultSet, "rules/reloaded/loop4.prova");
            // Run each goal
            int[] numSolutions = new int[]{8};
            int i = 0;
            for (ProvaRule rule : rules) {
                if (rule.getHead() == null) {
                    ProvaResolutionInferenceEngine engine = new ProvaResolutionInferenceEngineImpl(kb, rule);
                    engine.run();

                    org.junit.Assert.assertEquals(resultSet.getSolutions().size(), numSolutions[i++]);
                    resultSet.getSolutions().clear();
                }
            }
        } catch (ProvaParsingException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
