package org.provarules.eventing;

import java.util.Date;

public interface ProvaEventsAccumulator extends ProvaState {

    enum AccumulationMode {Keep, Clear};

    ProvaEventsAccumulator clone();

    void clear();

    long totalCount();

    Date getStartTime();

    void setStartTime(Date date);

    void setDuration(int millis);

    int getDuration();

}
