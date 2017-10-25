package com.greenfox.bankofsimba.bankofsimba.model;
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
        accounts.add(new BankAccount("Mufasa", 70000000d, "lion"));
        accounts.add(new BankAccount("Rafiki", 5000d, "monkey"));
        accounts.add(new BankAccount("Zazu", 30d, "parrot"));
        accounts.add(new BankAccount("Pumbaa", 400d, "pig"));
        accounts.add(new BankAccount("Scar", 2500000d, "lion"));
        model.addAttribute("textToPrint1", "<em>HTML</em>");
        model.addAttribute("textToPrint2", "<b>Enjoy yourself!</b>");
        return "Accounts";
    }

}
