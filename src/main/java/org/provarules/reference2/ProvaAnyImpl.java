package org.provarules.reference2;

import org.provarules.kernel2.*;

import java.util.List;

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
    public void substituteVariables(final ProvaVariablePtr[] varsMap) {
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
    public ProvaObject cloneWithBoundVariables(List<ProvaVariable> variables, List<Boolean> isConstant) {
        return this;
    }

    @Override
    public ProvaObject cloneWithVariables(List<ProvaVariable> variables) {
        return this;
    }

    @Override
    public ProvaObject cloneWithVariables(final long ruleId, final List<ProvaVariable> variables) {
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
    public ProvaObject computeProvaIfExpression() {
        return null;
    }

    @Override
    public boolean matched(ProvaConstant target) {
        return true;
    }

    @Override
    public boolean updateGround(List<ProvaVariable> variables) {
        return false;
    }

}

