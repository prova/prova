package ws.prova.eventing;

public interface ProvaEventsAccumulator extends ProvaState {

	public enum AccumulationMode {Keep,Clear};
	
	public ProvaEventsAccumulator clone();

	public void clear();

	long totalCount();

}
