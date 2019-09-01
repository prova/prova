package org.provarules.test2;

import org.junit.Test;
import org.provarules.kernel2.*;
import org.provarules.reference2.*;

public class ProvaCutTest {

    @Test
    @SuppressWarnings("unused")
    public void solveProblemWithoutCut() {
        ProvaKnowledgeBase kb = new ProvaKnowledgeBaseImpl();
        ProvaResultSet resultSet = new ProvaResultSetImpl();

        // Define goal (this should be part of the way solve is encoded by the parser)
        ProvaConstant c1 = ProvaConstantImpl.create(1);
        ProvaVariable x = ProvaVariableImpl.create("X");
        ProvaVariable y = ProvaVariableImpl.create("Y");
        ProvaVariable z = ProvaVariableImpl.create("Z");
        ProvaList l1 = ProvaListImpl.create(new ProvaObject[]{x, y, z});
        ProvaLiteral query = kb.generateLiteral("pred1", l1);
        // "solve" works by accepting pairs of variable (name,value) pairs
        ProvaConstant cx = ProvaConstantImpl.create("X");
        ProvaConstant cy = ProvaConstantImpl.create("Y");
        ProvaConstant cz = ProvaConstantImpl.create("Z");
        ProvaConstant cResultSet = ProvaConstantImpl.create(resultSet);
        ProvaList lx = ProvaListImpl.create(new ProvaObject[]{cx, x});
        ProvaList ly = ProvaListImpl.create(new ProvaObject[]{cy, y});
        ProvaList lz = ProvaListImpl.create(new ProvaObject[]{cz, z});
        ProvaList ls = ProvaListImpl.create(new ProvaObject[]{cResultSet, lx, ly, lz});
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

        org.junit.Assert.assertEquals(resultSet.getSolutions().size(), 6);
    }

    @Test
    @SuppressWarnings("unused")
    public void solveProblemWithCut() {
        ProvaKnowledgeBase kb = new ProvaKnowledgeBaseImpl();
        ProvaResultSet resultSet = new ProvaResultSetImpl();

        // Define goal (this should be part of the way solve is encoded by the parser)
        ProvaConstant c1 = ProvaConstantImpl.create(1);
        ProvaVariable x = ProvaVariableImpl.create("X");
        ProvaVariable y = ProvaVariableImpl.create("Y");
        ProvaVariable z = ProvaVariableImpl.create("Z");
        ProvaList l1 = ProvaListImpl.create(new ProvaObject[]{x, y, z});
        ProvaLiteral query = kb.generateLiteral("pred1", l1);
        // "solve" works by accepting pairs of variable (name,value) pairs
        ProvaConstant cx = ProvaConstantImpl.create("X");
        ProvaConstant cy = ProvaConstantImpl.create("Y");
        ProvaConstant cz = ProvaConstantImpl.create("Z");
        ProvaConstant cResultSet = ProvaConstantImpl.create(resultSet);
        ProvaList lx = ProvaListImpl.create(new ProvaObject[]{cx, x});
        ProvaList ly = ProvaListImpl.create(new ProvaObject[]{cy, y});
        ProvaList lz = ProvaListImpl.create(new ProvaObject[]{cz, z});
        ProvaList ls = ProvaListImpl.create(new ProvaObject[]{cResultSet, lx, ly, lz});
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
        ProvaVariable any1 = ProvaVariableImpl.create("_");
        ProvaList lany1 = ProvaListImpl.create(new ProvaObject[]{any1});
        ProvaLiteral litCut = kb.generateLiteral("cut", lany1);
        ProvaList l4a = ProvaListImpl.create(new ProvaObject[]{x1, z1, x1});
        ProvaLiteral lit4a = kb.generateLiteral("pred2", l4a);
        ProvaRule rule2 = kb.generateRule(lit3, new ProvaLiteral[]{lit4, litCut, lit4a});

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

        org.junit.Assert.assertEquals(resultSet.getSolutions().size(), 3);
    }

}
