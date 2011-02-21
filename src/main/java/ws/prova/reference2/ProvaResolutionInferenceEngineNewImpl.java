package ws.prova.reference2;

import java.util.ArrayList;



import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Stack;

import org.apache.log4j.Logger;

import ws.prova.kernel2.ProvaVariable;
import ws.prova.agent2.ProvaReagent;
import ws.prova.kernel2.ProvaBuiltin;
import ws.prova.kernel2.ProvaConstant;
import ws.prova.kernel2.ProvaDerivationNode;
import ws.prova.kernel2.ProvaGoal;
import ws.prova.kernel2.ProvaKnowledgeBase;
import ws.prova.kernel2.ProvaLiteral;
import ws.prova.kernel2.ProvaObject;
import ws.prova.kernel2.ProvaPredicate;
import ws.prova.kernel2.ProvaResolutionInferenceEngine;
import ws.prova.kernel2.ProvaRule;
import ws.prova.kernel2.ProvaUnification;
import ws.prova.kernel2.ProvaVariablePtr;
import ws.prova.reference2.builtins.ProvaFailImpl;
import ws.prova.reference2.messaging.ProvaDelayedCommand;
import ws.prova.reference2.messaging.ProvaMessengerImpl;
import ws.prova.kernel2.ProvaList;

public class ProvaResolutionInferenceEngineNewImpl implements ProvaResolutionInferenceEngine {

	private final static Logger log = Logger.getLogger("prova");
	public static ThreadLocal<List<ProvaDelayedCommand>> delayedCommands = new ThreadLocal<List<ProvaDelayedCommand>>();
	private ProvaReagent prova;


	private ProvaRule query;
	
	private class GoalWithMap
	{
		public final ProvaLiteral goal;
		public final HashMap<ProvaVariable,Object> map;
		
		public GoalWithMap(ProvaLiteral goal, HashMap<ProvaVariable,Object> map)
		{
			this.goal=goal;
			this.map=map;
		}
	}
	
	private Stack<ProvaLiteral> goalStack;
	
	public ProvaResolutionInferenceEngineNewImpl( ProvaKnowledgeBase kb, ProvaRule query ) {
    	this.query=query;
    	goalStack= new Stack<ProvaLiteral>();
    	addGoalsToStack(query.getBody());
    }
		
	
	private void addGoalsToStack(ProvaLiteral[] newGoals)
	{
		for(int i=newGoals.length-1;i>=0;--i)
			goalStack.push(newGoals[i]);
	}

    @Override
	public ProvaDerivationNode run() {
    	// This might be set if it is a nested resolution run, for example, from consult()
		List<ProvaDelayedCommand> delayed0 = delayedCommands.get();
    	try {
			if( delayed0==null ) {
				final ArrayList<ProvaDelayedCommand> delayed = new ArrayList<ProvaDelayedCommand>();
				delayedCommands.set(delayed);
			}
    		return _run();
    	} finally {
			if (delayedCommands != null) {
				List<ProvaDelayedCommand> delayed = delayedCommands.get();
				for( Iterator<ProvaDelayedCommand> iter = delayed.iterator(); iter.hasNext(); ) {
					ProvaDelayedCommand message = iter.next();
					iter.remove();
					message.process(prova);
				}
				if( delayed0==null )
					delayedCommands.remove();
			}
			ProvaMessengerImpl.cleanupThreadlocals();
    	}
	}
    
    private int assignmentDepth=0;
    
    public ProvaDerivationNode _run()
    {
    	System.err.println("NewImpl!");
 
    	ProvaLiteral goal=goalStack.pop();
   		
    	// TODO: metadata ???
    	if( goal.getPredicate() instanceof ProvaBuiltin)
    	{
    		List<ProvaLiteral> newLiterals = new ArrayList<ProvaLiteral>();
    		if(((ProvaBuiltin)goal.getPredicate()).process_(prova,null,null,newLiterals,query))
    		{
    			addGoalsToStack((ProvaLiteral[])newLiterals.toArray());
    			_run();
    		}
    	}
    	// TODO: cut  ???
    		
    	// TODO: synchronize kb??
    	for(ProvaRule targetRule: goal.getPredicate().getClauseSet().getClauses())
    	{
    		if(!goal.getPredicate().equals(targetRule.getHead().getPredicate())) // necessary???
				continue;
    		ProvaRule targetRuleCopy=targetRule.cloneRule();
    		if(!unify(goal.getTerms().getFixed(), targetRule.getHead().getTerms().getFixed()))
    			continue;
    		if(targetRule.getBody()!=null)
    			addGoalsToStack(targetRule.getBody());
    		if(!goalStack.isEmpty()) 
    			_run();
    	}
    	return null;
    }

