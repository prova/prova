package ws.prova.kernel2;

public interface ProvaVariable extends ProvaObject, ProvaComputable {

	public Object getName();

	public Class<?> getType();
	
	public String getSemanticEntity();

	public void setAssigned(ProvaObject assigned);

	public String uniqueName();

	public int getIndex();

	public ProvaVariable clone();

	public ProvaObject getAssigned();

	public void setRuleId(long ruleId);

	public long getRuleId();

	public void setIndex(int size);

	public ProvaVariable clone(long ruleId);
	
	public boolean isSubtypeOf(ProvaVariable target, ProvaUnification unification);
}
