package ws.prova.parser2;

import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonErrorNode;

public class ProvaErrorNode extends ProvaAST {

	private CommonErrorNode errorNode;
	
	public ProvaErrorNode(Token tok) {
		super(tok);
	}

	public void setErrorNode(CommonErrorNode errorNode) {
		this.errorNode = errorNode;
	}

	public CommonErrorNode getErrorNode() {
		return errorNode;
	}

	
}
