package test.ws.prova.test2;

import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.junit.Test;

import ws.prova.api2.ProvaCommunicatorImpl;

public class ProvaDatabaseTest {
	
	@Test
	public void sqlSelectTest() {
		final String rulebase = "rules/reloaded/database.prova";
		
		// Increase verbosity
		Logger log = Logger.getLogger("ws.prova");
		log.setLevel(Level.DEBUG);
		
		try {
			// Create test db in memory
			Class.forName("org.hsqldb.jdbcDriver").newInstance();
			Connection connection = DriverManager.getConnection("jdbc:hsqldb:mem:bikestore", "sa", "");
			Statement s = connection.createStatement();
			s.execute("CREATE TABLE \"bikes\" (\"manufacturer\" VARCHAR, \"model\" VARCHAR, \"wheels\" INTEGER)");
			s.close();
			s = connection.createStatement();
			s.executeUpdate("INSERT INTO \"bikes\" (\"manufacturer\", \"model\", \"wheels\") VALUES ('kawasaki', 'avantgarde', 2)");
			s.close();
			s = connection.createStatement();
			s.executeUpdate("INSERT INTO \"bikes\" (\"manufacturer\", \"model\", \"wheels\") VALUES ('honda', 'neoprene', 2)");
			s.close();
			connection.commit();			
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
		
		
		try {
			ProvaCommunicatorImpl comm = new ProvaCommunicatorImpl("prova",null,rulebase,ProvaCommunicatorImpl.SYNC,null);
			synchronized(comm) {
				// terminate after one second of inactivity on messages queues
				while( !comm.getReagent().canShutdown() )
					comm.wait(1000);
			}
			comm.shutdown();
		} catch (Exception e) {
			System.err.println(e);
		}
	}
}
