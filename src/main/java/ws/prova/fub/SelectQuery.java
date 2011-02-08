package ws.prova.fub;

/**
 * Generic select query interface.
 * 
 * Implementing classes will have to handle the query parsing in their constructor.
 * 
 * @author Malte Rohde <malte.rohde@inf.fu-berlin.de>
 */
public interface SelectQuery {
	
	/**
	 * 
	 * @return 
	 * @throws QueryExecutionException if the execution somehow fails
	 */
	public ResultSet execute() throws QueryExecutionException;
	
	/**
	 * Call this after examination of results to clean up.
	 */
	public void destroy();
}
