package ws.prova.plugin.registry.impl;

import java.util.List;

import ws.prova.agent2.ProvaReagent;
import ws.prova.kernel2.ProvaDerivationNode;
import ws.prova.kernel2.ProvaGoal;
import ws.prova.kernel2.ProvaLiteral;
import ws.prova.kernel2.ProvaRule;
import ws.prova.plugin.ProvaPredicatePlugin;
import ws.prova.reference2.builtins.ProvaBuiltinImpl;

public class ProvaPredicatePluginAdapterImpl extends ProvaBuiltinImpl {

	private final ProvaPredicatePlugin plugin;
	
	public ProvaPredicatePluginAdapterImpl(ProvaPredicatePlugin ppp) {
		super(null, ppp.getPredicateName());
		plugin = ppp;
	}
	
	@Override
	public boolean process(ProvaReagent prova, ProvaDerivationNode node,
			ProvaGoal goal, List<ProvaLiteral> newLiterals, ProvaRule query) {
		return plugin.process(goal, newLiterals, query);
	}
}
