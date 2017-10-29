package com.greenfox.bankofsimba.bankofsimba.model;

import java.util.ArrayList;

public class Bank extends ArrayList {

    private ArrayList<BankAccount> accounts;
    private boolean king;

    public Bank() {
        accounts = new ArrayList<>();
        accounts.add(new BankAccount("MUFASA", 70000, "lion", true, false));
        accounts.add(new BankAccount("Rafiki", 500, "monkey", false, false));
        accounts.add(new BankAccount("Zazu", 30, "parrot", false, false));
        accounts.add(new BankAccount("Pumbaa", 200, "pig", false, false));
        accounts.add(new BankAccount("Scar", 2500, "lion", false, true));
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
