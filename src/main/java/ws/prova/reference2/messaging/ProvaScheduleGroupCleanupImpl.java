package ws.prova.reference2.messaging;

import ws.prova.agent2.ProvaReagent;
import ws.prova.reference2.eventing.ProvaGroup;

public class ProvaScheduleGroupCleanupImpl implements ProvaDelayedCommand {

	private ProvaGroup dynamic;

	private long delay;
	
	public ProvaScheduleGroupCleanupImpl(ProvaGroup dynamic, long delay) {
		this.dynamic = dynamic;
		this.delay = delay;
	}

	@Override
	public void process(ProvaReagent prova) {
		prova.getMessenger().scheduleCleanup(dynamic,delay);
	}

}
