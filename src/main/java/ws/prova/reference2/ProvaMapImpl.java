package ws.prova.reference2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import ws.prova.kernel2.ProvaConstant;
import ws.prova.kernel2.ProvaList;
import ws.prova.kernel2.ProvaObject;
import ws.prova.kernel2.ProvaUnification;
import ws.prova.kernel2.ProvaVariable;
import ws.prova.kernel2.ProvaVariablePtr;

public class ProvaMapImpl extends ProvaConstantImpl {

	private static final long serialVersionUID = -4660675788561894085L;

	public static ProvaMapImpl create(Object object) {
		return new ProvaMapImpl(object);
	}

	protected ProvaMapImpl(Object object) {
		super(object);
	}

	@Override
	public int collectVariables(long ruleId, List<ProvaVariable> variables) {
		int rc = -1;
		Map<String,ProvaObject> map = (Map<String,ProvaObject>) object;
		for( Entry<String,ProvaObject> e : map.entrySet() ) {
			if( e.getValue() instanceof ProvaVariablePtr )
				continue;
			int r = e.getValue().collectVariables(ruleId, variables);
			if( r!=-1 ) {
				e.setValue(new ProvaVariablePtrImpl(ruleId, r));
				rc = r;
			}
		}
		return rc;
	}

	@Override
	public boolean unify(ProvaObject target, ProvaUnification unification) {
		if( target==null )
			return false;
		if( target instanceof ProvaVariable )
			return ((ProvaVariable) target).unify(this, unification);
		if( target instanceof ProvaVariablePtr ) {
			return ((ProvaVariablePtr) target).unify(this, unification);
		} else if( target instanceof ProvaList ) {
			return false;
		} else if( target instanceof ProvaListPtrImpl ) {
			return false;
		}
		// The target is a constant
		ProvaConstant targetConstant = (ProvaConstant) target;
		// TODO: deal with types later
		Object targetObject = targetConstant.getObject();
		if( object instanceof Map<?,?> && targetObject instanceof Map<?,?> ) {
			Map<?,?> tgt = (Map<?,?>) object;
			Map<?,?> src = (Map<?,?>) targetObject;
			for( Entry<?, ?> s : src.entrySet() ) {
				ProvaObject tgtValue = (ProvaObject) tgt.get(s.getKey());
				if( tgtValue==null )
					return false;
				boolean rc = ((ProvaObject) s.getValue()).unify(tgtValue, unification);
				if( !rc )
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
		if( object==null )
			return "null";
		return object.toString();
	}

	@Override
	public void substituteVariables( ProvaVariablePtr[] varsMap) {
		Map<String,ProvaObject> map = (Map<String,ProvaObject>) object;
		for( Entry<String,ProvaObject> e : map.entrySet() ) {
			ProvaObject value = e.getValue();
			if( value instanceof ProvaVariablePtr )
				e.setValue(varsMap[((ProvaVariablePtr) value).getIndex()]);
			else
				e.getValue().substituteVariables(varsMap);
		}
	}

	@Override
	public boolean isGround() {
		Map<String,ProvaObject> map = (Map<String,ProvaObject>) object;
		for( Entry<String,ProvaObject> e : map.entrySet() ) {
			if( !e.getValue().isGround() )
				return false;
		}
		return true;
	}

	@Override
	public ProvaObject cloneWithVariables(List<ProvaVariable> variables) {
		if( isGround() )
			return this;
		Map<String,ProvaObject> map = (Map<String,ProvaObject>) object;
		Map<String,ProvaObject> newMap = new HashMap<String,ProvaObject>();
		for( Entry<String,ProvaObject> e : map.entrySet() ) {
			if( e.getValue().isGround() )
				newMap.put(e.getKey(),e.getValue());
			else
				newMap.put(e.getKey(), e.getValue().cloneWithVariables(variables));
		}
		return ProvaMapImpl.create(newMap);
	}

	@Override
	public ProvaObject cloneWithVariables(long ruleId, List<ProvaVariable> variables) {
		if( isGround() )
			return this;
		Map<String,ProvaObject> map = (Map<String,ProvaObject>) object;
		Map<String,ProvaObject> newMap = new HashMap<String,ProvaObject>();
		for( Entry<String,ProvaObject> e : map.entrySet() ) {
			if( e.getValue().isGround() )
				newMap.put(e.getKey(),e.getValue());
			else
				newMap.put(e.getKey(), e.getValue().cloneWithVariables(ruleId, variables));
		}
		return ProvaMapImpl.create(newMap);
	}

	@Override
	public Number compute() {
		return (Number) object;
	}

	@Override
	public Object computeIfExpression() {
		return object;
	}

	public static ProvaObject wrap(Map<?,?> m) {
		Map<String,ProvaObject> map = new HashMap<String,ProvaObject>();
		for( Entry<?,?> e : m.entrySet() ) {
			map.put(e.getKey().toString(), ProvaConstantImpl.create(e.getValue()));
		}
		return ProvaMapImpl.create(map);
	}

	public static ProvaObject wrap(Object o) {
		return (o instanceof ProvaConstant) ? (ProvaConstant) o : create(o);
	}

	public ProvaObject rebuild(ProvaUnification unification) {
		Map<String,ProvaObject> map = (Map<String,ProvaObject>) object;
		Map<String,ProvaObject> newMap = new HashMap<String,ProvaObject>();
		boolean changed = false;
		for( Entry<String,ProvaObject> e : map.entrySet() ) {
			ProvaObject ov = e.getValue();
			if( e.getValue() instanceof ProvaVariablePtr ) {
				ProvaObject nv = unification.rebuild((ProvaVariablePtr) ov);
				newMap.put(e.getKey(),nv);
				if( ov!=nv ) {
					changed = true;
				}
				continue;
			} else if( ov instanceof ProvaList ) {
				ProvaObject nv = ((ProvaList) ov).rebuild(unification);
				newMap.put(e.getKey(),nv);
				if( ov!=nv ) {
					changed = true;
				}
				continue;
			} else if( ov instanceof ProvaMapImpl ) {
				ProvaObject nv = ((ProvaMapImpl) ov).rebuild(unification);
				newMap.put(e.getKey(),nv);
				if( ov!=nv ) {
					changed = true;
				}
				continue;
			} else
				newMap.put(e.getKey(),ov);

		}
		return changed ? new ProvaMapImpl(newMap): this;
	}

	public ProvaObject rebuildSource(ProvaUnification unification) {
		Map<String,ProvaObject> map = (Map<String,ProvaObject>) object;
		Map<String,ProvaObject> newMap = new HashMap<String,ProvaObject>();
		boolean changed = false;
		for( Entry<String,ProvaObject> e : map.entrySet() ) {
			ProvaObject ov = e.getValue();
			if( e.getValue() instanceof ProvaVariablePtr ) {
				ProvaObject nv = unification.rebuild((ProvaVariablePtr) ov);
				newMap.put(e.getKey(),nv);
				if( ov!=nv ) {
					changed = true;
				}
				continue;
			} else if( ov instanceof ProvaList ) {
				ProvaObject nv = ((ProvaList) ov).rebuildSource(unification);
				newMap.put(e.getKey(),nv);
				if( ov!=nv ) {
					changed = true;
				}
				continue;
			} else if( ov instanceof ProvaMapImpl ) {
				ProvaObject nv = ((ProvaMapImpl) ov).rebuildSource(unification);
				newMap.put(e.getKey(),nv);
				if( ov!=nv ) {
					changed = true;
				}
				continue;
			} else
				newMap.put(e.getKey(),ov);

		}
		return changed ? new ProvaMapImpl(newMap): this;
	}

	public Object unwrap() {
		Map<String,ProvaObject> map = (Map<String,ProvaObject>) object;
		Map<String,Object> newMap = new HashMap<String,Object>();
		for( Entry<String,ProvaObject> e : map.entrySet() ) {
			ProvaObject ov = e.getValue();
			if( ov instanceof ProvaConstant )
				newMap.put(e.getKey(), ((ProvaConstant) ov).getObject());
		}
		return newMap;
	}

	@Override
	public boolean matched( ProvaConstant target ) {
		if( target instanceof ProvaMapImpl )
			return true;
		return false;
	}
	
}
