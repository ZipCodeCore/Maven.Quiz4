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
        Map<String, Integer> wordCount = new HashMap<>();
        for (String s : strings) {
            if (!wordCount.containsKey(s)){
                wordCount.put(s, 1);
            } else {
                Integer count = wordCount.get(s);
                wordCount.put(s, count + 1);
            }
        }
        return wordCount;
    }
}
