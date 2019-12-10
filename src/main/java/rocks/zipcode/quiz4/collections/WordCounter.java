package rocks.zipcode.quiz4.collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class WordCounter {
    //String [] strings;
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

    public Map<String, Integer> getWordCountMap(String... strings) {
        return newMap;
    }
}
