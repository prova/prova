package org.provarules.reference2;

import org.provarules.kernel2.*;
import org.provarules.reference2.operators.ProvaOperator;

import java.util.Arrays;
import java.util.List;

public class ProvaListImpl extends ProvaTermImpl implements ProvaList, ProvaComputable {

    private static final long serialVersionUID = -555571145845834681L;

    public static final ProvaListImpl emptyRList = new ProvaListImpl(new ProvaObject[]{});

    private final ProvaObject[] fixed;

    private ProvaObject tail;

    private boolean ground = false;

    public static ProvaList create(final ProvaObject[] fixed) {
        if (fixed.length == 0)
            return emptyRList;
        return new ProvaListImpl(fixed);
    }

    public static ProvaList create(final List<ProvaObject> list) {
        if (list.size() == 0)
            return emptyRList;
        return new ProvaListImpl(list.toArray(new ProvaObject[]{}));
    }

    private ProvaListImpl(final ProvaObject[] fixed) {
        this.fixed = fixed;
//		this.tail = null;
    }

    public static ProvaList create(final ProvaObject[] fixed, final ProvaObject tail) {
        if (fixed.length == 0)
            return emptyRList;
        return new ProvaListImpl(fixed, tail);
    }

    private ProvaListImpl(final ProvaObject[] fixed, final ProvaObject tail) {
        this.fixed = fixed;
        this.tail = tail;
    }

    @Override
    public boolean isGround() {
        return ground;
    }

//	public void setFixed(ProvaObject[] fixed) {
//		this.fixed = fixed;
//	}

    @Override
    public ProvaObject[] getFixed() {
        return fixed;
    }

    public void setTail(ProvaObject tail) {
        this.tail = tail;
    }

    @Override
    public ProvaObject getTail() {
        return tail;
    }

    @Override
    public int computeSize() {
        int size = fixed.length;
        if (tail != null) {
            int tailSize = tail.computeSize();
            if (tailSize == -1)
                return -1;
            size += tailSize;
        }
        return size;
    }

    @Override
    public ProvaObject getRecursivelyAssigned() {
        return this;
    }

    @Override
    public void substituteVariables(final ProvaVariablePtr[] varsMap) {
        if (ground)
            return;
        for (int i = 0; i < fixed.length; i++) {
            if (fixed[i].getClass() == ProvaConstantImpl.class)
                continue;
            if (fixed[i] instanceof ProvaVariablePtr)
                fixed[i] = varsMap[((ProvaVariablePtr) fixed[i]).getIndex()];
            else if (fixed[i] instanceof ProvaList || fixed[i] instanceof ProvaListPtr)
                fixed[i].substituteVariables(varsMap);
            else if (fixed[i] instanceof ProvaLiteral)
                fixed[i].substituteVariables(varsMap);
            else if (fixed[i] instanceof ProvaMapImpl)
                fixed[i].substituteVariables(varsMap);
        }
        if (tail != null) {
            if (tail instanceof ProvaVariablePtr)
                tail = varsMap[((ProvaVariablePtr) tail).getIndex()];
            else if (tail instanceof ProvaList || tail instanceof ProvaListPtr)
                tail.substituteVariables(varsMap);
        }
    }

    @Override
    public ProvaList shallowCopy() {
        final int fixedLength = fixed.length;
        ProvaObject[] newFixed;
        newFixed = Arrays.copyOf(fixed, fixedLength);
        return new ProvaListImpl(newFixed, tail);
    }

    @Override
    public ProvaList copyWithVariables(final List<ProvaVariable> variables) {
        final int fixedLength = fixed.length;
        ProvaObject[] newFixed = new ProvaObject[fixedLength];
        for (int i = 0; i < fixedLength; i++) {
            newFixed[i] = fixed[i].cloneWithVariables(variables);
        }
        ProvaObject newTail = null;
        if (tail != null) {
            newTail = tail.cloneWithVariables(variables);
        }
        return new ProvaListImpl(newFixed, newTail);
    }

