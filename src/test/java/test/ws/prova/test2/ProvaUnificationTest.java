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
import ws.prova.reference2.ProvaUnificationImpl;
import ws.prova.reference2.ProvaVariableImpl;

public class ProvaUnificationTest {
	/**
	 * Unify
	 *  goal: pred1([X,[2|A]|Z])
	 *  rule: pred1([V,Y,3,Y,U]):-pred2([V,Y|U])
	 *		
	 */
	@Test
	public void unifyTest1() {
		ProvaKnowledgeBase kb = new ProvaKnowledgeBaseImpl();
		
		ProvaConstant c2 = ProvaConstantImpl.create(2);
		ProvaVariable a = ProvaKnowledgeBaseTest.kb.generateVariable("A");
		ProvaList l1 = ProvaListImpl.create( new ProvaObject[] {c2},a);
		ProvaVariable x = ProvaKnowledgeBaseTest.kb.generateVariable("X");
		ProvaVariable z = ProvaKnowledgeBaseTest.kb.generateVariable("Z");
		ProvaList l2 = ProvaListImpl.create( new ProvaObject[] {x,l1},z);
		ProvaLiteral query = kb.generateLiteral("pred1",l2);
		ProvaRule goal = kb.generateGoal(new ProvaLiteral[] {query});
		
		ProvaVariable v = ProvaKnowledgeBaseTest.kb.generateVariable("V");
		ProvaVariable y = ProvaKnowledgeBaseTest.kb.generateVariable("Y");
		ProvaConstant c4 = ProvaConstantImpl.create(3);
		ProvaVariable u = ProvaKnowledgeBaseTest.kb.generateVariable("U");
		ProvaList l3 = ProvaListImpl.create( new ProvaObject[] {v,y,c4,y,u});
		ProvaLiteral lit1 = kb.generateLiteral("pred1",l3);
		ProvaList l4 = ProvaListImpl.create( new ProvaObject[] {v,y}, u);
		ProvaLiteral lit3 = kb.generateLiteral("pred2",l4);
		ProvaRule rule = kb.generateRule(lit1, new ProvaLiteral[] {lit3});
		
		ProvaUnificationImpl unification = new ProvaUnificationImpl(goal, rule,kb);
		boolean result = unification.unify();
		
		org.junit.Assert.assertTrue(result);
		
		int countSourceSubstitutions = 0;
		for( ProvaVariable var : unification.getSourceVariables() ) {
			ProvaObject to = var.getRecursivelyAssigned();
			if( to!=var ) {
				countSourceSubstitutions++;
			}
		}
		org.junit.Assert.assertEquals(countSourceSubstitutions,1);

		int countTargetSubstitutions = 0;
		for( ProvaVariable var : unification.getTargetVariables() ) {
			ProvaObject to = var.getRecursivelyAssigned();
			if( to!=var ) {
				countTargetSubstitutions++;
			}
		}
		org.junit.Assert.assertEquals(countTargetSubstitutions,2);

		// Recover actual substitutions resulting from the unification
		ProvaLiteral[] newGoals = unification.rebuildNewGoals();

		org.junit.Assert.assertNotNull(newGoals);
		// There is one actual goal: pred2(X,[1|A]|U)
		org.junit.Assert.assertEquals(newGoals.length,1);
		// The goal literal has variable arity
		org.junit.Assert.assertEquals(newGoals[0].getTerms().computeSize(),-1);
		// The goal literal has a fixed part of length 2
		org.junit.Assert.assertEquals(newGoals[0].getTerms().getFixed().length,2);
	}

