package ws.prova.reference2.operators;

import ws.prova.kernel2.ProvaComputable;
import ws.prova.kernel2.ProvaObject;

public interface ProvaBinaryOperator {

	public boolean evaluate(ProvaObject o1, ProvaComputable a2);

}