    @Override
    public ProvaList copyWithBoundVariables(final List<ProvaVariable> variables, final List<Boolean> isConstant) {
        int fixedLength = fixed.length;
        ProvaObject newTail = null;
        if (tail != null) {
            newTail = tail.cloneWithBoundVariables(variables, isConstant);
            if (newTail instanceof ProvaList) {
                fixedLength += newTail.computeSize();
                ProvaObject[] newFixed = new ProvaObject[fixedLength];
                int i = 0;
                for (; i < fixed.length; i++)
                    newFixed[i] = fixed[i].cloneWithBoundVariables(variables, isConstant);
                ProvaObject[] tailFixed = ((ProvaList) newTail).getFixed();
                for (; i < fixedLength; i++)
                    newFixed[i] = tailFixed[i - fixed.length];
                return new ProvaListImpl(newFixed, ((ProvaList) newTail).getTail());
            }
        }
        ProvaObject[] newFixed = new ProvaObject[fixedLength];
        int i = 0;
        for (; i < fixed.length; i++) {
            newFixed[i] = fixed[i].cloneWithBoundVariables(variables, isConstant);
        }
        return new ProvaListImpl(newFixed, newTail);
    }

    @Override
    public ProvaObject cloneWithBoundVariables(final List<ProvaVariable> variables, final List<Boolean> changed) {
        if (ground)
            return this;
        return copyWithBoundVariables(variables, changed);
    }

    @Override
    public ProvaObject cloneWithVariables(final List<ProvaVariable> variables) {
        if (ground)
            return this;
        return copyWithVariables(variables);
    }

    @Override
    public ProvaObject cloneWithVariables(final List<ProvaVariable> variables, final int offset) {
        if (ground)
            return this;
        final int fixedLength = fixed.length - offset;
        ProvaObject[] newFixed = new ProvaObject[fixedLength];
        if (ground) {
            System.arraycopy(fixed, offset, newFixed, 0, fixedLength);
        } else {
            for (int i = 0; i < fixedLength; i++) {
                newFixed[i] = fixed[i + offset].cloneWithVariables(variables);
            }
        }
        ProvaObject newTail = null;
        if (tail != null) {
            newTail = tail.cloneWithVariables(variables);
        }
        return new ProvaListImpl(newFixed, newTail);
    }

    @Override
    public ProvaObject cloneWithVariables(final long ruleId, final List<ProvaVariable> variables) {
        if (ground)
            return this;
        final int fixedLength = fixed.length;
        ProvaObject[] newFixed = new ProvaObject[fixedLength];
        for (int i = 0; i < fixedLength; i++) {
            if (fixed[i] == null)
                throw new RuntimeException("a");
            newFixed[i] = fixed[i].cloneWithVariables(ruleId, variables);
        }
        ProvaObject newTail = null;
        if (tail != null) {
            newTail = tail.cloneWithVariables(ruleId, variables);
        }
        return new ProvaListImpl(newFixed, newTail);
    }

    @Override
    public boolean updateGround(List<ProvaVariable> variables) {
        if (ground)
            return true;
        ground = true;
        for (int i = 0; i < fixed.length; i++) {
            if (fixed[i] instanceof ProvaVariablePtr) {
                ProvaObject o = variables.get(((ProvaVariablePtr) fixed[i]).getIndex()).getAssigned();
                if (o != null)
                    fixed[i] = o;
            }
            if (!fixed[i].updateGround(variables)) {
                ground = false;
            }
        }
        if (tail != null) {
            if (!tail.updateGround(variables))
                return ground = false;
        }
        return ground;
    }

