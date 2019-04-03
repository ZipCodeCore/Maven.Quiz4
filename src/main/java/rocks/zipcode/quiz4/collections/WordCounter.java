package rocks.zipcode.quiz4.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordCounter {

    Map<String, Integer> map = new HashMap<>();
//    String[] strings;

    public WordCounter(String... strings) {
//        this.strings = strings;
        for (int i = 0; i < strings.length; i++) {
            String currentString = strings[i];
            map.put(currentString, count(strings,currentString));
        }
//        this.map = new HashMap<String, Integer>(strings);
//        Arrays.stream(strings)
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    private Integer count(String[] strings, String currentString) {
        return Collections.frequency(Arrays.asList(strings),currentString);
    }


    public Map<String, Integer> getWordCountMap() {
        return map;
//        Map<String, Integer> counter1 = Arrays
//                .stream(strings)
//                .collect(Collectors.toMap(s -> s, s -> 1, Integer::sum));
//
//        return counter1;
    }
}
