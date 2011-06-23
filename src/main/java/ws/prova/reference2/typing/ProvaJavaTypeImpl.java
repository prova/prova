package ws.prova.reference2.typing;

import ws.prova.kernel2.typing.ProvaType;

public class ProvaJavaTypeImpl extends ProvaTypeBase {
	
	private final Class<?> javaClass;
	
	public ProvaJavaTypeImpl(Class<?> javaClass) {
		this.javaClass=javaClass;
	}
	
	public Class<?> getJavaClass()
	{
		return this.javaClass;
	}
	
	public boolean isSupertypeOf(final ProvaType t)
	{
		return (t instanceof ProvaJavaTypeImpl) &&
			this.javaClass.isAssignableFrom(((ProvaJavaTypeImpl)t).getJavaClass());
	}
	
	public String toString()
	{
		return javaClass.getCanonicalName();
	}
	
	public boolean equals( final ProvaJavaTypeImpl other ) {
		return other.javaClass == javaClass;
	}
	
}
