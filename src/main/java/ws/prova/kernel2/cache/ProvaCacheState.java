package ws.prova.kernel2.cache;

import java.util.Collection;
import java.util.List;

import ws.prova.kernel2.ProvaGoal;
import ws.prova.kernel2.ProvaList;
import ws.prova.kernel2.ProvaVariable;
import ws.prova.reference2.cache.ProvaCacheStateImpl.ProvaCacheAnswerKey;

public interface ProvaCacheState {

	public Collection<ProvaList> getSolutions();

	public void setOpen(boolean open);

	public boolean isOpen();

	public boolean isComplete();

	public ProvaGoal getGoal();

	public ProvaCacheAnswerKey getCacheAnswerKey(ProvaList literalList,
			List<ProvaVariable> variables);

	boolean addSolution(ProvaCacheAnswerKey key, ProvaList literalList);

	public List<ProvaGoal> getGoals();

	public void addGoal(ProvaGoal goal);

	public void markCompletion();

}
