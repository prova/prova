package ws.prova.fub;

/**
 * A generic ResultSet for SPARQL and SQL queries. Iterates over a given set of results, removing
 * the solutions after presenting them to the user.
 * 
 * @author Malte Rohde <malte.rohde@inf.fu-berlin.de>
 */
public interface ResultSet {
	
	/**
	 * Indicates whether there are solutions left in the set.
	 * @return true if there is a next solution, else false
	 */
	public boolean hasNext();
	
	/**
	 * Returns the next solution and removes it from the set.
	 * If there's no solution left, <code>null</code> is returned.
	 * 
	 * @return the next solution or <code>null</code>
	 */
	public Solution next();
	
	/**
	 * A Solution is similar to a hash map. Embedded here for simplicity.
	 * 
	 * @author Malte Rohde <malte.rohde@inf.fu-berlin.de>
	 */
	public interface Solution {
		
		/**
		 * Returns the value for <code>key</code> in the solution.
		 * Returns <code>null</code> if no such key exists.
		 * 
		 * @param key the key to look up
		 * @return the associated value or <code>null</code>
		 */
		public String get(String key);
	}
}
