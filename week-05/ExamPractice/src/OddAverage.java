// Create a function called `oddAverage` that takes a list of numbers as parameter
// and returns the average value of the odd numbers in the list
// Create basic unit tests for it with at least 3 different test cases

import java.util.ArrayList;
import java.util.Arrays;

public class OddAverage {
    public static void main(String[] args) {

        OddAverage avg = new OddAverage();
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 5));
        System.out.println(avg.oddAverage(list));

    }
    public Double oddAverage(ArrayList<Integer> list) {
        ArrayList<Integer> oddList = new ArrayList<>();
        Double oddAvg;
        Double oddSum = 0d;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 != 0) {
                oddList.add(list.get(i));
            }
        }
        if (oddList.size() == 0) {
            return 0d;
        }
        for (Integer odd : oddList) {
            oddSum += odd;
        }
        oddAvg = oddSum / oddList.size();
        return oddAvg;
    }
}
