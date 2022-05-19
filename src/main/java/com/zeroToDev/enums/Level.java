package com.zeroToDev.enums;

public enum Level {
    BEGINNER("Beginner"), INTERMADIATE("Intermediate"), ADVANCE("Advanced"),PROFESIONAL("Pro");

    private final String value;

    Level(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
