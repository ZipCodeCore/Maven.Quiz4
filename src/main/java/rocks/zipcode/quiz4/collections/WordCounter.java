package rocks.zipcode.quiz4.collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class WordCounter {

    Map<String, Long> wordCounts = new HashMap<>();
    Map<String, Integer> newMap = new HashMap<>();

    public WordCounter(String... strings) {
        wordCounts =
                Arrays.stream(strings).collect(Collectors.groupingBy(w -> w, Collectors.counting()));
        newMap = wordCounts.entrySet()
                .stream()
                .collect(Collectors.toMap(entry -> entry.getKey(), entry -> entry.getValue().intValue()));
    }

    //Write method for using a loop also.
//    HashMap<String,int> frequencymap = new HashMap<String,int>();
//    foreach(String a in animals) {
//        if(frequencymap.containsKey(a)) {
//            frequencymap.put(a, frequencymap.get(a)+1);
//        }
//        else{ frequencymap.put(a, 1); }
//    }

    public Map<String, Integer> getWordCountMap(String... strings) {
        return newMap;
    }
}
