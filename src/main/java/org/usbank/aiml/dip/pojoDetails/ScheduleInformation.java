package org.usbank.aiml.dip.pojoDetails;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"scheduleTime","scheculeType"})
public  class ScheduleInformation {
    private String scheduleTime;

    private String scheculeType;

    public String getScheduleTime ()
    {
        return scheduleTime;
    }

    public void setScheduleTime (String scheduleTime)
    {
        this.scheduleTime = scheduleTime;
    }

    public String getScheculeType ()
    {
        return scheculeType;
    }

    public void setScheculeType (String scheculeType)
    {
        this.scheculeType = scheculeType;
    }

    public ScheduleInformation(String scheduleTime, String scheculeType) {
        scheduleTime = scheduleTime;
        scheculeType = scheculeType;
    }

    public ScheduleInformation(){

    }

    @Override
    public String toString()
    {
        return "ClassPojo [scheduleTime = "+scheduleTime+", scheculeType = "+scheculeType+"]";
    }
}
