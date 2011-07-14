package ws.prova.reference2.builtins;

import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;

import org.apache.log4j.Logger;

import com.hp.hpl.jena.query.Query;
import com.hp.hpl.jena.query.QueryExecution;
import com.hp.hpl.jena.query.QueryExecutionFactory;
import com.hp.hpl.jena.query.QueryFactory;
import com.hp.hpl.jena.query.QuerySolution;
import com.hp.hpl.jena.query.ResultSet;
import com.hp.hpl.jena.rdf.model.RDFNode;

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
import ws.prova.reference2.ProvaPredicateImpl;
import ws.prova.reference2.ProvaRuleImpl;

public class ProvaSparqlSelectImpl extends ProvaBuiltinImpl {

	private static Logger log = Logger.getLogger(ProvaSparqlSelectImpl.class);
	
	public ProvaSparqlSelectImpl(ProvaKnowledgeBase kb) {
		super(kb, "sparql_select");
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
		
		// Check that there are at least two parameter
		if(data.length <= 1) {
			// No query given means false, no variable/constant means true.
			if(data.length == 0) {
				if(log.isDebugEnabled())
					log.debug("Syntax error. First parameter should be a string (select query).");
				return false;
			}
			return true;
		}
				
		// Create a SparqlQuery instance
		JenaSparqlQuery select_query = processTerms(terms, variables);
		if(select_query == null)
			return false;
		
		// Execute query
		ResultSet results = null;
		try {
			results = select_query.execute();
		//} catch (QueryExecutionException e) {
		} catch (Exception e) {
			if(log.isDebugEnabled())
				log.debug("Error while executing query: ", e);
			return false;
		}
				
		// Create a new nameless predicate
		//ProvaPredicate pred = new ProvaPredicateImpl("", getArity(), kb);
		ProvaPredicate pred = new ProvaPredicateImpl("", getArity(), kb);
		
		// Process the results (moved to another function for readability)
		int matches = processResults(results, data, pred, variables);
		
		// Close the stream.
		select_query.destroy();
				
		if(matches == -1) {
			return false;
		} else if(matches > 0) {
			// create a new Literal of the pseudo predicate and replace the current goal with it.
			ProvaLiteral newLiteral = new ProvaLiteralImpl(pred,terms);
			newLiterals.add(newLiteral);
		} else {
			// Fail.
			ProvaLiteral newLiteral = new ProvaLiteralImpl(new ProvaPredicateImpl("fail", 0, kb), 
					ProvaListImpl.create(new LinkedList<ProvaObject>()));
			newLiterals.add(newLiteral);
		}

		return true;
	}

	protected JenaSparqlQuery processTerms(ProvaList terms, List<ProvaVariable> variables) {
		ProvaObject[] data = terms.getFixed();
			
		// First parameter contains the sparql query.
		ProvaObject query_term = resolve(data[0], variables);
		
		// If it isn't a ProvaConstant, stop processing.
		if(!(query_term instanceof ProvaConstant)) {
			if(log.isDebugEnabled())
				log.debug("Syntax error. First parameter should be a string (sparql query).");
			return null;
		}
		
		// Get string out of constant
		String query_string = ((ProvaConstant) query_term).toString();
		
		// Optional third parameter can contain a list of variables to replace in query
		if(data.length >= 3) {
			ProvaObject l = data[2];
			if(!(l instanceof ProvaList)) {
				if(log.isDebugEnabled())
					log.debug("Error: third term should be a list.");
				return null;
			}
			ProvaObject[] query_replacements = ((ProvaList) l).getFixed();
			
			for(ProvaObject replace : query_replacements) {
				replace = resolve(replace, variables);
				
				if(replace instanceof ProvaList) {
					ProvaObject[] replace_data = ((ProvaList) replace).getFixed();
					
					// Second term can also be a (bound) variable
					replace_data[1] = resolve(replace_data[1], variables);
					
					if(!((replace_data[0] instanceof ProvaConstant) && (replace_data[1] instanceof ProvaConstant)))  {
						if(log.isDebugEnabled())
							log.debug("Syntax error: Inner list in replacement list must have the form 'var(Var)'.");
						return null;
					}
					
					// Get variable to replace and prefix it with '?'
					String variable = "$" + ((ProvaConstant) replace_data[0]).toString();
					
					// Get replacement
					String value = ((ProvaConstant) replace_data[1]).toString();
					
					// Replace in query
					query_string = query_string.replaceAll(Matcher.quoteReplacement(variable), Matcher.quoteReplacement(value));
					
				} else {
					if(log.isDebugEnabled())
						log.debug("Syntax error: Found a element in replacement list which is not a ProvaList.");
					return null;
				}
				
			}
		}
		
		// (optional) 4th parameter is the sparql endpoint (SERVICE)
		String service = null;
		if(data.length == 4) {
			ProvaObject o = resolve(data[3], variables);
			if((o instanceof ProvaConstant)) {
				service = o.toString();
			} else {
				if(log.isDebugEnabled())
					log.debug("Syntax error: 4th parameter must be constant (service string).");
				return null;
			}
		}
		
		if(log.isDebugEnabled())
			log.debug("Executing query:" + query_string);		
		
		return new JenaSparqlQuery(query_string, service);
	}
	
