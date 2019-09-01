package org.provarules.examples;

import java.io.Serializable;

public class Portfolio implements Serializable {

    private static final long serialVersionUID = 4132215944599967586L;

    private String name;

    public Portfolio() {
        name = "default";
    }

    public Portfolio(String _name) {
        name = _name;
    }

    public String toString() {
        return "I am Portfolio " + name;
    }

    public Object[] toList() {
        return new Object[]{"IBM", "Sun"};
    }

    /**
     * An example of a method with a long duration calculation
     *
     * @param nsec - the number of seconds to sleep as Integer
     * @return - always Boolean.TRUE
     */
    public Boolean longcalc(long nsec) {
        try {
            Thread.sleep(nsec * 1000);
        } catch (Exception exc) {
        }
        return Boolean.TRUE;
    }

}
