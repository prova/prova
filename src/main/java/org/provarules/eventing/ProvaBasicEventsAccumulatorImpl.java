package org.provarules.eventing;

import java.util.Date;

public abstract class ProvaBasicEventsAccumulatorImpl implements ProvaEventsAccumulator {

    private static final long serialVersionUID = 5393083416354543355L;

    protected Date startTime;

    protected int duration;

    public ProvaBasicEventsAccumulatorImpl() {
    }

    public ProvaBasicEventsAccumulatorImpl(ProvaBasicEventsAccumulatorImpl accumulator) {
        this.startTime = accumulator.startTime;
        this.duration = accumulator.duration;
    }

    abstract public ProvaEventsAccumulator clone();

    @Override
    public Date getStartTime() {
        return startTime;
    }

    @Override
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    @Override
    public int getDuration() {
        return duration;
    }

    @Override
    public void setDuration(int duration) {
        this.duration = duration;
    }

}
