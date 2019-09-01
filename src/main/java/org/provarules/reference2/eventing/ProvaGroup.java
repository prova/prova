package org.provarules.reference2.eventing;

import org.provarules.agent2.ProvaReagent;
import org.provarules.kernel2.ProvaKnowledgeBase;
import org.provarules.kernel2.ProvaList;
import org.provarules.reference2.messaging.RemoveList;
import org.provarules.reference2.messaging.where.WhereNode;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;

public interface ProvaGroup {

    enum EventDetectionStatus {incomplete, complete, preserved, failed}

    void addRemoveEntry(long ruleid, RemoveList rl);

    void start(RemoveList rl, Map<Long, ProvaGroup> ruleid2Group);

    RemoveList getResultRemoveEntry();

    Map<Long, RemoveList> getRemoveMap();

    String getDynamicGroup();

    void addResult(ProvaList result);

    EventDetectionStatus eventDetected(ProvaKnowledgeBase kb, ProvaReagent prova, long ruleid, ProvaList reaction, Map<String, List<Object>> metadata, Map<Long, ProvaGroup> ruleid2Group);

    void stop();

    boolean cleanup(ProvaKnowledgeBase kb, ProvaReagent prova, Map<Long, ProvaGroup> ruleid2Group, Map<String, ProvaGroup> dynamic2Group);

    boolean isOperatorConfigured();

    void setParent(ProvaGroup parent);

    ProvaGroup getParent();

    void addChild(ProvaGroup g);

    List<ProvaGroup> getChildren();

    void immediateCleanup(Map<Long, ProvaGroup> ruleid2Group, Map<String, ProvaGroup> dynamic2Group);

    String getOperatorName();

    void childFailed(ProvaGroup child, Map<Long, ProvaGroup> ruleid2Group, Map<String, ProvaGroup> dynamic2Group);

    boolean isGroupFailed();

    void setTimeout(long delay);

    void putId2ruleid(String id, long ruleid);

    void pause(long ruleidToPause);

    boolean isFailed();

    String getStaticGroup();

    void setTemplate(boolean template);

    boolean isTemplate();

    ProvaGroup clone();

    void setDynamicGroup(String dynamicGroup);

    void start(Map<Long, ProvaGroup> ruleid2Group);

    boolean isPermanent();

    void setTimerFuture(ScheduledFuture<?> future);

    void addWhere(WhereNode where);

    boolean isExtended();

    void setExtended(boolean extended);

    void addTimeoutEntry(RemoveList rl);

    void cleanupTimeoutEntries();

    void setCountMax(int countMax);

    void setConcrete(ProvaGroup group);

}
