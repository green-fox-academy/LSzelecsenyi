package com.greenfox.bankofsimba.bankofsimba.model;

public class BankAccount {

    String name;
    double balance;
    String animalType;
    String currency;
    boolean isKing;

    public BankAccount(String name, double balance, String animalType) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        currency = "Zebra";
        isKing = false;
        setKing();
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

    public void setKing() {
        if (this.name == "Mufasa") {
            isKing = true;
        }
    }

    public boolean getKing() {
        return isKing;
    }


}
