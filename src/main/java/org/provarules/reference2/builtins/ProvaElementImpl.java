package org.provarules.reference2.builtins;

import org.provarules.agent2.ProvaReagent;
import org.provarules.kernel2.*;
import org.provarules.reference2.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ProvaElementImpl extends ProvaBuiltinImpl {

    public ProvaElementImpl(ProvaKnowledgeBase kb) {
        super(kb, "element");
    }

    /**
     * TODO: All this assumes that collections or iterators contain only ProvaObject members
     */
    @Override
    public boolean process(ProvaReagent prova, ProvaDerivationNode node,
                           ProvaGoal goal, List<ProvaLiteral> newLiterals, ProvaRule query) {
        ProvaLiteral literal = goal.getGoal();
        List<ProvaVariable> variables = query.getVariables();
        ProvaList terms = literal.getTerms();
        ProvaObject[] data = terms.getFixed();
        int whereList = 1;
        if (data.length != 2 && data.length != 3)
            return false;
        ProvaObject specifiedIndex = null;
        if (data.length == 3) {
            whereList = 2;
            specifiedIndex = data[0];
            if (specifiedIndex instanceof ProvaVariablePtr) {
                ProvaVariablePtr varPtr = (ProvaVariablePtr) specifiedIndex;
                specifiedIndex = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
            }
        }
        ProvaObject lt = data[whereList - 1];
        if (lt instanceof ProvaVariablePtr) {
            ProvaVariablePtr varPtr = (ProvaVariablePtr) lt;
            ProvaObject o = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
            if (!(o instanceof ProvaVariable))
                lt = o;
        }
//		if( lt instanceof ProvaVariable ) {
////			 // TODO: this is nonsense
////			((ProvaVariable) lt).setAssigned(data[1]);
////			return true;
//			
//		}
        ProvaObject rhs = data[whereList];
        if (rhs instanceof ProvaVariablePtr) {
            ProvaVariablePtr varPtr = (ProvaVariablePtr) rhs;
            rhs = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
        }
        if (rhs instanceof ProvaList) {
            ProvaObject[] arrays = ((ProvaList) rhs).getFixed();
            rhs = ProvaConstantImpl.create(Arrays.asList(arrays));
        }
        if (rhs instanceof ProvaConstant) {
            Object rhsObject = ((ProvaConstant) rhs).getObject();
            if (rhsObject instanceof Iterator<?>) {
                Iterator<?> rhsIterator = (Iterator<?>) rhsObject;
                ProvaPredicate pred = null;
                ProvaList ltls = null;
                if (data.length == 2) {
                    pred = new ProvaPredicateImpl("", 1, kb);
                    while (rhsIterator.hasNext()) {
                        ProvaObject o = getElement(rhsIterator.next());
                        ProvaList ls = ProvaListImpl.create(new ProvaObject[]{o});
                        ProvaLiteral lit = new ProvaLiteralImpl(pred, ls);
                        ProvaRule clause = ProvaRuleImpl.createVirtualRule(1, lit, null);
                        pred.addClause(clause);
                    }
                    ltls = ProvaListImpl.create(new ProvaObject[]{lt});
                } else if (specifiedIndex instanceof ProvaVariable) {
                    pred = new ProvaPredicateImpl("", 2, kb);
                    int index = 0;
                    while (rhsIterator.hasNext()) {
                        ProvaObject o = getElement(rhsIterator.next());
                        ProvaList ls = ProvaListImpl.create(new ProvaObject[]{ProvaConstantImpl.create(index++), o});
                        ProvaLiteral lit = new ProvaLiteralImpl(pred, ls);
                        ProvaRule clause = ProvaRuleImpl.createVirtualRule(1, lit, null);
                        pred.addClause(clause);
                    }
                    ltls = ProvaListImpl.create(new ProvaObject[]{data[0], lt});
                } else if (specifiedIndex instanceof ProvaConstant) {
                    pred = new ProvaPredicateImpl("", 1, kb);
                    Object o = ((ProvaConstant) specifiedIndex).getObject();
                    if (!(o instanceof Integer) && !(o instanceof Long))
                        return false;
                    Number index = (Number) o;
                    if (index.intValue() < 0)
                        return false;
                    int i = 0;
                    while (rhsIterator.hasNext()) {
                        if (i == index.intValue()) {
                            ProvaObject obj = getElement(rhsIterator.next());
                            ProvaList ls = ProvaListImpl.create(new ProvaObject[]{obj});
                            ProvaLiteral lit = new ProvaLiteralImpl(pred, ls);
                            ProvaRule clause = ProvaRuleImpl.createVirtualRule(1, lit, null);
                            pred.addClause(clause);
                            ltls = ProvaListImpl.create(new ProvaObject[]{lt});
                            return true;
                        }
                    }
                }
                ProvaLiteral newLiteral = new ProvaLiteralImpl(pred, ltls);
                newLiterals.add(newLiteral);
                return true;
            }
            if (!(rhsObject instanceof Collection<?>))
                return false;
            Collection<?> rhsCollection = (Collection<?>) rhsObject;
            ProvaPredicate pred = null;
            ProvaList ltls = null;
            if (data.length == 2) {
                pred = new ProvaPredicateImpl("", 1, kb);
                for (Object o : rhsCollection) {
                    ProvaObject obj = getElement(o);
                    ProvaList ls = ProvaListImpl.create(new ProvaObject[]{obj});
                    ProvaLiteral lit = new ProvaLiteralImpl(pred, ls);
                    ProvaRule clause = ProvaRuleImpl.createVirtualRule(1, lit, null);
                    pred.addClause(clause);
                }
                ltls = ProvaListImpl.create(new ProvaObject[]{lt});
            } else if (specifiedIndex instanceof ProvaVariable) {
                pred = new ProvaPredicateImpl("", 2, kb);
                int index = 0;
                for (Object o : rhsCollection) {
                    ProvaObject obj = getElement(o);
                    ProvaList ls = ProvaListImpl.create(new ProvaObject[]{ProvaConstantImpl.create(index++), obj});
                    ProvaLiteral lit = new ProvaLiteralImpl(pred, ls);
                    ProvaRule clause = ProvaRuleImpl.createVirtualRule(1, lit, null);
                    pred.addClause(clause);
                }
                ltls = ProvaListImpl.create(new ProvaObject[]{data[0], lt});
            } else if (specifiedIndex instanceof ProvaConstant) {
                pred = new ProvaPredicateImpl("", 1, kb);
                Object o = ((ProvaConstant) specifiedIndex).getObject();
                if (!(o instanceof Integer) && !(o instanceof Long))
                    return false;
                Number index = (Number) o;
                if (index.intValue() < 0 || index.intValue() >= rhsCollection.size())
                    return false;
                Object element = rhsCollection.toArray()[index.intValue()];
                ProvaObject obj = getElement(element);
//				if( element instanceof ProvaObject )
//					obj = (ProvaObject) element;
//				else
//					obj = new ProvaConstantImpl(element);
                ProvaList ls = ProvaListImpl.create(new ProvaObject[]{obj});
                ProvaLiteral lit = new ProvaLiteralImpl(pred, ls);
                ProvaRule clause = ProvaRuleImpl.createVirtualRule(1, lit, null);
                pred.addClause(clause);
                ltls = ProvaListImpl.create(new ProvaObject[]{lt});
            }
            ProvaLiteral newLiteral = new ProvaLiteralImpl(pred, ltls);
            newLiterals.add(newLiteral);
            return true;
        }
        return false;
    }

    private ProvaObject getElement(final Object element) {
        return ProvaMapImpl.wrap(element);
    }

}
