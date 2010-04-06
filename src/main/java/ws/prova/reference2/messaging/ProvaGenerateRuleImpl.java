package ws.prova.reference2.messaging;

import ws.prova.agent2.ProvaReagent;
import ws.prova.kernel2.ProvaKnowledgeBase;
import ws.prova.kernel2.ProvaLiteral;

public class ProvaGenerateRuleImpl implements ProvaDelayedCommand {

	private ProvaKnowledgeBase kb;
	
	private ProvaLiteral headControl;

	private ProvaLiteral[] provaLiterals;
	
	public ProvaGenerateRuleImpl(ProvaKnowledgeBase kb, ProvaLiteral headControl,
			ProvaLiteral[] provaLiterals) {
		this.kb = kb;
		this.headControl = headControl;
		this.provaLiterals = provaLiterals;
	}

	@Override
	public synchronized void process(ProvaReagent prova) {
		kb.generateRule(headControl, provaLiterals);
	}

}
