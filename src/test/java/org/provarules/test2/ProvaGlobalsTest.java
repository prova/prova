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

public class ProvaGlobalsTest {

    @Test
    public void globals001() {
        ProvaKnowledgeBase kb = new ProvaKnowledgeBaseImpl();
        kb.setGlobalConstant("$A", "a");
        ProvaResultSet resultSet = new ProvaResultSetImpl();
        ProvaParserImpl parser = new ProvaParserImpl("rules/reloaded/globals001.prova", new Object[]{});
        try {
            List<ProvaRule> rules = parser.parse(kb, resultSet, "rules/reloaded/globals001.prova");
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

}
