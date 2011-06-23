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
	public boolean isSupertypeOf(final ProvaType t) {		
		return (t instanceof ProvaOWLType) &&
			kb.getOntology().isSupertype(this.URI, ((ProvaOWLType)t).URI);
	}
	
	public String toString()
	{
		return URI;
	}
}
