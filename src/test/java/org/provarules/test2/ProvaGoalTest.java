package org.provarules.test2;

import org.junit.Test;
import org.provarules.kernel2.*;
import org.provarules.reference2.*;

public class ProvaGoalTest {

    /**
     * Unify
     * goal:
     * pred1(X,1,Z).
     * rules:
     * pred1(1,1,2).
     * pred1(X,Y,Z):-pred2(X,Y,1),pred2(X,Z,X).
     * <p>
     * pred2(1,3,X).
     * pred2(1,X,1).
     */
    @SuppressWarnings("unused")
    @Test
    public void simpleItrationTest1() {
        ProvaKnowledgeBase kb = new ProvaKnowledgeBaseImpl();

        ProvaConstant c1 = ProvaConstantImpl.create(1);
        ProvaVariable x = ProvaVariableImpl.create("X");
        ProvaVariable z = ProvaVariableImpl.create("Z");
        ProvaList l1 = ProvaListImpl.create(new ProvaObject[]{x, c1, z});
        ProvaLiteral query = kb.generateLiteral("pred1", l1);
        ProvaRule goalRule = kb.generateGoal(new ProvaLiteral[]{query});

        ProvaConstant c2 = ProvaConstantImpl.create(2);
        ProvaConstant c3 = ProvaConstantImpl.create(3);
        ProvaList l2 = ProvaListImpl.create(new ProvaObject[]{c1, c1, c2});
        ProvaLiteral lit2 = kb.generateLiteral("pred1", l2);
        ProvaRule rule1 = kb.generateRule(lit2, null);

        ProvaVariable x1 = ProvaVariableImpl.create("X");
        ProvaVariable y1 = ProvaVariableImpl.create("Y");
        ProvaVariable z1 = ProvaVariableImpl.create("Z");
        ProvaList l3 = ProvaListImpl.create(new ProvaObject[]{x1, y1, z1});
        ProvaLiteral lit3 = kb.generateLiteral("pred1", l3);
        ProvaList l4 = ProvaListImpl.create(new ProvaObject[]{x1, y1, c1});
        ProvaLiteral lit4 = kb.generateLiteral("pred2", l4);
        ProvaList l4a = ProvaListImpl.create(new ProvaObject[]{x1, z1, x1});
        ProvaLiteral lit4a = kb.generateLiteral("pred2", l4a);
        ProvaRule rule2 = kb.generateRule(lit3, new ProvaLiteral[]{lit4, lit4a});

        ProvaVariable x2 = ProvaVariableImpl.create("X");
        ProvaList l5 = ProvaListImpl.create(new ProvaObject[]{c1, c3, x2});
        ProvaLiteral lit5 = kb.generateLiteral("pred2", l5);
        ProvaRule rule3 = kb.generateRule(lit5, null);

        ProvaVariable x3 = ProvaVariableImpl.create("X");
        ProvaList l6 = ProvaListImpl.create(new ProvaObject[]{c1, x3, c1});
        ProvaLiteral lit6 = kb.generateLiteral("pred2", l6);
        ProvaRule rule4 = kb.generateRule(lit6, null);

        ProvaGoal goal = new ProvaGoalImpl(goalRule);

        ProvaUnification unification = goal.nextUnification(kb);
        boolean result = unification.unify();
        org.junit.Assert.assertTrue(result);

        // Recover actual substitutions resulting from the unification
        ProvaLiteral[] newGoals1 = unification.rebuildNewGoals();

        unification = goal.nextUnification(kb);
        result = unification.unify();
        org.junit.Assert.assertTrue(result);

        int countSourceSubstitutions = 0;
        for (ProvaVariable var : unification.getSourceVariables()) {
            ProvaObject to = var.getRecursivelyAssigned();
            if (to != var) {
                countSourceSubstitutions++;
            }
        }
        org.junit.Assert.assertEquals(countSourceSubstitutions, 0);

        int countTargetSubstitutions = 0;
        for (ProvaVariable var : unification.getTargetVariables()) {
            ProvaObject to = var.getRecursivelyAssigned();
            if (to != var) {
                countTargetSubstitutions++;
            }
        }
        org.junit.Assert.assertEquals(countTargetSubstitutions, 3);

        // Recover actual substitutions resulting from the unification
        ProvaLiteral[] newGoals2 = unification.rebuildNewGoals();

        org.junit.Assert.assertNotNull(newGoals2);
        // There is one actual goal: pred2(X,Y,1)
        org.junit.Assert.assertEquals(newGoals2.length, 2);
        // The goal literal has arity of 3
        org.junit.Assert.assertEquals(newGoals2[0].getTerms().computeSize(), 3);
        // The goal literal has a fixed part of length 2
        org.junit.Assert.assertEquals(newGoals2[0].getTerms().getFixed().length, 3);
    }

}
