package com.greenfox.foxclub.controller;

import com.greenfox.foxclub.model.Fox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FoxClubController {

    @Autowired
    Fox fox;


    @RequestMapping (value = "/")
    public String foxClub() {
        return "index";
    }

    @RequestMapping (value = "/information")
    public String information(Model model) {
        model.addAttribute("fox", fox);
        model.addAttribute("name", fox.getName());
        model.addAttribute("food", fox.getFood());
        model.addAttribute("drink", fox.getDrink());
        model.addAttribute("tricklist", fox.getTrickList());
        fox.learnTrick("ggg");
        fox.learnTrick("fff");
        return "information";
    }



}
