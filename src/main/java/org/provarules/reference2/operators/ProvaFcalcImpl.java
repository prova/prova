package org.provarules.reference2.operators;

import org.apache.commons.beanutils.MethodUtils;
import org.provarules.kernel2.ProvaConstant;
import org.provarules.kernel2.ProvaList;
import org.provarules.kernel2.ProvaObject;
import org.provarules.reference2.ProvaConstantImpl;
import org.provarules.reference2.ProvaMapImpl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class ProvaFcalcImpl implements ProvaOperator {

    private String type;

    private String method;

    ProvaFcalcImpl(String type, String method) {
        this.type = type;
        this.method = method;
    }

    @SuppressWarnings("unchecked")
    @Override
    public Object evaluate(Object... na) {
        final ProvaList argsList = (ProvaList) na[1];
        final List<Object> args = new ArrayList<>();
        boolean provaMapPresent = false;
        for (final ProvaObject po : argsList.getFixed()) {
            // We detect when ProvaMapImpl is passed
            //   to the Java external functions and unwrap it
            // However, if the return object is a Java Map, in this case, we
            //   wrap it back as a ProvaMapImpl
            if (po instanceof ProvaMapImpl) {
                args.add(((ProvaMapImpl) po).unwrap());
                provaMapPresent = true;
                continue;
            } else if (po instanceof ProvaConstantImpl) {
                args.add(((ProvaConstant) po).getObject());
                continue;
            }
            args.add(po);
        }
        Object ret;
        if (type.equals("s")) {
            // A static call
            Class<?> targetClass = (Class<?>) na[0];
            try {
                ret = MethodUtils.invokeStaticMethod(targetClass, method, args.toArray());
            } catch (SecurityException | NoSuchMethodException | IllegalArgumentException | IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
            if (provaMapPresent && ret instanceof Map)
                return ProvaMapImpl.wrapValues((Map<String, Object>) ret);
            return ret;
        } else {
            // An instance call
            Object oTarget = na[0];
            try {
                ret = MethodUtils.invokeMethod(oTarget, method, args.toArray());
            } catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
            if (provaMapPresent && ret instanceof Map)
                return ProvaMapImpl.wrapValues((Map<String, Object>) ret);
            return ret;
        }
    }

    public String toString() {
        return "f";
    }
}
