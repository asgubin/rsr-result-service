package ru.asgubin.rsr.rsrFile.rsrParser;// This is a generated file! Please edit source .ksy file and use kaitai-struct-compiler to rebuild

import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStruct;
import io.kaitai.struct.KaitaiStream;
import java.io.IOException;
import java.util.ArrayList;
import java.nio.charset.Charset;

public class RsrParser extends KaitaiStruct {
    public static RsrParser fromFile(String fileName) throws IOException {
        return new RsrParser(new ByteBufferKaitaiStream(fileName));
    }

    public RsrParser(KaitaiStream _io) {
        this(_io, null, null);
    }

    public RsrParser(KaitaiStream _io, KaitaiStruct _parent) {
        this(_io, _parent, null);
    }

    public RsrParser(KaitaiStream _io, KaitaiStruct _parent, RsrParser _root) {
        super(_io);
        this._parent = _parent;
        this._root = _root == null ? this : _root;
        _read();
    }
    private void _read() {
        this.numHeaders = this._io.readU2le();
        this.headers = new ArrayList<Header>();
        for (int i = 0; i < numHeaders(); i++) {
            this.headers.add(new Header(this._io, this, _root));
        }
    }
    public static class CcfEvent extends KaitaiStruct {
        public static CcfEvent fromFile(String fileName) throws IOException {
            return new CcfEvent(new ByteBufferKaitaiStream(fileName));
        }

        public CcfEvent(KaitaiStream _io) {
            this(_io, null, null);
        }

        public CcfEvent(KaitaiStream _io, RsrParser _parent) {
            this(_io, _parent, null);
        }

        public CcfEvent(KaitaiStream _io, RsrParser _parent, RsrParser _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.index = this._io.readU4le();
            this.name = new String(this._io.readBytes(20), Charset.forName("cp1251"));
            this.ccfModel = this._io.readU2le();
            this.relModel = this._io.readU2le();
            this.events = this._io.readU2le();
            this.totEvents = this._io.readU2le();
            this.lastPar = this._io.readU4le();
        }
        private long index;
        private String name;
        private int ccfModel;
        private int relModel;
        private int events;
        private int totEvents;
        private long lastPar;
        private RsrParser _root;
        private RsrParser _parent;
        public long index() { return index; }
        public String name() { return name; }
        public int ccfModel() { return ccfModel; }
        public int relModel() { return relModel; }
        public int events() { return events; }
        public int totEvents() { return totEvents; }
        public long lastPar() { return lastPar; }
        public RsrParser _root() { return _root; }
        public RsrParser _parent() { return _parent; }
    }
    public static class BeEvent extends KaitaiStruct {
        public static BeEvent fromFile(String fileName) throws IOException {
            return new BeEvent(new ByteBufferKaitaiStream(fileName));
        }

        public BeEvent(KaitaiStream _io) {
            this(_io, null, null);
        }

        public BeEvent(KaitaiStream _io, RsrParser _parent) {
            this(_io, _parent, null);
        }

        public BeEvent(KaitaiStream _io, RsrParser _parent, RsrParser _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.index = this._io.readU4le();
            this.name = new String(this._io.readBytes(20), Charset.forName("cp1251"));
            this.relModel = this._io.readU2le();
            this.lastPar = this._io.readU4le();
            this.initEnabl = this._io.readU2le();
        }
        private long index;
        private String name;
        private int relModel;
        private long lastPar;
        private int initEnabl;
        private RsrParser _root;
        private RsrParser _parent;
        public long index() { return index; }
        public String name() { return name; }
        public int relModel() { return relModel; }
        public long lastPar() { return lastPar; }
        public int initEnabl() { return initEnabl; }
        public RsrParser _root() { return _root; }
        public RsrParser _parent() { return _parent; }
    }
    public static class ImpStruct extends KaitaiStruct {
        public static ImpStruct fromFile(String fileName) throws IOException {
            return new ImpStruct(new ByteBufferKaitaiStream(fileName));
        }

