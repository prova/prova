package org.provarules.kernel2;

public interface ProvaVariablePtr extends ProvaObject {

    boolean unifyReverse(
            ProvaObject target,
            ProvaUnification unification);

    long getRuleId();

    int getIndex();

}
