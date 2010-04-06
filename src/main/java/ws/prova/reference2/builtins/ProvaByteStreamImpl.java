package ws.prova.reference2.builtins;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
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

public class ProvaByteStreamImpl extends ProvaBuiltinImpl {

	public ProvaByteStreamImpl(ProvaKnowledgeBase kb) {
		super(kb,"byte_stream");
	}

	@Override
	public boolean process(ProvaReagent prova, ProvaDerivationNode node,
			ProvaGoal goal, List<ProvaLiteral> newLiterals, ProvaRule query) {
		ProvaLiteral literal = goal.getGoal();
		List<ProvaVariable> variables = query.getVariables();
		ProvaList terms = literal.getTerms();
		ProvaObject[] data = terms.getFixed();
		if( data.length!=2 )
			return false;
		ProvaObject n_out = data[1];
		if( n_out instanceof ProvaVariablePtr ) {
			ProvaVariablePtr varPtr = (ProvaVariablePtr) n_out;
			n_out = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
		}
		ProvaObject lt = data[0];
		if( lt instanceof ProvaVariablePtr ) {
			ProvaVariablePtr varPtr = (ProvaVariablePtr) lt;
			lt = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
		}
		if( !(lt instanceof ProvaList) )
			return false;
		ProvaObject[] args = ((ProvaList) ((ProvaList) lt).cloneWithVariables(variables)).getFixed();
		if( args.length!=2 )
			return false;
		if( !(args[0] instanceof ProvaConstant) || !(args[1] instanceof ProvaConstant) )
			return false;
		Object oin = ((ProvaConstant) args[0]).getObject();
		String enc = ((ProvaConstant) args[1]).toString();
		if( oin instanceof String ) {
			if( !(n_out instanceof ProvaVariable) )
				return false;
			String in = ((ProvaConstant) args[0]).toString();
			byte[] input;
			try {
				input = in.getBytes(enc);
			} catch (UnsupportedEncodingException e) {
				throw new RuntimeException(e);
			}
			((ProvaVariable) n_out).setAssigned(ProvaConstantImpl.create(new ByteArrayInputStream(input)));
		} else if( oin instanceof ByteArrayOutputStream ) {
			try {
				((ByteArrayOutputStream) oin).toString(enc);
			} catch (UnsupportedEncodingException e) {
				throw new RuntimeException(e);
			}
		} else
			return false;
		return true;
	}

	@Override
	public int getArity() {
		return 2;
	}

}
