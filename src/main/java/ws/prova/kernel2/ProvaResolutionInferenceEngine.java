package ws.prova.kernel2;

import ws.prova.agent2.ProvaReagent;

public interface ProvaResolutionInferenceEngine {

	public ProvaDerivationNode run();

	public void setReagent(ProvaReagent prova);

}