        public ImpStruct(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ImpStruct(KaitaiStream _io, RsrParser _parent) {
            this(_io, _parent, null);
        }

        public ImpStruct(KaitaiStream _io, RsrParser _parent, RsrParser _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.index = this._io.readU4le();
            this.value = this._io.readF8le();
            this.fv = this._io.readF8le();
            this.rdf = this._io.readF8le();
            this.fc = this._io.readF8le();
            this.rif = this._io.readF8le();
            this.sensHigh = this._io.readF8le();
            this.sensLow = this._io.readF8le();
            this.sens = this._io.readF8le();
        }
        private long index;
        private double value;
        private double fv;
        private double rdf;
        private double fc;
        private double rif;
        private double sensHigh;
        private double sensLow;
        private double sens;
        private RsrParser _root;
        private RsrParser _parent;
        public long index() { return index; }
        public double value() { return value; }
        public double fv() { return fv; }
        public double rdf() { return rdf; }
        public double fc() { return fc; }
        public double rif() { return rif; }
        public double sensHigh() { return sensHigh; }
        public double sensLow() { return sensLow; }
        public double sens() { return sens; }
        public RsrParser _root() { return _root; }
        public RsrParser _parent() { return _parent; }
    }
    public static class LargeNumStruct extends KaitaiStruct {
        public static LargeNumStruct fromFile(String fileName) throws IOException {
            return new LargeNumStruct(new ByteBufferKaitaiStream(fileName));
        }

        public LargeNumStruct(KaitaiStream _io) {
            this(_io, null, null);
        }

        public LargeNumStruct(KaitaiStream _io, RsrParser.McsSummaryStruct _parent) {
            this(_io, _parent, null);
        }

        public LargeNumStruct(KaitaiStream _io, RsrParser.McsSummaryStruct _parent, RsrParser _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.mantisa = this._io.readF8le();
            this.exp = this._io.readU4le();
        }
        private double mantisa;
        private long exp;
        private RsrParser _root;
        private RsrParser.McsSummaryStruct _parent;
        public double mantisa() { return mantisa; }
        public long exp() { return exp; }
        public RsrParser _root() { return _root; }
        public RsrParser.McsSummaryStruct _parent() { return _parent; }
    }
    public static class EventStruct extends KaitaiStruct {
        public static EventStruct fromFile(String fileName) throws IOException {
            return new EventStruct(new ByteBufferKaitaiStream(fileName));
        }

        public EventStruct(KaitaiStream _io) {
            this(_io, null, null);
        }

        public EventStruct(KaitaiStream _io, RsrParser _parent) {
            this(_io, _parent, null);
        }

        public EventStruct(KaitaiStream _io, RsrParser _parent, RsrParser _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.index = this._io.readU4le();
            this.eventType = this._io.readU2le();
            this.mean = this._io.readF8le();
            this.fW = this._io.readF8le();
            this.initEnable = this._io.readU2le();
        }
        private long index;
        private int eventType;
        private double mean;
        private double fW;
        private int initEnable;
        private RsrParser _root;
        private RsrParser _parent;
        public long index() { return index; }
        public int eventType() { return eventType; }
        public double mean() { return mean; }
        public double fW() { return fW; }
        public int initEnable() { return initEnable; }
        public RsrParser _root() { return _root; }
        public RsrParser _parent() { return _parent; }
    }
    public static class McsStruct extends KaitaiStruct {
        public static McsStruct fromFile(String fileName) throws IOException {
            return new McsStruct(new ByteBufferKaitaiStream(fileName));
        }

        public McsStruct(KaitaiStream _io) {
            this(_io, null, null);
        }

        public McsStruct(KaitaiStream _io, RsrParser _parent) {
            this(_io, _parent, null);
        }

