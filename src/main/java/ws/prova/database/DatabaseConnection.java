package ws.prova.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.log4j.Logger;

public class DatabaseConnection {
	
	private static Logger log = Logger.getLogger(DatabaseConnection.class);
	private final String jdbc_uri;
	private final String user;
	private final String password;
	private Connection connection;
		
	public DatabaseConnection(String jdbc_uri, String user, String password) {
		this.jdbc_uri = jdbc_uri;
		this.user = user;
		this.password = password;
	}

	public boolean open() {
		if(!initDriver())
			return false;
		
		if(!openConnection())
			return false;
			
		return true;
	}
	
	public Connection getConnection() {
		return connection;
	}
	
	public void close() {
		try {
			connection.close();
		} catch (SQLException e) {
			if(log.isDebugEnabled())
				log.debug("Error: Could not close database connection. ", e);
		}
	}
	
	protected boolean initDriver() {
		String driver_class = null;
		if (jdbc_uri.indexOf("mysql") > 0) {
			driver_class = "com.mysql.jdbc.Driver";
		} else if (jdbc_uri.indexOf("hsqldb") > 0) {
			driver_class = "org.hsqldb.jdbcDriver";
		} else if (jdbc_uri.indexOf("microsoft") > 0) {
			driver_class = "com.microsoft.jdbc.sqlserver.SQLServerDriver";
		} else if (jdbc_uri.indexOf("oracle") > 0) {
			driver_class = "oracle.jdbc.driver.OracleDriver";
		} else if (jdbc_uri.indexOf("postgresql") > 0) {
			driver_class = "org.postgresql.Driver";
		} else {
			if(log.isDebugEnabled())
				log.debug("Error: Unknown JDBC driver.");
			return false;
		}
		
		try {
			Class.forName(driver_class).newInstance();
		} catch (InstantiationException e) {
			if(log.isDebugEnabled())
				log.debug("Error: Could not instantiate JDBC driver class.", e);
			return false;
		} catch (IllegalAccessException e) {
			if(log.isDebugEnabled())
				log.debug("Error: illegal access. ", e);
			return false;
		} catch (ClassNotFoundException e) {
			if(log.isDebugEnabled())
				log.debug("Error: JDBC Driver class not found: " + driver_class + ". ", e);
			return false;
		}
		
		return true;
	}
	
	protected boolean openConnection() {
		Properties p = new Properties();
		p.put("user", user);
		p.put("password", password);
		
		try {
			connection = DriverManager.getConnection(jdbc_uri, p);
		} catch (SQLException e) {
			if(log.isDebugEnabled())
				log.debug("Error: Could not establish database connection. ", e);
			return false;
		}
		
		return true;
	}
}
