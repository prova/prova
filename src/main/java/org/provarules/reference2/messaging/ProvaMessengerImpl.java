package org.provarules.reference2.messaging;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.apache.commons.lang3.time.DateUtils;
import org.provarules.agent2.ProvaReagent;
import org.provarules.agent2.ProvaThreadpoolEnum;
import org.provarules.esb2.ProvaAgent;
import org.provarules.eventing.ProvaEventsAccumulator;
import org.provarules.kernel2.*;
import org.provarules.kernel2.messaging.ProvaMessenger;
import org.provarules.parser.WhereLexer;
import org.provarules.parser.WhereParser;
import org.provarules.reference2.*;
import org.provarules.reference2.eventing.ProvaAndGroupImpl;
import org.provarules.reference2.eventing.ProvaBasicGroupImpl;
import org.provarules.reference2.eventing.ProvaGroup;
import org.provarules.reference2.eventing.ProvaGroup.EventDetectionStatus;
import org.provarules.reference2.eventing.ProvaOrGroupImpl;
import org.provarules.reference2.messaging.where.WhereNode;
import org.provarules.reference2.messaging.where.WhereTreeVisitor;
import org.provarules.service.ProvaMiniService;
import org.provarules.util2.ProvaTimeUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicLong;

@SuppressWarnings("unused")
public class ProvaMessengerImpl implements ProvaMessenger {

    private final static ProvaVariable CTLPROTOCOL = ProvaVariableImpl
            .create("CtlProtocol");

    private final static ProvaVariable CTLFROM = ProvaVariableImpl
            .create("CtlFrom");

    private final static ProvaConstantImpl EOF = ProvaConstantImpl
            .create("eof");

    private final static Logger log = LoggerFactory.getLogger("prova");

    private final ProvaReagent prova;

    private final ProvaKnowledgeBase kb;

    private final String agent;

    private final String password;

    private final String machine;

    private final ProvaAgent esb;

    private final AtomicLong unique_iid = new AtomicLong();

    private final AtomicLong reaction_iid = new AtomicLong();

    private final ConcurrentMap<Long, List<String>> ruleid2outbound = new ConcurrentHashMap<>();

    private final ConcurrentMap<String, List<Long>> inbound2ruleids = new ConcurrentHashMap<>();

    private final ConcurrentMap<String, String> dynamic2Static = new ConcurrentHashMap<>();

    private final ConcurrentMap<String, ProvaGroup> dynamic2Group = new ConcurrentHashMap<>();

    private final ConcurrentMap<Long, ProvaGroup> ruleid2Group = new ConcurrentHashMap<>();

    private final ConcurrentMap<Long, ProvaGroup> outcomeRuleid2Group = new ConcurrentHashMap<>();

    private final ScheduledThreadPoolExecutor timers;

    private final ProvaPredicate rcvMsg2;

    private ProvaMiniService service;

    private static ThreadLocal<Map<String, String>> tlStatic2Dynamic = new ThreadLocal<>();

    private static ThreadLocal<Map<String, ProvaGroup>> tlDynamic = new ThreadLocal<>();

    private class TimerThreadFactory implements ThreadFactory {

        private int count = 1;

        @Override
        public Thread newThread(Runnable r) {
            Thread thread = new Thread(r);
            thread.setDaemon(true);
            thread.setName("Timer-" + (count++));
            return thread;
        }

    }

    public ProvaMessengerImpl(ProvaReagent prova, ProvaKnowledgeBase kb,
                              String agent, String password, String machine, ProvaAgent esb) {
        this.prova = prova;
        this.kb = kb;
        this.agent = agent;
        this.password = password;
        this.machine = machine;
        this.esb = esb;
        this.timers = new ScheduledThreadPoolExecutor(5,
                new TimerThreadFactory());
        this.rcvMsg2 = kb.getOrGeneratePredicate("rcvMsg", 2);
    }

    /**
     * Prepare a rcvMsg goal for sending on the main agent thread if the verb is
     * 'self' or a thread chosen according to the conversation-id cid (if the
     * verb is 'async' or other). The reactions corresponding to the same
     * conversation-id are thus always run by the same thread.
     * <p>
     * The message is sent when the next rcvMsg literal is encountered or the
     * whole query is complete.
     */
    @Override
    public boolean prepareMsg(ProvaLiteral literal,
                              List<ProvaLiteral> newLiterals, ProvaRule query) {
        ProvaDelayedCommand message = null;
        try {
            List<ProvaVariable> variables = query.getVariables();
            ProvaList terms = literal.getTerms();
            ProvaObject[] data = terms.getFixed();
            ProvaObject lt = data[0];
            if (lt instanceof ProvaVariablePtr) {
                ProvaVariablePtr varPtr = (ProvaVariablePtr) lt;
                lt = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
            }
            String cid;
            if (lt instanceof ProvaConstant) {
                // Follow up on an existing conversation
                cid = lt.toString();
            } else if (lt instanceof ProvaVariable) {
                // Generate a unique conversation-id
                cid = generateCid();
                ((ProvaVariable) lt).setAssigned(ProvaConstantImpl.create(cid));
            } else
                return false;
            if (!(data[1] instanceof ProvaConstant))
                return false;
            String protocol = ((ProvaConstant) data[1]).getObject().toString();
            if (!(data[2] instanceof ProvaConstant))
                return false;
            String dest = ((ProvaConstant) data[2]).getObject().toString();
            ProvaList termsCopy = (ProvaList) terms
                    .cloneWithVariables(variables);
            if ("esb".equals(protocol)) {
                if (esb == null)
                    return false;
                message = new ProvaESBMessageImpl(dest, termsCopy, esb);
            } else if ("osgi".equals(protocol)) {
                if (service == null)
                    return false;
                message = new ProvaServiceMessageImpl(dest, termsCopy, agent,
                        service);
            } else {
                ProvaLiteral lit = kb.generateHeadLiteral("rcvMsg", termsCopy);
                ProvaRule goal = kb.generateGoal(new ProvaLiteral[]{lit,
                        kb.generateLiteral("fail")});
                if ("async".equals(protocol)) {
                    message = new ProvaMessageImpl(partitionKey(cid), goal,
                            ProvaThreadpoolEnum.CONVERSATION);
                } else if ("task".equals(protocol)) {
                    message = new ProvaMessageImpl(0, goal,
                            ProvaThreadpoolEnum.TASK);
                } else if ("swing".equals(protocol)) {
                    message = new ProvaMessageImpl(0, goal,
                            ProvaThreadpoolEnum.SWING);
                } else if ("self".equals(protocol) || "0".equals(dest)) {
                    message = new ProvaMessageImpl(0, goal,
                            ProvaThreadpoolEnum.MAIN);
                }
            }
        } catch (Exception e) {
            // TODO: throw something when Prova exception handling is back
            return false;
        }
        if (message != null) {
            List<ProvaDelayedCommand> delayed = ProvaResolutionInferenceEngineImpl.delayedCommands
                    .get();
            delayed.add(message);
            return true;
        }
        return false;
    }

