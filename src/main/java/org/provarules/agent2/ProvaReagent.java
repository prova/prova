package org.provarules.agent2;

import org.provarules.exchange.ProvaSolution;
import org.provarules.kernel2.ProvaKnowledgeBase;
import org.provarules.kernel2.ProvaList;
import org.provarules.kernel2.ProvaRule;
import org.provarules.kernel2.messaging.ProvaMessenger;
import org.provarules.kernel2.messaging.ProvaWorkflows;
import org.provarules.reference2.ProvaSwingAdaptor;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.List;
import java.util.concurrent.Future;

public interface ProvaReagent {

    void setPrintWriter(PrintWriter printWriter);

    Future<List<ProvaSolution[]>> consultSync(final String src, final String key, final Object[] objects);

    Future<List<ProvaSolution[]>> consultSync(final BufferedReader in,
                                                     final String key, final Object[] objects);

    ProvaMessenger getMessenger();

    ProvaKnowledgeBase getKb();

    void consultAsync(final String src, final String key, final Object[] objects);

    void consultAsync(final BufferedReader in, final String key, final Object[] objects);

    void submitAsync(final long partition, final ProvaRule goal, final ProvaThreadpoolEnum targetPool);

    boolean spawn(final ProvaList terms);

    String getAgent();

    void shutdown();

    List<ProvaSolution[]> getInitializationSolutions();

    ProvaWorkflows getWorkflows();

    void unconsultSync(String src);

    ProvaSwingAdaptor getSwingAdaptor();

    void executeTask(long partition, Runnable task,
                            ProvaThreadpoolEnum threadPool);

    boolean canShutdown();

    void setAllowedShutdown(boolean allowedShutdown);

    boolean isInPartitionThread(long partition);

    void setGlobalConstant(String name, Object value);

}