        public McsStruct(KaitaiStream _io, RsrParser _parent, RsrParser _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.mean = this._io.readF8le();
            this.firstEvent = this._io.readU4le();
            this.lastEvent = this._io.readU4le();
        }
        private double mean;
        private long firstEvent;
        private long lastEvent;
        private RsrParser _root;
        private RsrParser _parent;
        public double mean() { return mean; }
        public long firstEvent() { return firstEvent; }
        public long lastEvent() { return lastEvent; }
        public RsrParser _root() { return _root; }
        public RsrParser _parent() { return _parent; }
    }
    public static class UncsSummaryStruct extends KaitaiStruct {
        public static UncsSummaryStruct fromFile(String fileName) throws IOException {
            return new UncsSummaryStruct(new ByteBufferKaitaiStream(fileName));
        }

        public UncsSummaryStruct(KaitaiStream _io) {
            this(_io, null, null);
        }

        public UncsSummaryStruct(KaitaiStream _io, RsrParser _parent) {
            this(_io, _parent, null);
        }

        public UncsSummaryStruct(KaitaiStream _io, RsrParser _parent, RsrParser _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.date = new String(this._io.readBytes(20), Charset.forName("cp1251"));
            this.calcType = this._io.readU2le();
            this.time = this._io.readF8le();
            this.absCutOff = this._io.readF8le();
            this.simulations = this._io.readU4le();
            this.simType = this._io.readU2le();
            this.seed = this._io.readU2le();
            this.rngType = this._io.readU2le();
            this.mean = this._io.readF8le();
            this.median = this._io.readF8le();
            this.f5th = this._io.readF8le();
            this.f95th = this._io.readF8le();
            this.runTimeTot = this._io.readF8le();
        }
        private String date;
        private int calcType;
        private double time;
        private double absCutOff;
        private long simulations;
        private int simType;
        private int seed;
        private int rngType;
        private double mean;
        private double median;
        private double f5th;
        private double f95th;
        private double runTimeTot;
        private RsrParser _root;
        private RsrParser _parent;
        public String date() { return date; }
        public int calcType() { return calcType; }
        public double time() { return time; }
        public double absCutOff() { return absCutOff; }
        public long simulations() { return simulations; }
        public int simType() { return simType; }
        public int seed() { return seed; }
        public int rngType() { return rngType; }
        public double mean() { return mean; }
        public double median() { return median; }
        public double f5th() { return f5th; }
        public double f95th() { return f95th; }
        public double runTimeTot() { return runTimeTot; }
        public RsrParser _root() { return _root; }
        public RsrParser _parent() { return _parent; }
    }
    public static class McsSummaryStruct extends KaitaiStruct {
        public static McsSummaryStruct fromFile(String fileName) throws IOException {
            return new McsSummaryStruct(new ByteBufferKaitaiStream(fileName));
        }

        public McsSummaryStruct(KaitaiStream _io) {
            this(_io, null, null);
        }

        public McsSummaryStruct(KaitaiStream _io, RsrParser _parent) {
            this(_io, _parent, null);
        }

