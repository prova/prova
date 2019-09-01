package org.provarules.reference2;

import org.provarules.kernel2.*;

import java.util.Arrays;
import java.util.List;

public class ProvaListPtrImpl implements ProvaListPtr {

    private static final long serialVersionUID = 4407774077342578415L;

    private ProvaList assigned;

    private int offset;

    public ProvaListPtrImpl(ProvaList assigned, int offset) {
        this.assigned = assigned;
        this.offset = offset;
    }

    public void setAssigned(ProvaList assigned) {
        this.assigned = assigned;
    }

    @Override
    public ProvaList getAssigned() {
        return assigned;
    }

    @Override
    public ProvaList getAssignedWithOffset() {
        if (offset == 0)
            return assigned;
        // Make sure the tail is copied across as well
        if (offset < assigned.getFixed().length) {
            ProvaObject[] newFixed = Arrays.copyOfRange(assigned.getFixed(), offset, assigned.getFixed().length);
            return ProvaListImpl.create(newFixed, assigned.getTail());
        } else if (offset == assigned.getFixed().length)
            return ProvaListImpl.create(null, assigned.getTail());
        return ProvaListImpl.emptyRList;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    @Override
    public int getOffset() {
        return offset;
    }

    @Override
    public ProvaObject getRecursivelyAssigned() {
        return this;
    }

    @Override
    public int collectVariables(final long ruleId, final List<ProvaVariable> variables) {
        return assigned.collectVariables(ruleId, variables);
    }

//	@Override
//	public void collectVariables(long ruleId, Vector<ProvaVariable> variables, int offset) {
//		assigned.collectVariables(ruleId, variables, offset);
//	}

    @Override
    public int computeSize() {
        return assigned.computeSize(offset);
    }

    @Override
    public boolean unify(final ProvaObject target, final ProvaUnification unification) {
        return assigned.unify(offset, target, unification);
    }

    @Override
    public ProvaObject rebuild(final ProvaUnification unification) {
        return assigned.rebuild(unification, offset);
    }

    @Override
    public ProvaObject rebuildSource(final ProvaUnification unification) {
        return assigned.rebuildSource(unification, offset);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = offset; i < assigned.getFixed().length; i++) {
            if (i != offset)
                sb.append(',');
            sb.append(assigned.getFixed()[i]);
        }
        if (assigned.getTail() != null) {
            sb.append('|');
            sb.append(assigned.getTail());
        }
        sb.append(']');
        return sb.toString();
    }

    @Override
    public void substituteVariables(final ProvaVariablePtr[] varsMap) {
        assigned.substituteVariables(varsMap);
    }

    @Override
    public boolean isGround() {
        return assigned.isGround();
    }

    @Override
    public String toString(final List<ProvaVariable> variables) {
        return toString();
    }

    @Override
    public ProvaObject cloneWithBoundVariables(final List<ProvaVariable> variables, final List<Boolean> isConstant) {
        final ProvaObject[] fixed = assigned.getFixed();
        final ProvaObject[] newFixed = new ProvaObject[fixed.length - offset];
        System.arraycopy(fixed, offset, newFixed, 0, newFixed.length);
        return ProvaListImpl.create(newFixed).cloneWithBoundVariables(variables, isConstant);
    }

    @Override
    public ProvaObject cloneWithVariables(final List<ProvaVariable> variables) {
        if (assigned != null /*&& assigned!=this*/)
            return assigned.cloneWithVariables(variables);
        throw new UnsupportedOperationException();
    }

    @Override
    public ProvaObject cloneWithVariables(final long ruleId, final List<ProvaVariable> variables) {
        throw new UnsupportedOperationException();
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
        return assigned.updateGround(variables);
    }

}
