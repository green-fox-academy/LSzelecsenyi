//Find the substring in the list
//Create a function that takes a string and a list of string as a parameter
//Returns the index of the string in the list where the first string is part of
//Returns -1 if the string is not part any of the strings in the list
//Example
//input: "ching", ["this", "is", "what", "I'm", "searching", "in"]
//output: 4

import java.util.ArrayList;
import java.util.Arrays;

public class FindSubstringInList {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>(Arrays.asList("this", "is", "what", "I'm", "searching", "in"));
        findIndexOfStr("ching", list);
    }

    public static int findIndexOfStr(String strToFind, ArrayList<String> list) {
        int index = 0;
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            if (str.contains(strToFind)) {
                index = list.indexOf(str);
            }
        }
        return index;
    }
}
