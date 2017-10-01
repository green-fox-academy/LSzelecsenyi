public class Reverse {
    public static void main(String... args){
        String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

        // Create a function that can reverse a String, which is passed as the parameter
        // Use it on this reversed string to check it!
        // Try to solve this using charAt() first, and optionally anything else after.

        reversed = stringReverser(reversed);
        System.out.println(reversed);

        //reverse it back to reverse it again using reverseIt()
        reversed = stringReverser(reversed);

        reversed = reverseIt(reversed);
        System.out.println(reversed);


    }

    public static String stringReverser(String original) {
        String reversed = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        } return original = reversed;
    }

// Reverse it with Stringbuilder

    public static String reverseIt(String original) {
        String reversed = new StringBuilder(original).reverse().toString();
        return original = reversed;
    }

}