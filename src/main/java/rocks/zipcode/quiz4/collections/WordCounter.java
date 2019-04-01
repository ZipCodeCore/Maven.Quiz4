package rocks.zipcode.quiz4.collections;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {


    String[] words;
    public WordCounter(String... strings) {
        this.words = strings;
//        wordMap = new HashMap<>();

    }

    public Map<String, Integer> getWordCountMap() {
        Map<String,Integer> wordMap = new HashMap<>();
        for(String word:words){
            wordMap.put(word,0);
        }
        for (String word:words){
            wordMap.put(word,wordMap.get(word)+1);
        }

        return wordMap;
    }
}
