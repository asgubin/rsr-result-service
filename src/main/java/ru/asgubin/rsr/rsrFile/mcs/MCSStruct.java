package ru.asgubin.rsr.rsrFile.mcs;

import ru.asgubin.rsr.rsrFile.rsrParser.RsrParser;

import java.util.ArrayList;
import java.util.List;

public class MCSStruct {
    private final RsrParser.McsStruct mcsStruct;
    private final List<MCSEventStruct> mcsEvents;

    public MCSStruct(RsrParser document, int index) {

        this.mcsStruct = document.mcsStruct().get(index);
        this.mcsEvents = getMcsEvents(document, index);
    }

    private List<MCSEventStruct> getMcsEvents(RsrParser document, int index) {

        List<MCSEventStruct> list = new ArrayList<>();

        long firstIndex  = document.mcsStruct().get(index).firstEvent();
        long lastIndex   = document.mcsStruct().get(index).lastEvent();

        while (firstIndex <= lastIndex) {

            list.add(new MCSEventStruct(document, firstIndex));

            firstIndex++;
        }

        return list;
    }

    public RsrParser.McsStruct getMcsStruct() {
        return mcsStruct;
    }

    public List<MCSEventStruct> getMcsEvents() {
        return mcsEvents;
    }
}
