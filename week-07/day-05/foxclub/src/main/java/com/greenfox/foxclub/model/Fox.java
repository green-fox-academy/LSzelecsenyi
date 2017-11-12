package com.greenfox.foxclub.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fox {

private String name;
private Food food;
private Drink drink;
List<Trick> knownTricks;
List<Trick> tricksToLearn;


    public Fox() {
    knownTricks = new ArrayList<>();
    name = "Foxxy Love";
    food = new Food("Pizza");
    drink = new Drink("Lemonade");
    tricksToLearn = new ArrayList<>();
    tricksToLearn.add(new Trick("Annoy others in the Villa"));
    tricksToLearn.add(new Trick("Tease others in the Villa"));
    tricksToLearn.add(new Trick("Be friendly"));
    tricksToLearn.add(new Trick("Be offensive"));
    }

    public void setNutrition(Food food, Drink drink) {
        this.food = food;
        this.drink = drink;
    }

    public void learnTrick(String name) {
        knownTricks.add(new Trick(name));
    }

    public void setKnownTricks(List<Trick> knownTricks) {
        this.knownTricks = knownTricks;
    }

    public List<Trick> getTricksToLearn() {
        return tricksToLearn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    public List<Trick> getKnownTricks() {
        return knownTricks;
    }

}
