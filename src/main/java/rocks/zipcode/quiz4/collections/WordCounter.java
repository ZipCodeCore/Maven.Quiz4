package rocks.zipcode.quiz4.collections;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordCounter {
    HashMap<String, Integer> countMap;

    public WordCounter(String... strings) {
        this.countMap = new HashMap<>();
        for(String str : strings){
            countMap.put(str,Collections.frequency(Arrays.asList(strings),str));
        }
    }

    public Map<String, Integer> getWordCountMap() {
        return this.countMap;
    }
}
