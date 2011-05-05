package ws.prova.kernel2.typing;

/**
 * Interface for an ontology model wrapper class. Implemented by ProvaCachedOntologyImpl.
 * @author martin
 *
 */
public interface ProvaOntology {
	/**
	 * 
	 * @param subURI A semantic URI.
	 * @param supURI Another semantic URI.
	 * @return false iff this class holds an ontology and subURI has a type which is not subtype of supURI, else true. 
	 */
	public boolean isSubtype(String subURI, String supURI);
	
	/**
	 * Adds an RDF graph to the ontology model.
	 * @param URL Specifies an RDF graph.
	 */
	public void addOntology(String URL);
}