package org.provarules.reference2.eventing;

import org.provarules.agent2.ProvaReagent;
import org.provarules.agent2.ProvaThreadpoolEnum;
import org.provarules.kernel2.*;
import org.provarules.reference2.ProvaConstantImpl;
import org.provarules.reference2.ProvaListImpl;
import org.provarules.reference2.ProvaResolutionInferenceEngineImpl;
import org.provarules.reference2.messaging.ProvaDelayedCommand;
import org.provarules.reference2.messaging.ProvaMessengerImpl;
import org.provarules.reference2.messaging.RemoveList;
import org.provarules.reference2.messaging.where.WhereNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.ScheduledFuture;

public class ProvaBasicGroupImpl implements ProvaGroup {

    private final static Logger log = LoggerFactory.getLogger("prova.eventing");

    String dynamicGroup;

    protected List<Object> results;

    RemoveList resultRemoveEntry;

    private List<RemoveList> timeoutRemoveEntries;

    Map<Long, RemoveList> removeMap;

    ProvaList lastReaction;

    protected ProvaGroup parent;

    List<ProvaGroup> children;

    protected long timeout;

    protected boolean failed = false;

    Map<String, Long> id2ruleid;

    Set<Long> paused;

    private String staticGroup;

    private boolean template;

    boolean permanent;

    private String templateDynamicGroup;

    ScheduledFuture<?> future = null;

    long numEmitted = 0;

    protected List<WhereNode> where = null;

    private boolean extended = false;

    int countMax;

    private ProvaGroup concrete = null;

    public ProvaBasicGroupImpl(String dynamicGroup, String staticGroup) {
        this.dynamicGroup = dynamicGroup;
        this.staticGroup = staticGroup;
        this.timeout = 0;
        this.template = false;
        this.templateDynamicGroup = null;
        this.permanent = false;
        this.countMax = -1;
        removeMap = new HashMap<>();
        paused = new HashSet<>();
    }

    ProvaBasicGroupImpl(ProvaBasicGroupImpl g) {
        this.dynamicGroup = g.dynamicGroup;
        this.templateDynamicGroup = g.templateDynamicGroup;
        this.staticGroup = g.staticGroup;
        this.removeMap = g.removeMap;
        this.resultRemoveEntry = g.resultRemoveEntry;
        this.timeoutRemoveEntries = g.timeoutRemoveEntries;
        this.timeout = g.timeout;
        this.children = g.children;
        this.id2ruleid = g.id2ruleid;
        this.paused = g.paused;
        this.template = g.template;
        this.permanent = g.permanent;
        this.countMax = g.countMax;
        this.future = g.future;
        if (children != null) {
            for (ProvaGroup c : children)
                c.setParent(this);
        }
        this.where = g.where;
    }

    @Override
    public ProvaGroup clone() {
        ProvaBasicGroupImpl g = new ProvaBasicGroupImpl(this);
        g.adjustClone(this);
        return g;
    }

    void adjustClone(ProvaBasicGroupImpl group) {
        permanent = true;
        templateDynamicGroup = group.dynamicGroup;
        removeMap = new HashMap<>();
        removeMap.putAll(group.removeMap);
        paused = new HashSet<>();
    }

    @Override
    public String getStaticGroup() {
        return this.staticGroup;
    }

    @Override
    public String getOperatorName() {
        return "undefined";
    }

    @Override
    public void addRemoveEntry(long ruleid, RemoveList rl) {
        removeMap.put(ruleid, rl);

    }

    @Override
    public void start(Map<Long, ProvaGroup> ruleid2Group) {
        for (Entry<Long, RemoveList> r : removeMap.entrySet())
            ruleid2Group.put(r.getKey(), this);
    }

    @Override
    public void start(RemoveList rl, Map<Long, ProvaGroup> ruleid2Group) {
        this.resultRemoveEntry = rl;
        for (Entry<Long, RemoveList> r : removeMap.entrySet())
            ruleid2Group.put(r.getKey(), this);
    }

