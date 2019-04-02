package rocks.zipcode.quiz4.collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WordCounter {
//    private Map<String, Integer> map = new HashMap<>();

    String[] words;
    public WordCounter(String... strings) {
//        Integer counter = 1;
//        for (String string : strings) {
//            if (map.containsKey(string)) {
//                map.put(string, counter = counter + 1);
//            }
//            else {
//                map.put(string, new Integer(1));
//                counter = 1;
//            }
//        }
        this.words = strings;
    }

    public Map<String, Integer> getWordCountMap() {
        Map<String, Integer> map = new HashMap<>();

        Arrays.asList(words)
                .forEach(word -> incrementMap(map, word));
        return map;
    }

    public static <T> void incrementMap(Map<T, Integer> map, T thing){
        map.putIfAbsent(thing, 0);
        map.put(thing, map.get(thing) + 1);
    }
}
