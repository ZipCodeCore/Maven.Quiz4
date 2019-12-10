package rocks.zipcode.quiz4.collections;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    String[]strings;

    public WordCounter(String... strings) {
        this.strings=strings;
    }

    public Map<String, Integer> getWordCountMap() {
        Map<String,Integer>wordCount=new HashMap<>();
        for (String word:strings){

            if (!wordCount.containsKey(word)) {
                wordCount.put(word, 1);
            } else {
                wordCount.put(word, wordCount.get(word) + 1);
            }

        }
        return wordCount;
    }
}
