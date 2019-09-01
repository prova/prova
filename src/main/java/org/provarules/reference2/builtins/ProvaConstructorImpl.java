package org.provarules.reference2.builtins;

import org.apache.commons.beanutils.ConstructorUtils;
import org.provarules.agent2.ProvaReagent;
import org.provarules.kernel2.*;
import org.provarules.reference2.ProvaConstantImpl;
import org.provarules.reference2.ProvaGlobalConstantImpl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProvaConstructorImpl extends ProvaBuiltinImpl {

    public ProvaConstructorImpl(ProvaKnowledgeBase kb) {
        super(kb, "construct");
    }

    @Override
    public boolean process(ProvaReagent prova, ProvaDerivationNode node,
                           ProvaGoal goal, List<ProvaLiteral> newLiterals, ProvaRule query) {
        ProvaLiteral literal = goal.getGoal();
        List<ProvaVariable> variables = query.getVariables();
        ProvaList terms = (ProvaList) literal.getTerms().cloneWithVariables(variables);
        ProvaObject[] data = terms.getFixed();
        if (data.length != 3)
            return false;
        if (!(data[0] instanceof ProvaConstant) || !(data[2] instanceof ProvaList)) {
            return false;
        }
        ProvaObject lt = data[1];
//		if( lt instanceof ProvaVariablePtr ) {
//			ProvaVariablePtr varPtr = (ProvaVariablePtr) lt;
//			lt = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
//		}
        if (!(lt instanceof ProvaVariable) && !(lt instanceof ProvaConstant)) {
            return false;
        }
        ProvaConstant classRef = (ProvaConstant) data[0];
        if (!(classRef.getObject() instanceof Class<?>))
            return false;
        Class<?> targetClass = (Class<?>) classRef.getObject();
        ProvaList argsList = (ProvaList) data[2];
        List<Object> args = new ArrayList<Object>();
        // TODO: deal with the list tail
        for (ProvaObject argObject : argsList.getFixed()) {
            if (argObject instanceof ProvaVariablePtr) {
                ProvaVariablePtr varPtr = (ProvaVariablePtr) argObject;
                argObject = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
            }
            if (argObject instanceof ProvaConstant) {
                args.add(((ProvaConstant) argObject).getObject());
            } else if (argObject instanceof ProvaList) {
                // Prova lists are converted to Java lists
                ProvaList list = (ProvaList) argObject;
                ProvaObject[] os = list.getFixed();
                Object[] objs = new Object[os.length];
                for (int i = 0; i < os.length; i++) {
                    if (os[i] instanceof ProvaConstant)
                        objs[i] = ((ProvaConstant) os[i]).getObject();
                    else
                        objs[i] = os[i];
                }
                args.add(Arrays.asList(objs));
            } else {
                args.add(argObject);
            }
        }
        try {
            final Object result = ConstructorUtils.invokeConstructor(targetClass, args.toArray());
            if (lt instanceof ProvaVariable)
                ((ProvaVariable) lt).setAssigned(ProvaConstantImpl.create(result));
            else if (lt instanceof ProvaGlobalConstantImpl)
                ((ProvaConstant) lt).setObject(result);
            else
                return ((ProvaConstant) lt).getObject().equals(result);
        } catch (SecurityException | NoSuchMethodException | IllegalArgumentException | IllegalAccessException | InvocationTargetException | InstantiationException e) {
            throw new RuntimeException(e);
        }
        return true;
    }

}
