package ws.prova.fub.builtins;

import java.util.LinkedList;
import java.util.List;

import org.apache.log4j.Logger;

import ws.prova.agent2.ProvaReagent;
import ws.prova.fub.QueryExecutionException;
import ws.prova.fub.ResultSet;
import ws.prova.fub.SelectQuery;
import ws.prova.fub.ResultSet.Solution;
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
import ws.prova.reference2.builtins.ProvaBuiltinImpl;

/**
 * Generic select query builtin.
 * 
 * Used to reduce code duplication. SQL and Sparql select share large portions of their code.
 * 
 * TODO Still, this prevents us from distributing them as separate OSGi bundles.
 * 
 * @author Malte Rohde <malte.rohde@inf.fu-berlin.de>
 */
public abstract class ProvaGenericSelectQueryBuiltinImpl extends ProvaBuiltinImpl {

	private static Logger log = Logger.getLogger(ProvaGenericSelectQueryBuiltinImpl.class);
	
	public ProvaGenericSelectQueryBuiltinImpl(ProvaKnowledgeBase kb, String symbol) {
		super(kb, symbol);
	}
	
	/**
	 * Subclasses should define their arity.
	 */
	public abstract int getArity();
	
	/**
	 * This method is called to enable subclasses to parse their parameters, which
	 * should live at the beginning of terms.
	 * 
	 * @param terms
	 * @return true on success
	 */
	public abstract boolean processTerms(ProvaList terms, List<ProvaVariable> variables);
	
	/**
	 * Subclasses should create a SelectQuery object in this method. A return value
	 * of <code>null</code> indicates failure.
	 * 
	 * @return the query which will be executed
	 */
	public abstract SelectQuery createQuery();	

	@Override
	final public boolean process(ProvaReagent prova, ProvaDerivationNode node,
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
		
		// Let deriving classes parse some terms
		if(!processTerms(terms, variables))
			return false;
		
		// Create a generic SelectQuery instance
		SelectQuery select_query = createQuery();
		if(select_query == null)
			return false;
			
		// Execute query
		ResultSet results = null;
		try {
			results = select_query.execute();
		} catch (QueryExecutionException e) {
			if(log.isDebugEnabled())
				log.debug("Error while executing query: ", e);
			return false;
		}
				
		// Create a new nameless predicate
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
			ProvaLiteral newLiteral = new ProvaLiteralImpl(new ProvaPredicateImpl("fail", 0, kb),null);
			newLiterals.add(newLiteral);
		}

		return true;		
	}

	/**
	 * @return >0 if something matched, 0 if not, -1 on failure
	 */
	final private int processResults(ResultSet results, ProvaObject[] data, 
			ProvaPredicate pred, List<ProvaVariable> variables) {
		int matches = 0;
		
		// Last term should be a list: [var(Var),var(Var)...]
		ProvaObject l = data[data.length - 1];
		if(!(l instanceof ProvaList)) {
			if(log.isDebugEnabled())
				log.debug("Error: last term should be a list.");
			return -1;
		}
		ProvaObject[] params = ((ProvaList) l).getFixed();
		
		// Cycle through result set
		while (results.hasNext()) {
			Solution solution = results.next();
			boolean matched = true;
			List<ProvaObject> terms_list = new LinkedList<ProvaObject>();
			
			// Iterate over desired variables/constants
			for(int i = 0; i < params.length; ++i) {
				
				ProvaObject current_param = params[i];
				if(current_param instanceof ProvaVariablePtr) {
					ProvaVariablePtr varPtr = (ProvaVariablePtr) current_param;
					current_param = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
				}
							
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
					String field = solution.get(field_name);
					if(field == null) {
						if(log.isDebugEnabled())
							log.debug("No such variable in the select query: " + field_name + ".");
						return -1;
					}
									
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
				for(int i = 0; i < data.length - 1; ++i)
					final_terms_list.add(data[i]);	
				// new terms have to be placed in a ProvaList again
				final_terms_list.add(ProvaListImpl.create(terms_list));
				
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
}
