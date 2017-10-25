package com.greenfox.bankofsimba.bankofsimba.controller;
import com.greenfox.bankofsimba.bankofsimba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.ArrayList;

@Controller
public class MultipleAccountController {

    ArrayList<BankAccount> accounts;

    @RequestMapping("/Accounts")
    public String accounts(Model model) {
        accounts = new ArrayList<>();
        accounts.add(new BankAccount("Mufasa", 70000d, "lion"));
        accounts.add(new BankAccount("Rafiki", 500d, "monkey"));
        accounts.add(new BankAccount("Zazu", 30d, "parrot"));
        accounts.add(new BankAccount("Pumbaa", 400d, "pig"));
        accounts.add(new BankAccount("Scar", 250000d, "lion"));
        model.addAttribute("accounts", accounts);
        return "Accounts";
    }

}
