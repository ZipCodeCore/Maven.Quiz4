package rocks.zipcode.quiz4.collections;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class WordCounter {
    private Map<String, Integer> counter;

    public WordCounter(String... strings) {
        this.counter = new TreeMap<>();
        for (String str: strings) {
            addToCounter(str);
        }
    }

    private void addToCounter(String str) {
        Set<String> keys = counter.keySet();
        if (keys.contains(str)){
            counter.put(str, counter.get(str) + 1);
        }
        else {
            counter.put(str, 1);
        }
    }

    public Map<String, Integer> getWordCountMap() {
        return this.counter;
    }
}
