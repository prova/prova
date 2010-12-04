package ws.prova.reference2.messaging;

import java.util.Map;

import ws.prova.agent2.ProvaReagent;
import ws.prova.kernel2.ProvaConstant;
import ws.prova.kernel2.ProvaList;
import ws.prova.reference2.ProvaConstantImpl;
import ws.prova.reference2.ProvaMapImpl;
import ws.prova.service.ProvaMiniService;

public class ProvaServiceMessageImpl implements ProvaDelayedCommand {

	private String dest;
	
	private ProvaMiniService service;

	private String xid;

	private Object payload;

	private String agent;

	private String verb;
	
	public ProvaServiceMessageImpl(String dest, ProvaList terms,
			String agent, ProvaMiniService service2) {
		this.xid = terms.getFixed()[0].toString();
		this.dest = dest;
		this.agent = agent;
		this.verb = terms.getFixed()[3].toString();
		this.service = service2;
		this.payload = terms.getFixed()[4];
		if( this.payload instanceof ProvaMapImpl )
			this.payload = ((ProvaMapImpl) payload).unwrap();
		else if( this.payload.getClass()==ProvaConstantImpl.class && ((ProvaConstant) this.payload).getObject() instanceof Map) 
			this.payload = ((ProvaConstant) this.payload).getObject();
	}

	@Override
	public void process(ProvaReagent prova) {
		try {
			service.send(xid, dest, agent, verb, payload);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
