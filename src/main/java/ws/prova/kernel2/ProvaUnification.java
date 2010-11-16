package ws.prova.kernel2;

import java.util.List;

public interface ProvaUnification {

	public boolean unify();

	public ProvaRule getSource();

	public ProvaRule getTarget();

	public long getSourceRuleId();

	public long getTargetRuleId();

	public List<ProvaVariable> getSourceVariables();

	public List<ProvaVariable> getTargetVariables();

	public ProvaLiteral[] rebuildNewGoals();

	public ProvaVariable getVariableFromVariablePtr(ProvaVariablePtr variablePtr);

	public ProvaObject rebuild(ProvaVariablePtr variablePtr);

	public ProvaLiteral[] rebuildOldGoals(ProvaLiteral[] body);

	public ProvaObject rebuildSource(ProvaVariablePtr variablePtr);

	public ProvaRule generateQuery(String symbol, ProvaKnowledgeBase kb, ProvaRule query,
			ProvaDerivationNode node);

	public boolean targetUnchanged();

}
