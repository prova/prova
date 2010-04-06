package ws.prova.examples;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Order implements Serializable {
	private static final long serialVersionUID = 8634610276409403898L;
	private String customer;

	private List<Object> items;

	private Map<Object,Double> discounts;

	public Order(String customer) {
		this.customer = customer;
		items = new ArrayList<Object>();
		discounts = new HashMap<Object,Double>();
	}

	public String toString() {
		String res = "Order(" + customer + ",(";
		for (int i = 0; i < items.size(); i++) {
			if (i != 0)
				res += ',';
			final Object item = items.get(i);
			res += item + ":" + discounts.get(item);
		}
		res += "))";
		return res;
	}

	public String getCustomer() {
		return customer;
	}

	public List<Object> getItems() {
		return items;
	}

	public void addItem(Object item) {
		items.add(item);
		discounts.put(item, new Double(1.0));
	}

	public void setDiscount(String item, double d) {
		Double discount0 = (Double) discounts.get(item);
		if (discount0 == null) {
			discounts.put(item, new Double(1 - d));
			return;
		}
		discounts.put(item, new Double(discount0.doubleValue() * (1 - d)));
	}
}
