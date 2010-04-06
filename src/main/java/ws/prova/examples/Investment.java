package ws.prova.examples;

import java.io.Serializable;
import java.util.List;

public class Investment implements Serializable {

	private static final long serialVersionUID = -2412101758244733942L;

	private String symbol;

	private double at;

	public Investment(String _symbol, double _at) {
		super();
		symbol = _symbol;
		at = _at;
	}

	public String toString() {
		return "Investment(" + symbol + ',' + at + ")";
	}

	public Boolean stopLoss(Object arg1) {
		// We have a stock quote that is below the original buy price * 0.95
		Double in = (Double) arg1;
		return Boolean.valueOf(in.doubleValue() < at * 0.95);
	}

	public Boolean sell(Object arg1) {
		// Sell the investment
		Double in = (Double) arg1;
		System.out.println(this.toString() + ": sold at " + in.doubleValue());
		return Boolean.TRUE;
	}

	public Boolean check_price(Object arg1) {
		Double in = (Double) arg1;
		return (in.doubleValue() == at) ? Boolean.TRUE : Boolean.FALSE;
	}

	public Boolean send(Object arg1, Object arg2) {
		String agent = (String) arg1;
		String me = (String) arg2;
		System.out.println(this.toString() + ": sent to agent " + agent + " from agent " + me);
		return Boolean.TRUE;
	}

	public Boolean purchased_at(List<Object> ret) {
		ret.add(new Double(at));
		return Boolean.TRUE;
	}

	/**
	 * An example of a method with a long duration calculation
	 *
	 * @param arg1 - the number of seconds to sleep as Integer
	 * @param ret  - list of returned objects
	 * @return - always Boolean.TRUE
	 */
	public Boolean longcalc(Object arg1, List<Object> ret) {
		// The only parameter: the number of seconds to sleep
		Integer nsec = (Integer) arg1;
		try {
			Thread.sleep(nsec.intValue() * 1000);
		} catch (Exception exc) {
		}
		// Add returned objects to the return list
		ret.add(nsec);
		return Boolean.TRUE;
	}

}
