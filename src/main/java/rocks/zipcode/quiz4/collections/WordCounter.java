package rocks.zipcode.quiz4.collections;
import java.util.HashMap;

import java.util.Map;

public class WordCounter {
    Map<String, Integer> map = new HashMap<>();

    public WordCounter(String... strings) {
        for (String s : strings) {
            Integer counter = 1;
            if (map.containsKey(s)) {
                counter = map.get(s);
                counter++;
            }
            map.put(s, counter);
        }
    }

    public Map<String, Integer> getWordCountMap() {
        return map;
    }
}
