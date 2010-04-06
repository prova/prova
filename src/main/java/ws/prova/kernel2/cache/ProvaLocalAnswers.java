package ws.prova.kernel2.cache;

import java.util.Collection;

import ws.prova.kernel2.ProvaList;
import ws.prova.reference2.cache.ProvaCacheStateImpl.ProvaCacheAnswerKey;

public interface ProvaLocalAnswers {

	public boolean addSolution(ProvaCacheAnswerKey key, ProvaList terms);

	public Collection<ProvaList> getSolutions();

}