	/**
	 * Unify
	 *		goal: pred1(X,[2|A]|Z)
	 *		rule: pred1(V,Y,3,Y,U):-pred2(V|Y).
	 */
	@Test
	public void unifyTest2() {
		ProvaKnowledgeBase kb = new ProvaKnowledgeBaseImpl();
		
		ProvaConstant c2 = ProvaConstantImpl.create(2);
		ProvaVariable a = ProvaKnowledgeBaseTest.kb.generateVariable("A");
		ProvaList l1 = ProvaListImpl.create( new ProvaObject[] {c2},a);
		ProvaVariable x = ProvaKnowledgeBaseTest.kb.generateVariable("X");
		ProvaVariable z = ProvaKnowledgeBaseTest.kb.generateVariable("Z");
		ProvaList l2 = ProvaListImpl.create( new ProvaObject[] {x,l1},z);
		ProvaLiteral query = kb.generateLiteral("pred1",l2);
		ProvaRule goal = kb.generateGoal(new ProvaLiteral[] {query});
		
		ProvaVariable v = ProvaKnowledgeBaseTest.kb.generateVariable("V");
		ProvaVariable y = ProvaKnowledgeBaseTest.kb.generateVariable("Y");
		ProvaConstant c4 = ProvaConstantImpl.create(3);
		ProvaVariable u = ProvaKnowledgeBaseTest.kb.generateVariable("U");
		ProvaList l3 = ProvaListImpl.create( new ProvaObject[] {v,y,c4,y,u});
		ProvaLiteral lit1 = kb.generateLiteral("pred1",l3);
		ProvaList l4 = ProvaListImpl.create( new ProvaObject[] {v}, y);
		ProvaLiteral lit3 = kb.generateLiteral("pred2",l4);
		ProvaRule rule = kb.generateRule(lit1, new ProvaLiteral[] {lit3});
		
		ProvaUnificationImpl unification = new ProvaUnificationImpl(goal, rule,kb);
		boolean result = unification.unify();
		
		org.junit.Assert.assertTrue(result);
		
		int countSourceSubstitutions = 0;
		for( ProvaVariable var : unification.getSourceVariables() ) {
			ProvaObject to = var.getRecursivelyAssigned();
			if( to!=var ) {
				countSourceSubstitutions++;
			}
		}
		org.junit.Assert.assertEquals(countSourceSubstitutions,1);

		int countTargetSubstitutions = 0;
		for( ProvaVariable var : unification.getTargetVariables() ) {
			ProvaObject to = var.getRecursivelyAssigned();
			if( to!=var ) {
				countTargetSubstitutions++;
			}
		}
		org.junit.Assert.assertEquals(countTargetSubstitutions,2);

		// Recover actual substitutions resulting from the unification
		ProvaLiteral[] newGoals = unification.rebuildNewGoals();

		org.junit.Assert.assertNotNull(newGoals);
		// There is one actual goal: pred2(X,2|A)
		org.junit.Assert.assertEquals(newGoals.length,1);
		// The goal literal has variable arity
		org.junit.Assert.assertEquals(newGoals[0].getTerms().computeSize(),-1);
		// The second argument "2" is added to the "fixed" part of the goal literal
		org.junit.Assert.assertEquals(newGoals[0].getTerms().getFixed().length,2);
	}

