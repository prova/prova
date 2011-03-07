package ws.prova.reference2.builtins;

import java.util.List;

import org.apache.log4j.Logger;

import ws.prova.agent2.ProvaReagent;
import ws.prova.database.LocationStore;
import ws.prova.kernel2.ProvaConstant;
import ws.prova.kernel2.ProvaDerivationNode;
import ws.prova.kernel2.ProvaGoal;
import ws.prova.kernel2.ProvaKnowledgeBase;
import ws.prova.kernel2.ProvaList;
import ws.prova.kernel2.ProvaLiteral;
import ws.prova.kernel2.ProvaObject;
import ws.prova.kernel2.ProvaRule;
import ws.prova.kernel2.ProvaVariable;
import ws.prova.reference2.builtins.ProvaBuiltinImpl;

/**
 * location builtin
 * 
 * This can be used to specify a database location.
 * 
 * Syntax:
 * location(database,uniquename,jdbcstring,username,password)
 * 
 * where
 *  'database' determines the type of the location. Only 'database' is supported for now.
 *  'uniquename' is a constant containing a unique identifier for the location.
 *  'jdbcstring' is a constant containing the JDBC database string, mostly in the form of
 *   "jdbc:driver:address"
 *  'username' and 'password' are constants, obviously used to specify username and password.
 *  
 * Example (from bikedb.prova):
 * location(database,bikestore,"jdbc:mysql://localhost/bikestore","root","root")
 * 
 * After calling this, the name can be used to open a database connection with db_open.
 * 
 * <p>
 * Note: This builtin is not needed. Users could just define their locations with
 * simple Prova language.
 * TODO decide upon removal. consider plugin related issues
 * 
 * @see LocationStore
 * @see ProvaDBOpenImpl 
 * @author Malte Rohde <malte.rohde@inf.fu-berlin.de>
 */
public class ProvaLocationImpl extends ProvaBuiltinImpl {

	private static Logger log = Logger.getLogger(ProvaLocationImpl.class);
	
	public ProvaLocationImpl(ProvaKnowledgeBase kb) {
		super(kb, "location");
	}

	@Override
	public boolean process(ProvaReagent prova, ProvaDerivationNode node,
			ProvaGoal goal, List<ProvaLiteral> newLiterals, ProvaRule query) {

		List<ProvaVariable> variables = query.getVariables();
		ProvaLiteral literal = goal.getGoal();
		ProvaList terms = (ProvaList) literal.getTerms().cloneWithVariables(variables);
		ProvaObject[] data = terms.getFixed();
		
		// Check for correct number of terms
		if(data.length != 5) {
			if(log.isDebugEnabled())
				log.debug("Syntax error: Need 5 terms.");
			return false;
		}
		
		// All terms must be constant, no exceptions.
		for(int i = 0; i < 5; ++i) {
			if(!(data[i] instanceof ProvaConstant)) {
				if(log.isDebugEnabled())
					log.debug("Syntax error: Term " + i + " not constant.");
				return false;
			}
		}
		
		// First term: must be 'database'
		if(!(data[0].toString().equals("database"))) {
			if(log.isDebugEnabled())
				log.debug("Syntax error: First term not 'database'.");
			return false;	
		}
		
		// TODO some sanity checking?
		String identifier = data[1].toString();
		String jdbc = data[2].toString();
		String username = data[3].toString();
		String password = data[4].toString();
		
		// Print some debug information
		if(log.isDebugEnabled()) {
			log.debug("Registered '" + jdbc + "' as new location '" + identifier + "' (user: '"
					+ username + "', password: '" + password + "').");
		}
		
		// Add to LocationStore
		LocationStore ls = LocationStore.INSTANCE;
		ls.addLocation(identifier, jdbc, username, password);
		
		return true;
	}

	@Override
	public int getArity() {
		return 5;
	}

}
