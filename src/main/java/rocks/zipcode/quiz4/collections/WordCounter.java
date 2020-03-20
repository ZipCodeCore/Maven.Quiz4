package rocks.zipcode.quiz4.collections;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    private Map<String, Integer> stringIntegerMap;
    public WordCounter(String... strings) {
        stringIntegerMap = new HashMap<>();
        getFrequencies(strings);
    }

    private void getFrequencies(String[] strings) {
        Arrays.asList(strings).forEach(s -> putInMap(stringIntegerMap, s));
    }

    public static <T> void putInMap(Map<T, Integer> map, T t) {
        if (!map.containsKey(t)) {
            map.put(t, 0);
        }
        map.put(t, map.get(t) + 1);
    }

    public Map<String, Integer> getWordCountMap() {
        return stringIntegerMap;
    }
}
