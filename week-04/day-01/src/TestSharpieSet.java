public class TestSharpieSet {
    public static void main(String[] args) {

        SharpieSet sSet = new SharpieSet();

        sSet.add(new Sharpie("red", 2f, 1f));
        sSet.add(new Sharpie("red", 2f, 1f));
        sSet.add(new Sharpie("red", 2f, 0f));
        sSet.add(new Sharpie("red", 2f, 1f));
        sSet.add(new Sharpie("red", 2f, 0f));
        sSet.add(new Sharpie("red", 2f, 1f));

        System.out.println("Number of usable sharpies: " + sSet.countUsable());
        System.out.println("Number of binned sharpies: " + sSet.removeTrash());

    }

}
