package rocks.zipcode.quiz4.collections;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    Map<String, Integer> map;
    public WordCounter(String... strings) {
        map = new HashMap<>();
        for (String s :strings) {
            if(map.containsKey(s))
                map.replace(s, map.get(s)+1);
            else
                map.put(s,1);
        }
    }

    public Map<String, Integer> getWordCountMap() {
        return map;
    }
}
