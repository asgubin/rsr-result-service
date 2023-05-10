package ru.asgubin.rsr.service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.asgubin.rsr.DAO.DaoBEImp;
import ru.asgubin.rsr.DAO.DaoEventResult;
import ru.asgubin.rsr.DAO.DaoMCS;
import ru.asgubin.rsr.DAO.DaoMcsSummary;
import ru.asgubin.rsr.DAO.DaoUncsSummary;
import ru.asgubin.rsr.model.BeImpResult;
import ru.asgubin.rsr.model.McsResult;
import ru.asgubin.rsr.model.McsSummaryResult;
import ru.asgubin.rsr.model.UncsSummaryResult;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

@WebService(endpointInterface = "ru.asgubin.rsr.service.RsrService")
public class RsrServiceImpl implements RsrService {

    private static final Logger LOG = LoggerFactory.getLogger(RsrServiceImpl.class);

    private final DaoBEImp daoBEImp = DaoBEImp.getInstance();
    private final DaoMCS daoMCS = DaoMCS.getInstance();
    private final DaoMcsSummary daoMcsSummary = DaoMcsSummary.getInstance();
    private final DaoUncsSummary daoUncsSummary = DaoUncsSummary.getInstance();
    private final DaoEventResult daoEventResult = DaoEventResult.getInstance();

    @Override
    @WebMethod
    public List<BeImpResult> getBEImpResultList(String path) throws IOException {
        LOG.debug("getBEImpList called");

        if (!Files.isRegularFile(Paths.get(path))) {

            LOG.error("The file does not exist " + path);

            throw new IOException();
        }

        return daoBEImp.getAll(path);
    }

    @Override
    @WebMethod
    public List<McsResult> getMCSResultList(String path) throws IOException {
        LOG.debug("getMCSList called");

        if (!Files.isRegularFile(Paths.get(path))) {

            LOG.error("The file does not exist " + path);

            throw new IOException();
        }

        return daoMCS.getAll(path);
    }

    @Override
    @WebMethod
    public UncsSummaryResult getUNCSSummaryResult(String path) throws IOException {
        LOG.debug("getUNCSSummaryResult called");

        if (!Files.isRegularFile(Paths.get(path))) {

            LOG.error("The file does not exist " + path);

            throw new IOException();
        }

        return daoUncsSummary.getStruct(path);
    }

    @Override
    @WebMethod
    public McsSummaryResult getMCSSummaryResult(String path) throws IOException {
        LOG.debug("getMCSSummaryResult called");

        if (!Files.isRegularFile(Paths.get(path))) {

            LOG.error("The file does not exist " + path);

            throw new IOException();
        }

        return daoMcsSummary.getStruct(path);
    }

    @Override
    @WebMethod
    public List<Long> getEventResult(String path) throws IOException {
        LOG.debug("getEventResult called");

        if (!Files.isRegularFile(Paths.get(path))) {

            LOG.error("The file does not exist " + path);

            throw new IOException();
        }

        return daoEventResult.getAll(path);
    }
}
