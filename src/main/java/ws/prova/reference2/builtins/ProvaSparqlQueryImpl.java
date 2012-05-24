package ws.prova.reference2.builtins;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.openrdf.query.Binding;
import org.openrdf.query.BindingSet;
import org.openrdf.query.BooleanQuery;
import org.openrdf.query.MalformedQueryException;
import org.openrdf.query.Query;
import org.openrdf.query.QueryEvaluationException;
import org.openrdf.query.QueryLanguage;
import org.openrdf.query.TupleQuery;
import org.openrdf.query.TupleQueryResult;
import org.openrdf.query.TupleQueryResultHandler;
import org.openrdf.query.TupleQueryResultHandlerException;
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
import ws.prova.kernel2.ProvaPredicate;
import ws.prova.kernel2.ProvaRule;
import ws.prova.kernel2.ProvaVariable;
import ws.prova.kernel2.ProvaVariablePtr;
import ws.prova.reference2.ProvaConstantImpl;
import ws.prova.reference2.ProvaListImpl;
import ws.prova.reference2.ProvaLiteralImpl;
import ws.prova.reference2.ProvaRuleImpl;

/**
 * sparql_query built-in.
 * 
 * Usage:
 * <code>
 * sparql_query(Connection, QueryStr, QueryID [, XID])
 * </code>
 * 
 * <code>sparql_query</code> executes a SPARQL select or ask query on the given 
 * repository connection. After successful execution, it binds the result set of 
 * the query to the <code>sparql_results</code> predicate, using <code>QueryID</code>
 * as the first term and the requested SPARQL variables as the remaining terms,
 * in the order they were specified in the SPARQL query.
 * 
 * <code>QueryID</code> can be either a constant term or a variable, in the latter
 * case it is assigned a random identifier number.
 * 
 * The fourth term, <code>XID</code>, is the only optional parameter. If specified,
 * the query is executed asynchronously, i.e. the call to <code>sparql_query</code>
 * returns immediately and the client will be notified when the results are stored
 * in the knowledge base. This notification comes in form of an internal message with
 * its title set to "sparql_query", which can be received using the <code>rcvMsg</code> 
 * built-in, see the example below. If <code>XID</code> is a variable, it will as 
 * well be assigned a random number.
 * 
 * Example:
 * <code>
 * sparql_connect(Connection, "http://dbpedia.org/sparql"),
 * sparql_query(Connection, "SELECT * WHERE { ?a ?b ?c . }", QueryID, 0),
 * rcvMsg(0, Protocol, async, sparql_query, { qid -> QueryID }),
 * sparql_results(QueryID, A, B, C),
 * println([A, " ", B, " ", C, " ."]).
 * </code>
 * 
 * @author Malte Rohde <malte.rohde@inf.fu-berlin.de>
 */
public class ProvaSparqlQueryImpl extends ProvaBuiltinImpl {
	private static final Logger log = Logger.getLogger(ProvaSparqlQueryImpl.class);
	private static int nqid = 0;
	private static int nxid = 0;
	
	public ProvaSparqlQueryImpl(ProvaKnowledgeBase kb) {
		super(kb, "sparql_query");
	}
	
	@Override
	public int getArity() {
		return -1;
	}

	@Override
	public boolean process(ProvaReagent prova, ProvaDerivationNode node,
			ProvaGoal goal, List<ProvaLiteral> newLiterals, ProvaRule query) {
		List<ProvaVariable> variables = query.getVariables();
		ProvaLiteral literal = goal.getGoal();
		ProvaList terms = (ProvaList) literal.getTerms();
		ProvaObject[] data = terms.getFixed();		
		
		if(data.length != 3 && data.length != 4) {
			log.error("Syntax error. Need three or four terms.");
			return false;
		}
		
		// ############################
		// Parameterization.
		// ############################
		
		// First parameter: Connection.
		RepositoryConnection con;
		if((con = extractValue(data, variables, 0)) == null)
			return false;
		
		// Second parameter: SPARQL query.
		String sparql_query;
		if((sparql_query = extractValue(data, variables, 1)) == null)
			return false;
		
		// Third parameter: QueryID.
		String qid;
		ProvaObject data2 = resolve(data[2], variables);
		if(data2 instanceof ProvaConstant) {
			qid = ((ProvaConstant) data2).toString();
		} else {
			qid = new Integer(nqid++).toString();
			((ProvaVariable) data2).setAssigned(ProvaConstantImpl.create(qid));
		}
		
		// Fourth parameter: (Optional) XID.
		String xid = null;
		if(data.length == 4) {
			ProvaObject data3 = resolve(data[3], variables);
			if(data3 instanceof ProvaConstant) {
				xid = ((ProvaConstant) data3).toString();
			} else {
				xid = new Integer(nxid++).toString();
				((ProvaVariable) data3).setAssigned( ProvaConstantImpl.create(xid));
			}
		}
						
		// ############################
		// Query preparation.
		// ############################
			
		// TODO: I'd like to let the OpenRDF parser find out if
		// we're dealing with a SELECT or an ASK query, yet I would
		// _not_ like to parse the query twice. There seems to be
		// no way to pass a Parsed{Tuple,Boolean}Query to a
		// RepositoryConnection, that's why I'm using this simple
		// heuristic here.
		boolean isAsk = sparql_query.toUpperCase().contains("ASK") && 
			!sparql_query.toUpperCase().contains("SELECT");
				
		// Prepare the executor.
		QueryExecutor qe;
		if(isAsk) {
			BooleanQuery q;
			try {
				q = con.prepareBooleanQuery(QueryLanguage.SPARQL, sparql_query);
			} catch (Exception e) {
				log.error("Could not prepare ASK query.");
				if(log.isDebugEnabled())
					log.debug("Exception: ", e);
				return false;
			}
			qe = new BooleanQueryExecutor(prova, kb, qid, xid, q);
		} else {	
			TupleQuery q;
			try {
				q = con.prepareTupleQuery(QueryLanguage.SPARQL, sparql_query);
			} catch (Exception e) {
				log.error("Could not prepare SELECT query.");
				if(log.isDebugEnabled())
					log.debug("Exception: ", e);
				return false;
			}
			qe = new TupleQueryExecutor(prova, kb, qid, xid, q);
		}
		
		// ############################
		// Query execution.
		// ############################
		
		// Run the executor either synchronously or asynchronously.
		if(xid != null) {
			new Thread(qe).start();
		} else {
			return qe.execute();
		}
		
		// In case we execute the query asynchronously, the sparql_query predicate
		// is true (i.e., we ignore/can not use the return status of execute().
		return true;
	}
	
