import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountLetters {
    String str;
    Map<String, Integer> map;

    public CountLetters(){

    }

    public Map<String, Integer> countLetters(String str) {
        Map<String, Integer> map = new HashMap<>();
        String[] chars = str.split("");
        for (String character : chars) {
            String letter = character.toLowerCase();
            if (map.containsKey(letter)) {
                int count = map.get(letter);
                map.put(letter, count + 1);
            } else
                map.put(letter, 1);
        }
        System.out.println(Arrays.asList(map));
        return map;
    }
}
