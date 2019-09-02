package org.provarules.reference2;

import org.provarules.api2.ProvaCommunicator;
import org.provarules.kernel2.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * A wrapper around a Java Map that recursively (for all nested Maps) wraps all Java objects in the `Map` values in `ProvaObject`(s).
 * The keys in the original Map are converted to Java `String` by `toString()`.
 * <br>
 * The Prova Maps are created using the equivalent {@link #create(Map)} and {@link #wrapValues(Map)}} methods.
 */
public class ProvaMapImpl extends ProvaConstantImpl {

    private static final long serialVersionUID = -4660675788561894085L;

    public static ProvaMapImpl create(Map<?, ?> m) {
        return ProvaMapImpl.wrapValues(m);
    }

    protected ProvaMapImpl(Object object) {
        super(object);
    }

    @SuppressWarnings("unchecked")
    @Override
    public int collectVariables(long ruleId, List<ProvaVariable> variables) {
        int rc = -1;
        Map<String, ProvaObject> map = (Map<String, ProvaObject>) object;
        for (Entry<String, ProvaObject> e : map.entrySet()) {
            final ProvaObject value = e.getValue();
            if (value instanceof ProvaVariablePtr) {
                rc = 0;
                continue;
            }
            int r = value.collectVariables(ruleId, variables);
            if (r != -1 && !(value instanceof ProvaList) && !(value instanceof ProvaMapImpl)) {
                e.setValue(new ProvaVariablePtrImpl(ruleId, r));
                rc = r;
            }
        }
        return rc;
    }

    @SuppressWarnings("unchecked")
    @Override
    public boolean updateGround(List<ProvaVariable> variables) {
        boolean rc = true;
        Map<String, ProvaObject> map = (Map<String, ProvaObject>) object;
        for (Entry<String, ProvaObject> e : map.entrySet()) {
            if (!e.getValue().updateGround(variables))
                rc = false;
        }
        return rc;
    }

    @Override
    public boolean unify(ProvaObject target, ProvaUnification unification) {
        if (target == null)
            return false;
        if (target instanceof ProvaVariable)
            return target.unify(this, unification);
        if (target instanceof ProvaVariablePtr) {
            return target.unify(this, unification);
        } else if (target instanceof ProvaList) {
            return false;
        } else if (target instanceof ProvaListPtrImpl) {
            return false;
        }
        // The target is a constant
        ProvaConstant targetConstant = (ProvaConstant) target;
        Object targetObject = targetConstant.getObject();
        if (object instanceof Map<?, ?> && targetObject instanceof Map<?, ?>) {
            Map<?, ?> src = (Map<?, ?>) object;
            Map<?, ?> tgt = (Map<?, ?>) targetObject;
            for (Entry<?, ?> t : tgt.entrySet()) {
                ProvaObject srcValue = (ProvaObject) src.get(t.getKey());
                if (srcValue == null)
                    return false;
                boolean rc = srcValue.unify((ProvaObject) t.getValue(), unification);
                if (!rc)
                    return false;
            }
            return true;
        }
        return object.equals(targetObject);
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

    @SuppressWarnings("unchecked")
    @Override
    public void substituteVariables(final ProvaVariablePtr[] varsMap) {
        final Map<String, ProvaObject> map = (Map<String, ProvaObject>) object;
        for (Entry<String, ProvaObject> e : map.entrySet()) {
            ProvaObject value = e.getValue();
            if (value instanceof ProvaVariablePtr)
                e.setValue(varsMap[((ProvaVariablePtr) value).getIndex()]);
            else
                e.getValue().substituteVariables(varsMap);
        }
    }

    @SuppressWarnings("unchecked")
    @Override
    public boolean isGround() {
        final Map<String, ProvaObject> map = (Map<String, ProvaObject>) object;
        for (Entry<String, ProvaObject> e : map.entrySet()) {
            if (!e.getValue().isGround())
                return false;
        }
        return true;
    }

    @SuppressWarnings("unchecked")
    @Override
    public ProvaObject cloneWithBoundVariables(List<ProvaVariable> variables, List<Boolean> isConstant) {
        if (isGround())
            return this;
        final Map<String, ProvaObject> map = (Map<String, ProvaObject>) object;
        final Map<String, ProvaObject> newMap = new HashMap<>();
        for (Entry<String, ProvaObject> e : map.entrySet()) {
            if (e.getValue().isGround())
                newMap.put(e.getKey(), e.getValue());
            else
                newMap.put(e.getKey(), e.getValue().cloneWithBoundVariables(variables, isConstant));
        }
        return new ProvaMapImpl(newMap);
    }

    @SuppressWarnings("unchecked")
    @Override
    public ProvaObject cloneWithVariables(List<ProvaVariable> variables) {
        if (isGround())
            return this;
        Map<String, ProvaObject> map = (Map<String, ProvaObject>) object;
        Map<String, ProvaObject> newMap = new HashMap<>();
        for (Entry<String, ProvaObject> e : map.entrySet()) {
            if (e.getValue().isGround())
                newMap.put(e.getKey(), e.getValue());
            else
                newMap.put(e.getKey(), e.getValue().cloneWithVariables(variables));
        }
        return new ProvaMapImpl(newMap);
    }

    @SuppressWarnings("unchecked")
    @Override
    public ProvaObject cloneWithVariables(final long ruleId, final List<ProvaVariable> variables) {
        if (isGround())
            return this;
        final Map<String, ProvaObject> map = (Map<String, ProvaObject>) object;
        final Map<String, ProvaObject> newMap = new HashMap<>();
        for (Entry<String, ProvaObject> e : map.entrySet()) {
            if (e.getValue().isGround())
                newMap.put(e.getKey(), e.getValue());
            else
                newMap.put(e.getKey(), e.getValue().cloneWithVariables(ruleId, variables));
        }
        return new ProvaMapImpl(newMap);
    }

    @Override
    public Number compute() {
        return (Number) object;
    }

    @Override
    public Object computeIfExpression() {
        return object;
    }

    /**
     * Wrap the map values as `ProvaObject`(s) while ignoring the already present `ProvaObject`(s)
     * and recursively wrapping further `Map`(s).
     * This function is often used for wrapping Maps before passing them as payload to
     * {@link ProvaCommunicator#addMsg(ProvaList)} or
     * {@link ProvaCommunicator#addMsg(String, String, String, Object)}.
     *
     * @param m Map to wrap
     * @return a wrapped Map
     */
    public static ProvaMapImpl wrapValues(Map<?, ?> m) {
        final Map<String, ProvaObject> map = new HashMap<>();
        for (Entry<?, ?> e : m.entrySet()) {
            final Object value = e.getValue();
            ProvaObject store;
            if (value instanceof ProvaObject)
                store = (ProvaObject) value;
            else if (value instanceof Map)
                store = wrapValues((Map<?, ?>) value);
            else
                store = ProvaConstantImpl.create(value);
            map.put(e.getKey().toString(), store);
        }
        return new ProvaMapImpl(map);
    }

    /**
     * Wrap an object in a `ProvaMapImpl` or `ProvaConstantImpl` if it is a Map or any other non-Prova object.
     * Keep it as it is if it is already a `ProvaObject`.
     *
     * @param o a naked object
     * @return a wrapped object or `o`, if it is already wrapped
     */
    public static ProvaObject wrap(Object o) {
        return (o instanceof ProvaObject) ? (ProvaObject) o : o instanceof Map ? wrapValues((Map<?, ?>) o) : new ProvaConstantImpl(o);
    }

    @SuppressWarnings("unchecked")
    public ProvaObject rebuild(ProvaUnification unification) {
        final Map<String, ProvaObject> map = (Map<String, ProvaObject>) object;
        final Map<String, ProvaObject> newMap = new HashMap<>();
        boolean changed = false;
        for (Entry<String, ProvaObject> e : map.entrySet()) {
            ProvaObject ov = e.getValue();
            if (e.getValue() instanceof ProvaVariablePtr) {
                ProvaObject nv = unification.rebuild((ProvaVariablePtr) ov);
                newMap.put(e.getKey(), nv);
                if (ov != nv) {
                    changed = true;
                }
            } else if (ov instanceof ProvaList) {
                ProvaObject nv = ((ProvaList) ov).rebuild(unification);
                newMap.put(e.getKey(), nv);
                if (ov != nv) {
                    changed = true;
                }
            } else if (ov instanceof ProvaMapImpl) {
                ProvaObject nv = ((ProvaMapImpl) ov).rebuild(unification);
                newMap.put(e.getKey(), nv);
                if (ov != nv) {
                    changed = true;
                }
            } else
                newMap.put(e.getKey(), ov);

        }
        return changed ? new ProvaMapImpl(newMap) : this;
    }

    @SuppressWarnings("unchecked")
    public ProvaObject rebuildSource(ProvaUnification unification) {
        final Map<String, ProvaObject> map = (Map<String, ProvaObject>) object;
        final Map<String, ProvaObject> newMap = new HashMap<>();
        boolean changed = false;
        for (Entry<String, ProvaObject> e : map.entrySet()) {
            ProvaObject ov = e.getValue();
            if (e.getValue() instanceof ProvaVariablePtr) {
                ProvaObject nv = unification.rebuild((ProvaVariablePtr) ov);
                newMap.put(e.getKey(), nv);
                if (ov != nv) {
                    changed = true;
                }
            } else if (ov instanceof ProvaList) {
                ProvaObject nv = ((ProvaList) ov).rebuildSource(unification);
                newMap.put(e.getKey(), nv);
                if (ov != nv) {
                    changed = true;
                }
            } else if (ov instanceof ProvaMapImpl) {
                ProvaObject nv = ((ProvaMapImpl) ov).rebuildSource(unification);
                newMap.put(e.getKey(), nv);
                if (ov != nv) {
                    changed = true;
                }
            } else
                newMap.put(e.getKey(), ov);

        }
        return changed ? new ProvaMapImpl(newMap) : this;
    }

    @SuppressWarnings("unchecked")
    public Object unwrap() {
        final Map<String, ProvaObject> map = (Map<String, ProvaObject>) object;
        final Map<String, Object> newMap = new HashMap<>();
        for (Entry<String, ProvaObject> e : map.entrySet()) {
            ProvaObject ov = e.getValue();
            if (ov instanceof ProvaConstant)
                newMap.put(e.getKey(), ((ProvaConstant) ov).getObject());
        }
        return newMap;
    }

    @Override
    public boolean matched(ProvaConstant target) {
        return target instanceof ProvaMapImpl;
    }

}
