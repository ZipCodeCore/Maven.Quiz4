package rocks.zipcode.quiz4.collections;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    private Map<String, Integer> stringIntegerMap;
    public WordCounter(String... strings) {
        stringIntegerMap = new HashMap<>();
        getFrequencies(strings);
    }

    private void getFrequencies(String[] strings) {
        for (String string : strings) {
            if (!stringIntegerMap.containsKey(string)) {
                stringIntegerMap.put(string, 0);
            }
            stringIntegerMap.put(string, stringIntegerMap.get(string) + 1);
        }
    }

    public Map<String, Integer> getWordCountMap() {
        return stringIntegerMap;
    }
}