    public static long partitionKey(String cid) {
        return Math.abs(cid.hashCode());
    }

    /**
     * Submits asynchronously a rcvMsg goal scheduled on the main agent thread
     * if the verb is 'self' or a thread chosen according to the conversation-id
     * cid (if the verb is 'async' or other). The reactions corresponding to the
     * same conversation-id are thus always run by the same thread.
     */
    @Override
    public boolean sendMsg(ProvaLiteral literal,
                           List<ProvaLiteral> newLiterals, ProvaRule query) {
        try {
            if (literal.isGround())
                return sendMsgGround(literal, newLiterals, query);
            List<ProvaVariable> variables = query.getVariables();
            ProvaList terms = literal.getTerms();
            ProvaObject[] data = terms.getFixed();
            ProvaObject lt = data[0];
            if (lt instanceof ProvaVariablePtr) {
                ProvaVariablePtr varPtr = (ProvaVariablePtr) lt;
                lt = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
            }
            String cid;
            if (lt instanceof ProvaConstant) {
                // Follow up on an existing conversation
                cid = lt.toString();
            } else if (lt instanceof ProvaVariable) {
                // Generate a unique conversation-id
                cid = generateCid();
                ((ProvaVariable) lt).setAssigned(ProvaConstantImpl.create(cid));
            } else
                return false;
            if (data.length == 2) {
                final ProvaList termsCopy = terms
                        .copyWithVariables(variables);
                final ProvaLiteral lit = new ProvaLiteralImpl(rcvMsg2,
                        termsCopy);
                final ProvaRule goal = kb.generateGoal(new ProvaLiteral[]{
                        lit, kb.generateLiteral("fail")});
                prova.submitAsync(partitionKey(cid), goal,
                        ProvaThreadpoolEnum.CONVERSATION);
                return true;
            }

            if (!(data[1] instanceof ProvaConstant))
                return false;
            String protocol = data[1].toString();
            ProvaObject destObject = data[2];
            if (destObject instanceof ProvaVariablePtr) {
                ProvaVariablePtr varPtr = (ProvaVariablePtr) destObject;
                destObject = variables.get(varPtr.getIndex())
                        .getRecursivelyAssigned();
            }
            if (!(destObject instanceof ProvaConstant))
                return false;
            String dest = destObject.toString();
            if (!(data[3] instanceof ProvaConstant))
                return false;
            final ProvaList termsCopy = terms
                    .copyWithVariables(variables);
            if ("esb".equals(protocol)) {
                if (esb == null)
                    return false;
                ProvaDelayedCommand message = new ProvaESBMessageImpl(dest,
                        termsCopy, esb);
                message.process(prova);
                return true;
            } else if ("osgi".equals(protocol)) {
                if (service == null)
                    return false;
                ProvaDelayedCommand message = new ProvaServiceMessageImpl(dest,
                        termsCopy, agent, service);
                message.process(prova);
                return true;
            }
            String verb = data[3].toString();
            ProvaLiteral lit;
            // if( "eof".equals(verb) ) {
            lit = kb.generateHeadLiteral("rcvMsg", termsCopy);
            // } else {
            // termsCopy = ProvaListImpl.create(new ProvaObject[]
            // {termsCopy.getFixed()[0],ProvaAnyImpl.create(),termsCopy});
            // lit = kb.generateHeadLiteral("@temporal_rule", termsCopy);
            // }
            final ProvaRule goal = kb.generateGoal(new ProvaLiteral[]{lit,
                    kb.generateLiteral("fail")});
            if ("async".equals(protocol)) {
                prova.submitAsync(partitionKey(cid), goal,
                        ProvaThreadpoolEnum.CONVERSATION);
                return true;
            } else if ("task".equals(protocol)) {
                prova.submitAsync(0, goal, ProvaThreadpoolEnum.TASK);
                return true;
            } else if ("swing".equals(protocol)) {
                prova.submitAsync(0, goal, ProvaThreadpoolEnum.SWING);
                return true;
            } else if ("self".equals(protocol) || "0".equals(dest)) {
                prova.submitAsync(0, goal, ProvaThreadpoolEnum.MAIN);
                return true;
            } else {
                // TODO: Other protocols
            }
        } catch (Exception e) {
            // TODO: For now, just log this
            log.error("{}", e);
        }
        return false;
    }

    private boolean sendMsgGround(ProvaLiteral literal,
                                  List<ProvaLiteral> newLiterals, ProvaRule query) {
        ProvaList terms = literal.getTerms();
        ProvaObject[] data = terms.getFixed();
        if (data.length == 2) {
            // Assume it is a shortened version with conversation-id and payload
            // only sent over async protocol
            final ProvaLiteral lit = new ProvaLiteralImpl(rcvMsg2, terms);
            final ProvaRule goal = kb.generateGoal(new ProvaLiteral[]{lit,
                    kb.generateLiteral("fail")});
            prova.submitAsync(partitionKey(data[0].toString()), goal,
                    ProvaThreadpoolEnum.CONVERSATION);
            return true;
        }
        String protocol = data[1].toString();
        String dest = data[2].toString();
        if ("esb".equals(protocol)) {
            if (esb == null)
                return false;
            ProvaDelayedCommand message = new ProvaESBMessageImpl(dest, terms,
                    esb);
            message.process(prova);
            return true;
        } else if ("osgi".equals(protocol)) {
            if (service == null)
                return false;
            ProvaDelayedCommand message = new ProvaServiceMessageImpl(dest,
                    terms, agent, service);
            message.process(prova);
            return true;
        }
        if (!(data[3] instanceof ProvaConstant))
            return false;
        String verb = data[3].toString();
        ProvaLiteral lit;
        ProvaList termsCopy = terms;
        // if( "eof".equals(verb) ) {
        lit = kb.generateHeadLiteral("rcvMsg", termsCopy);
        // } else {
        // termsCopy = ProvaListImpl.create(new ProvaObject[]
        // {data[0],ProvaAnyImpl.create(),termsCopy});
        // lit = kb.generateHeadLiteral("@temporal_rule", termsCopy);
        // }
        ProvaRule goal = kb.generateGoal(new ProvaLiteral[]{lit,
                kb.generateLiteral("fail")});
        if ("async".equals(protocol)) {
            String cid = data[0].toString();
            prova.submitAsync(partitionKey(cid), goal,
                    ProvaThreadpoolEnum.CONVERSATION);
            return true;
        } else if ("task".equals(protocol)) {
            prova.submitAsync(0, goal, ProvaThreadpoolEnum.TASK);
            return true;
        } else if ("swing".equals(protocol)) {
            prova.submitAsync(0, goal, ProvaThreadpoolEnum.SWING);
            return true;
        } else if ("self".equals(protocol) || "0".equals(dest)) {
            prova.submitAsync(0, goal, ProvaThreadpoolEnum.MAIN);
            return true;
        } else {
            // TODO: Other protocols
        }
        return false;
    }

