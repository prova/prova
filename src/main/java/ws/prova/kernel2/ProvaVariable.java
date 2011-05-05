package ws.prova.kernel2;

import ws.prova.kernel2.typing.ProvaType;

/**
 * The ProvaVariable...
 *
 */
public interface ProvaVariable extends ProvaObject, ProvaComputable {

	/**
	 * Copies of variables are consecutively numbered instead of a string name.
	 * @return The name of the variable - either string or number.
	 */
	public Object getName();

	/**
	 * 
	 * @return The ProvaType of the variable...
	 */
	public ProvaType getType();
	
	/**
	 * Assign an object to the variable.
	 * @param assigned The object to assign.
	 */
	public void setAssigned(ProvaObject assigned);

	/**
	 * @return The index of this variable within the variable array of its rule.
	 */
	public int getIndex();

	public ProvaVariable clone();

	/**
	 * 
	 * @return The object assigned to this variable.
	 */
	public ProvaObject getAssigned();

	public void setRuleId(long ruleId);

	public long getRuleId();

	/**
	 * 
	 * @param size The index of this variable within the variable array of its rule.
	 */
	public void setIndex(int size);

	/**
	 * Clone the variable for a new rule (when a target becomes a new goal...)
	 * @param ruleId New rule ID
	 * @return The cloned variable.
	 */
	public ProvaVariable clone(long ruleId);



}
