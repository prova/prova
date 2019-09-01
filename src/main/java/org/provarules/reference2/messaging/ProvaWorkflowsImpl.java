package org.provarules.reference2.messaging;

import org.provarules.kernel2.*;
import org.provarules.kernel2.messaging.ProvaWorkflows;
import org.provarules.reference2.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.locks.ReentrantLock;

public class ProvaWorkflowsImpl implements ProvaWorkflows {

    private final static Logger log = LoggerFactory.getLogger("prova");

    private ProvaKnowledgeBase kb;

    private ConcurrentMap<String, List<List<ProvaObject>>> join_record = new ConcurrentHashMap<>();

    private ConcurrentMap<String, Object[]> predicate_join_record = new ConcurrentHashMap<>();

    private final ConcurrentMap<String, ReentrantLock> predicate_join_locks = new ConcurrentHashMap<>();

    public ProvaWorkflowsImpl(ProvaKnowledgeBase kb) {
        this.kb = kb;
    }

    @Override
    public boolean init_join(ProvaLiteral literal,
                             List<ProvaLiteral> newLiterals, ProvaRule query) {
        List<ProvaVariable> variables = query.getVariables();
        ProvaList terms = literal.getTerms();
        ProvaList termsCopy = (ProvaList) terms.cloneWithVariables(variables);
        ProvaObject[] data = termsCopy.getFixed();
        if (!(data[0] instanceof ProvaConstant) || !(data[1] instanceof ProvaConstant))
            return false;
        // Key is XID+JoinID
        String key = ((ProvaConstant) data[0]).getObject().toString() + ((ProvaConstant) data[1]).getObject().toString();
        if (join_record.containsKey(key))
            return false;
        ProvaObject[] expectedList;
        if (data[2].getClass() == ProvaConstantImpl.class && ((ProvaConstant) data[2]).getObject() instanceof List) {
            final List list = (List) ((ProvaConstant) data[2]).getObject();
            final List<ProvaObject> wrappedList = new ArrayList<>();
            for (Object o : list) {
                wrappedList.add(ProvaMapImpl.wrap(o));
            }
            expectedList = wrappedList.toArray(new ProvaObject[wrappedList.size()]);
        } else {
            if (!(data[2] instanceof ProvaList))
                return false;
            expectedList = ((ProvaList) data[2]).getFixed();
        }
        List<ProvaObject> waiting = new ArrayList<>(Arrays.asList(expectedList));
        List<ProvaObject> complete = new ArrayList<>();
        List<List<ProvaObject>> record = new ArrayList<>();
        record.add(waiting);
        record.add(complete);
        join_record.put(key, record);
        return true;
    }

