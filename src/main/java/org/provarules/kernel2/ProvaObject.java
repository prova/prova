package org.provarules.kernel2;

import java.io.Serializable;
import java.util.List;

/**
 * TODO: Rename to ProvaTerm once all rewrite is complete
 *
 * @author Alex Kozlenkov
 */
public interface ProvaObject extends Serializable {

    ProvaObject getRecursivelyAssigned();

    int collectVariables(long ruleId, List<ProvaVariable> variables);

    int computeSize();

    boolean unify(ProvaObject target, ProvaUnification unification);

    void substituteVariables(final ProvaVariablePtr[] varsMap);

    boolean isGround();

    String toString(final List<ProvaVariable> variables);

    ProvaObject cloneWithVariables(final List<ProvaVariable> variables);

    ProvaObject cloneWithVariables(final long ruleId,
                                   final List<ProvaVariable> variables);

    Object computeIfExpression();

    ProvaObject computeProvaIfExpression();

    ProvaObject cloneWithBoundVariables(final List<ProvaVariable> variables, final List<Boolean> isConstant);

    boolean updateGround(final List<ProvaVariable> variables);

}
