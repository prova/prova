package org.provarules.examples.runner;

import org.provarules.service.EPService;
import org.provarules.service.ProvaService;
import org.provarules.service.impl.ProvaServiceImpl;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Demonstrate how ProvaService can host multiple Prova agents that communicate with each other
 * using the "osgi" protocol.
 * Note that this runs in plain Java--no OSGi container is actually required.
 * <p>
 * The runner implements EPService for Prova engines to be able to send messages to the runner,
 * not just between themselves.
 *
 * @author Alex Kozlenkov
 */
public class ProvaSimpleService implements EPService {

    static final String kAgent = "prova";

    static final String kPort = null;

    final String sender_rulebase = "rules/service/message_passing/sender.prova";

    final String receiver_rulebase = "rules/service/message_passing/receiver.prova";

    private ProvaService service;

    public ProvaSimpleService() {
        service = new ProvaServiceImpl();
        service.init();
        // Register the runner as a callback EPService
        service.register("runner", this);
    }

    private void run() {
        // Create two Prova agents in their own engines
        String sender = service.instance("sender", "");
        String receiver = service.instance("receiver", "");

        // Consult one rulebase into each
        service.consult(receiver, receiver_rulebase, "receiver1");
        // Make sure the consumer has access to a global object for counting
        AtomicInteger count = new AtomicInteger();
        service.setGlobalConstant(receiver, "$Count", count);
        service.consult(sender, sender_rulebase, "sender1");

        // Send a message directly from this runner
        Map<String, Integer> payload = new HashMap<String, Integer>();
        payload.put("a", 2);
        // This runner names itself as "runner" agent in this call (see the third argument).
        // This EPService implementation is passed in the last argument.
        // The service will then register an EPService callback so that agents will be able to
        //   send messages to this runner setting the destination to "runner".
        service.send("xid", "receiver", "runner", "inform", payload, this);

        try {
            synchronized (this) {
                wait(2000);
                // Verify that the count had been incremented
                assert (count.get() == 2);
            }
        } catch (Exception e) {
        }
        System.out.println("Confirmed that the messages have been received");

        // Bring both engines down: if we had not done that, both agents would have continued indefinitely
        service.destroy();
    }

    /**
     * This is a callback that is called when a Prova engine (see receiver.prova) sends a message to this runner
     */
    @Override
    public void send(String xid, String dest, String agent, String verb,
                     Object payload, EPService callback) {
        System.out.println("Received " + verb + " from " + agent + " :" + payload);
    }

    public static void main(String[] args) {
        new ProvaSimpleService().run();
    }

}
