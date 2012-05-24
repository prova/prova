package ws.prova.reference2.builtins;

import java.util.List;

import org.apache.log4j.Logger;
import org.openrdf.repository.RepositoryConnection;
import org.openrdf.repository.RepositoryException;

import ws.prova.agent2.ProvaReagent;
import ws.prova.kernel2.ProvaConstant;
import ws.prova.kernel2.ProvaDerivationNode;
import ws.prova.kernel2.ProvaGoal;
import ws.prova.kernel2.ProvaKnowledgeBase;
import ws.prova.kernel2.ProvaList;
import ws.prova.kernel2.ProvaLiteral;
import ws.prova.kernel2.ProvaObject;
import ws.prova.kernel2.ProvaRule;
import ws.prova.kernel2.ProvaVariable;
import ws.prova.kernel2.ProvaVariablePtr;

/**
 * sparql_disconnect built-in.
 * 
 * Usage:
 * <code>
 * sparql_disconnect(Connection).
 * </code>
 * 
 * sparql_connect disconnects the <code>RepositoryConnection</code> stored in
 * <code>Connection</code>.
 * 
 * @author Malte Rohde <malte.rohde@inf.fu-berlin.de>
 */
public class ProvaSparqlDisconnectImpl extends ProvaBuiltinImpl {

	private static final Logger log = Logger.getLogger(ProvaSparqlDisconnectImpl.class);
	
	public ProvaSparqlDisconnectImpl(ProvaKnowledgeBase kb) {
		super(kb, "sparql_disconnect");
	}
	
	@Override
	public int getArity() {
		return 1;
	}

	@Override
	public boolean process(ProvaReagent prova, ProvaDerivationNode node,
			ProvaGoal goal, List<ProvaLiteral> newLiterals, ProvaRule query) {
		List<ProvaVariable> variables = query.getVariables();
		ProvaLiteral literal = goal.getGoal();
		ProvaList terms = (ProvaList) literal.getTerms();
		ProvaObject[] data = terms.getFixed();
		
		if(data.length != 1) {
			log.error("Syntax error. Can only use 1 term.");
			return false;
		}
		
		ProvaObject data0 = data[0];
		if(data0 instanceof ProvaVariablePtr) {
			ProvaVariablePtr varPtr = (ProvaVariablePtr) data0;
			data0 = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
		}
		
		if(!(data0 instanceof ProvaConstant)) {
			log.error("Binding error. Term 1 must be constant.");
			return false;
		}
		
		Object obj = ((ProvaConstant) data0).getObject();
		if(!(obj instanceof RepositoryConnection)) {
			log.error("Binding error. Term 1 must be a RepositoryConnection.");
			return false;
		}
		
		// Do the work.
		try {
			((RepositoryConnection) obj).close();
		} catch (RepositoryException e) {
			log.error("Could not close connection.");
			return false;
		}
		
		return true;
	}	
}
