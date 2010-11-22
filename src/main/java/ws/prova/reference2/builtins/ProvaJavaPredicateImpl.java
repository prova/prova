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

public class ProvaJavaPredicateImpl extends ProvaBuiltinImpl {

	public ProvaJavaPredicateImpl(ProvaKnowledgeBase kb) {
		super(kb, "pcalc");
	}

	@Override
	public boolean process(ProvaReagent prova, ProvaDerivationNode node,
			ProvaGoal goal, List<ProvaLiteral> newLiterals, ProvaRule query) {
		ProvaLiteral literal = goal.getGoal();
		List<ProvaVariable> variables = query.getVariables();
		ProvaList terms = (ProvaList) literal.getTerms();
		ProvaObject[] data = terms.getFixed();
		if( data.length!=3 )
			return false;
		ProvaObject target = data[0];
		if( data[0] instanceof ProvaVariablePtr ) {
			ProvaVariablePtr varPtr = (ProvaVariablePtr) data[0];
			target = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
		}
		if( !(target instanceof ProvaConstant) || !(data[1] instanceof ProvaConstant) || !(data[2] instanceof ProvaList) ) {
			return false;
		}
		Object methodObject = ((ProvaConstant) data[1]).getObject();
		if( !(methodObject instanceof String) )
			return false;
		String method = (String) methodObject;
		ProvaList argsList = (ProvaList) data[2];
		List<Object> args = new ArrayList<Object>();
		// TODO: deal with the list tail
		for( ProvaObject argObject : argsList.getFixed() ) {
			if( argObject instanceof ProvaVariablePtr ) {
				ProvaVariablePtr varPtr = (ProvaVariablePtr) argObject;
				argObject = variables.get(varPtr.getIndex()).getRecursivelyAssigned();
			}
			if( argObject instanceof ProvaConstant ) {
				args.add(((ProvaConstant) argObject).getObject());
			} else {
				args.add(argObject);
			}
		}
		Object rc = null;
		try {
			Object targetObject = ((ProvaConstant) target).getObject();
			if( targetObject instanceof Class<?> )
				rc = MethodUtils.invokeStaticMethod((Class<?>) targetObject,method,args.toArray());
			else
				rc = MethodUtils.invokeMethod(((ProvaConstant) target).getObject(),method,args.toArray());
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
		return rc instanceof Boolean ? (Boolean) rc : true;
	}

	@Override
	public int getArity() {
		return 3;
	}

}
