package com.greenfox.bankofsimba.bankofsimba.model;

public class BankAccount {

    String name;
    double balance;
    String animalType;
    String currency;

    public BankAccount(String name, double balance, String animalType) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        currency = "Zebra";
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public String getAnimalType() {
        return animalType;
    }

    public String getCurrency() {
        return currency;
    }
}
