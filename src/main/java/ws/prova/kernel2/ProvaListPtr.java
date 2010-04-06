package ws.prova.kernel2;

public interface ProvaListPtr extends ProvaObject {

	public ProvaObject rebuild(ProvaUnification unification);

	public ProvaList getAssigned();

	public ProvaList getAssignedWithOffset();

	public int getOffset();

	public ProvaObject rebuildSource(ProvaUnification unification);

}
