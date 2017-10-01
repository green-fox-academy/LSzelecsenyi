public class Sum {

    public static void main(String[] args) {


// - Write a function called `sum` that sum all the numbers
//   until the given parameter

    int a = 5;
    sum(a);
        System.out.println(sum(a));
    }

    public static int sum(int a) {
        int result = 0;
        for (int i = 0; i <= a; i++) {
            result += i;
        }
        return result;
    }
    }

