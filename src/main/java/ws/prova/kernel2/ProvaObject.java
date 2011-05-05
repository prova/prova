package ws.prova.kernel2;

import java.io.Serializable;
import java.util.List;

/**
 * TODO: Rename to ProvaTerm once all rewrite is complete
 * @author Alex Kozlenkov
 *
 */
public interface ProvaObject extends Serializable {
	
	/**
	 * A variable can be assigned to a variable can be assigned to a variable...
	 * This method follows recursive assignments to an object which is not an assigned variable.
	 * 
	 * TODO: This method only makes sense for variables, maybe it can be removed from ProvaObject...
	 * 
	 * @return The ProvaObject at the end of the assignment chain (might be this object).
	 */
	public ProvaObject getRecursivelyAssigned();
	
	/**
	 * Find unassigned variables in this term.
	 * @param ruleId ID of the rule this term belongs to
	 * @param variables A list to which the found variables are added.
	 * @return The number collected variables ???
	 */
	public int collectVariables(long ruleId, List<ProvaVariable> variables);

	public int computeSize();

	/**
	 * Unify this goal with a target, variables get assigned if possible.
	 * @param target The target term.
	 * @param unification The current unification object.
	 * @return True iff the unification succeeds.
	 */
	public boolean unify(ProvaObject target, ProvaUnification unification);

	public void substituteVariables(final ProvaVariablePtr[] varsMap);

	public boolean isGround();

	public String toString(final List<ProvaVariable> variables);

	public ProvaObject cloneWithVariables(final List<ProvaVariable> variables);

	public ProvaObject cloneWithVariables(final long ruleId,
			final List<ProvaVariable> variables);

	public Object computeIfExpression();

	public ProvaObject cloneWithBoundVariables(final List<ProvaVariable> variables, final List<Boolean> isConstant);

	public boolean updateGround(final List<ProvaVariable> variables);

}
