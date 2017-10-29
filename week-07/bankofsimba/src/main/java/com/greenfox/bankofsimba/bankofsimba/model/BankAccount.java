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

    public BankAccount(String name, int balance, String animalType, boolean isKing, boolean isBad) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        currency = "Cobble";
        this.isKing = isKing;
        this.isBad = isBad;
    }

    public void donateAnimal () {
        if (this.isKing) {
            setBalance((int) (getBalance() + 100));
        } else {
            setBalance((int) (getBalance() + 10));
        }
    }

    public boolean getIsKing() {
        return isKing;
    }

    public boolean getIsBad() {
        return isBad;
    }

    public void setIsKing(boolean king) {
        isKing = king;
    }

    public void setIsBad(boolean bad) {
        isBad = bad;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Integer getBalance() {
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