        public McsSummaryStruct(KaitaiStream _io, RsrParser _parent, RsrParser _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.date = new String(this._io.readBytes(20), Charset.forName("cp1251"));
            this.inputFormat = this._io.readU2le();
            this.acaseType = this._io.readU2le();
            this.acaseSpec1Rsat = this._io.readU4le();
            this.acaseSpec1Rsatexe = this._io.readU4le();
            this.acaseSpec1Rsmisc = this._io.readU4le();
            this.acaseSpec1Rsuit = this._io.readU4le();
            this.acaseSpec1Rsmcs = this._io.readU4le();
            this.acaseSpec2 = this._io.readU4le();
            this.bcSetUsed = this._io.readU4le();
            this.calcType = this._io.readU2le();
            this.time = this._io.readF8le();
            this.cutOffType = this._io.readU2le();
            this.absCutOff = this._io.readF8le();
            this.relCutOff = this._io.readF8le();
            this.approx = this._io.readU2le();
            this.includeCccf = this._io.readU2le();
            this.negationHandling = this._io.readU2le();
            this.saveCutOff = this._io.readF8le();
            this.maxSaveModMcs = this._io.readU4le();
            this.maxSaveDemoDmcs = this._io.readU4le();
            this.events = this._io.readU4le();
            this.beEvents = this._io.readU4le();
            this.ccfEvents = this._io.readU4le();
            this.gates = this._io.readU4le();
            this.primaryEvents = this._io.readU4le();
            this.modEvents = this._io.readU4le();
            this.modBeEvents = this._io.readU4le();
            this.modCcfEvents = this._io.readU4le();
            this.modGates = this._io.readU4le();
            this.modPrimaryEvents = this._io.readU4le();
            this.modules = this._io.readU4le();
            this.modChildren = this._io.readU4le();
            this.bicsMod = new LargeNumStruct(this._io, this, _root);
            this.bicsDemod = new LargeNumStruct(this._io, this, _root);
            this.mcsMod = this._io.readU4le();
            this.totDemodMcs = new LargeNumStruct(this._io, this, _root);
            this.mcsDemod = this._io.readU4le();
            this.mcsModSaved = this._io.readU4le();
            this.mcsDemodSaved = this._io.readU4le();
            this.fQ = new ArrayList<Double>();
            for (int i = 0; i < 4; i++) {
                this.fQ.add(this._io.readF8le());
            }
            this.qBestApprox = this._io.readF8le();
            this.fW = new ArrayList<Double>();
            for (int i = 0; i < 4; i++) {
                this.fW.add(this._io.readF8le());
            }
            this.wBestApprox = this._io.readF8le();
            this.trunceErrorMod = this._io.readF8le();
            this.trunceErrorDemod = this._io.readF8le();
            this.trunceErrorTot = this._io.readF8le();
            this.usedCutoffDemod = this._io.readF8le();
            this.usedCutoffMod = this._io.readF8le();
            this.runTimeTot = this._io.readF8le();
            this.runTimeMcs = this._io.readF8le();
        }
        private String date;
        private int inputFormat;
        private int acaseType;
        private long acaseSpec1Rsat;
        private long acaseSpec1Rsatexe;
        private long acaseSpec1Rsmisc;
        private long acaseSpec1Rsuit;
        private long acaseSpec1Rsmcs;
        private long acaseSpec2;
        private long bcSetUsed;
        private int calcType;
        private double time;
        private int cutOffType;
        private double absCutOff;
        private double relCutOff;
        private int approx;
        private int includeCccf;
        private int negationHandling;
        private double saveCutOff;
        private long maxSaveModMcs;
        private long maxSaveDemoDmcs;
        private long events;
        private long beEvents;
        private long ccfEvents;
        private long gates;
        private long primaryEvents;
        private long modEvents;
        private long modBeEvents;
        private long modCcfEvents;
        private long modGates;
        private long modPrimaryEvents;
        private long modules;
        private long modChildren;
        private LargeNumStruct bicsMod;
        private LargeNumStruct bicsDemod;
        private long mcsMod;
        private LargeNumStruct totDemodMcs;
        private long mcsDemod;
        private long mcsModSaved;
        private long mcsDemodSaved;
        private ArrayList<Double> fQ;
        private double qBestApprox;
        private ArrayList<Double> fW;
        private double wBestApprox;
        private double trunceErrorMod;
        private double trunceErrorDemod;
        private double trunceErrorTot;
        private double usedCutoffDemod;
        private double usedCutoffMod;
        private double runTimeTot;
        private double runTimeMcs;
        private RsrParser _root;
        private RsrParser _parent;
        public String date() { return date; }
        public int inputFormat() { return inputFormat; }
        public int acaseType() { return acaseType; }
        public long acaseSpec1Rsat() { return acaseSpec1Rsat; }
        public long acaseSpec1Rsatexe() { return acaseSpec1Rsatexe; }
        public long acaseSpec1Rsmisc() { return acaseSpec1Rsmisc; }
        public long acaseSpec1Rsuit() { return acaseSpec1Rsuit; }
        public long acaseSpec1Rsmcs() { return acaseSpec1Rsmcs; }
        public long acaseSpec2() { return acaseSpec2; }
        public long bcSetUsed() { return bcSetUsed; }
        public int calcType() { return calcType; }
        public double time() { return time; }
        public int cutOffType() { return cutOffType; }
        public double absCutOff() { return absCutOff; }
        public double relCutOff() { return relCutOff; }
        public int approx() { return approx; }
        public int includeCccf() { return includeCccf; }
        public int negationHandling() { return negationHandling; }
        public double saveCutOff() { return saveCutOff; }
        public long maxSaveModMcs() { return maxSaveModMcs; }
        public long maxSaveDemoDmcs() { return maxSaveDemoDmcs; }
        public long events() { return events; }
        public long beEvents() { return beEvents; }
        public long ccfEvents() { return ccfEvents; }
        public long gates() { return gates; }
        public long primaryEvents() { return primaryEvents; }
        public long modEvents() { return modEvents; }
        public long modBeEvents() { return modBeEvents; }
        public long modCcfEvents() { return modCcfEvents; }
        public long modGates() { return modGates; }
        public long modPrimaryEvents() { return modPrimaryEvents; }
        public long modules() { return modules; }
        public long modChildren() { return modChildren; }
        public LargeNumStruct bicsMod() { return bicsMod; }
        public LargeNumStruct bicsDemod() { return bicsDemod; }
        public long mcsMod() { return mcsMod; }
        public LargeNumStruct totDemodMcs() { return totDemodMcs; }
        public long mcsDemod() { return mcsDemod; }
        public long mcsModSaved() { return mcsModSaved; }
        public long mcsDemodSaved() { return mcsDemodSaved; }
        public ArrayList<Double> fQ() { return fQ; }
        public double qBestApprox() { return qBestApprox; }
        public ArrayList<Double> fW() { return fW; }
        public double wBestApprox() { return wBestApprox; }
        public double trunceErrorMod() { return trunceErrorMod; }
        public double trunceErrorDemod() { return trunceErrorDemod; }
        public double trunceErrorTot() { return trunceErrorTot; }
        public double usedCutoffDemod() { return usedCutoffDemod; }
        public double usedCutoffMod() { return usedCutoffMod; }
        public double runTimeTot() { return runTimeTot; }
        public double runTimeMcs() { return runTimeMcs; }
        public RsrParser _root() { return _root; }
        public RsrParser _parent() { return _parent; }
    }
    public static class McsEventStruct extends KaitaiStruct {
        public static McsEventStruct fromFile(String fileName) throws IOException {
            return new McsEventStruct(new ByteBufferKaitaiStream(fileName));
        }

