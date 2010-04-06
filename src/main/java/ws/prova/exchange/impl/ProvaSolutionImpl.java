package ws.prova.exchange.impl;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import ws.prova.exchange.ProvaSolution;

public class ProvaSolutionImpl implements ProvaSolution {

	private ConcurrentMap<String,Object> nv = new ConcurrentHashMap<String,Object>();
	
	@Override
	public void add(String name, Object value) {
		nv.put(name, value);
	}

	@Override
	public ConcurrentMap<String,Object> getNv() {
		return nv;
	}

	@Override
	public Object getNv(String name) {
		return nv.get(name);
	}
}
