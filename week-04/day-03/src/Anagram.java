import java.util.Arrays;

public class Anagram {

    public boolean anagramChecker(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        } else {
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);
            return Arrays.equals(charArray1, charArray2);
        }
    }
}
