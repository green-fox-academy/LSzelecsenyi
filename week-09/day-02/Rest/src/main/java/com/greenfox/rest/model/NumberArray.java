package com.greenfox.rest.model;

import java.util.ArrayList;

public class NumberArray {

    private String what;
    private ArrayList<Integer> numbers;

    public String getWhat() {
        return what;
    }

    public void setWhat(String what) {
        this.what = what;
    }

    public ArrayList<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(ArrayList<Integer> numbers) {
        this.numbers = numbers;
    }

    public NumberArray(ArrayList<Integer> numbers) {
        this.numbers = numbers;
    }

    public NumberArray(String what) {

        this.what = what;
    }

    public NumberArray() {

    }

    public NumberArray(String what, ArrayList<Integer> numbers) {

        this.what = what;
        this.numbers = numbers;
    }
}