	/**
	 * Unify
	 *		goal: pred1(X,[2|A],3|Z)
	 *		rule: pred1(V,Y|U):-pred2(V,Y|U).
	 */
	@Test
	public void unifyListPointersOffsetTest() {
		ProvaKnowledgeBase kb = new ProvaKnowledgeBaseImpl();
		
		ProvaConstant c2 = ProvaConstantImpl.create(2);
		ProvaVariable a = ProvaKnowledgeBaseTest.kb.generateVariable("A");
		ProvaList l1 = ProvaListImpl.create( new ProvaObject[] {c2},a);
		ProvaVariable x = ProvaKnowledgeBaseTest.kb.generateVariable("X");
		ProvaConstant c3 = ProvaConstantImpl.create(3);
		ProvaVariable z = ProvaKnowledgeBaseTest.kb.generateVariable("Z");
		ProvaList l2 = ProvaListImpl.create( new ProvaObject[] {x,l1,c3},z);
		ProvaLiteral query = kb.generateLiteral("pred1",l2);
		ProvaRule goal = kb.generateGoal(new ProvaLiteral[] {query});
		
		ProvaVariable v = ProvaKnowledgeBaseTest.kb.generateVariable("V");
		ProvaVariable y = ProvaKnowledgeBaseTest.kb.generateVariable("Y");
		ProvaVariable u = ProvaKnowledgeBaseTest.kb.generateVariable("U");
		ProvaList l3 = ProvaListImpl.create( new ProvaObject[] {v,y}, u);
		ProvaLiteral lit1 = kb.generateLiteral("pred1",l3);
		ProvaList l4 = ProvaListImpl.create( new ProvaObject[] {v,y}, u);
		ProvaLiteral lit3 = kb.generateLiteral("pred2",l4);
		ProvaRule rule = kb.generateRule(lit1, new ProvaLiteral[] {lit3});
		
		ProvaUnificationImpl unification = new ProvaUnificationImpl(goal, rule, kb);
		boolean result = unification.unify();
		
		org.junit.Assert.assertTrue(result);
		
		int countSourceSubstitutions = 0;
		for( ProvaVariable var : unification.getSourceVariables() ) {
			ProvaObject to = var.getRecursivelyAssigned();
			if( to!=var ) {
				countSourceSubstitutions++;
			}
		}
		org.junit.Assert.assertEquals(countSourceSubstitutions,0);

		int countTargetSubstitutions = 0;
		for( ProvaVariable var : unification.getTargetVariables() ) {
			ProvaObject to = var.getRecursivelyAssigned();
			if( to!=var ) {
				countTargetSubstitutions++;
			}
		}
		org.junit.Assert.assertEquals(countTargetSubstitutions,3);

		// Recover actual substitutions resulting from the unification
		ProvaLiteral[] newGoals = unification.rebuildNewGoals();

		org.junit.Assert.assertNotNull(newGoals);
		// There is one actual goal: pred2(X,[2|A],3|Z)
		org.junit.Assert.assertEquals(newGoals.length,1);
		// The goal literal has variable arity
		org.junit.Assert.assertEquals(newGoals[0].getTerms().computeSize(),-1);
		// The third argument "3" is added to the "fixed" part of the goal literal
		org.junit.Assert.assertEquals(newGoals[0].getTerms().getFixed().length,3);
	}

	/**
	 * Unify
	 * 		goal: pred1([V,[1,2,3],2,3|U]):-pred2([V|U])  
	 * 		rule: pred1([X,[1|Z]|Z])
	 */
	@Test
	public void unifyEmptyListTest() {
		ProvaKnowledgeBase kb = new ProvaKnowledgeBaseImpl();
		
		ProvaConstant c1 = ProvaConstantImpl.create(1);
		ProvaVariable z = ProvaKnowledgeBaseTest.kb.generateVariable("Z");
		ProvaList l1 = ProvaListImpl.create( new ProvaObject[] {c1},z);
		ProvaVariable x = ProvaKnowledgeBaseTest.kb.generateVariable("X");
		ProvaList l2 = ProvaListImpl.create( new ProvaObject[] {x,l1},z);
		ProvaLiteral query = kb.generateLiteral("pred1",l2);
		ProvaRule goal = kb.generateGoal(new ProvaLiteral[] {query});
		
		ProvaConstant c2 = ProvaConstantImpl.create(2);
		ProvaConstant c3 = ProvaConstantImpl.create(3);
		ProvaList l3 = ProvaListImpl.create( new ProvaObject[] {c1,c2,c3} );
		ProvaVariable v = ProvaKnowledgeBaseTest.kb.generateVariable("V");
		ProvaVariable u = ProvaKnowledgeBaseTest.kb.generateVariable("U");
		ProvaList l4 = ProvaListImpl.create( new ProvaObject[] {v,l3,c2,c3}, u);
		ProvaLiteral lit1 = kb.generateLiteral("pred1",l4);
		ProvaList l5 = ProvaListImpl.create( new ProvaObject[] {v}, u);
		ProvaLiteral lit2 = kb.generateLiteral("pred2",l5);
		ProvaRule rule = kb.generateRule(lit1, new ProvaLiteral[] {lit2});

		System.out.println(rule.toString()+"  "+goal.toString());
		ProvaUnificationImpl unification = new ProvaUnificationImpl(goal, rule, kb);
		boolean result = unification.unify();

		org.junit.Assert.assertTrue(result);
		
		int countSourceSubstitutions = 0;
		for( ProvaVariable var : unification.getSourceVariables() ) {
			ProvaObject to = var.getRecursivelyAssigned();
			if( to!=var ) {
				countSourceSubstitutions++;
			}
		}
		org.junit.Assert.assertEquals(countSourceSubstitutions,1);

		int countTargetSubstitutions = 0;
		for( ProvaVariable var : unification.getTargetVariables() ) {
			ProvaObject to = var.getRecursivelyAssigned();
			if( to!=var ) {
				countTargetSubstitutions++;
			}
		}
		org.junit.Assert.assertEquals(countTargetSubstitutions,2);

		// Recover actual substitutions resulting from the unification
		ProvaLiteral[] newGoals = unification.rebuildNewGoals();

		org.junit.Assert.assertNotNull(newGoals);
		// There is one actual goal: pred2(X)
		org.junit.Assert.assertEquals(newGoals.length,1);
		// The goal literal has fixed arity of 1
		org.junit.Assert.assertEquals(newGoals[0].getTerms().computeSize(),1);
		// The "fixed" part of the goal literal has length equal to 1
		org.junit.Assert.assertEquals(newGoals[0].getTerms().getFixed().length,1);
	}

