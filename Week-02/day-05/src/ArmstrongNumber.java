import sun.font.FontRunIterator;

import java.util.ArrayList;
import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String number = String.valueOf(sc.nextInt());

        char[] digits = number.toCharArray();
        int proba = digits[2] * digits[2];
        System.out.println(digits[2] * digits[2]);
       /* ArrayList<Integer> numberOnThirdPower = new ArrayList<>(5);
        for (int i = 0; i < digits.length - 1; i++) {
            numberOnThirdPower.set(i, digits[i] ^ 3);
        }
        for (int i = 0; i <= digits.length - 1; i++) {
            System.out.println(number.charAt(i));
        }

        int sum = 0;
        for (int i = 0; i <= numberOnThirdPower.size() - 1; i++) {
            sum += numberOnThirdPower.get(i);
        }

        if(sum == Integer.parseInt(number)) {
            System.out.println("The " + number + " is an Armstrong number.");
        }
*/
        }
    }

