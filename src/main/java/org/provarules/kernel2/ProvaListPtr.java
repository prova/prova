package org.provarules.kernel2;

public interface ProvaListPtr extends ProvaObject {

    ProvaObject rebuild(ProvaUnification unification);

    ProvaList getAssigned();

    ProvaList getAssignedWithOffset();

    int getOffset();

    ProvaObject rebuildSource(ProvaUnification unification);

}
