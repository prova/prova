package ws.prova.reference2.operators;

import java.util.List;

import ws.prova.kernel2.ProvaComputable;
import ws.prova.kernel2.ProvaKnowledgeBase;
import ws.prova.kernel2.ProvaLiteral;
import ws.prova.kernel2.ProvaObject;

public interface ProvaBinaryOperator {

	public boolean evaluate(ProvaKnowledgeBase kb, List<ProvaLiteral> newLiterals, ProvaObject o1, ProvaComputable a2);

}
