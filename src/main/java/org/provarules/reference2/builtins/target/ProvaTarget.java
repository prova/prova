package org.provarules.reference2.builtins.target;

import org.provarules.kernel2.ProvaGoal;
import org.provarules.kernel2.ProvaRule;

public interface ProvaTarget {

    ProvaGoal getTarget();

    ProvaRule getCandidate();

    void setCandidate(ProvaRule candidate);

}
