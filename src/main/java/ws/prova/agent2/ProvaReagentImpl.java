package ws.prova.agent2;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.StringReader;
import java.lang.reflect.InvocationTargetException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ThreadFactory;

import javax.swing.SwingUtilities;

import org.apache.commons.beanutils.MethodUtils;
import org.apache.log4j.Logger;

import ws.prova.esb2.ProvaAgent;
import ws.prova.kernel2.ProvaConstant;
import ws.prova.kernel2.ProvaDerivationNode;
import ws.prova.kernel2.ProvaKnowledgeBase;
import ws.prova.kernel2.ProvaList;
import ws.prova.kernel2.ProvaObject;
import ws.prova.kernel2.ProvaResolutionInferenceEngine;
import ws.prova.kernel2.ProvaRule;
import ws.prova.exchange.ProvaSolution;
import ws.prova.kernel2.messaging.ProvaMessenger;
import ws.prova.kernel2.messaging.ProvaWorkflows;
import ws.prova.parser2.ProvaParsingException;
import ws.prova.reference2.ProvaKnowledgeBaseImpl;
import ws.prova.reference2.ProvaResolutionInferenceEngineImpl;
import ws.prova.reference2.ProvaSwingAdaptor;
import ws.prova.reference2.messaging.ProvaMessengerImpl;
import ws.prova.reference2.messaging.ProvaWorkflowsImpl;
import ws.prova.service.ProvaMiniService;

@SuppressWarnings("unused")
public class ProvaReagentImpl implements ProvaReagent {

	private final static Logger log = Logger.getLogger("prova");

	private static final ProvaSolution[] noSolutions = new ProvaSolution[0];
	
	private String agent;

	private String password;

	private String port;
	
	private ProvaKnowledgeBase kb;

	private String machine;

	// A queue for sequential execution of Prova goals and inbound messages
	private final ExecutorService executor;

	private final ExecutorService pool;
	
	private final ExecutorService[] partitionedPool = new ExecutorService[32];

	private final Map<Long,Integer> threadId2Index = new HashMap<Long,Integer>(32);

	private ProvaMessenger messenger;

	private List<ProvaSolution[]> initializationSolutions;

	private ProvaWorkflows workflows;

	private ProvaSwingAdaptor swingAdaptor;

	private long latestTimestamp;

	private boolean allowedShutdown = true;
	
	public ProvaReagentImpl(ProvaMiniService service, String agent, String port,
			String[] prot, Object rules, boolean async,
			ProvaAgent esb, Map<String, Object> globals) {
		this.agent = agent;
		this.port = port;
//		this.queue = queue;
		try {
			this.machine = InetAddress.getLocalHost().getHostName().toLowerCase();
		} catch (UnknownHostException ex) {
		}

		kb = new ProvaKnowledgeBaseImpl();
		kb.setGlobals(globals);

		this.executor = Executors.newFixedThreadPool(1);
		this.pool = Executors.newFixedThreadPool(10);
		for( int i=0; i<partitionedPool.length; i++ ) {
			final int index = i;
			this.partitionedPool[i] = Executors.newFixedThreadPool(1, new ThreadFactory() {

				@Override
				public Thread newThread(Runnable r) {
					Thread th = null;
					th = new Thread(r);
					threadId2Index.put(th.getId(),index);
					return th;
				}
				
			});
		}

		this.messenger = new ProvaMessengerImpl(this, kb, agent, password, machine, esb);
		this.messenger.setService(service);
		this.workflows = new ProvaWorkflowsImpl(kb);
		
		Runtime.getRuntime().addShutdownHook(new Thread() {
			public void run() {
				shutdown();
			}
		});

		swingAdaptor = new ProvaSwingAdaptor(this);
		
		if (rules != null && !rules.equals("")) {
			// Import prova rules from .prova file or a BufferedReader
			try {
				// Wait indefinitely for results
				if( rules instanceof String )
					initializationSolutions = this.consultSync((String) rules, (String) rules, new Object[] {}).get();
				else
					initializationSolutions = this.consultSync((BufferedReader) rules, "-1", new Object[] {}).get();
			} catch (Exception e) {
				if( e.getCause() instanceof ProvaParsingException )
					throw new RuntimeException(e.getCause());
				else if( e.getCause() instanceof RuntimeException ) {
					throw (RuntimeException) e.getCause();
				}
				throw new RuntimeException(e.getCause());
			} finally {
				if( initializationSolutions==null )
					shutdown();
			}
		}
	}

