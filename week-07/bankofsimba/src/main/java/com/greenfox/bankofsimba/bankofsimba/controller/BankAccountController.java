package com.greenfox.bankofsimba.bankofsimba.controller;

import com.greenfox.bankofsimba.bankofsimba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class BankAccountController {

    BankAccount simbasAccount = new BankAccount("Simba", 2000, "lion");
    ArrayList<BankAccount> accounts;

    @RequestMapping(value = "/Exercise1")
    public String account(Model model) {
        model.addAttribute("account", simbasAccount.getName());
        model.addAttribute("balance", simbasAccount.getBalance());
        model.addAttribute("animalType", simbasAccount.getAnimalType());
        model.addAttribute("currency", simbasAccount.getCurrency());
        return "Exercise1";
    }

    @RequestMapping("/accounts")
    public String accounts(Model model) {
        accounts = new ArrayList<>();
        accounts.add(new BankAccount("Mufasa", 70000, "lion"));
        accounts.add(new BankAccount("Rafiki", 500, "monkey"));
        accounts.add(new BankAccount("Zazu", 30, "parrot"));
        accounts.add(new BankAccount("Pumbaa", 400, "pig"));
        accounts.add(new BankAccount("Scar", 250000, "lion"));
        model.addAttribute("accounts", accounts);
        return "Accounts";
    }

    @PostMapping("/accounts")
    public String sendMoneyAbroad(Model model) {
        model.addAttribute("accounts", accounts);
        for (int i = 0; i < accounts.size(); i++) {
            accounts.get(i).donateAnimal();
        }
        return "accounts";
    }


}
