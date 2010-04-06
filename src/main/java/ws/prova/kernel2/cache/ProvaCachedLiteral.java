package ws.prova.kernel2.cache;

import ws.prova.kernel2.ProvaGoal;
import ws.prova.kernel2.ProvaLiteral;

public interface ProvaCachedLiteral extends ProvaLiteral {

	public void setGoal(ProvaGoal provaGoal);

	public ProvaCacheState getCacheState();

	public ProvaLocalAnswers getAnswers();

	public ProvaGoal getGoal();

}
