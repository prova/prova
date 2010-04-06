package ws.prova.kernel2;

public interface ProvaDerivationNode {

    public final static byte UNKNOWN    = 0;
    public final static byte FAILED     = 1;
    public final static byte SUCCESS    = 2;
    public final static byte IRRELEVANT = 3;

    public void setFailed(boolean b);

	public void setQuery(ProvaRule goalRule);

	public void setId(int next);

	public void setCut(boolean b);

	public ProvaRule getQuery();

	public boolean isCut();

	public void setCutPredicate(int intValue);

	public void setCurrentGoal(ProvaGoal goal);

	public int getCutPredicate();

	public int getId();

	public void setParent(ProvaDerivationNode n);

	public ProvaDerivationNode getParent();

	public ProvaGoal getCurrentGoal();

}
