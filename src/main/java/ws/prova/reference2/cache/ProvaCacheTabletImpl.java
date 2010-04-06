package ws.prova.reference2.cache;

import java.util.HashMap;
import java.util.Map;

import ws.prova.kernel2.cache.ProvaCacheState;
import ws.prova.kernel2.cache.ProvaCacheTablet;
import ws.prova.kernel2.cache.ProvaGroundKey;

public class ProvaCacheTabletImpl implements ProvaCacheTablet {

	private int arity;

	private Map<ProvaGroundKey,ProvaCacheState> cacheStates;
	
	public ProvaCacheTabletImpl(int arity) {
		this.arity = arity;
		this.cacheStates = new HashMap<ProvaGroundKey,ProvaCacheState>();
	}

	@Override
	public ProvaCacheState open(Object[] data) {
		ProvaGroundKey key = new ProvaGroundKeyImpl(data);
		ProvaCacheState cacheState = cacheStates.get(key);
		if( cacheState==null ) {
			cacheState = new ProvaCacheStateImpl();
			cacheStates.put(key, cacheState);
		}
		return cacheState;
	}

	public int getArity() {
		return this.arity;
	}

}
