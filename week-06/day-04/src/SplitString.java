import java.util.Arrays;

public class SplitString {
    String[] strArray;

    public static void main(String[] args) {

        SplitString split = new SplitString();
        split.splitString("CutHere", 3);

    }

    public String[] splitString(String str, int index) {
        strArray = new String[2];
        try {
            strArray[0] = str.substring(0, index);
            strArray[1] = str.substring(index);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("index is out of bounds, knobhead...");
        }
        System.out.println(Arrays.toString(strArray));
        return strArray;
    }

}