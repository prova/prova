package org.provarules.kernel2;

import org.provarules.kernel2.cache.ProvaCacheState;
import org.provarules.kernel2.cache.ProvaLocalAnswers;

import java.util.List;
import java.util.Map;

public interface ProvaLiteral extends ProvaObject {

    public ProvaPredicate getPredicate();

    public ProvaList getTerms();

    public ProvaLiteral rebuild(final ProvaUnification unification);

    public ProvaLiteral rebuildSource(final ProvaUnification unification);

    public void addClause(ProvaRule clause);

    public void addClauseA(ProvaRule clause);

    public void setGoal(ProvaGoal provaGoal);

    public ProvaCacheState getCacheState();

    public ProvaLocalAnswers getAnswers();

    public void markCompletion();

    public ProvaGoal getGoal();

    public String getSourceCode();

    public void setSourceCode(String string);

    public void setMetadata(String property, List<Object> value);

    public List<Object> getMetadata(String property);

    public List<ProvaObject> addMetadata(Map<String, List<Object>> m);

    public Map<String, List<Object>> getMetadata();

    public void setLine(int line);

    public int getLine();

    public List<ProvaLiteral> getGuard();

    public void setTerms(ProvaList newList);

    public void setGround(boolean ground);

    public ProvaLiteral cloneWithBoundVariables(ProvaUnification unification,
                                                List<ProvaVariable> variables, List<Boolean> isConstant);

}
