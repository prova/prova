package ws.prova.fub.rdf;

import ws.prova.fub.SelectQuery;
import ws.prova.fub.QueryExecutionException;
import ws.prova.fub.QueryParserException;

import com.hp.hpl.jena.query.Query;
import com.hp.hpl.jena.query.QueryExecution;
import com.hp.hpl.jena.query.QueryExecutionFactory;
import com.hp.hpl.jena.query.QueryFactory;

public class JenaSparqlQuery implements SelectQuery {
	
	private String query;
	private Query jena_query;
	QueryExecution jena_query_execution;
		
	// TODO really throw that exception
	public JenaSparqlQuery(String q) throws QueryParserException {
		query = q;
		jena_query = QueryFactory.create(query);
	}	
	
	// TODO really throw that exception
	public ws.prova.fub.ResultSet execute() throws QueryExecutionException {
		// Query execution
		jena_query_execution = QueryExecutionFactory.create(jena_query);
		com.hp.hpl.jena.query.ResultSet results = jena_query_execution.execSelect();
		return new JenaResultSetAdapter(results);
	}
	
	public void destroy() {
		jena_query_execution.close();
	}
}
