package com.kingskull.lolapplication.models.pojos.matchinfo;

import java.util.List;
import java.util.Map;

/**
 * Created by cherrera on 1/26/2016.
 */
public class Frame {

    private long timestamp;

    private List<Event> events;
    private Map<String, ParticipantFrame> participantFrames;

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

    public Map<String, ParticipantFrame> getParticipantFrames() {
        return participantFrames;
    }

    public void setParticipantFrames(Map<String, ParticipantFrame> participantFrames) {
        this.participantFrames = participantFrames;
    }
}