    @Override
    public void sendReturnAsMsg(ProvaConstant cid, Object ret) {
        if (ret == null)
            ret = 0;
        ProvaList terms = ProvaListImpl.create(new ProvaObject[]{cid,
                ProvaConstantImpl.create("self"),
                ProvaConstantImpl.create("0"),
                ProvaConstantImpl.create("return"),
                ProvaConstantImpl.create(ret)});
        ProvaLiteral lit = kb.generateHeadLiteral("rcvMsg", terms);
        ProvaRule goal = kb.generateGoal(new ProvaLiteral[]{lit,
                kb.generateLiteral("fail")});
        prova.submitAsync(partitionKey(cid.getObject().toString()), goal,
                ProvaThreadpoolEnum.CONVERSATION);
    }

    @Override
    public boolean spawn(ProvaLiteral literal, List<ProvaLiteral> newLiterals,
                         ProvaRule query) {
        List<ProvaVariable> variables = query.getVariables();
        ProvaList terms = literal.getTerms(); // .cloneWithVariables(variables);
        ProvaObject[] data = terms.getFixed();
        ProvaObject lt = data[0];
        if (lt instanceof ProvaVariablePtr) {
            ProvaVariablePtr varPtr = (ProvaVariablePtr) lt;
            lt = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
        }
        if (lt instanceof ProvaVariable) {
            // Generate a unique conversation-id
            String cid = generateCid();
            ((ProvaVariable) lt).setAssigned(ProvaConstantImpl.create(cid));
        }
        prova.spawn((ProvaList) terms.cloneWithVariables(variables));
        return true;
    }

    @Override
    public String generateCid() {
        return prova.getAgent() + ':' + unique_iid.incrementAndGet();
    }

    private static WhereNode parse(String expr) throws Exception {
        ByteArrayInputStream rawinput = new ByteArrayInputStream(
                expr.getBytes(StandardCharsets.UTF_8));
        ANTLRInputStream input = new ANTLRInputStream(rawinput);
        WhereLexer lexer = new WhereLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        WhereParser parser = new WhereParser(tokens);

        CommonTree tree = (CommonTree) parser.expr().getTree();

        return WhereTreeVisitor.visit(tree);
    }

