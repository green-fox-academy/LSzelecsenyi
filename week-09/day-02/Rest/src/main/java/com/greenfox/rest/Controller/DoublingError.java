package com.greenfox.rest.Controller;

public class DoublingError {

    private String error;

    public DoublingError(String error) {
        this.error = error;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