    @Override
    public int collectVariables(long ruleId, List<ProvaVariable> variables) {
        if (ground)
            return -1;
        ground = true;
        for (int i = 0; i < fixed.length; i++) {
            if (!fixed[i].isGround() && fixed[i].collectVariables(ruleId, variables) >= 0)
                ground = false;
            if (fixed[i] instanceof ProvaVariable)
                fixed[i] = new ProvaVariablePtrImpl(ruleId, ((ProvaVariable) fixed[i]).getIndex());
        }
        if (tail != null) {
            if (!tail.isGround() && tail.collectVariables(ruleId, variables) >= 0)
                ground = false;
            if (tail instanceof ProvaVariable)
                tail = new ProvaVariablePtrImpl(ruleId, ((ProvaVariable) tail).getIndex());
        }
        return ground ? -1 : 0;
    }

//	@Override
//	public void collectVariables(long ruleId, Vector<ProvaVariable> variables, int offset ) {
//		if( offset<fixed.length ) {
//			for( int i=offset; i<fixed.length; i++ ) {
//				fixed[i].collectVariables(ruleId, variables);
//				if( fixed[i] instanceof ProvaVariable )
//					fixed[i] = new ProvaVariablePtrImpl(ruleId, ((ProvaVariable) fixed[i]).getIndex());
//			}
//			if( tail!=null ) {
//				tail.collectVariables(ruleId, variables);
//				if( tail instanceof ProvaVariable )
//					tail = new ProvaVariablePtrImpl(ruleId, ((ProvaVariable) tail).getIndex());
//			}
//		} else {
//			if( tail!=null ) {
//				tail.collectVariables(ruleId, variables, offset-fixed.length);
//				if( tail instanceof ProvaVariable )
//					tail = new ProvaVariablePtrImpl(ruleId, ((ProvaVariable) tail).getIndex());
//			}
//		}
//	}

    @Override
    public int computeSize(int offset) {
        return computeSize() - offset;
    }

    @Override
    public boolean unify(ProvaObject target, ProvaUnification unification) {
        if (target == null)
            return false;
        ProvaListImpl targetList;
        if (target instanceof ProvaVariablePtr) {
            ProvaVariablePtr targetVariablePtr = (ProvaVariablePtr) target;
            ProvaVariable targetVariable = unification.getVariableFromVariablePtr(targetVariablePtr);
            ProvaObject assigned = targetVariable.getRecursivelyAssigned();
            if (assigned instanceof ProvaVariable) {
                return assigned.unify(this, unification);
            } else if (assigned instanceof ProvaConstant) {
                return false;
            } else if (assigned instanceof ProvaListPtr) {
                return unify(((ProvaListPtr) assigned).getAssignedWithOffset(), unification);
            }
            targetList = (ProvaListImpl) assigned;
        } else if (target instanceof ProvaVariable) {
            return target.unify(this, unification);
        } else if (target instanceof ProvaConstant) {
            return target instanceof ProvaAnyImpl;
        } else if (target instanceof ProvaListPtr) {
            return unify(((ProvaListPtr) target).getAssignedWithOffset(), unification);
        } else
            targetList = (ProvaListImpl) target;
        int minFixed = Math.min(fixed.length, targetList.fixed.length);
        for (int i = 0; i < minFixed; i++) {
            boolean result = fixed[i].unify(targetList.fixed[i], unification);
            if (!result)
                return false;
        }
        if (fixed.length == targetList.fixed.length) {
            // TODO: Make sure empty tail is handled properly
            if (tail == null && targetList.tail == null)
                return true;
            if (tail != null && targetList.tail != null)
                return tail.unify(targetList.tail, unification);
            if (tail != null)
                return tail.unify(emptyRList, unification);
            return targetList.tail.unify(emptyRList, unification);
        }
        if (fixed.length < targetList.fixed.length) {
            if (tail instanceof ProvaList)
                return ((ProvaList) tail).unify(0, new ProvaListPtrImpl(targetList, minFixed), unification);
            if (tail == null || !(tail instanceof ProvaVariablePtr))
                return false;
            return tail.unify(new ProvaListPtrImpl(targetList, minFixed), unification);
        }
        if (targetList.tail == null)
            return false;
        return targetList.tail.unify(new ProvaListPtrImpl(this, minFixed), unification);
    }