	@Override
	public List<ProvaSolution[]> getInitializationSolutions() {
		return initializationSolutions;
	}
	
	/**
	 * Clean up by executing the shutdown predicate if it is in the rulebase.
	 * TODO: It is now sent via the Executor queue so various problems may arise.
	 */
	private void cleanUp() {
//		BufferedReader in = new BufferedReader( new StringReader(":-eval(shutdown).") );
//		consultSync(in,"shutdown",null);
	}

	public List<ProvaSolution[]> consultSyncInternal(BufferedReader in, String key, Object[] objects) {
		return kb.consultSyncInternal(this, in, key, objects);
	}

	public List<ProvaSolution[]> consultSyncInternal(String src, String key, Object[] objects) {
		return kb.consultSyncInternal(this, src, key, objects);
	}

	@Override
    public Future<List<ProvaSolution[]>> consultSync(final String src, final String key, final Object[] objects) {
        Callable<List<ProvaSolution[]>> task = new Callable<List<ProvaSolution[]>>() {
            public List<ProvaSolution[]> call () {
                return ProvaReagentImpl.this.consultSyncInternal(src, key, objects);
            }
        };
        FutureTask<List<ProvaSolution[]>> ftask = new FutureTask<List<ProvaSolution[]>>(task);
        executor.execute(ftask);
        return ftask;
    }

	@Override
    public Future<List<ProvaSolution[]>> consultSync(final BufferedReader in, final String key, final Object[] objects) {
        Callable<List<ProvaSolution[]>> task = new Callable<List<ProvaSolution[]>>() {
            public List<ProvaSolution[]> call () {
                return ProvaReagentImpl.this.consultSyncInternal(in, key, objects);
            }
        };
        FutureTask<List<ProvaSolution[]>> ftask = new FutureTask<List<ProvaSolution[]>>(task);
        executor.execute(ftask);
        return ftask;
    }

	@Override
	public void consultAsync(final String src, final String key, final Object[] objects) {
		final StringReader sr = new StringReader(src);
		final BufferedReader in = new BufferedReader(sr);
        Runnable task = new Runnable() {
			@Override
			public void run() {
                ProvaReagentImpl.this.consultSyncInternal(in, key, objects);
			}
        };
        executor.execute(task);
	}

	@Override
	public void consultAsync(final BufferedReader in, final String key, final Object[] objects) {
        Runnable task = new Runnable() {
			@Override
			public void run() {
                ProvaReagentImpl.this.consultSyncInternal(in, key, objects);
			}
        };
        executor.execute(task);
	}
/*
       Callable<Object> job = new Callable<Object>() {
			@Override
			public Object call() throws Exception {
				try {
					ProvaReagentImpl.this.submitSyncInternal(goal);
				} catch( RuntimeException e ) {
					System.out.println("Runtime Java exception: "+e.getCause());
				}
                return null;
			}
        };
 
 */
	@Override
	public void submitAsync(final long partition, final ProvaRule goal, final ProvaThreadpoolEnum threadPool) {
		this.latestTimestamp = System.currentTimeMillis();
        Runnable job = new Runnable() {
			@Override
			public void run() {
				try {
					ProvaReagentImpl.this.submitSyncInternal(goal);
				} catch( RuntimeException e ) {
					log.error("Runtime Java exception: "+e);
				}
			}
        };
        switch( threadPool ) {
        case MAIN:
        	executor.execute(job);
        	break;
        case TASK:
        	pool.execute(job);
        	break;
        case SWING:
			// All Swing events are queued to the Swing events thread
			//    (this is to be conforming to the Swing threads rules)
            Runnable task = new Runnable() {
    			@Override
    			public void run() {
                    ProvaReagentImpl.this.submitSyncInternal(goal);
    			}
            };
			try {
				if( SwingUtilities.isEventDispatchThread() )
					task.run();
				else
					SwingUtilities.invokeAndWait(task);
			} catch (InvocationTargetException ex) {
			} catch (InterruptedException ex) {
			}
        	break;
        case CONVERSATION:
        	partitionedPool[threadIndex(partition)].execute(job);
        }
	}

