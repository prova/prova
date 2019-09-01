package org.provarules.reference2.messaging;

import org.provarules.kernel2.ProvaList;
import org.provarules.kernel2.ProvaPredicate;

public class RemoveList {

    // Predicate for reaction rule
    private ProvaPredicate p1;

    private ProvaPredicate p2;

    private long ruleid;

    private ProvaList reaction;

    private boolean not;

    private boolean optional;

    public RemoveList(ProvaPredicate p1, ProvaPredicate p2, long ruleid, ProvaList reaction) {
        this.p1 = p1;
        this.p2 = p2;
        this.ruleid = ruleid;
        this.reaction = reaction;
        this.not = false;
    }

    public ProvaPredicate getP1() {
        return p1;
    }

    public ProvaPredicate getP2() {
        return p2;
    }

    public long getRuleid() {
        return ruleid;
    }

    public ProvaList getReaction() {
        return reaction;
    }

    public void setReaction(ProvaList reaction) {
        this.reaction = reaction;
    }

    public void setNot(boolean not) {
        this.not = not;
    }

    public boolean isNot() {
        return this.not;
    }

    public void setOptional(boolean optional) {
        this.optional = optional;
    }

    public boolean isOptional() {
        return this.optional;
    }

}

