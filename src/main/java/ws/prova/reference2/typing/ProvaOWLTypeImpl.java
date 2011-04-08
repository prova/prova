package ws.prova.reference2.typing;

import com.hp.hpl.jena.ontology.OntClass;
import com.hp.hpl.jena.ontology.OntModel;

import ws.prova.kernel2.ProvaKnowledgeBase;
import ws.prova.kernel2.ProvaType;

public class ProvaOWLTypeImpl extends ProvaTypeBase {

	private final String URI;
	
	public final ProvaKnowledgeBase kb;
	
	public ProvaOWLTypeImpl(ProvaKnowledgeBase kb, String URI)
	{
		this.URI=URI;
		this.kb=kb;
	}
	
	public final String getURI()
	{
		return this.URI;
	}
	
	@Override
	public boolean isSubtypeOf(final ProvaType t) {		
		if(t instanceof ProvaOWLTypeImpl)
		{
			final String targetURI=((ProvaOWLTypeImpl)t).getURI();
			if(targetURI==URI)
				return true;
			final OntModel m = kb.getOntologyModel();
			if(m!=null)
			{
				// if we have an ontology loaded, we use the URIs to 
				// retrieve the classes and check if they are compatible:
				OntClass thisOntClass=m.getOntClass(m.expandPrefix((targetURI))), 
				targetOntClass=m.getOntClass(m.expandPrefix(this.URI));
			
				if(targetOntClass!=null&&(thisOntClass==null||!thisOntClass.hasSubClass(targetOntClass)))
					return false;
			}
		}
		return true; // I am subtype of typeless
	}
	
	public String toString()
	{
		return URI;
	}
}
