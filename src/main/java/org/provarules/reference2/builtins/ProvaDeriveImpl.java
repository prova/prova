package org.provarules.reference2.builtins;

import org.provarules.agent2.ProvaReagent;
import org.provarules.kernel2.*;
import org.provarules.reference2.*;

import java.util.ArrayList;
import java.util.List;

public class ProvaDeriveImpl extends ProvaBuiltinImpl {

    public ProvaDeriveImpl(ProvaKnowledgeBase kb) {
        super(kb, "derive");
    }

    @Override
    public boolean process(ProvaReagent prova, ProvaDerivationNode node,
                           ProvaGoal goal, List<ProvaLiteral> newLiterals, ProvaRule query) {
        ProvaLiteral literal = goal.getGoal();
        List<ProvaVariable> variables = query.getVariables();
        ProvaList terms = literal.getTerms();
        if (terms.getFixed().length == 0)
            return false;
        ProvaObject first = terms.getFixed()[0];
        if (first instanceof ProvaVariablePtr) {
            ProvaVariablePtr varPtr = (ProvaVariablePtr) first;
            first = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
        }
        if (!(first instanceof ProvaList))
            return false;
        ProvaList firstList0 = (ProvaList) first;
        if (firstList0 == ProvaListImpl.emptyRList)
            return false;
        ProvaObject[] fixed0 = firstList0.getFixed();
        ProvaList firstList = (ProvaList) first; //.cloneWithVariables(variables);
        ProvaObject[] fixed = firstList.getFixed();
        ProvaObject first2 = fixed[0];
        if (first2 instanceof ProvaVariablePtr) {
            ProvaVariablePtr varPtr = (ProvaVariablePtr) first2;
            first2 = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
        }
        if (first2 instanceof ProvaList) {
            if (first2 == ProvaListImpl.emptyRList)
                return false;
            ProvaPredicate pred = new ProvaPredicateImpl("", 2, kb);
            ProvaObject[] funs = ((ProvaList) first2).getFixed();
            if (funs.length != 0 && funs[0] instanceof ProvaList) {
                ProvaList funs2 = (ProvaList) funs[0];
                ProvaObject[] fixed3 = funs2.getFixed();
                if (fixed3.length == 1) {
                    if (!(fixed3[0] instanceof ProvaList))
                        return false;
                    funs = ((ProvaList) fixed3[0]).getFixed();
                }
                if (fixed3.length == 2 && fixed3[0] instanceof ProvaList) {
                    ProvaList first3 = (ProvaList) fixed3[0];
                    ProvaObject[] funs3 = first3.getFixed();
                    ProvaObject arg = fixed3[1];
                    ProvaObject[] funs4 = new ProvaObject[funs3.length];
                    System.arraycopy(funs3, 0, funs4, 0, funs3.length - 1);
                    funs = funs4;
                    int i = funs3.length - 1;
                    ProvaObject fun = funs3[i];
                    if (fun instanceof ProvaConstant) {
                        final ProvaObject[] newFixed = new ProvaObject[2];
                        funs[i] = ProvaListImpl.create(newFixed);
                        newFixed[0] = fun;
                        newFixed[1] = arg;
                    } else if (fun instanceof ProvaList) {
                        ProvaObject[] complex = ((ProvaList) fun).getFixed();
                        final ProvaObject[] newFixed = new ProvaObject[1 + complex.length];
                        funs[i] = ProvaListImpl.create(newFixed);
                        System.arraycopy(complex, 0, newFixed, 0, complex.length);
                        newFixed[complex.length] = arg;
                    }
                }
            }
            List<ProvaLiteral> body = new ArrayList<>();
            ProvaObject temp = null;
            for (int i = 0; i < funs.length; i++) {
                ProvaObject fun = funs[i];
                // Note that if the fixed part is only 1, the new query will be tail-only
                ProvaObject[] newFixed = new ProvaObject[fixed.length - 1];
                System.arraycopy(fixed, 1, newFixed, 0, fixed.length - 1);
                String symbol = null;
                if (fun instanceof ProvaVariablePtr) {
                    ProvaVariablePtr varPtr = (ProvaVariablePtr) fun;
                    fun = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
                }
                if (fun instanceof ProvaVariable) {
                    return false;
                } else if (fun instanceof ProvaConstant) {
                    symbol = (String) ((ProvaConstant) fun).getObject();
                    if (temp != null)
                        newFixed[0] = temp;
                } else if (fun instanceof ProvaList) {
                    ProvaObject[] complex = ((ProvaList) fun).getFixed();
                    symbol = (String) ((ProvaConstant) complex[0]).getObject();
                    ProvaObject[] attachTo = new ProvaObject[complex.length - 1];
                    System.arraycopy(complex, 1, attachTo, 0, complex.length - 1);
                    ProvaList attachToList = ProvaListImpl.create(attachTo, null);
                    ProvaObject attachTemp = ProvaVariableImpl.create();
                    ProvaObject[] attachFixed;
                    if (temp == null) {
                        attachFixed = new ProvaObject[]{attachToList, fixed[1], attachTemp};
                    } else {
                        attachFixed = new ProvaObject[]{attachToList, temp, attachTemp};
                    }
                    temp = attachTemp;
                    ProvaList attachTerms = ProvaListImpl.create(attachFixed, null);
                    body.add(kb.generateLiteral("@attach", attachTerms));
                    newFixed[0] = attachTemp;
                }
                if (i < funs.length - 1) {
                    temp = ProvaVariableImpl.create();
                    newFixed[fixed.length - 2] = temp;
                }
                ProvaList newTerms = ProvaListImpl.create(newFixed, firstList.getTail());//.cloneWithVariables(variables);
                body.add(kb.generateLiteral(symbol, newTerms));
            }
            ProvaObject in = ProvaVariableImpl.create();
            ProvaObject out = ProvaVariableImpl.create();
            ProvaList ls = ProvaListImpl.create(new ProvaObject[]{in, out});
            ProvaLiteral lit = new ProvaLiteralImpl(pred, ls);
            ProvaRule clause = ProvaRuleImpl.createVirtualRule(1, lit, body.toArray(new ProvaLiteral[]{}));
            pred.addClause(clause);
            // Note that if the fixed part is only 1, the new query will be tail-only
            ProvaObject[] newFixed = new ProvaObject[fixed0.length - 1];
            System.arraycopy(fixed0, 1, newFixed, 0, fixed0.length - 1);
            ProvaList newTerms = ProvaListImpl.create(newFixed, firstList0.getTail());
            ProvaLiteral newLiteral = new ProvaLiteralImpl(pred, newTerms);
            newLiterals.add(newLiteral);
            return true;
        }
        if (!(first2 instanceof ProvaConstant) || !(((ProvaConstant) first2).getObject() instanceof String))
            return false;
        String symbol = (String) ((ProvaConstant) first2).getObject();
        // Note that if the fixed part is only 1, the new query will be tail-only
        ProvaObject[] newFixed = new ProvaObject[fixed0.length - 1];
        System.arraycopy(fixed0, 1, newFixed, 0, fixed0.length - 1);
        ProvaList newTerms = ProvaListImpl.create(newFixed, firstList.getTail());
        newLiterals.add(kb.generateLiteral(symbol, newTerms));

        return true;
    }

}
