package ws.prova.kernel2.typing;

/**
 * Interface for types of ProvaConstants and ProvaVariables.
 * 
 * @author martin
 *
 */
public interface ProvaType {
	
	public boolean isSubtypeOf(ProvaType t);
	
	public boolean isSupertypeOf(ProvaType t);

	public boolean equals(ProvaType t);
}
