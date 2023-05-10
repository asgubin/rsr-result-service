package ru.asgubin.rsr.model;

public class McsSummaryResult {
    double qBestApprox;

    public McsSummaryResult() {

    }

    public McsSummaryResult(double qBestApprox) {
        this.qBestApprox = qBestApprox;
    }

    public double getqBestApprox() {
        return qBestApprox;
    }

    public void setqBestApprox(double qBestApprox) {
        this.qBestApprox = qBestApprox;
    }
}
