package test.ws.prova.test2;

import com.hp.hpl.jena.query.Query;
import com.hp.hpl.jena.query.QueryExecution;
import com.hp.hpl.jena.query.QueryExecutionFactory;
import com.hp.hpl.jena.query.QueryFactory;
import com.hp.hpl.jena.query.ResultSet;
import com.hp.hpl.jena.query.ResultSetFormatter;

public class DBPedoaJenaServiceTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        String service="http://dbpedia.org/sparql";
		String queryString = "SELECT * WHERE { <http://dbpedia.org/resource/Berlin> ?p ?object .  } ";
		Query query = QueryFactory.create(queryString);

		QueryExecution qexec =  QueryExecutionFactory.sparqlService(service, query);

		try {
			ResultSet results = qexec.execSelect();
			String s = ResultSetFormatter.asText(results);
			System.out.println(s);

		} finally {
			qexec.close();
		}

	}

}
