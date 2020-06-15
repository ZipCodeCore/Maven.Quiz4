package rocks.zipcode.quiz4.collections;

import java.util.*;

public class WordCounter {
    public WordCounter(String... strings) {
        getWordCountMap();
    }
    
    public Map<String, Integer> getWordCountMap(String... strings) {
        Map<String, Integer> wordMap = new HashMap<>();
        for (String word : strings) {
            wordMap.merge(word, 1, Integer::sum);
            //System.out.println(wordMap.entrySet());
        }
        return wordMap;
    }
}

/*
    public Integer getWordCountMapCount(Map<String, Integer> wordMap){
    return wordMap.values();
    }*/
