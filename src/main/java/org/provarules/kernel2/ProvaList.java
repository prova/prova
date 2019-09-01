package org.provarules.kernel2;

import java.util.List;

public interface ProvaList extends ProvaObject {

    int computeSize(int offset);

    ProvaList rebuild(ProvaUnification unification);

    ProvaObject[] getFixed();

    ProvaObject getTail();

    ProvaObject rebuild(ProvaUnification unification, int offset);

    boolean unify(int offset, ProvaObject target,
                         ProvaUnification unification);

    ProvaList rebuildSource(ProvaUnification unification);

    ProvaObject rebuildSource(ProvaUnification unification, int offset);

    boolean isGround();

    String performative();

    ProvaList shallowCopy();

    ProvaObject cloneWithVariables(List<ProvaVariable> variables, int offset);

    ProvaList copyWithVariables(List<ProvaVariable> variables);

    ProvaObject cloneWithBoundVariables(List<ProvaVariable> variables, List<Boolean> changed);

    ProvaList copyWithBoundVariables(List<ProvaVariable> variables, List<Boolean> changed);

    void setGround(boolean ground);

}
