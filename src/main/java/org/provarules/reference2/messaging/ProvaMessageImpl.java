package org.provarules.reference2.messaging;

import org.provarules.agent2.ProvaReagent;
import org.provarules.agent2.ProvaThreadpoolEnum;
import org.provarules.kernel2.ProvaRule;

public class ProvaMessageImpl implements ProvaDelayedCommand {

    private long id;

    private ProvaRule goal;

    private ProvaThreadpoolEnum pool;

    public ProvaMessageImpl(long id, ProvaRule goal,
                            ProvaThreadpoolEnum pool) {
        this.id = id;
        this.goal = goal;
        this.pool = pool;
    }

    @Override
    public void process(ProvaReagent prova) {
        prova.submitAsync(id, goal, pool);
//		System.out.println("sent:"+goal);
    }

}
