package com.greenfox.foxclub.model;

public class Trick {
    private String name;

    public Trick(String name) {
        this.name = name;
    }

    public void setTrick(String trick) {
        this.name = trick;
    }

    public String getTrick() {
        return name;
    }
}
