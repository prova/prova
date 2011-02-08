package ws.prova.fub.database;

import java.sql.SQLException;
import java.sql.Statement;

import org.apache.log4j.Logger;

import ws.prova.fub.QueryExecutionException;
import ws.prova.fub.ResultSet;
import ws.prova.fub.SelectQuery;

public class SQLSelectQuery implements SelectQuery {

	private static Logger log = Logger.getLogger(SQLSelectQuery.class);
	
	private DatabaseConnection connection_wrapper;
	private String query;
	
	private Statement statement;
	private JDBCResultSetAdapter results;
	
	public SQLSelectQuery(DatabaseConnection c, String q) {
		connection_wrapper = c;
		query = q;
	}

	@Override
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
			java.sql.ResultSet rs = statement.executeQuery(query);
			results = new JDBCResultSetAdapter(rs);
		} catch (SQLException e) {
			throw new QueryExecutionException(e);
		}
		
		return results;
	}

	@Override
	public void destroy() {
		results.close();
		try {
			statement.close();
		} catch (SQLException e) {} // Ignored.
		connection_wrapper.close();
	}

}
