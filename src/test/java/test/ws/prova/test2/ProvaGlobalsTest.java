package test.ws.prova.test2;

import java.io.IOException;
import java.util.List;

import org.junit.Test;

import ws.prova.kernel2.ProvaKnowledgeBase;
import ws.prova.kernel2.ProvaResolutionInferenceEngine;
import ws.prova.kernel2.ProvaResultSet;
import ws.prova.kernel2.ProvaRule;
import ws.prova.parser2.ProvaParserImpl;
import ws.prova.parser2.ProvaParsingException;
import ws.prova.reference2.ProvaKnowledgeBaseImpl;
import ws.prova.reference2.ProvaResolutionInferenceEngineImpl;
import ws.prova.reference2.ProvaResultSetImpl;

public class ProvaGlobalsTest {

	@Test
	public void globals001() {
		ProvaKnowledgeBase kb = new ProvaKnowledgeBaseImpl();
		kb.setGlobalConstant("$A","a");
		ProvaResultSet resultSet = new ProvaResultSetImpl();
		ProvaParserImpl parser = new ProvaParserImpl("rules/reloaded/globals001.prova", new Object[] {});
		try {
			List<ProvaRule> rules = parser.parse(kb, resultSet, "rules/reloaded/globals001.prova");
			// Run each goal
			int[] numSolutions = new int[] {2};
			int i = 0;
			for( ProvaRule rule : rules ) {
				if( rule.getHead()==null ) {
					ProvaResolutionInferenceEngine engine = new ProvaResolutionInferenceEngineImpl(kb, rule);
					engine.run();

					org.junit.Assert.assertEquals(resultSet.getSolutions().size(),numSolutions[i++]);
					resultSet.getSolutions().clear();
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

}
