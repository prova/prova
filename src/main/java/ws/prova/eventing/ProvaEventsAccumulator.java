package ws.prova.eventing;

public interface ProvaEventsAccumulator {

	public enum AccumulationMode {Keep,Clear};
	
	public ProvaEventsAccumulator clone();

	public void clear();

}
