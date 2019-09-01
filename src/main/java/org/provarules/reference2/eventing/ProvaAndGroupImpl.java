package org.provarules.reference2.eventing;

import org.provarules.agent2.ProvaReagent;
import org.provarules.kernel2.*;
import org.provarules.reference2.ProvaListImpl;
import org.provarules.reference2.ProvaLiteralImpl;
import org.provarules.reference2.messaging.RemoveList;
import org.provarules.reference2.messaging.where.WhereNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ProvaAndGroupImpl extends ProvaBasicGroupImpl {

    private final static Logger log = LoggerFactory.getLogger("prova.eventing");

    private class MetaVars {
        // Bound metadata variables
        public Map<Object, Object> vars;
        // Results index
        public ProvaList result;

        MetaVars(ProvaList result, Map<Object, Object> varList) {
            this.result = result;
            this.vars = new HashMap<>(varList);
        }
    }

    private class MetaVarsKey {
        MetaVarsKey(String dynamicGroup, long ruleid) {
            this.dynamicGroup = dynamicGroup;
            this.ruleid = ruleid;
        }

        String dynamicGroup;
        public long ruleid;
    }

    private ConcurrentMap<MetaVarsKey, List<MetaVars>> varResults;

    private List<Object> local;

    public ProvaAndGroupImpl(String dynamicGroup, String staticGroup) {
        super(dynamicGroup, staticGroup);
        results = new ArrayList<>();
        varResults = new ConcurrentHashMap<>();
    }

    public ProvaAndGroupImpl(ProvaGroup g) {
        super((ProvaBasicGroupImpl) g);
        results = new ArrayList<>();
        varResults = new ConcurrentHashMap<>();
    }

    @Override
    public ProvaGroup clone() {
        ProvaAndGroupImpl g = new ProvaAndGroupImpl(this);
        g.adjustClone(this);
        return g;
    }

    @Override
    public String getOperatorName() {
        return "and";
    }

    @Override
    public boolean isGroupFailed() {
        return /*results.isEmpty() ||*/ (!removeMap.isEmpty() && local == null);
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

        boolean dynamicContext = false;
        boolean noMatches = false;
        if (metadata != null && metadata.containsKey("vars")) {
            dynamicContext = true;
            List<Object> vars = metadata.get("vars");
            Map<Object, ProvaObject> contextVarsMap = ProvaLiteralImpl.tlVars.get();
            Map<Object, Object> varsMap = new HashMap<>(contextVarsMap.size());

            // Clean up assignments
            for (Object var : vars) {
                Object o = contextVarsMap.remove(((ProvaVariable) var).getName());
                varsMap.put(((ProvaVariable) var).getName(), o instanceof ProvaConstant ? ((ProvaConstant) o).getObject() : o);
            }

            // Find new full AND solutions
            List<List<ProvaList>> matches = findFullAnd(ruleid, varsMap, reaction, ruleid2Group, metadata);
            if (matches == null)
                // Strict mismatch against vars values set by another, already closed channel
                return EventDetectionStatus.failed;
            addVarResults(ruleid, varsMap, (ProvaList) reaction.cloneWithVariables(null));

            if (!matches.isEmpty()) {
                this.lastReaction = reaction;
                List<List<ProvaList>> localResults = nextResults(0, matches);
                for (List<ProvaList> localResult : localResults) {
                    local = new ArrayList<>(localResult.size());
                    for (ProvaList result : localResult)
                        local.add(result.cloneWithVariables(null));
                    sendGroupResults(local, kb, prova);
                    if (countMax > 0 && numEmitted == countMax) {
                        this.lastReaction = reaction;
                        return EventDetectionStatus.complete;
                    }
                }
            } else {
                noMatches = true;
            }
            local = null;

        }

        boolean not = metadata != null && metadata.containsKey("not");
        // Note that @count is only used with @and groups but @size is used with @or groups
        if (metadata != null && metadata.containsKey("count")) {
            List<Object> countList = metadata.get("count");
            int countMin = (Integer) countList.get(0);
            int countMax = (Integer) countList.get(1);
            int countMode = (Integer) countList.get(2);
            if (reaction == null) {
                // Cleaning up this reaction due to timeout
                if (not) {
                    if (countMin != 0)
                        // Minimum number of events is not yet reached
                        removeMap.get(ruleid).setOptional(true);
                    else if (countMode != 2 || countMax != 0) {
                        // Beyond the minimum of a non-strict mode interval or within the maximum of a strict mode interval
                        if (log.isDebugEnabled())
                            log.debug("@and not complete" + results);
                        this.failed = true;
                        return EventDetectionStatus.complete;
                    } else
                        removeMap.get(ruleid).setOptional(true);
                } else {
                    if (countMin > 0) {
                        // Fail at reaction timeout due to not enough events
                        if (log.isDebugEnabled())
                            log.debug("@and not complete" + results);
                        this.failed = true;
                        return EventDetectionStatus.complete;
                    } else
                        reaction = ProvaListImpl.emptyRList;
                }
            } else {
                if (!not && countMax == 0 && countMode == 2) {
                    // Strict mode failure due to too many events
                    if (log.isDebugEnabled())
                        log.debug("@and not complete" + results);
                    this.failed = true;
                    lastReaction = reaction;
                    return EventDetectionStatus.complete;
                }
                if (countMin > 0)
                    countList.set(0, --countMin);
                if (not) {
                    // Negated
                    if (countMin != 0)
                        // Minimum number of events is not yet reached
                        removeMap.get(ruleid).setOptional(true);
                    else if (countMode != 2) {
                        // Beyond the minimum of a non-strict mode interval
                        if (log.isDebugEnabled())
                            log.debug("@and not complete" + results);
                        this.failed = true;
                        return EventDetectionStatus.complete;
                    } else
                        removeMap.get(ruleid).setOptional(countMax == 0);
                }
                if (countMax > 0)
                    countList.set(1, --countMax);
                if (log.isDebugEnabled())
                    log.debug("{}", countMin);
                if (!not && countMin == 0 && removeMap.containsKey(ruleid))
                    // Necessary minimum events have arrived, further events are now optional
                    removeMap.get(ruleid).setOptional(true);
                if (not || countMax != 0 || countMode != 0 || countMin != 0)
                    // Either negated or the max not reached or it is reached and the mode is not IGNORE or we are under countMin yet
                    return EventDetectionStatus.preserved;
            }
        } else
            ruleid2Group.remove(ruleid);
        if (!this.isPermanent()) {
            RemoveList r0 = removeMap.remove(ruleid);
            if (r0 != null && !this.isTemplate()) {
                r0.getP1().getClauseSet().removeTemporalClause(ruleid);
                r0.getP2().getClauseSet().removeTemporalClause(ruleid);
            }
        }
        if (reaction == null
                || (metadata != null
                && (not || (metadata.containsKey("stop") && metadata.get("stop").isEmpty())))) {
            // Fail a negated reaction not under timeout
            this.failed = reaction != null && not;
            if (this.failed) {
                if (log.isDebugEnabled())
                    log.debug("@and not complete" + results);
                return EventDetectionStatus.complete;
            }
            if (!dynamicContext && isAndComplete(ruleid2Group)) {
                // @and is complete (but may be extended by subsequent reactions in a sequence)
                if (log.isDebugEnabled())
                    log.debug("@and complete" + results);
                this.setExtended(false);
                this.failed = false;
            } else
                this.failed = true;
            return EventDetectionStatus.complete;
        }
        if (metadata != null && metadata.containsKey("stop") && !metadata.get("stop").isEmpty()) {
            // This group member reaction stops other reaction(s)
            List<Object> toStop = metadata.get("stop");
            for (Object ido : toStop) {
                if (!(ido instanceof String))
                    continue;
                String id = (String) ido;
                long ruleidToStop = id2ruleid.get(id);
                RemoveList r = removeMap.get(ruleidToStop);
                if (r == null) {
                    ruleid2Group.remove(ruleidToStop);
                    removeMap.remove(ruleidToStop);
                    continue;
                }
                if (!r.isOptional()) {
                    // No chance to satisfy this
                    this.failed = true;
                    return EventDetectionStatus.complete;
                }
                ruleid2Group.remove(ruleidToStop);
                removeMap.remove(ruleidToStop);
                r.getP1().getClauseSet().removeTemporalClause(ruleidToStop);
                r.getP2().getClauseSet().removeTemporalClause(ruleidToStop);
            }
        }
        if (!dynamicContext && isAndComplete(ruleid2Group)) {
            // @and is complete (but may be extended by subsequent reactions in a sequence)
            if (log.isDebugEnabled())
                log.debug("@and complete" + results);
            this.setExtended(false);
            this.lastReaction = reaction;
            return EventDetectionStatus.complete;
        }
        if (noMatches && removeMap.isEmpty())
            return EventDetectionStatus.failed;
        return EventDetectionStatus.incomplete;
    }

    private List<List<ProvaList>> nextResults(int offset, List<List<ProvaList>> matches) {
        if (offset == matches.size())
            return Collections.emptyList();
        List<List<ProvaList>> out = new ArrayList<>();
        List<List<ProvaList>> remainder = nextResults(offset + 1, matches);
        for (ProvaList match : matches.get(offset)) {
            if (remainder.isEmpty()) {
                out.add(Arrays.asList(match));
            } else {
                for (List<ProvaList> r : remainder) {
                    List<ProvaList> n = new ArrayList<>();
                    n.add(match);
                    n.addAll(r);
                    out.add(n);
                }
            }
        }
        return out;
    }

    private List<List<ProvaList>> findFullAnd(
            long ruleid,
            Map<Object, Object> varsMap,
            ProvaList reaction,
            Map<Long, ProvaGroup> ruleid2Group,
            Map<String, List<Object>> metadata) {
        List<List<ProvaList>> matches = new ArrayList<>();
        for (Entry<MetaVarsKey, List<MetaVars>> e : varResults.entrySet()) {
            if (e.getKey().dynamicGroup != dynamicGroup || e.getKey().ruleid == ruleid)
                // Only compare with the same reaction group instance
                //    and avoid self-comparing
                continue;
            List<ProvaList> legMatches = new ArrayList<>();
            for (MetaVars values : e.getValue()) {
                boolean matching = true;
                for (Entry<Object, Object> e2 : values.vars.entrySet()) {
                    Object other = varsMap.get(e2.getKey());
                    if (other != null && !e2.getValue().equals(other)) {
                        matching = false;
                        break;
                    }
                }
                if (!matching && !metadata.containsKey("count") && ruleid2Group.get(e.getKey()) == null)
                    return null;
                if (where != null) {
                    // Check the WHERE constraints
                    for (WhereNode w : where) {
                        boolean r = w.evaluate(varsMap, values.vars);
                        if (!r) {
                            matching = false;
                            break;
                        }
                    }
                }
                if (matching) {
                    if (log.isDebugEnabled())
                        log.debug("Matching");
                    legMatches.add(values.result);
                }
            }
            if (!legMatches.isEmpty())
                matches.add(legMatches);
        }
        if (!matches.isEmpty())
            matches.add(Collections.singletonList(reaction));
        return matches;
    }

    private void addVarResults(long ruleid, Map<Object, Object> varsMap, ProvaList reaction) {
        List<MetaVars> vars = varResults.get(ruleid);
        if (vars == null) {
            vars = new ArrayList<>();
            varResults.put(new MetaVarsKey(dynamicGroup, ruleid), vars);
        }
        MetaVars mv = new MetaVars(reaction, varsMap);
        vars.add(mv);
    }

    private boolean isAndComplete(Map<Long, ProvaGroup> ruleid2Group) {
        if (isPermanent())
            removeMap.clear();
        if (removeMap.isEmpty())
            return true;
        if (countMax != 0)
            for (Entry<Long, RemoveList> e : removeMap.entrySet())
                if (!e.getValue().isOptional() && !(timeout == 0 && e.getValue().isNot()))
                    return false;
        for (Entry<Long, RemoveList> e : removeMap.entrySet()) {
            long ruleid = e.getKey();
            ruleid2Group.remove(ruleid);
            RemoveList r = removeMap.get(ruleid);
            r.getP1().getClauseSet().removeTemporalClause(ruleid);
            r.getP2().getClauseSet().removeTemporalClause(ruleid);
        }
        removeMap.clear();
        return true;
    }

    @Override
    public boolean isOperatorConfigured() {
        return true;
    }

    @Override
    public void childFailed(ProvaGroup child, Map<Long, ProvaGroup> ruleid2Group, Map<String, ProvaGroup> dynamic2Group) {
        children.removeIf(provaGroup -> child == provaGroup);
        this.lastReaction = null;
        immediateCleanup(ruleid2Group, dynamic2Group);
    }

}
