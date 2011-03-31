package ws.prova.reference2;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.apache.commons.logging.Log;

import com.hp.hpl.jena.ontology.OntClass;
import com.hp.hpl.jena.ontology.OntModel;

import ws.prova.kernel2.ProvaConstant;
import ws.prova.kernel2.ProvaObject;
import ws.prova.kernel2.ProvaUnification;
import ws.prova.kernel2.ProvaVariable;
import ws.prova.kernel2.ProvaVariablePtr;

public class ProvaVariableImpl extends ProvaTermImpl implements ProvaVariable {

	private static final long serialVersionUID = 7501612596168443208L;

	private Object name;
	
	private Class<?> type;
	
	private String semanticEntity;
	
	// The term that this variable is assigned to
	private ProvaObject assigned;

	// Where this variable is in the rule's variables
	private int index;
	
	private long ruleId;

	private static AtomicLong incName = new AtomicLong(0);
	
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

	private ProvaVariableImpl() {
		this.name = incName.incrementAndGet();
		this.type = Object.class;
		this.assigned = null;
		this.index = -1;
	}
	
	private ProvaVariableImpl(final String name) {
		int idx=name.indexOf("^^");
		if(idx>0)
			semanticEntity=name.substring(idx+2);
		this.name = "_".equals(name) ? incName.incrementAndGet() : name;
		this.type = Object.class;
		this.assigned = null;
		this.index = -1;
	}

	private ProvaVariableImpl( final String name, final Class<?> type ) {
		int idx=name.indexOf("^^");
		if(idx>0)
			semanticEntity=name.substring(idx+2);
		this.name = name;
		this.type = type;
		this.assigned = null;
		this.index = -1;
	}
	
	private ProvaVariableImpl(final Class<?> type, final ProvaObject assigned, final int index,
			final long ruleId, final String semanticEntity) {
		this.name = incName.incrementAndGet();
		this.type = type;
		this.assigned = assigned;
		this.index = index;
		this.ruleId = ruleId;
		this.semanticEntity=semanticEntity;
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
	public String getSemanticEntity()
	{
		return semanticEntity;
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
		ProvaVariableImpl newVariable = new ProvaVariableImpl(type,assigned,index,ruleId,semanticEntity);
		return newVariable;
	}

	@Override
	public ProvaVariable clone(long ruleId) {
		ProvaVariableImpl newVariable = new ProvaVariableImpl(type,assigned,index,ruleId,semanticEntity);
		return newVariable;
	}

	@Override
	public boolean unify(final ProvaObject target, final ProvaUnification unification) {
		if( target==null ) {
			assigned = ProvaListImpl.emptyRList;
			return true;
		}
		if( target instanceof ProvaVariable ) {
			if(this.isSubtypeOf((ProvaVariable)target, unification))
			{
				((ProvaVariable) target).setAssigned(this);
				return true;
			}
			if( ((ProvaVariable) target).isSubtypeOf(this, unification) ) {
				assigned = target;
				return true;
			}
			return false;
//			if( !((ProvaVariable) target).getType().isAssignableFrom(type) )
//				return false;
//			((ProvaVariable) target).setAssigned(this);
//			return true;
		}
		if( type!=Object.class ) {
			if( target instanceof ProvaConstant ) {
				if( target instanceof ProvaAnyImpl )
					return true;
				if( !type.isInstance(((ProvaConstant) target).getObject()) )
					return false;
			}
		}
		assigned = target;
		return true;
	}
	
	/**
	 * Check if the target variable is a supertype of this variable
	 * in regarding the associated java type and the OWL type.
	 */
	public final boolean isSubtypeOf(ProvaVariable target, ProvaUnification unification)
	{
		//check java type:
		final Class<?> targetType = target.getType();
		if(!targetType.isAssignableFrom(type))
			return false;
		
		// check OWL type:
		OntModel m=unification.getOntologyModel();
		if(m!=null)
		{
			// if we have an ontology loaded, we use the URIs to 
			// retrieve the classes and check if they are compatible:
			OntClass goalClass=m.getOntClass(m.expandPrefix(this.semanticEntity)),
			         targetClass=m.getOntClass(m.expandPrefix(target.getSemanticEntity()));
			if(goalClass==null||targetClass==null)
				return true;
			if(goalClass!=null&&targetClass!=null&&!goalClass.hasSuperClass(targetClass))
				return false;
		}
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
		if( assigned==null ) {
			StringBuilder sb = new StringBuilder();
			if( type!=Object.class ) {
				sb.append(type.getCanonicalName());
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
