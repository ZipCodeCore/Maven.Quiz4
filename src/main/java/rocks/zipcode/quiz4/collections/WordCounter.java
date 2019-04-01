package rocks.zipcode.quiz4.collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordCounter {

    Map<String, Integer> map = new HashMap<>();
    String[] strings;

    public WordCounter(String... strings) {
        this.strings = strings;
//        this.map = new HashMap<String, Integer>(strings);
//        Arrays.stream(strings)
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    public Map<String, Integer> getWordCountMap() {

        Map<String, Integer> counter1 = Arrays
                .stream(strings)
                .collect(Collectors.toMap(s -> s, s -> 1, Integer::sum));

        return counter1;
    }
}
