package ru.asgubin.rsr.rsrFile.beImp;

import ru.asgubin.rsr.rsrFile.event.*;
import ru.asgubin.rsr.rsrFile.rsrParser.RsrParser;

public class EventStruct {
    private final RsrParser.EventStruct eventStruct;
    private final Event event;

    public EventStruct(RsrParser document, long index) {

        this.eventStruct = document.eventStruct().get((int) index);
        this.event = EventFactory.getEvent(document, eventStruct.index(), eventStruct.eventType());
    }

    public Event getEvent() {
        return event;
    }

    public RsrParser.EventStruct getEventStruct() {
        return eventStruct;
    }
}
