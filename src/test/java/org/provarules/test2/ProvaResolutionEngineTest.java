package org.provarules.test2;

import org.junit.Test;
import org.provarules.kernel2.*;
import org.provarules.reference2.*;

public class ProvaResolutionEngineTest {

    @Test
    @SuppressWarnings("unused")
    public void solveProblem1() {
        ProvaKnowledgeBase kb = new ProvaKnowledgeBaseImpl();
        ProvaResultSet resultSet = new ProvaResultSetImpl();

        // Define goal (this should be part of the way solve is encoded by the parser)
        ProvaConstant c1 = ProvaConstantImpl.create(1);
        ProvaVariable x = ProvaVariableImpl.create("X");
        ProvaVariable z = ProvaVariableImpl.create("Z");
        ProvaList l1 = ProvaListImpl.create(new ProvaObject[]{x, c1, z});
        ProvaLiteral query = kb.generateLiteral("pred1", l1);
        // "solve" works by accepting pairs of variable (name,value) pairs
        ProvaConstant cResultSet = ProvaConstantImpl.create(resultSet);
        ProvaConstant cx = ProvaConstantImpl.create("X");
        ProvaConstant cz = ProvaConstantImpl.create("Z");
        ProvaList lx = ProvaListImpl.create(new ProvaObject[]{cx, x});
        ProvaList lz = ProvaListImpl.create(new ProvaObject[]{cz, z});
        ProvaList ls = ProvaListImpl.create(new ProvaObject[]{cResultSet, lx, lz});
        // "solve" always "fails" forcing backtracking
        ProvaLiteral solveBuiltin = kb.generateLiteral("solve", ls);
        ProvaRule goalRule = kb.generateGoal(new ProvaLiteral[]{query, solveBuiltin});

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

        ProvaList l2a = ProvaListImpl.create(new ProvaObject[]{c2, c1, c1});
        ProvaLiteral lit2a = kb.generateLiteral("pred1", l2a);
        ProvaRule rule1a = kb.generateRule(lit2a, null);

        ProvaVariable x2 = ProvaVariableImpl.create("X");
        ProvaList l5 = ProvaListImpl.create(new ProvaObject[]{c1, c3, x2});
        ProvaLiteral lit5 = kb.generateLiteral("pred2", l5);
        ProvaRule rule3 = kb.generateRule(lit5, null);

        ProvaVariable x3 = ProvaVariableImpl.create("X");
        ProvaList l6 = ProvaListImpl.create(new ProvaObject[]{c1, x3, c1});
        ProvaLiteral lit6 = kb.generateLiteral("pred2", l6);
        ProvaRule rule4 = kb.generateRule(lit6, null);

        ProvaResolutionInferenceEngine engine = new ProvaResolutionInferenceEngineImpl(kb, goalRule);
        ProvaDerivationNode result = engine.run();

        org.junit.Assert.assertEquals(resultSet.getSolutions().size(), 4);
    }

    @Test
    @SuppressWarnings("unused")
    public void solveProblemSamePredicateSymbolsDifferentArities() {
        ProvaKnowledgeBase kb = new ProvaKnowledgeBaseImpl();
        ProvaResultSet resultSet = new ProvaResultSetImpl();

        // Define goal (this should be part of the way solve is encoded by the parser)
        ProvaConstant c1 = ProvaConstantImpl.create(1);
        ProvaConstant c4 = ProvaConstantImpl.create(4);
        ProvaVariable p = ProvaVariableImpl.create("P");
        ProvaList l1 = ProvaListImpl.create(new ProvaObject[]{c1, p});
        ProvaLiteral query = kb.generateLiteral("queens", l1);
        // "solve" works by accepting pairs of variable (name,value) pairs
        ProvaConstant cp = ProvaConstantImpl.create("P");
        ProvaConstant cResultSet = ProvaConstantImpl.create(resultSet);
        ProvaList lp = ProvaListImpl.create(new ProvaObject[]{cp, p});
        ProvaList ls = ProvaListImpl.create(new ProvaObject[]{cResultSet, lp});
        ProvaLiteral solveBuiltin = kb.generateLiteral("solve", ls);
        ProvaRule goalRule = kb.generateGoal(new ProvaLiteral[]{query, solveBuiltin});

        ProvaVariable n1 = ProvaVariableImpl.create("N");
        ProvaVariable qs1 = ProvaVariableImpl.create("Qs");
        ProvaList l3 = ProvaListImpl.create(new ProvaObject[]{n1, qs1});
        ProvaLiteral lit3 = kb.generateLiteral("queens", l3);
        ProvaVariable ns1 = ProvaVariableImpl.create("Ns");
        ProvaList l4 = ProvaListImpl.create(new ProvaObject[]{c1, n1, ns1});
        ProvaLiteral lit4 = kb.generateLiteral("range", l4);
        ProvaList lEmpty = ProvaListImpl.create(new ProvaObject[]{});
        ProvaList l4a = ProvaListImpl.create(new ProvaObject[]{ns1, lEmpty, qs1});
        ProvaLiteral lit4a = kb.generateLiteral("queens", l4a);
        ProvaRule rule2 = kb.generateRule(lit3, new ProvaLiteral[]{lit4, lit4a});

        ProvaVariable n2 = ProvaVariableImpl.create("N");
        ProvaList l2a = ProvaListImpl.create(new ProvaObject[]{n2});
        ProvaList l2 = ProvaListImpl.create(new ProvaObject[]{n2, n2, l2a});
        ProvaLiteral lit2 = kb.generateLiteral("range", l2);
        ProvaRule rule1 = kb.generateRule(lit2, null);

        ProvaVariable q5 = ProvaVariableImpl.create("Q");
        ProvaList l5 = ProvaListImpl.create(new ProvaObject[]{q5, lEmpty, q5});
        ProvaLiteral lit5 = kb.generateLiteral("queens", l5);
        ProvaRule rule5 = kb.generateRule(lit5, null);

        ProvaResolutionInferenceEngine engine = new ProvaResolutionInferenceEngineImpl(kb, goalRule);
        ProvaDerivationNode result = engine.run();

        org.junit.Assert.assertEquals(resultSet.getSolutions().size(), 1);
    }

}
