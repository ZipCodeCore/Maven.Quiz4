package rocks.zipcode.quiz4.collections;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {

    private HashMap<String, Integer> wordCount = new HashMap<>();

    public WordCounter(String... strings) {
        for(String str : strings){
            if(!this.wordCount.keySet().contains(str)){
                this.wordCount.put(str, 1);
            }
            else {
                this.wordCount.replace(str, this.wordCount.get(str) + 1);
            }
        }
    }

    public Map<String, Integer> getWordCountMap() {
        return this.wordCount;
    }
}
