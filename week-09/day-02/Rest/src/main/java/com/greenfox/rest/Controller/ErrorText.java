package com.greenfox.rest.Controller;

public class ErrorText {

    String error;

    public ErrorText() {
    }

    public ErrorText(String error) {
        this.error = error;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}