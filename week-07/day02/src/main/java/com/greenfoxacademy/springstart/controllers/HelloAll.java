package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Random;

@Controller
public class HelloAll {

    Random r = new Random();

    String[] color = {"red", "blue", "green", "cyan"};

    String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
            "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
            "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
            "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};

    @RequestMapping("/web/greetAll")
    public String greeting(Model model) {
        model.addAttribute("greeting", getGreet(hellos));
        model.addAttribute("color", generateColor());
        model.addAttribute("size", generateFontSize());
        return "greetAll";
    }

    public String getGreet(String[] greetings) {
        return hellos[r.nextInt(greetings.length - 1)];
    }

    public String generateColor() {
        return "color:rgb(" + r.nextInt(256) + "," + r.nextInt(256) + "," + r.nextInt(256) + ");";
    }

    public String generateFontSize() {
        return "font-size:" + r.nextInt(40) + "px";
    }

//    <p style = "font-size:10px ; background-color: blue"> Some text for you to make normal size!</p>

//    font-size:8px

}