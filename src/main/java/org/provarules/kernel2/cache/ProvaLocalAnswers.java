package org.provarules.kernel2.cache;

import org.provarules.kernel2.ProvaList;
import org.provarules.reference2.cache.ProvaCacheStateImpl;

import java.util.Collection;

public interface ProvaLocalAnswers {

    boolean addSolution(ProvaCacheStateImpl.ProvaCacheAnswerKey key, ProvaList terms);

    Collection<ProvaList> getSolutions();

}
