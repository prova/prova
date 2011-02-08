package ws.prova.fub.database.builtins;

import java.util.List;

import org.apache.log4j.Logger;

import ws.prova.agent2.ProvaReagent;
import ws.prova.fub.database.DatabaseConnection;
import ws.prova.fub.database.LocationStore;
import ws.prova.fub.database.LocationStore.Location;
import ws.prova.kernel2.ProvaConstant;
import ws.prova.kernel2.ProvaDerivationNode;
import ws.prova.kernel2.ProvaGoal;
import ws.prova.kernel2.ProvaKnowledgeBase;
import ws.prova.kernel2.ProvaList;
import ws.prova.kernel2.ProvaLiteral;
import ws.prova.kernel2.ProvaObject;
import ws.prova.kernel2.ProvaRule;
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
 * @see ProvaLocationBuiltinImpl
 * @see ProvaSQLSelectBuiltinImpl
 * @author Malte Rohde <malte.rohde@inf.fu-berlin.de>
 */
public class ProvaDBOpenBuiltinImpl extends ProvaBuiltinImpl {

	private static Logger log = Logger.getLogger(ProvaDBOpenBuiltinImpl.class);
	
	public ProvaDBOpenBuiltinImpl(ProvaKnowledgeBase kb) {
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
		
		// Get location
		LocationStore ls = LocationStore.INSTANCE;
		Location location = ls.getLocation(identifier);
		if(location == null) {
			if(log.isDebugEnabled())
				log.debug("Error: Could not find location '" + identifier + "'.");
			return false;
		}
		
		// debug logging
		if(log.isDebugEnabled())
			log.debug("Opening connection to database " + location.jdbc_uri + ".");
		
		// Create a JDBC connection
		DatabaseConnection conn = new DatabaseConnection(location);
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
