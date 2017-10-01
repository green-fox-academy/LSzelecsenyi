public class UseSharpies {
    public static void main(String[] args) {

        Sharpie sharp = new Sharpie("Black", 0.1f);

        sharp.use();

        System.out.println(sharp.color);
        System.out.println(sharp.inkNumber);
        System.out.println(sharp.width);

    }
}
