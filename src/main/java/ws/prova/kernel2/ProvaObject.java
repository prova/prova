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

	public void substituteVariables(ProvaVariablePtr[] varsMap);

	public boolean isGround();

	public String toString(List<ProvaVariable> variables);

	public ProvaObject cloneWithVariables(List<ProvaVariable> variables);

	public ProvaObject cloneWithVariables(long ruleId,
			List<ProvaVariable> variables);

	public Object computeIfExpression();

	public ProvaObject cloneWithBoundVariables(List<ProvaVariable> variables, List<Boolean> isConstant);

	public boolean updateGround(List<ProvaVariable> variables);

}
