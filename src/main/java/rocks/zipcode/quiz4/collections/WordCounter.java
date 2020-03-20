package rocks.zipcode.quiz4.collections;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {

    public String[] wordCounter;

    public WordCounter(String... strings) {
        this.wordCounter = strings;
    }

    public Map<String, Integer> getWordCountMap() {
        HashMap<String,Integer> wordCountMap = new HashMap<>();
        for (String string: wordCounter) {
            if(wordCountMap.get(string) == null) {
                wordCountMap.put(string,1);
            }
            else {
                Integer count = wordCountMap.get(string);
                count += 1;
                wordCountMap.put(string,count);
            }
        }
        return wordCountMap;
    }
}
