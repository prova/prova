package org.provarules.service;

public interface EPService {

    void send(String xid, String dest, String agent, String verb, Object payload, EPService callback);

}
