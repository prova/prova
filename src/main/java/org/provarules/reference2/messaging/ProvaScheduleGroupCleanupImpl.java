package org.provarules.reference2.messaging;

import org.provarules.agent2.ProvaReagent;
import org.provarules.reference2.eventing.ProvaGroup;

public class ProvaScheduleGroupCleanupImpl implements ProvaDelayedCommand {

    private ProvaGroup dynamic;

    private long delay;

    public ProvaScheduleGroupCleanupImpl(ProvaGroup dynamic, long delay) {
        this.dynamic = dynamic;
        this.delay = delay;
    }

    @Override
    public void process(ProvaReagent prova) {
        prova.getMessenger().scheduleCleanup(dynamic, delay);
    }

}
