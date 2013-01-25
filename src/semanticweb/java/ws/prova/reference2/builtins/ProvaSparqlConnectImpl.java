package ws.prova.reference2.builtins;

import java.util.List;

import org.apache.log4j.Logger;
import org.openrdf.repository.Repository;
import org.openrdf.repository.RepositoryConnection;
import org.openrdf.repository.RepositoryException;
import org.openrdf.repository.http.HTTPRepository;

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
import ws.prova.reference2.ProvaConstantImpl;

/**
 * sparql_connect built-in.
 * 
 * Usage:
 * <code>
 * sparql_connect(Connection, HTTPEndpoint).
 * </code>
 * 
 * sparql_connect connects to the SPARQL HTTP end point specified in <code>HTTPEndpoint</code>
 * and binds the connection to the (free) <code>Connection</code> variable.
 * 
 * If <code>Connection</code> is bound to an existing <code>RepositoryConnection</code>
 * object (from a previous call), the predicate tests whether the connection is open. 
 * In this case, <code>HTTPEndpoint</code> is ignored.
 * 
 * @author Malte Rohde <malte.rohde@inf.fu-berlin.de>
 */
public class ProvaSparqlConnectImpl extends ProvaBuiltinImpl {
	private static final Logger log = Logger.getLogger(ProvaSparqlConnectImpl.class);
	
	public ProvaSparqlConnectImpl(ProvaKnowledgeBase kb) {
		super(kb, "sparql_connect");
	}
	
	@Override
	public int getArity() {
		return 2;
	}

	@Override
	public boolean process(ProvaReagent prova, ProvaDerivationNode node,
			ProvaGoal goal, List<ProvaLiteral> newLiterals, ProvaRule query) {
		List<ProvaVariable> variables = query.getVariables();
		ProvaLiteral literal = goal.getGoal();
		ProvaList terms = (ProvaList) literal.getTerms();
		ProvaObject[] data = terms.getFixed();
		
		if(data.length != 2) {
			log.error("Syntax error. Need two terms.");
			return false;
		}
		
		// Resolve first term to RepositoryConnection or variable.
		ProvaObject data0 = resolve(data[0], variables);
		if(data0 instanceof ProvaConstant) {
			Object obj = ((ProvaConstant) data0).getObject();
			if(obj instanceof RepositoryConnection) {
				
				RepositoryConnection conn = (RepositoryConnection) obj;
				try {
					// Predicate is true if the connection is good.
					return conn.isOpen();
				} catch (RepositoryException e) {
					log.error("Could not determine status of given repository connection.");
					if(log.isDebugEnabled())
						log.debug("Exception: ", e);
					return false;
				}
				
			} else {
				log.error("Binding error. First term is bound to something that is not a RepositoryConnection.");
				return false;
			}
		}
		
		// Resolve second term to end point URL.
		ProvaObject data1 = resolve(data[1], variables);
		if(!(data1 instanceof ProvaConstant)) {
			log.error("Second term must be constant string (HTTP end point).");
			return false;
		}
		String url = (String) ((ProvaConstant) data1).getObject();
				
		// Initialize repository.
		Repository repo = new HTTPRepository(url);
		try {
			repo.initialize();
		} catch (RepositoryException e) {
			log.error("Could not initialize repository \"" + url + "\".");
			if(log.isDebugEnabled())
				log.debug("Exception: ", e);
			return false;
		}
		
		// Connect.
		RepositoryConnection con;
		try {
			con = repo.getConnection();
		} catch (RepositoryException e) {
			log.error("Could not connect to repository \"" + url + "\".");
			if(log.isDebugEnabled())
				log.debug("Exception: ", e);
			return false;
		}
		
		// Bind connection to first term.
		ProvaVariable cvar = (ProvaVariable) data0;
		cvar.setAssigned(ProvaConstantImpl.create(con));
		return true;
	}

	
	/*
	 * Little helper method to resolve ProvaVariables to the constants their bound to
	 */
	protected ProvaObject resolve(ProvaObject o, List<ProvaVariable> variables) {
		if(o instanceof ProvaVariablePtr) {
			ProvaVariablePtr varPtr = (ProvaVariablePtr) o;
			o = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
		}
		return o;
	}
}
