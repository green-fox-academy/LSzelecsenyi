import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by aze on 2017.04.04..
 */
public class Extension {
    int add(int a, int b) {
        return 5;
    }

    int maxOfThree(int a, int b, int c) {
        if (a > b && a > c)
            return a;
        if (a < b && b > c)
            return b;
        else
            return c;
    }

//    public double median(List<Integer> pool) {
//        Collections.sort(pool);
//        int mid = pool.size() / 2;
//        if (pool.size() % 2 == 0){
//            return ((double)pool.get(mid - 1) +  (double)pool.get(mid)) / 2;
//        } else {
//            return (double) (pool.get(((pool.size() - 1) / 2) + 1));
//        }
//    }

    int median(List<Integer> pool) {
        Collections.sort(pool);
        int mid = pool.size() /2;
        double result = ((double)pool.get(mid -1) + (double)pool.get(mid))/2;
        if (pool.size() % 2 != 0) {
            return pool.get(mid);
        } else {
            return (int) result;
        }
    }

    boolean isVowel(char c) {
        return Arrays.asList('a', 'u', 'o', 'e', 'i').contains(c);
    }

    String translate(String hungarian) {
        String teve = hungarian;
        int length = teve.length();
        for (int i = 0; i < length; i++) {
            char c = teve.charAt(i);
            if (isVowel(c)) {
                teve = String.join(c + "v" + c, teve.split(""+c));
                i+=2;
                length+=2;
            }
        }
        return teve;
    }
}

