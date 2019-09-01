package org.provarules.service;

public interface ProvaMiniService {

    void send(String xid, String dest, String agent, String verb, Object payload);

}
