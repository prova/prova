package ws.prova.reference2.builtins;

import java.util.List;

import org.apache.log4j.Logger;

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

/**
 * str_replace built-in.
 * 
 * Usage:
 * <code>
 *   String = "Hello $src",
 *   World = "World",
 *   str_replace(String, src, World, Newstring),
 *   println([Newstring]).
 * </code>
 * 
 * str_replace replaces all occurrences of a specific token in a String. The token
 * given as the second term is prepended with a '$' sign and replaced by the
 * token given as the third term. The result is assigned to the variable given as the
 * fourth term.
 * 
 * @author Malte Rohde <malte.rohde@inf.fu-berlin.de>
 */
public class ProvaStrReplaceImpl extends ProvaBuiltinImpl {
	private static final Logger log = Logger.getLogger(ProvaStrReplaceImpl.class);
	
	public ProvaStrReplaceImpl(ProvaKnowledgeBase kb) {
		super(kb, "str_replace");
	}

	@Override
	public boolean process(ProvaReagent prova, ProvaDerivationNode node,
			ProvaGoal goal, List<ProvaLiteral> newLiterals, ProvaRule query) {
		List<ProvaVariable> variables = query.getVariables();
		ProvaLiteral literal = goal.getGoal();
		ProvaList terms = (ProvaList) literal.getTerms();
		ProvaObject[] data = terms.getFixed();	
		
		// First term: String
		ProvaObject data0 = resolve(data[0], variables);
		if(!(data0 instanceof ProvaConstant)) {
			log.error("Binding error. Term 1 must be constant (the string).");
			return false;
		}
		String str = ((ProvaConstant) data0).getObject().toString();
		
		// Second term: Search token.
		ProvaObject data1 = resolve(data[1], variables);
		if(!(data1 instanceof ProvaConstant)) {
			log.error("Binding error. Term 2 must be constant (search token).");
			return false;
		}
		String search = "\\$" + ((ProvaConstant) data1).getObject().toString();

		
		// Third term: Replacement token.
		ProvaObject data2 = resolve(data[2], variables);
		if(!(data2 instanceof ProvaConstant)) {
			log.error("Binding error. Term 3 must be constant (replacement token).");
			return false;
		}
		String replace = ((ProvaConstant) data2).getObject().toString();
		
		// Fourth term: Variable.
		ProvaObject data3 = resolve(data[3], variables);
		if(data3 instanceof ProvaConstant) {
			log.error("Binding error. Term 4 must be variable.");
			return false;
		}
		ProvaVariable newstr = (ProvaVariable) data3;
		
		// Replace and assign.
		newstr.setAssigned(ProvaConstantImpl.create(str.replaceAll(search, replace)));
		return true;
	}
	
	static private ProvaObject resolve(ProvaObject o, List<ProvaVariable> variables) {
		if(o instanceof ProvaVariablePtr) {
			ProvaVariablePtr varPtr = (ProvaVariablePtr) o;
			o = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
		}
		return o;
	}
}
