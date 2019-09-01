package org.provarules.kernel2.cache;

import org.provarules.kernel2.ProvaGoal;
import org.provarules.kernel2.ProvaList;
import org.provarules.kernel2.ProvaVariable;
import org.provarules.reference2.cache.ProvaCacheStateImpl;

import java.util.Collection;
import java.util.List;

public interface ProvaCacheState {

    Collection<ProvaList> getSolutions();

    void setOpen(boolean open);

    boolean isOpen();

    boolean isComplete();

    ProvaGoal getGoal();

    ProvaCacheStateImpl.ProvaCacheAnswerKey getCacheAnswerKey(ProvaList literalList,
                                                                     List<ProvaVariable> variables);

    boolean addSolution(ProvaCacheStateImpl.ProvaCacheAnswerKey key, ProvaList literalList);

    List<ProvaGoal> getGoals();

    void addGoal(ProvaGoal goal);

    void markCompletion();

}
