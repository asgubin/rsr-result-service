package ru.asgubin.rsr.DAO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.asgubin.rsr.model.McsSummaryResult;
import ru.asgubin.rsr.rsrFile.rsrParser.RsrParser;

public class DaoMcsSummary implements DaoStruct<McsSummaryResult> {
    private static final Logger LOG = LoggerFactory.getLogger(DaoMcsSummary.class);

    private DaoMcsSummary() {
        LOG.debug("Create DaoMcsSummary");
    }

    private static class SingletonHelper {
        private static final DaoMcsSummary INSTANCE = new DaoMcsSummary();
    }

    public static DaoMcsSummary getInstance() {
        return DaoMcsSummary.SingletonHelper.INSTANCE;
    }

    @Override
    public McsSummaryResult getStruct(String path) {

        RsrParser document = RsrDocument.getDocument(path);

        return new McsSummaryResult(document.mcsSummaryStruct().qBestApprox());
    }
}
