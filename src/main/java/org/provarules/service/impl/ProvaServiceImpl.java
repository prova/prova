package org.provarules.service.impl;

import org.provarules.api2.ProvaCommunicator;
import org.provarules.api2.ProvaCommunicatorImpl;
import org.provarules.exchange.ProvaSolution;
import org.provarules.kernel2.ProvaConstant;
import org.provarules.kernel2.ProvaList;
import org.provarules.service.EPService;
import org.provarules.service.ProvaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * OSGi Service holding a collection of identifiable Prova engines
 *
 * @author alex.kozlenkov@googlemail.com
 */
public class ProvaServiceImpl implements ProvaService {

    private final static Logger log = LoggerFactory.getLogger("service");

    private String id;

    private ConcurrentMap<String, ProvaCommunicator> engines;

    private ConcurrentMap<String, List<String>> topicDestinations = new ConcurrentHashMap<>();

    private ConcurrentMap<String, EPService> callbacks = new ConcurrentHashMap<>();

    @Override
    public void init() {
        id = UUID.randomUUID().toString();
        engines = new ConcurrentHashMap<>();
        System.out.println("Prova Service " + id + " created");
    }

    @Override
    public void destroy() {
        if (engines != null) {
            for (ProvaCommunicator engine : engines.values())
                engine.shutdown();
        }
        System.out.println("Prova Service " + id + " destroyed");
    }

