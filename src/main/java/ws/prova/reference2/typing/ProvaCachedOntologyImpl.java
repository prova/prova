package ws.prova.reference2.typing;

import java.util.HashMap;

import org.apache.log4j.Logger;

import ws.prova.kernel2.typing.ProvaOntology;

import com.hp.hpl.jena.ontology.OntClass;
import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;

public class ProvaCachedOntologyImpl implements ProvaOntology {
	
	OntModel ontModel;
	final String languageURI;
	final HashMap<String,Boolean> subTypeCache;
	//final HashMap<String,Boolean> hasTypeCache;
	
	private final static Logger log = Logger.getLogger("prova");
	
	public ProvaCachedOntologyImpl(String languageURI)
	{
		this.languageURI=languageURI;
		this.subTypeCache=new HashMap<String, Boolean>();
		//this.hasTypeCache=new HashMap<String, Boolean>();
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
	
	/*
	public final boolean hasType(String entitiyURI, String classURI)
	{
		String hashString = entityURI+' '+classURI;
		Boolean r = hasTypeCache.get(hashString);
		if(r==null)
		{
			r=hasTypeNoCaching(entitiyURI,classURI);
			hasTypeCache.put(hashString, r);
		}
		return r;
		
	}
	
	private final boolean hasTypeNoCaching(String entityURI, classURI)*/
	
	
	public final boolean isSubtype(String subURI, String supURI)
	{
		if(subURI.equals(supURI))
			return true;
		
		String hashString = subURI+' '+supURI;
		Boolean r = subTypeCache.get(hashString);
		if(r==null)
		{
			r=isSubtypeNoCaching(subURI,supURI);
			subTypeCache.put(hashString, r);
		}
		return r;		
	}
	
	private final boolean isSubtypeNoCaching(String subURI, String supURI)
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
			
			OntClass subOntClass=ontModel.getOntClass(ontModel.expandPrefix(subURI));
			if(subOntClass==null)
			{
				log.warn("Couldn't resolve "+subURI+", assuming typeless.");
				return false;
			}
			
			return subOntClass.hasSuperClass(supOntClass);
	}
}
