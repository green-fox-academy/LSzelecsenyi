import java.util.Scanner;

public class PalindromeBuilder {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Type a word!");
        System.out.println(palindromeBuilder(sc.nextLine()));

    }

    static String palindromeBuilder(String word) {
        String palindrome = word;
        for (int i = word.length() - 1; i >= 0 ; i--) {
            palindrome += word.charAt(i);
        }
        return palindrome;
    }
}
