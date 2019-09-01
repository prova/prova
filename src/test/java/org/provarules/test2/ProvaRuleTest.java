package org.provarules.test2;

import org.junit.Test;
import org.provarules.kernel2.*;
import org.provarules.reference2.*;

public class ProvaRuleTest {

    @Test
    public void countVariablesInRule() {
        ProvaKnowledgeBase kb = new ProvaKnowledgeBaseImpl();

        ProvaVariable v1 = ProvaVariableImpl.create("v1");
        ProvaVariable v2 = ProvaVariableImpl.create("v2");
        ProvaVariable v3 = ProvaVariableImpl.create("v3");
        ProvaVariable v4 = ProvaVariableImpl.create("v4");
        ProvaList l1 = ProvaListImpl.create(new ProvaObject[]{v2}, v3);
        ProvaList l2 = ProvaListImpl.create(new ProvaObject[]{v1, l1, v4});

        ProvaLiteral lit1 = kb.generateLiteral("pred1", l2);
        ProvaRule r1 = kb.generateRule(lit1, new ProvaLiteral[]{});

        org.junit.Assert.assertEquals(r1.getVariables().size(), 4);
    }

    @Test
    public void countDuplicateVariablesInRule() {
        ProvaKnowledgeBase kb = new ProvaKnowledgeBaseImpl();

        ProvaVariable v1 = ProvaVariableImpl.create("v1");
        ProvaVariable v2 = ProvaVariableImpl.create("v2");
        ProvaVariable v3 = ProvaVariableImpl.create("v3");
        ProvaConstant c1 = ProvaConstantImpl.create(12);
        ProvaVariable v4 = ProvaVariableImpl.create("v4");
        ProvaList l1 = ProvaListImpl.create(new ProvaObject[]{v2, c1}, v3);
        ProvaList l2 = ProvaListImpl.create(new ProvaObject[]{v1, l1, v2, v4});

        ProvaLiteral lit1 = kb.generateLiteral("pred1", l2);
        ProvaRule r1 = kb.generateRule(lit1, new ProvaLiteral[]{});

        org.junit.Assert.assertEquals(r1.getVariables().size(), 4);
    }

    @Test
    public void countVariablesInRuleWithListAssigns() {
        ProvaKnowledgeBase kb = new ProvaKnowledgeBaseImpl();

        ProvaVariable v1 = ProvaVariableImpl.create("v1");
        ProvaVariable v2 = ProvaVariableImpl.create("v2");
        ProvaVariable v3 = ProvaVariableImpl.create("v3");
        ProvaVariable v4 = ProvaVariableImpl.create("v4");
        ProvaList l1 = ProvaListImpl.create(new ProvaObject[]{v2}, v3);
        ProvaList l2 = ProvaListImpl.create(new ProvaObject[]{v1, l1, v4});

        ProvaLiteral lit1 = kb.generateLiteral("pred1", l2);
        ProvaRule r1 = kb.generateRule(lit1, new ProvaLiteral[]{});

        ProvaList l3 = ProvaListImpl.create(new ProvaObject[]{v1, v2});
        v3.setAssigned(new ProvaListPtrImpl(l3, 1));

        org.junit.Assert.assertEquals(r1.getVariables().size(), 4);
    }

}
