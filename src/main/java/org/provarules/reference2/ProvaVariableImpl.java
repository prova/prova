package org.provarules.reference2;

import org.provarules.kernel2.*;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

public class ProvaVariableImpl extends ProvaTermImpl implements ProvaVariable {

    private static final long serialVersionUID = 7501612596168443208L;

    private Object name;

    private Class<?> type;

    // The term that this variable is assigned to
    private ProvaObject assigned;

    // Where this variable is in the rule's variables
    private int index;

    private long ruleId;

    private static AtomicLong incName = new AtomicLong(0);

    public static ProvaVariable create() {
        return new ProvaVariableImpl();
    }

    public static ProvaVariable create(final String name) {
        return new ProvaVariableImpl(name);
    }

    public static ProvaVariable create(final String name, final Class<?> type) {
        return new ProvaVariableImpl(name, type);
    }

    public static ProvaVariableImpl create(final String name, final ProvaObject assigned) {
        return new ProvaVariableImpl(name, assigned);
    }

    private ProvaVariableImpl() {
        this.name = incName.incrementAndGet();
        this.type = Object.class;
        this.index = -1;
    }

    private ProvaVariableImpl(final String name) {
        this.name = "_".equals(name) ? incName.incrementAndGet() : name;
        this.type = Object.class;
        this.index = -1;
    }

    private ProvaVariableImpl(final String name, final Class<?> type) {
        this.name = name;
        this.type = type;
        this.index = -1;
    }

    private ProvaVariableImpl(final Class<?> type, final ProvaObject assigned, final int index,
                              final long ruleId) {
        this.name = incName.incrementAndGet();
        this.type = type;
        this.assigned = assigned;
        this.index = index;
        this.ruleId = ruleId;
    }

    private ProvaVariableImpl(final String name, final ProvaObject assigned) {
        this.name = name;
        this.assigned = assigned;
        this.type = Object.class;
        this.index = -1;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Object getName() {
        return name;
    }

    public void setType(Class<?> type) {
        this.type = type;
    }

    @Override
    public Class<?> getType() {
        return type;
    }

    @Override
    public void setAssigned(final ProvaObject assigned) {
        this.assigned = assigned;
    }

    @Override
    public ProvaObject getAssigned() {
        return assigned;
    }

    @Override
    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public int getIndex() {
        return index;
    }

    @Override
    public ProvaObject getRecursivelyAssigned() {
        if (assigned instanceof ProvaConstant)
            return assigned;
        if (assigned == this) {
            assigned = null;
            return this;
        }
        if (assigned == null)
            return this;
        ProvaObject recursivelyAssigned = assigned.getRecursivelyAssigned();
        if (assigned != recursivelyAssigned)
            assigned = recursivelyAssigned;
        return recursivelyAssigned;
    }

    @Override
    public int collectVariables(final long ruleId, final List<ProvaVariable> variables) {
        if (assigned != null) {
            assigned.collectVariables(ruleId, variables);
            return -1;
        }
        int foundIndex = variables.indexOf(this);
        if (foundIndex != -1) {
            index = foundIndex;
            return index;
        }
        index = variables.size();
        variables.add(this);
        return index;
    }

    @Override
    public int computeSize() {
        if (assigned != null)
            return assigned.computeSize();
        return -1;
    }

//	@Override
//	public void collectVariables(long ruleId, Vector<ProvaVariable> variables, int offset) {
//		collectVariables(ruleId, variables);
//	}

    @Override
    public ProvaVariable clone() {
        return new ProvaVariableImpl(type, assigned, index, ruleId);
    }

    @Override
    public ProvaVariable clone(final long ruleId) {
        return new ProvaVariableImpl(type, assigned, index, ruleId);
    }

    @Override
    public boolean unify(final ProvaObject target, final ProvaUnification unification) {
        if (target == null) {
            assigned = ProvaListImpl.emptyRList;
            return true;
        }
        if (target instanceof ProvaVariable) {
            final Class<?> targetType = ((ProvaVariable) target).getType();
            if (targetType.isAssignableFrom(type)) {
                ((ProvaVariable) target).setAssigned(this);
                return true;
            }
            if (type.isAssignableFrom(targetType)) {
                assigned = target;
                return true;
            }
            return false;
//			if( !((ProvaVariable) target).getType().isAssignableFrom(type) )
//				return false;
//			((ProvaVariable) target).setAssigned(this);
//			return true;
        }
        if (type != Object.class) {
            if (target instanceof ProvaConstant) {
                if (target instanceof ProvaAnyImpl)
                    return true;
                if (!type.isInstance(((ProvaConstant) target).getObject()))
                    return false;
            }
        }
        assigned = target;
        return true;
    }

    @Override
    public void setRuleId(long ruleId) {
        this.ruleId = ruleId;
    }

    @Override
    public long getRuleId() {
        return ruleId;
    }

    public String toString() {
        if (assigned == null) {
            StringBuilder sb = new StringBuilder();
            if (type != Object.class) {
                sb.append(type.getCanonicalName());
                sb.append('.');
            }
            String strName = name.toString();
            if (strName.length() != 0 && Character.isDigit(strName.charAt(0))) {
                sb.append("<");
                sb.append(name);
                sb.append('>');
            } else
                sb.append(name);
            return sb.toString();
        }
        return getRecursivelyAssigned().toString();
    }

    @Override
    public void substituteVariables(final ProvaVariablePtr[] varsMap) {
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ProvaVariableImpl))
            return false;
        ProvaVariableImpl var = (ProvaVariableImpl) o;
        return var.name.equals(name) && var.type == type;
    }

    @Override
    public boolean isGround() {
        return false;
    }

    @Override
    public String toString(final List<ProvaVariable> variables) {
        return toString();
    }

    @Override
    public ProvaObject cloneWithBoundVariables(final List<ProvaVariable> variables, final List<Boolean> isConstant) {
        if (assigned != null)
            return assigned;
        return this;
    }

    @Override
    public ProvaObject cloneWithVariables(final List<ProvaVariable> variables) {
        if (assigned != null)
            return assigned;
        return this;
    }

    @Override
    public ProvaObject cloneWithVariables(final long ruleId, final List<ProvaVariable> variables) {
        if (assigned != null)
            return assigned;
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
    public Object compute() {
        return this;
    }

    @Override
    public boolean updateGround(final List<ProvaVariable> variables) {
        if (assigned != null)
            return assigned.updateGround(variables);
        return false;
    }

}
