package org.provarules.reference2.builtins.target;

import org.provarules.kernel2.ProvaGoal;
import org.provarules.kernel2.ProvaRule;

public class ProvaTargetImpl implements ProvaTarget {

    private ProvaGoal target;

    private ProvaRule candidate;

    private ProvaTargetImpl(ProvaGoal target) {
        this.target = target;
    }

    public static ProvaTarget create(ProvaGoal target) {
        return new ProvaTargetImpl(target);
    }

    @Override
    public ProvaGoal getTarget() {
        return target;
    }

    @Override
    public ProvaRule getCandidate() {
        return candidate;
    }

    @Override
    public void setCandidate(ProvaRule candidate) {
        this.candidate = candidate;
    }

}
