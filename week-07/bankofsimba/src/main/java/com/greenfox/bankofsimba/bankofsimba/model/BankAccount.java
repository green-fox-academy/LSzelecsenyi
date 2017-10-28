package com.greenfox.bankofsimba.bankofsimba.model;

public class BankAccount {

    String name;
    int balance;
    String animalType;
    String currency;
    boolean isKing;
    boolean isBad;

    public BankAccount() {
    }

    public BankAccount(String name, int balance, String animalType) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        currency = "Zebra";
        isKing = false;
        isBad = false;
        setKing();
        setBad();
    }

    public void donateAnimal () {
        if (this.isKing) {
            setBalance((int) (getBalance() + 100));
        } else {
            setBalance((int) (getBalance() + 10));
        }
    }

    public void setKing() {
        if (this.name == "MUFASA") {
            isKing = true;
        }
    }

    public boolean getKing() {
        return isKing;
    }


    public void setKing(boolean king) {
        isKing = king;
    }

    public void setBad() {
        if (this.name == "Scar") {
            isBad = true;
        }
    }

    public boolean getBad() {
        return isBad;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }


    public String getAnimalType() {
        return animalType;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCurrency() {
        return currency;
    }

}
