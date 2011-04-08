package ws.prova.reference2.typing;

import ws.prova.kernel2.ProvaType;

public class ProvaJavaTypeImpl extends ProvaTypeBase {
	
	private final Class<?> javaClass;
	
	public ProvaJavaTypeImpl(Class<?> javaClass) {
		this.javaClass=javaClass;
	}
	
	public Class<?> getJavaClass()
	{
		return this.javaClass;
	}
	
	public boolean isSubtypeOf(final ProvaType t)
	{
		if(t instanceof ProvaJavaTypeImpl)
			return ((ProvaJavaTypeImpl)t).getJavaClass().isAssignableFrom(this.javaClass);
		return true; // I am subtype of typeless
	}
	
	public String toString()
	{
		return javaClass.getCanonicalName();
	}
}
