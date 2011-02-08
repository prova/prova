package ws.prova.fub.database.builtins;

import java.util.List;

import org.apache.log4j.Logger;

import ws.prova.fub.SelectQuery;
import ws.prova.fub.builtins.ProvaGenericSelectQueryBuiltinImpl;
import ws.prova.fub.database.DatabaseConnection;
import ws.prova.fub.database.SQLSelectQuery;
import ws.prova.kernel2.ProvaConstant;
import ws.prova.kernel2.ProvaKnowledgeBase;
import ws.prova.kernel2.ProvaList;
import ws.prova.kernel2.ProvaObject;
import ws.prova.kernel2.ProvaVariable;

/**
 * sql_select builtin
 * 
 * Syntax (for now):
 * sql_select(DB,table,[[column,Var],[column2,Var2],...])
 * 
 * corresponding to the SQL SELECT statement
 * SELECT column,column2,... FROM TABLE;
 * 
 * @author Malte Rohde <malte.rohde@inf.fu-berlin.de>
 */
public class ProvaSQLSelectBuiltinImpl extends ProvaGenericSelectQueryBuiltinImpl {

	private static Logger log = Logger.getLogger(ProvaSQLSelectBuiltinImpl.class);	
	private DatabaseConnection connection;
	private String table;
	
	public ProvaSQLSelectBuiltinImpl(ProvaKnowledgeBase kb) {
		super(kb, "sql_select");
	}

	@Override
	public boolean processTerms(ProvaList terms, List<ProvaVariable> variables) {
		ProvaObject[] data = ((ProvaList) terms.cloneWithVariables(variables)).getFixed();
		
		if(!(data[0] instanceof ProvaConstant)) {
			if(log.isDebugEnabled())
				log.debug("Syntax error. First parameter should be a constant (Database connection).");
			return false;
		}
		
		Object conn = ((ProvaConstant) data[0]).getObject();
		if(!(conn instanceof DatabaseConnection)) {
			if(log.isDebugEnabled())
				log.debug("Syntax error. First parameter should be a the database connection.");
			return false;	
		}
		// Save the connection
		connection = (DatabaseConnection) conn;
		
		if(!(data[1] instanceof ProvaConstant)) {
			if(log.isDebugEnabled())
				log.debug("Syntax error. Second parameter should be a string (table name).");
			return false;
		}
		
		// Save the table name
		table = ((ProvaConstant) data[1]).toString();
		
		return true;
	}

	@Override
	public SelectQuery createQuery() {
		// Create a sql query from the query string
		// TODO oO sql injection?... this shall be gone anyway.
		return new SQLSelectQuery(connection, "SELECT * FROM " + table + ";");
	}

	@Override
	public int getArity() {
		return 3;
	}

}
