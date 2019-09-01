package org.provarules.reference2.messaging;

import org.provarules.agent2.ProvaReagent;
import org.provarules.kernel2.ProvaObject;
import org.provarules.kernel2.ProvaPredicate;
import org.provarules.reference2.eventing.ProvaGroup;

import java.util.List;
import java.util.Map;

public class ProvaScheduleGroupMemberCleanupImpl implements ProvaDelayedCommand {

    private ProvaObject xid;

    private ProvaGroup group;

    private ProvaPredicate p1;

    private ProvaPredicate p2;

    private long ruleid;

    private long delay;

    private Map<String, List<Object>> metadata;

    private long period;

    public ProvaScheduleGroupMemberCleanupImpl(
            final ProvaPredicate p1,
            final ProvaPredicate p2,
            final long ruleid,
            long delay,
            Map<String, List<Object>> metadata) {
        this.xid = null;
        this.group = null;
        this.p1 = p1;
        this.p2 = p2;
        this.ruleid = ruleid;
        this.delay = delay;
        this.metadata = metadata;
        this.period = 0;
    }

    public ProvaScheduleGroupMemberCleanupImpl(
            ProvaObject xid, ProvaGroup group, ProvaPredicate p1,
            ProvaPredicate p2, long ruleid, long delay, long period,
            Map<String, List<Object>> metadata) {
        this.xid = xid;
        this.group = group;
        this.p1 = p1;
        this.p2 = p2;
        this.ruleid = ruleid;
        this.delay = delay;
        this.metadata = metadata;
        this.period = period;
    }

    @Override
    public void process(ProvaReagent prova) {
        prova.getMessenger().scheduleCleanup(xid, group, p1, p2, ruleid, delay, period, metadata);
    }

}
