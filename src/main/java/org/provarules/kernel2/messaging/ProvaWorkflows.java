package org.provarules.kernel2.messaging;

import org.provarules.kernel2.ProvaLiteral;
import org.provarules.kernel2.ProvaRule;

import java.util.List;

public interface ProvaWorkflows {

    boolean init_join(ProvaLiteral literal, List<ProvaLiteral> newLiterals,
                      ProvaRule query);

    boolean join_test(ProvaLiteral literal, List<ProvaLiteral> newLiterals,
                      ProvaRule query);

    boolean init_predicate_join(ProvaLiteral literal,
                                List<ProvaLiteral> newLiterals, ProvaRule query);

    boolean predicate_join_test(ProvaLiteral literal,
                                List<ProvaLiteral> newLiterals, ProvaRule query);

    boolean predicate_join_exit(ProvaLiteral literal,
                                List<ProvaLiteral> newLiterals, ProvaRule query);

    boolean stop_predicate_join(ProvaLiteral literal,
                                       List<ProvaLiteral> newLiterals, ProvaRule query);

}
