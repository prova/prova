package ws.prova.reference2;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import ws.prova.kernel2.ProvaConstant;
import ws.prova.kernel2.ProvaObject;
import ws.prova.kernel2.ProvaUnification;
import ws.prova.kernel2.ProvaVariable;
import ws.prova.kernel2.ProvaVariablePtr;
import ws.prova.kernel2.typing.ProvaType;
import ws.prova.reference2.typing.ProvaAnyTypeImpl;
import ws.prova.reference2.typing.ProvaJavaTypeImpl;

/**
 * The variable class...
 *
 */
public class ProvaVariableImpl extends ProvaTermImpl implements ProvaVariable {

	private static final long serialVersionUID = 7501612596168443208L;

	private final ProvaType type;
	
	// Variable name - either string or number
	private Object name;
	
	// The term assigned to this variable
	private ProvaObject assigned;

	// Where this variable is in the rule's variables
	// TODO: Is there need for this??
	private int index;
	
	// Unique ID of the rule this variable belongs to.
	// Used by ProvaUnification to tell target from goal variables.
	private long ruleId;

	// Working copies of variables get a number of this counter instead of a string name:
	protected static AtomicLong incName = new AtomicLong(0);


	public static ProvaVariable create() {
		return new ProvaVariableImpl();
	}

	public static ProvaVariable create(String name) {
		return new ProvaVariableImpl(name);
	}

	public static ProvaVariable create(String name, ProvaType type) {
		return new ProvaVariableImpl(name, type);
	}

	public static ProvaVariableImpl create(String name, ProvaObject assigned) {
		return new ProvaVariableImpl(name, assigned);
	}

	private ProvaVariableImpl() {
		this.name = incName.incrementAndGet();
		this.type = ProvaAnyTypeImpl.singleton;
		this.assigned = null;
		this.index = -1;
	}
	
	private ProvaVariableImpl(final String name) {
		this.name = "_".equals(name) ? incName.incrementAndGet() : name;
		this.type = ProvaAnyTypeImpl.singleton;
		this.assigned = null;
		this.index = -1;
	}

	private ProvaVariableImpl(final String name, final ProvaObject assigned) {
		this.name = name;
		this.assigned = assigned;
		this.type = ProvaAnyTypeImpl.singleton;
		this.index = -1;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Constructor for blank variables.
	 * Constructors are private, instances are created by ProvaKnowledgeBase methods.
	 * 
	 * @param name the name
	 * @param type the type
	 */
	protected ProvaVariableImpl(final Object name, final ProvaType type)
	{
		this.name=name;
		this.type=type;
		this.assigned = null;
		this.index = -1;
	}
	

	/**
	 * Constructor used by clone.
	 * Constructors are private, instances are created by ProvaKnowledgeBase methods.
	 * 
	 * @param type the type
	 * @param assigned assigned object
	 * @param index  the variables index in its rule
	 * @param ruleId ID of the rule this variable belongs to
	 */
	private ProvaVariableImpl(final ProvaType type, final ProvaObject assigned, final int index,
			final long ruleId) {
		this.name = incName.incrementAndGet();
		this.type = type;
		this.assigned = assigned;
		this.index = index;
		this.ruleId = ruleId;
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
	
		// Unification with nothing:
		if( target==null ) {
			assigned = ProvaListImpl.emptyRList;
			return true;
		}
		
		// Unification with variable:
		if( target instanceof ProvaVariable ) 
		{
			ProvaVariable targetVar = (ProvaVariable)target;
			
			// assign goal var to target var if possible: 
			if(this.type.isSubtypeOf(targetVar.getType()))
			{
				targetVar.setAssigned(this);
				return true;
			}
			
			// else assign target var to goal var if possible:
			if(targetVar.getType().isSubtypeOf(this.type))
			{
				assigned = target;
				return true;
			}
		}
	
		// Unification with constant:
		else if( target instanceof ProvaConstant ) 
		{
			ProvaConstant targetConst = (ProvaConstant) target;
			
			// ProvaAnyImpl (_): unification succeeds but no assignment takes place
			if( targetConst instanceof ProvaAnyImpl )
				return true;
			
			// normal constant: assign if types are compatible
			if(targetConst.getType().isSubtypeOf(this.type))
			{
				assigned = target;
				return true;
			}
		}
		
		// Unification with something else:
		// no type checking. TODO: maybe there should be...
		else if(new ProvaJavaTypeImpl(target.getClass()).isSubtypeOf(this.type))
			// TODO: don't create this object here
		{
			assigned = target;
			return true;		
		}
		
		// nothing worked out:
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
		return var.name.equals(name) && var.type.equals(type);
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
