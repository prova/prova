package ws.prova.fub;

// TODO what about serial version id. Suppossed to be serializable?
@SuppressWarnings("serial")
public class QueryExecutionException extends Exception {
	public QueryExecutionException(Exception e) {
		super(e);
	}
}
