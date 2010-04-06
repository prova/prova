package ws.prova.reference2.messaging.where;

import org.antlr.runtime.tree.*;

import static ws.prova.reference2.messaging.where.WhereBinaryOperation.*;
import static ws.prova.reference2.messaging.where.WhereComparison.*;

public class WhereTreeVisitor {
	private WhereTreeVisitor() {
	}

	private static WhereNode createBinaryOperation(Tree tree, Operator op) {
		return new WhereBinaryOperation(visit(tree.getChild(0)), visit(tree
				.getChild(1)), op);
	}

	private static WhereNode createComparison(Tree tree, Type type) {
		return new WhereComparison(tree.getChild(0).toString(), tree.getChild(1).toString(), type);
	}

	public static WhereNode visit(Tree tree) {
		String type = tree.toString();

		if (type.equals("and")) {
			return createBinaryOperation(tree, Operator.And);
		} else if (type.equals("or")) {
			return createBinaryOperation(tree, Operator.Or);
		} else if (type.equals("xor")) {
			return createBinaryOperation(tree, Operator.Xor);
		} else if (type.equals("not")) {
			return new WhereNotOperator(visit(tree.getChild(0)));
		} else if (type.equals("<")) {
			return createComparison(tree, Type.LessThan);
		} else if (type.equals("<=")) {
			return createComparison(tree, Type.LessThanOrEqual);
		} else if (type.equals(">")) {
			return createComparison(tree, Type.GreaterThan);
		} else if (type.equals(">=")) {
			return createComparison(tree, Type.GreaterThanOrEqual);
		} else if (type.equals("!=")) {
			String compareTo = tree.getChild(1).toString();
			if (compareTo.startsWith("'")
					|| Character.isLetter(compareTo.charAt(0))) {
				return new WhereNotEqual(tree.getChild(0).toString(),
						compareTo);
			} else {
				return createComparison(tree, Type.NotEqual);
			}
		} else if (type.equals("IN")) {
			return new WhereInOperator(tree);
		} else {
			return null;
		}
	}
}
