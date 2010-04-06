package ws.prova.reference2.builtins;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
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

public class ProvaCopyStreamImpl extends ProvaBuiltinImpl {

	final private static int sChunk = 8192;

	public ProvaCopyStreamImpl(ProvaKnowledgeBase kb) {
		super(kb, "copy_stream");
	}

	@Override
	public boolean process(ProvaReagent prova, ProvaDerivationNode node,
			ProvaGoal goal, List<ProvaLiteral> newLiterals, ProvaRule query) {
		ProvaLiteral literal = goal.getGoal();
		List<ProvaVariable> variables = query.getVariables();
		ProvaList terms = literal.getTerms();
		ProvaObject[] data = terms.getFixed();
		ProvaObject in = data[0];
		if (in instanceof ProvaVariablePtr) {
			ProvaVariablePtr varPtr = (ProvaVariablePtr) in;
			in = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
		}
		ProvaObject out = data[1];
		if (out instanceof ProvaVariablePtr) {
			ProvaVariablePtr varPtr = (ProvaVariablePtr) out;
			out = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
		}
		InputStream is = (InputStream) ((ProvaConstant) in).getObject();
		OutputStream os = (OutputStream) ((ProvaConstant) out).getObject();
		runWithExceptions(is, os);
		return true;
	}

	private void process(InputStream is, OutputStream os) throws IOException {
		byte[] buffer = new byte[sChunk];
		int length;
		while ((length = is.read(buffer, 0, sChunk)) != -1)
			os.write(buffer, 0, length);
	}

	private void runWithExceptions(InputStream is, OutputStream os) {
		IOException processException = null;
		try {
			process(is, os);
		} catch (IOException e) {
			processException = e;
		} finally {
			if (is != null) {
				try {
					is.close();
				} catch (IOException e) {
					if (processException != null) {
						throw new RuntimeException(processException);
					} else {
						throw new RuntimeException(e);
					}
				}
			}
			if (os != null) {
				try {
					os.close();
				} catch (IOException e) {
					if (processException != null) {
						throw new RuntimeException(processException);
					} else {
						throw new RuntimeException(e);
					}
				}
			}
			if (processException != null) {
				throw new RuntimeException(processException);
			}
		}
	}

	@Override
	public int getArity() {
		return 2;
	}

}
