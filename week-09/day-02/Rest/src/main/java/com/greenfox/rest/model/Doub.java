package com.greenfox.rest.model;

public class Doub {
Integer received;
Integer result;

    public Doub (Integer received) {
        this.received = received;
        result = 2 * received;
    }

    public Integer getReceived() {
        return received;
    }

    public Integer getResult() {
        return result;
    }
}
