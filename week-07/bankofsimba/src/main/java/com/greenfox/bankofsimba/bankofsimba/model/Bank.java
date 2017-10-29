package com.greenfox.bankofsimba.bankofsimba.model;

import java.util.ArrayList;

public class Bank extends ArrayList {

    private ArrayList<BankAccount> accounts;

    public Bank() {
        accounts = new ArrayList<>();
        accounts.add(new BankAccount("MUFASA", 70000, "lion"));
        accounts.add(new BankAccount("Rafiki", 500, "monkey"));
        accounts.add(new BankAccount("Zazu", 30, "parrot"));
        accounts.add(new BankAccount("Pumbaa", 200, "pig"));
        accounts.add(new BankAccount("Scar", 2500, "lion"));
    }

    public ArrayList<BankAccount> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<BankAccount> accounts) {
        this.accounts = accounts;
    }

    public void addAccount(BankAccount account) {
        accounts.add(account);
    }
}
