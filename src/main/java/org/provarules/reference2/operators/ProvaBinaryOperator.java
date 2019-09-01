package org.provarules.reference2.operators;

import org.provarules.kernel2.ProvaComputable;
import org.provarules.kernel2.ProvaKnowledgeBase;
import org.provarules.kernel2.ProvaLiteral;
import org.provarules.kernel2.ProvaObject;

import java.util.List;

public interface ProvaBinaryOperator {

    public boolean evaluate(ProvaKnowledgeBase kb, List<ProvaLiteral> newLiterals, ProvaObject o1, ProvaComputable a2);

}