    @Override
    public void addTimeoutEntry(RemoveList rl) {
        if (this.timeoutRemoveEntries == null)
            this.timeoutRemoveEntries = new ArrayList<>();
        this.timeoutRemoveEntries.add(rl);
    }

    @Override
    public void cleanupTimeoutEntries() {
        if (timeoutRemoveEntries == null)
            return;
        for (RemoveList rl : timeoutRemoveEntries) {
            long k = rl.getRuleid();
            rl.getP1().getClauseSet().removeTemporalClause(k);
            rl.getP2().getClauseSet().removeTemporalClause(k);
        }
    }

    @Override
    public String getDynamicGroup() {
        return this.dynamicGroup;
    }

    @Override
    public RemoveList getResultRemoveEntry() {
        return this.resultRemoveEntry;
    }

    @Override
    public Map<Long, RemoveList> getRemoveMap() {
        return this.removeMap;
    }

    @Override
    public void addResult(ProvaList result) {
        this.results.add(result);
    }

    @Override
    public EventDetectionStatus eventDetected(ProvaKnowledgeBase kb, ProvaReagent prova,
                                              long key, ProvaList reaction, Map<String, List<Object>> metadata, Map<Long, ProvaGroup> ruleid2Group) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void stop() {
        for (Entry<Long, RemoveList> e : removeMap.entrySet()) {
            if (log.isDebugEnabled())
                log.debug("{}", e);
            RemoveList r = e.getValue();
            long k = r.getRuleid();
            r.getP1().getClauseSet().removeTemporalClause(k);
            r.getP2().getClauseSet().removeTemporalClause(k);
        }
        if (children != null)
            for (ProvaGroup c : children)
                c.stop();
        // Remove any pending timers
        if (future != null)
            future.cancel(false);
    }

    @Override
    public boolean cleanup(ProvaKnowledgeBase kb, ProvaReagent prova, Map<Long, ProvaGroup> ruleid2Group, Map<String, ProvaGroup> dynamic2Group) {
        if (failed) {
            immediateCleanup(ruleid2Group, dynamic2Group);
//			System.out.println("Removed failed group: "+dynamicGroup);
            return true;
        }
        List<ProvaDelayedCommand> delayed = ProvaResolutionInferenceEngineImpl.delayedCommands.get();
        // delayed is non-null when this is run from the end-of-goal cleanup task
        if (delayed != null && !removeMap.isEmpty())
            return false;
        if (delayed == null) {
            // Timeout cleanup: add all @not reactions as results
            results.clear();
            for (Iterator<Entry<Long, RemoveList>> iter = removeMap.entrySet().iterator(); iter.hasNext(); ) {
                Entry<Long, RemoveList> e = iter.next();
                RemoveList rl = e.getValue();
                if (rl.isNot()) {
                    ProvaList reaction = rl.getReaction();
                    reaction.getFixed()[1] = ProvaConstantImpl.create("async");
                    reaction.getFixed()[2] = ProvaConstantImpl.create(0);
                    lastReaction = reaction;
//					lastReaction = ProvaListImpl.create(new ProvaObject[] {rl.getReaction().getFixed()[0],ProvaConstantImpl.create(0),reaction});
                    ProvaList reactionM = ProvaListImpl.create(new ProvaObject[]{ProvaConstantImpl.create("not"), reaction.shallowCopy()});
                    addResult(reactionM);
                    iter.remove();
                }
            }
        }
        boolean resultsSent = sendGroupResults(results, kb, prova);
        for (Entry<Long, RemoveList> e : removeMap.entrySet()) {
            long k = e.getKey();
            ruleid2Group.remove(k);
        }
        if (!resultsSent) {
            long k = resultRemoveEntry.getRuleid();
            resultRemoveEntry.getP1().getClauseSet().removeTemporalClause(k);
            resultRemoveEntry.getP2().getClauseSet().removeTemporalClause(k);
            cleanupTimeoutEntries();
        }
        if (children != null) {
            for (ProvaGroup c : children) {
                c.immediateCleanup(ruleid2Group, dynamic2Group);
            }
        }
        dynamic2Group.remove(dynamicGroup);
//		System.out.println("Removed group: "+dynamicGroup);
        if (lastReaction == null) {
            if (log.isDebugEnabled())
                log.debug("Group failed");
            if (parent != null)
                parent.childFailed(this, ruleid2Group, dynamic2Group);
        }
        return true;
    }

