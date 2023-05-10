package ru.asgubin.rsr.rsrFile.event;

import ru.asgubin.rsr.rsrFile.rsrParser.RsrParser;

public class CcfEvent implements Event {
    private final long index;
    private final String name;

    private final RsrParser.CcfEvent event;

    public CcfEvent(RsrParser document, long index) {

        this.event = document.ccfEvent().get((int) index);

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

    public RsrParser.CcfEvent getEvent() {
        return event;
    }
}
