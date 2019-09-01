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

public class ProvaFileParserTest {

    @Test
    public void consult() {
        ProvaKnowledgeBase kb = new ProvaKnowledgeBaseImpl();
        ProvaResultSet resultSet = new ProvaResultSetImpl();
        ProvaParserImpl parser = new ProvaParserImpl("rules/reloaded/consult.prova", new Object[]{});
        try {
            List<ProvaRule> rules = parser.parse(kb, resultSet, "rules/reloaded/consult.prova");
            // Run each goal.
            // Note that the first goal (eval) has no solutions which is always the case for eval
            //   but the second goal (solve) has one solution as the facts a/1 are defined
            //   in the rulebase consulted by the eval in the first goal.
            int[] numSolutions = new int[]{0, 1};
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
    public void func_001() {
        ProvaKnowledgeBase kb = new ProvaKnowledgeBaseImpl();
        ProvaResultSet resultSet = new ProvaResultSetImpl();
        ProvaParserImpl parser = new ProvaParserImpl("rules/reloaded/func_001.prova", new Object[]{});
        try {
            List<ProvaRule> rules = parser.parse(kb, resultSet, "rules/reloaded/func_001.prova");
            // Run each goal
            int[] numSolutions = new int[]{0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
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
    public void yale4() {
        ProvaKnowledgeBase kb = new ProvaKnowledgeBaseImpl();
        ProvaResultSet resultSet = new ProvaResultSetImpl();
        ProvaParserImpl parser = new ProvaParserImpl("rules/reloaded/yale4.prova", new Object[]{});
        try {
            List<ProvaRule> rules = parser.parse(kb, resultSet, "rules/reloaded/yale4.prova");
            // Run each goal
            int[] numSolutions = new int[]{7, 3, 1, 0, 4, 2, 1, 0, 1};
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
    public void typedVariables() {
        ProvaKnowledgeBase kb = new ProvaKnowledgeBaseImpl();
        ProvaResultSet resultSet = new ProvaResultSetImpl();
        ProvaParserImpl parser = new ProvaParserImpl("rules/reloaded/test002.prova", new Object[]{});
        try {
            List<ProvaRule> rules = parser.parse(kb, resultSet, "rules/reloaded/test002.prova");
            // Run each goal
            int[] numSolutions = new int[]{3, 1, 1, 0, 1};
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
    public void queens() {
        ProvaKnowledgeBase kb = new ProvaKnowledgeBaseImpl();
        ProvaResultSet resultSet = new ProvaResultSetImpl();
        ProvaParserImpl parser = new ProvaParserImpl("rules/reloaded/queens001.prova", new Object[]{});
        try {
            List<ProvaRule> rules = parser.parse(kb, resultSet, "rules/reloaded/queens001.prova");
            // Run each goal
            int[] numSolutions = new int[]{724};
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
    public void list_tail() {
        ProvaKnowledgeBase kb = new ProvaKnowledgeBaseImpl();
        ProvaResultSet resultSet = new ProvaResultSetImpl();
        ProvaParserImpl parser = new ProvaParserImpl("rules/reloaded/list_tail.prova", new Object[]{});
        try {
            List<ProvaRule> rules = parser.parse(kb, resultSet, "rules/reloaded/list_tail.prova");
            // Run each goal
            int[] numSolutions = new int[]{1};
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

    //	@Test
    /*
     * This test will require tabling support as it otherwise it results in infinite loop
     */
    public void binary_link() {
        ProvaKnowledgeBase kb = new ProvaKnowledgeBaseImpl();
        ProvaResultSet resultSet = new ProvaResultSetImpl();
        ProvaParserImpl parser = new ProvaParserImpl("rules/reloaded/binary_link.prova", new Object[]{});
        try {
            List<ProvaRule> rules = parser.parse(kb, resultSet, "rules/reloaded/binary_link.prova");
            // Run each goal
            int[] numSolutions = new int[]{1};
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

    //	@Test
    public void queens_sir() {
        ProvaKnowledgeBase kb = new ProvaKnowledgeBaseImpl();
        ProvaResultSet resultSet = new ProvaResultSetImpl();
        ProvaParserImpl parser = new ProvaParserImpl("rules/reloaded/queens.prova", new Object[]{});
        try {
            List<ProvaRule> rules = parser.parse(kb, resultSet, "rules/reloaded/queens.prova");
            // Run each goal
            int[] numSolutions = new int[]{724};
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

}
