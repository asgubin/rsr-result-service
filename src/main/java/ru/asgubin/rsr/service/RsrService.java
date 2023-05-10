package ru.asgubin.rsr.service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import ru.asgubin.rsr.model.BeImpResult;
import ru.asgubin.rsr.model.McsResult;
import ru.asgubin.rsr.model.McsSummaryResult;
import ru.asgubin.rsr.model.UncsSummaryResult;

import java.io.IOException;
import java.util.List;

@WebService
public interface RsrService {

    @WebMethod
    List<BeImpResult> getBEImpResultList(String path) throws IOException;

    @WebMethod
    List<McsResult> getMCSResultList(String path) throws IOException;

    @WebMethod
    UncsSummaryResult getUNCSSummaryResult(String path) throws IOException;

    @WebMethod
    McsSummaryResult getMCSSummaryResult(String path) throws IOException;

    @WebMethod
    List<Long> getEventResult(String path) throws IOException;
}
