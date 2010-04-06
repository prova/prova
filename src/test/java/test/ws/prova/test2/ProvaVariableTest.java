package test.ws.prova.test2;

import java.util.Vector;

import org.junit.Test;

import ws.prova.kernel2.ProvaConstant;
import ws.prova.kernel2.ProvaVariable;
import ws.prova.reference2.ProvaConstantImpl;
import ws.prova.reference2.ProvaVariableImpl;

public class ProvaVariableTest {

	@Test
	public void tempVariableIsObjectDefault() {
		ProvaVariable v1 = ProvaVariableImpl.create();
		org.junit.Assert.assertTrue(v1.getName() instanceof Long);
	}

	@Test
	public void assignVariableToConstant() {
		ProvaVariable v1 = ProvaVariableImpl.create("v1");
		ProvaConstant c1 = ProvaConstantImpl.create(12);
		v1.setAssigned(c1);
		ProvaVariable v2 = ProvaVariableImpl.create("v2");
		Vector<ProvaVariable> variables = new Vector<ProvaVariable>();
		v1.collectVariables(0, variables);
		org.junit.Assert.assertEquals(variables.size(),0);
		v2.collectVariables(0, variables);
		org.junit.Assert.assertEquals(variables.size(),1);
	}

}
