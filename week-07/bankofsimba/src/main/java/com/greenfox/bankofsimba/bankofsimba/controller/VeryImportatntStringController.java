package com.greenfox.bankofsimba.bankofsimba.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VeryImportatntStringController {

    @RequestMapping ("/VeryImportantString")
    public String account(Model model) {
        model.addAttribute("textToPrint1", "<em>HTML</em>");
        model.addAttribute("textToPrint2", "<b>Enjoy yourself!</b>");
        return "VeryImportantString";
    }

}
