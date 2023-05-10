package ru.asgubin.rsr.rsrFile.event;

public enum EventType {
    BASIC_EVENT(5),
    CCF_EVENT(12),
    MOD_EVENT(99);

    private final int value;

    EventType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
