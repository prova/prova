package org.provarules.kernel2;

public interface ProvaDerivationNode {

    byte UNKNOWN = 0;
    byte FAILED = 1;
    byte SUCCESS = 2;
    byte IRRELEVANT = 3;

    void setFailed(boolean b);

    void setQuery(ProvaRule goalRule);

    void setId(int next);

    void setCut(boolean b);

    ProvaRule getQuery();

    boolean isCut();

    void setCutPredicate(int intValue);

    void setCurrentGoal(ProvaGoal goal);

    int getCutPredicate();

    int getId();

    void setParent(ProvaDerivationNode n);

    ProvaDerivationNode getParent();

    ProvaGoal getCurrentGoal();

}
