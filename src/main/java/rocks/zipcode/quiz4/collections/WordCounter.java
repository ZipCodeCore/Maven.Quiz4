package rocks.zipcode.quiz4.collections;

import java.util.*;

public class WordCounter {
    List<String> words;

    public WordCounter() {
        words =  new ArrayList<>();
    }

    public WordCounter(String... strings) {
        words = Arrays.asList(strings);
    }

    public Map<String, Integer> getWordCountMap() {
        Map<String, Integer> frequencyMap = new HashMap<>();
        for(String word : words) {
            frequencyMap.put(word, Collections.frequency(words, word));
        }
        return frequencyMap;
    }
}
