package test.ws.prova.test2;

import java.util.concurrent.atomic.AtomicInteger;

import org.junit.Test;

import ws.prova.service.ProvaService;
import ws.prova.service.impl.ProvaServiceImpl;

/**
 * Tests for OSGi-enabled service ProvaService.
 * The rulebases use the new "osgi" protocol to pass messages between multiple in-process Prova engines.
 * 
 * @author alex.kozlenkov
 *
 */
public class ProvaServiceTest {

	@Test
	public void service_initialization() {
		ProvaService service = new ProvaServiceImpl();
		service.init();
		org.junit.Assert.assertNotNull(service);
	}

	@Test
	public void service_message_passing() {
		final String sender_rulebase = "rules/reloaded/service_sender.prova";
		final String receiver_rulebase = "rules/reloaded/service_receiver.prova";
		
		ProvaService service = new ProvaServiceImpl();
		service.init();
		org.junit.Assert.assertNotNull(service);

		String sender = service.instance("sender", "");
		org.junit.Assert.assertNotNull(sender);

		String receiver = service.instance("receiver", "");
		org.junit.Assert.assertNotNull(receiver);

		service.consult(receiver, receiver_rulebase, "receiver1");
		AtomicInteger count = new AtomicInteger();
		service.setGlobalConstant(receiver, "$Count", count);
		service.consult(sender, sender_rulebase, "sender1");

		try {
			synchronized(this) {
				wait(1000);
				org.junit.Assert.assertEquals(1,count.get());
			}
		} catch (Exception e) {
		}
	}

}
