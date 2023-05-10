package ru.asgubin.rsr.DAO;

import io.kaitai.struct.ByteBufferKaitaiStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.asgubin.rsr.rsrFile.rsrParser.RsrParser;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class RsrDocument {

    private static final Logger LOG = LoggerFactory.getLogger(RsrDocument.class);

//    private final RsrParser parser;

    private RsrDocument() {
        LOG.debug("Create RsrDataFactory");
    }

    static public RsrParser getDocument(String path) {

        LOG.debug("Going read all bytes from file " + path);
        RsrParser parser = null;
        try {
            LOG.debug("Going create *.RSR parser for file " + path);
            byte[] data = Files.readAllBytes(Paths.get(path));

            parser = new RsrParser(new ByteBufferKaitaiStream(data));
            LOG.debug("*.RSR parser successful created for file " + path);

        } catch (IOException e) {
            e.printStackTrace();
        }
        LOG.debug("All bytes successful read from file " + path);

        return parser;
    }
}
