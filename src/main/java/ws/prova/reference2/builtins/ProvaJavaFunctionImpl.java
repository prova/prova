package ws.prova.reference2.builtins;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.MethodUtils;

import ws.prova.agent2.ProvaReagent;
import ws.prova.kernel2.ProvaConstant;
import ws.prova.kernel2.ProvaDerivationNode;
import ws.prova.kernel2.ProvaGoal;
import ws.prova.kernel2.ProvaKnowledgeBase;
import ws.prova.kernel2.ProvaList;
import ws.prova.kernel2.ProvaLiteral;
import ws.prova.kernel2.ProvaObject;
import ws.prova.kernel2.ProvaRule;
import ws.prova.kernel2.ProvaVariable;
import ws.prova.kernel2.ProvaVariablePtr;
import ws.prova.reference2.ProvaConstantImpl;
import ws.prova.reference2.ProvaMapImpl;

public class ProvaJavaFunctionImpl extends ProvaBuiltinImpl {

	public ProvaJavaFunctionImpl(ProvaKnowledgeBase kb) {
		super(kb, "fcalc");
	}

	@Override
	public boolean process(ProvaReagent prova, ProvaDerivationNode node,
			ProvaGoal goal, List<ProvaLiteral> newLiterals, ProvaRule query) {
		ProvaLiteral literal = goal.getGoal();
		List<ProvaVariable> variables = query.getVariables();
		ProvaList terms = literal.getTerms();
		ProvaObject[] data = terms.getFixed();
		if( data.length!=5 )
				return false;
		if( !(data[1] instanceof ProvaConstant) || !(data[3] instanceof ProvaConstant) || !(data[4] instanceof ProvaList)) {
			return false;
		}
		ProvaObject lt = data[0];
		if( lt instanceof ProvaVariablePtr ) {
			ProvaVariablePtr varPtr = (ProvaVariablePtr) lt;
			lt = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
		}
		if( !(lt instanceof ProvaVariable) && !(lt instanceof ProvaConstant)) {
			return false;
		}
		String type = (String) ((ProvaConstant) data[1]).getObject();
		ProvaList argsList = (ProvaList) data[4];
		// TODO: deal with the list tail
		String method = (String) ((ProvaConstant) data[3]).getObject();
		List<Object> args = new ArrayList<Object>();
		for( ProvaObject argObject : argsList.getFixed() ) {
			if( argObject instanceof ProvaVariablePtr ) {
				ProvaVariablePtr varPtr = (ProvaVariablePtr) argObject;
				argObject = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
			}
			if( argObject instanceof ProvaMapImpl ) {
				final ProvaMapImpl map = (ProvaMapImpl) ((ProvaMapImpl) argObject).cloneWithVariables(variables);
				args.add( map.getObject() );
			} else if( argObject instanceof ProvaConstant ) {
				args.add(((ProvaConstant) argObject).getObject());
			} else {
				args.add(argObject);
			}
		}
		Object ret = null;
		if( type.equals("s") ) {
			// A static call
			ProvaConstant classRef = (ProvaConstant) data[2];
			if( !(classRef.getObject() instanceof Class<?>) )
				return false;
			Class<?> targetClass = (Class<?>) classRef.getObject();
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
				throw new RuntimeException(e.getCause());
			}
		} else {
			// An instance call
			ProvaObject target = data[2];
			if( target instanceof ProvaVariablePtr ) {
				ProvaVariablePtr varPtr = (ProvaVariablePtr) target;
				target = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
			}
			if( target instanceof ProvaConstant ) {
				Object oTarget = ((ProvaConstant) target).getObject();
				try {
					ret = MethodUtils.invokeMethod(oTarget,method,args.toArray());
				} catch (NoSuchMethodException e) {
					throw new RuntimeException(e);
				} catch (IllegalAccessException e) {
					throw new RuntimeException(e);
				} catch (InvocationTargetException e) {
					throw new RuntimeException(e.getCause());
				}
			}
		}
		if( lt instanceof ProvaVariable ) {
			((ProvaVariable) lt).setAssigned( ProvaConstantImpl.create(ret) );
		} else if( lt instanceof ProvaConstant ) {
			// TODO: deal with constants that wrap Java collections
			return ((ProvaConstant) lt).getObject().equals(ret);
		} else if( lt instanceof ProvaList ) {
			// TODO: not implemented
		} else
			return false;
		return true;
	}

}
