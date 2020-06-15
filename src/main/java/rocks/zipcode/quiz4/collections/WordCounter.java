package rocks.zipcode.quiz4.collections;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    private String[] strings;
    private Map<String, Integer> wordCountMap;

    public WordCounter(String... strings) {
        this.strings = strings;
        this.wordCountMap = mapWords();
    }

    private Map<String, Integer> mapWords() {
        Map<String, Integer> map = new HashMap<>();
        for (String string : strings) {
            map.put(string, map.getOrDefault(string, 0) + 1);
        }
        return map;
    }

    public Map<String, Integer> getWordCountMap() {
        return wordCountMap;
    }
}