    /**
     * A general case when both unified lists may have offsets
     */
    @Override
    public boolean unify(
            int offset,
            ProvaObject target,
            ProvaUnification unification) {
        if (target instanceof ProvaVariablePtr) {
            ProvaVariablePtr targetVariablePtr = (ProvaVariablePtr) target;
            ProvaVariable targetVariable = unification.getVariableFromVariablePtr(targetVariablePtr);
            ProvaObject assigned = targetVariable.getRecursivelyAssigned();
            if (assigned instanceof ProvaVariable) {
                return assigned.unify(this, unification);
            } else if (assigned instanceof ProvaConstant) {
                return false;
            }
        }
        int targetOffset = 0;
        if (target instanceof ProvaListPtr) {
            ProvaListPtr targetListPtr = (ProvaListPtr) target;
            target = targetListPtr.getAssigned();
            targetOffset = targetListPtr.getOffset();
        }
        ProvaListImpl targetList = (ProvaListImpl) target;
        int minFixed = Math.min(fixed.length - offset, targetList.fixed.length - targetOffset);
        for (int i = 0; i < minFixed; i++) {
            boolean result = fixed[i + offset].unify(targetList.fixed[i + targetOffset], unification);
            if (!result)
                return false;
        }
        if (fixed.length - offset == targetList.fixed.length - targetOffset) {
            if (tail != null)
                return tail.unify(targetList.tail, unification);
            else if (targetList.tail != null)
                return targetList.tail.unify(null, unification);
            else
                // Make sure empty tail is handled properly
                return true;
        }
        if (fixed.length - offset < targetList.fixed.length - targetOffset) {
            if (!(tail instanceof ProvaVariablePtr))
                return false;
            return tail.unify(new ProvaListPtrImpl(targetList, targetOffset + minFixed), unification);
        }
        return targetList.tail != null && targetList.tail.unify(new ProvaListPtrImpl(this, offset + minFixed), unification);
    }

    @Override
    public ProvaList rebuild(ProvaUnification unification) {
        if (ground || this == ProvaListImpl.emptyRList)
            return this;
        // Rebuild the fixed part
        final int fixedLength = fixed.length;
        ProvaObject[] newFixed = new ProvaObject[fixedLength];
        boolean changed = false;
        for (int i = 0; i < fixedLength; i++) {
            if (fixed[i].getClass() == ProvaConstantImpl.class)
                newFixed[i] = fixed[i];
            else if (fixed[i] instanceof ProvaVariablePtr) {
                newFixed[i] = unification.rebuild((ProvaVariablePtr) fixed[i]);
                changed |= newFixed[i] != fixed[i];
            } else if (fixed[i] instanceof ProvaList) {
                newFixed[i] = ((ProvaList) fixed[i]).rebuild(unification);
                changed |= newFixed[i] != fixed[i];
            } else if (fixed[i] instanceof ProvaMapImpl) {
                newFixed[i] = ((ProvaMapImpl) fixed[i]).rebuild(unification);
                changed |= newFixed[i] != fixed[i];
            } else
                newFixed[i] = fixed[i];
        }

        ProvaObject newTail = null;
        if (tail != null) {
            if (tail instanceof ProvaVariablePtr) {
                newTail = unification.rebuild((ProvaVariablePtr) tail);
                changed |= newTail != tail;
            } else if (tail instanceof ProvaList) {
                newTail = ((ProvaList) tail).rebuild(unification);
                changed |= newTail != tail;
            } else
                newTail = tail;

            if (newTail instanceof ProvaList) {
                changed = true;
                if (newTail == ProvaListImpl.emptyRList)
                    newTail = null;
                else {
                    final ProvaObject[] tailFixed = ((ProvaList) newTail).getFixed();
                    final ProvaObject[] newFixedExtended = new ProvaObject[fixedLength + tailFixed.length];
                    System.arraycopy(newFixed, 0, newFixedExtended, 0, newFixed.length);
                    System.arraycopy(tailFixed, 0, newFixedExtended, newFixed.length, tailFixed.length);
                    newTail = ((ProvaList) newTail).getTail();
                    newFixed = newFixedExtended;
                }
            }
        }

        if (changed)
            return new ProvaListImpl(newFixed, newTail);
        else
            return this;
    }

