package ws.prova.reference2.cache;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import ws.prova.kernel2.ProvaList;
import ws.prova.kernel2.cache.ProvaLocalAnswers;
import ws.prova.reference2.cache.ProvaCacheStateImpl.ProvaCacheAnswerKey;

public class ProvaLocalAnswersImpl implements ProvaLocalAnswers {

	private Map<ProvaCacheAnswerKey,ProvaList> answers;
	
	public ProvaLocalAnswersImpl() {
		this.answers = new HashMap<ProvaCacheAnswerKey,ProvaList>();
	}

	@Override
	public boolean addSolution(ProvaCacheAnswerKey key, ProvaList terms) {
		ProvaList oldAnswer = answers.get(key);
		if( oldAnswer!=null )
			return false;
		answers.put(key, terms);
		return true;
	}

	@Override
	public Collection<ProvaList> getSolutions() {
		return answers.values();
	}

}
