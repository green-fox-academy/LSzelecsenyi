package Comparable;

import java.util.Arrays;

public class Domino implements Comparable<Domino>{
    private final int[] values;

    public Domino(int valueA, int valueB) {
        this.values = new int[]{valueA, valueB};
    }

    public int[] getValues() {
        return values;
    }

    @Override
    public String toString() {
        return "[" + values[0] + ", " + values[1] + "]";
    }

    @Override
    public int compareTo(Domino d) {
        if (this.values[0] != d.values[0]) {
            return this.values[0] - d.values[0];
        } else {
            return this.values[1] - d.values[1];
        }
    }
}