package ws.prova.fub.database;

import java.sql.SQLException;

import org.apache.log4j.Logger;

import ws.prova.fub.ResultSet;

public class JDBCResultSetAdapter implements ResultSet {

	private static Logger log = Logger.getLogger(JDBCResultSetAdapter.class);
	private final java.sql.ResultSet results;
	
	public JDBCResultSetAdapter(java.sql.ResultSet r) {
		results = r;
	}

	@Override
	public boolean hasNext() {
		try {
			// TODO javadoc says isLast is expensive.
			return !results.isLast();
		} catch (SQLException e) {
			if(log.isDebugEnabled())
				log.debug("Error: Could not determine row pointer. ", e);
			// TODO better solution for this?
			return false;
		}
	}

	@Override
	public Solution next() {
		try {
			if(!results.next())
				// no more rows, should not happen.
				return null;	
		} catch (SQLException e) {
			if(log.isDebugEnabled())
				log.debug("Error: Could not move the row pointer. ", e);
			return null;
		}

		return new JDBCSolutionAdapter(results);
	}

	public void close() {
		try {
			results.close();
		} catch (SQLException e) {} // Ignored.
	}

	public class JDBCSolutionAdapter implements Solution {

		private final java.sql.ResultSet results;
		
		public JDBCSolutionAdapter(java.sql.ResultSet r) {
			results = r;
		}

		@Override
		public String get(String key) {
			try {
				// TODO other data types
				return results.getString(key);
			} catch (SQLException e) {
				if(log.isDebugEnabled())
					log.debug("Error: Could not get value for key '" + key + "'. ", e);
				return null;
			}
		}
		
	}
}
