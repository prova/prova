package org.provarules.examples.runner;

import org.provarules.api2.ProvaCommunicator;
import org.provarules.api2.ProvaCommunicatorImpl;
import org.provarules.kernel2.ProvaList;
import org.provarules.kernel2.ProvaObject;
import org.provarules.reference2.ProvaConstantImpl;
import org.provarules.reference2.ProvaListImpl;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class ProvaSimpleAgent {

    private static final String kAgent = "prova";

    private static final String kPort = null;

    private final String rulebase = "rules/rules3/msg.prova";

    private ProvaCommunicator prova = null;

    public ProvaSimpleAgent() {
    }

    private void run() {
//		AtomicLong count = new AtomicLong();
        Map<String, Object> globals = new HashMap<>();
        globals.put("callback", this);
        prova = new ProvaCommunicatorImpl(kAgent, kPort, rulebase, ProvaCommunicatorImpl.SYNC, globals);

        // Send a hundred messages to the consulted Prova rulebase.
        try {
            Random r = new Random(17);
            for (int i = 0; i < 100; i++) {
                Map<String, Object> payload = new HashMap<>();
                payload.put("field", r.nextDouble());
                ProvaList terms = ProvaListImpl.create(new ProvaObject[]{
                        ProvaConstantImpl.create("test"),
                        ProvaConstantImpl.create("async"),
                        ProvaConstantImpl.create(0),
                        ProvaConstantImpl.create("inform"),
                        ProvaListImpl.create(new ProvaObject[]{
                                ProvaConstantImpl.create("a"),
                                ProvaConstantImpl.create(payload)
                        })
                });
                prova.addMsg(terms);
            }
        } catch (Exception e) {
            System.err.println("Unexpected exception: " + e.getLocalizedMessage());
        }

        // Bring the engine down: if we had not done that, the agent would have continued indefinitely
        prova.shutdown();
    }

    public static void main(String[] args) {
        new ProvaSimpleAgent().run();
    }

}
