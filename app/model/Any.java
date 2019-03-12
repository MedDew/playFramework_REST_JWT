package model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Any {
    public String event;
    public int attendance;

    @JsonCreator
    public Any(@JsonProperty("event") String event,@JsonProperty("attendance") int attendance) {
        this.event = event;
        this.attendance = attendance;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public int getAttendance() {
        return attendance;
    }

    public void setAttendance(int attendance) {
        this.attendance = attendance;
    }
}
