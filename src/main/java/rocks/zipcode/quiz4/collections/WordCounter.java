package rocks.zipcode.quiz4.collections;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    Map<String, Integer> spiceMap;
    public WordCounter(String... strings) {
        spiceMap = new HashMap<>();
        for (String string : strings) {
            if (spiceMap.containsKey(string)) {
                spiceMap.replace(string, spiceMap.get(string) + 1);
            }else{
                spiceMap.put(string, 1);
            }

        }
    }
    public Map<String, Integer> getWordCountMap() {
        return null;
    }
}