        public McsEventStruct(KaitaiStream _io) {
            this(_io, null, null);
        }

        public McsEventStruct(KaitaiStream _io, RsrParser _parent) {
            this(_io, _parent, null);
        }

        public McsEventStruct(KaitaiStream _io, RsrParser _parent, RsrParser _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.event = this._io.readU4le();
        }
        private long event;
        private RsrParser _root;
        private RsrParser _parent;
        public long event() { return event; }
        public RsrParser _root() { return _root; }
        public RsrParser _parent() { return _parent; }
    }
    public static class Header extends KaitaiStruct {
        public static Header fromFile(String fileName) throws IOException {
            return new Header(new ByteBufferKaitaiStream(fileName));
        }

        public Header(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Header(KaitaiStream _io, RsrParser _parent) {
            this(_io, _parent, null);
        }

        public Header(KaitaiStream _io, RsrParser _parent, RsrParser _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.count = this._io.readU4le();
            this.offset = this._io.readU4le();
            this.length = this._io.readU4le();
        }
        private long count;
        private long offset;
        private long length;
        private RsrParser _root;
        private RsrParser _parent;
        public long count() { return count; }
        public long offset() { return offset; }
        public long length() { return length; }
        public RsrParser _root() { return _root; }
        public RsrParser _parent() { return _parent; }
    }
    public static class ModEvent extends KaitaiStruct {
        public static ModEvent fromFile(String fileName) throws IOException {
            return new ModEvent(new ByteBufferKaitaiStream(fileName));
        }

