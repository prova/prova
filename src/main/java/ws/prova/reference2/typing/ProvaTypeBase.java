package ws.prova.reference2.typing;

import ws.prova.kernel2.typing.ProvaType;

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
	public final boolean isSubtypeOf(final ProvaType t) {
		return t.isSupertypeOf(this);
	}
	
	@Override
	public abstract boolean isSupertypeOf(ProvaType t);
	
	@Override
	public abstract String toString();
}
