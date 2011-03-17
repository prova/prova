package ws.prova.plugin;

import java.util.List;

import ws.prova.kernel2.ProvaGoal;
import ws.prova.kernel2.ProvaLiteral;
import ws.prova.kernel2.ProvaRule;

public interface ProvaPredicatePlugin extends ProvaPlugin {
	public String getPredicateName();
	
	// TODO verify whether this is needed for builtins (see ProvaBuiltinImpl)
	public int getArity();
	
	public boolean process(ProvaGoal goal, List<ProvaLiteral> newLiterals, ProvaRule query);
}
