package ru.asgubin.rsr.rsrFile.beImp;

import ru.asgubin.rsr.rsrFile.rsrParser.RsrParser;

public class BEImpStruct {
    private final RsrParser.ImpStruct impStruct;
    private final EventStruct eventStruct;

    public BEImpStruct(RsrParser document, int index) {

        this.impStruct = document.eventImp().get(index);
        this.eventStruct = new EventStruct(document, impStruct.index());
    }

    public RsrParser.ImpStruct getImpStruct() {
        return impStruct;
    }

    public EventStruct eventStruct() {
        return eventStruct;
    }
}
