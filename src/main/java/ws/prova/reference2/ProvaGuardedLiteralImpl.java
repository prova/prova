package ws.prova.reference2;

import java.util.ArrayList;
import java.util.List;

import ws.prova.kernel2.ProvaList;
import ws.prova.kernel2.ProvaLiteral;
import ws.prova.kernel2.ProvaObject;
import ws.prova.kernel2.ProvaPredicate;
import ws.prova.kernel2.ProvaUnification;
import ws.prova.kernel2.ProvaVariable;
import ws.prova.kernel2.ProvaVariablePtr;

public class ProvaGuardedLiteralImpl extends ProvaLiteralImpl implements
		ProvaLiteral {

	private static final long serialVersionUID = -3967549869751321929L;

	private List<ProvaLiteral> guard;
	
	public ProvaGuardedLiteralImpl(ProvaPredicate pred, ProvaList terms,
			List<ProvaLiteral> guard) {
		super(pred,terms);
		this.guard = guard;
	}

	@Override
	public List<ProvaLiteral> getGuard() {
		return guard;
	}
	
	@Override
	public int collectVariables(long ruleId, List<ProvaVariable> variables) {
		if( ground || terms==null )
			return -1;
		ground &= terms.collectVariables(ruleId, variables)<0;
		for( ProvaLiteral g : guard ) {
			ground &= g.collectVariables(ruleId, variables)<0;
		}
		return ground ? -1 : 0;
	}

	@Override
	public void substituteVariables(ProvaVariablePtr[] varsMap) {
		super.substituteVariables(varsMap);
		for( ProvaLiteral g : guard ) {
			g.substituteVariables(varsMap);
		}
	}

	@Override
	public ProvaLiteral rebuild(ProvaUnification unification) {
		if( ground || terms==null )
			return this;
		ProvaList newTerms = terms.rebuild(unification);
		List<ProvaLiteral> newGuard = new ArrayList<ProvaLiteral>(guard.size());
		for( ProvaLiteral g : guard )
			newGuard.add(g.rebuild(unification));
		final ProvaGuardedLiteralImpl ret = new ProvaGuardedLiteralImpl(predicate, newTerms, newGuard);
		ret.sourceCode = this.sourceCode;
		ret.line = this.line;
		if( this.metadata!=null )
			copyMetadata(unification, ret);
		return ret;
	}

	@Override
	public ProvaLiteral rebuildSource(ProvaUnification unification) {
		if( ground )
			return this;
		List<ProvaLiteral> newGuard = new ArrayList<ProvaLiteral>(guard.size());
		for( ProvaLiteral g : guard )
			newGuard.add(g.rebuildSource(unification));
		ProvaList newTerms = terms;
		if( terms!=null )
			newTerms = terms.rebuildSource(unification);
		return new ProvaGuardedLiteralImpl(predicate, newTerms, newGuard);
	}

	@Override
	public ProvaObject cloneWithVariables(List<ProvaVariable> variables) {
		if( predicate.getSymbol().equals("cut") ) {
			ProvaVariable any1 = ProvaVariableImpl.create();
			ProvaList lany1 = ProvaListImpl.create( new ProvaObject[] {any1});
			return new ProvaLiteralImpl(predicate,lany1);
		}
		ProvaList newTerms = terms;
		if( terms!=null )
			newTerms = (ProvaList) terms.cloneWithVariables(variables);
		List<ProvaLiteral> newGuard = new ArrayList<ProvaLiteral>(guard.size());
		for( ProvaLiteral g : guard )
			newGuard.add((ProvaLiteral) g.cloneWithVariables(variables));
		ProvaGuardedLiteralImpl newLit = new ProvaGuardedLiteralImpl(predicate,newTerms,newGuard);
		newLit.ground = ground;
		newLit.line = line;
		newLit.sourceCode = sourceCode;
		newLit.metadata = metadata;
		return newLit;
	}

	@Override
	public ProvaObject cloneWithVariables(long ruleId, List<ProvaVariable> variables) {
		if( predicate.getSymbol().equals("cut") ) {
			ProvaVariable any1 = ProvaVariableImpl.create();
			ProvaList lany1 = ProvaListImpl.create( new ProvaObject[] {any1});
			return new ProvaLiteralImpl(predicate,lany1);
		}
		ProvaList newTerms = terms;
		if( terms!=null )
			newTerms = (ProvaList) terms.cloneWithVariables(ruleId,variables);
		List<ProvaLiteral> newGuard = new ArrayList<ProvaLiteral>(guard.size());
		for( ProvaLiteral g : guard )
			newGuard.add((ProvaLiteral) g.cloneWithVariables(ruleId,variables));
		ProvaGuardedLiteralImpl newLit = new ProvaGuardedLiteralImpl(predicate,newTerms,newGuard);
		newLit.ground = ground;
		newLit.line = line;
		newLit.sourceCode = sourceCode;
		newLit.metadata = metadata;
		return newLit;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder(predicate.getSymbol());
		sb.append('(');
		sb.append(terms);
		sb.append(") [");
		sb.append(guard);
		sb.append(']');
		return sb.toString();
	}

}