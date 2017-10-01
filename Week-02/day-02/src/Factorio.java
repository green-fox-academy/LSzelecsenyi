public class Factorio {

    public static void main(String[] args) {

// - Create a function called `factorio`
//   that returns it's input's factorial

        factorio(6);
    }

    public static void factorio(int n)
        { int fact = 1;
            for (int c = 1 ; c <= n ; c++ )
                fact = fact*c;
            System.out.println(fact);
        }
        }




