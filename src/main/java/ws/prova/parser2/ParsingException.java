package ws.prova.parser2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ParsingException extends Exception {
	private static final long serialVersionUID = -5948759071972118254L;

	private String src;

	private String desc;

	private Map<Integer,String> errors = new HashMap<Integer,String>();

	public ParsingException() {
	}

	public ParsingException(final String message) {
		super(message);
	}

	public String toString() {
		return desc + " in " + src;
	}

	public Map<Integer,String> errors() {
		return errors;
	}

	public String errorsToString() {
		StringBuffer sb = new StringBuffer();
		for (Iterator<Integer> kit = errors.keySet().iterator(); kit.hasNext();) {
			final Object key = kit.next();
			sb.append("Line ");
			sb.append(key);
			sb.append(" > ");
			sb.append(errors.get(key));
			sb.append("\n");
		}
		return sb.toString();
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getSource() {
		return src;
	}

	public void setSource(final String src) {
		this.src = src;
	}

	public void addError(final int line, final String desc) {
		errors.put(new Integer(line), desc);
	}
}