    @Override
    public void immediateCleanup(Map<Long, ProvaGroup> ruleid2Group, Map<String, ProvaGroup> dynamic2Group) {
        for (Entry<Long, RemoveList> e : removeMap.entrySet()) {
            long k = e.getKey();
            ruleid2Group.remove(k);
        }
        long k = resultRemoveEntry.getRuleid();
        resultRemoveEntry.getP1().getClauseSet().removeTemporalClause(k);
        resultRemoveEntry.getP2().getClauseSet().removeTemporalClause(k);
        cleanupTimeoutEntries();
        if (children != null) {
            for (ProvaGroup c : children)
                c.immediateCleanup(ruleid2Group, dynamic2Group);
        }
        dynamic2Group.remove(dynamicGroup);
        if (log.isDebugEnabled())
            log.debug("Group removed: " + dynamicGroup);
        if (future != null)
            future.cancel(false);
    }

    @Override
    public boolean isOperatorConfigured() {
        return false;
    }

    synchronized boolean sendGroupResults(List<Object> results, ProvaKnowledgeBase kb, ProvaReagent prova) {
        ProvaList content;
        if (isGroupFailed()) {
            // TODO: Is it always timeout here?
            if (log.isDebugEnabled())
                log.debug("Timeout group results: " + results);
            content = ProvaListImpl.create(new ProvaObject[]{ProvaConstantImpl.create(results)});
            if (results.isEmpty()) {
                // Timeout and no results
                if (timeoutRemoveEntries != null && !timeoutRemoveEntries.isEmpty()) {
                    lastReaction = timeoutRemoveEntries.get(0).getReaction();
                    lastReaction.getFixed()[1] = ProvaConstantImpl.create("async");
                    lastReaction.getFixed()[2] = ProvaConstantImpl.create(0);
                } else
                    return false;
            } else {
                final Object last = results.get(results.size() - 1);
                if (last instanceof ProvaList)
                    lastReaction = ((ProvaList) last).shallowCopy();
                else
                    lastReaction = this.resultRemoveEntry.getReaction();
                lastReaction.getFixed()[3] = ProvaConstantImpl.create("timeout");
                if (numEmitted != 0)
                    results.clear();
            }
        } else {
            if (log.isDebugEnabled())
                log.debug("Group results: " + results);
            content = ProvaListImpl.create(new ProvaObject[]{ProvaConstantImpl.create(results)});
            if (lastReaction == null) {
                if (log.isDebugEnabled())
                    log.debug("Empty results");
                lastReaction = resultRemoveEntry.getReaction();
                lastReaction.getFixed()[1] = ProvaConstantImpl.create("async");
                lastReaction.getFixed()[2] = ProvaConstantImpl.create(0);
            } else {
                if (lastReaction.getFixed().length == 0)
                    // A timeout expired so that strict @count is successful
                    lastReaction = (ProvaList) results.get(results.size() - 1);
                else if (lastReaction.getFixed().length == 2) {
                    final ProvaObject[] newFixed = new ProvaObject[5];
                    newFixed[0] = lastReaction.getFixed()[0];
                    newFixed[1] = ProvaConstantImpl.create("async");
                    newFixed[2] = ProvaConstantImpl.create(0);
                    newFixed[4] = lastReaction.getFixed()[1];
                    lastReaction = ProvaListImpl.create(newFixed, lastReaction.getTail());
                }
                ProvaObject o = lastReaction.getFixed()[2];
                if (o instanceof ProvaList)
                    lastReaction = (ProvaList) o;
            }
            lastReaction.getFixed()[3] = ProvaConstantImpl.create(getOperatorName());
        }
        lastReaction.getFixed()[4] = content;
        final ProvaObject cidOriginal = lastReaction.getFixed()[0];
        final String cid = cidOriginal instanceof ProvaConstant ? ((ProvaConstant) cidOriginal).getObject().toString() : "0";
        final ProvaObject cidObject = ProvaConstantImpl.create(cid);
        lastReaction.getFixed()[0] = cidObject;
        ProvaLiteral lit = kb.generateHeadLiteral("rcvMsg", lastReaction);
        Map<String, List<Object>> meta = new HashMap<>(1);
        if (this.templateDynamicGroup != null)
            meta.put("group", Arrays.asList(new Object[]{templateDynamicGroup}));
        else
            meta.put("group", Arrays.asList(new Object[]{dynamicGroup}));
        lit.addMetadata(meta);
        ProvaRule goal = kb.generateGoal(new ProvaLiteral[]{lit, kb.generateLiteral("fail")}).cloneRule();
        if (log.isDebugEnabled())
            log.debug("Sent group results: " + goal);
        if (cid.equals("0"))
            prova.submitAsync(0, goal, ProvaThreadpoolEnum.MAIN);
        else
            prova.submitAsync(ProvaMessengerImpl.partitionKey(cid), goal, ProvaThreadpoolEnum.CONVERSATION);
        numEmitted++;
        return true;
    }

