import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class SumTest {

    Sum sum = new Sum();
    ArrayList<Integer> list = new ArrayList<>();
    ArrayList<Integer> listWithOne = new ArrayList<>(Arrays.asList(1));
    ArrayList<Integer> listMultiple = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
    ArrayList<Integer> listNull = null;

    @Test
    public void sumEmptyList() throws Exception {
        assertEquals(0, sum.getSum(list));
    }

    @Test
    public void sumListWithOneElement() throws Exception {
        assertEquals(1, sum.getSum(listWithOne));
    }

    @Test
    public void sumListWithMultipleNumbers() throws Exception {
        assertEquals(15, sum.getSum(listMultiple));
    }

    @Test
    public void sumNullList() throws Exception {
        assertEquals(0, sum.getSum(listNull));
    }

}