	protected int processResults(ResultSet results, ProvaObject[] data,
			ProvaPredicate pred, List<ProvaVariable> variables) {
		int matches = 0;
		
		// Second term should be a list: [var(Var),var(Var)...]
		ProvaObject l = data[1];
		if(!(l instanceof ProvaList)) {
			if(log.isDebugEnabled())
				log.debug("Error: second term should be a list.");
			return -1;
		}
		ProvaObject[] params = ((ProvaList) l).getFixed();
		
		// Cycle through result set
		while (results.hasNext()) {
			QuerySolution solution = results.next();
			boolean matched = true;
			List<ProvaObject> terms_list = new LinkedList<ProvaObject>();
			
			// Iterate over desired variables/constants
			for(int i = 0; i < params.length; ++i) {
				
				ProvaObject current_param = resolve(params[i], variables);
							
				// Parameter must be in the form of 'var(Var)' where 'var' is the sparql name ?var
				// and Var is a Prova variable or constant
				if(current_param instanceof ProvaList) {
					// After this, param_data[0] should be a ProvaConstant, whereas param_data[1] 
					// is ProvaConstant or ProvaVariablePtr.
					ProvaObject[] param_data = ((ProvaList) current_param).getFixed();
									
					// Syntax error. TODO maybe remove this to increase processing speed
					if(!(param_data[0] instanceof ProvaConstant)) {
						if(log.isDebugEnabled())
							log.debug("Syntax error. First list entry of every parameter" +
									" must be a string corresponding to a select variable.");
						return -1;
					}
					
					String field_name = ((ProvaConstant) param_data[0]).toString();
					
					// Extract the matching field from the solution.
					RDFNode rn = solution.get(field_name);
					if(rn == null) {
						if(log.isDebugEnabled())
							log.debug("No such variable in the select query: " + field_name + ".");
						return -1;
					}
					String field = rn.toString();
									
					if(param_data[1] instanceof ProvaConstant) {
						// Only add the solution's field if it matches the constant
						if(!(field.equals(((ProvaConstant) param_data[1]).toString()))) {
							// thus the whole solution does not match
							matched = false;
							break;
						}
					}
					
					// Add it to the list. Variables match anyway.
					terms_list.add(ProvaListImpl.create(
						new ProvaObject[] {param_data[0], ProvaConstantImpl.create(field)}));
				} else {
					// current_param is !instanceof ProvaList. Probably syntax error or old syntax.
					// TODO other parameter types (java.util.List for the remaining fields?)
					if(log.isDebugEnabled())
						log.debug("Syntax error: Term " + i + " in list is not a list.");
					return -1;
				}
			}
			
			if(matched) {
				// Construct final terms list for new predicate
				List<ProvaObject> final_terms_list = new LinkedList<ProvaObject>();
				final_terms_list.add(data[0]);

				// new terms have to be placed in a ProvaList again
				final_terms_list.add(ProvaListImpl.create(terms_list));
				
				if(data.length == 3)
					final_terms_list.add(data[2]);
				
				// We create a virtual fact from the knowledge we gathered, with 'pred' as its head literal.
				ProvaList ls = ProvaListImpl.create(final_terms_list);
				ProvaLiteral lit = new ProvaLiteralImpl(pred,ls);
				ProvaRule clause = ProvaRuleImpl.createVirtualRule(1, lit, null);
				pred.addClause(clause);
				++matches;
			}
		}
		
		return matches;
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

	protected static class JenaSparqlQuery {
		
		private String query;
		private String service;
		private Query jena_query;
		QueryExecution jena_query_execution;
			
		public JenaSparqlQuery(String q, String s) {
			query = q;
			service = s;
			jena_query = QueryFactory.create(query);
		}	
		
		public ResultSet execute() {
			// Query execution
			if(service != null)
				jena_query_execution = QueryExecutionFactory.sparqlService(service, jena_query);
			else
				jena_query_execution = QueryExecutionFactory.create(jena_query);
			ResultSet results = jena_query_execution.execSelect();
			return results;
		}
		
		public void destroy() {
			jena_query_execution.close();
		}
	}
}
