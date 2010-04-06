package ws.prova.kernel2.messaging;

import java.util.List;

import ws.prova.kernel2.ProvaLiteral;
import ws.prova.kernel2.ProvaRule;

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

	public boolean stop_predicate_join(ProvaLiteral literal,
			List<ProvaLiteral> newLiterals, ProvaRule query);

}
