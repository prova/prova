package ws.prova.database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.log4j.Logger;

public class SQLSelectQuery{

	private static Logger log = Logger.getLogger(SQLSelectQuery.class);
	
	private DatabaseConnection connection_wrapper;
	private String query;
	
	private Statement statement;
	private ResultSet results;
	
	public SQLSelectQuery(DatabaseConnection c, String q) {
		connection_wrapper = c;
		query = q;
	}

	public ResultSet execute() throws QueryExecutionException {
		try {
			// Get the JDBC connection from the wrapper object and create a statement from it
			statement = connection_wrapper.getConnection().createStatement();
		} catch (SQLException e) {
			if(log.isDebugEnabled())
				log.debug("Error: Could not create a Statement. ", e);
			throw new QueryExecutionException(e);
		}
		
		// Execute the query
		try {
			results = statement.executeQuery(query);
		} catch (SQLException e) {
			throw new QueryExecutionException(e);
		}
		
		return results;
	}

	public void destroy() {
		try {
			results.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
		try {
			statement.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
		connection_wrapper.close();
	}

}
