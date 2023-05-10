package ru.asgubin.rsr.config;

import jakarta.xml.ws.Endpoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.asgubin.rsr.service.RsrServiceImpl;
import ru.asgubin.rsr.utils.AppProperties;

public class RsrServicePublisher {

    private static final Logger LOG = LoggerFactory.getLogger(RsrServicePublisher.class);

    public static void main(String[] args) {

        LOG.debug("Going get serviceAddress from application.properties");
        String serviceAddress = AppProperties.access().getProperty("serviceAddress");
        Object serviceImpl = new RsrServiceImpl();

        Endpoint.publish(serviceAddress, serviceImpl);
        LOG.debug("Rsr ru.asgubin.rsr.service.service published at : " + serviceAddress + "?wsdl");
    }
}
