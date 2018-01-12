// - Create a string variable named `am` and assign the value `kuty` to it
// - Write a function called `appendA` that gets a string as an input
//   and appends an 'a' character to its end
// - Print the result of `appendA(am)`

public class AppendA {

    public static void main(String[] args) {

        String am = "kuty";
        appendA(am);
    }

    public static void appendA(String s) {
        String appended = s + "a";
        System.out.println(appended);
    }
}
