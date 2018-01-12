import java.util.*;

public class QuoteSwap {

    public static void main(String... args) {

        ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));
        ArrayList<String> list2 = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));
        ArrayList<String> list3 = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));

        // Accidentally I messed up this quote from Richard Feynman.
        // Two words are out of place
        // Your task is to fix it by swapping the right words with code
        // Also, print the sentence to the output with spaces in between.

        Collections.swap(list, 2, 5);
        for (int i = 0; i < list.size() - 1; i++) {
            String temp = list.get(i) + " ";
            list.set(i, temp);
        }
        for (String s : list) {
            System.out.print(s);
        }
        swapper(list3, "do", "cannot");
    }

//    or:

    public static void swapper(ArrayList<String> list, String wordToChange, String withWhichWord) {
        int indexOfWordToChange = list.indexOf(wordToChange);
        int indexOfWhichWordToChange = list.indexOf(withWhichWord);
        Collections.swap(list, indexOfWordToChange, indexOfWhichWordToChange);
        for (String s : list) {
            System.out.print(s + " ");
        }
    }
}
