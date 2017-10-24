package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWebController {

    @ResponseBody
    @RequestMapping("/web/greeting")
    public String greeting(Model model) {
        model.addAttribute("name", " World");
        return "greeting";
    }

}
