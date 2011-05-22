package ws.prova.reference2.typing;

import ws.prova.kernel2.ProvaKnowledgeBase;
import ws.prova.kernel2.typing.ProvaType;

public class ProvaOWLTypeImpl extends ProvaTypeBase {

	private final String URI;
	
	private final ProvaKnowledgeBase kb;
	
	public ProvaOWLTypeImpl(ProvaKnowledgeBase kb, String URI)
	{
		this.URI=URI;
		this.kb=kb;
	}
		
	@Override
	public boolean isSubtypeOf(final ProvaType t) {		
		if(t instanceof ProvaOWLTypeImpl)
			return this.URI.equals(((ProvaOWLTypeImpl) t).URI) || kb.getOntology().isSubtype(this.URI, ((ProvaOWLTypeImpl)t).URI);
		else
			return true; // I am subtype of typeless
	}
	
	public String toString()
	{
		return URI;
	}
}
