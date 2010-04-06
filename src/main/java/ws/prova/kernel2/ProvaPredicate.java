package ws.prova.kernel2;

public interface ProvaPredicate {

	public String getSymbol();

	public int getArity();

	public void addClause(ProvaRule clause);

	public void addClauseA(ProvaRule clause);

	public boolean equals(ProvaPredicate predicate);

	public void setKnowledgeBase(ProvaKnowledgeBase provaKnowledgeBaseImpl);

	ProvaRuleSet getClauseSet();

	public ProvaKnowledgeBase getKnowledgeBase();

}
