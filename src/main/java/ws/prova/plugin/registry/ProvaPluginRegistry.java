package ws.prova.plugin.registry;

import ws.prova.plugin.ProvaPredicatePlugin;

public interface ProvaPluginRegistry {
	
	/**
	 * 
	 * @param plugin
	 * @return id
	 */
	public int registerPlugin(ProvaPredicatePlugin plugin);
	
	public void unregisterPlugin(int id);
}
