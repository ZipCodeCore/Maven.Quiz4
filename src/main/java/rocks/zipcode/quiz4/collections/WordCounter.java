package rocks.zipcode.quiz4.collections;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Stream;

public class WordCounter {
    Stream strigs;
    public WordCounter(String... strings) {
        strigs = Stream.of(strings);
    }

    public Map<String, Integer> getWordCountMap() {
        Map<String, Integer> retMap = new LinkedHashMap<>();
        strigs.forEach(x -> retMap.compute((String) x, (k, v) -> (v == null) ? 1 : v + 1));
        return retMap;
    }
}
