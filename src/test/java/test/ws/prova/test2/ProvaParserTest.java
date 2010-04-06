package test.ws.prova.test2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

import org.junit.Test;

import ws.prova.kernel2.ProvaKnowledgeBase;
import ws.prova.kernel2.ProvaResolutionInferenceEngine;
import ws.prova.kernel2.ProvaResultSet;
import ws.prova.kernel2.ProvaRule;
import ws.prova.parser2.ProvaParsingException;
import ws.prova.parser2.ProvaParserImpl;
import ws.prova.reference2.ProvaKnowledgeBaseImpl;
import ws.prova.reference2.ProvaResolutionInferenceEngineImpl;
import ws.prova.reference2.ProvaResultSetImpl;

public class ProvaParserTest {

	@Test
	public void simpleParse() {
		ProvaKnowledgeBase kb = new ProvaKnowledgeBaseImpl();
		ProvaResultSet resultSet = new ProvaResultSetImpl();
		StringReader sr = new StringReader(
				":-solve(a(X,Y)).\n"+
				"a(X,Y):-b(X),!,d(Y).\n"+
				"b(X):-c(X).\n"+
				"c(1).\n"+
				"c(2).\n"+
				"d(3).\n"+
				"d(4).");
		BufferedReader in = new BufferedReader(sr);
		ProvaParserImpl parser = new ProvaParserImpl("inline1", new Object[] {});
		try {
			List<ProvaRule> rules = parser.parse(kb, resultSet, in);
			// Run each goal
			for( ProvaRule rule : rules ) {
				if( rule.getHead()==null ) {
					ProvaResolutionInferenceEngine engine = new ProvaResolutionInferenceEngineImpl(kb, rule);
					engine.run();

					org.junit.Assert.assertEquals(resultSet.getSolutions().size(),2);
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
				":-solve(a([X,Y|Z])).\n"+
				"a([X,Y]):-b(X),!,d(Y).\n"+
				"b(X):-c(X).\n"+
				"c(1).\n"+
				"c(2).\n"+
				"d(3).\n"+
				"d(4).");
		BufferedReader in = new BufferedReader(sr);
		ProvaParserImpl parser = new ProvaParserImpl("inline1", new Object[] {});
		try {
			List<ProvaRule> rules = parser.parse(kb, resultSet, in);
			// Run each goal
			for( ProvaRule rule : rules ) {
				if( rule.getHead()==null ) {
					ProvaResolutionInferenceEngine engine = new ProvaResolutionInferenceEngineImpl(kb, rule);
					engine.run();

					org.junit.Assert.assertEquals(resultSet.getSolutions().size(),2);
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
				":-solve(a(X,b(X))).\n"+
				"a(X,Y):-derive(Y).\n"+
				"b(X):-c(X).\n"+
				"c(1).\n"+
				"c(2).");
		BufferedReader in = new BufferedReader(sr);
		ProvaParserImpl parser = new ProvaParserImpl("inline1", new Object[] {});
		try {
			List<ProvaRule> rules = parser.parse(kb, resultSet, in);
			// Run each goal
			for( ProvaRule rule : rules ) {
				if( rule.getHead()==null ) {
					ProvaResolutionInferenceEngine engine = new ProvaResolutionInferenceEngineImpl(kb, rule);
					engine.run();

					org.junit.Assert.assertEquals(resultSet.getSolutions().size(),2);
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
				":-solve(a([X,Y|Z])).\n"+
				"a([X,Y]):-b(X),!,c(Y),not(d(Y)).\n"+
				"not(X):-derive(X),!,fail().\n"+
				"not(X).\n"+
				"b(-1).\n"+
				"b(-2).\n"+
				"c(1).\n"+
				"c(2).\n"+
				"c(3).\n"+
				"d(1).\n"+
				"d(4).");
		BufferedReader in = new BufferedReader(sr);
		ProvaParserImpl parser = new ProvaParserImpl("inline1", new Object[] {});
		try {
			List<ProvaRule> rules = parser.parse(kb, resultSet, in);
			// Run each goal
			for( ProvaRule rule : rules ) {
				if( rule.getHead()==null ) {
					ProvaResolutionInferenceEngine engine = new ProvaResolutionInferenceEngineImpl(kb, rule);
					engine.run();

					org.junit.Assert.assertEquals(resultSet.getSolutions().size(),2);
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
