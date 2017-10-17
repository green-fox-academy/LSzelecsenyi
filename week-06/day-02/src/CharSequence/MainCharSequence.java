package CharSequence;

public class MainCharSequence {

    public static void main(String[] args) {

        Gnirts g = new Gnirts("example");
        System.out.println(g.charAt(1));
        System.out.println(g.subSequence(0, 1));

        Shifter s = new Shifter("example", 2);
        System.out.println(s.charAt(6));

    }
}
