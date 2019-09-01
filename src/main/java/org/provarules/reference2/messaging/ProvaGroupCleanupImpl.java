package org.provarules.reference2.messaging;

import org.provarules.agent2.ProvaReagent;

public class ProvaGroupCleanupImpl implements ProvaDelayedCommand {

    private String group;

    ProvaGroupCleanupImpl(String group) {
        this.group = group;
    }

    @Override
    public void process(ProvaReagent prova) {
        prova.getMessenger().cleanupGroup(group);

    }

}
