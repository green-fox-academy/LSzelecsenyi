package com.greenfox.foxclub.controller;

import com.greenfox.foxclub.model.Drink;
import com.greenfox.foxclub.model.Food;
import com.greenfox.foxclub.model.Fox;
import com.greenfox.foxclub.model.Trick;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FoxClubController {

    @Autowired
    Fox fox;

    @Autowired
    Food food;

    @Autowired
    Drink drink;

    @Autowired
    Trick trick;


    @RequestMapping ({"", "/", "/home"})
    public String foxClub(Model model) {
        model.addAttribute("knownTricksSize", fox.getKnownTricks().size());
        model.addAttribute("knownTricks", fox.getKnownTricks());
        model.addAttribute("name", fox.getName());
        model.addAttribute("food", fox.getFood());
        model.addAttribute("drink", fox.getDrink());
        return "index";

    }

    @GetMapping("/nutritionstore")
    public String nutritionStore() {
        return "nutritionstore";
    }

    @PostMapping ("/setfood")
    public String setFood(@ModelAttribute Food food) {
        fox.setFood(food);
        return "redirect:/";
    }

    @PostMapping ("/setdrink")
    public String setDrink(@ModelAttribute Drink drink) {
        fox.setDrink(drink);
        return "redirect:/";
    }

    @GetMapping("/trickcenter")
    public String trickcenter(Model model) {
        model.addAttribute("tricksToLearn", fox.getTricksToLearn());
        return "trickcenter";
    }

    @PostMapping("/learntrick")
    public String learnTrick(@ModelAttribute Trick trick) {
        if (fox.getKnownTricks().contains(trick)) {
            return "redirect:/";
        } else {
            fox.learnTrick(trick.getName());
            return "redirect:/";
        }
    }

}
