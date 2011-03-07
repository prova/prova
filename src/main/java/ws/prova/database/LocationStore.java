package ws.prova.database;

import java.util.HashMap;
import java.util.Map;

/**
 * This class stores the user-supplied database location information. It is used as
 * a communication channel between location and db_open builtins.
 * 
 * TODO: This is not necessary at all. We could just let users define their locations
 * with Prova (with 'location' predicate) and fetch associated values from the KB.
 *  
 * @author Malte Rohde <malte.rohde@inf.fu-berlin.de>
 */
public enum LocationStore {
	INSTANCE; // singleton
	
	private Map<String, Location> locations = new HashMap<String, Location>();
	
	/**
	 * Add a location to the store.
	 */
	public void addLocation(String identifier, String jdbc_uri, String user, String password) {
		locations.put(identifier, new Location(jdbc_uri, user, password));
	}
	
	/**
	 * Retrieve a location from the store.
	 * 
	 * @param identifier the name of the location
	 * @return the location associated with 'identifier' or null, if no such location exists.
	 */
	public Location getLocation(String identifier) {
		return locations.get(identifier);
	}
	
	public static class Location {
		public Location(String j, String u, String p) {
			jdbc_uri = j; 
			user = u; 
			password = p;
		}
		
		public String jdbc_uri;
		public String user;
		public String password;
	}
}
