// Given a string, compute recursively (no loops) a new string where all the
// lowercase 'x' chars have been changed to 'y' chars.

public class String1 {

    public static void main(String[] args) {

        String str = ("xyXxyXxzXxyXxyXxyXxzXxyXxyXxyXxzXxyXxyXxyXxzXxyXxyXxyXxzXxyX");

        System.out.println(replace(str, 'x', 'y'));

    }

    public static String replace(String s, char from, char to){
        if (s.length() < 1) {
            return s;
        }
        else {
            char first = from == s.charAt(0) ? to : s.charAt(0);
            return first + replace(s.substring(1), from, to);
        }
    }

}