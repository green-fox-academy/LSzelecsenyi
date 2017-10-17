package CharSequence;

public class Shifter implements CharSequence {
    int placeToShift;
    String str;

    public Shifter(String str, int placetoShift) {
        this.str = str;
        this.placeToShift = placetoShift;
    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int index) {
        int returnIndex;
        int i = str.length() - 1;
        if (index + placeToShift > i) {
            returnIndex = (index + placeToShift - i) - 1;
            return str.charAt(returnIndex);
        } else {
        return str.charAt(index + placeToShift);
        }
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }
}