    @Override
    public boolean join_test(ProvaLiteral literal,
                             List<ProvaLiteral> newLiterals, ProvaRule query) {
        List<ProvaVariable> variables = query.getVariables();
        ProvaList terms = literal.getTerms();
        ProvaList termsCopy = (ProvaList) terms.cloneWithVariables(variables);
        ProvaObject[] data = termsCopy.getFixed();
        if (!(data[1] instanceof ProvaConstant) || !(data[2] instanceof ProvaConstant)
                || !(data[4] instanceof ProvaVariable))
            return false;
        // Key is XID+JoinID
        String key = ((ProvaConstant) data[1]).getObject().toString() + ((ProvaConstant) data[2]).getObject().toString();
        List<List<ProvaObject>> waitingAndComplete = join_record.get(key);
        if (waitingAndComplete == null)
            return false;
        ProvaLiteral goalLit = kb.generateLiteral("pred1", ProvaListImpl.create(new ProvaObject[]{data[3]}));
        ProvaRule goal = kb.generateGoal(new ProvaLiteral[]{goalLit});
        for (ListIterator<ProvaObject> iter = waitingAndComplete.get(0).listIterator(); iter.hasNext(); ) {
            ProvaObject t = iter.next().cloneWithVariables(variables);
            ProvaLiteral lit = kb.generateLiteral("pred1", ProvaListImpl.create(new ProvaObject[]{t}));
            ProvaRule rule = ProvaRuleImpl.createVirtualRule(1, lit, null);
            ProvaUnificationImpl unification = new ProvaUnificationImpl(goal, rule);
            boolean result = unification.unify();
            if (!result)
                continue;
            iter.remove();
            waitingAndComplete.get(1).add(data[3]);
            if (waitingAndComplete.get(0).isEmpty()) {
                join_record.remove(key);
                ((ProvaVariable) data[4]).setAssigned(ProvaConstantImpl.create(waitingAndComplete.get(1)));
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean init_predicate_join(ProvaLiteral literal,
                                       List<ProvaLiteral> newLiterals, ProvaRule query) {
        List<ProvaVariable> variables = query.getVariables();
        ProvaList terms = literal.getTerms();
        ProvaList termsCopy = (ProvaList) terms.cloneWithVariables(variables);
        ProvaObject[] data = termsCopy.getFixed();
        if (!(data[0] instanceof ProvaConstant) || !(data[1] instanceof ProvaConstant)
                || !(data[3] instanceof ProvaConstant) || !(data[2] instanceof ProvaList))
            return false;
        // Key is XID+JoinID
        String key = ((ProvaConstant) data[0]).getObject().toString() + ((ProvaConstant) data[1]).getObject().toString();
        if (predicate_join_record.containsKey(key))
            return false;
        ProvaObject[] expectedList = ((ProvaList) data[2]).getFixed();
        List<ProvaObject> waiting = new ArrayList<>();
        for (ProvaObject expected : expectedList) {
            if (!(expected instanceof ProvaList))
                return false;
            waiting.add(expected);
        }
        List<ProvaObject> complete = new ArrayList<>();
        predicate_join_record.put(key, new Object[]{((ProvaConstant) data[3]).getObject(), waiting, complete});
        return true;
    }

    @Override
    public boolean stop_predicate_join(ProvaLiteral literal,
                                       List<ProvaLiteral> newLiterals, ProvaRule query) {
        List<ProvaVariable> variables = query.getVariables();
        ProvaList terms = literal.getTerms();
        ProvaList termsCopy = (ProvaList) terms.cloneWithVariables(variables);
        ProvaObject[] data = termsCopy.getFixed();
        if (!(data[0] instanceof ProvaConstant) || !(data[1] instanceof ProvaConstant))
            return false;

        // Key is XID+JoinID
        String key = ((ProvaConstant) data[0]).getObject().toString() + ((ProvaConstant) data[1]).getObject().toString();
        predicate_join_record.remove(key);
        ReentrantLock lock = predicate_join_locks.get(key);
        try {
            lock.unlock();
            predicate_join_locks.remove(key);
        } catch (Exception ignored) {
        }
        return true;
    }

    @SuppressWarnings("unchecked")
    @Override
    public boolean predicate_join_test(ProvaLiteral literal,
                                       List<ProvaLiteral> newLiterals, ProvaRule query) {
        boolean rc = false;
        List<ProvaVariable> variables = query.getVariables();
        ProvaList terms = literal.getTerms();
        ProvaList termsCopy = (ProvaList) terms.cloneWithVariables(variables);
        ProvaObject[] data = termsCopy.getFixed();
        if (!(data[0] instanceof ProvaConstant) || !(data[1] instanceof ProvaConstant)
                || !(data[2] instanceof ProvaList) || !(data[3] instanceof ProvaList))
            return false;
        // Key is XID+JoinID
        String key = ((ProvaConstant) data[0]).getObject().toString() + ((ProvaConstant) data[1]).getObject().toString();
        ReentrantLock lock;
        synchronized (predicate_join_locks) {
            lock = predicate_join_locks.get(key);
            if (lock == null) {
                lock = new ReentrantLock();
                predicate_join_locks.put(key, lock);
            }
            lock.lock();
        }
        try {
            Object[] value = predicate_join_record.get(key);
            String joinPredicate = (String) value[0];
            List<ProvaList> complete = (List<ProvaList>) value[2];
            if (value[1] instanceof Long) {
                // TODO: timeout processing
            } else {
                ProvaLiteral goalLit = kb.generateLiteral("pred1", (ProvaList) data[2]);
                ProvaRule goal = kb.generateGoal(new ProvaLiteral[]{goalLit});
                List<ProvaList> waiting = (List<ProvaList>) value[1];
                for (ListIterator<ProvaList> iter = waiting.listIterator(); iter.hasNext(); ) {
                    ProvaList t = (ProvaList) iter.next().cloneWithVariables(variables);
                    ProvaLiteral lit = kb.generateLiteral("pred1", t);
                    ProvaRule rule = ProvaRuleImpl.createVirtualRule(1, lit, null);
                    ProvaUnificationImpl unification = new ProvaUnificationImpl(goal, rule);
                    boolean result = unification.unify();
                    if (!result)
                        continue;
                    iter.remove();
                    complete.add((ProvaList) data[2]);
                    ((ProvaVariable) data[4]).setAssigned(ProvaConstantImpl.create(joinPredicate));
                    ((ProvaVariable) data[5]).setAssigned(ProvaConstantImpl.create(waiting));
                    ((ProvaVariable) data[6]).setAssigned(ProvaConstantImpl.create(complete.size()));
                    ((ProvaVariable) data[7]).setAssigned(ProvaConstantImpl.create(complete));
                    rc = true;
                    break;
                }
            }
        } finally {
            if (!rc)
                lock.unlock();
        }
        return rc;
    }

    @SuppressWarnings("unchecked")
    @Override
    public boolean predicate_join_exit(ProvaLiteral literal,
                                       List<ProvaLiteral> newLiterals, ProvaRule query) {
        List<ProvaVariable> variables = query.getVariables();
        ProvaList terms = literal.getTerms();
        ProvaList termsCopy = (ProvaList) terms.cloneWithVariables(variables);
        ProvaObject[] data = termsCopy.getFixed();
        if (!(data[0] instanceof ProvaConstant) || !(data[1] instanceof ProvaConstant))
            return false;
        // Key is XID+JoinID
        String key = ((ProvaConstant) data[0]).getObject().toString() + ((ProvaConstant) data[1]).getObject().toString();
        try {
            if (!(data[2] instanceof ProvaConstant)) {

            } else {
                Object state = ((ProvaConstant) data[2]).getObject();
                if (state.equals("reset")) {
                    Object[] value = predicate_join_record.get(key);
                    if (value == null)
                        // This may happen if stop has been executed from another thread
                        return false;
                    if (value[2] instanceof Integer) {
                        // TODO: deal with reset for pattern joins
                    }
                    List<ProvaList> waiting = (List<ProvaList>) value[1];
                    List<ProvaList> complete = (List<ProvaList>) value[2];
                    waiting.addAll(complete);
                    complete.clear();
                } else if (state.equals("stop")) {
                    log.debug("Cleaning up a pattern join instance " + key);
                    predicate_join_record.remove(key);
                    // TODO: Remove the matching pattern_join_instance (available only for pattern joins)
                }
            }
        } finally {
            ReentrantLock lock = predicate_join_locks.get(key);
            lock.unlock();
        }
        return false;
    }

}