	/**
	 * Map partition key to the conversation thread index 
	 * @param partition partition key
	 * @return thread index
	 */
	public int threadIndex(final long partition) {
		return (int) (partition%(partitionedPool.length));
	}

	@Override
	public void executeTask(final long partition, final Runnable task, final ProvaThreadpoolEnum threadPool) {
        switch( threadPool ) {
        case MAIN:
        	executor.execute(task);
        	break;
        case CONVERSATION:
        	partitionedPool[threadIndex(partition)].execute(task);
        	break;
        case SWING:
			// All Swing events are queued to the Swing events thread
			//    (this is to be conforming to the Swing threads rules)
			try {
				if( SwingUtilities.isEventDispatchThread() )
					task.run();
				else
					SwingUtilities.invokeAndWait(task);
			} catch (InvocationTargetException ex) {
			} catch (InterruptedException ex) {
			}
        	break;
        case TASK:
        	pool.execute(task);
        }
	}

	@Override
	public boolean spawn(final ProvaList terms) {
		final ProvaObject[] data = terms.getFixed();
		final int length = data.length;
		if( length<4 )
			return false;
		if( !(data[0] instanceof ProvaConstant) )
			return false;
		if( !(data[2] instanceof ProvaConstant) )
			return false;
		final String method = (String) ((ProvaConstant) data[2]).getObject();
		if( !(data[1] instanceof ProvaConstant) )
			return false;
		final Object target = ((ProvaConstant) data[1]).getObject();
		Object[] args0 = null;
		final Object argsRaw = data[3];
		if( argsRaw instanceof ProvaList ) {
			final ProvaList argsList = (ProvaList) argsRaw;
			args0 = new Object[argsList.getFixed().length];
			for( int i=0; i<args0.length; i++ ) {
				ProvaObject po = argsList.getFixed()[i];
				if( !(po instanceof ProvaConstant) )
					return false;
				args0[i] = ((ProvaConstant) po).getObject();
			}
		} else if( argsRaw instanceof ProvaConstant ) {
			args0 = new Object[1];
			args0[0] = ((ProvaConstant) argsRaw).getObject();
		}
		final Object[] args = args0;
        Callable<?> task = new Callable<Object>() {
			@Override
			public Object call() throws Exception {
				Object ret = null;
				if( target instanceof Class<?> ) {
					Class<?> targetClass = (Class<?>) target;
					ret = MethodUtils.invokeStaticMethod(targetClass,method,args);
				} else {
					ret = MethodUtils.invokeMethod(target,method,args);
				}
				messenger.sendReturnAsMsg((ProvaConstant) data[0], ret);
				return ret;
			}
        };
		Future<?> future = pool.submit(task);
		return true;
	}

	protected void submitSyncInternal(ProvaRule goal) {
		ProvaResolutionInferenceEngine engine = new ProvaResolutionInferenceEngineImpl(kb, goal);
		engine.setReagent(this);
		ProvaDerivationNode result = engine.run();
	}

	@Override
	public void setPrintWriter(PrintWriter printWriter) {
		kb.setPrintWriter(printWriter);
	}

	@Override
	public ProvaMessenger getMessenger() {
		return this.messenger;
	}

	@Override
	public ProvaKnowledgeBase getKb() {
		return kb;
	}

	@Override
	public String getAgent() {
		return agent;
	}

	@Override
	public void shutdown() {
		messenger.stop();
		pool.shutdown();
		for( ExecutorService partitioned : partitionedPool )
			partitioned.shutdown();
		executor.shutdown();
	}

	@Override
	public ProvaWorkflows getWorkflows() {
		return this.workflows;
	}

	@Override
	public void unconsultSync(String src) {
		kb.unconsultSync(src);
	}

	@Override
	public ProvaSwingAdaptor getSwingAdaptor() {
		return this.swingAdaptor;
	}
	
	@Override
	public boolean canShutdown() {
		return allowedShutdown && System.currentTimeMillis() > this.latestTimestamp+1000;
	}

	@Override
	public void setAllowedShutdown(boolean allowedShutdown) {
		this.allowedShutdown = allowedShutdown;
		
	}

	@Override
	public boolean isInPartitionThread(long partition) {
		return threadId2Index.get(Thread.currentThread().getId()) == threadIndex(partition);
	}

	@Override
	public void setGlobalConstant(String name, Object value) {
		kb.setGlobalConstant(name, value);		
	}

}
