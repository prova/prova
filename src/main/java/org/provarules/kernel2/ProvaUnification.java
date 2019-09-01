package org.provarules.kernel2;

import java.util.List;

public interface ProvaUnification {

    boolean unify();

    ProvaRule getSource();

    ProvaRule getTarget();

    long getSourceRuleId();

    long getTargetRuleId();

    List<ProvaVariable> getSourceVariables();

    List<ProvaVariable> getTargetVariables();

    ProvaLiteral[] rebuildNewGoals();

    ProvaVariable getVariableFromVariablePtr(ProvaVariablePtr variablePtr);

    ProvaObject rebuild(ProvaVariablePtr variablePtr);

    ProvaLiteral[] rebuildOldGoals(ProvaLiteral[] body);

    ProvaObject rebuildSource(ProvaVariablePtr variablePtr);

    ProvaRule generateQuery(String symbol, ProvaKnowledgeBase kb, ProvaRule query,
                                   ProvaDerivationNode node);

    boolean targetUnchanged();

}
