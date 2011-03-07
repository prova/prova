package ws.prova.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.log4j.Logger;

import ws.prova.database.LocationStore.Location;

public class DatabaseConnection {
	
	private static Logger log = Logger.getLogger(DatabaseConnection.class);
	private final Location location;
	private Connection connection;
	
	public DatabaseConnection(Location l) {
		location = l;
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
		String uri = location.jdbc_uri;
		String driver_class = null;
		if (uri.indexOf("mysql") > 0) {
			driver_class = "com.mysql.jdbc.Driver";
		} else if (uri.indexOf("hsqldb") > 0) {
			driver_class = "org.hsqldb.jdbcDriver";
		} else if (uri.indexOf("microsoft") > 0) {
			driver_class = "com.microsoft.jdbc.sqlserver.SQLServerDriver";
		} else if (uri.indexOf("oracle") > 0) {
			driver_class = "oracle.jdbc.driver.OracleDriver";
		} else if (uri.indexOf("postgresql") > 0) {
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
		p.put("user", location.user);
		p.put("password", location.password);
		
		try {
			connection = DriverManager.getConnection(location.jdbc_uri, p);
		} catch (SQLException e) {
			if(log.isDebugEnabled())
				log.debug("Error: Could not establish database connection. ", e);
			return false;
		}
		
		return true;
	}
}
