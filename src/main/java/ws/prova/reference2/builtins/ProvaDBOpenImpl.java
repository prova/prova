package ws.prova.reference2.builtins;

import java.util.List;

import org.apache.log4j.Logger;

import ws.prova.agent2.ProvaReagent;
import ws.prova.database.DatabaseConnection;
import ws.prova.kernel2.ProvaConstant;
import ws.prova.kernel2.ProvaDerivationNode;
import ws.prova.kernel2.ProvaGoal;
import ws.prova.kernel2.ProvaKnowledgeBase;
import ws.prova.kernel2.ProvaList;
import ws.prova.kernel2.ProvaLiteral;
import ws.prova.kernel2.ProvaObject;
import ws.prova.kernel2.ProvaRule;
import ws.prova.kernel2.ProvaRuleSet;
import ws.prova.kernel2.ProvaVariable;
import ws.prova.reference2.ProvaConstantImpl;
import ws.prova.reference2.builtins.ProvaBuiltinImpl;

/**
 * dbopen builtin
 * 
 * This builtin enables the user to open a database connection through a JDBC.
 * 
 * Syntax:
 * dbopen(location,Database)
 * 
 * where 'location' is a constant bound to a database location and 'Database' is a Variable.
 * After calling this 'Database' will be bound to a 'connection object', which can be used
 * to issue a SQL query.
 * 
 * @see ProvaLocationImpl
 * @see ProvaSQLSelectImpl
 * @author Malte Rohde <malte.rohde@inf.fu-berlin.de>
 */
public class ProvaDBOpenImpl extends ProvaBuiltinImpl {

	private static Logger log = Logger.getLogger(ProvaDBOpenImpl.class);
	
	public ProvaDBOpenImpl(ProvaKnowledgeBase kb) {
		super(kb, "dbopen");
	}

	@Override
	public boolean process(ProvaReagent prova, ProvaDerivationNode node,
			ProvaGoal goal, List<ProvaLiteral> newLiterals, ProvaRule query) {
		
		List<ProvaVariable> variables = query.getVariables();
		ProvaLiteral literal = goal.getGoal();
		ProvaList terms = (ProvaList) literal.getTerms().cloneWithVariables(variables);
		ProvaObject[] data = terms.getFixed();		
		
		// Check for correct number of terms
		if(data.length != 2) {
			if(log.isDebugEnabled())
				log.debug("Syntax error: Need 5 terms.");
			return false;
		}
		
		// Check syntax
		if(!(data[0] instanceof ProvaConstant)) {
			if(log.isDebugEnabled())
				log.debug("Syntax error: First term not constant (should be location identifier).");
			return false;
		}
		if(!(data[1] instanceof ProvaVariable)) {
			if(log.isDebugEnabled())
				log.debug("Syntax error: Second term not a variable.");
			return false;
		}		
		
		String identifier = data[0].toString();
		ProvaVariable dbvar = (ProvaVariable) data[1];
		
		// Get the location
		String jdbc_uri = null;
		String user = null;
		String password = null;
		
		ProvaRuleSet location_clauses = kb.getPredicates("location", 5);
		for(ProvaRule clause : location_clauses.getClauses()) {
			ProvaLiteral fact = clause.getHead();
			ProvaObject[] locterms = ((ProvaList) fact.getTerms().cloneWithVariables(variables)).getFixed();
			// Ignore the first term
			
			// Second term must match the identifier
			if(!(locterms[1] instanceof ProvaConstant))
				continue;	// TODO is this an error?
			if(locterms[1].toString().equals(identifier)) {
			
				// Third term is the jdbc uri
				if(!(locterms[2] instanceof ProvaConstant))
					continue;	// TODO is this an error?
				jdbc_uri = locterms[2].toString();
				
				// Fourth term is the username
				if(!(locterms[3] instanceof ProvaConstant))
					continue;	// TODO is this an error?
				user = locterms[3].toString();
				
				// Fifth term is the password
				if(!(locterms[4] instanceof ProvaConstant))
					continue;	// TODO is this an error?
				password = locterms[4].toString();
			
				// Ok, good to go
				break;
			}
		}
		if((jdbc_uri == null) || (user == null) || (password == null)) {
			if(log.isDebugEnabled())
				log.debug("Error: Could not find location '" + identifier + "'.");
			return false;
		}
		
		// debug logging
		if(log.isDebugEnabled())
			log.debug("Opening connection to database " + jdbc_uri + ".");
		
		// Create a JDBC connection
		DatabaseConnection conn = new DatabaseConnection(jdbc_uri, user, password);
		if(!conn.open())
			// Error output is in DatabaseConnection.
			return false;	
		
		// Assign JDBC connection to database variable
		dbvar.setAssigned(ProvaConstantImpl.create(conn));
		
		return true;
	}

	@Override
	public int getArity() {
		return 2;
	}

}
