package ws.prova.reference2.builtins;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.List;

import ws.prova.agent2.ProvaReagent;
import ws.prova.kernel2.ProvaConstant;
import ws.prova.kernel2.ProvaDerivationNode;
import ws.prova.kernel2.ProvaGoal;
import ws.prova.kernel2.ProvaKnowledgeBase;
import ws.prova.kernel2.ProvaList;
import ws.prova.kernel2.ProvaLiteral;
import ws.prova.kernel2.ProvaObject;
import ws.prova.kernel2.ProvaRule;
import ws.prova.kernel2.ProvaVariable;
import ws.prova.kernel2.ProvaVariablePtr;
import ws.prova.reference2.ProvaConstantImpl;

public class ProvaFopenImpl extends ProvaBuiltinImpl {

	public ProvaFopenImpl(ProvaKnowledgeBase kb) {
		super(kb,"fopen");
	}

	@Override
	public boolean process(ProvaReagent prova, ProvaDerivationNode node,
			ProvaGoal goal, List<ProvaLiteral> newLiterals, ProvaRule query) {
		ProvaLiteral literal = goal.getGoal();
		List<ProvaVariable> variables = query.getVariables();
		ProvaList terms = literal.getTerms();
		ProvaObject[] data = terms.getFixed();
		ProvaObject lt = data[0];
		if( lt instanceof ProvaVariablePtr ) {
			ProvaVariablePtr varPtr = (ProvaVariablePtr) lt;
			lt = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
		}
		String filename = ((ProvaConstant) lt).getObject().toString();
		BufferedReader in = null;
		File file = new File(filename);

		if (!file.exists() || !file.canRead()) {
			try {
				in = new BufferedReader( new InputStreamReader( getClass().getResourceAsStream(filename) ) );
			} catch( Exception e ) {
				throw new RuntimeException(e);
			}
		} else {
			FileReader fr;
			try {
				fr = new FileReader(file);
			} catch (FileNotFoundException e) {
				throw new RuntimeException(e);
			}
			in = new BufferedReader(fr);
		}
		ProvaObject res = data[1];
		if( res instanceof ProvaVariablePtr ) {
			ProvaVariablePtr varPtr = (ProvaVariablePtr) res;
			res = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
		}
		((ProvaVariable) res).setAssigned(ProvaConstantImpl.create(in));
		return true;
	}

	@Override
	public int getArity() {
		return 2;
	}

}
