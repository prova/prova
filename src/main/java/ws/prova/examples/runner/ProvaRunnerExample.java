package ws.prova.examples.runner;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import ws.prova.api2.ProvaCommunicatorImpl;


public class ProvaRunnerExample {

	static final String kAgent = "prova";
	static final String kPort = null;
	static final Logger log = Logger.getLogger("ws.prova");
	
	public static void main(String[] args) {
		// Increase log level
		log.setLevel(Level.OFF);
		
		final String rulebase = "rules/reloaded/sparql.prova";
		
		try {
			ProvaCommunicatorImpl comm = new ProvaCommunicatorImpl(kAgent,kPort,rulebase,ProvaCommunicatorImpl.SYNC,null);
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