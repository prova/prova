package ws.prova.reference2.typing;

import java.util.HashMap;

import ws.prova.kernel2.typing.ProvaOntology;

import com.hp.hpl.jena.ontology.OntClass;
import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;

public class ProvaCachedOntologyImpl implements ProvaOntology {
	
	OntModel ontModel;
	final String languageURI;
	final HashMap<String,Boolean> cache;
	
	public ProvaCachedOntologyImpl(String languageURI)
	{
		this.languageURI=languageURI;
		this.cache=new HashMap<String, Boolean>();
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
	
	
	public final boolean isSubtype(String subURI, String supURI)
	{
		if(subURI.equals(supURI))
			return true;
		
		String hashString = subURI+' '+supURI;
		Boolean r = cache.get(hashString);
		if(r==null)
		{
			r=isSubtypeNoCaching(subURI,supURI);
			cache.put(hashString, r);
		}
		return r;		
	}
	
	private final boolean isSubtypeNoCaching(String subURI, String supURI)
	{
		if(ontModel!=null)
		{
			// if we have an ontology loaded, we use the URIs to 
			// retrieve the classes and check if they are compatible:
			OntClass subOntClass=ontModel.getOntClass(ontModel.expandPrefix(subURI)), 
			         supOntClass=ontModel.getOntClass(ontModel.expandPrefix(supURI));
		
			if(supOntClass!=null&&(subOntClass==null||!subOntClass.hasSubClass(supOntClass)))
				return false;
		}
		return true;
	}
}
