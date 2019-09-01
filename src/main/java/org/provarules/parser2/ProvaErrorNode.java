package org.provarules.parser2;

import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonErrorNode;

public class ProvaErrorNode extends ProvaAST {

    private CommonErrorNode errorNode;

    ProvaErrorNode(Token tok) {
        super(tok);
    }

    void setErrorNode(CommonErrorNode errorNode) {
        this.errorNode = errorNode;
    }

    public CommonErrorNode getErrorNode() {
        return errorNode;
    }


}
