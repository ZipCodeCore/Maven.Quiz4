package rocks.zipcode.quiz4.collections;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    private String[] strings;

    public WordCounter(String... strings) {
        this.strings = strings;
    }

    public Map<String, Integer> getWordCountMap() {
        Map<String, Integer> map = new HashMap<>();
        for (String word : strings) {
            Integer count = map.get(word);
            map.put(word, (count == null) ? 1 : count+1);
        }
        return map;
    }
}
