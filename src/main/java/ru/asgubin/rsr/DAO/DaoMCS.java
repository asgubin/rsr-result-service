package ru.asgubin.rsr.DAO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.asgubin.rsr.model.McsResult;
import ru.asgubin.rsr.rsrFile.mcs.MCSEventStruct;
import ru.asgubin.rsr.rsrFile.rsrParser.RsrParser;
import ru.asgubin.rsr.rsrFile.mcs.MCSStruct;

import java.util.ArrayList;
import java.util.List;

public class DaoMCS implements DAO<McsResult> {

    private static final Logger LOG = LoggerFactory.getLogger(DaoMCS.class);

    private DaoMCS() {
        LOG.debug("Create DaoMCS");
    }

    private static class SingletonHelper {
        private static final DaoMCS INSTANCE = new DaoMCS();
    }

    public static DaoMCS getInstance() {
        return SingletonHelper.INSTANCE;
    }

    @Override
    public List<McsResult> getAll(String path) {

        RsrParser document = RsrDocument.getDocument(path);
        List<McsResult> mcsList = new ArrayList<>();

        for (int i = 1; i < document.mcsStruct().size(); i++) {

            MCSStruct mcsStruct = new MCSStruct(document, i);

            List<Long> eventsIndexList = new ArrayList<>();
            for (MCSEventStruct mcsEventStruct : mcsStruct.getMcsEvents()) {

                eventsIndexList.add(mcsEventStruct.getEventStruct().getEvent().getIndex());
            }

            mcsList.add(new McsResult(
                    mcsStruct.getMcsStruct().mean(),
                    eventsIndexList));
        }

        return mcsList;
    }
}
