package ru.asgubin.rsr.model;

public class BeImpResult implements Comparable<BeImpResult> {
    private String name;
    private long index;
    private double value;
    private double fv;
    private double fc;
    private double rdf;
    private double rif;
    private double sens;

    public BeImpResult() {

    }

    public BeImpResult(String name, long index, double value, double fv, double fc, double rdf, double rif, double sens) {
        this.name = name;
        this.index = index;
        this.value = value;
        this.fv = fv;
        this.fc = fc;
        this.rdf = rdf;
        this.rif = rif;
        this.sens = sens;
    }

    @Override
    public int compareTo(BeImpResult o) {
        return Double.compare(this.getSens(), o.getSens());
    }


    @Override
    public String toString() {
        return String.format(
                "%s;%d;%.2E;%.2E;%.2E;%.2E;%.2E;%.2E;",
                name, index, value, fv, fc, rdf, rif, sens);
    }

    public String getName() {
        return name;
    }

    public long getIndex() {
        return index;
    }

    public double getValue() {
        return value;
    }

    public double getFv() {
        return fv;
    }

    public double getFc() {
        return fc;
    }

    public double getRdf() {
        return rdf;
    }

    public double getRif() {
        return rif;
    }

    public double getSens() {
        return sens;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIndex(long index) {
        this.index = index;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setFv(double fv) {
        this.fv = fv;
    }

    public void setFc(double fc) {
        this.fc = fc;
    }

    public void setRdf(double rdf) {
        this.rdf = rdf;
    }

    public void setRif(double rif) {
        this.rif = rif;
    }

    public void setSens(double sens) {
        this.sens = sens;
    }
}
