package rocks.zipcode.quiz4.collections;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class WordCounter {
    private Map<String, Integer> stringMap = new TreeMap<>();

    public WordCounter(String... strings) {
        Arrays.sort(strings);
        int count = 1;
        for(int i = 0 ; i < strings.length ; i++){
            if(!stringMap.containsKey(strings[i])){
                stringMap.put(strings[i], count);
            } else {
                Integer counter = stringMap.get(strings[i]) +1;
                stringMap.remove(strings[i]);
                stringMap.put(strings[i], counter);
            }
        }

    }

    public Map<String, Integer> getWordCountMap() {
        return this.stringMap;
    }
}
