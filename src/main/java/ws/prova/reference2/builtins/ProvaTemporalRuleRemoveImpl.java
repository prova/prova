package ws.prova.reference2.builtins;

import java.util.List;

import ws.prova.agent2.ProvaReagent;
import ws.prova.kernel2.ProvaConstant;
import ws.prova.kernel2.ProvaDerivationNode;
import ws.prova.kernel2.ProvaGoal;
import ws.prova.kernel2.ProvaKnowledgeBase;
import ws.prova.kernel2.ProvaList;
import ws.prova.kernel2.ProvaLiteral;
import ws.prova.kernel2.ProvaObject;
import ws.prova.kernel2.ProvaPredicate;
import ws.prova.kernel2.ProvaRule;
import ws.prova.kernel2.ProvaVariable;

public class ProvaTemporalRuleRemoveImpl extends ProvaBuiltinImpl {

	public ProvaTemporalRuleRemoveImpl(ProvaKnowledgeBase kb) {
		super(kb, "@temporal_rule_remove");
	}

	@Override
	public boolean process(ProvaReagent prova, ProvaDerivationNode node,
			ProvaGoal goal, List<ProvaLiteral> newLiterals, ProvaRule query) {
		ProvaLiteral literal = goal.getGoal();
		synchronized(kb) {
			ProvaList terms = (ProvaList) literal.getTerms();
			ProvaObject[] data = terms.getFixed();
			if( data.length!=4 )
				return false;
			ProvaPredicate predicate = (ProvaPredicate) ((ProvaConstant) data[0]).getObject();
			ProvaPredicate predicate2 = (ProvaPredicate) ((ProvaConstant) data[1]).getObject();
			long key = (Long) ((ProvaConstant) data[2]).getObject();
			List<ProvaVariable> variables = query.getVariables();
			ProvaList reaction = (ProvaList) ((ProvaList) data[3]).cloneWithVariables(variables);
			try {
				boolean status = prova.getMessenger().removeTemporalRule(predicate,predicate2,key,true,reaction,literal.getMetadata());
				if( !status )
					return false;
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
			return true;
		}
	}

}
