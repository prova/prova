package ws.prova.kernel2;

import java.util.List;

public interface ProvaList extends ProvaObject {

	public int computeSize(int offset);

	public ProvaList rebuild(ProvaUnification unification);

	public ProvaObject[] getFixed();

	public ProvaObject getTail();

	public ProvaObject rebuild(ProvaUnification unification, int offset);

	public boolean unify(int offset, ProvaObject target,
			ProvaUnification unification);

	public ProvaList rebuildSource(ProvaUnification unification);

	public ProvaObject rebuildSource(ProvaUnification unification, int offset);

	public boolean isGround();

	public String performative();

	public ProvaList shallowCopy();

	public ProvaObject cloneWithVariables(List<ProvaVariable> variables, int offset);

	public ProvaList copyWithVariables(List<ProvaVariable> variables);

	public ProvaObject cloneWithBoundVariables(List<ProvaVariable> variables, List<Boolean> changed);

	public ProvaList copyWithBoundVariables(List<ProvaVariable> variables, List<Boolean> changed);

}
