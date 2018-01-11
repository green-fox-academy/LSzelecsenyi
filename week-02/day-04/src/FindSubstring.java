//Find part of an integer
//Create a function that takes two strings as a parameter
//Returns the starting index where the second one is starting in the first one
//Returns -1 if the second string is not in the first one
//Example
//input: "this is what I'm searching in", "searching"
//output: 17

public class FindSubstring {

    public static void main(String[] args) {

        String stringtoSearchIn = "this is what I'm searching in";
        String wannaFind = "searching";

        System.out.println(findSubstring(stringtoSearchIn, "is"));
    }

    public static int findSubstring(String stringtoSearchIn, String wannaFind) {
        return stringtoSearchIn.indexOf(wannaFind);
    }

}
