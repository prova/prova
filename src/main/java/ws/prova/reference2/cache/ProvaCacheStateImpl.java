package ws.prova.reference2.cache;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ws.prova.kernel2.ProvaConstant;
import ws.prova.kernel2.ProvaGoal;
import ws.prova.kernel2.ProvaList;
import ws.prova.kernel2.ProvaObject;
import ws.prova.kernel2.ProvaVariable;
import ws.prova.kernel2.ProvaVariablePtr;
import ws.prova.kernel2.cache.ProvaCacheState;
import ws.prova.kernel2.cache.ProvaGroundKey;
import ws.prova.reference2.ProvaListImpl;

public class ProvaCacheStateImpl implements ProvaCacheState {

	// No need for this one, really
	private boolean open;
	
	private boolean complete;

	private Map<ProvaCacheAnswerKey,ProvaList> answers;
	
	private List<ProvaGoal> goals;
	
	public ProvaCacheStateImpl() {
		this.open = false;
		this.complete = false;
		this.answers = new HashMap<ProvaCacheAnswerKey,ProvaList>();
		this.goals = new ArrayList<ProvaGoal>();
	}

	@Override
	public List<ProvaGoal> getGoals() {
		return goals;
	}
	
	@Override
	public void setOpen(boolean open) {
		this.open = open;
	}

	@Override
	public void addGoal( ProvaGoal goal ) {
		goals.add(goal);
	}
	
	@Override
	public boolean isOpen() {
		return open;
	}

	public void setComplete(boolean complete) {
		this.complete = complete;
	}

	@Override
	public boolean isComplete() {
		return complete;
	}

	@Override
	/**
	 * Only add new answers
	 */
	public boolean addSolution(ProvaCacheAnswerKey key, ProvaList literalList) {
		ProvaList oldAnswer = answers.get(key);
		if( oldAnswer!=null )
			return false;
		answers.put(key, literalList);
		return true;
	}
	
	@Override
	public ProvaCacheAnswerKey getCacheAnswerKey(ProvaList literalList, List<ProvaVariable> variables) {
		if( literalList==ProvaListImpl.emptyRList )
			return new ProvaCacheAnswerKey(0,null);
		ProvaObject[] fixed = literalList.getFixed();
		final int arity = fixed.length;
		int numBound = 0;
		// Where are the ground terms
		int mask = 0;
		for( int i=0; i<arity; i++ ) {
			ProvaObject o = fixed[i];
			mask <<= 1;
			if( o instanceof ProvaVariablePtr ) {
				ProvaVariablePtr ptr = (ProvaVariablePtr) o;
				ProvaVariable var = variables.get(ptr.getIndex());
				o = var.getAssigned();
			}
			if( o instanceof ProvaConstant ) {
				numBound++;
				mask |= 1;
			} else if( o instanceof ProvaVariable ) {
			} else {
				// TODO: return false?
			}
		}
		final Object[] data = new Object[numBound];
		for( int i=0, j=0; i<arity; i++ ) {
			ProvaObject o = fixed[i];
			if( o instanceof ProvaConstant )
				data[j++] = ((ProvaConstant) o).getObject();
		}
		ProvaCacheAnswerKey key = new ProvaCacheAnswerKey(mask,data);
		return key;
	}
	
	@Override
	public Collection<ProvaList> getSolutions() {
		return answers.values();
	}

	@Override
	public ProvaGoal getGoal() {
		if( goals.size()==0 )
			return null;
		return this.goals.get(goals.size()-1);
	}
	
	public class ProvaCacheAnswerKey {
		
		private int mask;
		
		private ProvaGroundKey groundKey;

		public ProvaCacheAnswerKey(int mask, Object[] data) {
			this.mask = mask;
			this.groundKey = new ProvaGroundKeyImpl(data);
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result
					+ ((groundKey == null) ? 0 : groundKey.hashCode());
			result = prime * result + mask;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			ProvaCacheAnswerKey other = (ProvaCacheAnswerKey) obj;
			if (groundKey == null) {
				if (other.groundKey != null)
					return false;
			} else if (!groundKey.equals(other.groundKey))
				return false;
			if (mask != other.mask)
				return false;
			return true;
		}

	}

	@Override
	/**
	 * Purge the top goal and mark the subgoal completion if the highest level goal is complete
	 */
	public void markCompletion() {
		goals.remove(goals.size()-1);
		if( goals.size()==0 ) {
			// It is now open and complete
			complete = true;
		}
	}

}
