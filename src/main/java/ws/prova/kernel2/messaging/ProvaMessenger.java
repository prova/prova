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

	boolean sendMsg(ProvaLiteral literal, List<ProvaLiteral> newLiterals,
			ProvaRule query);

	boolean spawn(ProvaLiteral literal, List<ProvaLiteral> newLiterals,
			ProvaRule query);

	boolean rcvMsg(ProvaGoal goal, List<ProvaLiteral> newLiterals,
			ProvaRule query, boolean mult);

	void sendReturnAsMsg(ProvaConstant cid, Object ret);

	boolean prepareMsg(ProvaLiteral literal, List<ProvaLiteral> newLiterals,
			ProvaRule query);

	String generateCid();

	void addMsg(ProvaList terms);

	boolean rcvMsgP(ProvaGoal goal,
			List<ProvaLiteral> newLiterals, ProvaRule query, boolean mult);

	boolean removeTemporalRule(ProvaPredicate predicate,
			ProvaPredicate predicate2, long key, boolean recursive, ProvaList reaction, Map<String, List<Object>> metadata);

	void cleanupGroup(String xorGroup);

	void addGroupResult(ProvaList terms);

	void scheduleCleanup(ProvaObject xid, ProvaGroup group, ProvaPredicate p1, ProvaPredicate p2, long ruleid,
			long delay, long period, Map<String, List<Object>> metadata);

	void scheduleCleanup(ProvaGroup dynamic, long delay);

	void stop();

	void setService(ProvaMiniService service);

	void addMsg(String xid, String dest, String agent, Object payload);

	void addMsg(String xid, Map<String, Object> msg);

}
