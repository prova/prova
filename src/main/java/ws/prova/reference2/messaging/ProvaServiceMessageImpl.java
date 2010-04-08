package ws.prova.reference2.messaging;

import ws.prova.agent2.ProvaReagent;
import ws.prova.kernel2.ProvaList;
import ws.prova.reference2.ProvaConstantImpl;
import ws.prova.service.ProvaService;

public class ProvaServiceMessageImpl implements ProvaDelayedCommand {

	private String dest;
	
	private ProvaList terms;

	private ProvaService service;
	
	public ProvaServiceMessageImpl(String dest, ProvaList terms,
			String agent, ProvaService service) {
		this.dest = dest;
		this.terms = terms;
		this.terms.getFixed()[2] = ProvaConstantImpl.create(agent);
		this.service = service;
	}

	@Override
	public void process(ProvaReagent prova) {
		try {
			service.send(dest, terms);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
