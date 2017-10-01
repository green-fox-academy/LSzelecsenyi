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

        String swap = list.get(2);
        list.set(2, list.get(5));
        list.set(5, swap);

        String quote = "";
        for (int i = 0; i < list.size(); i++) {
            quote = quote.concat(list.get(i) + " ");
        }
        System.out.println(quote);

//Or:

        Collections.swap(list2, 2, 5);
        for (String s : list2) {
            System.out.print(s + " ");
        }

//Or:
        System.out.println();

        swapper(list3, "do", "cannot");

    }

    public static void swapper(ArrayList<String> list, String what, String withWhat) {
        int wwhhaatt = list.indexOf(what);
        int wwiitthhWWhhaatt = list.indexOf(withWhat);
        Collections.swap(list, wwhhaatt, wwiitthhWWhhaatt);
        for (String s : list) {
            System.out.print(s + " ");
        }
    }

}