package org.provarules.reference2;

import org.provarules.kernel2.*;

import java.util.List;

public class ProvaVariablePtrImpl implements ProvaVariablePtr {

    private static final long serialVersionUID = 9041171371747132755L;

    private long ruleId;

    private int index;

    ProvaVariablePtrImpl(final long ruleId, final int index) {
        this.ruleId = ruleId;
        this.index = index;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + index;
        result = prime * result + (int) (ruleId ^ (ruleId >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ProvaVariablePtrImpl other = (ProvaVariablePtrImpl) obj;
        if (index != other.index)
            return false;
        return ruleId == other.ruleId;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public int getIndex() {
        return index;
    }

    @Override
    public int collectVariables(final long ruleId, final List<ProvaVariable> variables) {
        return 0;
    }

//	@Override
//	public void collectVariables(long ruleId, Vector<ProvaVariable> variables, int offset) {
//	}

    /**
     * This method assumes that the variable pointers have been rebuilt and point to unassigned variables
     */
    @Override
    public int computeSize() {
        return -1;
    }

    @Override
    public ProvaObject getRecursivelyAssigned() {
        // TODO Auto-generated method stub
        return null;
    }

    public void setRuleId(long ruleId) {
        this.ruleId = ruleId;
    }

    @Override
    public long getRuleId() {
        return ruleId;
    }

    @Override
    public boolean unify(final ProvaObject target, final ProvaUnification unification) {
        ProvaObject sourceObject = unification.getVariableFromVariablePtr(this).getRecursivelyAssigned();
//		ProvaObject sourceObject = unification.getSourceVariables().get(index).getRecursivelyAssigned();
        ProvaObject targetObject;
        if (target instanceof ProvaVariablePtr) {
            ProvaVariablePtrImpl targetPtr = (ProvaVariablePtrImpl) target;
            targetObject = unification.getVariableFromVariablePtr(targetPtr).getRecursivelyAssigned();
//			targetObject = unification.getTargetVariables().get(targetPtr.index).getRecursivelyAssigned();
        } else if (target instanceof ProvaListPtr) {
            // Since Prova 3.1.9: variable pointer assigned to a list pointer case handled
            targetObject = ((ProvaListPtr) target).getAssignedWithOffset();
        } else
            targetObject = target;
        return sourceObject.unify(targetObject, unification);
    }

    @Override
    public boolean unifyReverse(final ProvaObject target, final ProvaUnification unification) {
        ProvaObject sourceObject = unification.getTargetVariables().get(index).getRecursivelyAssigned();
        ProvaObject targetObject;
        if (target instanceof ProvaVariablePtr) {
            ProvaVariablePtrImpl targetPtr = (ProvaVariablePtrImpl) target;
            targetObject = unification.getTargetVariables().get(targetPtr.index).getRecursivelyAssigned();
        } else
            targetObject = target;
        return sourceObject.unify(targetObject, unification);
    }

    public String toString() {
        return "@" + ruleId +
                ':' +
                index;
    }

    @Override
    public void substituteVariables(ProvaVariablePtr[] varsMap) {
    }

    @Override
    public boolean isGround() {
        return false;
    }

    @Override
    public String toString(final List<ProvaVariable> variables) {
        return variables.get(index).toString();
    }

    @Override
    public ProvaObject cloneWithBoundVariables(final List<ProvaVariable> variables, final List<Boolean> isConstant) {
        ProvaObject assigned = variables.get(index).getRecursivelyAssigned();
        if (assigned instanceof ProvaVariable) {
            isConstant.set(0, false);
            return new ProvaVariablePtrImpl(0, this.index);
        }
        return assigned.cloneWithBoundVariables(variables, isConstant);
    }

    @Override
    public ProvaObject cloneWithVariables(final List<ProvaVariable> variables) {
        return variables.get(index).getRecursivelyAssigned().cloneWithVariables(variables);
    }

    @Override
    public ProvaObject cloneWithVariables(final long ruleId,
                                          final List<ProvaVariable> variables) {
        if (ruleId == this.ruleId)
            return variables.get(index).getRecursivelyAssigned().cloneWithVariables(variables);
        return this;
    }

    @Override
    public Object computeIfExpression() {
        return this;
    }

    @Override
    public ProvaObject computeProvaIfExpression() {
        return this;
    }

    @Override
    public boolean updateGround(final List<ProvaVariable> variables) {
        return variables.get(index).getRecursivelyAssigned().updateGround(variables);
    }

}
