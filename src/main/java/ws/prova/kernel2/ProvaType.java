package ws.prova.kernel2;

public interface ProvaType {
	public boolean isSubtypeOf(ProvaType t);
	public boolean isSupertypeOf(ProvaType t);
	public boolean equals(ProvaType t);
}
