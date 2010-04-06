package ws.prova.reference2;

import java.util.List;

import ws.prova.kernel2.ProvaComputable;
import ws.prova.kernel2.ProvaConstant;
import ws.prova.kernel2.ProvaList;
import ws.prova.kernel2.ProvaObject;
import ws.prova.kernel2.ProvaUnification;
import ws.prova.kernel2.ProvaVariable;
import ws.prova.kernel2.ProvaVariablePtr;

public class ProvaConstantImpl extends ProvaTermImpl implements ProvaConstant, ProvaComputable {

	private static final long serialVersionUID = -3976583974992460058L;

	private Object object;
	
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
	public ProvaObject cloneWithVariables(List<ProvaVariable> variables) {
		return this;
	}

	@Override
	public ProvaObject cloneWithVariables(long ruleId, List<ProvaVariable> variables) {
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

	public static ProvaObject wrap(Object o) {
		return (o instanceof ProvaConstant) ? (ProvaConstant) o : create(o);
	}

}
