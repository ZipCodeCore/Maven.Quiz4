package rocks.zipcode.quiz4.collections;

import java.util.*;
import java.util.stream.Collectors;

public class WordCounter {
    private Map<String, Integer> wordsMap;
    private List<String> wordsList;

    public WordCounter(String... strings) {
        wordsMap = new HashMap<>();
        wordsList = Arrays
                .stream(strings)
                .collect(Collectors.toCollection(ArrayList::new));

    }

    public Map<String, Integer> getWordCountMap() {
        for(String s : wordsList){
            if(!wordsMap.containsKey(s)){
                wordsMap.put(s,1);
            }
            else{
                int count = wordsMap.get(s);
                wordsMap.put(s, count+1);
            }
        }
        return wordsMap;
    }
}
