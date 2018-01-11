//Create a function that takes a list of numbers as parameter
//Returns a list where the elements are sorted in ascending numerical order
//Make a second boolean parameter, if it's true sort that list descending
//Example
//input [34, 12, 24, 9, 5]
//output [5, 9, 12, 24, 34]

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortThatList {

    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(34, 12, 24, 9, 5));
        sort(list, false);
        sort(list, true);
    }

    public static ArrayList sort(ArrayList list, boolean trigger) {
        if (trigger == false) {
            System.out.println(list);
            return list;
        } else
            Collections.sort(list);
        System.out.println(list);
        return list;
    }
}
