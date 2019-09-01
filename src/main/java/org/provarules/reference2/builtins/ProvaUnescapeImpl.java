package org.provarules.reference2.builtins;

import org.provarules.agent2.ProvaReagent;
import org.provarules.kernel2.*;
import org.provarules.reference2.ProvaConstantImpl;

import java.util.List;

public class ProvaUnescapeImpl extends ProvaBuiltinImpl {

    public ProvaUnescapeImpl(ProvaKnowledgeBase kb) {
        super(kb, "unescape");
    }

    @Override
    public boolean process(ProvaReagent prova, ProvaDerivationNode node,
                           ProvaGoal goal, List<ProvaLiteral> newLiterals, ProvaRule query) {
        ProvaLiteral literal = goal.getGoal();
        List<ProvaVariable> variables = query.getVariables();
        ProvaList terms = literal.getTerms();
        ProvaObject[] data = terms.getFixed();
        if (data.length != 2)
            return false;
        ProvaObject res = data[1];
        if (res instanceof ProvaVariablePtr) {
            ProvaVariablePtr varPtr = (ProvaVariablePtr) res;
            res = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
        }
        if (!(res instanceof ProvaVariable) && !(res instanceof ProvaConstant))
            return false;
        ProvaObject lt = data[0];
        if (lt instanceof ProvaVariablePtr) {
            ProvaVariablePtr varPtr = (ProvaVariablePtr) lt;
            lt = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
        }
        if (!(lt instanceof ProvaConstant))
            return false;
        String in = ((ProvaConstant) lt).getObject().toString();

        if (res instanceof ProvaVariable)
            ((ProvaVariable) res).setAssigned(ProvaConstantImpl.create(unescape(in)));
        else if (res instanceof ProvaConstant) {
            return ((ProvaConstant) res).getObject().toString().equals(unescape(in));
        }
        return true;
    }

    @Override
    public int getArity() {
        return 2;
    }

    /**
     * Translate escaped Java-standard string to a string with special characters
     * embedded (for example, "\n" -> '\n').
     * Unrecognised escapes are left as they are.
     * Escape character is '\'.
     *
     * @param in escaped string
     * @return unescaped string
     */
    private String unescape(String in) {
        final String metachars = "\"btrn\'\\";
        final String chars = "\"\b\t\r\n\'\\";
        final char escape = '\\';
        StringBuilder out = new StringBuilder();

        int p = 0;
        int i;
        int len = in.length();
        while ((i = in.indexOf(escape, p)) != -1) {
            out.append(in.substring(p, i));
            if (i + 1 == len) {
                break;
            }
            char meta = in.charAt(i + 1);
            int k = metachars.indexOf(meta);
            if (k == -1) {
                out.append(escape);
                out.append(meta);
            } else {
                out.append(chars.charAt(k));
            }
            p = i + 2;
        }
        if (p < len) {
            out.append(in.substring(p));
        }
        return out.toString();
    }

}
