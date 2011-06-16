package ws.prova.reference2.typing;

import ws.prova.kernel2.ProvaKnowledgeBase;
import ws.prova.kernel2.typing.ProvaType;

public class ProvaOWLType extends ProvaTypeBase {

	protected final String URI;
	
	private final ProvaKnowledgeBase kb;
	
	public ProvaOWLType(ProvaKnowledgeBase kb, String URI)
	{
		this.URI=URI;
		this.kb=kb;
	}
		
	@Override
	public boolean isSubtypeOf(final ProvaType t) {		
		if(t instanceof ProvaOWLType)
			return this.URI.equals(((ProvaOWLType) t).URI) || kb.getOntology().isSubtype(this.URI, ((ProvaOWLType)t).URI);
		else
			return true; // I am subtype of typeless
	}
	
	public String toString()
	{
		return URI;
	}
}
