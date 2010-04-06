package ws.prova.reference2.builtins.target;

import ws.prova.kernel2.ProvaGoal;
import ws.prova.kernel2.ProvaRule;

public interface ProvaTarget {

	public ProvaGoal getTarget();

	public ProvaRule getCandidate();

	public void setCandidate(ProvaRule candidate);

}
