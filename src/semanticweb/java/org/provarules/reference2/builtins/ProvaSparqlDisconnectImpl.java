package org.provarules.reference2.builtins;

import org.eclipse.rdf4j.repository.RepositoryConnection;
import org.eclipse.rdf4j.repository.RepositoryException;
import org.provarules.agent2.ProvaReagent;
import org.provarules.kernel2.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * sparql_disconnect built-in.
 * <br>
 * Usage:
 * {@code
 * sparql_disconnect(Connection).
 * }
 * <br>
 * sparql_connect disconnects the `RepositoryConnection` stored in `Connection`.
 *
 * @author <a href="mailto:malte.rohde@inf.fu-berlin.de">Malte Rohde</a>
 */
public class ProvaSparqlDisconnectImpl extends ProvaBuiltinImpl {

    private static final Logger log = LoggerFactory.getLogger(ProvaSparqlDisconnectImpl.class);

    public ProvaSparqlDisconnectImpl(ProvaKnowledgeBase kb) {
        super(kb, "sparql_disconnect");
    }

    @Override
    public int getArity() {
        return 1;
    }

    @Override
    public boolean process(ProvaReagent prova, ProvaDerivationNode node,
                           ProvaGoal goal, List<ProvaLiteral> newLiterals, ProvaRule query) {
        List<ProvaVariable> variables = query.getVariables();
        ProvaLiteral literal = goal.getGoal();
        ProvaList terms = literal.getTerms();
        ProvaObject[] data = terms.getFixed();

        if (data.length != 1) {
            log.error("Syntax error. Need one term.");
            return false;
        }

        ProvaObject data0 = data[0];
        if (data0 instanceof ProvaVariablePtr) {
            ProvaVariablePtr varPtr = (ProvaVariablePtr) data0;
            data0 = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
        }

        if (!(data0 instanceof ProvaConstant)) {
            log.error("Binding error. First term must be constant.");
            return false;
        }

        Object obj = ((ProvaConstant) data0).getObject();
        if (!(obj instanceof RepositoryConnection)) {
            log.error("Binding error. First term must be RepositoryConnection.");
            return false;
        }

        // Do the work.
        try {
            ((RepositoryConnection) obj).close();
        } catch (RepositoryException e) {
            log.error("Could not close connection.");
            return false;
        }

        return true;
    }
}