    boolean unify(Object[] goalTerms, Object[] targetTerms, HashMap<ProvaVariable, Object> map)
    {
    	if(goalTerms.length!=targetTerms.length)
    		System.err.println("unequal term list length: this is impossible to happen.");

    	HashMap<ProvaVariable,Object> newlyAssigned = new HashMap<ProvaVariable,Object>();

    	for(int i=0;i<goalTerms.length;++i)
    	{
    		Object goalTerm = goalTerms[i],
    		     targetTerm = targetTerms[i];
    		
    		if(targetTerms[i] instanceof ProvaVariable)
    		{	
    			Object ass=map.get((ProvaVariable)targetTerms[i]);
    			if(ass!=null)
    				targetTerm=ass;
    		}
    		
    		if(goalTerms[i] instanceof ProvaVariable)
    		{	
    			Object ass=map.get((ProvaVariable)goalTerms[i]);
    			if(ass!=null)
    				goalTerm=ass;
    		}
  		
    		if(targetTerm instanceof ProvaVariable)
    		{
    			((ProvaVariable)targetTerm).assign(goalTerm, assignmentDepth+1);
    			newlyAssigned.push((ProvaVariable)targetTerm);
    			continue;
    		}
    		
    		if(goalTerm instanceof ProvaVariable)
    		{
    			((ProvaVariable)goalTerm).assign(targetTerm, assignmentDepth);
    			newlyAssigned.push((ProvaVariable)goalTerm);
    			continue;
    		}
    		//TODO: can we get assignment circles?
    		//(no, because if goal&&target are variables only the targetVar gets var-assigned)???
    		
    		   		
    		if(goalTerm instanceof ProvaList && targetTerm instanceof ProvaList)
    		{
    			unify(((ProvaList)goalTerm).getFixed(),((ProvaList)targetTerm).getFixed());
    			continue;
    		}
    		
    		if(goalTerm.equals(targetTerm))
    			continue;
    		
    		return false;
    	}
    	return true;
    }
    		
    		
    		
    		
    				
    				

   
	
    /**
     * Check whether a goal has a cut.
     *
     * @param node
     * @param query.get
     * @return 0, if no cut found; otherwise, the node-id of the CUT
     */
    private boolean checkCut(final ProvaDerivationNode node, final ProvaGoal goal) {
        // The assumption is that cuts are only occurring in instances of TmpClause
        // in the first proof step, goal is an instance of Fact (originating from the query),
        // but then the predicate cannot be a cut anyway
    	boolean rc = false;
    	ProvaRule query = goal.getQuery();
    	ProvaLiteral top = query.getTop();
    	String symbol = top.getPredicate().getSymbol();
    	while( "cut".equals(symbol) ) {
    		rc = true;
    		ProvaObject ref = top.getTerms().getFixed()[0];
    		if( ref instanceof ProvaVariablePtr ) {
    			log.error(ref);
    		}
			ProvaDerivationNode cutNode = (ProvaDerivationNode) ((ProvaConstant) ref).getObject();
    		ProvaGoal cutGoal = cutNode.getCurrentGoal();
    		cutGoal.setCut(true);
    		cutNode.setCut(true);
    		query.advance();
    		top = query.getTop();
    		goal.setGoal(top);
    		// This is key: avoid backtracking all the way back to the cut node's parent
    		node.setParent(cutNode.getParent());
    		if( top==null )
    			break;
    		symbol = top.getPredicate().getSymbol();
    	}
    	if( rc ) {
    		node.setCurrentGoal(new ProvaGoalImpl(query));
    	}
    	return rc;
    }

	public void setKb(ProvaKnowledgeBase kb) {
		this.kb = kb;
	}

	public ProvaKnowledgeBase getKb() {
		return kb;
	}

	@Override
	public void setReagent(ProvaReagent prova) {
		this.prova = prova;
	}
	
}
