package org.provarules.reference2.builtins;

import org.eclipse.rdf4j.repository.Repository;
import org.eclipse.rdf4j.repository.RepositoryConnection;
import org.eclipse.rdf4j.repository.RepositoryException;
import org.eclipse.rdf4j.repository.http.HTTPRepository;
import org.provarules.agent2.ProvaReagent;
import org.provarules.kernel2.*;
import org.provarules.reference2.ProvaConstantImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * sparql_connect built-in.
 * <br>
 * Usage:
 * {@code
 * sparql_connect(Connection, HTTPEndpoint).
 * }
 * <br>
 * sparql_connect connects to the SPARQL HTTP end point specified in `HTTPEndpoint`
 * and binds the connection to the (free) `Connection` variable.
 * <br>
 * If `Connection` is bound to an existing `RepositoryConnection`
 * object (from a previous call), the predicate tests whether the connection is open.
 * In this case, `HTTPEndpoint` is ignored.
 *
 * @author <a href="mailto:malte.rohde@inf.fu-berlin.de">Malte Rohde</a>
 */
public class ProvaSparqlConnectImpl extends ProvaBuiltinImpl {
    private static final Logger log = LoggerFactory.getLogger(ProvaSparqlConnectImpl.class);

    public ProvaSparqlConnectImpl(ProvaKnowledgeBase kb) {
        super(kb, "sparql_connect");
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
        ProvaList terms = literal.getTerms();
        ProvaObject[] data = terms.getFixed();

        if (data.length != 2) {
            log.error("Syntax error. Need two terms.");
            return false;
        }

        // Resolve first term to RepositoryConnection or variable.
        ProvaObject data0 = resolve(data[0], variables);
        if (data0 instanceof ProvaConstant) {
            Object obj = ((ProvaConstant) data0).getObject();
            if (obj instanceof RepositoryConnection) {

                RepositoryConnection conn = (RepositoryConnection) obj;
                try {
                    // Predicate is true if the connection is good.
                    return conn.isOpen();
                } catch (RepositoryException e) {
                    log.error("Could not determine status of given repository connection.");
                    if (log.isDebugEnabled())
                        log.debug("Exception: ", e);
                    return false;
                }

            } else {
                log.error("Binding error. First term is bound to something that is not a RepositoryConnection.");
                return false;
            }
        }

        // Resolve second term to end point URL.
        ProvaObject data1 = resolve(data[1], variables);
        if (!(data1 instanceof ProvaConstant)) {
            log.error("Second term must be constant string (HTTP end point).");
            return false;
        }
        String url = (String) ((ProvaConstant) data1).getObject();

        // Initialize repository.
        Repository repo = new HTTPRepository(url);
        try {
            repo.init();
        } catch (RepositoryException e) {
            log.error("Could not initialize repository \"" + url + "\".");
            if (log.isDebugEnabled())
                log.debug("Exception: ", e);
            return false;
        }

        // Connect.
        RepositoryConnection con;
        try {
            con = repo.getConnection();
        } catch (RepositoryException e) {
            log.error("Could not connect to repository \"" + url + "\".");
            if (log.isDebugEnabled())
                log.debug("Exception: ", e);
            return false;
        }

        // Bind connection to first term.
        ProvaVariable cvar = (ProvaVariable) data0;
        cvar.setAssigned(ProvaConstantImpl.create(con));
        return true;
    }


    /*
     * Little helper method to resolve ProvaVariables to the constants their bound to
     */
    private ProvaObject resolve(ProvaObject o, List<ProvaVariable> variables) {
        if (o instanceof ProvaVariablePtr) {
            ProvaVariablePtr varPtr = (ProvaVariablePtr) o;
            o = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
        }
        return o;
    }
}