        public ModEvent(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ModEvent(KaitaiStream _io, RsrParser _parent) {
            this(_io, _parent, null);
        }

        public ModEvent(KaitaiStream _io, RsrParser _parent, RsrParser _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.index = this._io.readU4le();
            this.name = new String(this._io.readBytes(20), Charset.forName("cp1251"));
            this.modType = this._io.readU2le();
            this.lastChild = this._io.readU4le();
        }
        private long index;
        private String name;
        private int modType;
        private long lastChild;
        private RsrParser _root;
        private RsrParser _parent;
        public long index() { return index; }
        public String name() { return name; }
        public int modType() { return modType; }
        public long lastChild() { return lastChild; }
        public RsrParser _root() { return _root; }
        public RsrParser _parent() { return _parent; }
    }
    public static class ModulEvent extends KaitaiStruct {
        public static ModulEvent fromFile(String fileName) throws IOException {
            return new ModulEvent(new ByteBufferKaitaiStream(fileName));
        }

        public ModulEvent(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ModulEvent(KaitaiStream _io, RsrParser _parent) {
            this(_io, _parent, null);
        }

        public ModulEvent(KaitaiStream _io, RsrParser _parent, RsrParser _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.pos = this._io.readU4le();
        }
        private long pos;
        private RsrParser _root;
        private RsrParser _parent;
        public long pos() { return pos; }
        public RsrParser _root() { return _root; }
        public RsrParser _parent() { return _parent; }
    }
    private ArrayList<EventStruct> eventStruct;
    public ArrayList<EventStruct> eventStruct() {
        if (this.eventStruct != null)
            return this.eventStruct;
        long _pos = this._io.pos();
        this._io.seek(headers().get((int) 10).offset());
        this._raw_eventStruct = new ArrayList<byte[]>();
        this.eventStruct = new ArrayList<EventStruct>();
        for (int i = 0; i < headers().get((int) 10).count(); i++) {
            this._raw_eventStruct.add(this._io.readBytes((headers().get((int) 10).length() / headers().get((int) 10).count())));
            KaitaiStream _io__raw_eventStruct = new ByteBufferKaitaiStream(_raw_eventStruct.get(_raw_eventStruct.size() - 1));
            this.eventStruct.add(new EventStruct(_io__raw_eventStruct, this, _root));
        }
        this._io.seek(_pos);
        return this.eventStruct;
    }
    private ArrayList<ImpStruct> eventImp;
    public ArrayList<ImpStruct> eventImp() {
        if (this.eventImp != null)
            return this.eventImp;
        long _pos = this._io.pos();
        this._io.seek(headers().get((int) 17).offset());
        this._raw_eventImp = new ArrayList<byte[]>();
        this.eventImp = new ArrayList<ImpStruct>();
        for (int i = 0; i < headers().get((int) 17).count(); i++) {
            this._raw_eventImp.add(this._io.readBytes((headers().get((int) 17).length() / headers().get((int) 17).count())));
            KaitaiStream _io__raw_eventImp = new ByteBufferKaitaiStream(_raw_eventImp.get(_raw_eventImp.size() - 1));
            this.eventImp.add(new ImpStruct(_io__raw_eventImp, this, _root));
        }
        this._io.seek(_pos);
        return this.eventImp;
    }
    private UncsSummaryStruct uncsSummaryStruct;
    public UncsSummaryStruct uncsSummaryStruct() {
        if (this.uncsSummaryStruct != null)
            return this.uncsSummaryStruct;
        long _pos = this._io.pos();
        this._io.seek(headers().get((int) 1).offset());
        this._raw_uncsSummaryStruct = this._io.readBytes(headers().get((int) 1).length());
        KaitaiStream _io__raw_uncsSummaryStruct = new ByteBufferKaitaiStream(_raw_uncsSummaryStruct);
        this.uncsSummaryStruct = new UncsSummaryStruct(_io__raw_uncsSummaryStruct, this, _root);
        this._io.seek(_pos);
        return this.uncsSummaryStruct;
    }
    private ArrayList<BeEvent> beEvent;
    public ArrayList<BeEvent> beEvent() {
        if (this.beEvent != null)
            return this.beEvent;
        long _pos = this._io.pos();
        this._io.seek(headers().get((int) 11).offset());
        this._raw_beEvent = new ArrayList<byte[]>();
        this.beEvent = new ArrayList<BeEvent>();
        for (int i = 0; i < headers().get((int) 11).count(); i++) {
            this._raw_beEvent.add(this._io.readBytes((headers().get((int) 11).length() / headers().get((int) 11).count())));
            KaitaiStream _io__raw_beEvent = new ByteBufferKaitaiStream(_raw_beEvent.get(_raw_beEvent.size() - 1));
            this.beEvent.add(new BeEvent(_io__raw_beEvent, this, _root));
        }
        this._io.seek(_pos);
        return this.beEvent;
    }
    private ArrayList<ModulEvent> modulEvent;
    public ArrayList<ModulEvent> modulEvent() {
        if (this.modulEvent != null)
            return this.modulEvent;
        long _pos = this._io.pos();
        this._io.seek(headers().get((int) 7).offset());
        this._raw_modulEvent = new ArrayList<byte[]>();
        this.modulEvent = new ArrayList<ModulEvent>();
        for (int i = 0; i < headers().get((int) 7).count(); i++) {
            this._raw_modulEvent.add(this._io.readBytes((headers().get((int) 7).length() / headers().get((int) 7).count())));
            KaitaiStream _io__raw_modulEvent = new ByteBufferKaitaiStream(_raw_modulEvent.get(_raw_modulEvent.size() - 1));
            this.modulEvent.add(new ModulEvent(_io__raw_modulEvent, this, _root));
        }
        this._io.seek(_pos);
        return this.modulEvent;
    }
    private ArrayList<CcfEvent> ccfEvent;
    public ArrayList<CcfEvent> ccfEvent() {
        if (this.ccfEvent != null)
            return this.ccfEvent;
        long _pos = this._io.pos();
        this._io.seek(headers().get((int) 12).offset());
        this._raw_ccfEvent = new ArrayList<byte[]>();
        this.ccfEvent = new ArrayList<CcfEvent>();
        for (int i = 0; i < headers().get((int) 12).count(); i++) {
            this._raw_ccfEvent.add(this._io.readBytes((headers().get((int) 12).length() / headers().get((int) 12).count())));
            KaitaiStream _io__raw_ccfEvent = new ByteBufferKaitaiStream(_raw_ccfEvent.get(_raw_ccfEvent.size() - 1));
            this.ccfEvent.add(new CcfEvent(_io__raw_ccfEvent, this, _root));
        }
        this._io.seek(_pos);
        return this.ccfEvent;
    }
    private McsSummaryStruct mcsSummaryStruct;
    public McsSummaryStruct mcsSummaryStruct() {
        if (this.mcsSummaryStruct != null)
            return this.mcsSummaryStruct;
        long _pos = this._io.pos();
        this._io.seek(headers().get((int) 0).offset());
        this._raw_mcsSummaryStruct = this._io.readBytes(headers().get((int) 0).length());
        KaitaiStream _io__raw_mcsSummaryStruct = new ByteBufferKaitaiStream(_raw_mcsSummaryStruct);
        this.mcsSummaryStruct = new McsSummaryStruct(_io__raw_mcsSummaryStruct, this, _root);
        this._io.seek(_pos);
        return this.mcsSummaryStruct;
    }
    private ArrayList<ModEvent> modEvent;
    public ArrayList<ModEvent> modEvent() {
        if (this.modEvent != null)
            return this.modEvent;
        long _pos = this._io.pos();
        this._io.seek(headers().get((int) 6).offset());
        this._raw_modEvent = new ArrayList<byte[]>();
        this.modEvent = new ArrayList<ModEvent>();
        for (int i = 0; i < headers().get((int) 6).count(); i++) {
            this._raw_modEvent.add(this._io.readBytes((headers().get((int) 6).length() / headers().get((int) 6).count())));
            KaitaiStream _io__raw_modEvent = new ByteBufferKaitaiStream(_raw_modEvent.get(_raw_modEvent.size() - 1));
            this.modEvent.add(new ModEvent(_io__raw_modEvent, this, _root));
        }
        this._io.seek(_pos);
        return this.modEvent;
    }
    private ArrayList<McsEventStruct> mcsEventStruct;
    public ArrayList<McsEventStruct> mcsEventStruct() {
        if (this.mcsEventStruct != null)
            return this.mcsEventStruct;
        long _pos = this._io.pos();
        this._io.seek(headers().get((int) 9).offset());
        this._raw_mcsEventStruct = new ArrayList<byte[]>();
        this.mcsEventStruct = new ArrayList<McsEventStruct>();
        for (int i = 0; i < headers().get((int) 9).count(); i++) {
            this._raw_mcsEventStruct.add(this._io.readBytes((headers().get((int) 9).length() / headers().get((int) 9).count())));
            KaitaiStream _io__raw_mcsEventStruct = new ByteBufferKaitaiStream(_raw_mcsEventStruct.get(_raw_mcsEventStruct.size() - 1));
            this.mcsEventStruct.add(new McsEventStruct(_io__raw_mcsEventStruct, this, _root));
        }
        this._io.seek(_pos);
        return this.mcsEventStruct;
    }
    private ArrayList<McsStruct> mcsStruct;
    public ArrayList<McsStruct> mcsStruct() {
        if (this.mcsStruct != null)
            return this.mcsStruct;
        long _pos = this._io.pos();
        this._io.seek(headers().get((int) 8).offset());
        this._raw_mcsStruct = new ArrayList<byte[]>();
        this.mcsStruct = new ArrayList<McsStruct>();
        for (int i = 0; i < headers().get((int) 8).count(); i++) {
            this._raw_mcsStruct.add(this._io.readBytes((headers().get((int) 8).length() / headers().get((int) 8).count())));
            KaitaiStream _io__raw_mcsStruct = new ByteBufferKaitaiStream(_raw_mcsStruct.get(_raw_mcsStruct.size() - 1));
            this.mcsStruct.add(new McsStruct(_io__raw_mcsStruct, this, _root));
        }
        this._io.seek(_pos);
        return this.mcsStruct;
    }
    private int numHeaders;
    private ArrayList<Header> headers;
    private RsrParser _root;
    private KaitaiStruct _parent;
    private ArrayList<byte[]> _raw_eventStruct;
    private ArrayList<byte[]> _raw_eventImp;
    private byte[] _raw_uncsSummaryStruct;
    private ArrayList<byte[]> _raw_beEvent;
    private ArrayList<byte[]> _raw_modulEvent;
    private ArrayList<byte[]> _raw_ccfEvent;
    private byte[] _raw_mcsSummaryStruct;
    private ArrayList<byte[]> _raw_modEvent;
    private ArrayList<byte[]> _raw_mcsEventStruct;
    private ArrayList<byte[]> _raw_mcsStruct;
    public int numHeaders() { return numHeaders; }
    public ArrayList<Header> headers() { return headers; }
    public RsrParser _root() { return _root; }
    public KaitaiStruct _parent() { return _parent; }
    public ArrayList<byte[]> _raw_eventStruct() { return _raw_eventStruct; }
    public ArrayList<byte[]> _raw_eventImp() { return _raw_eventImp; }
    public byte[] _raw_uncsSummaryStruct() { return _raw_uncsSummaryStruct; }
    public ArrayList<byte[]> _raw_beEvent() { return _raw_beEvent; }
    public ArrayList<byte[]> _raw_modulEvent() { return _raw_modulEvent; }
    public ArrayList<byte[]> _raw_ccfEvent() { return _raw_ccfEvent; }
    public byte[] _raw_mcsSummaryStruct() { return _raw_mcsSummaryStruct; }
    public ArrayList<byte[]> _raw_modEvent() { return _raw_modEvent; }
    public ArrayList<byte[]> _raw_mcsEventStruct() { return _raw_mcsEventStruct; }
    public ArrayList<byte[]> _raw_mcsStruct() { return _raw_mcsStruct; }
}
