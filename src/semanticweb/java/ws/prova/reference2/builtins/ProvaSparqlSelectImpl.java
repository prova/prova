package ws.prova.reference2.builtins;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.eclipse.rdf4j.query.Binding;
import org.eclipse.rdf4j.query.QueryEvaluationException;
import org.eclipse.rdf4j.query.QueryLanguage;
import org.eclipse.rdf4j.query.TupleQuery;
import org.eclipse.rdf4j.query.TupleQueryResult;
import org.eclipse.rdf4j.repository.RepositoryConnection;

import ws.prova.kernel2.ProvaConstant;
import ws.prova.kernel2.ProvaKnowledgeBase;
import ws.prova.kernel2.ProvaObject;
import ws.prova.kernel2.ProvaPredicate;
import ws.prova.reference2.ProvaConstantImpl;

/**
 * sparql_select built-in.
 * 
 * Usage:
 * <code>
 * sparql_select(Connection, QueryStr, QueryID)
 * </code>
 * 
 * <code>sparql_select/code> executes a SPARQL select query on the given 
 * repository connection. After successful execution, it binds the result set of 
 * the query to the <code>sparql_results</code> predicate, using <code>QueryID</code>
 * as the first term and the requested SPARQL variables as the remaining terms,
 * in the order they were specified in the SPARQL query.
 * 
 * <code>QueryID</code> can be either a constant term or a variable, in the latter
 * case it is assigned a random identifier number.
 * 
 * 
 * Example:
 * <code>
 * sparql_connect(Connection, "http://dbpedia.org/sparql"),
 * sparql_select(Connection, "SELECT * WHERE { ?a ?b ?c . }", QueryID),
 * sparql_results(QueryID, A, B, C),
 * println([A, " ", B, " ", C, " ."]).
 * </code>
 * 
 * @author Malte Rohde <malte.rohde@inf.fu-berlin.de>
 */
public class ProvaSparqlSelectImpl extends ProvaSparqlQueryImpl {
	private static final Logger log = LoggerFactory.getLogger(ProvaSparqlSelectImpl.class);
	
	public ProvaSparqlSelectImpl(ProvaKnowledgeBase kb) {
		super(kb, "sparql_select");
	}

	@Override
	protected boolean processQuery(ProvaPredicate pred, ProvaConstant cqid,
			RepositoryConnection con, String sparql_query) {
		
		// Prepare TupleQuery.
		TupleQuery q;
		try {
			q = con.prepareTupleQuery(QueryLanguage.SPARQL, sparql_query);
		} catch (Exception e) {
			log.error("Could not prepare tuple query.");
			if(log.isDebugEnabled())
				log.debug("Exception: ", e);
			return false;
		}

		// Evaluate TupleQuery.
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
			// For each result in the result set, add a fact to the KB.
			while(result.hasNext()) {
				List<ProvaObject> newterms = new ArrayList<>();
				for (Binding b : result.next()) {
					// TODO Handle different data types.
					String val = b.getValue().stringValue();
					newterms.add(ProvaConstantImpl.create(val));
				}
				
				// Create the sparql_results predicate, but only once.
				if(pred == null)
					pred = kb.getOrGeneratePredicate("sparql_results", newterms.size() + 1);
				addFact(pred, cqid, newterms);
			}
		} catch (QueryEvaluationException e) {
			log.error("Error while fetching tuple query results.");
			if(log.isDebugEnabled())
				log.debug("Exception: ", e);
			return false;
		}
		
		try {
			result.close();
		} catch (QueryEvaluationException e) {
			log.warn("Could not close result set.");
			if(log.isDebugEnabled())
				log.debug("Exception: ", e);
		}
		
		return true;
	}

}
