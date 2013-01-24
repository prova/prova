package ws.prova.examples.runner;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import ws.prova.api2.ProvaCommunicator;
import ws.prova.api2.ProvaCommunicatorImpl;
import ws.prova.kernel2.ProvaList;
import ws.prova.kernel2.ProvaObject;
import ws.prova.reference2.ProvaConstantImpl;
import ws.prova.reference2.ProvaListImpl;

public class ProvaSimpleAgent {

	static final String kAgent = "prova";

	static final String kPort = null;

	final String rulebase = "rules/rules3/msg.prova";

	private ProvaCommunicator prova = null;
	
	public ProvaSimpleAgent() {}
	
	private void run() {
//		AtomicLong count = new AtomicLong();
		Map<String,Object> globals = new HashMap<String,Object>();
		globals.put("callback", this);
		prova = new ProvaCommunicatorImpl(kAgent,kPort,rulebase,ProvaCommunicatorImpl.SYNC,globals);
		
		// Send a hundred messages to the consulted Prova rulebase.
		try {
			Random r = new Random(17);
			for( int i=0; i<100; i++ ) {
				Map<String,Object> payload = new HashMap<String,Object>();
				payload.put("field", r.nextDouble());
				ProvaList terms = ProvaListImpl.create( new ProvaObject[] {
						ProvaConstantImpl.create("test"),
						ProvaConstantImpl.create("async"),
						ProvaConstantImpl.create(0),
						ProvaConstantImpl.create("inform"),
						ProvaListImpl.create(new ProvaObject[] {
								ProvaConstantImpl.create("a"),
								ProvaConstantImpl.create(payload)
								})
				});
				prova.addMsg(terms);
			}
		} catch (Exception e) {
			System.err.println("Unexpected exception: "+e.getLocalizedMessage());
		}

		// Bring the engine down: if we had not done that, the agent would have continued indefinitely
		prova.shutdown();
	}

	public static void main( String[] args ) {	
		new ProvaSimpleAgent().run();
	}

}
