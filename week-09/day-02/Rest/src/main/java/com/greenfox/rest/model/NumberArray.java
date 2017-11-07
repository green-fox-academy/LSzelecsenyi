package com.greenfox.rest.model;

public class NumberArray {

    private String what = "sum";
    private int[] numbers = {1, 2, 5, 10};

    public String getWhat() {
        return what;
    }

    public void setWhat(String what) {
        this.what = what;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }
}
