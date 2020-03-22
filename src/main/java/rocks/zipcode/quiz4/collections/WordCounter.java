package rocks.zipcode.quiz4.collections;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    Map<String, Integer> myMap = new HashMap<>();

    public WordCounter(String... strings) {
        for (String x : strings) {
            Integer count = 1;
            if (myMap.containsKey(x)) {
                count = myMap.get(x);
                count++;
            }
            myMap.put(x, count);
        }
    }

    public Map<String, Integer> getWordCountMap() {
        return myMap;
    }
}