    @Override
    public boolean rcvMsg(ProvaGoal goal, List<ProvaLiteral> newLiterals,
                          ProvaRule query, boolean mult) {
        final ProvaLiteral literal = goal.getGoal();
        final ProvaRule copy = query.cloneRule();
        final List<ProvaVariable> variables = copy.getVariables();
        final ProvaLiteral literalClone = (ProvaLiteral) literal
                .cloneWithVariables(variables);
        final ProvaList terms = literalClone.getTerms();
        try {
            final ProvaObject[] data = terms.getFixed();
            final ProvaObject xid = data[0];
            if (!(xid instanceof ProvaConstant)
                    && !(xid instanceof ProvaVariable))
                return false;
            if (data.length != 2 && !(data[2] instanceof ProvaConstant)
                    && !(data[2] instanceof ProvaVariable))
                return false;
            final long ruleid = reaction_iid.incrementAndGet();
            final ProvaConstant tid = ProvaConstantImpl.create(ruleid);
            final boolean meta = literal.getMetadata() != null;
            if (!meta) {
                final List<ProvaLiteral> body = new ArrayList<>();
                final List<ProvaLiteral> guard = literalClone.getGuard();
                if (guard != null) {
                    body.addAll(guard);
                }
                final ProvaObject poXID = data[0];
                ProvaList headControlList;
                if (data.length == 2) {
                    final ProvaObject ctlProtocol = CTLPROTOCOL;
                    headControlList = ProvaListImpl.create(new ProvaObject[]{
                            tid, ctlProtocol, CTLFROM, EOF, terms});
                    // headControlList = ProvaListImpl.create(new ProvaObject[]
                    // {
                    // tid, terms });
                } else {
                    final ProvaObject poProtocol = data[1];
                    final ProvaObject ctlProtocol = poProtocol instanceof ProvaConstant ? poProtocol
                            : CTLPROTOCOL;
                    headControlList = ProvaListImpl.create(new ProvaObject[]{
                            tid, ctlProtocol, CTLFROM, EOF, terms});
                }
                // Add the reaction and termination rule head literals
                final ProvaLiteral head = kb.generateHeadLiteral("rcvMsg",
                        terms);
                final ProvaLiteral headControl = kb.generateLiteral(
                        "@temporal_rule_control", (ProvaList) headControlList
                                .cloneWithVariables(variables));
                final ProvaList removeList = ProvaListImpl
                        .create(new ProvaObject[]{
                                ProvaConstantImpl.create(head.getPredicate()),
                                ProvaConstantImpl.create(headControl
                                        .getPredicate()), tid, head.getTerms()});
                final ProvaLiteral removeLiteral = kb.generateLiteral(
                        "@temporal_rule_remove", removeList);

                if (!mult) {
                    body.add(removeLiteral);
                }
                final ProvaLiteral[] queryLiterals = copy.getBody();
                for (int i = 1; i < queryLiterals.length; i++) {
                    body.add((ProvaLiteral) queryLiterals[i]
                            .cloneWithVariables(variables));
                }

                final ProvaRule rule = kb.generateRule(ruleid, head,
                        body.toArray(new ProvaLiteral[]{}));
                kb.generateRule(ruleid, headControl,
                        new ProvaLiteral[]{removeLiteral});
                if (log.isDebugEnabled())
                    log.debug("Added temporal rule: " + rule);
                return false;
            }
            List<Object> groups = literal.getMetadata("group");
            List<Object> groupsAnd = literal.getMetadata("and");
            List<Object> groupsOr = literal.getMetadata("or");
            List<Object> groupsNot = literal.getMetadata("not");
            List<Object> groupsStop = literal.getMetadata("stop");
            List<Object> groupsOptional = literal.getMetadata("optional");
            List<Object> groupsCount = literal.getMetadata("count");
            List<Object> groupsSize = literal.getMetadata("size");
            List<Object> groupsPause = literal.getMetadata("pause");
            List<Object> groupsResume = literal.getMetadata("resume");
            List<Object> groupsPaused = literal.getMetadata("paused");
            Object size = null;
            Object sizeReset = null;
            Object sizeObject = null;
            if (groupsSize != null && groupsSize.size() != 0) {
                size = groupsSize.get(0);
                size = goal.lookupMetadata(size.toString(), variables);
                if (groupsSize.size() > 1) {
                    sizeReset = groupsSize.get(1);
                    sizeReset = goal.lookupMetadata(sizeReset.toString(),
                            variables);
                    if (groupsSize.size() > 2) {
                        sizeObject = groupsSize.get(2);
                        sizeObject = goal.lookupMetadata(sizeObject.toString(),
                                variables);
                    }
                }
            }
            Integer countMin = null;
            Integer countMax = null;
            // The IGNORE mode is the default
            int countMode = 0;
            if (groupsCount != null && groupsCount.size() != 0) {
                String s = groupsCount.get(0).toString();
                countMin = Integer.parseInt((String) goal.lookupMetadata(s,
                        variables));
                if (groupsCount.size() > 1) {
                    s = groupsCount.get(1).toString();
                    countMax = Integer.parseInt((String) goal.lookupMetadata(s,
                            variables));
                    if (groupsCount.size() > 2) {
                        s = groupsCount.get(2).toString();
                        if ("record".equals(s))
                            countMode = 1;
                        else if ("strict".equals(s))
                            countMode = 2;
                    } else {
                        if (countMax == -1) {
                            countMax = countMin;
                            countMode = 1;
                        }

                    }
                } else {
                    if (countMin == -1) {
                        countMin = 0;
                        countMax = 0;
                        countMode = 1;
                    } else {
                        countMax = countMin;
                        countMode = 0;
                    }
                }
            }
            List<Object> groupsTimeout = literal.getMetadata("timeout");
            Object timeout = null;
            if (groupsTimeout != null && groupsTimeout.size() != 0) {
                timeout = groupsTimeout.get(0);
                timeout = goal.lookupMetadata(timeout.toString(), variables);
            }
            List<Object> groupsTimer = literal.getMetadata("timer");
            Object timer = null;
            Object timerReset = null;
            Object timerObject = null;
            if (groupsTimer != null && groupsTimer.size() != 0) {
                timer = groupsTimer.get(0);
                timer = goal.lookupMetadata(timer.toString(), variables);
                if (groupsTimer.size() > 1) {
                    timerReset = groupsTimer.get(1);
                    timerReset = goal.lookupMetadata(timerReset.toString(),
                            variables);
                } else
                    timerReset = timer;
                if (groupsTimer.size() > 2) {
                    timerObject = groupsTimer.get(2);
                    timerObject = goal.lookupMetadata(timerObject.toString(),
                            variables);
                }
            }
            List<Object> groupsVar = literal.getMetadata("vars");
            List<Object> vars = null;
            if (groupsVar != null && groupsVar.size() != 0) {
                vars = new ArrayList<>();
                for (Object var : groupsVar) {
                    var = goal.lookupMetadata(var.toString(), variables);
                    vars.add(var);
                }
            }
            List<Object> groupsWhere = literal.getMetadata("where");
            WhereNode where = null;
            if (groupsWhere != null && groupsWhere.size() != 0) {
                where = parse(groupsWhere.get(0).toString());
            }
            final List<ProvaLiteral> body = new ArrayList<>();
            final List<ProvaLiteral> guard = literalClone.getGuard();
            if (guard != null) {
                body.addAll(guard);
            }
            final ProvaObject poXID = data[0];
            final ProvaObject poProtocol = data[1];
            final ProvaObject ctlProtocol = poProtocol instanceof ProvaConstant ? poProtocol
                    : CTLPROTOCOL;
            ProvaGroup dynamic;
            ProvaRule temporalRule;
            ProvaList headControlList = ProvaListImpl.create(new ProvaObject[]{
                    tid, ctlProtocol, CTLFROM, EOF, terms});
            // Add the reaction and termination rule head literals
            final ProvaLiteral head = kb.generateHeadLiteral("rcvMsg", terms);
            final ProvaLiteral headControl = kb.generateLiteral(
                    "@temporal_rule_control",
                    (ProvaList) headControlList.cloneWithVariables(variables));
            final RemoveList rl = new RemoveList(head.getPredicate(),
                    headControl.getPredicate(), ruleid, (ProvaList) head
                    .getTerms().cloneWithVariables(variables));
            dynamic = generateOrReuseDynamicGroup(goal, variables, ruleid, rl);
            ProvaList removeList = ProvaListImpl.create(new ProvaObject[]{
                    ProvaConstantImpl.create(head.getPredicate()),
                    ProvaConstantImpl.create(headControl.getPredicate()), tid,
                    head.getTerms()});
            final ProvaLiteral removeLiteral = kb.generateLiteral(
                    "@temporal_rule_remove", removeList);
            if (groupsWhere != null) {
                dynamic.addWhere(where);
            }
            if (dynamic != null && dynamic.getParent() != null) {
                // Composite reaction is part of another @group: add an
                // @add_group_result relation
                ProvaList addAndResultList = ProvaListImpl
                        .create(new ProvaObject[]{
                                ProvaConstantImpl.create(dynamic.getParent()
                                        .getDynamicGroup()), head.getTerms()});
                removeLiteral.setMetadata("rule", Arrays
                        .asList(new Object[]{dynamic.getParent()
                                .getDynamicGroup()}));
                body.add(kb.generateLiteral("@add_group_result",
                        addAndResultList));
                if (groupsNot != null) {
                    removeLiteral.setMetadata("not",
                            Collections.emptyList());
                    rl.setNot(true);
                }
                if (groupsTimeout != null)
                    removeLiteral.setMetadata("timeout", groupsTimeout);
                if (groupsStop != null) {
                    removeLiteral.setMetadata("stop", groupsStop);
                    rl.setOptional(groupsStop.isEmpty());
                }
                if (groupsOptional != null)
                    rl.setOptional(true);
                if (groupsPause != null)
                    removeLiteral.setMetadata("pause", groupsPause);
                if (groupsResume != null)
                    removeLiteral.setMetadata("resume", groupsResume);
                if (groupsPaused != null) {
                    removeLiteral.setMetadata("paused", groupsPaused);
                    dynamic.getParent().pause(ruleid);
                }
            } else if (groups != null && groups.size() != 0) {
                // Reaction is a member of a @group: add an @add_group_result
                // relation
                ProvaList addAndResultList = ProvaListImpl
                        .create(new ProvaObject[]{
                                ProvaConstantImpl.create(dynamic
                                        .getDynamicGroup()), head.getTerms()});
                removeLiteral.setMetadata("rule", Arrays
                        .asList(new Object[]{dynamic.getDynamicGroup()}));
                body.add(kb.generateLiteral("@add_group_result",
                        addAndResultList));
                if (groupsNot != null) {
                    removeLiteral.setMetadata("not",
                            Collections.emptyList());
                    rl.setNot(true);
                }
                if (groupsTimeout != null)
                    removeLiteral.setMetadata("timeout", groupsTimeout);
                if (groupsStop != null) {
                    removeLiteral.setMetadata("stop", groupsStop);
                    rl.setOptional(groupsStop.isEmpty());
                }
                if (groupsOptional != null)
                    rl.setOptional(true);
                if (groupsPause != null)
                    removeLiteral.setMetadata("pause", groupsPause);
                if (groupsResume != null)
                    removeLiteral.setMetadata("resume", groupsResume);
                if (groupsPaused != null) {
                    removeLiteral.setMetadata("paused", groupsPaused);
                    dynamic.pause(ruleid);
                }
                if (mult) {
                    // if( xid instanceof ProvaVariable )
                    dynamic.setTemplate(true);
                    // else
                    // removeLiteral.setMetadata("count", Arrays.asList(new
                    // Object[] {0}));
                    mult = false;
                }
            }
            if (!mult) {
                body.add(removeLiteral);
            }
            ProvaLiteral[] queryLiterals = copy.getBody();
            for (int i = 1; i < queryLiterals.length; i++) {
                body.add((ProvaLiteral) queryLiterals[i]
                        .cloneWithVariables(variables));
            }
            if (groupsSize != null) {
                if (sizeObject != null)
                    removeLiteral.setMetadata(
                            "size",
                            Arrays.asList(size, sizeReset,
                                    sizeObject));
                else if (sizeReset != null)
                    removeLiteral.setMetadata("size",
                            Arrays.asList(size, sizeReset));
                else {
                    // Lone @size determines whether the event is required
                    removeLiteral.setMetadata("size",
                            Arrays.asList(size));
                    rl.setOptional(Integer.parseInt((String) size) <= 0);
                }
            }
            if (groupsCount != null) {
                if (groupsAnd != null || groupsOr != null) {
                    // A count constraint on an exit reaction
                    dynamic.setCountMax(countMax);
                }
                removeLiteral.setMetadata(
                        "count",
                        Arrays.asList(new Object[]{countMin, countMax,
                                countMode}));
                rl.setOptional(countMin <= 0);
            }
            if (groupsTimer != null) {
                if (timerObject != null)
                    removeLiteral.setMetadata(
                            "timer",
                            Arrays.asList(timer, timerReset,
                                    timerObject));
                else if (timerReset != null)
                    removeLiteral.setMetadata("timer",
                            Arrays.asList(timer, timerReset));
                else
                    removeLiteral.setMetadata("timer",
                            Arrays.asList(timer));
            }
            if (groupsVar != null) {
                removeLiteral.setMetadata("vars", vars);
            }

            // if( poProtocol instanceof ProvaConstant && poXID instanceof
            // ProvaConstant && ((ProvaConstant)
            // poProtocol).getObject().equals("async") ) {
            // temporalRule = kb.generateLocalRule(prova,
            // partitionKey(poXID.toString()), head, body
            // .toArray(new ProvaLiteral[] {}));
            // }
            // synchronized (kb) {
            temporalRule = kb.generateRule(ruleid, head,
                    body.toArray(new ProvaLiteral[]{}));
            kb.generateRule(ruleid, headControl,
                    new ProvaLiteral[]{removeLiteral});
            if (log.isDebugEnabled())
                log.debug("Added temporal rule: "
                        + (dynamic == null ? "" : dynamic.getDynamicGroup())
                        + " " + head);
            // }

            if (dynamic != null && dynamic.isOperatorConfigured()) {
                temporalRule.setMetadata("group", Arrays
                        .asList(new Object[]{dynamic.getDynamicGroup()}));
                // if (!xid.isGround())
                // Very important: remove literal is tagged with the group
                // for open reactions
                // (i.e., reactions with free conversation-id) so that
                // when it is evaluated, there is a way to find out whether
                // the group is a template one
                // and so the rules should not be removed.
                removeLiteral.setMetadata("group", Arrays
                        .asList(new Object[]{dynamic.getDynamicGroup()}));
                if (timeout != null) {
                    long delay = ProvaTimeUtils
                            .timeIntervalInMilliseconds(timeout);
                    List<ProvaDelayedCommand> delayed = ProvaResolutionInferenceEngineImpl.delayedCommands
                            .get();
                    if (groupsAnd != null || groupsOr != null) {
                        delayed.add(new ProvaScheduleGroupCleanupImpl(dynamic,
                                delay));
                    } else {
                        delayed.add(new ProvaScheduleGroupMemberCleanupImpl(
                                xid, dynamic, head.getPredicate(), headControl
                                .getPredicate(), ruleid, delay, 0,
                                removeLiteral.getMetadata()));
                    }
                }
            } else if (dynamic == null && timeout != null) {
                // Provide for an individual timeout here
                if (timeout != null) {
                    long delay = ProvaTimeUtils
                            .timeIntervalInMilliseconds(timeout);
                    scheduleCleanup(xid, dynamic, head.getPredicate(),
                            headControl.getPredicate(), ruleid, delay, 0,
                            removeLiteral.getMetadata());
                }
            } else if (dynamic != null && timeout != null) {
                // A group member timeout
                if (timeout != null) {
                    long delay = ProvaTimeUtils
                            .timeIntervalInMilliseconds(timeout);
                    List<ProvaDelayedCommand> delayed = ProvaResolutionInferenceEngineImpl.delayedCommands
                            .get();
                    delayed.add(new ProvaScheduleGroupMemberCleanupImpl(xid,
                            dynamic, head.getPredicate(), headControl
                            .getPredicate(), ruleid, delay, 0,
                            removeLiteral.getMetadata()));
                }
            } else if (dynamic != null && timer != null) {
                // A group member timer
                if (timer != null) {
                    long delay = ProvaTimeUtils
                            .timeIntervalInMilliseconds(timer);
                    long period = ProvaTimeUtils
                            .timeIntervalInMilliseconds(timerReset);
                    List<ProvaDelayedCommand> delayed = ProvaResolutionInferenceEngineImpl.delayedCommands
                            .get();
                    if (timerObject instanceof ProvaEventsAccumulator) {
                        ProvaEventsAccumulator acc = (ProvaEventsAccumulator) timerObject;
                        Date now = new Date();
                        if (acc.getDuration() != 0) {
                            // State passed to the operator
                            // Expected end of current timer
                            Date endDate = DateUtils.addMilliseconds(
                                    acc.getStartTime(), acc.getDuration());
                            // Time remaining in the current window
                            long timeRemaining = endDate.getTime()
                                    - now.getTime();
                            if (timeRemaining > 0)
                                delay = timeRemaining;
                            else
                                delay = 0;
                        } else {
                            // Set the accumulator's start time
                            acc.setStartTime(now);
                            acc.setDuration((int) period);
                        }
                    }
                    delayed.add(new ProvaScheduleGroupMemberCleanupImpl(xid,
                            dynamic, head.getPredicate(), headControl
                            .getPredicate(), ruleid, delay, period,
                            removeLiteral.getMetadata()));
                }
            }
        } catch (Exception e) {
            throw new RuntimeException("Possible formatting error in rcvMsg: "
                    + e.getMessage());
        }
        return false;
    }

