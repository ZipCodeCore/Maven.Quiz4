package rocks.zipcode.quiz4.collections;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {

    private String[] strings;

    public WordCounter(String... strings) {
        this.strings = strings;
    }

    public Map<String, Integer> getWordCountMap() {
        Map<String, Integer> result = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            String key = strings[i];
            if (result.containsKey(key)){
                Integer value = result.get(key);
                result.put(key, value + 1);
            } else {
                result.put(key, 1);
            }
        }
        return result;
    }
}
