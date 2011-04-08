package ws.prova.reference2.cache;

import java.util.List;

import ws.prova.kernel2.ProvaGoal;
import ws.prova.kernel2.ProvaList;
import ws.prova.kernel2.ProvaLiteral;
import ws.prova.kernel2.ProvaObject;
import ws.prova.kernel2.ProvaPredicate;
import ws.prova.kernel2.ProvaUnification;
import ws.prova.kernel2.ProvaVariable;
import ws.prova.kernel2.cache.ProvaCacheState;
import ws.prova.kernel2.cache.ProvaCachedLiteral;
import ws.prova.kernel2.cache.ProvaLocalAnswers;
import ws.prova.reference2.ProvaListImpl;
import ws.prova.reference2.ProvaLiteralImpl;
import ws.prova.reference2.ProvaVariableImpl;

public class ProvaCachedLiteralImpl extends ProvaLiteralImpl implements ProvaCachedLiteral {

	private static final long serialVersionUID = -4320866097994244461L;

	private ProvaGoal goal;
	
	private ProvaCacheState cacheState;

	private ProvaLocalAnswers answers;
	
	public ProvaCachedLiteralImpl(ProvaPredicate predicate, ProvaList terms,
			ProvaCacheState cacheState, ProvaLocalAnswers answers) {
		super(predicate,terms);
		this.cacheState = cacheState;
		this.answers = answers;
	}

	@Override
	public ProvaLiteral rebuildSource(ProvaUnification unification) {
		if( ground || terms==null )
			return this;
		ProvaList newTerms = terms.rebuildSource(unification);
		ProvaCachedLiteralImpl cachedLit = new ProvaCachedLiteralImpl(predicate, newTerms, cacheState, answers);
		cachedLit.setGoal(goal);
		return cachedLit;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder(predicate.getSymbol());
		sb.append('(');
		sb.append(terms);
		sb.append(')');
		return sb.toString();
	}

	@Override
	public ProvaObject cloneWithVariables(List<ProvaVariable> variables) {
		if( terms==null )
			return this;
		if( predicate.getSymbol().equals("cut") ) {
			ProvaVariable any1 = kb.generateVariable("");
			ProvaList lany1 = ProvaListImpl.create( new ProvaObject[] {any1});
			return new ProvaLiteralImpl(predicate,lany1);
		}
		ProvaList newTerms = (ProvaList) terms.cloneWithVariables(variables);
		ProvaCachedLiteralImpl newLit = new ProvaCachedLiteralImpl(predicate,newTerms,cacheState,answers);
		newLit.ground = ground;
		newLit.line = line;
		newLit.sourceCode = sourceCode;
		newLit.metadata = metadata;
		newLit.goal = goal;
		return newLit;
	}

	@Override
	public void setGoal(ProvaGoal goal) {
		this.goal = goal;
		if( cacheState!=null ) {
			cacheState.addGoal(goal);
		}
	}

	@Override
	public ProvaGoal getGoal() {
		return this.goal;
	}
	
	@Override
	public ProvaCacheState getCacheState() {
		return cacheState;
	}

	@Override
	public ProvaLocalAnswers getAnswers() {
		return answers;
	}

	@Override
	public void markCompletion() {
		cacheState.markCompletion();
	}

}
