package org.provarules.reference2.builtins;

import org.provarules.agent2.ProvaReagent;
import org.provarules.kernel2.*;
import org.provarules.reference2.ProvaListImpl;

import java.util.List;

public class ProvaAttachImpl extends ProvaBuiltinImpl {

    public ProvaAttachImpl(ProvaKnowledgeBase kb) {
        super(kb, "attach");
    }

    @Override
    public boolean process(ProvaReagent prova, ProvaDerivationNode node,
                           ProvaGoal goal, List<ProvaLiteral> newLiterals, ProvaRule query) {
        ProvaLiteral literal = goal.getGoal();
        List<ProvaVariable> variables = query.getVariables();
        ProvaList terms = literal.getTerms();
        ProvaObject[] data = terms.getFixed();
        if (data.length != 3)
            return false;
        ProvaObject lt = data[0];
        if (lt instanceof ProvaVariablePtr) {
            ProvaVariablePtr varPtr = (ProvaVariablePtr) lt;
            lt = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
        }
        if (!(lt instanceof ProvaList))
            return false;
        ProvaObject a2 = data[2];
        if (a2 instanceof ProvaVariablePtr) {
            ProvaVariablePtr varPtr = (ProvaVariablePtr) a2;
            a2 = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
        }
        if (!(a2 instanceof ProvaVariable))
            return false;
        ProvaObject a1 = data[1];
        if (a1 instanceof ProvaVariablePtr) {
            ProvaVariablePtr varPtr = (ProvaVariablePtr) a1;
            a1 = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
        }
        ProvaList prefix = (ProvaList) lt;
        ProvaObject prefixTail = prefix.getTail();
        ProvaObject[] prefixFixed;
        if (prefixTail != null) {
            if (prefixTail instanceof ProvaVariablePtr) {
                ProvaVariablePtr varPtr = (ProvaVariablePtr) prefixTail;
                prefixTail = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
            }
            if (prefixTail instanceof ProvaList) {
                prefixFixed = concat(prefix.getFixed(), ((ProvaList) prefixTail).getFixed());
            } else
                return false;
        } else
            prefixFixed = prefix.getFixed();
        ProvaObject[] newFixed;
        boolean isMonad = false;
        if (a1 instanceof ProvaList && a1 != ProvaListImpl.emptyRList) {
            Object t = ((ProvaList) a1).getFixed()[0];
            if (t instanceof ProvaConstant) {
                t = ((ProvaConstant) t).getObject();
                isMonad = t.equals("state") || t.equals("list") || t.equals("maybe") || t.equals("tree") || t.equals("fact");
            }
        }
        if (a1 instanceof ProvaList && !isMonad) {
            ProvaList suffix = (ProvaList) a1;
            ProvaObject[] suffixFixed = suffix.getFixed();
            ProvaObject tail = suffix.getTail();
            if (tail != null) {
                tail = tail.cloneWithVariables(variables);
            }
            int len = prefixFixed.length + suffixFixed.length;
            if (tail instanceof ProvaList)
                len += ((ProvaList) tail).getFixed().length;
            newFixed = new ProvaObject[len];
            System.arraycopy(prefixFixed, 0, newFixed, 0, prefixFixed.length);
            System.arraycopy(suffixFixed, 0, newFixed, prefixFixed.length, suffixFixed.length);
            if (tail instanceof ProvaList)
                System.arraycopy(((ProvaList) tail).getFixed(), 0, newFixed, prefixFixed.length + suffixFixed.length, ((ProvaList) tail).getFixed().length);
            if (tail instanceof ProvaVariable) {
                ProvaList newTerms = ProvaListImpl.create(newFixed, tail);
                ((ProvaVariable) a2).setAssigned(newTerms);
                return true;
            }
        } else if (a1 == ProvaListImpl.emptyRList) {
            newFixed = prefixFixed;
        } else {
            newFixed = new ProvaObject[prefixFixed.length + 1];
            System.arraycopy(prefixFixed, 0, newFixed, 0, prefixFixed.length);
            newFixed[prefixFixed.length] = a1;
        }
        ProvaList newTerms = ProvaListImpl.create(newFixed);
        ((ProvaVariable) a2).setAssigned(newTerms);
        return true;
    }

    private ProvaObject[] concat(ProvaObject[] left, ProvaObject[] right) {
        ProvaObject[] out = new ProvaObject[left.length + right.length];
        System.arraycopy(left, 0, out, 0, left.length);
        System.arraycopy(right, 0, out, left.length, right.length);
        return out;
    }

}
