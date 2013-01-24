package ws.prova.reference2.builtins;

import java.util.ArrayList;

import org.apache.log4j.Logger;
import org.openrdf.query.BooleanQuery;
import org.openrdf.query.QueryEvaluationException;
import org.openrdf.query.QueryLanguage;
import org.openrdf.repository.RepositoryConnection;

import ws.prova.kernel2.ProvaConstant;
import ws.prova.kernel2.ProvaKnowledgeBase;
import ws.prova.kernel2.ProvaObject;
import ws.prova.kernel2.ProvaPredicate;

/**
 * sparql_ask built-in.
 * 
 * Usage:
 * <code>
 * sparql_ask(Connection, QueryStr, QueryID)
 * </code>
 * 
 * <code>sparql_ask</code> executes a SPARQL ask query on the given 
 * repository connection. After successful execution, it creates a
 * fact in the knowledge base using the <code>sparql_results</code> predicate
 * and <code>QueryID</code> as the first term.
 * 
 * <code>QueryID</code> can be either a constant term or a variable, in the latter
 * case it is assigned a random identifier number.
 * 
 * 
 * Example:
 * <code>
 * sparql_connect(Connection, "http://dbpedia.org/sparql"),
 * sparql_ask(Connection, "ASK WHERE { <...> <...> <...> . }", QueryID),
 * sparql_results(QueryID).
 * </code>
 * 
 * @author Malte Rohde <malte.rohde@inf.fu-berlin.de>
 */
public class ProvaSparqlAskImpl extends ProvaSparqlQueryImpl {

	private static final Logger log = Logger.getLogger(ProvaSparqlAskImpl.class);
	
	public ProvaSparqlAskImpl(ProvaKnowledgeBase kb) {
		super(kb, "sparql_ask");
	}

	@Override
	protected boolean processQuery(ProvaPredicate pred, ProvaConstant cqid,
			RepositoryConnection con, String sparql_query) {
		
		// Prepare BooleanQuery.
		BooleanQuery q;
		try {
			q = con.prepareBooleanQuery(QueryLanguage.SPARQL, sparql_query);
		} catch (Exception e) {
			log.error("Could not prepare boolean query.");
			if(log.isDebugEnabled())
				log.debug("Exception: ", e);
			return false;
		}
		
		// Evaluate BooleanQuery.
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
			// Create the sparql_results predicate and add the fact to the KB.
			pred = kb.getOrGeneratePredicate("sparql_results", 1);
			addFact(pred, cqid, new ArrayList<ProvaObject>());
		}
		
		return true;
	}

}
