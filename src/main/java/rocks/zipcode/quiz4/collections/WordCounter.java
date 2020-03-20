package rocks.zipcode.quiz4.collections;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {

    private HashMap<String, Integer> wordCount = new HashMap<>();

    public WordCounter(String... strings) {
        for(String string : strings){
            if(!this.wordCount.keySet().contains(string)){
                this.wordCount.put(string, 1);
            }
            else {
                this.wordCount.replace(string, this.wordCount.get(string) + 1);
            }
        }
    }

    public Map<String, Integer> getWordCountMap() {
        return this.wordCount;
    }
}
