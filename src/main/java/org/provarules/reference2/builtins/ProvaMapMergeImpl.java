package org.provarules.reference2.builtins;

import org.provarules.agent2.ProvaReagent;
import org.provarules.kernel2.*;
import org.provarules.reference2.*;

import java.util.*;

public class ProvaMapMergeImpl extends ProvaBuiltinImpl {

    public ProvaMapMergeImpl(ProvaKnowledgeBase kb) {
        super(kb, "map_merge");
    }

    /**
     * Merge two lists and produce a third. Fail if there are conflicting values
     * for the same key in both input lists.
     */
    @SuppressWarnings("unchecked")
    @Override
    public boolean process(ProvaReagent prova, ProvaDerivationNode node,
                           ProvaGoal goal, List<ProvaLiteral> newLiterals, ProvaRule query) {
        ProvaLiteral literal = goal.getGoal();
        List<ProvaVariable> variables = query.getVariables();
        ProvaList terms = literal.getTerms();
        ProvaObject[] data = terms.getFixed();
        if (data.length != 2)
            return false;
        ProvaObject a1 = data[0];
        if (a1 instanceof ProvaVariablePtr) {
            ProvaVariablePtr varPtr = (ProvaVariablePtr) a1;
            a1 = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
        }
        ProvaList args = (ProvaList) a1;
        ProvaObject[] fixed = args.getFixed();
        ProvaObject[] m = new ProvaObject[3];
        if (fixed.length == 3) {
            // Signature map_merge MapIn KeysList ValuesList : MapOut
            for (int k = 0; k < 3; k++) {
                m[k] = fixed[k];
                if (m[k] instanceof ProvaVariablePtr) {
                    ProvaVariablePtr varPtr = (ProvaVariablePtr) m[k];
                    m[k] = variables.get(varPtr.getIndex())
                            .getRecursivelyAssigned();
                }
            }
            if (!(m[0] instanceof ProvaMapImpl))
                return false;
            if (!(m[1] instanceof ProvaList))
                return false;
            if (!(m[2] instanceof ProvaList))
                return false;
            Map<String, ProvaObject> in = (Map<String, ProvaObject>) ((ProvaMapImpl) m[0]).getObject();
            final ProvaList valuesList = (ProvaList) m[2];
            final Set<String> inKeys = in.keySet();
            final ProvaList keysList = (ProvaList) m[1];
            final Set<String> keys = new HashSet<>(inKeys);
            final Map<String, ProvaObject> supplied = new HashMap<>();
            for (int i = 0; i < keysList.getFixed().length; i++) {
                supplied.put(keysList.getFixed()[i].toString(), valuesList.getFixed()[i]);
            }
            keys.retainAll(supplied.keySet());
            if (keys.isEmpty()) {
                final Map<String, ProvaObject> md = new HashMap<>(in);
                for (int n = 0; n < keysList.getFixed().length; n++) {
                    ProvaObject okey = keysList.getFixed()[n];
                    if (!(okey instanceof ProvaConstant))
                        return false;
                    ProvaObject ovalue = valuesList.getFixed()[n];
                    md.put(okey.toString(), ovalue);
                }
                ProvaObject a2 = data[1];
                if (a2 instanceof ProvaVariablePtr) {
                    ProvaVariablePtr varPtr = (ProvaVariablePtr) a2;
                    a2 = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
                }
                if (a2 instanceof ProvaVariable) {
                    ((ProvaVariable) a2).setAssigned(ProvaMapImpl.wrap(md));
                    return true;
                }
                if (!(a2 instanceof ProvaMapImpl))
                    return false;
                final Map<String, ProvaObject> mc = (Map<String, ProvaObject>) ((ProvaMapImpl) a2)
                        .getObject();
                if (!mc.keySet().equals(md.keySet()))
                    return false;
                // Set up proper unification for values
                final ProvaObject[] vals1 = new ProvaObject[mc.size()];
                final ProvaObject[] vals2 = new ProvaObject[mc.size()];
                int i = 0;
                for (String key : mc.keySet()) {
                    vals1[i] = mc.get(key);
                    vals2[i++] = md.get(key);
                }
                final ProvaPredicate pred = new ProvaPredicateImpl("", 1, kb);
                final ProvaLiteral lit = new ProvaLiteralImpl(pred,
                        ProvaListImpl.create(vals1));
                final ProvaRule clause = ProvaRuleImpl.createVirtualRule(1, lit,
                        null);
                pred.addClause(clause);
                final ProvaLiteral newLiteral = new ProvaLiteralImpl(pred,
                        ProvaListImpl.create(vals2));
                newLiterals.add(newLiteral);
                return true;
            }
            // There are common keys in the set 'keys':
            // ensure they match in both sets
            final ProvaObject[] vals1 = new ProvaObject[keys.size()];
            final ProvaObject[] vals2 = new ProvaObject[keys.size()];
            final ProvaObject[] keysArray = new ProvaObject[keys.size()];
            int i = 0;
            for (String key : keys) {
                keysArray[i] = ProvaConstantImpl.wrap(key);
                ProvaObject oa = in.get(key);
                vals1[i] = oa;
                ProvaObject ob = supplied.get(key);
                vals2[i] = ob;
                i++;
            }
            final ProvaPredicate pred = new ProvaPredicateImpl("", 1, kb);
            final ProvaLiteral lit = new ProvaLiteralImpl(pred,
                    ProvaListImpl.create(vals1));
            final ProvaRule clause = ProvaRuleImpl.createVirtualRule(1, lit, null);
            pred.addClause(clause);
            final ProvaList vals2list = ProvaListImpl.create(vals2);
            ProvaLiteral newLiteral = new ProvaLiteralImpl(pred, vals2list);
            newLiterals.add(newLiteral);

            // First part of the result
            final Map<String, ProvaObject> md = new HashMap<>();
            for (String key : in.keySet()) {
                if (!keys.contains(key))
                    md.put(key, in.get(key));
            }
            for (String key : supplied.keySet()) {
                if (!keys.contains(key))
                    md.put(key, supplied.get(key));
            }
            ProvaList newArray = ProvaListImpl.create(new ProvaObject[]{
                    ProvaMapImpl.wrap(md), ProvaListImpl.create(keysArray),
                    vals2list});
            ProvaList newArgs = ProvaListImpl.create(new ProvaObject[]{newArray,
                    data[1]});
            newLiteral = kb.generateLiteral("map_merge", newArgs);
            newLiterals.add(newLiteral);
            return true;
        }
        if (fixed.length != 2)
            return false;
        ProvaObject m1 = fixed[0];
        if (m1 instanceof ProvaVariablePtr) {
            ProvaVariablePtr varPtr = (ProvaVariablePtr) m1;
            m1 = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
        }
        if (!(m1 instanceof ProvaMapImpl))
            return false;
        ProvaObject m2 = fixed[1];
        if (m2 instanceof ProvaVariablePtr) {
            ProvaVariablePtr varPtr = (ProvaVariablePtr) m2;
            m2 = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
        }
        if (!(m2 instanceof ProvaMapImpl))
            return false;
        ProvaObject a2 = data[1];
        if (a2 instanceof ProvaVariablePtr) {
            ProvaVariablePtr varPtr = (ProvaVariablePtr) a2;
            a2 = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
        }
        final Map<String, ProvaObject> ma = (Map<String, ProvaObject>) ((ProvaMapImpl) m1)
                .getObject();
        final Map<String, ProvaObject> mb = (Map<String, ProvaObject>) ((ProvaMapImpl) m2)
                .getObject();
        final Set<String> keys = new HashSet<>(ma.keySet());
        final Set<String> keysb = mb.keySet();
        keys.retainAll(keysb);
        if (keys.isEmpty()) {
            // There are no common keys between the two input maps
            final Map<String, ProvaObject> md = new HashMap<>();
            md.putAll(ma);
            md.putAll(mb);
            if (a2 instanceof ProvaVariable) {
                ((ProvaVariable) a2).setAssigned(ProvaMapImpl.wrap(md));
                return true;
            }
            if (!(a2 instanceof ProvaMapImpl))
                return false;
            final Map<String, ProvaObject> mc = (Map<String, ProvaObject>) ((ProvaMapImpl) a2)
                    .getObject();
            if (!mc.keySet().equals(md.keySet()))
                return false;
            // Set up proper unification for values
            final ProvaObject[] vals1 = new ProvaObject[mc.size()];
            final ProvaObject[] vals2 = new ProvaObject[mc.size()];
            int i = 0;
            for (String key : mc.keySet()) {
                vals1[i] = mc.get(key);
                vals2[i++] = md.get(key);
            }
            final ProvaPredicate pred = new ProvaPredicateImpl("", 1, kb);
            final ProvaLiteral lit = new ProvaLiteralImpl(pred,
                    ProvaListImpl.create(vals1));
            final ProvaRule clause = ProvaRuleImpl.createVirtualRule(1, lit,
                    null);
            pred.addClause(clause);
            final ProvaLiteral newLiteral = new ProvaLiteralImpl(pred,
                    ProvaListImpl.create(vals2));
            newLiterals.add(newLiteral);
            return true;
        }

        // There are common keys in the set 'keys':
        // ensure they match in both sets
        final ProvaObject[] vals1 = new ProvaObject[keys.size()];
        final ProvaObject[] vals2 = new ProvaObject[keys.size()];
        final ProvaObject[] keysArray = new ProvaObject[keys.size()];
        int i = 0;
        for (String key : keys) {
            keysArray[i] = ProvaConstantImpl.wrap(key);
            ProvaObject oa = ma.get(key);
            vals1[i] = oa;
            ProvaObject ob = mb.get(key);
            vals2[i++] = ob;
        }
        final ProvaPredicate pred = new ProvaPredicateImpl("", 1, kb);
        final ProvaLiteral lit = new ProvaLiteralImpl(pred,
                ProvaListImpl.create(vals1));
        final ProvaRule clause = ProvaRuleImpl.createVirtualRule(1, lit, null);
        pred.addClause(clause);
        final ProvaList vals2list = ProvaListImpl.create(vals2);
        ProvaLiteral newLiteral = new ProvaLiteralImpl(pred, vals2list);
        newLiterals.add(newLiteral);

        // First part of the result
        final Map<String, ProvaObject> md = new HashMap<>();
        for (String key : ma.keySet()) {
            if (!keys.contains(key))
                md.put(key, ma.get(key));
        }
        for (String key : mb.keySet()) {
            if (!keys.contains(key))
                md.put(key, mb.get(key));
        }
        ProvaList newArray = ProvaListImpl.create(new ProvaObject[]{
                ProvaMapImpl.wrap(md), ProvaListImpl.create(keysArray),
                vals2list});
        ProvaList newArgs = ProvaListImpl.create(new ProvaObject[]{newArray,
                data[1]});
        newLiteral = kb.generateLiteral("map_merge", newArgs);
        newLiterals.add(newLiteral);
        return true;
    }

}
