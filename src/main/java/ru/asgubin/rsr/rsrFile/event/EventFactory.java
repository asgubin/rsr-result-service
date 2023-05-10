package ru.asgubin.rsr.rsrFile.event;

import ru.asgubin.rsr.rsrFile.rsrParser.RsrParser;

public class EventFactory {

    public static Event getEvent(RsrParser document, long index, int type) {

        if (type == EventType.BASIC_EVENT.getValue()) {
            return new BeEvent(document, index);
        }
        else if (type == EventType.CCF_EVENT.getValue()) {
            return new CcfEvent(document, index);
        }
        else if (type == EventType.MOD_EVENT.getValue()) {
            return new ModEvent(document, index);
        }

        return null;
    }
}
