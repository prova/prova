package org.provarules.reference2.cache;

import org.provarules.kernel2.ProvaList;
import org.provarules.kernel2.cache.ProvaLocalAnswers;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ProvaLocalAnswersImpl implements ProvaLocalAnswers {

    private Map<ProvaCacheStateImpl.ProvaCacheAnswerKey, ProvaList> answers;

    public ProvaLocalAnswersImpl() {
        this.answers = new HashMap<>();
    }

    @Override
    public boolean addSolution(ProvaCacheStateImpl.ProvaCacheAnswerKey key, ProvaList terms) {
        ProvaList oldAnswer = answers.get(key);
        if (oldAnswer != null)
            return false;
        answers.put(key, terms);
        return true;
    }

    @Override
    public Collection<ProvaList> getSolutions() {
        return answers.values();
    }

}
