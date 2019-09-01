package org.provarules.kernel2;

import org.provarules.exchange.ProvaSolution;
import org.provarules.parser2.ProvaParsingException;

import java.util.Vector;

public interface ProvaResultSet {

    void add(ProvaSolution solution);

    Vector<ProvaSolution> getSolutions();

    ProvaParsingException getException();

    void setException(ProvaParsingException pex);

}
