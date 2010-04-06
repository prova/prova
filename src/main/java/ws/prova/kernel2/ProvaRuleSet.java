package ws.prova.kernel2;

import java.util.List;

import ws.prova.reference2.ProvaRuleImpl;

public interface ProvaRuleSet {

	public void add(ProvaRule clause);

	public void addA(ProvaRule clause);

	public Object size();

	public String getSymbol();

	public int getArity();

	public void addAll(ProvaRuleSet ruleSet);

	public List<ProvaRule> getClauses();

	public List<ProvaRule> getClauses(Object key);

	public void removeClauses(Object key);

	public boolean removeClauses(Object key, int offset);

	public boolean removeClausesByMatch(ProvaKnowledgeBase kb, ProvaObject[] data);

	public boolean removeAllClausesByMatch(ProvaKnowledgeBase kb,
			ProvaObject[] data);

	public void addRuleToSrc(ProvaRuleImpl rule, String src);

	public void removeClausesBySrc(String src);

	public ProvaUnification nextMatch(ProvaKnowledgeBase kb, ProvaGoal goal);

}
