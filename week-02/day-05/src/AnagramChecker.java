public class AnagramChecker {

    public static void main(String[] args) {
        System.out.println(anagramChecker("god", "dog"));
        System.out.println(anagramCheckerSB("god", "dog"));
    }

    //using for loop
    public static boolean anagramChecker(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }
        String reversed = "";
        for (int i = word1.length() - 1; i >= 0; i--) {
            reversed = reversed + word1.charAt(i);
        }
        return reversed.equals(word2);
    }

    // using StringBuilder
    public static boolean anagramCheckerSB(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }
        StringBuilder sb = new StringBuilder(word1);
        String reversed = sb.reverse().toString();
        return (reversed.equals(word2));
    }
}
