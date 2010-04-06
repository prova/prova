package ws.prova.reference2.messaging;

import ws.prova.agent2.ProvaReagent;
import ws.prova.esb2.ProvaAgent;
import ws.prova.kernel2.ProvaList;
import ws.prova.reference2.ProvaConstantImpl;

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
