package com.zeroToDev.enums;

public enum Status {

    OPEN("Open"), IN_PROGRESS("In Progress"),STUDIED("Studied"), COMPLETE("Completed");

    private final String value;

    Status(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
