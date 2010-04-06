package ws.prova.parser2;

public interface ProvaErrorReporter {

	void reportError(String error);

	ProvaParsingException getErrors();

}
