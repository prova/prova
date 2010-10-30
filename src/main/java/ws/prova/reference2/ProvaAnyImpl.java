package ws.prova.reference2;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import ws.prova.kernel2.ProvaComputable;
import ws.prova.kernel2.ProvaConstant;
import ws.prova.kernel2.ProvaList;
import ws.prova.kernel2.ProvaObject;
import ws.prova.kernel2.ProvaUnification;
import ws.prova.kernel2.ProvaVariable;
import ws.prova.kernel2.ProvaVariablePtr;

public class ProvaAnyImpl extends ProvaTermImpl implements ProvaConstant, ProvaComputable {

	public static ProvaAnyImpl create() {
		return new ProvaAnyImpl();
	}

	@Override
	public void setObject(Object object) {
	}

	@Override
	public Object getObject() {
		return null;
	}

	@Override
	public ProvaObject getRecursivelyAssigned() {
		return this;
	}

	@Override
	public int collectVariables(long ruleId, List<ProvaVariable> variables) {
		return -1;
	}

	@Override
	public int computeSize() {
		return 1;
	}

	@Override
	public boolean unify(ProvaObject target, ProvaUnification unification) {
		return true;
	}

	public String toString() {
		return "_";
	}

	@Override
	public void substituteVariables( ProvaVariablePtr[] varsMap) {
	}

	@Override
	public boolean isGround() {
		return true;
	}

	@Override
	public String toString(List<ProvaVariable> variables) {
		return "_";
	}

	@Override
	public ProvaObject cloneWithVariables(List<ProvaVariable> variables) {
		return this;
	}

	@Override
	public ProvaObject cloneWithVariables(long ruleId, List<ProvaVariable> variables) {
		return this;
	}

	@Override
	public Number compute() {
		return null;
	}

	@Override
	public Object computeIfExpression() {
		return null;
	}

	@Override
	public boolean matched(ProvaConstant target) {
		return true;
	}

}

