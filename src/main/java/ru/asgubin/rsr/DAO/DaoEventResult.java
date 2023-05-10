package ru.asgubin.rsr.DAO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.asgubin.rsr.rsrFile.beImp.BEImpStruct;
import ru.asgubin.rsr.rsrFile.mcs.MCSStruct;
import ru.asgubin.rsr.rsrFile.rsrParser.RsrParser;

import java.util.ArrayList;
import java.util.List;

public class DaoEventResult implements DAO<Long>{

    private static final Logger LOG = LoggerFactory.getLogger(DaoEventResult.class);

    private DaoEventResult() {
        LOG.debug("Create EventStruct");
    }

    private static class SingletonHelper {
        private static final DaoEventResult INSTANCE = new DaoEventResult();
    }

    public static DaoEventResult getInstance() {
        return DaoEventResult.SingletonHelper.INSTANCE;
    }

    @Override
    public List<Long> getAll(String path) {

        RsrParser document = RsrDocument.getDocument(path);
        List<Long> eventList = new ArrayList<>();

        for (int i = 0; i < document.eventImp().size(); i++) {

            BEImpStruct beImpStruct = new BEImpStruct(document, i);

            eventList.add(beImpStruct.eventStruct().getEvent().getIndex());
        }

        return eventList;
    }
}
