package org.provarules.reference2.builtins;

import org.apache.commons.beanutils.MethodUtils;
import org.provarules.agent2.ProvaReagent;
import org.provarules.kernel2.*;
import org.provarules.reference2.ProvaMapImpl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class ProvaJavaPredicateImpl extends ProvaBuiltinImpl {

    public ProvaJavaPredicateImpl(ProvaKnowledgeBase kb) {
        super(kb, "pcalc");
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
        ProvaObject target = data[0];
        if (data[0] instanceof ProvaVariablePtr) {
            ProvaVariablePtr varPtr = (ProvaVariablePtr) data[0];
            target = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
        }
        if (!(target instanceof ProvaConstant) || !(data[1] instanceof ProvaConstant) || !(data[2] instanceof ProvaList)) {
            return false;
        }
        Object methodObject = ((ProvaConstant) data[1]).getObject();
        if (!(methodObject instanceof String))
            return false;
        String method = (String) methodObject;
        ProvaList argsList = (ProvaList) data[2];
        List<Object> args = new ArrayList<>();
        // TODO: deal with the list tail
        for (ProvaObject argObject : argsList.getFixed()) {
            if (argObject instanceof ProvaVariablePtr) {
                ProvaVariablePtr varPtr = (ProvaVariablePtr) argObject;
                argObject = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
            }
            if (argObject instanceof ProvaMapImpl) {
                // We detect when ProvaMapImpl is passed
                //   to the Java external functions and unwrap it
                args.add(((ProvaMapImpl) argObject).unwrap());
            } else if (argObject instanceof ProvaConstant) {
                args.add(((ProvaConstant) argObject).getObject());
            } else {
                args.add(argObject);
            }
        }
        Object rc;
        try {
            Object targetObject = ((ProvaConstant) target).getObject();
            if (targetObject instanceof Class<?>)
                rc = MethodUtils.invokeStaticMethod((Class<?>) targetObject, method, args.toArray());
            else
                rc = MethodUtils.invokeMethod(((ProvaConstant) target).getObject(), method, args.toArray());
        } catch (SecurityException | NoSuchMethodException | IllegalArgumentException | IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e.getCause());
        }
        return rc instanceof Boolean ? (Boolean) rc : true;
    }

}
