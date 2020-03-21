package rocks.zipcode.quiz4.collections;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    private Map<String, Integer> wordMap;

    public WordCounter(String... strings) {
        wordMap = createMap(strings);
    }

    private Map<String, Integer> createMap(String[] strings) {
        Map<String, Integer> wordMap = new HashMap<>();

        for(String word : strings) {
            if(!wordMap.containsKey(word)){
                wordMap.put(word, 1);
            } else {
                int count = wordMap.get(word);
                wordMap.put(word, count + 1);
            }
        }
        return wordMap;
    }

    public Map<String, Integer> getWordCountMap() {
        return wordMap;
    }

}
