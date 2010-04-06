package ws.prova.reference2.messaging.where;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.antlr.runtime.tree.Tree;

public class WhereInOperator extends WhereBasicNode {

	private final String field;

	private final List<String> values = new ArrayList<String>();

	public WhereInOperator(Tree tree) {
		this.field = tree.getChild(0).toString();
		for (int i = 1; i < tree.getChildCount(); i++)
			this.values.add(tree.getChild(i).toString());
	}

	@Override
	public boolean evaluate(Map<Object, Object> vars, Map<Object, Object> vars2) {
		// TODO: numbers
		String value = data(field, vars, vars2).toString();
		for (String v : values) {
			if (v.equals(value))
				return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return field + " in " + values;
	}
}
