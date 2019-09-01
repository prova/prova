package org.provarules.reference2.eventing;

import org.provarules.agent2.ProvaReagent;
import org.provarules.eventing.ProvaEventsAccumulator;
import org.provarules.kernel2.ProvaKnowledgeBase;
import org.provarules.kernel2.ProvaList;
import org.provarules.reference2.ProvaListImpl;
import org.provarules.reference2.messaging.RemoveList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class ProvaOrGroupImpl extends ProvaBasicGroupImpl {

    private final static Logger log = LoggerFactory.getLogger("prova.eventing");

    public ProvaOrGroupImpl(String dynamicGroup, String staticGroup) {
        super(dynamicGroup, staticGroup);
        results = new ArrayList<>();
    }

    public ProvaOrGroupImpl(ProvaGroup g) {
        super((ProvaBasicGroupImpl) g);
        g.setConcrete(this);
        results = new ArrayList<>();
    }

    @Override
    public ProvaGroup clone() {
        ProvaOrGroupImpl g = new ProvaOrGroupImpl(this);
        g.adjustClone(this);
        return g;
    }

    @Override
    public String getOperatorName() {
        return "or";
    }

    @Override
    public EventDetectionStatus eventDetected(ProvaKnowledgeBase kb, ProvaReagent prova,
                                              long ruleid, ProvaList reaction, Map<String, List<Object>> metadata, Map<Long, ProvaGroup> ruleid2Group) {
        if (reaction == null && !removeMap.containsKey(ruleid))
            // Timeout removal of a rule that was removed before
            return EventDetectionStatus.preserved;
        if (paused.contains(ruleid)) {
            results.remove(results.size() - 1);
            return EventDetectionStatus.preserved;
        }
        // Note that @count is only used with @and groups but @size is used with @or groups
        if (metadata != null && metadata.containsKey("size")) {
            List<Object> sizeList = metadata.get("size");
            int size = Integer.parseInt(sizeList.get(0).toString());
            if (size == -1)
                return EventDetectionStatus.preserved;
            if (sizeList.size() > 2) {
                // There is a supplied accumulator
                ProvaEventsAccumulator acc = (ProvaEventsAccumulator) sizeList.get(2);
                long totalCount = acc.totalCount();
                if (Long.parseLong(sizeList.get(1).toString()) == totalCount) {
                    sizeList.set(0, 0);
                    size = 0;
                }
            } else
                sizeList.set(0, Integer.toString(--size));
            if (log.isDebugEnabled())
                log.debug("size={}", size);
            if (size != 0)
                return EventDetectionStatus.preserved;
            else if (sizeList.size() > 1) {
                this.permanent = true;
                this.lastReaction = reaction;
                if (sizeList.size() > 2) {
                    ProvaEventsAccumulator acc = (ProvaEventsAccumulator) sizeList.get(2);
                    if (this.lastReaction == null) {
                        this.lastReaction = resultRemoveEntry.getReaction();
                    }
                    this.results.clear();
                    this.results.add(acc.clone());
                    acc.clear();
                }
                this.sendGroupResults(results, kb, prova);
                if (countMax > 0 && numEmitted == countMax)
                    return EventDetectionStatus.complete;
                this.results = new ArrayList<>();
                sizeList.set(0, sizeList.get(1));
                this.lastReaction = null;
                return EventDetectionStatus.preserved;
            } else {
                ruleid2Group.remove(ruleid);
                RemoveList r = removeMap.remove(ruleid);
                if (r != null) {
                    r.getP1().getClauseSet().removeTemporalClause(ruleid);
                    r.getP2().getClauseSet().removeTemporalClause(ruleid);
                }
                if (future != null)
                    future.cancel(true);
            }
        } else if (metadata != null && metadata.containsKey("timer")) {
            List<Object> timerList = metadata.get("timer");
            if (timerList.size() > 1) {
                this.permanent = true;
                if (reaction != null) {
                    this.lastReaction = reaction;
                    return EventDetectionStatus.preserved;
                }
                if (this.lastReaction == null)
                    this.lastReaction = resultRemoveEntry.getReaction().shallowCopy();
                if (log.isDebugEnabled()) {
                    log.debug("resultRemoveEntry.getReaction(): {}", resultRemoveEntry.getReaction());
                    log.debug("Set last reaction to: {}", this.lastReaction);
                }
                this.results.clear();
                if (timerList.size() > 2) {
                    ProvaEventsAccumulator acc = (ProvaEventsAccumulator) timerList.get(2);
                    this.results.add(acc.clone());
                    acc.clear();
                    Date now = new Date();
                    acc.setStartTime(now);
                } else
                    this.results.add(ProvaListImpl.emptyRList);
                this.sendGroupResults(results, kb, prova);
                if (countMax > 0 && numEmitted == countMax)
                    return EventDetectionStatus.complete;
                this.results = new ArrayList<>();
                timerList.set(0, timerList.get(1));
                this.lastReaction = null;
                if (log.isDebugEnabled())
                    log.debug("resultRemoveEntry.getReaction(): {}", resultRemoveEntry.getReaction());
                return EventDetectionStatus.preserved;
            }
        } else {
            if (!isPermanent()) {
                ruleid2Group.remove(ruleid);
                RemoveList r = removeMap.remove(ruleid);
                if (r != null && !isTemplate()) {
                    r.getP1().getClauseSet().removeTemporalClause(ruleid);
                    r.getP2().getClauseSet().removeTemporalClause(ruleid);
                }
            }
        }
        if (metadata != null && metadata.containsKey("not")) {
            if (log.isDebugEnabled())
                log.debug("@or not complete {}", results);
            return EventDetectionStatus.preserved;
        }

        boolean isControlChannel = false;
        if (metadata != null && metadata.containsKey("pause")) {
            List<Object> toPause = metadata.get("pause");
            if (toPause.size() != 0) {
                // This processing assumes that if @pause is present,
                //     it is a pure "control" channel, not part of the group pattern
                for (Object ido : toPause) {
                    if (!(ido instanceof String))
                        continue;
                    String id = (String) ido;
                    long ruleidToPause = id2ruleid.get(id);
                    pause(ruleidToPause);
                }
            }
            isControlChannel = true;
        }
        if (metadata != null && metadata.containsKey("resume")) {
            List<Object> toResume = metadata.get("resume");
            if (toResume.size() != 0) {
                // This processing assumes that if @resume is present,
                //     it is a pure "control" channel, not part of the group pattern
                for (Object ido : toResume) {
                    if (!(ido instanceof String))
                        continue;
                    String id = (String) ido;
                    long ruleidToResume = id2ruleid.get(id);
                    resume(ruleidToResume);
                }
            }
            isControlChannel = true;
        }
        if (metadata != null && metadata.containsKey("stop")) {
            List<Object> toStop = metadata.get("stop");
            if (toStop.size() != 0) {
                for (Object ido : toStop) {
                    if (!(ido instanceof String))
                        continue;
                    String id = (String) ido;
                    long ruleidToStop = id2ruleid.get(id);
                    ruleid2Group.remove(ruleidToStop);
                    RemoveList r = removeMap.remove(ruleidToStop);
                    if (r != null) {
                        r.getP1().getClauseSet().removeTemporalClause(ruleidToStop);
                        r.getP2().getClauseSet().removeTemporalClause(ruleidToStop);
                    }
                }
                if (log.isDebugEnabled())
                    log.debug("@or stop(id) complete");
                if (isControlChannel)
                    return EventDetectionStatus.preserved;
                else
                    return EventDetectionStatus.incomplete;
            }
            failed = true;
            if (future != null)
                future.cancel(true);
            if (log.isDebugEnabled())
                log.debug("@or terminated by @stop");
        } else if (!isControlChannel) {
            if (log.isDebugEnabled()) {
                log.debug("@or complete" + results);
                log.debug("Set lastReaction to " + lastReaction);
            }
            this.lastReaction = reaction;
        }

        if (isControlChannel || (isPermanent() && !failed)) {
            this.lastReaction = null;
            return EventDetectionStatus.preserved;
        }
        removeMap.clear();
        return EventDetectionStatus.complete;
    }

    @Override
    public boolean isOperatorConfigured() {
        return true;
    }

    @Override
    public void childFailed(ProvaGroup child, Map<Long, ProvaGroup> ruleid2Group, Map<String, ProvaGroup> dynamic2Group) {
        children.removeIf(provaGroup -> child == provaGroup);
        this.lastReaction = null;
    }

}