	/**
	 * Unify
	 *		goal: pred1(X,[1|Z]|Z)
	 *		rule: pred1(V,[1,2,3,4],2,3|U):-pred2(V|U).
	 */
	@Test
	public void unifyNonEmptyListTest() {
		ProvaKnowledgeBase kb = new ProvaKnowledgeBaseImpl();
		
		ProvaConstant c1 = ProvaConstantImpl.create(1);
		ProvaVariable z = ProvaKnowledgeBaseTest.kb.generateVariable("Z");
		ProvaList l1 = ProvaListImpl.create( new ProvaObject[] {c1},z);
		ProvaVariable x = ProvaKnowledgeBaseTest.kb.generateVariable("X");
		ProvaList l2 = ProvaListImpl.create( new ProvaObject[] {x,l1},z);
		ProvaLiteral query = kb.generateLiteral("pred1",l2);
		ProvaRule goal = kb.generateGoal(new ProvaLiteral[] {query});
		
		ProvaConstant c2 = ProvaConstantImpl.create(2);
		ProvaConstant c3 = ProvaConstantImpl.create(3);
		ProvaConstant c4 = ProvaConstantImpl.create(4);
		ProvaList l3 = ProvaListImpl.create( new ProvaObject[] {c1,c2,c3,c4} );
		ProvaVariable v = ProvaKnowledgeBaseTest.kb.generateVariable("V");
		ProvaVariable u = ProvaKnowledgeBaseTest.kb.generateVariable("U");
		ProvaList l4 = ProvaListImpl.create( new ProvaObject[] {v,l3,c2,c3}, u);
		ProvaLiteral lit1 = kb.generateLiteral("pred1",l4);
		ProvaList l5 = ProvaListImpl.create( new ProvaObject[] {v}, u);
		ProvaLiteral lit2 = kb.generateLiteral("pred2",l5);
		ProvaRule rule = kb.generateRule(lit1, new ProvaLiteral[] {lit2});
		
		ProvaUnificationImpl unification = new ProvaUnificationImpl(goal, rule,kb);
		boolean result = unification.unify();
		
		org.junit.Assert.assertTrue(result);
		
		int countSourceSubstitutions = 0;
		for( ProvaVariable var : unification.getSourceVariables() ) {
			ProvaObject to = var.getRecursivelyAssigned();
			if( to!=var ) {
				countSourceSubstitutions++;
			}
		}
		org.junit.Assert.assertEquals(countSourceSubstitutions,1);

		int countTargetSubstitutions = 0;
		for( ProvaVariable var : unification.getTargetVariables() ) {
			ProvaObject to = var.getRecursivelyAssigned();
			if( to!=var ) {
				countTargetSubstitutions++;
			}
		}
		org.junit.Assert.assertEquals(countTargetSubstitutions,2);

		// Recover actual substitutions resulting from the unification
		ProvaLiteral[] newGoals = unification.rebuildNewGoals();

		org.junit.Assert.assertNotNull(newGoals);
		// There is one actual goal: pred2(X,4)
		org.junit.Assert.assertEquals(newGoals.length,1);
		// The goal literal has fixed arity of 2
		org.junit.Assert.assertEquals(newGoals[0].getTerms().computeSize(),2);
		// The "fixed" part of the goal literal has length equal to 2
		org.junit.Assert.assertEquals(newGoals[0].getTerms().getFixed().length,2);
	}

}
