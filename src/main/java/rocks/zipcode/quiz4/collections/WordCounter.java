package rocks.zipcode.quiz4.collections;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    Map<String, Integer> wordCount = new HashMap<String, Integer>();
    public WordCounter(String... strings) {

        for (String word : strings) {
            if (!wordCount.containsKey(word)) {
                wordCount.put(word, 1);
            } else {
                int count = wordCount.get(word);
                wordCount.put(word, count + 1);
            }
        }
    }
        public Map<String, Integer> getWordCountMap (){
            return wordCount;
        }

}
