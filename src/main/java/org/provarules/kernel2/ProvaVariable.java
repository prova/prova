package org.provarules.kernel2;

public interface ProvaVariable extends ProvaObject, ProvaComputable {

    Object getName();

    Class<?> getType();

    void setAssigned(ProvaObject assigned);

    String uniqueName();

    int getIndex();

    ProvaVariable clone();

    ProvaObject getAssigned();

    void setRuleId(long ruleId);

    long getRuleId();

    void setIndex(int size);

    ProvaVariable clone(long ruleId);

}
