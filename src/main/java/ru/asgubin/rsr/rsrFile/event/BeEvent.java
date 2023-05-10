package ru.asgubin.rsr.rsrFile.event;

import ru.asgubin.rsr.rsrFile.rsrParser.RsrParser;

public class BeEvent implements Event {
    private final long index;
    private final String name;

    private final RsrParser.BeEvent event;

    public BeEvent(RsrParser document, long index) {

        this.event = document.beEvent().get((int) index);

        this.index = event.index();
        this.name = event.name();
    }

    @Override
    public long getIndex() {
        return index;
    }

    @Override
    public String getName() {
        return name;
    }

    public RsrParser.BeEvent getEvent() {
        return event;
    }
}
