public class Printer {

    public static void main(String[] args) {

// - Create a function called `printer`
//   which prints the input String parameters
// - It can have any number of parameters

// Examples
// printer("first")
// printer("first", "second")
// printer("first", "second", "third", "fourh")
// ...

        String[] stringArray = {"One", "Two", "Three", "Four"};
       printer(stringArray);
    }

    public static void printer(String s[]) {
        for(int i = 0; i < s.length; i++) {
            System.out.print("\"" + s[i] + "\", ");
        }
    }


}
