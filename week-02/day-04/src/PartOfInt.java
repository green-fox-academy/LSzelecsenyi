//Find the part of int
//Create a function that takes a number and a list of numbers as a parameter
//Returns the indeces of the numbers in the list where the first number is part of
//Returns an empty list if the number is not part any of the numbers in the list
//Example
//input: [1, 11, 34, 52, 61], 1
//output: [0, 1, 4]

import java.util.ArrayList;
import java.util.Arrays;

public class PartOfInt {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 181, 34, 52, 861, 8, 0, 11, 38));
        findIndex(list, 8);
    }

    public static ArrayList findIndex(ArrayList list, int numberToCheck) {
        ArrayList result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Integer a = (Integer) list.get(i);
            if (String.valueOf(list.get(i)).contains(String.valueOf(numberToCheck))) {
                result.add(list.indexOf((Integer) list.get(i)));
            }
        }
        System.out.println(result);
        return result;
    }
}
