package rocks.zipcode.quiz4.collections;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    private Map<String, Integer> map = new HashMap<>();

    public WordCounter(String... strings) {
        Integer counter = 1;
        for (String string : strings) {
            if (map.containsKey(string)) {
                map.put(string, counter = counter + 1);
            }
            else {
                map.put(string, new Integer(1));
                counter = 1;
            }
        }
    }

    public Map<String, Integer> getWordCountMap() {
        return map;
    }
}
