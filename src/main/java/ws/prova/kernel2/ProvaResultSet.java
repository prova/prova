package ws.prova.kernel2;

import java.util.Vector;

import ws.prova.exchange.ProvaSolution;
import ws.prova.parser2.ProvaParsingException;

public interface ProvaResultSet {

	public void add(ProvaSolution solution);

	public Vector<ProvaSolution> getSolutions();

	ProvaParsingException getException();

	void setException(ProvaParsingException pex);

}
