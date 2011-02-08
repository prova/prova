package ws.prova.fub.rdf;

import ws.prova.fub.ResultSet;

public class JenaResultSetAdapter implements ResultSet {

	private com.hp.hpl.jena.query.ResultSet results;
	
	public JenaResultSetAdapter(com.hp.hpl.jena.query.ResultSet r) {
		results = r;
	}

	@Override
	public boolean hasNext() {
		return results.hasNext();
	}

	@Override
	public Solution next() {
		return new JenaSolutionAdapter((com.hp.hpl.jena.query.QuerySolution) results.next());
	}
	
	public class JenaSolutionAdapter implements Solution {

		private com.hp.hpl.jena.query.QuerySolution query_solution;
		
		public JenaSolutionAdapter(com.hp.hpl.jena.query.QuerySolution qs) {
			query_solution = qs; 
		}

		@Override
		public String get(String key) {
			com.hp.hpl.jena.rdf.model.RDFNode node = query_solution.get(key);
			
			if(node == null)
				return null;
			
			return node.toString();
		}
		
	}
}
