package org.provarules.reference2.builtins;

import org.eclipse.rdf4j.repository.RepositoryConnection;
import org.provarules.agent2.ProvaReagent;
import org.provarules.kernel2.*;
import org.provarules.reference2.ProvaConstantImpl;
import org.provarules.reference2.ProvaListImpl;
import org.provarules.reference2.ProvaLiteralImpl;
import org.provarules.reference2.ProvaRuleImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Abstract sparql query base class.
 * <br>
 * This class provides the generic SPARQL query functionality,
 * such as resolving the Connection term and creating the `QueryID`
 * identifier.
 *
 * @author <a href="mailto:malte.rohde@inf.fu-berlin.de">Malte Rohde</a>
 */
public abstract class ProvaSparqlQueryImpl extends ProvaBuiltinImpl {
    private static final Logger log = LoggerFactory.getLogger(ProvaSparqlQueryImpl.class);
    private static AtomicInteger nqid = new AtomicInteger(0);

    ProvaSparqlQueryImpl(ProvaKnowledgeBase kb, String symbol) {
        super(kb, symbol);
    }

    @Override
    public int getArity() {
        return -1;
    }

    @Override
    public boolean process(ProvaReagent prova, ProvaDerivationNode node,
                           ProvaGoal goal, List<ProvaLiteral> newLiterals, ProvaRule query) {
        List<ProvaVariable> variables = query.getVariables();
        ProvaLiteral literal = goal.getGoal();
        ProvaList terms = literal.getTerms();
        ProvaObject[] data = terms.getFixed();

        if (data.length != 3) {
            log.error("Syntax error. Need three terms.");
            return false;
        }

        // ############################
        // Parameterization.
        // ############################

        // First parameter: Connection.
        RepositoryConnection con;
        if ((con = extractValue(data, variables, 0)) == null)
            return false;

        // Second parameter: SPARQL query.
        String sparql_query;
        if ((sparql_query = extractValue(data, variables, 1)) == null)
            return false;

        // Third parameter: QueryID.
        String qid;
        ProvaObject data2 = resolve(data[2], variables);
        if (data2 instanceof ProvaConstant) {
            qid = data2.toString();
        } else {
            qid = Integer.toString(nqid.incrementAndGet());
            ((ProvaVariable) data2).setAssigned(ProvaConstantImpl.create(qid));
        }

        // ############################
        // Query execution.
        // ############################

        ProvaPredicate pred = null;
        ProvaConstant cqid = ProvaConstantImpl.create(qid);

        // Implemented in sub class.
        return processQuery(pred, cqid, con, sparql_query);
    }

    abstract protected boolean processQuery(ProvaPredicate pred, ProvaConstant cqid, RepositoryConnection con, String sparql_query);

    static private ProvaObject resolve(ProvaObject o, List<ProvaVariable> variables) {
        if (o instanceof ProvaVariablePtr) {
            ProvaVariablePtr varPtr = (ProvaVariablePtr) o;
            o = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
        }
        return o;
    }

    @SuppressWarnings("unchecked")
    static private <T> T extractValue(ProvaObject[] data, List<ProvaVariable> variables, int idx) {
        T retval;
        ProvaObject o = resolve(data[idx], variables);
        if (!(o instanceof ProvaConstant)) {
            log.error("Binding error. Term " + (idx + 1) + " must be constant.");
            return null;
        }
        try {
            retval = (T) ((ProvaConstant) o).getObject();
        } catch (ClassCastException cce) {
            log.error("Binding error. Term " + (idx + 1) + " has wrong type.");
            if (log.isDebugEnabled())
                log.debug("Exception: ", cce);
            return null;
        }
        return retval;
    }

    static void addFact(ProvaPredicate pred, ProvaConstant cqid, List<ProvaObject> terms) {
        terms.add(0, cqid);
        ProvaList ls = ProvaListImpl.create(terms);
        ProvaLiteral lit = new ProvaLiteralImpl(pred, ls);
        ProvaRule clause = ProvaRuleImpl.createVirtualRule(1, lit, null);
        pred.addClause(clause);
    }
}
