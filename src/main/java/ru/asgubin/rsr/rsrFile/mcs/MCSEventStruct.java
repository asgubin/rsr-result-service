package ru.asgubin.rsr.rsrFile.mcs;

import ru.asgubin.rsr.rsrFile.beImp.EventStruct;
import ru.asgubin.rsr.rsrFile.rsrParser.RsrParser;

public class MCSEventStruct {
    private final RsrParser.McsEventStruct mcsEventStruct;
    private final EventStruct eventStruct;

    public MCSEventStruct(RsrParser document, long index) {

        this.mcsEventStruct = document.mcsEventStruct().get((int) index);
        this.eventStruct = new EventStruct(document, mcsEventStruct.event());
    }

    public RsrParser.McsEventStruct getMcsEventStruct() {
        return mcsEventStruct;
    }

    public EventStruct getEventStruct() {
        return eventStruct;
    }
}
