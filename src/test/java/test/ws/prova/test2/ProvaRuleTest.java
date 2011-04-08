package test.ws.prova.test2;

import org.junit.Test;

import ws.prova.kernel2.ProvaConstant;
import ws.prova.kernel2.ProvaKnowledgeBase;
import ws.prova.kernel2.ProvaList;
import ws.prova.kernel2.ProvaLiteral;
import ws.prova.kernel2.ProvaObject;
import ws.prova.kernel2.ProvaRule;
import ws.prova.kernel2.ProvaVariable;
import ws.prova.reference2.ProvaConstantImpl;
import ws.prova.reference2.ProvaKnowledgeBaseImpl;
import ws.prova.reference2.ProvaListImpl;
import ws.prova.reference2.ProvaListPtrImpl;
import ws.prova.reference2.ProvaVariableImpl;

public class ProvaRuleTest {

	@Test
	public void countVariablesInRule() {
		ProvaKnowledgeBase kb = new ProvaKnowledgeBaseImpl();

		ProvaVariable v1 = ProvaKnowledgeBaseTest.kb.generateVariable("v1");
		ProvaVariable v2 = ProvaKnowledgeBaseTest.kb.generateVariable("v2");
		ProvaVariable v3 = ProvaKnowledgeBaseTest.kb.generateVariable("v3");
		ProvaVariable v4 = ProvaKnowledgeBaseTest.kb.generateVariable("v4");
		ProvaList l1 = ProvaListImpl.create(new ProvaObject[] {v2},v3);
		ProvaList l2 = ProvaListImpl.create( new ProvaObject[] {v1,l1,v4});
		
		ProvaLiteral lit1 = kb.generateLiteral("pred1",l2);
		ProvaRule r1 = kb.generateRule(lit1, new ProvaLiteral[] {} );
		
		org.junit.Assert.assertEquals(r1.getVariables().size(),4);
	}

	@Test
	public void countDuplicateVariablesInRule() {
		ProvaKnowledgeBase kb = new ProvaKnowledgeBaseImpl();

		ProvaVariable v1 = ProvaKnowledgeBaseTest.kb.generateVariable("v1");
		ProvaVariable v2 = ProvaKnowledgeBaseTest.kb.generateVariable("v2");
		ProvaVariable v3 = ProvaKnowledgeBaseTest.kb.generateVariable("v3");
		ProvaConstant c1 = ProvaConstantImpl.create(12);
		ProvaVariable v4 = ProvaKnowledgeBaseTest.kb.generateVariable("v4");
		ProvaList l1 = ProvaListImpl.create( new ProvaObject[] {v2,c1},v3);
		ProvaList l2 = ProvaListImpl.create( new ProvaObject[] {v1,l1,v2,v4});
		
		ProvaLiteral lit1 = kb.generateLiteral("pred1",l2);
		ProvaRule r1 = kb.generateRule(lit1, new ProvaLiteral[] {} );
		
		org.junit.Assert.assertEquals(r1.getVariables().size(),4);
	}

	@Test
	public void countVariablesInRuleWithListAssigns() {
		ProvaKnowledgeBase kb = new ProvaKnowledgeBaseImpl();

		ProvaVariable v1 = ProvaKnowledgeBaseTest.kb.generateVariable("v1");
		ProvaVariable v2 = ProvaKnowledgeBaseTest.kb.generateVariable("v2");
		ProvaVariable v3 = ProvaKnowledgeBaseTest.kb.generateVariable("v3");
		ProvaVariable v4 = ProvaKnowledgeBaseTest.kb.generateVariable("v4");
		ProvaList l1 = ProvaListImpl.create( new ProvaObject[] {v2},v3);
		ProvaList l2 = ProvaListImpl.create( new ProvaObject[] {v1,l1,v4});
		
		ProvaLiteral lit1 = kb.generateLiteral("pred1",l2);
		ProvaRule r1 = kb.generateRule(lit1, new ProvaLiteral[] {} );
		
		ProvaList l3 = ProvaListImpl.create( new ProvaObject[] {v1,v2});
		v3.setAssigned(new ProvaListPtrImpl(l3,1));
		
		org.junit.Assert.assertEquals(r1.getVariables().size(),4);
	}

}
