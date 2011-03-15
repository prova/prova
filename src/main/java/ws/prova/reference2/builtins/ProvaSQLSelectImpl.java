package ws.prova.reference2.builtins;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import org.apache.log4j.Logger;

import ws.prova.agent2.ProvaReagent;
import ws.prova.database.DatabaseConnection;
import ws.prova.database.QueryExecutionException;
import ws.prova.database.SQLSelectQuery;
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

/**
 * sql_select builtin
 * 
 * Syntax (for now):
 * sql_select(DB,table,[[column,Var],[column2,Var2],...])
 * 
 * equivalent to the SQL statement
 * SELECT column,column2,... FROM TABLE;
 * 
 * @author Malte Rohde <malte.rohde@inf.fu-berlin.de>
 */
public class ProvaSQLSelectImpl extends ProvaBuiltinImpl {

	private static Logger log = Logger.getLogger(ProvaSQLSelectImpl.class);	
	private DatabaseConnection connection;
	private String table;
	
	public ProvaSQLSelectImpl(ProvaKnowledgeBase kb) {
		super(kb, "sql_select");
	}

	@Override
	public boolean process(ProvaReagent prova, ProvaDerivationNode node,
			ProvaGoal goal, List<ProvaLiteral> newLiterals, ProvaRule query) {
		
		List<ProvaVariable> variables = query.getVariables();
		ProvaLiteral literal = goal.getGoal();
		ProvaList terms = (ProvaList) literal.getTerms();
		ProvaObject[] data = terms.getFixed();
		
		// Check that there are at least three parameter
		if(data.length <= 2) {
			// No db connection or table name given means failure,
			if(data.length <= 1) {
				if(log.isDebugEnabled())
					log.debug("Syntax error. First parameter should be a string (select query).");
				return false;
			}
			// no columns is okay but we don't need to process the query.
			return true;
		}
		
		// Parse leading terms (db connection, table name) and create a SQLSelectQuery from it
		SQLSelectQuery select_query = createQuery(terms, variables);
		if(select_query == null) {
			if(log.isDebugEnabled())
				log.debug("Could not parse query terms.");
			return false;
		}
			
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
			ProvaLiteral newLiteral = new ProvaLiteralImpl(new ProvaPredicateImpl("fail", 0, kb),ProvaListImpl.create(new LinkedList<ProvaObject>()));
			newLiterals.add(newLiteral);
		}

		return true;		
	}
	
	/**
	 * @return the SQLSelectQuery instance or <code>null</code> if something failed.
	 */
	protected SQLSelectQuery createQuery(ProvaList terms, List<ProvaVariable> variables) {
		ProvaObject[] data = ((ProvaList) terms.cloneWithVariables(variables)).getFixed();
		
		if(!(data[0] instanceof ProvaConstant)) {
			if(log.isDebugEnabled())
				log.debug("Syntax error. First parameter should be a constant (Database connection).");
			return null;
		}
		
		Object conn = ((ProvaConstant) data[0]).getObject();
		if(!(conn instanceof DatabaseConnection)) {
			if(log.isDebugEnabled())
				log.debug("Syntax error. First parameter should be a the database connection.");
			return null;	
		}
		// Save the connection
		connection = (DatabaseConnection) conn;
		
		if(!(data[1] instanceof ProvaConstant)) {
			if(log.isDebugEnabled())
				log.debug("Syntax error. Second parameter should be a string (table name).");
			return null;
		}
		
		// Save the table name
		table = ((ProvaConstant) data[1]).toString();
		
		// Retrieve the column names
		LinkedList<String> columns = new LinkedList<String>();
		
		ProvaObject l = data[data.length - 1];
		if(!(l instanceof ProvaList)) {
			if(log.isDebugEnabled())
				log.debug("Error: last term should be a list.");
			return null;
		}
		ProvaObject[] params = ((ProvaList) l).getFixed();
		for(int i = 0; i < params.length; ++i) {
			ProvaObject p = params[i];
	
			if(p instanceof ProvaVariablePtr) {
				ProvaVariablePtr varPtr = (ProvaVariablePtr) p;
				p = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
			}
			
			if(p instanceof ProvaList) {
				// TODO more syntax checking?
				columns.add(((ProvaConstant) ((ProvaList) p).getFixed()[0]).toString());
			} else {
				// p is !instanceof ProvaList. Probably syntax error or old syntax.
				// TODO other parameter types (java.util.List for the remaining fields?)
				if(log.isDebugEnabled())
					log.debug("Syntax error: Term " + i + " in list is not a list.");
				return null;
			}
			
		}
		
		// Create SQL query
		StringBuilder sb = new StringBuilder();
		sb.append("SELECT ");
		for(int i = 0; i < (columns.size() - 1); ++i) {
			sb.append("\"");
			sb.append(columns.get(i));
			sb.append("\", ");
		}
		sb.append("\"");
		sb.append(columns.get(columns.size() - 1));
		sb.append("\" FROM \"");
		sb.append(table);
		sb.append("\"");
		
		return new SQLSelectQuery(connection, sb.toString());
	}

	
	/**
	 * @return >0 if something matched, 0 if not, -1 on failure
	 */
	protected int processResults(ResultSet results, ProvaObject[] data, 
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
		try {
			 while(results.next()) {
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
						String field;
						try {
							// TODO other data types
							field = results.getString(field_name);
						} catch (SQLException e) {
							if(log.isDebugEnabled())
								log.debug("Error retrieving value from column: " + field_name + ".");
							throw new RuntimeException(e);
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
					
					// contain the terms (which are ProvaLists) in another list
					List<ProvaObject> param_list = new LinkedList<ProvaObject>();
					for(int i = 0; i < terms_list.size(); ++i)
						param_list.add(terms_list.get(i));
					final_terms_list.add(ProvaListImpl.create(param_list));
					
					// We create a virtual fact from the knowledge we gathered, with 'pred' as its head literal.
					ProvaList ls = ProvaListImpl.create(final_terms_list);
					ProvaLiteral lit = new ProvaLiteralImpl(pred,ls);
					ProvaRule clause = ProvaRuleImpl.createVirtualRule(1, lit, null);
					pred.addClause(clause);
					++matches;
				}
			}	
			
		} catch (SQLException e) {
			// this exception is thrown by results.next()
			if(log.isDebugEnabled())
				log.debug("Could not proceed to next row in ResultSet. ", e);
			throw new RuntimeException(e);
		}
		
		return matches;
	}
	
	@Override
	public int getArity() {
		return 3;
	}

}