    private ProvaGroup generateOrReuseDynamicGroup(ProvaGoal goal,
                                                   List<ProvaVariable> variables, long ruleid, RemoveList rl) {
        ProvaLiteral literal = goal.getGoal();
        ProvaGroup g = null;

        List<Object> groups = literal.getMetadata("and");
        String dynamicGroup = null;
        if (groups != null && groups.size() != 0) {
            dynamicGroup = generateOrReuseDynamicGroup(
                    groups.get(0).toString(), goal, variables);
            if (tlDynamic.get() == null)
                tlDynamic.set(new HashMap<>());
            Map<String, ProvaGroup> d2g = tlDynamic.get();
            g = d2g.get(dynamicGroup);
            if (g == null) {
                g = new ProvaAndGroupImpl(dynamicGroup, groups.get(0)
                        .toString());
            } else if (g instanceof ProvaAndGroupImpl) {
                g.addTimeoutEntry(rl);
                return g;
            } else if (g instanceof ProvaBasicGroupImpl) {
                g = new ProvaAndGroupImpl(g);
            } else
                throw new RuntimeException(
                        "Event group can only have one operator");
            d2g.put(dynamicGroup, g);
            dynamic2Group.put(dynamicGroup, g);
            // if( g.isTemplate() )
            // ruleid2Group.put(ruleid, g);
            // outcomeRuleid2Group.put(ruleid, g);
            g.start(rl, ruleid2Group);
        }

        groups = literal.getMetadata("or");
        if (groups != null && groups.size() != 0) {
            if (dynamicGroup != null)
                // Both @and and @or present
                throw new RuntimeException(
                        "Multiple operators on event groups are not allowed");
            dynamicGroup = generateOrReuseDynamicGroup(
                    groups.get(0).toString(), goal, variables);
            if (tlDynamic.get() == null)
                tlDynamic.set(new HashMap<>());
            Map<String, ProvaGroup> d2g = tlDynamic.get();
            g = d2g.get(dynamicGroup);
            if (g == null) {
                g = new ProvaOrGroupImpl(dynamicGroup, groups.get(0).toString());
            } else if (g instanceof ProvaOrGroupImpl) {
                g.addTimeoutEntry(rl);
                return g;
            } else if (g instanceof ProvaBasicGroupImpl) {
                g = new ProvaOrGroupImpl(g);
            } else
                throw new RuntimeException(
                        "Event group can only have one operator");
            d2g.put(dynamicGroup, g);
            dynamic2Group.put(dynamicGroup, g);
            outcomeRuleid2Group.put(ruleid, g);
            g.start(rl, ruleid2Group);
        }

        // A @group may include a previous result in a new group or be just a
        // member of a new group
        ProvaGroup gg;
        groups = literal.getMetadata("group");
        if (groups != null && groups.size() != 0) {
            dynamicGroup = generateOrReuseDynamicGroup(
                    groups.get(0).toString(), goal, variables);
            if (tlDynamic.get() == null)
                tlDynamic.set(new HashMap<>());
            Map<String, ProvaGroup> d2g = tlDynamic.get();
            gg = d2g.get(dynamicGroup);
            if (gg == null) {
                gg = new ProvaBasicGroupImpl(dynamicGroup, groups.get(0)
                        .toString());
                d2g.put(dynamicGroup, gg);
            } else
                gg.setExtended(true);
            gg.addRemoveEntry(ruleid, rl);
            List<Object> groupsId = literal.getMetadata("id");
            if (groupsId != null && groupsId.size() != 0) {
                gg.putId2ruleid(groupsId.get(0).toString(), ruleid);
            }
            if (gg.isOperatorConfigured())
                gg.start(rl, ruleid2Group);
            if (g == null) {
                return gg;
            }
            g.setParent(gg);
            gg.addChild(g);
        }
        return g;
    }

