package ws.prova.reference2;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.apache.commons.logging.Log;

import com.hp.hpl.jena.ontology.OntClass;
import com.hp.hpl.jena.ontology.OntModel;

import ws.prova.kernel2.ProvaConstant;
import ws.prova.kernel2.ProvaKnowledgeBase;
import ws.prova.kernel2.ProvaObject;
import ws.prova.kernel2.ProvaType;
import ws.prova.kernel2.ProvaUnification;
import ws.prova.kernel2.ProvaVariable;
import ws.prova.kernel2.ProvaVariablePtr;
import ws.prova.reference2.builtins.ProvaNotEqualsImpl;
import ws.prova.reference2.typing.ProvaAnyTypeImpl;
import ws.prova.reference2.typing.ProvaJavaTypeImpl;
import ws.prova.reference2.typing.ProvaOWLTypeImpl;

public class ProvaVariableImpl extends ProvaTermImpl implements ProvaVariable {

	private static final long serialVersionUID = 7501612596168443208L;

	private Object name;
	
	private ProvaType type;
	
	// The term that this variable is assigned to
	private ProvaObject assigned;

	// Where this variable is in the rule's variables
	private int index;
	
	private long ruleId;
	
	private ProvaKnowledgeBase kb;
	
	protected static AtomicLong incName = new AtomicLong(0);

	/*
	public static ProvaVariable create() {
		return new ProvaVariableImpl();
	}

	public static ProvaVariable create(String name) {
		return new ProvaVariableImpl(name);
	}

	public static ProvaVariable create(String name, Class<?> type) {
		return new ProvaVariableImpl(name, type);
	}

	public static ProvaVariableImpl create(String name, ProvaObject assigned) {
		return new ProvaVariableImpl(name, assigned);
	}
	*/
	
	protected ProvaVariableImpl(final ProvaKnowledgeBase kb, final Object name, final ProvaType type)
	{
		this.kb=kb;
		this.name=name;
		this.type=type;
		this.assigned = null;
		this.index = -1;
	}
	
	private ProvaVariableImpl(final ProvaType type, final ProvaObject assigned, final int index,
			final long ruleId) {
		this.name = incName.incrementAndGet();
		this.type = type;
		this.assigned = assigned;
		this.index = index;
		this.ruleId = ruleId;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public Object getName() {
		return name;
	}
	
	@Override
	public ProvaType getType() {
		return type;
	}
	
	@Override
	public void setAssigned(ProvaObject assigned) {
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
		if( assigned instanceof ProvaConstant )
			return assigned;
		if( assigned==this ) {
			assigned=null;
			return this;
		}
		if( assigned==null )
			return this;
		ProvaObject recursivelyAssigned = assigned.getRecursivelyAssigned();
		if( assigned!=recursivelyAssigned )
			assigned = recursivelyAssigned;
		return recursivelyAssigned;
	}

	@Override
	public int collectVariables(final long ruleId, final List<ProvaVariable> variables) {
		if( assigned!=null ) {
			assigned.collectVariables(ruleId, variables);
			return -1;
		}
		int foundIndex = variables.indexOf(this);
		if( foundIndex!=-1 ) {
			index = foundIndex;
			return index;
		}
		index = variables.size();
		variables.add(this);
		return index;
	}

	@Override
	public int computeSize() {
		if( assigned!=null )
			return assigned.computeSize();
		return -1;
	}

//	@Override
//	public void collectVariables(long ruleId, Vector<ProvaVariable> variables, int offset) {
//		collectVariables(ruleId, variables);
//	}
	
	@Override
	public ProvaVariable clone() {
		ProvaVariableImpl newVariable = new ProvaVariableImpl(type,assigned,index,ruleId);
		return newVariable;
	}

	@Override
	public ProvaVariable clone(long ruleId) {
		ProvaVariableImpl newVariable = new ProvaVariableImpl(type,assigned,index,ruleId);
		return newVariable;
	}

	@Override
	public boolean unify(final ProvaObject target, final ProvaUnification unification) {
	
		if( target==null ) {
			assigned = ProvaListImpl.emptyRList;
			return true;
		}
		
		if( target instanceof ProvaVariable ) 
		{
			ProvaVariable targetVar = (ProvaVariable)target;
			if(this.type.isSubtypeOf(targetVar.getType()))
			{
				targetVar.setAssigned(this);
				return true;
			}
			if(targetVar.getType().isSubtypeOf(this.type))
			{
				assigned = target;
				return true;
			}
		}
	
		else if( target instanceof ProvaConstant ) 
		{
			ProvaConstant targetConst = (ProvaConstant) target;
			if( targetConst instanceof ProvaAnyImpl )
				return true;
			if(targetConst.getType().isSubtypeOf(this.type))
			{
				assigned = target;
				return true;
			}
		}
		else if(new ProvaJavaTypeImpl(target.getClass()).isSubtypeOf(this.type))
			// TODO: don't create this object here
		{
			assigned = target;
			return true;		
		}
		
		return false;
	
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
		if( assigned==null ) {
			StringBuilder sb = new StringBuilder();
			if( type!=ProvaAnyTypeImpl.singleton) {
				sb.append(type.toString());
				sb.append('.');
			}
			String strName = name.toString();
			if( strName.length()!=0 && Character.isDigit(strName.charAt(0)) ) {
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
	public boolean equals( Object o ) {
		ProvaVariableImpl var = (ProvaVariableImpl) o;
		return var.name.equals(name) && var.type==type;
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
		if( assigned!=null )
			return assigned;
		return this;
	}

	@Override
	public ProvaObject cloneWithVariables(final List<ProvaVariable> variables) {
		if( assigned!=null )
			return assigned;
		return this;
	}

	@Override
	public ProvaObject cloneWithVariables(final long ruleId, final List<ProvaVariable> variables) {
		if( assigned!=null )
			return assigned;
		return this;
	}

	@Override
	public Object computeIfExpression() {
		return this;
	}

	@Override
	public Object compute() {
		return this;
	}

	@Override
	public boolean updateGround(final List<ProvaVariable> variables) {
		if( assigned!=null )
			return assigned.updateGround(variables);
		return false;
	}

}
