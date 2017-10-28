package com.greenfox.foxclub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FoxClubController {

    

    @RequestMapping (value = "/")
    public String foxClub() {
        return "index";
    }

    @RequestMapping (value = "/information")
    public String information(Model model) {
        model.addAttribute("name", fox.getName);
    }

}
