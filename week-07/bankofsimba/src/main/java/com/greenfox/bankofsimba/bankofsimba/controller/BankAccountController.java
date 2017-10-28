package com.greenfox.bankofsimba.bankofsimba.controller;

import com.greenfox.bankofsimba.bankofsimba.model.Bank;
import com.greenfox.bankofsimba.bankofsimba.model.BankAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
public class BankAccountController {

    BankAccount simbasAccount = new BankAccount("Simba", 2000, "lion");

    @Autowired
    Bank bank;

//    ArrayList<BankAccount> accounts;

    @RequestMapping(value = "/simbassccount")
    public String account(Model model) {
        model.addAttribute("account", simbasAccount.getName());
        model.addAttribute("balance", simbasAccount.getBalance());
        model.addAttribute("animalType", simbasAccount.getAnimalType());
        model.addAttribute("currency", simbasAccount.getCurrency());
        return "simbasaccount";
    }

    @GetMapping("/accounts")
    public String accounts(Model model) {
        model.addAttribute("accounts", bank.getAccounts());
        model.addAttribute("addaccount", new BankAccount());
        return "accounts";
    }

    @PostMapping("/accounts")
    public String spoilTheSavanna(@ModelAttribute BankAccount bankAccount) {
        for (BankAccount account : bank.getAccounts()) {
            if (account.getName().equals(bankAccount.getName())) {
                account.donateAnimal();
            }
        }
        return "redirect:/accounts";
    }

    @PostMapping("/addaccount")
    public String addAccount(@ModelAttribute BankAccount account) {
        bank.add(account);
        return "redirect:/accounts";
    }



}
