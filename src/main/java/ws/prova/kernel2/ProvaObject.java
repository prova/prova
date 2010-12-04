package ws.prova.kernel2;

import java.io.Serializable;
import java.util.List;

/**
 * TODO: Rename to ProvaTerm once all rewrite is complete
 * @author Alex Kozlenkov
 *
 */
public interface ProvaObject extends Serializable {
	
	public ProvaObject getRecursivelyAssigned();
	
	public int collectVariables(long ruleId, List<ProvaVariable> variables);

	public int computeSize();

//	public void collectVariables(long ruleId, Vector<ProvaVariable> variables, int offset);

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
