package ws.prova.reference2.typing;

import ws.prova.kernel2.ProvaType;

public abstract class ProvaTypeBase implements ProvaType {

	@Override
	public final boolean equals(final Object o)
	{
		return this==o||(o instanceof ProvaType && this.equals((ProvaType)o));
	}
	
	@Override
	public final boolean equals(final ProvaType t) {
		return this.isSubtypeOf(t)&&t.isSubtypeOf(this);
	}

	@Override
	public final boolean isSupertypeOf(final ProvaType t) {
		return t.isSubtypeOf(this);
	}
	
	@Override
	public abstract boolean isSubtypeOf(ProvaType t);
	
	@Override
	public abstract String toString();
}
