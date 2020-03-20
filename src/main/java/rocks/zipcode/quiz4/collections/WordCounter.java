package rocks.zipcode.quiz4.collections;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    String[] strings;

    public WordCounter(String... strings) {
        this.strings = strings;
    }

    public Map<String, Integer> getWordCountMap() {
        Map<String, Integer> wordCountMap = new HashMap<>();
        for (String word : strings) {
            if(wordCountMap.putIfAbsent(word, 1) != null) {
                Integer count = wordCountMap.get(word) + 1;
                wordCountMap.replace(word, count);
            }
        }

        return wordCountMap;
    }
}
