package ws.prova.eventing;

import java.util.Date;

public interface ProvaEventsAccumulator extends ProvaState {

	public enum AccumulationMode {Keep,Clear};
	
	public ProvaEventsAccumulator clone();

	public void clear();

	public long totalCount();

	public Date getStartTime();
	
	public void setStartTime(Date date);

	public void setDuration(int millis);

	public int getDuration();

}
