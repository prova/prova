package ws.prova.reference2.typing;

import ws.prova.kernel2.typing.ProvaType;

public class ProvaAnyTypeImpl extends ProvaTypeBase {
	
	public static final ProvaType singleton = new ProvaAnyTypeImpl();

	private ProvaAnyTypeImpl() {}
	
	@Override
	public boolean isSubtypeOf(ProvaType t) {
		return (t instanceof ProvaAnyTypeImpl);
	}
	
	public String toString()
	{
		return "typeless";
	}
}
