import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class OddAverageTest {

    OddAverage avg = new OddAverage();

    @Test
    public void oneToTen() throws Exception {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        assertEquals(5.0, avg.oddAverage(list), 0.02);
    }

    @Test
    public void onlyEvens() throws Exception {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10));
        assertEquals(0.0, avg.oddAverage(list), 0.002);
    }

    @Test
    public void empty() throws Exception {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList());
        assertEquals(0.0, avg.oddAverage(list), 0.002);
    }

    @Test
    public void nulls() throws Exception {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(0, 0, 0, 0));
        assertEquals(0.0, avg.oddAverage(list), 0.002);
    }

    @Test
    public void onlyOdds() throws Exception {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));
        assertEquals(5.0, avg.oddAverage(list), 0.002);
    }

    @Test
    public void notWholeNumber() throws Exception {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 1));
        assertEquals(3.4, avg.oddAverage(list), 0.002);
    }

}