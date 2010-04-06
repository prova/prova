package ws.prova.reference2;

import java.util.Vector;

import ws.prova.kernel2.ProvaResultSet;
import ws.prova.exchange.ProvaSolution;
import ws.prova.parser2.ProvaParsingException;

public class ProvaResultSetImpl implements ProvaResultSet {

	private Vector<ProvaSolution> solutions = new Vector<ProvaSolution>();
	
	private ProvaParsingException pex;
	
	@Override
	public void add(ProvaSolution solution) {
		solutions.add(solution);
	}

	public void setSolutions(Vector<ProvaSolution> solutions) {
		this.solutions = solutions;
	}

	@Override
	public Vector<ProvaSolution> getSolutions() {
		return solutions;
	}

	@Override
	public ProvaParsingException getException() {
		return pex;
	}
	
	@Override
	public void setException( ProvaParsingException pex ) {
		this.pex = pex;
	}
	
}