    private String generateOrReuseDynamicGroup(String group, ProvaGoal goal,
                                               List<ProvaVariable> variables) {
        String dynamicGroup;
        if (Character.isUpperCase(group.charAt(0))) {
            // Look up the group value in the bound metadata
            dynamicGroup = goal.lookupMetadata(group, variables).toString();
        } else {
            // Generate or reuse the actual dynamic group-id
            if (tlStatic2Dynamic.get() == null)
                tlStatic2Dynamic.set(new HashMap<>());
            Map<String, String> s2d = tlStatic2Dynamic.get();
            dynamicGroup = s2d.get(group);
            // if( dynamicGroup!=null ) {
            // ProvaGroup oldGroup = dynamic2Group.get(dynamicGroup);
            // if( oldGroup!=null && oldGroup.getRemoveMap().isEmpty() )
            // // The old group instance is complete and is awaiting the results
            // publication
            // // so we need to create a new group instance
            // dynamicGroup = null;
            // }
            if (dynamicGroup == null) {
                dynamicGroup = generateCid();
                s2d.put(group, dynamicGroup);
                dynamic2Static.put(dynamicGroup, group);
            }
        }
        return dynamicGroup;
    }

    @Override
    public boolean rcvMsgP(ProvaGoal goal, List<ProvaLiteral> newLiterals,
                           ProvaRule query, boolean mult) {
        ProvaLiteral literal = goal.getGoal();
        ProvaRule copy = query.cloneRule();
        List<ProvaVariable> variables = copy.getVariables();
        ProvaLiteral literalClone = (ProvaLiteral) literal
                .cloneWithVariables(variables);
        ProvaList terms = literalClone.getTerms();
        try {
            ProvaObject[] data = terms.getFixed();
            if (!(data[0] instanceof ProvaList)
                    || !(data[1] instanceof ProvaList)
                    || !(data[2] instanceof ProvaList))
                return false;
            ProvaObject[] oInbound = ((ProvaList) data[0]).getFixed();
            ProvaObject[] oOutbound = ((ProvaList) data[1]).getFixed();
            ProvaObject[] reaction = ((ProvaList) data[2]).getFixed();
            ProvaObject[] reactionFixed = new ProvaObject[reaction.length - 1];
            System.arraycopy(reaction, 1, reactionFixed, 0,
                    reactionFixed.length);
            ProvaList reactionTerms = ProvaListImpl.create(reactionFixed);
            ProvaObject xid = reactionFixed[0];
            if (!(xid instanceof ProvaConstant)
                    && !(xid instanceof ProvaVariable))
                return false;
            if (!(reaction[2] instanceof ProvaConstant)
                    && !(reaction[2] instanceof ProvaVariable))
                return false;
            // String source = (reaction[2] instanceof ProvaConstant) ?
            // ((ProvaConstant) reaction[2]).getObject().toString() : "";
            final long ruleid = reaction_iid.incrementAndGet();
            ProvaConstant tid = ProvaConstantImpl.create(ruleid);
            List<String> inbound = new ArrayList<>();
            for (ProvaObject o : oInbound) {
                String s = ((ProvaConstant) o).getObject().toString();
                inbound.add(s);
                List<Long> ruleids = inbound2ruleids.computeIfAbsent(s, k -> new ArrayList<>());
                ruleids.add(ruleid);
            }
            List<String> outbound = new ArrayList<>();
            for (ProvaObject o : oOutbound)
                outbound.add(((ProvaConstant) o).getObject().toString());
            // ruleid2inbound.put(ruleid, inbound);
            ruleid2outbound.put(ruleid, outbound);
            ProvaLiteral head;
            ProvaLiteral headControl;
            // synchronized (kb) {
            ProvaVariable ctlProtocol = CTLPROTOCOL;
            ProvaVariable ctlFrom = CTLFROM;

            ProvaList headControlList = ProvaListImpl.create(new ProvaObject[]{
                    tid, ctlProtocol, ctlFrom, EOF, terms});
            head = kb.generateHeadLiteral("rcvMsg", reactionTerms);
            headControl = kb.generateLiteral("@temporal_rule_control",
                    (ProvaList) headControlList.cloneWithVariables(variables));

            List<ProvaLiteral> body = new ArrayList<>();
            ProvaList removeList = ProvaListImpl.create(new ProvaObject[]{
                    ProvaConstantImpl.create(head.getPredicate()),
                    ProvaConstantImpl.create(headControl.getPredicate()), tid,
                    head.getTerms()});
            List<ProvaLiteral> guard = literalClone.getGuard();
            if (guard != null) {
                body.addAll(guard);
            }
            if (data.length > 3
                    && data[3] instanceof ProvaList
                    && ((ProvaConstant) ((ProvaList) data[3]).getFixed()[0])
                    .getObject().toString().equals("condition")) {
                String symbol = ((ProvaConstant) ((ProvaList) ((ProvaList) data[3])
                        .getFixed()[1]).getFixed()[0]).getObject().toString();
                body.add(kb.generateLiteral(symbol,
                        ((ProvaList) ((ProvaList) data[3]).getFixed()[1])
                                .getFixed(), 1));
            }
            if (!mult)
                body.add(kb
                        .generateLiteral("@temporal_rule_remove", removeList));
            ProvaLiteral[] queryLiterals = copy.getBody();
            for (int i = 1; i < queryLiterals.length; i++) {
                body.add((ProvaLiteral) queryLiterals[i]
                        .cloneWithVariables(variables));
            }
            ProvaRule temporalRule = kb.generateRule(ruleid, head,
                    body.toArray(new ProvaLiteral[]{}));
            // Add end-of-reaction removal rule
            temporalRule = kb.generateRule(ruleid, headControl,
                    new ProvaLiteral[]{kb.generateLiteral(
                            "@temporal_rule_remove", removeList)});
            if (log.isDebugEnabled())
                log.debug("Added temporal rule: " + head);
            // }
        } catch (Exception ignored) {
        }
        return false;
    }

