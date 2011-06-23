package ws.prova.kernel2.typing;

/**
 * Interface for an ontology model wrapper class. Implemented by ProvaCachedOntologyImpl.
 * @author martin
 *
 */
public interface ProvaOntology {

	/**
	 * Adds an RDF graph to the ontology model.
	 * @param URL Specifies an RDF graph.
	 */
	public void addOntology(String URL);

	
	/**
	 * 
	 * @param subURI A semantic URI.
	 * @param supURI Another semantic URI.
	 * @return false iff this class holds an ontology in which supURI is an OntClass of which subURI is not a member/subclass, else true. 
	 */
	public boolean isSupertype(String subURI, String supURI);
	
	
}