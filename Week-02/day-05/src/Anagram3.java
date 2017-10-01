import java.util.Scanner;

public class Anagram3 {

    public static void main(String args[]) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Give me two words to check wether they are anagrams or not!");
        String word1 = sc.nextLine();
        String word2 = sc.nextLine();

        String word1AlphabetWithSpaces = putAlphabet(word1);
        String word2AlphabetWithSpaces = putAlphabet(word2);
        String word1Alphabet = word1AlphabetWithSpaces.replace(" ", "");
        String word2Alphabet = word2AlphabetWithSpaces.replace(" ", "");
        System.out.println(word1Alphabet);
        System.out.println(word2Alphabet);

        ifAnagram(word1Alphabet, word2Alphabet);

    }

    static String putAlphabet(String x) {
        StringBuilder word = new StringBuilder(x);
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < word.length() - 1; i++) {
                char a = word.charAt(i), b = word.charAt(i + 1);

                if (a > b) {
                    word.setCharAt(i, b);
                    word.setCharAt(i + 1, a);
                    swapped = true;
                }
            }
        } while (swapped);
        System.out.println(word);
        return String.valueOf(word);
    }

    static boolean ifAnagram(String str1, String str2) {
        boolean isAnagram = false;
        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("They are anagrams");
            isAnagram = true;
        } else {
            System.out.println("They are not anagrams");
        }
        return isAnagram;
    }

}

