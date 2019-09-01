package org.provarules.kernel2;

import org.provarules.agent2.ProvaReagent;

public interface ProvaResolutionInferenceEngine {

    ProvaDerivationNode run();

    void setReagent(ProvaReagent prova);

}
