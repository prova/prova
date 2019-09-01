package org.provarules.reference2;

import org.provarules.exchange.ProvaSolution;
import org.provarules.kernel2.ProvaResultSet;
import org.provarules.parser2.ProvaParsingException;

import java.util.Vector;

public class ProvaResultSetImpl implements ProvaResultSet {

    private Vector<ProvaSolution> solutions = new Vector<>();

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
    public void setException(ProvaParsingException pex) {
        this.pex = pex;
    }

}
