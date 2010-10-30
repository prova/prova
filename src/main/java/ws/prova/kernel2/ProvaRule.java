package ws.prova.kernel2;

import java.util.List;
import java.util.Map;

public interface ProvaRule {

	public void collectVariables();

	public List<ProvaVariable> getVariables();

	public List<ProvaVariable> cloneVariables();

	public ProvaLiteral getHead();

	public ProvaLiteral[] getBody();

	public long getRuleId();
	
	public ProvaRule cloneRule();

	public boolean advance();

	public ProvaLiteral getTop();

	public void setVariables(List<ProvaVariable> variables);

	public void substituteVariables(ProvaVariablePtr[] varsMap);

	public void setRuleId(long ruleId);

	public int getOffset();

	public void addBodyLiteral(ProvaLiteral literal);

	public void replaceTopBodyLiteral(List<ProvaLiteral> newLiterals);

	public ProvaRule cloneRule(boolean cloneVariables);

	public void collectVariables(int offset);

	public Object getFirstArg();

	public void removeAt(int index);

	public void setRemoved();

	public boolean isRemoved();

	public boolean isCut();

	public String getSourceCode();

	public void computeSourceCode();

	public void setMetadata(String property, List<Object> value);

	public List<Object> getMetadata(String property);

	public void addMetadata(Map<String, List<Object>> m);

	public Map<String, List<Object>> getMetadata();

	public void setLine(int line);

	public int getLine();

	public ProvaLiteral[] getGuardedBody(ProvaLiteral sourceLiteral);

	public void setSrc(List<Object> value);

	public long getAbsRuleId();

}
