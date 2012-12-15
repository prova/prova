package ws.prova.kernel2.messaging;

import java.util.List;
import java.util.Map;

import ws.prova.kernel2.ProvaConstant;
import ws.prova.kernel2.ProvaGoal;
import ws.prova.kernel2.ProvaList;
import ws.prova.kernel2.ProvaLiteral;
import ws.prova.kernel2.ProvaObject;
import ws.prova.kernel2.ProvaPredicate;
import ws.prova.kernel2.ProvaRule;
import ws.prova.reference2.eventing.ProvaGroup;
import ws.prova.service.ProvaMiniService;

public interface ProvaMessenger {

	public boolean sendMsg(ProvaLiteral literal, List<ProvaLiteral> newLiterals,
			ProvaRule query);

	public boolean spawn(ProvaLiteral literal, List<ProvaLiteral> newLiterals,
			ProvaRule query);

	public boolean rcvMsg(ProvaGoal goal, List<ProvaLiteral> newLiterals,
			ProvaRule query, boolean mult);

	public void sendReturnAsMsg(ProvaConstant cid, Object ret);

	public boolean prepareMsg(ProvaLiteral literal, List<ProvaLiteral> newLiterals,
			ProvaRule query);

	public String generateCid();

	public void addMsg(ProvaList terms);

	public boolean rcvMsgP(ProvaGoal goal,
			List<ProvaLiteral> newLiterals, ProvaRule query, boolean mult);

	public boolean removeTemporalRule(ProvaPredicate predicate,
			ProvaPredicate predicate2, long key, boolean recursive, ProvaList reaction, Map<String, List<Object>> metadata);

	public void cleanupGroup(String xorGroup);

	public void addGroupResult(ProvaList terms);

	void scheduleCleanup(ProvaObject xid, ProvaGroup group, ProvaPredicate p1, ProvaPredicate p2, long ruleid,
			long delay, long period, Map<String, List<Object>> metadata);

	void scheduleCleanup(ProvaGroup dynamic, long delay);

	public void stop();

	public void setService(ProvaMiniService service);

	public void addMsg(String xid, String dest, String agent, Object payload);

}
