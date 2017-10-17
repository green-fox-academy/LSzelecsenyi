package CharSequence;

import java.util.stream.IntStream;

public class Gnirts implements CharSequence{

    String str;

    public Gnirts(String str) {
        this.str = str;
    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int index) {
        return str.charAt((str.length() - 1) - index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = ((str.length() - 1) - start); i > ((str.length() - 1) - end); i--) {
            sb.append(str.charAt(i));
        }
            return sb.toString();
    }

}
