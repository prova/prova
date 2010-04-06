package ws.prova.kernel2;

public interface ProvaVariablePtr extends ProvaObject {

	public boolean unifyReverse(
			ProvaObject target,
			ProvaUnification unification);

	public long getRuleId();

	public int getIndex();

}