    @Override
    public String instance(String agent, String rulebase) {
        ProvaCommunicator prova;
        try {
            Map<String, Object> globals = new HashMap<>();
            prova = new ProvaCommunicatorImpl(this, agent, null, rulebase, ProvaCommunicatorImpl.SYNC, globals);
            engines.put(agent, prova);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return agent;
    }

    @Override
    public String instance(String agent, String rulebase, PrintWriter out) {
        ProvaCommunicator prova;
        try {
            Map<String, Object> globals = new HashMap<>();
            prova = new ProvaCommunicatorImpl(this, agent, null, rulebase, ProvaCommunicatorImpl.SYNC, globals);
            prova.setPrintWriter(out);
            engines.put(agent, prova);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return agent;
    }

    @Override
    public void release(String agent) {
        ProvaCommunicator engine = engines.remove(agent);
        if (engine == null)
            throw new RuntimeException("No engine instance " + agent);
        engine.stop();
    }

    @Override
    public List<ProvaSolution[]> consult(String agent, String src, String key) {
        try {
            ProvaCommunicator engine = engines.get(agent);
            if (engine == null)
                throw new RuntimeException("No engine instance " + agent);
            return engine.consultSync(src, key, new Object[]{});
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<ProvaSolution[]> consult(String agent, BufferedReader in, String key) {
        try {
            ProvaCommunicator engine = engines.get(agent);
            if (engine == null)
                throw new RuntimeException("No engine instance " + agent);
            return engine.consultSync(in, key, new Object[]{});
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void send(String dest, ProvaList terms) {
        final Object verb = ((ProvaConstant) terms.getFixed()[3]).getObject();
        if ("present".equals(verb)) {
            // Ask the subscriber to start receiving the stream
            String topic = ((ProvaList) terms.getFixed()[4]).getFixed()[0].toString();
            if (log.isDebugEnabled())
                log.debug("Subscriber " + dest + " to receive stream on " + topic);
            // Register the mapping
            registerMapping(topic, dest);
        } else if ("data".equals(verb)) {
            // Dispatch a stream to subscribers
            if (log.isDebugEnabled())
                log.debug("Dispatch data on stream " + dest);
            for (String target : topicDestinations.get(dest)) {
                ProvaCommunicator engine = engines.get(target);
                if (engine == null)
                    log.error("Subscriber " + target + " not present");
                engine.addMsg(terms);
                if (log.isDebugEnabled())
                    log.debug("Sent: " + terms + " to " + target);
            }
            return;
        } else if ("unregister".equals(verb)) {
            // Purge the subscription
            String topic = ((ProvaList) terms.getFixed()[4]).getFixed()[0].toString();
            unregisterMapping(topic, dest);
            // This message will be forwarded to the subscriber informing them of lease expiration
        }
//		else if( "renew".equals(verb) )
//			log.info(terms);
        ProvaCommunicator engine = engines.get(dest);
        if (engine == null)
            throw new RuntimeException("No engine instance " + dest);
        engine.addMsg(terms);
        if (log.isDebugEnabled())
            log.debug("Sent: " + terms + " to " + dest);
    }

    private synchronized void registerMapping(String topic, String dest) {
        List<String> list = topicDestinations.computeIfAbsent(topic, k -> new ArrayList<>());
        list.add(dest);
    }

    private synchronized void unregisterMapping(String topic, String dest) {
        List<String> list = topicDestinations.get(topic);
        if (list == null)
            return;
        for (Iterator<String> iter = list.iterator(); iter.hasNext(); ) {
            if (dest.equals(iter.next())) {
                iter.remove();
                return;
            }
        }
    }

    @Override
    public void setGlobalConstant(String agent, String name, Object value) {
        ProvaCommunicator engine = engines.get(agent);
        if (engine == null)
            throw new RuntimeException("No engine instance " + agent);
        engine.setGlobalConstant(name, value);
    }

    @Override
    public void send(String xid, String dest, String agent, String verb, Object content) {
        EPService callback = callbacks.get(dest);
        if (callback != null && callback != this) {
            if (!(content instanceof Map<?, ?>))
                throw new IllegalArgumentException();
            Map<String, Object> payload = (Map<String, Object>) content;
            if ("present".equals(verb)) {
                // Ask the subscriber to start receiving the stream
                String topic = payload.get("topic").toString();
                if (log.isDebugEnabled())
                    log.debug("Subscriber " + dest + " to receive stream on " + topic);
                // Register the mapping
                registerMapping(topic, dest);
            }
            callback.send(xid, dest, agent, verb, payload, this);
        } else
            send(xid, dest, agent, verb, content, this);
    }

    @SuppressWarnings("unchecked")
    @Override
    public void send(String xid, String dest, String agent, String verb, Object content, EPService callback) {
        if (callback != this) {
            callbacks.putIfAbsent(agent, callback);
        }
        if ("present".equals(verb)) {
            // Ask the subscriber to start receiving the stream
            String topic;
            if (content instanceof ProvaList) {
                topic = ((ProvaConstant) ((ProvaList) content).getFixed()[0]).getObject().toString();
            } else {
                Map<String, Object> payload = (Map<String, Object>) content;
                topic = payload.get("topic").toString();
            }
            if (log.isDebugEnabled())
                log.debug("Subscriber " + dest + " to receive stream on " + topic);
            // Register the mapping
            registerMapping(topic, dest);
        } else if ("data".equals(verb)) {
            // Dispatch a stream to subscribers
            if (log.isDebugEnabled())
                log.debug("Dispatch data on stream " + dest);
            for (String target : topicDestinations.get(dest)) {
                ProvaCommunicator engine = engines.get(target);
                if (engine == null)
                    log.error("Subscriber " + target + " not present");
                else {
                    engine.addMsg(xid, agent, verb, content);
                    if (log.isDebugEnabled())
                        log.debug("Sent: " + content + " to " + target);
                }
            }
            return;
        } else if ("unregister".equals(verb)) {
            // Purge the subscription
            Map<String, Object> payload = (Map<String, Object>) content;
            String topic = payload.get("topic").toString();
            unregisterMapping(topic, dest);
            // This message will be forwarded to the subscriber informing them of lease expiration
        }
//		else if( "renew".equals(verb) )
//			log.info(terms);
        ProvaCommunicator engine = engines.get(dest);
        if (engine == null)
            throw new RuntimeException("No engine instance " + dest);
        engine.addMsg(xid, agent, verb, content);
        if (log.isDebugEnabled())
            log.debug("Sent: " + content + " to " + dest);
    }

    @Override
    public void register(String agent, EPService epService) {
        callbacks.putIfAbsent(agent, epService);
    }

}