    @Override
    public void scheduleCleanup(final ProvaGroup dynamic, long delay) {
        dynamic.setTimeout(delay);
        final String dynamicGroup = dynamic.getDynamicGroup();
        TimerTask cleanup = new TimerTask() {

            @Override
            public void run() {
                // synchronized (kb) {
                removeGroup(dynamicGroup, true);
                // }
            }

        };
        ScheduledFuture<?> future = timers.schedule(cleanup, delay,
                TimeUnit.MILLISECONDS);
    }

    @Override
    public void scheduleCleanup(final ProvaObject xid, final ProvaGroup group,
                                final ProvaPredicate p1, final ProvaPredicate p2,
                                final long ruleid, final long delay, final long period,
                                final Map<String, List<Object>> metadata) {
        final String protocol = (xid == null || xid instanceof ProvaVariable) ? "self"
                : "async";
        final String cid = (xid == null || xid instanceof ProvaVariable) ? "basic"
                : ((ProvaConstant) xid).getObject().toString();
        TimerTask cleanup = new TimerTask() {

            @Override
            public void run() {
                if ("self".equals(protocol))
                    prova.executeTask(0, () -> {
                        synchronized (kb) {
                            removeTemporalRule(p1, p2, ruleid, true, null,
                                    metadata);
                        }
                    }, ProvaThreadpoolEnum.MAIN);
                else
                    prova.executeTask(partitionKey(cid), () -> {
                        synchronized (kb) {
                            removeTemporalRule(p1, p2, ruleid, true, null,
                                    metadata);
                        }
                    }, ProvaThreadpoolEnum.CONVERSATION);
            }

        };
        ScheduledFuture<?> future;
        if (period == 0) {
            future = timers.schedule(cleanup, delay, TimeUnit.MILLISECONDS);
        } else
            future = timers.scheduleAtFixedRate(cleanup, delay, period,
                    TimeUnit.MILLISECONDS);
        if (group != null)
            group.setTimerFuture(future);
    }

    @Override
    public void addMsg(ProvaList terms) {
        ProvaObject[] data = terms.getFixed();
        ProvaObject lt = data[0];

        String cid = "";
        if (lt instanceof ProvaConstant)
            // Follow up on an existing conversation
            cid = (String) ((ProvaConstant) lt).getObject();
        String prot = ((ProvaConstant) data[1]).getObject().toString();
        ProvaLiteral lit = kb.generateHeadLiteral("rcvMsg", terms);
        ProvaRule goal = kb.generateGoal(new ProvaLiteral[]{lit,
                kb.generateLiteral("fail")});
        // The CONVERSATION pool is the default (see PROVA-39)
        ProvaThreadpoolEnum dest = ProvaThreadpoolEnum.CONVERSATION;
        if ("self".equals(prot))
            dest = ProvaThreadpoolEnum.MAIN;
        else if ("task".equals(prot))
            dest = ProvaThreadpoolEnum.TASK;
        prova.submitAsync(partitionKey(cid), goal, dest);
    }


    /**
     * A simplified version of sending async messages, as used, for example,
     * in the StreamBase Prova operator
     */
    public void addMsg(String xid, Map<String, Object> msg) {
        final ProvaList terms = ProvaListImpl.create(new ProvaObject[]{
                ProvaConstantImpl.create(xid),
                ProvaMapImpl.wrapValues(msg)
        });
        ProvaObject[] data = terms.getFixed();
        ProvaLiteral lit = kb.generateHeadLiteral("rcvMsg", terms);
        ProvaRule goal = kb.generateGoal(new ProvaLiteral[]{lit,
                kb.generateLiteral("fail")});
        prova.submitAsync(partitionKey(xid), goal, ProvaThreadpoolEnum.CONVERSATION);
    }

    @Override
    public void addMsg(String xid, String agent, String verb, Object payload) {
        ProvaList terms = ProvaListImpl.create(new ProvaObject[]{
                ProvaConstantImpl.create(xid),
                ProvaConstantImpl.create("osgi"),
                ProvaConstantImpl.create(agent),
                ProvaConstantImpl.create(verb),
                payload instanceof Map<?, ?> ? ProvaMapImpl
                        .wrapValues((Map<?, ?>) payload) : ProvaConstantImpl
                        .wrap(payload)});
        ProvaLiteral lit = kb.generateHeadLiteral("rcvMsg", terms);
        ProvaRule goal = kb.generateGoal(new ProvaLiteral[]{lit,
                kb.generateLiteral("fail")});
        // The CONVERSATION pool is the default (see PROVA-39)
        ProvaThreadpoolEnum dest = ProvaThreadpoolEnum.CONVERSATION;
        prova.submitAsync(partitionKey(xid), goal, dest);
    }