	static protected ProvaObject resolve(ProvaObject o, List<ProvaVariable> variables) {
		if(o instanceof ProvaVariablePtr) {
			ProvaVariablePtr varPtr = (ProvaVariablePtr) o;
			o = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
		}
		return o;
	}
	
	@SuppressWarnings("unchecked")
	static protected <T> T extractValue (ProvaObject[] data, List<ProvaVariable> variables, int idx) {
		T retval;
		ProvaObject o = resolve(data[idx], variables);
		if(!(o instanceof ProvaConstant)) {
			log.error("Binding error. Term " + (idx + 1) + " must be constant.");
			return null;
		}
		try {
			retval = (T) ((ProvaConstant) o).getObject();
		} catch (ClassCastException cce) {
			log.error("Binding error. Term " + (idx + 1) + " has wrong type.");
			if(log.isDebugEnabled())
				log.debug("Exception: ", cce);
			return null;
		}
		return retval;
	}
	
	private static abstract class QueryExecutor implements Runnable {
		private final ProvaReagent prova;
		private final ProvaPredicate pred;
		private final String qid;
		private final String xid;
		
		private QueryExecutor(ProvaReagent p, ProvaKnowledgeBase kb, int arity, String qid, String xid) {
			this.prova = p;
			this.qid = qid;
			this.xid = xid;
			
			// Create the sparql_results predicate.
			this.pred = kb.getOrGeneratePredicate("sparql_results", arity + 1);
		}
		
		protected abstract boolean execute();
		
		protected void addFact(List<ProvaObject> terms) {
			terms.add(0, ProvaConstantImpl.create(qid));
			ProvaList ls = ProvaListImpl.create(terms);
			ProvaLiteral lit = new ProvaLiteralImpl(pred, ls);
			ProvaRule clause = ProvaRuleImpl.createVirtualRule(1, lit, null);
			pred.addClause(clause);
		}
		
		@Override
		public void run() {
			// TODO: This is subject to race condition if the client
			// is not yet ready to receive our notification.
			
			// Asynchronous execution.
			boolean success = execute();
					
			// Notify the client.
			Map<String, Object> payload = new HashMap<String, Object>();
			payload.put("status", success);
			payload.put("qid", qid);
			prova.getMessenger().addMsg(xid, "self", "sparql_query", payload);	
		}
	}
	
	private static class TupleQueryExecutor extends QueryExecutor {
		private final TupleQuery q;	
		
		private TupleQueryExecutor(ProvaReagent p, ProvaKnowledgeBase kb, String qid, String xid, TupleQuery q) {
			super(p, kb, q.getBindings().size(), qid, xid);
			this.q = q;
		}
		
		@Override
		protected boolean execute() {
			TupleQueryResult result;
			try {
				result = q.evaluate();
			} catch (QueryEvaluationException e) {
				log.error("Could not evaluate tuple query.");
				if(log.isDebugEnabled())
					log.debug("Exception: ", e);
				return false;
			}
			
			try {
				while(result.hasNext()) {
					List<ProvaObject> terms = new ArrayList<ProvaObject>();
					Iterator<Binding> it = result.next().iterator();
					while(it.hasNext()) {
						Binding b = it.next();
						// TODO Handle different data types.
						String val = b.getValue().stringValue();
						terms.add(ProvaConstantImpl.create(val));
					}
					addFact(terms);
				}
			} catch (QueryEvaluationException e) {
				log.error("Error while fetching results.");
				if(log.isDebugEnabled())
					log.debug("Exception: ", e);
				return false;
			}
			
			return true;
		}
	}
	
	private static class BooleanQueryExecutor extends QueryExecutor {
		private final BooleanQuery q;
		
		private BooleanQueryExecutor(ProvaReagent p, ProvaKnowledgeBase kb, String qid, String xid, BooleanQuery q) {
			super(p, kb, 1, xid, qid);
			this.q = q;
		}
		
		@Override
		protected boolean execute() {
			boolean answer;
			try {
				answer = q.evaluate();
			} catch (QueryEvaluationException e) {
				log.error("Could not evaluate boolean query.");
				if(log.isDebugEnabled())
					log.debug("Exception: ", e);
				return false;
			}

			if(answer) {
				addFact(new ArrayList<ProvaObject>());
			}
			
			return true;
		}
		
	}
}
