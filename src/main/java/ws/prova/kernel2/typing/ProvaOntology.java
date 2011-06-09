package ws.prova.kernel2.typing;

/**
 * Interface for an ontology model wrapper class. Implemented by ProvaCachedOntologyImpl.
 * @author martin
 *
 */
public interface ProvaOntology {

	/**
	 * 
	 * @param entitiyURI
	 * @param classURI
	 * @return false iff this class holds an ontology in which classURI is an OntClass which does not contain classURI, else true. 
	 *
	public boolean hasType(String entitiyURI, String classURI);
	*/

	/**
	 * 
	 * @param subURI A semantic URI.
	 * @param supURI Another semantic URI.
	 * @return false iff this class holds an ontology in which supURI is an OntClass of which subURI is not a subclass, else true. 
	 */
	public boolean isSubtype(String subURI, String supURI);
	
	
	/**
	 * Adds an RDF graph to the ontology model.
	 * @param URL Specifies an RDF graph.
	 */
	public void addOntology(String URL);

}