    @Override
    public synchronized boolean removeTemporalRule(ProvaPredicate predicate,
                                                   ProvaPredicate predicate2, long key, boolean recursive,
                                                   ProvaList reaction, Map<String, List<Object>> metadata) {
        boolean rc = true;
        if (log.isDebugEnabled() && reaction != null)
            log.debug("Removing " + reaction + " at " + key + " with "
                    + metadata);
        if (reaction == null && log.isDebugEnabled())
            log.debug("Removing on timeout");
        ProvaGroup group = ruleid2Group.get(key);

        List<Object> groups = null;
        if (metadata != null)
            groups = metadata.get("group");
        boolean avoidRemovingRule = false;
        if (group == null && metadata == null) {
            group = outcomeRuleid2Group.get(key);
        }
        if (group == null && metadata != null) {
            String dynamic;
            if (groups != null) {
                dynamic = groups.get(0).toString();
                group = dynamic2Group.get(dynamic);
            }
        }
        if (group != null) {
            if (group.isPermanent() || group.isTemplate())
                avoidRemovingRule = true;
            EventDetectionStatus detectionStatus = group.eventDetected(kb,
                    prova, key, reaction, metadata, ruleid2Group);
            if (detectionStatus == EventDetectionStatus.failed) {
                return false;
            }
            if (detectionStatus == EventDetectionStatus.complete) {
                removeGroup(group.getDynamicGroup(), recursive);
            } else if (detectionStatus == EventDetectionStatus.preserved)
                return rc;
        } else if (metadata != null && metadata.containsKey("count")) {
            // // TODO: This code is never executed
            // log.error("Unexpected code branch");
            List<Object> countList = metadata.get("count");
            int count = (Integer) countList.get(0);
            if (count == 0)
                // @count(0) reactions never terminate, unless they have an @id
                // and are stopped by a control reaction
                return rc;
            countList.set(0, --count);
            if (count != 0)
                return rc;
        }

        // Do not remove anything if it is a rcvMult reaction
        if (avoidRemovingRule)
            return rc;

        predicate.getClauseSet().removeTemporalClause(key);
        predicate2.getClauseSet().removeTemporalClause(key);
        if (ruleid2outbound.get(key) == null)
            return rc;
        List<String> outbound = ruleid2outbound.get(key);
        for (String s : outbound) {
            // Ids of temporal rules to remove
            List<Long> inbound = inbound2ruleids.get(s);
            if (inbound == null)
                continue;
            if (recursive) {
                for (Iterator<Long> iter = inbound.iterator(); iter.hasNext(); ) {
                    long i = iter.next();
                    iter.remove();
                    removeTemporalRule(predicate, predicate2, i, false,
                            reaction, metadata);
                }
            }
            inbound2ruleids.remove(s);
        }
        ruleid2outbound.remove(key);
        outcomeRuleid2Group.remove(key);
        return rc;
    }

    /**
     * Remove a dynamic group
     *
     * @param dynamicGroup
     * @param recursive
     */
    private void removeGroup(String dynamicGroup, boolean recursive) {
        ProvaGroup group = dynamic2Group.get(dynamicGroup);
        if (group != null && !group.isExtended()) {
            group.stop();
        }

        List<ProvaDelayedCommand> delayed = ProvaResolutionInferenceEngineImpl.delayedCommands
                .get();
        if (delayed == null) {
            // Running from a timed task: remove the dynamic group for good
            // synchronized(group) {
            cleanupGroup(dynamicGroup);
            // }
            // new ProvaGroupCleanupImpl(dynamicGroup).process(prova);
            return;
        }

        // Running from a goal: restore the group name to dynamic group mapping
        // into ThreadLocal.
        // This is needed in case there is a follow-up reaction for the same
        // group name.
        // Should there be no follow-up in the remainder of the goal, the
        // dynamic group will go for good.
        delayed.add(new ProvaGroupCleanupImpl(dynamicGroup));
        if (tlStatic2Dynamic.get() == null)
            tlStatic2Dynamic.set(new HashMap<>());
        Map<String, String> s2d = tlStatic2Dynamic.get();
        s2d.put(dynamic2Static.get(dynamicGroup), dynamicGroup);

        if (group != null) {
            if (tlDynamic.get() == null)
                tlDynamic.set(new HashMap<>());
            Map<String, ProvaGroup> d2g = tlDynamic.get();
            d2g.put(dynamicGroup, group);
        }

    }

    @Override
    public void cleanupGroup(String dynamicGroup) {
        ProvaGroup group = dynamic2Group.get(dynamicGroup);
        if (group != null && group.isExtended()) {
            // Do not clean up if the reaction group was extended with a new
            // reaction
            // Clear the 'extended' flag
            group.setExtended(false);
            return;
        }
        dynamic2Static.remove(dynamicGroup);
        if (group != null) {
            synchronized (kb) {
                group.cleanup(kb, prova, ruleid2Group, dynamic2Group);
            }
        }
    }

    @Override
    public void addGroupResult(ProvaList terms) {
        ProvaObject[] fixed = terms.getFixed();
        String dynamicGroup = (String) ((ProvaConstant) fixed[0]).getObject();
        ProvaGroup group = dynamic2Group.get(dynamicGroup);
        if (group != null) {
            if (group.isTemplate()) {
                dynamicGroup = this.generateCid();
                group = group.clone();
                group.setDynamicGroup(dynamicGroup);
                group.setTemplate(false);
                group.start(ruleid2Group);
                dynamic2Group.put(dynamicGroup, group);
                if (log.isDebugEnabled()) {
                    log.debug("Group " + dynamicGroup
                            + " is a template/concrete");
                }
            }
            group.addResult((ProvaList) fixed[1]);
            // Generate or reuse the actual dynamic group-id
            if (tlStatic2Dynamic.get() == null)
                tlStatic2Dynamic.set(new HashMap<>());
            Map<String, String> s2d = tlStatic2Dynamic.get();
            s2d.putIfAbsent(group.getStaticGroup(), dynamicGroup);
            if (tlDynamic.get() == null)
                tlDynamic.set(new HashMap<>());
            Map<String, ProvaGroup> d2g = tlDynamic.get();
            d2g.putIfAbsent(dynamicGroup, group);
        } else if (log.isDebugEnabled()) {
            log.debug("Group " + dynamicGroup + " is missing");
        }

    }

    public static void cleanupThreadlocals() {
        tlStatic2Dynamic.remove();
        tlDynamic.remove();
    }

    @Override
    public void stop() {
        timers.shutdownNow();
    }

    @Override
    public void setService(ProvaMiniService service) {
        this.service = service;
    }

}
