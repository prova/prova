package ws.prova.reference2.operators;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.MethodUtils;

import ws.prova.kernel2.ProvaConstant;
import ws.prova.kernel2.ProvaList;
import ws.prova.kernel2.ProvaObject;

public class ProvaFcalcImpl implements ProvaOperator {

	private String type;
	
	private String method;
	
	public ProvaFcalcImpl(String type, String method) {
		this.type = type;
		this.method = method;
	}

	@Override
	public Object evaluate(Object... na) {
		ProvaList argsList = (ProvaList) na[1];
		List<Object> args = new ArrayList<Object>();
		for( ProvaObject po : argsList.getFixed() ) {
//			if( po instanceof ProvaVariablePtr ) {
//				ProvaVariablePtr varPtr = (ProvaVariablePtr) po;
//				po = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
//			} else if( !(po instanceof ProvaConstant) )
//				return false;
			args.add( ((ProvaConstant) po).getObject() );
		}
		Object ret = null;
		if( type.equals("s") ) {
			// A static call
			Class<?> targetClass = (Class<?>) na[0];
			try {
				ret = MethodUtils.invokeStaticMethod(targetClass,method,args.toArray());
			} catch (SecurityException e) {
				throw new RuntimeException(e);
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			} catch (IllegalArgumentException e) {
				throw new RuntimeException(e);
			} catch (IllegalAccessException e) {
				throw new RuntimeException(e);
			} catch (InvocationTargetException e) {
				throw new RuntimeException(e);
			}
			return ret;
		} else {
			// An instance call
			Object oTarget = na[0];
			try {
				return MethodUtils.invokeMethod(oTarget,method,args.toArray());
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			} catch (IllegalAccessException e) {
				throw new RuntimeException(e);
			} catch (InvocationTargetException e) {
				throw new RuntimeException(e);
			}
		}
	}

	public String toString() {
		return "f";
	}
}
