package com.greenfox.foxclub.model;

import java.util.ArrayList;
import java.util.List;

public class Fox {

private String name;
private String food;
private String drink;
List<String> tricks;

    public Fox() {
    tricks = new ArrayList<>();
}

    public String getName() {
        return name;
    }

    public String getFood() {
        return food;
    }

    public String getDrink() {
        return drink;
    }

    public List<String> getTricks() {
        return tricks;
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

    public void setTricks(List<String> tricks) {
        this.tricks = tricks;
    }
}
