package ws.prova.reference2.cache;

import java.util.Arrays;

import ws.prova.kernel2.cache.ProvaGroundKey;

public class ProvaGroundKeyImpl implements ProvaGroundKey {

	private Object[] data;
	
	public ProvaGroundKeyImpl(Object[] data) {
		this.data = data;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(data);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProvaGroundKeyImpl other = (ProvaGroundKeyImpl) obj;
		if (!Arrays.equals(data, other.data))
			return false;
		return true;
	}

}
