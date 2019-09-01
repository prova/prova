package org.provarules.demos2;

import org.provarules.api2.ProvaCommunicatorImpl;

public class ProvaSwingDemo2 {

    private static final String kAgent = "prova";

    private static final String kPort = null;

    public ProvaSwingDemo2() {
        final String rulebase = "rules/reloaded/swing_rx.prova";

        try {
            new ProvaCommunicatorImpl(kAgent, kPort, rulebase, ProvaCommunicatorImpl.SYNC, null);
        } catch (Exception e) {
            System.err.println(e.getCause().getLocalizedMessage());
        }
    }

    public static void main(String[] args) {
        new ProvaSwingDemo2();
    }

}
