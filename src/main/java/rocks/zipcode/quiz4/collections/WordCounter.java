package rocks.zipcode.quiz4.collections;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    Map<String, Integer> wordMap = new HashMap<>();
    public WordCounter(String... strings) {
        for(String word : strings){
            Integer count = wordMap.get(word);
            if(count == null){
                wordMap.put(word, 1);
            }
            else{
                wordMap.put(word, wordMap.get(word) + 1);
            }
        }
    }

    public Map<String, Integer> getWordCountMap() {

        return wordMap;
    }
}
