package com.greenfox.rest.model;

public class Append {

    private String appended;

    public String getAppended() {
        return appended;
    }

    public void setAppended(String appended) {
        this.appended = appended;
    }

    public Append(String str) {
        appended = str + "a";

    }
}
