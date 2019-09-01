package org.provarules.reference2;

import org.provarules.agent2.ProvaReagent;
import org.provarules.kernel2.*;
import org.provarules.reference2.builtins.ProvaFailImpl;
import org.provarules.reference2.messaging.ProvaDelayedCommand;
import org.provarules.reference2.messaging.ProvaMessengerImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class ProvaResolutionInferenceEngineImpl implements ProvaResolutionInferenceEngine {

    private final static Logger log = LoggerFactory.getLogger("prova");

    private ProvaKnowledgeBase kb;

    private Stack<ProvaDerivationNode> tabledNodes;

    private ProvaDerivationNode node;

    private ProvaDerivationStepCounter counter;

    private ProvaReagent prova;

    public static ThreadLocal<List<ProvaDelayedCommand>> delayedCommands = new ThreadLocal<>();

    public ProvaResolutionInferenceEngineImpl(ProvaKnowledgeBase kb, ProvaRule query) {
        this.kb = kb;

        tabledNodes = new Stack<>();
        counter = new ProvaDerivationStepCounter();
        node = new ProvaDerivationNodeImpl();
        node.setFailed(true);
        node.setId(counter.next());
        node.setCut(false);
        node.setQuery(query);
        node.setCurrentGoal(new ProvaGoalImpl(query));
    }

    @Override
    public ProvaDerivationNode run() {
        // This might be set if it is a nested resolution run, for example, from consult()
        List<ProvaDelayedCommand> delayed0 = delayedCommands.get();
        try {
            if (delayed0 == null) {
                final ArrayList<ProvaDelayedCommand> delayed = new ArrayList<>();
                delayedCommands.set(delayed);
            }
            return _run();
        } finally {
            if (delayedCommands != null) {
                List<ProvaDelayedCommand> delayed = delayedCommands.get();
                for (Iterator<ProvaDelayedCommand> iter = delayed.iterator(); iter.hasNext(); ) {
                    ProvaDelayedCommand message = iter.next();
                    iter.remove();
                    message.process(prova);
                }
                if (delayed0 == null)
                    delayedCommands.remove();
            }
            ProvaMessengerImpl.cleanupThreadlocals();
        }
    }

    private ProvaDerivationNode _run() {
        List<ProvaLiteral> newLiterals = new ArrayList<>(100);
        tabledNodes.push(node);
        ProvaRule query;
        while (!tabledNodes.empty()) {
            node = tabledNodes.pop();
            query = node.getQuery();
            if (log.isDebugEnabled())
                log.debug("{}", query);
            final ProvaGoal goal = node.getCurrentGoal();

            if (goal == null) {
                node.setFailed(true);
                return node; // fail
            }

            ProvaLiteral goalLiteral = goal.getGoal();
            ProvaPredicate predicate = goalLiteral.getPredicate();
            if (predicate instanceof ProvaFailImpl) {
                if (node.getParent() == null) {
                    node.setFailed(true);
                    return node; // fail
                }
                node = node.getParent();
                tabledNodes.push(node);
                continue;
            }

            final String symbol = predicate.getSymbol();
            if (symbol.equals("metadata")) {
                goal.updateMetadataGoal();
                goalLiteral = goal.getGoal();
                predicate = goalLiteral.getPredicate();
            }

            if (predicate instanceof ProvaBuiltin) {
                ProvaBuiltin builtin = (ProvaBuiltin) predicate;
                newLiterals.clear();
                boolean result = builtin.process_(prova, node, goal, newLiterals, query);
                if (!result) {
                    node = node.getParent();
                } else {
                    final int size = newLiterals.size();
                    if (size == 1) {
                        // New substitute goal has appeared
                        query.replaceTopBodyLiteral(newLiterals);
                        // Goal update is sufficient
                        goal.update();
                    } else if (size > 1) {
                        // This is interpreted as more than one literal replacing the current (top) goal.
                        // Non-deterministic choice is dealt with inside the built-ins that can create
                        //    virtual predicate (see, for example, ProvaElementImpl).
                        query.replaceTopBodyLiteral(newLiterals);
                        // This requires a new goal
                        node.setCurrentGoal(new ProvaGoalImpl(query));
                    } else {
                        boolean fail = query.advance();
                        if (fail) {
                            if (node.getParent() == null) {
                                node.setFailed(true);
                                return node; // fail
                            }
                            node = node.getParent();
                            tabledNodes.push(node);
                            continue;
                        }
                        // Goal update is sufficient
                        goal.update();
                    }
                }
                if (node != null)
                    tabledNodes.push(node);
                continue;
            }

            if ("cut".equals(symbol)) {
                // Check for cut
                boolean isCut = checkCut(node, goal);
                if (isCut) {
                    tabledNodes.push(node);
                    continue;
                }
            }

            ProvaDerivationNode newNode = null;
            ProvaUnification unification;
            goal.updateGround();
            while ((unification = goal.nextUnification(kb)) != null) {
                boolean result = unification.unify();
                if (!result)
                    continue;
                if (log.isDebugEnabled())
                    log.debug(">>> [" + unification.getTarget().getMetadata() + ']' + unification.getTarget().getSourceCode());
                ProvaRule newQuery = unification.generateQuery(symbol, kb, query, node);
                if (goal.isSingleClause()) {
                    node.setCurrentGoal(new ProvaGoalImpl(newQuery));
                    node.setQuery(newQuery);
                    break;
                }
                newNode = new ProvaDerivationNodeImpl();
                newNode.setQuery(newQuery);
                newNode.setParent(node);
                newNode.setId(counter.next());
                newNode.setCut(false);
                newNode.setCurrentGoal(new ProvaGoalImpl(newQuery));
                tabledNodes.push(newNode);
                break;
            }

            if (goal.isSingleClause()) {
                tabledNodes.push(node);
                continue;
            }

            if (newNode == null) {
                node = node.getParent();
                if (node != null)
                    tabledNodes.push(node);
            }
        }
        return null;
    }

    /**
     * Check whether a goal has a cut.
     *
     * @param node
     * @param goal
     * @return 0, if no cut found; otherwise, the node-id of the CUT
     */
    private boolean checkCut(final ProvaDerivationNode node, final ProvaGoal goal) {
        // The assumption is that cuts are only occurring in instances of TmpClause
        // in the first proof step, goal is an instance of Fact (originating from the query),
        // but then the predicate cannot be a cut anyway
        boolean rc = false;
        ProvaRule query = goal.getQuery();
        ProvaLiteral top = query.getTop();
        String symbol = top.getPredicate().getSymbol();
        while ("cut".equals(symbol)) {
            rc = true;
            ProvaObject ref = top.getTerms().getFixed()[0];
            if (ref instanceof ProvaVariablePtr) {
                log.error("{}", ref);
            }
            ProvaDerivationNode cutNode = (ProvaDerivationNode) ((ProvaConstant) ref).getObject();
            ProvaGoal cutGoal = cutNode.getCurrentGoal();
            cutGoal.setCut(true);
            cutNode.setCut(true);
            query.advance();
            top = query.getTop();
            goal.setGoal(top);
            // This is key: avoid backtracking all the way back to the cut node's parent
            node.setParent(cutNode.getParent());
            if (top == null)
                break;
            symbol = top.getPredicate().getSymbol();
        }
        if (rc) {
            node.setCurrentGoal(new ProvaGoalImpl(query));
        }
        return rc;
    }

    public void setKb(ProvaKnowledgeBase kb) {
        this.kb = kb;
    }

    public ProvaKnowledgeBase getKb() {
        return kb;
    }

    @Override
    public void setReagent(ProvaReagent prova) {
        this.prova = prova;
    }

}
