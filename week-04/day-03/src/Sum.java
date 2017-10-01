import java.util.ArrayList;

public class Sum {

    public int getSum(ArrayList<Integer> list) {
        Integer result = 0;
        if (list == null) {
            return 0;
        } else {
            for (int i = 0; i < list.size(); i++) {
                if (list.size() == 0) {
                    return 0;
                }
                if (list.size() == 1) {
                    return list.get(0);
                } else {
                    result += list.get(i);
                }
            }
            return result;
        }
    }

}

