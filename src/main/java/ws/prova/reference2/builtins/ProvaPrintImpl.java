package ws.prova.reference2.builtins;

import java.io.PrintWriter;
import java.util.List;

import ws.prova.kernel2.ProvaDerivationNode;
import ws.prova.kernel2.ProvaGoal;
import ws.prova.kernel2.ProvaKnowledgeBase;
import ws.prova.kernel2.ProvaList;
import ws.prova.kernel2.ProvaLiteral;
import ws.prova.kernel2.ProvaObject;
import ws.prova.kernel2.ProvaRule;
import ws.prova.kernel2.ProvaVariable;
import ws.prova.agent2.ProvaReagent;

public class ProvaPrintImpl extends ProvaBuiltinImpl {

	public ProvaPrintImpl(ProvaKnowledgeBase kb) {
		super(kb,"print");
	}

	@Override
	public boolean process(ProvaReagent prova, ProvaDerivationNode node,
			ProvaGoal goal, List<ProvaLiteral> newLiterals, ProvaRule query) {
		ProvaLiteral literal = goal.getGoal();
		synchronized(this) {
			List<ProvaVariable> variables = query.getVariables();
			ProvaList terms = (ProvaList) literal.getTerms().cloneWithVariables(variables);
			ProvaObject[] data = terms.getFixed();
			if( data.length>2 )
				return false;
			PrintWriter writer = kb.getPrintWriter();
			String separator = "";
			if( data.length==2 )
				separator = data[1].toString(variables);
			if( data[0] instanceof ProvaList ) {
				ProvaObject[] objs = ((ProvaList) data[0]).getFixed();
				for( int i=0; i<objs.length; i++ ) {
					if( i!=0 )
						writer.print(separator);
					writer.print(objs[i].toString(variables));
				}
			}
		}
		return true;
	}

	@Override
	public int getArity() {
		return 1;
	}

}
