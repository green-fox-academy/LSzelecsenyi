package com.greenfox.foxclub.model;

public class Drink {

    private String name;

    public Drink() {
    }

    public Drink(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