    @Override
    public boolean isGroupFailed() {
        return results.size() == 0 || lastReaction == null;
    }

    @Override
    public void setParent(ProvaGroup parent) {
        this.parent = parent;
    }

    @Override
    public ProvaGroup getParent() {
        return this.parent;
    }

    @Override
    public void addChild(ProvaGroup g) {
        if (children == null)
            children = new ArrayList<>();
        children.add(g);
    }

    @Override
    public List<ProvaGroup> getChildren() {
        return this.children;
    }

    @Override
    public void childFailed(ProvaGroup child, Map<Long, ProvaGroup> ruleid2Group, Map<String, ProvaGroup> dynamic2Group) {
        throw new RuntimeException("Unsupported method");
    }

    @Override
    public void setTimeout(long delay) {
        this.timeout = delay;
    }

    @Override
    public boolean isFailed() {
        return failed;
    }

    @Override
    public void putId2ruleid(String id, long ruleid) {
        if (id2ruleid == null)
            id2ruleid = new HashMap<>();
        id2ruleid.put(id, ruleid);
    }

    @Override
    public void pause(long ruleidToPause) {
        paused.add(ruleidToPause);
    }

    void resume(long ruleidToPause) {
        paused.remove(ruleidToPause);
    }

    @Override
    public void setTemplate(boolean template) {
        this.template = template;
    }

    @Override
    public boolean isTemplate() {
        return template;
    }

    @Override
    public void setDynamicGroup(String dynamicGroup) {
        this.dynamicGroup = dynamicGroup;
    }

    @Override
    public boolean isPermanent() {
        return permanent;
    }

    @Override
    public void setTimerFuture(ScheduledFuture<?> future) {
        if (this.concrete != null)
            this.concrete.setTimerFuture(future);
        else
            this.future = future;
    }

    @Override
    public void addWhere(WhereNode newWhere) {
        if (where == null)
            where = new ArrayList<>();
        where.add(newWhere);

    }

    @Override
    public boolean isExtended() {
        return this.extended;
    }

    @Override
    public void setExtended(boolean extended) {
        this.extended = extended;
    }

    @Override
    public void setCountMax(int countMax) {
        this.countMax = countMax;
    }

    @Override
    public void setConcrete(ProvaGroup group) {
        this.concrete = group;
    }

}
