package ws.prova.parser2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ProvaParsingException extends RuntimeException {
	
	private static final long serialVersionUID = -1079902987548313008L;

	private String src;

	private String desc;
	
	private Map<String,String> errors = new HashMap<String,String>();

	public ProvaParsingException() {
	}

	public String toString() {
		return src;
	}

	public Map<String,String> errors() {
		return errors;
	}

	public String errorsToString() {
		StringBuilder sb = new StringBuilder();
		for (Iterator<String> kit = errors.keySet().iterator(); kit.hasNext();) {
			final Object key = kit.next();
			sb.append("Line ");
			sb.append(key);
			sb.append(" > ");
			sb.append(errors.get(key));
			sb.append("\n");
		}
		return sb.toString();
	}

	public String getSource() {
		return src;
	}

	public void setSource(final String src) {
		this.src = src;
	}

	public void addError(final String line, final String desc) {
		errors.put(line, desc);
	}

	public void setDescription( String desc ) {
		this.desc = desc;
	}
	
	public String getDescription() {
		return desc;
	}

	@Override
	public Exception getCause() {
		return null;
	}
}
