package org.provarules.reference2.messaging;

import org.provarules.agent2.ProvaReagent;
import org.provarules.esb2.ProvaAgent;
import org.provarules.kernel2.ProvaList;
import org.provarules.reference2.ProvaConstantImpl;

public class ProvaESBMessageImpl implements ProvaDelayedCommand {

    private String dest;

    private ProvaList terms;

    private ProvaAgent esb;

    public ProvaESBMessageImpl(String dest, ProvaList terms,
                               ProvaAgent esb) {
        this.dest = dest;
        this.terms = terms;
        this.terms.getFixed()[2] = ProvaConstantImpl.create(esb.getAgentName());
        this.esb = esb;
    }

    @Override
    public void process(ProvaReagent prova) {
        try {
            esb.send(dest, terms);
        } catch (Exception e) {
            // TODO Throw a ProvaException
            throw new RuntimeException(e);
        }
    }

}
