package com.greenfox.bankofsimba.bankofsimba.controller;

import com.greenfox.bankofsimba.bankofsimba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BankAccountController {

    BankAccount simbasAccount = new BankAccount("Simba", 2000d, "lion");

    @RequestMapping(value = "/Exercise1")
    public String account(Model model) {
        model.addAttribute("account", simbasAccount.getName());
        model.addAttribute("balance", simbasAccount.getBalance());
        model.addAttribute("animalType", simbasAccount.getAnimalType());
        model.addAttribute("currency", simbasAccount.getCurrency());
        return "Exercise1";
    }


}