    @Override
    public ProvaObject rebuild(ProvaUnification unification, int offset) {
        ProvaObject[] newFixed;
        final int fixedLength = fixed.length;
        if (offset < fixedLength) {
            // Rebuild the fixed part
            newFixed = new ProvaObject[fixedLength - offset];
            for (int i = offset; i < fixedLength; i++) {
                if (fixed[i] instanceof ProvaVariablePtr) {
                    newFixed[i - offset] = unification.rebuild((ProvaVariablePtr) fixed[i]);
                } else if (fixed[i] instanceof ProvaList) {
                    newFixed[i - offset] = ((ProvaList) fixed[i]).rebuild(unification);
                } else
                    newFixed[i - offset] = fixed[i];
            }

            ProvaObject newTail = null;
            if (tail != null) {
                if (tail instanceof ProvaVariablePtr) {
                    newTail = unification.rebuild((ProvaVariablePtr) tail);
                } else if (tail instanceof ProvaList) {
                    newTail = ((ProvaList) tail).rebuild(unification);
                } else
                    newTail = tail;

                if (newTail instanceof ProvaList) {
                    final ProvaObject[] tailFixed = ((ProvaList) newTail).getFixed();
                    final ProvaObject[] newFixedExtended = new ProvaObject[fixedLength + tailFixed.length];
                    System.arraycopy(newFixed, 0, newFixedExtended, 0, newFixed.length);
                    System.arraycopy(tailFixed, 0, newFixedExtended, newFixed.length, tailFixed.length);
                    newTail = ((ProvaList) newTail).getTail();
                    newFixed = newFixedExtended;
                }
            }
            return new ProvaListImpl(newFixed, newTail);
            // TODO: deal with other cases
        } else if (offset == fixedLength) {

        } else {

        }

        return null;
    }

    @Override
    public ProvaList rebuildSource(ProvaUnification unification) {
        if (ground || this == ProvaListImpl.emptyRList)
            return this;
        // Rebuild the fixed part
        ProvaObject[] newFixed = new ProvaObject[fixed.length];
        for (int i = 0; i < fixed.length; i++) {
            if (fixed[i].getClass() == ProvaConstantImpl.class)
                newFixed[i] = fixed[i];
            else if (fixed[i] instanceof ProvaVariablePtr) {
                newFixed[i] = unification.rebuildSource((ProvaVariablePtr) fixed[i]);
            } else if (fixed[i] instanceof ProvaList) {
                newFixed[i] = ((ProvaList) fixed[i]).rebuildSource(unification);
            } else if (fixed[i] instanceof ProvaLiteral) {
                newFixed[i] = ((ProvaLiteral) fixed[i]).rebuildSource(unification);
            } else if (fixed[i] instanceof ProvaMapImpl) {
                newFixed[i] = ((ProvaMapImpl) fixed[i]).rebuildSource(unification);
            } else
                newFixed[i] = fixed[i];
        }

        ProvaObject newTail = null;
        if (tail != null) {
            if (tail instanceof ProvaVariablePtr) {
                newTail = unification.rebuildSource((ProvaVariablePtr) tail);
            } else if (tail instanceof ProvaList) {
                newTail = ((ProvaList) tail).rebuildSource(unification);
            } else
                newTail = tail;

            if (newTail instanceof ProvaList) {
                if (newTail == ProvaListImpl.emptyRList)
                    newTail = null;
                else {
                    ProvaObject[] tailFixed = ((ProvaList) newTail).getFixed();
                    ProvaObject[] newFixedExtended = new ProvaObject[fixed.length + tailFixed.length];
                    System.arraycopy(newFixed, 0, newFixedExtended, 0, newFixed.length);
                    System.arraycopy(tailFixed, 0, newFixedExtended, newFixed.length, tailFixed.length);
                    newTail = ((ProvaList) newTail).getTail();
                    newFixed = newFixedExtended;
                }
            }
        }

        return new ProvaListImpl(newFixed, newTail);
    }

