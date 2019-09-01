package org.provarules.reference2;

import org.provarules.kernel2.*;
import org.provarules.reference2.builtins.ProvaFailImpl;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class ProvaUnificationImpl implements ProvaUnification {

    private ProvaRule source;

    private ProvaRule target;

    private long sourceRuleId;

    private long targetRuleId;

    private List<ProvaVariable> sourceVariables;

    private List<ProvaVariable> targetVariables;

    private List<ProvaList> meta;

    public ProvaUnificationImpl(ProvaRule source, ProvaRule target) {
        init(source, target, true);
    }

    public ProvaUnificationImpl(ProvaRule source, ProvaRule target, boolean cloneTarget) {
        init(source, target, cloneTarget);
    }

    private void init(ProvaRule source, ProvaRule target, boolean cloneTarget) {
        this.source = source;
        this.target = target;
        this.sourceRuleId = source.getRuleId();
        this.targetRuleId = target.getRuleId();
        this.sourceVariables = source.getVariables();
        if (cloneTarget)
            this.targetVariables = target.cloneVariables();
        else
            this.targetVariables = target.getVariables();
    }

    public void setSource(ProvaRule source) {
        this.source = source;
    }

    @Override
    public ProvaRule getSource() {
        return source;
    }

    public void setTarget(ProvaRule target) {
        this.target = target;
    }

    @Override
    public ProvaRule getTarget() {
        return target;
    }

    public void setSourceRuleId(long sourceRuleId) {
        this.sourceRuleId = sourceRuleId;
    }

    @Override
    public long getSourceRuleId() {
        return sourceRuleId;
    }

    public void setTargetRuleId(long targetRuleId) {
        this.targetRuleId = targetRuleId;
    }

    @Override
    public long getTargetRuleId() {
        return targetRuleId;
    }

    public void setSourceVariables(List<ProvaVariable> sourceVariables) {
        this.sourceVariables = sourceVariables;
    }

    @Override
    public List<ProvaVariable> getSourceVariables() {
        return sourceVariables;
    }

    public void setTargetVariables(List<ProvaVariable> targetVariables) {
        this.targetVariables = targetVariables;
    }

    @Override
    public List<ProvaVariable> getTargetVariables() {
        return targetVariables;
    }

    @Override
    public boolean unify() {
        ProvaLiteral[] sourceLiterals = source.getBody();
        // TODO: throw something
//		if( sourceLiterals.length==0 )
//			throw 
        ProvaLiteral sourceLiteral = sourceLiterals[source.getOffset()];
        if (!matchMetadata(sourceLiteral, target))
            return false;
        ProvaLiteral targetLiteral = target.getHead();
        ProvaPredicate sourcePredicate = sourceLiteral.getPredicate();
        ProvaPredicate targetPredicate = targetLiteral.getPredicate();

        return sourcePredicate.equals(targetPredicate) && sourceLiteral.unify(targetLiteral, this);
    }

    private boolean matchMetadata(final ProvaLiteral sourceLiteral, final ProvaRule target) {
        Map<String, List<Object>> sourceMetadata = sourceLiteral.getMetadata();
        if (sourceMetadata == null || sourceMetadata.size() == 0)
            // No source metadata or only line number
            return true;
        Map<String, List<Object>> targetMetadata = target.getMetadata();
        if (targetMetadata == null)
            return false;
        // All requested metadata must be found in the target
        for (Entry<String, List<Object>> s : sourceMetadata.entrySet()) {
            List<Object> value = targetMetadata.get(s.getKey());
            List<Object> sValue = s.getValue();
            if (value == null)
                return false;
            boolean matched = false;
            // Either of values in the source must be present in the list of values in the target
            for (Object vo : value) {
                if (!(vo instanceof String))
                    continue;
                String v = (String) vo;
                for (Object sVo : sValue) {
                    if (!(sVo instanceof String))
                        continue;
                    String sV = (String) sVo;
                    if (sV.length() != 0 && Character.isUpperCase(sV.charAt(0))) {
                        if (meta == null)
                            // Should not normally happen
                            return false;
                        for (ProvaList m : meta) {
                            ProvaObject[] mo = m.getFixed();
                            String varName = (String) ((ProvaConstant) mo[0]).getObject();
                            ProvaObject var = mo[1];
                            if (varName.equals(sV)) {
                                if (mo[1] instanceof ProvaVariablePtr) {
                                    ProvaVariablePtr varPtr = (ProvaVariablePtr) var;
                                    var = sourceVariables.get(varPtr.getIndex()).getRecursivelyAssigned();
                                }
                                if (var instanceof ProvaVariable) {
                                    ((ProvaVariable) var).setAssigned(ProvaConstantImpl.create(v));
                                    matched = true;
                                    break;
                                } else if (var instanceof ProvaConstant) {
                                    // This allows for dynamic instantiation of metadata values from bound variables
                                    sV = (String) ((ProvaConstant) var).getObject();
                                    break;
                                }
                            }
                        }
                    }
                    if (matched)
                        break;
                    if (v.equals(sV)) {
                        matched = true;
                        break;
                    }
                }
                if (matched)
                    break;
            }
            if (!matched)
                return false;
        }
        return true;
    }

    @Override
    public ProvaLiteral[] rebuildNewGoals() {
        final ProvaLiteral[] body = target.getBody();
        int bodyLength = body == null ? 0 : body.length;
        ProvaLiteral[] goals = new ProvaLiteralImpl[bodyLength];
        for (int i = 0; i < bodyLength; i++) {
            goals[i] = body[i].rebuild(this);
        }
        return goals;
    }

    private ProvaLiteral[] rebuildNewGoals(final ProvaDerivationNode node) {
        if (target.getBody() == null || target.getBody().length == 0)
            return new ProvaLiteral[0];
        boolean allGround = true;
        for (ProvaVariable var : targetVariables) {
            if (!var.getRecursivelyAssigned().isGround()) {
                allGround = false;
                break;
            }
        }
        final ProvaLiteral[] body = target.getGuardedBody(source.getBody()[0]);
        final int bodyLength = body == null ? 0 : body.length;
        final ProvaLiteral[] goals = new ProvaLiteralImpl[bodyLength];
        for (int i = 0; i < bodyLength; i++) {
            if ("cut".equals(body[i].getPredicate().getSymbol())) {
                final ProvaVariablePtr any = (ProvaVariablePtr) body[i].getTerms().getFixed()[0];
                final ProvaConstantImpl cutnode = ProvaConstantImpl.create(node);
                if (any.getRuleId() == source.getRuleId())
                    sourceVariables.get(any.getIndex()).setAssigned(cutnode);
                else
                    targetVariables.get(any.getIndex()).setAssigned(cutnode);
                goals[i] = new ProvaLiteralImpl(body[i].getPredicate(), ProvaListImpl.create(new ProvaObject[]{cutnode}));
                continue;
            }
            goals[i] = body[i].rebuild(this);
            goals[i].setLine(body[i].getLine());
            if (allGround)
                goals[i].setGround(true);
        }
        return goals;
    }

    @Override
    public ProvaLiteral[] rebuildOldGoals(final ProvaLiteral[] body) {
        if (!isSourceSubstituted())
            return body;
        final ProvaLiteral[] goals = new ProvaLiteralImpl[body.length];
        // Index 0 contains the current goal that does not need to be rebuilt
        for (int i = 1; i < body.length; i++) {
            goals[i] = body[i].rebuildSource(this);
        }
        return goals;
    }

    private ProvaLiteral[] rebuildOldGoals(final ProvaLiteral[] body, final int offset) {
        if (body[offset].isGround())
            return body;

        final ProvaLiteral[] goals = new ProvaLiteralImpl[body.length];
        // Index offset contains the current goal that does not need to be rebuilt
        for (int i = 1 + offset; i < body.length; i++) {
            goals[i] = body[i].rebuildSource(this);
        }
        return goals;
    }

    private boolean isSourceSubstituted() {
        for (ProvaVariable variable : sourceVariables)
            if (variable.getAssigned() != null)
                return true;
        return false;
    }

    @Override
    public ProvaVariable getVariableFromVariablePtr(final ProvaVariablePtr variablePtr) {
        if (variablePtr.getRuleId() == sourceRuleId)
            return sourceVariables.get(variablePtr.getIndex());
        return targetVariables.get(variablePtr.getIndex());
    }

    @Override
    public ProvaObject rebuild(final ProvaVariablePtr variablePtr) {
        final ProvaVariable variable = getVariableFromVariablePtr(variablePtr);
//		if( variable.getAssigned()==null && variablePtr.getRuleId()==sourceRuleId )
//			return variablePtr;
        final ProvaObject assigned = variable.getRecursivelyAssigned();
        if (assigned.getClass() == ProvaConstantImpl.class)
            return assigned;
        if (assigned instanceof ProvaVariable) {
            if (((ProvaVariable) assigned).getRuleId() == targetRuleId) {
                // This is a target variable so add it to the source variables
                int index = assigned.collectVariables(targetRuleId, sourceVariables);
                return new ProvaVariablePtrImpl(
                        sourceRuleId,
                        index);
            } else {
                return new ProvaVariablePtrImpl(
                        sourceRuleId,
                        ((ProvaVariable) assigned).getIndex());
            }
        } else if (assigned instanceof ProvaList) {
            return ((ProvaList) assigned).rebuild(this);
        } else if (assigned instanceof ProvaListPtr) {
            return ((ProvaListPtr) assigned).rebuild(this);
        } else if (assigned instanceof ProvaMapImpl) {
            return ((ProvaMapImpl) assigned).rebuild(this);
        }
        return assigned;
    }

    @Override
    public ProvaObject rebuildSource(final ProvaVariablePtr variablePtr) {
        final ProvaVariable variable = getVariableFromVariablePtr(variablePtr);
        final ProvaObject assigned = variable.getRecursivelyAssigned();

        if (assigned == variable && variablePtr.getRuleId() == sourceRuleId)
            return variablePtr;
        if (assigned.getClass() == ProvaConstantImpl.class)
            return assigned;
        if (assigned instanceof ProvaVariable) {
            if (((ProvaVariable) assigned).getRuleId() == targetRuleId) {
                // This is a target variable so add it to the source variables
                int index = assigned.collectVariables(targetRuleId, sourceVariables);
                return new ProvaVariablePtrImpl(
                        sourceRuleId,
                        index);
            } else {
                return new ProvaVariablePtrImpl(
                        sourceRuleId,
                        ((ProvaVariable) assigned).getIndex());
            }
        } else if (assigned instanceof ProvaList) {
            return ((ProvaList) assigned).rebuildSource(this);
        } else if (assigned instanceof ProvaListPtr) {
            return ((ProvaListPtr) assigned).rebuildSource(this);
        } else if (assigned instanceof ProvaMapImpl) {
            return ((ProvaMapImpl) assigned).rebuildSource(this);
        }
        return assigned;
    }

    @Override
    public ProvaRule generateQuery(String symbol, ProvaKnowledgeBase kb, ProvaRule query, ProvaDerivationNode node) {
        if (sourceVariables.isEmpty()) {
            return kb.generateGoal(this, node, target.getBody(), query.getBody(), query.getOffset(), targetVariables);
        }
        final ProvaLiteral[] newGoals = rebuildNewGoals(node);
        ProvaLiteral[] oldGoals;
        ProvaRule newQuery;
        if (newGoals.length != 0 && newGoals[newGoals.length - 1].getPredicate() instanceof ProvaFailImpl) {
            // fail() predicate in the target body cuts the goal trail
            newQuery = new ProvaRuleImpl(0, null, newGoals);
        } else {
            oldGoals = rebuildOldGoals(query.getBody(), query.getOffset());
            newQuery = kb.generateRule(null, newGoals, oldGoals, query.getOffset());
            if (oldGoals == query.getBody()) {
                // Goal was ground
                if (newQuery.getVariables().isEmpty()) {
                    // Target body is fully ground
                    newQuery.setVariables(sourceVariables);
                    return newQuery;
                }
            }
        }
        return rebuild(newQuery);
    }

    private ProvaRule rebuild(final ProvaRule newQuery) {
        final int size = sourceVariables.size();
        if (size == 0)
            return newQuery;
        final ProvaVariablePtr[] varsMap = new ProvaVariablePtr[size];
        final List<ProvaVariable> newVariables = newQuery.getVariables();
        int index = 0;
        for (int i = 0; i < size; i++) {
            if (sourceVariables.get(i).getAssigned() == null) {
                varsMap[i] = new ProvaVariablePtrImpl(0, index);
                ProvaVariable newVariable = sourceVariables.get(i); //.clone();
                newVariable.setIndex(index++);
                newVariable.setRuleId(0);
                newVariables.add(newVariable);
            }
        }
        newQuery.substituteVariables(varsMap);

        return newQuery;
    }

    @Override
    public boolean targetUnchanged() {
        for (ProvaVariable var : targetVariables) {
            if (var.getAssigned() != null
                    &&
                    (!(var.getAssigned() instanceof ProvaVariable)
                            ||
                            var.getType() != ((ProvaVariable) var.getAssigned()).getType()))
                return false;
        }
        return true;
    }

    public void setMeta(List<ProvaList> meta) {
        if (meta != null)
            this.meta = meta;
    }

}
