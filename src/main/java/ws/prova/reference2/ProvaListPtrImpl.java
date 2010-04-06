package ws.prova.reference2;

import java.util.Arrays;
import java.util.List;

import ws.prova.kernel2.ProvaList;
import ws.prova.kernel2.ProvaListPtr;
import ws.prova.kernel2.ProvaObject;
import ws.prova.kernel2.ProvaUnification;
import ws.prova.kernel2.ProvaVariable;
import ws.prova.kernel2.ProvaVariablePtr;

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
		if( offset==0 )
			return assigned;
		ProvaObject[] newFixed = Arrays.copyOfRange(assigned.getFixed(),offset,assigned.getFixed().length);
		return ProvaListImpl.create(newFixed);
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
	public int collectVariables(long ruleId, List<ProvaVariable> variables) {
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
	public boolean unify(ProvaObject target, ProvaUnification unification) {
		return assigned.unify(offset, target, unification);
	}

	@Override
	public ProvaObject rebuild(ProvaUnification unification) {
		return assigned.rebuild(unification, offset);
	}

	@Override
	public ProvaObject rebuildSource(ProvaUnification unification) {
		return assigned.rebuildSource(unification, offset);
	}

	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		for( int i=offset; i<assigned.getFixed().length; i++ ) {
			if( i!=offset )
				sb.append(',');
			sb.append(assigned.getFixed()[i]);
		}
		if( assigned.getTail()!=null ) {
			sb.append('|');
			sb.append(assigned.getTail());
		}
		sb.append(']');
		return sb.toString();
	}

	@Override
	public void substituteVariables(ProvaVariablePtr[] varsMap) {
		assigned.substituteVariables(varsMap);
	}

	@Override
	public boolean isGround() {
		return assigned.isGround();
	}

	@Override
	public String toString(List<ProvaVariable> variables) {
		return toString();
	}

	@Override
	// Not meant to be called
	public ProvaObject cloneWithVariables(List<ProvaVariable> variables) {
		return null;
	}

	@Override
	// Not meant to be called
	public ProvaObject cloneWithVariables(long ruleId, List<ProvaVariable> variables) {
		return null;
	}

	@Override
	public Object computeIfExpression() {
		return this;
	}

}
