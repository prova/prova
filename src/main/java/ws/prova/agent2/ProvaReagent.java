package ws.prova.agent2;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.List;
import java.util.concurrent.Future;

import ws.prova.kernel2.ProvaKnowledgeBase;
import ws.prova.kernel2.ProvaList;
import ws.prova.kernel2.ProvaRule;
import ws.prova.exchange.ProvaSolution;
import ws.prova.kernel2.messaging.ProvaMessenger;
import ws.prova.kernel2.messaging.ProvaWorkflows;
import ws.prova.reference2.ProvaSwingAdaptor;

public interface ProvaReagent {

	public void setPrintWriter(PrintWriter printWriter);

	public Future<List<ProvaSolution[]>> consultSync(final String src, final String key, final Object[] objects);

	public Future<List<ProvaSolution[]>> consultSync(final BufferedReader in,
			final String key, final Object[] objects);

	public ProvaMessenger getMessenger();

	public ProvaKnowledgeBase getKb();

	public void consultAsync(final String src, final String key, final Object[] objects);

	public void consultAsync(final BufferedReader in, final String key, final Object[] objects);

	public void submitAsync(final long partition, final ProvaRule goal, final ProvaThreadpoolEnum targetPool);

	public boolean spawn(final ProvaList terms);

	public String getAgent();

	public void shutdown();

	public List<ProvaSolution[]> getInitializationSolutions();

	public ProvaWorkflows getWorkflows();

	public void unconsultSync(String src);

	public ProvaSwingAdaptor getSwingAdaptor();

	public void executeTask(long partition, Runnable task,
			ProvaThreadpoolEnum threadPool);

	public boolean canShutdown();

	public void setAllowedShutdown(boolean allowedShutdown);

	public boolean isInPartitionThread(long partition);

	public void setGlobalConstant(String name, Object value);

}
