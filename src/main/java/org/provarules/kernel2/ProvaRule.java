package org.provarules.kernel2;

import java.util.List;
import java.util.Map;

public interface ProvaRule {

    void collectVariables();

    List<ProvaVariable> getVariables();

    List<ProvaVariable> cloneVariables();

    ProvaLiteral getHead();

    ProvaLiteral[] getBody();

    long getRuleId();

    ProvaRule cloneRule();

    boolean advance();

    ProvaLiteral getTop();

    void setVariables(List<ProvaVariable> variables);

    void substituteVariables(ProvaVariablePtr[] varsMap);

    void setRuleId(long ruleId);

    int getOffset();

    void addBodyLiteral(ProvaLiteral literal);

    void replaceTopBodyLiteral(List<ProvaLiteral> newLiterals);

    ProvaRule cloneRule(boolean cloneVariables);

    void collectVariables(int offset);

    Object getFirstArg();

    void removeAt(int index);

    void setRemoved();

    boolean isRemoved();

    boolean isCut();

    String getSourceCode();

    void computeSourceCode();

    void setMetadata(String property, List<Object> value);

    List<Object> getMetadata(String property);

    void addMetadata(Map<String, List<Object>> m);

    Map<String, List<Object>> getMetadata();

    void setLine(int line);

    int getLine();

    ProvaLiteral[] getGuardedBody(ProvaLiteral sourceLiteral);

    void setSrc(List<Object> value);

    long getAbsRuleId();

}
