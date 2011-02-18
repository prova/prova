package ws.prova.plugin.registry.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import ws.prova.kernel2.ProvaBuiltin;
import ws.prova.plugin.ProvaPredicatePlugin;
import ws.prova.plugin.registry.ProvaPluginRegistry;

public class ProvaPluginRegistryImpl implements ProvaPluginRegistry {
	
	private static Map<Integer, ProvaPredicatePlugin> additional_builtins = new HashMap<Integer, ProvaPredicatePlugin>();
	private int id = 0;
	
	public static Collection<ProvaBuiltin> getAdditionBuiltins() {
		LinkedList<ProvaBuiltin> builtins = new LinkedList<ProvaBuiltin>();
		for(ProvaPredicatePlugin ppp : additional_builtins.values()) {
			builtins.add(new ProvaPredicatePluginAdapterImpl(ppp));
		}
		return builtins;
	}
	
	@Override
	public int registerPlugin(ProvaPredicatePlugin plugin) {
		additional_builtins.put(id++, plugin);
		System.out.println("Registered new plugin: " + plugin.getName() + "!");
		return 0;
	}

	@Override
	public void unregisterPlugin(int id) {
		System.out.println("Unregistered plugin with id: " + id + "!");
	}

	public void init() {
		// TODO remove if not needed (remember META-INF/spring)
		System.out.println("Initialized ProvaPluginRegistry!");
	}
	
	public void destroy() {
		// TODO remove if not needed (remember META-INF/spring)
		System.out.println("Destroyed ProvaPluginRegistry");
	}
}
