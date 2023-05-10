package ru.asgubin.rsr.DAO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.asgubin.rsr.model.BeImpResult;
import ru.asgubin.rsr.rsrFile.rsrParser.RsrParser;
import ru.asgubin.rsr.rsrFile.beImp.BEImpStruct;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DaoBEImp implements DAO<BeImpResult> {

    private static final Logger LOG = LoggerFactory.getLogger(DaoBEImp.class);

    private DaoBEImp() {
        LOG.debug("Create DaoBEImp");
    }

    private static class SingletonHelper {
        private static final DaoBEImp INSTANCE = new DaoBEImp();
    }

    public static DaoBEImp getInstance() {
        return SingletonHelper.INSTANCE;
    }

    @Override
    public List<BeImpResult> getAll(String path) {

        RsrParser document = RsrDocument.getDocument(path);
        List<BeImpResult> beImpList = new ArrayList<>();

        for (int i = 0; i < document.eventImp().size(); i++) {

            BEImpStruct beImpStruct = new BEImpStruct(document, i);

            beImpList.add(new BeImpResult(
                    beImpStruct.eventStruct().getEvent().getName().trim(),
                    beImpStruct.eventStruct().getEvent().getIndex(),
                    beImpStruct.getImpStruct().value(),
                    beImpStruct.getImpStruct().fv(),
                    beImpStruct.getImpStruct().fc(),
                    beImpStruct.getImpStruct().rdf(),
                    beImpStruct.getImpStruct().rif(),
                    beImpStruct.getImpStruct().sens()));
        }

        beImpList.sort(Collections.reverseOrder());

        return beImpList;
    }
}
