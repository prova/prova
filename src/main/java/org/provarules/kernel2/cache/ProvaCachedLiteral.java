package org.provarules.kernel2.cache;

import org.provarules.kernel2.ProvaGoal;
import org.provarules.kernel2.ProvaLiteral;

public interface ProvaCachedLiteral extends ProvaLiteral {

    void setGoal(ProvaGoal provaGoal);

    ProvaCacheState getCacheState();

    ProvaLocalAnswers getAnswers();

    ProvaGoal getGoal();

}
