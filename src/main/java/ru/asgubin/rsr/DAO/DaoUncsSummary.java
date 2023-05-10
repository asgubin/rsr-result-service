package ru.asgubin.rsr.DAO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.asgubin.rsr.model.UncsSummaryResult;
import ru.asgubin.rsr.rsrFile.rsrParser.RsrParser;

public class DaoUncsSummary implements DaoStruct<UncsSummaryResult> {
    private static final Logger LOG = LoggerFactory.getLogger(DaoUncsSummary.class);

    private DaoUncsSummary() {
        LOG.debug("Create DaoUncsSummary");
    }

    private static class SingletonHelper {
        private static final DaoUncsSummary INSTANCE = new DaoUncsSummary();
    }

    public static DaoUncsSummary getInstance() {
        return DaoUncsSummary.SingletonHelper.INSTANCE;
    }

    @Override
    public UncsSummaryResult getStruct(String path) {

        RsrParser document = RsrDocument.getDocument(path);

        return new UncsSummaryResult(
                document.uncsSummaryStruct().mean(),
                document.uncsSummaryStruct().median(),
                document.uncsSummaryStruct().f5th(),
                document.uncsSummaryStruct().f95th());
    }
}
