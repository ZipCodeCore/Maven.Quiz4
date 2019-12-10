package rocks.zipcode.quiz4.collections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordCounter {

    private String[] strings;

    public WordCounter(String... strings) {
        this.strings = strings;
    }

    public Map<String, Integer> getWordCountMap() {
        Map<String, Integer> wordCountMap = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            if (wordCountMap.containsKey(strings[i])) {
                Integer count = wordCountMap.get(strings[i]);
                wordCountMap.put(strings[i], ++count);
            }
            else{
                wordCountMap.put(strings[i], 1);
            }
        }
        return wordCountMap;
    }
}