    @Override
    public ProvaObject rebuildSource(ProvaUnification unification, int offset) {
        ProvaObject[] newFixed;
        final int fixedLength = fixed.length;
        if (offset < fixedLength) {
            // Rebuild the fixed part
            newFixed = new ProvaObject[fixedLength - offset];
            for (int i = offset; i < fixedLength; i++) {
                if (fixed[i] instanceof ProvaVariablePtr) {
                    newFixed[i - offset] = unification.rebuildSource((ProvaVariablePtr) fixed[i]);
                } else if (fixed[i] instanceof ProvaList) {
                    newFixed[i - offset] = ((ProvaList) fixed[i]).rebuildSource(unification);
                } else
                    newFixed[i - offset] = fixed[i];
            }

            ProvaObject newTail = null;
            if (tail != null) {
                if (tail instanceof ProvaVariablePtr) {
                    newTail = unification.rebuildSource((ProvaVariablePtr) tail);
                } else if (tail instanceof ProvaList) {
                    newTail = ((ProvaList) tail).rebuildSource(unification);
                } else
                    newTail = tail;

                if (newTail instanceof ProvaList) {
                    ProvaObject[] tailFixed = ((ProvaList) newTail).getFixed();
                    ProvaObject[] newFixedExtended = new ProvaObject[fixedLength + tailFixed.length];
                    System.arraycopy(newFixed, 0, newFixedExtended, 0, newFixed.length);
                    System.arraycopy(tailFixed, 0, newFixedExtended, newFixed.length, tailFixed.length);
                    newTail = ((ProvaList) newTail).getTail();
                    newFixed = newFixedExtended;
                }
            }
            return new ProvaListImpl(newFixed, newTail);
            // TODO: deal with other cases
        } else if (offset == fixedLength) {

        } else {

        }

        return null;
    }

    public String toString() {
        if (this == emptyRList)
            return "[]";
        StringBuilder sb = new StringBuilder("[");
        final int fixedLength = fixed.length;
        for (int i = 0; i < fixedLength; i++) {
            if (i != 0)
                sb.append(',');
            sb.append(fixed[i]);
        }
        if (tail != null) {
            sb.append('|');
            sb.append(tail);
        }
        sb.append(']');
        return sb.toString();
    }

    @Override
    public String toString(List<ProvaVariable> variables) {
        if (this == emptyRList)
            return "[]";
        StringBuilder sb = new StringBuilder("[");
        final int fixedLength = fixed.length;
        for (int i = 0; i < fixedLength; i++) {
            if (i != 0)
                sb.append(',');
            sb.append(fixed[i].toString(variables));
        }
        if (tail != null) {
            sb.append('|');
            sb.append(tail.toString(variables));
        }
        sb.append(']');
        return sb.toString();
    }

    @Override
    public String performative() {
        if (fixed.length < 4 || !(fixed[3] instanceof ProvaConstant))
            return null;
        return ((ProvaConstant) fixed[3]).getObject().toString();
    }

    @Override
    public Object compute() {
        Object[] args = new Object[fixed.length - 1];
        for (int i = 0; i < args.length; i++)
            args[i] = fixed[i + 1].computeIfExpression();
        return ((ProvaOperator) ((ProvaConstant) fixed[0]).getObject()).evaluate(args);
    }

    @Override
    public Object computeIfExpression() {
        if (fixed.length >= 1 && fixed.length <= 3 && fixed[0] instanceof ProvaConstant && ((ProvaConstant) fixed[0]).getObject() instanceof ProvaOperator)
            return compute();
        ProvaObject[] newFixed = new ProvaObject[fixed.length];
        for (int i = 0; i < newFixed.length; i++)
            newFixed[i] = fixed[i].computeProvaIfExpression();
        return ProvaListImpl.create(newFixed);
    }

    @Override
    public ProvaObject computeProvaIfExpression() {
        return this;
    }

    @Override
    public void setGround(boolean ground) {
        this.ground = ground;
    }

}
