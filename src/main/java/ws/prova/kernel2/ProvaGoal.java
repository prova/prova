package ws.prova.kernel2;

import java.util.Iterator;
import java.util.List;

public interface ProvaGoal {

	public ProvaRule next();

	public ProvaLiteral getGoal();

	public ProvaUnification nextUnification(ProvaKnowledgeBase kb);

	public ProvaRule getQuery();

	public void setCut(boolean cut);

	public void setGoal(ProvaLiteral top);

	public boolean hasNext();

	public Iterator<ProvaRule> getIterator();

	public void addAnswer(ProvaList terms);

	public void addOuterAnswer(ProvaList terms);

	public boolean isSingleClause();

	public void removeTarget();

	public void updateMetadataGoal();

	public Object lookupMetadata(String variable, List<ProvaVariable> variables);

	public ProvaRule getLastMatch();
	
	public void setLastMatch(ProvaRule lastMatch);

	boolean isCut();

	public void update();

}
