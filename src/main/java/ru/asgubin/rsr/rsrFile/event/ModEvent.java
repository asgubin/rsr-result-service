package ru.asgubin.rsr.rsrFile.event;

import ru.asgubin.rsr.rsrFile.rsrParser.RsrParser;

public class ModEvent implements Event {
    private final long index;
    private final String name;

    private final RsrParser.ModEvent event;

    public ModEvent(RsrParser document, long index) {

        this.event = document.modEvent().get((int) index);

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

    public RsrParser.ModEvent getEvent() {
        return event;
    }
}
