package rocks.zipcode.quiz4.collections;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    Map<String, Integer> wordCounterMap = new HashMap<>();

    public WordCounter(String... strings) {
        for (String string : strings){
            wordCounterMap.putIfAbsent(string, 0);
            wordCounterMap.replace(string, wordCounterMap.get(string) + 1);
        }
    }

    public Map<String, Integer> getWordCountMap() {
        return wordCounterMap;
    }
}
