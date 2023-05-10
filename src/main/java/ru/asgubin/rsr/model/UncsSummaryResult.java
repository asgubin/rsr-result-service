package ru.asgubin.rsr.model;

public class UncsSummaryResult {
    private double mean;
    private double median;
    private double f5th;
    private double f95th;

    public UncsSummaryResult() {

    }

    public UncsSummaryResult(double mean, double median, double f_5th, double f_95th) {
        this.mean = mean;
        this.median = median;
        this.f5th = f_5th;
        this.f95th = f_95th;
    }

    public double getMean() {
        return mean;
    }

    public void setMean(double mean) {
        this.mean = mean;
    }

    public double getMedian() {
        return median;
    }

    public void setMedian(double median) {
        this.median = median;
    }

    public double getF5th() {
        return f5th;
    }

    public void setF5th(double f5th) {
        this.f5th = f5th;
    }

    public double getF95th() {
        return f95th;
    }

    public void setF95th(double f95th) {
        this.f95th = f95th;
    }
}
