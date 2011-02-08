package ws.prova.fub.rdf.builtins;

import java.util.List;

import org.apache.log4j.Logger;

import ws.prova.fub.QueryParserException;
import ws.prova.fub.SelectQuery;
import ws.prova.fub.builtins.ProvaGenericSelectQueryBuiltinImpl;
import ws.prova.fub.rdf.JenaSparqlQuery;
import ws.prova.kernel2.ProvaConstant;
import ws.prova.kernel2.ProvaKnowledgeBase;
import ws.prova.kernel2.ProvaList;
import ws.prova.kernel2.ProvaObject;
import ws.prova.kernel2.ProvaVariable;
import ws.prova.kernel2.ProvaVariablePtr;

/**
 * sparql_select builtin
 * 
 * This can be used to query a RDF model through Jena.
 * 
 * Syntax:
 * sparql_select(sparqlquery,[var(Var),var2(Var2),...])
 * or
 * sparql_select(sparqlquery,[[var,Var],[var2,Var2],...])
 * 
 * where sparqlquery is a (string) constant containing the sparql query and
 * var(Var) are constant/Variable pairs where 'var' means a variable which is
 * included in the sparql query. Var can of course also be already unified to a constant.
 * 
 * @author Malte Rohde <malte.rohde@inf.fu-berlin.de>
 */
public class ProvaSparqlSelectBuiltinImpl extends ProvaGenericSelectQueryBuiltinImpl {

	//TODO, this is a long term todo:  What happens when we have huge amount of results, memory overflow ? Memory Cache?
	
	private static Logger log = Logger.getLogger(ProvaSparqlSelectBuiltinImpl.class);
	
	public ProvaSparqlSelectBuiltinImpl(ProvaKnowledgeBase kb) {
		super(kb, "sparql_select");
	}
	
	private String query_string;
	
	@Override
	public boolean processTerms(ProvaList terms, List<ProvaVariable> variables) {
		ProvaObject[] data = terms.getFixed();
			
		// First parameter contains the sparql query.
		ProvaObject query_term = data[0];
		
		// If it is a ProvaVariablePtr, resolve to assigned constant.
		if(query_term instanceof ProvaVariablePtr) {
			ProvaVariablePtr varPtr = (ProvaVariablePtr) query_term;
			query_term = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
		}
		
		// If we do not have a ProvaConstant now, stop processing.
		if(!(query_term instanceof ProvaConstant)) {
			if(log.isDebugEnabled())
				log.debug("Syntax error. First parameter should be a string (sparql query).");
			return false;
		}
		
		// Get string out of constant
		query_string = ((ProvaConstant) query_term).toString();
		
		if(log.isDebugEnabled())
			log.debug("Executing query \"" + query_string + "\".");		
		
		return true;
	}

	@Override
	public SelectQuery createQuery() {
		// Create a sparql query from the query string
		SelectQuery sparql_query = null;
		try {
			sparql_query = new JenaSparqlQuery(query_string);
		} catch (QueryParserException e) {
			if(log.isDebugEnabled())
				log.debug("Syntax error in sparql query: ", e);
			return null;
		}
		
		return sparql_query;
	}

	@Override
	public int getArity() {
		return 2;
	}

}
