package ws.prova.reference2.messaging;

import java.util.List;
import java.util.Map;

import ws.prova.agent2.ProvaReagent;
import ws.prova.kernel2.ProvaObject;
import ws.prova.kernel2.ProvaPredicate;
import ws.prova.reference2.eventing.ProvaGroup;

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
			Map<String, List<Object>> metadata ) {
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
		prova.getMessenger().scheduleCleanup(xid,group,p1,p2,ruleid,delay,period,metadata);
	}

}
