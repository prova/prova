package ws.prova.reference2.typing;

import java.util.HashMap;

import org.apache.log4j.Logger;

import ws.prova.kernel2.typing.ProvaOntology;

import com.hp.hpl.jena.ontology.Individual;
import com.hp.hpl.jena.ontology.OntClass;
import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.ontology.OntResource;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;

/**
 * A ProvaOntology which caches all requests.
 * For documentation see ProvaOntology.
 * @author martin
 * @see ProvaOntology
 *
 */
public class ProvaCachedOntologyImpl implements ProvaOntology {
	
	OntModel ontModel;
	final String languageURI;
	final HashMap<String,Boolean> superTypeCache;
	
	private final static Logger log = Logger.getLogger("prova");
	
	public ProvaCachedOntologyImpl(String languageURI)
	{
		this.languageURI=languageURI;
		this.superTypeCache=new HashMap<String, Boolean>();
	}
	
	public void addOntology(String ontologyURL)
	{
		if(ontModel==null)
			ontModel=ModelFactory.createOntologyModel(languageURI);
		Model tmpModel = ModelFactory.createDefaultModel(); //TODO: maybe this needs to be an OntModel...
		tmpModel.read(ontologyURL);
		ontModel.add(tmpModel);
//		ontModel.write(System.out);
		// [alex] Prefixes from tmpModel are lost in ontModel after using add() above unless explicitly copied -- do not know why
		ontModel.setNsPrefixes(tmpModel.getNsPrefixMap());
	}
	
	public final boolean isSupertype(String supURI, String subURI)
	{
		if(supURI.equals(subURI))
			return true;
		
		String hashString = supURI+' '+subURI;
		Boolean r = superTypeCache.get(hashString);
		if(r==null)
		{
			r=isSupertypeNoCaching(supURI,subURI);
			if(r)
				superTypeCache.put(hashString, r);
		}
		return r;		
	}
	
	private final boolean isSupertypeNoCaching(String supURI, String subURI)
	{
			if(ontModel==null)
			{
				log.warn("No ontology model loaded, assuming typeless.");
				return true;
			}
			
			OntClass supOntClass=ontModel.getOntClass(ontModel.expandPrefix(supURI));
			if(supOntClass==null)
			{
				log.warn("Couldn't resolve "+supURI+", assuming typeless.");
				return true;
			}
			
			// For constants the subURI is allowed to be a non-class individual.
			OntResource subOntResource = ontModel.getOntResource(ontModel.expandPrefix(subURI));
			
			if(subOntResource==null)
			{
				
				log.warn("Couldn't resolve "+subURI+", assuming typeless.");
				return false;
			}
			
			if(subOntResource.isClass())
				return subOntResource.asClass().hasSuperClass(supOntClass);

			// Non-class individual: check for class membership.
			else if(subOntResource.isIndividual())
				return subOntResource.asIndividual().hasOntClass(supOntClass);
			
			else
			{
				log.warn(subURI + " is neither class nor individual!? Assuming typeless.");
				return false;
			}
	}
}
