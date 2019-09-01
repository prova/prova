package org.provarules.reference2;

import org.provarules.kernel2.*;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class ProvaConstantImpl extends ProvaTermImpl implements ProvaConstant, ProvaComputable {

    private static final long serialVersionUID = -3976583974992460058L;

    protected Object object;

    public static ProvaConstantImpl create(Object object) {
        return new ProvaConstantImpl(object);
    }

    protected ProvaConstantImpl(Object object) {
        this.object = object;
    }

    @Override
    public void setObject(Object object) {
        this.object = object;
    }

    @Override
    public Object getObject() {
        return object;
    }

    @Override
    public ProvaObject getRecursivelyAssigned() {
        return this;
    }

    @Override
    public int collectVariables(long ruleId, List<ProvaVariable> variables) {
        if (object instanceof Map<?, ?>) {
            Map<String, ProvaObject> map = (Map<String, ProvaObject>) object;
            for (Entry<String, ProvaObject> e : map.entrySet()) {
                int r = e.getValue().collectVariables(ruleId, variables);
                if (r != -1) {
                    e.setValue(new ProvaVariablePtrImpl(ruleId, r));
                }
            }
            return 0;
        }
        return -1;
    }

//	@Override
//	public void collectVariables(long ruleId, Vector<ProvaVariable> variables, int offset) {
//	}

    @Override
    public int computeSize() {
        return 1;
    }

    @Override
    public boolean matched(ProvaConstant target) {
        if (target instanceof ProvaMapImpl)
            return false;
        return object.equals(target.getObject());
    }

    @Override
    public boolean unify(ProvaObject target, ProvaUnification unification) {
        if (target == null)
            return false;
        if (target instanceof ProvaConstant) {
            // The target is a constant
            ProvaConstant targetConstant = (ProvaConstant) target;
            // TODO: deal with types later
            Object targetObject = targetConstant.getObject();
            return object.equals(targetObject);
        }
        if (target instanceof ProvaVariable)
            return target.unify(this, unification);
        if (target instanceof ProvaVariablePtr) {
            return target.unify(this, unification);
        }
        if (object instanceof ProvaObject) {
            return ((ProvaObject) object).unify(target, unification);
        }
        return false;
    }

    public String toString() {
//		if( object instanceof String ) {
//			StringBuilder sb = new StringBuilder("\'");
//			sb.append(object);
//			sb.append('\'');
//			return sb.toString();
//		}
        if (object == null)
            return "null";
        return object.toString();
    }

    @Override
    public void substituteVariables(final ProvaVariablePtr[] varsMap) {
    }

    @Override
    public boolean isGround() {
        return true;
    }

    @Override
    public String toString(List<ProvaVariable> variables) {
        return object.toString();
    }

    @Override
    public ProvaObject cloneWithBoundVariables(List<ProvaVariable> variables, List<Boolean> isConstant) {
        return this;
    }

    @Override
    public ProvaObject cloneWithVariables(List<ProvaVariable> variables) {
        return this;
    }

    @Override
    public ProvaObject cloneWithVariables(final long ruleId, final List<ProvaVariable> variables) {
        return this;
    }

    @Override
    public Number compute() {
        return (Number) object;
    }

    @Override
    public Object computeIfExpression() {
        return object;
    }

    @Override
    public ProvaObject computeProvaIfExpression() {
        return this;
    }

    public static ProvaObject wrap(Object o) {
        return (o instanceof ProvaObject) ? (ProvaObject) o : create(o);
    }

    @Override
    public boolean updateGround(List<ProvaVariable> variables) {
        return true;
    }

}
