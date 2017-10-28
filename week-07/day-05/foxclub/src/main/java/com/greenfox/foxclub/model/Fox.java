package com.greenfox.foxclub.model;

import java.util.ArrayList;
import java.util.List;

public class Fox {

private String name;
private String food;
private String drink;
List<Trick> tricks;

    public Fox() {
    tricks = new ArrayList<>();
    name = "Foxy Love";
    food = "pizza";
    drink = "Lemonade";
    }

    public void learnTrick(String name) {
        tricks.add(new Trick(name));
    }

//    public void listTricks () {
//        if (this.tricks.size() == 0) {
//            return
//        }
//    }

    public String getName() {
        return name;
    }

    public String getFood() {
        return food;
    }

    public String getDrink() {
        return drink;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public List<Trick> getTrickList() {
        return tricks;
    }
}
