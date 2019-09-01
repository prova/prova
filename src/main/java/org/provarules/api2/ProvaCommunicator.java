package org.provarules.api2;

import org.provarules.agent2.ProvaReagent;
import org.provarules.exchange.ProvaSolution;
import org.provarules.kernel2.ProvaList;
import org.provarules.kernel2.messaging.ProvaMessenger;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

public interface ProvaCommunicator {

    List<ProvaSolution[]> getInitializationSolutions();

    void setPrintWriter(PrintWriter printWriter);

    List<ProvaSolution[]> consultSync(String src, String key, Object[] objects)
            throws Exception;

    List<ProvaSolution[]> consultSync(BufferedReader in, String key, Object[] objects)
            throws Exception;

    void consultAsync(String src, String key, Object[] objects)
            throws Exception;

    void consultAsync(BufferedReader in, String key, Object[] objects)
            throws Exception;

    void shutdown();

    ProvaReagent getReagent();

    void addMsg(ProvaList terms);

    void unconsultSync(String src);

    void stop();

    void setGlobalConstant(String name, Object value);

    void addMsg(String xid, String agent, String verb, Object payload);

    void setMessenger(ProvaMessenger messenger);

    void addMsg(String xid, Map<String, Object> msg);

}
