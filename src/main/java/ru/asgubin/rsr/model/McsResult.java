package ru.asgubin.rsr.model;

import java.util.List;

public class McsResult {
    private double probability;
    private List<Long> eventIndexList;

    public McsResult() {
    }

    public McsResult(double probability, List<Long> eventIndexList) {
        this.probability = probability;
        this.eventIndexList = eventIndexList;
    }

    public double getProbability() {
        return probability;
    }

    public void setProbability(double probability) {
        this.probability = probability;
    }

    public List<Long> getEventIndexList() {
        return eventIndexList;
    }

    public void setEventIndexList(List<Long> eventIndexList) {
        this.eventIndexList = eventIndexList;
    }
}
